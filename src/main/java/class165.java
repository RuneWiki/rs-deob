import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public abstract class class165 {

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    private int field2640 = 0;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public int field2646 = 4;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    private int field2648 = 4;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "[S")
    private short[] field2649 = new short[512];

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    private int field2644 = 4;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    private int field2656 = 4;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "Luf;")
    private static class168 field2639 = class148.method1019(-1720, "Connection lost)3");

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "Luf;")
    public static class168 field2643 = class148.method1019(-1720, "Sprites geladen)3");

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "Luf;")
    public static class168 field2647 = class148.method1019(-1720, "mapscene");

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field2638 = -2;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "Luf;")
    public static class168 field2635 = field2639;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    public static int field2655 = -1;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "Z")
    public static boolean field2654 = true;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "[Luf;")
    public static class168[] field2657 = new class168[100];

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "Ldk;")
    public static class241 field2637;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "[S")
    private short[] field2653;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZI)Luf;", line = 5)
    public static final class168 method1149(boolean arg0, int arg1) {
        field2636++;
        return arg0 ? (class168) null : class134.method938((byte) -126, new class168[] { class169.method1228(arg1 >> 24 & 0xFF, 0), class116.field1805, class169.method1228((arg1 & 0xFF158A) >> 16, 0), class116.field1805, class169.method1228((arg1 & 0xFF0C) >> 8, 0), class116.field1805, class169.method1228(arg1 & 0xFF, 0) });
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(IIIII)V", line = 478)
    public class165(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2646 = arg1;
        this.field2644 = arg4;
        this.field2648 = arg3;
        this.field2656 = arg2;
        this.field2640 = arg0;
        this.method1150(1820575436);
        this.method1153(255);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 41)
    private final void method1150(int arg0) {
        field2652++;
        if (arg0 != 1820575436) {
            method1149(false, 126);
        }
        this.field2653 = new short[this.field2646];
        for (int var2 = 0; var2 < this.field2646; var2++) {
            this.field2653[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIII)V", line = 68)
    public final void method1151(int arg0, int arg1, int arg2, int arg3) {
        field2650++;
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg1];
        int var7 = -21 % ((34 - arg2) / 52);
        int[] var8 = new int[arg3];
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg0; var10++) {
            var5[var10] = (var10 << 12) / arg0;
        }
        for (int var11 = 0; var11 < arg3; var11++) {
            var8[var11] = (var11 << 12) / arg3;
        }
        this.method94(26332);
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = 0; var13 < arg0; var13++) {
                for (int var14 = 0; var14 < arg1; var14++) {
                    for (int var15 = 0; var15 < this.field2646; var15++) {
                        int var16 = this.field2653[var15] << 12;
                        int var17 = var6[var14] * var16 >> 12;
                        int var18 = var5[var13] * var16 >> 12;
                        int var19 = var8[var12] * var16 >> 12;
                        int var20 = this.field2648 * var18;
                        int var21 = var20 >> 12;
                        int var22 = this.field2644 * var16 >> 12;
                        int var23 = var20 & 0xFFF;
                        int var24 = var23 - 4096;
                        int var25 = this.field2656 * var16 >> 12;
                        int var26 = this.field2648 * var16 >> 12;
                        int var27 = this.field2644 * var19;
                        int var28 = var21 + 1;
                        int var29 = class229.field3703[var23];
                        int var30 = var27 >> 12;
                        int var31 = var21 & 0xFF;
                        int var32 = this.field2656 * var17;
                        int var33 = var27 & 0xFFF;
                        int var34 = var33 - 4096;
                        int var35 = var32 >> 12;
                        int var36 = var30 + 1;
                        int var37;
                        if (var22 <= var36) {
                            var37 = 0;
                        } else {
                            var37 = var36 & 0xFF;
                        }
                        int var38 = var30 & 0xFF;
                        int var39;
                        if (var26 > var28) {
                            var39 = var28 & 0xFF;
                        } else {
                            var39 = 0;
                        }
                        int var40 = var32 & 0xFFF;
                        int var41 = class229.field3703[var40];
                        int var42 = class229.field3703[var33];
                        short var43 = this.field2649[var38];
                        int var44 = var35 + 1;
                        short var45 = this.field2649[var39 + var43];
                        int var46;
                        if (var44 >= var25) {
                            var46 = 0;
                        } else {
                            var46 = var44 & 0xFF;
                        }
                        int var47 = var40 - 4096;
                        short var48 = this.field2649[var31 + var43];
                        int var49 = var35 & 0xFF;
                        short var50 = this.field2649[var37];
                        short var51 = this.field2649[var39 + var50];
                        short var52 = this.field2649[var31 + var50];
                        int var53 = class133.method927(var33, var40, this.field2649[var48 + var49], 0, var23);
                        int var54 = class133.method927(var33, var47, this.field2649[var46 + var48], 0, var23);
                        int var55 = ((var54 - var53) * var41 >> 12) + var53;
                        int var56 = class133.method927(var33, var40, this.field2649[var49 + var45], 0, var24);
                        int var57 = class133.method927(var33, var47, this.field2649[var46 + var45], 0, var24);
                        int var58 = ((var57 - var56) * var41 >> 12) + var56;
                        int var59 = ((var58 - var55) * var29 >> 12) + var55;
                        int var60 = class133.method927(var34, var40, this.field2649[var49 + var52], 0, var23);
                        int var61 = class133.method927(var34, var47, this.field2649[var46 + var52], 0, var23);
                        int var62 = var60 + ((var61 - var60) * var41 >> 12);
                        int var63 = class133.method927(var34, var40, this.field2649[var49 + var51], 0, var24);
                        int var64 = class133.method927(var34, var47, this.field2649[var46 + var51], 0, var24);
                        int var65 = ((var64 - var63) * var41 >> 12) + var63;
                        int var66 = ((var65 - var62) * var29 >> 12) + var62;
                        this.method97(var15, var59 + ((var66 - var59) * var42 >> 12), 1);
                    }
                    this.method100((byte) 63);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V", line = 250)
    public static void method1152(int arg0) {
        field2647 = null;
        field2657 = null;
        field2643 = null;
        if (arg0 != 0) {
            field2657 = (class168[]) null;
        }
        field2639 = null;
        field2637 = null;
        field2635 = null;
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V", line = 283)
    private final void method1153(int arg0) {
        Random var2 = new Random((long) this.field2640);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field2649[var3] = (short) var3;
        }
        if (arg0 != 255) {
            this.method1153(106);
        }
        field2651++;
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class103.method774(var5, var2, arg0 ^ 0x800000FF);
            short var7 = this.field2649[var6];
            this.field2649[var6] = this.field2649[var5];
            this.field2649[var5] = this.field2649[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lne;I)V", line = 321)
    public static final void method1154(class79 arg0, int arg1) {
        field2642++;
        class135.method945(arg1 + 237);
        if (class278.field4671 != null) {
            return;
        }
        if (!class77.field1056) {
            class267.method1859((byte) 71);
            return;
        }
        if (arg1 != -18543) {
            method1152(29);
        }
        if (class106.field1634 != 1) {
            return;
        }
        int var2 = class102.field1589 / 5;
        int var3 = class39.field492 + var2 + 140;
        if (class206.field3384 >= var3 && var3 + 14 >= class206.field3384 && class83.field1244 >= (class172.field2799 + 4) && class83.field1244 <= (class172.field2799 + 18)) {
            class123.method875(0, 0, arg1 ^ 0x2380);
            return;
        }
        if ((var3 + 15) <= class206.field3384 && class206.field3384 <= (var3 + 80) && class172.field2799 + 4 <= class83.field1244 && class83.field1244 <= class172.field2799 + 18) {
            class123.method875(0, 1, -27631);
            return;
        }
        int var4 = class39.field492 + var2 + 250;
        if (class206.field3384 >= var4 && class206.field3384 <= (var4 + 14) && (class172.field2799 + 4) <= class83.field1244 && class83.field1244 <= class172.field2799 + 18) {
            class123.method875(1, 0, -27631);
            return;
        }
        if (var4 + 15 <= class206.field3384 && class206.field3384 <= var4 + 80 && class172.field2799 + 4 <= class83.field1244 && class83.field1244 <= (class172.field2799 + 18)) {
            class123.method875(1, 1, arg1 - 9088);
            return;
        }
        int var5 = var2 + class39.field492 + 360;
        if (var5 <= class206.field3384 && class206.field3384 <= var5 + 14 && (class172.field2799 + 4) <= class83.field1244 && class83.field1244 <= (class172.field2799 + 18)) {
            class123.method875(2, 0, -27631);
            return;
        }
        if (class206.field3384 >= var5 + 15 && class206.field3384 <= var5 + 80 && class83.field1244 >= class172.field2799 + 4 && class83.field1244 <= class172.field2799 + 18) {
            class123.method875(2, 1, arg1 ^ 0x2380);
            return;
        }
        int var6 = class39.field492 + var2 + 470;
        if (var6 <= class206.field3384 && var6 + 14 >= class206.field3384 && class172.field2799 + 4 <= class83.field1244 && class83.field1244 <= (class172.field2799 + 18)) {
            class123.method875(3, 0, -27631);
            return;
        }
        if (var6 + 15 <= class206.field3384 && class206.field3384 <= var6 + 80 && class172.field2799 + 4 <= class83.field1244 && (class172.field2799 + 18) >= class83.field1244) {
            class123.method875(3, 1, -27631);
            return;
        }
        if (class284.field4820 == -1) {
            return;
        }
        class274 var7 = class73.field977[class284.field4820];
        if (class58.field764 == var7.field4616) {
            byte[] var8 = class134.method938((byte) -123, new class168[] { var7.field4614, class300.field5090 }).method1174(true);
            class201.field3307 = new String(var8, 0, var8.length);
            class188.field2984 = var7.field4605;
            if (class217.field3542 != 0) {
                class27.field338 = class188.field2984 + 40000;
                class266.field4491 = class188.field2984 + 50000;
                class229.field3698 = class27.field338;
            }
            if (class43.field533 != null) {
                class43.field533.field4028 = true;
                client.method2011((byte) -59, class43.field533);
            }
            return;
        }
        class168 var9 = class233.field3753;
        if (class217.field3542 != 0) {
            var9 = class134.method938((byte) -127, new class168[] { class198.field3265, class169.method1228(var7.field4605 + 7000, 0) });
        }
        class168 var10 = class134.method938((byte) -125, new class168[] { class264.field4465, var7.field4614, class300.field5090, var9, class17.field187, class169.method1228(class164.field2634, 0), class301.field5094, class169.method1228(class26.field329, 0), class262.field4446, class169.method1228(1, 0), class31.field380, class169.method1228(class27.field336, 0), class236.field3776, class169.method1228(class67.field888, 0) });
        try {
            arg0.getAppletContext().showDocument(var10.method1218((byte) 126), "_self");
        } catch (Exception var12) {
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V")
    public abstract void method97(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
    public abstract void method100(byte arg0);

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
    public abstract void method94(int arg0);
}
