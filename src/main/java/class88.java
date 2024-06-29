import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public abstract class class88 {

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    private int field1229 = 4;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    private int field1237 = 4;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    private int field1233 = 0;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public int field1241 = 4;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "[S")
    private short[] field1239 = new short[512];

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    private int field1240 = 4;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "Lwm;")
    public static class152 field1234 = class157.method1048("null", 115);

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "Lwm;")
    public static class152 field1231 = class157.method1048("tbrefresh", 102);

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "Lwm;")
    public static class152 field1242 = class157.method1048("Chargement en cours)3)3)3", 101);

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "Lah;")
    public static class205 field1236;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "[S")
    private short[] field1232;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIII)V", line = 7)
    public final void method577(int arg0, int arg1, int arg2, int arg3) {
        field1235++;
        if (arg0 <= 23) {
            method584(-25, (byte) 21, (class127) null);
        }
        int[] var5 = new int[arg2];
        int[] var6 = new int[arg1];
        int[] var7 = new int[arg3];
        for (int var8 = 0; var8 < arg3; var8++) {
            var7[var8] = (var8 << 12) / arg3;
        }
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg2; var10++) {
            var5[var10] = (var10 << 12) / arg2;
        }
        this.method579(false);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field1241; var14++) {
                        int var15 = this.field1232[var14] << 12;
                        int var16 = var6[var12] * var15 >> 12;
                        int var17 = this.field1229 * var16;
                        int var18 = var5[var11] * var15 >> 12;
                        int var19 = this.field1240 * var15 >> 12;
                        int var20 = this.field1237 * var15 >> 12;
                        int var21 = var17 >> 12;
                        int var22 = var21 + 1;
                        int var23 = var21 & 0xFF;
                        int var24 = var17 & 0xFFF;
                        int var25 = this.field1229 * var15 >> 12;
                        int var26 = class278.field4755[var24];
                        int var27;
                        if (var25 <= var22) {
                            var27 = 0;
                        } else {
                            var27 = var22 & 0xFF;
                        }
                        int var28 = var7[var13] * var15 >> 12;
                        int var29 = var24 - 4096;
                        int var30 = this.field1240 * var28;
                        int var31 = var30 >> 12;
                        int var32 = this.field1237 * var18;
                        int var33 = var32 >> 12;
                        int var34 = var30 & 0xFFF;
                        int var35 = class278.field4755[var34];
                        int var36 = var33 + 1;
                        int var37 = var32 & 0xFFF;
                        int var38 = var34 - 4096;
                        int var39 = class278.field4755[var37];
                        int var40 = var33 & 0xFF;
                        int var41 = var37 - 4096;
                        int var42;
                        if (var20 <= var36) {
                            var42 = 0;
                        } else {
                            var42 = var36 & 0xFF;
                        }
                        short var43 = this.field1239[var40];
                        short var44 = this.field1239[var27 + var43];
                        short var45 = this.field1239[var23 + var43];
                        short var46 = this.field1239[var42];
                        short var47 = this.field1239[var23 + var46];
                        int var48 = var31 + 1;
                        short var49 = this.field1239[var27 + var46];
                        int var50 = var31 & 0xFF;
                        int var51 = class66.method421(this.field1239[var50 + var45], -15, var34, var37, var24);
                        int var52;
                        if (var19 <= var48) {
                            var52 = 0;
                        } else {
                            var52 = var48 & 0xFF;
                        }
                        int var53 = class66.method421(this.field1239[var45 + var52], -15, var38, var37, var24);
                        int var54 = ((var53 - var51) * var35 >> 12) + var51;
                        int var55 = class66.method421(this.field1239[var50 + var44], -15, var34, var37, var29);
                        int var56 = class66.method421(this.field1239[var44 + var52], -15, var38, var37, var29);
                        int var57 = ((var56 - var55) * var35 >> 12) + var55;
                        int var58 = var54 + ((var57 - var54) * var26 >> 12);
                        int var59 = class66.method421(this.field1239[var47 + var50], -15, var34, var41, var24);
                        int var60 = class66.method421(this.field1239[var52 + var47], -15, var38, var41, var24);
                        int var61 = ((var60 - var59) * var35 >> 12) + var59;
                        int var62 = class66.method421(this.field1239[var50 + var49], -15, var34, var41, var29);
                        int var63 = class66.method421(this.field1239[var49 + var52], -15, var38, var41, var29);
                        int var64 = ((var63 - var62) * var35 >> 12) + var62;
                        int var65 = ((var64 - var61) * var26 >> 12) + var61;
                        this.method581(var14, -118, ((var65 - var58) * var39 >> 12) + var58);
                    }
                    this.method580(-13820);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V", line = 173)
    private final void method578(byte arg0) {
        field1230++;
        if (arg0 <= 70) {
            return;
        }
        Random var2 = new Random((long) this.field1233);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field1239[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class137.method870(var2, var5, (byte) -112);
            short var7 = this.field1239[var6];
            this.field1239[var6] = this.field1239[var5];
            this.field1239[var5] = this.field1239[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)V", line = 225)
    public static void method582(byte arg0) {
        field1234 = null;
        field1236 = null;
        field1242 = null;
        if (arg0 == 86) {
            field1231 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(IIIII)V", line = 311)
    public class88(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1233 = arg0;
        this.field1241 = arg1;
        this.field1240 = arg2;
        this.field1237 = arg4;
        this.field1229 = arg3;
        this.method583((byte) 83);
        this.method578((byte) 124);
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(B)V", line = 252)
    private final void method583(byte arg0) {
        field1238++;
        this.field1232 = new short[this.field1241];
        for (int var2 = 0; var2 < this.field1241; var2++) {
            this.field1232[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 != 83) {
            this.method583((byte) 111);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IBLoe;)I", line = 281)
    public static final int method584(int arg0, byte arg1, class127 arg2) {
        if (arg1 <= 14) {
            field1236 = (class205) null;
        }
        field1243++;
        if (!client.method1759(arg2).method553(arg0, (byte) -124) && arg2.field1928 == null) {
            return -1;
        } else if (arg2.field1945 == null || arg0 >= arg2.field1945.length) {
            return -1;
        } else {
            return arg2.field1945[arg0];
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)V")
    public abstract void method579(boolean arg0);

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public abstract void method580(int arg0);

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)V")
    public abstract void method581(int arg0, int arg1, int arg2);
}
