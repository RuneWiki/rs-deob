import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class70 {

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public int field986 = -1;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field979 = 0;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field977 = 127;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "Lqj;")
    private static class196 field990 = class80.method502("flash1:", -48);

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "Lqj;")
    public static class196 field992 = field990;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public static int field989 = 0;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "Lqj;")
    public static class196 field995 = field990;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "Lqj;")
    private static class196 field985 = class80.method502("Location", -48);

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "Lqj;")
    public static class196 field978 = field985;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "Ls;")
    public static class227 field980 = new class227(64);

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "Lqj;")
    private static class196 field998 = class80.method502("Members object", -48);

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "Lqj;")
    public static class196 field999 = field998;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public int field976;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public int field982;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public int field983;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public int field984;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public int field987;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
    public int field991;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    public int field993;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
    public int field994;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "[Lub;")
    public static class43[] field997;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method449(int arg0, int arg1, int arg2, long arg3) {
        class61 var5 = class249.field4410[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field829 != null && var5.field829.field3978 == arg3) {
            return true;
        } else if (var5.field830 != null && var5.field830.field73 == arg3) {
            return true;
        } else if (var5.field818 != null && var5.field818.field1671 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field836; var6++) {
                if (var5.field823[var6].field3554 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZI)V")
    public static final void method450(boolean arg0, int arg1) {
        field988++;
        byte[][] var2 = class214.field3825;
        if (arg1 < 123) {
            field979 = 13;
        }
        int var3 = class135.field1944.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class181.field3191[var4] & 0xFF) * 64 - class178.field3011;
                int var7 = (class181.field3191[var4] >> 8) * 64 - class106.field1523;
                class181.method1187((byte) 113);
                class21.method123(var6, class188.field3298, -7196, arg0, var7, var5);
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)Z")
    public static final boolean method451(int arg0) {
        if (arg0 != 0) {
            return true;
        }
        field981++;
        try {
            return class240.method1637(-68);
        } catch (IOException var4) {
            class195.method1285(40);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class195.field3432 + "," + field979 + "," + class133.field1900 + " - " + class76.field1096 + "," + (class102.field1477.field2102[0] + class106.field1523) + "," + (class102.field1477.field2046[0] + class178.field3011) + " - ";
            for (int var3 = 0; var3 < class76.field1096 && var3 < 50; var3++) {
                var2 = var2 + class229.field4077.field693[var3] + ",";
            }
            class165.method1054(35, var2, var5);
            class144.method895(0);
            return true;
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
    public static void method452(int arg0) {
        field978 = null;
        if (arg0 != -3628) {
            return;
        }
        field992 = null;
        field995 = null;
        field990 = null;
        field985 = null;
        field997 = null;
        field998 = null;
        field999 = null;
        field980 = null;
    }
}
