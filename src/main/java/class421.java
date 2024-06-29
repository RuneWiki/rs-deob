import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class421 {

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "I")
    public int field6300;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "Lhb;")
    public static class629 field6301 = new class629(8, 17);

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "Z")
    public static boolean field6304 = true;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "Lkca;")
    public static class73 field6306;

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "Ldb;")
    public static class272 field6309;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "I")
    public static int field6299;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
    public static int field6303;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "I")
    public static int field6305;

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "Ljava/lang/String;")
    public static String field6307;

    static {
        new class474("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
        field6306 = new class73(79, 4);
        field6309 = new class272(12, 0, 1, 0);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V", line = 11)
    public static void method2649(byte arg0) {
        field6306 = null;
        field6307 = null;
        if (arg0 == 2) {
            field6301 = null;
            field6309 = null;
        }
    }

    @OriginalMember(owner = "client!kp", name = "toString", descriptor = "()Ljava/lang/String;", line = 31)
    public final String toString() {
        field6302++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILoa;)V", line = 40)
    public static final void method2650(int arg0, class605 arg1) {
        field6303++;
        int var2 = class291.field4026;
        int var3 = class614.field8924;
        int var4 = field6308;
        int var5 = class508.field7392 - 3;
        byte var6 = 20;
        if (class379.field5761 == null || class75.field806 == null) {
            if (class319.field4621.method1311(class613.field8920, (byte) -93) && class319.field4621.method1311(class173.field2126, (byte) -93)) {
                class379.field5761 = arg1.method388(class372.method2398(class319.field4621, class613.field8920, 0), true);
                class372 var7 = class372.method2398(class319.field4621, class173.field2126, 0);
                class75.field806 = arg1.method388(var7, true);
                var7.method2396();
                class511.field7468 = arg1.method388(var7, true);
            } else {
                arg1.method394(var2, var3, var4, var6, 255 - class311.field4567 << 24 | class32.field362, 1);
            }
        }
        if (class379.field5761 != null && class75.field806 != null) {
            int var8 = (var4 - class75.field806.method1570() * 2) / class379.field5761.method1570();
            for (int var9 = 0; var9 < var8; var9++) {
                class379.field5761.method2706(var2 + class75.field806.method1570() + (class379.field5761.method1570() * var9), var3);
            }
            class75.field806.method2706(var2, var3);
            class511.field7468.method2706(var2 + (var4 - class511.field7468.method1570()), var3);
        }
        class472.field6992.method1046(-8500, var3 + 14, class489.field7132.method2902(class35.field396, -20139), class193.field2548 | 0xFF000000, -1, var2 + 3);
        arg1.method394(var2, var3 + var6, var4, var5 - var6, class32.field362 | 255 - class311.field4567 << 24, 1);
        int var10 = class32.field369.method778(6);
        int var11 = class32.field369.method777((byte) 60);
        int var12 = 0;
        for (class631 var13 = (class631) class436.field6487.method719(false); var13 != null; var13 = (class631) class436.field6487.method716(14)) {
            int var31 = var3 + var6 - (-((-var12 + class111.field1359 - 1) * 16) + -13);
            var12++;
            if (var10 > var2 && var2 + var4 > var10 && (var31 - 13) < var11 && (var31 + 4) > var11 && var13.field9105) {
                arg1.method394(var2, var31 - 12, var4, 16, 255 - class463.field6893 << 24 | class130.field1623, 1);
            }
        }
        if ((class498.field7253 == null || class453.field6779 == null || class287.field3978 == null) && class319.field4621.method1311(class287.field3973, (byte) -93) && class319.field4621.method1311(class118.field1473, (byte) -93) && class319.field4621.method1311(class577.field8331, (byte) -93)) {
            class372 var14 = class372.method2398(class319.field4621, class118.field1473, 0);
            class453.field6779 = arg1.method388(var14, true);
            var14.method2396();
            class160.field1971 = arg1.method388(var14, true);
            class498.field7253 = arg1.method388(class372.method2398(class319.field4621, class287.field3973, 0), true);
            class372 var15 = class372.method2398(class319.field4621, class577.field8331, 0);
            class287.field3978 = arg1.method388(var15, true);
            var15.method2396();
            class259.field3690 = arg1.method388(var15, true);
        }
        if (class498.field7253 != null && class453.field6779 != null && class287.field3978 != null) {
            int var16 = (var4 - (class287.field3978.method1570() * 2)) / class498.field7253.method1570();
            for (int var17 = 0; var17 < var16; var17++) {
                class498.field7253.method2706(var2 - (-class287.field3978.method1570() - var17 * class498.field7253.method1570()), -class498.field7253.method1576() + var3 + var5);
            }
            int var18 = (var5 - class287.field3978.method1576() - var6) / class453.field6779.method1576();
            for (int var19 = 0; var19 < var18; var19++) {
                class453.field6779.method2706(var2, var3 + var6 + var19 * class453.field6779.method1576());
                class160.field1971.method2706(var4 + var2 - class160.field1971.method1570(), class453.field6779.method1576() * var19 + var3 + var6);
            }
            class287.field3978.method2706(var2, var5 + var3 - class287.field3978.method1576());
            class259.field3690.method2706(var2 + var4 - class287.field3978.method1570(), var3 - (-var5 + class287.field3978.method1576()));
        }
        int var20 = 0;
        if (arg0 >= -76) {
            method2650(88, null);
        }
        for (class631 var21 = (class631) class436.field6487.method719(false); var21 != null; var21 = (class631) class436.field6487.method716(14)) {
            int var22 = (class111.field1359 - var20 - 1) * 16 + var3 + var6 + 13;
            int var23 = class193.field2548 | 0xFF000000;
            if (var10 > var2 && (var2 + var4) > var10 && var22 - 13 < var11 && var22 + 4 > var11 && var21.field9105) {
                var23 = class99.field1183 | 0xFF000000;
            }
            int[] var24 = null;
            if (class14.method81(var21.field9100, (byte) -102)) {
                var24 = class622.field8999.method25((int) var21.field9099, -88).field2396;
            } else if (var21.field9104 != -1) {
                var24 = class622.field8999.method25(var21.field9104, -63).field2396;
            } else if (class288.method1864((byte) -118, var21.field9100)) {
                class411 var25 = (class411) class42.field456.method524((byte) 126, (long) ((int) var21.field9099));
                if (var25 != null) {
                    class78 var26 = var25.field6254;
                    class566 var27 = var26.field864;
                    if (var27.field8121 != null) {
                        var27 = var27.method3287(109, class23.field243);
                    }
                    if (var27 != null) {
                        var24 = var27.field8136;
                    }
                }
            } else if (class513.method3048(var21.field9100, -118)) {
                Object var28 = null;
                class385 var29;
                if (var21.field9100 == 1008) {
                    var29 = class575.field8301.method1499(-7532, (int) var21.field9099);
                } else {
                    var29 = class575.field8301.method1499(-7532, (int) (var21.field9099 >>> 32 & 0x7FFFFFFFL));
                }
                if (var29.field5793 != null) {
                    var29 = var29.method2453(class23.field243, 0);
                }
                if (var29 != null) {
                    var24 = var29.field5863;
                }
            }
            String var30 = class159.method920(-12510, var21);
            if (var24 != null) {
                var30 = var30 + class177.method1000(var24, (byte) -83);
            }
            class472.field6992.method1035(class286.field3960, var30, class229.field3233, 0, 62, var22, var23, var2 + 3);
            if (var21.field9097) {
                class32.field375.method2706(class281.field3921.method2554(var30, (byte) 0) + (var2 + 5), var22 + -12);
            }
            var20++;
        }
        class651.method3717(0, class614.field8924, field6308, class291.field4026, class508.field7392);
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(I)V", line = 244)
    public class421(int arg0) {
        this.field6300 = arg0;
    }
}
