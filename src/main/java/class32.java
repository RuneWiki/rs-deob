import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!r")
public class class32 {

    @OriginalMember(owner = "mapview!r", name = "d", descriptor = "Ld;")
    public static class7 field463 = class37.method242("sprites", 1333943984);

    @OriginalMember(owner = "mapview!r", name = "g", descriptor = "Ld;")
    public static class7 field466 = class37.method242("Mini)2Game", 1333943984);

    @OriginalMember(owner = "mapview!r", name = "c", descriptor = "J")
    public static volatile long field462 = 0L;

    @OriginalMember(owner = "mapview!r", name = "k", descriptor = "Ld;")
    public static class7 field470 = class37.method242("mapfunction", 1333943984);

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "Ld;")
    public static class7 field460 = class37.method242("uitext has incorrect number of strings", 1333943984);

    @OriginalMember(owner = "mapview!r", name = "j", descriptor = "B")
    public byte field469;

    @OriginalMember(owner = "mapview!r", name = "f", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "[B")
    public byte[] field461;

    @OriginalMember(owner = "mapview!r", name = "h", descriptor = "[I")
    public static int[] field467;

    @OriginalMember(owner = "mapview!r", name = "e", descriptor = "[Lla;")
    public static class23[] field464;

    @OriginalMember(owner = "mapview!r", name = "i", descriptor = "[[[I")
    public static int[][][] field468;

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(I)V", line = 13)
    public static void method221(int arg0) {
        field467 = null;
        if (arg0 != -4097) {
            field470 = null;
        }
        field464 = null;
        field463 = null;
        field468 = null;
        field466 = null;
        field460 = null;
        field470 = null;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(Z)V", line = 42)
    public static final void method222(boolean arg0) {
        if (arg0) {
            method226(null, false);
        }
        if (++class34.field485 >= 64) {
            class16.field158++;
            class34.field485 = 0;
            if (class16.field158 < class1.field4 >> 6) {
                class30.method215(-10399);
            }
        }
        class16.field166 = (class34.field485 << 6) + field465;
    }

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "(I)V", line = 66)
    public final void method223(int arg0) {
        boolean var2 = true;
        if (arg0 != 2544) {
            field464 = null;
        }
        if (this.field461 == null) {
            return;
        }
        this.field469 = this.field461[0];
        for (int var3 = 0; var3 < 4096; var3++) {
            if (this.field461[var3] != this.field469) {
                var2 = false;
                break;
            }
        }
        if (var2) {
            this.field461 = null;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(II)I", line = 115)
    public static final int method224(int arg0, int arg1) {
        if (arg0 > -15) {
            return 10;
        } else {
            if (arg1 >= 65 && arg1 <= 90) {
                arg1 += 32;
            }
            return arg1;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "([BB)V", line = 130)
    public static final void method225(byte[] arg0, byte arg1) {
        class37 var2 = new class37(arg0);
        var2.field509 = arg0.length - 2;
        class36.field502 = var2.method243((byte) -117);
        class7.field81 = new int[class36.field502];
        field467 = new int[class36.field502];
        class14.field139 = new int[class36.field502];
        class11.field117 = new int[class36.field502];
        class4.field56 = new byte[class36.field502][];
        var2.field509 = arg0.length - class36.field502 * 8 - 7;
        class2.field9 = var2.method243((byte) -117);
        class3.field27 = var2.method243((byte) -126);
        int var3 = (var2.method237(-111) & 0xFF) + 1;
        for (int var4 = 0; var4 < class36.field502; var4++) {
            class11.field117[var4] = var2.method243((byte) -124);
        }
        for (int var5 = 0; var5 < class36.field502; var5++) {
            class7.field81[var5] = var2.method243((byte) -122);
        }
        if (arg1 >= -29) {
            method224(-7, 90);
        }
        for (int var6 = 0; var6 < class36.field502; var6++) {
            field467[var6] = var2.method243((byte) -125);
        }
        for (int var7 = 0; var7 < class36.field502; var7++) {
            class14.field139[var7] = var2.method243((byte) -125);
        }
        var2.field509 = arg0.length - class36.field502 * 8 - (var3 - 1) * 3 - 7;
        class25.field242 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class25.field242[var8] = var2.method240(12103);
            if (class25.field242[var8] == 0) {
                class25.field242[var8] = 1;
            }
        }
        var2.field509 = 0;
        for (int var9 = 0; var9 < class36.field502; var9++) {
            int var10 = field467[var9];
            int var11 = class14.field139[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class4.field56[var9] = var13;
            int var14 = var2.method237(-114);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method245(false);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var10; var16++) {
                    for (int var17 = 0; var17 < var11; var17++) {
                        var13[var16 + var10 * var17] = var2.method245(false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "([Ld;Z)V", line = 257)
    public static final void method226(class7[] arg0, boolean arg1) {
        class14.method107(arg0, 0, arg0.length, (byte) 28);
        if (!arg1) {
            method226(null, false);
        }
    }
}
