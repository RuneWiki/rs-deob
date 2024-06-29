import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public abstract class class167 {

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    private int field3017 = 0;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    private int field3012 = 4;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public int field3019 = 4;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    private int field3009 = 4;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    private int field3022 = 4;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "[S")
    private short[] field3021 = new short[512];

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field3011 = 0;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "[S")
    private short[] field3016;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 4)
    private final void method1304(int arg0) {
        this.field3016 = new short[this.field3019];
        field3015++;
        for (int var2 = 0; var2 < this.field3019; var2++) {
            this.field3016[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 <= 34) {
            method1307(75, 38);
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V", line = 36)
    private final void method1305(byte arg0) {
        field3020++;
        Random var2 = new Random((long) this.field3017);
        if (arg0 < 123) {
            return;
        }
        for (int var3 = 0; var3 < 255; var3++) {
            this.field3021[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class133.method1041(var2, var5, 10061);
            short var7 = this.field3021[var6];
            this.field3021[var6] = this.field3021[var5];
            this.field3021[var5] = this.field3021[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIBI)V", line = 84)
    public static final void method1306(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 < 40) {
            field3013 = -59;
        }
        if (class41.field875 != 0 && arg3 != 0 && class260.field4620 < 50 && arg1 != -1) {
            class3.field104[class260.field4620] = arg1;
            class266.field4785[class260.field4620] = arg3;
            class232.field4057[class260.field4620] = arg0;
            class92.field1724[class260.field4620] = null;
            class55.field1196[class260.field4620] = 0;
            class260.field4620++;
        }
        field3010++;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IIIII)V", line = 333)
    public class167(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3009 = arg4;
        this.field3012 = arg3;
        this.field3019 = arg1;
        this.field3022 = arg2;
        this.field3017 = arg0;
        this.method1304(48);
        this.method1305((byte) 126);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V", line = 117)
    public static final void method1307(int arg0, int arg1) {
        if (arg0 == -1 && !class204.field3634) {
            class53.method480(true);
        } else if (arg0 != -1 && (class125.field2292 != arg0 || !class113.method921(true)) && class113.field2073 != 0 && !class204.field3634) {
            class210.method1543(12218, 0, 2, class33.field742, arg0, class113.field2073, false);
        }
        class125.field2292 = arg0;
        field3014++;
        if (arg1 != -1) {
            method1306(-78, 103, (byte) 45, -97);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBII)V", line = 162)
    public final void method1308(int arg0, byte arg1, int arg2, int arg3) {
        field3008++;
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg2];
        if (arg1 != 85) {
            this.method229((byte) -9);
        }
        int[] var7 = new int[arg0];
        for (int var8 = 0; var8 < arg3; var8++) {
            var5[var8] = (var8 << 12) / arg3;
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var6[var9] = (var9 << 12) / arg2;
        }
        for (int var10 = 0; var10 < arg0; var10++) {
            var7[var10] = (var10 << 12) / arg0;
        }
        this.method229((byte) 28);
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field3019; var14++) {
                        int var15 = this.field3016[var14] << 12;
                        int var16 = this.field3009 * var15 >> 12;
                        int var17 = this.field3022 * var15 >> 12;
                        int var18 = var6[var12] * var15 >> 12;
                        int var19 = this.field3012 * var18;
                        int var20 = var5[var13] * var15 >> 12;
                        int var21 = this.field3012 * var15 >> 12;
                        int var22 = this.field3022 * var20;
                        int var23 = var7[var11] * var15 >> 12;
                        int var24 = var19 >> 12;
                        int var25 = this.field3009 * var23;
                        int var26 = var19 & 0xFFF;
                        int var27 = var26 - 4096;
                        int var28 = var24 + 1;
                        int var29 = var22 >> 12;
                        int var30 = var25 >> 12;
                        int var31 = var29 + 1;
                        int var32 = var25 & 0xFFF;
                        int var33 = var32 - 4096;
                        int var34;
                        if (var21 <= var28) {
                            var34 = 0;
                        } else {
                            var34 = var28 & 0xFF;
                        }
                        int var35 = class88.field1680[var26];
                        int var36 = var30 + 1;
                        int var37 = var24 & 0xFF;
                        int var38 = var29 & 0xFF;
                        int var39;
                        if (var31 < var17) {
                            var39 = var31 & 0xFF;
                        } else {
                            var39 = 0;
                        }
                        int var40 = var30 & 0xFF;
                        int var41 = class88.field1680[var32];
                        int var42;
                        if (var16 <= var36) {
                            var42 = 0;
                        } else {
                            var42 = var36 & 0xFF;
                        }
                        short var43 = this.field3021[var42];
                        short var44 = this.field3021[var37 + var43];
                        short var45 = this.field3021[var34 + var43];
                        short var46 = this.field3021[var40];
                        short var47 = this.field3021[var37 + var46];
                        int var48 = var22 & 0xFFF;
                        short var49 = this.field3021[var34 + var46];
                        int var50 = var48 - 4096;
                        int var51 = class88.field1680[var48];
                        int var52 = class92.method788(2522, var26, var48, var32, this.field3021[var38 + var47]);
                        int var53 = class92.method788(arg1 ^ 0x98F, var26, var50, var32, this.field3021[var39 + var47]);
                        int var54 = ((var53 - var52) * var51 >> 12) + var52;
                        int var55 = class92.method788(2522, var27, var48, var32, this.field3021[var38 + var49]);
                        int var56 = class92.method788(2522, var27, var50, var32, this.field3021[var39 + var49]);
                        int var57 = var55 + ((var56 - var55) * var51 >> 12);
                        int var58 = class92.method788(2522, var26, var48, var33, this.field3021[var38 + var44]);
                        int var59 = var54 + ((var57 - var54) * var35 >> 12);
                        int var60 = class92.method788(2522, var26, var50, var33, this.field3021[var39 + var44]);
                        int var61 = ((var60 - var58) * var51 >> 12) + var58;
                        int var62 = class92.method788(2522, var27, var48, var33, this.field3021[var38 + var45]);
                        int var63 = class92.method788(2522, var27, var50, var33, this.field3021[var39 + var45]);
                        int var64 = var62 + ((var63 - var62) * var51 >> 12);
                        int var65 = ((var64 - var61) * var35 >> 12) + var61;
                        this.method230(((var65 - var59) * var41 >> 12) + var59, arg1 ^ 0xFFFFFFFA, var14);
                    }
                    this.method226(true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public abstract void method229(byte arg0);

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
    public abstract void method226(boolean arg0);

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)V")
    public abstract void method230(int arg0, int arg1, int arg2);
}
