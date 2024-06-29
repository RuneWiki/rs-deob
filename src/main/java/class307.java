import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class307 implements class477 {

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public int field4830;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "[I")
    public static int[] field4829 = new int[1];

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "Lor;")
    public static class594 field4831 = new class594();

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "[Lvc;")
    public static class291[] field4837 = new class291[75];

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "[[B")
    public static byte[][] field4835;

    @OriginalMember(owner = "client!jo", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field4834++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V", line = 20)
    public static void method2121(int arg0) {
        field4835 = null;
        field4831 = null;
        field4837 = null;
        if (arg0 != 1) {
            field4835 = null;
        }
        field4829 = null;
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 35)
    public class307(String arg0, int arg1) {
        this.field4830 = arg1;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILjava/lang/String;B)V", line = 45)
    public static final void method2122(int arg0, String arg1, byte arg2) {
        field4832++;
        if (arg2 > 101) {
            class247.method1763("", "", arg1, false, 0, arg0, "");
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZC)Z", line = 63)
    public static final boolean method2123(boolean arg0, char arg1) {
        field4833++;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class531.method3211(-111, arg1)) {
            return true;
        } else {
            char[] var2 = class138.field2339;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            if (arg0) {
                method2123(true, 'g');
            }
            char[] var4 = class283.field4519;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            return false;
        }
    }
}
