import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class282 extends class285 {

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "I")
    private int field4533 = 585;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "Ljava/lang/String;")
    public static String field4536 = "Loaded wordpack";

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "Ljava/lang/String;")
    public static String field4532 = "Loaded defaults";

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "Lsk;")
    public static class106 field4531 = new class106();

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "Lkh;")
    public static class251 field4538;

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V", line = 8)
    public class282() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLjj;I)V", line = 18)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        if (arg2 == 0) {
            this.field4533 = arg1.method271(21081);
        }
        if (!arg0) {
            this.field4533 = 111;
        }
        field4535++;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZI)[I", line = 41)
    public final int[] method60(boolean arg0, int arg1) {
        if (!arg0) {
            field4538 = (class251) null;
        }
        field4534++;
        int[] var3 = this.field4573.method1116(110, arg1);
        if (this.field4573.field2420) {
            int var4 = class27.field382[arg1];
            for (int var5 = 0; var5 < class287.field4599; var5++) {
                int var6 = class48.field669[var5];
                if (this.field4533 < var6 && 4096 - this.field4533 > var6 && var4 > 2048 - this.field4533 && var4 < (this.field4533 + 2048)) {
                    int var7 = 2048 - var6;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field4533);
                    var3[var5] = 4096 - var10;
                } else if (2048 - this.field4533 < var6 && var6 < this.field4533 + 2048) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field4533;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field4533);
                } else if (this.field4533 > var4 || var4 > (4096 - this.field4533)) {
                    int var19 = var6 - 2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field4533;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field4533);
                } else if (this.field4533 <= var6 && 4096 - this.field4533 >= var6) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 < 0 ? -var15 : var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field4533);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)I", line = 131)
    public static final int method2036(int arg0, int arg1) {
        if (arg0 == 255) {
            field4537++;
            return arg1 & 0xFF;
        } else {
            return -38;
        }
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(B)V", line = 149)
    public static void method2037(byte arg0) {
        if (arg0 < 52) {
            field4531 = (class106) null;
        }
        field4531 = null;
        field4538 = null;
        field4536 = null;
        field4532 = null;
    }
}
