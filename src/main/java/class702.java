import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public abstract class class702 {

    @OriginalMember(owner = "client!cda", name = "h", descriptor = "I")
    private int field9812 = 0;

    @OriginalMember(owner = "client!cda", name = "i", descriptor = "I")
    private int field9813 = 4;

    @OriginalMember(owner = "client!cda", name = "j", descriptor = "[S")
    private short[] field9814 = new short[512];

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "I")
    private int field9819 = 4;

    @OriginalMember(owner = "client!cda", name = "e", descriptor = "I")
    private int field9818 = 4;

    @OriginalMember(owner = "client!cda", name = "k", descriptor = "I")
    public int field9820 = 4;

    @OriginalMember(owner = "client!cda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9822 = new String[] { method5054(method5053("G|Csf\f")), method5054(method5053("G|Csd\f")), method5054(method5053("G|Cs\u001eMvK)\u001c\f")), method5054(method5053("G|Cse\f")), method5054(method5053("G|Csg\f")) };

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "Lmv;")
    public static class125 field9811 = new class125(77, 3);

    @OriginalMember(owner = "client!cda", name = "f", descriptor = "I")
    public static int field9815;

    @OriginalMember(owner = "client!cda", name = "g", descriptor = "I")
    public static int field9816;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "I")
    public static int field9821;

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "[S")
    private short[] field9817;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(BIII)V", line = 5)
    public final void method5049(byte arg0, int arg1, int arg2, int arg3) {
        try {
            field9816++;
            if (arg0 != -48) {
                this.method664(-12);
            }
            int[] var5 = new int[arg2];
            int[] var6 = new int[arg3];
            int[] var7 = new int[arg1];
            for (int var8 = 0; var8 < arg2; var8++) {
                var5[var8] = (var8 << 12) / arg2;
            }
            for (int var9 = 0; var9 < arg3; var9++) {
                var6[var9] = (var9 << 12) / arg3;
            }
            for (int var10 = 0; var10 < arg1; var10++) {
                var7[var10] = (var10 << 12) / arg1;
            }
            this.method664(-9803);
            for (int var11 = 0; var11 < arg1; var11++) {
                for (int var12 = 0; var12 < arg3; var12++) {
                    for (int var13 = 0; var13 < arg2; var13++) {
                        for (int var14 = 0; var14 < this.field9820; var14++) {
                            int var15 = this.field9817[var14] << 12;
                            int var16 = this.field9813 * var15 >> 12;
                            int var17 = var7[var11] * var15 >> 12;
                            int var18 = this.field9818 * var15 >> 12;
                            int var19 = var5[var13] * var15 >> 12;
                            int var20 = var6[var12] * var15 >> 12;
                            int var21 = this.field9819 * var15 >> 12;
                            int var22 = this.field9818 * var20;
                            int var23 = this.field9819 * var17;
                            int var24 = this.field9813 * var19;
                            int var25 = var24 >> 12;
                            int var26 = var25 + 1;
                            int var27 = var22 >> 12;
                            int var28 = var25 & 0xFF;
                            int var29 = var27 + 1;
                            int var30 = var27 & 0xFF;
                            int var31 = var23 >> 12;
                            int var32 = var31 + 1;
                            int var33 = var31 & 0xFF;
                            int var34;
                            if (var18 <= var29) {
                                var34 = 0;
                            } else {
                                var34 = var29 & 0xFF;
                            }
                            int var35;
                            if (var21 > var32) {
                                var35 = var32 & 0xFF;
                            } else {
                                var35 = 0;
                            }
                            int var36 = var23 & 0xFFF;
                            int var37 = var22 & 0xFFF;
                            int var38 = var24 & 0xFFF;
                            int var39;
                            if (var16 <= var26) {
                                var39 = 0;
                            } else {
                                var39 = var26 & 0xFF;
                            }
                            int var40 = class585.field8435[var38];
                            int var41 = var38 - 4096;
                            short var42 = this.field9814[var33];
                            int var43 = class585.field8435[var37];
                            short var44 = this.field9814[var35];
                            int var45 = class585.field8435[var36];
                            int var46 = var36 - 4096;
                            int var47 = var37 - 4096;
                            short var48 = this.field9814[var30 + var44];
                            short var49 = this.field9814[var30 + var42];
                            short var50 = this.field9814[var34 + var44];
                            short var51 = this.field9814[var34 + var42];
                            int var52 = class660.method4788((byte) -120, this.field9814[var28 + var49], var37, var36, var38);
                            int var53 = class660.method4788((byte) -120, this.field9814[var39 + var49], var37, var36, var41);
                            int var54 = var52 + ((var53 - var52) * var40 >> 12);
                            int var55 = class660.method4788((byte) -120, this.field9814[var28 + var51], var47, var36, var38);
                            int var56 = class660.method4788((byte) -120, this.field9814[var39 + var51], var47, var36, var41);
                            int var57 = ((var56 - var55) * var40 >> 12) + var55;
                            int var58 = class660.method4788((byte) -120, this.field9814[var28 + var48], var37, var46, var38);
                            int var59 = ((var57 - var54) * var43 >> 12) + var54;
                            int var60 = class660.method4788((byte) -120, this.field9814[var39 + var48], var37, var46, var41);
                            int var61 = ((var60 - var58) * var40 >> 12) + var58;
                            int var62 = class660.method4788((byte) -120, this.field9814[var28 + var50], var47, var46, var38);
                            int var63 = class660.method4788((byte) -120, this.field9814[var39 + var50], var47, var46, var41);
                            int var64 = var62 + ((var63 - var62) * var40 >> 12);
                            int var65 = var61 + ((var64 - var61) * var43 >> 12);
                            this.method660(var14, arg0 - 22412, ((-var59 + var65) * var45 >> 12) + var59);
                        }
                        this.method662((byte) 47);
                    }
                }
            }
        } catch (RuntimeException var67) {
            throw class665.method4799(var67, field9822[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V", line = 177)
    private final void method5050(int arg0) {
        try {
            field9821++;
            this.field9817 = new short[this.field9820];
            int var2 = 0;
            if (arg0 != -23223) {
                this.field9818 = -25;
            }
            while (this.field9820 > var2) {
                this.field9817[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                var2++;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9822[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(IIIII)V", line = 275)
    public class702(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            this.field9819 = arg4;
            this.field9820 = arg1;
            this.field9818 = arg3;
            this.field9813 = arg2;
            this.field9812 = arg0;
            this.method5050(-23223);
            this.method5051(255);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field9822[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(I)V", line = 206)
    private final void method5051(int arg0) {
        try {
            field9815++;
            Random var2 = new Random((long) this.field9812);
            if (arg0 != 255) {
                this.field9813 = 28;
            }
            for (int var3 = 0; var3 < 255; var3++) {
                this.field9814[var3] = (short) var3;
            }
            for (int var4 = 0; var4 < 255; var4++) {
                int var5 = 255 - var4;
                int var6 = class70.method723(var2, var5, (byte) 58);
                short var7 = this.field9814[var6];
                this.field9814[var6] = this.field9814[var5];
                this.field9814[var5] = this.field9814[var5 + 256] = var7;
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field9822[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Z)V", line = 254)
    public static void method5052(boolean arg0) {
        try {
            if (!arg0) {
                field9811 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9822[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "(I)V")
    public abstract void method664(int arg0);

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(III)V")
    public abstract void method660(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)V")
    public abstract void method662(byte arg0);

    @OriginalMember(owner = "client!cda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5053(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x22);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5054(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 36;
                    break;
                case 1:
                    var10005 = 24;
                    break;
                case 2:
                    var10005 = 34;
                    break;
                case 3:
                    var10005 = 93;
                    break;
                default:
                    var10005 = 34;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
