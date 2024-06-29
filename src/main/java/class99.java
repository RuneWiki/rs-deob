import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class99 extends class435 {

    @OriginalMember(owner = "client!so", name = "x", descriptor = "I")
    public volatile int field1478 = -1;

    @OriginalMember(owner = "client!so", name = "q", descriptor = "Ljava/lang/String;")
    public volatile String field1471;

    @OriginalMember(owner = "client!so", name = "v", descriptor = "Ldc;")
    public static class303 field1476 = new class303(6, 0, 4, 2);

    @OriginalMember(owner = "client!so", name = "A", descriptor = "I")
    public static int field1481 = 0;

    @OriginalMember(owner = "client!so", name = "y", descriptor = "[I")
    public static int[] field1479 = new int[1];

    @OriginalMember(owner = "client!so", name = "r", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!so", name = "s", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!so", name = "t", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!so", name = "u", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!so", name = "w", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!so", name = "B", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!so", name = "C", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!so", name = "z", descriptor = "[Lf;")
    public static class257[] field1480;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IZ)I")
    public static final int method827(int arg0, boolean arg1) {
        field1474++;
        if (arg0 < 96) {
            return 0;
        } else if (arg0 < 128) {
            return 2;
        } else {
            if (arg1) {
                field1481 = 117;
            }
            return 3;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
    public static void method828(int arg0) {
        field1480 = null;
        field1479 = null;
        if (arg0 != -11273) {
            method828(-110);
        }
        field1476 = null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(BI)Z")
    public static final boolean method829(byte arg0, int arg1) {
        field1472++;
        int var2 = 96 / ((arg0 + 60) / 60);
        return arg1 == 3 || arg1 == 5 || arg1 == 6;
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(IZ)I")
    public static final int method830(int arg0, boolean arg1) {
        int var7 = arg0 - 1;
        if (arg1) {
            field1480 = null;
        }
        field1477++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)I")
    public static final int method831(byte arg0) {
        field1475++;
        return arg0 == 73 ? class201.field3102 : -107;
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class99(String arg0) {
        this.field1471 = arg0;
    }
}
