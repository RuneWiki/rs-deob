import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ea")
public abstract class class10 {

    @OriginalMember(owner = "mapview!ea", name = "r", descriptor = "Z")
    private boolean field92;

    @OriginalMember(owner = "mapview!ea", name = "d", descriptor = "Z")
    private boolean field78;

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "Ll;")
    public static class22 field77 = class33.method229("Overview", -74);

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "I")
    public static int field75 = 0;

    @OriginalMember(owner = "mapview!ea", name = "i", descriptor = "Ll;")
    public static class22 field83 = class33.method229("Enter place name to find", -104);

    @OriginalMember(owner = "mapview!ea", name = "f", descriptor = "J")
    public static long field80 = 0L;

    @OriginalMember(owner = "mapview!ea", name = "t", descriptor = "Ll;")
    public static class22 field94 = class33.method229("download", -70);

    @OriginalMember(owner = "mapview!ea", name = "m", descriptor = "Ll;")
    public static class22 field87 = class33.method229("Saw Mill", -52);

    @OriginalMember(owner = "mapview!ea", name = "h", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "mapview!ea", name = "n", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "mapview!ea", name = "o", descriptor = "I")
    public int field89;

    @OriginalMember(owner = "mapview!ea", name = "q", descriptor = "I")
    private int field91;

    @OriginalMember(owner = "mapview!ea", name = "w", descriptor = "Lfa;")
    private class12 field97;

    @OriginalMember(owner = "mapview!ea", name = "e", descriptor = "[I")
    private int[] field79;

    @OriginalMember(owner = "mapview!ea", name = "g", descriptor = "[I")
    private int[] field81;

    @OriginalMember(owner = "mapview!ea", name = "j", descriptor = "[I")
    private int[] field84;

    @OriginalMember(owner = "mapview!ea", name = "k", descriptor = "[I")
    private int[] field85;

    @OriginalMember(owner = "mapview!ea", name = "v", descriptor = "[I")
    public int[] field96;

    @OriginalMember(owner = "mapview!ea", name = "p", descriptor = "[Lfa;")
    private class12[] field90;

    @OriginalMember(owner = "mapview!ea", name = "l", descriptor = "[Ljava/lang/Object;")
    public Object[] field86;

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "[[I")
    private int[][] field76;

    @OriginalMember(owner = "mapview!ea", name = "u", descriptor = "[[I")
    private int[][] field95;

    @OriginalMember(owner = "mapview!ea", name = "s", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field93;

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(ZLl;)I", line = 5)
    public final int method41(boolean arg0, class22 arg1) {
        if (!arg0) {
            this.field93 = null;
        }
        class22 var3 = arg1.method152(0);
        return this.field97.method65(var3.method140(arg0), (byte) -117);
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(I)V", line = 54)
    public static void method42(int arg0) {
        field87 = null;
        field77 = null;
        field83 = null;
        field94 = null;
        if (arg0 >= -125) {
            method42(-1);
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(IB)V", line = 73)
    private final void method43(int arg0, byte arg1) {
        if (arg1 <= 10) {
            this.method47(-111, null, false);
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "([BI)V", line = 94)
    public final void method44(byte[] arg0, int arg1) {
        this.field91 = class32.method224(arg0.length, arg0, (byte) 111);
        class38 var3 = new class38(class16.method95(arg0, false));
        int var4 = var3.method246(-1);
        if (var4 != 5) {
            return;
        }
        int var5 = arg1;
        int var6 = var3.method246(-1);
        this.field89 = var3.method254(-1092048568);
        int var7 = -1;
        this.field96 = new int[this.field89];
        for (int var8 = 0; var8 < this.field89; var8++) {
            this.field96[var8] = var5 += var3.method254(-1092048568);
            if (var7 < this.field96[var8]) {
                var7 = this.field96[var8];
            }
        }
        this.field76 = new int[var7 + 1][];
        this.field81 = new int[var7 + 1];
        this.field93 = new Object[var7 + 1][];
        this.field85 = new int[var7 + 1];
        this.field84 = new int[var7 + 1];
        this.field86 = new Object[var7 + 1];
        if (var6 != 0) {
            this.field79 = new int[var7 + 1];
            for (int var9 = 0; var9 < this.field89; var9++) {
                this.field79[this.field96[var9]] = var3.method244(1918432520);
            }
            this.field97 = new class12(this.field79);
        }
        for (int var10 = 0; var10 < this.field89; var10++) {
            this.field84[this.field96[var10]] = var3.method244(arg1 + 1918432520);
        }
        for (int var11 = 0; var11 < this.field89; var11++) {
            this.field81[this.field96[var11]] = var3.method244(1918432520);
        }
        for (int var12 = 0; var12 < this.field89; var12++) {
            this.field85[this.field96[var12]] = var3.method254(class12.method64(arg1, -1092048568));
        }
        for (int var13 = 0; var13 < this.field89; var13++) {
            int var14 = 0;
            int var15 = this.field96[var13];
            int var16 = this.field85[var15];
            this.field76[var15] = new int[var16];
            int var17 = -1;
            for (int var18 = 0; var18 < var16; var18++) {
                int var19 = this.field76[var15][var18] = var14 += var3.method254(arg1 - 1092048568);
                if (var17 < var19) {
                    var17 = var19;
                }
            }
            this.field93[var15] = new Object[var17 + 1];
        }
        if (var6 == 0) {
            return;
        }
        this.field90 = new class12[var7 + 1];
        this.field95 = new int[var7 + 1][];
        for (int var20 = 0; var20 < this.field89; var20++) {
            int var21 = this.field96[var20];
            int var22 = this.field85[var21];
            this.field95[var21] = new int[this.field93[var21].length];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field95[var21][this.field76[var21][var23]] = var3.method244(1918432520);
            }
            this.field90[var21] = new class12(this.field95[var21]);
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(BLl;Ll;)[B", line = 240)
    public final byte[] method45(byte arg0, class22 arg1, class22 arg2) {
        if (arg0 > -9) {
            this.method46(null, -35, (byte) 113, -85);
        }
        class22 var4 = arg2.method152(0);
        class22 var5 = arg1.method152(0);
        int var6 = this.field97.method65(var4.method140(true), (byte) -109);
        int var7 = this.field90[var6].method65(var5.method140(true), (byte) -82);
        return this.method49(var7, var6, 5);
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "([IIBI)[B", line = 270)
    private final byte[] method46(int[] arg0, int arg1, byte arg2, int arg3) {
        if (arg3 < 0 || this.field93.length <= arg3 || this.field93[arg3] == null || arg1 < 0 || this.field93[arg3].length <= arg1) {
            return null;
        }
        if (this.field93[arg3][arg1] == null) {
            boolean var5 = this.method47(arg3, arg0, false);
            if (!var5) {
                this.method43(arg3, (byte) 32);
                boolean var6 = this.method47(arg3, arg0, false);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg2 != -52) {
            field75 = 13;
        }
        byte[] var7 = class17.method100(0, this.field93[arg3][arg1], false);
        if (this.field92) {
            this.field93[arg3][arg1] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(I[IZ)Z", line = 306)
    private final boolean method47(int arg0, int[] arg1, boolean arg2) {
        if (this.field86[arg0] == null) {
            return false;
        }
        int[] var4 = this.field76[arg0];
        int var5 = this.field85[arg0];
        boolean var6 = true;
        Object[] var7 = this.field93[arg0];
        if (arg2) {
            this.method49(-43, 103, -41);
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (var7[var4[var8]] == null) {
                var6 = false;
                break;
            }
        }
        if (var6) {
            return true;
        }
        byte[] var9;
        if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
            var9 = class17.method100(0, this.field86[arg0], false);
        } else {
            var9 = class17.method100(0, this.field86[arg0], true);
            class38 var10 = new class38(var9);
            var10.method252(8773, var10.field500.length, arg1, 5);
        }
        byte[] var11;
        try {
            var11 = class16.method95(var9, false);
        } catch (RuntimeException var28) {
            throw class19.method115(var28, "T3 - " + (arg1 != null) + "," + arg0 + "," + var9.length + "," + class32.method224(var9.length, var9, (byte) -124) + "," + class32.method224(var9.length - 2, var9, (byte) 119) + "," + this.field84[arg0] + "," + this.field91);
        }
        if (this.field78) {
            this.field86[arg0] = null;
        }
        if (var5 <= 1) {
            var7[var4[0]] = class16.method92(var11, -107, false);
        } else {
            int var13 = var11.length;
            int var29 = var13 - 1;
            int var14 = var11[var29] & 0xFF;
            int var15 = var29 - var14 * 4 * var5;
            class38 var16 = new class38(var11);
            int[] var17 = new int[var5];
            var16.field498 = var15;
            for (int var18 = 0; var18 < var14; var18++) {
                int var19 = 0;
                for (int var20 = 0; var20 < var5; var20++) {
                    var19 += var16.method244(1918432520);
                    var17[var20] += var19;
                }
            }
            byte[][] var21 = new byte[var5][];
            for (int var22 = 0; var22 < var5; var22++) {
                var21[var22] = new byte[var17[var22]];
                var17[var22] = 0;
            }
            var16.field498 = var15;
            int var23 = 0;
            for (int var24 = 0; var24 < var14; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var5; var26++) {
                    var25 += var16.method244(1918432520);
                    class7.method34(var11, var23, var21[var26], var17[var26], var25);
                    var23 += var25;
                    var17[var26] += var25;
                }
            }
            for (int var27 = 0; var27 < var5; var27++) {
                var7[var4[var27]] = class16.method92(var21[var27], -79, false);
            }
        }
        return true;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(B)V", line = 461)
    public static final void method48(byte arg0) {
        if (++class25.field243 >= 64) {
            class13.field144++;
            class25.field243 = 0;
            if (class13.field144 < class33.field443 >> 6) {
                class12.method63((byte) -61);
            }
        }
        if (arg0 <= -103) {
            class35.field471 = (class25.field243 << 6) + class5.field50;
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(III)[B", line = 496)
    public final byte[] method49(int arg0, int arg1, int arg2) {
        if (arg2 != 5) {
            this.field89 = -23;
        }
        return this.method46(null, arg0, (byte) -52, arg1);
    }

    @OriginalMember(owner = "mapview!ea", name = "<init>", descriptor = "(ZZ)V", line = 504)
    public class10(boolean arg0, boolean arg1) {
        this.field92 = arg1;
        this.field78 = arg0;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(IBLl;)I", line = 517)
    public final int method50(int arg0, byte arg1, class22 arg2) {
        class22 var4 = arg2.method152(0);
        int var5 = 101 / (-arg1 / 36);
        return this.field90[arg0].method65(var4.method140(true), (byte) -116);
    }
}
