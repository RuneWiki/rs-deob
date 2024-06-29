import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class745 {

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "Lhda;")
    public static class752 field10374 = new class752(49, 6);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field10373;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field10375;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field10376;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field10377;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)Z", line = 4)
    public static final boolean method4176(int arg0, int arg1) {
        if (arg0 == -6) {
            field10377++;
            return arg1 == 3 || arg1 == 4 || arg1 == 5 || arg1 == 6;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V", line = 15)
    public static void method4177(boolean arg0) {
        field10374 = null;
        if (arg0) {
            field10374 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V", line = 32)
    public static final void method4178(int arg0) {
        field10373++;
        class69.field845.method2801(false);
        class708.field9822.method2952((byte) -105);
        class210.field3095.method3983(arg0 ^ 0x3CA4);
        class462.field6333.method2011(true);
        class292.field4177.method2350((byte) 113);
        class77.field948.method1168((byte) 98);
        class509.field6780.method660(false);
        class226.field3216.method3925(false);
        class224.field3172.method2586((byte) -81);
        class70.field854.method4075(5049);
        class372.field5174.method3206((byte) 109);
        class468.field6426.method1622((byte) -64);
        class361.field5088.method3196((byte) -68);
        class21.field391.method1768(-126);
        class505.field6754.method4150(arg0 + 32371);
        class2.field26.method3687((byte) 121);
        class137.field2187.method2704((byte) -104);
        class538.field7087.method965((byte) -114);
        class202.field3024.method2732(-1);
        class417.field5754.method1212(-87);
        class468.field6422.method1553((byte) -109);
        class480.method2702((byte) 17);
        class557.method3102(arg0 + 32366);
        class290.method1799(-62);
        class116.method956(0);
        if (arg0 != -32492) {
            return;
        }
        class334.method2014(false);
        class34.field503.method558(0);
        class384.field5375.method558(0);
        class99.field1271.method558(0);
        class635.field8452.method558(0);
        class182.field2738.method558(0);
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V", line = 76)
    public static final void method4179(int arg0) {
        class446.field6124 = 0;
        class252.field3472 = 0;
        field10375++;
        if (arg0 > -22) {
            return;
        }
        for (int var1 = 0; var1 < class176.field2654; var1++) {
            int var2 = class237.field3335 * var1;
            for (int var3 = 0; var3 < class237.field3335; var3++) {
                int var4 = var2 + var3;
                class550.field7256[var4].method233(class300.field4261 * var3, class296.field4227 * var1, class300.field4261, class296.field4227, 0, 0, true, true);
            }
        }
    }
}
