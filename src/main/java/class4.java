import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 implements class126 {

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "Ljava/lang/String;")
    private String field44;

    @OriginalMember(owner = "client!ft", name = "k", descriptor = "Lwl;")
    public static class410 field52 = new class410();

    @OriginalMember(owner = "client!ft", name = "l", descriptor = "I")
    public static int field53 = 0;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!ft", name = "i", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ft", name = "j", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!ft", name = "m", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "Z")
    private boolean field48;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lrg;B)V")
    public static final void method24(class645 arg0, byte arg1) {
        field47++;
        int var2 = arg0.method3728((byte) 88);
        class149.field2327 = new class300[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class149.field2327[var3] = new class300();
            class149.field2327[var3].field4252 = arg0.method3728((byte) 88);
            class149.field2327[var3].field4251 = arg0.method3696(-58);
        }
        class269.field3854 = arg0.method3728((byte) 88);
        class589.field8355 = arg0.method3728((byte) 88);
        class332.field4766 = arg0.method3728((byte) 88);
        class587.field8320 = new class218[class589.field8355 + 1 - class269.field3854];
        int var4 = -90 % ((35 - arg1) / 58);
        for (int var5 = 0; var5 < class332.field4766; var5++) {
            int var6 = arg0.method3728((byte) 88);
            class218 var7 = class587.field8320[var6] = new class218();
            var7.field10503 = arg0.method3745(-6314);
            var7.field10496 = arg0.method3720(-19541);
            var7.field3212 = class269.field3854 + var6;
            var7.field3208 = arg0.method3696(-104);
            var7.field3214 = arg0.method3696(-74);
        }
        field54 = arg0.method3720(-19541);
        class520.field7453 = true;
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)Z")
    public final boolean method25(int arg0) {
        field45++;
        if (arg0 != -566831732) {
            field53 = 103;
        }
        return this.field48;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(CB)Z")
    public static final boolean method26(char arg0, byte arg1) {
        field42++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        int var2 = 71 % ((44 - arg1) / 58);
        if (arg0 != '\u0000') {
            char[] var3 = class382.field5762;
            for (int var4 = 0; var4 < var3.length; var4++) {
                char var5 = var3[var4];
                if (arg0 == var5) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)Lgj;")
    public final class637 method27(int arg0) {
        if (arg0 > -40) {
            field52 = null;
        }
        field50++;
        return class637.field8946;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIIIII)V")
    public static final void method28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field43++;
        int var6 = arg3 - arg2;
        int var7 = arg0 - arg4;
        if (var6 == 0) {
            if (var7 != 0) {
                class396.method2529(2, arg0, arg2, arg1, arg4);
            }
        } else if (var7 == 0) {
            class410.method2603(arg4, -9563, arg3, arg2, arg1);
        } else {
            if (arg5 != 1532682220) {
                method26('f', (byte) 37);
            }
            int var8 = (var7 << 12) / var6;
            int var9 = arg4 - (arg2 * var8 >> 12);
            int var10;
            int var11;
            if (class497.field7073 > arg2) {
                var10 = (class497.field7073 * var8 >> 12) + var9;
                var11 = class497.field7073;
            } else if (arg2 <= class391.field5895) {
                var10 = arg4;
                var11 = arg2;
            } else {
                var10 = (class391.field5895 * var8 >> 12) + var9;
                var11 = class391.field5895;
            }
            int var12;
            int var13;
            if (class497.field7073 > arg3) {
                var13 = class497.field7073;
                var12 = (class497.field7073 * var8 >> 12) + var9;
            } else if (class391.field5895 >= arg3) {
                var12 = arg0;
                var13 = arg3;
            } else {
                var12 = (class391.field5895 * var8 >> 12) + var9;
                var13 = class391.field5895;
            }
            if (class166.field2622 > var10) {
                var11 = (class166.field2622 - var9 << 12) / var8;
                var10 = class166.field2622;
            } else if (class432.field6446 < var10) {
                var11 = (class432.field6446 - var9 << 12) / var8;
                var10 = class432.field6446;
            }
            if (class166.field2622 > var12) {
                var13 = (class166.field2622 - var9 << 12) / var8;
                var12 = class166.field2622;
            } else if (var12 > class432.field6446) {
                var13 = (class432.field6446 - var9 << 12) / var8;
                var12 = class432.field6446;
            }
            class286.method1828(var11, var10, -126, var13, var12, arg1);
        }
    }

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)V")
    public static void method29(int arg0) {
        if (arg0 != 0) {
            method29(-48);
        }
        field52 = null;
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class4(String arg0) {
        this.field44 = arg0;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/io/File;I)[B")
    public static final byte[] method30(File arg0, int arg1) {
        if (arg1 > -126) {
            return null;
        } else {
            field49++;
            return class612.method3547(arg0, (int) arg0.length(), -1);
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)I")
    public final int method31(byte arg0) {
        if (arg0 > -16) {
            return 38;
        }
        field46++;
        int var2 = class127.method891(119, this.field44);
        if (var2 >= 0 && var2 <= 100) {
            return var2;
        } else {
            this.field48 = true;
            return 100;
        }
    }
}
