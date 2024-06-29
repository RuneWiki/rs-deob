import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class485 extends class321 {

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "[[S")
    public static short[][] field6978 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "Lrb;")
    public static class283 field6976 = new class283(16, 8);

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field6975;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field6977;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field6981;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "Lqi;")
    public static class389 field6979;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "[S")
    public static short[] field6980;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V", line = 6)
    public static void method2871(int arg0) {
        field6980 = null;
        if (arg0 != -1647482933) {
            field6981 = -43;
        }
        field6978 = null;
        field6979 = null;
        field6976 = null;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V", line = 20)
    public static final void method2872(int arg0) {
        field6977++;
        int var1 = class100.field1585.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class100.field1585[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class79.field1120; var4++) {
                    if (class66.field955[var4] == class463.field6689[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class66.field955[class79.field1120] = class463.field6689[var2];
                    var3 = class79.field1120++;
                }
                class319 var5 = new class319(class100.field1585[var2]);
                int var6 = 0;
                while (var5.field4360 < class100.field1585[var2].length && var6 < 511 && class273.field3692 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method1844(-121);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class463.field6689[var2] >> 8) * 64 + var10 - class110.field1775;
                    int var13 = (class463.field6689[var2] & 0xFF) * 64 + var11 - class399.field5727;
                    class83 var14 = class233.field3248.method2222((byte) -103, var5.method1844(-112));
                    class326 var15 = (class326) class281.field3826.method1592((byte) -25, (long) var7);
                    if (var15 == null && (var14.field1229 & 0x1) > 0 && class315.field4267 == var9 && var12 >= 0 && var14.field1228 + var12 < class9.field111 && var13 >= 0 && (var13 + var14.field1228) < class192.field2809) {
                        class209 var16 = new class209();
                        var16.field179 = var7;
                        class326 var17 = new class326(var16);
                        class281.field3826.method1586(var17, (long) var7, 1);
                        class496.field7261[class534.field7854++] = var17;
                        class159.field2416[class273.field3692++] = var7;
                        var16.field208 = class28.field417;
                        var16.method1330(var14, false);
                        var16.method115(var16.field2976.field1228, (byte) 75);
                        var16.field220 = var16.field2976.field1230 << 3;
                        var16.method106(1113158831, true, (var16.field2976.field1234 + 4 & 0x3E600007) << 11);
                        var16.method1327(30, var9, var13, var16.method116(arg0 + 493), var12, true);
                    }
                }
            }
        }
        if (arg0 != 8076) {
            method2873(null, -33, 22);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ltn;II)Luc;", line = 124)
    public static final class201 method2873(class434 arg0, int arg1, int arg2) {
        field6975++;
        class201 var3;
        if (class440.field6335 == null) {
            var3 = new class201();
        } else {
            var3 = class440.field6335;
            class440.field6335 = class440.field6335.field2918;
            var3.field2918 = null;
            class462.field6685--;
        }
        if (arg2 < 90) {
            field6978 = null;
        }
        var3.field2915 = arg0;
        var3.field2917 = arg1;
        return var3;
    }
}
