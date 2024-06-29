import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class245 {

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field4306 = 0;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "Lid;")
    public static class149 field4307 = class60.method382("www", (byte) 124);

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field4308 = -1;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "[I")
    public static int[] field4313 = new int[14];

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "Lid;")
    public static class149 field4315 = class60.method382("Stufe: ", (byte) 119);

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "Lal;")
    public static class230 field4309;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "[Lrf;")
    public static class281[] field4305;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lal;I)I")
    public static final int method1707(class230 arg0, int arg1) {
        field4310++;
        int var2 = 0;
        if (arg1 < 109) {
            field4315 = null;
        }
        if (arg0.method1556(class182.field3278, true)) {
            var2++;
        }
        if (arg0.method1556(class185.field3338, true)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V")
    public static void method1708(boolean arg0) {
        field4309 = null;
        field4315 = null;
        if (arg0) {
            method1708(true);
        }
        field4313 = null;
        field4307 = null;
        field4305 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)Lwa;")
    public static final class257 method1709(int arg0, int arg1) {
        field4312++;
        class257 var2 = (class257) class259.field4552.method1293((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        int var3 = 41 % ((arg1 + 60) / 63);
        byte[] var4 = class259.field4553.method1562(-809612665, arg0, 4);
        class257 var5 = new class257();
        if (var4 != null) {
            var5.method1772(new class74(var4), (byte) 103, arg0);
        }
        class259.field4552.method1295((long) arg0, var5, (byte) -71);
        return var5;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IJ)V")
    public static final void method1710(int arg0, long arg1) {
        field4304++;
        if ((long) arg0 == arg1) {
            return;
        }
        for (int var3 = 0; var3 < class16.field229; var3++) {
            if (class139.field2545[var3] == arg1) {
                class16.field229--;
                for (int var4 = var3; var4 < class16.field229; var4++) {
                    class139.field2545[var4] = class139.field2545[var4 + 1];
                    class31.field457[var4] = class31.field457[var4 + 1];
                }
                class211.field3757++;
                class38.field562 = class90.field1606;
                class208.field3720.method162(2, 213);
                class208.field3720.method496(2, arg1);
                return;
            }
        }
    }
}
