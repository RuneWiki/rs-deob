import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class382 {

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "[I")
    private int[] field4896;

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "Lme;")
    public static class668 field4895 = new class668(64);

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!kfa", name = "f", descriptor = "Lju;")
    public static class352 field4898;

    @OriginalMember(owner = "client!kfa", name = "e", descriptor = "Z")
    public static boolean field4897;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I)V")
    public static void method2176(int arg0) {
        if (arg0 != -4547) {
            field4897 = false;
        }
        field4895 = null;
        field4898 = null;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(II)I")
    public final int method2177(int arg0, int arg1) {
        field4893++;
        int var3 = (this.field4896.length >> 1) + arg0;
        int var4 = arg1 & var3;
        while (true) {
            int var5 = this.field4896[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field4896[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "([I)V")
    public class382(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field4896 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field4896[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field4896[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field4896[var5 + var5] = arg0[var4];
            this.field4896[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(B)V")
    public static final void method2178(byte arg0) {
        field4894++;
        class291.field3758 = 0;
        if (arg0 != -79) {
            field4895 = null;
        }
        class658.field9176.method2085((byte) 9);
        class658.field9176.method2087(class483.field6429, arg0 + 88);
        class291.field3758++;
    }
}
