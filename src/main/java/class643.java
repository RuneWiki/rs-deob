import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class643 extends class597 {

    @OriginalMember(owner = "client!hba", name = "D", descriptor = "Lfc;")
    private class575 field8935;

    @OriginalMember(owner = "client!hba", name = "E", descriptor = "Lqaa;")
    private class309 field8936;

    @OriginalMember(owner = "client!hba", name = "C", descriptor = "Z")
    private boolean field8934;

    @OriginalMember(owner = "client!hba", name = "F", descriptor = "Lcu;")
    private class269 field8937;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(CIIIZLfa;II)V", line = 2)
    public final void method1189(char arg0, int arg1, int arg2, int arg3, boolean arg4, class619 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!hba", name = "q", descriptor = "(CIIIZ)V", line = 5)
    public final void method1191(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field8935.method3108(-66);
        this.field8935.method3091(true, this.field8936);
        if (this.field8934 || arg4) {
            this.field8935.method3105(class219.field2875, true, class510.field6687);
            this.field8935.method3115(0, 0, class425.field5511);
            this.field8935.method3142(arg3, -8);
        } else {
            this.field8935.method3105(class510.field6687, true, class510.field6687);
        }
        class131 var6 = this.field8935.method3106(119);
        var6.method146(arg1, arg2, 0);
        this.field8935.method3116(-105);
        this.field8935.method155(0, this.field8937, -128);
        this.field8935.method187(-2, this.field8935.field7790);
        this.field8935.method185(arg0 * 4, 2, -31084, class235.field3146);
        if (this.field8934 || arg4) {
            this.field8935.method3115(0, 0, class61.field833);
        }
    }

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(Lfc;Lsga;[Law;Z)V", line = 28)
    public class643(class575 arg0, class547 arg1, class506[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field8935 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class506 var59 = arg2[var6];
            if (var59.field6650 > var5) {
                var5 = var59.field6650;
            }
            if (var59.field6651 > var5) {
                var5 = var59.field6651;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class506 var12 = arg2[var9];
                int var13 = var12.field6650;
                int var14 = var12.field6651;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field6649 == null) {
                    byte[] var19 = var12.field6647;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field6649;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method222(class228.field3042, (byte) 120, class6.field48)) {
                this.field8936 = arg0.method3139(var7, var8, (byte) 33, false, var7, class228.field3042);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field8936 = arg0.method3078(var10, var7, 105, var7, false);
            }
            this.field8934 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class506 var44 = arg2[var26];
                int[] var45 = var44.field6648;
                byte[] var46 = var44.field6649;
                byte[] var47 = var44.field6647;
                int var48 = var44.field6650;
                int var49 = var44.field6651;
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
            this.field8936 = arg0.method3078(var25, var7, 76, var7, false);
            this.field8934 = false;
        }
        this.field8936.method1071(class105.field1381, -30763);
        this.field8937 = arg0.method159(false, false);
        this.field8937.method649((byte) 124, 20, 20480);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field8937.method647(false, true);
            if (var28 != null) {
                Stream var29 = this.field8935.method3087(var28, 6);
                float var30 = this.field8936.method1135(7886, (float) var7) / (float) var7;
                float var31 = this.field8936.method1136((float) var7, (byte) -127) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class506 var33 = arg2[var32];
                    int var34 = var33.field6650;
                    int var35 = var33.field6651;
                    int var36 = var33.field6652;
                    int var37 = var33.field6646;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method1964()) {
                        var29.method1958((float) var37);
                        var29.method1958((float) var36);
                        var29.method1958(0.0F);
                        var29.method1958(var40);
                        var29.method1958(var41);
                        var29.method1958((float) var37);
                        var29.method1958((float) (var34 + var36));
                        var29.method1958(0.0F);
                        var29.method1958(var40);
                        var29.method1958(var43);
                        var29.method1958((float) (var35 + var37));
                        var29.method1958((float) (var34 + var36));
                        var29.method1958(0.0F);
                        var29.method1958(var42);
                        var29.method1958(var43);
                        var29.method1958((float) (var35 + var37));
                        var29.method1958((float) var36);
                        var29.method1958(0.0F);
                        var29.method1958(var42);
                        var29.method1958(var41);
                    } else {
                        var29.method1956((float) var37);
                        var29.method1956((float) var36);
                        var29.method1956(0.0F);
                        var29.method1956(var40);
                        var29.method1956(var41);
                        var29.method1956((float) var37);
                        var29.method1956((float) (var34 + var36));
                        var29.method1956(0.0F);
                        var29.method1956(var40);
                        var29.method1956(var43);
                        var29.method1956((float) (var35 + var37));
                        var29.method1956((float) (var34 + var36));
                        var29.method1956(0.0F);
                        var29.method1956(var42);
                        var29.method1956(var43);
                        var29.method1956((float) (var35 + var37));
                        var29.method1956((float) var36);
                        var29.method1956(0.0F);
                        var29.method1956(var42);
                        var29.method1956(var41);
                    }
                }
                var29.method1955();
                if (this.field8937.method646(-118)) {
                    return;
                }
            }
        }
    }
}
