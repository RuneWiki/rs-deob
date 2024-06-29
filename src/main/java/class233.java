import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class233 extends class273 {

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    public static int field3815 = -1;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "I")
    public static int field3826 = 0;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "Lwm;")
    public static class152 field3818 = null;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "I")
    public int field3824;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "I")
    public int field3828;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "[I")
    public int[] field3819;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "[I")
    public int[] field3820;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "[I")
    public int[] field3821;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "[Lka;")
    public class188[] field3822;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "[Lka;")
    public class188[] field3825;

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "[[[B")
    public byte[][][] field3823;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V", line = 11)
    public static void method1599(int arg0) {
        if (arg0 != -11663) {
            field3818 = (class152) null;
        }
        field3818 = null;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)V", line = 23)
    public static final void method1600(byte arg0) {
        field3817++;
        class208 var1 = (class208) class185.field2944.method1221((byte) 109);
        if (arg0 < 62) {
            method1600((byte) 18);
        }
        while (var1 != null) {
            class245 var2 = var1.field3400;
            if (class23.field400 != var2.field4112 || var2.field4126 < class142.field2187) {
                var1.method1880(-25368);
            } else if (var2.field4098 <= class142.field2187) {
                if (var2.field4113 > 0) {
                    class4 var3 = class40.field649[var2.field4113 - 1];
                    if (var3 != null && var3.field4162 >= 0 && var3.field4162 < 13312 && var3.field4231 >= 0 && var3.field4231 < 13312) {
                        var2.method1691(var3.field4231, class154.method1031(117, var3.field4162, var2.field4112, var3.field4231) - var2.field4114, 7390, class142.field2187, var3.field4162);
                    }
                }
                if (var2.field4113 < 0) {
                    int var4 = -var2.field4113 - 1;
                    class12 var5;
                    if (class27.field466 == var4) {
                        var5 = class85.field1176;
                    } else {
                        var5 = class22.field380[var4];
                    }
                    if (var5 != null && var5.field4162 >= 0 && var5.field4162 < 13312 && var5.field4231 >= 0 && var5.field4231 < 13312) {
                        var2.method1691(var5.field4231, class154.method1031(121, var5.field4162, var2.field4112, var5.field4231) - var2.field4114, 7390, class142.field2187, var5.field4162);
                    }
                }
                var2.method1690(class277.field4740, (byte) -94);
                class241.method1644(class23.field400, (int) var2.field4088, (int) var2.field4109, (int) var2.field4084, 60, var2, var2.field4116, -1L, false);
            }
            var1 = (class208) class185.field2944.method1223(55);
        }
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)V", line = 95)
    public static final void method1601(int arg0) {
        field3827++;
        if (!class125.field1762) {
            return;
        }
        class127 var1 = class132.method837(class172.field2758, class93.field1329, 0);
        if (var1 != null && var1.field1926 != null) {
            class320 var2 = new class320();
            var2.field5581 = var1.field1926;
            var2.field5569 = var1;
            class64.method412(var2, (byte) -94);
        }
        class125.field1762 = false;
        class321.field5607 = -1;
        class272.method1868(22889, var1);
        if (arg0 != 6132) {
            method1602(76);
        }
    }

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)V", line = 146)
    public static final void method1602(int arg0) {
        field3816++;
        class227.field3678.method1613(-22696);
        class120.field1695.method1613(-22696);
        if (arg0 == -1) {
            class320.field5588.method1613(-22696);
        }
    }
}
