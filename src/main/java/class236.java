import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class236 extends class416 {

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "Ljava/lang/String;")
    public String field3320;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "Ldr;")
    public class721 field3322;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "I")
    public static int field3316 = 0;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
    public int field3323;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "Lwu;")
    public static class376 field3314;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "[[I")
    public static int[][] field3318;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(Z)V")
    public static void method1483(boolean arg0) {
        if (arg0) {
            field3316 = 24;
        }
        field3318 = null;
        field3314 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lli;B)Z")
    public final boolean method1484(class433 arg0, byte arg1) {
        field3319++;
        if (arg1 != 86) {
            this.field3323 = -3;
        }
        arg0.method2414((byte) -26);
        boolean var3 = true;
        for (class433 var4 = (class433) this.field3322.method4051(arg1 ^ 0x3D6); var4 != null; var4 = (class433) this.field3322.method4049(true)) {
            if (class294.method1822(arg0.field5963, 0, var4.field5963)) {
                class328.method1985(var4, (byte) -49, arg0);
                this.field3323++;
                if (var3) {
                    return false;
                }
                return true;
            }
            var3 = false;
        }
        this.field3322.method4050(arg0, -126);
        this.field3323++;
        return var3;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)I")
    public final int method1485(int arg0) {
        if (arg0 < 105) {
            this.method1484(null, (byte) 58);
        }
        field3321++;
        return this.field3322.field10032.field5748 == this.field3322.field10032 ? -1 : ((class433) this.field3322.field10032.field5748).field5963;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class236(String arg0) {
        this.field3320 = arg0;
        this.field3322 = new class721();
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lli;I)Z")
    public final boolean method1486(class433 arg0, int arg1) {
        field3317++;
        if (arg1 != 0) {
            field3314 = null;
        }
        int var3 = this.method1485(arg1 + 123);
        arg0.method2414((byte) -26);
        this.field3323--;
        if (this.field3323 != 0) {
            return var3 != this.method1485(arg1 ^ 0x7A);
        }
        this.method3564(true);
        this.method2414((byte) -26);
        class172.field2634--;
        class525.field6962.method556((byte) 0, arg0.field5958, this);
        return false;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lvfa;I)V")
    public static final void method1487(class672 arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        field3315++;
        class672 var2 = class442.method2542(false, arg0);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class228.field3251;
            var4 = class199.field2993;
        } else {
            var3 = var2.field9287;
            var4 = var2.field9178;
        }
        class505.method2839(arg0, (byte) 13, false, var3, var4);
        class339.method2035(arg0, var3, var4, -49);
    }
}
