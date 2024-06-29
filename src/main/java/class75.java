import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class75 {

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "Lpa;")
    private class387 field1007 = new class387(16);

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "Lcb;")
    private class544 field1014;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "[I")
    public static int[] field1008 = new int[13];

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field1009 = 0;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)Z")
    public static final boolean method584(int arg0, int arg1, int arg2) {
        field1002++;
        if (arg1 >= -65) {
            field1009 = 35;
        }
        return (arg0 & 0x800) != 0 && (arg2 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V")
    public final void method585(int arg0, int arg1) {
        class387 var3 = this.field1007;
        synchronized (this.field1007) {
            this.field1007.method2366(arg0, 109);
            if (arg1 != -11649) {
                field1008 = null;
            }
        }
        field1012++;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BI)Lpaa;")
    public final class648 method586(byte arg0, int arg1) {
        field1010++;
        class387 var3 = this.field1007;
        class648 var4;
        synchronized (this.field1007) {
            var4 = (class648) this.field1007.method2373((long) arg1, 103);
        }
        if (var4 != null) {
            return var4;
        }
        class544 var5 = this.field1014;
        byte[] var6;
        synchronized (this.field1014) {
            var6 = this.field1014.method3150(arg1, -69, 30);
        }
        int var7 = 44 % ((32 - arg0) / 61);
        class648 var8 = new class648();
        if (var6 != null) {
            var8.method3702(-28559, new class120(var6));
        }
        class387 var9 = this.field1007;
        synchronized (this.field1007) {
            this.field1007.method2362(var8, 0, (long) arg1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public final void method587(int arg0) {
        class387 var2 = this.field1007;
        synchronized (this.field1007) {
            this.field1007.method2369(-1);
        }
        field1004++;
        int var3 = -10 % ((arg0 - 34) / 36);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
    public static void method588(boolean arg0) {
        if (!arg0) {
            field1008 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(Z)V")
    public final void method589(boolean arg0) {
        if (arg0) {
            return;
        }
        class387 var2 = this.field1007;
        synchronized (this.field1007) {
            this.field1007.method2364(1);
        }
        field1005++;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Liv;ILcb;)V")
    public class75(class106 arg0, int arg1, class544 arg2) {
        this.field1014 = arg2;
        this.field1014.method3147(30, 87);
    }
}
