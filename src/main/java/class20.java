import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class20 extends class139 {

    @OriginalMember(owner = "client!bi", name = "X", descriptor = "I")
    private int field344 = 2048;

    @OriginalMember(owner = "client!bi", name = "db", descriptor = "I")
    private int field350 = 12288;

    @OriginalMember(owner = "client!bi", name = "Z", descriptor = "I")
    private int field346 = 2048;

    @OriginalMember(owner = "client!bi", name = "U", descriptor = "I")
    private int field341 = 0;

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
    private int field340 = 4096;

    @OriginalMember(owner = "client!bi", name = "kb", descriptor = "I")
    private int field357 = 8192;

    @OriginalMember(owner = "client!bi", name = "mb", descriptor = "I")
    private int field359 = 0;

    @OriginalMember(owner = "client!bi", name = "bb", descriptor = "Lrf;")
    public static class163 field348 = class53.method392(-77, "");

    @OriginalMember(owner = "client!bi", name = "cb", descriptor = "Lrf;")
    public static class163 field349 = class53.method392(-94, "mn");

    @OriginalMember(owner = "client!bi", name = "W", descriptor = "I")
    public static int field343 = 0;

    @OriginalMember(owner = "client!bi", name = "eb", descriptor = "[I")
    public static int[] field351 = new int[100];

    @OriginalMember(owner = "client!bi", name = "hb", descriptor = "I")
    public static int field354 = 0;

    @OriginalMember(owner = "client!bi", name = "V", descriptor = "Lrf;")
    public static class163 field342 = class53.method392(62, "::autoshadow on");

    @OriginalMember(owner = "client!bi", name = "Y", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!bi", name = "ab", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!bi", name = "fb", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!bi", name = "gb", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!bi", name = "ib", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!bi", name = "jb", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!bi", name = "lb", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        int[] var3 = super.field2859.method1319(-124, arg0);
        ++field356;
        if (arg1 != 7451) {
            this.field341 = 83;
        }
        if (super.field2859.field3966) {
            int var4 = class180.field3607[arg0] + -2048;
            for (int var5 = 0; ~var5 > ~class23.field402; ++var5) {
                int var6 = class189.field3772[var5] + -2048;
                int var7 = this.field344 + var6;
                int var8 = ~var7 > 2047 ? var7 + 4096 : var7;
                int var9 = var8 <= 2048 ? var8 : var8 - 4096;
                int var10 = this.field341 + var4;
                int var11 = this.field346 + var4;
                int var12 = ~var11 > 2047 ? var11 - -4096 : var11;
                int var13 = var12 <= 2048 ? var12 : var12 + -4096;
                int var14 = var10 < -2048 ? var10 + 4096 : var10;
                int var15 = var14 <= 2048 ? var14 : var14 - 4096;
                int var16 = var6 - -this.field359;
                int var17 = ~var16 <= 2047 ? var16 : var16 - -4096;
                int var18 = var17 > 2048 ? var17 + -4096 : var17;
                var3[var5] = !this.method129(var9, arg1 + -7499, var15) && !this.method128(var13, var18, (byte) 81) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "(I)V")
    public static void method125(int arg0) {
        field348 = null;
        field342 = null;
        field351 = null;
        if (arg0 != 2047) {
            method125(45);
        }
        field349 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field357 = arg2.method390((byte) 102);
                                }
                            } else {
                                this.field340 = arg2.method390((byte) 97);
                            }
                        } else {
                            this.field350 = arg2.method390((byte) 116);
                        }
                    } else {
                        this.field346 = arg2.method390((byte) 124);
                    }
                } else {
                    this.field359 = arg2.method390((byte) 122);
                }
            } else {
                this.field341 = arg2.method390((byte) 106);
            }
        } else {
            this.field344 = arg2.method390((byte) 90);
        }
        if (arg1 == 21) {
            ++field347;
        }
    }

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "(I)V")
    public static final void method126(int arg0) {
        class72.field1522 = 0;
        ++field352;
        class181.field3638 = arg0;
        class40.method251((byte) 61);
        class150.method968(15);
        class57.method416((byte) 61);
        for (int var1 = 0; ~var1 > ~class72.field1522; ++var1) {
            int var3 = class168.field3434[var1];
            if (class51.field1023 != class187.field3723[var3].field711) {
                class187.field3723[var3].field1482 = null;
                class187.field3723[var3] = null;
            }
        }
        if (~class74.field1554 != ~class105.field2195.field1033) {
            throw new RuntimeException("gnp1 pos:" + class105.field2195.field1033 + " psize:" + class74.field1554);
        } else {
            for (int var2 = 0; class93.field2013 > var2; ++var2) {
                if (class187.field3723[class170.field3459[var2]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class93.field2013);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V")
    public final void method127(int arg0) {
        ++field355;
        class137.method901(false);
        if (arg0 != 0) {
            this.field350 = -4;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIB)Z")
    private final boolean method128(int arg0, int arg1, byte arg2) {
        ++field345;
        int var4 = (arg0 - -arg1) * this.field350 >> 12;
        int var5 = class210.field4094[(var4 * 255 & 1047581) >> 12];
        int var6 = (var5 << 12) / this.field350;
        int var7 = (var6 << 12) / this.field357;
        int var8 = this.field340 * var7 >> 12;
        if (arg2 <= 32) {
            field354 = -26;
        }
        return ~var8 < ~(-arg1 + arg0) && -var8 < arg0 - arg1;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)Z")
    private final boolean method129(int arg0, int arg1, int arg2) {
        int var4 = (arg2 - arg0) * this.field350 >> 12;
        int var5 = class210.field4094[(1045897 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field350;
        if (arg1 >= -40) {
            method125(-16);
        }
        ++field353;
        int var7 = (var6 << 12) / this.field357;
        int var8 = this.field340 * var7 >> 12;
        return ~var8 < ~(arg0 + arg2) && arg0 + arg2 > -var8;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
    public class20() {
        super(0, true);
    }
}
