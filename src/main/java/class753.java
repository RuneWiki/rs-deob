import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class753 extends class107 {

    @OriginalMember(owner = "client!wn", name = "F", descriptor = "Ljava/lang/String;")
    public String field10408;

    @OriginalMember(owner = "client!wn", name = "I", descriptor = "Ldha;")
    public class83 field10411;

    @OriginalMember(owner = "client!wn", name = "z", descriptor = "[I")
    public static int[] field10404 = new int[4096];

    @OriginalMember(owner = "client!wn", name = "y", descriptor = "I")
    public static int field10403;

    @OriginalMember(owner = "client!wn", name = "A", descriptor = "I")
    public static int field10405;

    @OriginalMember(owner = "client!wn", name = "B", descriptor = "I")
    public static int field10406;

    @OriginalMember(owner = "client!wn", name = "D", descriptor = "I")
    public static int field10407;

    @OriginalMember(owner = "client!wn", name = "G", descriptor = "I")
    public int field10409;

    @OriginalMember(owner = "client!wn", name = "H", descriptor = "I")
    public static int field10410;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)I", line = 12)
    public final int method4189(int arg0) {
        if (arg0 != -1) {
            method4191(-124, -62, (byte) -115, -13, -18, -66, 48, -72);
        }
        field10405++;
        return this.field10411.field923.field1600 == this.field10411.field923 ? -1 : ((class746) this.field10411.field923.field1600).field10340;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Ljga;I)Z", line = 30)
    public final boolean method4190(class746 arg0, int arg1) {
        field10403++;
        arg0.method827(3);
        boolean var3 = true;
        class746 var4 = (class746) this.field10411.method636(256);
        while (var4 != null) {
            if (class316.method2026(arg0.field10340, 1000, var4.field10340)) {
                class749.method4174(0, var4, arg0);
                this.field10409++;
                if (var3) {
                    return false;
                }
                return true;
            }
            var4 = (class746) this.field10411.method637(false);
            var3 = false;
        }
        this.field10411.method626((byte) -114, arg0);
        if (arg1 != 4096) {
            this.field10409 = -64;
        }
        this.field10409++;
        return var3;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIBIIIII)V", line = 61)
    public static final void method4191(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field10406++;
        if (arg1 == arg7) {
            class618.method3569(-84, arg7, arg6, arg3, arg4, arg5, arg0);
        } else if (arg2 >= 30) {
            if (class618.field8645 <= arg3 - arg7 && (arg3 + arg7) <= class463.field6533 && class734.field10153 <= (arg5 - arg1) && class407.field5535 >= arg1 + arg5) {
                class413.method2509(arg1, arg7, arg6, (byte) 111, arg4, arg3, arg0, arg5);
            } else {
                class77.method599(arg7, arg3, arg1, arg0, arg5, arg6, arg4, -72);
            }
        }
    }

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "(I)V", line = 85)
    public static final void method4192(int arg0) {
        class768.method4241(255, -1, (byte) 71);
        if (arg0 > 9) {
            field10407++;
        }
    }

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "(I)V", line = 98)
    public static void method4193(int arg0) {
        field10404 = null;
        if (arg0 != 18749) {
            field10404 = null;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Ljga;B)Z", line = 108)
    public final boolean method4194(class746 arg0, byte arg1) {
        field10410++;
        int var3 = this.method4189(-1);
        arg0.method827(3);
        if (arg1 < 95) {
            this.method4190(null, -90);
        }
        this.field10409--;
        if (this.field10409 != 0) {
            return var3 != this.method4189(-1);
        }
        this.method3387((byte) 112);
        this.method827(3);
        class310.field4426--;
        class550.field7901.method3739(arg0.field10344, (byte) 97, this);
        return false;
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 132)
    public class753(String arg0) {
        this.field10408 = arg0;
        this.field10411 = new class83();
    }
}
