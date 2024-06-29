import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class32 {

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Ljn;")
    public static class409 field438 = new class409("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

    @OriginalMember(owner = "client!he", name = "f", descriptor = "[I")
    public static int[] field442 = new int[32];

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field443 = 0;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Lbn;")
    public static class160 field445;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "Lvq;")
    public static class24 field446;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "[S")
    public static short[] field448;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "[I")
    public static int[] field449;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field442[var1] = var0 - 1;
            var0 += var0;
        }
        field445 = new class160(56, 4);
        field446 = new class24(45, -2);
        field448 = new short[] { -10304, 9104, -1, -1, -1 };
        field447 = 0;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)V", line = 3)
    public static final void method309(int arg0, int arg1, int arg2) {
        if (arg1 != 9104) {
            method312(-26L, -63);
        }
        field441++;
        class125 var3 = class56.method428(arg0, 6, -3636);
        var3.method846(26848);
        var3.field1657 = arg2;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V", line = 24)
    public static void method310(byte arg0) {
        field448 = null;
        field442 = null;
        field446 = null;
        field449 = null;
        field438 = null;
        field445 = null;
        int var1 = 123 % ((arg0 - 14) / 60);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIII)I", line = 43)
    public static final int method311(int arg0, int arg1, int arg2, int arg3) {
        field440++;
        if (arg1 == arg2) {
            return arg1;
        }
        if (arg3 != 21013) {
            field444 = -55;
        }
        int var4 = 128 - arg0;
        int var5 = (arg1 & 0x7F) * var4 + (arg2 & 0x7F) * arg0 >> 7;
        int var6 = (arg1 & 0x380) * var4 + (arg2 & 0x380) * arg0 >> 7;
        int var7 = (arg1 & 0xFC00) * var4 + (arg2 & 0xFC00) * arg0 >> 7;
        return var6 & 0x380 | var7 & 0xFC00 | var5 & 0x7F;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(JI)V", line = 75)
    public static final void method312(long arg0, int arg1) {
        field437++;
        int var3 = class152.field2056;
        if (class108.field1463 != var3) {
            int var4 = var3 - class108.field1463;
            int var5 = (int) ((long) var4 * arg0 / 320L);
            if (var4 > 0) {
                if (var5 == 0) {
                    var5 = 1;
                } else if (var4 < var5) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = -1;
            } else if (var4 > var5) {
                var5 = var4;
            }
            class108.field1463 += var5;
        }
        int var6 = class188.field2629;
        if (!class400.field5790) {
            class170.field2220 += (float) arg0 * class299.field4361 / 40.0F * 8.0F;
            class1.field19 += (float) arg0 * class164.field2166 / 40.0F * 8.0F;
        }
        if (class171.field2236 != var6) {
            int var7 = var6 - class171.field2236;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class171.field2236 += var8;
        }
        class129.method862(true);
        if (arg1 < 72) {
            method309(-60, -46, -79);
        }
    }
}
