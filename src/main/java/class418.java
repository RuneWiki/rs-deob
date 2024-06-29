import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class418 extends class172 implements Runnable {

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "Z")
    private boolean field5556 = true;

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "I")
    public int field5562 = -1;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "Lmd;")
    private class496 field5554;

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "Lep;")
    public static class382 field5557 = null;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "Lmfa;")
    public static class562 field5555 = new class562();

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V")
    public final void method2261(int arg0) {
        (new Thread(this, "a")).start();
        if (arg0 < 74) {
            this.field5554 = null;
        }
        field5559++;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V")
    public final void method2262(int arg0) {
        field5561++;
        this.field5556 = false;
        if (arg0 != -1) {
            field5555 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V")
    public static void method2263(byte arg0) {
        field5557 = null;
        field5555 = null;
        int var1 = 14 / ((9 - arg0) / 47);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZ)I")
    public static final int method2264(int arg0, boolean arg1) {
        field5560++;
        if (arg0 == 16711935) {
            return -1;
        } else {
            if (arg1) {
                method2265(55, 84, -17);
            }
            return class147.method803(true, arg0);
        }
    }

    @OriginalMember(owner = "client!sl", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field5556) {
            this.field5554.method2855(false, this);
        }
        field5558++;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)Z")
    public static final boolean method2265(int arg0, int arg1, int arg2) {
        if (arg2 < 85) {
            return false;
        } else {
            field5563++;
            return (arg0 & 0x180) != 0;
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lmd;)V")
    public class418(class496 arg0) {
        this.field5554 = arg0;
    }
}
