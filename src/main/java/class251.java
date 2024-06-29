import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class251 implements Runnable {

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "Z")
    public boolean field3994 = true;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "Ljava/lang/Object;")
    public Object field3996 = new Object();

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "[I")
    public int[] field3999 = new int[500];

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "[I")
    public int[] field4000 = new int[500];

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public int field4001 = 0;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "Z")
    public static boolean field3993 = false;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "[I")
    public static int[] field3992 = new int[32];

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!bh", name = "run", descriptor = "()V", line = 4)
    public final void run() {
        while (this.field3994) {
            Object var1 = this.field3996;
            synchronized (this.field3996) {
                if (this.field4001 < 500) {
                    this.field3999[this.field4001] = class129.field1929;
                    this.field4000[this.field4001] = class53.field789;
                    this.field4001++;
                }
            }
            class300.method2068(122, 50L);
        }
        field3995++;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIZI)I", line = 31)
    public static final int method1776(int arg0, int arg1, boolean arg2, int arg3) {
        field3998++;
        if ((class126.field1879[arg1][arg0][arg3] & 0x8) != 0) {
            return 0;
        } else if (arg1 <= 0 || (class126.field1879[1][arg0][arg3] & 0x2) == 0) {
            return arg2 ? arg1 : -99;
        } else {
            return arg1 - 1;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBI)V", line = 65)
    public static final void method1777(int arg0, byte arg1, int arg2) {
        field3989++;
        class46 var3 = class195.method1396(5, arg0, false);
        var3.method337(arg1 ^ 0xFFFFFF96);
        var3.field721 = arg2;
        if (arg1 != -106) {
            field3992 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)I", line = 89)
    public static final int method1778(int arg0) {
        field3991++;
        return arg0 > -18 ? -14 : class144.field2198;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V", line = 102)
    public static void method1779(byte arg0) {
        field3992 = null;
        if (arg0 != 6) {
            method1776(50, 37, true, -46);
        }
    }
}
