import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class283 extends InputStream {

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field4214 = 0;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "[Z")
    public static boolean[] field4212 = new boolean[100];

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "F")
    public static float field4216;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "[[Ltf;")
    public static class198[][] field4217;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZLba;Ljava/lang/String;I)V")
    public static final void method1825(boolean arg0, class269 arg1, String arg2, int arg3) {
        field4211++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class218.field3334.method869(null, -82, 250, arg2);
        int var8 = class218.field3334.method874(76, null, 250, arg2) * 13;
        class76.field1256.method215(var5 - var4, var6 - var4, var4 + var4 + var7, var4 + var8 + var4, -16777216, 0);
        int var9 = 76 % ((-arg3 - 42) / 37);
        class76.field1256.method327(var5 - var4, -var4 + var6, var4 + var7 + var4, var8 - -var4 + var4, -1, 0);
        arg1.method1742(0, -1, var5, 1, var6, 0, 0, var8, null, -1, null, var7, 0, 1, arg2, null);
        class251.method1626(var5 - var4, var4 + var7 + var4, 0, var8 + var4 + var4, -var4 + var6);
        if (arg0) {
            class76.field1256.method280();
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static void method1826(int arg0) {
        if (arg0 <= -90) {
            field4212 = null;
            field4217 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lqa;Lau;Lrg;B)V")
    public static final void method1827(class167 arg0, class528 arg1, class463 arg2, byte arg3) {
        field4215++;
        class343 var4 = arg2.method2748(arg0, -10795);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method378();
        if (var4.method367() > var5) {
            var5 = var4.method367();
        }
        byte var6 = 10;
        int var7 = arg1.field7717;
        int var8 = arg1.field7720;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg2.field6700 != null) {
            var9 = class199.field3053.method870(null, 8611, arg2.field6700, class230.field3448, null);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class230.field3448[var12];
                if ((var9 - 1) > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class7.field53.method2713(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = class7.field53.method2710() * var9 + class7.field53.method2708() / 2;
        }
        int var15 = var5 / 2 + arg1.field7717;
        if (var7 < class382.field5480 + var5) {
            var7 = class382.field5480;
            var15 = var10 / 2 + var5 / 2 + class382.field5480 + var6 + 5;
        } else if (class382.field5473 - var5 < var7) {
            var7 = class382.field5473 - var5;
            var15 = class382.field5473 - var5 / 2 - (var10 / 2) - var6 - 5;
        }
        int var16 = arg1.field7720;
        if (class382.field5482 + var5 > var8) {
            var8 = class382.field5482;
            var16 = var5 / 2 + class382.field5482 + var6;
        } else if (var8 > class382.field5484 - var5) {
            var8 = class382.field5484 - var5;
            var16 = class382.field5484 - var11 - (var5 / 2) - var6;
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg1.field7717), (double) (var8 - arg1.field7720)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        if (arg3 >= -83) {
            return;
        }
        var4.method2174((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg2.field6700 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2) - 5;
            var21 = var16 + (class7.field53.method2710() * var9 + 3);
            var20 = var18 - (-var10 - 10);
            if (arg2.field6690 != 0) {
                arg0.method1193(1, var16, var18, var20 - var18, var21 - var16, arg2.field6690);
            }
            if (arg2.field6693 != 0) {
                arg0.method1200(true, var16, var18, arg2.field6693, var20 - var18, -var16 + var21);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class230.field3448[var22];
                if (var9 - 1 > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class7.field53.method2709(arg0, var23, var15, var16, arg2.field6721, true);
                var16 += class7.field53.method2710();
            }
        }
        if (arg2.field6711 == -1 && arg2.field6700 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class185 var25 = new class185(arg1);
        var25.field2734 = var19;
        var25.field2733 = var21;
        var25.field2737 = var20;
        var25.field2740 = var7 - var24;
        var25.field2729 = var18;
        var25.field2742 = var8 + var24;
        var25.field2739 = var8 - var24;
        var25.field2732 = var7 + var24;
        class241.field3617.method866((byte) 10, var25);
    }

    @OriginalMember(owner = "client!ga", name = "read", descriptor = "()I")
    public final int read() {
        class477.method2826(30000L, 0);
        field4213++;
        return -1;
    }
}
