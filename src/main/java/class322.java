import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class322 extends class287 {

    @OriginalMember(owner = "client!ip", name = "t", descriptor = "Lnr;")
    public class110 field4419;

    @OriginalMember(owner = "client!ip", name = "u", descriptor = "Lrb;")
    public static class283 field4420;

    @OriginalMember(owner = "client!ip", name = "v", descriptor = "Lhi;")
    public static class45 field4421;

    @OriginalMember(owner = "client!ip", name = "w", descriptor = "Lkc;")
    public static class157 field4422;

    @OriginalMember(owner = "client!ip", name = "z", descriptor = "[I")
    public static int[] field4425;

    @OriginalMember(owner = "client!ip", name = "y", descriptor = "Z")
    public static boolean field4424;

    @OriginalMember(owner = "client!ip", name = "A", descriptor = "Lrb;")
    public static class283 field4426;

    @OriginalMember(owner = "client!ip", name = "q", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!ip", name = "r", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!ip", name = "s", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!ip", name = "x", descriptor = "I")
    public static int field4423;

    static {
        new class157(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
        field4420 = new class283(92, 6);
        field4421 = new class45(51, 4);
        field4422 = new class157("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");
        field4425 = new int[] { 1, 2, 4, 8 };
        field4424 = false;
        new class157("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
        field4426 = null;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IILjava/util/Random;)I", line = 5)
    public static final int method1908(int arg0, int arg1, Random arg2) {
        field4416++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class113.method855(arg0, (byte) -103)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
        } else if (arg1 >= -125) {
            return -78;
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            return class91.method745(var4, (byte) 103, arg0);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILnf;)V", line = 35)
    public static final void method1909(int arg0, class28 arg1) {
        field4418++;
        arg1.method191((byte) 36);
        int var2 = class484.field6972;
        class487 var3 = class81.field1158 = class45.field642[var2] = new class487();
        var3.field179 = var2;
        int var4 = arg1.method194(30, arg0 - 34221);
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 0x3FFF;
        int var7 = var4 & 0x3FFF;
        var3.field263[0] = var6 - class110.field1775;
        var3.field6284 = (var3.field263[0] << 7) + (var3.method116(8569) << 6);
        var3.field257[0] = var7 - class399.field5727;
        var3.field6287 = (var3.field257[0] << 7) + (var3.method116(8569) << 6);
        class366.field5260 = var3.field6279 = var5;
        if (class161.field2438[var2] != null) {
            var3.method2892((byte) 53, class161.field2438[var2]);
        }
        class210.field3001 = 0;
        class169.field2570[class210.field3001++] = var2;
        class276.field3759[var2] = 0;
        class398.field5714 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg1.method194(18, -15886);
                int var10 = var9 >> 16;
                int var11 = (var9 & 0xFFFA) >> 8;
                int var12 = var9 & 0xFF;
                class137 var13 = class312.field4240[var8] = new class137();
                var13.field2072 = -1;
                var13.field2068 = 0;
                var13.field2070 = (var10 << 28) + var12 + (var11 << 14);
                var13.field2066 = false;
                class356.field5140[class398.field5714++] = var8;
                class276.field3759[var8] = 0;
            }
        }
        if (arg0 != 18335) {
            field4420 = null;
        }
        arg1.method196(30365);
    }

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "(I)V", line = 106)
    public static void method1910(int arg0) {
        field4422 = null;
        field4426 = null;
        field4420 = null;
        field4421 = null;
        if (arg0 != 51) {
            field4423 = 117;
        }
        field4425 = null;
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lnr;)V", line = 132)
    public class322(class110 arg0) {
        this.field4419 = arg0;
    }
}
