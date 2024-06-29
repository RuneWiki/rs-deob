import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class234 {

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public int field3705 = -1;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public int field3718 = -1;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "Z")
    public static boolean field3710 = false;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field3716 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "Lsb;")
    public static class124 field3709;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "Lsb;")
    public static class124 field3712;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "[I")
    public static int[] field3711;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "[I")
    public int[] field3717;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
    public static void method1548(int arg0) {
        int var1 = -80 % ((-arg0 - 66) / 41);
        field3716 = null;
        field3709 = null;
        field3712 = null;
        field3711 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBLig;I)V")
    private final void method1549(int arg0, byte arg1, class136 arg2, int arg3) {
        if (arg3 == 1) {
            this.field3718 = arg2.method996(65280);
        } else if (arg3 == 2) {
            this.field3717 = new int[arg2.method1012(4)];
            for (int var5 = 0; var5 < this.field3717.length; var5++) {
                this.field3717[var5] = arg2.method996(65280);
            }
        } else if (arg3 == 3) {
            this.field3705 = arg2.method1012(4);
        }
        int var6 = 11 % ((arg1 + 31) / 63);
        field3707++;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IJ)V")
    public static final void method1550(int arg0, long arg1) {
        field3702++;
        if (arg0 != -28773 || arg1 <= 0L) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class127.method931(-9114, arg1 - 1L);
            class127.method931(-9114, 1L);
        } else {
            class127.method931(arg0 + 19659, arg1);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V")
    public static final void method1551(int arg0, int arg1) {
        field3714++;
        class248.field3962.method1163(arg0, false);
        if (arg1 != -4) {
            field3709 = null;
        }
        class44.field805.method1163(arg0, false);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)I")
    public static final int method1552(int arg0, int arg1) {
        if (arg1 == 10629) {
            field3715++;
            return arg0 & 0x7F;
        } else {
            return -5;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILig;I)V")
    public final void method1553(int arg0, class136 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1012(4);
            if (var4 == 0) {
                if (arg0 >= -90) {
                    this.field3717 = null;
                }
                field3713++;
                return;
            }
            this.method1549(arg2, (byte) 43, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIZI)I")
    public static final int method1554(int arg0, int arg1, boolean arg2, int arg3) {
        field3704++;
        class194 var4 = (class194) class139.field2322.method1063((byte) -91, (long) arg3);
        if (var4 == null) {
            return 0;
        }
        int var5 = arg0;
        for (int var6 = 0; var6 < var4.field3179.length; var6++) {
            if (var4.field3179[var6] >= 0 && var4.field3179[var6] < class240.field3780) {
                class67 var7 = class190.method1314(var4.field3179[var6], (byte) 68);
                if (var7.field1110 != null) {
                    class186 var8 = (class186) var7.field1110.method1063((byte) -91, (long) arg1);
                    if (var8 != null) {
                        if (arg2) {
                            var5 += var4.field3173[var6] * var8.field3051;
                        } else {
                            var5 += var8.field3051;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZLsb;Lsb;ZI)Lub;")
    public static final class169 method1555(boolean arg0, class124 arg1, class124 arg2, boolean arg3, int arg4) {
        field3708++;
        int[] var5 = arg2.method910(0, arg4);
        boolean var6 = arg0;
        for (int var7 = 0; var7 < var5.length; var7++) {
            byte[] var8 = arg2.method892(var5[var7], arg4, 53);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg3) {
                    var10 = arg1.method892(var9, 0, 109);
                } else {
                    var10 = arg1.method892(0, var9, 3);
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
            return new class169(arg2, arg1, arg4, arg3);
        } catch (Exception var11) {
            return null;
        }
    }
}
