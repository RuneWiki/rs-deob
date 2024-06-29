import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public abstract class class169 implements class513 {

    @OriginalMember(owner = "client!in", name = "k", descriptor = "Z")
    private boolean field2560 = false;

    @OriginalMember(owner = "client!in", name = "p", descriptor = "I")
    private int field2565;

    @OriginalMember(owner = "client!in", name = "j", descriptor = "Ltt;")
    public class249 field2559;

    @OriginalMember(owner = "client!in", name = "q", descriptor = "I")
    public int field2566;

    @OriginalMember(owner = "client!in", name = "o", descriptor = "I")
    public int field2564;

    @OriginalMember(owner = "client!in", name = "w", descriptor = "Z")
    private boolean field2572;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "I")
    public int field2561;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "Ljp;")
    public static class55 field2553 = new class55(51, 9);

    @OriginalMember(owner = "client!in", name = "s", descriptor = "Ljp;")
    public static class55 field2568 = new class55(32, 3);

    @OriginalMember(owner = "client!in", name = "v", descriptor = "[I")
    public static int[] field2571 = new int[100];

    @OriginalMember(owner = "client!in", name = "a", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!in", name = "f", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!in", name = "g", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!in", name = "i", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!in", name = "m", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!in", name = "n", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!in", name = "r", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!in", name = "t", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!in", name = "u", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!in", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() throws Throwable {
        this.method1201((byte) 100);
        field2554++;
        super.finalize();
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V", line = 20)
    public final void method1201(byte arg0) {
        field2556++;
        int var2 = 120 / ((47 - arg0) / 43);
        if (this.field2561 > 0) {
            this.field2559.method1740((byte) 92, this.method1212(false), this.field2561);
            this.field2561 = 0;
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(B)V", line = 35)
    public static void method1202(byte arg0) {
        if (arg0 != 74) {
            field2571 = null;
        }
        field2553 = null;
        field2571 = null;
        field2568 = null;
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(B)I", line = 47)
    public final int method1203(byte arg0) {
        if (arg0 <= 7) {
            field2568 = null;
        }
        field2555++;
        return this.field2561;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ILii;ILza;II)V", line = 63)
    public static final void method1204(int arg0, class395 arg1, int arg2, class299 arg3, int arg4, int arg5) {
        field2562++;
        class444 var6 = class384.field5647.method769(arg1.field5814, 34);
        if (~var6.field6605 == arg4) {
            return;
        }
        int var7;
        if (arg1.field5822) {
            int var8 = arg1.field5779 + arg2;
            var7 = var8 & 0x3;
        } else {
            var7 = 0;
        }
        class363 var9 = var6.method2740(arg3, var7, -127, arg1.field5818);
        if (var9 == null) {
            return;
        }
        int var10 = arg1.field5826;
        int var11 = arg1.field5830;
        if ((var7 & 0x1) == 1) {
            var10 = arg1.field5830;
            var11 = arg1.field5826;
        }
        int var12 = var9.method394();
        int var13 = var9.method396();
        if (var6.field6609) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field6606 == 0) {
            var9.method2320(arg5, arg0 - ((var11 - 1) * 4), var12, var13);
        } else {
            var9.method395(arg5, arg0 - ((var11 - 1) * 4), var12, var13, 0, var6.field6606 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(I)V", line = 113)
    public static final void method1205(int arg0) {
        class251.field4091 = arg0;
        for (int var1 = 0; var1 < class474.field6947; var1++) {
            for (int var2 = 0; var2 < class443.field6603; var2++) {
                if (class348.field5192[arg0][var1][var2] == null) {
                    class348.field5192[arg0][var1][var2] = new class281(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZB)V", line = 140)
    public final void method1206(boolean arg0, byte arg1) {
        field2567++;
        if (arg1 != 115) {
            this.field2559 = null;
        }
        if (this.field2572 != arg0) {
            int var3 = this.method1212(false);
            this.field2572 = true;
            this.method1211(172);
            this.method1209(false, var3);
        }
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(I)Z", line = 161)
    public final boolean method1207(int arg0) {
        field2550++;
        if (!this.field2559.field3993) {
            if (arg0 != 1) {
                field2571 = null;
            }
            return false;
        }
        int var2 = this.method1212(false);
        this.field2559.method1749(arg0 + 25751, this);
        OpenGL.glGenerateMipmapEXT(this.field2564);
        this.field2572 = true;
        this.method1211(172);
        this.method1209(false, var2);
        return true;
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Ltt;IIIZ)V", line = 290)
    public class169(class249 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2565 = arg3;
        this.field2559 = arg0;
        this.field2566 = arg2;
        this.field2564 = arg1;
        this.field2572 = arg4;
        OpenGL.glGenTextures(1, class300.field4611, 0);
        this.field2561 = class300.field4611[0];
        this.method1209(false, 0);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(II)Z", line = 189)
    public static final boolean method1208(int arg0, int arg1) {
        field2551++;
        if (arg1 != 1) {
            field2570 = 85;
        }
        for (class376 var2 = (class376) class154.field2370.method295((byte) -109); var2 != null; var2 = (class376) class154.field2370.method296(true)) {
            if (class33.method197(var2.field5546, arg1 ^ 0x50) && ((long) arg0) == var2.field5553) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZI)V", line = 211)
    private final void method1209(boolean arg0, int arg1) {
        field2558++;
        this.field2559.field3941 -= arg1;
        this.field2559.field3941 += this.method1212(arg0);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BZ)V", line = 220)
    public final void method1210(byte arg0, boolean arg1) {
        if (this.field2560 != arg1) {
            this.field2560 = arg1;
            this.method1211(172);
        }
        if (arg0 != -81) {
            this.method1207(122);
        }
        field2552++;
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(I)V", line = 237)
    private final void method1211(int arg0) {
        field2557++;
        this.field2559.method1749(25752, this);
        if (this.field2560) {
            OpenGL.glTexParameteri(this.field2564, 10241, this.field2572 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field2564, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field2564, 10241, this.field2572 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field2564, 10240, 9728);
        }
        if (arg0 != 172) {
            method1202((byte) 107);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)I", line = 266)
    private final int method1212(boolean arg0) {
        if (arg0) {
            return 93;
        } else {
            field2563++;
            int var2 = this.field2559.method1744(this.field2566, (byte) -27) * this.field2565;
            return this.field2572 ? var2 * 4 / 3 : var2;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
    public abstract void method192(int arg0);
}
