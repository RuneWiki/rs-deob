import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class19 implements Runnable {

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "Z")
    public boolean field237 = true;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field231 = new Object();

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "I")
    public int field239 = 0;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "[I")
    public int[] field238 = new int[500];

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "[I")
    public int[] field240 = new int[500];

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field230 = 0;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field234 = 0;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "Lbe;")
    public static class283 field236 = class153.method941(-84, "<img=1>");

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "([[IIIIIZILsf;[[FZZI[[F[[F[ZII[IBB[[IZ)V", line = 13)
    public static final void method116(int[][] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, class100 arg7, float[][] arg8, boolean arg9, boolean arg10, int arg11, float[][] arg12, float[][] arg13, boolean[] arg14, int arg15, int arg16, int[] arg17, byte arg18, byte arg19, int[][] arg20, boolean arg21) {
        field233++;
        int var22 = (arg11 << 8) + (arg5 ? 255 : 0);
        int var23 = (arg21 ? 255 : 0) + (arg2 << 8);
        int var24 = (arg10 ? 255 : 0) + (arg3 << 8);
        int[] var25 = new int[arg17.length / 2];
        int var26 = (arg9 ? 255 : 0) + (arg6 << 8);
        for (int var27 = 0; var27 < var25.length; var27++) {
            int var28 = arg17[var27 + var27];
            int var29 = arg17[var27 + var27 + 1];
            int[][] var30 = arg0 == null || arg14 == null || !arg14[var27] ? arg20 : arg0;
            var25[var27] = class164.method997(arg0, var30, var29, var23, arg13, arg7, (float) arg15, arg4, false, arg18, arg8, arg12, var28, 210, var22, var24, arg1, var26);
        }
        if (arg19 >= -15) {
            field230 = 111;
        }
        arg7.method666(arg16, arg1, arg4, var25, (int[]) null, false);
    }

    @OriginalMember(owner = "client!hm", name = "run", descriptor = "()V", line = 49)
    public final void run() {
        while (this.field237) {
            Object var1 = this.field231;
            synchronized (this.field231) {
                if (this.field239 < 500) {
                    this.field238[this.field239] = class109.field1849;
                    this.field240[this.field239] = class163.field2700;
                    this.field239++;
                }
            }
            class2.method11((byte) -20, 50L);
        }
        field232++;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ZLkd;)V", line = 87)
    public static final void method117(boolean arg0, class70 arg1) {
        field235++;
        arg1.field1176 = false;
        if (arg1.field1219 != -1) {
            class157 var2 = class132.method821(128, arg1.field1219);
            if (var2 == null || var2.field2578 == null) {
                arg1.field1219 = -1;
            } else {
                arg1.field1163++;
                if (arg1.field1205 < var2.field2578.length && arg1.field1163 > var2.field2568[arg1.field1205]) {
                    arg1.field1205++;
                    arg1.field1163 = 1;
                    class141.method888(0, var2, arg1.field1210, class213.field3624 == arg1, arg1.field1205, arg1.field1193);
                }
                if (arg1.field1205 >= var2.field2578.length) {
                    arg1.field1163 = 0;
                    arg1.field1205 = 0;
                    class141.method888(0, var2, arg1.field1210, class213.field3624 == arg1, arg1.field1205, arg1.field1193);
                }
            }
        }
        if (arg1.field1211 != -1 && arg1.field1215 <= class75.field1309) {
            int var3 = class259.method1750((byte) 93, arg1.field1211).field2831;
            if (var3 == -1) {
                arg1.field1211 = -1;
            } else {
                class157 var4 = class132.method821(128, var3);
                if (var4 == null || var4.field2578 == null) {
                    arg1.field1211 = -1;
                } else {
                    if (arg1.field1206 < 0) {
                        arg1.field1206 = 0;
                        class141.method888(0, var4, arg1.field1210, class213.field3624 == arg1, 0, arg1.field1193);
                    }
                    arg1.field1165++;
                    if (arg1.field1206 < var4.field2578.length && arg1.field1165 > var4.field2568[arg1.field1206]) {
                        arg1.field1165 = 1;
                        arg1.field1206++;
                        class141.method888(0, var4, arg1.field1210, class213.field3624 == arg1, arg1.field1206, arg1.field1193);
                    }
                    if (arg1.field1206 >= var4.field2578.length) {
                        arg1.field1211 = -1;
                    }
                }
            }
        }
        if (arg1.field1192 != -1 && arg1.field1200 <= 1) {
            class157 var5 = class132.method821(128, arg1.field1192);
            if (var5.field2571 == 1 && arg1.field1183 > 0 && arg1.field1166 <= class75.field1309 && class75.field1309 > arg1.field1156) {
                arg1.field1200 = 1;
                return;
            }
        }
        if (!arg0) {
            field230 = -71;
        }
        if (arg1.field1192 != -1 && arg1.field1200 == 0) {
            class157 var6 = class132.method821(128, arg1.field1192);
            if (var6 == null || var6.field2578 == null) {
                arg1.field1192 = -1;
            } else {
                arg1.field1182++;
                if (var6.field2578.length > arg1.field1220 && var6.field2568[arg1.field1220] < arg1.field1182) {
                    arg1.field1220++;
                    arg1.field1182 = 1;
                    class141.method888(0, var6, arg1.field1210, class213.field3624 == arg1, arg1.field1220, arg1.field1193);
                }
                if (var6.field2578.length <= arg1.field1220) {
                    arg1.field1171++;
                    arg1.field1220 -= var6.field2567;
                    if (var6.field2583 <= arg1.field1171) {
                        arg1.field1192 = -1;
                    } else if (arg1.field1220 >= 0 && arg1.field1220 < var6.field2578.length) {
                        class141.method888(0, var6, arg1.field1210, class213.field3624 == arg1, arg1.field1220, arg1.field1193);
                    } else {
                        arg1.field1192 = -1;
                    }
                }
                arg1.field1176 = var6.field2590;
            }
        }
        if (arg1.field1200 > 0) {
            arg1.field1200--;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 231)
    public static void method118(int arg0) {
        if (arg0 >= -82) {
            field236 = (class283) null;
        }
        field236 = null;
    }
}
