import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public abstract class class80 {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "Ljd;")
    private static class86 field1559 = class122.method868("Wed", true);

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "Ljd;")
    private static class86 field1560 = class122.method868("Tue", true);

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    public static int field1571 = 0;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "Ljd;")
    private static class86 field1575 = class122.method868("Sat", true);

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "Ljd;")
    private static class86 field1572 = class122.method868("Fri", true);

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field1565 = 0;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "Ljd;")
    private static class86 field1570 = class122.method868("Thu", true);

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "Ljd;")
    public static class86 field1568 = class122.method868("Abbrechen", true);

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "Ljd;")
    private static class86 field1578 = class122.method868("Mon", true);

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "Ljd;")
    private static class86 field1566 = class122.method868("Sun", true);

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "[Ljd;")
    public static class86[] field1573 = new class86[] { field1566, field1578, field1560, field1559, field1570, field1572, field1575 };

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V")
    public static final void method558(int arg0, int arg1) {
        field1564++;
        class14.field411.method693(6, arg1);
        if (arg0 != -23850) {
            method560(29, (byte) 103);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)Leh;")
    public class80 method559(int arg0, int arg1, int arg2) {
        field1563++;
        return this;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IB)I")
    public static final int method560(int arg0, byte arg1) {
        field1576++;
        if (arg1 != 23) {
            field1573 = null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIII)V")
    public void method561(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 80 % ((arg1 - 12) / 40);
        field1562++;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Leh;IIIZ)V")
    public void method562(class80 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1567++;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "()Z")
    public boolean method563() {
        field1569++;
        return false;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method230(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "()I")
    public abstract int method233();

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BZ)V")
    public static final void method564(byte arg0, boolean arg1) {
        class61.field1214 = new int[104];
        class271.field4758 = new int[104];
        field1574++;
        class255.field4537 = new int[104];
        if (arg0 >= -32) {
            return;
        }
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class267.field4714 = new int[104];
        class10.field315 = new byte[var2][104][104];
        class180.field3250 = new int[var2][105][105];
        class144.field2732 = new byte[var2][105][105];
        class44.field988 = new byte[var2][104][104];
        class213.field3840 = new int[104];
        class41.field922 = new byte[var2][104][104];
        class219.field3928 = new byte[var2][104][104];
        class86.field1703 = 99;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)[Lei;")
    public static final class167[] method565(int arg0) {
        field1561++;
        class167[] var1 = new class167[class64.field1270];
        for (int var2 = arg0; var2 < class64.field1270; var2++) {
            byte[] var3 = class213.field3857[var2];
            int var4 = class24.field592[var2] * class191.field3393[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class268.field4718[class1.method5(var3[var6], 255)];
            }
            var1[var2] = new class167(class70.field1438, class169.field3121, class138.field2628[var2], class1.field6[var2], class24.field592[var2], class191.field3393[var2], var5);
        }
        class127.method894((byte) 20);
        return var1;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
    public static void method566(byte arg0) {
        field1572 = null;
        if (arg0 != -63) {
            return;
        }
        field1566 = null;
        field1570 = null;
        field1575 = null;
        field1568 = null;
        field1573 = null;
        field1559 = null;
        field1578 = null;
        field1560 = null;
    }
}
