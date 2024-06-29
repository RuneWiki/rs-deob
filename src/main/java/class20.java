import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class20 extends class49 {

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    private int field280 = 0;

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "I")
    private int field283 = 0;

    @OriginalMember(owner = "client!bk", name = "O", descriptor = "Z")
    public boolean field290 = false;

    @OriginalMember(owner = "client!bk", name = "R", descriptor = "I")
    private int field292 = -32768;

    @OriginalMember(owner = "client!bk", name = "N", descriptor = "I")
    public int field289;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "I")
    public int field276;

    @OriginalMember(owner = "client!bk", name = "V", descriptor = "I")
    public int field296;

    @OriginalMember(owner = "client!bk", name = "L", descriptor = "I")
    public int field287;

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "I")
    public int field278;

    @OriginalMember(owner = "client!bk", name = "M", descriptor = "Lmb;")
    private class151 field288;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "Z")
    public static boolean field272 = true;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!bk", name = "P", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!bk", name = "S", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!bk", name = "T", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!bk", name = "U", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "()I")
    public final int method94() {
        field291++;
        return this.field292;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V")
    public static final void method95(boolean arg0) {
        field284++;
        int var1 = class97.field1622.method428(8, (byte) -116);
        if (var1 < class86.field1444) {
            for (int var2 = var1; var2 < class86.field1444; var2++) {
                class16.field238[class44.field712++] = class75.field1195[var2];
            }
        }
        if (class86.field1444 < var1) {
            throw new RuntimeException("gppov1");
        }
        if (!arg0) {
            method99((byte) -38);
        }
        class86.field1444 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class75.field1195[var3];
            class103 var5 = class66.field1055[var4];
            int var6 = class97.field1622.method428(1, (byte) -114);
            if (var6 == 0) {
                class75.field1195[class86.field1444++] = var4;
                var5.field4309 = class179.field2960;
            } else {
                int var7 = class97.field1622.method428(2, (byte) -114);
                if (var7 == 0) {
                    class75.field1195[class86.field1444++] = var4;
                    var5.field4309 = class179.field2960;
                    class215.field3732[class185.field3060++] = var4;
                } else if (var7 == 1) {
                    class75.field1195[class86.field1444++] = var4;
                    var5.field4309 = class179.field2960;
                    int var8 = class97.field1622.method428(3, (byte) -119);
                    var5.method1687(false, var8, (byte) 28);
                    int var9 = class97.field1622.method428(1, (byte) -125);
                    if (var9 == 1) {
                        class215.field3732[class185.field3060++] = var4;
                    }
                } else if (var7 == 2) {
                    class75.field1195[class86.field1444++] = var4;
                    var5.field4309 = class179.field2960;
                    int var10 = class97.field1622.method428(3, (byte) -120);
                    var5.method1687(true, var10, (byte) 28);
                    int var11 = class97.field1622.method428(3, (byte) -122);
                    var5.method1687(true, var11, (byte) 28);
                    int var12 = class97.field1622.method428(1, (byte) -126);
                    if (var12 == 1) {
                        class215.field3732[class185.field3060++] = var4;
                    }
                } else if (var7 == 3) {
                    class16.field238[class44.field712++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field295++;
        class65 var11 = this.method98(1);
        if (var11 != null) {
            var11.method96(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field292 = var11.method94();
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILdf;ILdf;ILdf;)V")
    public static final void method97(int arg0, class51 arg1, int arg2, class51 arg3, int arg4, class51 arg5) {
        for (int var6 = 99; var6 > 0; var6--) {
            class40.field626[var6] = class40.field626[var6 - 1];
            class89.field1476[var6] = class89.field1476[var6 - 1];
            class169.field2740[var6] = class169.field2740[var6 - 1];
            class92.field1524[var6] = class92.field1524[var6 - 1];
            class258.field4510[var6] = class258.field4510[var6 - 1];
        }
        field281++;
        class40.field626[0] = arg0;
        if (arg2 != 3) {
            field274 = 103;
        }
        class258.field4510[0] = arg4;
        class132.field2202++;
        class1.field5 = class189.field3173;
        class89.field1476[0] = arg5;
        class169.field2740[0] = arg1;
        class92.field1524[0] = arg3;
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)Ltb;")
    private final class65 method98(int arg0) {
        if (arg0 != 1) {
            this.field283 = 6;
        }
        class82 var2 = class195.method1384(this.field285, arg0 - 1);
        field275++;
        class65 var3;
        if (this.field290) {
            var3 = var2.method639((byte) -4, -1);
        } else {
            var3 = var2.method639((byte) -4, this.field283);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(B)V")
    public static final void method99(byte arg0) {
        if (arg0 < -22) {
            for (int var1 = 0; var1 < 100; var1++) {
                class213.field3705[var1] = true;
            }
            field286++;
        }
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(II)V")
    public final void method100(int arg0, int arg1) {
        field277++;
        if (this.field290) {
            return;
        }
        int var3 = -94 % ((-arg0 - 9) / 44);
        this.field280 += arg1;
        while (this.field288.field2532[this.field283] < this.field280) {
            this.field280 -= this.field288.field2532[this.field283];
            this.field283++;
            if (this.field283 >= this.field288.field2539.length) {
                this.field290 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILlb;)Lti;")
    public static final class5 method101(int arg0, class121 arg1) {
        field273++;
        class5 var2 = new class5(arg1.method903((byte) 108), arg1.method903((byte) 108), arg1.method876(false), arg1.method876(false), arg1.method865((byte) 8), arg1.method897(arg0 - 7111) == 1);
        int var3 = arg1.method897(105);
        if (arg0 != 7071) {
            method101(-99, (class121) null);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field55.method1709(-120, new class144(arg1.method876(false), arg1.method876(false), arg1.method876(false), arg1.method876(false)));
        }
        var2.method22((byte) -119);
        return var2;
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "(B)V")
    public static final void method102(byte arg0) {
        class260.field4539.method1350((byte) 119);
        int var1 = 6 / ((arg0 - 32) / 42);
        class213.field3706.method1350((byte) 121);
        field294++;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)V")
    public static final void method103(int arg0, byte arg1) {
        field282++;
        if (arg0 == -1 || !class207.method1426((byte) 107, arg0)) {
            return;
        }
        if (arg1 != -96) {
            field272 = false;
        }
        class213[] var2 = class10.field106[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class213 var4 = var2[var3];
            if (var4.field3564 != null) {
                class205 var5 = new class205();
                var5.field3433 = var4;
                var5.field3423 = var4.field3564;
                class74.method531(2000000, 106, var5);
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I[Ldf;)Ldf;")
    public static final class51 method104(int arg0, class51[] arg1) {
        int var2 = 41 % ((-arg0 - 54) / 32);
        field279++;
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class146.method1044(0, arg1, arg1.length, true);
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(IIIIIII)V")
    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field289 = arg6 + arg5;
        this.field276 = arg3;
        this.field296 = arg2;
        this.field287 = arg1;
        this.field285 = arg0;
        this.field278 = arg4;
        int var8 = class195.method1384(this.field285, 0).field1388;
        if (var8 == -1) {
            this.field290 = true;
        } else {
            this.field290 = false;
            this.field288 = class72.method501(var8, (byte) 24);
        }
    }
}
