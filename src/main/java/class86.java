import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class86 extends class666 {

    @OriginalMember(owner = "client!qfa", name = "K", descriptor = "I")
    private int field918 = 3216;

    @OriginalMember(owner = "client!qfa", name = "O", descriptor = "I")
    private int field922 = 4096;

    @OriginalMember(owner = "client!qfa", name = "J", descriptor = "[I")
    private int[] field917 = new int[3];

    @OriginalMember(owner = "client!qfa", name = "P", descriptor = "I")
    private int field923 = 3216;

    @OriginalMember(owner = "client!qfa", name = "E", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!qfa", name = "F", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!qfa", name = "G", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!qfa", name = "H", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!qfa", name = "L", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!qfa", name = "M", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!qfa", name = "N", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!qfa", name = "I", descriptor = "[I")
    public static int[] field916;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIIIZZ)V")
    public static final void method540(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class8.field70 = arg0;
        class463.field6445 = 1 << class8.field70;
        class389.field5194 = class463.field6445 >> 1;
        class536.field7662 = (int) Math.sqrt((double) (class389.field5194 * class389.field5194 + class389.field5194 * class389.field5194));
        class32.field361 = class463.field6445 >> 2;
        class457.field6381 = class463.field6445;
        class181.field2222 = arg2;
        class272.field3451 = arg3;
        class658.field9390 = arg4;
        class678.field9612 = new class287[arg1][class181.field2222][class272.field3451];
        class275.field3477 = new class137[arg1];
        if (arg5) {
            class398.field5323 = new int[class181.field2222][class272.field3451];
            class217.field2625 = new byte[class181.field2222][class272.field3451];
            class425.field5651 = new short[class181.field2222][class272.field3451];
            class631.field8958 = new class287[1][class181.field2222][class272.field3451];
            class591.field8415 = new class137[1];
        } else {
            class398.field5323 = null;
            class217.field2625 = null;
            class425.field5651 = null;
            class631.field8958 = null;
            class591.field8415 = null;
        }
        if (arg6) {
            class2.field17 = new long[arg1][arg2][arg3];
            class256.field3279 = new class247[65535];
            class44.field499 = new boolean[65535];
            class112.field1296 = 0;
        } else {
            class2.field17 = null;
            class256.field3279 = null;
            class44.field499 = null;
            class112.field1296 = 0;
        }
        class488.method2821(false);
        class295.field3873 = new class32[1000];
        class80.field849 = 0;
        class476.field6930 = new class32[1000];
        class461.field6405 = 0;
        class110.field1270 = new int[arg1][class181.field2222 + 1][class272.field3451 + 1];
        class304.field3979 = new class354[5000];
        class474.field6910 = 0;
        class581.field8258 = new boolean[class658.field9390 + class658.field9390 + 1][class658.field9390 + class658.field9390 + 1];
        class321.field4164 = new boolean[class658.field9390 + class658.field9390 + 2][class658.field9390 + class658.field9390 + 2];
        class81.field859 = null;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)V")
    public static void method541(byte arg0) {
        if (arg0 != -68) {
            field915 = -87;
        }
        field916 = null;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ILiaa;Z)V")
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        ++field913;
        if (!arg2) {
            this.field922 = 40;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field918 = arg1.method2574(-1758460248);
                }
            } else {
                this.field923 = arg1.method2574(-1758460248);
            }
        } else {
            this.field922 = arg1.method2574(-1758460248);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "()V")
    public class86() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)V")
    public final void method118(int arg0) {
        ++field921;
        this.method542(24248);
        if (arg0 != -9) {
            method541((byte) -97);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "h", descriptor = "(I)V")
    private final void method542(int arg0) {
        if (arg0 != 24248) {
            field919 = -11;
        }
        ++field912;
        double var2 = Math.cos((double) ((float) this.field918 / 4096.0F));
        this.field917[0] = (int) (Math.sin((double) ((float) this.field923 / 4096.0F)) * var2 * 4096.0D);
        this.field917[1] = (int) (4096.0D * Math.cos((double) ((float) this.field923 / 4096.0F)) * var2);
        this.field917[2] = (int) (Math.sin((double) ((float) this.field918 / 4096.0F)) * 4096.0D);
        int var4 = this.field917[0] * this.field917[0] >> 12;
        int var5 = this.field917[1] * this.field917[1] >> 12;
        int var6 = this.field917[2] * this.field917[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var5 + var6 >> 12)));
        if (var7 != 0) {
            this.field917[1] = (this.field917[1] << 12) / var7;
            this.field917[0] = (this.field917[0] << 12) / var7;
            this.field917[2] = (this.field917[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(II)[I")
    public final int[] method122(int arg0, int arg1) {
        ++field914;
        int[] var3 = super.field9466.method1811(arg1, 110);
        if (super.field9466.field4172) {
            int var4 = class268.field3390 * this.field922 >> 12;
            int[] var5 = this.method3739(0, -128, arg1 - 1 & class515.field7357);
            int[] var6 = this.method3739(0, -127, arg1);
            int[] var7 = this.method3739(0, -121, arg1 + 1 & class515.field7357);
            for (int var8 = 0; class501.field7222 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class507.field7299] + -var6[class507.field7299 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = 255 & class354.field4640[((var12 + 1) * var12 >> 1) + var11];
                int var14 = var13 * 4096 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field917[2] * var14 >> 12;
                int var18 = this.field917[0] * var15 >> 12;
                int var19 = this.field917[1] * var16 >> 12;
                var3[var8] = var18 + var19 - -var17;
            }
        }
        return arg0 >= -21 ? null : var3;
    }
}
