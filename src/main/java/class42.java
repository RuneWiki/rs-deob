import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class42 implements Runnable {

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "Z")
    public boolean field717 = true;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "Ljava/lang/Object;")
    public Object field715 = new Object();

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public int field718 = 0;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "[I")
    public int[] field719 = new int[500];

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "[I")
    public int[] field720 = new int[500];

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "Li;")
    private static class88 field712 = class208.method1425(105, "Username: ");

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "Li;")
    public static class88 field713 = field712;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "Li;")
    public static class88 field710 = class208.method1425(105, "Null");

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "Lwi;")
    public static class248 field714 = new class248();

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "Li;")
    public static class88 field721 = class208.method1425(105, "Wordpack geladen)3");

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public static void method275(byte arg0) {
        field721 = null;
        field714 = null;
        field710 = null;
        if (arg0 != -83) {
            field712 = null;
        }
        field713 = null;
        field712 = null;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)V")
    public static final void method276(byte arg0) {
        class64.field1163 = new class154(32);
        if (arg0 != -47) {
            field721 = null;
        }
        field716++;
    }

    @OriginalMember(owner = "client!dh", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field717) {
            Object var1 = this.field715;
            synchronized (this.field715) {
                if (this.field718 < 500) {
                    this.field720[this.field718] = class28.field471;
                    this.field719[this.field718] = class239.field4451;
                    this.field718++;
                }
            }
            class21.method98(50L, (byte) 38);
        }
        field711++;
    }
}
