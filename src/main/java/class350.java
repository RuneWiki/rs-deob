import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class350 implements class15 {

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "Lgi;")
    private class487 field5381 = new class487(256);

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "Luu;")
    private class191 field5382;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "Luu;")
    private class191 field5388;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    private int field5385;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "[Lib;")
    private class107[] field5394;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public static int field5395 = 0;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "Lof;")
    public static class446 field5383 = new class446("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "Lni;")
    public static class367 field5397 = new class367(31, 8);

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "Lco;")
    public static class77 field5398 = new class77("WTI", 5);

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    public static int field5400 = -1;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "Lof;")
    public static class446 field5401 = new class446("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "Luu;")
    public static class191 field5399;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "[I")
    public static int[] field5392;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)Lib;")
    public final class107 method157(byte arg0, int arg1) {
        field5390++;
        if (arg0 < 100) {
            this.method156(-18, true, -2, 40, -0.75545096F, (byte) 36);
        }
        return this.field5394[arg1];
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public static void method2254(int arg0) {
        if (arg0 < 64) {
            field5399 = null;
        }
        field5397 = null;
        field5398 = null;
        field5392 = null;
        field5383 = null;
        field5399 = null;
        field5401 = null;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(BI)Z")
    public final boolean method160(byte arg0, int arg1) {
        field5386++;
        if (arg0 != 23) {
            field5397 = null;
        }
        class180 var3 = this.method2255(arg1, -89);
        return var3 != null && var3.method1208(this.field5382, 0, this);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IFIZIB)[F")
    public final float[] method159(int arg0, float arg1, int arg2, boolean arg3, int arg4, byte arg5) {
        int var7 = -62 % ((arg5 + 18) / 33);
        field5384++;
        return this.method2255(arg2, -41).method1206(this.field5382, this.field5394[arg2].field1511, (byte) 121, arg0, this, arg4);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)Ljl;")
    private final class180 method2255(int arg0, int arg1) {
        if (arg1 >= -2) {
            this.method159(-16, 0.3882135F, -40, false, 100, (byte) 24);
        }
        field5389++;
        class114 var3 = this.field5381.method2917(117, (long) arg0);
        if (var3 != null) {
            return (class180) var3;
        }
        byte[] var4 = this.field5388.method1289(arg0, 110);
        if (var4 == null) {
            return null;
        } else {
            class180 var5 = new class180(new class164(var4));
            this.field5381.method2916(var5, (long) arg0, -26941);
            return var5;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZIIFB)[I")
    public final int[] method156(int arg0, boolean arg1, int arg2, int arg3, float arg4, byte arg5) {
        int var7 = 65 / ((arg5 + 45) / 54);
        field5387++;
        return this.method2255(arg0, -15).method1209(this, arg1, this.field5382, (byte) -125, arg2, arg3, (double) arg4, this.field5394[arg0].field1511);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIZIF)[I")
    public final int[] method158(int arg0, int arg1, int arg2, boolean arg3, int arg4, float arg5) {
        field5396++;
        if (arg2 >= -7) {
            field5400 = -36;
        }
        return this.method2255(arg0, -41).method1210(arg1, this, (byte) -99, this.field5382, arg4, this.field5394[arg0].field1511, (double) arg5);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2256(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5393++;
        class353.method2267(arg1, -46);
        int var7 = 0;
        int var8 = arg1 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        int var10 = -arg1;
        int var11 = var8;
        int var12 = 44 / ((arg6 - 15) / 35);
        int var13 = -var8;
        int var14 = -1;
        int var15 = -1;
        int[] var16 = class466.field6955[arg5];
        int var17 = arg3 - var8;
        class221.method1489(var16, arg3 - arg1, var17, (byte) -30, arg0);
        int var18 = arg3 + var8;
        class221.method1489(var16, var17, var18, (byte) -30, arg4);
        class221.method1489(var16, var18, arg3 + arg1, (byte) -30, arg0);
        while (var7 < var9) {
            var15 += 2;
            var14 += 2;
            var10 += var14;
            var13 += var15;
            if (var13 >= 0 && var11 >= 1) {
                class78.field1124[var11] = var7;
                var11--;
                var13 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var8 <= var9) {
                    int[] var19 = class466.field6955[arg5 + var9];
                    int[] var20 = class466.field6955[arg5 - var9];
                    int var21 = arg3 + var7;
                    int var22 = arg3 - var7;
                    class221.method1489(var19, var22, var21, (byte) -30, arg0);
                    class221.method1489(var20, var22, var21, (byte) -30, arg0);
                } else {
                    int[] var23 = class466.field6955[arg5 + var9];
                    int[] var24 = class466.field6955[arg5 - var9];
                    int var25 = class78.field1124[var9];
                    int var26 = arg3 + var7;
                    int var27 = arg3 - var7;
                    int var28 = arg3 + var25;
                    int var29 = arg3 - var25;
                    class221.method1489(var23, var27, var29, (byte) -30, arg0);
                    class221.method1489(var23, var29, var28, (byte) -30, arg4);
                    class221.method1489(var23, var28, var26, (byte) -30, arg0);
                    class221.method1489(var24, var27, var29, (byte) -30, arg0);
                    class221.method1489(var24, var29, var28, (byte) -30, arg4);
                    class221.method1489(var24, var28, var26, (byte) -30, arg0);
                }
                var10 -= var9 << 1;
            }
            int[] var30 = class466.field6955[arg5 + var7];
            int[] var31 = class466.field6955[arg5 - var7];
            int var32 = arg3 + var9;
            int var33 = arg3 - var9;
            if (var8 <= var7) {
                class221.method1489(var30, var33, var32, (byte) -30, arg0);
                class221.method1489(var31, var33, var32, (byte) -30, arg0);
            } else {
                int var34 = var11 >= var7 ? var11 : class78.field1124[var7];
                int var35 = arg3 + var34;
                int var36 = arg3 - var34;
                class221.method1489(var30, var33, var36, (byte) -30, arg0);
                class221.method1489(var30, var36, var35, (byte) -30, arg4);
                class221.method1489(var30, var35, var32, (byte) -30, arg0);
                class221.method1489(var31, var33, var36, (byte) -30, arg0);
                class221.method1489(var31, var36, var35, (byte) -30, arg4);
                class221.method1489(var31, var35, var32, (byte) -30, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Luu;Luu;Luu;)V")
    public class350(class191 arg0, class191 arg1, class191 arg2) {
        this.field5382 = arg2;
        this.field5388 = arg1;
        class164 var4 = new class164(arg0.method1281(0, 0, 83));
        this.field5385 = var4.method1074(-635989152);
        this.field5394 = new class107[this.field5385];
        for (int var5 = 0; var5 < this.field5385; var5++) {
            if (var4.method1087(false) == 1) {
                this.field5394[var5] = new class107();
            }
        }
        for (int var6 = 0; var6 < this.field5385; var6++) {
            if (this.field5394[var6] != null) {
                this.field5394[var6].field1515 = var4.method1087(false) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field5385; var7++) {
            if (this.field5394[var7] != null) {
                this.field5394[var7].field1522 = var4.method1087(false) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field5385; var8++) {
            if (this.field5394[var8] != null) {
                this.field5394[var8].field1516 = var4.method1087(false) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field5385; var9++) {
            if (this.field5394[var9] != null) {
                this.field5394[var9].field1517 = var4.method1087(false) == 1;
            }
        }
        for (int var10 = 0; var10 < this.field5385; var10++) {
            if (this.field5394[var10] != null) {
                this.field5394[var10].field1505 = var4.method1088((byte) 117);
            }
        }
        for (int var11 = 0; var11 < this.field5385; var11++) {
            if (this.field5394[var11] != null) {
                this.field5394[var11].field1518 = var4.method1088((byte) -90);
            }
        }
        for (int var12 = 0; var12 < this.field5385; var12++) {
            if (this.field5394[var12] != null) {
                this.field5394[var12].field1506 = var4.method1088((byte) -122);
            }
        }
        for (int var13 = 0; var13 < this.field5385; var13++) {
            if (this.field5394[var13] != null) {
                this.field5394[var13].field1524 = var4.method1088((byte) 85);
            }
        }
        for (int var14 = 0; var14 < this.field5385; var14++) {
            if (this.field5394[var14] != null) {
                this.field5394[var14].field1499 = (short) var4.method1074(-635989152);
            }
        }
        for (int var15 = 0; var15 < this.field5385; var15++) {
            if (this.field5394[var15] != null) {
                this.field5394[var15].field1520 = var4.method1088((byte) -103);
            }
        }
        for (int var16 = 0; var16 < this.field5385; var16++) {
            if (this.field5394[var16] != null) {
                this.field5394[var16].field1507 = var4.method1088((byte) 58);
            }
        }
        for (int var17 = 0; var17 < this.field5385; var17++) {
            if (this.field5394[var17] != null) {
                this.field5394[var17].field1509 = var4.method1087(false) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field5385; var18++) {
            if (this.field5394[var18] != null) {
                this.field5394[var18].field1511 = var4.method1087(false) == 1;
            }
        }
        for (int var19 = 0; var19 < this.field5385; var19++) {
            if (this.field5394[var19] != null) {
                this.field5394[var19].field1504 = var4.method1088((byte) -87);
            }
        }
        for (int var20 = 0; var20 < this.field5385; var20++) {
            if (this.field5394[var20] != null) {
                this.field5394[var20].field1510 = var4.method1087(false) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field5385; var21++) {
            if (this.field5394[var21] != null) {
                this.field5394[var21].field1514 = var4.method1087(false) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field5385; var22++) {
            if (this.field5394[var22] != null) {
                this.field5394[var22].field1500 = var4.method1087(false) == 1;
            }
        }
        for (int var23 = 0; var23 < this.field5385; var23++) {
            if (this.field5394[var23] != null) {
                this.field5394[var23].field1512 = var4.method1087(false);
            }
        }
        for (int var24 = 0; var24 < this.field5385; var24++) {
            if (this.field5394[var24] != null) {
                this.field5394[var24].field1513 = var4.method1099(-108);
            }
        }
        for (int var25 = 0; var25 < this.field5385; var25++) {
            if (this.field5394[var25] != null) {
                this.field5394[var25].field1521 = var4.method1087(false) == 1;
            }
        }
    }
}
