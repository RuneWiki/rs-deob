import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class254 {

    @OriginalMember(owner = "client!va", name = "c", descriptor = "[I")
    private int[] field3966;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "S")
    public static short field3969 = 256;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "[[B")
    public static byte[][] field3968;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZ)V", line = 6)
    public static final void method1701(int arg0, boolean arg1) {
        byte[][] var2;
        if (class249.field3893 && arg1) {
            var2 = class218.field3458;
        } else {
            var2 = class72.field1502;
        }
        field3965++;
        int var3 = class164.field2654.length;
        if (arg0 >= -89) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class95.field1708[var4] >> 8) * 64 - class246.field3818;
                int var7 = (class95.field1708[var4] & 0xFF) * 64 - class101.field1769;
                class268.method1782(true);
                class56.method437(arg1, 124, var6, var7, class326.field4990, var5);
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "([I)V", line = 45)
    public class254(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field3966 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field3966[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field3966[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field3966[var5 + var5] = arg0[var4];
            this.field3966[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)I", line = 84)
    public final int method1702(int arg0, int arg1) {
        field3967++;
        if (arg1 != -1) {
            return -60;
        }
        int var3 = (this.field3966.length >> 1) - 1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field3966[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field3966[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V", line = 117)
    public static void method1703(byte arg0) {
        field3968 = (byte[][]) null;
        if (arg0 >= -37) {
            field3968 = (byte[][]) ((byte[][]) null);
        }
    }
}
