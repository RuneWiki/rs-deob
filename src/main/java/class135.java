import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class135 {

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "[I")
    public static int[] field2186 = new int[200];

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field2188 = 0;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "[Lrk;")
    public static class292[] field2187;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
    public static void method923(boolean arg0) {
        if (!arg0) {
            field2186 = null;
            field2187 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V")
    public static final void method924(int arg0, int arg1) {
        field2189++;
        class291 var2 = class61.method389(arg0, arg1, 0);
        var2.method2010(0);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLgi;)V")
    public static final void method925(byte arg0, class164 arg1) {
        class119.field1881 = class85.method606(arg1, 1823720198, class171.field2803);
        field2190++;
        class277.field4528 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            int var4 = (class41.field622[var2 + 1] & 0xFF0000) >> 16;
            float var5 = (float) (class41.field622[var2] >> 16 & 0xFF);
            float var6 = ((float) var4 - var5) / 64.0F;
            float var7 = (float) ((class41.field622[var2] & 0xFF00) >> 8);
            int var8 = class41.field622[var2 + 1] >> 8 & 0xFF;
            float var9 = ((float) var8 - var7) / 64.0F;
            float var10 = (float) (class41.field622[var2] & 0xFF);
            int var11 = class41.field622[var2 + 1] & 0xFF;
            float var12 = ((float) var11 - var10) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class277.field4528[var2 * 64 + var13] = class76.method555((int) var10, class76.method555((int) var7 << 8, (int) var5 << 16));
                var10 += var12;
                var5 += var6;
                var7 += var9;
            }
        }
        if (arg0 != 71) {
            field2187 = null;
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class277.field4528[var3] = class41.field622[3];
        }
        class242.field3791 = new int[32768];
        class133.field2143 = new int[32768];
        class234.method1614((class2) null, (byte) -46);
        class294.field4798 = new int[32768];
        class225.field3543 = new int[32768];
        class275.field4506 = new class67(128, 254);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    public static final void method926(byte arg0) {
        if (arg0 > -72) {
            method926((byte) 16);
        }
        class257.field4232.method1876((byte) 126);
        field2185++;
    }
}
