import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class399 extends class42 {

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    public int field5655;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    public int field5656;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    public int field5657;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "I")
    public int field5659;

    @OriginalMember(owner = "client!si", name = "t", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!si", name = "u", descriptor = "I")
    public int field5661;

    @OriginalMember(owner = "client!si", name = "v", descriptor = "I")
    public int field5662;

    @OriginalMember(owner = "client!si", name = "w", descriptor = "I")
    public int field5663;

    @OriginalMember(owner = "client!si", name = "y", descriptor = "I")
    public int field5665;

    @OriginalMember(owner = "client!si", name = "z", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!si", name = "A", descriptor = "I")
    public int field5667;

    @OriginalMember(owner = "client!si", name = "C", descriptor = "I")
    public int field5669;

    @OriginalMember(owner = "client!si", name = "D", descriptor = "I")
    public int field5670;

    @OriginalMember(owner = "client!si", name = "E", descriptor = "I")
    public int field5671;

    @OriginalMember(owner = "client!si", name = "F", descriptor = "I")
    public int field5672;

    @OriginalMember(owner = "client!si", name = "G", descriptor = "I")
    public int field5673;

    @OriginalMember(owner = "client!si", name = "I", descriptor = "I")
    public int field5675;

    @OriginalMember(owner = "client!si", name = "J", descriptor = "I")
    public int field5676;

    @OriginalMember(owner = "client!si", name = "K", descriptor = "I")
    public int field5677;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "Loh;")
    public class285 field5658;

    @OriginalMember(owner = "client!si", name = "H", descriptor = "Lcv;")
    public class407 field5674;

    @OriginalMember(owner = "client!si", name = "L", descriptor = "Lpb;")
    public class474 field5678;

    @OriginalMember(owner = "client!si", name = "B", descriptor = "Lcg;")
    public class93 field5668;

    @OriginalMember(owner = "client!si", name = "x", descriptor = "Ljava/lang/Object;")
    public static Object field5664;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V", line = 16)
    public static final void method2393(int arg0) {
        field5660++;
        if (arg0 != 6826) {
            field5664 = null;
        }
        class132.field2065 = null;
        class289.field4279 = null;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V", line = 30)
    public static void method2394(int arg0) {
        if (arg0 == -24194) {
            field5664 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lqa;Lee;III)V", line = 44)
    public static final void method2395(class167 arg0, class487 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class394.field5608) {
            class188 var5 = class461.field6675[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field2756 != null && var5.field2756.method556(-1)) {
                arg1.method558(0, 0, class291.field4317, arg0, false, var5.field2756, true);
            }
        }
        if (arg4 < class394.field5608) {
            class188 var6 = class461.field6675[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field2756 != null && var6.field2756.method556(-1)) {
                arg1.method558(0, class291.field4317, 0, arg0, false, var6.field2756, true);
            }
        }
        if (arg3 < class394.field5608 && arg4 < class337.field5000) {
            class188 var7 = class461.field6675[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field2756 != null && var7.field2756.method556(-1)) {
                arg1.method558(0, class291.field4317, class291.field4317, arg0, false, var7.field2756, true);
            }
        }
        if (arg3 < class394.field5608 && arg4 > 0) {
            class188 var8 = class461.field6675[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field2756 != null && var8.field2756.method556(-1)) {
                arg1.method558(0, -class291.field4317, class291.field4317, arg0, false, var8.field2756, true);
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)V", line = 97)
    public final void method2396(int arg0) {
        this.field5674 = null;
        this.field5668 = null;
        this.field5678 = null;
        this.field5658 = null;
        int var2 = 68 % ((-arg0 - 48) / 36);
        field5666++;
    }
}
