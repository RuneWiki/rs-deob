import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class268 {

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "Lwia;")
    public class761 field3839;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "B")
    public byte field3842;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "S")
    public short field3838;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "B")
    public byte field3841;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "Lvd;")
    public static class39 field3837;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)I", line = 6)
    public static final int method1715(int arg0) {
        field3840++;
        if (class609.field8613 == null) {
            if (!class483.field6967 && class456.field6722 != null) {
                return class456.field6722.field4968;
            }
            int var1 = class632.field8840.method2697(4212);
            int var2 = class632.field8840.method2698(0);
            if (class325.field4650) {
                if (class642.field9012 < var1 && var1 < class642.field9012 + class624.field8741) {
                    int var10 = -1;
                    for (int var11 = 0; var11 < class565.field8032; var11++) {
                        if (class332.field4768) {
                            int var16 = var11 * 16 + class177.field2747 + 33;
                            if ((var16 - 13) < var2 && (var16 + 3) >= var2) {
                                var10 = var11;
                            }
                        } else {
                            int var15 = var11 * 16 + class177.field2747 + 31;
                            if ((var15 - 13) < var2 && (var15 + 3) >= var2) {
                                var10 = var11;
                            }
                        }
                    }
                    if (var10 != -1) {
                        int var12 = 0;
                        class571 var13 = new class571(class673.field9386);
                        for (class567 var14 = (class567) var13.method3308((byte) -115); var14 != null; var14 = (class567) var13.method3306(arg0 + 405)) {
                            if (var10 == (var12++)) {
                                return ((class342) var14.field8055.field8521.field6156).field4968;
                            }
                        }
                    }
                } else if (class218.field3211 != null && class582.field8289 < var1 && var1 < class600.field8491 + class582.field8289) {
                    int var17 = -1;
                    for (int var18 = 0; var18 < class218.field3211.field8052; var18++) {
                        if (class332.field4768) {
                            int var23 = class304.field4300 + (var18 * 16) + 33;
                            if ((var23 - 13) < var2 && var2 <= (var23 + 3)) {
                                var17 = var18;
                            }
                        } else {
                            int var22 = var18 * 16 + class304.field4300 + 31;
                            if ((var22 - 13) < var2 && var22 + 3 >= var2) {
                                var17 = var18;
                            }
                        }
                    }
                    if (var17 != -1) {
                        int var19 = 0;
                        class571 var20 = new class571(class218.field3211.field8055);
                        for (class342 var21 = (class342) var20.method3308((byte) -109); var21 != null; var21 = (class342) var20.method3306(arg0 ^ 0x1F6)) {
                            if (var17 == var19++) {
                                return var21.field4968;
                            }
                        }
                    }
                }
            } else if (class642.field9012 < var1 && var1 < (class642.field9012 + class624.field8741)) {
                int var3 = -1;
                for (int var4 = 0; var4 < class68.field969; var4++) {
                    if (class332.field4768) {
                        int var9 = (class68.field969 - var4 - 1) * 16 + class177.field2747 + 33;
                        if (var2 > (var9 - 13) && (var9 + 3) >= var2) {
                            var3 = var4;
                        }
                    } else {
                        int var8 = (class68.field969 - var4 - 1) * 16 + (class177.field2747 + 31);
                        if ((var8 - 13) < var2 && var8 + 3 >= var2) {
                            var3 = var4;
                        }
                    }
                }
                if (var3 != -1) {
                    int var5 = 0;
                    class25 var6 = new class25(class748.field10459);
                    for (class342 var7 = (class342) var6.method126(-14656); var7 != null; var7 = (class342) var6.method123(arg0 ^ 0xFFFFFE5E)) {
                        if ((var5++) == var3) {
                            return var7.field4968;
                        }
                    }
                }
            }
        }
        if (arg0 != -445) {
            field3837 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)Z", line = 199)
    public static final boolean method1716(byte arg0) {
        if (arg0 != -57) {
            field3837 = null;
        }
        field3836++;
        if (class103.field1450 == null) {
            return false;
        } else {
            if (class103.field1450.field4972 >= 2000) {
                class103.field1450.field4972 -= 2000;
            }
            return class103.field1450.field4972 == 1003;
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V", line = 222)
    public static void method1717(int arg0) {
        if (arg0 == 31) {
            field3837 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lwia;III)V", line = 235)
    public class268(class761 arg0, int arg1, int arg2, int arg3) {
        this.field3839 = arg0;
        this.field3842 = (byte) arg3;
        this.field3838 = (short) arg1;
        this.field3841 = (byte) arg2;
    }
}
