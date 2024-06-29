import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class290 extends class594 {

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "[I")
    public int[] field4259;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "[I")
    public int[] field4258;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "Lqp;")
    public static class586 field4261 = new class586(89, -2);

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "S")
    public static short field4262 = 320;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)V")
    public static final void method1795(boolean arg0) {
        field4263++;
        int var1 = class2.field12 * 128 + 64;
        int var2 = class111.field1408 * 128 + 64;
        int var3 = class226.method1477(class355.field5157, true, var1, var2) - class553.field8227;
        if (class361.field5222 >= 100) {
            class367.field5319 = class111.field1408 * 128 + 64;
            class358.field5200 = class2.field12 * 128 + 64;
            class111.field1412 = class226.method1477(class355.field5157, true, class358.field5200, class367.field5319) - class553.field8227;
        } else {
            if (class358.field5200 < var1) {
                class358.field5200 += (var1 - class358.field5200) * class361.field5222 / 1000 + class383.field5590;
                if (var1 < class358.field5200) {
                    class358.field5200 = var1;
                }
            }
            if (class111.field1412 < var3) {
                class111.field1412 += (var3 - class111.field1412) * class361.field5222 / 1000 + class383.field5590;
                if (var3 < class111.field1412) {
                    class111.field1412 = var3;
                }
            }
            if (class358.field5200 > var1) {
                class358.field5200 -= class383.field5590 + ((class358.field5200 - var1) * class361.field5222 / 1000);
                if (class358.field5200 < var1) {
                    class358.field5200 = var1;
                }
            }
            if (class367.field5319 < var2) {
                class367.field5319 += class383.field5590 + ((var2 - class367.field5319) * class361.field5222 / 1000);
                if (var2 < class367.field5319) {
                    class367.field5319 = var2;
                }
            }
            if (var3 < class111.field1412) {
                class111.field1412 -= (class111.field1412 - var3) * class361.field5222 / 1000 + class383.field5590;
                if (class111.field1412 < var3) {
                    class111.field1412 = var3;
                }
            }
            if (class367.field5319 > var2) {
                class367.field5319 -= class383.field5590 + ((class367.field5319 - var2) * class361.field5222 / 1000);
                if (var2 > class367.field5319) {
                    class367.field5319 = var2;
                }
            }
        }
        int var4 = class32.field343 * 128 + 64;
        int var5 = class529.field7853 * 128 + 64;
        int var6 = class226.method1477(class355.field5157, arg0, var4, var5) - class133.field1770;
        int var7 = var4 - class358.field5200;
        int var8 = var6 - class111.field1412;
        int var9 = var5 - class367.field5319;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class151.field1935) {
            class151.field1935 += (var11 - class151.field1935 >> 3) * class402.field5767 / 1000 + class261.field3842 << 3;
            if (var11 < class151.field1935) {
                class151.field1935 = var11;
            }
        }
        if (var11 < class151.field1935) {
            class151.field1935 -= (class151.field1935 - var11 >> 3) * class402.field5767 / 1000 + class261.field3842 << 3;
            if (var11 > class151.field1935) {
                class151.field1935 = var11;
            }
        }
        int var13 = var12 - class543.field8120;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class543.field8120 += class261.field3842 + (class402.field5767 * var14 / 1000) << 3;
            class543.field8120 &= 0x3FFF;
        }
        if (var14 < 0) {
            class543.field8120 -= class261.field3842 + (-var14 * class402.field5767 / 1000) << 3;
            class543.field8120 &= 0x3FFF;
        }
        int var15 = var12 - class543.field8120;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        class495.field7464 = 0;
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class543.field8120 = var12;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIILwca;)V")
    public static final void method1796(int arg0, int arg1, int arg2, class311 arg3) {
        field4260++;
        if (arg1 != -30238) {
            return;
        }
        class594 var4 = arg3.method1920(class379.field5558, 0);
        if (var4 == null) {
            return;
        }
        class379.field5558.method1022(arg0, arg2, arg0 + arg3.field4543, arg3.field4620 + arg2);
        if (class529.field7847 < 3) {
            class542.field8106.method709((float) arg3.field4543 / 2.0F + (float) arg0, (float) arg3.field4620 / 2.0F + (float) arg2, 4096, ((int) (-class591.field8752) & 0x3FFF) << 2, var4, arg0, arg2);
        } else {
            class379.field5558.method956(-16777216, var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
    public static void method1797(byte arg0) {
        field4261 = null;
        if (arg0 >= -15) {
            field4262 = 1;
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(II[I[I)V")
    public class290(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field4259 = arg3;
        this.field4258 = arg2;
    }
}
