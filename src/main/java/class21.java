import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class21 extends class498 {

    @OriginalMember(owner = "client!bu", name = "v", descriptor = "I")
    private int field319;

    @OriginalMember(owner = "client!bu", name = "s", descriptor = "I")
    private int field316;

    @OriginalMember(owner = "client!bu", name = "u", descriptor = "I")
    private int field318;

    @OriginalMember(owner = "client!bu", name = "o", descriptor = "I")
    private int field312;

    @OriginalMember(owner = "client!bu", name = "q", descriptor = "I")
    private int field314;

    @OriginalMember(owner = "client!bu", name = "m", descriptor = "I")
    private int field310;

    @OriginalMember(owner = "client!bu", name = "A", descriptor = "I")
    private int field324;

    @OriginalMember(owner = "client!bu", name = "k", descriptor = "I")
    private int field308;

    @OriginalMember(owner = "client!bu", name = "n", descriptor = "Lep;")
    public static class440 field311 = new class440("LIVE", 0);

    @OriginalMember(owner = "client!bu", name = "z", descriptor = "Lke;")
    public static class622 field323 = new class622(101, -2);

    @OriginalMember(owner = "client!bu", name = "B", descriptor = "Ljava/lang/String;")
    public static String field325 = null;

    @OriginalMember(owner = "client!bu", name = "l", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!bu", name = "p", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!bu", name = "r", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!bu", name = "t", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!bu", name = "w", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!bu", name = "x", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!bu", name = "y", descriptor = "Lme;")
    public static class204 field322;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(BII)V", line = 3)
    public final void method157(byte arg0, int arg1, int arg2) {
        ++field315;
        int var4 = -23 % ((53 - arg0) / 49);
    }

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "(I)V", line = 18)
    public static void method158(int arg0) {
        field311 = null;
        field323 = null;
        field322 = null;
        if (arg0 != 101) {
            field325 = null;
        }
        field325 = null;
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 31)
    public class21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field319 = arg3;
        this.field316 = arg2;
        this.field318 = arg7;
        this.field312 = arg6;
        this.field314 = arg4;
        this.field310 = arg0;
        this.field324 = arg1;
        this.field308 = arg5;
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(III)V", line = 49)
    public final void method159(int arg0, int arg1, int arg2) {
        ++field320;
        int var4 = this.field310 * arg0 >> 12;
        int var5 = this.field324 * arg1 >> 12;
        if (arg2 >= -37) {
            this.method159(-63, 46, -123);
        }
        int var6 = this.field316 * arg0 >> 12;
        int var7 = this.field319 * arg1 >> 12;
        int var8 = this.field314 * arg0 >> 12;
        int var9 = this.field308 * arg1 >> 12;
        int var10 = this.field312 * arg0 >> 12;
        int var11 = this.field318 * arg1 >> 12;
        class704.method3986(var6, var9, var4, var8, var11, var10, super.field7081, var5, var7, false);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(III)V", line = 77)
    public final void method160(int arg0, int arg1, int arg2) {
        if (arg0 == -1) {
            ++field313;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IBIIIIII)V", line = 90)
    public static final void method161(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field321;
        if (arg2 == arg7) {
            class268.method1754(arg5, arg0, arg3, 0, arg7, arg6, arg4);
        } else {
            if (class450.field6463 <= -arg7 + arg0 && arg0 - -arg7 <= class285.field4372 && arg4 - arg2 >= class738.field10297 && ~class414.field5846 <= ~(arg2 + arg4)) {
                class505.method2942(2048, arg5, arg6, arg0, arg4, arg3, arg2, arg7);
            } else {
                class645.method3692(arg5, arg0, arg2, arg4, arg3, 32115, arg6, arg7);
            }
            if (arg1 <= 36) {
                field323 = null;
            }
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lcb;I)V", line = 115)
    public static final void method162(class544 arg0, int arg1) {
        ++field309;
        int var2 = -8 % ((arg1 - 48) / 54);
        class680.field9659 = arg0;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)V", line = 132)
    public static final void method163(byte arg0) {
        class438.field6281.method445(class638.field8978);
        ++field317;
        class438.field6281.method409(class122.field1590, class117.field1459, class202.field2961, class549.field7739);
        if (arg0 >= -113) {
            method162((class544) null, 15);
        }
    }
}
