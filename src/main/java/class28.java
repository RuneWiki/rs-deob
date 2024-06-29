import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class28 extends class36 {

    @OriginalMember(owner = "client!ql", name = "G", descriptor = "Ljava/lang/String;")
    private String field348 = "null";

    @OriginalMember(owner = "client!ql", name = "M", descriptor = "Ljava/lang/String;")
    public static String field353 = "Loaded world list data";

    @OriginalMember(owner = "client!ql", name = "E", descriptor = "I")
    public static int field347 = 0;

    @OriginalMember(owner = "client!ql", name = "A", descriptor = "C")
    public char field343;

    @OriginalMember(owner = "client!ql", name = "N", descriptor = "C")
    public char field354;

    @OriginalMember(owner = "client!ql", name = "H", descriptor = "F")
    public static float field349;

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!ql", name = "y", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!ql", name = "C", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!ql", name = "D", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!ql", name = "J", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!ql", name = "L", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!ql", name = "O", descriptor = "I")
    private int field355;

    @OriginalMember(owner = "client!ql", name = "P", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!ql", name = "R", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!ql", name = "S", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!ql", name = "U", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!ql", name = "V", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!ql", name = "B", descriptor = "Lik;")
    public class17 field344;

    @OriginalMember(owner = "client!ql", name = "I", descriptor = "Lik;")
    private class17 field350;

    @OriginalMember(owner = "client!ql", name = "T", descriptor = "Lvj;")
    public static class279 field360;

    @OriginalMember(owner = "client!ql", name = "Q", descriptor = "Ltd;")
    public static class283 field357;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)V", line = 4)
    private final void method159(int arg0) {
        this.field350 = new class17(this.field344.method113(true));
        field339++;
        int var2 = 101 / ((arg0 - 22) / 55);
        for (class213 var3 = (class213) this.field344.method110(0); var3 != null; var3 = (class213) this.field344.method115(0)) {
            class42 var4 = new class42(var3.field3074, (int) var3.field2522);
            this.field350.method120(class287.method1968((byte) -116, var3.field3074), var4, -22851);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIII)I", line = 30)
    public static final int method160(int arg0, int arg1, int arg2, int arg3) {
        field362++;
        if (arg0 <= 49) {
            field353 = (String) null;
        }
        if ((class240.field3406[arg3][arg2][arg1] & 0x8) == 0) {
            return arg3 <= 0 || (class240.field3406[1][arg2][arg1] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(I)V", line = 49)
    public static void method161(int arg0) {
        field353 = null;
        field360 = null;
        if (arg0 != 1) {
            field347 = 44;
        }
        field357 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IB)I", line = 61)
    public final int method162(int arg0, byte arg1) {
        field342++;
        if (this.field344 == null) {
            return this.field355;
        } else {
            class336 var3 = (class336) this.field344.method111(-108, (long) arg0);
            int var4 = 37 % ((arg1 + 38) / 60);
            return var3 == null ? this.field355 : var3.field5063;
        }
    }

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)V", line = 86)
    public static final void method163(int arg0) {
        class336.field5061.method724(0);
        if (arg0 != -3) {
            method173((byte) 78);
        }
        class210.field3029.method724(0);
        field341++;
    }

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "(I)V", line = 100)
    private final void method164(int arg0) {
        this.field350 = new class17(this.field344.method113(true));
        if (arg0 != -4) {
            field347 = -120;
        }
        field361++;
        for (class336 var2 = (class336) this.field344.method110(0); var2 != null; var2 = (class336) this.field344.method115(arg0 ^ 0xFFFFFFFC)) {
            class336 var3 = new class336((int) var2.field2522);
            this.field350.method120((long) var2.field5063, var3, -22851);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)Ljava/lang/String;", line = 122)
    public final String method165(int arg0, int arg1) {
        if (arg1 > -3) {
            field357 = (class283) null;
        }
        field346++;
        if (this.field344 == null) {
            return this.field348;
        } else {
            class213 var3 = (class213) this.field344.method111(96, (long) arg0);
            return var3 == null ? this.field348 : var3.field3074;
        }
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(B)V", line = 145)
    public static final void method166(byte arg0) {
        class163.field2241 = null;
        class61.field809 = null;
        if (arg0 >= -92) {
            field349 = -0.023046864F;
        }
        class294.field4371 = null;
        class249.field3576 = null;
        class213.field3076 = null;
        field351++;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(II)Z", line = 160)
    public final boolean method167(int arg0, int arg1) {
        field359++;
        if (this.field344 == null) {
            return false;
        }
        if (arg1 != 1) {
            this.field354 = (char) 65444;
        }
        if (this.field350 == null) {
            this.method164(-4);
        }
        class336 var3 = (class336) this.field350.method111(85, (long) arg0);
        return var3 != null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILcg;I)V", line = 186)
    private final void method168(int arg0, class316 arg1, int arg2) {
        field338++;
        if (arg0 != 4199) {
            this.method169(-39, (class316) null);
        }
        if (arg2 == 1) {
            this.field343 = class266.method1807(arg1.method2192(arg0 ^ 0x1064), true);
        } else if (arg2 == 2) {
            this.field354 = class266.method1807(arg1.method2192(3), true);
        } else if (arg2 == 3) {
            this.field348 = arg1.method2158(-872702056);
        } else if (arg2 == 4) {
            this.field355 = arg1.method2172((byte) 71);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method2220((byte) 79);
            this.field344 = new class17(class110.method804(var4, (byte) 72));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method2172((byte) 71);
                class183 var7;
                if (arg2 == 5) {
                    var7 = new class213(arg1.method2158(-872702056));
                } else {
                    var7 = new class336(arg1.method2172((byte) 71));
                }
                this.field344.method120((long) var6, var7, -22851);
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILcg;)V", line = 244)
    public final void method169(int arg0, class316 arg1) {
        int var3 = 79 % ((72 - arg0) / 52);
        field340++;
        while (true) {
            int var4 = arg1.method2219(16448);
            if (var4 == 0) {
                return;
            }
            this.method168(4199, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(BI)V", line = 265)
    public static final void method170(byte arg0, int arg1) {
        int var2 = -47 % ((-arg0 - 22) / 51);
        field352++;
        if (class269.method1854((byte) -107, arg1)) {
            class230.method1599(class241.field3419[arg1], -1, 0);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 291)
    public final boolean method171(String arg0, int arg1) {
        field345++;
        if (arg1 != -8753) {
            this.field348 = (String) null;
        }
        if (this.field344 == null) {
            return false;
        }
        if (this.field350 == null) {
            this.method159(arg1 + 8697);
        }
        for (class42 var3 = (class42) this.field350.method111(arg1 + 8826, class287.method1968((byte) -124, arg0)); var3 != null; var3 = (class42) this.field350.method121(120)) {
            if (var3.field477.equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(B)V", line = 319)
    public static final void method172(byte arg0) {
        field358++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class204.field2938 - 1; var2++) {
                if (class54.field722[var2] < 1000 && class54.field722[var2 + 1] > 1000) {
                    var1 = false;
                    String var3 = class88.field1251[var2];
                    class88.field1251[var2] = class88.field1251[var2 + 1];
                    class88.field1251[var2 + 1] = var3;
                    String var4 = class111.field1487[var2];
                    class111.field1487[var2] = class111.field1487[var2 + 1];
                    class111.field1487[var2 + 1] = var4;
                    int var5 = class334.field5049[var2];
                    class334.field5049[var2] = class334.field5049[var2 + 1];
                    class334.field5049[var2 + 1] = var5;
                    int var6 = class20.field252[var2];
                    class20.field252[var2] = class20.field252[var2 + 1];
                    class20.field252[var2 + 1] = var6;
                    int var7 = class135.field1868[var2];
                    class135.field1868[var2] = class135.field1868[var2 + 1];
                    class135.field1868[var2 + 1] = var7;
                    short var8 = class54.field722[var2];
                    class54.field722[var2] = class54.field722[var2 + 1];
                    class54.field722[var2 + 1] = var8;
                    long var9 = class230.field3264[var2];
                    class230.field3264[var2] = class230.field3264[var2 + 1];
                    class230.field3264[var2 + 1] = var9;
                }
            }
        }
        if (arg0 > -51) {
            method172((byte) -92);
        }
    }

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "(B)V", line = 378)
    public static final void method173(byte arg0) {
        field356++;
        if (arg0 != -123) {
            field360 = (class279) null;
        }
        class241.field3419 = new class344[class89.field1258.method952((byte) 21)][];
        class157.field2170 = new boolean[class89.field1258.method952((byte) 126)];
    }
}
