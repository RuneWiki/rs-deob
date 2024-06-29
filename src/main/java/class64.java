import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class64 {

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "[I")
    private int[] field970;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "Lcs;")
    public static class351 field974 = new class351(43, 8);

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "[I")
    public static int[] field975;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "[Laq;")
    public static class385[] field976;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "[Lra;")
    public static class480[] field973;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)I")
    public final int method462(int arg0, int arg1) {
        if (arg0 != 32628) {
            this.method462(31, -25);
        }
        field972++;
        int var3 = (this.field970.length >> 1) - 1;
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field970[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field970[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "([I)V")
    public class64(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field970 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field970[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field970[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field970[var5 + var5] = arg0[var4];
            this.field970[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)V")
    public static final void method463(int arg0, int arg1, int arg2) {
        field971++;
        if (class56.method431(12449, arg0)) {
            class407.method2389(arg2, (byte) -127, class39.field666[arg0]);
            if (arg1 != 1) {
                field976 = null;
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public static void method464(int arg0) {
        field973 = null;
        if (arg0 == 43) {
            field975 = null;
            field976 = null;
            field974 = null;
        }
    }
}
