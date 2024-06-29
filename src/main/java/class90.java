import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class90 extends class687 {

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "[Ljava/lang/String;")
    private static final String[] field1268 = new String[] { method892(method891("&FML\f")), method892(method891("&FMK\f")), method892(method891("=V\u000fc")), method892(method891("&FMN\f")), method892(method891("(\rM!Y")) };

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "[I")
    public static int[] field1258 = new int[250];

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "Z")
    public static boolean field1260 = false;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "I")
    public int field1253;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "I")
    public int field1256;

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
    public int field1259;

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "I")
    public int field1263;

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
    public int field1264;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
    public int field1265;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "Lop;")
    public class574 field1250;

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "Ljava/lang/String;")
    public String field1255;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "[I")
    public int[] field1251;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "[I")
    public int[] field1261;

    @OriginalMember(owner = "client!ue", name = "F", descriptor = "[J")
    public long[] field1266;

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "[Ldfa;")
    public class477[] field1254;

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "[Ljava/lang/String;")
    public String[] field1267;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V", line = 8)
    public static final void method887(int arg0) {
        try {
            class451.field6612.method4681(1, class451.field6612.field9136, (byte) -111);
            field1252++;
            class451.field6612.method4681(1, class451.field6612.field9089, (byte) -111);
            class451.field6612.method4681(2, class451.field6612.field9118, (byte) -111);
            if (arg0 != 250) {
                method888(true);
            }
            class451.field6612.method4681(2, class451.field6612.field9135, (byte) -111);
            class451.field6612.method4681(1, class451.field6612.field9091, (byte) -111);
            class451.field6612.method4681(1, class451.field6612.field9101, (byte) -111);
            class451.field6612.method4681(1, class451.field6612.field9096, (byte) -111);
            class451.field6612.method4681(1, class451.field6612.field9097, (byte) -111);
            class451.field6612.method4681(1, class451.field6612.field9109, (byte) -111);
            class451.field6612.method4681(1, class451.field6612.field9092, (byte) -111);
            class451.field6612.method4681(1, class451.field6612.field9113, (byte) -111);
            class451.field6612.method4681(1, class451.field6612.field9127, (byte) -111);
            class451.field6612.method4681(0, class451.field6612.field9105, (byte) -111);
            class451.field6612.method4681(1, class451.field6612.field9114, (byte) -111);
            class451.field6612.method4681(0, class451.field6612.field9116, (byte) -111);
            class451.field6612.method4681(0, class451.field6612.field9132, (byte) -111);
            class451.field6612.method4681(1, class451.field6612.field9120, (byte) -111);
            class451.field6612.method4681(0, class451.field6612.field9122, (byte) -111);
            class451.field6612.method4681(0, class451.field6612.field9130, (byte) -111);
            class451.field6612.method4681(1, class451.field6612.field9117, (byte) -111);
            class309.method2463(arg0 ^ 0xFFFFFF04);
            class451.field6612.method4681(1, class451.field6612.field9090, (byte) -111);
            class451.field6612.method4681(3, class451.field6612.field9103, (byte) -111);
            class139.method1214((byte) -118);
            class180.method1498((byte) 74);
            class381.field5555 = true;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1268[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V", line = 58)
    public static void method888(boolean arg0) {
        try {
            if (arg0) {
                field1258 = null;
            }
            field1258 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1268[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Llaa;Z)Z", line = 70)
    public static final boolean method889(class604 arg0, boolean arg1) {
        boolean var2 = class677.field9474 == class107.field1413;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method1427((byte) 109);
        if (arg0.field8663 < 0 || arg0.field8669 < 0 || arg0.field8666 >= class508.field7455 || arg0.field8661 >= class700.field9795) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field8663; var7 <= arg0.field8666; var7++) {
            for (int var11 = arg0.field8669; var11 <= arg0.field8661; var11++) {
                class621 var12 = class598.method4412(arg0.field2981, var7, var11);
                if (var12 != null) {
                    class219 var13 = class383.method3018(true, arg0);
                    class219 var14 = var12.field8841;
                    if (var14 == null) {
                        var12.field8841 = var13;
                    } else {
                        while (var14.field3190 != null) {
                            var14 = var14.field3190;
                        }
                        var14.field3190 = var13;
                    }
                    if (var2 && (class787.field11366[var7][var11] & 0xFF000000) != 0) {
                        var3 = class787.field11366[var7][var11];
                        var4 = class727.field10425[var7][var11];
                        var5 = class492.field7207[var7][var11];
                    }
                    if (!arg1 && var12.field8850 != null && var12.field8850.field1543 > var6) {
                        var6 = var12.field8850.field1543;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field8663; var8 <= arg0.field8666; var8++) {
                for (int var9 = arg0.field8669; var9 <= arg0.field8661; var9++) {
                    if ((class787.field11366[var8][var9] & 0xFF000000) == 0) {
                        class787.field11366[var8][var9] = var3;
                        class727.field10425[var8][var9] = var4;
                        class492.field7207[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class640.field9121[class433.field6273++] = arg0;
        } else {
            int var10 = class677.field9474 == class107.field1413 ? 1 : 0;
            if (!arg0.method582(false)) {
                arg0.field2977 = class391.field5707[var10];
                class391.field5707[var10] = arg0;
            } else if (arg0.method579(false)) {
                arg0.field2977 = class210.field3050[var10];
                class210.field3050[var10] = arg0;
            } else {
                arg0.field2977 = class563.field8239[var10];
                class563.field8239[var10] = arg0;
                class710.field9925 = true;
            }
        }
        if (arg1) {
            arg0.field2975 -= var6;
        }
        return true;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ldaa;I)V", line = 197)
    public static final void method890(class226 arg0, int arg1) {
        try {
            class505.field7397 = arg0;
            if (arg1 != 21900) {
                field1257 = 50;
            }
            field1262++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1268[3] + (arg0 == null ? field1268[2] : field1268[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method891(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x24);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method892(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 83;
                    break;
                case 1:
                    var10005 = 35;
                    break;
                case 2:
                    var10005 = 99;
                    break;
                case 3:
                    var10005 = 15;
                    break;
                default:
                    var10005 = 36;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
