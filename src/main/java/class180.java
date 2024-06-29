import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public abstract class class180 {

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    private int field2676 = 4;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "[S")
    private short[] field2675 = new short[512];

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    private int field2680 = 4;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    private int field2683 = 0;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
    public int field2686 = 4;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    private int field2685 = 4;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "Z")
    public static boolean field2681 = false;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Lo;")
    public static class332 field2678 = new class332(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "[S")
    public static short[] field2689 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "[I")
    public static int[] field2688 = new int[2];

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "Llm;")
    public static class230 field2687;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "[S")
    private short[] field2677;

    static {
        new class332("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
        field2690 = 52;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V", line = 7)
    private final void method1242(byte arg0) {
        this.field2677 = new short[this.field2686];
        field2684++;
        for (int var2 = 0; var2 < this.field2686; var2++) {
            this.field2677[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 != 78) {
            this.method395((byte) -40);
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(IIIII)V", line = 280)
    public class180(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2680 = arg2;
        this.field2683 = arg0;
        this.field2686 = arg1;
        this.field2685 = arg4;
        this.field2676 = arg3;
        this.method1242((byte) 78);
        this.method1245((byte) 113);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIII)V", line = 37)
    public final void method1243(int arg0, int arg1, int arg2, int arg3) {
        field2682++;
        if (arg2 != -1) {
            this.method1243(-11, -34, 117, -125);
        }
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg0];
        int[] var7 = new int[arg1];
        for (int var8 = 0; var8 < arg3; var8++) {
            var5[var8] = (var8 << 12) / arg3;
        }
        for (int var9 = 0; var9 < arg0; var9++) {
            var6[var9] = (var9 << 12) / arg0;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var7[var10] = (var10 << 12) / arg1;
        }
        this.method395((byte) 47);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg0; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field2686; var14++) {
                        int var15 = this.field2677[var14] << 12;
                        int var16 = this.field2680 * var15 >> 12;
                        int var17 = this.field2676 * var15 >> 12;
                        int var18 = var5[var13] * var15 >> 12;
                        int var19 = var6[var12] * var15 >> 12;
                        int var20 = this.field2685 * var15 >> 12;
                        int var21 = var7[var11] * var15 >> 12;
                        int var22 = this.field2676 * var19;
                        int var23 = this.field2685 * var21;
                        int var24 = this.field2680 * var18;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var22 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var23 >> 12;
                        int var31 = var27 & 0xFF;
                        int var32 = var30 + 1;
                        int var33;
                        if (var32 >= var20) {
                            var33 = 0;
                        } else {
                            var33 = var32 & 0xFF;
                        }
                        int var34 = var24 & 0xFFF;
                        int var35 = var22 & 0xFFF;
                        int var36 = var30 & 0xFF;
                        int var37 = var23 & 0xFFF;
                        int var38;
                        if (var26 >= var16) {
                            var38 = 0;
                        } else {
                            var38 = var26 & 0xFF;
                        }
                        int var39;
                        if (var29 < var17) {
                            var39 = var29 & 0xFF;
                        } else {
                            var39 = 0;
                        }
                        int var40 = class480.field6762[var34];
                        short var41 = this.field2675[var36];
                        int var42 = class480.field6762[var37];
                        int var43 = var37 - 4096;
                        short var44 = this.field2675[var33];
                        int var45 = class480.field6762[var35];
                        int var46 = var34 - 4096;
                        int var47 = var35 - 4096;
                        short var48 = this.field2675[var39 + var44];
                        short var49 = this.field2675[var39 + var41];
                        short var50 = this.field2675[var31 + var44];
                        short var51 = this.field2675[var31 + var41];
                        int var52 = class324.method2000(var34, var35, this.field2675[var28 + var51], 126, var37);
                        int var53 = class324.method2000(var46, var35, this.field2675[var38 + var51], arg2 + 121, var37);
                        int var54 = ((var53 - var52) * var40 >> 12) + var52;
                        int var55 = class324.method2000(var34, var47, this.field2675[var28 + var49], arg2 ^ 0xFFFFFF8A, var37);
                        int var56 = class324.method2000(var46, var47, this.field2675[var38 + var49], 74, var37);
                        int var57 = ((var56 - var55) * var40 >> 12) + var55;
                        int var58 = class324.method2000(var34, var35, this.field2675[var28 + var50], 90, var43);
                        int var59 = ((var57 - var54) * var45 >> 12) + var54;
                        int var60 = class324.method2000(var46, var35, this.field2675[var38 + var50], 94, var43);
                        int var61 = ((var60 - var58) * var40 >> 12) + var58;
                        int var62 = class324.method2000(var34, var47, this.field2675[var28 + var48], 104, var43);
                        int var63 = class324.method2000(var46, var47, this.field2675[var38 + var48], 67, var43);
                        int var64 = ((var63 - var62) * var40 >> 12) + var62;
                        int var65 = ((var64 - var61) * var45 >> 12) + var61;
                        this.method392(var14, 30864, ((var65 - var59) * var42 >> 12) + var59);
                    }
                    this.method393((byte) -112);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V", line = 208)
    public static void method1244(int arg0) {
        field2678 = null;
        field2687 = null;
        if (arg0 != 4) {
            field2678 = null;
        }
        field2689 = null;
        field2688 = null;
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(B)V", line = 224)
    private final void method1245(byte arg0) {
        field2679++;
        Random var2 = new Random((long) this.field2683);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field2675[var3] = (short) var3;
        }
        int var4 = 14 / ((42 - arg0) / 60);
        for (int var5 = 0; var5 < 255; var5++) {
            int var6 = 255 - var5;
            int var7 = class318.method1957(var6, (byte) -64, var2);
            short var8 = this.field2675[var7];
            this.field2675[var7] = this.field2675[var6];
            this.field2675[var6] = this.field2675[var6 + 256] = var8;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)V")
    public abstract void method395(byte arg0);

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(B)V")
    public abstract void method393(byte arg0);

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
    public abstract void method392(int arg0, int arg1, int arg2);
}
