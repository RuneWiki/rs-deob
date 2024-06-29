import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public abstract class class224 extends class71 {

    @OriginalMember(owner = "client!qu", name = "l", descriptor = "Ldw;")
    public class664 field3016;

    @OriginalMember(owner = "client!qu", name = "k", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!qu", name = "m", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!qu", name = "n", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!qu", name = "o", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!qu", name = "p", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!qu", name = "j", descriptor = "Leh;")
    public static class259 field3014;

    @OriginalMember(owner = "client!qu", name = "q", descriptor = "Z")
    public boolean field3021;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)I")
    public final int method1322(byte arg0) {
        if (arg0 == -65) {
            field3019++;
            return 1;
        } else {
            return 32;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)Z")
    public final boolean method1323(int arg0) {
        if (arg0 != 1) {
            this.method1329(-17);
        }
        field3020++;
        return this.field3021;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Z)Z")
    public abstract boolean method1324(boolean arg0);

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)V")
    public abstract void method1325(int arg0);

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "(I)V")
    public static void method1326(int arg0) {
        field3014 = null;
        if (arg0 != 0) {
            method1326(60);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(BII)V")
    public abstract void method1327(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "(Z)I")
    public int method1328(boolean arg0) {
        if (!arg0) {
            this.field3016 = null;
        }
        field3015++;
        return 0;
    }

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "(I)Z")
    public final boolean method1329(int arg0) {
        int var2 = 117 / ((arg0 + 33) / 43);
        field3018++;
        return false;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)V")
    public abstract void method1330(int arg0, int arg1);

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "(I)Z")
    public abstract boolean method1331(int arg0);

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Ldw;)V")
    public class224(class664 arg0) {
        this.field3016 = arg0;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lfba;ILfba;I)V")
    public abstract void method1332(class350 arg0, int arg1, class350 arg2, int arg3);
}
