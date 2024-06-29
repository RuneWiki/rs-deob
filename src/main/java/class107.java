import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public abstract class class107 {

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "I")
    public int field1344 = 4;

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "[S")
    private short[] field1345 = new short[512];

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "I")
    private int field1343 = 4;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "I")
    private int field1342 = 0;

    @OriginalMember(owner = "client!oda", name = "j", descriptor = "I")
    private int field1351 = 4;

    @OriginalMember(owner = "client!oda", name = "g", descriptor = "I")
    private int field1348 = 4;

    @OriginalMember(owner = "client!oda", name = "e", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!oda", name = "f", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!oda", name = "h", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!oda", name = "i", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!oda", name = "k", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!oda", name = "m", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!oda", name = "l", descriptor = "[S")
    private short[] field1353;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V", line = 7)
    private final void method749(int arg0) {
        field1352++;
        this.field1353 = new short[this.field1344];
        for (int var2 = arg0; var2 < this.field1344; var2++) {
            this.field1353[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(B)V", line = 28)
    public static final void method750(byte arg0) {
        field1350++;
        class331.field4104.method1224(false);
        int var1 = -128 % ((-arg0 - 62) / 61);
    }

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(IIIII)V", line = 308)
    public class107(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1343 = arg3;
        this.field1348 = arg2;
        this.field1351 = arg4;
        this.field1342 = arg0;
        this.field1344 = arg1;
        this.method749(0);
        this.method754(95);
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIZI)V", line = 42)
    public final void method751(int arg0, int arg1, boolean arg2, int arg3) {
        field1347++;
        int[] var5 = new int[arg1];
        int[] var6 = new int[arg0];
        int[] var7 = new int[arg3];
        for (int var8 = 0; var8 < arg1; var8++) {
            var5[var8] = (var8 << 12) / arg1;
        }
        for (int var9 = 0; var9 < arg0; var9++) {
            var6[var9] = (var9 << 12) / arg0;
        }
        if (arg2) {
            this.field1351 = -67;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            var7[var10] = (var10 << 12) / arg3;
        }
        this.method756(0);
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg0; var12++) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < this.field1344; var14++) {
                        int var15 = this.field1353[var14] << 12;
                        int var16 = this.field1343 * var15 >> 12;
                        int var17 = this.field1348 * var15 >> 12;
                        int var18 = var6[var12] * var15 >> 12;
                        int var19 = var5[var13] * var15 >> 12;
                        int var20 = this.field1351 * var15 >> 12;
                        int var21 = var7[var11] * var15 >> 12;
                        int var22 = this.field1348 * var19;
                        int var23 = this.field1351 * var21;
                        int var24 = this.field1343 * var18;
                        int var25 = var22 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var24 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var23 >> 12;
                        int var31 = var28 & 0xFF;
                        int var32 = var30 + 1;
                        int var33;
                        if (var26 < var17) {
                            var33 = var26 & 0xFF;
                        } else {
                            var33 = 0;
                        }
                        int var34 = var23 & 0xFFF;
                        int var35 = var30 & 0xFF;
                        int var36 = var24 & 0xFFF;
                        int var37;
                        if (var32 >= var20) {
                            var37 = 0;
                        } else {
                            var37 = var32 & 0xFF;
                        }
                        int var38;
                        if (var16 > var29) {
                            var38 = var29 & 0xFF;
                        } else {
                            var38 = 0;
                        }
                        int var39 = var22 & 0xFFF;
                        int var40 = class397.field5041[var39];
                        int var41 = var39 - 4096;
                        short var42 = this.field1345[var37];
                        int var43 = class397.field5041[var36];
                        int var44 = var36 - 4096;
                        int var45 = class397.field5041[var34];
                        short var46 = this.field1345[var35];
                        int var47 = var34 - 4096;
                        short var48 = this.field1345[var31 + var46];
                        short var49 = this.field1345[var38 + var46];
                        short var50 = this.field1345[var38 + var42];
                        short var51 = this.field1345[var31 + var42];
                        int var52 = class136.method873(73, var39, var34, this.field1345[var27 + var48], var36);
                        int var53 = class136.method873(95, var41, var34, this.field1345[var33 + var48], var36);
                        int var54 = ((var53 - var52) * var40 >> 12) + var52;
                        int var55 = class136.method873(-104, var39, var34, this.field1345[var27 + var49], var44);
                        int var56 = class136.method873(-101, var41, var34, this.field1345[var33 + var49], var44);
                        int var57 = ((var56 - var55) * var40 >> 12) + var55;
                        int var58 = class136.method873(-73, var39, var47, this.field1345[var27 + var51], var36);
                        int var59 = ((var57 - var54) * var43 >> 12) + var54;
                        int var60 = class136.method873(-81, var41, var47, this.field1345[var33 + var51], var36);
                        int var61 = ((var60 - var58) * var40 >> 12) + var58;
                        int var62 = class136.method873(-91, var39, var47, this.field1345[var27 + var50], var44);
                        int var63 = class136.method873(-77, var41, var47, this.field1345[var33 + var50], var44);
                        int var64 = var62 + ((var63 - var62) * var40 >> 12);
                        int var65 = var61 + ((var64 - var61) * var43 >> 12);
                        this.method753(((var65 - var59) * var45 >> 12) + var59, (byte) -59, var14);
                    }
                    this.method755((byte) -105);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IB)V", line = 213)
    public static final void method752(int arg0, byte arg1) {
        field1349++;
        if (class570.field7217 == arg0) {
            return;
        }
        class85.field1090 = class656.field8932 = class38.field566[arg0];
        class417.method2322((byte) -96);
        class701.field9813 = new int[class85.field1090][class656.field8932];
        if (arg1 != 26) {
            method752(94, (byte) -76);
        }
        class372.field4799 = new int[class85.field1090][class656.field8932];
        class296.field3773 = new int[4][class85.field1090 >> 3][class656.field8932 >> 3];
        for (int var2 = 0; var2 < 4; var2++) {
            class634.field8601[var2] = class613.method3430(5, class85.field1090, class656.field8932);
        }
        class252.field3249 = new byte[4][class85.field1090][class656.field8932];
        class439.method2412(class656.field8932, 4, class85.field1090, 2);
        class427.method2352(class85.field1090 >> 3, (byte) 117, class309.field3898, class656.field8932 >> 3);
        class570.field7217 = arg0;
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(I)V", line = 258)
    private final void method754(int arg0) {
        field1346++;
        Random var2 = new Random((long) this.field1342);
        int var3 = 0;
        if (arg0 < 43) {
            return;
        }
        while (var3 < 255) {
            this.field1345[var3] = (short) var3;
            var3++;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class396.method2241(0, var5, var2);
            short var7 = this.field1345[var6];
            this.field1345[var6] = this.field1345[var5];
            this.field1345[var5] = this.field1345[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IBI)V")
    public abstract void method753(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(B)V")
    public abstract void method755(byte arg0);

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "(I)V")
    public abstract void method756(int arg0);
}
