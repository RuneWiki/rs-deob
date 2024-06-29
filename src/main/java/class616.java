import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class616 extends class210 implements class615 {

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
    private int field8312;

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "I")
    public static int field8311;

    @OriginalMember(owner = "client!vs", name = "l", descriptor = "I")
    public static int field8313;

    @OriginalMember(owner = "client!vs", name = "m", descriptor = "I")
    public static int field8314;

    @OriginalMember(owner = "client!vs", name = "n", descriptor = "I")
    public static int field8315;

    @OriginalMember(owner = "client!vs", name = "o", descriptor = "I")
    public static int field8316;

    @OriginalMember(owner = "client!vs", name = "p", descriptor = "I")
    public static int field8317;

    @OriginalMember(owner = "client!vs", name = "q", descriptor = "I")
    public static int field8318;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vs", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field8319;

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Llf;ILjaclib/memory/Buffer;IZ)V")
    public class616(class250 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field8312 = arg1;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)I")
    public final int method3415(int arg0) {
        if (arg0 <= 85) {
            method3418(-27, -125, 113, (byte) -21);
        }
        ++field8314;
        return super.field2703;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Z)I")
    public final int method3414(boolean arg0) {
        if (arg0) {
            this.field8312 = -89;
        }
        ++field8316;
        return this.field8312;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "([BIZI)V")
    public final void method3417(byte[] arg0, int arg1, boolean arg2, int arg3) {
        ++field8317;
        this.method1370(0, arg0, arg3);
        if (arg2) {
            this.field8312 = arg1;
        }
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Llf;I[BIZ)V")
    public class616(class250 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field8312 = arg1;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIIB)Z")
    public static final boolean method3418(int arg0, int arg1, int arg2, byte arg3) {
        ++field8311;
        boolean var4 = true;
        class602 var5 = (class602) class634.method3501(arg0, arg2, arg1);
        if (var5 != null) {
            var4 &= class243.method1522(-1, var5);
        }
        if (arg3 != 39) {
            return false;
        } else {
            class602 var6 = (class602) class4.method28(arg0, arg2, arg1, field8319 != null ? field8319 : (field8319 = method3420("nf")));
            if (var6 != null) {
                var4 &= class243.method1522(arg3 ^ -40, var6);
            }
            class602 var7 = (class602) class257.method1754(arg0, arg2, arg1);
            if (var7 != null) {
                var4 &= class243.method1522(-1, var7);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(Z)J")
    public final long method3416(boolean arg0) {
        if (arg0) {
            this.method3417((byte[]) null, -25, true, -19);
        }
        ++field8318;
        return 0L;
    }

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)V")
    public final void method1369(int arg0) {
        ++field8313;
        if (arg0 != 32503) {
            this.field8312 = 37;
        }
        super.field2704.method1613((byte) -78, this);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method3419(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8315;
        if (~(2 & class328.field4667[0][arg4][arg0]) != arg2) {
            return true;
        } else if ((16 & class328.field4667[arg3][arg4][arg0]) != 0) {
            return false;
        } else {
            return class632.method3488(arg3, arg0, arg2 + 109, arg4) == arg1;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3420(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
