import jagex3.jagmisc.jagmisc;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class169 {

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "Z")
    public boolean field2456 = false;

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "[I")
    public static int[] field2461 = new int[1];

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "I")
    public int field2464;

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "I")
    public int field2465;

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "Lsr;")
    public class429 field2460;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)Z", line = 8)
    public final boolean method1167(byte arg0) {
        field2459++;
        int var2 = 111 / ((43 - arg0) / 48);
        return this.field2460.field6249.method3186((byte) 57, this.field2465);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZLqa;I)Lha;", line = 18)
    public final class116 method1168(int arg0, boolean arg1, class167 arg2, int arg3) {
        field2462++;
        if (arg0 <= 104) {
            return null;
        }
        long var5 = (long) (this.field2465 | arg3 << 16 | (arg1 ? 262144 : 0) | arg2.field2441 << 19);
        class116 var7 = (class116) this.field2460.field6261.method2407(false, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field2460.field6249.method3186((byte) 57, this.field2465)) {
            class518 var8 = class518.method2922(this.field2460.field6249, this.field2465, 0);
            if (var8 != null) {
                var8.field7201 = var8.field7199 = var8.field7203 = var8.field7200 = 0;
                if (arg1) {
                    var8.method2918();
                }
                for (int var9 = 0; var9 < arg3; var9++) {
                    var8.method2928();
                }
            }
            class116 var10 = arg2.method548(var8, true);
            if (var10 != null) {
                this.field2460.field6261.method2408(var10, var5, -123);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(B)V", line = 69)
    public static void method1169(byte arg0) {
        field2461 = null;
        if (arg0 >= -77) {
            field2461 = null;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILjj;Ljava/lang/String;I)Lrv;", line = 79)
    public static final class284 method1170(int arg0, class66 arg1, String arg2, int arg3) {
        field2463++;
        int var4 = OpenGL.glGenProgramARB();
        if (arg3 != -1) {
            return null;
        }
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramStringARB(arg0, 34933, arg2);
        OpenGL.glGetIntegerv(34379, class504.field7048, 0);
        if (class504.field7048[0] == -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return new class284(arg1, arg0, var4);
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILco;)V", line = 116)
    public final void method1171(int arg0, class268 arg1) {
        if (arg0 != -1) {
            method1169((byte) 0);
        }
        field2455++;
        while (true) {
            int var3 = arg1.method1738(255);
            if (var3 == 0) {
                return;
            }
            this.method1172(arg1, false, var3);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lco;ZI)V", line = 139)
    private final void method1172(class268 arg0, boolean arg1, int arg2) {
        field2458++;
        if (arg2 == 1) {
            this.field2465 = arg0.method1745(32132);
        } else if (arg2 == 2) {
            this.field2464 = arg0.method1700((byte) 44);
        } else if (arg2 == 3) {
            this.field2456 = true;
        } else if (arg2 == 4) {
            this.field2465 = -1;
        }
        if (arg1) {
            this.method1171(-116, null);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZI)V", line = 167)
    public static final void method1173(int arg0, boolean arg1, int arg2) {
        field2457++;
        if (arg2 == 0) {
            class159.field2378 = class167.method1162(~arg0, class202.field2854.field7889 * 2, class227.field3390, 0, class474.field6795, class111.field1843);
        } else {
            if (arg1) {
                class159.field2378 = class167.method1162(0, 0, class227.field3390, 0, class474.field6795, class111.field1843);
                class159.field2378.method121(0);
                class633 var3 = class446.method2633(class97.field1697, (byte) 92, class353.field5059, 0);
                class259 var4 = class159.field2378.method626(var3, class518.method2924(class325.field4675, class97.field1697, 0), true);
                class247.method1570(class130.field2119.method3220(false, class538.field7500), var4, true, 15900);
                class629.method3560(arg0);
                class159.field2378.method1163(6510);
            }
            try {
                class159.field2378 = class167.method1162(arg0 + 1, class202.field2854.field7889 * 2, class227.field3390, arg2, class474.field6795, class111.field1843);
                if (class159.field2378.method555()) {
                    boolean var5 = true;
                    try {
                        var5 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var7) {
                    }
                    class424 var6;
                    if (var5) {
                        var6 = class159.field2378.method614(146800640);
                    } else {
                        var6 = class159.field2378.method614(104857600);
                    }
                    class159.field2378.method593(var6);
                }
            } catch (Throwable var8) {
                class159.field2378 = class167.method1162(0, 0, class227.field3390, 0, class474.field6795, class111.field1843);
                arg2 = 0;
            }
        }
        class646.field9388 = arg2;
        class459.method2688((byte) 87);
        if (arg0 != -1) {
            field2461 = null;
        }
        if (!class159.field2378.method650()) {
            class552.field7816 = 1;
        }
        class159.field2378.method403(class552.field7816);
        class159.field2378.method398(0);
        class159.field2378.method642(8);
        class81.field1444 = class159.field2378.method623();
        class373.field5401 = class159.field2378.method623();
        class17.method200(0);
        class159.field2378.method525(!class202.field2854.field7912);
        if (class159.field2378.method595()) {
            class538.method3026(class202.field2854.field7905, (byte) 82);
        }
        class232.method1519(class146.field2247 >> 3, 126, class66.field990 >> 3, class159.field2378);
        class150.method1077(arg0 ^ 0x4C);
        class434.field6378 = false;
    }
}
