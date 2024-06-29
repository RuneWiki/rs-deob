import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class33 extends class164 {

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
    public static int field667 = 0;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "Lpe;")
    public static class564 field669 = new class564();

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "F")
    public static float field672;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "Luh;")
    public static class149 field673;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "Lwaa;")
    private class652 field664;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)V")
    public static void method405(int arg0) {
        int var1 = -112 / ((arg0 + 62) / 50);
        field669 = null;
        field673 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IBI)I")
    public final int method406(int arg0, byte arg1, int arg2) {
        field671++;
        if (arg1 != 100) {
            field673 = null;
        }
        if (this.field664 == null) {
            return arg0;
        } else {
            class556 var4 = (class556) this.field664.method3678((long) arg2, arg1 ^ 0xFFFFFFEC);
            return var4 == null ? arg0 : var4.field8043;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIB)Z")
    public static final boolean method407(int arg0, int arg1, byte arg2) {
        if (arg2 != -115) {
            field669 = null;
        }
        field666++;
        return (arg1 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLun;)V")
    public final void method408(byte arg0, class389 arg1) {
        while (true) {
            int var3 = arg1.method2229(255);
            if (var3 == 0) {
                field665++;
                if (arg0 != -59) {
                    this.method410(50, 49, null);
                    return;
                }
                return;
            }
            this.method410(6864, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
    public final String method409(int arg0, int arg1, String arg2) {
        field670++;
        if (this.field664 == null) {
            return arg2;
        } else {
            class374 var4 = (class374) this.field664.method3678((long) arg0, -124);
            int var5 = -36 / ((15 - arg1) / 63);
            return var4 == null ? arg2 : var4.field5035;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILun;)V")
    private final void method410(int arg0, int arg1, class389 arg2) {
        field668++;
        if (arg1 == 249) {
            int var4 = arg2.method2229(arg0 ^ 0x1A2F);
            if (this.field664 == null) {
                int var5 = class698.method3915(var4, (byte) 93);
                this.field664 = new class652(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method2229(255) == 1;
                int var8 = arg2.method2258(-3);
                class513 var9;
                if (var7) {
                    var9 = new class374(arg2.method2244((byte) -63));
                } else {
                    var9 = new class556(arg2.method2255(arg0 - 6609));
                }
                this.field664.method3670((long) var8, var9, (byte) 127);
            }
        }
        if (arg0 != 6864) {
            this.method409(-39, -112, null);
        }
    }
}
