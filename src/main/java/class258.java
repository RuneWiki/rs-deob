import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class258 extends class202 {

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "[Lv;")
    public static class150[] field4103 = new class150[4];

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "[I")
    public static int[] field4107 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public int field4100;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "I")
    public int field4109;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)V")
    public static final void method1759(int arg0, int arg1) {
        if (class84.field1324 == null || class84.field1324.length < arg1) {
            class84.field1324 = new int[arg1];
        }
        int var2 = -36 / ((arg0 - 22) / 55);
        field4106++;
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)V")
    public static void method1760(int arg0) {
        if (arg0 != 0) {
            method1760(-2);
        }
        field4103 = null;
        field4107 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(CI)C")
    public static final char method1761(char arg0, int arg1) {
        field4101++;
        int var2 = -125 / ((arg1 - 91) / 35);
        return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)I")
    public static final int method1762(byte arg0, int arg1) {
        field4105++;
        int var2 = (arg1 & 0x55555555) + ((arg1 & 0xAAAAAAAA) >>> 1);
        int var3 = ((var2 & 0xCCCCCCCD) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        if (arg0 != 6) {
            field4107 = null;
        }
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLqh;)V")
    public static final void method1763(byte arg0, class201 arg1) {
        class238.field3863 = class28.method242(arg1, (byte) 126, class189.field3059);
        field4108++;
        class54.field928 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var4 = (float) (class129.field2082[var2] >> 16 & 0xFF);
            int var5 = class129.field2082[var2 + 1] >> 16 & 0xFF;
            float var6 = (float) (class129.field2082[var2] >> 8 & 0xFF);
            int var7 = class129.field2082[var2 + 1] >> 8 & 0xFF;
            float var8 = ((float) var5 - var4) / 64.0F;
            float var9 = ((float) var7 - var6) / 64.0F;
            int var10 = class129.field2082[var2 + 1] & 0xFF;
            float var11 = (float) (class129.field2082[var2] & 0xFF);
            float var12 = ((float) var10 - var11) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class54.field928[var2 * 64 + var13] = class220.method1495(class220.method1495((int) var4 << 16, (int) var6 << 8), (int) var11);
                var11 += var12;
                var6 += var9;
                var4 += var8;
            }
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class54.field928[var3] = class129.field2082[3];
        }
        if (arg0 != -53) {
            field4099 = 80;
        }
        class228.field3771 = new int[32768];
        class118.field1939 = new int[32768];
        class71.method507((class243) null, 86);
        class64.field1079 = new int[32768];
        class137.field2258 = new int[32768];
        class186.field2953 = new class37(128, 254);
    }
}
