import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class546 extends class36 {

    @OriginalMember(owner = "client!pda", name = "y", descriptor = "Lgl;")
    public class522 field7821;

    @OriginalMember(owner = "client!pda", name = "v", descriptor = "Lem;")
    public class192 field7818;

    @OriginalMember(owner = "client!pda", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field7812 = new String[200];

    @OriginalMember(owner = "client!pda", name = "u", descriptor = "[[B")
    public static byte[][] field7817 = new byte[250][];

    @OriginalMember(owner = "client!pda", name = "q", descriptor = "I")
    public int field7813;

    @OriginalMember(owner = "client!pda", name = "r", descriptor = "I")
    public int field7814;

    @OriginalMember(owner = "client!pda", name = "s", descriptor = "I")
    public int field7815;

    @OriginalMember(owner = "client!pda", name = "t", descriptor = "I")
    public int field7816;

    @OriginalMember(owner = "client!pda", name = "w", descriptor = "I")
    public int field7819;

    @OriginalMember(owner = "client!pda", name = "x", descriptor = "I")
    public static int field7820;

    @OriginalMember(owner = "client!pda", name = "z", descriptor = "I")
    public static int field7822;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)V", line = 6)
    public final void method3179(int arg0) {
        field7822++;
        this.field7813 = this.field7821.field7594;
        this.field7814 = this.field7821.field7595;
        this.field7819 = this.field7821.field7593;
        if (this.field7821.field7590 != null) {
            this.field7821.field7590.method2003(this.field7818.field2539, this.field7818.field2530, this.field7818.field2531, class82.field916);
        }
        this.field7816 = class82.field916[2];
        this.field7815 = class82.field916[arg0];
    }

    @OriginalMember(owner = "client!pda", name = "g", descriptor = "(I)V", line = 39)
    public static void method3180(int arg0) {
        if (arg0 != -32448) {
            field7812 = null;
        }
        field7817 = null;
        field7812 = null;
    }

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Lgl;Lkw;)V", line = 52)
    public class546(class522 arg0, class211 arg1) {
        this.field7821 = arg0;
        this.field7818 = this.field7821.method3085(-1);
        this.method3179(0);
    }
}
