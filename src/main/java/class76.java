import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class76 extends class149 {

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "I")
    private int field1432 = 0;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
    private int field1429 = 128;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
    private int field1428 = 0;

    @OriginalMember(owner = "client!ic", name = "Z", descriptor = "I")
    private int field1436 = 128;

    @OriginalMember(owner = "client!ic", name = "fb", descriptor = "I")
    private int field1442 = 0;

    @OriginalMember(owner = "client!ic", name = "W", descriptor = "I")
    public int field1433 = -1;

    @OriginalMember(owner = "client!ic", name = "ab", descriptor = "Lsg;")
    public static class169 field1437 = class165.method1060("leuchten3:", 1536);

    @OriginalMember(owner = "client!ic", name = "ib", descriptor = "Lsg;")
    public static class169 field1445 = class165.method1060("b12_full", 1536);

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
    public int field1431;

    @OriginalMember(owner = "client!ic", name = "X", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!ic", name = "Y", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!ic", name = "bb", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!ic", name = "gb", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!ic", name = "hb", descriptor = "I")
    private int field1444;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "[S")
    private short[] field1426;

    @OriginalMember(owner = "client!ic", name = "cb", descriptor = "[S")
    private short[] field1439;

    @OriginalMember(owner = "client!ic", name = "db", descriptor = "[S")
    private short[] field1440;

    @OriginalMember(owner = "client!ic", name = "eb", descriptor = "[S")
    private short[] field1441;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLoa;)V")
    public final void method465(byte arg0, class127 arg1) {
        if (arg0 > -59) {
            this.field1432 = -78;
        }
        field1435++;
        while (true) {
            int var3 = arg1.method819((byte) 22);
            if (var3 == 0) {
                return;
            }
            this.method466((byte) 41, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BILoa;)V")
    private final void method466(byte arg0, int arg1, class127 arg2) {
        if (arg1 == 1) {
            this.field1444 = arg2.method785(true);
        } else if (arg1 == 2) {
            this.field1433 = arg2.method785(true);
        } else if (arg1 == 4) {
            this.field1429 = arg2.method785(true);
        } else if (arg1 == 5) {
            this.field1436 = arg2.method785(true);
        } else if (arg1 == 6) {
            this.field1442 = arg2.method785(true);
        } else if (arg1 == 7) {
            this.field1428 = arg2.method819((byte) 22);
        } else if (arg1 == 8) {
            this.field1432 = arg2.method819((byte) 22);
        } else if (arg1 == 40) {
            int var4 = arg2.method819((byte) 22);
            this.field1426 = new short[var4];
            this.field1441 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1426[var5] = (short) arg2.method785(true);
                this.field1441[var5] = (short) arg2.method785(true);
            }
        } else if (arg1 == 41) {
            int var6 = arg2.method819((byte) 22);
            this.field1440 = new short[var6];
            this.field1439 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1439[var7] = (short) arg2.method785(true);
                this.field1440[var7] = (short) arg2.method785(true);
            }
        }
        field1430++;
        if (arg0 != 41) {
            field1437 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(II)Lcd;")
    public final class24 method467(int arg0, int arg1) {
        field1438++;
        if (arg1 != 17423) {
            return null;
        }
        class24 var3 = (class24) class91.field1678.method1206((long) this.field1431, -24742);
        if (var3 == null) {
            class52 var4 = class52.method337(class91.field1682, this.field1444, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field1426 != null) {
                for (int var5 = 0; var5 < this.field1426.length; var5++) {
                    var4.method324(this.field1426[var5], this.field1441[var5]);
                }
            }
            if (this.field1439 != null) {
                for (int var6 = 0; var6 < this.field1439.length; var6++) {
                    var4.method340(this.field1439[var6], this.field1440[var6]);
                }
            }
            var3 = var4.method325(this.field1428 + 64, this.field1432 + 850, -30, -50, -30, true, true);
            class91.field1678.method1208((long) this.field1431, 114, var3);
        }
        class24 var7;
        if (this.field1433 == -1 || arg0 == -1) {
            var7 = var3.method166(true);
        } else {
            var7 = class159.method1021((byte) 104, this.field1433).method1159(-52, var3, arg0);
        }
        if (this.field1429 != 128 || this.field1436 != 128) {
            var7.method176(this.field1429, this.field1436, this.field1429);
        }
        if (this.field1442 != 0) {
            if (this.field1442 == 90) {
                var7.method165();
            }
            if (this.field1442 == 180) {
                var7.method165();
                var7.method165();
            }
            if (this.field1442 == 270) {
                var7.method165();
                var7.method165();
                var7.method165();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)V")
    public static void method468(int arg0) {
        int var1 = -77 / ((-arg0 - 37) / 35);
        field1445 = null;
        field1437 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)Z")
    public static final boolean method469(int arg0, byte arg1) {
        if (arg1 < 112) {
            return true;
        } else {
            field1427++;
            return (arg0 & 0x1) != 0;
        }
    }
}
