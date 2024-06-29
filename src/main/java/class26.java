import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class26 extends class195 {

    @OriginalMember(owner = "client!mh", name = "fb", descriptor = "Z")
    private boolean field393 = true;

    @OriginalMember(owner = "client!mh", name = "db", descriptor = "Z")
    private boolean field391 = true;

    @OriginalMember(owner = "client!mh", name = "X", descriptor = "[I")
    public static int[] field385 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!mh", name = "Y", descriptor = "[I")
    public static int[] field386 = new int[32];

    @OriginalMember(owner = "client!mh", name = "Z", descriptor = "Lck;")
    public static class119 field387 = class298.method1987((byte) 65, "gts");

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!mh", name = "V", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!mh", name = "W", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!mh", name = "ab", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!mh", name = "cb", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!mh", name = "eb", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!mh", name = "gb", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!mh", name = "hb", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!mh", name = "ib", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!mh", name = "bb", descriptor = "Lwi;")
    public static class23 field389;

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V", line = 9)
    public class26() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lva;Z)V", line = 21)
    public static final void method191(class36 arg0, boolean arg1) {
        class63.field1002 = arg0;
        field384++;
        if (!arg1) {
            field389 = (class23) null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BI)[[I", line = 34)
    public final int[][] method9(byte arg0, int arg1) {
        field388++;
        if (arg0 != 3) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field3126.method603(arg1, -127);
        if (this.field3126.field1372) {
            int[][] var4 = this.method1256(this.field393 ? class59.field945 - arg1 : arg1, 0, -10072);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field391) {
                for (int var11 = 0; var11 < class157.field2504; var11++) {
                    var8[var11] = var5[class254.field4088 - var11];
                    var9[var11] = var6[class254.field4088 - var11];
                    var10[var11] = var7[class254.field4088 - var11];
                }
            } else {
                for (int var12 = 0; var12 < class157.field2504; var12++) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(I)V", line = 104)
    public static void method192(int arg0) {
        field386 = null;
        field389 = null;
        field387 = null;
        if (arg0 != 104) {
            method191((class36) null, false);
        }
        field385 = null;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(B)V", line = 121)
    public static final void method193(byte arg0) {
        class176.field2809.method486((byte) 93);
        if (arg0 <= -2) {
            field395++;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZ)[I", line = 140)
    public final int[] method11(int arg0, boolean arg1) {
        field396++;
        if (arg1) {
            this.field393 = true;
        }
        int[] var3 = this.field3106.method924(100, arg0);
        if (this.field3106.field2260) {
            int[] var4 = this.method1253(0, 116, this.field393 ? class59.field945 - arg0 : arg0);
            if (this.field391) {
                for (int var5 = 0; var5 < class157.field2504; var5++) {
                    var3[var5] = var4[class254.field4088 - var5];
                }
            } else {
                class213.method1341(var4, 0, var3, 0, class157.field2504);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lml;I)V", line = 191)
    public static final void method194(class134 arg0, int arg1) {
        field392++;
        if (arg1 >= -60) {
            field386 = (int[]) null;
        }
        if (class89.field1356 == arg0.field2132) {
            class212.field3379[arg0.field2143] = true;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IZ)V", line = 209)
    public static final void method195(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < class157.field2499; var2++) {
            class163 var3 = class70.field1103[class23.field348[var2]];
            long var4 = (long) class23.field348[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method1038((byte) -100) && arg1 == var3.field2575.field816 && var3.field2575.method382((byte) 8)) {
                int var6 = var3.field4949 >> 7;
                int var7 = var3.field4991 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var3.field4956 == 1 && (var3.field4949 & 0x7F) == 64 && (var3.field4991 & 0x7F) == 64) {
                        if (class257.field4131[var6][var7] == class132.field2012) {
                            continue;
                        }
                        class257.field4131[var6][var7] = class132.field2012;
                    }
                    if (!var3.field2575.field803) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field4981 = class207.method1304(class10.field189, (byte) 122, var3.field4949 + (var3.field4956 * 64) - 64, var3.field4956 * 64 + var3.field4991 + -64);
                    class220.method1397(class10.field189, var3.field4949, var3.field4991, var3.field4981, var3.field4956 * 64 + 60 - 64, var3, var3.field5007, var4, var3.field5001);
                }
            }
        }
        if (arg0 != 21582) {
            field385 = (int[]) null;
        }
        field383++;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lfj;II)V", line = 260)
    public final void method13(class3 arg0, int arg1, int arg2) {
        field394++;
        if (arg2 == 0) {
            this.field391 = arg0.method64((byte) 42) == 1;
        } else if (arg2 == 1) {
            this.field393 = arg0.method64((byte) 120) == 1;
        } else if (arg2 == 2) {
            this.field3127 = arg0.method64((byte) -95) == 1;
        }
        if (arg1 >= -117) {
            field387 = (class119) null;
        }
    }
}
