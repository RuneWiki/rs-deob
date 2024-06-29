import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!i")
public class class15 {

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "Lt;")
    public static class36 field176 = class3.method8(13631, "Mining Shop");

    @OriginalMember(owner = "mapview!i", name = "g", descriptor = "I")
    private static int field181 = 0;

    @OriginalMember(owner = "mapview!i", name = "h", descriptor = "Lt;")
    public static class36 field182 = class3.method8(13631, "Suchen");

    @OriginalMember(owner = "mapview!i", name = "i", descriptor = "Lt;")
    public static class36 field183 = class3.method8(13631, "Fishing Shop");

    @OriginalMember(owner = "mapview!i", name = "f", descriptor = "Lt;")
    public static class36 field180 = class3.method8(13631, "Mace Shop");

    @OriginalMember(owner = "mapview!i", name = "e", descriptor = "I")
    public static int field179 = 0;

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "mapview!i", name = "d", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "mapview!i", name = "c", descriptor = "Lfa;")
    public static class11 field177;

    @OriginalMember(owner = "mapview!i", name = "j", descriptor = "Ls;")
    public static class34 field184;

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(B)V", line = 18)
    public static void method86(byte arg0) {
        field177 = null;
        field176 = null;
        if (arg0 == -126) {
            field183 = null;
            field180 = null;
            field182 = null;
            field184 = null;
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(II)[B", line = 47)
    public static final synchronized byte[] method87(int arg0, int arg1) {
        if (arg1 != 0) {
            return (byte[]) null;
        } else if (arg0 == 100 && class33.field464 > 0) {
            byte[] var2 = class5.field48[--class33.field464];
            class5.field48[class33.field464] = null;
            return var2;
        } else if (arg0 == 5000 && class2.field18 > 0) {
            byte[] var3 = class5.field52[--class2.field18];
            class5.field52[class2.field18] = null;
            return var3;
        } else if (arg0 == 30000 && field181 > 0) {
            byte[] var4 = mapview.field354[--field181];
            mapview.field354[field181] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(ILt;Lt;Lk;)[Lq;", line = 118)
    public static final class30[] method88(int arg0, class36 arg1, class36 arg2, class19 arg3) {
        int var4 = arg3.method102(arg0 - 30001, arg1);
        int var5 = arg3.method99(arg2, 0, var4);
        if (arg0 != 30000) {
            method88(-123, null, null, null);
        }
        return class8.method35(arg3, var5, 101, var4);
    }
}
