import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class240 {

    @OriginalMember(owner = "client!le", name = "a", descriptor = "[I")
    public static int[] field4052 = new int[128];

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field4053 = 100;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "B")
    public static byte field4059 = 0;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "[[[B")
    public static byte[][][] field4056;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)V")
    public static final void method1719(int arg0, int arg1) {
        field4054++;
        if (class26.field458 == arg0) {
            return;
        }
        if (class26.field458 == 0) {
            class121.method910(arg1 ^ 0x79F7);
        }
        if (arg0 == 40) {
            class279.method1958(3);
        }
        if (arg0 != 40 && class293.field4798 != null) {
            class293.field4798.method1070(-120);
            class293.field4798 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class5.field122 = 1;
            class292.field4790 = 0;
            class151.field2518 = 1;
            class141.field2339 = 0;
            class67.field1126 = 0;
            class85.method600(true, (byte) 7);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg0 == 25 || arg0 == 10) {
            class4.method31(11688);
        }
        if (arg0 == 5) {
            class131.method975(class25.field445, 0);
        } else {
            class214.method1519((byte) -120);
        }
        boolean var3 = class26.field458 == 5 || class26.field458 == 10 || class26.field458 == 28;
        if (arg1 != 31136) {
            return;
        }
        if (var3 != var2) {
            if (var2) {
                class57.field1004 = class58.field1023;
                if (class289.field4767 == 0) {
                    class264.method1870(2, -99);
                } else {
                    class310.method2087(0, class58.field1023, 2, 255, (byte) -98, false, class71.field1246);
                }
                class277.field4611.method1521((byte) 4, false);
            } else {
                class264.method1870(2, -31);
                class277.field4611.method1521((byte) 4, true);
            }
        }
        class26.field458 = arg0;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IZ)V")
    public static final void method1720(int arg0, boolean arg1) {
        if (arg0 != -26343) {
            field4053 = 117;
        }
        field4055++;
        if (class81.field1351 != arg1) {
            class81.field1351 = arg1;
            class306.method2072(arg0 ^ 0xFFFF997F);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static final void method1721(int arg0) {
        class51.field865 = arg0;
        for (int var1 = 0; var1 < class21.field379; var1++) {
            for (int var2 = 0; var2 < class28.field479; var2++) {
                if (class90.field1498[arg0][var1][var2] == null) {
                    class90.field1498[arg0][var1][var2] = new class174(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)Lji;")
    public static final class11 method1722(int arg0, byte arg1) {
        class11 var2 = (class11) class105.field1731.method252((long) arg0, false);
        field4057++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class37.field586.method1149(26, (byte) 70, arg0);
        class11 var4 = new class11();
        if (var3 != null) {
            var4.method61(new class249(var3), arg1 + 159);
        }
        class105.field1731.method247(var4, (long) arg0, -89);
        return arg1 == -32 ? var4 : null;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(IZ)V")
    public static final void method1723(int arg0, boolean arg1) {
        field4058++;
        if (!arg1) {
            return;
        }
        class302 var2 = (class302) class21.field381.method987(-115, (long) arg0);
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field4922.length; var3++) {
                var2.field4922[var3] = -1;
                var2.field4927[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public static void method1724(byte arg0) {
        field4056 = null;
        field4052 = null;
        if (arg0 != -38) {
            field4059 = 11;
        }
    }
}
