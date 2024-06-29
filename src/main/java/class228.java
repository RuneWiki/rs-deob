import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class228 {

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field3620 = 0;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field3630 = new String[8];

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3635 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "Z")
    public static boolean field3642 = false;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public int field3617;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public int field3618;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public int field3619;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public int field3622;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public int field3624;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public int field3625;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public int field3627;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public int field3628;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public int field3631;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public int field3632;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public int field3634;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
    public int field3637;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
    public int field3638;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public int field3639;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public int field3640;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public int field3641;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    public int field3643;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public int field3645;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "Z")
    public static boolean field3626;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "[I")
    public static int[] field3623;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILsb;)V")
    public static final void method1520(int arg0, class124 arg1) {
        class195.field3196 = arg1;
        field3644++;
        class206.field3318 = class195.field3196.method891(arg0, 4);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lsb;I)V")
    public static final void method1521(class124 arg0, int arg1) {
        field3633++;
        class145.field2393 = class132.method951(arg0, 124, class183.field3016);
        class42.field775 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var4 = (float) (class240.field3790[var2] >> 16 & 0xFF);
            int var5 = (class240.field3790[var2 + 1] & 0xFF0000) >> 16;
            float var6 = ((float) var5 - var4) / 64.0F;
            float var7 = (float) ((class240.field3790[var2] & 0xFF00) >> 8);
            int var8 = (class240.field3790[var2 + 1] & 0xFF00) >> 8;
            float var9 = (float) (class240.field3790[var2] & 0xFF);
            int var10 = class240.field3790[var2 + 1] & 0xFF;
            float var11 = ((float) var8 - var7) / 64.0F;
            float var12 = ((float) var10 - var9) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class42.field775[var2 * 64 + var13] = class140.method1045(class140.method1045((int) var4 << 16, (int) var7 << 8), (int) var9);
                var9 += var12;
                var7 += var11;
                var4 += var6;
            }
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class42.field775[var3] = class240.field3790[3];
        }
        class206.field3322 = new int[32768];
        class135.field2224 = new int[32768];
        class245.method1627((byte) -128, (class74) null);
        class81.field1351 = new int[32768];
        class259.field4116 = new int[32768];
        class89.field1426 = new class17(128, 254);
        if (arg1 != -1094328408) {
            field3623 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)[Lwf;")
    public static final class17[] method1522(byte arg0) {
        class17[] var1 = new class17[class132.field2195];
        if (arg0 != 73) {
            field3630 = null;
        }
        for (int var2 = 0; var2 < class132.field2195; var2++) {
            int var3 = class4.field56[var2] * class19.field268[var2];
            byte[] var4 = class66.field1082[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class244.field3857[class64.method498(255, var4[var6])];
            }
            var1[var2] = new class17(class287.field4592, class20.field315, class193.field3155[var2], class197.field3224[var2], class4.field56[var2], class19.field268[var2], var5);
        }
        field3636++;
        class213.method1410(arg0 ^ 0x49);
        return var1;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static void method1523(int arg0) {
        if (arg0 >= 51) {
            field3635 = null;
            field3623 = null;
            field3630 = null;
        }
    }
}
