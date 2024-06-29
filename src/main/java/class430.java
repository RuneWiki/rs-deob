import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class430 {

    @OriginalMember(owner = "client!li", name = "c", descriptor = "[I")
    public static int[] field6158 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!li", name = "a", descriptor = "Lkn;")
    public static class737 field6156 = new class737(10, 8);

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field6157;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "Llba;")
    public static class549 field6160;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)V", line = 3)
    public static final void method2615(int arg0, int arg1, int arg2) {
        field6157++;
        class594 var3 = class692.method3869(arg2, (byte) 105, arg0);
        var3.method3378(arg0 ^ 0xFFFF9C68);
        var3.field8126 = arg1;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V", line = 14)
    public static final void method2616(byte arg0) {
        class493.field6819 = 0;
        class661.field9039 = 0;
        field6159++;
        class199.field2904++;
        class263.method1761(1);
        class628.method3590(-724138005);
        class96.method908(-65536);
        boolean var1 = false;
        for (int var2 = 0; var2 < class493.field6819; var2++) {
            int var5 = class729.field9869[var2];
            class751 var6 = (class751) class86.field1546.method1465((long) var5, -6008);
            class9 var7 = var6.field10510;
            if (class311.field4321 && class506.method2974(var5, 0)) {
                class128.method1066((byte) 84);
            }
            if (class199.field2904 != var7.field5732) {
                if (var7.field126.method2109(0)) {
                    class600.method3414(true, var7);
                }
                var7.method61(null, -2);
                var6.method2314((byte) 52);
                var1 = true;
            }
        }
        if (var1) {
            class77.field1375 = class86.field1546.method1459(1);
            class86.field1546.method1462(3, class728.field9860);
        }
        if (class57.field1142 != class149.field2477.field3109) {
            throw new RuntimeException("gnp1 pos:" + class149.field2477.field3109 + " psize:" + class57.field1142);
        }
        if (arg0 <= 47) {
            field6156 = null;
        }
        for (int var3 = 0; var3 < class738.field9939; var3++) {
            if (class86.field1546.method1465((long) class737.field9925[var3], -6008) == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class738.field9939);
            }
        }
        if ((class77.field1375 - class738.field9939) != 0) {
            throw new RuntimeException("gnp3 mis:" + (class77.field1375 - class738.field9939));
        }
        for (int var4 = 0; var4 < class77.field1375; var4++) {
            if (class199.field2904 != class728.field9860[var4].field10510.field5732) {
                throw new RuntimeException("gnp4 uk:" + class728.field9860[var4].field10510.field5716);
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V", line = 109)
    public static void method2617(int arg0) {
        field6158 = null;
        field6160 = null;
        field6156 = null;
        if (arg0 < 121) {
            method2616((byte) -72);
        }
    }
}
