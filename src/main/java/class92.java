import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class92 {

    @OriginalMember(owner = "client!p", name = "e", descriptor = "Lve;")
    public static class255 field1578 = class87.method607(33, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!p", name = "h", descriptor = "Lve;")
    public static class255 field1581 = class87.method607(66, "Hidden)2use");

    @OriginalMember(owner = "client!p", name = "i", descriptor = "Lve;")
    public static class255 field1582 = class87.method607(25, "details");

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field1585 = 0;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field1586 = 1;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "Z")
    public static boolean field1588 = false;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Lwl;")
    public static class81 field1579 = new class81(200);

    @OriginalMember(owner = "client!p", name = "q", descriptor = "Lve;")
    public static class255 field1590 = class87.method607(125, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!p", name = "r", descriptor = "Lve;")
    public static class255 field1591 = class87.method607(51, "Untersuchen");

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZI)V", line = 14)
    public static final void method688(boolean arg0, int arg1) {
        if (arg1 != 1) {
            method689((byte) 122);
        }
        field1583++;
        byte var2;
        byte[][] var3;
        if (class281.field4827 && arg0) {
            var2 = 1;
            var3 = class249.field4164;
        } else {
            var2 = 4;
            var3 = class244.field4113;
        }
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = (class116.field1976[var5] & 0xFF) * 64 - class268.field4615;
            byte[] var7 = var3[var5];
            int var8 = (class116.field1976[var5] >> 8) * 64 - class197.field3355;
            if (var7 != null) {
                class118.method885(true);
                class215.method1536(class310.field5292, var6, (byte) 102, arg0, var7, var8, class72.field1201 * 8 - 48, (class20.field332 - 6) * 8);
            }
        }
        for (int var9 = 0; var9 < var4; var9++) {
            int var10 = (class116.field1976[var9] >> 8) * 64 - class197.field3355;
            int var11 = (class116.field1976[var9] & 0xFF) * 64 - class268.field4615;
            byte[] var12 = var3[var9];
            if (var12 == null && class72.field1201 < 800) {
                class118.method885(true);
                for (int var13 = 0; var13 < var2; var13++) {
                    class259.method1801((byte) -71, var10, 64, 64, var11, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V", line = 98)
    public static void method689(byte arg0) {
        field1591 = null;
        if (arg0 >= -77) {
            return;
        }
        field1581 = null;
        field1579 = null;
        field1590 = null;
        field1578 = null;
        field1582 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lrg;ILrg;)V", line = 124)
    public static final void method690(class88 arg0, int arg1, class88 arg2) {
        field1580++;
        if (arg1 != 1) {
            field1578 = (class255) null;
        }
        class131.field2166 = arg2;
        class254.field4278 = arg0;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IJ)Lve;", line = 143)
    public static final class255 method691(int arg0, long arg1) {
        class10.field140.setTime(new Date(arg1));
        if (arg0 != 10) {
            field1586 = -66;
        }
        field1589++;
        int var3 = class10.field140.get(7);
        int var4 = class10.field140.get(5);
        int var5 = class10.field140.get(2);
        int var6 = class10.field140.get(1);
        int var7 = class10.field140.get(11);
        int var8 = class10.field140.get(12);
        int var9 = class10.field140.get(13);
        return class3.method14(new class255[] { class60.field935[var3 - 1], class11.field163, class215.method1532(var4 / 10, true), class215.method1532(var4 % 10, true), class162.field2729, class238.field3956[var5], class162.field2729, class215.method1532(var6, true), class75.field1236, class215.method1532(var7 / 10, true), class215.method1532(var7 % 10, true), class280.field4789, class215.method1532(var8 / 10, true), class215.method1532(var8 % 10, true), class280.field4789, class215.method1532(var9 / 10, true), class215.method1532(var9 % 10, true), class168.field2829 }, (byte) -94);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(ZI)I", line = 197)
    public static final int method692(boolean arg0, int arg1) {
        if (!arg0) {
            field1585 = 46;
        }
        field1574++;
        return arg1 & 0x7F;
    }
}
