import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public abstract class class204 {

    @OriginalMember(owner = "client!nt", name = "g", descriptor = "I")
    private int field3136 = 4;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "[S")
    private short[] field3133 = new short[512];

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    private int field3131 = 4;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
    public int field3132 = 4;

    @OriginalMember(owner = "client!nt", name = "j", descriptor = "I")
    private int field3139 = 4;

    @OriginalMember(owner = "client!nt", name = "i", descriptor = "I")
    private int field3138 = 0;

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "I")
    public static int field3134 = 0;

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!nt", name = "h", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!nt", name = "k", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "[S")
    private short[] field3130;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Z)V")
    public abstract void method1250(boolean arg0);

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)V")
    public abstract void method1249(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lgfa;Z[[[BIB)Z")
    public static final boolean method1437(class697 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class468.field6629) {
            return false;
        }
        int var5 = arg0.field9806 >> class30.field940;
        int var6 = arg0.field9815 >> class30.field940;
        if (var5 < class74.field1517 || var5 >= class369.field5474 || var6 < class168.field2821 || var6 >= class342.field5096) {
            return true;
        } else if ((arg2 == null || arg0.field9814 < arg3 || arg2[arg0.field9814][var5][var6] != arg4) && arg0.method836(true) && !arg0.method838((byte) 5)) {
            return false;
        } else {
            if (!arg1 && var5 >= class547.field7768 - 16 && var5 <= class547.field7768 + 16 && var6 >= class318.field4685 - 16 && var6 <= class318.field4685 + 16) {
                if (class701.field9863) {
                    class386.field5664[class344.field5126++].method3709((byte) 11, arg0);
                    class344.field5126 %= class202.field3122;
                } else {
                    arg0.method463(false, class521.field7381);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(Z)V")
    private final void method1438(boolean arg0) {
        this.field3130 = new short[this.field3132];
        field3137++;
        if (arg0) {
            this.method1243(true);
        }
        for (int var2 = 0; var2 < this.field3132; var2++) {
            this.field3130[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIZI)V")
    public final void method1439(int arg0, int arg1, boolean arg2, int arg3) {
        field3135++;
        int[] var5 = new int[arg1];
        int[] var6 = new int[arg0];
        for (int var7 = 0; var7 < arg1; var7++) {
            var5[var7] = (var7 << 12) / arg1;
        }
        int[] var8 = new int[arg3];
        for (int var9 = 0; var9 < arg0; var9++) {
            var6[var9] = (var9 << 12) / arg0;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            var8[var10] = (var10 << 12) / arg3;
        }
        this.method1250(arg2);
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg0; var12++) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < this.field3132; var14++) {
                        int var15 = this.field3130[var14] << 12;
                        int var16 = var5[var13] * var15 >> 12;
                        int var17 = var8[var11] * var15 >> 12;
                        int var18 = this.field3139 * var15 >> 12;
                        int var19 = this.field3131 * var15 >> 12;
                        int var20 = var6[var12] * var15 >> 12;
                        int var21 = this.field3136 * var15 >> 12;
                        int var22 = this.field3139 * var20;
                        int var23 = this.field3136 * var16;
                        int var24 = this.field3131 * var17;
                        int var25 = var23 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var22 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var28 & 0xFF;
                        int var31 = var24 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var22 & 0xFFF;
                        int var34;
                        if (var32 >= var19) {
                            var34 = 0;
                        } else {
                            var34 = var32 & 0xFF;
                        }
                        int var35 = var31 & 0xFF;
                        int var36;
                        if (var18 <= var29) {
                            var36 = 0;
                        } else {
                            var36 = var29 & 0xFF;
                        }
                        int var37 = var23 & 0xFFF;
                        int var38 = var24 & 0xFFF;
                        int var39;
                        if (var21 > var26) {
                            var39 = var26 & 0xFF;
                        } else {
                            var39 = 0;
                        }
                        int var40 = class335.field5014[var37];
                        short var41 = this.field3133[var34];
                        short var42 = this.field3133[var35];
                        int var43 = class335.field5014[var38];
                        int var44 = var38 - 4096;
                        int var45 = var33 - 4096;
                        int var46 = var37 - 4096;
                        int var47 = class335.field5014[var33];
                        short var48 = this.field3133[var30 + var41];
                        short var49 = this.field3133[var36 + var42];
                        short var50 = this.field3133[var30 + var42];
                        short var51 = this.field3133[var36 + var41];
                        int var52 = class202.method1431(this.field3133[var27 + var50], -14522, var38, var33, var37);
                        int var53 = class202.method1431(this.field3133[var39 + var50], -14522, var38, var33, var46);
                        int var54 = ((var53 - var52) * var40 >> 12) + var52;
                        int var55 = class202.method1431(this.field3133[var27 + var49], -14522, var38, var45, var37);
                        int var56 = class202.method1431(this.field3133[var39 + var49], -14522, var38, var45, var46);
                        int var57 = ((var56 - var55) * var40 >> 12) + var55;
                        int var58 = ((var57 - var54) * var47 >> 12) + var54;
                        int var59 = class202.method1431(this.field3133[var27 + var48], -14522, var44, var33, var37);
                        int var60 = class202.method1431(this.field3133[var39 + var48], -14522, var44, var33, var46);
                        int var61 = ((var60 - var59) * var40 >> 12) + var59;
                        int var62 = class202.method1431(this.field3133[var27 + var51], -14522, var44, var45, var37);
                        int var63 = class202.method1431(this.field3133[var39 + var51], -14522, var44, var45, var46);
                        int var64 = ((var63 - var62) * var40 >> 12) + var62;
                        int var65 = ((var64 - var61) * var47 >> 12) + var61;
                        this.method1249(-127, var14, ((var65 - var58) * var43 >> 12) + var58);
                    }
                    this.method1243(true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V")
    private final void method1440(byte arg0) {
        field3140++;
        Random var2 = new Random((long) this.field3138);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field3133[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var6 = 255 - var4;
            int var7 = class468.method2795(var2, var6, (byte) -93);
            short var8 = this.field3133[var7];
            this.field3133[var7] = this.field3133[var6];
            this.field3133[var6] = this.field3133[var6 + 256] = var8;
        }
        int var5 = 84 / ((46 - arg0) / 54);
    }

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "(Z)V")
    public abstract void method1243(boolean arg0);

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(IIIII)V")
    public class204(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3132 = arg1;
        this.field3139 = arg3;
        this.field3131 = arg4;
        this.field3138 = arg0;
        this.field3136 = arg2;
        this.method1438(false);
        this.method1440((byte) 127);
    }
}
