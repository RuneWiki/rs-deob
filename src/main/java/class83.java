import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class83 {

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    private int field1359;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    private int field1362;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    private int field1357;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "Z")
    private boolean field1356;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    private int field1361;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    private int field1363;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    private int field1352;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    private int field1346;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "[I")
    private static int[] field1360 = new int[4];

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    private int field1348;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    private int field1349;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    private int field1353;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    private int field1354;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    public int field1358;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "Lr;")
    private static class157 field1347;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "Lha;")
    private class52 field1350;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "Lha;")
    private static class52 field1351;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "Lha;")
    private static class52 field1355;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lqa;Lal;)Z")
    public final boolean method629(class207 arg0, class83 arg1) {
        return this.field1350 != null || this.method639(arg0, arg1);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lqa;)V")
    private static final void method630(class207 arg0) {
        if (field1351 != null) {
            return;
        }
        int[] var1 = new int[16384];
        int[] var2 = new int[16384];
        for (int var3 = 0; var3 < 64; var3++) {
            int var4 = 64 - var3;
            int var5 = var4 * var4;
            int var6 = 128 - var3 - 1;
            int var7 = var3 * 128;
            int var8 = var6 * 128;
            for (int var9 = 0; var9 < 64; var9++) {
                int var10 = 64 - var9;
                int var11 = var10 * var10;
                int var12 = 128 - var9 - 1;
                int var13 = 256 - (var5 + var11 << 8) / 4096;
                int var14 = var13 * 16 * 192 / 1536;
                if (var14 < 0) {
                    var14 = 0;
                } else if (var14 > 255) {
                    var14 = 255;
                }
                int var15 = var14 / 2;
                var2[var7 + var9] = var2[var7 + var12] = var2[var8 + var9] = var2[var8 + var12] = var14 | 0xFF00 << 16;
                var1[var7 + var9] = var1[var7 + var12] = var1[var8 + var9] = var1[var8 + var12] = 127 - var15 << 24 | 0xFFFFFF;
            }
        }
        field1351 = arg0.method1363(var2, 0, 128, 128, 128);
        field1355 = arg0.method1363(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "()V")
    public static final void method631() {
        field1347 = null;
        field1351 = null;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "()V")
    public final void method632() {
        this.field1350 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII)Z")
    public final boolean method633(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field1356) {
            this.field1358 = 1073741823;
            var8 = this.field1359;
            var9 = this.field1362;
            var10 = this.field1357;
        } else {
            int var5 = this.field1359 - arg0;
            int var6 = this.field1362 - arg1;
            int var7 = this.field1357 - arg2;
            this.field1358 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field1358 == 0) {
                this.field1358 = 1;
            }
            var8 = (var5 << 8) / this.field1358;
            var9 = (var6 << 8) / this.field1358;
            var10 = (var7 << 8) / this.field1358;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field1354 = this.field1352 * arg3 / (this.field1356 ? 1024 : this.field1358);
        } else {
            this.field1354 = 0;
        }
        if (this.field1354 < 8) {
            this.field1350 = null;
            return false;
        }
        int var12 = class32.method326(this.field1354, false);
        if (var12 > arg3) {
            var12 = class327.method2020(-1594581311, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field1348 != var12) {
            this.field1348 = var12;
        }
        this.field1349 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field1353 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field1350 = null;
        return true;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lqa;IIIIII)V")
    public final void method634(class207 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field1350 == null) {
            return;
        }
        int var8 = this.field1349 - arg5 & 0x3FFF;
        int var9 = this.field1353 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field1354) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field1354) / 2;
        if (var10 < arg4 && this.field1354 + var10 > 0 && var11 < arg3 && this.field1354 + var11 > 0) {
            this.field1350.method499(arg1 + var11, arg2 + var10, this.field1354, this.field1354);
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(Lqa;Lal;)V")
    private final void method635(class207 arg0, class83 arg1) {
        method637(arg0);
        method630(arg0);
        arg0.method1350(field1360);
        arg0.method1308(0, 0, this.field1348, this.field1348);
        arg0.method1265();
        arg0.method1321(0, 0, this.field1348, this.field1348, this.field1363 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field1356) {
                var3 = -arg1.field1359;
                var4 = -arg1.field1362;
                var5 = -arg1.field1357;
            } else {
                var3 = arg1.field1359 - this.field1359;
                var4 = arg1.field1362 - this.field1362;
                var5 = arg1.field1357 - this.field1357;
            }
        }
        if (this.field1349 != 0) {
            int var6 = class1.field2[this.field1349];
            int var7 = class1.field7[this.field1349];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field1353 != 0) {
            int var9 = class1.field2[this.field1353];
            int var10 = class1.field7[this.field1353];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class157 var12 = field1347.method163((byte) 0, 51200, true);
        if (arg0.method1305()) {
            var12.method130((short) 0, (short) this.field1361);
        } else {
            var12.method137((short) 127, class58.field1057.method190((byte) -89, this.field1361).field2967);
            var12.method130((short) 0, (short) -1);
        }
        arg0.method1295(1.0F);
        arg0.method1298(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field1348 * 1024 / (var12.method148() - var12.method139());
        if (this.field1363 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method1365(this.field1348 / 2, this.field1348 / 2, var13, var13);
        arg0.method1355(arg0.method1318());
        class163 var14 = arg0.method1318();
        var14.method1054(0, 0, arg0.method1301() - var12.method135());
        var12.method127(var14, null, 1024, 1);
        int var15 = this.field1348 * 13 / 16;
        int var16 = (this.field1348 - var15) / 2;
        field1355.method423(var16, var16, var15, var15, 0, this.field1363 | 0xFF000000, 1);
        this.field1350 = arg0.method1300(0, 0, this.field1348, this.field1348, true);
        arg0.method1265();
        arg0.method1321(0, 0, this.field1348, this.field1348, 0, 0);
        field1351.method423(0, 0, this.field1348, this.field1348, 1, 0, 0);
        this.field1350.method502(0, 0, 0);
        arg0.method1308(field1360[0], field1360[1], field1360[2], field1360[3]);
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "()V")
    public static void method636() {
        field1347 = null;
        field1355 = null;
        field1351 = null;
        field1360 = null;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(Lqa;)V")
    private static final void method637(class207 arg0) {
        if (field1347 != null) {
            return;
        }
        class317 var1 = new class317(580, 1104, 1);
        var1.method1977((byte) 66, (short) 32767, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (short) 0, (short) 0, (byte) 0, (byte) 0);
        var1.method1980(0, 0, (byte) -49, 128);
        var1.method1980(0, 0, (byte) -49, -128);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class1.field2[var3];
            int var5 = class1.field7[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class1.field7[var12] >> 8;
                int var14 = class1.field2[var12] * var4 >> 23;
                int var15 = class1.field2[var12] * var5 >> 23;
                var1.method1980(var15, -var14, (byte) -49, var13);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method1974(-77, var7, (byte) 0, (short) 0, (short) 127, (byte) 0, 0, var8, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method1974(-117, var7, (byte) 0, (short) 0, (short) 127, (byte) 0, var8, var10, (byte) 0);
                    var1.method1974(-95, var7, (byte) 0, (short) 0, (short) 127, (byte) 0, var10, var11, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method1974(-108, 1, (byte) 0, (short) 0, (short) 127, (byte) 0, var7, var8, (byte) 0);
            }
        }
        var1.field4272 = var1.field4265;
        var1.field4262 = null;
        var1.field4268 = null;
        var1.field4287 = null;
        field1347 = arg0.method1293(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(Lqa;Lal;)V")
    private final void method638(class207 arg0, class83 arg1) {
        class317 var3 = class428.method2544(-87, 0, this.field1361, class442.field6300);
        if (var3 == null) {
            return;
        }
        arg0.method1350(field1360);
        arg0.method1308(0, 0, this.field1348, this.field1348);
        arg0.method1321(0, 0, this.field1348, this.field1348, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field1356) {
                var4 = -arg1.field1359;
                var5 = -arg1.field1362;
                var6 = -arg1.field1357;
            } else {
                var4 = this.field1359 - arg1.field1359;
                var5 = this.field1362 - arg1.field1362;
                var6 = this.field1357 - arg1.field1357;
            }
        }
        if (this.field1349 != 0) {
            int var7 = -this.field1349 & 0x3FFF;
            int var8 = class1.field2[var7];
            int var9 = class1.field7[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field1353 != 0) {
            int var11 = -this.field1353 & 0x3FFF;
            int var12 = class1.field2[var11];
            int var13 = class1.field7[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method1295(1.0F);
        arg0.method1298(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class157 var15 = arg0.method1293(var3, 2048, 0, 64, 768);
        int var16 = var15.method148() - var15.method139();
        int var17 = var15.method128() - var15.method133();
        int var18 = var15.method139() + var16 / 2;
        int var19 = var15.method133() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method1365(var18, var19, var20, var20);
        arg0.method1355(arg0.method1318());
        class163 var21 = arg0.method1344();
        var21.method1054(0, 0, arg0.method1301() - var15.method135());
        var15.method127(var21, null, arg0.method1301(), 1);
        this.field1350 = arg0.method1300(0, 0, this.field1348, this.field1348, true);
        this.field1350.method502(0, 0, 3);
        arg0.method1308(field1360[0], field1360[1], field1360[2], field1360[3]);
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field1359 = arg2;
        this.field1362 = arg3;
        this.field1357 = arg4;
        this.field1356 = arg7;
        this.field1361 = arg1;
        this.field1363 = arg6;
        this.field1352 = arg5;
        this.field1346 = arg0;
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(Lqa;Lal;)Z")
    private final boolean method639(class207 arg0, class83 arg1) {
        if (this.field1350 == null) {
            if (this.field1346 == 0) {
                if (class58.field1057.method188(this.field1361, -117)) {
                    int[] var3 = class58.field1057.method185(false, 0.7F, this.field1348, this.field1361, this.field1348, (byte) 49);
                    this.field1350 = arg0.method1363(var3, 0, this.field1348, this.field1348, this.field1348);
                }
            } else if (this.field1346 == 2) {
                this.method638(arg0, arg1);
            } else if (this.field1346 == 1) {
                this.method635(arg0, arg1);
            }
        }
        return this.field1350 != null;
    }
}
