import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class640 extends class66 {

    @OriginalMember(owner = "client!jm", name = "y", descriptor = "I")
    public int field8979 = 0;

    @OriginalMember(owner = "client!jm", name = "C", descriptor = "I")
    public int field8983 = -1;

    @OriginalMember(owner = "client!jm", name = "D", descriptor = "Lhga;")
    public static class158 field8984 = new class158(41, -2);

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "I")
    public int field8971;

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "I")
    public int field8972;

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "I")
    public int field8973;

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "I")
    public int field8974;

    @OriginalMember(owner = "client!jm", name = "u", descriptor = "I")
    public int field8975;

    @OriginalMember(owner = "client!jm", name = "v", descriptor = "I")
    public int field8976;

    @OriginalMember(owner = "client!jm", name = "w", descriptor = "I")
    public static int field8977;

    @OriginalMember(owner = "client!jm", name = "x", descriptor = "I")
    public int field8978;

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "I")
    public int field8980;

    @OriginalMember(owner = "client!jm", name = "A", descriptor = "I")
    public int field8981;

    @OriginalMember(owner = "client!jm", name = "B", descriptor = "I")
    public int field8982;

    @OriginalMember(owner = "client!jm", name = "E", descriptor = "I")
    public static int field8985;

    @OriginalMember(owner = "client!jm", name = "F", descriptor = "I")
    public static int field8986;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IFFF)F", line = 19)
    public static final float method3713(int arg0, float arg1, float arg2, float arg3) {
        field8985++;
        return arg0 > -11 ? -1.3166469F : (arg2 - arg3) * arg1 + arg3;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V", line = 30)
    public static void method3714(boolean arg0) {
        if (!arg0) {
            field8984 = null;
        }
        field8984 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIII)Z", line = 40)
    public static final boolean method3715(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 46) {
            field8986 = 28;
        }
        field8977++;
        if (!class185.field3114) {
            return false;
        } else if (class504.field7375 < 100) {
            return false;
        } else {
            int var4 = class97.field1577[arg3][arg1][arg2];
            if ((-class140.field2350) == var4) {
                return false;
            } else if (class140.field2350 == var4) {
                return true;
            } else if (class587.field8346 == class493.field7208) {
                return false;
            } else {
                int var5 = arg1 << class439.field6699;
                int var6 = arg2 << class439.field6699;
                if (class705.method3975(class587.field8346[arg3].method479(arg2 + 1, arg1 + 1, -96), class587.field8346[arg3].method479(arg2 + 1, arg1, 95), var5 + 1, var6 - (-class134.field2203 + 1), (byte) -125, var5 + 1, class134.field2203 + var6 + -1, var6 + 1, class134.field2203 + -1 + var5, class587.field8346[arg3].method479(arg2, arg1, -92)) && class705.method3975(class587.field8346[arg3].method479(arg2, arg1 + 1, 109), class587.field8346[arg3].method479(arg2 + 1, arg1 - -1, -94), var5 + 1, var6 - -class134.field2203 + -1, (byte) -126, class134.field2203 + var5 - 1, var6 - -1, var6 + 1, var5 + -1 + class134.field2203, class587.field8346[arg3].method479(arg2, arg1, 59))) {
                    class524.field7621++;
                    class97.field1577[arg3][arg1][arg2] = class140.field2350;
                    return true;
                } else {
                    class97.field1577[arg3][arg1][arg2] = -class140.field2350;
                    return false;
                }
            }
        }
    }
}
