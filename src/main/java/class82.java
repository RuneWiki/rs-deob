import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class82 extends class196 {

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    private final int field1435;

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "I")
    private final int field1444;

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
    private final int field1443;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    private final int field1437;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "Loa;")
    private static class99 field1436 = class221.method1463(2844, "Loading textures )2 ");

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "Loa;")
    public static class99 field1440 = class221.method1463(2844, "Polices charg-Bes");

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "Loa;")
    private static class99 field1441 = class221.method1463(2844, "Loaded update list");

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "Loa;")
    public static class99 field1447 = field1436;

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "Loa;")
    public static class99 field1448 = field1441;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "Lgd;")
    public static class74 field1438 = new class74(128);

    @OriginalMember(owner = "client!lk", name = "E", descriptor = "I")
    public static int field1450 = 0;

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "Loa;")
    public static class99 field1449 = class221.method1463(2844, "tbrefresh");

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(III)V")
    public final void method277(int arg0, int arg1, int arg2) {
        ++field1439;
        if (arg2 == 0) {
            int var4 = this.field1435 * arg0 >> 12;
            int var5 = this.field1443 * arg0 >> 12;
            int var6 = this.field1437 * arg1 >> 12;
            int var7 = this.field1444 * arg1 >> 12;
            class115.method779(arg2 + -22, super.field3421, var4, super.field3422, var5, var6, var7, super.field3412);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V")
    public static void method562(boolean arg0) {
        field1447 = null;
        field1440 = null;
        field1441 = null;
        field1448 = null;
        field1436 = null;
        if (arg0) {
            field1438 = null;
            field1449 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)V")
    public final void method275(int arg0, int arg1, int arg2) {
        if (arg2 == 205) {
            ++field1434;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method563(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != 16777215) {
            field1438 = null;
        }
        ++field1445;
        int var7 = -arg3 + arg2;
        int var8 = -arg3 + arg4;
        int var9 = arg3 + arg5;
        int var10 = arg0 + arg3;
        for (int var11 = arg5; var11 < var9; ++var11) {
            class175.method1174(class124.field2177[var11], arg1, arg6 + -16777222, arg0, arg2);
        }
        for (int var12 = arg4; ~var8 > ~var12; --var12) {
            class175.method1174(class124.field2177[var12], arg1, arg6 + -16777222, arg0, arg2);
        }
        for (int var13 = var9; var8 >= var13; ++var13) {
            int[] var14 = class124.field2177[var13];
            class175.method1174(var14, arg1, -7, arg0, var10);
            class175.method1174(var14, arg1, -7, var7, arg2);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)Lhl;")
    public static final class39 method564(int arg0, int arg1) {
        ++field1442;
        class39 var2 = (class39) class267.field4707.method1811((long) arg1, arg0 + -86);
        if (arg0 != 0) {
            field1450 = -82;
        }
        if (var2 != null) {
            return var2;
        } else {
            class39 var3 = class192.method1298((byte) 72, arg1, class207.field3576, class54.field878, false);
            if (var3 != null) {
                class267.field4707.method1817((long) arg1, arg0 + 16, var3);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(IIIIIII)V")
    public class82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1435 = arg0;
        this.field1444 = arg3;
        this.field1443 = arg2;
        this.field1437 = arg1;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIB)V")
    public final void method271(int arg0, int arg1, byte arg2) {
        ++field1446;
        int var4 = this.field1435 * arg0 >> 12;
        int var5 = this.field1443 * arg0 >> 12;
        if (arg2 != 108) {
            method563(-68, -107, -98, 66, -61, -31, -98);
        }
        int var6 = this.field1444 * arg1 >> 12;
        int var7 = this.field1437 * arg1 >> 12;
        class254.method1640(var7, var6, (byte) 78, var4, super.field3421, var5);
    }
}
