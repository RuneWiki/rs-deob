import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class43 {

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field786 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "Lij;")
    public static class50 field790 = class78.method578(126, "<col=00ff80>");

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Lda;")
    public static class22 field788;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Ljd;")
    public static class85 field787;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLij;)V")
    public static final void method318(byte arg0, class50 arg1) {
        field785++;
        if (class140.field2442 == null) {
            return;
        }
        long var2 = arg1.method368((byte) -103);
        int var4 = 0;
        if (var2 == 0L) {
            return;
        }
        while (var4 < class140.field2442.length && class140.field2442[var4].field635 != var2) {
            var4++;
        }
        if (var4 >= class140.field2442.length || class140.field2442[var4] == null) {
            return;
        }
        class190.field3141.method1598((byte) -98, 20);
        class190.field3141.method1464(class140.field2442[var4].field635, 867341416);
        class129.field2260++;
        if (arg0 >= -8) {
            field786 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIZIIIII)V")
    public static final void method319(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4) {
            field790 = null;
        }
        field782++;
        if (arg0 == arg5 && arg3 == arg6 && arg7 == arg8 && arg1 == arg9) {
            class151.method1056(arg3, -56, arg9, arg5, arg8, arg2);
            return;
        }
        int var10 = arg5;
        int var11 = arg3;
        int var12 = arg5 * 3;
        int var13 = arg0 * 3;
        int var14 = arg3 * 3;
        int var15 = arg6 * 3;
        int var16 = arg7 * 3;
        int var17 = arg1 * 3;
        int var18 = arg9 + var15 - var17 - arg3;
        int var19 = var16 + var12 - var13 - var13;
        int var20 = arg8 - var16 - (-var13 + arg5);
        int var21 = var13 - var12;
        int var22 = var14 + (var17 - var15) - var15;
        int var23 = var15 - var14;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var20 * var26;
            int var28 = var18 * var26;
            int var29 = var19 * var25;
            int var30 = var22 * var25;
            int var31 = var23 * var24;
            int var32 = var21 * var24;
            int var33 = (var27 + var32 + var29 >> 12) + arg5;
            int var34 = (var28 + var30 + var31 >> 12) + arg3;
            class151.method1056(var11, 126, var34, var10, var33, arg2);
            var10 = var33;
            var11 = var34;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static void method320(byte arg0) {
        if (arg0 != 89) {
            field790 = null;
        }
        field788 = null;
        field787 = null;
        field790 = null;
        field786 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
    public static final void method321(boolean arg0) {
        if (arg0) {
            class245.field4257 = class100.field1854;
            class59.field1089 = class217.field3648;
        } else {
            class245.field4257 = class254.field4390;
            class59.field1089 = class57.field1027;
        }
        class261.field4553 = class59.field1089.length;
    }
}
