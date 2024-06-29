import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class622 extends class430 {

    @OriginalMember(owner = "client!md", name = "G", descriptor = "[[Z")
    public static boolean[][] field8859 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!md", name = "y", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field8851 = new Hashtable();

    @OriginalMember(owner = "client!md", name = "q", descriptor = "F")
    public static float field8843;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public int field8833;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public int field8834;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public int field8835;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public int field8836;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public int field8839;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public int field8840;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public int field8841;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public int field8842;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public int field8844;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "I")
    public int field8845;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "I")
    public int field8846;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    public int field8847;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    public int field8848;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "I")
    public int field8849;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "I")
    public int field8850;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "I")
    public int field8852;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "I")
    public static int field8853;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "I")
    public int field8854;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    public static int field8856;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "I")
    public static int field8858;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "Lqba;")
    public class102 field8837;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "Liq;")
    public class149 field8855;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "Llaa;")
    public class382 field8838;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "Ljda;")
    public class673 field8857;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public final void method3597(int arg0) {
        if (arg0 != -2123031859) {
            method3598((byte) 116);
        }
        this.field8855 = null;
        this.field8857 = null;
        this.field8837 = null;
        this.field8838 = null;
        field8856++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public static void method3598(byte arg0) {
        if (arg0 == 19) {
            field8851 = null;
            field8859 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BII)I")
    public static final int method3599(byte arg0, int arg1, int arg2) {
        field8853++;
        int var3 = arg2 * 57 + arg1;
        if (arg0 != -74) {
            method3598((byte) 1);
        }
        int var4 = var3 << 13 ^ var3;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return (var5 & 0x7FC7AF7) >> 19;
    }
}
