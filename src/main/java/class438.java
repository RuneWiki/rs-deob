import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class438 {

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "F")
    public float field6418 = 1.0F;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "F")
    public float field6412 = 1.0F;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "F")
    public float field6413 = 0.25F;

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "F")
    public float field6422;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
    public int field6415;

    @OriginalMember(owner = "client!qs", name = "x", descriptor = "I")
    public int field6433;

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "I")
    public int field6420;

    @OriginalMember(owner = "client!qs", name = "s", descriptor = "I")
    public int field6428;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "Lhs;")
    public class420 field6414;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "F")
    public float field6417;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
    public int field6410;

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "I")
    public int field6423;

    @OriginalMember(owner = "client!qs", name = "u", descriptor = "F")
    public float field6430;

    @OriginalMember(owner = "client!qs", name = "t", descriptor = "I")
    public static int field6429 = 0;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "I")
    public static int field6425;

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!qs", name = "r", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!qs", name = "v", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!qs", name = "w", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "Llm;")
    public static class347 field6421;

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "[I")
    public static int[] field6416;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IB)V")
    public static final void method2752(int arg0, byte arg1) {
        field6432++;
        if (arg1 != 121) {
            field6416 = null;
        }
        class189 var2 = class270.field3909;
        synchronized (class270.field3909) {
            class270.field3909.method1142((byte) -81, arg0);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
    public static void method2753(int arg0) {
        field6416 = null;
        field6421 = null;
        if (arg0 != -1) {
            field6416 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lqs;B)Z")
    public final boolean method2754(class438 arg0, byte arg1) {
        field6419++;
        if (arg1 != 87) {
            this.field6423 = -111;
        }
        return this.field6428 == arg0.field6428 && this.field6417 == arg0.field6417 && this.field6430 == arg0.field6430 && this.field6422 == arg0.field6422 && this.field6413 == arg0.field6413 && this.field6412 == arg0.field6412 && this.field6418 == arg0.field6418 && this.field6423 == arg0.field6423 && this.field6410 == arg0.field6410 && this.field6414 == arg0.field6414;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIII)V")
    public static final void method2755(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6424++;
        for (int var6 = arg1; var6 < arg1 + arg4; var6++) {
            for (int var9 = arg5; var9 < (arg3 + arg5); var9++) {
                if (var9 >= 0 && class192.field2574 > var9 && var6 >= 0 && var6 < class364.field5262) {
                    class331.field4817[arg2][var9][var6] = arg2 <= 0 ? 0 : class331.field4817[arg2 - 1][var9][var6] - 240;
                }
            }
        }
        if (arg0 <= 81) {
            field6421 = null;
        }
        if (arg5 > 0 && class192.field2574 > arg5) {
            for (int var7 = arg1 + 1; var7 < (arg1 + arg4); var7++) {
                if (var7 >= 0 && class364.field5262 > var7) {
                    class331.field4817[arg2][arg5][var7] = class331.field4817[arg2][arg5 - 1][var7];
                }
            }
        }
        if (arg1 > 0 && class364.field5262 > arg1) {
            for (int var8 = arg5 + 1; var8 < (arg3 + arg5); var8++) {
                if (var8 >= 0 && var8 < class192.field2574) {
                    class331.field4817[arg2][var8][arg1] = class331.field4817[arg2][var8][arg1 - 1];
                }
            }
        }
        if (arg5 < 0 || arg1 < 0 || arg5 >= class192.field2574 || arg1 >= class364.field5262) {
            return;
        }
        if (arg2 == 0) {
            if (arg5 > 0 && class331.field4817[arg2][arg5 - 1][arg1] != 0) {
                class331.field4817[arg2][arg5][arg1] = class331.field4817[arg2][arg5 - 1][arg1];
                return;
            }
            if (arg1 > 0 && class331.field4817[arg2][arg5][arg1 - 1] != 0) {
                class331.field4817[arg2][arg5][arg1] = class331.field4817[arg2][arg5][arg1 - 1];
                return;
            }
            if (arg5 > 0 && arg1 > 0 && class331.field4817[arg2][arg5 - 1][arg1 - 1] != 0) {
                class331.field4817[arg2][arg5][arg1] = class331.field4817[arg2][arg5 - 1][arg1 - 1];
                return;
            }
            return;
        }
        if (arg5 > 0 && class331.field4817[arg2 - 1][arg5 - 1][arg1] != class331.field4817[arg2][arg5 - 1][arg1]) {
            class331.field4817[arg2][arg5][arg1] = class331.field4817[arg2][arg5 - 1][arg1];
            return;
        }
        if (arg1 > 0 && class331.field4817[arg2][arg5][arg1 - 1] != class331.field4817[arg2 - 1][arg5][arg1 - 1]) {
            class331.field4817[arg2][arg5][arg1] = class331.field4817[arg2][arg5][arg1 - 1];
            return;
        }
        if (arg5 > 0 && arg1 > 0 && class331.field4817[arg2 - 1][arg5 - 1][arg1 - 1] != class331.field4817[arg2][arg5 - 1][arg1 - 1]) {
            class331.field4817[arg2][arg5][arg1] = class331.field4817[arg2][arg5 - 1][arg1 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(CBLjava/lang/String;)I")
    public static final int method2756(char arg0, byte arg1, String arg2) {
        field6431++;
        int var3 = 0;
        int var4 = arg2.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg2.charAt(var5) == arg0) {
                var3++;
            }
        }
        if (arg1 != 67) {
            field6429 = -98;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZ)V")
    public static final void method2757(int arg0, boolean arg1) {
        field6426++;
        for (class365 var2 = (class365) class185.field2509.method332(arg0 - 2130841183); var2 != null; var2 = (class365) class185.field2509.method343((byte) -103)) {
            if (var2.field5275 != null) {
                class156.field2122.method2502(var2.field5275);
                var2.field5275 = null;
            }
            if (var2.field5266 != null) {
                class156.field2122.method2502(var2.field5266);
                var2.field5266 = null;
            }
            var2.method322(11);
        }
        if (arg0 != -1) {
            field6429 = -88;
        }
        if (!arg1) {
            return;
        }
        for (class365 var3 = (class365) class22.field291.method332(-2130841184); var3 != null; var3 = (class365) class22.field291.method343((byte) -126)) {
            if (var3.field5275 != null) {
                class156.field2122.method2502(var3.field5275);
                var3.field5275 = null;
            }
            var3.method322(11);
        }
        for (class365 var4 = (class365) class254.field3522.method389(~arg0); var4 != null; var4 = (class365) class254.field3522.method388(0)) {
            if (var4.field5275 != null) {
                class156.field2122.method2502(var4.field5275);
                var4.field5275 = null;
            }
            var4.method322(11);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lnj;I)V")
    public final void method2758(class228 arg0, int arg1) {
        this.field6412 = (float) (arg0.method1348(-118) * 8) / 255.0F;
        if (arg1 > -12) {
            this.method2758((class228) null, 84);
        }
        field6425++;
        this.field6413 = (float) (arg0.method1348(-100) * 8) / 255.0F;
        this.field6418 = (float) (arg0.method1348(-123) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "()V")
    public class438() {
        this.field6422 = 1.2F;
        this.field6415 = -50;
        this.field6433 = -50;
        this.field6420 = -60;
        this.field6428 = class177.field2341;
        this.field6414 = class369.field5336;
        this.field6417 = 1.1523438F;
        this.field6410 = 0;
        this.field6423 = class434.field6384;
        this.field6430 = 0.69921875F;
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lnj;)V")
    public class438(class228 arg0) {
        int var2 = arg0.method1348(-124);
        if (class211.field2801 && class69.field894.method1709() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field6428 = class177.field2341;
            } else {
                this.field6428 = arg0.method1344((byte) 47);
            }
            if ((var2 & 0x2) == 0) {
                this.field6417 = 1.1523438F;
            } else {
                this.field6417 = (float) arg0.method1343(255) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field6430 = 0.69921875F;
            } else {
                this.field6430 = (float) arg0.method1343(255) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field6422 = 1.2F;
            } else {
                this.field6422 = (float) arg0.method1343(255) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method1344((byte) 126);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method1343(255);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method1343(255);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method1343(255);
            }
            this.field6417 = 1.1523438F;
            this.field6422 = 1.2F;
            this.field6428 = class177.field2341;
            this.field6430 = 0.69921875F;
        }
        if ((var2 & 0x10) == 0) {
            this.field6433 = -50;
            this.field6415 = -50;
            this.field6420 = -60;
        } else {
            this.field6433 = arg0.method1319((byte) -13);
            this.field6420 = arg0.method1319((byte) -13);
            this.field6415 = arg0.method1319((byte) -13);
        }
        if ((var2 & 0x20) == 0) {
            this.field6423 = class434.field6384;
        } else {
            this.field6423 = arg0.method1344((byte) 94);
        }
        if ((var2 & 0x40) == 0) {
            this.field6410 = 0;
        } else {
            this.field6410 = arg0.method1343(255);
        }
        if ((var2 & 0x80) == 0) {
            this.field6414 = class369.field5336;
        } else {
            this.field6414 = class68.method456(arg0.method1343(255), arg0.method1343(255), arg0.method1343(255), arg0.method1343(255), arg0.method1343(255), false, arg0.method1343(255));
        }
    }
}
