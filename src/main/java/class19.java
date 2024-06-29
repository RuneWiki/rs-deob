import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class19 extends class443 {

    @OriginalMember(owner = "client!kv", name = "w", descriptor = "Lmj;")
    private class114 field193;

    @OriginalMember(owner = "client!kv", name = "z", descriptor = "Llba;")
    private class225 field196;

    @OriginalMember(owner = "client!kv", name = "x", descriptor = "Z")
    private boolean field194;

    @OriginalMember(owner = "client!kv", name = "y", descriptor = "Lwba;")
    private class601 field195;

    @OriginalMember(owner = "client!kv", name = "fa", descriptor = "(CIIIZ)V", line = 3)
    public final void method179(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field193.method985(4);
        this.field193.method988(1, this.field196);
        if (this.field194 || arg4) {
            this.field193.method974(class552.field7657, class317.field4523, (byte) -59);
            this.field193.method1014(0, 95, class504.field6917);
            this.field193.method1001(arg3, (byte) -82);
        } else {
            this.field193.method974(class552.field7657, class552.field7657, (byte) -59);
        }
        class742 var6 = this.field193.method941(-32256);
        var6.method1568(arg1, arg2, 0);
        this.field193.method1008(-118);
        this.field193.method71((byte) -43, 0, this.field195);
        this.field193.method89(this.field193.field1963, 123);
        this.field193.method124(arg0 * 4, class595.field8512, 2, 25886);
        if (this.field194 || arg4) {
            this.field193.method1014(0, 76, class264.field3730);
        }
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lmj;Lrt;[Lde;Z)V", line = 28)
    public class19(class114 arg0, class470 arg1, class418[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field193 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class418 var59 = arg2[var6];
            if (var59.field5792 > var5) {
                var5 = var59.field5792;
            }
            if (var59.field5796 > var5) {
                var5 = var59.field5796;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class418 var12 = arg2[var9];
                int var13 = var12.field5792;
                int var14 = var12.field5796;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field5798 == null) {
                    byte[] var19 = var12.field5793;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field5798;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method69((byte) -43, class547.field7573, class629.field8918)) {
                this.field196 = arg0.method990(class547.field7573, false, var7, var8, var7, (byte) 126);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field196 = arg0.method944(var7, var7, 21028, var10, false);
            }
            this.field194 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class418 var44 = arg2[var26];
                int[] var45 = var44.field5795;
                byte[] var46 = var44.field5798;
                byte[] var47 = var44.field5793;
                int var48 = var44.field5792;
                int var49 = var44.field5796;
                int var50 = var26 % 16 * var5;
                int var51 = var26 / 16 * var5;
                int var52 = var7 * var51 + var50;
                int var53 = 0;
                if (var46 == null) {
                    for (int var56 = 0; var56 < var48; var56++) {
                        for (int var57 = 0; var57 < var49; var57++) {
                            byte var58;
                            if ((var58 = var47[var53++]) == 0) {
                                var52++;
                            } else {
                                var25[var52++] = var45[var58 & 0xFF] | 0xFF000000;
                            }
                        }
                        var52 += var7 - var49;
                    }
                } else {
                    for (int var54 = 0; var54 < var48; var54++) {
                        for (int var55 = 0; var55 < var49; var55++) {
                            var25[var52++] = var46[var53] << 24 | var45[var47[var53] & 0xFF];
                            var53++;
                        }
                        var52 += var7 - var49;
                    }
                }
            }
            this.field196 = arg0.method944(var7, var7, 21028, var25, false);
            this.field194 = false;
        }
        this.field196.method211(27691, class330.field4718);
        this.field195 = arg0.method135(false, 0);
        this.field195.method41(20480, (byte) -114, 20);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field195.method39(true, 79);
            if (var28 != null) {
                Stream var29 = this.field193.method1007(1, var28);
                float var30 = this.field196.method328(431, (float) var7) / (float) var7;
                float var31 = this.field196.method330((float) var7, 126) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class418 var33 = arg2[var32];
                    int var34 = var33.field5792;
                    int var35 = var33.field5796;
                    int var36 = var33.field5799;
                    int var37 = var33.field5794;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method2263()) {
                        var29.method2251((float) var37);
                        var29.method2251((float) var36);
                        var29.method2251(0.0F);
                        var29.method2251(var40);
                        var29.method2251(var41);
                        var29.method2251((float) var37);
                        var29.method2251((float) (var34 + var36));
                        var29.method2251(0.0F);
                        var29.method2251(var40);
                        var29.method2251(var43);
                        var29.method2251((float) (var35 + var37));
                        var29.method2251((float) (var34 + var36));
                        var29.method2251(0.0F);
                        var29.method2251(var42);
                        var29.method2251(var43);
                        var29.method2251((float) (var35 + var37));
                        var29.method2251((float) var36);
                        var29.method2251(0.0F);
                        var29.method2251(var42);
                        var29.method2251(var41);
                    } else {
                        var29.method2258((float) var37);
                        var29.method2258((float) var36);
                        var29.method2258(0.0F);
                        var29.method2258(var40);
                        var29.method2258(var41);
                        var29.method2258((float) var37);
                        var29.method2258((float) (var34 + var36));
                        var29.method2258(0.0F);
                        var29.method2258(var40);
                        var29.method2258(var43);
                        var29.method2258((float) (var35 + var37));
                        var29.method2258((float) (var34 + var36));
                        var29.method2258(0.0F);
                        var29.method2258(var42);
                        var29.method2258(var43);
                        var29.method2258((float) (var35 + var37));
                        var29.method2258((float) var36);
                        var29.method2258(0.0F);
                        var29.method2258(var42);
                        var29.method2258(var41);
                    }
                }
                var29.method2255();
                if (this.field195.method36(6740)) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(CIIIZLaa;II)V", line = 333)
    public final void method180(char arg0, int arg1, int arg2, int arg3, boolean arg4, class88 arg5, int arg6, int arg7) {
    }
}
