import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public abstract class class290 {

    @OriginalMember(owner = "client!du", name = "d", descriptor = "I")
    private int field4579 = 4;

    @OriginalMember(owner = "client!du", name = "m", descriptor = "[S")
    private short[] field4588 = new short[512];

    @OriginalMember(owner = "client!du", name = "h", descriptor = "I")
    private int field4583 = 4;

    @OriginalMember(owner = "client!du", name = "l", descriptor = "I")
    private int field4587 = 4;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "I")
    private int field4589 = 0;

    @OriginalMember(owner = "client!du", name = "g", descriptor = "I")
    public int field4582 = 4;

    @OriginalMember(owner = "client!du", name = "b", descriptor = "Z")
    public static boolean field4577 = true;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!du", name = "e", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!du", name = "k", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "Lmn;")
    public static class162 field4581;

    @OriginalMember(owner = "client!du", name = "o", descriptor = "[I")
    public static int[] field4590;

    @OriginalMember(owner = "client!du", name = "j", descriptor = "[S")
    private short[] field4585;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
    public static void method1953(int arg0) {
        if (arg0 == 4) {
            field4590 = null;
            field4581 = null;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static final String method1954(byte arg0, int arg1) {
        field4580++;
        if (arg0 < 98) {
            return null;
        }
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class187.field2723.method1583(91, class12.field131) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class490.field7418.method1583(93, class12.field131) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIII)V")
    public final void method1955(int arg0, int arg1, int arg2, int arg3) {
        field4576++;
        if (arg3 != 13698) {
            return;
        }
        int[] var5 = new int[arg1];
        int[] var6 = new int[arg2];
        for (int var7 = 0; var7 < arg1; var7++) {
            var5[var7] = (var7 << 12) / arg1;
        }
        int[] var8 = new int[arg0];
        for (int var9 = 0; var9 < arg2; var9++) {
            var6[var9] = (var9 << 12) / arg2;
        }
        for (int var10 = 0; var10 < arg0; var10++) {
            var8[var10] = (var10 << 12) / arg0;
        }
        this.method863(255);
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < this.field4582; var14++) {
                        int var15 = this.field4585[var14] << 12;
                        int var16 = this.field4579 * var15 >> 12;
                        int var17 = this.field4587 * var15 >> 12;
                        int var18 = var5[var13] * var15 >> 12;
                        int var19 = this.field4583 * var15 >> 12;
                        int var20 = var8[var11] * var15 >> 12;
                        int var21 = var6[var12] * var15 >> 12;
                        int var22 = this.field4579 * var18;
                        int var23 = this.field4587 * var21;
                        int var24 = this.field4583 * var20;
                        int var25 = var22 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var23 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var24 >> 12;
                        int var31 = var27 & 0xFF;
                        int var32 = var30 + 1;
                        int var33;
                        if (var19 > var32) {
                            var33 = var32 & 0xFF;
                        } else {
                            var33 = 0;
                        }
                        int var34 = var30 & 0xFF;
                        int var35 = var22 & 0xFFF;
                        int var36 = var23 & 0xFFF;
                        int var37 = var24 & 0xFFF;
                        int var38;
                        if (var16 > var26) {
                            var38 = var26 & 0xFF;
                        } else {
                            var38 = 0;
                        }
                        int var39;
                        if (var17 <= var29) {
                            var39 = 0;
                        } else {
                            var39 = var29 & 0xFF;
                        }
                        int var40 = class186.field2701[var37];
                        short var41 = this.field4588[var33];
                        int var42 = var37 - 4096;
                        int var43 = var36 - 4096;
                        short var44 = this.field4588[var34];
                        int var45 = var35 - 4096;
                        int var46 = class186.field2701[var36];
                        int var47 = class186.field2701[var35];
                        short var48 = this.field4588[var39 + var44];
                        short var49 = this.field4588[var39 + var41];
                        short var50 = this.field4588[var31 + var44];
                        short var51 = this.field4588[var31 + var41];
                        int var52 = class193.method1204((byte) 111, var36, var35, var37, this.field4588[var28 + var50]);
                        int var53 = class193.method1204((byte) 111, var36, var45, var37, this.field4588[var38 + var50]);
                        int var54 = ((var53 - var52) * var47 >> 12) + var52;
                        int var55 = class193.method1204((byte) 111, var43, var35, var37, this.field4588[var28 + var48]);
                        int var56 = class193.method1204((byte) 111, var43, var45, var37, this.field4588[var38 + var48]);
                        int var57 = ((var56 - var55) * var47 >> 12) + var55;
                        int var58 = ((var57 - var54) * var46 >> 12) + var54;
                        int var59 = class193.method1204((byte) 111, var36, var35, var42, this.field4588[var28 + var51]);
                        int var60 = class193.method1204((byte) 111, var36, var45, var42, this.field4588[var38 + var51]);
                        int var61 = ((var60 - var59) * var47 >> 12) + var59;
                        int var62 = class193.method1204((byte) 111, var43, var35, var42, this.field4588[var28 + var49]);
                        int var63 = class193.method1204((byte) 111, var43, var45, var42, this.field4588[var38 + var49]);
                        int var64 = ((var63 - var62) * var47 >> 12) + var62;
                        int var65 = var61 + ((var64 - var61) * var46 >> 12);
                        this.method859(-15289, var58 + ((var65 - var58) * var40 >> 12), var14);
                    }
                    this.method860(arg3 ^ 0x583C);
                }
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(B)V")
    private final void method1956(byte arg0) {
        field4586++;
        Random var2 = new Random((long) this.field4589);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field4588[var3] = (short) var3;
        }
        int var4 = 121 % ((-arg0 - 6) / 37);
        for (int var5 = 0; var5 < 255; var5++) {
            int var6 = 255 - var5;
            int var7 = class167.method1057(-3481, var2, var6);
            short var8 = this.field4588[var7];
            this.field4588[var7] = this.field4588[var6];
            this.field4588[var6] = this.field4588[var6 + 256] = var8;
        }
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(B)V")
    private final void method1957(byte arg0) {
        field4584++;
        this.field4585 = new short[this.field4582];
        if (arg0 != 4) {
            this.method1957((byte) 108);
        }
        for (int var2 = 0; var2 < this.field4582; var2++) {
            this.field4585[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(I)V")
    public abstract void method863(int arg0);

    @OriginalMember(owner = "client!du", name = "c", descriptor = "(I)V")
    public abstract void method860(int arg0);

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(IIIII)V")
    public class290(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4583 = arg4;
        this.field4587 = arg3;
        this.field4579 = arg2;
        this.field4582 = arg1;
        this.field4589 = arg0;
        this.method1957((byte) 4);
        this.method1956((byte) -84);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(III)V")
    public abstract void method859(int arg0, int arg1, int arg2);
}
