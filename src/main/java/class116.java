import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class116 extends class498 implements class347 {

    @OriginalMember(owner = "client!np", name = "v", descriptor = "I")
    private int field1617;

    @OriginalMember(owner = "client!np", name = "p", descriptor = "I")
    public static int field1611 = 0;

    @OriginalMember(owner = "client!np", name = "u", descriptor = "Ldh;")
    public static class206 field1616 = new class206(8);

    @OriginalMember(owner = "client!np", name = "x", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!np", name = "y", descriptor = "[I")
    public static int[] field1620;

    @OriginalMember(owner = "client!np", name = "w", descriptor = "Llm;")
    public static class31 field1618;

    @OriginalMember(owner = "client!np", name = "l", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!np", name = "m", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!np", name = "n", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!np", name = "o", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!np", name = "q", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!np", name = "r", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!np", name = "s", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!np", name = "t", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!np", name = "z", descriptor = "Lmn;")
    public static class162 field1621;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)V")
    public static final void method742(boolean arg0) {
        ++field1614;
        class491.field7427.method2187(-1);
        if (!arg0) {
            method743((byte) 13);
        }
    }

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(B)V")
    public final void method137(byte arg0) {
        ++field1610;
        super.field7496.method1520(this, true);
        if (arg0 != 35) {
            this.method749(-99);
        }
    }

    @OriginalMember(owner = "client!np", name = "d", descriptor = "(B)V")
    public static void method743(byte arg0) {
        field1620 = null;
        field1621 = null;
        field1616 = null;
        field1618 = null;
        if (arg0 < 117) {
            field1618 = null;
        }
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lna;I[BIZ)V")
    public class116(class211 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field1617 = arg1;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)J")
    public final long method744(byte arg0) {
        ++field1608;
        return arg0 != -108 ? -88L : 0L;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IZI)V")
    public static final void method745(int arg0, boolean arg1, int arg2) {
        ++field1607;
        if (arg2 != -1068) {
            method748(71, -108);
        }
        if (arg0 == 0) {
            class19.field198 = class497.method3044(class161.field2206, class320.field4980, class141.field1911.field6097 * 2, arg2 ^ 1117, arg0, class339.field5294);
        } else {
            if (arg1) {
                class19.field198 = class497.method3044(class161.field2206, class320.field4980, 0, -84, 0, class339.field5294);
                class19.field198.method1317(0);
                class340 var3 = class310.method2082((byte) 121, 0, class130.field1767, class68.field1040);
                class299 var4 = class19.field198.method1246(var3, class175.method1110(class120.field1646, class68.field1040, 0), true);
                class57.method439(true, class382.field5862.method1583(82, class12.field131), (byte) -60, var4);
                class19.field198.method1255();
                class271.method1836(arg2 ^ -1068);
                class19.field198.method3039(12755);
            }
            try {
                class19.field198 = class497.method3044(class161.field2206, class320.field4980, class141.field1911.field6097 * 2, -113, arg0, class339.field5294);
                if (class19.field198.method1241()) {
                    boolean var5 = true;
                    try {
                        var5 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var7) {
                    }
                    class517 var6;
                    if (var5) {
                        var6 = class19.field198.method1285(146800640);
                    } else {
                        var6 = class19.field198.method1285(104857600);
                    }
                    class19.field198.method1295(var6);
                }
            } catch (Throwable var8) {
                class19.field198 = class497.method3044(class161.field2206, class320.field4980, 0, arg2 ^ 1146, 0, class339.field5294);
                arg0 = 0;
            }
        }
        class452.field7013 = arg0;
        class6.method55(false);
        if (!class19.field198.method1283()) {
            class190.field2765 = 1;
        }
        class19.field198.method1274(class190.field2765);
        class19.field198.method1265(0);
        class19.field198.method1335(8);
        class520.field7712 = class19.field198.method1254();
        class510.field7602 = class19.field198.method1254();
        class248.method1718((byte) 13);
        class19.field198.method1292(!class141.field1911.field6094);
        if (class19.field198.method1296()) {
            class295.method1984(class141.field1911.field6098, (byte) 22);
        }
        class435.method2739(class197.field3038 >> 3, class135.field1839 >> 3, class19.field198, 4);
        class278.method1866((byte) -104);
        class256.field4144 = false;
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(B)I")
    public final int method746(byte arg0) {
        int var2 = -31 / (-arg0 / 53);
        ++field1612;
        return super.field7493;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II[BI)V")
    public final void method747(int arg0, int arg1, byte[] arg2, int arg3) {
        this.method3048(arg0 + -27288, arg2, arg1);
        ++field1615;
        this.field1617 = arg3;
        if (arg0 != 24519) {
            field1621 = null;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II)I")
    public static final int method748(int arg0, int arg1) {
        ++field1613;
        int var2 = (arg0 >>> 1 & 1431655765) + (1431655765 & arg0);
        int var3 = (var2 & 858993459) - -((-858993458 & var2) >>> 2);
        if (arg1 != -2024880312) {
            return 65;
        } else {
            int var4 = (var3 >>> 4) + var3 & 252645135;
            int var5 = (var4 >>> 8) + var4;
            int var6 = (var5 >>> 16) + var5;
            return var6 & 255;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)I")
    public final int method749(int arg0) {
        int var2 = -24 % ((arg0 - 7) / 34);
        ++field1609;
        return this.field1617;
    }

    static {
        new class213("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
        field1619 = 0;
        field1620 = new int[14];
        field1618 = new class31(1, 17);
    }
}
