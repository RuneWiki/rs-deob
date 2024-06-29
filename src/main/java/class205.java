import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class205 extends class276 {

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "Z")
    private boolean field3348 = true;

    @OriginalMember(owner = "client!hg", name = "W", descriptor = "I")
    private int field3356 = 4096;

    @OriginalMember(owner = "client!hg", name = "Z", descriptor = "I")
    public static int field3359 = 0;

    @OriginalMember(owner = "client!hg", name = "V", descriptor = "Ljava/lang/String;")
    public static String field3355 = "Loading config - ";

    @OriginalMember(owner = "client!hg", name = "bb", descriptor = "I")
    public static int field3361 = 0;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!hg", name = "U", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!hg", name = "X", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!hg", name = "Y", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!hg", name = "ab", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field3348 = arg1.method669((byte) 36) == 1;
            }
        } else {
            this.field3356 = arg1.method677(false);
        }
        ++field3350;
        if (arg2 != -1) {
            method1359(false, 17);
        }
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(II)Lla;")
    public static final class170 method1352(int arg0, int arg1) {
        ++field3354;
        class170 var2 = (class170) class56.field968.method3(32, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class119.field2106.method746(0, (byte) -128, arg1);
            if (var3 == null) {
                return null;
            } else {
                class170 var4 = new class170();
                class101 var5 = new class101(var3);
                var5.field1762 = var5.field1730.length + -2;
                int var6 = var5.method677(false);
                int var7 = var5.field1730.length + -2 + -var6 - 12;
                var5.field1762 = var7;
                int var8 = var5.method655((byte) 106);
                var4.field2798 = var5.method677(false);
                var4.field2799 = var5.method677(false);
                var4.field2809 = var5.method677(false);
                var4.field2801 = var5.method677(false);
                int var9 = var5.method669((byte) 36);
                if (var9 > 0) {
                    var4.field2804 = new class112[var9];
                    for (int var10 = 0; var9 > var10; ++var10) {
                        int var11 = var5.method677(false);
                        class112 var12 = new class112(class6.method33(var11, (byte) -91));
                        var4.field2804[var10] = var12;
                        while (var11-- > 0) {
                            int var13 = var5.method655((byte) 70);
                            int var14 = var5.method655((byte) 41);
                            var12.method780((byte) -78, (long) var13, new class69(var14));
                        }
                    }
                }
                var5.field1762 = 0;
                var4.field2802 = var5.method659((byte) 60);
                int var15 = 0;
                var4.field2803 = new String[var8];
                var4.field2800 = new int[var8];
                var4.field2806 = new int[var8];
                while (var7 > var5.field1762) {
                    int var16 = var5.method677(false);
                    if (var16 != 3) {
                        if (~var16 > -101 && ~var16 != -22 && ~var16 != -39 && ~var16 != -40) {
                            var4.field2800[var15] = var5.method655((byte) 84);
                        } else {
                            var4.field2800[var15] = var5.method669((byte) 36);
                        }
                    } else {
                        var4.field2803[var15] = var5.method662((byte) 1).intern();
                    }
                    var4.field2806[var15++] = var16;
                }
                class56.field968.method4(arg0 ^ arg0, var4, (long) arg1);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(III)Ljava/lang/String;")
    public static final String method1353(int arg0, int arg1, int arg2) {
        ++field3351;
        int var3 = arg0 - arg1;
        if (~var3 > 8) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (~var3 > 2) {
            return "<col=ff7000>";
        } else {
            if (arg2 != -2931) {
                field3355 = null;
            }
            if (~var3 > -1) {
                return "<col=ffb000>";
            } else if (var3 > 9) {
                return "<col=00ff00>";
            } else if (var3 > 6) {
                return "<col=40ff00>";
            } else if (var3 > 3) {
                return "<col=80ff00>";
            } else {
                return var3 > 0 ? "<col=c0ff00>" : "<col=ffff00>";
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(JI)V")
    public static final void method1354(long arg0, int arg1) {
        ++field3357;
        if (~arg0 != -1L) {
            for (int var3 = 0; var3 < class228.field3837; ++var3) {
                if (class280.field4464[var3] == arg0) {
                    --class228.field3837;
                    for (int var4 = var3; class228.field3837 > var4; ++var4) {
                        class5.field63[var4] = class5.field63[var4 + 1];
                        class274.field4393[var4] = class274.field4393[var4 + 1];
                        class276.field4410[var4] = class276.field4410[var4 + 1];
                        class280.field4464[var4] = class280.field4464[var4 - -1];
                        class175.field2872[var4] = class175.field2872[var4 + 1];
                        class143.field2459[var4] = class143.field2459[var4 + 1];
                    }
                    ++class193.field3125;
                    class63.field1093 = class222.field3746;
                    class168.field2778.method199(204, -103);
                    class168.field2778.method640(21691, arg0);
                    break;
                }
            }
            int var5 = 99 / ((arg1 - -48) / 45);
        }
    }

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "(I)V")
    public static void method1355(int arg0) {
        if (arg0 == -1751526068) {
            field3355 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1356(String arg0, int arg1) {
        ++field3358;
        int var2 = class113.method792(arg0, arg1 + -2);
        if (~var2 != 0) {
            int[] var3 = class158.field2642.method265(16383 & class252.field4135.field3149[var2], (class252.field4135.field3149[var2] & 268434580) >> 14, class252.field4135.field3149[var2] >> 28 & 3, 5);
            class62.method390((byte) 16, var3[1], var3[arg1]);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V")
    public static final void method1357(String arg0, String arg1, int arg2, int arg3, String arg4) {
        class286.method1909((byte) 48, arg4, -1, arg1, arg0, arg2);
        int var5 = 90 / ((arg3 - -68) / 48);
        ++field3346;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIZB)V")
    public static final void method1358(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
        if (~arg1 > -2) {
            arg1 = 1;
        }
        if (arg2 < 1) {
            arg2 = 1;
        }
        class248.field4061 = (short) arg1;
        ++field3360;
        if (arg5 >= 85) {
            class295.field4693 = (short) arg2;
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
    public class205() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZI)V")
    public static final void method1359(boolean arg0, int arg1) {
        if (arg0) {
            field3361 = -83;
        }
        class55 var2 = class62.method395(10, arg1, (byte) -66);
        var2.method341((byte) 62);
        ++field3349;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II)[[I")
    public final int[][] method300(int arg0, int arg1) {
        ++field3352;
        if (arg1 != -1) {
            return null;
        } else {
            int[][] var3 = super.field4418.method835((byte) 115, arg0);
            if (super.field4418.field2164) {
                int[] var4 = this.method1805(false, 0, arg0 + -1 & class125.field2189);
                int[] var5 = this.method1805(false, 0, arg0);
                int[] var6 = this.method1805(false, 0, arg0 + 1 & class125.field2189);
                int[] var7 = var3[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                for (int var10 = 0; var10 < class53.field929; ++var10) {
                    int var11 = (var5[class35.field504 & var10 + 1] - var5[var10 + -1 & class35.field504]) * this.field3356;
                    int var12 = (var6[var10] + -var4[var10]) * this.field3356;
                    int var13 = var11 >> 12;
                    int var14 = var12 >> 12;
                    int var15 = var13 * var13 >> 12;
                    int var16 = var14 * var14 >> 12;
                    int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 + 4096 + var15) / 4096.0F)));
                    int var18;
                    int var19;
                    int var20;
                    if (var17 == 0) {
                        var18 = 0;
                        var19 = 0;
                        var20 = 0;
                    } else {
                        var20 = var12 / var17;
                        var18 = 16777216 / var17;
                        var19 = var11 / var17;
                    }
                    if (this.field3348) {
                        var20 = (var20 >> 1) + 2048;
                        var18 = 2048 - -(var18 >> 1);
                        var19 = (var19 >> 1) + 2048;
                    }
                    var8[var10] = var19;
                    var9[var10] = var20;
                    var7[var10] = var18;
                }
            }
            return var3;
        }
    }
}
