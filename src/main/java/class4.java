import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class4 extends class128 {

    @OriginalMember(owner = "client!lo", name = "F", descriptor = "[B")
    public byte[] field60;

    @OriginalMember(owner = "client!lo", name = "y", descriptor = "Ltm;")
    public static class79 field54 = new class79(16);

    @OriginalMember(owner = "client!lo", name = "E", descriptor = "I")
    public static int field59 = 0;

    @OriginalMember(owner = "client!lo", name = "A", descriptor = "Lul;")
    public static class51 field56 = new class51(64);

    @OriginalMember(owner = "client!lo", name = "H", descriptor = "[I")
    public static int[] field62 = new int[50];

    @OriginalMember(owner = "client!lo", name = "z", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!lo", name = "B", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!lo", name = "C", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!lo", name = "G", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!lo", name = "J", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!lo", name = "I", descriptor = "[Lwb;")
    public static class171[] field63;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "(I)V", line = 13)
    public static final void method21(int arg0) {
        field64++;
        if (arg0 == 64) {
            class341.field5438.method466(arg0 - 65);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lcg;Lco;BLcg;Lcg;)Z", line = 27)
    public static final boolean method22(class49 arg0, class107 arg1, byte arg2, class49 arg3, class49 arg4) {
        class339.field5417 = arg0;
        field57++;
        class69.field1128 = arg1;
        class171.field2960 = arg3;
        class279.field4425 = arg4;
        if (arg2 != 68) {
            method22((class49) null, (class107) null, (byte) -68, (class49) null, (class49) null);
        }
        return true;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IB)Lwa;", line = 46)
    public static final class92 method23(int arg0, byte arg1) {
        field55++;
        class92 var2 = (class92) class310.field4908.method467(true, (long) arg0);
        if (arg1 >= -40) {
            field62 = (int[]) null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class213.field3585.method441(false, 33, arg0);
        class92 var4 = new class92();
        if (var3 != null) {
            var4.method802(new class336(var3), arg0, (byte) 126);
        }
        class310.field4908.method465(var4, (long) arg0, (byte) 90);
        return var4;
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "([B)V", line = 69)
    public class4(byte[] arg0) {
        this.field60 = arg0;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZII)V", line = 79)
    public static final void method24(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method22((class49) null, (class107) null, (byte) -44, (class49) null, (class49) null);
        }
        field61++;
        int var3 = class51.field796 * arg1 >> 8;
        if (arg2 == -1 && !class185.field3137) {
            class101.method874(-1);
        } else if (arg2 != -1 && (class131.field2254 != arg2 || !class158.method1263((byte) -20)) && var3 != 0 && !class185.field3137) {
            class242.method1698(var3, 0, false, class179.field3030, -3, 2, arg2);
        }
        class131.field2254 = arg2;
    }

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "(I)V", line = 108)
    public static void method25(int arg0) {
        field56 = null;
        if (arg0 != -1) {
            field54 = (class79) null;
        }
        field63 = null;
        field62 = null;
        field54 = null;
    }
}
