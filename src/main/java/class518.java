import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class518 {

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public int field7497 = 1;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field7501 = 0;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
    public static int field7504 = 0;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "Lgw;")
    public static class118 field7503 = new class118();

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "C")
    public char field7499;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "F")
    public static float field7506;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field7498;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lwn;Z)V")
    public final void method3009(class519 arg0, boolean arg1) {
        field7505++;
        if (!arg1) {
            return;
        }
        while (true) {
            int var3 = arg0.method3072((byte) -126);
            if (var3 == 0) {
                return;
            }
            this.method3013((byte) -72, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)[Lvi;")
    public static final class384[] method3010(int arg0) {
        if (class152.field2323 == null) {
            class384[] var1 = class263.method1704((byte) 125, class280.field4173);
            class384[] var2 = new class384[var1.length];
            int var3 = 0;
            label67: for (int var4 = 0; var4 < var1.length; var4++) {
                class384 var8 = var1[var4];
                if ((var8.field5490 <= 0 || var8.field5490 >= 24) && var8.field5492 >= 800 && var8.field5491 >= 600 && (class414.field5859 >= 96 || class74.field1211 != 0 || var8.field5492 <= 1024 && var8.field5491 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class384 var10 = var2[var9];
                        if (var8.field5492 == var10.field5492 && var8.field5491 == var10.field5491) {
                            if (var10.field5490 < var8.field5490) {
                                var2[var9] = var8;
                            }
                            continue label67;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class152.field2323 = new class384[var3];
            class282.method1820(var2, 0, class152.field2323, 0, var3);
            int[] var5 = new int[class152.field2323.length];
            for (int var6 = 0; var6 < class152.field2323.length; var6++) {
                class384 var7 = class152.field2323[var6];
                var5[var6] = var7.field5492 * var7.field5491;
            }
            class359.method2229((byte) -124, class152.field2323, var5);
        }
        field7502++;
        if (arg0 > -42) {
            field7503 = null;
        }
        return class152.field2323;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ltf;IZ)V")
    public static final void method3011(class198 arg0, int arg1, boolean arg2) {
        field7500++;
        int var3 = arg0.field2889 == 0 ? arg0.field3008 : arg0.field2889;
        int var4 = arg0.field3045 == 0 ? arg0.field2988 : arg0.field3045;
        if (arg1 > -98) {
            method3011(null, 38, true);
        }
        class297.method1909((byte) -97, class283.field4217[arg0.field3016 >> 16], var3, arg0.field3016, arg2, var4);
        if (arg0.field3013 != null) {
            class297.method1909((byte) -105, arg0.field3013, var3, arg0.field3016, arg2, var4);
        }
        class541 var5 = (class541) class220.field3370.method2284(true, (long) arg0.field3016);
        if (var5 != null) {
            class372.method2279(var5.field7955, var3, 0, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V")
    public static void method3012(int arg0) {
        field7503 = null;
        int var1 = 79 % ((arg0 + 48) / 56);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BLwn;I)V")
    private final void method3013(byte arg0, class519 arg1, int arg2) {
        field7498++;
        if (arg0 != -72) {
            return;
        }
        if (arg2 == 1) {
            this.field7499 = class221.method1501(arg1.method3034((byte) 126), arg0 ^ 0x5C35);
        } else if (arg2 == 2) {
            this.field7497 = 0;
        }
    }
}
