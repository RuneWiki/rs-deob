import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class28 {

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "Lia;")
    public static class257 field533 = method234(-80, " <col=00ff80>");

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "Lk;")
    public static class152 field532 = new class152(new byte[5000]);

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "[I")
    public static int[] field538 = new int[32];

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "Lia;")
    private static class257 field540 = method234(83, "Loaded wordpack");

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "Lia;")
    public static class257 field541 = field540;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "Lsf;")
    public static class33 field543;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "Lmb;")
    public static class178 field542;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "[[Lme;")
    public static class44[][] field539;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILjava/lang/String;)Lia;")
    public static final class257 method234(int arg0, String arg1) {
        byte[] var2 = arg1.getBytes();
        int var3 = 0;
        int var4 = var2.length;
        class257 var5 = new class257();
        var5.field4407 = new byte[var4];
        field531++;
        while (var3 < var4) {
            int var6 = var2[var3++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 >= var4) {
                    break;
                }
                int var7 = var2[var3++] & 0xFF;
                var5.field4407[var5.field4447++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var5.field4407[var5.field4447++] = (byte) var6;
            }
        }
        var5.method1714((byte) 83);
        int var8 = 31 / ((32 - arg0) / 39);
        return var5.method1671(20216);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static void method235(int arg0) {
        field540 = null;
        if (arg0 != -10110) {
            field540 = null;
        }
        field538 = null;
        field542 = null;
        field539 = null;
        field533 = null;
        field541 = null;
        field543 = null;
        field532 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIBI)V")
    public static final void method236(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field536++;
        class260 var5 = (class260) class174.field2965.method434((byte) -93, (long) arg0);
        if (var5 == null) {
            var5 = new class260();
            class174.field2965.method424(var5, (byte) -40, (long) arg0);
        }
        if (arg2 >= var5.field4512.length) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field4512.length; var8++) {
                var6[var8] = var5.field4512[var8];
                var7[var8] = var5.field4518[var8];
            }
            for (int var9 = var5.field4512.length; var9 < arg2; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field4512 = var6;
            var5.field4518 = var7;
        }
        var5.field4512[arg2] = arg1;
        var5.field4518[arg2] = arg4;
        if (arg3 != 18) {
            method236(42, -37, 116, (byte) -32, 100);
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
    public static final void method237(int arg0) {
        if (arg0 != -2049) {
            method235(18);
        }
        if (class152.field2635 != null) {
            class17 var1 = class152.field2635;
            synchronized (class152.field2635) {
                class152.field2635 = null;
            }
        }
        field534++;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field538[var1] = var0 - 1;
            var0 += var0;
        }
        field543 = new class33();
    }
}
