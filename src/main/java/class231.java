import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class231 {

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
    private int field3966 = 128;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    private int field3951 = 128;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public int field3947 = -1;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    private int field3965 = 0;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "Z")
    public boolean field3958 = false;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
    private int field3971 = 0;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    private int field3963 = 0;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "Lhb;")
    public static class282 field3953 = null;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "[I")
    public static int[] field3946 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "Leg;")
    public static class37 field3961 = class174.method1167("Lade Liste der Welten", -65);

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "Leg;")
    public static class37 field3956 = class174.method1167("Hierhin drehen", -86);

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "Leg;")
    public static class37 field3964 = class174.method1167(" est d-Bj-9 dans votre liste noire)3", 93);

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "Leg;")
    public static class37 field3954 = class174.method1167("scrollbar", -44);

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public int field3955;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    private int field3962;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "Ljl;")
    public static class101 field3970;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "[S")
    private short[] field3949;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "[S")
    private short[] field3952;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "[S")
    private short[] field3959;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "[S")
    private short[] field3960;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)Z")
    public static final boolean method1588(int arg0, byte arg1) {
        field3948++;
        if (arg1 > -1) {
            method1590(-128, false, false, 108, -48, false, -122, 26);
        }
        return (arg0 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLva;)V")
    public final void method1589(byte arg0, class187 arg1) {
        while (true) {
            int var3 = arg1.method1268(255);
            if (var3 == 0) {
                if (arg0 < 96) {
                    this.field3963 = -116;
                }
                field3972++;
                return;
            }
            this.method1596(var3, arg1, -100);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZZIIZII)Lja;")
    public static final class105 method1590(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field3969++;
        class241 var8 = class9.method52(true, arg7);
        if (arg6 > 1 && var8.field4341 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (var8.field4333[var10] <= arg6 && var8.field4333[var10] != 0) {
                    var9 = var8.field4341[var10];
                }
            }
            if (var9 != -1) {
                var8 = class9.method52(true, var9);
            }
        }
        class209 var11 = var8.method1647((byte) 126);
        if (var11 == null) {
            return null;
        }
        class195 var12 = null;
        if (var8.field4290 != -1) {
            var12 = (class195) method1590(1, false, true, 0, -41, true, 10, var8.field4353);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field4305 != -1) {
            var12 = (class195) method1590(arg0, false, false, arg3, -41, true, arg6, var8.field4309);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class122.field2050;
        int var14 = class122.field2048;
        int var15 = class122.field2056;
        int[] var16 = new int[4];
        class122.method870(var16);
        class195 var17 = new class195(36, 32);
        class122.method876(var17.field3331, 36, 32);
        class76.method512();
        class76.method508(16, 16);
        class76.field1182 = false;
        int var18 = var8.field4352;
        if (arg2) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg0 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class76.field1192[var8.field4343] * var18 >> 16;
        int var20 = class76.field1189[var8.field4343] * var18 >> 16;
        var11.method1471(0, var8.field4289, var8.field4348, var8.field4343, var8.field4339, var8.field4330 + var19 - (var11.method308() / 2), var8.field4330 + var20, -1L);
        if (arg4 != -41) {
            field3961 = null;
        }
        if (arg0 >= 1) {
            var17.method1355(1);
            if (arg0 >= 2) {
                var17.method1355(16777215);
            }
            class122.method876(var17.field3331, 36, 32);
        }
        if (arg3 != 0) {
            var17.method1357(arg3);
        }
        if (var8.field4290 != -1) {
            var12.method702(0, 0);
        } else if (var8.field4305 != -1) {
            class122.method876(var12.field3331, 36, 32);
            var17.method702(0, 0);
            var17 = var12;
        }
        if (arg1 && (var8.field4316 == 1 || arg6 != 1) && arg6 != -1) {
            class1.field16.method1226(class259.method1755(100000, arg6), 0, 9, 16776960, 1);
        }
        class122.method876(var13, var14, var15);
        class122.method868(var16);
        class76.method512();
        class76.field1182 = true;
        return var17;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIILme;IJIIII)Z")
    public static final boolean method1591(int arg0, int arg1, int arg2, int arg3, class67 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class281.method1884(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static void method1592(byte arg0) {
        field3964 = null;
        field3946 = null;
        int var1 = -78 % ((arg0 + 39) / 44);
        field3961 = null;
        field3954 = null;
        field3970 = null;
        field3956 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)Lbl;")
    public final class253 method1593(int arg0, int arg1) {
        class253 var3 = (class253) class160.field2671.method1411(arg1 ^ 0x6D79, (long) this.field3955);
        field3967++;
        if (var3 == null) {
            class211 var4 = class211.method1494(class63.field1032, this.field3962, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field3952 != null) {
                for (int var5 = 0; var5 < this.field3952.length; var5++) {
                    var4.method1489(this.field3952[var5], this.field3960[var5]);
                }
            }
            if (this.field3959 != null) {
                for (int var6 = 0; var6 < this.field3959.length; var6++) {
                    var4.method1497(this.field3959[var6], this.field3949[var6]);
                }
            }
            var3 = var4.method1480(this.field3963 + 64, this.field3971 + 850, -30, -50, -30);
            class160.field2671.method1404((long) this.field3955, false, var3);
        }
        if (arg1 != -28023) {
            this.method1589((byte) -108, (class187) null);
        }
        class253 var7;
        if (this.field3947 == -1 || arg0 == -1) {
            var7 = var3.method1464(true, true);
        } else {
            var7 = class186.method1242(arg1 + 28023, this.field3947).method19(var3, 157809136, arg0);
        }
        if (this.field3951 != 128 || this.field3966 != 128) {
            var7.method1469(this.field3951, this.field3966, this.field3951);
        }
        if (this.field3965 != 0) {
            if (this.field3965 == 90) {
                var7.method1451();
            }
            if (this.field3965 == 180) {
                var7.method1446();
            }
            if (this.field3965 == 270) {
                var7.method1470();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static final void method1594(int arg0) {
        class273.field4778.method1697(37, 105);
        class273.field4778.method1292(class130.method921(-96), (byte) -64);
        if (arg0 < 113) {
            return;
        }
        class273.field4778.method1294(class249.field4479, -26655);
        class273.field4778.method1294(class199.field3390, -26655);
        field3957++;
        class273.field4778.method1292(class74.field1162, (byte) -64);
        class53.field823++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
    public static final void method1595(boolean arg0) {
        field3968++;
        if (!arg0) {
            method1595(true);
        }
        class273.field4778.method1697(51, 126);
        class145.field2473++;
        class273.field4778.method1294(class203.field3476, -26655);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILva;I)V")
    private final void method1596(int arg0, class187 arg1, int arg2) {
        if (arg0 == 1) {
            this.field3962 = arg1.method1244(false);
        } else if (arg0 == 2) {
            this.field3947 = arg1.method1244(false);
        } else if (arg0 == 4) {
            this.field3951 = arg1.method1244(false);
        } else if (arg0 == 5) {
            this.field3966 = arg1.method1244(false);
        } else if (arg0 == 6) {
            this.field3965 = arg1.method1244(false);
        } else if (arg0 == 7) {
            this.field3963 = arg1.method1268(255);
        } else if (arg0 == 8) {
            this.field3971 = arg1.method1268(255);
        } else if (arg0 == 9) {
            this.field3958 = true;
        } else if (arg0 == 40) {
            int var4 = arg1.method1268(255);
            this.field3952 = new short[var4];
            this.field3960 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3952[var5] = (short) arg1.method1244(false);
                this.field3960[var5] = (short) arg1.method1244(false);
            }
        } else if (arg0 == 41) {
            int var6 = arg1.method1268(255);
            this.field3949 = new short[var6];
            this.field3959 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3959[var7] = (short) arg1.method1244(false);
                this.field3949[var7] = (short) arg1.method1244(false);
            }
        }
        field3950++;
        if (arg2 > -95) {
            this.method1589((byte) -20, (class187) null);
        }
    }
}
