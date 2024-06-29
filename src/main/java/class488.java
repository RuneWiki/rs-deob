import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class488 extends class45 {

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field7228 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    public static int field7223;

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "I")
    public static int field7227;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "Lbu;")
    public static class17 field7222;

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "Lbu;")
    public static class17 field7226;

    static {
        new class342("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
    }

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "(B)V", line = 4)
    public static void method2890(byte arg0) {
        int var1 = 116 / ((arg0 - -62) / 56);
        field7228 = null;
        field7226 = null;
        field7222 = null;
    }

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)V", line = 15)
    public static final void method2891(int arg0) {
        class21.field429 = null;
        class130.field2071 = null;
        ++field7220;
        if (arg0 > 95) {
            class162.field2515 = null;
            class295.field4202 = null;
            class13.field213 = null;
            class462.field6925 = false;
        }
    }

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "(I)V", line = 34)
    public static final void method2892(int arg0) {
        int var1 = 122 % ((arg0 - 52) / 42);
        ++field7227;
        for (int var2 = 0; class510.field7529 > var2; ++var2) {
            int var3 = class148.field2363[var2];
            class255 var4 = class34.field668[var3];
            if (var4 != null) {
                class78.method619((byte) -97, var4.field3677.field807, var4);
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)[I", line = 61)
    public final int[] method35(int arg0, int arg1) {
        ++field7221;
        if (arg0 != 0) {
            field7226 = null;
        }
        int[] var3 = super.field854.method863((byte) 12, arg1);
        if (super.field854.field1928) {
            class73.method595(var3, 0, class259.field3768, class433.field6429[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lng;II)V", line = 86)
    public static final void method2893(class226 arg0, int arg1, int arg2) {
        if (class36.field700) {
            arg2 = 0;
            class36.field700 = false;
        }
        ++field7225;
        if (class519.field7714 == null || !class519.field7714.method1482(arg0, -115)) {
            class519.field7714 = arg0;
            class487.field7213 = class211.method1419(12921);
            class384.field5800 = arg2;
            class291.field4146 = arg2;
            if (class291.field4146 != 0) {
                class421.field6295 = class234.field3408;
                class483.field7191 = class97.field1620;
                class388.field5837 = class515.field7571;
                class480.field7153 = class453.field6777;
                class521.field7733 = class292.field4158;
                class460.field6895 = class60.field1061;
                class121.field1975 = class118.field1946;
                class410.field6142 = class134.field2105;
                class85.field1477 = class237.field3432;
                class361.field5467 = class219.field3143;
            } else {
                class474.method2842(65280);
            }
        }
        int var3 = -38 % ((-27 - arg1) / 51);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIII)V", line = 125)
    public static final void method2894(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7224;
        if (arg4 == 0) {
            if (class70.field1213 <= arg3 && arg3 <= class389.field5859) {
                int var5 = class9.method50(class315.field4754, arg2, class156.field2455, true);
                int var6 = class9.method50(class315.field4754, arg1, class156.field2455, true);
                class64.method544(0, var6, arg0, arg3, var5);
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILbu;ZLjava/lang/String;)Lil;", line = 147)
    public static final class7 method2895(int arg0, class17 arg1, boolean arg2, String arg3) {
        ++field7223;
        int var4 = arg1.method136(arg3, 64);
        if (~var4 == 0) {
            return new class7(0);
        } else {
            if (arg0 < 87) {
                method2892(104);
            }
            int[] var5 = arg1.method131(var4, 79);
            class7 var6 = new class7(var5.length);
            int var7 = 0;
            int var8 = 0;
            while (true) {
                while (var6.field133 > var7) {
                    class145 var9 = new class145(arg1.method114(var5[var8++], var4, 121));
                    int var10 = var9.method1070(-32387);
                    int var11 = var9.method1069((byte) -111);
                    int var12 = var9.method1063((byte) 106);
                    if (!arg2 && var12 == 1) {
                        --var6.field133;
                    } else {
                        var6.field134[var7] = var10;
                        var6.field136[var7] = var11;
                        ++var7;
                    }
                }
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V", line = 201)
    public class488() {
        super(0, true);
    }
}
