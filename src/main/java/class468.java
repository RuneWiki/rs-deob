import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class468 {

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "Lu;")
    public static class69 field6362;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 8)
    public static void method2641(int arg0) {
        field6362 = null;
        int var1 = -95 / ((arg0 + 53) / 38);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZI)V", line = 19)
    public static final void method2642(boolean arg0, int arg1) {
        field6360++;
        class353.field5161 = 0;
        class43.field557 = 0;
        class259.method1625(23727);
        class188.method1203(arg0, (byte) -119);
        class104.method561(124);
        boolean var2 = false;
        for (int var3 = arg1; var3 < class43.field557; var3++) {
            int var5 = class572.field7921[var3];
            class637 var6 = (class637) class77.field955.method2506(59, (long) var5);
            class676 var7 = var6.field8702;
            if (class483.field6542 && class346.method2171(var5, -5)) {
                class477.method2671(7);
            }
            if (class430.field5984 != var7.field428) {
                if (var7.field9594.method1251((byte) -127)) {
                    class509.method2879(arg1 ^ 0xFFFFFFC4, var7);
                }
                var7.method3740(null, -30929);
                var6.method175(30604);
                var2 = true;
            }
        }
        if (var2) {
            class327.field4786 = class77.field955.method2505(-5643);
            class77.field955.method2500(23557, class42.field541);
        }
        if (class161.field2037 != class164.field2068.field1745) {
            throw new RuntimeException("gnp1 pos:" + class164.field2068.field1745 + " psize:" + class161.field2037);
        }
        for (int var4 = 0; var4 < class306.field4106; var4++) {
            if (class77.field955.method2506(89, (long) class690.field9742[var4]) == null) {
                throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class306.field4106);
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIBII)V", line = 91)
    public static final void method2643(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        if (arg5 != -6) {
            return;
        }
        field6361++;
        int var8 = arg0 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = class643.field9115 + ((class530.field7330 - class643.field9115) * var8 / 100);
        int var10 = arg3 * var9 >> 8;
        int var11 = 16384 - arg7 & 0x3FFF;
        int var12 = 16384 - arg6 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class654.field9259[var11] * -var10 >> 14;
            var15 = class654.field9260[var11] * var10 >> 14;
        }
        if (var12 != 0) {
            var13 = class654.field9259[var12] * var15 >> 14;
            var15 = class654.field9260[var12] * var15 >> 14;
        }
        class628.field8545 = arg2 - var14;
        class336.field4947 = arg7;
        class132.field1679 = arg1 - var13;
        class253.field3493 = 0;
        class261.field3603 = arg6;
        class471.field6379 = arg4 - var15;
    }
}
