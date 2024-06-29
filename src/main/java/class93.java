import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class93 extends class123 {

    @OriginalMember(owner = "client!th", name = "C", descriptor = "Lom;")
    public class76 field1520;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "[Z")
    public static boolean[] field1513 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!th", name = "u", descriptor = "I")
    public static int field1512 = 0;

    @OriginalMember(owner = "client!th", name = "A", descriptor = "[I")
    public static int[] field1518 = new int[2500];

    @OriginalMember(owner = "client!th", name = "D", descriptor = "Ljava/lang/String;")
    public static String field1521 = "Loading config - ";

    @OriginalMember(owner = "client!th", name = "z", descriptor = "[I")
    public static int[] field1517 = new int[2];

    @OriginalMember(owner = "client!th", name = "F", descriptor = "[I")
    public static int[] field1523 = new int[5];

    @OriginalMember(owner = "client!th", name = "E", descriptor = "Ljava/lang/String;")
    public static String field1522 = "Use";

    @OriginalMember(owner = "client!th", name = "w", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!th", name = "x", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!th", name = "y", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V", line = 6)
    public static void method739(byte arg0) {
        field1521 = null;
        field1522 = null;
        int var1 = -54 % ((-arg0 - 81) / 42);
        field1513 = null;
        field1517 = null;
        field1523 = null;
        field1518 = null;
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(Z)I", line = 27)
    public static final int method740(boolean arg0) {
        field1514++;
        if ((double) class16.field333 == 3.0D) {
            return 37;
        }
        if (arg0) {
            method741(124, false, (byte) -47, -86);
        }
        if ((double) class16.field333 == 4.0D) {
            return 50;
        } else if ((double) class16.field333 == 6.0D) {
            return 75;
        } else if ((double) class16.field333 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZBI)V", line = 57)
    public static final void method741(int arg0, boolean arg1, byte arg2, int arg3) {
        field1516++;
        if (arg2 != 89) {
            return;
        }
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class58.field877 = arg0;
        class52.field774 = arg1;
        class297.field4778 = arg3;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lom;)V", line = 75)
    public class93(class76 arg0) {
        this.field1520 = arg0;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lpk;Lpk;I)V", line = 86)
    public static final void method742(class120 arg0, class120 arg1, int arg2) {
        field1515++;
        class39.field593 = arg1;
        int var3 = (int) (Math.random() * 21.0D) - 10;
        class17.field339 = arg0;
        int var4 = (int) (Math.random() * 21.0D) - 10;
        class39.field593.method962((byte) -100, 34);
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 41.0D) - 20;
        class78.field1226 = var5 + var6;
        class95.field1537 = var4 + var6;
        if (arg2 != -13294) {
            method742((class120) null, (class120) null, -57);
        }
        class66.field1007 = var3 + var6;
    }
}
