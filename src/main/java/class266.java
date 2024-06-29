import java.awt.Container;
import java.awt.Insets;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class266 {

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
    public int field4372 = 0;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "Z")
    public boolean field4379 = false;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
    public int field4378 = 1190717;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
    public int field4381 = 128;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "Z")
    public boolean field4373 = true;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
    public int field4382 = 8;

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "Z")
    public boolean field4384 = true;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public int field4371 = 16;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "I")
    public int field4386 = -1;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
    public int field4380 = -1;

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "I")
    public static int field4387 = -1;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "Lnm;")
    public static class221 field4369;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "[Laf;")
    public static class201[] field4377;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lfh;II)V", line = 8)
    public final void method1873(class313 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method2224(-128);
            if (var4 == 0) {
                if (arg1 != 25034) {
                    method1876(114, (class313) null);
                }
                field4376++;
                return;
            }
            this.method1874(arg2, var4, true, arg0);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIZLfh;)V", line = 30)
    private final void method1874(int arg0, int arg1, boolean arg2, class313 arg3) {
        if (arg1 == 1) {
            this.field4372 = class91.method603(-1, arg3.method2249(-63));
        } else if (arg1 == 2) {
            this.field4386 = arg3.method2224(-120);
        } else if (arg1 == 3) {
            this.field4386 = arg3.method2250(-1613178296);
            if (this.field4386 == 65535) {
                this.field4386 = -1;
            }
        } else if (arg1 == 5) {
            this.field4373 = false;
        } else if (arg1 == 7) {
            this.field4380 = class91.method603(-1, arg3.method2249(-100));
        } else if (arg1 == 8) {
            class104.field1503 = arg0;
        } else if (arg1 == 9) {
            this.field4381 = arg3.method2250(-1613178296);
        } else if (arg1 == 10) {
            this.field4384 = false;
        } else if (arg1 == 11) {
            this.field4382 = arg3.method2224(-125);
        } else if (arg1 == 12) {
            this.field4379 = true;
        } else if (arg1 == 13) {
            this.field4378 = arg3.method2249(-59);
        } else if (arg1 == 14) {
            this.field4371 = arg3.method2224(-128);
        }
        field4374++;
        if (!arg2) {
            method1881(-80, (byte) -57);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;", line = 97)
    public static final String method1875(String arg0, boolean arg1) {
        field4383++;
        int var2 = arg0.length();
        char[] var3 = new char[var2];
        byte var4 = 2;
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg0.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class139.method976(6803, var6);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
        }
        if (!arg1) {
            method1881(-52, (byte) -59);
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILfh;)V", line = 151)
    public static final void method1876(int arg0, class313 arg1) {
        field4367++;
        if ((arg1.field5124.length - arg1.field5137) < 1) {
            return;
        }
        int var2 = arg1.method2224(-128);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        if (arg0 > -48) {
            field4369 = (class221) null;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if ((arg1.field5124.length - arg1.field5137) < var3) {
            return;
        }
        class75.field1138 = arg1.method2224(-121);
        if (class75.field1138 < 1) {
            class75.field1138 = 1;
        } else if (class75.field1138 > 4) {
            class75.field1138 = 4;
        }
        class101.method659(arg1.method2224(-123) == 1, 0);
        class153.field2486 = arg1.method2224(-127) == 1;
        class118.field1725 = arg1.method2224(-125) == 1;
        class115.field1680 = arg1.method2224(-121) == 1;
        class295.field4905 = arg1.method2224(-122) == 1;
        class178.field2777 = arg1.method2224(-128) == 1;
        class121.field1814 = arg1.method2224(-121) == 1;
        class142.field2279 = arg1.method2224(-127) == 1;
        class162.field2580 = arg1.method2224(-126);
        if (class162.field2580 > 2) {
            class162.field2580 = 2;
        }
        if (var2 < 2) {
            class322.field5287 = arg1.method2224(-125) == 1;
            arg1.method2224(-127);
        } else {
            class322.field5287 = arg1.method2224(-119) == 1;
        }
        class347.field5557 = arg1.method2224(-126) == 1;
        class96.field1398 = arg1.method2224(-125) == 1;
        class70.field1094 = arg1.method2224(-125);
        if (class70.field1094 > 2) {
            class70.field1094 = 2;
        }
        class306.field4997 = class70.field1094;
        class352.field5610 = arg1.method2224(-128) == 1;
        class182.field2824 = arg1.method2224(-124);
        if (class182.field2824 > 127) {
            class182.field2824 = 127;
        }
        class315.field5201 = arg1.method2224(-126);
        class58.field878 = arg1.method2224(-121);
        if (class58.field878 > 127) {
            class58.field878 = 127;
        }
        if (var2 >= 1) {
            class251.field4012 = arg1.method2250(-1613178296);
            class72.field1105 = arg1.method2250(-1613178296);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method2224(-119);
        }
        if (var2 >= 4) {
            int var4 = arg1.method2224(-121);
            if (class6.field81 < 96) {
                var4 = 0;
            }
            class145.method1035(var4);
        }
        if (var2 >= 5) {
            class299.field4941 = arg1.method2231((byte) -123);
        }
        if (var2 >= 6) {
            class295.field4901 = arg1.method2224(-128);
        }
        if (var2 >= 7) {
            class115.field1689 = arg1.method2224(-123) == 1;
        }
        if (var2 >= 8) {
            class307.field5005 = arg1.method2224(-124) == 1;
        }
        if (var2 >= 9) {
            class31.field478 = arg1.method2224(-120);
        }
        if (var2 >= 10) {
            class201.field3094 = arg1.method2224(-127) != 0;
        }
        if (var2 >= 11) {
            class186.field2903 = arg1.method2224(-122) != 0;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V", line = 316)
    public static final void method1877(byte arg0) {
        field4368++;
        Container var1;
        if (class296.field4907 != null) {
            var1 = class296.field4907;
        } else if (class217.field3350 == null) {
            var1 = class96.field1382.field4515;
        } else {
            var1 = class217.field3350;
        }
        class107.field1535 = var1.getSize().width;
        class182.field2829 = var1.getSize().height;
        if (class217.field3350 == var1) {
            Insets var2 = class217.field3350.getInsets();
            class107.field1535 -= var2.left + var2.right;
            class182.field2829 -= var2.top + var2.bottom;
        }
        if (class84.method552(0) >= 2) {
            class233.field3712 = class107.field1535;
            class198.field3042 = 0;
            class243.field3838 = class182.field2829;
            class223.field3455 = 0;
        } else {
            class233.field3712 = 765;
            class243.field3838 = 503;
            class223.field3455 = 0;
            class198.field3042 = (class107.field1535 - 765) / 2;
        }
        if (arg0 > -77) {
            return;
        }
        if (class245.field3886) {
            class245.method1739(class233.field3712, class243.field3838);
        }
        class235.field3731.setSize(class233.field3712, class243.field3838);
        if (class217.field3350 == var1) {
            Insets var3 = class217.field3350.getInsets();
            class235.field3731.setLocation(class198.field3042 + var3.left, class223.field3455 + var3.top);
        } else {
            class235.field3731.setLocation(class198.field3042, class223.field3455);
        }
        if (class345.field5538 != -1) {
            class157.method1123((byte) 120, true);
        }
        class191.method1319((byte) -104);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIB)V", line = 383)
    public static final void method1878(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field4385++;
        if (arg2 > arg1) {
            class270.method1906(arg3, arg2, arg1, class306.field4998[arg0], 127);
        } else {
            class270.method1906(arg3, arg1, arg2, class306.field4998[arg0], 116);
        }
        if (arg4 <= 30) {
            field4377 = (class201[]) null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILlk;I)V", line = 406)
    public static final void method1879(int arg0, class280 arg1, int arg2) {
        class60.field917 = 0;
        int var3 = 29 / ((arg2 - 8) / 38);
        int var4 = 0;
        field4375++;
        int var5 = 0;
        int var6 = -1;
        int[] var7 = arg1.field4611;
        byte var8 = -1;
        int[] var9 = arg1.field4604;
        try {
            int var10 = 0;
            label4504: while (true) {
                var10++;
                if (var10 > arg0) {
                    throw new RuntimeException("slow");
                }
                var6++;
                int var538 = var7[var6];
                if (var538 < 100) {
                    if (var538 == 0) {
                        class182.field2827[var4++] = var9[var6];
                        continue;
                    }
                    if (var538 == 1) {
                        int var11 = var9[var6];
                        class182.field2827[var4++] = class170.field2650[var11];
                        continue;
                    }
                    if (var538 == 2) {
                        int var12 = var9[var6];
                        var4--;
                        class308.method2146(class182.field2827[var4], 0, var12);
                        continue;
                    }
                    if (var538 == 3) {
                        class267.field4402[var5++] = arg1.field4602[var6];
                        continue;
                    }
                    if (var538 == 6) {
                        var6 += var9[var6];
                        continue;
                    }
                    if (var538 == 7) {
                        var4 -= 2;
                        if (class182.field2827[var4 + 1] != class182.field2827[var4]) {
                            var6 += var9[var6];
                        }
                        continue;
                    }
                    if (var538 == 8) {
                        var4 -= 2;
                        if (class182.field2827[var4 + 1] == class182.field2827[var4]) {
                            var6 += var9[var6];
                        }
                        continue;
                    }
                    if (var538 == 9) {
                        var4 -= 2;
                        if (class182.field2827[var4 + 1] > class182.field2827[var4]) {
                            var6 += var9[var6];
                        }
                        continue;
                    }
                    if (var538 == 10) {
                        var4 -= 2;
                        if (class182.field2827[var4 + 1] < class182.field2827[var4]) {
                            var6 += var9[var6];
                        }
                        continue;
                    }
                    if (var538 == 21) {
                        if (class60.field917 == 0) {
                            return;
                        }
                        class279 var13 = class183.field2853[--class60.field917];
                        class350.field5587 = var13.field4598;
                        class264.field4299 = var13.field4595;
                        arg1 = var13.field4599;
                        var7 = arg1.field4611;
                        var6 = var13.field4600;
                        var9 = arg1.field4604;
                        continue;
                    }
                    if (var538 == 25) {
                        int var14 = var9[var6];
                        class182.field2827[var4++] = class44.method338(var14, (byte) -79);
                        continue;
                    }
                    if (var538 == 27) {
                        int var15 = var9[var6];
                        var4--;
                        class350.method2455(-125, class182.field2827[var4], var15);
                        continue;
                    }
                    if (var538 == 31) {
                        var4 -= 2;
                        if (class182.field2827[var4 + 1] >= class182.field2827[var4]) {
                            var6 += var9[var6];
                        }
                        continue;
                    }
                    if (var538 == 32) {
                        var4 -= 2;
                        if (class182.field2827[var4] >= class182.field2827[var4 + 1]) {
                            var6 += var9[var6];
                        }
                        continue;
                    }
                    if (var538 == 33) {
                        class182.field2827[var4++] = class350.field5587[var9[var6]];
                        continue;
                    }
                    int var10001;
                    if (var538 == 34) {
                        var10001 = var9[var6];
                        var4--;
                        class350.field5587[var10001] = class182.field2827[var4];
                        continue;
                    }
                    if (var538 == 35) {
                        class267.field4402[var5++] = class264.field4299[var9[var6]];
                        continue;
                    }
                    if (var538 == 36) {
                        var10001 = var9[var6];
                        var5--;
                        class264.field4299[var10001] = class267.field4402[var5];
                        continue;
                    }
                    if (var538 == 37) {
                        int var16 = var9[var6];
                        var5 -= var16;
                        String var17 = class37.method303(-2, class267.field4402, var5, var16);
                        class267.field4402[var5++] = var17;
                        continue;
                    }
                    if (var538 == 38) {
                        var4--;
                        continue;
                    }
                    if (var538 == 39) {
                        var5--;
                        continue;
                    }
                    if (var538 == 40) {
                        int var18 = var9[var6];
                        class280 var19 = class284.method2008(var18, true);
                        String[] var20 = new String[var19.field4606];
                        int[] var21 = new int[var19.field4616];
                        for (int var22 = 0; var22 < var19.field4605; var22++) {
                            var21[var22] = class182.field2827[var22 + var4 - var19.field4605];
                        }
                        for (int var23 = 0; var23 < var19.field4610; var23++) {
                            var20[var23] = class267.field4402[var5 + var23 - var19.field4610];
                        }
                        var4 -= var19.field4605;
                        var5 -= var19.field4610;
                        class279 var24 = new class279();
                        var24.field4595 = class264.field4299;
                        var24.field4599 = arg1;
                        var24.field4600 = var6;
                        var24.field4598 = class350.field5587;
                        if (class60.field917 >= class183.field2853.length) {
                            throw new RuntimeException();
                        }
                        var6 = -1;
                        arg1 = var19;
                        class183.field2853[class60.field917++] = var24;
                        class350.field5587 = var21;
                        var9 = var19.field4604;
                        class264.field4299 = var20;
                        var7 = var19.field4611;
                        continue;
                    }
                    if (var538 == 42) {
                        class182.field2827[var4++] = class185.field2875[var9[var6]];
                        continue;
                    }
                    if (var538 == 43) {
                        int var25 = var9[var6];
                        var4--;
                        class185.field2875[var25] = class182.field2827[var4];
                        class319.method2300(var25, -114);
                        continue;
                    }
                    if (var538 == 44) {
                        int var26 = var9[var6] & 0xFFFF;
                        var4--;
                        int var27 = class182.field2827[var4];
                        int var28 = var9[var6] >> 16;
                        if (var27 >= 0 && var27 <= 5000) {
                            class284.field4661[var28] = var27;
                            byte var29 = -1;
                            if (var26 == 105) {
                                var29 = 0;
                            }
                            int var30 = 0;
                            while (true) {
                                if (var30 >= var27) {
                                    continue label4504;
                                }
                                class182.field2835[var28][var30] = var29;
                                var30++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var538 == 45) {
                        int var31 = var9[var6];
                        var4--;
                        int var32 = class182.field2827[var4];
                        if (var32 >= 0 && class284.field4661[var31] > var32) {
                            class182.field2827[var4++] = class182.field2835[var31][var32];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var538 == 46) {
                        var4 -= 2;
                        int var33 = class182.field2827[var4];
                        int var34 = var9[var6];
                        if (var33 >= 0 && class284.field4661[var34] > var33) {
                            class182.field2835[var34][var33] = class182.field2827[var4 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var538 == 47) {
                        String var35 = class314.field5182[var9[var6]];
                        if (var35 == null) {
                            var35 = "null";
                        }
                        class267.field4402[var5++] = var35;
                        continue;
                    }
                    if (var538 == 48) {
                        int var36 = var9[var6];
                        var5--;
                        class314.field5182[var36] = class267.field4402[var5];
                        class13.method95(var36, -55);
                        continue;
                    }
                    if (var538 == 51) {
                        class4 var37 = arg1.field4615[var9[var6]];
                        var4--;
                        class94 var38 = (class94) var37.method29((long) class182.field2827[var4], 103);
                        if (var38 != null) {
                            var6 += var38.field1373;
                        }
                        continue;
                    }
                }
                boolean var39;
                if (var9[var6] == 1) {
                    var39 = true;
                } else {
                    var39 = false;
                }
                if (var538 < 300) {
                    if (var538 == 100) {
                        var4 -= 3;
                        int var40 = class182.field2827[var4 + 1];
                        int var41 = class182.field2827[var4];
                        int var42 = class182.field2827[var4 + 2];
                        if (var40 == 0) {
                            throw new RuntimeException();
                        }
                        class264 var43 = class94.method629(5386, var41);
                        if (var43.field4314 == null) {
                            var43.field4314 = new class264[var42 + 1];
                        }
                        if (var43.field4314.length <= var42) {
                            class264[] var44 = new class264[var42 + 1];
                            for (int var45 = 0; var45 < var43.field4314.length; var45++) {
                                var44[var45] = var43.field4314[var45];
                            }
                            var43.field4314 = var44;
                        }
                        if (var42 > 0 && var43.field4314[var42 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var42 - 1));
                        }
                        class264 var46 = new class264();
                        var46.field4276 = true;
                        var46.field4350 = var40;
                        var46.field4240 = var42;
                        var46.field4201 = var46.field4204 = var43.field4204;
                        var43.field4314[var42] = var46;
                        if (var39) {
                            class51.field757 = var46;
                        } else {
                            class49.field719 = var46;
                        }
                        class218.method1472((byte) 124, var43);
                        continue;
                    }
                    if (var538 == 101) {
                        class264 var47 = var39 ? class51.field757 : class49.field719;
                        if (var47.field4240 == -1) {
                            if (!var39) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class264 var48 = class94.method629(5386, var47.field4204);
                        var48.field4314[var47.field4240] = null;
                        class218.method1472((byte) 96, var48);
                        continue;
                    }
                    if (var538 == 102) {
                        var4--;
                        class264 var49 = class94.method629(5386, class182.field2827[var4]);
                        var49.field4314 = null;
                        class218.method1472((byte) 108, var49);
                        continue;
                    }
                    if (var538 == 200) {
                        var4 -= 2;
                        int var50 = class182.field2827[var4 + 1];
                        int var51 = class182.field2827[var4];
                        class264 var52 = class113.method741(var51, (byte) 125, var50);
                        if (var52 != null && var50 != -1) {
                            class182.field2827[var4++] = 1;
                            if (var39) {
                                class51.field757 = var52;
                            } else {
                                class49.field719 = var52;
                            }
                            continue;
                        }
                        class182.field2827[var4++] = 0;
                        continue;
                    }
                    if (var538 == 201) {
                        var4--;
                        int var53 = class182.field2827[var4];
                        class264 var54 = class94.method629(5386, var53);
                        if (var54 == null) {
                            class182.field2827[var4++] = 0;
                        } else {
                            class182.field2827[var4++] = 1;
                            if (var39) {
                                class51.field757 = var54;
                            } else {
                                class49.field719 = var54;
                            }
                        }
                        continue;
                    }
                } else if (var538 < 500) {
                    if (var538 == 403) {
                        var4 -= 2;
                        int var55 = class182.field2827[var4];
                        int var56 = class182.field2827[var4 + 1];
                        for (int var57 = 0; var57 < class68.field1056.length; var57++) {
                            if (class68.field1056[var57] == var55) {
                                class329.field5388.field600.method2395(var57, var56, (byte) 64);
                                continue label4504;
                            }
                        }
                        int var58 = 0;
                        while (true) {
                            if (var58 >= class294.field4885.length) {
                                continue label4504;
                            }
                            if (class294.field4885[var58] == var55) {
                                class329.field5388.field600.method2395(var58, var56, (byte) 64);
                                continue label4504;
                            }
                            var58++;
                        }
                    }
                    if (var538 == 404) {
                        var4 -= 2;
                        int var59 = class182.field2827[var4];
                        int var60 = class182.field2827[var4 + 1];
                        class329.field5388.field600.method2393(var60, (byte) 90, var59);
                        continue;
                    }
                    if (var538 == 410) {
                        var4--;
                        boolean var61 = class182.field2827[var4] != 0;
                        class329.field5388.field600.method2394(var61, -19090);
                        continue;
                    }
                } else if (var538 >= 1000 && var538 < 1100 || var538 >= 2000 && var538 < 2100) {
                    class264 var62;
                    if (var538 >= 2000) {
                        var4--;
                        var62 = class94.method629(5386, class182.field2827[var4]);
                        var538 -= 1000;
                    } else {
                        var62 = var39 ? class51.field757 : class49.field719;
                    }
                    if (var538 == 1000) {
                        var4 -= 4;
                        var62.field4331 = class182.field2827[var4];
                        var62.field4345 = class182.field2827[var4 + 1];
                        int var63 = class182.field2827[var4 + 2];
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 5) {
                            var63 = 5;
                        }
                        int var64 = class182.field2827[var4 + 3];
                        if (var64 < 0) {
                            var64 = 0;
                        } else if (var64 > 5) {
                            var64 = 5;
                        }
                        var62.field4257 = (byte) var63;
                        var62.field4270 = (byte) var64;
                        class218.method1472((byte) 125, var62);
                        class210.method1429(var62, -1);
                        if (var62.field4240 == -1) {
                            class343.method2424(37, var62.field4204);
                        }
                        continue;
                    }
                    if (var538 == 1001) {
                        var4 -= 4;
                        var62.field4188 = class182.field2827[var4];
                        var62.field4262 = class182.field2827[var4 + 1];
                        var62.field4291 = 0;
                        var62.field4349 = 0;
                        int var65 = class182.field2827[var4 + 2];
                        int var66 = class182.field2827[var4 + 3];
                        if (var65 < 0) {
                            var65 = 0;
                        } else if (var65 > 4) {
                            var65 = 4;
                        }
                        var62.field4335 = (byte) var65;
                        if (var66 < 0) {
                            var66 = 0;
                        } else if (var66 > 4) {
                            var66 = 4;
                        }
                        var62.field4182 = (byte) var66;
                        class218.method1472((byte) 107, var62);
                        class210.method1429(var62, -1);
                        if (var62.field4350 == 0) {
                            class209.method1423(-29561, var62, false);
                        }
                        continue;
                    }
                    if (var538 == 1003) {
                        var4--;
                        boolean var67 = class182.field2827[var4] == 1;
                        if (var67 != var62.field4181) {
                            var62.field4181 = var67;
                            class218.method1472((byte) 118, var62);
                        }
                        if (var62.field4240 == -1) {
                            class171.method1181((byte) 90, var62.field4204);
                        }
                        continue;
                    }
                    if (var538 == 1004) {
                        var4 -= 2;
                        var62.field4292 = class182.field2827[var4];
                        var62.field4232 = class182.field2827[var4 + 1];
                        class218.method1472((byte) 121, var62);
                        class210.method1429(var62, -1);
                        if (var62.field4350 == 0) {
                            class209.method1423(-29561, var62, false);
                        }
                        continue;
                    }
                    if (var538 == 1005) {
                        var4--;
                        var62.field4318 = class182.field2827[var4] == 1;
                        continue;
                    }
                } else if (var538 >= 1100 && var538 < 1200 || var538 >= 2100 && var538 < 2200) {
                    class264 var529;
                    if (var538 >= 2000) {
                        var4--;
                        var529 = class94.method629(5386, class182.field2827[var4]);
                        var538 -= 1000;
                    } else {
                        var529 = var39 ? class51.field757 : class49.field719;
                    }
                    if (var538 == 1100) {
                        var4 -= 2;
                        var529.field4220 = class182.field2827[var4];
                        if (var529.field4307 - var529.field4223 < var529.field4220) {
                            var529.field4220 = var529.field4307 - var529.field4223;
                        }
                        if (var529.field4220 < 0) {
                            var529.field4220 = 0;
                        }
                        var529.field4242 = class182.field2827[var4 + 1];
                        if (var529.field4228 - var529.field4236 < var529.field4242) {
                            var529.field4242 = var529.field4228 - var529.field4236;
                        }
                        if (var529.field4242 < 0) {
                            var529.field4242 = 0;
                        }
                        class218.method1472((byte) 101, var529);
                        if (var529.field4240 == -1) {
                            class97.method641(var529.field4204, 12);
                        }
                        continue;
                    }
                    if (var538 == 1101) {
                        var4--;
                        var529.field4261 = class182.field2827[var4];
                        class218.method1472((byte) 127, var529);
                        if (var529.field4240 == -1) {
                            class23.method202(6, var529.field4204);
                        }
                        continue;
                    }
                    if (var538 == 1102) {
                        var4--;
                        var529.field4263 = class182.field2827[var4] == 1;
                        class218.method1472((byte) 100, var529);
                        continue;
                    }
                    if (var538 == 1103) {
                        var4--;
                        var529.field4282 = class182.field2827[var4];
                        class218.method1472((byte) 124, var529);
                        continue;
                    }
                    if (var538 == 1104) {
                        var4--;
                        var529.field4280 = class182.field2827[var4];
                        class218.method1472((byte) 116, var529);
                        continue;
                    }
                    if (var538 == 1105) {
                        var4--;
                        var529.field4205 = class182.field2827[var4];
                        class218.method1472((byte) 113, var529);
                        continue;
                    }
                    if (var538 == 1106) {
                        var4--;
                        var529.field4186 = class182.field2827[var4];
                        class218.method1472((byte) 101, var529);
                        continue;
                    }
                    if (var538 == 1107) {
                        var4--;
                        var529.field4222 = class182.field2827[var4] == 1;
                        class218.method1472((byte) 126, var529);
                        continue;
                    }
                    if (var538 == 1108) {
                        var529.field4198 = 1;
                        var4--;
                        var529.field4194 = class182.field2827[var4];
                        class218.method1472((byte) 114, var529);
                        if (var529.field4240 == -1) {
                            class192.method1326(2, var529.field4204);
                        }
                        continue;
                    }
                    if (var538 == 1109) {
                        var4 -= 6;
                        var529.field4248 = class182.field2827[var4];
                        var529.field4327 = class182.field2827[var4 + 1];
                        var529.field4191 = class182.field2827[var4 + 2];
                        var529.field4346 = class182.field2827[var4 + 3];
                        var529.field4297 = class182.field2827[var4 + 4];
                        var529.field4271 = class182.field2827[var4 + 5];
                        class218.method1472((byte) 115, var529);
                        if (var529.field4240 == -1) {
                            class300.method2114(-29823, var529.field4204);
                            class243.method1698(var529.field4204, 10);
                        }
                        continue;
                    }
                    if (var538 == 1110) {
                        var4--;
                        int var530 = class182.field2827[var4];
                        if (var529.field4296 != var530) {
                            var529.field4296 = var530;
                            var529.field4313 = 0;
                            var529.field4301 = 1;
                            var529.field4285 = 0;
                            class218.method1472((byte) 102, var529);
                        }
                        if (var529.field4240 == -1) {
                            class322.method2310(false, var529.field4204);
                        }
                        continue;
                    }
                    if (var538 == 1111) {
                        var4--;
                        var529.field4290 = class182.field2827[var4] == 1;
                        class218.method1472((byte) 123, var529);
                        continue;
                    }
                    if (var538 == 1112) {
                        var5--;
                        String var531 = class267.field4402[var5];
                        if (!var531.equals(var529.field4192)) {
                            var529.field4192 = var531;
                            class218.method1472((byte) 122, var529);
                        }
                        if (var529.field4240 == -1) {
                            class329.method2346(var529.field4204, (byte) 126);
                        }
                        continue;
                    }
                    if (var538 == 1113) {
                        var4--;
                        var529.field4235 = class182.field2827[var4];
                        class218.method1472((byte) 112, var529);
                        continue;
                    }
                    if (var538 == 1114) {
                        var4 -= 3;
                        var529.field4234 = class182.field2827[var4];
                        var529.field4213 = class182.field2827[var4 + 1];
                        var529.field4308 = class182.field2827[var4 + 2];
                        class218.method1472((byte) 116, var529);
                        continue;
                    }
                    if (var538 == 1115) {
                        var4--;
                        var529.field4250 = class182.field2827[var4] == 1;
                        class218.method1472((byte) 123, var529);
                        continue;
                    }
                    if (var538 == 1116) {
                        var4--;
                        var529.field4254 = class182.field2827[var4];
                        class218.method1472((byte) 100, var529);
                        continue;
                    }
                    if (var538 == 1117) {
                        var4--;
                        var529.field4207 = class182.field2827[var4];
                        class218.method1472((byte) 118, var529);
                        continue;
                    }
                    if (var538 == 1118) {
                        var4--;
                        var529.field4221 = class182.field2827[var4] == 1;
                        class218.method1472((byte) 104, var529);
                        continue;
                    }
                    if (var538 == 1119) {
                        var4--;
                        var529.field4212 = class182.field2827[var4] == 1;
                        class218.method1472((byte) 118, var529);
                        continue;
                    }
                    if (var538 == 1120) {
                        var4 -= 2;
                        var529.field4307 = class182.field2827[var4];
                        var529.field4228 = class182.field2827[var4 + 1];
                        class218.method1472((byte) 102, var529);
                        if (var529.field4350 == 0) {
                            class209.method1423(-29561, var529, false);
                        }
                        continue;
                    }
                    if (var538 == 1121) {
                        var4 -= 2;
                        var529.field4190 = (short) class182.field2827[var4];
                        var529.field4326 = (short) class182.field2827[var4 + 1];
                        class218.method1472((byte) 122, var529);
                        continue;
                    }
                    if (var538 == 1122) {
                        var4--;
                        var529.field4179 = class182.field2827[var4] == 1;
                        class218.method1472((byte) 101, var529);
                        continue;
                    }
                    if (var538 == 1123) {
                        var4--;
                        var529.field4271 = class182.field2827[var4];
                        class218.method1472((byte) 102, var529);
                        if (var529.field4240 == -1) {
                            class300.method2114(-29823, var529.field4204);
                        }
                        continue;
                    }
                    if (var538 == 1124) {
                        var4--;
                        int var532 = class182.field2827[var4];
                        var529.field4203 = var532 == 1;
                        class218.method1472((byte) 97, var529);
                        continue;
                    }
                } else if (!(var538 < 1200 || var538 >= 1300) || !(var538 < 2200 || var538 >= 2300)) {
                    class264 var68;
                    if (var538 >= 2000) {
                        var538 -= 1000;
                        var4--;
                        var68 = class94.method629(5386, class182.field2827[var4]);
                    } else {
                        var68 = var39 ? class51.field757 : class49.field719;
                    }
                    class218.method1472((byte) 113, var68);
                    if (var538 == 1200 || var538 == 1205 || var538 == 1208 || var538 == 1209) {
                        var4 -= 2;
                        int var69 = class182.field2827[var4];
                        int var70 = class182.field2827[var4 + 1];
                        if (var68.field4240 == -1) {
                            class343.method2423((byte) 70, var68.field4204);
                            class300.method2114(-29823, var68.field4204);
                            class243.method1698(var68.field4204, 10);
                        }
                        if (var69 == -1) {
                            var68.field4293 = -1;
                            var68.field4194 = -1;
                            var68.field4198 = 1;
                        } else {
                            if (var538 == 1208 || var538 == 1209) {
                                var68.field4265 = true;
                            } else {
                                var68.field4265 = false;
                            }
                            var68.field4323 = var70;
                            var68.field4293 = var69;
                            class109 var71 = class322.method2311(var69, -96);
                            var68.field4297 = var71.field1549;
                            var68.field4346 = var71.field1579;
                            var68.field4271 = var71.field1610;
                            var68.field4191 = var71.field1562;
                            var68.field4327 = var71.field1578;
                            if (var68.field4291 > 0) {
                                var68.field4271 = var68.field4271 * 32 / var68.field4291;
                            } else if (var68.field4188 > 0) {
                                var68.field4271 = var68.field4271 * 32 / var68.field4188;
                            }
                            if (var538 == 1205) {
                                var68.field4334 = false;
                            } else {
                                var68.field4334 = true;
                            }
                            var68.field4248 = var71.field1559;
                        }
                        continue;
                    }
                    if (var538 == 1201) {
                        var68.field4198 = 2;
                        var4--;
                        var68.field4194 = class182.field2827[var4];
                        if (var68.field4240 == -1) {
                            class192.method1326(2, var68.field4204);
                        }
                        continue;
                    }
                    if (var538 == 1202) {
                        var68.field4198 = 3;
                        var68.field4194 = class329.field5388.field600.method2400(-123);
                        if (var68.field4240 == -1) {
                            class192.method1326(2, var68.field4204);
                        }
                        continue;
                    }
                    if (var538 == 1203) {
                        var68.field4198 = 6;
                        var4--;
                        var68.field4194 = class182.field2827[var4];
                        if (var68.field4240 == -1) {
                            class192.method1326(2, var68.field4204);
                        }
                        continue;
                    }
                    if (var538 == 1204) {
                        var68.field4198 = 5;
                        var4--;
                        var68.field4194 = class182.field2827[var4];
                        if (var68.field4240 == -1) {
                            class192.method1326(2, var68.field4204);
                        }
                        continue;
                    }
                    if (var538 == 1206) {
                        var4 -= 4;
                        var68.field4287 = class182.field2827[var4];
                        var68.field4227 = class182.field2827[var4 + 1];
                        var68.field4279 = class182.field2827[var4 + 2];
                        var68.field4329 = class182.field2827[var4 + 3];
                        class218.method1472((byte) 126, var68);
                        continue;
                    }
                    if (var538 == 1207) {
                        var4 -= 2;
                        var68.field4209 = class182.field2827[var4];
                        var68.field4231 = class182.field2827[var4 + 1];
                        class218.method1472((byte) 118, var68);
                        continue;
                    }
                } else if (var538 >= 1300 && var538 < 1400 || var538 >= 2300 && var538 < 2400) {
                    class264 var72;
                    if (var538 >= 2000) {
                        var538 -= 1000;
                        var4--;
                        var72 = class94.method629(5386, class182.field2827[var4]);
                    } else {
                        var72 = var39 ? class51.field757 : class49.field719;
                    }
                    if (var538 == 1300) {
                        var4--;
                        int var73 = class182.field2827[var4] - 1;
                        if (var73 >= 0 && var73 <= 9) {
                            var5--;
                            var72.method1863(var73, 14748, class267.field4402[var5]);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var538 == 1301) {
                        var4 -= 2;
                        int var74 = class182.field2827[var4];
                        int var75 = class182.field2827[var4 + 1];
                        var72.field4269 = class113.method741(var74, (byte) 125, var75);
                        continue;
                    }
                    if (var538 == 1302) {
                        var4--;
                        var72.field4316 = class182.field2827[var4] == 1;
                        continue;
                    }
                    if (var538 == 1303) {
                        var4--;
                        var72.field4193 = class182.field2827[var4];
                        continue;
                    }
                    if (var538 == 1304) {
                        var4--;
                        var72.field4200 = class182.field2827[var4];
                        continue;
                    }
                    if (var538 == 1305) {
                        var5--;
                        var72.field4210 = class267.field4402[var5];
                        continue;
                    }
                    if (var538 == 1306) {
                        var5--;
                        var72.field4184 = class267.field4402[var5];
                        continue;
                    }
                    if (var538 == 1307) {
                        var72.field4337 = null;
                        continue;
                    }
                    if (var538 == 1308) {
                        var4--;
                        var72.field4343 = class182.field2827[var4];
                        var4--;
                        var72.field4177 = class182.field2827[var4];
                        continue;
                    }
                    if (var538 == 1309) {
                        var4--;
                        int var76 = class182.field2827[var4];
                        var4--;
                        int var77 = class182.field2827[var4];
                        if (var77 >= 1 && var77 <= 10) {
                            var72.method1856(var77 - 1, true, var76);
                        }
                        continue;
                    }
                    if (var538 == 1310) {
                        var5--;
                        var72.field4219 = class267.field4402[var5];
                        continue;
                    }
                } else {
                    if (var538 >= 1400 && var538 < 1500 || var538 >= 2400 && var538 < 2500) {
                        class264 var522;
                        if (var538 < 2000) {
                            var522 = var39 ? class51.field757 : class49.field719;
                        } else {
                            var4--;
                            var522 = class94.method629(5386, class182.field2827[var4]);
                            var538 -= 1000;
                        }
                        var5--;
                        String var523 = class267.field4402[var5];
                        int[] var524 = null;
                        if (var523.length() > 0 && var523.charAt(var523.length() - 1) == 'Y') {
                            var4--;
                            int var525 = class182.field2827[var4];
                            if (var525 > 0) {
                                var524 = new int[var525];
                                while (var525-- > 0) {
                                    var4--;
                                    var524[var525] = class182.field2827[var4];
                                }
                            }
                            var523 = var523.substring(0, var523.length() - 1);
                        }
                        Object[] var526 = new Object[var523.length() + 1];
                        for (int var527 = var526.length - 1; var527 >= 1; var527--) {
                            if (var523.charAt(var527 - 1) == 's') {
                                var5--;
                                var526[var527] = class267.field4402[var5];
                            } else {
                                var4--;
                                var526[var527] = Integer.valueOf(class182.field2827[var4]);
                            }
                        }
                        var4--;
                        int var528 = class182.field2827[var4];
                        if (var528 == -1) {
                            var526 = null;
                        } else {
                            var526[0] = Integer.valueOf(var528);
                        }
                        if (var538 == 1400) {
                            var522.field4196 = var526;
                        } else if (var538 == 1401) {
                            var522.field4295 = var526;
                        } else if (var538 == 1402) {
                            var522.field4189 = var526;
                        } else if (var538 == 1403) {
                            var522.field4354 = var526;
                        } else if (var538 == 1404) {
                            var522.field4226 = var526;
                        } else if (var538 == 1405) {
                            var522.field4267 = var526;
                        } else if (var538 == 1406) {
                            var522.field4211 = var526;
                        } else if (var538 == 1407) {
                            var522.field4284 = var524;
                            var522.field4275 = var526;
                        } else if (var538 == 1408) {
                            var522.field4218 = var526;
                        } else if (var538 == 1409) {
                            var522.field4332 = var526;
                        } else if (var538 == 1410) {
                            var522.field4273 = var526;
                        } else if (var538 == 1411) {
                            var522.field4266 = var526;
                        } else if (var538 == 1412) {
                            var522.field4300 = var526;
                        } else if (var538 == 1414) {
                            var522.field4224 = var526;
                            var522.field4352 = var524;
                        } else if (var538 == 1415) {
                            var522.field4174 = var524;
                            var522.field4324 = var526;
                        } else if (var538 == 1416) {
                            var522.field4243 = var526;
                        } else if (var538 == 1417) {
                            var522.field4305 = var526;
                        } else if (var538 == 1418) {
                            var522.field4283 = var526;
                        } else if (var538 == 1419) {
                            var522.field4183 = var526;
                        } else if (var538 == 1420) {
                            var522.field4315 = var526;
                        } else if (var538 == 1421) {
                            var522.field4259 = var526;
                        } else if (var538 == 1422) {
                            var522.field4289 = var526;
                        } else if (var538 == 1423) {
                            var522.field4294 = var526;
                        } else if (var538 == 1424) {
                            var522.field4325 = var526;
                        } else if (var538 == 1425) {
                            var522.field4339 = var526;
                        } else if (var538 == 1426) {
                            var522.field4256 = var526;
                        } else if (var538 == 1427) {
                            var522.field4180 = var526;
                        } else if (var538 == 1428) {
                            var522.field4244 = var524;
                            var522.field4277 = var526;
                        } else if (var538 == 1429) {
                            var522.field4197 = var524;
                            var522.field4341 = var526;
                        }
                        var522.field4258 = true;
                        continue;
                    }
                    if (var538 < 1600) {
                        class264 var78 = var39 ? class51.field757 : class49.field719;
                        if (var538 == 1500) {
                            class182.field2827[var4++] = var78.field4310;
                            continue;
                        }
                        if (var538 == 1501) {
                            class182.field2827[var4++] = var78.field4286;
                            continue;
                        }
                        if (var538 == 1502) {
                            class182.field2827[var4++] = var78.field4223;
                            continue;
                        }
                        if (var538 == 1503) {
                            class182.field2827[var4++] = var78.field4236;
                            continue;
                        }
                        if (var538 == 1504) {
                            class182.field2827[var4++] = var78.field4181 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 1505) {
                            class182.field2827[var4++] = var78.field4201;
                            continue;
                        }
                    } else if (var538 < 1700) {
                        class264 var79 = var39 ? class51.field757 : class49.field719;
                        if (var538 == 1600) {
                            class182.field2827[var4++] = var79.field4220;
                            continue;
                        }
                        if (var538 == 1601) {
                            class182.field2827[var4++] = var79.field4242;
                            continue;
                        }
                        if (var538 == 1602) {
                            class267.field4402[var5++] = var79.field4192;
                            continue;
                        }
                        if (var538 == 1603) {
                            class182.field2827[var4++] = var79.field4307;
                            continue;
                        }
                        if (var538 == 1604) {
                            class182.field2827[var4++] = var79.field4228;
                            continue;
                        }
                        if (var538 == 1605) {
                            class182.field2827[var4++] = var79.field4271;
                            continue;
                        }
                        if (var538 == 1606) {
                            class182.field2827[var4++] = var79.field4191;
                            continue;
                        }
                        if (var538 == 1607) {
                            class182.field2827[var4++] = var79.field4297;
                            continue;
                        }
                        if (var538 == 1608) {
                            class182.field2827[var4++] = var79.field4346;
                            continue;
                        }
                        if (var538 == 1609) {
                            class182.field2827[var4++] = var79.field4282;
                            continue;
                        }
                        if (var538 == 1610) {
                            class182.field2827[var4++] = var79.field4248;
                            continue;
                        }
                        if (var538 == 1611) {
                            class182.field2827[var4++] = var79.field4327;
                            continue;
                        }
                        if (var538 == 1612) {
                            class182.field2827[var4++] = var79.field4205;
                            continue;
                        }
                    } else if (var538 < 1800) {
                        class264 var80 = var39 ? class51.field757 : class49.field719;
                        if (var538 == 1700) {
                            class182.field2827[var4++] = var80.field4293;
                            continue;
                        }
                        if (var538 == 1701) {
                            if (var80.field4293 == -1) {
                                class182.field2827[var4++] = 0;
                            } else {
                                class182.field2827[var4++] = var80.field4323;
                            }
                            continue;
                        }
                        if (var538 == 1702) {
                            class182.field2827[var4++] = var80.field4240;
                            continue;
                        }
                    } else if (var538 < 1900) {
                        class264 var520 = var39 ? class51.field757 : class49.field719;
                        if (var538 == 1800) {
                            class182.field2827[var4++] = client.method898(var520).method525(-21845);
                            continue;
                        }
                        if (var538 == 1801) {
                            var4--;
                            int var521 = class182.field2827[var4];
                            int var540 = var521 - 1;
                            if (var520.field4337 != null && var520.field4337.length > var540 && var520.field4337[var540] != null) {
                                class267.field4402[var5++] = var520.field4337[var540];
                                continue;
                            }
                            class267.field4402[var5++] = "";
                            continue;
                        }
                        if (var538 == 1802) {
                            if (var520.field4210 == null) {
                                class267.field4402[var5++] = "";
                            } else {
                                class267.field4402[var5++] = var520.field4210;
                            }
                            continue;
                        }
                    } else if (var538 < 2600) {
                        var4--;
                        class264 var81 = class94.method629(5386, class182.field2827[var4]);
                        if (var538 == 2500) {
                            class182.field2827[var4++] = var81.field4310;
                            continue;
                        }
                        if (var538 == 2501) {
                            class182.field2827[var4++] = var81.field4286;
                            continue;
                        }
                        if (var538 == 2502) {
                            class182.field2827[var4++] = var81.field4223;
                            continue;
                        }
                        if (var538 == 2503) {
                            class182.field2827[var4++] = var81.field4236;
                            continue;
                        }
                        if (var538 == 2504) {
                            class182.field2827[var4++] = var81.field4181 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 2505) {
                            class182.field2827[var4++] = var81.field4201;
                            continue;
                        }
                    } else if (var538 < 2700) {
                        var4--;
                        class264 var519 = class94.method629(5386, class182.field2827[var4]);
                        if (var538 == 2600) {
                            class182.field2827[var4++] = var519.field4220;
                            continue;
                        }
                        if (var538 == 2601) {
                            class182.field2827[var4++] = var519.field4242;
                            continue;
                        }
                        if (var538 == 2602) {
                            class267.field4402[var5++] = var519.field4192;
                            continue;
                        }
                        if (var538 == 2603) {
                            class182.field2827[var4++] = var519.field4307;
                            continue;
                        }
                        if (var538 == 2604) {
                            class182.field2827[var4++] = var519.field4228;
                            continue;
                        }
                        if (var538 == 2605) {
                            class182.field2827[var4++] = var519.field4271;
                            continue;
                        }
                        if (var538 == 2606) {
                            class182.field2827[var4++] = var519.field4191;
                            continue;
                        }
                        if (var538 == 2607) {
                            class182.field2827[var4++] = var519.field4297;
                            continue;
                        }
                        if (var538 == 2608) {
                            class182.field2827[var4++] = var519.field4346;
                            continue;
                        }
                        if (var538 == 2609) {
                            class182.field2827[var4++] = var519.field4282;
                            continue;
                        }
                        if (var538 == 2610) {
                            class182.field2827[var4++] = var519.field4248;
                            continue;
                        }
                        if (var538 == 2611) {
                            class182.field2827[var4++] = var519.field4327;
                            continue;
                        }
                        if (var538 == 2612) {
                            class182.field2827[var4++] = var519.field4205;
                            continue;
                        }
                    } else if (var538 < 2800) {
                        if (var538 == 2700) {
                            var4--;
                            class264 var509 = class94.method629(5386, class182.field2827[var4]);
                            class182.field2827[var4++] = var509.field4293;
                            continue;
                        }
                        if (var538 == 2701) {
                            var4--;
                            class264 var510 = class94.method629(5386, class182.field2827[var4]);
                            if (var510.field4293 == -1) {
                                class182.field2827[var4++] = 0;
                            } else {
                                class182.field2827[var4++] = var510.field4323;
                            }
                            continue;
                        }
                        if (var538 == 2702) {
                            var4--;
                            int var511 = class182.field2827[var4];
                            class167 var512 = (class167) class218.field3363.method29((long) var511, 103);
                            if (var512 == null) {
                                class182.field2827[var4++] = 0;
                            } else {
                                class182.field2827[var4++] = 1;
                            }
                            continue;
                        }
                        if (var538 == 2703) {
                            var4--;
                            class264 var513 = class94.method629(5386, class182.field2827[var4]);
                            if (var513.field4314 == null) {
                                class182.field2827[var4++] = 0;
                                continue;
                            }
                            int var514 = var513.field4314.length;
                            for (int var515 = 0; var515 < var513.field4314.length; var515++) {
                                if (var513.field4314[var515] == null) {
                                    var514 = var515;
                                    break;
                                }
                            }
                            class182.field2827[var4++] = var514;
                            continue;
                        }
                        if (var538 == 2704 || var538 == 2705) {
                            var4 -= 2;
                            int var516 = class182.field2827[var4];
                            int var517 = class182.field2827[var4 + 1];
                            class167 var518 = (class167) class218.field3363.method29((long) var516, 103);
                            if (var518 != null && var518.field2631 == var517) {
                                class182.field2827[var4++] = 1;
                                continue;
                            }
                            class182.field2827[var4++] = 0;
                            continue;
                        }
                    } else if (var538 < 2900) {
                        var4--;
                        class264 var82 = class94.method629(5386, class182.field2827[var4]);
                        if (var538 == 2800) {
                            class182.field2827[var4++] = client.method898(var82).method525(-21845);
                            continue;
                        }
                        if (var538 == 2801) {
                            var4--;
                            int var83 = class182.field2827[var4];
                            int var539 = var83 - 1;
                            if (var82.field4337 != null && var82.field4337.length > var539 && var82.field4337[var539] != null) {
                                class267.field4402[var5++] = var82.field4337[var539];
                                continue;
                            }
                            class267.field4402[var5++] = "";
                            continue;
                        }
                        if (var538 == 2802) {
                            if (var82.field4210 == null) {
                                class267.field4402[var5++] = "";
                            } else {
                                class267.field4402[var5++] = var82.field4210;
                            }
                            continue;
                        }
                    } else if (var538 < 3200) {
                        if (var538 == 3100) {
                            var5--;
                            String var84 = class267.field4402[var5];
                            class147.method1047(false, var84, "", 0);
                            continue;
                        }
                        if (var538 == 3101) {
                            var4 -= 2;
                            class21.method132(-17367, class182.field2827[var4], class329.field5388, class182.field2827[var4 + 1]);
                            continue;
                        }
                        if (var538 == 3103) {
                            class297.method2097((byte) -29);
                            continue;
                        }
                        if (var538 == 3104) {
                            class23.field338++;
                            var5--;
                            String var85 = class267.field4402[var5];
                            int var86 = 0;
                            if (class54.method386(10, var85)) {
                                var86 = class233.method1608(false, var85);
                            }
                            class195.field2992.method250(21066, 242);
                            class195.field2992.method2222(var86, 255);
                            continue;
                        }
                        if (var538 == 3105) {
                            var5--;
                            String var87 = class267.field4402[var5];
                            class56.field862++;
                            class195.field2992.method250(21066, 67);
                            class195.field2992.method2228(class265.method1872(var87, 81), true);
                            continue;
                        }
                        if (var538 == 3106) {
                            var5--;
                            String var88 = class267.field4402[var5];
                            class195.field2992.method250(21066, 25);
                            class201.field3098++;
                            class195.field2992.method2193(var88.length() + 1, false);
                            class195.field2992.method2223(0, var88);
                            continue;
                        }
                        if (var538 == 3107) {
                            var5--;
                            String var89 = class267.field4402[var5];
                            var4--;
                            int var90 = class182.field2827[var4];
                            class283.method2006(180, var89, var90);
                            continue;
                        }
                        if (var538 == 3108) {
                            var4 -= 3;
                            int var91 = class182.field2827[var4];
                            int var92 = class182.field2827[var4 + 1];
                            int var93 = class182.field2827[var4 + 2];
                            class264 var94 = class94.method629(5386, var93);
                            class139.method981(var91, (byte) -37, var92, var94);
                            continue;
                        }
                        if (var538 == 3109) {
                            var4 -= 2;
                            int var95 = class182.field2827[var4];
                            class264 var96 = var39 ? class51.field757 : class49.field719;
                            int var97 = class182.field2827[var4 + 1];
                            class139.method981(var95, (byte) -37, var97, var96);
                            continue;
                        }
                        if (var538 == 3110) {
                            class256.field4050++;
                            var4--;
                            int var98 = class182.field2827[var4];
                            class195.field2992.method250(21066, 98);
                            class195.field2992.method2206(var98, (byte) -45);
                            continue;
                        }
                    } else if (var538 < 3300) {
                        if (var538 == 3200) {
                            var4 -= 3;
                            class209.method1427(class182.field2827[var4], -1, class182.field2827[var4 + 1], 255, class182.field2827[var4 + 2]);
                            continue;
                        }
                        if (var538 == 3201) {
                            var4--;
                            class311.method2173(0, class182.field2827[var4], 255);
                            continue;
                        }
                        if (var538 == 3202) {
                            var4 -= 2;
                            class119.method768(114, class182.field2827[var4], class182.field2827[var4 + 1], 255);
                            continue;
                        }
                    } else if (var538 < 3400) {
                        if (var538 == 3300) {
                            class182.field2827[var4++] = class58.field875;
                            continue;
                        }
                        if (var538 == 3301) {
                            var4 -= 2;
                            int var99 = class182.field2827[var4 + 1];
                            int var100 = class182.field2827[var4];
                            class182.field2827[var4++] = class293.method2067(var100, true, var99);
                            continue;
                        }
                        if (var538 == 3302) {
                            var4 -= 2;
                            int var101 = class182.field2827[var4 + 1];
                            int var102 = class182.field2827[var4];
                            class182.field2827[var4++] = class151.method1090(var101, -10012, var102);
                            continue;
                        }
                        if (var538 == 3303) {
                            var4 -= 2;
                            int var103 = class182.field2827[var4];
                            int var104 = class182.field2827[var4 + 1];
                            class182.field2827[var4++] = class165.method1154(var104, var103, -18);
                            continue;
                        }
                        if (var538 == 3304) {
                            var4--;
                            int var105 = class182.field2827[var4];
                            class182.field2827[var4++] = class25.method216(-17626, var105).field100;
                            continue;
                        }
                        if (var538 == 3305) {
                            var4--;
                            int var106 = class182.field2827[var4];
                            class182.field2827[var4++] = class90.field1302[var106];
                            continue;
                        }
                        if (var538 == 3306) {
                            var4--;
                            int var107 = class182.field2827[var4];
                            class182.field2827[var4++] = class110.field1636[var107];
                            continue;
                        }
                        if (var538 == 3307) {
                            var4--;
                            int var108 = class182.field2827[var4];
                            class182.field2827[var4++] = class327.field5354[var108];
                            continue;
                        }
                        if (var538 == 3308) {
                            int var109 = (class329.field5388.field4796 >> 7) + class215.field3313;
                            int var110 = class120.field1779;
                            int var111 = (class329.field5388.field4783 >> 7) + class150.field2420;
                            class182.field2827[var4++] = (var109 << 14) + ((var110 << 28) + var111);
                            continue;
                        }
                        if (var538 == 3309) {
                            var4--;
                            int var112 = class182.field2827[var4];
                            class182.field2827[var4++] = class235.method1623(var112 >> 14, 16383);
                            continue;
                        }
                        if (var538 == 3310) {
                            var4--;
                            int var113 = class182.field2827[var4];
                            class182.field2827[var4++] = var113 >> 28;
                            continue;
                        }
                        if (var538 == 3311) {
                            var4--;
                            int var114 = class182.field2827[var4];
                            class182.field2827[var4++] = class235.method1623(16383, var114);
                            continue;
                        }
                        if (var538 == 3312) {
                            class182.field2827[var4++] = class312.field5106 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 3313) {
                            var4 -= 2;
                            int var115 = class182.field2827[var4] + 32768;
                            int var116 = class182.field2827[var4 + 1];
                            class182.field2827[var4++] = class293.method2067(var115, true, var116);
                            continue;
                        }
                        if (var538 == 3314) {
                            var4 -= 2;
                            int var117 = class182.field2827[var4] + 32768;
                            int var118 = class182.field2827[var4 + 1];
                            class182.field2827[var4++] = class151.method1090(var118, -10012, var117);
                            continue;
                        }
                        if (var538 == 3315) {
                            var4 -= 2;
                            int var119 = class182.field2827[var4] + 32768;
                            int var120 = class182.field2827[var4 + 1];
                            class182.field2827[var4++] = class165.method1154(var120, var119, -18);
                            continue;
                        }
                        if (var538 == 3316) {
                            if (class121.field1804 >= 2) {
                                class182.field2827[var4++] = class121.field1804;
                            } else {
                                class182.field2827[var4++] = 0;
                            }
                            continue;
                        }
                        if (var538 == 3317) {
                            class182.field2827[var4++] = class211.field3217;
                            continue;
                        }
                        if (var538 == 3318) {
                            class182.field2827[var4++] = class203.field3111;
                            continue;
                        }
                        if (var538 == 3321) {
                            class182.field2827[var4++] = class209.field3175;
                            continue;
                        }
                        if (var538 == 3322) {
                            class182.field2827[var4++] = class221.field3380;
                            continue;
                        }
                        if (var538 == 3323) {
                            if (class9.field111 >= 5 && class9.field111 <= 9) {
                                class182.field2827[var4++] = 1;
                                continue;
                            }
                            class182.field2827[var4++] = 0;
                            continue;
                        }
                        if (var538 == 3324) {
                            if (class9.field111 >= 5 && class9.field111 <= 9) {
                                class182.field2827[var4++] = class9.field111;
                                continue;
                            }
                            class182.field2827[var4++] = 0;
                            continue;
                        }
                        if (var538 == 3325) {
                            class182.field2827[var4++] = class59.field900 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 3326) {
                            class182.field2827[var4++] = class329.field5388.field591;
                            continue;
                        }
                        if (var538 == 3327) {
                            class182.field2827[var4++] = class329.field5388.field600.field5472 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 3328) {
                            class182.field2827[var4++] = class273.field4486 && !class142.field2288 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 3329) {
                            class182.field2827[var4++] = class263.field4161 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 3330) {
                            var4--;
                            int var121 = class182.field2827[var4];
                            class182.field2827[var4++] = class7.method54(var121, (byte) -15);
                            continue;
                        }
                        if (var538 == 3331) {
                            var4 -= 2;
                            int var122 = class182.field2827[var4];
                            int var123 = class182.field2827[var4 + 1];
                            class182.field2827[var4++] = class328.method2337(var122, false, (byte) 103, var123);
                            continue;
                        }
                        if (var538 == 3332) {
                            var4 -= 2;
                            int var124 = class182.field2827[var4];
                            int var125 = class182.field2827[var4 + 1];
                            class182.field2827[var4++] = class328.method2337(var124, true, (byte) 115, var125);
                            continue;
                        }
                        if (var538 == 3333) {
                            class182.field2827[var4++] = class183.field2844;
                            continue;
                        }
                        if (var538 == 3335) {
                            class182.field2827[var4++] = class334.field5418;
                            continue;
                        }
                        if (var538 == 3336) {
                            var4 -= 4;
                            int var126 = class182.field2827[var4 + 2];
                            int var127 = class182.field2827[var4];
                            int var128 = class182.field2827[var4 + 1];
                            int var129 = (var128 << 14) + var127;
                            int var130 = (var126 << 28) + var129;
                            int var131 = class182.field2827[var4 + 3];
                            int var132 = var130 + var131;
                            class182.field2827[var4++] = var132;
                            continue;
                        }
                        if (var538 == 3337) {
                            class182.field2827[var4++] = class289.field4807;
                            continue;
                        }
                    } else if (var538 < 3500) {
                        if (var538 == 3400) {
                            var4 -= 2;
                            int var133 = class182.field2827[var4];
                            int var134 = class182.field2827[var4 + 1];
                            class341 var135 = class334.method2360((byte) 122, var133);
                            if (var135.field5491 != 's') {
                            }
                            class267.field4402[var5++] = var135.method2413(var134, 4);
                            continue;
                        }
                        if (var538 == 3408) {
                            var4 -= 4;
                            int var136 = class182.field2827[var4];
                            int var137 = class182.field2827[var4 + 1];
                            int var138 = class182.field2827[var4 + 2];
                            int var139 = class182.field2827[var4 + 3];
                            class341 var140 = class334.method2360((byte) 122, var138);
                            if (var140.field5485 == var136 && var140.field5491 == var137) {
                                if (var137 == 115) {
                                    class267.field4402[var5++] = var140.method2413(var139, 4);
                                } else {
                                    class182.field2827[var4++] = var140.method2410(false, var139);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var538 == 3409) {
                            var4 -= 3;
                            int var141 = class182.field2827[var4];
                            int var142 = class182.field2827[var4 + 1];
                            int var143 = class182.field2827[var4 + 2];
                            if (var142 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class341 var144 = class334.method2360((byte) 122, var142);
                            if (var144.field5491 != var141) {
                                throw new RuntimeException("C3409-1");
                            }
                            class182.field2827[var4++] = var144.method2408(-116, var143) ? 1 : 0;
                            continue;
                        }
                        if (var538 == 3410) {
                            var4--;
                            int var145 = class182.field2827[var4];
                            var5--;
                            String var146 = class267.field4402[var5];
                            if (var145 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class341 var147 = class334.method2360((byte) 122, var145);
                            if (var147.field5491 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            class182.field2827[var4++] = var147.method2406(10, var146) ? 1 : 0;
                            continue;
                        }
                        if (var538 == 3411) {
                            var4--;
                            int var148 = class182.field2827[var4];
                            class341 var149 = class334.method2360((byte) 122, var148);
                            class182.field2827[var4++] = var149.field5486.method28(true);
                            continue;
                        }
                    } else if (var538 < 3700) {
                        if (var538 == 3600) {
                            if (class4.field37 == 0) {
                                class182.field2827[var4++] = -2;
                            } else if (class4.field37 == 1) {
                                class182.field2827[var4++] = -1;
                            } else {
                                class182.field2827[var4++] = class339.field5458;
                            }
                            continue;
                        }
                        if (var538 == 3601) {
                            var4--;
                            int var485 = class182.field2827[var4];
                            if (class4.field37 == 2 && class339.field5458 > var485) {
                                class267.field4402[var5++] = class31.field476[var485];
                                continue;
                            }
                            class267.field4402[var5++] = "";
                            continue;
                        }
                        if (var538 == 3602) {
                            var4--;
                            int var486 = class182.field2827[var4];
                            if (class4.field37 == 2 && class339.field5458 > var486) {
                                class182.field2827[var4++] = class248.field3931[var486];
                                continue;
                            }
                            class182.field2827[var4++] = 0;
                            continue;
                        }
                        if (var538 == 3603) {
                            var4--;
                            int var487 = class182.field2827[var4];
                            if (class4.field37 == 2 && class339.field5458 > var487) {
                                class182.field2827[var4++] = class21.field260[var487];
                                continue;
                            }
                            class182.field2827[var4++] = 0;
                            continue;
                        }
                        if (var538 == 3604) {
                            var4--;
                            int var488 = class182.field2827[var4];
                            var5--;
                            String var489 = class267.field4402[var5];
                            class280.method1988(var488, -124, var489);
                            continue;
                        }
                        if (var538 == 3605) {
                            var5--;
                            String var490 = class267.field4402[var5];
                            class28.method237(-10582, class265.method1872(var490, 70));
                            continue;
                        }
                        if (var538 == 3606) {
                            var5--;
                            String var491 = class267.field4402[var5];
                            class328.method2342(class265.method1872(var491, 59), 138);
                            continue;
                        }
                        if (var538 == 3607) {
                            var5--;
                            String var492 = class267.field4402[var5];
                            class346.method2436(-122, false, class265.method1872(var492, 114));
                            continue;
                        }
                        if (var538 == 3608) {
                            var5--;
                            String var493 = class267.field4402[var5];
                            class211.method1430(class265.method1872(var493, 84), -119);
                            continue;
                        }
                        if (var538 == 3609) {
                            var5--;
                            String var494 = class267.field4402[var5];
                            if (var494.startsWith("<img=0>") || var494.startsWith("<img=1>")) {
                                var494 = var494.substring(7);
                            }
                            class182.field2827[var4++] = class142.method1002(var494, 64) ? 1 : 0;
                            continue;
                        }
                        if (var538 == 3610) {
                            var4--;
                            int var495 = class182.field2827[var4];
                            if (class4.field37 == 2 && var495 < class339.field5458) {
                                class267.field4402[var5++] = class236.field3736[var495];
                                continue;
                            }
                            class267.field4402[var5++] = "";
                            continue;
                        }
                        if (var538 == 3611) {
                            if (class299.field4932 == null) {
                                class267.field4402[var5++] = "";
                            } else {
                                class267.field4402[var5++] = class120.method778(class299.field4932, (byte) -120);
                            }
                            continue;
                        }
                        if (var538 == 3612) {
                            if (class299.field4932 == null) {
                                class182.field2827[var4++] = 0;
                            } else {
                                class182.field2827[var4++] = class201.field3086;
                            }
                            continue;
                        }
                        if (var538 == 3613) {
                            var4--;
                            int var496 = class182.field2827[var4];
                            if (class299.field4932 != null && var496 < class201.field3086) {
                                class267.field4402[var5++] = class120.method778(class166.field2623[var496].field812, (byte) -120);
                                continue;
                            }
                            class267.field4402[var5++] = "";
                            continue;
                        }
                        if (var538 == 3614) {
                            var4--;
                            int var497 = class182.field2827[var4];
                            if (class299.field4932 != null && class201.field3086 > var497) {
                                class182.field2827[var4++] = class166.field2623[var497].field819;
                                continue;
                            }
                            class182.field2827[var4++] = 0;
                            continue;
                        }
                        if (var538 == 3615) {
                            var4--;
                            int var498 = class182.field2827[var4];
                            if (class299.field4932 != null && var498 < class201.field3086) {
                                class182.field2827[var4++] = class166.field2623[var498].field810;
                                continue;
                            }
                            class182.field2827[var4++] = 0;
                            continue;
                        }
                        if (var538 == 3616) {
                            class182.field2827[var4++] = class197.field3027;
                            continue;
                        }
                        if (var538 == 3617) {
                            var5--;
                            String var499 = class267.field4402[var5];
                            class94.method625(var499, -12605);
                            continue;
                        }
                        if (var538 == 3618) {
                            class182.field2827[var4++] = class118.field1735;
                            continue;
                        }
                        if (var538 == 3619) {
                            var5--;
                            String var500 = class267.field4402[var5];
                            class291.method2060((byte) 52, class265.method1872(var500, 56));
                            continue;
                        }
                        if (var538 == 3620) {
                            class345.method2434((byte) -108);
                            continue;
                        }
                        if (var538 == 3621) {
                            if (class4.field37 == 0) {
                                class182.field2827[var4++] = -1;
                            } else {
                                class182.field2827[var4++] = class265.field4361;
                            }
                            continue;
                        }
                        if (var538 == 3622) {
                            var4--;
                            int var501 = class182.field2827[var4];
                            if (class4.field37 != 0 && var501 < class265.field4361) {
                                class267.field4402[var5++] = class322.method2314(class76.field1144[var501], true);
                                continue;
                            }
                            class267.field4402[var5++] = "";
                            continue;
                        }
                        if (var538 == 3623) {
                            var5--;
                            String var502 = class267.field4402[var5];
                            if (var502.startsWith("<img=0>") || var502.startsWith("<img=1>")) {
                                var502 = var502.substring(7);
                            }
                            class182.field2827[var4++] = class119.method773(1, var502) ? 1 : 0;
                            continue;
                        }
                        if (var538 == 3624) {
                            var4--;
                            int var503 = class182.field2827[var4];
                            if (class166.field2623 != null && class201.field3086 > var503 && class166.field2623[var503].field812.equalsIgnoreCase(class329.field5388.field597)) {
                                class182.field2827[var4++] = 1;
                                continue;
                            }
                            class182.field2827[var4++] = 0;
                            continue;
                        }
                        if (var538 == 3625) {
                            if (class319.field5249 == null) {
                                class267.field4402[var5++] = "";
                            } else {
                                class267.field4402[var5++] = class120.method778(class319.field5249, (byte) -120);
                            }
                            continue;
                        }
                        if (var538 == 3626) {
                            var4--;
                            int var504 = class182.field2827[var4];
                            if (class299.field4932 != null && var504 < class201.field3086) {
                                class267.field4402[var5++] = class166.field2623[var504].field808;
                                continue;
                            }
                            class267.field4402[var5++] = "";
                            continue;
                        }
                        if (var538 == 3627) {
                            var4--;
                            int var505 = class182.field2827[var4];
                            if (class4.field37 == 2 && var505 >= 0 && var505 < class339.field5458) {
                                class182.field2827[var4++] = class296.field4909[var505] ? 1 : 0;
                                continue;
                            }
                            class182.field2827[var4++] = 0;
                            continue;
                        }
                        if (var538 == 3628) {
                            var5--;
                            String var506 = class267.field4402[var5];
                            if (var506.startsWith("<img=0>") || var506.startsWith("<img=1>")) {
                                var506 = var506.substring(7);
                            }
                            class182.field2827[var4++] = class251.method1784(var506, -1);
                            continue;
                        }
                        if (var538 == 3629) {
                            class182.field2827[var4++] = class166.field2612;
                            continue;
                        }
                        if (var538 == 3630) {
                            var5--;
                            String var507 = class267.field4402[var5];
                            class346.method2436(-79, true, class265.method1872(var507, 57));
                            continue;
                        }
                        if (var538 == 3631) {
                            var4--;
                            int var508 = class182.field2827[var4];
                            class182.field2827[var4++] = class334.field5424[var508] ? 1 : 0;
                            continue;
                        }
                    } else if (var538 < 4000) {
                        if (var538 == 3903) {
                            var4--;
                            int var150 = class182.field2827[var4];
                            class182.field2827[var4++] = class246.field3914[var150].method1747(1);
                            continue;
                        }
                        if (var538 == 3904) {
                            var4--;
                            int var151 = class182.field2827[var4];
                            class182.field2827[var4++] = class246.field3914[var151].field3912;
                            continue;
                        }
                        if (var538 == 3905) {
                            var4--;
                            int var152 = class182.field2827[var4];
                            class182.field2827[var4++] = class246.field3914[var152].field3901;
                            continue;
                        }
                        if (var538 == 3906) {
                            var4--;
                            int var153 = class182.field2827[var4];
                            class182.field2827[var4++] = class246.field3914[var153].field3906;
                            continue;
                        }
                        if (var538 == 3907) {
                            var4--;
                            int var154 = class182.field2827[var4];
                            class182.field2827[var4++] = class246.field3914[var154].field3909;
                            continue;
                        }
                        if (var538 == 3908) {
                            var4--;
                            int var155 = class182.field2827[var4];
                            class182.field2827[var4++] = class246.field3914[var155].field3905;
                            continue;
                        }
                        if (var538 == 3910) {
                            var4--;
                            int var156 = class182.field2827[var4];
                            int var157 = class246.field3914[var156].method1751(true);
                            class182.field2827[var4++] = var157 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 3911) {
                            var4--;
                            int var158 = class182.field2827[var4];
                            int var159 = class246.field3914[var158].method1751(true);
                            class182.field2827[var4++] = var159 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 3912) {
                            var4--;
                            int var160 = class182.field2827[var4];
                            int var161 = class246.field3914[var160].method1751(true);
                            class182.field2827[var4++] = var161 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 3913) {
                            var4--;
                            int var162 = class182.field2827[var4];
                            int var163 = class246.field3914[var162].method1751(true);
                            class182.field2827[var4++] = var163 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var538 < 4100) {
                        if (var538 == 4000) {
                            var4 -= 2;
                            int var164 = class182.field2827[var4];
                            int var165 = class182.field2827[var4 + 1];
                            class182.field2827[var4++] = var164 + var165;
                            continue;
                        }
                        if (var538 == 4001) {
                            var4 -= 2;
                            int var166 = class182.field2827[var4];
                            int var167 = class182.field2827[var4 + 1];
                            class182.field2827[var4++] = var166 - var167;
                            continue;
                        }
                        if (var538 == 4002) {
                            var4 -= 2;
                            int var168 = class182.field2827[var4];
                            int var169 = class182.field2827[var4 + 1];
                            class182.field2827[var4++] = var168 * var169;
                            continue;
                        }
                        if (var538 == 4003) {
                            var4 -= 2;
                            int var170 = class182.field2827[var4 + 1];
                            int var171 = class182.field2827[var4];
                            class182.field2827[var4++] = var171 / var170;
                            continue;
                        }
                        if (var538 == 4004) {
                            var4--;
                            int var172 = class182.field2827[var4];
                            class182.field2827[var4++] = (int) ((double) var172 * Math.random());
                            continue;
                        }
                        if (var538 == 4005) {
                            var4--;
                            int var173 = class182.field2827[var4];
                            class182.field2827[var4++] = (int) (Math.random() * (double) (var173 + 1));
                            continue;
                        }
                        if (var538 == 4006) {
                            var4 -= 5;
                            int var174 = class182.field2827[var4];
                            int var175 = class182.field2827[var4 + 3];
                            int var176 = class182.field2827[var4 + 2];
                            int var177 = class182.field2827[var4 + 4];
                            int var178 = class182.field2827[var4 + 1];
                            class182.field2827[var4++] = (var177 - var176) * (var178 - var174) / (var175 - var176) + var174;
                            continue;
                        }
                        if (var538 == 4007) {
                            var4 -= 2;
                            long var179 = (long) class182.field2827[var4];
                            long var181 = (long) class182.field2827[var4 + 1];
                            class182.field2827[var4++] = (int) (var179 + (var179 * var181 / 100L));
                            continue;
                        }
                        if (var538 == 4008) {
                            var4 -= 2;
                            int var183 = class182.field2827[var4 + 1];
                            int var184 = class182.field2827[var4];
                            class182.field2827[var4++] = class167.method1160(0x1 << var183, var184);
                            continue;
                        }
                        if (var538 == 4009) {
                            var4 -= 2;
                            int var185 = class182.field2827[var4];
                            int var186 = class182.field2827[var4 + 1];
                            class182.field2827[var4++] = class235.method1623(-(0x1 << var186) - 1, var185);
                            continue;
                        }
                        if (var538 == 4010) {
                            var4 -= 2;
                            int var187 = class182.field2827[var4];
                            int var188 = class182.field2827[var4 + 1];
                            class182.field2827[var4++] = class235.method1623(var187, 0x1 << var188) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var538 == 4011) {
                            var4 -= 2;
                            int var189 = class182.field2827[var4];
                            int var190 = class182.field2827[var4 + 1];
                            class182.field2827[var4++] = var189 % var190;
                            continue;
                        }
                        if (var538 == 4012) {
                            var4 -= 2;
                            int var191 = class182.field2827[var4];
                            int var192 = class182.field2827[var4 + 1];
                            if (var191 == 0) {
                                class182.field2827[var4++] = 0;
                            } else {
                                class182.field2827[var4++] = (int) Math.pow((double) var191, (double) var192);
                            }
                            continue;
                        }
                        if (var538 == 4013) {
                            var4 -= 2;
                            int var193 = class182.field2827[var4 + 1];
                            int var194 = class182.field2827[var4];
                            if (var194 == 0) {
                                class182.field2827[var4++] = 0;
                            } else if (var193 == 0) {
                                class182.field2827[var4++] = Integer.MAX_VALUE;
                            } else {
                                class182.field2827[var4++] = (int) Math.pow((double) var194, 1.0D / (double) var193);
                            }
                            continue;
                        }
                        if (var538 == 4014) {
                            var4 -= 2;
                            int var195 = class182.field2827[var4];
                            int var196 = class182.field2827[var4 + 1];
                            class182.field2827[var4++] = class235.method1623(var195, var196);
                            continue;
                        }
                        if (var538 == 4015) {
                            var4 -= 2;
                            int var197 = class182.field2827[var4];
                            int var198 = class182.field2827[var4 + 1];
                            class182.field2827[var4++] = class167.method1160(var197, var198);
                            continue;
                        }
                        if (var538 == 4016) {
                            var4 -= 2;
                            int var199 = class182.field2827[var4 + 1];
                            int var200 = class182.field2827[var4];
                            class182.field2827[var4++] = var200 < var199 ? var200 : var199;
                            continue;
                        }
                        if (var538 == 4017) {
                            var4 -= 2;
                            int var201 = class182.field2827[var4];
                            int var202 = class182.field2827[var4 + 1];
                            class182.field2827[var4++] = var202 < var201 ? var201 : var202;
                            continue;
                        }
                        if (var538 == 4018) {
                            var4 -= 3;
                            long var203 = (long) class182.field2827[var4];
                            long var205 = (long) class182.field2827[var4 + 2];
                            long var207 = (long) class182.field2827[var4 + 1];
                            class182.field2827[var4++] = (int) (var203 * var205 / var207);
                            continue;
                        }
                    } else if (var538 < 4200) {
                        if (var538 == 4100) {
                            var5--;
                            String var209 = class267.field4402[var5];
                            var4--;
                            int var210 = class182.field2827[var4];
                            class267.field4402[var5++] = var209 + var210;
                            continue;
                        }
                        if (var538 == 4101) {
                            var5 -= 2;
                            String var211 = class267.field4402[var5];
                            String var212 = class267.field4402[var5 + 1];
                            class267.field4402[var5++] = var211 + var212;
                            continue;
                        }
                        if (var538 == 4102) {
                            var5--;
                            String var213 = class267.field4402[var5];
                            var4--;
                            int var214 = class182.field2827[var4];
                            class267.field4402[var5++] = var213 + class52.method383(true, var214, true);
                            continue;
                        }
                        if (var538 == 4103) {
                            var5--;
                            String var215 = class267.field4402[var5];
                            class267.field4402[var5++] = var215.toLowerCase();
                            continue;
                        }
                        if (var538 == 4104) {
                            var4--;
                            int var216 = class182.field2827[var4];
                            long var217 = (long) var216 * 86400000L + 1014768000000L;
                            class292.field4839.setTime(new Date(var217));
                            int var219 = class292.field4839.get(5);
                            int var220 = class292.field4839.get(2);
                            int var221 = class292.field4839.get(1);
                            class267.field4402[var5++] = var219 + "-" + class313.field5114[var220] + "-" + var221;
                            continue;
                        }
                        if (var538 == 4105) {
                            var5 -= 2;
                            String var222 = class267.field4402[var5];
                            String var223 = class267.field4402[var5 + 1];
                            if (class329.field5388.field600 != null && class329.field5388.field600.field5472) {
                                class267.field4402[var5++] = var223;
                                continue;
                            }
                            class267.field4402[var5++] = var222;
                            continue;
                        }
                        if (var538 == 4106) {
                            var4--;
                            int var224 = class182.field2827[var4];
                            class267.field4402[var5++] = Integer.toString(var224);
                            continue;
                        }
                        if (var538 == 4107) {
                            var5 -= 2;
                            class182.field2827[var4++] = class141.method998((byte) -72, class311.method2169(class267.field4402[var5 + 1], class267.field4402[var5], (byte) -107, class334.field5418));
                            continue;
                        }
                        if (var538 == 4108) {
                            var4 -= 2;
                            int var225 = class182.field2827[var4 + 1];
                            var5--;
                            String var226 = class267.field4402[var5];
                            int var227 = class182.field2827[var4];
                            class182.field2827[var4++] = class283.method2007(var225, true).method1207(var226, var227);
                            continue;
                        }
                        if (var538 == 4109) {
                            var4 -= 2;
                            var5--;
                            String var228 = class267.field4402[var5];
                            int var229 = class182.field2827[var4 + 1];
                            int var230 = class182.field2827[var4];
                            class182.field2827[var4++] = class283.method2007(var229, true).method1223(var228, var230);
                            continue;
                        }
                        if (var538 == 4110) {
                            var5 -= 2;
                            String var231 = class267.field4402[var5];
                            String var232 = class267.field4402[var5 + 1];
                            var4--;
                            if (class182.field2827[var4] == 1) {
                                class267.field4402[var5++] = var231;
                            } else {
                                class267.field4402[var5++] = var232;
                            }
                            continue;
                        }
                        if (var538 == 4111) {
                            var5--;
                            String var233 = class267.field4402[var5];
                            class267.field4402[var5++] = class175.method1227(var233);
                            continue;
                        }
                        if (var538 == 4112) {
                            var5--;
                            String var234 = class267.field4402[var5];
                            var4--;
                            int var235 = class182.field2827[var4];
                            if (var235 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class267.field4402[var5++] = var234 + (char) var235;
                            continue;
                        }
                        if (var538 == 4113) {
                            var4--;
                            int var236 = class182.field2827[var4];
                            class182.field2827[var4++] = class250.method1780((char) var236, 0) ? 1 : 0;
                            continue;
                        }
                        if (var538 == 4114) {
                            var4--;
                            int var237 = class182.field2827[var4];
                            class182.field2827[var4++] = class76.method513((char) var237, (byte) 22) ? 1 : 0;
                            continue;
                        }
                        if (var538 == 4115) {
                            var4--;
                            int var238 = class182.field2827[var4];
                            class182.field2827[var4++] = class69.method481(65, (char) var238) ? 1 : 0;
                            continue;
                        }
                        if (var538 == 4116) {
                            var4--;
                            int var239 = class182.field2827[var4];
                            class182.field2827[var4++] = class229.method1557((char) var239, -58) ? 1 : 0;
                            continue;
                        }
                        if (var538 == 4117) {
                            var5--;
                            String var240 = class267.field4402[var5];
                            if (var240 == null) {
                                class182.field2827[var4++] = 0;
                            } else {
                                class182.field2827[var4++] = var240.length();
                            }
                            continue;
                        }
                        if (var538 == 4118) {
                            var5--;
                            String var241 = class267.field4402[var5];
                            var4 -= 2;
                            int var242 = class182.field2827[var4 + 1];
                            int var243 = class182.field2827[var4];
                            class267.field4402[var5++] = var241.substring(var243, var242);
                            continue;
                        }
                        if (var538 == 4119) {
                            var5--;
                            String var244 = class267.field4402[var5];
                            StringBuffer var245 = new StringBuffer(var244.length());
                            boolean var246 = false;
                            for (int var247 = 0; var244.length() > var247; var247++) {
                                char var248 = var244.charAt(var247);
                                if (var248 == '<') {
                                    var246 = true;
                                } else if (var248 == '>') {
                                    var246 = false;
                                } else if (!var246) {
                                    var245.append(var248);
                                }
                            }
                            class267.field4402[var5++] = var245.toString();
                            continue;
                        }
                        if (var538 == 4120) {
                            var4 -= 2;
                            var5--;
                            String var249 = class267.field4402[var5];
                            int var250 = class182.field2827[var4 + 1];
                            int var251 = class182.field2827[var4];
                            class182.field2827[var4++] = var249.indexOf(var251, var250);
                            continue;
                        }
                        if (var538 == 4121) {
                            var4--;
                            int var252 = class182.field2827[var4];
                            var5 -= 2;
                            String var253 = class267.field4402[var5];
                            String var254 = class267.field4402[var5 + 1];
                            class182.field2827[var4++] = var253.indexOf(var254, var252);
                            continue;
                        }
                        if (var538 == 4122) {
                            var4--;
                            int var255 = class182.field2827[var4];
                            class182.field2827[var4++] = Character.toLowerCase((char) var255);
                            continue;
                        }
                        if (var538 == 4123) {
                            var4--;
                            int var256 = class182.field2827[var4];
                            class182.field2827[var4++] = Character.toUpperCase((char) var256);
                            continue;
                        }
                        if (var538 == 4124) {
                            var4--;
                            boolean var257 = class182.field2827[var4] != 0;
                            var4--;
                            int var258 = class182.field2827[var4];
                            class267.field4402[var5++] = class302.method2118((long) var258, 0, var257, class334.field5418, 30149);
                            continue;
                        }
                    } else if (var538 < 4300) {
                        if (var538 == 4200) {
                            var4--;
                            int var466 = class182.field2827[var4];
                            class267.field4402[var5++] = class322.method2311(var466, -115).field1596;
                            continue;
                        }
                        if (var538 == 4201) {
                            var4 -= 2;
                            int var467 = class182.field2827[var4 + 1];
                            int var468 = class182.field2827[var4];
                            class109 var469 = class322.method2311(var468, -107);
                            if (var467 >= 1 && var467 <= 5 && var469.field1625[var467 - 1] != null) {
                                class267.field4402[var5++] = var469.field1625[var467 - 1];
                                continue;
                            }
                            class267.field4402[var5++] = "";
                            continue;
                        }
                        if (var538 == 4202) {
                            var4 -= 2;
                            int var470 = class182.field2827[var4];
                            int var471 = class182.field2827[var4 + 1];
                            class109 var472 = class322.method2311(var470, -102);
                            if (var471 >= 1 && var471 <= 5 && var472.field1569[var471 - 1] != null) {
                                class267.field4402[var5++] = var472.field1569[var471 - 1];
                                continue;
                            }
                            class267.field4402[var5++] = "";
                            continue;
                        }
                        if (var538 == 4203) {
                            var4--;
                            int var473 = class182.field2827[var4];
                            class182.field2827[var4++] = class322.method2311(var473, -99).field1558;
                            continue;
                        }
                        if (var538 == 4204) {
                            var4--;
                            int var474 = class182.field2827[var4];
                            class182.field2827[var4++] = class322.method2311(var474, -115).field1565 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 4205) {
                            var4--;
                            int var475 = class182.field2827[var4];
                            class109 var476 = class322.method2311(var475, -103);
                            if (var476.field1555 == -1 && var476.field1580 >= 0) {
                                class182.field2827[var4++] = var476.field1580;
                                continue;
                            }
                            class182.field2827[var4++] = var475;
                            continue;
                        }
                        if (var538 == 4206) {
                            var4--;
                            int var477 = class182.field2827[var4];
                            class109 var478 = class322.method2311(var477, -105);
                            if (var478.field1555 >= 0 && var478.field1580 >= 0) {
                                class182.field2827[var4++] = var478.field1580;
                                continue;
                            }
                            class182.field2827[var4++] = var477;
                            continue;
                        }
                        if (var538 == 4207) {
                            var4--;
                            int var479 = class182.field2827[var4];
                            class182.field2827[var4++] = class322.method2311(var479, -103).field1601 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 4208) {
                            var4 -= 2;
                            int var480 = class182.field2827[var4];
                            int var481 = class182.field2827[var4 + 1];
                            class21 var482 = class74.method504(var481, 69);
                            if (var482.method127(-105)) {
                                class267.field4402[var5++] = class322.method2311(var480, -115).method712(var482.field252, (byte) 97, var481);
                            } else {
                                class182.field2827[var4++] = class322.method2311(var480, -104).method719(var481, (byte) 51, var482.field264);
                            }
                            continue;
                        }
                        if (var538 == 4210) {
                            var5--;
                            String var483 = class267.field4402[var5];
                            var4--;
                            int var484 = class182.field2827[var4];
                            class131.method854(var484 == 1, 122, var483);
                            class182.field2827[var4++] = class30.field464;
                            continue;
                        }
                        if (var538 == 4211) {
                            if (class123.field1829 != null && class30.field464 > class334.field5419) {
                                class182.field2827[var4++] = class235.method1623(65535, class123.field1829[class334.field5419++]);
                                continue;
                            }
                            class182.field2827[var4++] = -1;
                            continue;
                        }
                        if (var538 == 4212) {
                            class334.field5419 = 0;
                            continue;
                        }
                    } else if (var538 < 4400) {
                        if (var538 == 4300) {
                            var4 -= 2;
                            int var259 = class182.field2827[var4];
                            int var260 = class182.field2827[var4 + 1];
                            class21 var261 = class74.method504(var260, 104);
                            if (var261.method127(-43)) {
                                class267.field4402[var5++] = class38.method307(var259, 0).method989(var261.field252, var260, 255);
                            } else {
                                class182.field2827[var4++] = class38.method307(var259, 0).method979(var261.field264, (byte) 91, var260);
                            }
                            continue;
                        }
                    } else if (var538 < 4500) {
                        if (var538 == 4400) {
                            var4 -= 2;
                            int var262 = class182.field2827[var4];
                            int var263 = class182.field2827[var4 + 1];
                            class21 var264 = class74.method504(var263, 89);
                            if (var264.method127(-121)) {
                                class267.field4402[var5++] = class165.method1155((byte) 60, var262).method821(-65536, var264.field252, var263);
                            } else {
                                class182.field2827[var4++] = class165.method1155((byte) 54, var262).method816(var263, var264.field264, -42);
                            }
                            continue;
                        }
                    } else if (var538 < 4600) {
                        if (var538 == 4500) {
                            var4 -= 2;
                            int var265 = class182.field2827[var4];
                            int var266 = class182.field2827[var4 + 1];
                            class21 var267 = class74.method504(var266, 84);
                            if (var267.method127(-119)) {
                                class267.field4402[var5++] = class267.method1883((byte) -128, var265).method2093(var266, (byte) 104, var267.field252);
                            } else {
                                class182.field2827[var4++] = class267.method1883((byte) 88, var265).method2092(var266, var267.field264, -21145);
                            }
                            continue;
                        }
                    } else if (var538 < 5100) {
                        if (var538 == 5000) {
                            class182.field2827[var4++] = class320.field5270;
                            continue;
                        }
                        if (var538 == 5001) {
                            var4 -= 3;
                            class320.field5270 = class182.field2827[var4];
                            class297.field4924 = class182.field2827[var4 + 1];
                            class257.field4063 = class182.field2827[var4 + 2];
                            class195.field2992.method250(21066, 209);
                            class195.field2992.method2193(class320.field5270, false);
                            class15.field195++;
                            class195.field2992.method2193(class297.field4924, false);
                            class195.field2992.method2193(class257.field4063, false);
                            continue;
                        }
                        if (var538 == 5002) {
                            var4 -= 2;
                            var5--;
                            String var401 = class267.field4402[var5];
                            int var402 = class182.field2827[var4];
                            class210.field3200++;
                            int var403 = class182.field2827[var4 + 1];
                            class195.field2992.method250(21066, 199);
                            class195.field2992.method2228(class265.method1872(var401, 83), true);
                            class195.field2992.method2193(var402 - 1, false);
                            class195.field2992.method2193(var403, false);
                            continue;
                        }
                        if (var538 == 5003) {
                            String var404 = null;
                            var4--;
                            int var405 = class182.field2827[var4];
                            if (var405 < 100) {
                                var404 = class84.field1210[var405];
                            }
                            if (var404 == null) {
                                var404 = "";
                            }
                            class267.field4402[var5++] = var404;
                            continue;
                        }
                        if (var538 == 5004) {
                            var4--;
                            int var406 = class182.field2827[var4];
                            int var407 = -1;
                            if (var406 < 100 && class84.field1210[var406] != null) {
                                var407 = class166.field2625[var406];
                            }
                            class182.field2827[var4++] = var407;
                            continue;
                        }
                        if (var538 == 5005) {
                            class182.field2827[var4++] = class297.field4924;
                            continue;
                        }
                        if (var538 == 5008) {
                            var5--;
                            String var408 = class267.field4402[var5];
                            if (!var408.startsWith("::")) {
                                if (class121.field1804 == 0 && (class273.field4486 && !class142.field2288 || class263.field4161)) {
                                    continue;
                                }
                                class347.field5565++;
                                byte var409 = 0;
                                byte var410 = 0;
                                String var411 = var408.toLowerCase();
                                if (var411.startsWith(class311.field5061)) {
                                    var408 = var408.substring(class311.field5061.length());
                                    var409 = 0;
                                } else if (var411.startsWith(class45.field656)) {
                                    var408 = var408.substring(class45.field656.length());
                                    var409 = 1;
                                } else if (var411.startsWith(class37.field553)) {
                                    var409 = 2;
                                    var408 = var408.substring(class37.field553.length());
                                } else if (var411.startsWith(class75.field1131)) {
                                    var409 = 3;
                                    var408 = var408.substring(class75.field1131.length());
                                } else if (var411.startsWith(class269.field4430)) {
                                    var408 = var408.substring(class269.field4430.length());
                                    var409 = 4;
                                } else if (var411.startsWith(class320.field5272)) {
                                    var409 = 5;
                                    var408 = var408.substring(class320.field5272.length());
                                } else if (var411.startsWith(class58.field881)) {
                                    var408 = var408.substring(class58.field881.length());
                                    var409 = 6;
                                } else if (var411.startsWith(class185.field2877)) {
                                    var409 = 7;
                                    var408 = var408.substring(class185.field2877.length());
                                } else if (var411.startsWith(class177.field2768)) {
                                    var408 = var408.substring(class177.field2768.length());
                                    var409 = 8;
                                } else if (var411.startsWith(class334.field5420)) {
                                    var409 = 9;
                                    var408 = var408.substring(class334.field5420.length());
                                } else if (var411.startsWith(class84.field1206)) {
                                    var409 = 10;
                                    var408 = var408.substring(class84.field1206.length());
                                } else if (var411.startsWith(class350.field5596)) {
                                    var408 = var408.substring(class350.field5596.length());
                                    var409 = 11;
                                } else if (class334.field5418 != 0) {
                                    if (var411.startsWith(class223.field3440)) {
                                        var408 = var408.substring(class223.field3440.length());
                                        var409 = 0;
                                    } else if (var411.startsWith(class9.field113)) {
                                        var408 = var408.substring(class9.field113.length());
                                        var409 = 1;
                                    } else if (var411.startsWith(class327.field5351)) {
                                        var409 = 2;
                                        var408 = var408.substring(class327.field5351.length());
                                    } else if (var411.startsWith(class326.field5345)) {
                                        var408 = var408.substring(class326.field5345.length());
                                        var409 = 3;
                                    } else if (var411.startsWith(class160.field2559)) {
                                        var409 = 4;
                                        var408 = var408.substring(class160.field2559.length());
                                    } else if (var411.startsWith(class92.field1329)) {
                                        var408 = var408.substring(class92.field1329.length());
                                        var409 = 5;
                                    } else if (var411.startsWith(class183.field2855)) {
                                        var409 = 6;
                                        var408 = var408.substring(class183.field2855.length());
                                    } else if (var411.startsWith(class34.field526)) {
                                        var409 = 7;
                                        var408 = var408.substring(class34.field526.length());
                                    } else if (var411.startsWith(class27.field411)) {
                                        var409 = 8;
                                        var408 = var408.substring(class27.field411.length());
                                    } else if (var411.startsWith(class320.field5275)) {
                                        var408 = var408.substring(class320.field5275.length());
                                        var409 = 9;
                                    } else if (var411.startsWith(class34.field521)) {
                                        var409 = 10;
                                        var408 = var408.substring(class34.field521.length());
                                    } else if (var411.startsWith(class125.field1863)) {
                                        var409 = 11;
                                        var408 = var408.substring(class125.field1863.length());
                                    }
                                }
                                String var412 = var408.toLowerCase();
                                if (var412.startsWith(class197.field3028)) {
                                    var410 = 1;
                                    var408 = var408.substring(class197.field3028.length());
                                } else if (var412.startsWith(class275.field4523)) {
                                    var410 = 2;
                                    var408 = var408.substring(class275.field4523.length());
                                } else if (var412.startsWith(class74.field1115)) {
                                    var410 = 3;
                                    var408 = var408.substring(class74.field1115.length());
                                } else if (var412.startsWith(class77.field1164)) {
                                    var410 = 4;
                                    var408 = var408.substring(class77.field1164.length());
                                } else if (var412.startsWith(class249.field3958)) {
                                    var408 = var408.substring(class249.field3958.length());
                                    var410 = 5;
                                } else if (class334.field5418 != 0) {
                                    if (var412.startsWith(class52.field798)) {
                                        var410 = 1;
                                        var408 = var408.substring(class52.field798.length());
                                    } else if (var412.startsWith(class311.field5062)) {
                                        var410 = 2;
                                        var408 = var408.substring(class311.field5062.length());
                                    } else if (var412.startsWith(class167.field2628)) {
                                        var410 = 3;
                                        var408 = var408.substring(class167.field2628.length());
                                    } else if (var412.startsWith(class161.field2570)) {
                                        var410 = 4;
                                        var408 = var408.substring(class161.field2570.length());
                                    } else if (var412.startsWith(class16.field212)) {
                                        var408 = var408.substring(class16.field212.length());
                                        var410 = 5;
                                    }
                                }
                                class195.field2992.method250(21066, 106);
                                class195.field2992.method2193(0, false);
                                int var413 = class195.field2992.field5137;
                                class195.field2992.method2193(var409, false);
                                class195.field2992.method2193(var410, false);
                                class262.method1841(var408, (byte) -48, class195.field2992);
                                class195.field2992.method2240((byte) 76, class195.field2992.field5137 - var413);
                                continue;
                            }
                            class5.method40(var408, (byte) 106);
                            continue;
                        }
                        if (var538 == 5009) {
                            var5 -= 2;
                            String var414 = class267.field4402[var5];
                            String var415 = class267.field4402[var5 + 1];
                            if (class121.field1804 != 0 || (!class273.field4486 || class142.field2288) && !class263.field4161) {
                                class251.field4009++;
                                class195.field2992.method250(21066, 164);
                                class195.field2992.method2193(0, false);
                                int var416 = class195.field2992.field5137;
                                class195.field2992.method2228(class265.method1872(var414, 124), true);
                                class262.method1841(var415, (byte) -48, class195.field2992);
                                class195.field2992.method2240((byte) 76, class195.field2992.field5137 - var416);
                            }
                            continue;
                        }
                        if (var538 == 5010) {
                            var4--;
                            int var417 = class182.field2827[var4];
                            String var418 = null;
                            if (var417 < 100) {
                                var418 = class119.field1765[var417];
                            }
                            if (var418 == null) {
                                var418 = "";
                            }
                            class267.field4402[var5++] = var418;
                            continue;
                        }
                        if (var538 == 5011) {
                            var4--;
                            int var419 = class182.field2827[var4];
                            String var420 = null;
                            if (var419 < 100) {
                                var420 = class47.field688[var419];
                            }
                            if (var420 == null) {
                                var420 = "";
                            }
                            class267.field4402[var5++] = var420;
                            continue;
                        }
                        if (var538 == 5012) {
                            var4--;
                            int var421 = class182.field2827[var4];
                            int var422 = -1;
                            if (var421 < 100) {
                                var422 = class139.field2197[var421];
                            }
                            class182.field2827[var4++] = var422;
                            continue;
                        }
                        if (var538 == 5015) {
                            String var423;
                            if (class329.field5388 == null || class329.field5388.field597 == null) {
                                var423 = class203.field3116;
                            } else {
                                var423 = class329.field5388.method316(false);
                            }
                            class267.field4402[var5++] = var423;
                            continue;
                        }
                        if (var538 == 5016) {
                            class182.field2827[var4++] = class257.field4063;
                            continue;
                        }
                        if (var538 == 5017) {
                            class182.field2827[var4++] = class253.field4023;
                            continue;
                        }
                        if (var538 == 5050) {
                            var4--;
                            int var424 = class182.field2827[var4];
                            class267.field4402[var5++] = class227.method1541(0, var424).field5373;
                            continue;
                        }
                        if (var538 == 5051) {
                            var4--;
                            int var425 = class182.field2827[var4];
                            class328 var426 = class227.method1541(0, var425);
                            if (var426.field5357 == null) {
                                class182.field2827[var4++] = 0;
                            } else {
                                class182.field2827[var4++] = var426.field5357.length;
                            }
                            continue;
                        }
                        if (var538 == 5052) {
                            var4 -= 2;
                            int var427 = class182.field2827[var4];
                            int var428 = class182.field2827[var4 + 1];
                            class328 var429 = class227.method1541(0, var427);
                            int var430 = var429.field5357[var428];
                            class182.field2827[var4++] = var430;
                            continue;
                        }
                        if (var538 == 5053) {
                            var4--;
                            int var431 = class182.field2827[var4];
                            class328 var432 = class227.method1541(0, var431);
                            if (var432.field5367 == null) {
                                class182.field2827[var4++] = 0;
                            } else {
                                class182.field2827[var4++] = var432.field5367.length;
                            }
                            continue;
                        }
                        if (var538 == 5054) {
                            var4 -= 2;
                            int var433 = class182.field2827[var4];
                            int var434 = class182.field2827[var4 + 1];
                            class182.field2827[var4++] = class227.method1541(0, var433).field5367[var434];
                            continue;
                        }
                        if (var538 == 5055) {
                            var4--;
                            int var435 = class182.field2827[var4];
                            class267.field4402[var5++] = class295.method2088(false, var435).method278((byte) 113);
                            continue;
                        }
                        if (var538 == 5056) {
                            var4--;
                            int var436 = class182.field2827[var4];
                            class33 var437 = class295.method2088(false, var436);
                            if (var437.field509 == null) {
                                class182.field2827[var4++] = 0;
                            } else {
                                class182.field2827[var4++] = var437.field509.length;
                            }
                            continue;
                        }
                        if (var538 == 5057) {
                            var4 -= 2;
                            int var438 = class182.field2827[var4];
                            int var439 = class182.field2827[var4 + 1];
                            class182.field2827[var4++] = class295.method2088(false, var438).field509[var439];
                            continue;
                        }
                        if (var538 == 5058) {
                            class151.field2429 = new class222();
                            var4--;
                            class151.field2429.field3429 = class182.field2827[var4];
                            class151.field2429.field3432 = class295.method2088(false, class151.field2429.field3429);
                            class151.field2429.field3430 = new int[class151.field2429.field3432.method281(0)];
                            continue;
                        }
                        if (var538 == 5059) {
                            class195.field2992.method250(21066, 61);
                            field4366++;
                            class195.field2992.method2193(0, false);
                            int var440 = class195.field2992.field5137;
                            class195.field2992.method2193(0, false);
                            class195.field2992.method2206(class151.field2429.field3429, (byte) -120);
                            class151.field2429.field3432.method275(true, class195.field2992, class151.field2429.field3430);
                            class195.field2992.method2240((byte) 76, class195.field2992.field5137 - var440);
                            continue;
                        }
                        if (var538 == 5060) {
                            class28.field420++;
                            var5--;
                            String var441 = class267.field4402[var5];
                            class195.field2992.method250(21066, 142);
                            class195.field2992.method2193(0, false);
                            int var442 = class195.field2992.field5137;
                            class195.field2992.method2228(class265.method1872(var441, 84), true);
                            class195.field2992.method2206(class151.field2429.field3429, (byte) -75);
                            class151.field2429.field3432.method275(true, class195.field2992, class151.field2429.field3430);
                            class195.field2992.method2240((byte) 76, class195.field2992.field5137 - var442);
                            continue;
                        }
                        if (var538 == 5061) {
                            field4366++;
                            class195.field2992.method250(21066, 61);
                            class195.field2992.method2193(0, false);
                            int var443 = class195.field2992.field5137;
                            class195.field2992.method2193(1, false);
                            class195.field2992.method2206(class151.field2429.field3429, (byte) -37);
                            class151.field2429.field3432.method275(true, class195.field2992, class151.field2429.field3430);
                            class195.field2992.method2240((byte) 76, class195.field2992.field5137 - var443);
                            continue;
                        }
                        if (var538 == 5062) {
                            var4 -= 2;
                            int var444 = class182.field2827[var4 + 1];
                            int var445 = class182.field2827[var4];
                            class182.field2827[var4++] = class227.method1541(0, var445).field5366[var444];
                            continue;
                        }
                        if (var538 == 5063) {
                            var4 -= 2;
                            int var446 = class182.field2827[var4];
                            int var447 = class182.field2827[var4 + 1];
                            class182.field2827[var4++] = class227.method1541(0, var446).field5358[var447];
                            continue;
                        }
                        if (var538 == 5064) {
                            var4 -= 2;
                            int var448 = class182.field2827[var4];
                            int var449 = class182.field2827[var4 + 1];
                            if (var449 == -1) {
                                class182.field2827[var4++] = -1;
                            } else {
                                class182.field2827[var4++] = class227.method1541(0, var448).method2334(-1, (char) var449);
                            }
                            continue;
                        }
                        if (var538 == 5065) {
                            var4 -= 2;
                            int var450 = class182.field2827[var4 + 1];
                            int var451 = class182.field2827[var4];
                            if (var450 == -1) {
                                class182.field2827[var4++] = -1;
                            } else {
                                class182.field2827[var4++] = class227.method1541(0, var451).method2335((char) var450, 28);
                            }
                            continue;
                        }
                        if (var538 == 5066) {
                            var4--;
                            int var452 = class182.field2827[var4];
                            class182.field2827[var4++] = class295.method2088(false, var452).method281(0);
                            continue;
                        }
                        if (var538 == 5067) {
                            var4 -= 2;
                            int var453 = class182.field2827[var4];
                            int var454 = class182.field2827[var4 + 1];
                            int var455 = class295.method2088(false, var453).method271((byte) 66, var454);
                            class182.field2827[var4++] = var455;
                            continue;
                        }
                        if (var538 == 5068) {
                            var4 -= 2;
                            int var456 = class182.field2827[var4];
                            int var457 = class182.field2827[var4 + 1];
                            class151.field2429.field3430[var456] = var457;
                            continue;
                        }
                        if (var538 == 5069) {
                            var4 -= 2;
                            int var458 = class182.field2827[var4 + 1];
                            int var459 = class182.field2827[var4];
                            class151.field2429.field3430[var459] = var458;
                            continue;
                        }
                        if (var538 == 5070) {
                            var4 -= 3;
                            int var460 = class182.field2827[var4 + 1];
                            int var461 = class182.field2827[var4 + 2];
                            int var462 = class182.field2827[var4];
                            class33 var463 = class295.method2088(false, var462);
                            if (var463.method271((byte) 66, var460) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            class182.field2827[var4++] = var463.method282(var460, var461, -1);
                            continue;
                        }
                        if (var538 == 5071) {
                            var4--;
                            boolean var464 = class182.field2827[var4] == 1;
                            var5--;
                            String var465 = class267.field4402[var5];
                            class320.method2304(32768, var465, var464);
                            class182.field2827[var4++] = class30.field464;
                            continue;
                        }
                        if (var538 == 5072) {
                            if (class123.field1829 != null && class334.field5419 < class30.field464) {
                                class182.field2827[var4++] = class235.method1623(65535, class123.field1829[class334.field5419++]);
                                continue;
                            }
                            class182.field2827[var4++] = -1;
                            continue;
                        }
                        if (var538 == 5073) {
                            class334.field5419 = 0;
                            continue;
                        }
                    } else if (var538 < 5200) {
                        if (var538 == 5100) {
                            if (class294.field4896[86]) {
                                class182.field2827[var4++] = 1;
                            } else {
                                class182.field2827[var4++] = 0;
                            }
                            continue;
                        }
                        if (var538 == 5101) {
                            if (class294.field4896[82]) {
                                class182.field2827[var4++] = 1;
                            } else {
                                class182.field2827[var4++] = 0;
                            }
                            continue;
                        }
                        if (var538 == 5102) {
                            if (class294.field4896[81]) {
                                class182.field2827[var4++] = 1;
                            } else {
                                class182.field2827[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var538 < 5300) {
                        if (var538 == 5200) {
                            var4--;
                            class343.method2422(class182.field2827[var4], (byte) -59);
                            continue;
                        }
                        if (var538 == 5201) {
                            class182.field2827[var4++] = class77.method518(908);
                            continue;
                        }
                        if (var538 == 5205) {
                            var4--;
                            class358.method2489(-1, false, 8, -1, class182.field2827[var4]);
                            continue;
                        }
                        if (var538 == 5206) {
                            var4--;
                            int var354 = class182.field2827[var4];
                            class275 var355 = class88.method584(var354 >> 14 & 0x3FFF, var354 & 0x3FFF);
                            if (var355 == null) {
                                class182.field2827[var4++] = -1;
                            } else {
                                class182.field2827[var4++] = var355.field4524;
                            }
                            continue;
                        }
                        if (var538 == 5207) {
                            var4--;
                            class275 var356 = class88.method590(class182.field2827[var4]);
                            if (var356 != null && var356.field4541 != null) {
                                class267.field4402[var5++] = var356.field4541;
                                continue;
                            }
                            class267.field4402[var5++] = "";
                            continue;
                        }
                        if (var538 == 5208) {
                            class182.field2827[var4++] = class224.field3462;
                            class182.field2827[var4++] = class318.field5244;
                            continue;
                        }
                        if (var538 == 5209) {
                            class182.field2827[var4++] = class88.field1261 + class236.field3735;
                            class182.field2827[var4++] = class88.field1262 - (class125.field1873 + 1 - class88.field1256);
                            continue;
                        }
                        if (var538 == 5210) {
                            var4--;
                            int var357 = class182.field2827[var4];
                            class275 var358 = class88.method590(var357);
                            if (var358 == null) {
                                class182.field2827[var4++] = 0;
                                class182.field2827[var4++] = 0;
                            } else {
                                class182.field2827[var4++] = class235.method1623(var358.field4529 >> 14, 16383);
                                class182.field2827[var4++] = class235.method1623(var358.field4529, 16383);
                            }
                            continue;
                        }
                        if (var538 == 5211) {
                            var4--;
                            int var359 = class182.field2827[var4];
                            class275 var360 = class88.method590(var359);
                            if (var360 == null) {
                                class182.field2827[var4++] = 0;
                                class182.field2827[var4++] = 0;
                            } else {
                                class182.field2827[var4++] = var360.field4526 - var360.field4536;
                                class182.field2827[var4++] = var360.field4538 - var360.field4535;
                            }
                            continue;
                        }
                        if (var538 == 5212) {
                            class148 var361 = class110.method733(16383);
                            if (var361 == null) {
                                class182.field2827[var4++] = -1;
                                class182.field2827[var4++] = -1;
                            } else {
                                class182.field2827[var4++] = var361.field2378;
                                int var362 = class88.field1262 - var361.field2381 - (-class88.field1256 + 1) | var361.field2391 - -class88.field1261 << 14 | var361.field2386 << 28;
                                class182.field2827[var4++] = var362;
                            }
                            continue;
                        }
                        if (var538 == 5213) {
                            class148 var363 = class228.method1552(true);
                            if (var363 == null) {
                                class182.field2827[var4++] = -1;
                                class182.field2827[var4++] = -1;
                            } else {
                                class182.field2827[var4++] = var363.field2378;
                                int var364 = class88.field1261 + var363.field2391 << 14 | var363.field2386 << 28 | class88.field1262 - (1 - (class88.field1256 - var363.field2381));
                                class182.field2827[var4++] = var364;
                            }
                            continue;
                        }
                        if (var538 == 5214) {
                            var4--;
                            int var365 = class182.field2827[var4];
                            class275 var366 = class41.method325(-30462);
                            if (var366 != null) {
                                boolean var367 = var366.method1963(class223.field3437, var365 & 0x3FFF, var365 >> 14 & 0x3FFF, var365 >> 28 & 0x3, -123);
                                if (var367) {
                                    class172.method1190(true, class223.field3437[1], class223.field3437[2]);
                                }
                            }
                            continue;
                        }
                        if (var538 == 5215) {
                            var4 -= 2;
                            int var368 = class182.field2827[var4];
                            int var369 = class182.field2827[var4 + 1];
                            boolean var370 = false;
                            class198 var371 = class88.method573((var368 & 0xFFFC9FE) >> 14, var368 & 0x3FFF);
                            for (class275 var372 = (class275) var371.method1350(0); var372 != null; var372 = (class275) var371.method1351(-91)) {
                                if (var372.field4524 == var369) {
                                    var370 = true;
                                    break;
                                }
                            }
                            if (var370) {
                                class182.field2827[var4++] = 1;
                            } else {
                                class182.field2827[var4++] = 0;
                            }
                            continue;
                        }
                        if (var538 == 5218) {
                            var4--;
                            int var373 = class182.field2827[var4];
                            class275 var374 = class88.method590(var373);
                            if (var374 == null) {
                                class182.field2827[var4++] = -1;
                            } else {
                                class182.field2827[var4++] = var374.field4534;
                            }
                            continue;
                        }
                        if (var538 == 5220) {
                            class182.field2827[var4++] = class334.field5425 == 100 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 5221) {
                            var4--;
                            int var375 = class182.field2827[var4];
                            class172.method1190(true, (var375 & 0xFFFCE19) >> 14, var375 & 0x3FFF);
                            continue;
                        }
                        if (var538 == 5222) {
                            class275 var376 = class41.method325(-30462);
                            if (var376 == null) {
                                class182.field2827[var4++] = -1;
                                class182.field2827[var4++] = -1;
                            } else {
                                boolean var377 = var376.method1962(class236.field3735 + class88.field1261, class223.field3437, 12800, class88.field1262 + class88.field1256 - class125.field1873 - 1);
                                if (var377) {
                                    class182.field2827[var4++] = class223.field3437[1];
                                    class182.field2827[var4++] = class223.field3437[2];
                                } else {
                                    class182.field2827[var4++] = -1;
                                    class182.field2827[var4++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var538 == 5223) {
                            var4 -= 2;
                            int var378 = class182.field2827[var4];
                            int var379 = class182.field2827[var4 + 1];
                            class358.method2489(var379 >> 14 & 0x3FFF, false, 8, var379 & 0x3FFF, var378);
                            continue;
                        }
                        if (var538 == 5224) {
                            var4--;
                            int var380 = class182.field2827[var4];
                            class275 var381 = class41.method325(-30462);
                            if (var381 == null) {
                                class182.field2827[var4++] = -1;
                                class182.field2827[var4++] = -1;
                            } else {
                                boolean var382 = var381.method1963(class223.field3437, var380 & 0x3FFF, (var380 & 0xFFFF383) >> 14, var380 >> 28 & 0x3, 105);
                                if (var382) {
                                    class182.field2827[var4++] = class223.field3437[1];
                                    class182.field2827[var4++] = class223.field3437[2];
                                } else {
                                    class182.field2827[var4++] = -1;
                                    class182.field2827[var4++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var538 == 5225) {
                            var4--;
                            int var383 = class182.field2827[var4];
                            class275 var384 = class41.method325(-30462);
                            if (var384 == null) {
                                class182.field2827[var4++] = -1;
                                class182.field2827[var4++] = -1;
                            } else {
                                boolean var385 = var384.method1962(var383 >> 14 & 0x3FFF, class223.field3437, 12800, var383 & 0x3FFF);
                                if (var385) {
                                    class182.field2827[var4++] = class223.field3437[1];
                                    class182.field2827[var4++] = class223.field3437[2];
                                } else {
                                    class182.field2827[var4++] = -1;
                                    class182.field2827[var4++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var538 == 5226) {
                            var4--;
                            class355.method2475(1, class182.field2827[var4]);
                            continue;
                        }
                        if (var538 == 5227) {
                            var4 -= 2;
                            int var386 = class182.field2827[var4];
                            int var387 = class182.field2827[var4 + 1];
                            class358.method2489(var387 >> 14 & 0x3FFF, true, 8, var387 & 0x3FFF, var386);
                            continue;
                        }
                        if (var538 == 5228) {
                            var4--;
                            class132.field2030 = class182.field2827[var4] == 1;
                            continue;
                        }
                        if (var538 == 5229) {
                            class182.field2827[var4++] = class132.field2030 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 5230) {
                            var4--;
                            int var388 = class182.field2827[var4];
                            class278.method1980(var388, -1);
                            continue;
                        }
                        if (var538 == 5231) {
                            var4 -= 2;
                            int var389 = class182.field2827[var4];
                            boolean var390 = class182.field2827[var4 + 1] == 1;
                            if (class91.field1311 == null) {
                                continue;
                            }
                            class159 var391 = class91.field1311.method29((long) var389, 103);
                            if (var391 != null && !var390) {
                                var391.method1131(8);
                                continue;
                            }
                            if (var391 == null && var390) {
                                class159 var392 = new class159();
                                class91.field1311.method37(false, var392, (long) var389);
                            }
                            continue;
                        }
                        if (var538 == 5232) {
                            var4--;
                            int var393 = class182.field2827[var4];
                            if (class91.field1311 == null) {
                                class182.field2827[var4++] = 0;
                            } else {
                                class159 var394 = class91.field1311.method29((long) var393, 103);
                                class182.field2827[var4++] = var394 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var538 == 5233) {
                            var4 -= 2;
                            int var395 = class182.field2827[var4];
                            boolean var396 = class182.field2827[var4 + 1] == 1;
                            if (class48.field689 == null) {
                                continue;
                            }
                            class159 var397 = class48.field689.method29((long) var395, 103);
                            if (var397 != null && !var396) {
                                var397.method1131(8);
                                continue;
                            }
                            if (var397 == null && var396) {
                                class159 var398 = new class159();
                                class48.field689.method37(false, var398, (long) var395);
                            }
                            continue;
                        }
                        if (var538 == 5234) {
                            var4--;
                            int var399 = class182.field2827[var4];
                            if (class48.field689 == null) {
                                class182.field2827[var4++] = 0;
                            } else {
                                class159 var400 = class48.field689.method29((long) var399, 103);
                                class182.field2827[var4++] = var400 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var538 == 5235) {
                            class182.field2827[var4++] = class88.field1260 == null ? -1 : class88.field1260.field4524;
                            continue;
                        }
                    } else if (var538 < 5400) {
                        if (var538 == 5300) {
                            var4 -= 2;
                            int var341 = class182.field2827[var4 + 1];
                            int var342 = class182.field2827[var4];
                            class124.method801(var341, false, 0, var342, 3);
                            class182.field2827[var4++] = class296.field4907 == null ? 0 : 1;
                            continue;
                        }
                        if (var538 == 5301) {
                            if (class296.field4907 != null) {
                                class124.method801(-1, false, 0, -1, class295.field4901);
                            }
                            continue;
                        }
                        if (var538 == 5302) {
                            class16[] var343 = class15.method105((byte) 50);
                            class182.field2827[var4++] = var343.length;
                            continue;
                        }
                        if (var538 == 5303) {
                            var4--;
                            int var344 = class182.field2827[var4];
                            class16[] var345 = class15.method105((byte) 96);
                            class182.field2827[var4++] = var345[var344].field207;
                            class182.field2827[var4++] = var345[var344].field210;
                            continue;
                        }
                        if (var538 == 5305) {
                            int var346 = class251.field4012;
                            int var347 = class72.field1105;
                            int var348 = -1;
                            class16[] var349 = class15.method105((byte) 101);
                            for (int var350 = 0; var350 < var349.length; var350++) {
                                class16 var351 = var349[var350];
                                if (var351.field207 == var346 && var351.field210 == var347) {
                                    var348 = var350;
                                    break;
                                }
                            }
                            class182.field2827[var4++] = var348;
                            continue;
                        }
                        if (var538 == 5306) {
                            class182.field2827[var4++] = class84.method552(0);
                            continue;
                        }
                        if (var538 == 5307) {
                            var4--;
                            int var352 = class182.field2827[var4];
                            if (var352 < 0 || var352 > 2) {
                                var352 = 0;
                            }
                            class124.method801(-1, false, 0, -1, var352);
                            continue;
                        }
                        if (var538 == 5308) {
                            class182.field2827[var4++] = class295.field4901;
                            continue;
                        }
                        if (var538 == 5309) {
                            var4--;
                            int var353 = class182.field2827[var4];
                            if (var353 < 0 || var353 > 2) {
                                var353 = 0;
                            }
                            class295.field4901 = var353;
                            class292.method2064(true, class96.field1382);
                            continue;
                        }
                    } else if (var538 < 5500) {
                        if (var538 == 5400) {
                            var5 -= 2;
                            class219.field3368++;
                            String var268 = class267.field4402[var5];
                            var4--;
                            int var269 = class182.field2827[var4];
                            String var270 = class267.field4402[var5 + 1];
                            class195.field2992.method250(21066, 148);
                            class195.field2992.method2193(class26.method223(1, var268) - (-class26.method223(1, var270) - 1), false);
                            class195.field2992.method2223(0, var268);
                            class195.field2992.method2223(0, var270);
                            class195.field2992.method2193(var269, false);
                            continue;
                        }
                        if (var538 == 5401) {
                            var4 -= 2;
                            class150.field2421[class182.field2827[var4]] = (short) class5.method44(class182.field2827[var4 + 1], 255);
                            class90.method596(-1);
                            class16.method111(12608);
                            class361.method2505(118);
                            class314.method2256(6);
                            class110.method732(100);
                            continue;
                        }
                        if (var538 == 5405) {
                            var4 -= 2;
                            int var271 = class182.field2827[var4];
                            int var272 = class182.field2827[var4 + 1];
                            if (var271 >= 0 && var271 < 2) {
                                class118.field1726[var271] = new int[var272 << 1][4];
                            }
                            continue;
                        }
                        if (var538 == 5406) {
                            var4 -= 7;
                            int var273 = class182.field2827[var4];
                            int var274 = class182.field2827[var4 + 3];
                            int var275 = class182.field2827[var4 + 1] << 1;
                            int var276 = class182.field2827[var4 + 2];
                            int var277 = class182.field2827[var4 + 4];
                            int var278 = class182.field2827[var4 + 6];
                            int var279 = class182.field2827[var4 + 5];
                            if (var273 >= 0 && var273 < 2 && class118.field1726[var273] != null && var275 >= 0 && class118.field1726[var273].length > var275) {
                                class118.field1726[var273][var275] = new int[] { class235.method1623(var276 >> 14, 16383) * 128, var274, class235.method1623(16383, var276) * 128, var278 };
                                class118.field1726[var273][var275 + 1] = new int[] { (class235.method1623(268425037, var277) >> 14) * 128, var279, class235.method1623(var277, 16383) * 128 };
                            }
                            continue;
                        }
                        if (var538 == 5407) {
                            var4--;
                            int var280 = class118.field1726[class182.field2827[var4]].length >> 1;
                            class182.field2827[var4++] = var280;
                            continue;
                        }
                        if (var538 == 5411) {
                            if (class296.field4907 != null) {
                                class124.method801(-1, false, 0, -1, class295.field4901);
                            }
                            if (class217.field3350 == null) {
                                class344.method2425(false, class339.method2389(10592), (byte) 99);
                            } else {
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var538 == 5419) {
                            String var281 = "";
                            if (class249.field3966 != null) {
                                if (class249.field3966.field2538 == null) {
                                    var281 = class204.method1394(class249.field3966.field2541, 0);
                                } else {
                                    var281 = (String) class249.field3966.field2538;
                                }
                            }
                            class267.field4402[var5++] = var281;
                            continue;
                        }
                        if (var538 == 5420) {
                            class182.field2827[var4++] = class274.field4509 == 3 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 5421) {
                            if (class296.field4907 != null) {
                                class124.method801(-1, false, 0, -1, class295.field4901);
                            }
                            var4--;
                            boolean var282 = class182.field2827[var4] == 1;
                            var5--;
                            String var283 = class267.field4402[var5];
                            String var284 = class339.method2389(10592) + var283;
                            if (class217.field3350 == null && (!var282 || class274.field4509 == 3 || !class274.field4518.startsWith("win") || class258.field4093)) {
                                class344.method2425(var282, var284, (byte) 99);
                                continue;
                            }
                            class60.field914 = var284;
                            class98.field1426 = var282;
                            class51.field766 = class96.field1382.method1942(var284, (byte) 87);
                            continue;
                        }
                        if (var538 == 5422) {
                            var5 -= 2;
                            String var285 = class267.field4402[var5];
                            String var286 = class267.field4402[var5 + 1];
                            var4--;
                            int var287 = class182.field2827[var4];
                            if (var285.length() > 0) {
                                if (class353.field5623 == null) {
                                    class353.field5623 = new String[class328.field5365[class179.field2789]];
                                }
                                class353.field5623[var287] = var285;
                            }
                            if (var286.length() > 0) {
                                if (class345.field5535 == null) {
                                    class345.field5535 = new String[class328.field5365[class179.field2789]];
                                }
                                class345.field5535[var287] = var286;
                            }
                            continue;
                        }
                        if (var538 == 5423) {
                            var5--;
                            System.out.println(class267.field4402[var5]);
                            continue;
                        }
                        if (var538 == 5424) {
                            var4 -= 11;
                            class70.field1093 = class182.field2827[var4];
                            class241.field3781 = class182.field2827[var4 + 1];
                            class125.field1866 = class182.field2827[var4 + 2];
                            class250.field3994 = class182.field2827[var4 + 3];
                            class347.field5562 = class182.field2827[var4 + 4];
                            class258.field4096 = class182.field2827[var4 + 5];
                            class275.field4543 = class182.field2827[var4 + 6];
                            class160.field2557 = class182.field2827[var4 + 7];
                            class6.field74 = class182.field2827[var4 + 8];
                            class39.field601 = class182.field2827[var4 + 9];
                            class202.field3105 = class182.field2827[var4 + 10];
                            class69.field1073.method1519(false, class347.field5562);
                            class69.field1073.method1519(false, class258.field4096);
                            class69.field1073.method1519(false, class275.field4543);
                            class69.field1073.method1519(false, class160.field2557);
                            class69.field1073.method1519(false, class6.field74);
                            class98.field1408 = true;
                            continue;
                        }
                        if (var538 == 5425) {
                            class289.method2051(27953);
                            class98.field1408 = false;
                            continue;
                        }
                        if (var538 == 5426) {
                            var4--;
                            class297.field4923 = class182.field2827[var4];
                            continue;
                        }
                        if (var538 == 5427) {
                            var4 -= 2;
                            class210.field3203 = class182.field2827[var4];
                            field4387 = class182.field2827[var4 + 1];
                            continue;
                        }
                        if (var538 == 5428) {
                            var4 -= 2;
                            int var288 = class182.field2827[var4];
                            int var289 = class182.field2827[var4 + 1];
                            class182.field2827[var4++] = class361.method2506(var289, -51, var288) ? 1 : 0;
                            continue;
                        }
                    } else if (var538 < 5600) {
                        if (var538 == 5500) {
                            var4 -= 4;
                            int var329 = class182.field2827[var4];
                            int var330 = class182.field2827[var4 + 1];
                            int var331 = class182.field2827[var4 + 2];
                            int var332 = class182.field2827[var4 + 3];
                            class65.method456(false, var332, (var329 >> 14 & 0x3FFF) - class215.field3313, 12961, var331, (var329 & 0x3FFF) - class150.field2420, var330);
                            continue;
                        }
                        if (var538 == 5501) {
                            var4 -= 4;
                            int var333 = class182.field2827[var4];
                            int var334 = class182.field2827[var4 + 1];
                            int var335 = class182.field2827[var4 + 2];
                            int var336 = class182.field2827[var4 + 3];
                            class142.method1003(var336, var334, (var333 & 0x3FFF) - class150.field2420, var335, 30, ((var333 & 0xFFFFA4B) >> 14) - class215.field3313);
                            continue;
                        }
                        if (var538 == 5502) {
                            var4 -= 6;
                            int var337 = class182.field2827[var4];
                            if (var337 >= 2) {
                                throw new RuntimeException();
                            }
                            class270.field4456 = var337;
                            int var338 = class182.field2827[var4 + 1];
                            if (class118.field1726[class270.field4456].length >> 1 <= var338 + 1) {
                                throw new RuntimeException();
                            }
                            class21.field254 = 0;
                            class284.field4658 = var338;
                            class257.field4060 = class182.field2827[var4 + 2];
                            class170.field2661 = class182.field2827[var4 + 3];
                            int var339 = class182.field2827[var4 + 4];
                            if (var339 >= 2) {
                                throw new RuntimeException();
                            }
                            class250.field3998 = var339;
                            int var340 = class182.field2827[var4 + 5];
                            if (class118.field1726[class250.field3998].length >> 1 <= var340 + 1) {
                                throw new RuntimeException();
                            }
                            class269.field4427 = 3;
                            class89.field1282 = var340;
                            continue;
                        }
                        if (var538 == 5503) {
                            class70.method485(-6);
                            continue;
                        }
                        if (var538 == 5504) {
                            var4 -= 2;
                            class329.method2345(class182.field2827[var4], class182.field2827[var4 + 1], true);
                            continue;
                        }
                        if (var538 == 5505) {
                            class182.field2827[var4++] = (int) class285.field4676;
                            continue;
                        }
                        if (var538 == 5506) {
                            class182.field2827[var4++] = (int) class355.field5628;
                            continue;
                        }
                        if (var538 == 5507) {
                            class262.method1837(-47);
                            continue;
                        }
                        if (var538 == 5508) {
                            class179.method1252(-29137);
                            continue;
                        }
                        if (var538 == 5509) {
                            class261.method1834(4096);
                            continue;
                        }
                        if (var538 == 5510) {
                            class13.method97(0);
                            continue;
                        }
                        if (var538 == 5512) {
                            class250.method1777(0);
                            continue;
                        }
                    } else if (var538 < 5700) {
                        if (var538 == 5600) {
                            var5 -= 2;
                            String var325 = class267.field4402[var5];
                            String var326 = class267.field4402[var5 + 1];
                            var4--;
                            int var327 = class182.field2827[var4];
                            if (class346.field5553 == 10 && class221.field3424 == 0 && class291.field4825 == 0 && class55.field843 == 0 && class221.field3387 == 0) {
                                class218.method1471(var327, var326, var325, false);
                            }
                            continue;
                        }
                        if (var538 == 5601) {
                            class167.method1161(11534);
                            continue;
                        }
                        if (var538 == 5602) {
                            if (class291.field4825 == 0) {
                                class15.field202 = -2;
                            }
                            continue;
                        }
                        if (var538 == 5603) {
                            var4 -= 4;
                            if (class346.field5553 == 10 && class221.field3424 == 0 && class291.field4825 == 0 && class55.field843 == 0 && class221.field3387 == 0) {
                                class215.method1460(class182.field2827[var4 + 1], class182.field2827[var4 + 3], class182.field2827[var4 + 2], class182.field2827[var4], -3);
                            }
                            continue;
                        }
                        if (var538 == 5604) {
                            var5--;
                            if (class346.field5553 == 10 && class221.field3424 == 0 && class291.field4825 == 0 && class55.field843 == 0 && class221.field3387 == 0) {
                                class71.method492(0, class265.method1872(class267.field4402[var5], 53));
                            }
                            continue;
                        }
                        if (var538 == 5605) {
                            var5 -= 3;
                            var4 -= 7;
                            if (class346.field5553 == 10 && class221.field3424 == 0 && class291.field4825 == 0 && class55.field843 == 0 && class221.field3387 == 0) {
                                class313.method2226(8951, class182.field2827[var4 + 3], class182.field2827[var4 + 4] == 1, class182.field2827[var4 + 2], class182.field2827[var4 + 5] == 1, class267.field4402[var5 + 1], class182.field2827[var4 + 6] == 1, class267.field4402[var5 + 2], class265.method1872(class267.field4402[var5], 57), class182.field2827[var4 + 1], class182.field2827[var4]);
                            }
                            continue;
                        }
                        if (var538 == 5606) {
                            if (class55.field843 == 0) {
                                class45.field654 = -2;
                            }
                            continue;
                        }
                        if (var538 == 5607) {
                            class182.field2827[var4++] = class15.field202;
                            continue;
                        }
                        if (var538 == 5608) {
                            class182.field2827[var4++] = class202.field3106;
                            continue;
                        }
                        if (var538 == 5609) {
                            class182.field2827[var4++] = class45.field654;
                            continue;
                        }
                        if (var538 == 5610) {
                            for (int var328 = 0; var328 < 5; var328++) {
                                class267.field4402[var5++] = class61.field938.length <= var328 ? "" : class120.method778(class61.field938[var328], (byte) -120);
                            }
                            class61.field938 = null;
                            continue;
                        }
                        if (var538 == 5611) {
                            class182.field2827[var4++] = class350.field5597;
                            continue;
                        }
                    } else if (var538 < 6100) {
                        if (var538 == 6001) {
                            var4--;
                            int var315 = class182.field2827[var4];
                            if (var315 < 1) {
                                var315 = 1;
                            }
                            if (var315 > 4) {
                                var315 = 4;
                            }
                            class75.field1138 = var315;
                            if (!class245.field3886 || !class322.field5287) {
                                if (class75.field1138 == 1) {
                                    class272.method1931(0.9F);
                                }
                                if (class75.field1138 == 2) {
                                    class272.method1931(0.8F);
                                }
                                if (class75.field1138 == 3) {
                                    class272.method1931(0.7F);
                                }
                                if (class75.field1138 == 4) {
                                    class272.method1931(0.6F);
                                }
                            }
                            if (class245.field3886) {
                                class146.method1039(false);
                                if (!class322.field5287) {
                                    class143.method1009(2485);
                                }
                            }
                            class16.method111(12608);
                            class292.method2064(true, class96.field1382);
                            class81.field1187 = false;
                            continue;
                        }
                        if (var538 == 6002) {
                            var4--;
                            class101.method659(class182.field2827[var4] == 1, 0);
                            class268.method1889(-29506);
                            class143.method1009(2485);
                            class49.method365(255);
                            class292.method2064(true, class96.field1382);
                            class81.field1187 = false;
                            continue;
                        }
                        if (var538 == 6003) {
                            var4--;
                            class153.field2486 = class182.field2827[var4] == 1;
                            class49.method365(255);
                            class292.method2064(true, class96.field1382);
                            class81.field1187 = false;
                            continue;
                        }
                        if (var538 == 6005) {
                            var4--;
                            class118.field1725 = class182.field2827[var4] == 1;
                            class143.method1009(2485);
                            class292.method2064(true, class96.field1382);
                            class81.field1187 = false;
                            continue;
                        }
                        if (var538 == 6006) {
                            var4--;
                            class115.field1680 = class182.field2827[var4] == 1;
                            ((class55) class272.field4467).method417(true, !class115.field1680);
                            class292.method2064(true, class96.field1382);
                            class81.field1187 = false;
                            continue;
                        }
                        if (var538 == 6007) {
                            var4--;
                            class295.field4905 = class182.field2827[var4] == 1;
                            class292.method2064(true, class96.field1382);
                            class81.field1187 = false;
                            continue;
                        }
                        if (var538 == 6008) {
                            var4--;
                            class178.field2777 = class182.field2827[var4] == 1;
                            class292.method2064(true, class96.field1382);
                            class81.field1187 = false;
                            continue;
                        }
                        if (var538 == 6009) {
                            var4--;
                            class121.field1814 = class182.field2827[var4] == 1;
                            class292.method2064(true, class96.field1382);
                            class81.field1187 = false;
                            continue;
                        }
                        if (var538 == 6010) {
                            var4--;
                            class142.field2279 = class182.field2827[var4] == 1;
                            class292.method2064(true, class96.field1382);
                            class81.field1187 = false;
                            continue;
                        }
                        if (var538 == 6011) {
                            var4--;
                            int var316 = class182.field2827[var4];
                            if (var316 < 0 || var316 > 2) {
                                var316 = 0;
                            }
                            class162.field2580 = var316;
                            class292.method2064(true, class96.field1382);
                            class81.field1187 = false;
                            continue;
                        }
                        if (var538 == 6012) {
                            if (class245.field3886) {
                                class7.method53(0, 0, true);
                            }
                            var4--;
                            class322.field5287 = class182.field2827[var4] == 1;
                            if (class245.field3886 && class322.field5287) {
                                class272.method1931(0.7F);
                            } else {
                                if (class75.field1138 == 1) {
                                    class272.method1931(0.9F);
                                }
                                if (class75.field1138 == 2) {
                                    class272.method1931(0.8F);
                                }
                                if (class75.field1138 == 3) {
                                    class272.method1931(0.7F);
                                }
                                if (class75.field1138 == 4) {
                                    class272.method1931(0.6F);
                                }
                            }
                            class143.method1009(2485);
                            class292.method2064(true, class96.field1382);
                            class81.field1187 = false;
                            continue;
                        }
                        if (var538 == 6014) {
                            var4--;
                            class347.field5557 = class182.field2827[var4] == 1;
                            if (class245.field3886) {
                                class143.method1009(2485);
                            }
                            class292.method2064(true, class96.field1382);
                            class81.field1187 = false;
                            continue;
                        }
                        if (var538 == 6015) {
                            var4--;
                            class96.field1398 = class182.field2827[var4] == 1;
                            if (class245.field3886) {
                                class146.method1039(false);
                            }
                            class292.method2064(true, class96.field1382);
                            class81.field1187 = false;
                            continue;
                        }
                        if (var538 == 6016) {
                            var4--;
                            int var317 = class182.field2827[var4];
                            if (class245.field3886) {
                                class8.field101 = true;
                            }
                            if (var317 < 0 || var317 > 2) {
                                var317 = 0;
                            }
                            class306.field4997 = var317;
                            continue;
                        }
                        if (var538 == 6017) {
                            var4--;
                            class352.field5610 = class182.field2827[var4] == 1;
                            class21.method131(-3393);
                            class292.method2064(true, class96.field1382);
                            class81.field1187 = false;
                            continue;
                        }
                        if (var538 == 6018) {
                            var4--;
                            int var318 = class182.field2827[var4];
                            if (var318 < 0) {
                                var318 = 0;
                            }
                            if (var318 > 127) {
                                var318 = 127;
                            }
                            class182.field2824 = var318;
                            class292.method2064(true, class96.field1382);
                            class81.field1187 = false;
                            continue;
                        }
                        if (var538 == 6019) {
                            var4--;
                            int var319 = class182.field2827[var4];
                            if (var319 < 0) {
                                var319 = 0;
                            }
                            if (var319 > 255) {
                                var319 = 255;
                            }
                            if (class315.field5201 != var319) {
                                if (class315.field5201 == 0 && class214.field3279 != -1) {
                                    class50.method373(false, 0, false, class310.field5042, var319, class214.field3279);
                                    class310.field5053 = false;
                                } else if (var319 == 0) {
                                    class25.method215(false);
                                    class310.field5053 = false;
                                } else {
                                    class52.method379(var319, 2);
                                }
                                class315.field5201 = var319;
                            }
                            class292.method2064(true, class96.field1382);
                            class81.field1187 = false;
                            continue;
                        }
                        if (var538 == 6020) {
                            var4--;
                            int var320 = class182.field2827[var4];
                            if (var320 < 0) {
                                var320 = 0;
                            }
                            if (var320 > 127) {
                                var320 = 127;
                            }
                            class58.field878 = var320;
                            class292.method2064(true, class96.field1382);
                            class81.field1187 = false;
                            continue;
                        }
                        if (var538 == 6021) {
                            var4--;
                            class2.field12 = class182.field2827[var4] == 1;
                            class49.method365(255);
                            continue;
                        }
                        if (var538 == 6023) {
                            var4--;
                            int var321 = class182.field2827[var4];
                            boolean var322 = false;
                            if (var321 < 0) {
                                var321 = 0;
                            }
                            if (var321 > 2) {
                                var321 = 2;
                            }
                            if (class6.field81 < 96) {
                                var322 = true;
                                var321 = 0;
                            }
                            class145.method1035(var321);
                            class292.method2064(true, class96.field1382);
                            class81.field1187 = false;
                            class182.field2827[var4++] = var322 ? 0 : 1;
                            continue;
                        }
                        if (var538 == 6024) {
                            var4--;
                            int var323 = class182.field2827[var4];
                            if (var323 < 0 || var323 > 2) {
                                var323 = 0;
                            }
                            class70.field1094 = var323;
                            class292.method2064(true, class96.field1382);
                            continue;
                        }
                        if (var538 == 6027) {
                            var4--;
                            int var324 = class182.field2827[var4];
                            if (!class245.field3886) {
                                continue;
                            }
                            if (var324 < 0 || var324 > 1) {
                                var324 = 0;
                            }
                            class91.method599(var324 == 1, -13678);
                            continue;
                        }
                        if (var538 == 6028) {
                            var4--;
                            class186.field2903 = class182.field2827[var4] != 0;
                            class292.method2064(true, class96.field1382);
                            continue;
                        }
                    } else if (var538 < 6200) {
                        if (var538 == 6101) {
                            class182.field2827[var4++] = class75.field1138;
                            continue;
                        }
                        if (var538 == 6102) {
                            class182.field2827[var4++] = class261.method1836(0) ? 1 : 0;
                            continue;
                        }
                        if (var538 == 6103) {
                            class182.field2827[var4++] = class153.field2486 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 6105) {
                            class182.field2827[var4++] = class118.field1725 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 6106) {
                            class182.field2827[var4++] = class115.field1680 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 6107) {
                            class182.field2827[var4++] = class295.field4905 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 6108) {
                            class182.field2827[var4++] = class178.field2777 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 6109) {
                            class182.field2827[var4++] = class121.field1814 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 6110) {
                            class182.field2827[var4++] = class142.field2279 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 6111) {
                            class182.field2827[var4++] = class162.field2580;
                            continue;
                        }
                        if (var538 == 6112) {
                            class182.field2827[var4++] = class322.field5287 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 6114) {
                            class182.field2827[var4++] = class347.field5557 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 6115) {
                            class182.field2827[var4++] = class96.field1398 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 6116) {
                            class182.field2827[var4++] = class306.field4997;
                            continue;
                        }
                        if (var538 == 6117) {
                            class182.field2827[var4++] = class352.field5610 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 6118) {
                            class182.field2827[var4++] = class182.field2824;
                            continue;
                        }
                        if (var538 == 6119) {
                            class182.field2827[var4++] = class315.field5201;
                            continue;
                        }
                        if (var538 == 6120) {
                            class182.field2827[var4++] = class58.field878;
                            continue;
                        }
                        if (var538 == 6121) {
                            if (class245.field3886) {
                                class182.field2827[var4++] = class245.field3858 ? 1 : 0;
                            } else {
                                class182.field2827[var4++] = 0;
                            }
                            continue;
                        }
                        if (var538 == 6123) {
                            class182.field2827[var4++] = class145.method1033();
                            continue;
                        }
                        if (var538 == 6124) {
                            class182.field2827[var4++] = class70.field1094;
                            continue;
                        }
                        if (var538 == 6126) {
                            if (class245.field3886) {
                                class182.field2827[var4++] = class309.method2159() ? 1 : 0;
                            } else {
                                class182.field2827[var4++] = 0;
                            }
                            continue;
                        }
                        if (var538 == 6127) {
                            class182.field2827[var4++] = class201.field3094 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 6128) {
                            class182.field2827[var4++] = class186.field2903 ? 1 : 0;
                            continue;
                        }
                    } else if (var538 < 6300) {
                        if (var538 == 6200) {
                            var4 -= 2;
                            class221.field3401 = (short) class182.field2827[var4];
                            if (class221.field3401 <= 0) {
                                class221.field3401 = 256;
                            }
                            class221.field3421 = (short) class182.field2827[var4 + 1];
                            if (class221.field3421 <= 0) {
                                class221.field3421 = 205;
                            }
                            continue;
                        }
                        if (var538 == 6201) {
                            var4 -= 2;
                            class37.field555 = (short) class182.field2827[var4];
                            if (class37.field555 <= 0) {
                                class37.field555 = 256;
                            }
                            class141.field2270 = (short) class182.field2827[var4 + 1];
                            if (class141.field2270 <= 0) {
                                class141.field2270 = 320;
                            }
                            continue;
                        }
                        if (var538 == 6202) {
                            var4 -= 4;
                            class49.field703 = (short) class182.field2827[var4];
                            if (class49.field703 <= 0) {
                                class49.field703 = 1;
                            }
                            class287.field4798 = (short) class182.field2827[var4 + 1];
                            if (class287.field4798 <= 0) {
                                class287.field4798 = 32767;
                            } else if (class49.field703 > class287.field4798) {
                                class287.field4798 = class49.field703;
                            }
                            class9.field114 = (short) class182.field2827[var4 + 2];
                            if (class9.field114 <= 0) {
                                class9.field114 = 1;
                            }
                            class295.field4902 = (short) class182.field2827[var4 + 3];
                            if (class295.field4902 <= 0) {
                                class295.field4902 = 32767;
                            } else if (class295.field4902 < class9.field114) {
                                class295.field4902 = class9.field114;
                            }
                            continue;
                        }
                        if (var538 == 6203) {
                            class26.method226(class41.field633.field4236, class41.field633.field4223, 0, false, 0, true);
                            class182.field2827[var4++] = class315.field5192;
                            class182.field2827[var4++] = class229.field3605;
                            continue;
                        }
                        if (var538 == 6204) {
                            class182.field2827[var4++] = class37.field555;
                            class182.field2827[var4++] = class141.field2270;
                            continue;
                        }
                        if (var538 == 6205) {
                            class182.field2827[var4++] = class221.field3401;
                            class182.field2827[var4++] = class221.field3421;
                            continue;
                        }
                    } else if (var538 < 6400) {
                        if (var538 == 6300) {
                            class182.field2827[var4++] = (int) (class19.method122(-12169) / 60000L);
                            continue;
                        }
                        if (var538 == 6301) {
                            class182.field2827[var4++] = (int) (class19.method122(-12169) / 86400000L) - 11745;
                            continue;
                        }
                        if (var538 == 6302) {
                            var4 -= 3;
                            int var290 = class182.field2827[var4 + 1];
                            int var291 = class182.field2827[var4];
                            int var292 = class182.field2827[var4 + 2];
                            class292.field4839.clear();
                            class292.field4839.set(11, 12);
                            class292.field4839.set(var292, var290, var291);
                            class182.field2827[var4++] = (int) (class292.field4839.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var538 == 6303) {
                            class292.field4839.clear();
                            class292.field4839.setTime(new Date(class19.method122(-12169)));
                            class182.field2827[var4++] = class292.field4839.get(1);
                            continue;
                        }
                        if (var538 == 6304) {
                            boolean var293 = true;
                            var4--;
                            int var294 = class182.field2827[var4];
                            if (var294 < 0) {
                                var293 = ((var294 + 1) % 4) == 0;
                            } else if (var294 < 1582) {
                                var293 = (var294 % 4) == 0;
                            } else if (var294 % 4 != 0) {
                                var293 = false;
                            } else if ((var294 % 100) != 0) {
                                var293 = true;
                            } else if (var294 % 400 != 0) {
                                var293 = false;
                            }
                            class182.field2827[var4++] = var293 ? 1 : 0;
                            continue;
                        }
                    } else if (var538 < 6500) {
                        if (var538 == 6405) {
                            class182.field2827[var4++] = class21.method129((byte) -92) ? 1 : 0;
                            continue;
                        }
                        if (var538 == 6406) {
                            class182.field2827[var4++] = class28.method240((byte) 29) ? 1 : 0;
                            continue;
                        }
                    } else if (var538 < 6600) {
                        if (var538 == 6500) {
                            if (class346.field5553 == 10 && class221.field3424 == 0 && class291.field4825 == 0 && class55.field843 == 0) {
                                class182.field2827[var4++] = class90.method597(0) == -1 ? 0 : 1;
                                continue;
                            }
                            class182.field2827[var4++] = 1;
                            continue;
                        }
                        if (var538 == 6501) {
                            class201 var303 = class50.method372(true);
                            if (var303 == null) {
                                class182.field2827[var4++] = -1;
                                class182.field2827[var4++] = 0;
                                class267.field4402[var5++] = "";
                                class182.field2827[var4++] = 0;
                                class267.field4402[var5++] = "";
                                class182.field2827[var4++] = 0;
                            } else {
                                class182.field2827[var4++] = var303.field3097;
                                class182.field2827[var4++] = var303.field3147;
                                class267.field4402[var5++] = var303.field3092;
                                class307 var304 = var303.method1376((byte) 120);
                                class182.field2827[var4++] = var304.field5003;
                                class267.field4402[var5++] = var304.field5004;
                                class182.field2827[var4++] = var303.field3151;
                            }
                            continue;
                        }
                        if (var538 == 6502) {
                            class201 var305 = class315.method2262(112);
                            if (var305 == null) {
                                class182.field2827[var4++] = -1;
                                class182.field2827[var4++] = 0;
                                class267.field4402[var5++] = "";
                                class182.field2827[var4++] = 0;
                                class267.field4402[var5++] = "";
                                class182.field2827[var4++] = 0;
                            } else {
                                class182.field2827[var4++] = var305.field3097;
                                class182.field2827[var4++] = var305.field3147;
                                class267.field4402[var5++] = var305.field3092;
                                class307 var306 = var305.method1376((byte) 120);
                                class182.field2827[var4++] = var306.field5003;
                                class267.field4402[var5++] = var306.field5004;
                                class182.field2827[var4++] = var305.field3151;
                            }
                            continue;
                        }
                        if (var538 == 6503) {
                            var4--;
                            int var307 = class182.field2827[var4];
                            if (class346.field5553 == 10 && class221.field3424 == 0 && class291.field4825 == 0 && class55.field843 == 0) {
                                class182.field2827[var4++] = class180.method1256(40000, var307) ? 1 : 0;
                                continue;
                            }
                            class182.field2827[var4++] = 0;
                            continue;
                        }
                        if (var538 == 6504) {
                            var4--;
                            class299.field4941 = class182.field2827[var4];
                            class292.method2064(true, class96.field1382);
                            continue;
                        }
                        if (var538 == 6505) {
                            class182.field2827[var4++] = class299.field4941;
                            continue;
                        }
                        if (var538 == 6506) {
                            var4--;
                            int var308 = class182.field2827[var4];
                            class201 var309 = class161.method1138(var308, 2);
                            if (var309 == null) {
                                class182.field2827[var4++] = -1;
                                class267.field4402[var5++] = "";
                                class182.field2827[var4++] = 0;
                                class267.field4402[var5++] = "";
                                class182.field2827[var4++] = 0;
                            } else {
                                class182.field2827[var4++] = var309.field3147;
                                class267.field4402[var5++] = var309.field3092;
                                class307 var310 = var309.method1376((byte) 120);
                                class182.field2827[var4++] = var310.field5003;
                                class267.field4402[var5++] = var310.field5004;
                                class182.field2827[var4++] = var309.field3151;
                            }
                            continue;
                        }
                        if (var538 == 6507) {
                            var4 -= 4;
                            int var311 = class182.field2827[var4];
                            boolean var312 = class182.field2827[var4 + 1] == 1;
                            int var313 = class182.field2827[var4 + 2];
                            boolean var314 = class182.field2827[var4 + 3] == 1;
                            class143.method1012(var313, var312, var314, var311, -1);
                            continue;
                        }
                    } else if (var538 < 6700) {
                        if (var538 == 6600) {
                            var4--;
                            class307.field5005 = class182.field2827[var4] == 1;
                            class292.method2064(true, class96.field1382);
                            continue;
                        }
                        if (var538 == 6601) {
                            class182.field2827[var4++] = class307.field5005 ? 1 : 0;
                            continue;
                        }
                    } else if (var538 < 6900) {
                        if (var538 == 6800) {
                            var4--;
                            int var295 = class182.field2827[var4];
                            class312 var296 = class165.method1150(var295, (byte) -113);
                            if (var296.field5104 == null) {
                                class267.field4402[var5++] = "";
                            } else {
                                class267.field4402[var5++] = var296.field5104;
                            }
                            continue;
                        }
                        if (var538 == 6801) {
                            var4--;
                            int var297 = class182.field2827[var4];
                            class312 var298 = class165.method1150(var297, (byte) 82);
                            class182.field2827[var4++] = var298.field5080;
                            continue;
                        }
                        if (var538 == 6802) {
                            var4--;
                            int var299 = class182.field2827[var4];
                            class312 var300 = class165.method1150(var299, (byte) -47);
                            class182.field2827[var4++] = var300.field5073;
                            continue;
                        }
                        if (var538 == 6803) {
                            var4--;
                            int var301 = class182.field2827[var4];
                            class312 var302 = class165.method1150(var301, (byte) 109);
                            class182.field2827[var4++] = var302.field5095;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var537) {
            if (arg1.field4603 == null) {
                if (class290.field4818 != 0) {
                    class147.method1047(false, "Clientscript error - check log for details", "", 0);
                }
                class326.method2328(var537, "CS2 - scr:" + arg1.field2549 + " op:" + var8, true);
            } else {
                StringBuffer var534 = new StringBuffer(30);
                var534.append("%0a - in: ").append(arg1.field4603);
                for (int var535 = class60.field917 - 1; var535 >= 0; var535--) {
                    var534.append("%0a - via: ").append(class183.field2853[var535].field4599.field4603);
                }
                if (var8 == 40) {
                    int var536 = var9[var6];
                    var534.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var536));
                }
                if (class290.field4818 != 0) {
                    class147.method1047(false, "Clientscript error in: " + arg1.field4603, "", 0);
                }
                class326.method2328(var537, "CS2 - scr:" + arg1.field2549 + " op:" + var8 + var534.toString(), true);
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(B)V", line = 7018)
    public static void method1880(byte arg0) {
        field4377 = null;
        if (arg0 <= 16) {
            method1879(-69, (class280) null, 63);
        }
        field4369 = null;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)I", line = 7030)
    public static final int method1881(int arg0, byte arg1) {
        if (arg1 != 41) {
            method1876(-121, (class313) null);
        }
        field4370++;
        return arg0 & 0x7F;
    }
}
