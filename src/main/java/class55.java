import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class55 extends class129 {

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "J")
    public static long field949 = 0L;

    @OriginalMember(owner = "client!lh", name = "H", descriptor = "I")
    public static int field952 = 0;

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "[Lig;")
    public static class135[] field948 = new class135[29];

    @OriginalMember(owner = "client!lh", name = "M", descriptor = "[I")
    public static int[] field957 = new int[5];

    @OriginalMember(owner = "client!lh", name = "R", descriptor = "Ljava/lang/String;")
    public static String field962 = "Walk here";

    @OriginalMember(owner = "client!lh", name = "S", descriptor = "I")
    public static int field963 = -1;

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "I")
    public int field947;

    @OriginalMember(owner = "client!lh", name = "F", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!lh", name = "G", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!lh", name = "I", descriptor = "I")
    public int field953;

    @OriginalMember(owner = "client!lh", name = "J", descriptor = "I")
    public int field954;

    @OriginalMember(owner = "client!lh", name = "L", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!lh", name = "N", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!lh", name = "O", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!lh", name = "Q", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!lh", name = "K", descriptor = "Lvh;")
    public static class108 field955;

    @OriginalMember(owner = "client!lh", name = "P", descriptor = "Ljava/lang/String;")
    public String field960;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(IIII)I")
    public static final int method339(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 / arg3;
        if (arg2 != -2) {
            field957 = null;
        }
        ++field951;
        int var5 = arg1 / arg3;
        int var6 = arg3 + -1 & arg0;
        int var7 = arg3 + -1 & arg1;
        int var8 = class123.method841(var5, var4, -102);
        int var9 = class123.method841(var5, var4 - -1, arg2 ^ 87);
        int var10 = class123.method841(var5 + 1, var4, -19);
        int var11 = class123.method841(var5 + 1, var4 + 1, -100);
        int var12 = class246.method1645(var8, -87, var9, var6, arg3);
        int var13 = class246.method1645(var10, 86, var11, var6, arg3);
        return class246.method1645(var12, arg2 + -77, var13, var7, arg3);
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V")
    public final void method340(byte arg0) {
        ++field956;
        super.field2267 |= Long.MIN_VALUE;
        if (arg0 != -110) {
            this.field954 = 63;
        }
        if (~this.method342(80) == -1L) {
            class105.field1860.method1498(0, this);
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)V")
    public final void method341(byte arg0) {
        ++field950;
        if (arg0 != 62) {
            method346((class131) null, (class101) null, 90, -3);
        }
        super.field2267 = 500L + class232.method1544((byte) -85) | super.field2267 & Long.MIN_VALUE;
        class194.field3132.method1498(0, this);
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)J")
    public final long method342(int arg0) {
        ++field961;
        if (arg0 <= 69) {
            field949 = -108L;
        }
        return super.field2267 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)I")
    public final int method343(int arg0) {
        ++field946;
        return arg0 != 20875 ? -88 : (int) (255L & super.field1515 >>> 32);
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(B)I")
    public final int method344(byte arg0) {
        ++field959;
        if (arg0 > -114) {
            this.method341((byte) 84);
        }
        return (int) super.field1515;
    }

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)V")
    public static void method345(int arg0) {
        if (arg0 != -2) {
            method345(-111);
        }
        field955 = null;
        field962 = null;
        field948 = null;
        field957 = null;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(II)V")
    public class55(int arg0, int arg1) {
        super.field1515 = (long) arg1 | (long) arg0 << 32;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lvb;Leh;II)V")
    public static final void method346(class131 arg0, class101 arg1, int arg2, int arg3) {
        ++field945;
        class281 var4 = new class281();
        var4.field4477 = arg1.method669((byte) 36);
        var4.field4472 = arg1.method655((byte) 60);
        var4.field4469 = new int[var4.field4477];
        var4.field4468 = new class174[var4.field4477];
        var4.field4473 = new int[var4.field4477];
        var4.field4475 = new byte[var4.field4477][][];
        var4.field4467 = new class174[var4.field4477];
        var4.field4465 = new int[var4.field4477];
        for (int var5 = arg2; ~var4.field4477 < ~var5; ++var5) {
            try {
                int var6 = arg1.method669((byte) 36);
                if (var6 != 0 && var6 != 1 && var6 != 2) {
                    if (~var6 == -4 || ~var6 == -5) {
                        String var7 = arg1.method662((byte) 1);
                        String var8 = arg1.method662((byte) 1);
                        int var9 = arg1.method669((byte) 36);
                        String[] var10 = new String[var9];
                        for (int var11 = 0; ~var9 < ~var11; ++var11) {
                            var10[var11] = arg1.method662((byte) 1);
                        }
                        byte[][] var12 = new byte[var9][];
                        if (~var6 == -4) {
                            for (int var13 = 0; var9 > var13; ++var13) {
                                int var14 = arg1.method655((byte) 67);
                                var12[var13] = new byte[var14];
                                arg1.method647(-13749, 0, var12[var13], var14);
                            }
                        }
                        var4.field4465[var5] = var6;
                        Class[] var15 = new Class[var9];
                        for (int var16 = 0; var9 > var16; ++var16) {
                            var15[var16] = class111.method771(var10[var16], 21674);
                        }
                        var4.field4468[var5] = arg0.method913(true, class111.method771(var7, 21674), var8, var15);
                        var4.field4475[var5] = var12;
                    }
                } else {
                    String var17 = arg1.method662((byte) 1);
                    String var18 = arg1.method662((byte) 1);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg1.method655((byte) 107);
                    }
                    var4.field4465[var5] = var6;
                    var4.field4469[var5] = var19;
                    var4.field4467[var5] = arg0.method911(var18, class52.method329(arg2, -5737), class111.method771(var17, arg2 + 21674));
                }
            } catch (ClassNotFoundException var20) {
                var4.field4473[var5] = -1;
            } catch (SecurityException var21) {
                var4.field4473[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field4473[var5] = -3;
            } catch (Exception var23) {
                var4.field4473[var5] = -4;
            } catch (Throwable var24) {
                var4.field4473[var5] = -5;
            }
        }
        class21.field330.method374(-1, var4);
    }
}
