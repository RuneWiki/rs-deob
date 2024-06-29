import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class class130 extends class338 {

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "[I")
    public static int[] field1672 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "Lph;")
    public static class114 field1669 = new class114(64);

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "Lwf;")
    public static class1 field1674 = new class1(0, 0);

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "[I")
    public static int[] field1673;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V", line = 3)
    public static void method697(boolean arg0) {
        field1673 = null;
        field1674 = null;
        if (arg0) {
            method697(false);
        }
        field1669 = null;
        field1672 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)Ljava/lang/String;", line = 19)
    public static final String method698(byte arg0) {
        field1671++;
        String var1 = "www";
        if (class429.field6292 != 0) {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (arg0 != 13) {
            field1674 = null;
        }
        if (class435.field6351 != null) {
            var2 = "/p=" + class435.field6351;
        }
        return class62.field636 == 1 ? "http://" + var1 + ".stellardawn.com/l=" + class85.field953 + "/a=" + class156.field1980 + var2 + "/" : "http://" + var1 + ".runescape.com/l=" + class85.field953 + "/a=" + class156.field1980 + var2 + "/";
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lfd;I)Lfd;", line = 54)
    public static final class194 method699(class194 arg0, int arg1) {
        field1670++;
        if (arg0.field2470 != -1) {
            return class57.method301(arg0.field2470, (byte) 124);
        }
        int var2 = arg0.field2502 >>> 16;
        class243 var3 = new class243(class337.field4495);
        for (class141 var4 = (class141) var3.method1303(0); var4 != null; var4 = (class141) var3.method1304((byte) -116)) {
            if (var4.field1802 == var2) {
                return class57.method301((int) var4.field4510, (byte) 126);
            }
        }
        if (arg1 <= 69) {
            field1673 = null;
        }
        return null;
    }
}
