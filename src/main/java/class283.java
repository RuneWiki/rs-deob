import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class283 {

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "Z")
    public boolean field4591 = true;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
    private int field4600 = -1;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    private int field4602;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    private int field4601;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "Ldh;")
    private class339 field4595;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "Lvf;")
    private class159 field4589;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    private int field4594;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "Lkia;")
    private class649 field4598;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "Lbv;")
    private class322 field4593;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "Ltb;")
    private class422 field4596;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4603 = new String[] { method2416(method2415("\u0007\u0017kXH")), method2416(method2415("\u0003\u000e)p")), method2416(method2415("\u0016Uk2\u001d")), method2416(method2415("\u0007\u0017k]H")), method2416(method2415("\u0007\u0017k^H")), method2416(method2415("\u0007\u0017k_H")), method2416(method2415("\u0007\u0017k \t\u0003\u00121\"H")) };

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V")
    private final void method2411(boolean arg0) {
        try {
            field4597++;
            if (this.field4591) {
                this.field4591 = false;
                byte[] var2 = this.field4595.field5527;
                byte[] var3 = this.field4589.field2540;
                int var4 = 0;
                int var5 = this.field4595.field5520;
                int var6 = this.field4595.field5520 * this.field4601 + this.field4602;
                for (int var7 = -128; var7 < 0; var7++) {
                    var4 = (var4 << 8) - var4;
                    for (int var8 = -128; var8 < 0; var8++) {
                        if (var2[var6++] != 0) {
                            var4++;
                        }
                    }
                    var6 += var5 - 128;
                }
                if (this.field4598 != null && this.field4600 == var4) {
                    this.field4591 = false;
                } else {
                    this.field4600 = var4;
                    int var9 = 0;
                    int var10 = this.field4601 * var5 + this.field4602;
                    for (int var11 = -128; var11 < 0; var11++) {
                        for (int var12 = -128; var12 < 0; var12++) {
                            if (var2[var10] == 0) {
                                int var13 = 0;
                                if (var2[var10 - 1] != 0) {
                                    var13++;
                                }
                                if (var2[var10 + 1] != 0) {
                                    var13++;
                                }
                                if (var2[var10 - var5] != 0) {
                                    var13++;
                                }
                                if (var2[var10 + var5] != 0) {
                                    var13++;
                                }
                                var3[var9++] = (byte) (var13 * 17);
                            } else {
                                var3[var9++] = 68;
                            }
                            var10++;
                        }
                        var10 += this.field4595.field5520 - 128;
                    }
                    if (!arg0) {
                        this.field4596 = null;
                    }
                    if (this.field4598 == null) {
                        this.field4598 = new class649(this.field4589, 3553, 6406, 128, 128, false, this.field4589.field2540, 6406, false);
                        this.field4598.method4732(false, 120, false);
                        this.field4598.method1967(6, true);
                    } else {
                        this.field4598.method4731(128, 6406, this.field4589.field2540, false, 0, 0, 0, -26658, 0, 128);
                    }
                }
            }
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field4603[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIZ[B)V")
    public final void method2412(int arg0, int arg1, boolean arg2, byte[] arg3) {
        try {
            this.field4596.method623(arg1, arg0 * this.field4589.method1440(arg1, -73), arg2, arg3);
            field4599++;
            this.method2413(arg0, -106, this.field4596);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4603[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field4603[1] : field4603[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IILbv;)V")
    private final void method2413(int arg0, int arg1, class322 arg2) {
        try {
            field4590++;
            if (arg0 != 0) {
                this.method2411(true);
                if (arg1 <= -103) {
                    this.field4589.method1497(this.field4598, true);
                    this.field4589.method1461((byte) -15, arg2, 0, arg0, 4);
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4603[3] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field4603[1] : field4603[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
    public final void method2414(int arg0) {
        try {
            this.method2413(this.field4594, -124, this.field4593);
            if (arg0 <= 105) {
                this.field4591 = false;
            }
            field4592++;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4603[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lvf;Ldh;Ldl;IIIII)V")
    public class283(class159 arg0, class339 arg1, class67 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            this.field4602 = arg6;
            this.field4601 = arg7;
            this.field4595 = arg1;
            this.field4589 = arg0;
            int var9 = 0x1 << arg5;
            int var10 = 0;
            int var11 = arg3 << arg5;
            int var12 = arg4 << arg5;
            for (int var13 = 0; var13 < var9; var13++) {
                int var14 = var11 + (var12 + var13) * arg2.field4704;
                for (int var15 = 0; var15 < var9; var15++) {
                    short[] var16 = arg2.field918[var14++];
                    if (var16 != null) {
                        var10 += var16.length;
                    }
                }
            }
            this.field4594 = var10;
            if (var10 <= 0) {
                this.field4598 = null;
            } else {
                class176 var17 = new class176(var10 * 2);
                if (this.field4589.field2500) {
                    for (int var23 = 0; var23 < var9; var23++) {
                        int var24 = (var12 + var23) * arg2.field4704 + var11;
                        for (int var25 = 0; var25 < var9; var25++) {
                            short[] var26 = arg2.field918[var24++];
                            if (var26 != null) {
                                for (int var27 = 0; var27 < var26.length; var27++) {
                                    var17.method1650((byte) -95, var26[var27] & 0xFFFF);
                                }
                            }
                        }
                    }
                } else {
                    for (int var18 = 0; var18 < var9; var18++) {
                        int var19 = (var12 + var18) * arg2.field4704 + var11;
                        for (int var20 = 0; var20 < var9; var20++) {
                            short[] var21 = arg2.field918[var19++];
                            if (var21 != null) {
                                for (int var22 = 0; var22 < var21.length; var22++) {
                                    var17.method1633(var21[var22] & 0xFFFF, -24955);
                                }
                            }
                        }
                    }
                }
                this.field4593 = this.field4589.method1465(false, true, 5123, var17.field2799, var17.field2805);
                this.field4596 = new class422(this.field4589, 5123, null, 1);
            }
        } catch (RuntimeException var29) {
            throw class590.method4333(var29, field4603[6] + (arg0 == null ? field4603[1] : field4603[2]) + ',' + (arg1 == null ? field4603[1] : field4603[2]) + ',' + (arg2 == null ? field4603[1] : field4603[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2415(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x60);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2416(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 109;
                    break;
                case 1:
                    var10005 = 123;
                    break;
                case 2:
                    var10005 = 69;
                    break;
                case 3:
                    var10005 = 28;
                    break;
                default:
                    var10005 = 96;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
