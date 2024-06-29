import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class482 extends class418 {

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "Lrr;")
    private class332 field7088;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "Lmca;")
    private class29 field7090;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "Z")
    private boolean field7089;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "Log;")
    private class601 field7087;

    @OriginalMember(owner = "client!ni", name = "OA", descriptor = "(CIIIZ)V", line = 6)
    public final void method1408(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field7088.method2225(94);
        this.field7088.method2271(this.field7090, 5180);
        if (this.field7089 || arg4) {
            this.field7088.method2275(class646.field9074, 93, class406.field6268);
            this.field7088.method2287((byte) -70, 0, class471.field6974);
            this.field7088.method2290(10359, arg3);
        } else {
            this.field7088.method2275(class406.field6268, 104, class406.field6268);
        }
        class498 var6 = this.field7088.method2296(0);
        var6.method503(arg1, arg2, 0);
        this.field7088.method2270(-57);
        this.field7088.method178(this.field7087, 0, -101);
        this.field7088.method137(-100, this.field7088.field5432);
        this.field7088.method111(2, arg0 * 4, (byte) 13, class654.field9145);
        if (this.field7089 || arg4) {
            this.field7088.method2287((byte) -115, 0, class622.field8779);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(CIIIZLua;II)V", line = 28)
    public final void method1410(char arg0, int arg1, int arg2, int arg3, boolean arg4, class617 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lrr;Lufa;[Lwt;Z)V", line = 33)
    public class482(class332 arg0, class632 arg1, class284[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field7088 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class284 var59 = arg2[var6];
            if (var59.field4537 > var5) {
                var5 = var59.field4537;
            }
            if (var59.field4535 > var5) {
                var5 = var59.field4535;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class284 var12 = arg2[var9];
                int var13 = var12.field4537;
                int var14 = var12.field4535;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field4539 == null) {
                    byte[] var19 = var12.field4532;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field4539;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method164(class134.field2197, class203.field3311, 126)) {
                this.field7090 = arg0.method2241(var8, -127, false, class203.field3311, var7, var7);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field7090 = arg0.method2243(var10, var7, false, var7, (byte) -20);
            }
            this.field7089 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class284 var44 = arg2[var26];
                int[] var45 = var44.field4538;
                byte[] var46 = var44.field4539;
                byte[] var47 = var44.field4532;
                int var48 = var44.field4537;
                int var49 = var44.field4535;
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
            this.field7090 = arg0.method2243(var25, var7, false, var7, (byte) -20);
            this.field7089 = false;
        }
        this.field7090.method246(class123.field2045, (byte) 15);
        this.field7087 = arg0.method174(false, 81);
        this.field7087.method1725((byte) -89, 20480, 20);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field7087.method1726(true, true);
            if (var28 != null) {
                Stream var29 = this.field7088.method2286(var28, (byte) -127);
                float var30 = this.field7090.method365(-96, (float) var7) / (float) var7;
                float var31 = this.field7090.method373((float) var7, (byte) -70) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class284 var33 = arg2[var32];
                    int var34 = var33.field4537;
                    int var35 = var33.field4535;
                    int var36 = var33.field4540;
                    int var37 = var33.field4533;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3620()) {
                        var29.method3621((float) var37);
                        var29.method3621((float) var36);
                        var29.method3621(0.0F);
                        var29.method3621(var40);
                        var29.method3621(var41);
                        var29.method3621((float) var37);
                        var29.method3621((float) (var34 + var36));
                        var29.method3621(0.0F);
                        var29.method3621(var40);
                        var29.method3621(var43);
                        var29.method3621((float) (var35 + var37));
                        var29.method3621((float) (var34 + var36));
                        var29.method3621(0.0F);
                        var29.method3621(var42);
                        var29.method3621(var43);
                        var29.method3621((float) (var35 + var37));
                        var29.method3621((float) var36);
                        var29.method3621(0.0F);
                        var29.method3621(var42);
                        var29.method3621(var41);
                    } else {
                        var29.method3630((float) var37);
                        var29.method3630((float) var36);
                        var29.method3630(0.0F);
                        var29.method3630(var40);
                        var29.method3630(var41);
                        var29.method3630((float) var37);
                        var29.method3630((float) (var34 + var36));
                        var29.method3630(0.0F);
                        var29.method3630(var40);
                        var29.method3630(var43);
                        var29.method3630((float) (var35 + var37));
                        var29.method3630((float) (var34 + var36));
                        var29.method3630(0.0F);
                        var29.method3630(var42);
                        var29.method3630(var43);
                        var29.method3630((float) (var35 + var37));
                        var29.method3630((float) var36);
                        var29.method3630(0.0F);
                        var29.method3630(var42);
                        var29.method3630(var41);
                    }
                }
                var29.method3626();
                if (this.field7087.method1722(-23181)) {
                    return;
                }
            }
        }
    }
}
