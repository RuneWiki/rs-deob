import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class130 {

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "[I")
    public static int[] field2287 = new int[25];

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "Loh;")
    public static class258 field2288 = class153.method1046("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", 105);

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "Loh;")
    public static class258 field2291 = class153.method1046("Hidden)2", 113);

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "Z")
    public static boolean field2293 = false;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "Loh;")
    public static class258 field2292 = class153.method1046("Fps:", 95);

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "[I")
    public static int[] field2284;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "[Loh;")
    public static class258[] field2285;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V", line = 13)
    public static void method937(int arg0) {
        field2292 = null;
        field2284 = null;
        field2288 = null;
        if (arg0 != -1453580440) {
            field2288 = (class258) null;
        }
        field2291 = null;
        field2287 = null;
        field2285 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lnd;B)V", line = 55)
    public static final void method938(class58 arg0, byte arg1) {
        arg0.field932 = false;
        if (arg0.field909 != -1) {
            class2 var2 = class263.method1842(arg0.field909, (byte) -114);
            if (var2 == null || var2.field41 == null) {
                arg0.field909 = -1;
            } else {
                arg0.field910++;
                if (arg0.field933 < var2.field41.length && var2.field35[arg0.field933] < arg0.field910) {
                    arg0.field910 = 1;
                    arg0.field933++;
                    class122.method891(class152.field2606 == arg0, arg0.field934, arg0.field933, var2, (byte) -41, arg0.field912);
                }
                if (arg0.field933 >= var2.field41.length) {
                    arg0.field933 = 0;
                    arg0.field910 = 0;
                    class122.method891(class152.field2606 == arg0, arg0.field934, arg0.field933, var2, (byte) -44, arg0.field912);
                }
            }
        }
        if (arg0.field922 != -1 && arg0.field980 <= class202.field3498) {
            int var3 = class149.method1022(arg0.field922, false).field3657;
            if (var3 == -1) {
                arg0.field922 = -1;
            } else {
                class2 var4 = class263.method1842(var3, (byte) -114);
                if (var4 == null || var4.field41 == null) {
                    arg0.field922 = -1;
                } else {
                    if (arg0.field964 < 0) {
                        arg0.field964 = 0;
                        class122.method891(class152.field2606 == arg0, arg0.field934, 0, var4, (byte) -94, arg0.field912);
                    }
                    arg0.field974++;
                    if (var4.field41.length > arg0.field964 && arg0.field974 > var4.field35[arg0.field964]) {
                        arg0.field974 = 1;
                        arg0.field964++;
                        class122.method891(class152.field2606 == arg0, arg0.field934, arg0.field964, var4, (byte) -125, arg0.field912);
                    }
                    if (arg0.field964 >= var4.field41.length) {
                        arg0.field922 = -1;
                    }
                }
            }
        }
        field2295++;
        if (arg0.field965 != -1 && arg0.field969 <= 1) {
            class2 var5 = class263.method1842(arg0.field965, (byte) -114);
            if (var5.field39 == 1 && arg0.field931 > 0 && arg0.field943 <= class202.field3498 && arg0.field978 < class202.field3498) {
                arg0.field969 = 1;
                return;
            }
        }
        int var6 = -26 / ((arg1 + 44) / 59);
        if (arg0.field965 != -1 && arg0.field969 == 0) {
            class2 var7 = class263.method1842(arg0.field965, (byte) -114);
            if (var7 == null || var7.field41 == null) {
                arg0.field965 = -1;
            } else {
                arg0.field949++;
                if (var7.field41.length > arg0.field966 && arg0.field949 > var7.field35[arg0.field966]) {
                    arg0.field966++;
                    arg0.field949 = 1;
                    class122.method891(class152.field2606 == arg0, arg0.field934, arg0.field966, var7, (byte) -113, arg0.field912);
                }
                if (var7.field41.length <= arg0.field966) {
                    arg0.field976++;
                    arg0.field966 -= var7.field14;
                    if (var7.field37 <= arg0.field976) {
                        arg0.field965 = -1;
                    } else if (arg0.field966 >= 0 && arg0.field966 < var7.field41.length) {
                        class122.method891(class152.field2606 == arg0, arg0.field934, arg0.field966, var7, (byte) -44, arg0.field912);
                    } else {
                        arg0.field965 = -1;
                    }
                }
                arg0.field932 = var7.field28;
            }
        }
        if (arg0.field969 > 0) {
            arg0.field969--;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V", line = 210)
    public static final void method939(byte arg0) {
        class259.field4509.method1157(4);
        field2286++;
        if (arg0 != 93) {
            method940(-10, (class213) null, false, 30, (class213) null);
        }
        class253.field4357.method1157(4);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILgb;ZILgb;)Lpk;", line = 258)
    public static final class255 method940(int arg0, class213 arg1, boolean arg2, int arg3, class213 arg4) {
        field2283++;
        int[] var5 = arg1.method1431(arg0, (byte) -62);
        boolean var6 = true;
        if (arg3 != -22381) {
            return (class255) null;
        }
        for (int var7 = 0; var7 < var5.length; var7++) {
            byte[] var8 = arg1.method1436(0, var5[var7], arg0);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg2) {
                    var10 = arg4.method1436(0, var9, 0);
                } else {
                    var10 = arg4.method1436(0, 0, var9);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        if (!var6) {
            return null;
        }
        try {
            return new class255(arg1, arg4, arg0, arg2);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIILqj;)V", line = 356)
    public static final void method941(int arg0, int arg1, int arg2, class231 arg3) {
        if (arg1 != 1) {
            field2296 = 58;
        }
        field2298++;
        if (arg3.field965 == arg2 && arg2 != -1) {
            class2 var4 = class263.method1842(arg2, (byte) -114);
            int var5 = var4.field31;
            if (var5 == 1) {
                arg3.field966 = 0;
                arg3.field949 = 0;
                arg3.field976 = 0;
                arg3.field969 = arg0;
                class122.method891(class152.field2606 == arg3, arg3.field934, arg3.field966, var4, (byte) -113, arg3.field912);
            }
            if (var5 == 2) {
                arg3.field976 = 0;
            }
        } else if (arg2 == -1 || arg3.field965 == -1 || class263.method1842(arg2, (byte) -114).field33 >= class263.method1842(arg3.field965, (byte) -114).field33) {
            arg3.field969 = arg0;
            arg3.field966 = 0;
            arg3.field965 = arg2;
            arg3.field949 = 0;
            arg3.field976 = 0;
            arg3.field931 = arg3.field971;
            if (arg3.field965 != -1) {
                class122.method891(class152.field2606 == arg3, arg3.field934, arg3.field966, class263.method1842(arg3.field965, (byte) -114), (byte) -103, arg3.field912);
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILme;IIII)Ljava/awt/Frame;", line = 420)
    public static final Frame method942(int arg0, class295 arg1, int arg2, int arg3, int arg4, int arg5) {
        field2297++;
        if (!arg1.method2081((byte) -114)) {
            return null;
        }
        if (arg4 == 0) {
            class220[] var6 = class110.method806(arg1, (byte) -98);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field3808 == arg0 && var6[var8].field3809 == arg2 && (arg3 == 0 || var6[var8].field3816 == arg3) && (!var7 || arg4 < var6[var8].field3815)) {
                    arg4 = var6[var8].field3815;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        if (arg5 <= 4) {
            return (Frame) null;
        }
        class116 var9 = arg1.method2076(arg2, 49, arg4, arg0, arg3);
        while (var9.field2067 == 0) {
            class237.method1628((byte) -88, 10L);
        }
        Frame var10 = (Frame) var9.field2063;
        if (var10 == null) {
            return null;
        } else if (var9.field2067 == 2) {
            class191.method1289(arg1, var10, (byte) 93);
            return null;
        } else {
            return var10;
        }
    }
}
