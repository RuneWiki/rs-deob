import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oha")
public class class771 extends class211 {

    @OriginalMember(owner = "client!oha", name = "E", descriptor = "I")
    private int field11200 = 0;

    @OriginalMember(owner = "client!oha", name = "N", descriptor = "I")
    private int field11205 = 16;

    @OriginalMember(owner = "client!oha", name = "D", descriptor = "I")
    private int field11204 = 4096;

    @OriginalMember(owner = "client!oha", name = "F", descriptor = "I")
    private int field11199 = 0;

    @OriginalMember(owner = "client!oha", name = "K", descriptor = "I")
    private int field11207 = 2000;

    @OriginalMember(owner = "client!oha", name = "J", descriptor = "[Ljava/lang/String;")
    private static final String[] field11209 = new String[] { method5586(method5585("\u007f|l^)")), method5586(method5585("k:#^\u0017,")), method5586(method5585("j'.\u001c")), method5586(method5585("k:#^\u0010,")), method5586(method5585("k\"'\u001e>w")), method5586(method5585("k:#^\u0011,")), method5586(method5585("k:#^\u0015,")), method5586(method5585("k:#^\u001f,")), method5586(method5585("k:#^\u0016,")) };

    @OriginalMember(owner = "client!oha", name = "C", descriptor = "I")
    public static int field11201 = 0;

    @OriginalMember(owner = "client!oha", name = "I", descriptor = "I")
    public static int field11197;

    @OriginalMember(owner = "client!oha", name = "M", descriptor = "I")
    public static int field11198;

    @OriginalMember(owner = "client!oha", name = "G", descriptor = "I")
    public static int field11202;

    @OriginalMember(owner = "client!oha", name = "O", descriptor = "I")
    public static int field11203;

    @OriginalMember(owner = "client!oha", name = "H", descriptor = "I")
    public static int field11206;

    @OriginalMember(owner = "client!oha", name = "L", descriptor = "Lwha;")
    public static class297 field11208;

    @OriginalMember(owner = "client!oha", name = "c", descriptor = "(B)I")
    public static final int method5582(byte arg0) {
        try {
            ++field11202;
            if (class166.field2283 == 1) {
                return class57.field613;
            } else {
                if (arg0 >= -115) {
                    field11208 = null;
                }
                return class757.field10994;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field11209[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)V")
    public final void method437(int arg0) {
        try {
            if (arg0 == 27132) {
                ++field11197;
                class100.method826(15667);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11209[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oha", name = "c", descriptor = "(I)V")
    public static void method5583(int arg0) {
        try {
            int var1 = -37 % ((-52 - arg0) / 55);
            field11208 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11209[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(BLjava/lang/String;Lmca;ZZ)V")
    public static final void method5584(byte arg0, String arg1, class33 arg2, boolean arg3, boolean arg4) {
        try {
            class140.method1200(arg1, arg4, field11209[4], false, arg2, arg3);
            int var5 = -31 % ((-54 - arg0) / 37);
            ++field11198;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field11209[5] + arg0 + ',' + (arg1 != null ? field11209[0] : field11209[2]) + ',' + (arg2 != null ? field11209[0] : field11209[2]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "(II)[I")
    public final int[] method197(int arg0, int arg1) {
        try {
            ++field11206;
            int[] var3 = super.field3231.method34((byte) -64, arg1);
            if (arg0 != 8217) {
                this.method437(99);
            }
            if (super.field3231.field57) {
                int var4 = this.field11204 >> 1;
                int[][] var5 = super.field3231.method32(-13509);
                Random var6 = new Random((long) this.field11200);
                for (int var7 = 0; this.field11207 > var7; ++var7) {
                    int var8 = this.field11204 <= 0 ? this.field11199 : this.field11199 + class656.method4817(this.field11204, var6, (byte) -48) - var4;
                    int var9 = var8 >> 4 & 255;
                    int var10 = class656.method4817(class343.field5332, var6, (byte) -46);
                    int var11 = class656.method4817(class463.field6744, var6, (byte) -79);
                    int var12 = var10 - -(class713.field10336[var9] * this.field11205 >> 12);
                    int var13 = (class100.field1109[var9] * this.field11205 >> 12) + var11;
                    int var14 = -var11 + var13;
                    int var15 = -var10 + var12;
                    if (~var15 != -1 || var14 != 0) {
                        if (var14 < 0) {
                            var14 = -var14;
                        }
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        boolean var16 = var15 < var14;
                        if (var16) {
                            int var17 = var10;
                            int var18 = var12;
                            var10 = var11;
                            var11 = var17;
                            var12 = var13;
                            var13 = var18;
                        }
                        if (~var10 < ~var12) {
                            int var19 = var10;
                            var10 = var12;
                            int var20 = var11;
                            var12 = var19;
                            var11 = var13;
                            var13 = var20;
                        }
                        int var21 = var11;
                        int var22 = -var10 + var12;
                        int var23 = -var11 + var13;
                        int var24 = -var22 / 2;
                        int var25 = 2048 / var22;
                        int var26 = 1024 - (class656.method4817(4096, var6, (byte) -88) >> 2);
                        if (var23 < 0) {
                            var23 = -var23;
                        }
                        int var27 = ~var11 > ~var13 ? 1 : -1;
                        for (int var28 = var10; ~var12 < ~var28; ++var28) {
                            int var29 = (-var10 + var28) * var25 + var26 + 1024;
                            int var30 = class3.field28 & var28;
                            int var31 = class484.field6992 & var21;
                            var24 += var23;
                            if (var16) {
                                var5[var31][var30] = var29;
                            } else {
                                var5[var30][var31] = var29;
                            }
                            if (~var24 < -1) {
                                var24 -= var22;
                                var21 -= -var27;
                            }
                        }
                    }
                }
            }
            return var3;
        } catch (RuntimeException var33) {
            throw class759.method5498(var33, field11209[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(BILib;)V")
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (arg1 != 2) {
                        if (~arg1 != -4) {
                            if (~arg1 == -5) {
                                this.field11204 = arg2.method1445((byte) 107);
                            }
                        } else {
                            this.field11199 = arg2.method1445((byte) 105);
                        }
                    } else {
                        this.field11205 = arg2.method1455((byte) 62);
                    }
                } else {
                    this.field11207 = arg2.method1445((byte) 107);
                }
            } else {
                this.field11200 = arg2.method1455((byte) 62);
            }
            if (arg0 < 67) {
                method5583(56);
            }
            ++field11203;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field11209[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11209[0] : field11209[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!oha", name = "<init>", descriptor = "()V")
    public class771() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5585(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 84);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5586(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 4;
                    break;
                case 1:
                    var10005 = 82;
                    break;
                case 2:
                    var10005 = 66;
                    break;
                case 3:
                    var10005 = 112;
                    break;
                default:
                    var10005 = 84;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
