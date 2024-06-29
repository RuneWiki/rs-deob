import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class93 extends class107 {

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public int field1533 = 0;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "Z")
    public static boolean field1532 = false;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "[I")
    public static int[] field1538 = new int[1000];

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "[Z")
    public static boolean[] field1547 = new boolean[100];

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
    public int field1534;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
    public int field1536;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "I")
    public int field1539;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "I")
    public int field1543;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "I")
    public int field1548;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "I")
    public int field1549;

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
    public int field1550;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "I")
    public int field1553;

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "I")
    public int field1555;

    @OriginalMember(owner = "client!oa", name = "V", descriptor = "I")
    public int field1558;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "Lfi;")
    public class103 field1541;

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "Lm;")
    public class108 field1554;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "Lti;")
    public static class5 field1546;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "Lnc;")
    public class81 field1537;

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "Lnc;")
    public class81 field1552;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "Ljd;")
    public class83 field1542;

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "Z")
    public boolean field1556;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "[I")
    public int[] field1545;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "[Lcg;")
    public static class156[] field1551;

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "[Ljg;")
    public static class158[] field1557;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)V")
    public final void method701(byte arg0) {
        int var2 = this.field1534;
        if (this.field1554 != null) {
            class108 var5 = this.field1554.method784((byte) 102);
            if (var5 == null) {
                this.field1534 = -1;
                this.field1549 = 0;
                this.field1545 = null;
                this.field1550 = 0;
                this.field1548 = 0;
            } else {
                this.field1549 = var5.field1825;
                this.field1550 = var5.field1775;
                this.field1545 = var5.field1787;
                this.field1534 = var5.field1845;
                this.field1548 = var5.field1794 * 128;
            }
        } else if (this.field1542 != null) {
            int var3 = class180.method1283(this.field1542, (byte) -79);
            if (var2 != var3) {
                this.field1534 = var3;
                class11 var4 = this.field1542.field1392;
                if (var4.field120 != null) {
                    var4 = var4.method60((byte) 45);
                }
                if (var4 == null) {
                    this.field1548 = 0;
                } else {
                    this.field1548 = var4.field170 * 128;
                }
            }
        } else if (this.field1541 != null) {
            this.field1534 = class76.method546(this.field1541, 49);
            this.field1548 = this.field1541.field1716 * 128;
        }
        field1544++;
        if (this.field1534 != var2 && this.field1552 != null) {
            class166.field2709.method488(this.field1552);
            this.field1552 = null;
        }
        if (arg0 != 89) {
            this.field1556 = true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([BIII)Z")
    public static final boolean method702(byte[] arg0, int arg1, int arg2, int arg3) {
        int var4 = -102 % ((-arg1 - 14) / 58);
        field1540++;
        boolean var5 = true;
        class121 var6 = new class121(arg0);
        int var7 = -1;
        label70: while (true) {
            int var8 = var6.method907(-27);
            if (var8 == 0) {
                return var5;
            }
            var7 += var8;
            int var9 = 0;
            boolean var10 = false;
            while (true) {
                int var13;
                class108 var17;
                do {
                    int var15;
                    int var16;
                    do {
                        do {
                            do {
                                do {
                                    while (var10) {
                                        int var18 = var6.method877((byte) -104);
                                        if (var18 == 0) {
                                            continue label70;
                                        }
                                        var6.method897(110);
                                    }
                                    int var11 = var6.method877((byte) -81);
                                    if (var11 == 0) {
                                        continue label70;
                                    }
                                    var9 += var11 - 1;
                                    int var12 = (var9 & 0xFF7) >> 6;
                                    var13 = var6.method897(-35) >> 2;
                                    int var14 = var9 & 0x3F;
                                    var15 = arg2 + var12;
                                    var16 = arg3 + var14;
                                } while (var15 <= 0);
                            } while (var16 <= 0);
                        } while (var15 >= 103);
                    } while (var16 >= 103);
                    var17 = class41.method210(var7, (byte) 75);
                } while (var13 == 22 && !class193.field3244 && var17.field1835 == 0 && var17.field1779 != 1 && !var17.field1817);
                if (!var17.method790((byte) -58)) {
                    class185.field3056++;
                    var5 = false;
                }
                var10 = true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(B)V")
    public static void method703(byte arg0) {
        field1538 = null;
        field1557 = null;
        int var1 = -96 % ((arg0 - 93) / 33);
        field1551 = null;
        field1546 = null;
        field1547 = null;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
    public static final void method704(int arg0) {
        field1535++;
        class174.method1221();
        for (int var1 = arg0; var1 < 4; var1++) {
            class159.field2605[var1].method1192(16777215);
        }
        System.gc();
    }
}
