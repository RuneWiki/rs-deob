import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public abstract class class198 {

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field2828 = 0;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field2831 = 0;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "Lub;")
    public static class15 field2833 = new class15(128);

    @OriginalMember(owner = "client!km", name = "h", descriptor = "F")
    public static float field2835 = 0.0F;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    public static int field2836 = 0;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1404(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2830++;
        int var5 = 0;
        if (arg4) {
            method1405(-87);
        }
        while (class10.field129 > var5) {
            Rectangle var6 = class85.field1086[var5];
            if ((var6.x + var6.width) > arg2 && var6.x < arg2 + arg3 && (var6.y + var6.height) > arg1 && var6.y < (arg0 + arg1)) {
                class353.field5126[var5] = true;
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(I)V")
    public static void method1405(int arg0) {
        field2833 = null;
        if (arg0 != 0) {
            method1406(-6, 112, -113, -16, -114, 95, 67, -128);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1406(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2834++;
        int var8 = arg2 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = class74.field979 + ((class120.field1630 - class74.field979) * var8 / 100);
        int var10 = arg7 * var9 >> 8;
        int var11 = arg1 - arg4 & 0x3FFF;
        int var12 = 16384 - arg3 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class447.field6381[var11] * -var10 >> 15;
            var15 = class447.field6390[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class447.field6381[var12] * var15 >> 15;
            var15 = class447.field6390[var12] * var15 >> 15;
        }
        class249.field3707 = arg6 - var14;
        class214.field3072 = 0;
        class278.field3990 = arg3;
        class319.field4676 = arg4;
        class386.field5469 = arg5 - var13;
        class417.field5999 = arg0 - var15;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1407(String arg0, int arg1) {
        field2829++;
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class206.field2897; var2++) {
            if (arg0.equalsIgnoreCase(class56.field743[var2])) {
                return var2;
            }
        }
        if (arg1 != 3568) {
            field2837 = -93;
        }
        return -1;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lvq;ZLkm;IIBI)V")
    public abstract void method611(class269 arg0, boolean arg1, class198 arg2, int arg3, int arg4, byte arg5, int arg6);

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(I)Z")
    public abstract boolean method610(int arg0);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lvq;IIB)Z")
    public abstract boolean method16(class269 arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BLvq;)Lbf;")
    public abstract class316 method15(byte arg0, class269 arg1);

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(B)V")
    public abstract void method613(byte arg0);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IILbr;)Ljava/lang/String;")
    public static final String method1408(int arg0, int arg1, class223 arg2) {
        if (arg0 != -16995) {
            return null;
        }
        field2832++;
        if (!client.method1168(arg2).method485(28, arg1) && arg2.field3222 == null) {
            return null;
        } else if (arg2.field3323 == null || arg1 >= arg2.field3323.length || arg2.field3323[arg1] == null || arg2.field3323[arg1].trim().length() == 0) {
            return class450.field6455 ? "Hidden-" + arg1 : null;
        } else {
            return arg2.field3323[arg1];
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lvq;B)V")
    public abstract void method22(class269 arg0, byte arg1);
}
