import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public abstract class class372 extends class543 {

    @OriginalMember(owner = "client!rq", name = "x", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!rq", name = "y", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!rq", name = "z", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!rq", name = "A", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!rq", name = "B", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!rq", name = "C", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!rq", name = "D", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(BI)I")
    public static final int method2260(byte arg0, int arg1) {
        ++field5055;
        if (arg0 >= 0) {
            method2260((byte) -112, -68);
        }
        return 127 & arg1 >> 11;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lha;Lcn;IIBZI)V")
    public final void method903(class66 arg0, class543 arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6) {
        if (arg4 > 41) {
            ++field5057;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "(I)V")
    public final void method905(int arg0) {
        ++field5053;
        if (arg0 != -16665) {
            this.method905(-36);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "(I)Z")
    public final boolean method904(int arg0) {
        ++field5054;
        if (arg0 != 0) {
            this.method905(93);
        }
        return false;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILha;)Z")
    public final boolean method2261(int arg0, class66 arg1) {
        int var3 = 114 / ((arg0 - 21) / 48);
        ++field5056;
        class58 var4 = class471.method2713(super.field7391, super.field7396 >> class654.field9055, super.field7398 >> class654.field9055);
        return var4 != null && var4.field815.field8366 ? class658.method3699(var4.field815.method907(-20425) + this.method907(-20425), -22727, super.field7391, super.field7396 >> class654.field9055, super.field7398 >> class654.field9055) : class757.method4186(super.field7391, (byte) -49, super.field7396 >> class654.field9055, super.field7398 >> class654.field9055);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "([Lbq;Z)I")
    public final int method2262(class307[] arg0, boolean arg1) {
        if (arg1) {
            this.method2262((class307[]) null, true);
        }
        ++field5059;
        return this.method3065(super.field7398 >> class654.field9055, -104, super.field7396 >> class654.field9055, arg0);
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(IIIII)V")
    public class372(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field7396 = arg0;
        super.field7404 = (byte) arg4;
        super.field7405 = arg1;
        super.field7391 = (byte) arg3;
        super.field7398 = arg2;
    }

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "(I)Z")
    public final boolean method2263(int arg0) {
        ++field5058;
        if (arg0 != -2) {
            this.method2262((class307[]) null, true);
        }
        return class641.field8883[(super.field7396 >> class654.field9055) - class434.field5912 - -class389.field5342][(super.field7398 >> class654.field9055) + -class111.field1920 + class389.field5342];
    }
}
