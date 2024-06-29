import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class519 {

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "Luf;")
    private class380 field7189 = new class380(64);

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "Luf;")
    public class380 field7201 = new class380(60);

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "Lga;")
    public class332 field7197;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Lga;")
    private class332 field7194;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Lwo;")
    public static class445 field7193 = new class445();

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "Z")
    private static boolean field7202 = false;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "Ljava/lang/String;")
    public static String field7203 = "";

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field7190;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field7191;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field7192;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field7195;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field7196;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field7198;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field7199;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public static int field7200;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public static int field7204;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public static int field7205;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
    public int field7206;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)Lgf;")
    public final class521 method2940(int arg0, int arg1) {
        if (arg1 != 17) {
            method2946(-63);
        }
        field7190++;
        class380 var3 = this.field7189;
        class521 var4;
        synchronized (this.field7189) {
            var4 = (class521) this.field7189.method2176(-125, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class332 var5 = this.field7194;
        byte[] var6;
        synchronized (this.field7194) {
            var6 = this.field7194.method1938(class85.method455(arg0, -99), class491.method2808((byte) 92, arg0), -17);
        }
        class521 var7 = new class521();
        var7.field7229 = this;
        var7.field7230 = arg0;
        if (var6 != null) {
            var7.method2951(new class157(var6), (byte) 101);
        }
        class380 var8 = this.field7189;
        synchronized (this.field7189) {
            this.field7189.method2174(var7, (long) arg0, (byte) 17);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)Z")
    public static final boolean method2941(int arg0, int arg1) {
        if (arg0 != -10550) {
            method2941(35, 91);
        }
        field7196++;
        return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(II)V")
    public final void method2942(int arg0, int arg1) {
        field7200++;
        this.field7206 = arg1;
        class380 var3 = this.field7201;
        synchronized (this.field7201) {
            this.field7201.method2168((byte) -82);
            int var4 = 80 % ((10 - arg0) / 60);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILkba;Lnu;IIIZLtc;)V")
    public static final void method2943(int arg0, class573 arg1, class351 arg2, int arg3, int arg4, int arg5, boolean arg6, class600 arg7) {
        field7195++;
        class502 var8 = new class502();
        if (!arg6) {
            return;
        }
        var8.field6907 = arg5 << 9;
        var8.field6898 = arg0;
        var8.field6919 = arg4 << 9;
        if (arg7 != null) {
            var8.field6905 = arg7;
            int var10 = arg7.field8290;
            int var11 = arg7.field8343;
            if (arg3 == 1 || arg3 == 3) {
                var11 = arg7.field8290;
                var10 = arg7.field8343;
            }
            var8.field6902 = arg7.field8303 << 9;
            var8.field6904 = arg4 + var10 << 9;
            var8.field6911 = arg7.field8292;
            var8.field6906 = arg7.field8314;
            var8.field6894 = arg7.field8285;
            var8.field6914 = arg7.field8263;
            var8.field6891 = arg5 + var11 << 9;
            var8.field6918 = arg7.field8331;
            var8.field6922 = arg7.field8316;
            var8.field6916 = arg7.field8260;
            if (arg7.field8257 != null) {
                var8.field6896 = true;
                var8.method2853((byte) -101);
            }
            if (var8.field6918 != null) {
                var8.field6913 = (int) ((double) (var8.field6916 - var8.field6911) * Math.random()) + var8.field6911;
            }
            class552.field7525.method2507(var8, (byte) -125);
        } else if (arg2 != null) {
            var8.field6920 = arg2;
            class384 var9 = arg2.field4671;
            if (var9.field5121 != null) {
                var8.field6896 = true;
                var9 = var9.method2203(3, class564.field7696);
            }
            if (var9 != null) {
                var8.field6891 = var9.field5105 + arg5 << 9;
                var8.field6904 = var9.field5105 + arg4 << 9;
                var8.field6894 = class273.method1644(13600, arg2);
                var8.field6902 = var9.field5134 << 9;
                var8.field6922 = var9.field5088;
                var8.field6914 = var9.field5108;
            }
            class598.field8232.method2507(var8, (byte) -126);
        } else if (arg1 != null) {
            var8.field6909 = arg1;
            var8.field6904 = arg1.method1435((byte) 116) + arg4 << 9;
            var8.field6891 = arg5 + arg1.method1435((byte) 83) << 9;
            var8.field6894 = class580.method3197(arg1, 0);
            var8.field6922 = arg1.field7802;
            var8.field6902 = arg1.field7793 << 9;
            var8.field6914 = arg1.field7833;
            class140.field1903.method3061(124, (long) arg1.field3010, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public final void method2944(int arg0) {
        int var2 = -82 / ((arg0 - 71) / 36);
        field7192++;
        class380 var3 = this.field7189;
        synchronized (this.field7189) {
            this.field7189.method2168((byte) -80);
        }
        class380 var4 = this.field7201;
        synchronized (this.field7201) {
            this.field7201.method2168((byte) -73);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)V")
    public final void method2945(int arg0, byte arg1) {
        int var3 = -91 / ((arg1 + 62) / 55);
        class380 var4 = this.field7189;
        synchronized (this.field7189) {
            this.field7189.method2179(false, arg0);
        }
        field7191++;
        class380 var5 = this.field7201;
        synchronized (this.field7201) {
            this.field7201.method2179(false, arg0);
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
    public static final void method2946(int arg0) {
        if (arg0 != 20799) {
            method2941(122, 78);
        }
        if (class500.field6869 != -1) {
            class479.method2754(false, class500.field6869, 97, -1, -1);
            class500.field6869 = -1;
        }
        field7199++;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V")
    public static void method2947(int arg0) {
        if (arg0 != -6632) {
            field7193 = null;
        }
        field7193 = null;
        field7203 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZILnu;)V")
    public static final void method2948(boolean arg0, int arg1, class351 arg2) {
        field7205++;
        if (class137.field1873 >= 400) {
            return;
        }
        if (arg1 != 20855) {
            field7203 = null;
        }
        class384 var3 = arg2.field4671;
        if (var3.field5121 != null) {
            var3 = var3.method2203(3, class564.field7696);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field5079) {
            return;
        }
        String var4 = var3.field5101;
        if (var3.field5084 != 0) {
            String var5 = class678.field9636 == class508.field7015 ? class371.field4909.method2141(class422.field5539, true) : class371.field4907.method2141(class422.field5539, true);
            var4 = var4 + class312.method1832(var3.field5084, class408.field5369.field7795, (byte) 113) + " (" + var5 + var3.field5084 + ")";
        }
        if (class38.field507 && !arg0) {
            class119 var6 = class396.field5273 == -1 ? null : class15.field198.method3462((byte) -79, class396.field5273);
            if ((class544.field7442 & 0x2) != 0 && (var6 == null || var3.method2200((byte) -102, class396.field5273, var6.field1521) != var6.field1521)) {
                class179.field2506++;
                class592.method3274(false, true, -1, 19, class418.field5499, false, (long) arg2.field3010, class101.field1208, 0, 0, class209.field2788 + " -> <col=ffff00>" + var4);
            }
        }
        if (!arg0) {
            String[] var7 = var3.field5136;
            if (field7202) {
                var7 = class346.method2062(var7, 77);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (var3.field5139 == 0 || !var7[var8].equalsIgnoreCase(class371.field4902.method2141(class422.field5539, true)))) {
                        byte var9 = 0;
                        int var10 = class440.field5831;
                        if (var8 == 0) {
                            var9 = 17;
                        }
                        if (var8 == 1) {
                            var9 = 49;
                        }
                        if (var8 == 2) {
                            var9 = 51;
                        }
                        if (var8 == 3) {
                            var9 = 58;
                        }
                        if (var8 == 4) {
                            var9 = 47;
                        }
                        if (var3.field5094 == var8) {
                            var10 = var3.field5074;
                        }
                        if (var3.field5130 == var8) {
                            var10 = var3.field5138;
                        }
                        class596.field8216++;
                        class592.method3274(false, true, -1, var9, var7[var8], false, (long) arg2.field3010, var7[var8].equalsIgnoreCase(class371.field4902.method2141(class422.field5539, true)) ? var3.field5085 : var10, 0, 0, "<col=ffff00>" + var4);
                    }
                }
            }
            if (var3.field5139 == 1 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class371.field4902.method2141(class422.field5539, true))) {
                        short var12 = 0;
                        if (var3.field5084 > class408.field5369.field7795) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 17;
                        }
                        if (var11 == 1) {
                            var13 = 49;
                        }
                        if (var11 == 2) {
                            var13 = 51;
                        }
                        if (var11 == 3) {
                            var13 = 58;
                        }
                        if (var11 == 4) {
                            var13 = 47;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class592.method3274(false, true, -1, var13, var7[var11], false, (long) arg2.field3010, var3.field5085, 0, 0, "<col=ffff00>" + var4);
                        class495.field6818++;
                    }
                }
            }
        }
        class592.method3274(false, true, -1, 1010, class371.field4901.method2141(class422.field5539, true), arg0, (long) arg2.field3010, class149.field2038, 0, 0, "<col=ffff00>" + var4);
        class225.field2928++;
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
    public final void method2949(int arg0) {
        field7198++;
        if (arg0 < 104) {
            return;
        }
        class380 var2 = this.field7189;
        synchronized (this.field7189) {
            this.field7189.method2172(-15112);
        }
        class380 var3 = this.field7201;
        synchronized (this.field7201) {
            this.field7201.method2172(-15112);
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lnq;ILga;Lga;)V")
    public class519(class650 arg0, int arg1, class332 arg2, class332 arg3) {
        this.field7197 = arg3;
        this.field7194 = arg2;
        int var5 = this.field7194.method1933(-126) - 1;
        this.field7194.method1939(0, var5);
    }
}
