import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class158 {

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    public int field2235 = -1;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public int field2240 = -1;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public static int field2236 = 0;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "[I")
    public static int[] field2241 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    public static int field2243 = 16777215;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "[I")
    public int[] field2242;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lra;I)V", line = 19)
    public static final void method1037(class57 arg0, int arg1) {
        int var2 = 47 / ((-arg1 - 10) / 61);
        class51.field587 = arg0;
        field2244++;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILbk;Z)V", line = 30)
    public final void method1038(int arg0, class211 arg1, boolean arg2) {
        if (arg2) {
            this.field2235 = 117;
        }
        field2239++;
        while (true) {
            int var4 = arg1.method1342((byte) -127);
            if (var4 == 0) {
                return;
            }
            this.method1039(var4, arg0, (byte) -127, arg1);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIBLbk;)V", line = 62)
    private final void method1039(int arg0, int arg1, byte arg2, class211 arg3) {
        field2246++;
        if (arg0 == 1) {
            this.field2235 = arg3.method1355(32136);
        } else if (arg0 == 2) {
            this.field2242 = new int[arg3.method1342((byte) -126)];
            for (int var5 = 0; var5 < this.field2242.length; var5++) {
                this.field2242[var5] = arg3.method1355(32136);
            }
        } else if (arg0 == 3) {
            this.field2240 = arg3.method1342((byte) -128);
        }
        int var6 = -74 % ((arg2 + 60) / 46);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZ)Lja;", line = 104)
    public static final class152 method1040(int arg0, boolean arg1) {
        field2237++;
        class331 var2 = class402.field5855;
        class152 var3;
        synchronized (class402.field5855) {
            var3 = (class152) class402.field5855.method2049(-53, (long) arg0);
            if (var3 == null) {
                var3 = new class152(arg0);
                class402.field5855.method2046((long) arg0, 0, var3);
            }
        }
        synchronized (var3) {
            if (var3.method912(14338)) {
                if (arg1) {
                    method1041(58);
                }
                return var3;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V", line = 132)
    public static void method1041(int arg0) {
        if (arg0 > -124) {
            field2243 = -124;
        }
        field2241 = null;
    }
}
