import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class301 {

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "[I")
    public static int[] field5184 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0 };

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "Lke;")
    public static class256 field5180 = class316.method2202("loginscreen", 27626);

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "Lke;")
    public static class256 field5188 = class316.method2202(":trade:", 27626);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "F")
    public static float field5176;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "Lqi;")
    public static class242 field5189;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "[S")
    public static short[] field5181;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "[[[B")
    public static byte[][][] field5179;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BII)I", line = 13)
    public static final int method2100(byte arg0, int arg1, int arg2) {
        field5182++;
        int var3 = -16 % ((arg0 + 6) / 62);
        int var4 = arg2 >>> 31;
        return (arg2 + var4) / arg1 - var4;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)V", line = 25)
    public static final void method2101(int arg0, int arg1) {
        field5178++;
        class105.field1884.method2075(arg0, 1);
        if (arg1 != 1750290760) {
            method2104((class138) null, true);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V", line = 46)
    public static final void method2102(byte arg0) {
        class260.field4499 = null;
        if (arg0 <= 120) {
            field5189 = (class242) null;
        }
        field5183++;
        class182.field3230 = null;
        class76.field1444 = null;
        class119.field2102 = null;
        class8.field120 = null;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)V", line = 61)
    public static void method2103(byte arg0) {
        field5181 = null;
        field5180 = null;
        if (arg0 != 96) {
            method2104((class138) null, false);
        }
        field5188 = null;
        field5179 = (byte[][][]) null;
        field5189 = null;
        field5184 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lng;Z)V", line = 83)
    public static final void method2104(class138 arg0, boolean arg1) {
        class66.field1182 = class264.method1846(class193.field3525, arg0, arg1);
        field5186++;
        class192.field3502 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var3 = (float) ((class285.field4939[var2] & 0xFF0000) >> 16);
            int var4 = (class285.field4939[var2 + 1] & 0xFF0000) >> 16;
            float var5 = ((float) var4 - var3) / 64.0F;
            float var6 = (float) (class285.field4939[var2] >> 8 & 0xFF);
            int var7 = (class285.field4939[var2 + 1] & 0xFF00) >> 8;
            float var8 = (float) (class285.field4939[var2] & 0xFF);
            float var9 = ((float) var7 - var6) / 64.0F;
            int var10 = class285.field4939[var2 + 1] & 0xFF;
            float var11 = ((float) var10 - var8) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class192.field3502[var2 * 64 + var12] = class100.method721((int) var8, class100.method721((int) var3 << 16, (int) var6 << 8));
                var6 += var9;
                var8 += var11;
                var3 += var5;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class192.field3502[var13] = class285.field4939[3];
        }
        class83.field1513 = new int[32768];
        class250.field4240 = new int[32768];
        class302.method2116((byte) 56, (class232) null);
        class144.field2527 = new int[32768];
        class313.field5392 = new int[32768];
        class40.field733 = new class227(128, 254);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V", line = 152)
    public static final void method2105(int arg0) {
        field5185++;
        for (int var1 = 0; var1 < 100; var1++) {
            class53.field974[var1] = true;
        }
        if (arg0 <= 1) {
            method2104((class138) null, true);
        }
    }
}
