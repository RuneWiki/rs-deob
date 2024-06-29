import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class72 extends class456 {

    @OriginalMember(owner = "client!kq", name = "Q", descriptor = "I")
    private int field970 = -1;

    @OriginalMember(owner = "client!kq", name = "Y", descriptor = "Z")
    public static boolean field978 = false;

    @OriginalMember(owner = "client!kq", name = "P", descriptor = "Lj;")
    public static class240 field969 = new class240(8, 2);

    @OriginalMember(owner = "client!kq", name = "J", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!kq", name = "K", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!kq", name = "L", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!kq", name = "N", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!kq", name = "R", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!kq", name = "S", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!kq", name = "T", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!kq", name = "U", descriptor = "I")
    private int field974;

    @OriginalMember(owner = "client!kq", name = "V", descriptor = "I")
    private int field975;

    @OriginalMember(owner = "client!kq", name = "W", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!kq", name = "X", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!kq", name = "H", descriptor = "Liu;")
    public static class397 field963;

    @OriginalMember(owner = "client!kq", name = "O", descriptor = "[I")
    private int[] field968;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "(II)[B")
    public static final byte[] method620(int arg0, int arg1) {
        ++field973;
        class465 var2 = (class465) class105.field1479.method1896((long) arg1, (byte) -85);
        if (arg0 != 0) {
            return null;
        } else {
            if (var2 == null) {
                byte[] var3 = new byte[512];
                Random var4 = new Random((long) arg1);
                for (int var5 = 0; ~var5 > -256; ++var5) {
                    var3[var5] = (byte) var5;
                }
                for (int var6 = 0; var6 < 255; ++var6) {
                    int var7 = 255 - var6;
                    int var8 = class318.method1957(var7, (byte) -64, var4);
                    byte var9 = var3[var8];
                    var3[var8] = var3[var7];
                    var3[var7] = var3[-var6 + 511] = var9;
                }
                var2 = new class465(var3);
                class105.field1479.method1898((long) arg1, var2, (byte) 6);
            }
            return var2.field6552;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IBLre;)V")
    public final void method210(int arg0, byte arg1, class446 arg2) {
        if (arg1 == 55) {
            if (~arg0 == -1) {
                this.field970 = arg2.method2631(arg1 + 2475);
            }
            ++field964;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)[[I")
    public final int[][] method212(int arg0, int arg1) {
        ++field977;
        int[][] var3 = super.field6468.method1090(arg0 ^ -2, arg1);
        if (super.field6468.field2227) {
            int var4 = this.field974 * (class487.field6842 != this.field975 ? this.field975 * arg1 / class487.field6842 : arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class156.field2169 != this.field974) {
                for (int var8 = 0; ~var8 > ~class156.field2169; ++var8) {
                    int var9 = this.field974 * var8 / class156.field2169;
                    int var10 = this.field968[var4 + var9];
                    var7[var8] = class412.method2463(var10 << 4, 4080);
                    var6[var8] = class412.method2463(var10 >> 4, 4080);
                    var5[var8] = class412.method2463(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; ~class156.field2169 < ~var11; ++var11) {
                    int var12 = this.field968[var4++];
                    var7[var11] = class412.method2463(var12 << 4, 4080);
                    var6[var11] = class412.method2463(var12, 65280) >> 4;
                    var5[var11] = class412.method2463(4080, var12 >> 12);
                }
            }
        }
        if (arg0 != 0) {
            field972 = 44;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "()V")
    public class72() {
        super(0, false);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(BI)Z")
    public static final boolean method621(byte arg0, int arg1) {
        if (arg0 != -113) {
            field969 = null;
        }
        ++field966;
        return ~(arg1 & -arg1) == ~arg1;
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(Z)Z")
    public static final boolean method622(boolean arg0) {
        for (int var1 = class426.field6093; var1 < class344.field5192; ++var1) {
            class337[][] var2 = class170.field2427[var1];
            for (int var3 = -class281.field4243; var3 <= 0; ++var3) {
                int var4 = class307.field4577 + var3;
                int var5 = class307.field4577 - var3;
                if (var4 >= class473.field6635 || var5 < class121.field1671) {
                    for (int var6 = -class281.field4243; var6 <= 0; ++var6) {
                        int var7 = class386.field5702 + var6;
                        int var8 = class386.field5702 - var6;
                        if (var4 >= class473.field6635) {
                            if (var7 >= class314.field4723) {
                                class337 var9 = var2[var4][var7];
                                if (var9 != null && var9.field5060) {
                                    class187.field2835 = arg0;
                                    class44.field632.method100(var9, -23157);
                                    class44.field632.method93(78);
                                }
                            }
                            if (var8 < class385.field5698) {
                                class337 var10 = var2[var4][var8];
                                if (var10 != null && var10.field5060) {
                                    class187.field2835 = arg0;
                                    class44.field632.method100(var10, -23157);
                                    class44.field632.method93(98);
                                }
                            }
                        }
                        if (var5 < class121.field1671) {
                            if (var7 >= class314.field4723) {
                                class337 var11 = var2[var5][var7];
                                if (var11 != null && var11.field5060) {
                                    class187.field2835 = arg0;
                                    class44.field632.method100(var11, -23157);
                                    class44.field632.method93(114);
                                }
                            }
                            if (var8 < class385.field5698) {
                                class337 var12 = var2[var5][var8];
                                if (var12 != null && var12.field5060) {
                                    class187.field2835 = arg0;
                                    class44.field632.method100(var12, -23157);
                                    class44.field632.method93(86);
                                }
                            }
                        }
                        if (class341.field5111 == 0) {
                            if (class252.field3628) {
                                class44.field632.method99(24, (byte) 87);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "(I)I")
    public final int method623(int arg0) {
        if (arg0 != 0) {
            return 81;
        } else {
            ++field976;
            return this.field970;
        }
    }

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "(I)V")
    public static void method624(int arg0) {
        int var1 = -90 / ((-77 - arg0) / 45);
        field963 = null;
        field969 = null;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(BII)V")
    public final void method625(byte arg0, int arg1, int arg2) {
        if (arg0 <= -86) {
            super.method625((byte) -100, arg1, arg2);
            ++field967;
            if (~this.field970 <= -1 && class146.field2055 != null) {
                int var4 = class146.field2055.method1331(9386, this.field970).field1197 ? 64 : 128;
                this.field968 = class146.field2055.method1332(false, var4, this.field970, var4, 1.0F, false);
                this.field975 = var4;
                this.field974 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "(I)V")
    public final void method626(int arg0) {
        ++field965;
        super.method626(arg0);
        this.field968 = null;
    }
}
