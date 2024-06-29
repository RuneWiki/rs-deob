import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class500 {

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Z")
    public boolean field7289 = true;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    private int field7292 = -1;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    private int field7297;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    private int field7298;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "Lru;")
    private class130 field7300;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "Lur;")
    private class377 field7301;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    private int field7288;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "Lfe;")
    private class404 field7293;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "Ldj;")
    private class230 field7294;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Lkm;")
    private class238 field7286;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "Lho;")
    public static class103 field7302 = new class103(41, 3);

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field7287;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field7290;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field7295;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field7296;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field7299;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public final void method2999(int arg0) {
        this.method3000(this.field7293, this.field7288, arg0 ^ 0xFFFFB80F);
        field7295++;
        if (arg0 != -18360) {
            this.method3005((byte) 40);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lfe;II)V")
    private final void method3000(class404 arg0, int arg1, int arg2) {
        field7291++;
        if (arg1 != 0 && arg2 > 25) {
            this.method3005((byte) -73);
            this.field7301.method2236(this.field7286, 123);
            this.field7301.method2247(arg1, (byte) 41, 0, 4, arg0);
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
    public static void method3001(int arg0) {
        field7302 = null;
        if (arg0 != -10430) {
            method3001(125);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z[BII)V")
    public final void method3002(boolean arg0, byte[] arg1, int arg2, int arg3) {
        field7299++;
        this.field7294.method1466(!arg0, this.field7301.method2283(arg3, -5125) * arg2, arg1, arg3);
        this.method3000(this.field7294, arg2, 27);
        if (!arg0) {
            this.method3000(null, -59, 48);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIBI)Lob;")
    public static final class521 method3003(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field7296++;
        long var7 = (long) arg2 * 32147369L ^ (long) arg0 * 475427L ^ (long) arg1 * 97549L ^ (long) arg3 * 67481L ^ (long) arg6 * 986053L ^ (long) arg4 * 76724863L;
        class521 var9 = (class521) class415.field5978.method3032(3589, var7);
        if (var9 != null) {
            return var9;
        }
        class521 var10 = class275.field3667.method1230(arg3, arg1, arg0, arg6, arg2, arg4);
        if (arg5 < 119) {
            return null;
        } else {
            class415.field5978.method3046(var7, var10, 1);
            return var10;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)Z")
    public static final boolean method3004(byte arg0, int arg1) {
        class316.field4233 = true;
        class263.field3537 = arg1 + 1 & 0xFFFF;
        if (arg0 == -32) {
            field7287++;
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    private final void method3005(byte arg0) {
        field7290++;
        if (!this.field7289) {
            return;
        }
        if (arg0 != -73) {
            field7302 = null;
        }
        this.field7289 = false;
        byte[] var2 = this.field7300.field1683;
        byte[] var3 = this.field7301.field5456;
        int var4 = 0;
        int var5 = this.field7300.field1667;
        int var6 = this.field7300.field1667 * this.field7297 + this.field7298;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field7286 != null && this.field7292 == var4) {
            this.field7289 = false;
            return;
        }
        this.field7292 = var4;
        int var8 = 0;
        int var9 = this.field7297 * var5 + this.field7298;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var9] == 0) {
                    int var12 = 0;
                    if (var2[var9 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var9 + var5] != 0) {
                        var12++;
                    }
                    var3[var8++] = (byte) (var12 * 17);
                } else {
                    var3[var8++] = 68;
                }
                var9++;
            }
            var9 += this.field7300.field1667 - 128;
        }
        if (this.field7286 == null) {
            this.field7286 = new class238(this.field7301, 3553, 6406, 128, 128, false, this.field7301.field5456, 6406, false);
            this.field7286.method1499(false, 0, false);
            this.field7286.method1555((byte) 122, true);
        } else {
            this.field7286.method1495(this.field7301.field5456, 0, arg0 ^ 0xFFFFE6B0, 0, 0, 128, 6406, 0, false, 128);
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lur;Lru;Lsp;IIIII)V")
    public class500(class377 arg0, class130 arg1, class452 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field7297 = arg7;
        this.field7298 = arg6;
        this.field7300 = arg1;
        this.field7301 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field391 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field6750[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field7288 = var10;
        if (var10 <= 0) {
            this.field7286 = null;
        } else {
            class396 var14 = new class396(var10 * 2);
            if (this.field7301.field5334) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field391 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field6750[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method2444((byte) 65, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field391 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field6750[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method2434(-12659, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field7293 = this.field7301.method2308(false, 5123, var14.field5729, var14.field5761, 12905);
            this.field7294 = new class230(this.field7301, 5123, null, 1);
        }
    }
}
