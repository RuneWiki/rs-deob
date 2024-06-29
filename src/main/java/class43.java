import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class43 extends class508 {

    @OriginalMember(owner = "client!eaa", name = "x", descriptor = "Z")
    public boolean field563 = true;

    @OriginalMember(owner = "client!eaa", name = "v", descriptor = "I")
    public int field561 = -1;

    @OriginalMember(owner = "client!eaa", name = "s", descriptor = "I")
    public int field558 = 12800;

    @OriginalMember(owner = "client!eaa", name = "C", descriptor = "I")
    public int field568 = 0;

    @OriginalMember(owner = "client!eaa", name = "F", descriptor = "I")
    public int field571 = 0;

    @OriginalMember(owner = "client!eaa", name = "H", descriptor = "I")
    public int field573 = 12800;

    @OriginalMember(owner = "client!eaa", name = "w", descriptor = "I")
    public int field562 = -1;

    @OriginalMember(owner = "client!eaa", name = "G", descriptor = "Ljava/lang/String;")
    public String field572;

    @OriginalMember(owner = "client!eaa", name = "u", descriptor = "I")
    public int field560;

    @OriginalMember(owner = "client!eaa", name = "I", descriptor = "Ljava/lang/String;")
    public String field574;

    @OriginalMember(owner = "client!eaa", name = "t", descriptor = "I")
    public int field559;

    @OriginalMember(owner = "client!eaa", name = "A", descriptor = "Lae;")
    public class40 field566;

    @OriginalMember(owner = "client!eaa", name = "y", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!eaa", name = "z", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!eaa", name = "B", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!eaa", name = "D", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!eaa", name = "E", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!eaa", name = "J", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!eaa", name = "K", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IZIIIIIII)Z", line = 3)
    public static final boolean method259(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field569++;
        if (arg0 >= arg5 + arg4 || arg0 + arg2 <= arg5) {
            return false;
        } else if (arg6 + arg8 > arg3 && arg6 < arg3 + arg7) {
            return !arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V", line = 23)
    public final void method260(int arg0) {
        this.field571 = 0;
        this.field568 = 0;
        this.field573 = 12800;
        this.field558 = 12800;
        field575++;
        for (class312 var2 = (class312) this.field566.method237(109); var2 != null; var2 = (class312) this.field566.method245((byte) 94)) {
            if (this.field571 < var2.field4011) {
                this.field571 = var2.field4011;
            }
            if (this.field573 > var2.field4004) {
                this.field573 = var2.field4004;
            }
            if (this.field558 > var2.field4003) {
                this.field558 = var2.field4003;
            }
            if (this.field568 < var2.field4006) {
                this.field568 = var2.field4006;
            }
        }
        if (arg0 < 68) {
            this.method263(1, -88, -24);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 207)
    public class43(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field562 = arg6;
        this.field572 = arg2;
        this.field563 = arg5;
        this.field561 = arg4;
        this.field560 = arg3;
        this.field574 = arg1;
        this.field559 = arg0;
        if (this.field562 == 255) {
            this.field562 = 0;
        }
        this.field566 = new class40();
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IBI[I)Z", line = 68)
    public final boolean method261(int arg0, byte arg1, int arg2, int[] arg3) {
        field567++;
        for (class312 var5 = (class312) this.field566.method237(85); var5 != null; var5 = (class312) this.field566.method245((byte) 91)) {
            if (var5.method1804(arg0, arg2, false)) {
                var5.method1807(arg3, arg2, arg0, 0);
                return true;
            }
        }
        if (arg1 > -84) {
            this.field559 = 57;
        }
        return false;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II[III)Z", line = 99)
    public final boolean method262(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field570++;
        if (arg3 != 255) {
            return true;
        }
        for (class312 var6 = (class312) this.field566.method237(88); var6 != null; var6 = (class312) this.field566.method245((byte) 96)) {
            if (var6.method1808(arg0, 57, arg1, arg4)) {
                var6.method1807(arg2, arg1, arg0, arg3 ^ 0xFF);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(III)Z", line = 136)
    public final boolean method263(int arg0, int arg1, int arg2) {
        field565++;
        class312 var4 = (class312) this.field566.method237(124);
        if (arg0 != 13543) {
            this.field574 = null;
        }
        while (var4 != null) {
            if (var4.method1804(arg2, arg1, false)) {
                return true;
            }
            var4 = (class312) this.field566.method245((byte) 29);
        }
        return false;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II[IB)Z", line = 160)
    public final boolean method264(int arg0, int arg1, int[] arg2, byte arg3) {
        field576++;
        for (class312 var5 = (class312) this.field566.method237(103); var5 != null; var5 = (class312) this.field566.method245((byte) 46)) {
            if (var5.method1809(arg0, 7369, arg1)) {
                var5.method1805(arg0, arg1, arg2, (byte) -99);
                return true;
            }
        }
        if (arg3 > -113) {
            this.field558 = 44;
        }
        return false;
    }
}
