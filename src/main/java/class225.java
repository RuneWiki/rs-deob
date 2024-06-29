import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class225 extends class585 {

    @OriginalMember(owner = "client!cea", name = "H", descriptor = "Z")
    private boolean field3464 = true;

    @OriginalMember(owner = "client!cea", name = "G", descriptor = "I")
    private int field3463 = 4096;

    @OriginalMember(owner = "client!cea", name = "I", descriptor = "Loo;")
    public static class652 field3465 = new class652(50);

    @OriginalMember(owner = "client!cea", name = "E", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!cea", name = "F", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!cea", name = "J", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!cea", name = "K", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!cea", name = "L", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!cea", name = "M", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!cea", name = "e", descriptor = "(B)Lru;")
    public static final class204 method1536(byte arg0) {
        if (arg0 != 123) {
            return null;
        } else {
            ++field3462;
            class525.field7521 = 0;
            return class467.method2790((byte) 116);
        }
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "()V")
    public class225() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIILmi;II)V")
    public static final void method1537(int arg0, int arg1, int arg2, class520 arg3, int arg4, int arg5) {
        ++field3461;
        class506 var6 = null;
        if (arg5 <= 12) {
            field3465 = null;
        }
        for (class506 var7 = (class506) class779.field10697.method1731((byte) -111); var7 != null; var7 = (class506) class779.field10697.method1724(0)) {
            if (var7.field7201 == arg2 && ~var7.field7189 == ~arg4 && ~var7.field7192 == ~arg1 && var7.field7200 == arg0) {
                var6 = var7;
                break;
            }
        }
        if (var6 == null) {
            var6 = new class506();
            var6.field7192 = arg1;
            var6.field7201 = arg2;
            var6.field7200 = arg0;
            var6.field7189 = arg4;
            class779.field10697.method1727(var6, (byte) 124);
        }
        var6.field7195 = arg3;
        var6.field7194 = false;
        var6.field7197 = true;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lso;II)V")
    public final void method54(class494 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field3464 = arg0.method2964((byte) 106) == 1;
            }
        } else {
            this.field3463 = arg0.method2998(true);
        }
        ++field3468;
        if (arg1 != 1) {
            this.field3463 = -126;
        }
    }

    @OriginalMember(owner = "client!cea", name = "f", descriptor = "(B)V")
    public static void method1538(byte arg0) {
        if (arg0 > -45) {
            method1537(-28, -27, -37, (class520) null, 94, -74);
        }
        field3465 = null;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method58(boolean arg0, int arg1) {
        ++field3467;
        if (arg0) {
            method1539(true, 20);
        }
        int[][] var3 = super.field8265.method1576((byte) -110, arg1);
        if (super.field8265.field3546) {
            int[] var4 = this.method3415(-128, 0, arg1 + -1 & class305.field4391);
            int[] var5 = this.method3415(-127, 0, arg1);
            int[] var6 = this.method3415(-127, 0, arg1 + 1 & class305.field4391);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class293.field4278; ++var10) {
                int var11 = (var6[var10] - var4[var10]) * this.field3463;
                int var12 = (var5[class625.field8759 & var10 + 1] + -var5[class625.field8759 & var10 - 1]) * this.field3463;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 - -4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = var11 / var17;
                    var19 = 16777216 / var17;
                    var20 = var12 / var17;
                } else {
                    var19 = 0;
                    var20 = 0;
                    var18 = 0;
                }
                if (this.field3464) {
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var20;
                var8[var10] = var18;
                var9[var10] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(ZI)V")
    public static final void method1539(boolean arg0, int arg1) {
        ++field3466;
        if (~class266.field3873 != ~arg1) {
            if (arg1 == 13) {
                class14.method150(29867);
            }
            if (arg1 != 13 && class678.field9433 != null) {
                class678.field9433.method612((byte) -6);
                class678.field9433 = null;
            }
            if (arg1 == 3) {
                class437.method2614(~class371.field5137 != ~class152.field2155, (byte) -66);
            }
            if (~arg1 == -8) {
                class768.method4240(-1, class483.field6809 != class371.field5137);
            }
            if (~arg1 != -6 && arg1 != 12) {
                if (~arg1 == -7 || ~arg1 == -10) {
                    class14.method150(29867);
                }
            } else {
                class333.method2122(0);
            }
            if (class36.method284(90, class266.field3873)) {
                class564.field8000.field10884 = 2;
                class784.field10769.field10884 = 2;
                class305.field4397.field10884 = 2;
                class243.field3621.field10884 = 2;
                class253.field3722.field10884 = 2;
                class352.field4936.field10884 = 2;
                class46.field577.field10884 = 2;
            }
            if (class36.method284(78, arg1)) {
                class48.field613 = 0;
                class268.field3902 = 0;
                class339.field4746 = 0;
                class777.field10675 = 1;
                class133.field2009 = 1;
                class92.method681((byte) -120, true);
                class564.field8000.field10884 = 1;
                class784.field10769.field10884 = 1;
                class305.field4397.field10884 = 1;
                class243.field3621.field10884 = 1;
                class253.field3722.field10884 = 1;
                class352.field4936.field10884 = 1;
                class46.field577.field10884 = 1;
            }
            if (~arg1 == -12 || arg1 == 3) {
                class237.method1587((byte) -125);
            }
            if (arg0) {
                field3469 = -78;
            }
            boolean var2 = arg1 == 2 || class260.method1691(arg1, 126) || class397.method2450((byte) 94, arg1);
            boolean var3 = class266.field3873 == 2 || class260.method1691(class266.field3873, 127) || class397.method2450((byte) 87, class266.field3873);
            if (!var2 == var3) {
                if (!var2) {
                    class688.method3878((byte) -54, 2);
                    class65.field783.method3514(true, 109);
                } else {
                    class577.field8137 = class181.field2801;
                    if (~class21.field353.field10083.method2896(-105) != -1) {
                        class142.method1017(class181.field2801, class21.field353.field10083.method2896(-43), false, false, 2, 0, class488.field6899);
                        class753.method4192(44);
                    } else {
                        class688.method3878((byte) -83, 2);
                    }
                    class65.field783.method3514(false, 97);
                }
            }
            if (class36.method284(82, arg1) || arg1 == 13) {
                class37.field491.method548();
            }
            class266.field3873 = arg1;
        }
    }
}
