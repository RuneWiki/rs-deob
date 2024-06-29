import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class312 {

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public int field4461 = -1;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public int field4459 = -1;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "S")
    public static short field4471 = 205;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "[[I")
    public static int[][] field4469 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public static int field4474 = -1;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "Los;")
    public static class378 field4473;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "Lfl;")
    public static class386 field4460;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "[I")
    public int[] field4464;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "[[S")
    public static short[][] field4467;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILjava/lang/String;)I", line = 6)
    public static final int method1943(int arg0, String arg1) {
        field4463++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = arg0; var2 < class26.field463; var2++) {
            if (arg1.equalsIgnoreCase(class164.field2128[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V", line = 31)
    public static void method1944(boolean arg0) {
        if (arg0) {
            field4460 = null;
        }
        field4467 = null;
        field4473 = null;
        field4460 = null;
        field4469 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILil;I)V", line = 44)
    public final void method1945(int arg0, class265 arg1, int arg2) {
        int var4 = -9 / ((arg0 - 63) / 47);
        field4472++;
        while (true) {
            int var5 = arg1.method1697(-42);
            if (var5 == 0) {
                return;
            }
            this.method1948(var5, arg1, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(CI)Z", line = 64)
    public static final boolean method1946(char arg0, int arg1) {
        field4470++;
        if (arg1 == 18768) {
            return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIILjava/lang/Class;)Lme;", line = 76)
    public static final class361 method1947(int arg0, int arg1, int arg2, Class arg3) {
        class10 var4 = class343.field5032[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class39 var5 = var4.field109; var5 != null; var5 = var5.field627) {
            class361 var6 = var5.field621;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field5296 == arg1 && var6.field5288 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILil;II)V", line = 101)
    private final void method1948(int arg0, class265 arg1, int arg2, int arg3) {
        if (arg0 == 1) {
            this.field4459 = arg1.method1685(8104);
        } else if (arg0 == 2) {
            this.field4464 = new int[arg1.method1697(-58)];
            for (int var5 = 0; var5 < this.field4464.length; var5++) {
                this.field4464[var5] = arg1.method1685(8104);
            }
        } else if (arg0 == 3) {
            this.field4461 = arg1.method1697(-92);
        }
        if (arg3 == 0) {
            field4466++;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)V", line = 145)
    public static final void method1949(int arg0, int arg1, int arg2) {
        class10 var3 = class343.field5032[arg0][arg1][arg2];
        if (var3 != null && var3.field124 != null) {
            var3.field124 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(III)V", line = 157)
    public static final void method1950(int arg0, int arg1, int arg2) {
        field4462++;
        class395 var3 = class439.method2776(arg1, 0);
        int var4 = var3.field5934;
        int var5 = var3.field5940;
        int var6 = var3.field5937;
        int var7 = class153.field1998[var6 - var5];
        if (arg0 < 0 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        if (arg2 != 4) {
            method1947(16, 1, -8, (Class) null);
        }
        class236.method1445(var4, -4791, var8 & arg0 << var5 | ~var8 & class192.field2668[var4]);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V", line = 190)
    public static final void method1951(int arg0) {
        if (arg0 != 2878) {
            method1951(-112);
        }
        field4468++;
        if (!class95.field1307) {
            return;
        }
        class249 var1 = class358.method2355(class94.field1304, class300.field4307, (byte) -111);
        if (var1 != null && var1.field3538 != null) {
            class228 var2 = new class228();
            var2.field3215 = var1.field3538;
            var2.field3210 = var1;
            class365.method2395(var2);
        }
        class95.field1307 = false;
        class19.field314 = -1;
        class392.method2564(-117, var1);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)I", line = 221)
    public static final int method1952(int arg0, int arg1) {
        field4465++;
        class395 var2 = class439.method2776(arg0, 0);
        int var3 = var2.field5934;
        int var4 = var2.field5940;
        if (arg1 != -1) {
            method1952(-34, 22);
        }
        int var5 = var2.field5937;
        int var6 = class153.field1998[var5 - var4];
        return class192.field2668[var3] >> var4 & var6;
    }
}
