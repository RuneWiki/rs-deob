import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class412 {

    @OriginalMember(owner = "client!maa", name = "e", descriptor = "Lme;")
    private class668 field5311 = new class668(128);

    @OriginalMember(owner = "client!maa", name = "f", descriptor = "Lpe;")
    private class615 field5312;

    @OriginalMember(owner = "client!maa", name = "d", descriptor = "Lra;")
    public static class361 field5310 = new class361(4, -1);

    @OriginalMember(owner = "client!maa", name = "h", descriptor = "[C")
    public static char[] field5314 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!maa", name = "g", descriptor = "Lis;")
    public static class100 field5313;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)V")
    public static final void method2329(int arg0) {
        field5308++;
        if (class196.field2562 == -1) {
            return;
        }
        int var1 = -12 / ((-arg0 - 59) / 39);
        int var2 = class691.field9440.method2214(-2703);
        int var3 = class691.field9440.method2208(30114);
        class252 var4 = (class252) class700.field9768.method2090(true);
        if (var4 != null) {
            var2 = var4.method323(-5);
            var3 = var4.method320(-118);
        }
        class379.method2165(10, class461.field6047, 0, class519.field6796, var3, 0, class196.field2562, 0, 0, var2);
        if (class178.field2217 != null) {
            class79.method628(1007, var2, var3);
        }
    }

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(I)V")
    public static final void method2330(int arg0) {
        class398.field5073 = class411.field5305.field7103 + class411.field5305.field7102 + 2;
        class483.field6443 = class401.field5111.field7102 + class401.field5111.field7103 + 2;
        field5307++;
        class612.field8281 = new String[500];
        for (int var1 = arg0; var1 < class612.field8281.length; var1++) {
            class612.field8281[var1] = "";
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method2331(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class105.field1384[arg0][var8][var14] == -class655.field9110) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class291.field3760) + 1;
            int var10 = (arg3 << class291.field3760) + 2;
            int var11 = class392.field4997[arg0].method668(arg1, arg3) + arg5;
            if (!class239.method1510(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class291.field3760) - 1;
            if (!class239.method1510(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class291.field3760) - 1;
            if (!class239.method1510(var9, var11, var13)) {
                return false;
            } else if (class239.method1510(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class207.method1332(arg0, arg1, arg3)) {
            int var6 = arg1 << class291.field3760;
            int var7 = arg3 << class291.field3760;
            return class239.method1510(var6 + 1, class392.field4997[arg0].method668(arg1, arg3) + arg5, var7 + 1) && class239.method1510(class688.field9414 + var6 - 1, class392.field4997[arg0].method668(arg1 + 1, arg3) + arg5, var7 + 1) && class239.method1510(class688.field9414 + var6 - 1, class392.field4997[arg0].method668(arg1 + 1, arg3 + 1) + arg5, class688.field9414 + var7 - 1) && class239.method1510(var6 + 1, class392.field4997[arg0].method668(arg1, arg3 + 1) + arg5, class688.field9414 + var7 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "(I)V")
    public static void method2332(int arg0) {
        field5314 = null;
        field5310 = null;
        field5313 = null;
        if (arg0 != -32684) {
            method2329(54);
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(BI)Lnea;")
    public final class539 method2333(byte arg0, int arg1) {
        field5309++;
        class668 var3 = this.field5311;
        class539 var4;
        synchronized (this.field5311) {
            var4 = (class539) this.field5311.method3655(64, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5312.method3346(-1, class276.method1676(14654, arg1), class68.method554(arg1, true));
        class539 var6 = new class539();
        if (arg0 <= 25) {
            this.field5312 = null;
        }
        if (var5 != null) {
            var6.method2859(new class418(var5), (byte) 4);
        }
        class668 var7 = this.field5311;
        synchronized (this.field5311) {
            this.field5311.method3650((long) arg1, -107, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Lvd;ILpe;)V")
    public class412(class635 arg0, int arg1, class615 arg2) {
        this.field5312 = arg2;
        if (this.field5312 != null) {
            int var4 = this.field5312.method3366(-94) - 1;
            this.field5312.method3341(var4, -19046);
        }
    }
}
