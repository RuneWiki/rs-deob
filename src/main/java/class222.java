import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class222 extends class285 {

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "I")
    private int field3552 = 0;

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
    private int field3556 = 4096;

    @OriginalMember(owner = "client!ra", name = "X", descriptor = "I")
    public static int field3560 = -1;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!ra", name = "V", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!ra", name = "W", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZI)[I", line = 12)
    public final int[] method60(boolean arg0, int arg1) {
        if (!arg0) {
            this.method63(false, (class44) null, 1);
        }
        int[] var3 = this.field4573.method1116(108, arg1);
        field3555++;
        if (this.field4573.field2420) {
            int[] var4 = this.method2048(0, (byte) 121, arg1);
            for (int var5 = 0; var5 < class287.field4599; var5++) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field3552 && var6 <= this.field3556 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZLak;)V", line = 43)
    public static final void method1580(boolean arg0, class172 arg1) {
        field3558++;
        if (class240.field3809) {
            return;
        }
        if (class232.field3690) {
            class75.method500();
        } else {
            class59.method399();
        }
        class129.field2022 = class57.method367(class67.field961, -26, arg1);
        int var2 = class20.field276;
        int var3 = var2 * 956 / 503;
        class129.field2022.method376((class133.field2095 - var3) / 2, 0, var3, var2);
        if (arg0) {
            method1582((byte) -56);
        }
        class302.field4749 = class285.method2044(60, arg1, class100.field1454);
        class302.field4749.method1856(class133.field2095 / 2 - (class302.field4749.field4163 / 2), 18);
        class240.field3809 = true;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V", line = 77)
    public class222() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(CI)Z", line = 81)
    public static final boolean method1581(char arg0, int arg1) {
        if (arg1 != 0) {
            method1580(true, (class172) null);
        }
        field3551++;
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZLjj;I)V", line = 97)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        field3557++;
        if (arg2 == 0) {
            this.field3552 = arg1.method271(21081);
        } else if (arg2 == 1) {
            this.field3556 = arg1.method271(21081);
        }
        if (!arg0) {
            method1582((byte) 69);
        }
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(B)V", line = 134)
    public static final void method1582(byte arg0) {
        field3559++;
        int var1 = 102 % ((-arg0) / 55);
        class144.field2249 = null;
        class310.field4832 = null;
        class341.field5313 = null;
        class335.field5238 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z[I[I[ILqi;)V", line = 150)
    public static final void method1583(boolean arg0, int[] arg1, int[] arg2, int[] arg3, class234 arg4) {
        for (int var5 = 0; var5 < arg3.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg1[var5];
            int var8 = arg3[var5];
            for (int var9 = 0; var6 != 0 && var9 < arg4.field4274.length; var9++) {
                if ((var6 & 0x1) != 0) {
                    if (var8 == -1) {
                        arg4.field4274[var9] = null;
                    } else {
                        class202 var10 = class325.method2274(var8, -121);
                        int var11 = var10.field3291;
                        class240 var12 = arg4.field4274[var9];
                        if (var12 != null) {
                            if (var12.field3812 == var8) {
                                if (var11 == 0) {
                                    var12 = arg4.field4274[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3810 = 0;
                                    var12.field3816 = 0;
                                    var12.field3811 = 1;
                                    var12.field3808 = var7;
                                    var12.field3807 = 0;
                                    class190.method1411(31, false, var10, arg4.field4264, 0, arg4.field4255);
                                } else if (var11 == 2) {
                                    var12.field3810 = 0;
                                }
                            } else if (var10.field3279 >= class325.method2274(var12.field3812, -105).field3279) {
                                var12 = arg4.field4274[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class240 var13 = arg4.field4274[var9] = new class240();
                            var13.field3811 = 1;
                            var13.field3812 = var8;
                            var13.field3816 = 0;
                            var13.field3808 = var7;
                            var13.field3807 = 0;
                            var13.field3810 = 0;
                            class190.method1411(31, false, var10, arg4.field4264, 0, arg4.field4255);
                        }
                    }
                }
                var6 >>>= 0x1;
            }
        }
        if (arg0) {
            field3560 = 53;
        }
        field3553++;
    }
}
