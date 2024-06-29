import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class188 {

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "[I")
    private int[] field2943;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field2944 = 0;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)I")
    public final int method1318(int arg0, int arg1) {
        if (arg1 >= -66) {
            return -25;
        }
        field2942++;
        int var3 = (this.field2943.length >> 1) - 1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field2943[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field2943[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "([I)V")
    public class188(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field2943 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field2943[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field2943[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field2943[var5 + var5] = arg0[var4];
            this.field2943[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
    public static final void method1319(byte arg0) {
        field2941++;
        class68.field1018 = new class231[class217.field3394.method494(118)][];
        class123.field1763 = new boolean[class217.field3394.method494(arg0 ^ 0xFFFFFF97)];
        if (arg0 != -30) {
            field2940 = -46;
        }
    }
}
