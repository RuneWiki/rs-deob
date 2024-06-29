import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class281 extends class424 {

    @OriginalMember(owner = "client!ei", name = "R", descriptor = "I")
    private int field3816 = 1024;

    @OriginalMember(owner = "client!ei", name = "W", descriptor = "I")
    private int field3821 = 0;

    @OriginalMember(owner = "client!ei", name = "bb", descriptor = "I")
    private int field3826 = 204;

    @OriginalMember(owner = "client!ei", name = "db", descriptor = "I")
    private int field3828 = 1024;

    @OriginalMember(owner = "client!ei", name = "eb", descriptor = "I")
    private int field3829 = 4;

    @OriginalMember(owner = "client!ei", name = "Y", descriptor = "I")
    private int field3823 = 8;

    @OriginalMember(owner = "client!ei", name = "Z", descriptor = "I")
    private int field3824 = 409;

    @OriginalMember(owner = "client!ei", name = "hb", descriptor = "I")
    private int field3832 = 81;

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "Z")
    public static boolean field3814 = true;

    @OriginalMember(owner = "client!ei", name = "S", descriptor = "I")
    public static int field3817 = -1;

    @OriginalMember(owner = "client!ei", name = "ib", descriptor = "Z")
    public static boolean field3833;

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
    private int field3811;

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!ei", name = "T", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!ei", name = "X", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!ei", name = "cb", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!ei", name = "fb", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!ei", name = "jb", descriptor = "I")
    private int field3834;

    @OriginalMember(owner = "client!ei", name = "kb", descriptor = "I")
    private int field3835;

    @OriginalMember(owner = "client!ei", name = "V", descriptor = "Lwn;")
    public static class77 field3820;

    @OriginalMember(owner = "client!ei", name = "gb", descriptor = "[I")
    private int[] field3831;

    @OriginalMember(owner = "client!ei", name = "U", descriptor = "[[I")
    private int[][] field3819;

    @OriginalMember(owner = "client!ei", name = "ab", descriptor = "[[I")
    private int[][] field3825;

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
    public class281() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "(I)V")
    public static void method1763(int arg0) {
        field3820 = null;
        if (arg0 <= 78) {
            field3820 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(IB)[I")
    public final int[] method43(int arg0, byte arg1) {
        ++field3815;
        if (arg1 != -10) {
            this.method19((class366) null, (byte) -91, 97);
        }
        int[] var3 = super.field5892.method783(arg0, (byte) -29);
        if (super.field5892.field1427) {
            int var4 = 0;
            int var5;
            for (var5 = class409.field5711[arg0] - -this.field3821; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field3823 > var4 && var5 >= this.field3831[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = (1 & var4) == 0;
            int var8 = this.field3831[var4];
            int var9 = this.field3831[var4 - 1];
            if (~var5 < ~(this.field3835 + var9) && ~(-this.field3835 + var8) < ~var5) {
                for (int var10 = 0; var10 < class303.field4135; ++var10) {
                    int var11 = var7 ? this.field3816 : -this.field3816;
                    int var12 = 0;
                    int var13;
                    for (var13 = class332.field4478[var10] - -(this.field3811 * var11 >> 12); var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field3829 > var12 && var13 >= this.field3825[var6][var12]) {
                        ++var12;
                    }
                    int var14 = var12 + -1;
                    int var15 = this.field3825[var6][var14];
                    int var16 = this.field3825[var6][var12];
                    if (var15 - -this.field3835 < var13 && ~var13 > ~(-this.field3835 + var16)) {
                        var3[var10] = this.field3819[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class79.method642(var3, 0, class303.field4135, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lrg;BI)V")
    public final void method19(class366 arg0, byte arg1, int arg2) {
        if (arg1 != -48) {
            this.field3824 = 17;
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 != -7) {
                                    if (~arg2 == -8) {
                                        this.field3828 = arg0.method2297(13352);
                                    }
                                } else {
                                    this.field3832 = arg0.method2297(arg1 ^ -13320);
                                }
                            } else {
                                this.field3821 = arg0.method2297(13352);
                            }
                        } else {
                            this.field3816 = arg0.method2297(13352);
                        }
                    } else {
                        this.field3826 = arg0.method2297(arg1 ^ -13320);
                    }
                } else {
                    this.field3824 = arg0.method2297(13352);
                }
            } else {
                this.field3823 = arg0.method2306((byte) 65);
            }
        } else {
            this.field3829 = arg0.method2306((byte) 80);
        }
        ++field3830;
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(B)V")
    private final void method1764(byte arg0) {
        ++field3813;
        Random var2 = new Random((long) this.field3823);
        this.field3835 = this.field3832 / 2;
        this.field3834 = 4096 / this.field3823;
        this.field3811 = 4096 / this.field3829;
        int var3 = this.field3811 / 2;
        this.field3831 = new int[this.field3823 + 1];
        int var4 = 36 / ((37 - arg0) / 39);
        this.field3819 = new int[this.field3823][this.field3829];
        this.field3825 = new int[this.field3823][this.field3829 + 1];
        int var5 = this.field3834 / 2;
        this.field3831[0] = 0;
        for (int var6 = 0; ~this.field3823 < ~var6; ++var6) {
            if (~var6 < -1) {
                int var7 = this.field3834;
                int var8 = (-2048 + class92.method724(var2, 4096, 113)) * this.field3826 >> 12;
                int var9 = (var5 * var8 >> 12) + var7;
                this.field3831[var6] = this.field3831[var6 - 1] - -var9;
            }
            this.field3825[var6][0] = 0;
            for (int var10 = 0; this.field3829 > var10; ++var10) {
                if (~var10 < -1) {
                    int var11 = this.field3811;
                    int var12 = (class92.method724(var2, 4096, 109) + -2048) * this.field3824 >> 12;
                    int var13 = (var3 * var12 >> 12) + var11;
                    this.field3825[var6][var10] = this.field3825[var6][var10 + -1] + var13;
                }
                this.field3819[var6][var10] = this.field3828 > 0 ? -class92.method724(var2, this.field3828, 125) + 4096 : 4096;
            }
            this.field3825[var6][this.field3829] = 4096;
        }
        this.field3831[this.field3823] = 4096;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)V")
    public static final void method1765(byte arg0, int arg1) {
        ++field3818;
        int var2 = -68 / ((75 - arg0) / 40);
        class408 var3 = class142.field2082;
        synchronized (class142.field2082) {
            class142.field2082.method2531(arg1, 112);
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V")
    public final void method113(int arg0) {
        this.method1764((byte) 117);
        ++field3827;
        if (arg0 != 3) {
            method1763(10);
        }
    }

    static {
        new class368("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
        field3833 = false;
    }
}
