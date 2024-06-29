import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class237 extends InputStream {

    @OriginalMember(owner = "client!s", name = "b", descriptor = "[B")
    public static byte[] field3388 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
    public static void method1588(byte arg0) {
        field3388 = null;
        if (arg0 <= 42) {
            method1588((byte) -61);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;)V")
    public static final void method1589(boolean arg0, int arg1, String arg2, String arg3) {
        if (arg1 != 8) {
            method1590(37, 112, 101);
        }
        field3389++;
        class498.field7259 = arg3;
        class111.field1363 = arg2;
        class472.field6996 = arg0;
        if (!class472.field6996 && class253.field3576 != 3 && class498.field7259.equals("") || class111.field1363.equals("")) {
            class453.method2799(88, 3);
            return;
        }
        class248.field3523 = false;
        if (class253.field3576 != 1) {
            class347.field4966 = 0;
            class301.field4428 = -1;
        }
        class453.method2799(-19, -3);
        class554.field7863 = 0;
        class306.field4499 = 1;
        class142.field1748 = 0;
    }

    @OriginalMember(owner = "client!s", name = "read", descriptor = "()I")
    public final int read() {
        field3387++;
        class646.method3696(1, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)Z")
    public static final boolean method1590(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class467.field6928; var3++) {
            class262 var4 = class490.field7147[var3];
            if (var4.field3729 == 1) {
                int var5 = var4.field3724 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3728 * var5 >> 8) + var4.field3719;
                    int var7 = (var4.field3717 * var5 >> 8) + var4.field3732;
                    int var8 = (var4.field3722 * var5 >> 8) + var4.field3720;
                    int var9 = (var4.field3723 * var5 >> 8) + var4.field3721;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3729 == 2) {
                int var10 = arg0 - var4.field3724;
                if (var10 > 0) {
                    int var11 = (var4.field3728 * var10 >> 8) + var4.field3719;
                    int var12 = (var4.field3717 * var10 >> 8) + var4.field3732;
                    int var13 = (var4.field3722 * var10 >> 8) + var4.field3720;
                    int var14 = (var4.field3723 * var10 >> 8) + var4.field3721;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3729 == 3) {
                int var15 = var4.field3719 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3715 * var15 >> 8) + var4.field3724;
                    int var17 = (var4.field3714 * var15 >> 8) + var4.field3730;
                    int var18 = (var4.field3722 * var15 >> 8) + var4.field3720;
                    int var19 = (var4.field3723 * var15 >> 8) + var4.field3721;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3729 == 4) {
                int var20 = arg2 - var4.field3719;
                if (var20 > 0) {
                    int var21 = (var4.field3715 * var20 >> 8) + var4.field3724;
                    int var22 = (var4.field3714 * var20 >> 8) + var4.field3730;
                    int var23 = (var4.field3722 * var20 >> 8) + var4.field3720;
                    int var24 = (var4.field3723 * var20 >> 8) + var4.field3721;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3729 == 5) {
                int var25 = arg1 - var4.field3720;
                if (var25 > 0) {
                    int var26 = (var4.field3715 * var25 >> 8) + var4.field3724;
                    int var27 = (var4.field3714 * var25 >> 8) + var4.field3730;
                    int var28 = (var4.field3728 * var25 >> 8) + var4.field3719;
                    int var29 = (var4.field3717 * var25 >> 8) + var4.field3732;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static {
        new class474("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
    }
}
