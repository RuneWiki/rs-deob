import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class28 extends class627 {

    @OriginalMember(owner = "client!bw", name = "s", descriptor = "I")
    public int field465;

    @OriginalMember(owner = "client!bw", name = "t", descriptor = "I")
    public int field466;

    @OriginalMember(owner = "client!bw", name = "r", descriptor = "Lmq;")
    public static class78 field464 = new class78(89, 0);

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!bw", name = "o", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!bw", name = "p", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!bw", name = "q", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)I")
    public final int method285(byte arg0) {
        if (arg0 < 48) {
            return 29;
        } else {
            field459++;
            return (this.field465 & 0x1C7DD5) >> 18;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)Z")
    public final boolean method286(int arg0) {
        field460++;
        if (arg0 > -115) {
            this.method291(-86);
        }
        return (this.field465 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(B)V")
    public static void method287(byte arg0) {
        int var1 = 113 / ((arg0 - 63) / 34);
        field464 = null;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)Z")
    public final boolean method288(int arg0, int arg1) {
        if (arg1 > -32) {
            return false;
        } else {
            field461++;
            return (this.field465 >> arg0 + 1 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)Z")
    public final boolean method289(boolean arg0) {
        if (!arg0) {
            this.method289(false);
        }
        field457++;
        return (this.field465 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "(B)Z")
    public final boolean method290(byte arg0) {
        field463++;
        if (arg0 != -113) {
            field458 = 46;
        }
        return (this.field465 & 0x2A283C) >> 21 != 0;
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)I")
    public final int method291(int arg0) {
        field462++;
        if (arg0 < 42) {
            this.method289(true);
        }
        return class382.method2300(this.field465, (byte) -98);
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(II)V")
    public class28(int arg0, int arg1) {
        this.field465 = arg0;
        this.field466 = arg1;
    }
}
