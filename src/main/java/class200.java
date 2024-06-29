import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class200 extends class310 {

    @OriginalMember(owner = "client!nm", name = "O", descriptor = "I")
    private int field3185 = 1;

    @OriginalMember(owner = "client!nm", name = "N", descriptor = "I")
    private int field3184 = 1;

    @OriginalMember(owner = "client!nm", name = "S", descriptor = "I")
    private int field3189 = 204;

    @OriginalMember(owner = "client!nm", name = "W", descriptor = "[Ljava/lang/String;")
    public static String[] field3193 = new String[500];

    @OriginalMember(owner = "client!nm", name = "L", descriptor = "I")
    public static int field3182 = 0;

    @OriginalMember(owner = "client!nm", name = "K", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!nm", name = "M", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!nm", name = "P", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!nm", name = "Q", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!nm", name = "R", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!nm", name = "U", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!nm", name = "V", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!nm", name = "X", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!nm", name = "Y", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!nm", name = "T", descriptor = "Z")
    public static boolean field3190;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZIILjava/lang/String;)I", line = 6)
    public static final int method1536(boolean arg0, int arg1, int arg2, String arg3) {
        int var4 = -3 / ((arg2 - 58) / 45);
        field3186++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var5 = false;
        boolean var6 = false;
        int var7 = arg3.length();
        int var8 = 0;
        for (int var9 = 0; var9 < var7; var9++) {
            char var10 = arg3.charAt(var9);
            if (var9 == 0) {
                if (var10 == '-') {
                    var5 = true;
                    continue;
                }
                if (var10 == '+' && arg0) {
                    continue;
                }
            }
            int var12;
            if (var10 >= '0' && var10 <= '9') {
                var12 = var10 - '0';
            } else if (var10 >= 'A' && var10 <= 'Z') {
                var12 = var10 - '7';
            } else if (var10 >= 'a' && var10 <= 'z') {
                var12 = var10 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg1 <= var12) {
                throw new NumberFormatException();
            }
            if (var5) {
                var12 = -var12;
            }
            int var11 = arg1 * var8 + var12;
            if ((var11 / arg1) != var8) {
                throw new NumberFormatException();
            }
            var8 = var11;
            var6 = true;
        }
        if (!var6) {
            throw new NumberFormatException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lqm;II)V", line = 98)
    public final void method75(class227 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field3185 = arg0.method1720((byte) -101);
        } else if (arg2 == 1) {
            this.field3184 = arg0.method1720((byte) -57);
        } else if (arg2 == 2) {
            this.field3189 = arg0.method1765(true);
        }
        if (arg1 != -2470) {
            method1537(false, -7);
        }
        field3188++;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)[I", line = 136)
    public final int[] method77(int arg0, int arg1) {
        field3195++;
        int[] var3 = this.field4950.method930(arg0, arg1 ^ arg1);
        if (this.field4950.field2001) {
            for (int var4 = 0; var4 < class261.field4405; var4++) {
                int var5 = class230.field3818[arg0];
                int var6 = class293.field4737[var4];
                int var7 = var5 % (4096 / this.field3184) * this.field3184;
                int var8 = this.field3185 * var6 >> 12;
                int var9 = var6 % (4096 / this.field3185) * this.field3185;
                int var10 = this.field3184 * var5 >> 12;
                if (var7 < this.field3189) {
                    for (var8 -= var10; var8 < 0; var8 += 4) {
                    }
                    while (var8 > 3) {
                        var8 -= 4;
                    }
                    if (var8 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var9 < this.field3189) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field3189) {
                    int var11;
                    for (var11 = var8 - var10; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V", line = 319)
    public class200() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZI)V", line = 223)
    public static final void method1537(boolean arg0, int arg1) {
        field3194++;
        byte var2;
        byte[][] var3;
        if (class42.field607 && arg0) {
            var2 = 1;
            var3 = class352.field5584;
        } else {
            var3 = class16.field190;
            var2 = 4;
        }
        if (arg1 != -614332968) {
            method1539(-126);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class195.method1506(false);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class267.field4476[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x34F3499) >> 24;
                        if (!arg0 || var8 == 0) {
                            int var9 = (var7 & 0x7) >> 1;
                            int var10 = (var7 & 0x3FFF) >> 3;
                            int var11 = (var7 & 0xFFDF66) >> 14;
                            int var12 = (var11 / 8 << 8) + var10 / 8;
                            for (int var13 = 0; var13 < class121.field2079.length; var13++) {
                                if (class121.field2079[var13] == var12 && var3[var13] != null) {
                                    class75.method625((var11 & 0x7) * 8, arg0, (var10 & 0x7) * 8, var3[var13], class32.field459, var9, var6 * 8, (byte) -77, var4, var8, var5 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "(B)V", line = 309)
    public static void method1538(byte arg0) {
        if (arg0 >= -118) {
            field3182 = -86;
        }
        field3193 = null;
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(I)V", line = 329)
    public static final void method1539(int arg0) {
        if (arg0 == -13412) {
            class230.field3816.method2326(-4);
            field3181++;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lth;IIB)Lsi;", line = 340)
    public static final class351 method1540(class57 arg0, int arg1, int arg2, byte arg3) {
        field3187++;
        if (arg3 != -13) {
            field3191 = -78;
        }
        return class315.method2233(arg2, (byte) 111, arg0, arg1) ? class272.method2039((byte) 70) : null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BI)V", line = 355)
    public static final void method1541(byte arg0, int arg1) {
        class292.field4724.method2334(4, arg1);
        if (arg0 == 29) {
            field3192++;
            class291.field4704.method2334(arg0 ^ 0x19, arg1);
        }
    }
}
