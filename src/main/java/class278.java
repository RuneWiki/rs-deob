import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public abstract class class278 {

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "I")
    private int field3995 = 4;

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "[S")
    private short[] field3996 = new short[512];

    @OriginalMember(owner = "client!jaa", name = "i", descriptor = "I")
    private int field4001 = 4;

    @OriginalMember(owner = "client!jaa", name = "m", descriptor = "I")
    private int field4005 = 4;

    @OriginalMember(owner = "client!jaa", name = "n", descriptor = "I")
    private int field4006 = 0;

    @OriginalMember(owner = "client!jaa", name = "j", descriptor = "I")
    public int field4002 = 4;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "Llk;")
    public static class638 field3993 = new class638(8);

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!jaa", name = "g", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!jaa", name = "h", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!jaa", name = "l", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!jaa", name = "k", descriptor = "Lae;")
    public static class283 field4003;

    @OriginalMember(owner = "client!jaa", name = "f", descriptor = "Llp;")
    public static class82 field3998;

    @OriginalMember(owner = "client!jaa", name = "o", descriptor = "[S")
    private short[] field4007;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V", line = 3)
    public static void method1804(int arg0) {
        field3993 = null;
        if (arg0 == 255) {
            field4003 = null;
            field3998 = null;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(IIIII)V", line = 351)
    public class278(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3995 = arg4;
        this.field4002 = arg1;
        this.field4005 = arg3;
        this.field4001 = arg2;
        this.field4006 = arg0;
        this.method1808(2);
        this.method1809(-1051820244);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIILjg;Ljg;)V", line = 24)
    public static final void method1805(int arg0, int arg1, int arg2, class770 arg3, class770 arg4) {
        class472 var5 = class646.method3699(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field6542 = arg3;
        var5.field6541 = arg4;
        int var6 = class661.field9303 == class594.field8355 ? 1 : 0;
        if (!arg3.method77(25833)) {
            arg3.field3455 = class289.field4265[var6];
            class289.field4265[var6] = arg3;
        } else if (arg3.method80(96)) {
            arg3.field3455 = class689.field9618[var6];
            class689.field9618[var6] = arg3;
        } else {
            arg3.field3455 = class226.field3436[var6];
            class226.field3436[var6] = arg3;
            class282.field4043 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method77(25833)) {
            if (arg4.method80(71)) {
                arg4.field3455 = class689.field9618[var6];
                class689.field9618[var6] = arg4;
                return;
            }
            arg4.field3455 = class226.field3436[var6];
            class226.field3436[var6] = arg4;
            class282.field4043 = true;
            return;
        }
        arg4.field3455 = class289.field4265[var6];
        class289.field4265[var6] = arg4;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIBI)V", line = 86)
    public final void method1806(int arg0, int arg1, byte arg2, int arg3) {
        field3994++;
        int[] var5 = new int[arg1];
        int[] var6 = new int[arg0];
        int[] var7 = new int[arg3];
        for (int var8 = 0; var8 < arg1; var8++) {
            var5[var8] = (var8 << 12) / arg1;
        }
        for (int var9 = 0; var9 < arg0; var9++) {
            var6[var9] = (var9 << 12) / arg0;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            var7[var10] = (var10 << 12) / arg3;
        }
        this.method716((byte) 66);
        if (arg2 != -85) {
            field3993 = null;
        }
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg0; var12++) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < this.field4002; var14++) {
                        int var15 = this.field4007[var14] << 12;
                        int var16 = this.field3995 * var15 >> 12;
                        int var17 = var7[var11] * var15 >> 12;
                        int var18 = var5[var13] * var15 >> 12;
                        int var19 = this.field4001 * var15 >> 12;
                        int var20 = this.field4005 * var15 >> 12;
                        int var21 = var6[var12] * var15 >> 12;
                        int var22 = this.field3995 * var17;
                        int var23 = this.field4001 * var18;
                        int var24 = this.field4005 * var21;
                        int var25 = var23 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var24 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var22 >> 12;
                        int var31 = var27 & 0xFF;
                        int var32 = var30 + 1;
                        int var33;
                        if (var19 <= var26) {
                            var33 = 0;
                        } else {
                            var33 = var26 & 0xFF;
                        }
                        int var34 = var23 & 0xFFF;
                        int var35;
                        if (var32 < var16) {
                            var35 = var32 & 0xFF;
                        } else {
                            var35 = 0;
                        }
                        int var36 = var22 & 0xFFF;
                        int var37;
                        if (var29 < var20) {
                            var37 = var29 & 0xFF;
                        } else {
                            var37 = 0;
                        }
                        int var38 = var30 & 0xFF;
                        int var39 = var24 & 0xFFF;
                        short var40 = this.field3996[var35];
                        short var41 = this.field3996[var38];
                        int var42 = var39 - 4096;
                        int var43 = var34 - 4096;
                        int var44 = class455.field6366[var36];
                        int var45 = var36 - 4096;
                        int var46 = class455.field6366[var39];
                        int var47 = class455.field6366[var34];
                        short var48 = this.field3996[var37 + var40];
                        short var49 = this.field3996[var31 + var40];
                        short var50 = this.field3996[var31 + var41];
                        short var51 = this.field3996[var37 + var41];
                        int var52 = class778.method4290(799, var36, var34, this.field3996[var28 + var50], var39);
                        int var53 = class778.method4290(799, var36, var43, this.field3996[var33 + var50], var39);
                        int var54 = ((var53 - var52) * var47 >> 12) + var52;
                        int var55 = class778.method4290(799, var36, var34, this.field3996[var28 + var51], var42);
                        int var56 = class778.method4290(799, var36, var43, this.field3996[var33 + var51], var42);
                        int var57 = ((var56 - var55) * var47 >> 12) + var55;
                        int var58 = class778.method4290(799, var45, var34, this.field3996[var28 + var49], var39);
                        int var59 = ((var57 - var54) * var46 >> 12) + var54;
                        int var60 = class778.method4290(799, var45, var43, this.field3996[var33 + var49], var39);
                        int var61 = ((var60 - var58) * var47 >> 12) + var58;
                        int var62 = class778.method4290(799, var45, var34, this.field3996[var28 + var48], var42);
                        int var63 = class778.method4290(799, var45, var43, this.field3996[var33 + var48], var42);
                        int var64 = ((var63 - var62) * var47 >> 12) + var62;
                        int var65 = ((var64 - var61) * var46 >> 12) + var61;
                        this.method717(23964, var14, var59 + ((var65 - var59) * var44 >> 12));
                    }
                    this.method715(arg2 - 16664);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)[Lada;", line = 254)
    public static final class267[] method1807(int arg0) {
        field4000++;
        if (arg0 != 4) {
            method1807(7);
        }
        return new class267[] { class521.field7185, class132.field1693, class713.field9924 };
    }

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "(I)V", line = 275)
    private final void method1808(int arg0) {
        field3999++;
        if (arg0 != 2) {
            this.field3996 = null;
        }
        this.field4007 = new short[this.field4002];
        for (int var2 = 0; var2 < this.field4002; var2++) {
            this.field4007[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "(I)V", line = 301)
    private final void method1809(int arg0) {
        field3997++;
        Random var2 = new Random((long) this.field4006);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field3996[var3] = (short) var3;
        }
        int var4 = 0;
        if (arg0 != -1051820244) {
            return;
        }
        while (var4 < 255) {
            int var5 = 255 - var4;
            int var6 = class427.method2573(var2, var5, -87);
            short var7 = this.field3996[var6];
            this.field3996[var6] = this.field3996[var5];
            this.field3996[var5] = this.field3996[var5 + 256] = var7;
            var4++;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(B)V")
    public abstract void method716(byte arg0);

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "(I)V")
    public abstract void method715(int arg0);

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(III)V")
    public abstract void method717(int arg0, int arg1, int arg2);
}
