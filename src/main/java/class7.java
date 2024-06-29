import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class7 extends class262 {

    @OriginalMember(owner = "client!gf", name = "Q", descriptor = "I")
    private int field138 = 0;

    @OriginalMember(owner = "client!gf", name = "W", descriptor = "I")
    private int field144 = 2048;

    @OriginalMember(owner = "client!gf", name = "P", descriptor = "I")
    private int field137 = 10;

    @OriginalMember(owner = "client!gf", name = "T", descriptor = "Lhd;")
    public static class117 field141 = new class117(5);

    @OriginalMember(owner = "client!gf", name = "jb", descriptor = "Lok;")
    private static class146 field157 = class235.method1724(-12908, "Portuguese");

    @OriginalMember(owner = "client!gf", name = "ib", descriptor = "Lok;")
    private static class146 field156 = class235.method1724(-12908, "German");

    @OriginalMember(owner = "client!gf", name = "db", descriptor = "Lok;")
    private static class146 field151 = class235.method1724(-12908, ")3en");

    @OriginalMember(owner = "client!gf", name = "lb", descriptor = "Lok;")
    private static class146 field159 = class235.method1724(-12908, "fr");

    @OriginalMember(owner = "client!gf", name = "gb", descriptor = "Lok;")
    private static class146 field154 = class235.method1724(-12908, ")3fr");

    @OriginalMember(owner = "client!gf", name = "pb", descriptor = "Lok;")
    private static class146 field163 = class235.method1724(-12908, ")3de");

    @OriginalMember(owner = "client!gf", name = "qb", descriptor = "Z")
    public static boolean field164 = false;

    @OriginalMember(owner = "client!gf", name = "hb", descriptor = "Lok;")
    private static class146 field155 = class235.method1724(-12908, "French");

    @OriginalMember(owner = "client!gf", name = "sb", descriptor = "Lok;")
    private static class146 field166 = class235.method1724(-12908, "pt");

    @OriginalMember(owner = "client!gf", name = "mb", descriptor = "Lok;")
    private static class146 field160 = class235.method1724(-12908, "en");

    @OriginalMember(owner = "client!gf", name = "ob", descriptor = "Lok;")
    private static class146 field162 = class235.method1724(-12908, ")3pt");

    @OriginalMember(owner = "client!gf", name = "cb", descriptor = "Lok;")
    private static class146 field150 = class235.method1724(-12908, "de");

    @OriginalMember(owner = "client!gf", name = "tb", descriptor = "I")
    public static int field167 = -2;

    @OriginalMember(owner = "client!gf", name = "rb", descriptor = "Lok;")
    private static class146 field165 = class235.method1724(-12908, "English");

    @OriginalMember(owner = "client!gf", name = "fb", descriptor = "[Lok;")
    public static class146[] field153 = new class146[] { field160, field150, field159, field166 };

    @OriginalMember(owner = "client!gf", name = "eb", descriptor = "[Lok;")
    private static class146[] field152 = new class146[] { field151, field163, field154, field162 };

    @OriginalMember(owner = "client!gf", name = "nb", descriptor = "[Lok;")
    private static class146[] field161 = new class146[] { field165, field156, field155, field157 };

    @OriginalMember(owner = "client!gf", name = "O", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!gf", name = "R", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!gf", name = "U", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!gf", name = "V", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!gf", name = "X", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!gf", name = "Y", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!gf", name = "Z", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!gf", name = "kb", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!gf", name = "bb", descriptor = "Lml;")
    public static class129 field149;

    @OriginalMember(owner = "client!gf", name = "S", descriptor = "[I")
    private int[] field140;

    @OriginalMember(owner = "client!gf", name = "ab", descriptor = "[I")
    private int[] field148;

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V", line = 131)
    public class7() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IB)[I", line = 16)
    public final int[] method38(int arg0, byte arg1) {
        if (arg1 > -85) {
            this.method38(87, (byte) 107);
        }
        field143++;
        int[] var3 = this.field4350.method1532(arg0, (byte) 101);
        if (this.field4350.field3333) {
            int var4 = class312.field5326[arg0];
            if (this.field138 == 0) {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field137; var12++) {
                    if (var4 >= this.field148[var12] && this.field148[var12 + 1] > var4) {
                        if (var4 < this.field140[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class244.method1767(var3, 0, class98.field1598, var11);
            } else {
                for (int var5 = 0; var5 < class98.field1598; var5++) {
                    short var6 = 0;
                    int var7 = 0;
                    int var8 = class210.field3485[var5];
                    int var9 = this.field138;
                    if (var9 == 1) {
                        var7 = var8;
                    } else if (var9 == 2) {
                        var7 = (var4 + var8 - 4096 >> 1) + 2048;
                    } else if (var9 == 3) {
                        var7 = (var8 - var4 >> 1) + 2048;
                    }
                    for (int var10 = 0; var10 < this.field137; var10++) {
                        if (var7 >= this.field148[var10] && this.field148[var10 + 1] > var7) {
                            if (var7 < this.field140[var10]) {
                                var6 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V", line = 140)
    private final void method39(boolean arg0) {
        this.field148 = new int[this.field137 + 1];
        field146++;
        int var2 = 0;
        int var3 = 4096 / this.field137;
        int var4 = this.field144 * var3 >> 12;
        this.field140 = new int[this.field137 + 1];
        if (arg0) {
            field149 = (class129) null;
        }
        for (int var5 = 0; var5 < this.field137; var5++) {
            this.field148[var5] = var2;
            this.field140[var5] = var2 + var4;
            var2 += var3;
        }
        this.field148[this.field137] = 4096;
        this.field140[this.field137] = this.field140[0] + 4096;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lwe;II)V", line = 177)
    public final void method40(class47 arg0, int arg1, int arg2) {
        if (arg1 != 2048) {
            method41(29);
        }
        if (arg2 == 0) {
            this.field137 = arg0.method368(51);
        } else if (arg2 == 1) {
            this.field144 = arg0.method379(-2);
        } else if (arg2 == 2) {
            this.field138 = arg0.method368(-113);
        }
        field158++;
    }

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "(I)V", line = 224)
    public static void method41(int arg0) {
        field161 = null;
        field165 = null;
        field151 = null;
        field155 = null;
        field154 = null;
        field160 = null;
        field149 = null;
        field157 = null;
        field166 = null;
        field152 = null;
        field153 = null;
        field162 = null;
        field163 = null;
        field159 = null;
        if (arg0 < 125) {
            method41(-124);
        }
        field156 = null;
        field141 = null;
        field150 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I[BII)I", line = 251)
    public static final int method42(int arg0, byte[] arg1, int arg2, int arg3) {
        field142++;
        int var4 = -1;
        if (arg3 < 68) {
            method42(0, (byte[]) null, 53, 111);
        }
        for (int var5 = arg2; var5 < arg0; var5++) {
            var4 = class238.field3969[(arg1[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "(I)V", line = 278)
    public final void method43(int arg0) {
        field139++;
        if (arg0 != -2) {
            this.method40((class47) null, 43, -19);
        }
        this.method39(false);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIILbf;JZ)V", line = 290)
    public static final void method44(int arg0, int arg1, int arg2, int arg3, class322 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class164 var8 = new class164();
        var8.field2785 = arg4;
        var8.field2773 = arg1 * 128 + 64;
        var8.field2782 = arg2 * 128 + 64;
        var8.field2781 = arg3;
        var8.field2787 = arg5;
        var8.field2783 = arg6;
        if (class203.field3382[arg0][arg1][arg2] == null) {
            class203.field3382[arg0][arg1][arg2] = new class11(arg0, arg1, arg2);
        }
        class203.field3382[arg0][arg1][arg2].field205 = var8;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(IB)V", line = 323)
    public static final void method45(int arg0, byte arg1) {
        int var2 = -2 % ((arg1 - 7) / 41);
        field147++;
        class158 var3 = class206.method1564(arg0, 9, -108);
        var3.method1238(-79);
    }
}
