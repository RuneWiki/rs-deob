import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class205 {

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Lcd;")
    private static class64 field3503 = class44.method335((byte) 71, "glow1:");

    @OriginalMember(owner = "client!i", name = "c", descriptor = "J")
    public static long field3505 = 0L;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "Lcd;")
    public static class64 field3504 = field3503;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "Lcd;")
    public static class64 field3508 = class44.method335((byte) 71, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!i", name = "h", descriptor = "Lcd;")
    public static class64 field3510 = field3503;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "Ldh;")
    public static class159 field3506;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II[Lcd;I)Lcd;", line = 38)
    public static final class64 method1431(int arg0, int arg1, class64[] arg2, int arg3) {
        field3509++;
        int var4 = 0;
        if (arg3 != -8897) {
            return (class64) null;
        }
        for (int var5 = 0; var5 < arg0; var5++) {
            if (arg2[arg1 + var5] == null) {
                arg2[arg1 + var5] = class94.field1740;
            }
            var4 += arg2[arg1 + var5].field1274;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg0; var8++) {
            class64 var9 = arg2[arg1 + var8];
            class95.method721(var9.field1252, 0, var6, var7, var9.field1274);
            var7 += var9.field1274;
        }
        class64 var10 = new class64();
        var10.field1252 = var6;
        var10.field1274 = var4;
        return var10;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lkh;I)Loi;", line = 93)
    public static final class306 method1432(class13 arg0, int arg1) {
        field3507++;
        class306 var2 = new class306(arg0.method104((byte) -104), arg0.method104((byte) 19), arg0.method112((byte) 92), arg0.method112((byte) 92), arg0.method105((byte) 90), arg0.method152((byte) -73) == 1);
        int var3 = arg0.method152((byte) -70);
        int var4 = 0;
        int var5 = -92 / ((-arg1 - 3) / 45);
        while (var3 > var4) {
            var2.field5217.method781(new class202(arg0.method112((byte) 92), arg0.method112((byte) 92), arg0.method112((byte) 92), arg0.method112((byte) 92)), 10751);
            var4++;
        }
        var2.method2135(-10900);
        return var2;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V", line = 128)
    public static void method1433(int arg0) {
        field3504 = null;
        field3508 = null;
        if (arg0 == 0) {
            field3506 = null;
            field3503 = null;
            field3510 = null;
        }
    }
}
