import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class142 extends class346 implements class255 {

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    private int field1859;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "[I")
    public static int[] field1855;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "[S")
    public static short[] field1854;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II[BI)V", line = 9)
    public final void method891(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg1 != -4520) {
            this.method891(79, -24, (byte[]) null, 27);
        }
        this.method2083(arg2, arg3);
        ++field1858;
        this.field1859 = arg0;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)I", line = 22)
    public final int method892(int arg0) {
        if (arg0 != -9037) {
            return -15;
        } else {
            ++field1852;
            return 0;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lrl;I[BI)V", line = 33)
    public class142(class487 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field1859 = arg1;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)I", line = 42)
    public final int method893(int arg0) {
        ++field1853;
        if (arg0 != 14889) {
            field1851 = 96;
        }
        return this.field1859;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBII)V", line = 59)
    public static final void method894(int arg0, byte arg1, int arg2, int arg3) {
        ++field1856;
        int var4 = -99 % ((-20 - arg1) / 35);
        class338 var5 = class380.method2294((byte) 98, arg3, 11);
        var5.method2052((byte) -20);
        var5.field4924 = arg0;
        var5.field4930 = arg2;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V", line = 75)
    public static void method895(boolean arg0) {
        field1854 = null;
        field1855 = null;
        if (arg0) {
            field1854 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)J", line = 86)
    public final long method896(int arg0) {
        int var2 = -18 / ((-13 - arg0) / 35);
        ++field1857;
        return super.field4998.method2508();
    }
}
