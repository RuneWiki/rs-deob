import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class158 extends class64 {

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "I")
    private int field3160 = 0;

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "I")
    private int field3161 = 2000;

    @OriginalMember(owner = "client!rf", name = "X", descriptor = "I")
    private int field3167 = 16;

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "I")
    public static int field3159 = 0;

    @OriginalMember(owner = "client!rf", name = "Y", descriptor = "Lcd;")
    public static class23 field3168 = class54.method414("<)4col>", -1);

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        int var4 = -126 % ((7 - arg0) / 43);
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field3167 = arg2.method1202(-112);
                }
            } else {
                this.field3161 = arg2.method1197(-1);
            }
        } else {
            this.field3160 = arg2.method1202(-13);
        }
        ++field3165;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([BIII[Lfh;IIIII)V")
    public static final void method970(byte[] arg0, int arg1, int arg2, int arg3, class54[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field3162;
        for (int var10 = 0; ~var10 > -9; ++var10) {
            for (int var15 = 0; ~var15 > -9; ++var15) {
                if (arg3 + var10 > 0 && arg3 + var10 < 103 && arg5 + var15 > 0 && ~(arg5 + var15) > -104) {
                    arg4[arg9].field1261[arg3 + var10][arg5 + var15] = class27.method198(arg4[arg9].field1261[arg3 + var10][arg5 + var15], -16777217);
                }
            }
        }
        if (arg7 == -27429) {
            class189 var11 = new class189(arg0);
            for (int var12 = 0; var12 < 4; ++var12) {
                for (int var13 = 0; ~var13 > -65; ++var13) {
                    for (int var14 = 0; var14 < 64; ++var14) {
                        if (~arg1 == ~var12 && var13 >= arg2 && var13 < arg2 + 8 && arg6 <= var14 && ~(arg6 - -8) < ~var14) {
                            class103.method678(arg9, arg3 - -class9.method53(arg8, (byte) -125, var14 & 7, 7 & var13), var11, -99, 0, class100.method667((byte) -124, arg8, var13 & 7, 7 & var14) + arg5, arg8, 0);
                        } else {
                            class103.method678(0, -1, var11, -128, 0, -1, 0, 0);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(B)V")
    public static void method971(byte arg0) {
        field3168 = null;
        int var1 = -106 % ((arg0 - 61) / 44);
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
    public class158() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field3166;
        if (arg1 != -9421) {
            this.field3167 = 74;
        }
        int[] var3 = super.field1513.method1033(-126, arg0);
        if (super.field1513.field3368) {
            int[][] var4 = super.field1513.method1034(85);
            Random var5 = new Random((long) this.field3160);
            int var6 = this.field3167 << 1;
            for (int var7 = 0; this.field3161 > var7; ++var7) {
                int var8 = class155.method952(var5, class168.field3367, 120);
                int var9 = class155.method952(var5, class2.field24, arg1 ^ -9408);
                int var10 = var8 - (-class155.method952(var5, var6, arg1 + 9542) - -this.field3167);
                int var11 = var9 + class155.method952(var5, var6, arg1 + 9437) - this.field3167;
                int var12 = -var9 + var11;
                int var13 = var10 - var8;
                if (~var13 != -1 || var12 != 0) {
                    if (~var13 > -1) {
                        var13 = -var13;
                    }
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    boolean var14 = ~var12 < ~var13;
                    if (var14) {
                        int var15 = var8;
                        int var16 = var10;
                        var10 = var11;
                        var11 = var16;
                        var8 = var9;
                        var9 = var15;
                    }
                    if (~var10 > ~var8) {
                        int var17 = var8;
                        var8 = var10;
                        var10 = var17;
                        int var18 = var9;
                        var9 = var11;
                        var11 = var18;
                    }
                    int var19 = var9;
                    int var20 = -var9 + var11;
                    if (~var20 > -1) {
                        var20 = -var20;
                    }
                    int var21 = -var8 + var10;
                    int var22 = -var21 / 2;
                    int var23 = 2048 / var21;
                    int var24 = 1024 + -(class155.method952(var5, 4096, arg1 ^ 9451) >> 2);
                    int var25 = ~var9 > ~var11 ? 1 : -1;
                    for (int var26 = var8; var10 > var26; ++var26) {
                        var22 += var20;
                        int var27 = var26 & class163.field3266;
                        int var28 = (-var8 + var26) * var23 + (var24 - -1024);
                        int var29 = class81.field1760 & var19;
                        if (!var14) {
                            var4[var27][var29] = var28;
                        } else {
                            var4[var29][var27] = var28;
                        }
                        if (var22 > 0) {
                            var22 += -var21;
                            var19 -= -var25;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lva;I)Lha;")
    public static final class64 method972(class189 arg0, int arg1) {
        ++field3164;
        int var2 = arg0.method1202(120);
        int var3 = arg0.method1202(-63);
        Class var4 = class100.method668(var3, -17244);
        try {
            if (arg1 != -1) {
                field3168 = null;
            }
            class64 var5 = (class64) var4.newInstance();
            if (var5 != null) {
                var5.field1531 = var2;
                var5.field1509 = arg0.method1202(-100);
                int var6 = arg0.method1202(-82);
                for (int var7 = 0; var6 > var7; ++var7) {
                    int var8 = arg0.method1202(116);
                    var5.method37((byte) 81, var8, arg0);
                }
            }
            var5.method44((byte) -22);
            return var5;
        } catch (IllegalAccessException var9) {
            throw new RuntimeException();
        } catch (InstantiationException var10) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)V")
    public static final void method973(int arg0) {
        class127.field2597 = true;
        if (arg0 == -8) {
            ++field3163;
            class193.field3810 = true;
        }
    }
}
