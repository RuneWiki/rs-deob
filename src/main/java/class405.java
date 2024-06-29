import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class405 {

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "Lhm;")
    private class208 field5226 = new class208(256);

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "Le;")
    private class498 field5223;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "Lkea;")
    private class223 field5227;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "Lpfa;")
    public static class275 field5224;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)V")
    public final void method2276(byte arg0) {
        this.field5226.method1218(124);
        if (arg0 >= 3) {
            field5222++;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V")
    public final void method2277(int arg0) {
        this.field5226.method1222(arg0 ^ 0x38E1, arg0);
        field5225++;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Z)V")
    public static void method2278(boolean arg0) {
        if (!arg0) {
            field5224 = null;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZI)Lem;")
    public final class212 method2279(boolean arg0, int arg1) {
        field5221++;
        Object var3 = this.field5226.method1221((long) arg1, arg0);
        if (var3 != null) {
            return (class212) var3;
        } else if (this.field5223.method2717(arg1, false)) {
            class152 var4 = this.field5223.method2718(arg1, (byte) 72);
            int var5 = var4.field1826 ? 64 : this.field5227.field2842;
            class212 var7;
            if (var4.field1807 && this.field5227.method393()) {
                float[] var6 = this.field5223.method2716(var5, 0.7F, var5, arg1, false, -1898);
                var7 = this.field5227.method1314(var6, var5, (byte) 119, var4.field1828 != 0, class556.field6946, var5);
            } else {
                int[] var8 = var4.field1829 ? this.field5223.method2715(var5, var5, arg1, 0.7F, false, true) : this.field5223.method2714(0.7F, arg1, var5, 19991, true, var5);
                var7 = this.field5227.method1295((byte) -46, var5, var8, var5, var4.field1828 != 0);
            }
            var7.method40(var4.field1808, var4.field1812, 7220);
            this.field5226.method1230((byte) -121, (long) arg1, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lkea;Le;)V")
    public class405(class223 arg0, class498 arg1) {
        this.field5223 = arg1;
        this.field5227 = arg0;
    }
}
