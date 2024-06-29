import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class29 implements class126 {

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "Z")
    private boolean field376 = false;

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "I")
    private int field386 = 50;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "Lhi;")
    private class26 field371;

    @OriginalMember(owner = "client!mf", name = "N", descriptor = "Lhi;")
    private class26 field400;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Lw;")
    private class38 field370;

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "Lw;")
    private class38 field395;

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "[Z")
    private boolean[] field394;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "[B")
    private byte[] field367;

    @OriginalMember(owner = "client!mf", name = "D", descriptor = "[Z")
    private boolean[] field390;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "[Z")
    private boolean[] field362;

    @OriginalMember(owner = "client!mf", name = "y", descriptor = "[B")
    private byte[] field385;

    @OriginalMember(owner = "client!mf", name = "L", descriptor = "[S")
    private short[] field398;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "[Z")
    private boolean[] field382;

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "[B")
    private byte[] field391;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "[B")
    private byte[] field365;

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "[Z")
    private boolean[] field396;

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "Lmh;")
    public static class62 field387 = class201.method1405(true, "leuchten2:");

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field372 = 0;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "Z")
    public static boolean field383 = false;

    @OriginalMember(owner = "client!mf", name = "M", descriptor = "Lsk;")
    public static class199 field399 = new class199(260);

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field402 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "I")
    public static int field403 = 50;

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "Lmh;")
    public static class62 field404 = class201.method1405(true, "b12_full");

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!mf", name = "B", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!mf", name = "C", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!mf", name = "O", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(BI)I", line = 7)
    public final int method173(byte arg0, int arg1) {
        if (arg0 == -74) {
            field401++;
            return this.field398[arg1] & 0xFFFF;
        } else {
            return -123;
        }
    }

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "(II)I", line = 21)
    public static final int method174(int arg0, int arg1) {
        field368++;
        return arg0 == 255 ? arg1 & 0xFF : 31;
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(II)Z", line = 32)
    public final boolean method175(int arg0, int arg1) {
        if (arg0 != 15411) {
            this.field371 = (class26) null;
        }
        field392++;
        return this.field396[arg1];
    }

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "(II)Lmh;", line = 54)
    public static final class62 method176(int arg0, int arg1) {
        if (arg1 < 0) {
            field387 = (class62) null;
        }
        field377++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        class62 var2 = new class62();
        var2.field906 = new byte[1];
        var2.field893 = 1;
        var2.field906[0] = (byte) arg0;
        return var2;
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(BI)V", line = 78)
    public final void method177(byte arg0, int arg1) {
        if (arg0 <= 84) {
            field399 = (class199) null;
        }
        for (class91 var3 = (class91) this.field370.method259(-122); var3 != null; var3 = (class91) this.field370.method261((byte) 2)) {
            if (var3.field1435) {
                var3.method687(arg1, 0);
                var3.field1435 = false;
            }
        }
        field388++;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IFI)[I", line = 103)
    public final int[] method178(int arg0, float arg1, int arg2) {
        field375++;
        class91 var4 = this.method186(arg2, arg0 ^ arg0);
        if (var4 == null) {
            return null;
        } else {
            var4.field1435 = true;
            return var4.method679(this, this.field400, this.field376 || this.field394[arg2], arg1, arg0 - 128);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IB)I", line = 123)
    public final int method179(int arg0, byte arg1) {
        field378++;
        int var3 = 70 % ((arg1 - 26) / 63);
        return this.field385[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(BI)Z", line = 135)
    public final boolean method180(byte arg0, int arg1) {
        field384++;
        if (arg0 != 75) {
            this.field365 = (byte[]) null;
        }
        return this.field382[arg1];
    }

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "(II)I", line = 149)
    public final int method181(int arg0, int arg1) {
        if (arg1 != 255) {
            this.field382 = (boolean[]) null;
        }
        field373++;
        return this.field365[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZ)V", line = 161)
    public final void method182(int arg0, boolean arg1) {
        if (arg0 != -6354) {
            this.field382 = (boolean[]) null;
        }
        field364++;
        this.field376 = arg1;
        this.method184(arg0 + 6614);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V", line = 175)
    public final void method183(int arg0, int arg1) {
        field361++;
        class135.method1024(this.field367[arg0] & 0xFF, -96, this.field365[arg0] & 0xFF);
        boolean var3 = false;
        class91 var4 = this.method186(arg0, arg1 ^ arg1);
        if (var4 != null) {
            var3 = var4.method685(this, 89, this.field400, this.field376 || this.field394[arg0]);
        }
        if (!var3) {
            class15 var5 = this.method185(arg1 ^ 0xFFFFEFD2, arg0);
            var5.method58(false);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 203)
    public final void method184(int arg0) {
        field369++;
        this.field370.method258(arg0 ^ arg0);
        this.field395.method258(0);
    }

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "(II)Lnf;", line = 215)
    private final class15 method185(int arg0, int arg1) {
        field381++;
        class15 var3 = (class15) this.field395.method263(2013, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        class15 var4 = new class15(this.field398[arg1] & 0xFFFF);
        this.field395.method257(false, var4, (long) arg1);
        if (arg0 != 31114) {
            this.method173((byte) -59, 112);
        }
        return var4;
    }

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "(II)Lfm;", line = 237)
    private final class91 method186(int arg0, int arg1) {
        field379++;
        class91 var3 = (class91) this.field370.method263(arg1 ^ 0x7DD, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field371.method157(arg1, arg0, (byte) 19);
        if (var4 == null) {
            return null;
        } else {
            class92 var5 = new class92(var4);
            class91 var6 = new class91(var5);
            this.field370.method257(false, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)Z", line = 266)
    public final boolean method187(int arg0, int arg1) {
        field389++;
        if (arg1 != 255) {
            this.field371 = (class26) null;
        }
        class91 var3 = this.method186(arg0, 0);
        return var3 == null ? false : var3.method688(this.field400, (byte) 86, this);
    }

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "(II)I", line = 286)
    public final int method188(int arg0, int arg1) {
        field380++;
        if (arg1 != 0) {
            field372 = 81;
        }
        return this.field391[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(II)Z", line = 304)
    public final boolean method189(int arg0, int arg1) {
        field363++;
        int var3 = -49 / ((arg0 + 44) / 60);
        return this.field376 || this.field394[arg1];
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(IB)[I", line = 318)
    public final int[] method190(int arg0, byte arg1) {
        field393++;
        class91 var3 = this.method186(arg0, 0);
        if (arg1 != -10) {
            field383 = false;
        }
        return var3 == null ? null : var3.method681(this.field376 || this.field394[arg0], (byte) 33, this.field400, this);
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lhi;Lhi;Lhi;IZ)V", line = 392)
    public class29(class26 arg0, class26 arg1, class26 arg2, int arg3, boolean arg4) {
        this.field386 = arg3;
        this.field371 = arg0;
        this.field376 = arg4;
        this.field400 = arg2;
        this.field370 = new class38(this.field386);
        this.field395 = new class38(this.field386);
        class92 var6 = new class92(arg1.method157(0, 0, (byte) 19));
        int var7 = var6.method721(21);
        this.field394 = new boolean[var7];
        this.field367 = new byte[var7];
        this.field390 = new boolean[var7];
        this.field362 = new boolean[var7];
        this.field385 = new byte[var7];
        this.field398 = new short[var7];
        this.field382 = new boolean[var7];
        this.field391 = new byte[var7];
        this.field365 = new byte[var7];
        this.field396 = new boolean[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field362[var8] = var6.method702(-1) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field362[var9]) {
                this.field396[var9] = var6.method702(-1) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field362[var10]) {
                this.field382[var10] = var6.method702(-1) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field362[var11]) {
                this.field394[var11] = var6.method702(-1) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field362[var12]) {
                this.field390[var12] = var6.method702(-1) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field362[var13]) {
                this.field391[var13] = var6.method743((byte) 93);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field362[var14]) {
                this.field385[var14] = var6.method743((byte) 80);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field362[var15]) {
                this.field367[var15] = var6.method743((byte) 73);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field362[var16]) {
                this.field365[var16] = var6.method743((byte) 21);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field362[var17]) {
                this.field398[var17] = (short) var6.method721(96);
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)Z", line = 344)
    public final boolean method191(byte arg0, int arg1) {
        if (arg0 != 69) {
            this.field385 = (byte[]) null;
        }
        field397++;
        return this.field390[arg1];
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(II)I", line = 358)
    public final int method192(int arg0, int arg1) {
        if (arg1 != 255) {
            this.field370 = (class38) null;
        }
        field374++;
        return this.field367[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V", line = 378)
    public static void method193(int arg0) {
        if (arg0 != 0) {
            method174(-14, 56);
        }
        field399 = null;
        field387 = null;
        field402 = null;
        field404 = null;
    }
}
