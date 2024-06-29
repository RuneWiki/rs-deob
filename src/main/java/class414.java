import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class414 extends class61 {

    @OriginalMember(owner = "client!jk", name = "T", descriptor = "Ljava/lang/Object;")
    private Object field5826;

    @OriginalMember(owner = "client!jk", name = "M", descriptor = "Lku;")
    public static class232 field5819 = new class232(8);

    @OriginalMember(owner = "client!jk", name = "R", descriptor = "J")
    public static long field5824 = 0L;

    @OriginalMember(owner = "client!jk", name = "N", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!jk", name = "P", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!jk", name = "Q", descriptor = "I")
    public static int field5823;

    @OriginalMember(owner = "client!jk", name = "S", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!jk", name = "U", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!jk", name = "O", descriptor = "Lb;")
    public static class201 field5821;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "(B)V")
    public static void method2442(byte arg0) {
        field5819 = null;
        field5821 = null;
        if (arg0 != -36) {
            field5819 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method2443(boolean arg0, String arg1) {
        if (class118.field1487 == null) {
            class273.method1675(true);
        }
        field5825++;
        String[] var2 = class193.method1192('\n', 0, arg1);
        if (arg0) {
            method2442((byte) -124);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class377.field5435; var4 > 0; var4--) {
                class118.field1487[var4] = class118.field1487[var4 - 1];
            }
            class118.field1487[0] = var2[var3];
            if (class377.field5435 < class118.field1487.length - 1) {
                if (class411.field5764 > 0) {
                    class411.field5764++;
                }
                class377.field5435++;
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lck;B)V")
    public static final void method2444(class419 arg0, byte arg1) {
        field5820++;
        if (arg1 < 117) {
            field5821 = null;
        }
        for (int var2 = 0; var2 < class201.field2946; var2++) {
            int var3 = class191.field2846[var2];
            class452 var4 = class124.field1559[var3];
            int var5 = arg0.method1701(-23121);
            if ((var5 & 0x4) != 0) {
                var5 += arg0.method1701(-23121) << 8;
            }
            class51.method327(var4, var3, -14308, arg0, var5);
        }
    }

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "(B)Ljava/lang/Object;")
    public final Object method381(byte arg0) {
        if (arg0 > -4) {
            field5822 = -68;
        }
        field5823++;
        return this.field5826;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class414(Object arg0, int arg1) {
        super(arg1);
        this.field5826 = arg0;
    }

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "(B)Z")
    public final boolean method380(byte arg0) {
        field5827++;
        int var2 = 14 / ((-arg0 - 26) / 63);
        return false;
    }
}
