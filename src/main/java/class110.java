import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public abstract class class110 extends class84 {

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "Z")
    public static boolean field1529 = false;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
    public static int field1527 = 0;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
    public static int field1531 = 0;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
    public int field1525;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "I")
    public int field1526;

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
    public int field1532;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
    public int field1536;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "I")
    public int field1538;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
    public int field1539;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)V")
    public abstract void method702(int arg0, int arg1);

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BB)V")
    public static final void method703(byte arg0, byte arg1) {
        if (arg1 >= -67) {
            return;
        }
        if (class86.field1176 == null) {
            class86.field1176 = new byte[4][104][104];
        }
        field1528++;
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class86.field1176[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIZ)V")
    public static final void method704(int arg0, int arg1, boolean arg2) {
        class78.field1091 = (float) arg0;
        class68.field912 = (float) arg1;
        field1535++;
        if (class51.field734 == 2) {
            class275.field4265 = arg0;
            class239.field3645 = arg1;
        }
        class104.method682((byte) -92);
        class20.field291 = arg2;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)V")
    public abstract void method705(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)V")
    public abstract void method706(int arg0, int arg1);

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)V")
    public abstract void method707(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIII)V")
    public final void method708(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = -99 / ((arg2 - 22) / 41);
        int var7 = this.field1536 << 3;
        int var8 = (arg0 << 4) + (var7 & 0xF);
        int var9 = this.field1526 << 3;
        int var10 = (arg3 << 4) + (var9 & 0xF);
        this.method711(var7, var9, var8, var10, arg4, arg1);
        field1523++;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(IIIII)V")
    public static final void method709(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class75.field1054 = -1;
        field1534++;
        client.field2181 = class138.field1929 * arg1 / arg0;
        if (arg4 != 124) {
            field1531 = -110;
        }
        class67.field906 = -1;
        class234.field3529 = class41.field605 * arg2 / arg3;
        class143.method956(-1);
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)V")
    public abstract void method710(int arg0, int arg1);

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(IIIIII)V")
    public abstract void method711(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(IIIII)V")
    public abstract void method712(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZI)I")
    public static final int method713(boolean arg0, int arg1) {
        int var2 = arg1 & 0x3F;
        field1530++;
        int var3 = (arg1 & 0xD8) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return arg0 ? 105 : 0;
    }
}
