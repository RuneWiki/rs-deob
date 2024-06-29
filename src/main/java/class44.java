import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class44 {

    @OriginalMember(owner = "client!m", name = "d", descriptor = "Lcd;")
    public static class64 field717 = method335((byte) 71, "Verbindung zum Update)2Server hergestellt)3");

    @OriginalMember(owner = "client!m", name = "e", descriptor = "Lcd;")
    public static class64 field718 = method335((byte) 71, ":assistreq:");

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field719 = 0;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field714 = -1;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "Lcd;")
    public static class64 field722 = method335((byte) 71, ")1u1)1m");

    @OriginalMember(owner = "client!m", name = "c", descriptor = "Lcd;")
    public static class64 field716 = method335((byte) 71, "k");

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field720 = 0;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "Lcd;")
    public static class64 field724 = method335((byte) 71, "T");

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BLjava/lang/String;)Lcd;", line = 15)
    public static final class64 method335(byte arg0, String arg1) {
        field721++;
        byte[] var2 = arg1.getBytes();
        int var3 = 0;
        int var4 = var2.length;
        class64 var5 = new class64();
        if (arg0 != 71) {
            field717 = (class64) null;
        }
        var5.field1252 = new byte[var4];
        while (var3 < var4) {
            int var6 = var2[var3++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var4 <= var3) {
                    break;
                }
                int var7 = var2[var3++] & 0xFF;
                var5.field1252[var5.field1274++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var5.field1252[var5.field1274++] = (byte) var6;
            }
        }
        var5.method497(arg0 - 71);
        return var5.method535(false);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lfk;I)I", line = 61)
    public static final int method336(class41 arg0, int arg1) {
        field725++;
        int var2 = -86 % ((arg1 + 15) / 44);
        int var3 = arg0.field658;
        if (arg0.field1901 == arg0.field1896) {
            var3 = arg0.field676;
        } else if (arg0.field1896 == arg0.field1883) {
            var3 = arg0.field641;
        }
        return var3;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIBII)V", line = 80)
    public static final void method337(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field726++;
        for (class246 var5 = (class246) class93.field1733.method778(arg2 ^ 0x73); var5 != null; var5 = (class246) class93.field1733.method775(arg2 ^ 0x67E6)) {
            class301.method2102(arg4, var5, arg1, 2, arg3, arg0);
        }
        for (class246 var6 = (class246) class115.field2115.method778(0); var6 != null; var6 = (class246) class115.field2115.method775(arg2 ^ 0x67E6)) {
            byte var7 = 1;
            if (var6.field4289.field1901 == var6.field4289.field1896) {
                var7 = 0;
            } else if (var6.field4289.field1896 == var6.field4289.field1883) {
                var7 = 2;
            }
            if (var6.field4274 != var7) {
                int var8 = class196.method1378(var6.field4289, 128);
                if (var6.field4294 != var8) {
                    if (var6.field4283 != null) {
                        class250.field4341.method1419(var6.field4283);
                        var6.field4283 = null;
                    }
                    var6.field4294 = var8;
                }
                var6.field4274 = var7;
            }
            var6.field4285 = var6.field4289.field1859;
            var6.field4268 = var6.field4289.field1859 + var6.field4289.method325(-12808) * 64;
            var6.field4266 = var6.field4289.field1865;
            var6.field4267 = var6.field4289.field1865 + var6.field4289.method325(-12808) * 64;
            class301.method2102(arg4, var6, arg1, 2, arg3, arg0);
        }
        for (class246 var9 = (class246) class17.field336.method1143(arg2 ^ 0x73); var9 != null; var9 = (class246) class17.field336.method1147((byte) 18)) {
            byte var10 = 1;
            if (var9.field4284.field1901 == var9.field4284.field1896) {
                var10 = 0;
            } else if (var9.field4284.field1896 == var9.field4284.field1883) {
                var10 = 2;
            }
            if (var9.field4274 != var10) {
                int var11 = method336(var9.field4284, arg2 - 216);
                if (var9.field4294 != var11) {
                    if (var9.field4283 != null) {
                        class250.field4341.method1419(var9.field4283);
                        var9.field4283 = null;
                    }
                    var9.field4294 = var11;
                }
                var9.field4274 = var10;
            }
            var9.field4285 = var9.field4284.field1859;
            var9.field4268 = var9.field4284.field1859 + var9.field4284.method325(arg2 - 12923) * 64;
            var9.field4266 = var9.field4284.field1865;
            var9.field4267 = var9.field4284.field1865 + (var9.field4284.method325(arg2 - 12923) * 64);
            class301.method2102(arg4, var9, arg1, arg2 ^ 0x71, arg3, arg0);
        }
        if (arg2 != 115) {
            field720 = -84;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 207)
    public static final void method338(int arg0) {
        class233.field3944.method1187(0);
        class56.field947.method1187(0);
        if (arg0 < -123) {
            field715++;
            class280.field4824.method1187(0);
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V", line = 234)
    public static void method339(int arg0) {
        field718 = null;
        field717 = null;
        field722 = null;
        field724 = null;
        if (arg0 != 255) {
            field724 = (class64) null;
        }
        field716 = null;
    }
}
