import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class329 extends class365 {

    @OriginalMember(owner = "client!gq", name = "H", descriptor = "Ljava/lang/Object;")
    private Object field4854;

    @OriginalMember(owner = "client!gq", name = "D", descriptor = "J")
    public static long field4851 = 0L;

    @OriginalMember(owner = "client!gq", name = "B", descriptor = "Z")
    public static boolean field4849 = false;

    @OriginalMember(owner = "client!gq", name = "C", descriptor = "[I")
    public static int[] field4850 = new int[50];

    @OriginalMember(owner = "client!gq", name = "I", descriptor = "I")
    public static int field4855 = 0;

    @OriginalMember(owner = "client!gq", name = "L", descriptor = "[Lfb;")
    public static class341[] field4858 = new class341[2048];

    @OriginalMember(owner = "client!gq", name = "z", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!gq", name = "A", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!gq", name = "E", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!gq", name = "G", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!gq", name = "J", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!gq", name = "K", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lbc;Ljava/lang/Object;)V")
    public class329(class103 arg0, Object arg1) {
        super(arg0);
        this.field4854 = arg1;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method2155(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4852++;
        if ((class406.field5912[0][arg3][arg1] & 0x2) != 0) {
            return true;
        } else if ((arg0 & class406.field5912[arg2][arg3][arg1]) == 0) {
            return class114.method838(arg3, arg2, arg1, arg0 - 16) == arg4;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IB)V")
    public static final void method2156(int arg0, byte arg1) {
        field4856++;
        class51 var2 = class195.field2699;
        synchronized (class195.field2699) {
            class195.field2699.method379(arg0, false);
            if (arg1 > -47) {
                field4858 = null;
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(Z)V")
    public static void method2157(boolean arg0) {
        field4858 = null;
        field4850 = null;
        if (!arg0) {
            field4851 = -95L;
        }
    }

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1342(int arg0) {
        if (arg0 != 16034) {
            method2158(false, (class418) null, (class418) null);
        }
        field4853++;
        return this.field4854;
    }

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "(B)Z")
    public final boolean method1343(byte arg0) {
        int var2 = 77 % ((45 - arg0) / 36);
        field4847++;
        return false;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZLob;Lob;)V")
    public static final void method2158(boolean arg0, class418 arg1, class418 arg2) {
        field4848++;
        if (arg2.field6090 != null) {
            arg2.method2632(true);
        }
        if (!arg0) {
            field4850 = null;
        }
        arg2.field6090 = arg1.field6090;
        arg2.field6094 = arg1;
        arg2.field6090.field6094 = arg2;
        arg2.field6094.field6090 = arg2;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)I")
    public static final int method2159(int arg0, int arg1, int arg2) {
        field4857++;
        int var3 = arg1 >> 31 & arg0 - 1;
        if (arg2 > -91) {
            field4850 = null;
        }
        return ((arg1 >>> 31) + arg1) % arg0 + var3;
    }
}
