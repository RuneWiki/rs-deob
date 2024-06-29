import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class634 extends class232 {

    @OriginalMember(owner = "client!raa", name = "Q", descriptor = "[I")
    private int[] field9108 = new int[3];

    @OriginalMember(owner = "client!raa", name = "R", descriptor = "I")
    private int field9107 = 3216;

    @OriginalMember(owner = "client!raa", name = "S", descriptor = "I")
    private int field9109 = 3216;

    @OriginalMember(owner = "client!raa", name = "N", descriptor = "I")
    private int field9116 = 4096;

    @OriginalMember(owner = "client!raa", name = "J", descriptor = "[Ljava/lang/String;")
    private static final String[] field9117 = new String[] { method4603(method4602("\u001e\u0018MQ\u0016D")), method4603(method4602("\u001e\u0018MQ\u0011D")), method4603(method4602("\u001e\u0018MQ\u0014D")), method4603(method4602("\u001e\u0018MQ\u001bD")), method4603(method4602("\u0002\f@\u0013")), method4603(method4602("\u0017W\u0002Q*")), method4603(method4602("\u001e\u0018MQ\u0012D")), method4603(method4602("\u001e\u0018MQ\u0013D")) };

    @OriginalMember(owner = "client!raa", name = "L", descriptor = "Lmj;")
    public static class683 field9110 = null;

    @OriginalMember(owner = "client!raa", name = "G", descriptor = "[I")
    public static int[] field9112 = new int[32];

    @OriginalMember(owner = "client!raa", name = "O", descriptor = "I")
    public static int field9104;

    @OriginalMember(owner = "client!raa", name = "H", descriptor = "I")
    public static int field9106;

    @OriginalMember(owner = "client!raa", name = "T", descriptor = "I")
    public static int field9111;

    @OriginalMember(owner = "client!raa", name = "M", descriptor = "I")
    public static int field9113;

    @OriginalMember(owner = "client!raa", name = "I", descriptor = "I")
    public static int field9114;

    @OriginalMember(owner = "client!raa", name = "P", descriptor = "I")
    public static int field9115;

    @OriginalMember(owner = "client!raa", name = "K", descriptor = "Lvb;")
    public static class205 field9105;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        try {
            if (arg1 != 123) {
                this.method63(71, (class176) null, -86);
            }
            ++field9114;
            int[] var3 = super.field3601.method3467(arg0, (byte) -61);
            if (super.field3601.field6907) {
                int var4 = class536.field7873 * this.field9116 >> 12;
                int[] var5 = this.method2022(arg0 + -1 & class315.field5126, 0, 0);
                int[] var6 = this.method2022(arg0, 0, 0);
                int[] var7 = this.method2022(arg0 + 1 & class315.field5126, 0, 0);
                for (int var8 = 0; ~var8 > ~class449.field6969; ++var8) {
                    int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                    int var10 = (var6[class250.field3824 & var8 + -1] + -var6[var8 - -1 & class250.field3824]) * var4 >> 12;
                    int var11 = var10 >> 4;
                    int var12 = var9 >> 4;
                    if (var11 < 0) {
                        var11 = -var11;
                    }
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    if (var11 > 255) {
                        var11 = 255;
                    }
                    if (~var12 < -256) {
                        var12 = 255;
                    }
                    int var13 = class544.field8011[((var12 + 1) * var12 >> 1) + var11] & 255;
                    int var14 = var10 * var13 >> 8;
                    int var15 = var9 * var13 >> 8;
                    int var16 = var13 * 4096 >> 8;
                    int var17 = this.field9108[1] * var15 >> 12;
                    int var18 = this.field9108[0] * var14 >> 12;
                    int var19 = this.field9108[2] * var16 >> 12;
                    var3[var8] = var17 + var18 + var19;
                }
            }
            return var3;
        } catch (RuntimeException var21) {
            throw class590.method4333(var21, field9117[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "()V")
    public class634() {
        super(1, true);
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(ILwq;I)V")
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            ++field9106;
            if (arg0 < 96) {
                field9113 = -95;
            }
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (arg2 == 2) {
                        this.field9107 = arg1.method1687((byte) -125);
                    }
                } else {
                    this.field9109 = arg1.method1687((byte) -56);
                }
            } else {
                this.field9116 = arg1.method1687((byte) -78);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field9117[6] + arg0 + ',' + (arg1 != null ? field9117[5] : field9117[4]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "(B)V")
    private final void method4599(byte arg0) {
        try {
            ++field9104;
            double var2 = Math.cos((double) ((float) this.field9107 / 4096.0F));
            this.field9108[0] = (int) (4096.0D * Math.sin((double) ((float) this.field9109 / 4096.0F)) * var2);
            this.field9108[1] = (int) (4096.0D * Math.cos((double) ((float) this.field9109 / 4096.0F)) * var2);
            this.field9108[2] = (int) (4096.0D * Math.sin((double) ((float) this.field9107 / 4096.0F)));
            int var4 = this.field9108[0] * this.field9108[0] >> 12;
            int var5 = this.field9108[1] * this.field9108[1] >> 12;
            int var6 = this.field9108[2] * this.field9108[2] >> 12;
            if (arg0 < 90) {
                this.method63(-51, (class176) null, 77);
            }
            int var7 = (int) (Math.sqrt((double) (var4 - -var6 + var5 >> 12)) * 4096.0D);
            if (~var7 != -1) {
                this.field9108[0] = (this.field9108[0] << 12) / var7;
                this.field9108[1] = (this.field9108[1] << 12) / var7;
                this.field9108[2] = (this.field9108[2] << 12) / var7;
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field9117[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(B)Lhu;")
    public static final class139 method4600(byte arg0) {
        try {
            if (arg0 <= 85) {
                field9113 = 39;
            }
            ++field9111;
            return ~class302.field4871 > ~class696.field10027.length ? class696.field10027[class302.field4871++] : null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9117[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)V")
    public final void method67(byte arg0) {
        try {
            int var2 = -12 % ((arg0 - 73) / 34);
            this.method4599((byte) 110);
            ++field9115;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9117[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "(I)V")
    public static void method4601(int arg0) {
        try {
            field9105 = null;
            if (arg0 != 2048029356) {
                method4600((byte) -23);
            }
            field9110 = null;
            field9112 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9117[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!raa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4602(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 87);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!raa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4603(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 108;
                    break;
                case 1:
                    var10005 = 121;
                    break;
                case 2:
                    var10005 = 44;
                    break;
                case 3:
                    var10005 = 127;
                    break;
                default:
                    var10005 = 87;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
