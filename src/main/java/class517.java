import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class517 extends class440 {

    @OriginalMember(owner = "client!nda", name = "E", descriptor = "I")
    private int field7292 = 3216;

    @OriginalMember(owner = "client!nda", name = "H", descriptor = "[I")
    private int[] field7295 = new int[3];

    @OriginalMember(owner = "client!nda", name = "K", descriptor = "I")
    private int field7298 = 3216;

    @OriginalMember(owner = "client!nda", name = "L", descriptor = "I")
    private int field7299 = 4096;

    @OriginalMember(owner = "client!nda", name = "C", descriptor = "Lnea;")
    public static class664 field7290 = new class664(29, 6);

    @OriginalMember(owner = "client!nda", name = "D", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!nda", name = "F", descriptor = "I")
    public static int field7293;

    @OriginalMember(owner = "client!nda", name = "G", descriptor = "I")
    public static int field7294;

    @OriginalMember(owner = "client!nda", name = "J", descriptor = "I")
    public static int field7297;

    @OriginalMember(owner = "client!nda", name = "M", descriptor = "I")
    public static int field7300;

    @OriginalMember(owner = "client!nda", name = "N", descriptor = "I")
    public static int field7301;

    @OriginalMember(owner = "client!nda", name = "I", descriptor = "[[Z")
    public static boolean[][] field7296;

    @OriginalMember(owner = "client!nda", name = "g", descriptor = "(I)V")
    public static void method2953(int arg0) {
        if (arg0 == 1096046444) {
            field7290 = null;
            field7296 = null;
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(ILmo;I)V")
    public final void method234(int arg0, class695 arg1, int arg2) {
        ++field7291;
        if (arg0 != 5) {
            this.method230(109);
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field7292 = arg1.method3847((byte) 118);
                }
            } else {
                this.field7298 = arg1.method3847((byte) 118);
            }
        } else {
            this.field7299 = arg1.method3847((byte) 118);
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)V")
    public final void method230(int arg0) {
        if (arg0 == -9) {
            this.method2954(4096);
            ++field7294;
        }
    }

    @OriginalMember(owner = "client!nda", name = "<init>", descriptor = "()V")
    public class517() {
        super(1, true);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(BI)[I")
    public final int[] method229(byte arg0, int arg1) {
        ++field7300;
        int[] var3 = super.field6412.method3250((byte) 5, arg1);
        int var4 = 122 / ((-56 - arg0) / 41);
        if (super.field6412.field8047) {
            int var5 = class531.field7451 * this.field7299 >> 12;
            int[] var6 = this.method2611(123, arg1 + -1 & class651.field9116, 0);
            int[] var7 = this.method2611(105, arg1, 0);
            int[] var8 = this.method2611(113, arg1 + 1 & class651.field9116, 0);
            for (int var9 = 0; class549.field7715 > var9; ++var9) {
                int var10 = (var8[var9] + -var6[var9]) * var5 >> 12;
                int var11 = (var7[var9 + -1 & class420.field6112] + -var7[var9 + 1 & class420.field6112]) * var5 >> 12;
                int var12 = var11 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                int var13 = var10 >> 4;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                if (var13 > 255) {
                    var13 = 255;
                }
                int var14 = 255 & class248.field3857[((var13 + 1) * var13 >> 1) + var12];
                int var15 = var11 * var14 >> 8;
                int var16 = var10 * var14 >> 8;
                int var17 = var14 * 4096 >> 8;
                int var18 = this.field7295[2] * var17 >> 12;
                int var19 = this.field7295[1] * var16 >> 12;
                int var20 = this.field7295[0] * var15 >> 12;
                var3[var9] = var18 + var19 + var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nda", name = "h", descriptor = "(I)V")
    private final void method2954(int arg0) {
        ++field7301;
        double var2 = Math.cos((double) ((float) this.field7292 / 4096.0F));
        this.field7295[0] = (int) (Math.sin((double) ((float) this.field7298 / 4096.0F)) * var2 * (double) arg0);
        this.field7295[1] = (int) (Math.cos((double) ((float) this.field7298 / 4096.0F)) * var2 * 4096.0D);
        this.field7295[2] = (int) (4096.0D * Math.sin((double) ((float) this.field7292 / 4096.0F)));
        int var4 = this.field7295[0] * this.field7295[0] >> 12;
        int var5 = this.field7295[1] * this.field7295[1] >> 12;
        int var6 = this.field7295[2] * this.field7295[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var6 + var5 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field7295[2] = (this.field7295[2] << 12) / var7;
            this.field7295[0] = (this.field7295[0] << 12) / var7;
            this.field7295[1] = (this.field7295[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "([BBII)Ljava/lang/String;")
    public static final String method2955(byte[] arg0, byte arg1, int arg2, int arg3) {
        ++field7297;
        char[] var4 = new char[arg2];
        int var5 = -83 / ((20 - arg1) / 42);
        int var6 = 0;
        int var7 = arg2 + arg3;
        for (int var8 = arg3; var8 < var7; ++var8) {
            int var9 = 255 & arg0[var8];
            if (var9 >= 128) {
                if (~var9 > -195) {
                    throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var9);
                }
                if (var9 >= 224) {
                    if (var9 >= 240) {
                        if (~var9 <= -245) {
                            throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var9);
                        }
                        throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                    }
                    if (var8 - -2 >= var7) {
                        throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                    }
                    ++var8;
                    int var10 = 255 & arg0[var8];
                    if (var10 < 128 || var10 > 191) {
                        throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                    }
                    ++var8;
                    int var11 = arg0[var8] & 255;
                    if (~var11 > -129 || var11 > 191) {
                        throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                    }
                    var4[var6++] = (char) class486.method2826(class689.method3797(-129, var11), class486.method2826(class689.method3797(var10, -129) << 6, class689.method3797(var9 << 12, -921600)));
                } else {
                    if (var8 - -1 >= var7) {
                        throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                    }
                    ++var8;
                    int var12 = 255 & arg0[var8];
                    if (var12 < 128 || ~var12 < -192) {
                        throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                    }
                    var4[var6++] = (char) class486.method2826(class689.method3797(-193, var9) << 6, class689.method3797(var12, -129));
                }
            } else {
                var4[var6++] = (char) var9;
            }
        }
        return new String(var4, 0, var6);
    }
}
