import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class252 {

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "Lvj;")
    public class107 field4423 = new class107();

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public static int field4429 = 0;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "[I")
    public static int[] field4421 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "[S")
    public static short[] field4439 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "Ldf;")
    private static class51 field4426 = class46.method233("green:", 100);

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "Ldf;")
    public static class51 field4433 = field4426;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "Ldf;")
    public static class51 field4438 = field4426;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "Lwc;")
    public static class213 field4440 = null;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "Lvj;")
    private class107 field4430;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public final void method1708(int arg0) {
        while (true) {
            class107 var2 = this.field4423.field1770;
            if (this.field4423 == var2) {
                if (arg0 != 2) {
                    field4440 = null;
                }
                this.field4430 = null;
                field4419++;
                return;
            }
            var2.method764((byte) -79);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILvj;)V")
    public final void method1709(int arg0, class107 arg1) {
        if (arg1.field1758 != null) {
            arg1.method764((byte) -57);
        }
        arg1.field1758 = this.field4423.field1758;
        arg1.field1770 = this.field4423;
        int var3 = -50 % ((arg0 + 45) / 37);
        field4434++;
        arg1.field1758.field1770 = arg1;
        arg1.field1770.field1758 = arg1;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
    public static final void method1710(int arg0, int arg1, int arg2) {
        class231 var3 = class46.method232(-124, arg0);
        int var4 = var3.field4041;
        int var5 = var3.field4034;
        int var6 = var3.field4035;
        int var7 = class191.field3194[var6 - var4];
        field4422++;
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = -92 / ((28 - arg1) / 47);
        int var9 = var7 << var4;
        class4.method14(class139.field2335[var5] & ~var9 | var9 & arg2 << var4, var5, (byte) 99);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLvj;)V")
    public final void method1711(byte arg0, class107 arg1) {
        field4427++;
        if (arg0 != 79) {
            return;
        }
        if (arg1.field1758 != null) {
            arg1.method764((byte) -72);
        }
        arg1.field1770 = this.field4423.field1770;
        arg1.field1758 = this.field4423;
        arg1.field1758.field1770 = arg1;
        arg1.field1770.field1758 = arg1;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)Lvj;")
    public final class107 method1712(byte arg0) {
        if (arg0 != 112) {
            method1715((class111) null, false, (class111) null);
        }
        field4420++;
        class107 var2 = this.field4430;
        if (this.field4423 == var2) {
            this.field4430 = null;
            return null;
        } else {
            this.field4430 = var2.field1770;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)Lvj;")
    public final class107 method1713(int arg0) {
        field4437++;
        if (arg0 != 2) {
            this.method1711((byte) 45, (class107) null);
        }
        class107 var2 = this.field4423.field1758;
        if (this.field4423 == var2) {
            this.field4430 = null;
            return null;
        } else {
            this.field4430 = var2.field1758;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
    public class252() {
        this.field4423.field1758 = this.field4423;
        this.field4423.field1770 = this.field4423;
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)Lvj;")
    public final class107 method1714(int arg0) {
        if (arg0 != 58) {
            return null;
        }
        field4424++;
        class107 var2 = this.field4423.field1770;
        if (this.field4423 == var2) {
            return null;
        } else {
            var2.method764((byte) -63);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lu;ZLu;)V")
    public static final void method1715(class111 arg0, boolean arg1, class111 arg2) {
        if (arg1) {
            method1715((class111) null, true, (class111) null);
        }
        field4431++;
        class45.field723 = arg2;
        class50.field795 = arg0;
        class237.field4135 = class50.field795.method821(arg1, 3);
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)I")
    public final int method1716(byte arg0) {
        field4435++;
        int var2 = 0;
        class107 var3 = this.field4423.field1770;
        if (arg0 != 70) {
            field4426 = null;
        }
        while (this.field4423 != var3) {
            var2++;
            var3 = var3.field1770;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIBIIII)V")
    public static final void method1717(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 0;
        if (arg2 >= -37) {
            return;
        }
        int var8 = arg1 - arg0;
        field4425++;
        class130.method960(arg1, (byte) 100);
        int var9 = arg1;
        if (var8 < 0) {
            var8 = 0;
        }
        int var10 = -arg1;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int var15 = arg3 - var8;
        int var16 = arg3 + var8;
        int[] var17 = class80.field1324[arg6];
        class242.method1660((byte) -79, var17, arg4, var15, arg3 - arg1);
        class242.method1660((byte) -79, var17, arg5, var16, var15);
        class242.method1660((byte) -79, var17, arg4, arg1 + arg3, var16);
        while (var9 > var7) {
            var14 += 2;
            var12 += var14;
            var13 += 2;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class121.field2030[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 >= var8) {
                    int[] var18 = class80.field1324[arg6 + var9];
                    int var19 = arg3 + var7;
                    int[] var20 = class80.field1324[arg6 - var9];
                    int var21 = arg3 - var7;
                    class242.method1660((byte) -79, var18, arg4, var19, var21);
                    class242.method1660((byte) -79, var20, arg4, var19, var21);
                } else {
                    int[] var22 = class80.field1324[arg6 - var9];
                    int[] var23 = class80.field1324[arg6 + var9];
                    int var24 = arg3 + var7;
                    int var25 = arg3 - var7;
                    int var26 = class121.field2030[var9];
                    int var27 = arg3 - var26;
                    class242.method1660((byte) -79, var23, arg4, var27, var25);
                    int var28 = arg3 + var26;
                    class242.method1660((byte) -79, var23, arg5, var28, var27);
                    class242.method1660((byte) -79, var23, arg4, var24, var28);
                    class242.method1660((byte) -79, var22, arg4, var27, var25);
                    class242.method1660((byte) -79, var22, arg5, var28, var27);
                    class242.method1660((byte) -79, var22, arg4, var24, var28);
                }
            }
            int[] var29 = class80.field1324[arg6 + var7];
            int[] var30 = class80.field1324[arg6 - var7];
            int var31 = arg3 + var9;
            int var32 = arg3 - var9;
            if (var8 <= var7) {
                class242.method1660((byte) -79, var29, arg4, var31, var32);
                class242.method1660((byte) -79, var30, arg4, var31, var32);
            } else {
                int var33 = var7 > var11 ? class121.field2030[var7] : var11;
                int var34 = arg3 - var33;
                class242.method1660((byte) -79, var29, arg4, var34, var32);
                int var35 = arg3 + var33;
                class242.method1660((byte) -79, var29, arg5, var35, var34);
                class242.method1660((byte) -79, var29, arg4, var31, var35);
                class242.method1660((byte) -79, var30, arg4, var34, var32);
                class242.method1660((byte) -79, var30, arg5, var35, var34);
                class242.method1660((byte) -79, var30, arg4, var31, var35);
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)V")
    public static void method1718(int arg0) {
        field4439 = null;
        field4421 = null;
        field4438 = null;
        field4426 = null;
        if (arg0 == -1) {
            field4433 = null;
            field4440 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)Lvj;")
    public final class107 method1719(int arg0) {
        field4428++;
        class107 var2 = this.field4430;
        if (this.field4423 == var2) {
            this.field4430 = null;
            return null;
        }
        this.field4430 = var2.field1758;
        if (arg0 != 2) {
            field4438 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)Lvj;")
    public final class107 method1720(boolean arg0) {
        field4436++;
        if (!arg0) {
            this.method1714(63);
        }
        class107 var2 = this.field4423.field1770;
        if (this.field4423 == var2) {
            this.field4430 = null;
            return null;
        } else {
            this.field4430 = var2.field1770;
            return var2;
        }
    }
}
