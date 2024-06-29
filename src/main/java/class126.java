import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class126 extends class430 {

    @OriginalMember(owner = "client!f", name = "i", descriptor = "Lkw;")
    public class346 field1739;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "Z")
    public static boolean field1745 = true;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "[I")
    public static int[] field1738 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "Ljia;")
    public static class336 field1743;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "Z")
    public boolean field1746;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "[I")
    public static int[] field1747;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([BB)Ljava/lang/String;", line = 11)
    public static final String method882(byte[] arg0, byte arg1) {
        field1749++;
        if (arg1 != -73) {
            field1747 = null;
        }
        return class62.method577(91, arg0, arg0.length, 0);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILjava/lang/String;)I", line = 24)
    public static final int method884(int arg0, String arg1) {
        field1741++;
        int var2 = arg1.length();
        if (arg0 >= -58) {
            field1747 = null;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = arg1.charAt(var4) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(ILjava/lang/String;)V", line = 46)
    public static final void method885(int arg0, String arg1) {
        field1740++;
        System.exit(arg0);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)Z", line = 59)
    public final boolean method887(int arg0) {
        if (arg0 > -121) {
            this.field1746 = false;
        }
        field1742++;
        return this.field1746;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V", line = 74)
    public static void method890(byte arg0) {
        if (arg0 >= 100) {
            field1743 = null;
            field1738 = null;
            field1747 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lkw;)V", line = 87)
    public class126(class346 arg0) {
        this.field1739 = arg0;
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(I)I", line = 99)
    public int method891(int arg0) {
        field1744++;
        return arg0 >= -19 ? -53 : 0;
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(B)Z", line = 114)
    public final boolean method893(byte arg0) {
        if (arg0 < 41) {
            method890((byte) 126);
        }
        field1737++;
        return false;
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(I)I", line = 129)
    public final int method894(int arg0) {
        field1748++;
        if (arg0 != -8924) {
            field1738 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)Z")
    public abstract boolean method881(byte arg0);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)V")
    public abstract void method883(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILol;Lol;I)V")
    public abstract void method886(int arg0, class246 arg1, class246 arg2, int arg3);

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
    public abstract void method888(int arg0);

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)Z")
    public abstract boolean method889(int arg0);

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(II)V")
    public abstract void method892(int arg0, int arg1);
}
