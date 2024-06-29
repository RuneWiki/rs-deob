import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class532 extends class592 implements class368 {

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    private int field7470;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "[[F")
    public static float[][] field7463 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field7462;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field7464;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public static int field7466;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public static int field7468;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    public static int field7469;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)J")
    public final long method1852(int arg0) {
        if (arg0 != 5501) {
            return 92L;
        } else {
            ++field7465;
            return 0L;
        }
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)V")
    public static void method3176(int arg0) {
        field7463 = null;
        if (arg0 != 0) {
            method3176(-40);
        }
    }

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "(I)V")
    public static final void method3177(int arg0) {
        ++field7467;
        class466.method2780();
        for (int var1 = 0; var1 < 4; ++var1) {
            class464.field6351[var1].method922(arg0 + -35086);
        }
        class446.method2659(-1);
        class294.method1723(true);
        class724.method4054(arg0 + -34963);
        System.gc();
        if (arg0 != 34963) {
            field7463 = null;
        }
        class96.field1401.method610();
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)I")
    public final int method1853(int arg0) {
        if (arg0 != 8645) {
            field7463 = null;
        }
        ++field7468;
        return this.field7470;
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V")
    public final void method3178(int arg0) {
        super.field8540.method2114(-2059453976, this);
        if (arg0 == 34963) {
            ++field7466;
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lep;I[BIZ)V")
    public class532(class371 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field7470 = arg1;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "([BIII)V")
    public final void method1857(byte[] arg0, int arg1, int arg2, int arg3) {
        this.method3518(arg2, 35040, arg0);
        ++field7464;
        this.field7470 = arg3;
        if (arg1 != -13491) {
            this.field7470 = -84;
        }
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)I")
    public final int method1854(int arg0) {
        if (arg0 != 655) {
            return -1;
        } else {
            ++field7462;
            return super.field8534;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BII)I")
    public static final int method3179(byte arg0, int arg1, int arg2) {
        ++field7469;
        if (~arg2 != -2 && arg2 != 3) {
            return arg0 < 88 ? -21 : class162.field2238[arg1 & 3];
        } else {
            return class186.field2737[3 & arg1];
        }
    }
}
