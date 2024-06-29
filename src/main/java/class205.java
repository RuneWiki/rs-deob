import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class205 extends class114 {

    @OriginalMember(owner = "client!qh", name = "R", descriptor = "[Lrf;")
    public class84[] field3519;

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "[[I")
    public static int[][] field3508 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
    public static int field3515 = 0;

    @OriginalMember(owner = "client!qh", name = "P", descriptor = "Lia;")
    public static class257 field3517 = class28.method234(114, "(U5");

    @OriginalMember(owner = "client!qh", name = "Q", descriptor = "Lia;")
    public static class257 field3518 = class28.method234(86, ")3)3)3");

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "Lia;")
    public static class257 field3511 = class28.method234(-110, "mapscene");

    @OriginalMember(owner = "client!qh", name = "U", descriptor = "Lia;")
    private static class257 field3522 = class28.method234(-31, "http:)4)4");

    @OriginalMember(owner = "client!qh", name = "V", descriptor = "Lw;")
    public static class82 field3523 = new class82(64);

    @OriginalMember(owner = "client!qh", name = "W", descriptor = "Lwi;")
    public static class131 field3524 = new class131(5000);

    @OriginalMember(owner = "client!qh", name = "H", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!qh", name = "S", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!qh", name = "T", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "Lmb;")
    public static class178 field3510;

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "[I")
    public static int[] field3514;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
    public static void method1375(boolean arg0) {
        if (!arg0) {
            field3518 = null;
        }
        field3510 = null;
        field3523 = null;
        field3518 = null;
        field3508 = null;
        field3511 = null;
        field3524 = null;
        field3514 = null;
        field3522 = null;
        field3517 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIZ)I")
    public static final int method1376(int arg0, int arg1, boolean arg2) {
        int var3 = arg0 * 57 + arg1;
        int var4 = var3 ^ var3 << 13;
        if (arg2) {
            field3510 = null;
        }
        field3520++;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return (var5 & 0x7FD9556) >> 19;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)V")
    public static final void method1377(int arg0, byte arg1) {
        field3513++;
        if (arg1 < 24) {
            method1377(-94, (byte) -30);
        }
        class202 var2 = class222.method1466(2, -84, arg0);
        var2.method1355(110);
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)Lia;")
    public static final class257 method1378(byte arg0) {
        field3509++;
        if (arg0 != -28) {
            return null;
        }
        class257 var1 = class131.field2352;
        if (class165.field2879 != 0) {
            var1 = class104.field1935;
        }
        return class233.method1528(new class257[] { field3522, var1, class249.field4300, class111.method808(10, class227.field3822), class90.field1731, class111.method808(10, class225.field3779), class146.field2544 }, 0);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BB)I")
    public static final int method1379(byte arg0, byte arg1) {
        field3521++;
        if (arg0 >= 65 && arg0 <= 90) {
            return arg0 - 65;
        }
        if (arg1 >= -7) {
            field3508 = null;
        }
        if (arg0 >= 97 && arg0 <= 122) {
            return arg0 - 71;
        } else if (arg0 >= 48 && arg0 <= 57) {
            return arg0 + 52 - 48;
        } else if (arg0 == 43) {
            return 62;
        } else if (arg0 == 42) {
            return 62;
        } else if (arg0 == 47) {
            return 63;
        } else if (arg0 == 45) {
            return 63;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lmb;Lmb;IZ)V")
    public class205(class178 arg0, class178 arg1, int arg2, boolean arg3) {
        class33 var5 = new class33();
        int var6 = arg0.method1220((byte) -63, arg2);
        this.field3519 = new class84[var6];
        int[] var7 = arg0.method1226(arg2, (byte) 76);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1197(var7[var8], arg2, -2);
            class136 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class136 var12 = (class136) var5.method288(26111); var12 != null; var12 = (class136) var5.method277(1)) {
                if (var12.field2428 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1216(0, var11, (byte) -23);
                } else {
                    var13 = arg1.method1216(var11, 0, (byte) -23);
                }
                var10 = new class136(var11, var13);
                var5.method287(var10, 0);
            }
            this.field3519[var7[var8]] = new class84(var9, var10);
        }
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(II)Z")
    public final boolean method1380(int arg0, int arg1) {
        field3516++;
        if (arg1 != 651) {
            this.field3519 = null;
        }
        return this.field3519[arg0].field1651;
    }
}
