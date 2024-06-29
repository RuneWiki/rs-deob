import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class283 {

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "Loh;")
    public static class258 field4857 = class153.method1046("blinken1:", 108);

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "[Loh;")
    public static class258[] field4860 = new class258[8];

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field4859 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public static int field4863 = 0;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIBIIII)V", line = 20)
    public static final void method1982(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field4865++;
        int var8 = class203.method1347(class241.field4189, arg7, arg3 ^ 0xFFFFFFC9, class94.field1654);
        int var9 = class203.method1347(class241.field4189, arg4, 1, class94.field1654);
        int var10 = class203.method1347(class75.field1314, arg0, 1, class206.field3562);
        int var11 = class203.method1347(class75.field1314, arg6, 1, class206.field3562);
        int var12 = class203.method1347(class241.field4189, arg2 + arg7, 1, class94.field1654);
        int var13 = class203.method1347(class241.field4189, arg4 - arg2, 1, class94.field1654);
        for (int var14 = var8; var14 < var12; var14++) {
            class19.method126(arg3 ^ 0xFFFFFFCF, arg1, class154.field2638[var14], var10, var11);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class19.method126(7, arg1, class154.field2638[var15], var10, var11);
        }
        int var16 = class203.method1347(class75.field1314, arg0 + arg2, arg3 + 57, class206.field3562);
        int var17 = class203.method1347(class75.field1314, arg6 - arg2, arg3 + 57, class206.field3562);
        if (arg3 != -56) {
            field4860 = (class258[]) null;
        }
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class154.field2638[var18];
            class19.method126(7, arg1, var19, var10, var16);
            class19.method126(7, arg5, var19, var16, var17);
            class19.method126(arg3 ^ 0xFFFFFFCF, arg1, var19, var17, var11);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BI)V", line = 81)
    public static final void method1983(byte arg0, int arg1) {
        field4858++;
        class91 var2 = class299.field5112;
        synchronized (class299.field5112) {
            class246.field4267 = arg1;
            if (arg0 != 113) {
                field4864 = -93;
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V", line = 162)
    public static void method1984(byte arg0) {
        int var1 = 120 % ((arg0) / 34);
        field4857 = null;
        field4860 = null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BLgb;)V", line = 177)
    public static final void method1985(byte arg0, class213 arg1) {
        field4861++;
        if (class30.field353) {
            return;
        }
        if (class257.field4390) {
            class296.method2094();
        } else {
            class211.method1392();
        }
        class134.field2316 = class293.method2058((byte) 114, arg1, class224.field3840);
        int var2 = class42.field577;
        if (arg0 > -45) {
            field4863 = -64;
        }
        int var3 = var2 * 956 / 503;
        class134.field2316.method316((class218.field3773 - var3) / 2, 0, var3, var2);
        class56.field879 = class252.method1710(64, arg1, class103.field1878);
        class56.field879.method378(class218.field3773 / 2 - class56.field879.field1950 / 2, 18);
        class30.field353 = true;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILok;ZI)V", line = 236)
    public static final void method1986(int arg0, class107 arg1, boolean arg2, int arg3) {
        field4866++;
        if (arg2) {
            return;
        }
        if (arg1.field965 == arg3 && arg3 != -1) {
            class2 var4 = class263.method1842(arg3, (byte) -114);
            int var5 = var4.field31;
            if (var5 == 1) {
                arg1.field969 = arg0;
                arg1.field966 = 0;
                arg1.field976 = 0;
                arg1.field949 = 0;
                class122.method891(false, arg1.field934, arg1.field966, var4, (byte) -94, arg1.field912);
            }
            if (var5 == 2) {
                arg1.field976 = 0;
            }
        } else if (arg3 == -1 || arg1.field965 == -1 || class263.method1842(arg3, (byte) -114).field33 >= class263.method1842(arg1.field965, (byte) -114).field33) {
            arg1.field969 = arg0;
            arg1.field931 = arg1.field971;
            arg1.field949 = 0;
            arg1.field966 = 0;
            arg1.field965 = arg3;
            arg1.field976 = 0;
            if (arg1.field965 != -1) {
                class122.method891(false, arg1.field934, arg1.field966, class263.method1842(arg1.field965, (byte) -114), (byte) -67, arg1.field912);
            }
        }
    }
}
