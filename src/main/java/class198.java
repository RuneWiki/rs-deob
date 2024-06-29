import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class198 implements Runnable {

    @OriginalMember(owner = "client!se", name = "k", descriptor = "Z")
    public boolean field3521 = true;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "Ljava/lang/Object;")
    public Object field3528 = new Object();

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public int field3529 = 0;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "[I")
    public int[] field3531 = new int[500];

    @OriginalMember(owner = "client!se", name = "t", descriptor = "[I")
    public int[] field3530 = new int[500];

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field3513 = 0;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "Lwj;")
    public static class6 field3517 = null;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "Ljd;")
    private static class86 field3519 = class122.method868("Choose Option", true);

    @OriginalMember(owner = "client!se", name = "n", descriptor = "Ljd;")
    public static class86 field3524 = field3519;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "[I")
    public static int[] field3525 = new int[1000];

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Ljd;")
    private static class86 field3514 = class122.method868("Loading world list data", true);

    @OriginalMember(owner = "client!se", name = "l", descriptor = "Ljd;")
    public static class86 field3522 = field3514;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "Ljd;")
    public static class86 field3518 = class122.method868(" loggt sich ein)3", true);

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public static int field3523 = 0;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLwj;)Lwj;")
    public static final class6 method1366(byte arg0, class6 arg1) {
        field3515++;
        int var2 = 55 / ((arg0 + 70) / 55);
        class6 var3 = client.method1107(arg1);
        if (var3 == null) {
            var3 = arg1.field134;
        }
        return var3;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
    public static void method1367(boolean arg0) {
        field3514 = null;
        field3525 = null;
        field3518 = null;
        field3519 = null;
        if (!arg0) {
            field3518 = null;
        }
        field3517 = null;
        field3522 = null;
        field3524 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)I")
    public static final int method1368(int arg0, int arg1) {
        if (arg1 == -58453112) {
            field3520++;
            return arg0 >>> 8;
        } else {
            return 119;
        }
    }

    @OriginalMember(owner = "client!se", name = "run", descriptor = "()V")
    public final void run() {
        field3527++;
        while (this.field3521) {
            Object var1 = this.field3528;
            synchronized (this.field3528) {
                if (this.field3529 < 500) {
                    this.field3530[this.field3529] = class6.field207;
                    this.field3531[this.field3529] = class90.field1841;
                    this.field3529++;
                }
            }
            class91.method677(0, 50L);
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(II)V")
    public static final void method1369(int arg0, int arg1) {
        field3512++;
        class161 var2 = class204.method1456(true, 4, arg1);
        var2.method1173(true);
        if (arg0 != 0) {
            method1368(-117, -45);
        }
    }
}
