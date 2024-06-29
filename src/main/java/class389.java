import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gka")
public class class389 {

    @OriginalMember(owner = "client!gka", name = "e", descriptor = "[I")
    private int[] field5539;

    @OriginalMember(owner = "client!gka", name = "c", descriptor = "I")
    public static int field5537 = -1;

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!gka", name = "b", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!gka", name = "d", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(B[[S[[F)[[S", line = 4)
    public static final short[][] method2382(byte arg0, short[][] arg1, float[][] arg2) {
        if (arg0 < 76) {
            method2382((byte) 76, null, null);
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            for (int var4 = 0; var4 < arg1[var3].length; var4++) {
                arg1[var3][var4] = (short) ((int) (arg2[var3][var4] * 16383.0F));
            }
        }
        field5535++;
        return arg1;
    }

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(JI)V", line = 33)
    public static final void method2383(long arg0, int arg1) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        if (arg1 != 1) {
            field5537 = 79;
        }
        field5536++;
    }

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(III)Lev;", line = 51)
    public static final class719 method2384(int arg0, int arg1, int arg2) {
        class379 var3 = class378.field5427[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5430;
    }

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(II)I", line = 61)
    public final int method2385(int arg0, int arg1) {
        field5538++;
        int var3 = (this.field5539.length >> 1) - 1;
        if (arg0 > -123) {
            return -117;
        }
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field5539[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field5539[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!gka", name = "<init>", descriptor = "([I)V", line = 91)
    public class389(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length + (arg0.length >> 1)); var2 <<= 0x1) {
        }
        this.field5539 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field5539[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field5539[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field5539[var5 + var5] = arg0[var4];
            this.field5539[var5 + var5 + 1] = var4++;
        }
    }
}
