import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class219 extends class540 {

    @OriginalMember(owner = "client!su", name = "p", descriptor = "I")
    public static int field3127 = 0;

    @OriginalMember(owner = "client!su", name = "j", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field3121 = new Hashtable();

    @OriginalMember(owner = "client!su", name = "q", descriptor = "Lpg;")
    public static class762 field3128 = new class762();

    @OriginalMember(owner = "client!su", name = "s", descriptor = "[I")
    public static int[] field3130 = new int[1000];

    @OriginalMember(owner = "client!su", name = "i", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!su", name = "k", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!su", name = "m", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!su", name = "r", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!su", name = "l", descriptor = "J")
    public long field3123;

    @OriginalMember(owner = "client!su", name = "n", descriptor = "Lsu;")
    public class219 field3125;

    @OriginalMember(owner = "client!su", name = "o", descriptor = "Lsu;")
    public class219 field3126;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)V")
    public final void method1512(boolean arg0) {
        field3124++;
        if (this.field3125 == null) {
            return;
        }
        this.field3125.field3126 = this.field3126;
        this.field3126.field3125 = this.field3125;
        this.field3126 = null;
        this.field3125 = null;
        if (arg0) {
            method1513(-95);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)V")
    public static void method1513(int arg0) {
        if (arg0 != -3520) {
            method1514(null, (byte) 39);
        }
        field3128 = null;
        field3121 = null;
        field3130 = null;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lkv;B)V")
    public static final void method1514(class280 arg0, byte arg1) {
        field3120++;
        if (arg1 != -101) {
            field3129 = -9;
        }
        if (class609.field8601 == null) {
            class133 var2 = new class133();
            byte[] var3 = var2.method948(128, 128, 16, (byte) -86);
            class609.field8601 = class687.method3876(var3, false, arg1 - 36);
        }
        if (class724.field10156 == null) {
            class188 var4 = new class188();
            byte[] var5 = var4.method1391(-1, 16, 128, 128);
            class724.field10156 = class687.method3876(var5, false, -137);
        }
        class327 var6 = arg0.field4168;
        if (var6.method2118((byte) 124) && class367.field5286 == null) {
            byte[] var7 = class715.method4043(4.0F, (byte) -46, 128, 0.5F, new class780(419684), 8, 0.6F, 16, 16.0F, 128, 4.0F);
            class367.field5286 = class687.method3876(var7, false, arg1 ^ 0xEC);
        }
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(B)Z")
    public final boolean method1515(byte arg0) {
        field3122++;
        if (arg0 != 73) {
            this.field3126 = null;
        }
        return this.field3125 != null;
    }
}
