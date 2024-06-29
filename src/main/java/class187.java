import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class187 {

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field2982 = 0;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V", line = 8)
    public static final void method1351(int arg0, int arg1, int arg2) {
        class126 var3 = class324.method2228(0, arg1);
        if (arg2 != 21867) {
            field2982 = 86;
        }
        field2983++;
        int var4 = var3.field1986;
        int var5 = var3.field1985;
        int var6 = var3.field1987;
        int var7 = class318.field4951[var6 - var5];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class309.method2144(-377, var8 & arg0 << var5 | ~var8 & class45.field706[var4], var4);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V", line = 33)
    public static final void method1352(int arg0) {
        class102.field1579.method1433(30);
        field2985++;
        if (arg0 != 14740) {
            field2982 = 7;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Llb;I)V", line = 50)
    public static final void method1353(class211 arg0, int arg1) {
        class116.field1812 = class182.method1318(85, class104.field1586, arg0);
        field2984++;
        class29.field340 = new int[256];
        if (arg1 != 14547) {
            field2982 = 0;
        }
        for (int var2 = 0; var2 < 3; var2++) {
            float var3 = (float) (class152.field2293[var2] >> 16 & 0xFF);
            int var4 = (class152.field2293[var2 + 1] & 0xFF0000) >> 16;
            float var5 = (float) (class152.field2293[var2] >> 8 & 0xFF);
            float var6 = ((float) var4 - var3) / 64.0F;
            float var7 = (float) (class152.field2293[var2] & 0xFF);
            int var8 = (class152.field2293[var2 + 1] & 0xFF00) >> 8;
            int var9 = class152.field2293[var2 + 1] & 0xFF;
            float var10 = ((float) var8 - var5) / 64.0F;
            float var11 = ((float) var9 - var7) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class29.field340[var2 * 64 + var12] = class147.method1098(class147.method1098((int) var3 << 16, (int) var5 << 8), (int) var7);
                var7 += var11;
                var5 += var10;
                var3 += var6;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class29.field340[var13] = class152.field2293[3];
        }
        class245.field3688 = new int[32768];
        class142.field2194 = new int[32768];
        class276.method1935((class70) null, (byte) -109);
        class27.field314 = new int[32768];
        class329.field5088 = new int[32768];
        class290.field4567 = new class134(128, 254);
    }
}
