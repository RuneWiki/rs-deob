import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class782 {

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "[I")
    private int[] field10720;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "Lin;")
    public static class380 field10718 = new class380(47, -1);

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
    public static int field10719;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)I", line = 5)
    public final int method4295(int arg0, int arg1) {
        field10719++;
        int var3 = (this.field10720.length >> 1) - 1;
        int var4 = arg0 & var3;
        int var5 = 38 % ((-arg1 - 4) / 56);
        while (true) {
            int var6 = this.field10720[var4 + var4 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field10720[var4 + var4] == arg0) {
                return var6;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V", line = 37)
    public static void method4296(int arg0) {
        if (arg0 == 0) {
            field10718 = null;
        }
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "([I)V", line = 47)
    public class782(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field10720 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field10720[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field10720[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field10720[var5 + var5] = arg0[var4];
            this.field10720[var5 + var5 + 1] = var4++;
        }
    }
}
