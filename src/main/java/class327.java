import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class327 {

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "F")
    public static float field4768 = 1024.0F;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public int field4763;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public int field4767;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public int field4771;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "[I")
    public static int[] field4764;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)I", line = 7)
    public static final int method1968(int arg0) {
        field4765++;
        if (arg0 == -27435) {
            class174 var1 = class311.field4524;
            synchronized (class311.field4524) {
                return class311.field4524.method1089(88);
            }
        } else {
            return 7;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V", line = 23)
    public static void method1969(int arg0) {
        int var1 = 101 % ((arg0 + 42) / 32);
        field4764 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lwm;B)V", line = 37)
    public final void method1970(class403 arg0, byte arg1) {
        field4770++;
        if (arg1 != -99) {
            return;
        }
        while (true) {
            int var3 = arg0.method2357((byte) 107);
            if (var3 == 0) {
                return;
            }
            this.method1971(arg0, (byte) -100, var3);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lwm;BI)V", line = 58)
    private final void method1971(class403 arg0, byte arg1, int arg2) {
        int var4 = 93 / ((-arg1 - 47) / 35);
        if (arg2 == 1) {
            this.field4763 = arg0.method2338(0);
            this.field4767 = arg0.method2357((byte) 119);
            this.field4771 = arg0.method2357((byte) 116);
        }
        field4772++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)[B", line = 80)
    public static final byte[] method1972(int arg0, byte arg1) {
        field4766++;
        if (arg1 != -7) {
            return null;
        }
        class383 var2 = (class383) class307.field4454.method1781(false, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class119.method802(0, var7, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class383(var3);
            class307.field4454.method1779(var2, (byte) -27, (long) arg0);
        }
        return var2.field5391;
    }
}
