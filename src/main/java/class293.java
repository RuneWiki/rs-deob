import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class293 extends class42 {

    @OriginalMember(owner = "client!uw", name = "r", descriptor = "I")
    public int field4356;

    @OriginalMember(owner = "client!uw", name = "B", descriptor = "I")
    public int field4366;

    @OriginalMember(owner = "client!uw", name = "q", descriptor = "[I")
    public static int[] field4355 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!uw", name = "o", descriptor = "Lgw;")
    public static class118 field4353 = new class118();

    @OriginalMember(owner = "client!uw", name = "y", descriptor = "[F")
    public static float[] field4363 = new float[16384];

    @OriginalMember(owner = "client!uw", name = "D", descriptor = "[F")
    public static float[] field4368 = new float[16384];

    @OriginalMember(owner = "client!uw", name = "E", descriptor = "Lge;")
    public static class511 field4369;

    @OriginalMember(owner = "client!uw", name = "p", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!uw", name = "s", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!uw", name = "t", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!uw", name = "u", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!uw", name = "v", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!uw", name = "w", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!uw", name = "x", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!uw", name = "z", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!uw", name = "A", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!uw", name = "C", descriptor = "I")
    public static int field4367;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4363[var2] = (float) Math.sin((double) var2 * var0);
            field4368[var2] = (float) Math.cos((double) var2 * var0);
        }
        new class44(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
        field4369 = new class511(8);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(B)V", line = 8)
    public static void method1884(byte arg0) {
        field4355 = null;
        if (arg0 != 15) {
            field4353 = null;
        }
        field4368 = null;
        field4363 = null;
        field4353 = null;
        field4369 = null;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(II)Z", line = 23)
    public final boolean method1885(int arg0, int arg1) {
        field4367++;
        if (arg1 != -44) {
            this.method1892(-112);
        }
        return (this.field4366 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(BZILjava/lang/String;)Z", line = 35)
    public static final boolean method1886(byte arg0, boolean arg1, int arg2, String arg3) {
        field4359++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg3.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg2 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if ((var10 / arg2) != var6) {
                return false;
            }
            var5 = true;
            var6 = var10;
        }
        if (arg0 != -123) {
            field4353 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)I", line = 111)
    public final int method1887(int arg0) {
        field4362++;
        if (arg0 > -91) {
            field4353 = null;
        }
        return class265.method1709(127, this.field4366);
    }

    @OriginalMember(owner = "client!uw", name = "d", descriptor = "(B)Z", line = 131)
    public final boolean method1888(byte arg0) {
        if (arg0 > -106) {
            return true;
        } else {
            field4358++;
            return (this.field4366 >> 21 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(I)Z", line = 142)
    public final boolean method1889(int arg0) {
        field4361++;
        if (arg0 >= -98) {
            return false;
        } else {
            return (this.field4366 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!uw", name = "e", descriptor = "(B)I", line = 153)
    public final int method1890(byte arg0) {
        field4365++;
        return arg0 == 61 ? this.field4366 >> 18 & 0x7 : 88;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILtf;II)V", line = 169)
    public static final void method1891(int arg0, class198 arg1, int arg2, int arg3) {
        class511.field7426 = arg0;
        class491.field7073 = arg3;
        field4360++;
        class212.field3192 = arg1;
        if (arg2 <= 124) {
            field4355 = null;
        }
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(II)V", line = 185)
    public class293(int arg0, int arg1) {
        this.field4356 = arg1;
        this.field4366 = arg0;
    }

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "(I)Z", line = 196)
    public final boolean method1892(int arg0) {
        if (arg0 != -25079) {
            this.field4366 = -46;
        }
        field4357++;
        return (this.field4366 >> 22 & 0x1) != 0;
    }
}
