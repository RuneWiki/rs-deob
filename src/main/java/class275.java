import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public abstract class class275 {

    @OriginalMember(owner = "client!df", name = "i", descriptor = "[S")
    private short[] field4053 = new short[512];

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    private int field4047 = 4;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public int field4049 = 4;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    private int field4048 = 0;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    private int field4052 = 4;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    private int field4057 = 4;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "Z")
    public static boolean field4056 = false;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "Lfs;")
    public static class387 field4059;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "[S")
    private short[] field4051;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILya;III)V")
    public static final void method1768(int arg0, int arg1, class38 arg2, int arg3, int arg4, int arg5) {
        arg2.method380(arg3, arg4, arg0 + arg3, arg4 + arg5);
        field4055++;
        arg2.method367(arg3, arg0, arg4, (byte) 58, -16777216, arg5);
        if (class228.field3318 < 100) {
            return;
        }
        float var6 = (float) class399.field5927 / (float) class399.field5923;
        int var7 = arg0;
        int var8 = arg5;
        if (var6 < 1.0F) {
            var8 = (int) ((float) arg0 * var6);
        } else {
            var7 = (int) ((float) arg5 / var6);
        }
        int var9 = (arg0 - var7) / 2 + arg3;
        int var10 = (arg5 - var8) / 2 + arg4;
        if (class267.field3928 == null || arg0 != class267.field3928.method110() || class267.field3928.method126() != arg5) {
            class399.method2460(class399.field5926, class399.field5927 + class399.field5910, class399.field5926 - -class399.field5923, class399.field5910, var9, var10, var9 + var7, var10 - -var8);
            class399.method2455(arg2);
            class267.field3928 = arg2.method349(var9, var10, var7, var8, false);
        }
        class267.field3928.method111(var9, var10);
        int var11 = class333.field4628 * var7 / class399.field5923;
        int var12 = class229.field3361 * var8 / class399.field5927;
        int var13 = 71 % ((arg1 + 55) / 59);
        int var14 = class76.field1035 * var7 / class399.field5923 + var9;
        int var15 = var8 + var10 - (class38.field435 * var8 / class399.field5927) - var12;
        int var16 = -1996554240;
        if (class61.field703 == class51.field564) {
            var16 = -1996488705;
        }
        arg2.method386(var14, var15, var11, var12, var16, 1);
        arg2.method397(var14, var15, var11, var12, var16, 0);
        if (class509.field7504 <= 0) {
            return;
        }
        int var17;
        if (class417.field6164 > 50) {
            var17 = (100 - class417.field6164) * 5;
        } else {
            var17 = class417.field6164 * 5;
        }
        for (class111 var18 = (class111) class399.field5903.method1018(110); var18 != null; var18 = (class111) class399.field5903.method1022((byte) -112)) {
            class405 var19 = class399.field5891.method837(var18.field1567, (byte) -41);
            if (class204.method1430(var19, 2)) {
                if (class496.field7277 == var18.field1567) {
                    int var22 = var9 + (var18.field1566 * var7 / class399.field5923);
                    int var23 = (class399.field5927 - var18.field1560) * var8 / class399.field5927 + var10;
                    arg2.method367(var22 - 2, 4, var23 - 2, (byte) 58, var17 << 24 | 0xFFFF00, 4);
                } else if (class392.field5773 != -1 && class392.field5773 == var19.field6007) {
                    int var20 = var9 + (var18.field1566 * var7 / class399.field5923);
                    int var21 = (class399.field5927 - var18.field1560) * var8 / class399.field5927 + var10;
                    arg2.method367(var20 - 2, 4, var21 - 2, (byte) 58, var17 << 24 | 0xFFFF00, 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BIII)V")
    public final void method1769(byte arg0, int arg1, int arg2, int arg3) {
        field4046++;
        if (arg0 >= -51) {
            method1771(60);
        }
        int[] var5 = new int[arg1];
        int[] var6 = new int[arg3];
        for (int var7 = 0; var7 < arg1; var7++) {
            var5[var7] = (var7 << 12) / arg1;
        }
        int[] var8 = new int[arg2];
        for (int var9 = 0; var9 < arg3; var9++) {
            var6[var9] = (var9 << 12) / arg3;
        }
        for (int var10 = 0; var10 < arg2; var10++) {
            var8[var10] = (var10 << 12) / arg2;
        }
        this.method1078(-99);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < this.field4049; var14++) {
                        int var15 = this.field4051[var14] << 12;
                        int var16 = var5[var13] * var15 >> 12;
                        int var17 = this.field4047 * var15 >> 12;
                        int var18 = this.field4057 * var15 >> 12;
                        int var19 = var8[var11] * var15 >> 12;
                        int var20 = var6[var12] * var15 >> 12;
                        int var21 = this.field4052 * var15 >> 12;
                        int var22 = this.field4052 * var16;
                        int var23 = this.field4057 * var20;
                        int var24 = this.field4047 * var19;
                        int var25 = var22 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var23 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var27 & 0xFF;
                        int var31 = var24 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var23 & 0xFFF;
                        int var34 = var31 & 0xFF;
                        int var35 = var22 & 0xFFF;
                        int var36 = var24 & 0xFFF;
                        int var37;
                        if (var17 <= var32) {
                            var37 = 0;
                        } else {
                            var37 = var32 & 0xFF;
                        }
                        int var38;
                        if (var26 < var21) {
                            var38 = var26 & 0xFF;
                        } else {
                            var38 = 0;
                        }
                        int var39;
                        if (var18 > var29) {
                            var39 = var29 & 0xFF;
                        } else {
                            var39 = 0;
                        }
                        int var40 = class212.field3050[var35];
                        short var41 = this.field4053[var37];
                        int var42 = var36 - 4096;
                        int var43 = var35 - 4096;
                        int var44 = var33 - 4096;
                        short var45 = this.field4053[var34];
                        int var46 = class212.field3050[var33];
                        int var47 = class212.field3050[var36];
                        short var48 = this.field4053[var30 + var41];
                        short var49 = this.field4053[var39 + var41];
                        short var50 = this.field4053[var39 + var45];
                        short var51 = this.field4053[var30 + var45];
                        int var52 = class453.method2733(var33, -5, var35, var36, this.field4053[var28 + var51]);
                        int var53 = class453.method2733(var33, -5, var43, var36, this.field4053[var38 + var51]);
                        int var54 = ((var53 - var52) * var40 >> 12) + var52;
                        int var55 = class453.method2733(var44, -5, var35, var36, this.field4053[var28 + var50]);
                        int var56 = class453.method2733(var44, -5, var43, var36, this.field4053[var38 + var50]);
                        int var57 = ((var56 - var55) * var40 >> 12) + var55;
                        int var58 = var54 + ((var57 - var54) * var46 >> 12);
                        int var59 = class453.method2733(var33, -5, var35, var42, this.field4053[var28 + var48]);
                        int var60 = class453.method2733(var33, -5, var43, var42, this.field4053[var38 + var48]);
                        int var61 = ((var60 - var59) * var40 >> 12) + var59;
                        int var62 = class453.method2733(var44, -5, var35, var42, this.field4053[var28 + var49]);
                        int var63 = class453.method2733(var44, -5, var43, var42, this.field4053[var38 + var49]);
                        int var64 = ((var63 - var62) * var40 >> 12) + var62;
                        int var65 = var61 + ((var64 - var61) * var46 >> 12);
                        this.method1076(var14, ((var65 - var58) * var47 >> 12) + var58, true);
                    }
                    this.method1074((byte) -76);
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    private final void method1770(int arg0) {
        if (arg0 != 731) {
            this.method1769((byte) -7, 87, -18, 75);
        }
        field4045++;
        this.field4051 = new short[this.field4049];
        for (int var2 = 0; var2 < this.field4049; var2++) {
            this.field4051[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
    public abstract void method1074(byte arg0);

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public static final void method1771(int arg0) {
        if (arg0 <= -119) {
            class126.field1841.method874(0);
            field4054++;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
    private final void method1772(byte arg0) {
        field4050++;
        if (arg0 != -15) {
            field4059 = null;
        }
        Random var2 = new Random((long) this.field4048);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field4053[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class245.method1609((byte) 94, var2, var5);
            short var7 = this.field4053[var6];
            this.field4053[var6] = this.field4053[var5];
            this.field4053[var5] = this.field4053[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIZ)V")
    public abstract void method1076(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
    public static void method1773(int arg0) {
        if (arg0 != 385672172) {
            method1771(-103);
        }
        field4059 = null;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
    public abstract void method1078(int arg0);

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(IIIII)V")
    public class275(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4049 = arg1;
        this.field4047 = arg4;
        this.field4057 = arg3;
        this.field4048 = arg0;
        this.field4052 = arg2;
        this.method1770(731);
        this.method1772((byte) -15);
    }

    static {
        new class331("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
    }
}
