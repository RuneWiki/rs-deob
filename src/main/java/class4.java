import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class4 {

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    private int field33 = 0;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "[Ljg;")
    public class171[] field20;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public int field29;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field19 = 0;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "J")
    private long field18;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "Ljg;")
    private class171 field26;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "Ljg;")
    private class171 field34;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)I")
    public final int method16(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < this.field29; var3++) {
            class171 var5 = this.field20[var3];
            for (class171 var6 = var5.field2378; var6 != var5; var6 = var6.field2378) {
                var2++;
            }
        }
        field30++;
        int var4 = -39 % ((arg0 + 53) / 60);
        return var2;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
    public static final void method17(int arg0) {
        class235.field3583.method546(arg0 ^ 0x568EC17);
        class172.field2388.method546(-90762264);
        class245.field3737.method546(-90762264);
        class50.field727.method546(arg0 ^ 0x568EC17);
        field28++;
        if (arg0 != -1) {
            method18((String) null, 98, 46);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method18(String arg0, int arg1, int arg2) {
        field35++;
        boolean var3 = false;
        String var4 = class181.method1182(class68.method430((byte) -4, arg0), 50);
        if (arg1 != -2) {
            field19 = 98;
        }
        for (int var5 = 0; var5 < class103.field1442; var5++) {
            class88 var6 = class154.field2133[class205.field2848[var5]];
            if (var6 != null && var6.field1217 != null && var6.field1217.equalsIgnoreCase(var4)) {
                if (arg2 == 1) {
                    class281.field4359.method1864(216, (byte) -69);
                    class281.field4359.method1447(0, 17363472);
                    class281.field4359.method1470(393660232, class205.field2848[var5]);
                    class216.field3258++;
                } else if (arg2 == 4) {
                    class281.field4359.method1864(3, (byte) -69);
                    class281.field4359.method1480(0, (byte) -53);
                    class95.field1344++;
                    class281.field4359.method1488(class205.field2848[var5], -110);
                } else if (arg2 == 5) {
                    class281.field4359.method1864(12, (byte) -69);
                    class281.field4359.method1470(393660232, class205.field2848[var5]);
                    class281.field4359.method1480(0, (byte) -53);
                    class167.field2302++;
                } else if (arg2 == 6) {
                    class281.field4359.method1864(183, (byte) -69);
                    class102.field1426++;
                    class281.field4359.method1448((byte) 56, 0);
                    class281.field4359.method1488(class205.field2848[var5], arg1 - 126);
                } else if (arg2 == 7) {
                    class281.field4359.method1864(199, (byte) -69);
                    class281.field4359.method1477(class205.field2848[var5], -61);
                    class140.field1954++;
                    class281.field4359.method1447(0, 17363472);
                }
                var3 = true;
                break;
            }
        }
        if (!var3) {
            class283.method1900("", class144.field2000 + var4, 0, true);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public final void method19(byte arg0) {
        for (int var2 = 0; var2 < this.field29; var2++) {
            class171 var3 = this.field20[var2];
            while (true) {
                class171 var4 = var3.field2378;
                if (var3 == var4) {
                    break;
                }
                var4.method1115(-122);
            }
        }
        this.field34 = null;
        this.field26 = null;
        if (arg0 == 11) {
            field31++;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljg;JI)V")
    public final void method20(class171 arg0, long arg1, int arg2) {
        if (arg0.field2367 != null) {
            arg0.method1115(121);
        }
        field32++;
        class171 var5 = this.field20[(int) ((long) (this.field29 - 1) & arg1)];
        if (arg2 != 0) {
            return;
        }
        arg0.field2369 = arg1;
        arg0.field2378 = var5;
        arg0.field2367 = var5.field2367;
        arg0.field2367.field2378 = arg0;
        arg0.field2378.field2367 = arg0;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)Ljg;")
    public final class171 method21(byte arg0) {
        this.field33 = 0;
        field21++;
        if (arg0 != 67) {
            this.field20 = null;
        }
        return this.method22(true);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)Ljg;")
    public final class171 method22(boolean arg0) {
        field25++;
        if (this.field33 > 0 && this.field20[this.field33 - 1] != this.field34) {
            class171 var2 = this.field34;
            this.field34 = var2.field2378;
            return var2;
        }
        if (!arg0) {
            this.method26(107);
        }
        while (this.field33 < this.field29) {
            class171 var3 = this.field20[this.field33++].field2378;
            if (this.field20[this.field33 - 1] != var3) {
                this.field34 = var3.field2378;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IJ)Ljg;")
    public final class171 method23(int arg0, long arg1) {
        this.field18 = arg1;
        field24++;
        class171 var4 = this.field20[(int) ((long) (this.field29 - 1) & arg1)];
        for (this.field26 = var4.field2378; this.field26 != var4; this.field26 = this.field26.field2378) {
            if (this.field26.field2369 == arg1) {
                class171 var5 = this.field26;
                this.field26 = this.field26.field2378;
                return var5;
            }
        }
        this.field26 = null;
        if (arg0 != 216) {
            this.field34 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)I")
    public final int method24(int arg0) {
        if (arg0 == -2) {
            field36++;
            return this.field29;
        } else {
            return 114;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIII)V")
    public static final void method25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field22++;
        int var7 = class148.method996(class273.field4228, arg0, 7585, class127.field1782);
        int var8 = class148.method996(class273.field4228, arg5, 7585, class127.field1782);
        int var9 = class148.method996(class93.field1294, arg2, 7585, class296.field4668);
        int var10 = class148.method996(class93.field1294, arg6, 7585, class296.field4668);
        int var11 = class148.method996(class273.field4228, arg0 + arg3, 7585, class127.field1782);
        int var12 = class148.method996(class273.field4228, arg5 - arg3, 7585, class127.field1782);
        for (int var13 = var7; var13 < var11; var13++) {
            class154.method1028(-353, class216.field3264[var13], arg1, var9, var10);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class154.method1028(-353, class216.field3264[var14], arg1, var9, var10);
        }
        int var15 = class148.method996(class93.field1294, arg2 + arg3, 7585, class296.field4668);
        int var16 = class148.method996(class93.field1294, arg6 - arg3, 7585, class296.field4668);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class216.field3264[var17];
            class154.method1028(-353, var18, arg1, var9, var15);
            class154.method1028(-353, var18, arg1, var16, var10);
        }
        if (arg4 > -110) {
            field19 = -17;
        }
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)Ljg;")
    public final class171 method26(int arg0) {
        field23++;
        if (this.field26 == null) {
            return null;
        }
        if (arg0 != 21061) {
            field19 = 66;
        }
        class171 var2 = this.field20[(int) (this.field18 & (long) (this.field29 - 1))];
        while (this.field26 != var2) {
            if (this.field26.field2369 == this.field18) {
                class171 var3 = this.field26;
                this.field26 = this.field26.field2378;
                return var3;
            }
            this.field26 = this.field26.field2378;
        }
        this.field26 = null;
        return null;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(I)V")
    public class4(int arg0) {
        this.field20 = new class171[arg0];
        this.field29 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class171 var3 = this.field20[var2] = new class171();
            var3.field2378 = var3;
            var3.field2367 = var3;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V")
    public static final void method27(int arg0, int arg1) {
        class75.field1054 = -1;
        if (arg0 > 27) {
            field27++;
            client.field2181 = arg1;
            class67.field906 = -1;
            class143.method956(-1);
        }
    }
}
