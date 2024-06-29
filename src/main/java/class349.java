import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class349 extends class235 {

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "[Lgs;")
    public static class439[] field5069 = new class439[5];

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "Lew;")
    public static class270 field5071;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "C")
    public char field5070;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    public int field5064;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    public int field5066;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "J")
    public long field5058;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "Lai;")
    public class349 field5068;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "Ldk;")
    public static class421 field5062;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "Z")
    public boolean field5060;

    static {
        for (int var0 = 0; var0 < field5069.length; var0++) {
            field5069[var0] = new class439();
        }
        field5073 = 0;
        field5071 = new class270(32);
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)I", line = 6)
    public final int method1439(int arg0) {
        field5065++;
        if (arg0 != 2) {
            field5069 = null;
        }
        return this.field5064;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V", line = 18)
    public static void method2095(byte arg0) {
        field5069 = null;
        if (arg0 == 122) {
            field5071 = null;
            field5062 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)I", line = 38)
    public final int method1437(int arg0) {
        if (arg0 == -24469) {
            field5063++;
            return this.field5066;
        } else {
            return -117;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)C", line = 50)
    public final char method1435(int arg0) {
        field5061++;
        return arg0 >= -114 ? '\u0001' : this.field5070;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)J", line = 63)
    public final long method1433(int arg0) {
        if (arg0 != -10783) {
            this.field5058 = -24L;
        }
        field5059++;
        return this.field5058;
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(I)Z", line = 77)
    public final boolean method1441(int arg0) {
        int var2 = 9 / ((-arg0 - 57) / 55);
        field5067++;
        return this.field5060;
    }
}
