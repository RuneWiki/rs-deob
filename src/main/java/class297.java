import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class297 {

    @OriginalMember(owner = "client!er", name = "a", descriptor = "Lda;")
    public class400 field4059 = null;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "Lqt;")
    public class502 field4061 = null;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4060 = null;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "I")
    private static int field4065 = 0;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "Z")
    public static boolean field4063 = false;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
    public static void method1852(byte arg0) {
        if (arg0 != 12) {
            method1854(null, false, null, -37, (byte) -65);
        }
        field4060 = null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II)[B")
    public static final byte[] method1853(int arg0, int arg1) {
        field4064++;
        class224 var2 = (class224) class488.field7030.method2311((long) arg0, (byte) -122);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class151.method1094(var4, 4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class224(var3);
            class488.field7030.method2313((long) arg0, var2, (byte) -38);
        }
        if (arg1 < 116) {
            field4063 = true;
        }
        return var2.field3308;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Ljw;Z[[[BIB)Z")
    public static final boolean method1854(class280 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class265.field3796) {
            return false;
        }
        int var5 = arg0.field3923 >> class639.field9095;
        int var6 = var5;
        int var7 = arg0.field3916 >> class639.field9095;
        int var8 = var7;
        if (arg0 instanceof class638) {
            var6 = ((class638) arg0).field9036;
            var8 = ((class638) arg0).field9042;
            var5 = ((class638) arg0).field9038;
            var7 = ((class638) arg0).field9035;
        }
        for (int var9 = var5; var9 <= var6; var9++) {
            for (int var10 = var7; var10 <= var8; var10++) {
                if (arg0.field3924 < class433.field6202 && var9 >= class740.field10333 && var9 < class678.field9622 && var10 >= class753.field10506 && var10 < class187.field2631) {
                    if ((arg2 == null || arg0.field3920 < arg3 || arg2[arg0.field3920][var9][var10] != arg4) && arg0.method92((byte) 18) && !arg0.method88(-1)) {
                        return false;
                    }
                    if (!arg1 && var9 >= class613.field8757 - 16 && var9 <= class613.field8757 + 16 && var10 >= class140.field1915 - 16 && var10 <= class140.field1915 + 16) {
                        if (class564.field8170) {
                            class618.field8804[field4065++].method1790(16842, arg0);
                            field4065 %= class143.field1943;
                        } else {
                            arg0.method610((byte) 64, class391.field5644);
                        }
                    }
                }
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(III)Z")
    public static final boolean method1855(int arg0, int arg1, int arg2) {
        field4062++;
        int var3 = 65 % ((-arg2 - 85) / 39);
        return (class734.method4090(29441, arg0, arg1) | class23.method105(false, arg0, arg1) | class499.method3032(52, arg0, arg1)) & class718.method4036(110, arg1, arg0);
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lda;)V")
    public class297(class400 arg0) {
        this.field4059 = arg0;
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lda;Lqt;)V")
    public class297(class400 arg0, class502 arg1) {
        this.field4059 = arg0;
        this.field4061 = arg1;
    }
}
