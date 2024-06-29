import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class245 implements Runnable {

    @OriginalMember(owner = "client!le", name = "f", descriptor = "Z")
    public boolean field3689 = true;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "Ljava/lang/Object;")
    public Object field3691 = new Object();

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public int field3697 = 0;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "[I")
    public int[] field3694 = new int[500];

    @OriginalMember(owner = "client!le", name = "l", descriptor = "[I")
    public int[] field3695 = new int[500];

    @OriginalMember(owner = "client!le", name = "d", descriptor = "[I")
    public static int[] field3687 = new int[100];

    @OriginalMember(owner = "client!le", name = "a", descriptor = "[I")
    public static int[] field3684 = new int[4096];

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field3693 = 0;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3690 = "flash1:";

    @OriginalMember(owner = "client!le", name = "p", descriptor = "[J")
    public static long[] field3699 = new long[1000];

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Llb;")
    public static class211 field3685;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "[I")
    public static int[] field3688;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)V", line = 5)
    public static final void method1696(int arg0, int arg1) {
        field3692++;
        class57.field849.method1429((byte) 127, arg1);
        class126.field1996.method1429((byte) 127, arg1);
        if (arg0 < 24) {
            method1697(-10);
        }
        class279.field4287.method1429((byte) 127, arg1);
    }

    @OriginalMember(owner = "client!le", name = "run", descriptor = "()V", line = 22)
    public final void run() {
        field3698++;
        while (this.field3689) {
            Object var1 = this.field3691;
            synchronized (this.field3691) {
                if (this.field3697 < 500) {
                    this.field3694[this.field3697] = class273.field4129;
                    this.field3695[this.field3697] = class295.field4646;
                    this.field3697++;
                }
            }
            class97.method768(50L, 57);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 50)
    public static void method1697(int arg0) {
        field3684 = null;
        field3699 = null;
        field3690 = null;
        field3685 = null;
        field3688 = null;
        field3687 = null;
        if (arg0 >= -29) {
            method1697(-82);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V", line = 65)
    public static final void method1698(byte arg0) {
        class307.field4788.method1433(30);
        field3696++;
        class106.field1623.method1433(30);
        if (arg0 > -108) {
            method1696(-115, 17);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)Z", line = 91)
    public static final boolean method1699(int arg0, byte arg1) {
        if (arg1 < 101) {
            return true;
        } else {
            field3686++;
            return arg0 >= 0 && arg0 < class322.field4997.length ? class322.field4997[arg0] : false;
        }
    }
}
