import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class56 extends class326 {

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "I")
    private int field778 = 0;

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "I")
    private int field777 = 2048;

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "I")
    private int field771 = 10;

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "[I")
    private int[] field770;

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "[I")
    private int[] field779;

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "[[B")
    public static byte[][] field768;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V")
    public final void method65(int arg0) {
        ++field776;
        if (arg0 >= -100) {
            this.method33(-72, (class32) null, 56);
        }
        this.method410(24396);
    }

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)V")
    public static void method407(int arg0) {
        field768 = null;
        if (arg0 != 16) {
            method409((class263) null);
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)Lbp;")
    public static final class239 method408(int arg0, int arg1) {
        ++field773;
        class239 var2 = (class239) class274.field3632.method493((byte) 19, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class486.field6725.method702((byte) -111, arg0, arg1);
            class239 var4 = new class239();
            var4.field3181 = arg0;
            if (var3 != null) {
                var4.method1326(false, new class32(var3));
            }
            var4.method1322(~arg1);
            if (~var4.field3168 == -3 && class445.field6055.method1528((long) arg0, 120) == null) {
                class445.field6055.method1525((byte) 19, new class37(class213.field2871), (long) arg0);
                class135.field1972[class213.field2871++] = var4;
            }
            class274.field3632.method505((long) arg0, var4, arg1 ^ 112);
            return var4;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lnn;)V")
    public static final void method409(class263 arg0) {
        if (class162.field2259 < 65535) {
            class276.field3652[class162.field2259] = arg0;
            class363.field4975[class162.field2259] = false;
            ++class162.field2259;
            int var1 = arg0.field3490;
            if (arg0.field3485) {
                var1 = 0;
            }
            int var2 = arg0.field3490;
            if (arg0.field3491) {
                var2 = class142.field2056 - 1;
            }
            for (int var3 = var1; var3 <= var2; ++var3) {
                int var4 = 0;
                int var5 = arg0.field5541 - arg0.field5545 + class235.field3119 >> class302.field4025;
                if (var5 < 0) {
                    var4 -= var5;
                    var5 = 0;
                }
                int var6 = arg0.field5545 + arg0.field5541 - class235.field3119 >> class302.field4025;
                if (var6 >= class91.field1344) {
                    var6 = class91.field1344 - 1;
                }
                for (int var7 = var5; var7 <= var6; ++var7) {
                    short var8 = arg0.field3495[var4++];
                    int var9 = (var8 >>> 8) + (arg0.field5539 - arg0.field5545 + class235.field3119 >> class302.field4025);
                    int var10 = (var8 & 255) + var9 - 1;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    if (var10 >= class143.field2058) {
                        var10 = class143.field2058 - 1;
                    }
                    for (int var11 = var9; var11 <= var10; ++var11) {
                        long var12 = class132.field1943[var3][var11][var7];
                        if ((var12 & 65535L) == 0L) {
                            class132.field1943[var3][var11][var7] = var12 | (long) class162.field2259;
                        } else if ((var12 & 4294901760L) == 0L) {
                            class132.field1943[var3][var11][var7] = var12 | (long) class162.field2259 << 16;
                        } else if ((var12 & 281470681743360L) == 0L) {
                            class132.field1943[var3][var11][var7] = var12 | (long) class162.field2259 << 32;
                        } else if ((var12 & -281474976710656L) == 0L) {
                            class132.field1943[var3][var11][var7] = var12 | (long) class162.field2259 << 48;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILbt;I)V")
    public final void method33(int arg0, class32 arg1, int arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field778 = arg1.method201((byte) -127);
                }
            } else {
                this.field777 = arg1.method215((byte) 95);
            }
        } else {
            this.field771 = arg1.method201((byte) -127);
        }
        if (arg2 >= -3) {
            method408(51, 59);
        }
        ++field774;
    }

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "(I)V")
    private final void method410(int arg0) {
        ++field769;
        int var2 = 0;
        this.field770 = new int[this.field771 + 1];
        if (arg0 != 24396) {
            this.field770 = null;
        }
        this.field779 = new int[this.field771 + 1];
        int var3 = 4096 / this.field771;
        int var4 = this.field777 * var3 >> 12;
        for (int var5 = 0; ~var5 > ~this.field771; ++var5) {
            this.field770[var5] = var2;
            this.field779[var5] = var2 - -var4;
            var2 += var3;
        }
        this.field770[this.field771] = 4096;
        this.field779[this.field771] = this.field779[0] + 4096;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class56() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        ++field775;
        if (arg0 > -6) {
            this.method65(-37);
        }
        int[] var3 = super.field4344.method130(arg1, -121);
        if (super.field4344.field286) {
            int var4 = class95.field1400[arg1];
            if (this.field778 != 0) {
                for (int var5 = 0; var5 < class181.field2495; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class389.field5375[var5];
                    int var9 = this.field778;
                    if (var9 != 1) {
                        if (~var9 != -3) {
                            if (~var9 == -4) {
                                var6 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = 2048 - -(var8 - 4096 - -var4 >> 1);
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; var10 < this.field771; ++var10) {
                        if (~this.field770[var10] >= ~var6 && var6 < this.field770[var10 + 1]) {
                            if (~this.field779[var10] < ~var6) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~this.field771 < ~var12; ++var12) {
                    if (~var4 <= ~this.field770[var12] && this.field770[var12 + 1] > var4) {
                        if (var4 < this.field779[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class380.method2337(var3, 0, class181.field2495, var11);
            }
        }
        return var3;
    }
}
