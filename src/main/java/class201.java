import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class201 {

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    private int field3335 = -1;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    private int field3339 = 0;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Loe;")
    private class137 field3334 = new class137();

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "Z")
    public boolean field3346 = false;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    private int field3344;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    private int field3332;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "[Lnd;")
    private class384[] field3338;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "[[[I")
    private int[][][] field3340;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Lak;")
    public static class234 field3337 = new class234("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "Lhn;")
    public static class509 field3343 = new class509(22, 2);

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)[[[I")
    public final int[][][] method1404(boolean arg0) {
        field3330++;
        if (arg0) {
            this.field3339 = 84;
        }
        if (this.field3344 != this.field3332) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field3332; var2++) {
            this.field3338[var2] = class291.field4374;
        }
        return this.field3340;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method1405(int arg0) {
        field3343 = null;
        field3337 = null;
        if (arg0 != 1025) {
            field3337 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1406(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3341++;
        if (arg4 != 22) {
            return;
        }
        if (class327.field4931 <= arg0 - arg6 && class184.field2777 >= (arg0 + arg6) && arg5 - arg6 >= class404.field5987 && arg5 + arg6 <= class433.field6414) {
            class494.method2938(arg3, 0, arg5, arg1, arg0, arg2, arg6);
        } else {
            class13.method99(arg5, arg2, arg0, arg3, arg1, arg6, 0);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIZZ)V")
    public static final void method1407(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class163.field2415 = arg0;
        class450.field6574 = 0x1 << class163.field2415;
        class5.field63 = class450.field6574 >> 1;
        class434.field6419 = (int) Math.sqrt((double) (class5.field63 * class5.field63 + class5.field63 * class5.field63));
        class87.field1244 = class450.field6574 >> 2;
        class335.field4993 = class450.field6574;
        class497.field7147 = arg2;
        class385.field5799 = arg3;
        class46.field602 = arg4;
        class258.field3939 = new class138[arg1][class497.field7147][class385.field5799];
        class289.field4358 = new class145[arg1];
        if (arg5) {
            class368.field5403 = new int[class497.field7147][class385.field5799];
            class182.field2722 = new byte[class497.field7147][class385.field5799];
            class76.field1100 = new short[class497.field7147][class385.field5799];
            class75.field1076 = new class138[1][class497.field7147][class385.field5799];
            class290.field4367 = new class145[1];
        } else {
            class368.field5403 = null;
            class182.field2722 = null;
            class76.field1100 = null;
            class75.field1076 = null;
            class290.field4367 = null;
        }
        if (arg6) {
            class329.field4942 = new long[arg1][arg2][arg3];
            class503.field7256 = new class396[65535];
            class455.field6629 = new boolean[65535];
            class316.field4756 = 0;
        } else {
            class329.field4942 = null;
            class503.field7256 = null;
            class455.field6629 = null;
            class316.field4756 = 0;
        }
        class528.method3119(false);
        class506.field7399 = new class74[1000];
        class233.field3756 = 0;
        class517.field7512 = new class74[1000];
        class305.field4596 = 0;
        class534.field7849 = new int[arg1][class497.field7147 + 1][class385.field5799 + 1];
        class308.field4643 = new class389[5000];
        class295.field4506 = 0;
        class265.field4070 = new boolean[class46.field602 + class46.field602 + 1][class46.field602 + class46.field602 + 1];
        class60.field721 = new boolean[class46.field602 + class46.field602 + 2][class46.field602 + class46.field602 + 2];
        class358.field5320 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
    public static final void method1408(byte arg0) {
        class200.field3326 = new class114[class73.field1043.method2561(-97)][];
        int var1 = 88 % ((-arg0 - 58) / 55);
        field3331++;
        class283.field4301 = new class114[class73.field1043.method2561(-96)][];
        class341.field5065 = new boolean[class73.field1043.method2561(-121)];
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)V")
    public final void method1409(byte arg0) {
        field3342++;
        for (int var2 = 0; var2 < this.field3332; var2++) {
            this.field3340[var2][0] = null;
            this.field3340[var2][1] = null;
            this.field3340[var2][2] = null;
            this.field3340[var2] = null;
        }
        this.field3338 = null;
        int var3 = -49 % ((arg0 + 66) / 45);
        this.field3340 = null;
        this.field3334.method993(97);
        this.field3334 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)[[I")
    public final int[][] method1410(int arg0, int arg1) {
        if (arg1 != 31649) {
            this.method1404(false);
        }
        field3345++;
        if (this.field3344 == this.field3332) {
            this.field3346 = this.field3338[arg0] == null;
            this.field3338[arg0] = class291.field4374;
            return this.field3340[arg0];
        } else if (this.field3332 == 1) {
            this.field3346 = this.field3335 != arg0;
            this.field3335 = arg0;
            return this.field3340[0];
        } else {
            class384 var3 = this.field3338[arg0];
            if (var3 == null) {
                this.field3346 = true;
                if (this.field3339 >= this.field3332) {
                    class384 var4 = (class384) this.field3334.method1002((byte) 36);
                    var3 = new class384(arg0, var4.field5777);
                    this.field3338[var4.field5776] = null;
                    var4.method2677(-22491);
                } else {
                    var3 = new class384(arg0, this.field3339);
                    this.field3339++;
                }
                this.field3338[arg0] = var3;
            } else {
                this.field3346 = false;
            }
            this.field3334.method998(var3, 100);
            return this.field3340[var3.field5777];
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method1411(String arg0, boolean arg1) {
        if (!arg1) {
            field3343 = null;
        }
        System.out.println("Error: " + class529.method3130(arg0, "%0a", "\n", 119));
        field3333++;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(II)Z")
    public static final boolean method1412(int arg0, int arg1) {
        if (arg1 != -1) {
            field3337 = null;
        }
        field3336++;
        return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(III)V")
    public class201(int arg0, int arg1, int arg2) {
        this.field3344 = arg1;
        this.field3332 = arg0;
        this.field3338 = new class384[this.field3344];
        this.field3340 = new int[this.field3332][3][arg2];
    }
}
