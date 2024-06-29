import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class394 extends class325 {

    @OriginalMember(owner = "client!ffa", name = "E", descriptor = "I")
    private int field5349;

    @OriginalMember(owner = "client!ffa", name = "v", descriptor = "[[[I")
    public static int[][][] field5342 = new int[2][][];

    @OriginalMember(owner = "client!ffa", name = "x", descriptor = "[I")
    public static int[] field5344 = new int[1000];

    @OriginalMember(owner = "client!ffa", name = "u", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!ffa", name = "w", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!ffa", name = "y", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!ffa", name = "z", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!ffa", name = "B", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!ffa", name = "D", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Loh;Lqp;IIIILwn;I)V")
    public static final void method2232(class600 arg0, class638 arg1, int arg2, int arg3, int arg4, int arg5, class236 arg6, int arg7) {
        ++field5347;
        if (arg5 == 1480634889) {
            class273 var8 = new class273();
            var8.field3416 = arg3 << 9;
            var8.field3411 = arg4;
            var8.field3396 = arg7 << 9;
            if (arg1 == null) {
                if (arg0 == null) {
                    if (arg6 != null) {
                        var8.field3413 = arg6;
                        var8.field3391 = arg6.method1414(-31789) + arg3 << 9;
                        var8.field3417 = arg7 - -arg6.method1414(arg5 ^ -1480642086) << 9;
                        var8.field3418 = class68.method364(-9184, arg6);
                        var8.field3400 = arg6.field2934 << 9;
                        var8.field3393 = arg6.field2898;
                        var8.field3395 = arg6.field2940;
                        class79.field800.method3671(false, var8, (long) arg6.field9434);
                        return;
                    }
                } else {
                    var8.field3394 = arg0;
                    class210 var9 = arg0.field8461;
                    if (var9.field2492 != null) {
                        var8.field3399 = true;
                        var9 = var9.method1247((byte) 124, class628.field8859);
                    }
                    if (var9 != null) {
                        var8.field3391 = var9.field2524 + arg3 << 9;
                        var8.field3417 = var9.field2524 + arg7 << 9;
                        var8.field3418 = class213.method1262(125, arg0);
                        var8.field3393 = var9.field2475;
                        var8.field3400 = var9.field2534 << 9;
                        var8.field3395 = var9.field2521;
                    }
                    class689.field9697.method3425(var8, false);
                }
            } else {
                var8.field3403 = arg1;
                int var10 = arg1.field9051;
                int var11 = arg1.field9060;
                if (~arg2 == -2 || arg2 == 3) {
                    var10 = arg1.field9060;
                    var11 = arg1.field9051;
                }
                var8.field3400 = arg1.field8980 << 9;
                var8.field3409 = arg1.field8992;
                var8.field3393 = arg1.field8984;
                var8.field3395 = arg1.field9011;
                var8.field3391 = arg3 + var10 << 9;
                var8.field3401 = arg1.field9012;
                var8.field3421 = arg1.field9070;
                var8.field3389 = arg1.field8981;
                var8.field3417 = arg7 + var11 << 9;
                var8.field3418 = arg1.field9022;
                if (arg1.field8974 != null) {
                    var8.field3399 = true;
                    var8.method1606(-61);
                }
                if (var8.field3409 != null) {
                    var8.field3404 = var8.field3401 - -((int) ((double) (var8.field3421 - var8.field3401) * Math.random()));
                }
                class139.field1529.method3425(var8, false);
            }
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(III)Z")
    public static final boolean method2233(int arg0, int arg1, int arg2) {
        if (arg0 != 25149) {
            return true;
        } else {
            ++field5343;
            return class39.method200(arg1, (byte) 93, arg2) | (458752 & arg1) != 0 || class424.method2442(arg2, (byte) 111, arg1);
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)V")
    public final void method459(int arg0) {
        if (arg0 != Integer.MIN_VALUE) {
            this.field5349 = 18;
        }
        ++field5346;
    }

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(Lvj;II[BI)V")
    public class394(class422 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field5349 = arg2;
        super.field3991.method2396((byte) 36, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field3988, 0, super.field4000, this.field5349, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1839(true, (byte) 92);
    }

    @OriginalMember(owner = "client!ffa", name = "f", descriptor = "(I)V")
    public static void method2234(int arg0) {
        if (arg0 < -20) {
            field5344 = null;
            field5342 = null;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method2235(String arg0, byte arg1) {
        ++field5345;
        String var2 = null;
        int var3 = arg0.indexOf("--> ");
        if (var3 >= 0) {
            var2 = arg0.substring(0, var3 + 4);
            arg0 = arg0.substring(var3 + 4);
        }
        if (arg1 <= 119) {
            field5344 = null;
        }
        if (arg0.startsWith("directlogin ")) {
            int var4 = arg0.indexOf(" ", "directlogin ".length());
            if (~var4 <= -1) {
                int var5 = arg0.length();
                arg0 = arg0.substring(0, var4) + " ";
                for (int var6 = var4 + 1; var6 < var5; ++var6) {
                    arg0 = arg0 + "*";
                }
            }
        }
        return var2 == null ? arg0 : var2 + arg0;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IZ)V")
    public final void method2236(int arg0, boolean arg1) {
        int var3 = 44 / ((arg0 - 68) / 34);
        super.field3991.method2396((byte) 36, this);
        ++field5348;
        OpenGL.glTexParameteri(super.field3988, 10242, !arg1 ? 33071 : 10497);
    }
}
