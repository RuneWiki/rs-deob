import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class241 extends class16 {

    @OriginalMember(owner = "client!jf", name = "W", descriptor = "I")
    private int field3836;

    @OriginalMember(owner = "client!jf", name = "T", descriptor = "Lol;")
    public static class246 field3833 = new class246(16);

    @OriginalMember(owner = "client!jf", name = "Q", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!jf", name = "R", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!jf", name = "S", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!jf", name = "U", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!jf", name = "V", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLim;I)V", line = 4)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        field3834++;
        if (arg0 != -7) {
            this.field3836 = 127;
        }
        if (arg2 == 0) {
            this.field3836 = (arg1.method1399(-1172389784) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "(B)V", line = 31)
    public static void method1706(byte arg0) {
        int var1 = 43 / ((9 - arg0) / 38);
        field3833 = null;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(ZI)[I", line = 43)
    public final int[] method8(boolean arg0, int arg1) {
        if (!arg0) {
            method1708(-44, (class160) null, -37);
        }
        field3832++;
        int[] var3 = this.field207.method1784(arg1, (byte) 102);
        if (this.field207.field4024) {
            class213.method1551(var3, 0, class276.field4376, this.field3836);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "(I)V", line = 64)
    public static final void method1707(int arg0) {
        field3835++;
        if (arg0 == -12929) {
            class197.field3224 = class3.method13(0.4F, true, 8, 35, 2048, 4, (byte) 70, 8);
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V", line = 80)
    public class241() {
        this(4096);
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(I)V", line = 83)
    public class241(int arg0) {
        super(0, true);
        this.field3836 = 4096;
        this.field3836 = arg0;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILok;I)I", line = 92)
    public static final int method1708(int arg0, class160 arg1, int arg2) {
        field3831++;
        int var3 = 121 / ((arg0 + 37) / 59);
        if (arg1.field2504 == null || arg2 >= arg1.field2504.length) {
            return -2;
        }
        try {
            int[] var4 = arg1.field2504[arg2];
            int var5 = 0;
            int var6 = 0;
            byte var7 = 0;
            while (true) {
                int var8 = var4[var6++];
                int var9 = 0;
                byte var10 = 0;
                if (var8 == 0) {
                    return var5;
                }
                if (var8 == 15) {
                    var10 = 1;
                }
                if (var8 == 1) {
                    var9 = class112.field1679[var4[var6++]];
                }
                if (var8 == 2) {
                    var9 = class116.field1744[var4[var6++]];
                }
                if (var8 == 3) {
                    var9 = class329.field5115[var4[var6++]];
                }
                if (var8 == 4) {
                    int var11 = var4[var6++] << 16;
                    int var12 = var11 + var4[var6++];
                    class160 var13 = class37.method238((byte) 125, var12);
                    int var14 = var4[var6++];
                    if (var14 != -1 && (!class31.method198(false, var14).field984 || class255.field4057)) {
                        for (int var15 = 0; var15 < var13.field2615.length; var15++) {
                            if ((var14 + 1) == var13.field2615[var15]) {
                                var9 += var13.field2559[var15];
                            }
                        }
                    }
                }
                if (var8 == 5) {
                    var9 = class29.field422[var4[var6++]];
                }
                if (var8 == 6) {
                    var9 = class173.field2746[class116.field1744[var4[var6++]] - 1];
                }
                if (var8 == 16) {
                    var10 = 2;
                }
                if (var8 == 17) {
                    var10 = 3;
                }
                if (var8 == 7) {
                    var9 = class29.field422[var4[var6++]] * 100 / 46875;
                }
                if (var8 == 8) {
                    var9 = class13.field159.field4994;
                }
                if (var8 == 9) {
                    for (int var16 = 0; var16 < 25; var16++) {
                        if (class131.field1927[var16]) {
                            var9 += class116.field1744[var16];
                        }
                    }
                }
                if (var8 == 10) {
                    int var17 = var4[var6++] << 16;
                    int var18 = var17 + var4[var6++];
                    class160 var19 = class37.method238((byte) 54, var18);
                    int var20 = var4[var6++];
                    if (var20 != -1 && (!class31.method198(false, var20).field984 || class255.field4057)) {
                        for (int var21 = 0; var21 < var19.field2615.length; var21++) {
                            if (var20 + 1 == var19.field2615[var21]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var8 == 11) {
                    var9 = class93.field1433;
                }
                if (var8 == 12) {
                    var9 = class92.field1428;
                }
                if (var8 == 13) {
                    int var22 = class29.field422[var4[var6++]];
                    int var23 = var4[var6++];
                    var9 = (0x1 << var23 & var22) == 0 ? 0 : 1;
                }
                if (var8 == 14) {
                    int var24 = var4[var6++];
                    var9 = class152.method1061(var24, 5);
                }
                if (var8 == 18) {
                    var9 = (class13.field159.field1980 >> 7) + class181.field2925;
                }
                if (var8 == 19) {
                    var9 = (class13.field159.field1944 >> 7) + class24.field351;
                }
                if (var8 == 20) {
                    var9 = var4[var6++];
                }
                if (var10 == 0) {
                    if (var7 == 0) {
                        var5 += var9;
                    }
                    if (var7 == 1) {
                        var5 -= var9;
                    }
                    if (var7 == 2 && var9 != 0) {
                        var5 /= var9;
                    }
                    if (var7 == 3) {
                        var5 *= var9;
                    }
                    var7 = 0;
                } else {
                    var7 = var10;
                }
            }
        } catch (Exception var26) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(III)Lok;", line = 302)
    public static final class160 method1709(int arg0, int arg1, int arg2) {
        field3830++;
        int var3 = 45 % ((arg1 - 23) / 41);
        class160 var4 = class37.method238((byte) 55, arg2);
        if (arg0 == -1) {
            return var4;
        } else if (var4 == null || var4.field2459 == null || arg0 >= var4.field2459.length) {
            return null;
        } else {
            return var4.field2459[arg0];
        }
    }
}
