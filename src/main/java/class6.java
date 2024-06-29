import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 {

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "Lfe;")
    public static class36 field110 = new class36(500);

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "Llc;")
    public static class69 field114 = class69.method470((byte) -121, "Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "Llc;")
    public static class69 field115 = null;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static void method32(int arg0) {
        field115 = null;
        field110 = null;
        field114 = null;
        int var1 = 69 / ((43 - arg0) / 55);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBII)V")
    public static final void method33(int arg0, byte arg1, int arg2, int arg3) {
        field113++;
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var7 = 0; var7 < 8; var7++) {
                class22.field451[arg0][arg3 + var4][arg2 + var7] = 0;
            }
        }
        if (arg3 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class22.field451[arg0][arg3][arg2 + var5] = class22.field451[arg0][arg3 - 1][arg2 + var5];
            }
        }
        if (arg1 != -117) {
            return;
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class22.field451[arg0][arg3 + var6][arg2] = class22.field451[arg0][arg3 + var6][arg2 - 1];
            }
        }
        if (arg3 > 0 && class22.field451[arg0][arg3 - 1][arg2] != 0) {
            class22.field451[arg0][arg3][arg2] = class22.field451[arg0][arg3 - 1][arg2];
        } else if (arg2 > 0 && class22.field451[arg0][arg3][arg2 - 1] != 0) {
            class22.field451[arg0][arg3][arg2] = class22.field451[arg0][arg3][arg2 - 1];
        } else if (arg3 > 0 && arg2 > 0 && class22.field451[arg0][arg3 - 1][arg2 - 1] != 0) {
            class22.field451[arg0][arg3][arg2] = class22.field451[arg0][arg3 - 1][arg2 - 1];
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B[B)V")
    public static final void method34(byte arg0, byte[] arg1) {
        field108++;
        class94 var2 = new class94(arg1);
        var2.field2061 = arg1.length - 2;
        class51.field1119 = var2.method665(8666);
        class91.field1994 = new byte[class51.field1119][];
        class90.field1952 = new int[class51.field1119];
        class63.field1336 = new int[class51.field1119];
        class108.field2343 = new int[class51.field1119];
        class114.field2472 = new int[class51.field1119];
        var2.field2061 = arg1.length - class51.field1119 * 8 - 7;
        class19.field426 = var2.method665(8666);
        class71.field1595 = var2.method665(arg0 ^ 0xFFFFDE72);
        int var3 = (var2.method703((byte) -105) & 0xFF) + 1;
        for (int var4 = 0; var4 < class51.field1119; var4++) {
            class114.field2472[var4] = var2.method665(8666);
        }
        for (int var5 = 0; var5 < class51.field1119; var5++) {
            class90.field1952[var5] = var2.method665(8666);
        }
        for (int var6 = 0; var6 < class51.field1119; var6++) {
            class63.field1336[var6] = var2.method665(arg0 + 8754);
        }
        for (int var7 = 0; var7 < class51.field1119; var7++) {
            class108.field2343[var7] = var2.method665(8666);
        }
        var2.field2061 = arg1.length + 3 - class51.field1119 * 8 - var3 * 3 - 7;
        class80.field1829 = new int[var3];
        int var8 = 1;
        if (arg0 != -88) {
            return;
        }
        while (var3 > var8) {
            class80.field1829[var8] = var2.method677(-125);
            if (class80.field1829[var8] == 0) {
                class80.field1829[var8] = 1;
            }
            var8++;
        }
        var2.field2061 = 0;
        for (int var9 = 0; var9 < class51.field1119; var9++) {
            int var10 = class63.field1336[var9];
            int var11 = class108.field2343[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class91.field1994[var9] = var13;
            int var14 = var2.method703((byte) -86);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method711(true);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        var13[var15 + var10 * var16] = var2.method711(true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public static final void method35(byte arg0) {
        int var1 = -74 % ((3 - arg0) / 61);
        class39.field761.method220((byte) -126);
        field105++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)Z")
    public static final boolean method36(int arg0, int arg1) {
        field111++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else if (arg1 >= 48 && arg1 <= 57) {
            return true;
        } else {
            if (arg0 <= 95) {
                method33(123, (byte) 61, 117, -83);
            }
            return false;
        }
    }
}
