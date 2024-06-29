import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class102 implements class500 {

    @OriginalMember(owner = "client!d", name = "b", descriptor = "[I")
    public static int[] field1504 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field1508 = 0;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "Lcu;")
    public static class145 field1503 = new class145(51, 2);

    @OriginalMember(owner = "client!d", name = "h", descriptor = "Lra;")
    public static class70 field1510 = new class70(15, 0, 1, 0);

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static final void method716(int arg0) {
        field1507++;
        if (!class503.field6932) {
            return;
        }
        class487.field6761 = null;
        class411.field5655 = null;
        class503.field6932 = false;
        if (arg0 != 3) {
            method718(118, -108, 49);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([ILra;IJ)Ljava/lang/String;")
    public final String method717(int[] arg0, class70 arg1, int arg2, long arg3) {
        field1506++;
        if (class155.field2251 == arg1) {
            class46 var6 = class168.field2436.method2609((byte) 101, arg0[0]);
            return var6.method326((int) arg3, arg2 ^ 0x4B1F);
        }
        if (arg2 != -19231) {
            field1510 = null;
        }
        if (class359.field4846 == arg1 || class406.field5583 == arg1) {
            class482 var7 = class127.field1852.method2390(arg2 + 19335, (int) arg3);
            return var7.field6697;
        } else if (class88.field1338 == arg1 || class526.field7786 == arg1 || class17.field295 == arg1) {
            return class168.field2436.method2609((byte) 98, arg0[0]).method326((int) arg3, -2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)I")
    public static final int method718(int arg0, int arg1, int arg2) {
        field1509++;
        if (arg0 != 3) {
            field1510 = null;
        }
        return arg1 == 1 || arg1 == 3 ? class429.field5880[arg2 & 0x3] : class517.field7658[arg2 & 0x3];
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
    public static void method719(byte arg0) {
        field1503 = null;
        field1504 = null;
        field1510 = null;
        int var1 = 87 % ((-arg0 - 64) / 45);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIBI)I")
    public static final int method720(int arg0, int arg1, byte arg2, int arg3) {
        field1505++;
        int var4 = arg1 / arg3;
        int var5 = arg3 - 1 & arg1;
        int var6 = arg0 / arg3;
        int var7 = arg3 - 1 & arg0;
        int var8 = class394.method2312(1, var4, var6);
        int var9 = class394.method2312(arg2 ^ 0xFFFFFFAA, var4 + 1, var6);
        int var10 = class394.method2312(1, var4, var6 + 1);
        int var11 = class394.method2312(1, var4 + 1, var6 + 1);
        int var12 = class365.method2129(4797, var5, var9, var8, arg3);
        if (arg2 != -85) {
            field1510 = null;
        }
        int var13 = class365.method2129(4797, var5, var11, var10, arg3);
        return class365.method2129(4797, var7, var13, var12, arg3);
    }
}
