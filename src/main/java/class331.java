import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class331 {

    @OriginalMember(owner = "client!om", name = "c", descriptor = "Lve;")
    public class228 field4750 = null;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "[Ldea;")
    public class405[] field4755 = null;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "[Ldea;")
    private class405[] field4751 = null;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "Z")
    public boolean field4752;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "[I")
    public static int[] field4754 = new int[1000];

    @OriginalMember(owner = "client!om", name = "f", descriptor = "[I")
    public static int[] field4753 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!om", name = "j", descriptor = "Z")
    public static boolean field4757 = false;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "F")
    public static float field4756;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
    public static void method2049(byte arg0) {
        field4754 = null;
        field4753 = null;
        if (arg0 <= 116) {
            method2050(true, null);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public static final boolean method2050(boolean arg0, String arg1) {
        field4758++;
        if (arg1 == null) {
            return false;
        }
        int var2 = 0;
        if (!arg0) {
            method2050(true, null);
        }
        while (var2 < class511.field7081) {
            if (arg1.equalsIgnoreCase(class97.field1699[var2])) {
                return true;
            }
            if (arg1.equalsIgnoreCase(class240.field3494[var2])) {
                return true;
            }
            var2++;
        }
        return false;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)Z")
    public final boolean method2051(int arg0) {
        field4749++;
        if (arg0 != 128) {
            field4756 = 0.73713875F;
        }
        if (this.field4752) {
            return this.field4750 != null;
        } else {
            return this.field4755 != null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public static final boolean method2052(String arg0, boolean arg1) {
        if (arg1) {
            field4753 = null;
        }
        field4748++;
        return class263.method1673(10, arg0, true, (byte) 120);
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lnd;)V")
    public class331(class632 arg0) {
        this.field4752 = arg0.field9072;
        if (this.field4752 && !arg0.method91(9564, class561.field8029, class343.field4922)) {
            this.field4752 = false;
        }
        if (this.field4752 || arg0.method144(-126, class343.field4922, class561.field8029)) {
            class521.method2943((byte) -111);
            if (this.field4752) {
                byte[] var6 = class191.method1265(false, class624.field8797, 64);
                this.field4750 = arg0.method136(var6, 128, 15, 16, 128, class561.field8029);
                byte[] var7 = class191.method1265(false, class139.field2193, 64);
                arg0.method136(var7, 128, 15, 16, 128, class561.field8029);
            } else {
                this.field4755 = new class405[16];
                for (int var2 = 0; var2 < 16; var2++) {
                    byte[] var5 = class409.method2483(var2 * 128 * 128 * 2, class624.field8797, -105, 32768);
                    this.field4755[var2] = arg0.method3596(128, 128, true, 0, var5, class561.field8029);
                }
                this.field4751 = new class405[16];
                for (int var3 = 0; var3 < 16; var3++) {
                    byte[] var4 = class409.method2483(var3 * 256 * 128, class139.field2193, -113, 32768);
                    this.field4751[var3] = arg0.method3596(128, 128, true, 0, var4, class561.field8029);
                }
            }
        }
    }
}
