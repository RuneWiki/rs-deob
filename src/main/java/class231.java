import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class231 extends class64 {

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "[Lec;")
    public class23[] field4061 = new class23[5];

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "I")
    public int field4068 = 0;

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "[I")
    public int[] field4054 = new int[5];

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    public int field4049;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
    public int field4050;

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "I")
    public int field4064;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "I")
    public int field4067;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "Lgk;")
    public static class157 field4045 = new class157();

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "Lve;")
    public static class189 field4066 = new class189(50);

    @OriginalMember(owner = "client!ra", name = "W", descriptor = "Lid;")
    public static class149 field4074 = class60.method382("(Y<)4col>", (byte) 119);

    @OriginalMember(owner = "client!ra", name = "V", descriptor = "Lid;")
    private static class149 field4073 = class60.method382("Loaded fonts", (byte) 74);

    @OriginalMember(owner = "client!ra", name = "X", descriptor = "Lid;")
    private static class149 field4075 = class60.method382("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", (byte) 87);

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "Lid;")
    public static class149 field4071 = field4075;

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "Lid;")
    public static class149 field4076 = field4073;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public int field4047;

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "I")
    public int field4057;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "I")
    public int field4060;

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "I")
    public int field4062;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "I")
    public int field4072;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "Lpk;")
    public class100 field4048;

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "Lhk;")
    public class125 field4053;

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "Lmh;")
    public class152 field4052;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "Lnf;")
    public class158 field4056;

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "Lma;")
    public class188 field4059;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "Lvc;")
    public static class190 field4069;

    @OriginalMember(owner = "client!ra", name = "Z", descriptor = "Lal;")
    public static class230 field4077;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "Lra;")
    public class231 field4065;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "Lkb;")
    public class53 field4051;

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "Z")
    public boolean field4055;

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "Z")
    public boolean field4058;

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "Z")
    public boolean field4063;

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(III)V")
    public class231(int arg0, int arg1, int arg2) {
        this.field4049 = arg2;
        this.field4050 = arg1;
        this.field4067 = this.field4064 = arg0;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public static void method1563(int arg0) {
        field4076 = null;
        field4075 = null;
        field4045 = null;
        field4071 = null;
        field4074 = null;
        field4066 = null;
        field4077 = null;
        field4069 = null;
        field4073 = null;
        if (arg0 != -21485) {
            field4076 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZZIZI)Lal;")
    public static final class230 method1564(boolean arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        field4044++;
        class166 var5 = null;
        if (arg4 != 6021) {
            return null;
        }
        if (class259.field4546 != null) {
            var5 = new class166(arg2, class259.field4546, class36.field538[arg2], 1000000);
        }
        class25.field378[arg2] = class258.field4511.method936(false, arg2, class34.field488, var5);
        if (arg1) {
            class25.field378[arg2].method1341((byte) -31);
        }
        return new class230(class25.field378[arg2], arg0, arg3);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V")
    public static final void method1565(int arg0, int arg1) {
        field4046++;
        if (arg0 == -1 || !class226.field3953[arg0]) {
            return;
        }
        class45.field688.method1552(arg0, (byte) -105);
        if (class14.field206[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class14.field206[arg0].length; var3++) {
            if (class14.field206[arg0][var3] != null) {
                if (class14.field206[arg0][var3].field760 == 2) {
                    var2 = false;
                } else {
                    class14.field206[arg0][var3] = null;
                }
            }
        }
        if (arg1 != -556) {
            method1564(false, false, -82, false, -128);
        }
        if (var2) {
            class14.field206[arg0] = null;
        }
        class226.field3953[arg0] = false;
    }
}
