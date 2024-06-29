import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class219 {

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "Z")
    public boolean field3355 = false;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field3350 = 0;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field3353 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "[I")
    public static int[] field3351 = new int[2048];

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public int field3349;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public int field3354;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZII)Lhk;", line = 9)
    public final class42 method1558(boolean arg0, int arg1, int arg2) {
        field3345++;
        class42 var4 = (class42) class129.field1969.method747((long) (this.field3349 | arg2 << 16 | (arg0 ? 262144 : 0)), (byte) 100);
        if (var4 != null) {
            return var4;
        }
        class56.field732.method707(this.field3349, (byte) 85);
        class42 var5 = class281.method1946(class56.field732, 0, this.field3349, -114);
        if (arg1 != -16287) {
            method1562((byte) -89, 16, -76, -21, (class270) null);
        }
        if (var5 != null) {
            var5.method323(class238.field3620, class206.field3161, class328.field5057);
            var5.field5052 = var5.field5047;
            var5.field5051 = var5.field5049;
            if (arg0) {
                var5.method320();
            }
            for (int var6 = 0; var6 < arg2; var6++) {
                var5.method319();
            }
            class129.field1969.method744(var5, -15692, (long) ((arg0 ? 262144 : 0) | arg2 << 16 | this.field3349));
        }
        return var5;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IILwm;)V", line = 51)
    public final void method1559(int arg0, int arg1, class254 arg2) {
        if (arg0 <= 32) {
            field3350 = 37;
        }
        while (true) {
            int var4 = arg2.method1774((byte) 72);
            if (var4 == 0) {
                field3346++;
                return;
            }
            this.method1561(var4, arg2, arg1, 2983);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/lang/String;BZ)V", line = 72)
    public static final void method1560(String arg0, byte arg1, boolean arg2) {
        String var3 = arg0.toLowerCase();
        field3347++;
        int var4 = 0;
        short[] var5 = new short[16];
        int var6 = arg2 ? 32768 : 0;
        int var7 = var6 + (arg2 ? class109.field1650 : class121.field1859);
        for (int var8 = var6; var8 < var7; var8++) {
            class223 var9 = class181.method1354(var8, 118);
            if (var9.field3393 && var9.method1583((byte) 10).toLowerCase().indexOf(var3) != -1) {
                if (var4 >= 50) {
                    class23.field257 = null;
                    class191.field2985 = -1;
                    return;
                }
                if (var4 >= var5.length) {
                    short[] var10 = new short[var5.length * 2];
                    for (int var11 = 0; var11 < var4; var11++) {
                        var10[var11] = var5[var11];
                    }
                    var5 = var10;
                }
                var5[var4++] = (short) var8;
            }
        }
        class191.field2985 = var4;
        class23.field257 = var5;
        class43.field622 = 0;
        int var12 = -55 / ((53 - arg1) / 46);
        String[] var13 = new String[class191.field2985];
        for (int var14 = 0; var14 < class191.field2985; var14++) {
            var13[var14] = class181.method1354(var5[var14], 23).method1583((byte) 10);
        }
        class325.method2256(0, class23.field257, var13);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILwm;II)V", line = 148)
    private final void method1561(int arg0, class254 arg1, int arg2, int arg3) {
        field3344++;
        if (arg0 == 1) {
            this.field3349 = arg1.method1755(false);
        } else if (arg0 == 2) {
            this.field3354 = arg1.method1758((byte) 65);
        } else if (arg0 == 3) {
            this.field3355 = true;
        } else if (arg0 == 4) {
            this.field3349 = -1;
        }
        if (arg3 != 2983) {
            this.method1561(-19, (class254) null, -43, -75);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BIIILth;)V", line = 176)
    public static final void method1562(byte arg0, int arg1, int arg2, int arg3, class270 arg4) {
        field3356++;
        if (arg0 >= -60 || class39.field575 == arg4 || class32.field393 >= 400) {
            return;
        }
        String var5;
        if (arg4.field4221 == 0) {
            boolean var6 = true;
            if (class39.field575.field4198 != -1 && arg4.field4198 != -1) {
                int var7 = arg4.field4203 < class39.field575.field4203 ? class39.field575.field4203 : arg4.field4203;
                int var8 = class39.field575.field4198 >= arg4.field4198 ? arg4.field4198 : class39.field575.field4198;
                int var9 = var7 * 10 / 100 + var8 + 5;
                int var10 = class39.field575.field4203 - arg4.field4203;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var10 > var9) {
                    var6 = false;
                }
            }
            String var11 = class248.field3754 == 1 ? class260.field4002 : class63.field835;
            if (arg4.field4204 > arg4.field4203) {
                var5 = arg4.method1895(1958408711) + (var6 ? class8.method83(class39.field575.field4203, arg4.field4203, (byte) -44) : "<col=ffffff>") + " (" + var11 + arg4.field4203 + "+" + (arg4.field4204 - arg4.field4203) + ")";
            } else {
                var5 = arg4.method1895(1958408711) + (var6 ? class8.method83(class39.field575.field4203, arg4.field4203, (byte) -44) : "<col=ffffff>") + " (" + var11 + arg4.field4203 + ")";
            }
        } else {
            var5 = arg4.method1895(1958408711) + " (" + class214.field3296 + arg4.field4221 + ")";
        }
        if (class320.field4939 == 1) {
            class202.method1463((short) 38, arg1, (long) arg2, class314.field4864, arg3, -122, class170.field2757 + " -> <col=ffffff>" + var5, class201.field3092);
            class202.field3109++;
        } else if (!class7.field110) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class131.field2010[var12] != null) {
                    boolean var13 = false;
                    class180.field2862++;
                    short var14 = 0;
                    if (class248.field3754 == 0 && class131.field2010[var12].equalsIgnoreCase(class293.field4521)) {
                        if (class39.field575.field4203 < arg4.field4203) {
                            var14 = 2000;
                        }
                        if (class39.field575.field4193 != 0 && arg4.field4193 != 0) {
                            if (class39.field575.field4193 == arg4.field4193) {
                                var14 = 2000;
                            } else {
                                var14 = 0;
                            }
                        }
                    } else if (class206.field3159[var12]) {
                        var14 = 2000;
                    }
                    short var15 = class111.field1682[var12];
                    short var16 = (short) (var14 + var15);
                    class202.method1463(var16, arg1, (long) arg2, class31.field380[var12], arg3, -110, "<col=ffffff>" + var5, class131.field2010[var12]);
                }
            }
        } else if ((class201.field3098 & 0x8) != 0) {
            class202.method1463((short) 32, arg1, (long) arg2, class242.field3685, arg3, -70, class267.field4153 + " -> <col=ffffff>" + var5, class60.field794);
            class77.field1121++;
        }
        for (int var17 = 0; var17 < class32.field393; var17++) {
            if (class118.field1843[var17] == 6) {
                class311.field4832[var17] = "<col=ffffff>" + var5;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V", line = 311)
    public static void method1563(boolean arg0) {
        if (!arg0) {
            method1562((byte) -104, -106, -25, -127, (class270) null);
        }
        field3351 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)Lhd;", line = 324)
    public static final class341 method1564(int arg0, int arg1, int arg2) {
        class79 var3 = class213.field3262[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class341 var4 = var3.field1179;
            var3.field1179 = null;
            return var4;
        }
    }
}
