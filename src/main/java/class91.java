import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class91 extends class529 {

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "Lss;")
    public static class213 field1321 = new class213("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public int field1315;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public int field1317;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public int field1318;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public int field1320;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public int field1322;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public int field1323;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public int field1324;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
    public int field1326;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    public int field1327;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
    public int field1328;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
    public int field1329;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
    public int field1330;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
    public int field1332;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
    public int field1333;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "I")
    public int field1335;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "I")
    public int field1337;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "I")
    public int field1338;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "Lwd;")
    public class120 field1336;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "Llf;")
    public class391 field1316;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "Lsv;")
    public class394 field1334;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "Lsn;")
    public class501 field1331;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static void method633(int arg0) {
        if (arg0 > -65) {
            field1321 = null;
        }
        field1321 = null;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
    public final void method634(int arg0) {
        field1325++;
        this.field1336 = null;
        this.field1334 = null;
        this.field1331 = null;
        this.field1316 = null;
        int var2 = -58 / ((arg0 + 61) / 35);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lot;III)V")
    public static final void method635(class506 arg0, int arg1, int arg2, int arg3) {
        long var4 = class311.field4882[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field7561 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var8 <= 0) {
                break;
            }
            arg0.field7563[arg0.field7561++] = class60.field950[var8 - 1].field2461;
            var6 += 16L;
        }
        for (int var9 = arg0.field7561; var9 < 4; var9++) {
            arg0.field7563[var9] = null;
        }
    }

    static {
        new class213("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
    }
}
