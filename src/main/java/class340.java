import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class340 extends class123 {

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "I")
    public static int field5248 = 0;

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "Ljava/lang/String;")
    public static String field5249 = "Loading...";

    @OriginalMember(owner = "client!oj", name = "F", descriptor = "Lpd;")
    public static class3 field5253 = new class3(32);

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!oj", name = "G", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!oj", name = "H", descriptor = "Llg;")
    public static class132 field5255;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "Lpd;")
    private class3 field5244;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "[[[Lsg;")
    public static class42[][][] field5243;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", line = 4)
    public final String method2354(int arg0, String arg1, int arg2) {
        field5254++;
        if (arg0 != 0) {
            field5243 = (class42[][][]) ((class42[][][]) null);
        }
        if (this.field5244 == null) {
            return arg1;
        } else {
            class214 var4 = (class214) this.field5244.method79((long) arg2, (byte) 0);
            return var4 == null ? arg1 : var4.field3337;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V", line = 35)
    public static final void method2355(byte arg0) {
        field5245++;
        if (arg0 != -53) {
            field5255 = (class132) null;
        }
        class20.field370.method1431(-285256665);
        class13.field284 = null;
        class182.field2882 = 1;
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(Z)V", line = 50)
    public static void method2356(boolean arg0) {
        field5253 = null;
        field5243 = (class42[][][]) null;
        field5249 = null;
        if (arg0) {
            method2360(-8, -48);
        }
        field5255 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIILeh;JLeh;Leh;)V", line = 67)
    public static final void method2357(int arg0, int arg1, int arg2, int arg3, class179 arg4, long arg5, class179 arg6, class179 arg7) {
        class188 var9 = new class188();
        var9.field2950 = arg4;
        var9.field2951 = arg1 * 128 + 64;
        var9.field2954 = arg2 * 128 + 64;
        var9.field2956 = arg3;
        var9.field2958 = arg5;
        var9.field2945 = arg6;
        var9.field2952 = arg7;
        int var10 = 0;
        class42 var11 = class34.field521[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field672; var12++) {
                class144 var13 = var11.field659[var12];
                if ((var13.field2344 & 0x400000L) == 4194304L) {
                    int var14 = var13.field2346.method137();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field2948 = -var10;
        if (class34.field521[arg0][arg1][arg2] == null) {
            class34.field521[arg0][arg1][arg2] = new class42(arg0, arg1, arg2);
        }
        class34.field521[arg0][arg1][arg2].field664 = var9;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Laj;BI)V", line = 112)
    private final void method2358(class1 arg0, byte arg1, int arg2) {
        field5247++;
        if (arg2 == 249) {
            int var4 = arg0.method15((byte) 62);
            if (this.field5244 == null) {
                int var5 = class319.method2255(1, var4);
                this.field5244 = new class3(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method15((byte) 112) == 1;
                int var8 = arg0.method4(true);
                class60 var9;
                if (var7) {
                    var9 = new class214(arg0.method53(32));
                } else {
                    var9 = new class304(arg0.method33(false));
                }
                this.field5244.method75(var9, -1, (long) var8);
            }
        }
        if (arg1 < 117) {
            method2355((byte) 68);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILaj;)V", line = 163)
    public final void method2359(int arg0, class1 arg1) {
        if (arg0 != 0) {
            this.method2354(117, (String) null, 103);
        }
        field5246++;
        while (true) {
            int var3 = arg1.method15((byte) -41);
            if (var3 == 0) {
                return;
            }
            this.method2358(arg1, (byte) 126, var3);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)I", line = 185)
    public static final int method2360(int arg0, int arg1) {
        if (arg1 != -8449) {
            field5253 = (class3) null;
        }
        field5252++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)I", line = 201)
    public final int method2361(int arg0, int arg1, int arg2) {
        if (arg0 >= -95) {
            return 22;
        }
        field5250++;
        if (this.field5244 == null) {
            return arg1;
        } else {
            class304 var4 = (class304) this.field5244.method79((long) arg2, (byte) 0);
            return var4 == null ? arg1 : var4.field4844;
        }
    }
}
