import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class386 extends class139 {

    @OriginalMember(owner = "client!kq", name = "H", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!kq", name = "I", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!kq", name = "L", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!kq", name = "M", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!kq", name = "N", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!kq", name = "O", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!kq", name = "P", descriptor = "[S")
    public static short[] field5488;

    @OriginalMember(owner = "client!kq", name = "J", descriptor = "[[I")
    public static int[][] field5482;

    @OriginalMember(owner = "client!kq", name = "K", descriptor = "[[Z")
    public static boolean[][] field5483;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lah;Lah;I)V")
    public static final void method2325(class238 arg0, class238 arg1, int arg2) {
        ++field5480;
        if (arg0.field3576 != null) {
            arg0.method1510((byte) -13);
        }
        arg0.field3575 = arg1;
        arg0.field3576 = arg1.field3576;
        if (arg2 != 111105159) {
            field5482 = null;
        }
        arg0.field3576.field3575 = arg0;
        arg0.field3575.field3576 = arg0;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        ++field5484;
        if (arg1 == -45) {
            if (~arg2 == -1) {
                super.field1841 = arg0.method1701(-23121) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        ++field5481;
        int[] var3 = super.field1844.method2176(arg0, 0);
        if (arg1 != 27782) {
            return null;
        } else {
            if (super.field1844.field5045) {
                int[] var4 = this.method879((byte) -29, arg0, 0);
                int[] var5 = this.method879((byte) -29, arg0, 1);
                int[] var6 = this.method879((byte) -29, arg0, 2);
                for (int var7 = 0; ~class356.field5147 < ~var7; ++var7) {
                    int var8 = var6[var7];
                    if (var8 == 4096) {
                        var3[var7] = var4[var7];
                    } else if (var8 != 0) {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "()V")
    public class386() {
        super(3, false);
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "(I)V")
    public static final void method2326(int arg0) {
        ++field5487;
        if (class250.field3692 != null) {
            class250.field3692.method1936((byte) 108);
            class1.field7 = null;
            class250.field3692 = null;
        }
        if (arg0 != 0) {
            method2326(43);
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)[[I")
    public final int[][] method33(int arg0, int arg1) {
        ++field5486;
        int[][] var3 = super.field1835.method999((byte) 104, arg1);
        if (arg0 > -67) {
            field5482 = null;
        }
        if (super.field1835.field2395) {
            int[] var4 = this.method879((byte) -29, arg1, 2);
            int[][] var5 = this.method882(0, arg1, 1);
            int[][] var6 = this.method882(1, arg1, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class356.field5147; ++var16) {
                int var17 = var4[var16];
                if (~var17 != -4097) {
                    if (~var17 == -1) {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    } else {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 - -(var14[var16] * var18) >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIII)I")
    public static final int method2327(int arg0, int arg1, int arg2, int arg3) {
        ++field5485;
        if (~arg1 == ~arg3) {
            return arg1;
        } else {
            int var4 = -arg0 + 128;
            int var5 = (arg1 & 127) * var4 + (arg3 & 127) * arg0 >> 7;
            int var6 = (arg2 & arg1) * var4 + (arg3 & 896) * arg0 >> 7;
            int var7 = (64512 & arg1) * var4 - -((arg3 & 64512) * arg0) >> 7;
            return 896 & var6 | 64512 & var7 | 127 & var5;
        }
    }

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "(B)V")
    public static void method2328(byte arg0) {
        field5483 = null;
        field5488 = null;
        if (arg0 != -119) {
            field5483 = null;
        }
        field5482 = null;
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "(II)V")
    public static final void method2329(int arg0, int arg1) {
        class242 var2 = null;
        for (int var3 = arg0; var3 < arg1; ++var3) {
            class426 var4 = class178.field2556[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class360.field5188; ++var5) {
                    for (int var6 = 0; var6 < class287.field4186; ++var6) {
                        var2 = var4.method1214(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class216.field3242;
                            int var8 = var5 << class216.field3242;
                            for (int var9 = var3 - 1; var9 >= 0; --var9) {
                                class426 var10 = class178.field2556[var9];
                                if (var10 != null) {
                                    int var11 = var4.method1218(var6, var5) - var10.method1218(var6, var5);
                                    int var12 = var4.method1218(var6 + 1, var5) - var10.method1218(var6 + 1, var5);
                                    int var13 = var4.method1218(var6 + 1, var5 + 1) - var10.method1218(var6 + 1, var5 + 1);
                                    int var14 = var4.method1218(var6, var5 + 1) - var10.method1218(var6, var5 + 1);
                                    var10.method1215(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        new class326("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
    }
}
