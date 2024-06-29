import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public abstract class class249 extends class239 {

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "Z")
    public boolean field3128 = false;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "S")
    public short field3131;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public int field3132;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public int field3122;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public int field3126;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "Lvt;")
    public static class344 field3124 = new class344("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "J")
    public static long field3129 = 0L;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILge;)Lvg;")
    public static final class75 method1522(int arg0, class551 arg1) {
        field3130++;
        class75 var2 = new class75();
        var2.field1021 = arg1.method3090(-98);
        if (arg0 == 0) {
            var2.field1024 = class548.field7632.method1438(var2.field1021, 2);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "(I)V")
    public static final void method1523(int arg0) {
        class403.field5520 = 0;
        field3127++;
        boolean var1 = class342.field4758.method3045(-126) == 1;
        int var2 = class342.field4758.method3066((byte) 101);
        int var3 = class342.field4758.method3066((byte) 101);
        int var4 = class342.field4758.method3041((byte) 123);
        class391.method2361(5466);
        class588.method3397(arg0 ^ 0xFFFFBA6A, var4);
        int var5 = (class262.field3333 - class342.field4758.field7707) / 16;
        class431.field5865 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class431.field5865[var6][var10] = class342.field4758.method3048(-4);
            }
        }
        if (arg0 != -10486) {
            field3124 = null;
        }
        class258.field3206 = new int[var5];
        class89.field1190 = new int[var5];
        class452.field6403 = new byte[var5][];
        class335.field4677 = null;
        class627.field9135 = null;
        class146.field1896 = new int[var5];
        class183.field2340 = new int[var5];
        class443.field6126 = new byte[var5][];
        class334.field4672 = new int[var5];
        class534.field7454 = new byte[var5][];
        class555.field7758 = new byte[var5][];
        int var7 = 0;
        for (int var8 = (var2 - (class139.field1760 >> 4)) / 8; var8 <= (((class139.field1760 >> 4) + var2) / 8); var8++) {
            for (int var9 = (var3 - (class369.field5135 >> 4)) / 8; var9 <= (((class369.field5135 >> 4) + var3) / 8); var9++) {
                class258.field3206[var7] = (var8 << 8) + var9;
                class334.field4672[var7] = class277.field3612.method2053((byte) 40, "m" + var8 + "_" + var9);
                class183.field2340[var7] = class277.field3612.method2053((byte) 40, "l" + var8 + "_" + var9);
                class146.field1896[var7] = class277.field3612.method2053((byte) 40, "um" + var8 + "_" + var9);
                class89.field1190[var7] = class277.field3612.method2053((byte) 40, "ul" + var8 + "_" + var9);
                var7++;
            }
        }
        class598.method3446(512, var2, var3, 10, var1);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method1524(int arg0, int arg1, boolean arg2) {
        field3125++;
        if (arg2) {
            method1527(false, 67, -83);
        }
        return (arg1 & 0x70000) != 0 | class385.method2332(arg0, arg1, (byte) -92) || class611.method3495(arg0, arg1, 4090);
    }

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "(I)V")
    public static void method1525(int arg0) {
        field3124 = null;
        if (arg0 != 45) {
            method1524(124, -112, false);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZJIII)Ljava/lang/String;")
    public static final String method1526(boolean arg0, long arg1, int arg2, int arg3, int arg4) {
        field3123++;
        char var6 = ',';
        char var7 = '.';
        if (arg3 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg3 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg1 < 0L) {
            arg1 = -arg1;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg2 < arg4) {
            for (int var10 = 0; var10 < arg4; var10++) {
                int var11 = (int) arg1;
                arg1 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg1 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg1;
            arg1 /= 10L;
            var9.append((char) (var13 + 48 - (int) arg1 * 10));
            if (arg1 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg0) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZII)Z")
    public static final boolean method1527(boolean arg0, int arg1, int arg2) {
        field3133++;
        if (arg0) {
            return false;
        } else {
            return (arg2 & 0x70000) != 0 | class111.method599(!arg0, arg1, arg2) || class313.method1969(arg1, (byte) 112, arg2);
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(IIIIZZ)V")
    public class249(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        this.field3128 = arg5;
        this.field3131 = (short) arg3;
        this.field3132 = arg1;
        this.field3122 = arg2;
        this.field3126 = arg0;
    }
}
