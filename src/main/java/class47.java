import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public abstract class class47 extends class115 {

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    public static int field1044 = 0;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
    public static int field1052 = 0;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "Lvc;")
    private static class137 field1049 = class45.method325("Starting game engine)3)3)3", -46);

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "Lvc;")
    public static class137 field1047 = field1049;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "[Z")
    public static boolean[] field1053 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "Lvc;")
    public static class137 field1051 = class45.method325("Lade Spiel)2Fenster )2 ", -46);

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
    public static int field1055 = 0;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "Lcd;")
    public static class19 field1050;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "[I")
    public static int[] field1045;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "[I")
    public static int[] field1054;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(JBI)V")
    public final void method337(long arg0, byte arg1, int arg2) {
        class11.field244 = arg2;
        int var5 = 0;
        if (arg1 >= -41) {
            return;
        }
        while (var5 < 16) {
            class4.field49[var5] = 12800;
            var5++;
        }
        field1043++;
        for (int var6 = 0; var6 < 16; var6++) {
            int var7 = method338(var6);
            this.method155(var6 + 176, 7, var7 >> 7, arg0);
            this.method155(var6 + 176, 39, var7 & 0x7F, arg0);
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)I")
    private static final int method338(int arg0) {
        int var1 = class4.field49[arg0];
        int var2 = (class11.field244 * var1 >> 8) * var1;
        return (int) (Math.sqrt((double) var2) + 0.5D);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZJ)V")
    public final void method339(boolean arg0, long arg1) {
        for (int var4 = 0; var4 < 128; var4++) {
            int var11 = class91.field2143[var4];
            class91.field2143[var4] = 0;
            for (int var12 = 0; var12 < 16; var12++) {
                if ((0x1 << var12 & var11) != 0) {
                    this.method155(var12 + 144, var4, 0, arg1);
                }
            }
        }
        field1042++;
        for (int var5 = 0; var5 < 16; var5++) {
            this.method155(var5 + 176, 123, 0, arg1);
        }
        int var6 = 0;
        if (!arg0) {
            return;
        }
        while (var6 < 16) {
            this.method155(var6 + 176, 120, 0, arg1);
            var6++;
        }
        for (int var7 = 0; var7 < 16; var7++) {
            this.method155(var7 + 176, 121, 0, arg1);
        }
        for (int var8 = 0; var8 < 16; var8++) {
            this.method155(var8 + 176, 0, 0, arg1);
        }
        for (int var9 = 0; var9 < 16; var9++) {
            this.method155(var9 + 176, 32, 0, arg1);
        }
        for (int var10 = 0; var10 < 16; var10++) {
            this.method155(var10 + 192, 0, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIJI)V")
    public final void method340(int arg0, int arg1, long arg2, int arg3) {
        if (arg3 != 39) {
            method338(-90);
        }
        int var6 = (int) (Math.pow(0.1D, (double) arg1 * 5.0E-4D) * (double) arg0 + 0.5D);
        field1046++;
        if (class11.field244 == var6) {
            return;
        }
        class11.field244 = var6;
        for (int var7 = 0; var7 < 16; var7++) {
            int var8 = method338(var7);
            this.method155(var7 + 176, 7, var8 >> 7, arg2);
            this.method155(var7 + 176, 39, var8 & 0x7F, arg2);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIJ)Z")
    public final boolean method341(int arg0, int arg1, int arg2, long arg3) {
        if ((arg0 & 0xE0) == 128) {
            int var6 = 0x1 << (arg0 & 0xF);
            int var7 = class91.field2143[arg1];
            if (arg0 < 144 || arg2 == 0) {
                class91.field2143[arg1] = var7 & ~var6;
            } else if ((var7 & var6) == 0) {
                class91.field2143[arg1] = var7 | var6;
            } else {
                this.method155(arg0, arg1, 0, arg3);
            }
            return false;
        }
        if ((arg0 & 0xF0) == 176) {
            if (arg1 == 121) {
                this.method155(arg0, arg1, arg2, arg3);
                int var8 = arg0 & 0xF;
                class4.field49[var8] = 12800;
                int var9 = method338(var8);
                this.method155(arg0, 7, var9 >> 7, arg3);
                this.method155(arg0, 39, var9 & 0x7F, arg3);
                return true;
            }
            if (arg1 == 7 || arg1 == 39) {
                int var10 = arg0 & 0xF;
                if (arg1 == 7) {
                    class4.field49[var10] = (arg2 << 7) + (class4.field49[var10] & 0x7F);
                } else {
                    class4.field49[var10] = (class4.field49[var10] & 0x3F80) + arg2;
                }
                int var11 = method338(var10);
                this.method155(arg0, 7, var11 >> 7, arg3);
                this.method155(arg0, 39, var11 & 0x7F, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V")
    public static final void method342(byte arg0) {
        field1048++;
        if (class59.field1270 < 2 && class98.field2288 == 0 && !class39.field865) {
            return;
        }
        class137 var1;
        if (class98.field2288 == 1 && class59.field1270 < 2) {
            var1 = class88.method666(-40, new class137[] { class37.field825, class108.field2504, class111.field2644, class102.field2359 });
        } else if (class39.field865 && class59.field1270 < 2) {
            var1 = class88.method666(125, new class137[] { class99.field2302, class108.field2504, class13.field281, class102.field2359 });
        } else {
            var1 = class29.field646[class59.field1270 - 1];
        }
        if (class59.field1270 > 2) {
            var1 = class88.method666(126, new class137[] { var1, class91.field2161, class61.method435(class59.field1270 - 2, 69), class82.field1845 });
        }
        class42.field925.method1143(var1, 4, 15, 16777215, true, class112.field2667 / 1000);
        if (arg0 >= -39) {
            field1049 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(B)V")
    public static void method343(byte arg0) {
        field1049 = null;
        field1054 = null;
        field1045 = null;
        field1051 = null;
        field1047 = null;
        field1053 = null;
        if (arg0 == 114) {
            field1050 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(IIIJ)V")
    public abstract void method155(int arg0, int arg1, int arg2, long arg3);
}
