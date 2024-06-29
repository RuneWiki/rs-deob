import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class69 {

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "Ltm;")
    private class187 field727 = new class187();

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "Lph;")
    public static class114 field722 = new class114(16);

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "Z")
    public static boolean field726 = true;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "Ljava/lang/String;")
    public static String field728 = "green:";

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "[I")
    public static int[] field732 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "Ltm;")
    private class187 field731;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V", line = 3)
    public static void method390(int arg0) {
        field728 = null;
        field732 = null;
        if (arg0 == 1) {
            field722 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V", line = 17)
    public final void method391(byte arg0) {
        while (true) {
            class187 var2 = this.field727.field2358;
            if (this.field727 == var2) {
                field725++;
                if (arg0 != 114) {
                    field728 = null;
                }
                this.field731 = null;
                return;
            }
            var2.method1009((byte) -110);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)I", line = 41)
    public final int method392(int arg0) {
        field724++;
        int var2 = arg0;
        for (class187 var3 = this.field727.field2358; var3 != this.field727; var3 = var3.field2358) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLtm;)V", line = 60)
    public final void method393(byte arg0, class187 arg1) {
        field723++;
        if (arg1.field2362 != null) {
            arg1.method1009((byte) -46);
        }
        arg1.field2362 = this.field727.field2362;
        arg1.field2358 = this.field727;
        arg1.field2362.field2358 = arg1;
        if (arg0 < 46) {
            this.field731 = null;
        }
        arg1.field2358.field2362 = arg1;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Llh;ZILjava/lang/String;Z)V", line = 80)
    public static final void method394(class450 arg0, boolean arg1, int arg2, String arg3, boolean arg4) {
        if (arg2 > -52) {
            return;
        }
        field730++;
        if (!arg4) {
            class306.method1797(3, (byte) 68, arg3, arg0);
            return;
        }
        if (class450.field6539.startsWith("win") && class450.field6549 != 3) {
            String var5 = null;
            if (arg0.field6532 != null) {
                var5 = arg0.field6532.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class304 var6 = class306.method1797(0, (byte) 111, arg3, arg0);
                class104.field1273 = var6;
                class143.field1820 = arg3;
                class248.field3348 = arg0;
                return;
            }
        }
        if (class450.field6539.startsWith("mac")) {
            String var7 = null;
            if (arg0.field6532 != null) {
                var7 = arg0.field6532.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg1) {
                class306.method1797(1, (byte) 55, arg3, arg0);
                return;
            }
        }
        class306.method1797(2, (byte) 111, arg3, arg0);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)V", line = 153)
    public static final void method395(byte arg0, int arg1) {
        field719++;
        class390.field5598 = arg1;
        int var2 = -113 / ((-arg0 - 55) / 59);
        class427.field6253.method613(true);
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V", line = 165)
    public static final void method396(int arg0) {
        class209.field2847 = new class405(class380.field5424, "", class373.field5205, 1007, 0L, arg0, 0);
        field721++;
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)Ltm;", line = 175)
    public final class187 method397(int arg0) {
        field729++;
        if (arg0 != 18244) {
            return null;
        }
        class187 var2 = this.field731;
        if (this.field727 == var2) {
            this.field731 = null;
            return null;
        } else {
            this.field731 = var2.field2358;
            return var2;
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V", line = 234)
    public class69() {
        this.field727.field2362 = this.field727;
        this.field727.field2358 = this.field727;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)Ltm;", line = 205)
    public final class187 method398(byte arg0) {
        if (arg0 != 38) {
            this.method399(118);
        }
        field720++;
        class187 var2 = this.field727.field2358;
        if (this.field727 == var2) {
            return null;
        } else {
            var2.method1009((byte) 125);
            return var2;
        }
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)Ltm;", line = 246)
    public final class187 method399(int arg0) {
        field733++;
        if (arg0 <= 122) {
            this.method392(-71);
        }
        class187 var2 = this.field727.field2358;
        if (this.field727 == var2) {
            this.field731 = null;
            return null;
        } else {
            this.field731 = var2.field2358;
            return var2;
        }
    }
}
