import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class72 extends class25 {

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public int field1388;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
    private int field1393;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "[[I")
    public int[][] field1395;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "[I")
    public int[] field1384;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "[Z")
    public boolean[] field1391;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public static int field1387 = 0;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "Lcd;")
    public static class64 field1390 = class44.method335((byte) 71, "<col=ffffff>");

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "Lcd;")
    public static class64 field1394 = class44.method335((byte) 71, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "[I")
    public static int[] field1397 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "[B")
    public static byte[] field1400 = new byte[520];

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "[[I")
    public static int[][] field1399 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "[I")
    public static int[] field1389;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)I", line = 4)
    public static final int method589(int arg0) {
        if (arg0 == 6) {
            field1385++;
            return 6;
        } else {
            return 11;
        }
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)V", line = 17)
    public static void method590(int arg0) {
        field1397 = null;
        if (arg0 != 0) {
            method591(false);
        }
        field1394 = null;
        field1390 = null;
        field1399 = (int[][]) null;
        field1389 = null;
        field1400 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)I", line = 40)
    public static final int method591(boolean arg0) {
        if (arg0) {
            field1394 = (class64) null;
        }
        field1386++;
        return 2;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIILja;I)V", line = 56)
    public static final void method592(int arg0, int arg1, int arg2, class60 arg3, int arg4) {
        field1392++;
        if (arg1 != 16375) {
            return;
        }
        if (class123.field2216) {
            class21.method209(arg2, arg0, arg3.field1163 + arg2, arg0 - -arg3.field1016);
        }
        if (class11.field227 >= 3) {
            if (class123.field2216) {
                class40 var5 = arg3.method463(false, 255);
                if (var5 != null) {
                    var5.method306(arg2, arg0);
                }
            } else {
                class210.method1472(arg2, arg0, 0, arg3.field1079, arg3.field1019);
            }
        } else if (class123.field2216) {
            ((class136) class27.field436).method971(arg2, arg0, arg3.field1163, arg3.field1016, class27.field436.field627 / 2, class27.field436.field629 / 2, class241.field4157, 256, (class136) arg3.method463(false, arg1 - 16120));
        } else {
            ((class127) class27.field436).method922(arg2, arg0, arg3.field1163, arg3.field1016, class27.field436.field627 / 2, class27.field436.field629 / 2, class241.field4157, 256, arg3.field1079, arg3.field1019);
        }
        class267.field4582[arg4] = true;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(I[B)V", line = 111)
    public class72(int arg0, byte[] arg1) {
        this.field1388 = arg0;
        class13 var3 = new class13(arg1);
        this.field1393 = var3.method152((byte) -71);
        this.field1395 = new int[this.field1393][];
        this.field1384 = new int[this.field1393];
        this.field1391 = new boolean[this.field1393];
        for (int var4 = 0; var4 < this.field1393; var4++) {
            this.field1384[var4] = var3.method152((byte) -91);
        }
        for (int var5 = 0; var5 < this.field1393; var5++) {
            this.field1391[var5] = var3.method152((byte) -118) == 1;
        }
        for (int var6 = 0; var6 < this.field1393; var6++) {
            this.field1395[var6] = new int[var3.method152((byte) -92)];
        }
        for (int var7 = 0; var7 < this.field1393; var7++) {
            for (int var8 = 0; var8 < this.field1395[var7].length; var8++) {
                this.field1395[var7][var8] = var3.method152((byte) -70);
            }
        }
    }
}
