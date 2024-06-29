import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class388 extends class278 {

    @OriginalMember(owner = "client!fs", name = "M", descriptor = "Lfg;")
    public static class83 field5449 = new class83("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!fs", name = "P", descriptor = "Luf;")
    public static class310 field5452 = new class310(6, 5);

    @OriginalMember(owner = "client!fs", name = "Q", descriptor = "I")
    public static int field5453 = 0;

    @OriginalMember(owner = "client!fs", name = "R", descriptor = "[C")
    public static char[] field5454 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!fs", name = "I", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!fs", name = "K", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!fs", name = "L", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!fs", name = "N", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!fs", name = "O", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(II)[I")
    public final int[] method208(int arg0, int arg1) {
        if (arg0 != -9) {
            return null;
        } else {
            ++field5448;
            int[] var3 = super.field3750.method256(arg1, -30359);
            if (super.field3750.field554) {
                class416.method2486(var3, 0, class507.field7456, class454.field6637[arg1]);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method2232(boolean arg0, String arg1) {
        ++field5446;
        if (arg1 != null) {
            if (arg1.startsWith("*")) {
                arg1 = arg1.substring(1);
            }
            if (!arg0) {
                String var2 = class451.method2659(arg1, (byte) -120);
                if (var2 != null) {
                    for (int var3 = 0; ~var3 > ~class336.field4605; ++var3) {
                        String var4 = class159.field2284[var3];
                        if (var4.startsWith("*")) {
                            var4 = var4.substring(1);
                        }
                        String var5 = class451.method2659(var4, (byte) -120);
                        if (var5 != null && var5.equals(var2)) {
                            --class336.field4605;
                            for (int var6 = var3; var6 < class336.field4605; ++var6) {
                                class159.field2284[var6] = class159.field2284[var6 - -1];
                                class174.field2491[var6] = class174.field2491[var6 + 1];
                                class463.field6729[var6] = class463.field6729[var6 + 1];
                                class467.field6804[var6] = class467.field6804[var6 + 1];
                                class294.field3921[var6] = class294.field3921[var6 + 1];
                            }
                            ++class248.field3446;
                            class137.field1959 = class234.field3240;
                            class356.method1978((byte) 116, class118.field1583);
                            class244.field3395.method2084(class121.method780(arg1, (byte) 53), false);
                            class244.field3395.method2073(-124, arg1);
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "()V")
    public class388() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lvq;Lvq;ZZIII)I")
    public static final int method2233(class320 arg0, class320 arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        ++field5450;
        int var7 = class329.method1830(arg0, arg1, arg4, false, arg2);
        if (var7 != 0) {
            return arg2 ? -var7 : var7;
        } else {
            if (arg5 != 376) {
                field5449 = null;
            }
            if (~arg6 == 0) {
                return 0;
            } else {
                int var8 = class329.method1830(arg0, arg1, arg6, false, arg3);
                return arg3 ? -var8 : var8;
            }
        }
    }

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "(I)V")
    public static void method2234(int arg0) {
        if (arg0 >= -124) {
            field5452 = null;
        }
        field5452 = null;
        field5449 = null;
        field5454 = null;
    }
}
