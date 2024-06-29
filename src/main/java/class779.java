import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public abstract class class779 {

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    public static int field10697 = 0;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "Z")
    public static boolean field10699 = false;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    public static int field10696;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field10698;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V")
    public abstract void method1657(byte arg0);

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(B)I")
    public abstract int method1663(byte arg0);

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)I")
    public abstract int method1652(int arg0);

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)Ltaa;")
    public abstract class428 method1653(int arg0);

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(B)Z")
    public abstract boolean method1661(byte arg0);

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)Z")
    public final boolean method4278(int arg0) {
        if (arg0 < 21) {
            return true;
        } else {
            field10698++;
            return this.method1661((byte) 126) || this.method1655(125) || this.method1654(0);
        }
    }

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "(I)Z")
    public abstract boolean method1655(int arg0);

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method4279(String arg0, int arg1) {
        field10696++;
        int var2 = 88 / ((-arg1 - 26) / 43);
        int var3 = arg0.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) + class545.method3141(124, arg0.charAt(var5)) - var4;
        }
        return var4;
    }

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "(I)Z")
    public abstract boolean method1654(int arg0);

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "(I)V")
    public abstract void method1658(int arg0);
}
