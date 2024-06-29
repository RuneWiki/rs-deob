import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class78 {

    @OriginalMember(owner = "client!di", name = "b", descriptor = "[I")
    public static int[] field1380 = new int[4];

    @OriginalMember(owner = "client!di", name = "e", descriptor = "Lbg;")
    public static class310 field1383 = new class310(48, 11);

    @OriginalMember(owner = "client!di", name = "i", descriptor = "[[B")
    public static byte[][] field1387 = new byte[1000][];

    @OriginalMember(owner = "client!di", name = "h", descriptor = "[Z")
    public static boolean[] field1386 = new boolean[100];

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "Lcd;")
    public class198 field1385;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "Lh;")
    public class452 field1381;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "[S")
    public static short[] field1390;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([IIIII)V")
    public static final void method566(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field1384++;
        arg4--;
        int var6 = arg1 - 1;
        int var5 = var6 - 7;
        while (arg4 < var5) {
            int var7 = arg4 + 1;
            arg0[var7] = arg2;
            int var8 = var7 + 1;
            arg0[var8] = arg2;
            int var9 = var8 + 1;
            arg0[var9] = arg2;
            int var10 = var9 + 1;
            arg0[var10] = arg2;
            int var11 = var10 + 1;
            arg0[var11] = arg2;
            int var12 = var11 + 1;
            arg0[var12] = arg2;
            int var13 = var12 + 1;
            arg0[var13] = arg2;
            arg4 = var13 + 1;
            arg0[arg4] = arg2;
        }
        while (var6 > arg4) {
            arg4++;
            arg0[arg4] = arg2;
        }
        if (arg3 != -7) {
            method566(null, 34, 31, 17, -75);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IBI)Z")
    public static final boolean method567(int arg0, byte arg1, int arg2) {
        field1388++;
        if (arg1 >= -105) {
            return false;
        } else if (class98.method743(0, arg2, arg0)) {
            return (arg0 & 0xB000) != 0 | class496.method2984(arg2, arg0, (byte) 69) | class476.method2866(arg0, (byte) -99, arg2) ? true : (class264.method1609(876, arg0, arg2) | class143.method940(24662, arg0, arg2)) & (arg2 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZIBZI)I")
    public static final int method568(boolean arg0, int arg1, byte arg2, boolean arg3, int arg4) {
        field1382++;
        class146 var5 = class478.method2889(arg4, (byte) 27, arg0);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5.field2367.length; var7++) {
            if (var5.field2367[var7] >= 0 && class288.field4362.field7659 > var5.field2367[var7]) {
                class182 var8 = class288.field4362.method3030((byte) 67, var5.field2367[var7]);
                int var9 = var8.method1136(12604, arg1, class76.field1364.method1267((byte) 41, arg1).field1423);
                if (arg3) {
                    var6 += var5.field2359[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        if (arg2 <= 114) {
            field1390 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V")
    public static void method569(byte arg0) {
        field1387 = null;
        field1386 = null;
        field1383 = null;
        field1390 = null;
        field1380 = null;
        if (arg0 >= -107) {
            method569((byte) -80);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IC)Z")
    public static final boolean method570(int arg0, char arg1) {
        field1379++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class320.field4811;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        if (arg0 != 160) {
            method569((byte) -2);
        }
        return false;
    }

    static {
        new class423("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
    }
}
