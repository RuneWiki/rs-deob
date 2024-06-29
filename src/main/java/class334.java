import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class334 extends class529 {

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "J")
    public long field5226;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "Lbd;")
    public class334 field5224;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "Lbd;")
    public class334 field5228;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
    public final void method2219(int arg0) {
        field5225++;
        if (this.field5228 == null) {
            return;
        }
        if (arg0 != 0) {
            field5227 = 41;
        }
        this.field5228.field5224 = this.field5224;
        this.field5224.field5228 = this.field5228;
        this.field5228 = null;
        this.field5224 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)I")
    public static final int method2220(int arg0, int arg1) {
        return class350.field5453 == null ? 0 : class350.field5453[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)Z")
    public final boolean method2221(boolean arg0) {
        if (!arg0) {
            this.method2219(-32);
        }
        field5223++;
        return this.field5228 != null;
    }
}
