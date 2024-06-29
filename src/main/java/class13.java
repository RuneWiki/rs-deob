import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class13 extends class182 {

    @OriginalMember(owner = "client!vca", name = "j", descriptor = "[Z")
    public static boolean[] field166 = new boolean[100];

    @OriginalMember(owner = "client!vca", name = "g", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!vca", name = "i", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!vca", name = "k", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!vca", name = "l", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!vca", name = "m", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!vca", name = "n", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!vca", name = "o", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!vca", name = "p", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!vca", name = "h", descriptor = "Lga;")
    public static class332 field164;

    @OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lag;)V")
    public class13(class469 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(B)Z")
    public final boolean method77(byte arg0) {
        if (arg0 != -96) {
            field164 = null;
        }
        ++field167;
        return true;
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(I)[Lwn;")
    public static final class232[] method78(int arg0) {
        if (class28.field408 == null) {
            class232[] var1 = class121.method714((byte) -83, class312.field4206);
            class232[] var2 = new class232[var1.length];
            int var3 = 0;
            int var4 = class602.field8408.method3561(false, class618.field8566);
            label73: for (int var5 = 0; var1.length > var5; ++var5) {
                class232 var9 = var1[var5];
                if ((~var9.field3097 >= -1 || var9.field3097 >= 24) && var9.field3101 >= 800 && ~var9.field3099 <= -601 && (~var4 != -3 || var9.field3101 <= 800 && var9.field3099 <= 600) && (~var4 != -2 || ~var9.field3101 >= -1025 && ~var9.field3099 >= -769)) {
                    for (int var10 = 0; ~var3 < ~var10; ++var10) {
                        class232 var11 = var2[var10];
                        if (var9.field3101 == var11.field3101 && var9.field3099 == var11.field3099) {
                            if (~var11.field3097 > ~var9.field3097) {
                                var2[var10] = var9;
                            }
                            continue label73;
                        }
                    }
                    var2[var3] = var9;
                    ++var3;
                }
            }
            class28.field408 = new class232[var3];
            class2.method7(var2, 0, class28.field408, 0, var3);
            int[] var6 = new int[class28.field408.length];
            for (int var7 = 0; var7 < class28.field408.length; ++var7) {
                class232 var8 = class28.field408[var7];
                var6[var7] = var8.field3101 * var8.field3099;
            }
            class45.method240(class28.field408, 497, var6);
        }
        ++field163;
        if (arg0 != 0) {
            method78(-68);
        }
        return class28.field408;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(ZI)V")
    public final void method79(boolean arg0, int arg1) {
        if (arg1 >= -21) {
            method85((byte) 109);
        }
        ++field172;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(II)V")
    public static final void method80(int arg0, int arg1) {
        if (arg1 != 16163) {
            method80(-111, -13);
        }
        ++field170;
        class256 var2 = class592.method3279((byte) -21, 14, arg0);
        var2.method1546((byte) 122);
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(III)V")
    public final void method81(int arg0, int arg1, int arg2) {
        if (arg0 != 2) {
            method78(-8);
        }
        ++field165;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)V")
    public final void method82(int arg0) {
        ++field168;
        if (arg0 != 26813) {
            field166 = null;
        }
        super.field2540.method2685(arg0 ^ 26018, false);
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(ILvfa;B)V")
    public final void method83(int arg0, class262 arg1, byte arg2) {
        super.field2540.method2627(65, arg1);
        if (arg2 >= 87) {
            ++field171;
            super.field2540.method2650((byte) -93, arg0);
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(ZZ)V")
    public final void method84(boolean arg0, boolean arg1) {
        super.field2540.method2685(3359, arg0);
        ++field169;
    }

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "(B)V")
    public static void method85(byte arg0) {
        if (arg0 <= 39) {
            field166 = null;
        }
        field166 = null;
        field164 = null;
    }
}
