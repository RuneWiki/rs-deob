import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class430 {

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    private int field6366 = -1;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "Z")
    public boolean field6384 = true;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "Lqq;")
    private class410 field6374;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    private int field6375;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "Lad;")
    private class362 field6371;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    private int field6373;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    private int field6380;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "Lcs;")
    private class289 field6376;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "Lil;")
    private class7 field6379;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "Ljp;")
    private class300 field6377;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "Lvo;")
    public static class37 field6368 = new class37(0, 0);

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public static int field6381 = 0;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "Lea;")
    public static class474 field6385 = new class474("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field6365;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lpt;III)V", line = 5)
    public static final void method2677(class460 arg0, int arg1, int arg2, int arg3) {
        long var4 = class207.field2784[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field6869 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var8 <= 0) {
                break;
            }
            arg0.field6871[arg0.field6869++] = class48.field512[var8 - 1].field522;
            var6 += 16L;
        }
        for (int var9 = arg0.field6869; var9 < 4; var9++) {
            arg0.field6871[var9] = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "([BIII)V", line = 37)
    public final void method2678(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 3) {
            method2682(92, (byte) -86);
        }
        field6382++;
        this.field6377.method38(arg0, arg1 * this.field6371.method2310(-128, arg2), arg2, true);
        this.method2684(this.field6377, arg1, arg3 ^ 0xFFFFFFFC);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/io/File;B)[B", line = 51)
    public static final byte[] method2679(File arg0, byte arg1) {
        field6365++;
        if (arg1 != 117) {
            field6385 = null;
        }
        return class113.method704((int) arg0.length(), arg0, arg1 + 32467);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V", line = 62)
    private final void method2680(boolean arg0) {
        field6372++;
        if (!this.field6384) {
            return;
        }
        this.field6384 = false;
        byte[] var2 = this.field6374.field6225;
        if (!arg0) {
            method2686(false);
        }
        byte[] var3 = this.field6371.field5495;
        int var4 = 0;
        int var5 = this.field6374.field6229;
        int var6 = this.field6374.field6229 * this.field6373 + this.field6375;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field6376 != null && this.field6366 == var4) {
            this.field6384 = false;
            return;
        }
        this.field6366 = var4;
        int var8 = this.field6373 * var5 + this.field6375;
        int var9 = 0;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var8] != 0) {
                        var12++;
                    }
                    var3[var9++] = (byte) (var12 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var8++;
            }
            var8 += this.field6374.field6229 - 128;
        }
        if (this.field6376 == null) {
            this.field6376 = new class289(this.field6371, 3553, 6406, 128, 128, false, this.field6371.field5495, 6406, false);
            this.field6376.method1867(false, 2203, false);
            this.field6376.method3020(true, 0);
        } else {
            this.field6376.method1872(128, 0, 128, 0, this.field6371.field5495, 0, 0, false, 30491, 6406);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)Z", line = 168)
    public static final boolean method2681(int arg0, int arg1, int arg2) {
        field6370++;
        int var3 = -80 % ((32 - arg2) / 45);
        return (class271.method1777(arg0, arg1, 116) | class131.method804(-68, arg0, arg1) | class299.method1993(arg0, (byte) 93, arg1)) & class185.method1080(arg1, arg0, false);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)V", line = 178)
    public static final void method2682(int arg0, byte arg1) {
        field6383++;
        class467 var2 = class541.method3144(arg0, (byte) -89, 3);
        if (arg1 != 15) {
            field6368 = null;
        }
        var2.method2852(0);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V", line = 197)
    public final void method2683(int arg0) {
        if (arg0 < 106) {
            this.method2680(false);
        }
        field6378++;
        this.method2684(this.field6379, this.field6380, -1);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lil;II)V", line = 212)
    private final void method2684(class7 arg0, int arg1, int arg2) {
        field6369++;
        if (~arg1 != arg2) {
            this.method2680(true);
            this.field6371.method2295(-94, this.field6376);
            this.field6371.method2263(0, arg1, 4, (byte) -66, arg0);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IBI)V", line = 226)
    public static final void method2685(int arg0, byte arg1, int arg2) {
        field6367++;
        if (arg1 != 32) {
            method2677(null, -41, 48, 69);
        }
        class467 var3 = class541.method3144(arg2, (byte) -119, 6);
        var3.method2851(true);
        var3.field6926 = arg0;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(Z)V", line = 245)
    public static void method2686(boolean arg0) {
        field6385 = null;
        if (!arg0) {
            method2677(null, -33, -88, 93);
        }
        field6368 = null;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lad;Lqq;Lpf;IIIII)V", line = 270)
    public class430(class362 arg0, class410 arg1, class506 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field6374 = arg1;
        this.field6375 = arg6;
        this.field6371 = arg0;
        this.field6373 = arg7;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field1656 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field7336[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field6380 = var10;
        if (var10 <= 0) {
            this.field6376 = null;
        } else {
            class194 var14 = new class194(var10 * 2);
            if (this.field6371.field5468) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field1656 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field7336[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method1229(var23[var24] & 0xFFFF, 30364);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field1656 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field7336[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method1185(var18[var19] & 0xFFFF, 1616065864);
                            }
                        }
                    }
                }
            }
            this.field6379 = this.field6371.method2270(var14.field2622, var14.field2610, 5123, (byte) 9, false);
            this.field6377 = new class300(this.field6371, 5123, null, 1);
        }
    }
}
