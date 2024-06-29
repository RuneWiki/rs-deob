import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class7 extends class185 {

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "I")
    public static int field107 = 3;

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "[Z")
    public static boolean[] field105 = new boolean[100];

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "Ljava/lang/String;")
    public static String field113 = "flash2:";

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "[Ljava/lang/String;")
    public static String[] field114 = new String[200];

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "Lpf;")
    public static class294 field109;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)Ldk;")
    public static final class283 method35(int arg0, int arg1) {
        class283 var2 = (class283) class177.field2720.method122((long) arg1, (byte) 109);
        ++field111;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class176.field2697.method1973(1, arg1, 0);
            if (var3 == null) {
                return null;
            } else {
                class283 var4 = new class283();
                class248 var5 = new class248(var3);
                var5.field3748 = var5.field3723.length - 2;
                int var6 = var5.method1575(false);
                int var7 = var5.field3723.length + -14 + -var6;
                var5.field3748 = var7;
                int var8 = var5.method1576(-17672);
                var4.field4228 = var5.method1575(false);
                var4.field4242 = var5.method1575(false);
                var4.field4230 = var5.method1575(false);
                var4.field4234 = var5.method1575(false);
                int var9 = var5.method1593((byte) 27);
                if (var9 > 0) {
                    var4.field4227 = new class253[var9];
                    for (int var10 = 0; ~var9 < ~var10; ++var10) {
                        int var11 = var5.method1575(false);
                        class253 var12 = new class253(class214.method1368(-121, var11));
                        var4.field4227[var10] = var12;
                        while (var11-- > 0) {
                            int var13 = var5.method1576(-17672);
                            int var14 = var5.method1576(-17672);
                            var12.method1663((long) var13, new class251(var14), -125);
                        }
                    }
                }
                var5.field3748 = 0;
                int var15 = 0;
                var4.field4225 = var5.method1596(-1);
                var4.field4229 = new int[var8];
                var4.field4241 = new String[var8];
                var4.field4238 = new int[var8];
                while (~var5.field3748 > ~var7) {
                    int var16 = var5.method1575(false);
                    if (~var16 == -4) {
                        var4.field4241[var15] = var5.method1597((byte) -74).intern();
                    } else if (var16 < 100 && var16 != 21 && ~var16 != -39 && ~var16 != -40) {
                        var4.field4238[var15] = var5.method1576(-17672);
                    } else {
                        var4.field4238[var15] = var5.method1593((byte) 27);
                    }
                    var4.field4229[var15++] = var16;
                }
                if (arg0 <= 77) {
                    method37((byte) -66);
                }
                class177.field2720.method119((long) arg1, var4, 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
    public class7() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(II)Ljava/lang/String;")
    public static final String method36(int arg0, int arg1) {
        ++field106;
        if (arg1 <= 29) {
            field105 = null;
        }
        if (~arg0 > -100001) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else {
            return ~arg0 > -10000001 ? "<col=ffffff>" + arg0 / 1000 + class203.field3061 + "</col>" : "<col=00ff80>" + arg0 / 1000000 + class214.field3204 + "</col>";
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        if (arg1 < 70) {
            field113 = null;
        }
        int[] var3 = super.field2804.method561(arg0, -2);
        if (super.field2804.field1384) {
            class193.method1212(var3, 0, class174.field2648, class85.field1356[arg0]);
        }
        ++field108;
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(B)V")
    public static void method37(byte arg0) {
        if (arg0 < -82) {
            field105 = null;
            field113 = null;
            field109 = null;
            field114 = null;
        }
    }
}
