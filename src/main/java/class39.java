import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class39 extends class99 {

    @OriginalMember(owner = "client!g", name = "mb", descriptor = "[Lkb;")
    public class61[] field1010;

    @OriginalMember(owner = "client!g", name = "eb", descriptor = "Lpd;")
    private static class94 field1002 = class28.method249(94, "Hide");

    @OriginalMember(owner = "client!g", name = "ib", descriptor = "Lpd;")
    public static class94 field1006 = field1002;

    @OriginalMember(owner = "client!g", name = "db", descriptor = "Lpd;")
    private static class94 field1001 = class28.method249(-66, "Take");

    @OriginalMember(owner = "client!g", name = "gb", descriptor = "Lpd;")
    public static class94 field1004 = field1001;

    @OriginalMember(owner = "client!g", name = "kb", descriptor = "[Lpd;")
    public static class94[] field1008 = new class94[500];

    @OriginalMember(owner = "client!g", name = "jb", descriptor = "Lte;")
    public static class119 field1007 = new class119();

    @OriginalMember(owner = "client!g", name = "qb", descriptor = "Z")
    public static boolean field1014 = false;

    @OriginalMember(owner = "client!g", name = "pb", descriptor = "Lpd;")
    public static class94 field1013 = class28.method249(19, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!g", name = "rb", descriptor = "Lpd;")
    private static class94 field1015 = class28.method249(-55, "No response from server)3");

    @OriginalMember(owner = "client!g", name = "ob", descriptor = "Lpd;")
    public static class94 field1012 = field1015;

    @OriginalMember(owner = "client!g", name = "sb", descriptor = "Lvc;")
    public static class128 field1016 = new class128(50);

    @OriginalMember(owner = "client!g", name = "O", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!g", name = "fb", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!g", name = "hb", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!g", name = "lb", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!g", name = "nb", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!g", name = "ub", descriptor = "Ls;")
    public static class111 field1018;

    @OriginalMember(owner = "client!g", name = "tb", descriptor = "Lkc;")
    public static class62 field1017;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V", line = 13)
    public static final void method294(int arg0) {
        for (class37 var1 = (class37) field1007.method895(-14156); var1 != null; var1 = (class37) field1007.method893(true)) {
            if (var1.field963 == -1) {
                var1.field951 = 0;
                class28.method253(-8868, var1);
            } else {
                var1.method1074((byte) -28);
            }
        }
        if (arg0 != -1) {
            field1004 = null;
        }
        field1009++;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Lsc;", line = 51)
    public static final class110 method295(int arg0, int arg1) {
        field1005++;
        class110 var2 = (class110) class127.field3186.method1007((long) arg0, (byte) -49);
        if (arg1 != 1) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class4.field78.method808((byte) -75, 10, arg0);
            class110 var4 = new class110();
            var4.field2736 = arg0;
            if (var3 != null) {
                var4.method797(new class122(var3), (byte) 125);
            }
            var4.method801(arg1 - 123);
            if (var4.field2710 != -1) {
                var4.method799(1, method295(var4.field2710, arg1), method295(var4.field2706, 1));
            }
            if (!class21.field568 && var4.field2737) {
                var4.field2698 = null;
                var4.field2745 = null;
                var4.field2713 = class126.field3161;
                var4.field2696 = 0;
            }
            class127.field3186.method1012(50, var4, (long) arg0);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(Z)V", line = 89)
    public static final void method296(boolean arg0) {
        if (arg0) {
            method294(-16);
        }
        field1011++;
        class92.field2360.method496(55);
        class46.field1140.method33(0, 0);
        class41.field1046 = class124.method985(class41.field1046);
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "(Z)Lea;", line = 106)
    public static final class25 method297(boolean arg0) {
        if (!arg0) {
            method295(-76, -91);
        }
        field1000++;
        try {
            return (class25) Class.forName("jc").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class107();
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IZ)Z", line = 130)
    public final boolean method298(int arg0, boolean arg1) {
        field1003++;
        if (arg1) {
            method296(false);
        }
        return this.field1010[arg0].field1490;
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(I)V", line = 145)
    public static void method299(int arg0) {
        field1004 = null;
        field1015 = null;
        field1018 = null;
        field1013 = null;
        field1006 = null;
        field1016 = null;
        field1001 = null;
        field1008 = null;
        field1012 = null;
        field1007 = null;
        field1002 = null;
        if (arg0 != 1) {
            field1018 = null;
        }
        field1017 = null;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Ls;Ls;IZ)V", line = 177)
    public class39(class111 arg0, class111 arg1, int arg2, boolean arg3) {
        class119 var5 = new class119();
        int var6 = arg0.method825(true, arg2);
        this.field1010 = new class61[var6];
        int[] var7 = arg0.method809(arg2, -9058);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method808((byte) 75, arg2, var7[var8]);
            int var10 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            class90 var11 = null;
            for (class90 var12 = (class90) var5.method895(-14156); var12 != null; var12 = (class90) var5.method893(true)) {
                if (var12.field2345 == var10) {
                    var11 = var12;
                    break;
                }
            }
            if (var11 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method810(-1, 0, var10);
                } else {
                    var13 = arg1.method810(-1, var10, 0);
                }
                var11 = new class90(var10, var13);
                var5.method894(12800, var11);
            }
            this.field1010[var7[var8]] = new class61(var9, var11);
        }
    }
}
