import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class103 extends class417 {

    @OriginalMember(owner = "client!laa", name = "l", descriptor = "Lnm;")
    private class405 field1483;

    @OriginalMember(owner = "client!laa", name = "w", descriptor = "Lcb;")
    private class444 field1494;

    @OriginalMember(owner = "client!laa", name = "D", descriptor = "Lih;")
    private class600 field1501;

    @OriginalMember(owner = "client!laa", name = "t", descriptor = "I")
    private int field1491;

    @OriginalMember(owner = "client!laa", name = "z", descriptor = "I")
    private int field1497;

    @OriginalMember(owner = "client!laa", name = "p", descriptor = "I")
    private int field1487;

    @OriginalMember(owner = "client!laa", name = "k", descriptor = "I")
    private int field1482;

    @OriginalMember(owner = "client!laa", name = "o", descriptor = "[[F")
    private float[][] field1486;

    @OriginalMember(owner = "client!laa", name = "r", descriptor = "[[F")
    private float[][] field1489;

    @OriginalMember(owner = "client!laa", name = "u", descriptor = "[[F")
    private float[][] field1492;

    @OriginalMember(owner = "client!laa", name = "A", descriptor = "I")
    private int field1498;

    @OriginalMember(owner = "client!laa", name = "x", descriptor = "Lql;")
    private class628 field1495;

    @OriginalMember(owner = "client!laa", name = "C", descriptor = "Laf;")
    private class370 field1500;

    @OriginalMember(owner = "client!laa", name = "F", descriptor = "Llb;")
    private class465 field1503;

    @OriginalMember(owner = "client!laa", name = "i", descriptor = "Ljaclib/memory/Stream;")
    private Stream field1480;

    @OriginalMember(owner = "client!laa", name = "v", descriptor = "Ljaclib/memory/Stream;")
    private Stream field1493;

    @OriginalMember(owner = "client!laa", name = "I", descriptor = "I")
    private int field1506;

    @OriginalMember(owner = "client!laa", name = "j", descriptor = "I")
    public static int field1481 = 0;

    @OriginalMember(owner = "client!laa", name = "m", descriptor = "I")
    public static int field1484 = 0;

    @OriginalMember(owner = "client!laa", name = "y", descriptor = "I")
    public static int field1496 = 0;

    @OriginalMember(owner = "client!laa", name = "n", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!laa", name = "q", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!laa", name = "s", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!laa", name = "B", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!laa", name = "E", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!laa", name = "G", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!laa", name = "H", descriptor = "Z")
    public static boolean field1505;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(I[[ZIBI)V")
    public final void method772(int arg0, boolean[][] arg1, int arg2, byte arg3, int arg4) {
        field1504++;
        if (this.field1500 == null || (arg4 + arg2) < this.field1491 || this.field1497 < arg4 - arg2) {
            return;
        }
        int var6 = 86 % ((42 - arg3) / 57);
        if (arg0 + arg2 < this.field1487 || this.field1482 < arg0 - arg2) {
            return;
        }
        for (int var7 = this.field1487; var7 <= this.field1482; var7++) {
            for (int var8 = this.field1491; var8 <= this.field1497; var8++) {
                int var9 = var8 - arg4;
                int var10 = var7 - arg0;
                if (var9 > (-arg2) && arg2 > var9 && var10 > -arg2 && arg2 > var10 && arg1[arg2 + var9][arg2 + var10]) {
                    this.field1494.method2625((byte) ((int) (this.field1483.method2382(0) * 255.0F)), 1);
                    this.field1494.method2584(true, this.field1494.field6211);
                    this.field1494.method2617(this.field1495, 0, (byte) 127);
                    this.field1494.method2578((byte) 49, class569.field8396, 0, 0, this.field1506, this.field1498 / 3, this.field1500);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IS)V")
    private final void method773(int arg0, short arg1) {
        if (Stream.method3454()) {
            this.field1493.method3447(arg1);
        } else {
            this.field1493.method3452(arg1);
        }
        field1490++;
        if (arg0 != 13559) {
            this.field1506 = 119;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(B)V")
    public static final void method774(byte arg0) {
        field1485++;
        if (class190.field2830) {
            return;
        }
        if (class56.field668.field6852) {
            class278.field3902 = ((int) class278.field3902 + 47 & 0xFFFFFFF0);
        } else {
            class92.field1389 += (12.0F - class92.field1389) / 2.0F;
        }
        class190.field2830 = true;
        class24.field226 = true;
        if (arg0 != -51) {
            field1484 = 12;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)V")
    public static final void method775(int arg0) {
        field1499++;
        class367.method2204(107, class99.field1445, (long) class617.field9123);
        if (class340.field4708 != -1) {
            class564.method3385(arg0 - 102, class340.field4708);
        }
        for (int var1 = 0; var1 < class533.field7942; var1++) {
            if (class104.field1511[var1]) {
                class243.field3474[var1] = true;
            }
            class625.field9204[var1] = class104.field1511[var1];
            class104.field1511[var1] = false;
        }
        class291.field4028 = class617.field9123;
        if (class99.field1445.method499()) {
            class431.field5778 = true;
        }
        if (class340.field4708 != -1) {
            class533.field7942 = 0;
            class97.method744(-1);
        }
        class99.field1445.method479();
        class571.method3406((byte) 62, class99.field1445);
        int var2 = class611.method3589(1777498892);
        if (~var2 == arg0) {
            var2 = class574.field8454;
        }
        if (var2 == -1) {
            var2 = class396.field5454;
        }
        class512.method3041(0, var2);
        class647.field9402 = 0;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIIBIII)V")
    private final void method776(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field1502++;
        long var8 = -1L;
        int var10 = (arg0 << this.field1501.field2695) + arg2;
        int var11 = (arg1 << this.field1501.field2695) + arg4;
        int var12 = this.field1501.method1233(var10, var11);
        if ((arg2 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class417 var13 = this.field1503.method2799(var8, true);
            if (var13 != null) {
                this.method773(arg3 + 13679, ((class207) var13).field3076);
                return;
            }
        }
        short var14 = (short) (this.field1506++);
        if (var8 != -1L) {
            this.field1503.method2797(-4234, new class207(var14), var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg2 == 0 && arg4 == 0) {
            var15 = this.field1489[arg5][arg6];
            var16 = this.field1486[arg5][arg6];
            var17 = this.field1492[arg5][arg6];
        } else if (this.field1501.field2694 == arg2 && arg4 == 0) {
            var17 = this.field1492[arg5 + 1][arg6];
            var15 = this.field1489[arg5 + 1][arg6];
            var16 = this.field1486[arg5 + 1][arg6];
        } else if (this.field1501.field2694 == arg2 && this.field1501.field2694 == arg4) {
            var17 = this.field1492[arg5 + 1][arg6 + 1];
            var16 = this.field1486[arg5 + 1][arg6 + 1];
            var15 = this.field1489[arg5 + 1][arg6 + 1];
        } else if (arg2 == 0 && this.field1501.field2694 == arg4) {
            var16 = this.field1486[arg5][arg6 + 1];
            var17 = this.field1492[arg5][arg6 + 1];
            var15 = this.field1489[arg5][arg6 + 1];
        } else {
            float var18 = (float) arg2 / (float) this.field1501.field2694;
            float var19 = (float) arg4 / (float) this.field1501.field2694;
            float var20 = this.field1492[arg5][arg6];
            float var21 = this.field1489[arg5][arg6];
            float var22 = this.field1486[arg5][arg6];
            float var23 = this.field1492[arg5 + 1][arg6];
            float var24 = this.field1489[arg5 + 1][arg6];
            float var25 = (this.field1489[arg5 + 1][arg6 + 1] - var24) * var18 + var24;
            float var26 = (this.field1489[arg5][arg6 + 1] - var21) * var18 + var21;
            float var27 = (this.field1492[arg5][arg6 + 1] - var20) * var18 + var20;
            float var28 = this.field1486[arg5 + 1][arg6];
            float var29 = (this.field1492[arg5 + 1][arg6 + 1] - var23) * var18 + var23;
            float var30 = (this.field1486[arg5][arg6 + 1] - var22) * var18 + var22;
            var15 = (var25 - var26) * var19 + var26;
            float var31 = (this.field1486[arg5 + 1][arg6 + 1] - var28) * var18 + var28;
            var17 = (var29 - var27) * var19 + var27;
            var16 = (var31 - var30) * var19 + var30;
        }
        float var32 = (float) (this.field1483.method2388((byte) -102) - var10);
        float var33 = (float) (this.field1483.method2383(arg3 + 2039035577) - var12);
        float var34 = (float) (this.field1483.method2389(arg3 - 10041) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var33 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field1483.method2390(arg3 + 6162);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var37 + var15 * var38 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field1483.method2384(630);
        int var45 = (int) ((float) ((var44 & 0xFF15F6) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFFFD) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        if (arg3 != -120) {
            return;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (Stream.method3454()) {
            this.field1480.method3446((float) var10);
            this.field1480.method3446((float) var12);
            this.field1480.method3446((float) var11);
        } else {
            this.field1480.method3453((float) var10);
            this.field1480.method3453((float) var12);
            this.field1480.method3453((float) var11);
        }
        if (this.field1494.field6131 == 0) {
            this.field1480.method3445(var47);
            this.field1480.method3445(var46);
            this.field1480.method3445(var45);
        } else {
            this.field1480.method3445(var45);
            this.field1480.method3445(var46);
            this.field1480.method3445(var47);
        }
        this.field1480.method3445(255);
        this.method773(13559, var14);
    }

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Lcb;Lih;Lnm;[I)V")
    public class103(class444 arg0, class600 arg1, class405 arg2, int[] arg3) {
        this.field1483 = arg2;
        this.field1494 = arg0;
        this.field1501 = arg1;
        int var5 = this.field1483.method2390(6042) - (arg1.field2694 >> 1);
        this.field1491 = this.field1483.method2388((byte) -94) - var5 >> arg1.field2695;
        this.field1497 = this.field1483.method2388((byte) -83) + var5 >> arg1.field2695;
        this.field1487 = this.field1483.method2389(-10161) - var5 >> arg1.field2695;
        this.field1482 = this.field1483.method2389(-10161) + var5 >> arg1.field2695;
        int var6 = this.field1497 + 1 - this.field1491;
        int var7 = this.field1482 + 1 - this.field1487;
        this.field1486 = new float[var6 + 1][var7 + 1];
        this.field1489 = new float[var6 + 1][var7 + 1];
        this.field1492 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = this.field1487 + var8;
            if (var25 > 0 && (this.field1501.field2693 - 1) > var25) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = this.field1491 + var26;
                    if (var27 > 0 && this.field1501.field2697 - 1 > var27) {
                        int var28 = arg1.method1239(var27 + 1, var25) - arg1.method1239(var27 - 1, var25);
                        int var29 = arg1.method1239(var27, var25 + 1) - arg1.method1239(var27, var25 - 1);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var28 * var28 + (var29 * var29) + 65536)));
                        this.field1492[var26][var8] = (float) var28 * var30;
                        this.field1489[var26][var8] = var30 * -256.0F;
                        this.field1486[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field1487; var10 <= this.field1482; var10++) {
            if (var10 >= 0 && var10 < arg1.field2693) {
                for (int var22 = this.field1491; var22 <= this.field1497; var22++) {
                    if (var22 >= 0 && arg1.field2697 > var22) {
                        int var23 = arg3[var9];
                        int[] var24 = arg1.field8849[var22][var10];
                        if (var24 != null && var23 != 0) {
                            this.field1498 += var23 == 1 ? var24.length : 3;
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field1497 - this.field1491;
            }
        }
        if (this.field1498 <= 0) {
            this.field1495 = null;
            this.field1500 = null;
        } else {
            this.field1503 = new class465(class322.method1938(this.field1498, 110));
            this.field1500 = this.field1494.method2638(false, false);
            this.field1500.method287(-98, this.field1498);
            NativeHeapBuffer var11 = this.field1494.method2634(false, 117, this.field1498 * 16);
            this.field1480 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field1500.method282(-13803, true);
                } while (var12 == null);
                this.field1493 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field1487; var15 <= this.field1482; var15++) {
                    if (var15 >= 0 && arg1.field2693 > var15) {
                        int var16 = 0;
                        for (int var17 = this.field1491; var17 <= this.field1497; var17++) {
                            if (var17 >= 0 && var17 < arg1.field2697) {
                                int var18 = arg3[var13];
                                int[] var19 = arg1.field8849[var17][var15];
                                int[] var20 = arg1.field8878[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        for (int var21 = 0; var21 < var19.length; var21++) {
                                            this.method776(var17, var15, var19[var21], (byte) -120, var20[var21], var16, var14);
                                        }
                                    } else if (var18 == 3) {
                                        this.method776(var17, var15, 0, (byte) -120, 0, var16, var14);
                                        this.method776(var17, var15, arg1.field2694, (byte) -120, 0, var16, var14);
                                        this.method776(var17, var15, 0, (byte) -120, arg1.field2694, var16, var14);
                                    } else if (var18 == 2) {
                                        this.method776(var17, var15, arg1.field2694, (byte) -120, 0, var16, var14);
                                        this.method776(var17, var15, arg1.field2694, (byte) -120, arg1.field2694, var16, var14);
                                        this.method776(var17, var15, 0, (byte) -120, 0, var16, var14);
                                    } else if (var18 == 5) {
                                        this.method776(var17, var15, arg1.field2694, (byte) -120, arg1.field2694, var16, var14);
                                        this.method776(var17, var15, 0, (byte) -120, arg1.field2694, var16, var14);
                                        this.method776(var17, var15, arg1.field2694, (byte) -120, 0, var16, var14);
                                    } else if (var18 == 4) {
                                        this.method776(var17, var15, 0, (byte) -120, arg1.field2694, var16, var14);
                                        this.method776(var17, var15, 0, (byte) -120, 0, var16, var14);
                                        this.method776(var17, var15, arg1.field2694, (byte) -120, arg1.field2694, var16, var14);
                                    }
                                }
                            }
                            var13++;
                            var16++;
                        }
                    } else {
                        var13 += this.field1497 - this.field1491;
                    }
                    var14++;
                }
                this.field1493.method3448();
                if (this.field1500.method280(28596)) {
                    this.field1480.method3448();
                    this.field1495 = this.field1494.method2627(false, -30125);
                    this.field1495.method1867(16, this.field1506 * 16, var11, 53);
                    break;
                }
                this.field1480.method3449(0);
                this.field1503.method2800(0);
            }
        }
        this.field1492 = this.field1489 = this.field1486 = null;
        this.field1503 = null;
        this.field1480 = null;
        this.field1493 = null;
    }
}
