import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class206 extends class259 {

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "[B")
    public byte[] field3685;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "Lcc;")
    public static class209 field3681 = class95.method669(120, "document)3cookie=(R");

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
    public static int field3682 = -1;

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "Lcc;")
    public static class209 field3683 = class95.method669(127, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!nb", name = "P", descriptor = "I")
    public static int field3686 = 0;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "Lcc;")
    public static class209 field3684 = class95.method669(88, "Module texte charg-B");

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "Lsj;")
    public static class49 field3687;

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "[Lsb;")
    public static class224[] field3688;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "(I)V")
    public static void method1403(int arg0) {
        field3684 = null;
        field3687 = null;
        field3683 = null;
        field3688 = null;
        field3681 = null;
        int var1 = 91 % ((-arg0 - 4) / 46);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZIII)Lcc;")
    public static final class209 method1404(boolean arg0, int arg1, int arg2, int arg3) {
        field3680++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        if (arg2 != 39) {
            method1403(-53);
        }
        int var4 = 1;
        for (int var5 = arg1 / arg3; var5 != 0; var5 /= arg3) {
            var4++;
        }
        int var6 = var4;
        if (arg1 < 0 || arg0) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg1 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg1 % arg3;
            if (var10 < 0) {
                var10 = -var10;
            }
            arg1 /= arg3;
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class209 var9 = new class209();
        var9.field3786 = var7;
        var9.field3811 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(II)Lae;")
    public static final class169 method1405(int arg0, int arg1) {
        field3679++;
        if (arg1 != 17127) {
            return null;
        }
        class169 var2 = (class169) class6.field98.method670((byte) -57, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class159.field2892.method353(arg0, 120, 0);
        class169 var4 = new class169();
        if (var3 != null) {
            var4.method1163(28, new class106(var3));
        }
        var4.method1164(false);
        class6.field98.method673((long) arg0, -5087, var4);
        return var4;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(III)I")
    public static final int method1406(int arg0, int arg1, int arg2) {
        field3676++;
        if (arg2 > arg0) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        if (arg1 >= -104) {
            return -25;
        }
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "([B)V")
    public class206(byte[] arg0) {
        this.field3685 = arg0;
    }

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(II)Lkj;")
    public static final class144 method1407(int arg0, int arg1) {
        field3678++;
        class144 var2 = (class144) class172.field3142.method1257((long) arg0, -114);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class102.field1963.method353(0, -31, arg0);
        if (var3 == null) {
            return null;
        }
        class144 var4 = new class144();
        class106 var5 = new class106(var3);
        var5.field2085 = var5.field2108.length - 2;
        int var6 = -24 % ((arg1 + 33) / 37);
        int var7 = var5.method736(122);
        int var8 = var5.field2108.length - var7 - 2 - 12;
        var5.field2085 = var8;
        int var9 = var5.method746((byte) -100);
        var4.field2670 = var5.method736(121);
        var4.field2654 = var5.method736(124);
        var4.field2656 = var5.method736(122);
        var4.field2665 = var5.method736(126);
        int var10 = var5.method774((byte) 75);
        if (var10 > 0) {
            var4.field2651 = new class255[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = var5.method736(125);
                class255 var13 = new class255(class136.method943((byte) -123, var12));
                var4.field2651[var11] = var13;
                while ((var12--) > 0) {
                    int var14 = var5.method746((byte) -100);
                    int var15 = var5.method746((byte) -100);
                    var13.method1762(new class18(var15), (long) var14, (byte) 73);
                }
            }
        }
        var5.field2085 = 0;
        var4.field2659 = var5.method778(-25187);
        var4.field2668 = new int[var9];
        var4.field2660 = new int[var9];
        var4.field2663 = new class209[var9];
        int var16 = 0;
        while (var5.field2085 < var8) {
            int var17 = var5.method736(126);
            if (var17 == 3) {
                var4.field2663[var16] = var5.method755(1);
            } else if (var17 >= 100 || var17 == 21 || var17 == 38 || var17 == 39) {
                var4.field2660[var16] = var5.method774((byte) 97);
            } else {
                var4.field2660[var16] = var5.method746((byte) -100);
            }
            var4.field2668[var16++] = var17;
        }
        class172.field3142.method1259((long) arg0, var4, false);
        return var4;
    }
}
