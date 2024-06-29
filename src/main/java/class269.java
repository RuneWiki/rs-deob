import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public abstract class class269 extends class285 {

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "[Ljj;")
    public static class140[] field4626 = new class140[50];

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "[I")
    public static int[] field4627 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "I")
    public static int field4623 = 0;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "Lve;")
    public static class255 field4618 = class87.method607(94, "Fertigkeit:");

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "Lve;")
    public static class255 field4630 = class87.method607(117, "cookieprefix");

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "Lve;")
    public static class255 field4633 = class87.method607(98, ")1");

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "Lpb;")
    public static class70 field4624 = new class70(new byte[5000]);

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    public int field4619;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
    public int field4622;

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
    public int field4625;

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "I")
    public int field4628;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "I")
    public int field4632;

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "I")
    public int field4634;

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILve;Lpb;)I", line = 9)
    public static final int method1870(int arg0, class255 arg1, class70 arg2) {
        int var3 = -23 % ((arg0 - 10) / 38);
        int var4 = arg2.field1068;
        field4621++;
        arg2.method470(65280, arg1.field4343);
        arg2.field1068 += class232.field3852.method190((byte) -67, arg1.field4297, arg2.field1068, arg2.field1066, arg1.field4343, 0);
        return arg2.field1068 - var4;
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(B)V", line = 27)
    public static void method1871(byte arg0) {
        field4624 = null;
        field4627 = null;
        if (arg0 <= 54) {
            method1872(16, -99, -22, false, 120L);
        }
        field4618 = null;
        field4633 = null;
        field4630 = null;
        field4626 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIZJ)Lve;", line = 64)
    public static final class255 method1872(int arg0, int arg1, int arg2, boolean arg3, long arg4) {
        field4635++;
        class255 var6 = class285.method2025(0, (byte) -32);
        if (arg4 < 0L) {
            arg4 = -arg4;
            var6.method1765(class25.field397, 55);
        }
        class255 var7 = class54.field861;
        class255 var8 = class235.field3864;
        if (arg1 == 1) {
            var8 = class54.field861;
            var7 = class235.field3864;
        }
        if (arg1 == 2) {
            var8 = class300.field5105;
            var7 = class235.field3864;
        }
        class255 var9 = class285.method2025(0, (byte) -110);
        class255 var10 = class285.method2025(0, (byte) 124);
        for (int var11 = 0; var11 < arg0; var11++) {
            var10.method1765(class215.method1532((int) (arg4 % 10L), true), 55);
            arg4 /= 10L;
        }
        if (arg2 < 86) {
            return (class255) null;
        }
        if (arg4 == 0L) {
            var9 = class56.field879;
        }
        int var12 = 0;
        while (arg4 > 0L) {
            if (arg3 && var12 != 0 && (var12 % 3) == 0) {
                var9.method1765(var8, 55);
            }
            var9.method1765(class215.method1532((int) (arg4 % 10L), true), 55);
            var12++;
            arg4 /= 10L;
        }
        if (var10.method1774(-41) > 0) {
            var10.method1765(var7, 55);
        }
        return class3.method14(new class255[] { var6, var9.method1784((byte) 61), var10.method1784((byte) 74) }, (byte) -104);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIBII)V", line = 135)
    public final void method1873(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field4629++;
        int var6 = this.field4634 << 3;
        int var7 = (arg3 << 4) + (var6 & 0xF);
        int var8 = this.field4622 << 3;
        int var9 = (arg1 << 4) + (var8 & 0xF);
        if (arg2 != 123) {
            this.method401(-80, 104, 84, 29, 39, 44);
        }
        this.method401(var6, var8, var7, var9, arg4, arg0);
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V", line = 152)
    public static final void method1874(int arg0) {
        field4620++;
        if (arg0 != -25683) {
            field4630 = (class255) null;
        }
        class80.field1292.method554(0);
        class225.field3766.method554(0);
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(IB)Lnh;", line = 191)
    public static final class107 method1875(int arg0, byte arg1) {
        field4631++;
        class107 var2 = (class107) class196.field3227.method58(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class141.field2344.method636(26, (byte) 97, arg0);
        class107 var4 = new class107();
        if (var3 != null) {
            var4.method827(new class70(var3), -250);
        }
        int var5 = 25 % ((arg1 + 12) / 62);
        class196.field3227.method63(0, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
    public abstract void method290(int arg0, int arg1);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIII)V")
    public abstract void method401(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIII)V")
    public abstract void method399(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIII)V")
    public abstract void method572(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)V")
    public abstract void method291(int arg0, int arg1);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V")
    public abstract void method395(int arg0, int arg1, int arg2);
}
