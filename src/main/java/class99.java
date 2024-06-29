import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class99 extends class738 {

    @OriginalMember(owner = "client!iv", name = "x", descriptor = "Lqe;")
    public static class469 field1407 = new class469(80, 6);

    @OriginalMember(owner = "client!iv", name = "L", descriptor = "Lqe;")
    public static class469 field1421 = new class469(8, 7);

    @OriginalMember(owner = "client!iv", name = "M", descriptor = "I")
    public static int field1422 = 0;

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "F")
    public float field1388;

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "F")
    public float field1389;

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "F")
    public float field1390;

    @OriginalMember(owner = "client!iv", name = "l", descriptor = "F")
    public float field1395;

    @OriginalMember(owner = "client!iv", name = "o", descriptor = "F")
    public float field1398;

    @OriginalMember(owner = "client!iv", name = "r", descriptor = "F")
    public float field1401;

    @OriginalMember(owner = "client!iv", name = "w", descriptor = "F")
    public float field1406;

    @OriginalMember(owner = "client!iv", name = "A", descriptor = "F")
    public float field1410;

    @OriginalMember(owner = "client!iv", name = "H", descriptor = "F")
    public float field1417;

    @OriginalMember(owner = "client!iv", name = "I", descriptor = "F")
    public float field1418;

    @OriginalMember(owner = "client!iv", name = "J", descriptor = "F")
    public float field1419;

    @OriginalMember(owner = "client!iv", name = "K", descriptor = "F")
    public float field1420;

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!iv", name = "j", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!iv", name = "k", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!iv", name = "m", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!iv", name = "n", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!iv", name = "p", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!iv", name = "q", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!iv", name = "s", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!iv", name = "t", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!iv", name = "u", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!iv", name = "v", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!iv", name = "y", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!iv", name = "z", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!iv", name = "B", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!iv", name = "C", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!iv", name = "D", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!iv", name = "E", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!iv", name = "G", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!iv", name = "F", descriptor = "Lvd;")
    public static class39 field1415;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(III)V")
    public final void method758(int arg0, int arg1, int arg2) {
        field1392++;
        this.field1418 += arg1;
        this.field1398 += arg0;
        this.field1410 += arg2;
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "()Lql;")
    public final class738 method759() {
        field1399++;
        class99 var1 = new class99();
        var1.field1398 = this.field1398;
        var1.field1395 = this.field1395;
        var1.field1420 = this.field1420;
        var1.field1390 = this.field1390;
        var1.field1406 = this.field1406;
        var1.field1417 = this.field1417;
        var1.field1418 = this.field1418;
        var1.field1410 = this.field1410;
        var1.field1401 = this.field1401;
        var1.field1388 = this.field1388;
        var1.field1389 = this.field1389;
        var1.field1419 = this.field1419;
        return var1;
    }

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "(I)V")
    public final void method760(int arg0) {
        field1402++;
        float var2 = class435.field6470[arg0 & 0x3FFF];
        float var3 = class435.field6468[arg0 & 0x3FFF];
        float var4 = this.field1395;
        float var5 = this.field1390;
        float var6 = this.field1419;
        float var7 = this.field1398;
        this.field1395 = var2 * var4 - this.field1420 * var3;
        this.field1390 = var2 * var5 - this.field1406 * var3;
        this.field1420 = this.field1420 * var2 + var3 * var4;
        this.field1419 = var2 * var6 - (this.field1417 * var3);
        this.field1406 = this.field1406 * var2 + var3 * var5;
        this.field1417 = this.field1417 * var2 + var3 * var6;
        this.field1398 = var2 * var7 - (this.field1418 * var3);
        this.field1418 = this.field1418 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "(III)Z")
    public static final boolean method761(int arg0, int arg1, int arg2) {
        field1391++;
        if (arg1 != 13) {
            field1421 = null;
        }
        return (arg2 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(BII)Z")
    public static final boolean method762(byte arg0, int arg1, int arg2) {
        field1414++;
        if (arg0 != -94) {
            field1407 = null;
        }
        return class310.method1963((byte) 102, arg2, arg1) | (arg1 & 0x800) != 0 || class348.method2206(arg1, arg2, arg0 ^ 0xFFFFFF95);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
    public final void method763(int arg0) {
        field1413++;
        float var2 = class435.field6470[arg0 & 0x3FFF];
        float var3 = class435.field6468[arg0 & 0x3FFF];
        float var4 = this.field1420;
        float var5 = this.field1406;
        float var6 = this.field1417;
        float var7 = this.field1418;
        this.field1420 = var2 * var4 - this.field1388 * var3;
        this.field1406 = var2 * var5 - this.field1389 * var3;
        this.field1388 = this.field1388 * var2 + var3 * var4;
        this.field1389 = this.field1389 * var2 + var3 * var5;
        this.field1417 = var2 * var6 - (this.field1401 * var3);
        this.field1418 = var2 * var7 - (this.field1410 * var3);
        this.field1401 = this.field1401 * var2 + var3 * var6;
        this.field1410 = this.field1410 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "(I)V")
    public final void method764(int arg0) {
        field1400++;
        this.field1406 = 1.0F;
        this.field1395 = this.field1401 = class435.field6470[arg0 & 0x3FFF];
        this.field1419 = class435.field6468[arg0 & 0x3FFF];
        this.field1388 = -this.field1419;
        this.field1390 = this.field1398 = this.field1420 = this.field1417 = this.field1418 = this.field1389 = this.field1410 = 0.0F;
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)V")
    public final void method765(int arg0) {
        field1403++;
        this.field1395 = 1.0F;
        this.field1406 = this.field1401 = class435.field6470[arg0 & 0x3FFF];
        this.field1389 = class435.field6468[arg0 & 0x3FFF];
        this.field1390 = this.field1419 = this.field1398 = this.field1420 = this.field1418 = this.field1388 = this.field1410 = 0.0F;
        this.field1417 = -this.field1389;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(III[I)V")
    public final void method766(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg1 - this.field1418);
        int var6 = (int) ((float) arg0 - this.field1398);
        field1396++;
        int var7 = (int) ((float) arg2 - this.field1410);
        arg3[0] = (int) ((float) var7 * this.field1388 + (float) var5 * this.field1420 + (float) var6 * this.field1395);
        arg3[1] = (int) ((float) var7 * this.field1389 + (float) var5 * this.field1406 + (float) var6 * this.field1390);
        arg3[2] = (int) ((float) var7 * this.field1401 + (float) var5 * this.field1417 + (float) var6 * this.field1419);
    }

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "(III[I)V")
    public final void method767(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field1401 + (float) arg0 * this.field1388 + (float) arg1 * this.field1389 + this.field1410);
        arg3[1] = (int) ((float) arg2 * this.field1417 + (float) arg0 * this.field1420 + (float) arg1 * this.field1406 + this.field1418);
        arg3[0] = (int) ((float) arg2 * this.field1419 + (float) arg0 * this.field1395 + (float) arg1 * this.field1390 + this.field1398);
        field1416++;
    }

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "(I)V")
    public final void method768(int arg0) {
        field1397++;
        float var2 = class435.field6470[arg0 & 0x3FFF];
        float var3 = class435.field6468[arg0 & 0x3FFF];
        float var4 = this.field1395;
        float var5 = this.field1390;
        float var6 = this.field1419;
        float var7 = this.field1398;
        this.field1395 = this.field1388 * var3 + var2 * var4;
        this.field1390 = this.field1389 * var3 + var2 * var5;
        this.field1388 = this.field1388 * var2 - (var3 * var4);
        this.field1389 = this.field1389 * var2 - (var3 * var5);
        this.field1419 = this.field1401 * var3 + var2 * var6;
        this.field1398 = this.field1410 * var3 + var2 * var7;
        this.field1401 = this.field1401 * var2 - var3 * var6;
        this.field1410 = this.field1410 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "()V")
    public final void method769() {
        this.field1395 = this.field1406 = this.field1401 = 1.0F;
        field1411++;
        this.field1420 = this.field1388 = this.field1390 = this.field1389 = this.field1419 = this.field1417 = this.field1398 = this.field1418 = this.field1410 = 0.0F;
    }

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "(I)V")
    public static void method770(int arg0) {
        field1407 = null;
        field1421 = null;
        field1415 = null;
        if (arg0 != 16383) {
            field1407 = null;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "([I)V")
    public final void method771(int[] arg0) {
        field1408++;
        float var2 = (float) arg0[0] - this.field1398;
        float var3 = (float) arg0[1] - this.field1418;
        float var4 = (float) arg0[2] - this.field1410;
        arg0[0] = (int) (this.field1388 * var4 + this.field1420 * var3 + this.field1395 * var2);
        arg0[1] = (int) (this.field1389 * var4 + this.field1406 * var3 + this.field1390 * var2);
        arg0[2] = (int) (this.field1401 * var4 + this.field1419 * var2 + this.field1417 * var3);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lql;)V")
    public final void method772(class738 arg0) {
        field1394++;
        class99 var2 = (class99) arg0;
        this.field1420 = var2.field1420;
        this.field1419 = var2.field1419;
        this.field1398 = var2.field1398;
        this.field1390 = var2.field1390;
        this.field1418 = var2.field1418;
        this.field1410 = var2.field1410;
        this.field1395 = var2.field1395;
        this.field1401 = var2.field1401;
        this.field1389 = var2.field1389;
        this.field1406 = var2.field1406;
        this.field1388 = var2.field1388;
        this.field1417 = var2.field1417;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "([[BILjda;)V")
    public static final void method773(byte[][] arg0, int arg1, class227 arg2) {
        for (int var3 = 0; var3 < arg2.field133; var3++) {
            class290.method1858((byte) 33);
            for (int var4 = 0; var4 < (class194.field2946 >> 3); var4++) {
                for (int var5 = 0; var5 < (class255.field3656 >> 3); var5++) {
                    int var6 = class504.field7161[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = (var6 & 0x3D9409C) >> 24;
                        if (!arg2.field122 || var7 == 0) {
                            int var8 = var6 >> 1 & 0x3;
                            int var9 = (var6 & 0xFFD03A) >> 14;
                            int var10 = (var6 & 0x3FFC) >> 3;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class434.field6462.length; var12++) {
                                if (class434.field6462[var12] == var11 && arg0[var12] != null) {
                                    arg2.method1535(var4 * 8, var3, arg0[var12], var5 * 8, (var10 & 0x7) * 8, var7, var8, false, class326.field4655, class736.field10316, (var9 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        field1405++;
        if (arg1 != -14373) {
            method770(24);
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(III)V")
    public final void method774(int arg0, int arg1, int arg2) {
        field1393++;
        this.field1410 = arg2;
        this.field1398 = arg0;
        this.field1420 = this.field1388 = this.field1390 = this.field1389 = this.field1419 = this.field1417 = 0.0F;
        this.field1395 = this.field1406 = this.field1401 = 1.0F;
        this.field1418 = arg1;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIIII)V")
    public final void method775(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1412++;
        float var7 = class435.field6470[arg3 & 0x3FFF];
        float var8 = class435.field6468[arg3 & 0x3FFF];
        float var9 = class435.field6470[arg4 & 0x3FFF];
        float var10 = class435.field6468[arg4 & 0x3FFF];
        float var11 = class435.field6470[arg5 & 0x3FFF];
        float var12 = class435.field6468[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field1420 = -var9 * var12 + var10 * var13;
        this.field1389 = -var8;
        this.field1390 = var7 * var12;
        this.field1395 = var9 * var11 + var10 * var14;
        this.field1417 = var9 * var13 + var10 * var12;
        this.field1401 = var7 * var9;
        this.field1388 = var7 * var10;
        this.field1406 = var7 * var11;
        this.field1419 = -var10 * var11 + var9 * var14;
        this.field1398 = (float) (-arg0) * this.field1395 - (float) arg1 * this.field1390 - ((float) arg2 * this.field1419);
        this.field1418 = (float) (-arg0) * this.field1420 - ((float) arg1 * this.field1406) - ((float) arg2 * this.field1417);
        this.field1410 = (float) (-arg0) * this.field1388 - ((float) arg1 * this.field1389) - ((float) arg2 * this.field1401);
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(III[I)V")
    public final void method776(int arg0, int arg1, int arg2, int[] arg3) {
        field1404++;
        arg3[0] = (int) ((float) arg2 * this.field1419 + (float) arg0 * this.field1395 + (float) arg1 * this.field1390);
        arg3[1] = (int) ((float) arg2 * this.field1417 + (float) arg0 * this.field1420 + (float) arg1 * this.field1406);
        arg3[2] = (int) ((float) arg2 * this.field1401 + (float) arg0 * this.field1388 + (float) arg1 * this.field1389);
    }

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "(I)V")
    public final void method777(int arg0) {
        field1409++;
        this.field1401 = 1.0F;
        this.field1395 = this.field1406 = class435.field6470[arg0 & 0x3FFF];
        this.field1420 = class435.field6468[arg0 & 0x3FFF];
        this.field1390 = -this.field1420;
        this.field1419 = this.field1398 = this.field1417 = this.field1418 = this.field1388 = this.field1389 = this.field1410 = 0.0F;
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "()V")
    public class99() {
        this.method769();
    }
}
