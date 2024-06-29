import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class241 extends class224 {

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "Ljava/lang/String;")
    public String field3386;

    @OriginalMember(owner = "client!bj", name = "F", descriptor = "Ljh;")
    public class158 field3388;

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "I")
    public static int field3385 = 0;

    @OriginalMember(owner = "client!bj", name = "G", descriptor = "Lqaa;")
    public static class27 field3389 = new class27(46, 3);

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "I")
    public int field3382;

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!bj", name = "D", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!bj", name = "H", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lwc;B)Z")
    public final boolean method1618(class66 arg0, byte arg1) {
        field3381++;
        arg0.method1553(-125);
        boolean var3 = true;
        if (arg1 != 62) {
            method1621(false, null);
        }
        class66 var4 = (class66) this.field3388.method1196(-125);
        while (var4 != null) {
            if (class288.method1866(false, var4.field1198, arg0.field1198)) {
                class576.method3343(83, arg0, var4);
                this.field3382++;
                if (var3) {
                    return false;
                }
                return true;
            }
            var4 = (class66) this.field3388.method1204(false);
            var3 = false;
        }
        this.field3388.method1203(arg0, -101);
        this.field3382++;
        return var3;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public static void method1619(int arg0) {
        field3389 = null;
        if (arg0 != -1) {
            field3385 = -13;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILwc;)Z")
    public final boolean method1620(int arg0, class66 arg1) {
        if (arg0 != -19049) {
            field3385 = -34;
        }
        field3384++;
        int var3 = this.method1622(-1);
        arg1.method1553(95);
        this.field3382--;
        if (this.field3382 != 0) {
            return this.method1622(arg0 ^ 0x4A68) != var3;
        }
        this.method3617(1);
        this.method1553(75);
        class173.field2513--;
        class143.field2191.method3047(false, this, arg1.field1193);
        return false;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z[B)[B")
    public static final byte[] method1621(boolean arg0, byte[] arg1) {
        field3383++;
        if (!arg0) {
            method1621(true, null);
        }
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class622.method3597(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "(I)I")
    public final int method1622(int arg0) {
        if (arg0 != -1) {
            field3390 = 62;
        }
        field3387++;
        return this.field3388.field2357.field3201 == this.field3388.field2357 ? -1 : ((class66) this.field3388.field2357.field3201).field1198;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class241(String arg0) {
        this.field3386 = arg0;
        this.field3388 = new class158();
    }
}
