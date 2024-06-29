import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class145 {

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2430 = " ";

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "[I")
    public static int[] field2433 = new int[4096];

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "Lek;")
    public static class206 field2428;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IFIIIBIZ)[I", line = 5)
    public static final int[] method985(int arg0, float arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, boolean arg7) {
        field2429++;
        int[] var8 = new int[arg4];
        class317 var9 = new class317();
        var9.field5151 = arg7;
        var9.field5154 = arg6;
        var9.field5167 = arg2;
        var9.field5163 = arg3;
        int var10 = 14 % ((-arg5 - 60) / 50);
        var9.field5159 = (int) (arg1 * 4096.0F);
        var9.field5157 = arg0;
        var9.method163(100);
        class101.method764((byte) -120, 1, arg4);
        var9.method2281(49, 0, var8);
        return var8;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIZZ)V", line = 29)
    public static final void method986(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        class274.field4464 = 0L;
        boolean var5 = arg4;
        int var6 = class292.method2078(16);
        if (arg0 == 3 || var6 == 3) {
            arg3 = true;
        }
        if (class157.field2661.startsWith("mac") && arg0 > 0) {
            arg3 = true;
        }
        field2432++;
        if (arg0 <= 0 != var6 <= 0) {
            var5 = true;
        }
        if (arg3 && arg0 > 0) {
            var5 = true;
        }
        class75.method573(var5, arg1, arg0, true, arg2, arg3, var6);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZLek;)V", line = 56)
    public static final void method987(boolean arg0, class206 arg1) {
        class199.field3347 = class131.method928(class317.field5174, arg1, false);
        field2431++;
        class300.field4886 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var3 = (float) ((class20.field537[var2] & 0xFF0000) >> 16);
            int var4 = class20.field537[var2 + 1] >> 16 & 0xFF;
            float var5 = ((float) var4 - var3) / 64.0F;
            float var6 = (float) (class20.field537[var2] & 0xFF);
            int var7 = class20.field537[var2 + 1] & 0xFF;
            float var8 = (float) ((class20.field537[var2] & 0xFF00) >> 8);
            int var9 = (class20.field537[var2 + 1] & 0xFF00) >> 8;
            float var10 = ((float) var7 - var6) / 64.0F;
            float var11 = ((float) var9 - var8) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class300.field4886[var2 * 64 + var12] = class287.method2034(class287.method2034((int) var8 << 8, (int) var3 << 16), (int) var6);
                var6 += var10;
                var8 += var11;
                var3 += var5;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class300.field4886[var13] = class20.field537[3];
        }
        class318.field5179 = new int[32768];
        class161.field2716 = new int[32768];
        class7.method67((byte) 35, (class211) null);
        class199.field3342 = new int[32768];
        class349.field5591 = new int[32768];
        class253.field4158 = new class288(128, 254);
        if (!arg0) {
            method985(-105, 2.5176265F, 69, 46, -54, (byte) 5, 121, true);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V", line = 124)
    public static void method988(int arg0) {
        field2430 = null;
        field2428 = null;
        if (arg0 < 57) {
            method986(97, -52, -105, true, true);
        }
        field2433 = null;
    }
}
