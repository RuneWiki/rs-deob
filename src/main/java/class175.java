import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class175 implements Runnable {

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Z")
    public boolean field2861 = true;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Ljava/lang/Object;")
    public Object field2865 = new Object();

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "[I")
    public int[] field2877 = new int[500];

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "[I")
    public int[] field2878 = new int[500];

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
    public int field2876 = 0;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public static int field2871 = 0;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "I")
    public static int field2875 = 0;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "Lcd;")
    public static class136 field2864;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "Lug;")
    public static class253 field2873;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "[[[I")
    public static int[][][] field2868;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 6)
    public static void method1288(int arg0) {
        field2873 = null;
        field2868 = (int[][][]) null;
        if (arg0 != -4390) {
            method1288(-74);
        }
        field2864 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lug;I)V", line = 19)
    public static final void method1289(class253 arg0, int arg1) {
        class20.field303 = arg0;
        if (arg1 <= -34) {
            field2866++;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V", line = 37)
    public static final void method1290(int arg0) {
        class325.field5092++;
        if (arg0 >= -69) {
            field2875 = -81;
        }
        field2863++;
        class183.field2965.method1947((byte) 126, 99);
        for (class25 var1 = (class25) class210.field3304.method2174(256); var1 != null; var1 = (class25) class210.field3304.method2164((byte) 123)) {
            if (var1.field375 == 0) {
                class6.method86(true, var1, false);
            }
        }
        if (class237.field3723 != null) {
            class167.method1250(class237.field3723, 412);
            class237.field3723 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "run", descriptor = "()V", line = 67)
    public final void run() {
        field2870++;
        while (this.field2861) {
            Object var1 = this.field2865;
            synchronized (this.field2865) {
                if (this.field2876 < 500) {
                    this.field2877[this.field2876] = class25.field381;
                    this.field2878[this.field2876] = class82.field1129;
                    this.field2876++;
                }
            }
            class272.method1918((byte) 22, 50L);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", line = 90)
    public static final void method1291(String arg0, String arg1, int arg2, int arg3, String arg4) {
        field2874++;
        if (arg3 <= -64) {
            class214.method1563(arg2, arg0, (byte) -37, arg4, arg1, -1);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 102)
    public static final void method1292(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field2862++;
        class207 var13 = new class207();
        var13.field3296 = arg6;
        var13.field3295 = arg7;
        if (arg4 != 0) {
            return;
        }
        var13.field3291 = arg1;
        var13.field3297 = arg12;
        var13.field3299 = arg5;
        var13.field3292 = arg3;
        var13.field3289 = arg9;
        var13.field3282 = arg10;
        var13.field3294 = arg2;
        var13.field3288 = arg11;
        var13.field3286 = arg0;
        var13.field3293 = arg8;
        class69.field963.method19(var13, arg4 ^ 0xFFFFFBDE);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V", line = 130)
    public static final void method1293(int arg0, int arg1) {
        class147.field2319 = arg1;
        field2872++;
        class202.field3228 = 1;
        class237.field3711 = 0;
        class3.field31 = null;
        if (arg0 <= 22) {
            field2864 = (class136) null;
        }
        class270.field4193 = -1;
        class113.field1575 = -1;
        class251.field3951 = false;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIII)V", line = 157)
    public static final void method1294(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2869++;
        int var6 = arg4 - arg1;
        int var7 = arg2 - arg0;
        if (var7 == 0) {
            if (var6 != 0) {
                class47.method362(128, arg4, arg1, arg5, arg0);
            }
        } else if (var6 == 0) {
            class267.method1900(arg1, arg5, arg2, arg0, 3);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg0;
                int var10 = arg2;
                arg2 = arg4;
                arg0 = arg1;
                arg1 = var9;
                arg4 = var10;
            }
            if (arg2 < arg0) {
                int var11 = arg0;
                int var12 = arg1;
                arg1 = arg4;
                arg4 = var12;
                arg0 = arg2;
                arg2 = var11;
            }
            int var13 = arg2 - arg0;
            int var14 = arg1;
            int var15 = arg4 - arg1;
            if (var15 < arg3) {
                var15 = -var15;
            }
            int var16 = -(var13 >> 1);
            int var17 = arg4 <= arg1 ? -1 : 1;
            if (var8) {
                for (int var18 = arg0; var18 <= arg2; var18++) {
                    class284.field4402[var18][var14] = arg5;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var13;
                        var14 += var17;
                    }
                }
            } else {
                for (int var19 = arg0; var19 <= arg2; var19++) {
                    var16 += var15;
                    class284.field4402[var14][var19] = arg5;
                    if (var16 > 0) {
                        var16 -= var13;
                        var14 += var17;
                    }
                }
            }
        }
    }
}
