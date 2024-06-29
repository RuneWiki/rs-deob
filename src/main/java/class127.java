import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class127 {

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field1735 = 0;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "Z")
    public static boolean field1742 = false;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field1744 = 0;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "Lcc;")
    public static class263 field1745 = null;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public static int field1746 = 0;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "F")
    public static float field1739;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "[Ltb;")
    public static class234[] field1747;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V", line = 4)
    public static final void method844(int arg0) {
        field1737++;
        int var1 = class221.field3123;
        int var2 = class205.field2871;
        int var3 = class325.field4984;
        int var4 = class172.field2480;
        if (arg0 != -4325) {
            field1745 = (class263) null;
        }
        int var5 = 6116423;
        if (class250.field3787) {
            class306.method2154(var1, var3, var2, var4, var5);
            class306.method2154(var1 + 1, var3 + 1, var2 - 2, 16, 0);
            class306.method2156(var1 + 1, var3 + 18, var2 - 2, var4 - 19, 0);
        } else {
            class144.method977(var1, var3, var2, var4, var5);
            class144.method977(var1 + 1, var3 + 1, var2 - 2, 16, 0);
            class144.method964(var1 + 1, var3 + 18, var2 - 2, var4 - 19, 0);
        }
        class88.field1097.method58(class164.field2262, var1 + 3, var3 - -14, var5, -1);
        int var6 = class161.field2216;
        int var7 = class211.field2987;
        for (int var8 = 0; var8 < class310.field4794; var8++) {
            int var9 = var3 + ((-var8 + -1 + class310.field4794) * 15) + 31;
            int var10 = 16777215;
            if (var7 > var1 && var7 < (var1 + var2) && (var9 - 13) < var6 && var6 < var9 + 3) {
                var10 = 16776960;
            }
            class88.field1097.method58(class106.method615(var8, true), var1 + 3, var9, var10, 0);
        }
        class227.method1561(class205.field2871, class221.field3123, class172.field2480, class325.field4984, arg0 ^ 0x10AA);
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V", line = 61)
    public static void method845(int arg0) {
        field1745 = null;
        if (arg0 == -28473) {
            field1747 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(I)V", line = 78)
    public static final void method846(int arg0) {
        class259.field3929.method1241(113);
        field1740++;
        if (arg0 != 2) {
            method847((String) null, false, false);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Ljava/lang/String;ZZ)V", line = 91)
    public static final void method847(String arg0, boolean arg1, boolean arg2) {
        String var3 = arg0.toLowerCase();
        int var4 = 0;
        short[] var5 = new short[16];
        field1738++;
        int var6 = arg1 ? 32768 : 0;
        int var7 = var6 + (arg1 ? class125.field1731 : class339.field5264);
        for (int var8 = var6; var8 < var7; var8++) {
            class44 var9 = class135.method897((byte) 79, var8);
            if (var9.field535 && var9.method261((byte) 70).toLowerCase().indexOf(var3) != -1) {
                if (var4 >= 50) {
                    class280.field4342 = null;
                    class345.field5354 = -1;
                    return;
                }
                if (var5.length <= var4) {
                    short[] var10 = new short[var5.length * 2];
                    for (int var11 = 0; var11 < var4; var11++) {
                        var10[var11] = var5[var11];
                    }
                    var5 = var10;
                }
                var5[var4++] = (short) var8;
            }
        }
        class280.field4342 = var5;
        class158.field2177 = 0;
        class345.field5354 = var4;
        String[] var12 = new String[class345.field5354];
        if (arg2) {
            for (int var13 = 0; var13 < class345.field5354; var13++) {
                var12[var13] = class135.method897((byte) 79, var5[var13]).method261((byte) 111);
            }
            class276.method1983(class280.field4342, var12, -113);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V", line = 162)
    public static final void method848(byte arg0) {
        if (arg0 != 63) {
            method846(15);
        }
        field1741++;
        class222.field3146.method1237((byte) -80);
        class231.field3368.method1237((byte) 44);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)V", line = 186)
    public static final void method849(int arg0, int arg1, int arg2) {
        class96 var3 = class141.method935(arg2, 5, 80);
        field1743++;
        var3.method581((byte) -100);
        if (arg1 != 1957) {
            method848((byte) -107);
        }
        var3.field1243 = arg0;
    }
}
