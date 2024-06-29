import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class171 extends class206 {

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "[B")
    public byte[] field2782;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "Lmh;")
    public static class62 field2779 = class201.method1405(true, "scrollbar");

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "Lmh;")
    public static class62 field2778 = class201.method1405(true, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "S")
    public static short field2780 = 32767;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "Lmh;")
    public static class62 field2783 = class201.method1405(true, "rot:");

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "[[B")
    public static byte[][] field2785 = new byte[50][];

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
    public static int field2786 = 0;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(B)V", line = 29)
    public static final void method1228(byte arg0) {
        field2784++;
        if (class285.field4880.toLowerCase().indexOf("microsoft") == -1) {
            class94.field1545[92] = 74;
            class94.field1545[61] = 27;
            class94.field1545[46] = 72;
            class94.field1545[93] = 43;
            class94.field1545[59] = 57;
            if (class285.field4886 == null) {
                class94.field1545[222] = 59;
                class94.field1545[192] = 58;
            } else {
                class94.field1545[520] = 59;
                class94.field1545[192] = 28;
                class94.field1545[222] = 58;
            }
            class94.field1545[47] = 73;
            class94.field1545[44] = 71;
            class94.field1545[91] = 42;
            class94.field1545[45] = 26;
        } else {
            class94.field1545[221] = 43;
            class94.field1545[188] = 71;
            class94.field1545[190] = 72;
            class94.field1545[223] = 28;
            class94.field1545[189] = 26;
            class94.field1545[219] = 42;
            class94.field1545[222] = 59;
            class94.field1545[191] = 73;
            class94.field1545[187] = 27;
            class94.field1545[220] = 74;
            class94.field1545[192] = 58;
            class94.field1545[186] = 57;
        }
        int var1 = -59 / ((-arg0 - 61) / 33);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZZ)V", line = 84)
    public static final void method1229(boolean arg0, boolean arg1) {
        field2781++;
        byte var2;
        byte[][] var3;
        if (arg0) {
            var2 = 1;
            var3 = class244.field4140;
        } else {
            var3 = class85.field1382;
            var2 = 4;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class209.method1460(102);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class183.field2927[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0 || var8 == 0) {
                            int var9 = (var7 & 0x3FF9) >> 3;
                            int var10 = (var7 & 0xFFCDE3) >> 14;
                            int var11 = var7 >> 1 & 0x3;
                            int var12 = (var10 / 8 << 8) + (var9 / 8);
                            for (int var13 = 0; var13 < class39.field608.length; var13++) {
                                if (class39.field608[var13] == var12 && var3[var13] != null) {
                                    class246.method1719(var3[var13], var6 * 8, 120, arg0, var11, var8, var4, var5 * 8, (var10 & 0x7) * 8, (var9 & 0x7) * 8, class250.field4244);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1) {
            field2786 = -84;
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "([B)V", line = 175)
    public class171(byte[] arg0) {
        this.field2782 = arg0;
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(B)V", line = 188)
    public static void method1230(byte arg0) {
        field2785 = (byte[][]) null;
        if (arg0 == -88) {
            field2779 = null;
            field2783 = null;
            field2778 = null;
        }
    }
}
