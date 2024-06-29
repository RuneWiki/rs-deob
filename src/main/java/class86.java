import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class86 extends class513 {

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "Ljava/lang/String;")
    public String field1188;

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "Lbfa;")
    public static class574 field1191 = new class574();

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "[I")
    public static int[] field1193;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(BC)Z")
    public static final boolean method523(byte arg0, char arg1) {
        int var2 = 32 / ((arg0 - 28) / 46);
        field1192++;
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lwu;III)Lkda;")
    public static final class64 method524(class557 arg0, int arg1, int arg2, int arg3) {
        field1190++;
        if (arg2 == -66) {
            byte[] var4 = arg0.method3322(arg1, arg3, (byte) 113);
            return var4 == null ? null : new class64(var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "()V")
    public class86() {
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(III)V")
    public static final void method525(int arg0, int arg1, int arg2) {
        if (arg0 >= -86) {
            method524(null, 108, 56, -99);
        }
        field1189++;
        class118 var3 = class126.method814(true, arg2, 17);
        var3.method771(-30559);
        var3.field1636 = arg1;
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class86(String arg0, int arg1) {
        this.field1188 = arg0;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
    public static void method526(int arg0) {
        field1193 = null;
        field1191 = null;
        if (arg0 > -107) {
            field1193 = null;
        }
    }
}
