import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public abstract class class310 {

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4829 = "Prepared sound engine";

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field4835 = 0;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "Lad;")
    public static class128 field4833 = new class128();

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "Ljava/awt/Image;")
    public static Image field4839;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZIIIII)V", line = 7)
    public static final void method2145(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4840++;
        int var7 = arg4 + arg5;
        int var8 = arg3 - arg5;
        int var9 = arg5 + arg6;
        int var10 = arg2 - arg5;
        if (arg1) {
            method2149(6);
        }
        for (int var11 = arg4; var11 < var7; var11++) {
            class138.method1047(arg0, arg2, arg6, 7, class320.field4990[var11]);
        }
        for (int var12 = arg3; var12 > var8; var12--) {
            class138.method1047(arg0, arg2, arg6, 7, class320.field4990[var12]);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class320.field4990[var13];
            class138.method1047(arg0, var9, arg6, 7, var14);
            class138.method1047(arg0, arg2, var10, 7, var14);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 50)
    public static final void method2146(int arg0) {
        field4832++;
        if (class212.field3367 || class20.field222 == 2) {
            return;
        }
        if (arg0 > -116) {
            method2148((byte) 88, (char) 65424, -83);
        }
        try {
            class226.method1607(class99.field1457, true, "tbrefresh");
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 76)
    public static void method2147(byte arg0) {
        field4829 = null;
        int var1 = 69 / ((-arg0 - 15) / 47);
        field4833 = null;
        field4839 = null;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "()Z", line = 88)
    public boolean method386() {
        field4842++;
        return false;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lgd;IIIZ)V", line = 96)
    public void method400(class310 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4841++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BCI)I", line = 117)
    public static final int method2148(byte arg0, char arg1, int arg2) {
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        if (arg1 == 'ñ' && arg2 == 0) {
            var3 = 1762;
        }
        field4836++;
        if (arg0 != 41) {
            method2149(23);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)Lgd;", line = 140)
    public class310 method381(int arg0, int arg1, int arg2) {
        field4838++;
        return this;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V", line = 148)
    public static final void method2149(int arg0) {
        class87.field1275.method1433(30);
        field4831++;
        if (arg0 <= 62) {
            field4829 = (String) null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIZII)V", line = 168)
    public static final void method2150(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var6 = 0;
        field4830++;
        int var7 = arg0;
        int var8 = arg1 * arg1;
        int var9 = arg0 * arg0;
        int var10 = arg0 << 1;
        int var11 = var8 << 1;
        int var12 = var9 << 1;
        int var13 = (1 - var10) * var8 + var12;
        int var14 = var9 - ((var10 - 1) * var11);
        int var15 = var8 << 2;
        if (arg3) {
            return;
        }
        int var16 = ((var6 << 1) + 3) * var12;
        int var17 = var9 << 2;
        int var18 = ((arg0 << 1) - 3) * var11;
        if (arg2 >= class34.field432 && class75.field1064 >= arg2) {
            int var19 = class257.method1784((byte) 91, arg4 + arg1, class298.field4667, class327.field5072);
            int var20 = class257.method1784((byte) 91, arg4 - arg1, class298.field4667, class327.field5072);
            class138.method1047(arg5, var19, var20, 7, class320.field4990[arg2]);
        }
        int var21 = (arg0 - 1) * var15;
        int var22 = (var6 + 1) * var17;
        while (var7 > 0) {
            var7--;
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var22;
                    var13 += var16;
                    var16 += var17;
                    var6++;
                    var22 += var17;
                }
            }
            if (var14 < 0) {
                var13 += var16;
                var16 += var17;
                var14 += var22;
                var6++;
                var22 += var17;
            }
            var13 += -var21;
            var21 -= var15;
            var14 += -var18;
            var18 -= var15;
            int var23 = arg2 + var7;
            int var24 = arg2 - var7;
            if (class34.field432 <= var23 && class75.field1064 >= var24) {
                int var25 = class257.method1784((byte) 91, arg4 + var6, class298.field4667, class327.field5072);
                int var26 = class257.method1784((byte) 91, arg4 - var6, class298.field4667, class327.field5072);
                if (var24 >= class34.field432) {
                    class138.method1047(arg5, var25, var26, 7, class320.field4990[var24]);
                }
                if (var23 <= class75.field1064) {
                    class138.method1047(arg5, var25, var26, 7, class320.field4990[var23]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "()I")
    public abstract int method19();

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIIIIJILt;)V")
    public abstract void method1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class254 arg10);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIII)V")
    public abstract void method16(int arg0, int arg1, int arg2, int arg3, int arg4);
}
