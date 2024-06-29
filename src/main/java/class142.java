import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class142 {

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "Lvc;")
    public static class137 field3344 = class45.method325("p11_full", -46);

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "Lvc;")
    private static class137 field3342 = class45.method325("Loading textures )2 ", -46);

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Lvc;")
    public static class137 field3343 = field3342;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "Lvc;")
    private static class137 field3341 = class45.method325("Ok", -46);

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "Z")
    public static boolean field3340 = false;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "Lvc;")
    public static class137 field3338 = class45.method325("M", -46);

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "Lvc;")
    public static class137 field3353 = field3341;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public static int field3354 = 0;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "Lvc;")
    public static class137 field3347 = class45.method325("title)3jpg", -46);

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "Lvc;")
    public static class137 field3356 = class45.method325("backhmid1", -46);

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public static int field3352 = -1;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "Lvc;")
    private static class137 field3350 = class45.method325("Loaded wordpack", -46);

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "Lvc;")
    public static class137 field3349 = class45.method325("Okay", -46);

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "Lvc;")
    public static class137 field3345 = field3350;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "Lnb;")
    public static class88 field3348;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lvd;III)V")
    public static final void method1092(class138 arg0, int arg1, int arg2, int arg3) {
        field3351++;
        if (arg0 == null) {
            return;
        }
        int var4 = class120.field2794 + class105.field2436 & 0x7FF;
        if (arg3 != 83) {
            field3342 = null;
        }
        int var5 = arg2 * arg2 + arg1 * arg1;
        if (var5 > 6400) {
            return;
        }
        int var6 = class97.field2258[var4];
        int var7 = var6 * 256 / (class78.field1744 + 256);
        int var8 = class97.field2257[var4];
        int var9 = var8 * 256 / (class78.field1744 + 256);
        int var10 = arg1 * var7 + arg2 * var9 >> 16;
        int var11 = arg1 * var9 - arg2 * var7 >> 16;
        if (var5 > 2500) {
            arg0.method1037(class6.field121, var10 + 98 - arg0.field3197 / 2, -var11 + 83 + -4 - arg0.field3193 / 2);
        } else {
            arg0.method1048(var10 + 94 + 4 - arg0.field3197 / 2, -var11 + 83 + -4 + -(arg0.field3193 / 2));
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)Lme;")
    public static final class85 method1093(int arg0, int arg1) {
        field3339++;
        if (arg0 != 256) {
            method1093(100, -28);
        }
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class36.field795[var2] == null || class36.field795[var2][var3] == null) {
            boolean var4 = class125.method936(var2, (byte) 72);
            if (!var4) {
                return null;
            }
        }
        return class36.field795[var2][var3];
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
    public static void method1094(int arg0) {
        field3350 = null;
        field3353 = null;
        field3338 = null;
        field3343 = null;
        field3345 = null;
        field3341 = null;
        field3356 = null;
        field3347 = null;
        field3344 = null;
        field3348 = null;
        field3349 = null;
        if (arg0 == 98) {
            field3342 = null;
        }
    }
}
