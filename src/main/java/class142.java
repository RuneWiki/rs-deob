import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class142 implements Runnable {

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "[Lci;")
    public volatile class234[] field2594 = new class234[2];

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "Z")
    public volatile boolean field2604 = false;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "Z")
    public volatile boolean field2605 = false;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "Loh;")
    public static class263 field2593 = class253.method1681(-118, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "Loh;")
    private static class263 field2606 = class253.method1681(-123, "Starting 3d Library");

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "[I")
    public static int[] field2600 = new int[256];

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
    public static int field2608 = -1;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "Loh;")
    public static class263 field2595 = field2606;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "Loh;")
    public static class263 field2610 = class253.method1681(-123, "showVideoAd");

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "Lqf;")
    public static class235 field2607;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "Ltj;")
    public class262 field2592;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "Lue;")
    public static class86 field2609;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "[S")
    public static short[] field2598;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZI[BIII[Lpg;)V")
    public static final void method938(int arg0, boolean arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, class73[] arg7) {
        if (arg6 > -3) {
            method941(true, (class137) null);
        }
        field2602++;
        if (!arg1) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if (arg5 + var9 > 0 && arg5 + var9 < 103 && arg0 + var10 > 0 && (arg0 + var10) < 103) {
                            arg7[var8].field1527[arg5 + var9][arg0 + var10] = class263.method1777(arg7[var8].field1527[arg5 + var9][arg0 + var10], -16777217);
                        }
                    }
                }
            }
        }
        byte var11;
        if (arg1) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        class194 var12 = new class194(arg3);
        for (int var13 = 0; var13 < var11; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class78.method534(var12, var13, arg2, arg5 + var14, true, 0, arg4, arg0 + var15, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIZ)V")
    public static final void method939(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg3 >= class51.field1099 && arg3 <= class198.field3587) {
            int var5 = class98.method672(-257, class276.field4831, arg1, class11.field249);
            int var6 = class98.method672(-257, class276.field4831, arg2, class11.field249);
            class168.method1117((byte) -83, var5, var6, arg3, arg0);
        }
        field2597++;
        if (arg4) {
            method940(-36);
        }
    }

    @OriginalMember(owner = "client!kj", name = "run", descriptor = "()V")
    public final void run() {
        field2599++;
        this.field2605 = true;
        try {
            while (!this.field2604) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class234 var2 = this.field2594[var1];
                    if (var2 != null) {
                        var2.method1578(97);
                    }
                }
                class215.method1457(10L, (byte) 111);
                class12.method92((Object) null, (byte) -121, this.field2592);
            }
        } catch (Exception var9) {
            class137.method899(var9, (String) null, 46);
        } finally {
            Object var6 = null;
            this.field2605 = false;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    public static void method940(int arg0) {
        if (arg0 > -95) {
            return;
        }
        field2609 = null;
        field2607 = null;
        field2598 = null;
        field2593 = null;
        field2610 = null;
        field2595 = null;
        field2600 = null;
        field2606 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZLdg;)V")
    public static final void method941(boolean arg0, class137 arg1) {
        class255 var2 = (class255) class232.field4057.method31(-32665, arg1.field2508.method1755(1));
        if (arg0) {
            return;
        }
        field2601++;
        if (var2 == null) {
            class128.method835((class90) null, arg1.field4714[0], (class12) null, arg1, arg1.field4713[0], class12.field321, 0, -64);
        } else {
            var2.method1693(79);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIII)V")
    public static final void method942(int arg0, int arg1, int arg2, int arg3) {
        field2603++;
        if (arg3 != 64) {
            method940(-94);
        }
        class64 var4 = class84.method563(9, arg1, -118);
        var4.method396(true);
        var4.field1281 = arg0;
        var4.field1290 = arg2;
    }
}
