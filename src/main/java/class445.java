import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class445 {

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "Ldl;")
    public class62 field6446 = null;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "[Lwn;")
    public class720[] field6444 = null;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "[Lwn;")
    public class720[] field6445 = null;

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "Ldl;")
    public class62 field6447 = null;

    @OriginalMember(owner = "client!pr", name = "k", descriptor = "Ldl;")
    public class62 field6452 = null;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "Z")
    public boolean field6443;

    @OriginalMember(owner = "client!pr", name = "i", descriptor = "Lsq;")
    public static class178 field6450 = new class178(7, 0, 1, 1);

    @OriginalMember(owner = "client!pr", name = "j", descriptor = "Lpia;")
    public static class94 field6451 = new class94(32, 3);

    @OriginalMember(owner = "client!pr", name = "l", descriptor = "Ldh;")
    public static class320 field6453 = new class320(66, 8);

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "I")
    public static int field6448;

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "Llu;")
    public static class711 field6442;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
    public static final void method2760(int arg0) {
        class265.method1598(-23030);
        field6448++;
        if (arg0 >= -95) {
            method2761(78, (byte) 61);
        }
        class397.field5443 = false;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IB)V")
    public static final void method2761(int arg0, byte arg1) {
        class430.method2692(arg1 ^ 0xFFFFFFED);
        if (arg1 != -17) {
            return;
        }
        field6449++;
        int var2 = class422.field6147.method1993((byte) -81, arg0).field1808;
        if (var2 == 0) {
            return;
        }
        int var3 = class722.field10125.field10073[arg0];
        if (var2 == 5) {
            class574.field8142 = var3;
        }
        if (var2 == 6) {
            class198.field2318 = var3;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V")
    public static void method2762(boolean arg0) {
        field6451 = null;
        field6453 = null;
        if (!arg0) {
            field6442 = null;
        }
        field6450 = null;
        field6442 = null;
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lnv;)V")
    public class445(class417 arg0) {
        this.field6443 = arg0.field6049;
        class729.method4069(-111, arg0);
        if (this.field6443) {
            byte[] var6 = class511.method3018((byte) -72, class146.field1621, false);
            this.field6452 = new class62(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class511.method3018((byte) -72, class294.field3620, false);
            this.field6447 = new class62(arg0, 6410, 128, 128, 16, var7, 6410);
            class712 var8 = arg0.field5914;
            if (var8.method3985(89)) {
                byte[] var9 = class511.method3018((byte) -72, class336.field4321, false);
                this.field6446 = new class62(arg0, 6408, 128, 128, 16);
                class62 var10 = new class62(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method3984(this.field6446, -108, var10, 2.0F)) {
                    this.field6446.method1741((byte) -123);
                } else {
                    this.field6446.method1736(-30119);
                    this.field6446 = null;
                }
                var10.method1736(-30119);
            }
        } else {
            this.field6444 = new class720[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class1.method2(var2 * 128 * 2 * 128, 32768, class146.field1621, (byte) -7);
                this.field6444[var2] = new class720(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field6445 = new class720[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class1.method2(var3 * 128 * 128 * 2, 32768, class294.field3620, (byte) -7);
                this.field6445[var3] = new class720(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }
}
