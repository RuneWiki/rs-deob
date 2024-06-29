import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class122 extends class22 {

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    private final int field2002;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    private final int field2001;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    private final int field2005;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    private final int field1998;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    private final int field1997;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    private final int field2000;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    private final int field1996;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
    private final int field2008;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "Ljb;")
    public static class11 field2004;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
    public static void method796(int arg0) {
        if (arg0 != -1432008820) {
            field2004 = null;
        }
        field2004 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V")
    public final void method199(int arg0, int arg1, int arg2) {
        ++field2007;
        if (arg0 != -6474) {
            field2004 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2002 = arg3;
        this.field2001 = arg0;
        this.field2005 = arg5;
        this.field1998 = arg6;
        this.field1997 = arg2;
        this.field2000 = arg1;
        this.field1996 = arg7;
        this.field2008 = arg4;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIILjb;)[Lpg;")
    public static final class69[] method797(int arg0, int arg1, int arg2, class11 arg3) {
        if (arg1 != -7449) {
            field2004 = null;
        }
        ++field2006;
        return !class242.method1646(arg2, (byte) -64, arg3, arg0) ? null : class176.method1177((byte) -56);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IBI)V")
    public final void method200(int arg0, byte arg1, int arg2) {
        ++field1995;
        if (arg1 >= -97) {
            field2004 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(III)V")
    public final void method202(int arg0, int arg1, int arg2) {
        ++field1999;
        if (arg1 == -1) {
            int var4 = this.field2001 * arg0 >> 12;
            int var5 = this.field2000 * arg2 >> 12;
            int var6 = this.field1997 * arg0 >> 12;
            int var7 = this.field2002 * arg2 >> 12;
            int var8 = this.field2008 * arg0 >> 12;
            int var9 = this.field2005 * arg2 >> 12;
            int var10 = this.field1998 * arg0 >> 12;
            int var11 = this.field1996 * arg2 >> 12;
            class155.method1038(var4, var9, var11, var7, var8, super.field389, var6, var10, 0, var5);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)I")
    public static final int method798(int arg0, int arg1) {
        if (arg0 <= 30) {
            field2004 = null;
        }
        ++field2003;
        return 255 & arg1;
    }
}
