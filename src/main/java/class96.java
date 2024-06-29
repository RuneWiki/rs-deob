import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class96 {

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Z")
    public boolean field1445 = false;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public int field1449 = -1;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "[I")
    private int[] field1452 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Z")
    public static boolean field1442 = true;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field1446 = 0;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1443 = "Loading config - ";

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public static int field1454 = 2;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "[I")
    public static int[] field1461 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    public static int field1456 = 1;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "Ljj;")
    public static class134 field1451;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "[I")
    private int[] field1457;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "[S")
    private short[] field1444;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "[S")
    private short[] field1448;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "[S")
    private short[] field1455;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "[S")
    private short[] field1459;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "[[[I")
    public static int[][][] field1453;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIB)V")
    public static final void method686(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class204 var5 = (class204) class78.field1067.method457((long) arg1, (byte) -115);
        field1450++;
        if (var5 == null) {
            var5 = new class204();
            class78.field1067.method466((long) arg1, var5, (byte) 93);
        }
        int var6 = -53 % ((-arg4 - 39) / 63);
        if (arg0 >= var5.field3276.length) {
            int[] var7 = new int[arg0 + 1];
            int[] var8 = new int[arg0 + 1];
            for (int var9 = 0; var9 < var5.field3276.length; var9++) {
                var7[var9] = var5.field3276[var9];
                var8[var9] = var5.field3274[var9];
            }
            for (int var10 = var5.field3276.length; var10 < arg0; var10++) {
                var7[var10] = -1;
                var8[var10] = 0;
            }
            var5.field3274 = var8;
            var5.field3276 = var7;
        }
        var5.field3276[arg0] = arg2;
        var5.field3274[arg0] = arg3;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)Z")
    public final boolean method687(boolean arg0) {
        boolean var2 = true;
        field1464++;
        if (arg0) {
            return false;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1452[var3] != -1 && !class162.field2631.method934(0, (byte) 97, this.field1452[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static void method688(int arg0) {
        field1461 = null;
        if (arg0 != 4) {
            method688(100);
        }
        field1443 = null;
        field1451 = null;
        field1453 = null;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)Z")
    public final boolean method689(int arg0) {
        field1447++;
        if (this.field1457 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field1457.length; var3++) {
            if (!class162.field2631.method934(0, (byte) 70, this.field1457[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)Lrk;")
    public final class158 method690(int arg0) {
        field1465++;
        int var2 = 0;
        class158[] var3 = new class158[5];
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1452[var4] != -1) {
                var3[var2++] = class158.method1076(class162.field2631, this.field1452[var4], 0);
            }
        }
        class158 var5 = new class158(var3, var2);
        if (this.field1455 != null) {
            for (int var6 = 0; var6 < this.field1455.length; var6++) {
                var5.method1089(this.field1455[var6], this.field1459[var6]);
            }
        }
        if (arg0 != -5476) {
            field1442 = false;
        }
        if (this.field1448 != null) {
            for (int var7 = 0; var7 < this.field1448.length; var7++) {
                var5.method1065(this.field1448[var7], this.field1444[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BILhi;)V")
    private final void method691(byte arg0, int arg1, class264 arg2) {
        field1460++;
        if (arg1 == 1) {
            this.field1449 = arg2.method1779(-73);
        } else if (arg1 == 2) {
            int var4 = arg2.method1779(-92);
            this.field1457 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1457[var5] = arg2.method1777(-55);
            }
        } else if (arg1 == 3) {
            this.field1445 = true;
        } else if (arg1 == 40) {
            int var6 = arg2.method1779(-91);
            this.field1459 = new short[var6];
            this.field1455 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1455[var7] = (short) arg2.method1777(-59);
                this.field1459[var7] = (short) arg2.method1777(-121);
            }
        } else if (arg1 == 41) {
            int var8 = arg2.method1779(-69);
            this.field1448 = new short[var8];
            this.field1444 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1448[var9] = (short) arg2.method1777(-37);
                this.field1444[var9] = (short) arg2.method1777(-40);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1452[arg1 - 60] = arg2.method1777(-38);
        }
        if (arg0 <= 86) {
            this.field1459 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljj;ZI)[Lvl;")
    public static final class68[] method692(class134 arg0, boolean arg1, int arg2) {
        field1458++;
        if (arg1) {
            return null;
        } else if (class72.method555((byte) 38, arg2, arg0)) {
            return class159.method1096(72);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)Lrk;")
    public final class158 method693(int arg0) {
        field1463++;
        if (this.field1457 == null) {
            return null;
        }
        class158[] var2 = new class158[this.field1457.length];
        for (int var3 = arg0; var3 < this.field1457.length; var3++) {
            var2[var3] = class158.method1076(class162.field2631, this.field1457[var3], 0);
        }
        class158 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class158(var2, var2.length);
        }
        if (this.field1455 != null) {
            for (int var5 = 0; var5 < this.field1455.length; var5++) {
                var4.method1089(this.field1455[var5], this.field1459[var5]);
            }
        }
        if (this.field1448 != null) {
            for (int var6 = 0; var6 < this.field1448.length; var6++) {
                var4.method1065(this.field1448[var6], this.field1444[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lhi;B)V")
    public final void method694(class264 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1779(arg1 ^ 0x11);
            if (var3 == 0) {
                field1462++;
                if (arg1 != -102) {
                    method688(7);
                    return;
                }
                return;
            }
            this.method691((byte) 113, var3, arg0);
        }
    }
}
