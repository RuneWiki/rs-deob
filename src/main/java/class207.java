import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class207 extends class180 {

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "Z")
    public static boolean field2787 = false;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "Z")
    public static boolean field2789 = false;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public static int field2788 = 1;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)J", line = 4)
    public static final long method1220(byte arg0) {
        int var1 = 88 % ((-arg0 - 50) / 59);
        field2782++;
        return class11.field172.method370(4);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BII[II)V", line = 24)
    public static final void method1221(byte arg0, int arg1, int arg2, int[] arg3, int arg4) {
        arg1--;
        field2786++;
        int var8 = arg2 - 1;
        int var5 = var8 - 7;
        while (var5 > arg1) {
            int var6 = arg1 + 1;
            arg3[var6] = arg4;
            int var7 = var6 + 1;
            arg3[var7] = arg4;
            int var9 = var7 + 1;
            arg3[var9] = arg4;
            int var10 = var9 + 1;
            arg3[var10] = arg4;
            int var11 = var10 + 1;
            arg3[var11] = arg4;
            int var12 = var11 + 1;
            arg3[var12] = arg4;
            int var13 = var12 + 1;
            arg3[var13] = arg4;
            arg1 = var13 + 1;
            arg3[arg1] = arg4;
        }
        if (arg0 > -121) {
            field2787 = false;
        }
        while (arg1 < var8) {
            arg1++;
            arg3[arg1] = arg4;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lur;Lur;ZIB)I", line = 58)
    public static final int method1222(class92 arg0, class92 arg1, boolean arg2, int arg3, byte arg4) {
        field2784++;
        if (arg3 == 1) {
            int var5 = arg1.field1242;
            int var6 = arg0.field1242;
            if (!arg2) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg3 == 2) {
            return class205.method1215(arg0.method645(-25881).field5625, 1, arg1.method645(-25881).field5625, class177.field2337);
        } else if (arg3 == 3) {
            if (arg1.field1302.equals("-")) {
                if (arg0.field1302.equals("-")) {
                    return 0;
                } else if (arg2) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg0.field1302.equals("-")) {
                return arg2 ? 1 : -1;
            } else {
                return class205.method1215(arg0.field1302, 1, arg1.field1302, class177.field2337);
            }
        } else if (arg3 == 4) {
            if (arg1.method624(-29648)) {
                return arg0.method624(-29648) ? 0 : 1;
            } else if (arg0.method624(-29648)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 5) {
            if (arg1.method625((byte) -36)) {
                return arg0.method625((byte) -36) ? 0 : 1;
            } else if (arg0.method625((byte) -36)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 6) {
            if (arg1.method630((byte) -47)) {
                return arg0.method630((byte) -29) ? 0 : 1;
            } else if (arg0.method630((byte) -77)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 <= 87) {
            return 15;
        } else if (arg3 == 7) {
            if (arg1.method626(false)) {
                return arg0.method626(false) ? 0 : 1;
            } else if (arg0.method626(false)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 8) {
            int var7 = arg1.field1305;
            int var8 = arg0.field1305;
            if (arg2) {
                if (var7 == 1000) {
                    var7 = -1;
                }
                if (var8 == 1000) {
                    var8 = -1;
                }
            } else {
                if (var7 == -1) {
                    var7 = 1000;
                }
                if (var8 == -1) {
                    var8 = 1000;
                }
            }
            return var7 - var8;
        } else {
            return arg1.field1300 - arg0.field1300;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/String;ZI)V", line = 157)
    public static final void method1223(String arg0, boolean arg1, int arg2) {
        field2783++;
        if (arg0 == null) {
            return;
        }
        if (class318.field4649 >= 100) {
            class197.method1175(0, class442.field6481);
            return;
        }
        String var3 = class397.method2555(2289, arg0);
        if (var3 == null) {
            return;
        }
        if (arg2 != 11754) {
            field2788 = 51;
        }
        for (int var4 = 0; var4 < class318.field4649; var4++) {
            String var8 = class397.method2555(2289, class212.field2840[var4]);
            if (var8 != null && var8.equals(var3)) {
                class197.method1175(0, arg0 + class218.field2883);
                return;
            }
            if (class307.field4520[var4] != null) {
                String var9 = class397.method2555(2289, class307.field4520[var4]);
                if (var9 != null && var9.equals(var3)) {
                    class197.method1175(0, arg0 + class218.field2883);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class167.field2254; var5++) {
            String var6 = class397.method2555(2289, class272.field3943[var5]);
            if (var6 != null && var6.equals(var3)) {
                class197.method1175(0, class237.field3184 + arg0 + class159.field2148);
                return;
            }
            if (class148.field2037[var5] != null) {
                String var7 = class397.method2555(arg2 ^ 0x251B, class148.field2037[var5]);
                if (var7 != null && var7.equals(var3)) {
                    class197.method1175(0, class237.field3184 + arg0 + class159.field2148);
                    return;
                }
            }
        }
        if (class397.method2555(2289, class227.field2988.field340).equals(var3)) {
            class197.method1175(arg2 - 11754, class153.field2072);
            return;
        }
        class185.field2507.method5(-6445, 42);
        class75.field1081++;
        class185.field2507.method1346(class125.method795(77, arg0) + 1, arg2 ^ 0x5215);
        class185.field2507.method1380(65280, arg0);
        class185.field2507.method1346(arg1 ? 1 : 0, arg2 + 21013);
    }
}
