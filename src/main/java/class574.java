import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class574 implements class116 {

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    public int field8306;

    @OriginalMember(owner = "client!op", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8313 = new String[] { method4274(method4273("GCz\u001e")), method4274(method4273("FF8NZG_bL\u001b")), method4274(method4273("R\u00188\\N")), method4274(method4273("FF86\u001b")), method4274(method4273("FF81\u001b")), method4274(method4273("FF8\u0006\\zBd\u001b]N\u001e")), method4274(method4273("FF83\u001b")), method4274(method4273("FF80\u001b")) };

    @OriginalMember(owner = "client!op", name = "e", descriptor = "Ltf;")
    public static class524 field8309 = new class524();

    @OriginalMember(owner = "client!op", name = "f", descriptor = "I")
    public static int field8311 = 0;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "I")
    public static int field8307;

    @OriginalMember(owner = "client!op", name = "d", descriptor = "I")
    public static int field8308;

    @OriginalMember(owner = "client!op", name = "g", descriptor = "I")
    public static int field8310;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "I")
    public static int field8312;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V")
    public static void method4269(byte arg0) {
        try {
            field8309 = null;
            if (arg0 != 37) {
                method4270(-46, -95, 47, 87, -47, 8);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8313[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIIII)V")
    public static final void method4270(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            class86.field1220 = arg4;
            class793.field11530 = arg5;
            class2.field28 = arg3;
            class369.field5338 = arg0;
            class105.field1378 = arg1;
            if (arg2 == 16383) {
                field8308++;
                if (class369.field5338 >= 100) {
                    int var6 = class105.field1378 * 512 + 256;
                    int var7 = class86.field1220 * 512 + 256;
                    int var8 = class100.method977(-1, var7, class693.field9689, var6) - class793.field11530;
                    int var9 = var6 - class670.field9442;
                    int var10 = var8 - class525.field7650;
                    int var11 = var7 - class688.field9635;
                    int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
                    class355.field5151 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
                    class57.field802 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
                    class282.field3974 = 0;
                    if (class355.field5151 < 1024) {
                        class355.field5151 = 1024;
                    }
                    if (class355.field5151 > 3072) {
                        class355.field5151 = 3072;
                    }
                }
                class301.field4188 = -1;
                class171.field2267 = -1;
                class596.field8579 = 2;
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field8313[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(BLvo;II)V")
    public static final void method4271(byte arg0, class782 arg1, int arg2, int arg3) {
        try {
            field8310++;
            if (class543.field7943 == null && !class86.field1217 && arg1 != null && class288.method2337(arg1, 1) != null) {
                class543.field7943 = arg1;
                class198.field2936 = class288.method2337(arg1, 1);
                class527.field7667 = arg3;
                if (arg0 != -99) {
                    field8311 = -62;
                }
                class41.field621 = 0;
                class738.field10511 = arg2;
                class674.field9466 = false;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8313[6] + arg0 + ',' + (arg1 == null ? field8313[0] : field8313[2]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!op", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field8307++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8313[5] + ')');
        }
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class574(String arg0, int arg1) {
        try {
            this.field8306 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8313[1] + (arg0 == null ? field8313[0] : field8313[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
    public static final void method4272(int arg0) {
        try {
            for (class87 var1 = (class87) class317.field4344.method3611(arg0 ^ 0xFFFFFF87); var1 != null; var1 = (class87) class317.field4344.method3611(-124)) {
                class303.method2438(var1, 8);
            }
            field8312++;
            int var2;
            int var3;
            if (class451.field6612.field9089.method5427(arg0) == 1) {
                var2 = 0;
                var3 = 3;
            } else {
                var3 = class475.field6973;
                var2 = class475.field6973;
            }
            client.method4971();
            if (arg0 != 3) {
                method4270(-82, -13, 126, -56, 92, -100);
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                client.method4955();
                client.method4978(var4);
                client.method4959(var4);
            }
            client.method4958();
            client.method4975();
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field8313[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!op", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4273(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x33);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!op", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4274(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 41;
                    break;
                case 1:
                    var10005 = 54;
                    break;
                case 2:
                    var10005 = 22;
                    break;
                case 3:
                    var10005 = 114;
                    break;
                default:
                    var10005 = 51;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
