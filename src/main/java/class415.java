import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class415 {

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public int field5871;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "Ldda;")
    private class349 field5870;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "Lmq;")
    public static class472 field5866 = new class472(20);

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field5868;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field5869;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "Lbda;")
    public static class469 field5873;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "[I")
    public static int[] field5874;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IBI)V", line = 4)
    public static final void method2490(int arg0, byte arg1, int arg2) {
        if (class599.field8643 != arg0) {
            class152.field1879 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class152.field1879[var3] = (var3 << 12) / arg0;
            }
            class276.field3782 = arg0 - 1;
            class693.field9857 = arg0 * 32;
            class599.field8643 = arg0;
        }
        if (arg1 != 33) {
            method2490(-125, (byte) -12, -94);
        }
        field5868++;
        if (class365.field4914 == arg2) {
            return;
        }
        if (class599.field8643 == arg2) {
            class562.field8114 = class152.field1879;
        } else {
            class562.field8114 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class562.field8114[var4] = (var4 << 12) / arg2;
            }
        }
        class206.field2474 = arg2 - 1;
        class365.field4914 = arg2;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 53)
    public static final void method2491(int arg0) {
        field5867++;
        if (arg0 <= 45) {
            method2493(false, (byte) -55);
        }
        if (!class99.field1336) {
            return;
        }
        class17 var1 = class346.method1981(class391.field5243, class386.field5147, (byte) -118);
        if (var1 != null && var1.field407 != null) {
            class143 var2 = new class143();
            var2.field1789 = var1;
            var2.field1786 = var1.field407;
            class545.method3204(var2);
        }
        class282.field3819 = -1;
        class99.field1336 = false;
        class10.field99 = -1;
        if (var1 != null) {
            class314.method1836(var1, false);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V", line = 87)
    public static void method2492(boolean arg0) {
        field5866 = null;
        field5874 = null;
        if (!arg0) {
            field5873 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "finalize", descriptor = "()V", line = 102)
    protected final void finalize() throws Throwable {
        field5869++;
        this.field5870.method1988(74, this.field5871);
        super.finalize();
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Ldda;II)V", line = 115)
    public class415(class349 arg0, int arg1, int arg2) {
        this.field5871 = arg2;
        this.field5870 = arg0;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZB)V", line = 126)
    public static final void method2493(boolean arg0, byte arg1) {
        class317.method1849(-1);
        field5872++;
        if (!class506.method2995((byte) 99, class114.field1485)) {
            return;
        }
        class634.field9102++;
        int var2 = -37 % ((-arg1 - 45) / 63);
        if (class634.field9102 < 50 && !arg0) {
            return;
        }
        class634.field9102 = 0;
        if (!class52.field847 && class489.field6835 != null) {
            class611.field8765++;
            class543 var3 = class299.method1780(class84.field1196, class90.field1262, 34);
            class511.method3028(7482, var3);
            try {
                class238.method1462(39);
            } catch (IOException var4) {
                class52.field847 = true;
            }
        }
        class317.method1849(-1);
    }
}
