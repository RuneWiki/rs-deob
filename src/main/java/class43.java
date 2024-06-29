import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class43 extends class5 implements class438 {

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "[I")
    public static int[] field619 = new int[4];

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "C")
    public char field627;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public int field617;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public int field621;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    public int field626;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "J")
    public long field624;

    static {
        new class508("", 73);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Luu;B)I", line = 4)
    public static final int method343(class191 arg0, byte arg1) {
        field625++;
        int var2 = 0;
        if (arg1 != 6) {
            return 83;
        }
        if (arg0.method1288(class290.field4253, arg1 ^ 0x487D)) {
            var2++;
        }
        if (arg0.method1288(class94.field1372, 18555)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)I", line = 25)
    public final int method344(byte arg0) {
        if (arg0 != -120) {
            this.method344((byte) -29);
        }
        field622++;
        return this.field626;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)C", line = 39)
    public final char method345(int arg0) {
        field623++;
        return (char) (arg0 == -20326 ? this.field627 : 65507);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)I", line = 51)
    public final int method346(byte arg0) {
        field628++;
        if (arg0 != -98) {
            this.field626 = 46;
        }
        return this.field621;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)J", line = 65)
    public final long method347(boolean arg0) {
        field618++;
        return arg0 ? 111L : this.field624;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)I", line = 83)
    public final int method348(byte arg0) {
        if (arg0 < 69) {
            return 73;
        } else {
            field620++;
            return this.field617;
        }
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)V", line = 106)
    public static void method349(int arg0) {
        if (arg0 <= 32) {
            field619 = null;
        }
        field619 = null;
    }
}
