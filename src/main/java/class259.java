import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class259 {

    @OriginalMember(owner = "client!w", name = "a", descriptor = "Lcd;")
    public static class64 field4464 = class44.method335((byte) 71, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field4468 = 0;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Lcd;")
    public static class64 field4469 = class44.method335((byte) 71, "(Y");

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Z")
    public static boolean field4465 = true;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field4471 = 2301979;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILqm;)V", line = 8)
    public static final void method1833(int arg0, class222 arg1) {
        field4466++;
        class182.field3129 = class54.method426(arg1, (byte) -77, class82.field1520);
        class113.field2090 = new int[256];
        if (arg0 != 2301979) {
            method1834(113);
        }
        for (int var2 = 0; var2 < 3; var2++) {
            float var3 = (float) (class289.field4933[var2] >> 16 & 0xFF);
            int var4 = class289.field4933[var2 + 1] >> 16 & 0xFF;
            float var5 = ((float) var4 - var3) / 64.0F;
            float var6 = (float) (class289.field4933[var2] >> 8 & 0xFF);
            int var7 = (class289.field4933[var2 + 1] & 0xFF00) >> 8;
            float var8 = ((float) var7 - var6) / 64.0F;
            int var9 = class289.field4933[var2 + 1] & 0xFF;
            float var10 = (float) (class289.field4933[var2] & 0xFF);
            float var11 = ((float) var9 - var10) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class113.field2090[var2 * 64 + var12] = class11.method91((int) var10, class11.method91((int) var3 << 16, (int) var6 << 8));
                var3 += var5;
                var10 += var11;
                var6 += var8;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class113.field2090[var13] = class289.field4933[3];
        }
        class82.field1513 = new int[32768];
        class85.field1579 = new int[32768];
        class201.method1410(false, (class176) null);
        class198.field3386 = new int[32768];
        class268.field4628 = new int[32768];
        if (class123.field2216) {
            class265.field4566 = new class167(128, 254);
        } else {
            class265.field4566 = new class127(128, 254);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 115)
    public static void method1834(int arg0) {
        int var1 = 93 / ((arg0 + 7) / 53);
        field4469 = null;
        field4464 = null;
    }
}
