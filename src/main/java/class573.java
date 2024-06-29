import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public abstract class class573 {

    @OriginalMember(owner = "client!im", name = "e", descriptor = "I")
    private int field8098 = 4;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    private int field8097 = 4;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "[S")
    private short[] field8107 = new short[512];

    @OriginalMember(owner = "client!im", name = "o", descriptor = "I")
    public int field8108 = 4;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "I")
    private int field8106 = 0;

    @OriginalMember(owner = "client!im", name = "j", descriptor = "I")
    private int field8103 = 4;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "[Lnca;")
    public static class755[] field8096 = new class755[37];

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public static int field8095;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    public static int field8099;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    public static int field8100;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "I")
    public static int field8101;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "I")
    public static int field8102;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "I")
    public static int field8104;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "I")
    public static int field8105;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "[S")
    private short[] field8094;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Z)V")
    public static void method3314(boolean arg0) {
        if (arg0) {
            method3315(null, (byte) -124);
        }
        field8096 = null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V")
    public abstract void method2060(byte arg0);

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lcs;B)V")
    public static final void method3315(class342 arg0, byte arg1) {
        field8105++;
        if (class483.field6967) {
            return;
        }
        arg0.method1304((byte) 7);
        class68.field969--;
        if (arg1 >= -77) {
            field8096 = null;
        }
        if (!arg0.field4958) {
            long var5 = arg0.field4959;
            class567 var7;
            for (var7 = (class567) class33.field350.method2287(var5, (byte) -117); var7 != null && !var7.field8054.equals(arg0.field4969); var7 = (class567) class33.field350.method2280(true)) {
            }
            if (var7 != null && var7.method3302(-1, arg0)) {
                class371.method2277(var7, (byte) -112);
            }
            return;
        }
        for (class567 var2 = (class567) class673.field9386.method3508(-2); var2 != null; var2 = (class567) class673.field9386.method3507(-31)) {
            if (var2.field8054.equals(arg0.field4969)) {
                boolean var3 = false;
                for (class342 var4 = (class342) var2.field8055.method3508(-2); var4 != null; var4 = (class342) var2.field8055.method3507(-64)) {
                    if (arg0 == var4) {
                        if (var2.method3302(-1, arg0)) {
                            class371.method2277(var2, (byte) -118);
                        }
                        var3 = true;
                        break;
                    }
                }
                if (var3) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(B)V")
    public abstract void method2059(byte arg0);

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lha;Lrca;I)I")
    public static final int method3316(class60 arg0, class456 arg1, int arg2) {
        field8095++;
        if (~arg1.field6721 != arg2) {
            return arg1.field6721;
        }
        if (arg1.field6728 != -1) {
            class293 var3 = arg0.field849.method1124((byte) 114, arg1.field6728);
            if (!var3.field4184) {
                return var3.field4175;
            }
        }
        return arg1.field6713;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BII)V")
    public abstract void method2062(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IBIII)Z")
    public static final boolean method3317(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field8100++;
        if (!class24.field247 || !class587.field8325) {
            return false;
        } else if (class357.field5193 < 100) {
            return false;
        } else if (class361.method2249(arg3, arg1 + 15, arg4, arg2)) {
            int var5 = arg4 << class459.field6769;
            if (arg1 != 66) {
                return true;
            }
            int var6 = arg3 << class459.field6769;
            if (class81.method653((byte) 126, var6, arg0, class504.field7164, var5, class504.field7164, class582.field8287[arg2].method1787(arg4, 19646, arg3))) {
                class619.field8704++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIB)V")
    public final void method3318(int arg0, int arg1, int arg2, byte arg3) {
        field8101++;
        if (arg3 != -22) {
            return;
        }
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg1];
        for (int var7 = 0; var7 < arg0; var7++) {
            var5[var7] = (var7 << 12) / arg0;
        }
        int[] var8 = new int[arg2];
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg2; var10++) {
            var8[var10] = (var10 << 12) / arg2;
        }
        this.method2059((byte) -30);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field8108; var14++) {
                        int var15 = this.field8094[var14] << 12;
                        int var16 = this.field8097 * var15 >> 12;
                        int var17 = this.field8103 * var15 >> 12;
                        int var18 = var8[var11] * var15 >> 12;
                        int var19 = var5[var13] * var15 >> 12;
                        int var20 = var6[var12] * var15 >> 12;
                        int var21 = this.field8098 * var15 >> 12;
                        int var22 = this.field8098 * var19;
                        int var23 = this.field8103 * var18;
                        int var24 = this.field8097 * var20;
                        int var25 = var22 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var24 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var27 & 0xFF;
                        int var31 = var23 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var23 & 0xFFF;
                        int var34;
                        if (var17 <= var32) {
                            var34 = 0;
                        } else {
                            var34 = var32 & 0xFF;
                        }
                        int var35;
                        if (var21 <= var26) {
                            var35 = 0;
                        } else {
                            var35 = var26 & 0xFF;
                        }
                        int var36;
                        if (var16 <= var29) {
                            var36 = 0;
                        } else {
                            var36 = var29 & 0xFF;
                        }
                        int var37 = var24 & 0xFFF;
                        int var38 = var31 & 0xFF;
                        int var39 = var22 & 0xFFF;
                        int var40 = var37 - 4096;
                        short var41 = this.field8107[var34];
                        short var42 = this.field8107[var38];
                        int var43 = var39 - 4096;
                        int var44 = var33 - 4096;
                        int var45 = class442.field6574[var37];
                        int var46 = class442.field6574[var39];
                        int var47 = class442.field6574[var33];
                        short var48 = this.field8107[var30 + var41];
                        short var49 = this.field8107[var30 + var42];
                        short var50 = this.field8107[var36 + var41];
                        short var51 = this.field8107[var36 + var42];
                        int var52 = class537.method3152(var37, true, var39, this.field8107[var28 + var49], var33);
                        int var53 = class537.method3152(var37, true, var43, this.field8107[var35 + var49], var33);
                        int var54 = ((var53 - var52) * var46 >> 12) + var52;
                        int var55 = class537.method3152(var40, true, var39, this.field8107[var28 + var51], var33);
                        int var56 = class537.method3152(var40, true, var43, this.field8107[var35 + var51], var33);
                        int var57 = ((var56 - var55) * var46 >> 12) + var55;
                        int var58 = var54 + ((var57 - var54) * var45 >> 12);
                        int var59 = class537.method3152(var37, true, var39, this.field8107[var28 + var48], var44);
                        int var60 = class537.method3152(var37, true, var43, this.field8107[var35 + var48], var44);
                        int var61 = ((var60 - var59) * var46 >> 12) + var59;
                        int var62 = class537.method3152(var40, true, var39, this.field8107[var28 + var50], var44);
                        int var63 = class537.method3152(var40, true, var43, this.field8107[var35 + var50], var44);
                        int var64 = ((var63 - var62) * var46 >> 12) + var62;
                        int var65 = ((var64 - var61) * var45 >> 12) + var61;
                        this.method2062((byte) 126, var58 + ((var65 - var58) * var47 >> 12), var14);
                    }
                    this.method2060((byte) 120);
                }
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
    private final void method3319(int arg0) {
        field8104++;
        Random var2 = new Random((long) this.field8106);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field8107[var3] = (short) var3;
        }
        if (arg0 != -26065) {
            this.field8098 = 53;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class162.method1180(var2, var5, -117);
            short var7 = this.field8107[var6];
            this.field8107[var6] = this.field8107[var5];
            this.field8107[var5] = this.field8107[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(B)V")
    private final void method3320(byte arg0) {
        field8099++;
        this.field8094 = new short[this.field8108];
        if (arg0 <= 109) {
            method3314(false);
        }
        for (int var2 = 0; var2 < this.field8108; var2++) {
            this.field8094[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(IIIII)V")
    public class573(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field8103 = arg4;
        this.field8106 = arg0;
        this.field8108 = arg1;
        this.field8097 = arg3;
        this.field8098 = arg2;
        this.method3320((byte) 110);
        this.method3319(-26065);
    }
}
