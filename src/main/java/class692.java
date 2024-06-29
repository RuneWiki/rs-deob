import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class692 extends class409 {

    @OriginalMember(owner = "client!ev", name = "q", descriptor = "I")
    public int field9365 = (int) (class554.method3190(-92) / 1000L);

    @OriginalMember(owner = "client!ev", name = "m", descriptor = "Ljava/lang/String;")
    public String field9361;

    @OriginalMember(owner = "client!ev", name = "p", descriptor = "S")
    public short field9364;

    @OriginalMember(owner = "client!ev", name = "n", descriptor = "F")
    public static float field9362;

    @OriginalMember(owner = "client!ev", name = "l", descriptor = "I")
    public static int field9360;

    @OriginalMember(owner = "client!ev", name = "r", descriptor = "I")
    public static int field9366;

    @OriginalMember(owner = "client!ev", name = "o", descriptor = "[I")
    public static int[] field9363;

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(I)[Lb;", line = 5)
    public static final class335[] method3868(int arg0) {
        if (arg0 != 1494) {
            method3868(-18);
        }
        field9360++;
        if (class559.field7738 == null) {
            class335[] var1 = class207.method1431((byte) -107, class689.field9299);
            class335[] var2 = new class335[var1.length];
            int var3 = 0;
            int var4 = class693.field9368.field4428.method3678(-32350);
            label73: for (int var5 = 0; var5 < var1.length; var5++) {
                class335 var9 = var1[var5];
                if ((var9.field4724 <= 0 || var9.field4724 >= 24) && var9.field4725 >= 800 && var9.field4732 >= 600 && (var4 != 2 || var9.field4725 <= 800 && var9.field4732 <= 600) && (var4 != 1 || var9.field4725 <= 1024 && var9.field4732 <= 768)) {
                    for (int var10 = 0; var10 < var3; var10++) {
                        class335 var11 = var2[var10];
                        if (var9.field4725 == var11.field4725 && var9.field4732 == var11.field4732) {
                            if (var11.field4724 < var9.field4724) {
                                var2[var10] = var9;
                            }
                            continue label73;
                        }
                    }
                    var2[var3] = var9;
                    var3++;
                }
            }
            class559.field7738 = new class335[var3];
            class363.method2317(var2, 0, class559.field7738, 0, var3);
            int[] var6 = new int[class559.field7738.length];
            for (int var7 = 0; var7 < class559.field7738.length; var7++) {
                class335 var8 = class559.field7738[var7];
                var6[var7] = var8.field4732 * var8.field4725;
            }
            class428.method2611(class559.field7738, (byte) -123, var6);
        }
        return class559.field7738;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IBI)Let;", line = 90)
    public static final class594 method3869(int arg0, byte arg1, int arg2) {
        field9366++;
        class594 var3 = (class594) class431.field6169.method1465((long) arg2 << 32 | (long) arg0, arg1 ^ 0xFFFFE8E1);
        if (arg1 != 105) {
            field9362 = 0.99212307F;
        }
        if (var3 == null) {
            var3 = new class594(arg2, arg0);
            class431.field6169.method1468((byte) 91, var3.field5204, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(B)V", line = 112)
    public static void method3870(byte arg0) {
        if (arg0 != 4) {
            field9363 = null;
        }
        field9363 = null;
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 122)
    public class692(String arg0, int arg1) {
        this.field9361 = arg0;
        this.field9364 = (short) arg1;
    }
}
