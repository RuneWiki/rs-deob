import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class267 {

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "I")
    public int field3922 = -1;

    @OriginalMember(owner = "client!lp", name = "t", descriptor = "Z")
    public boolean field3938 = false;

    @OriginalMember(owner = "client!lp", name = "p", descriptor = "I")
    public int field3934 = -1;

    @OriginalMember(owner = "client!lp", name = "w", descriptor = "I")
    public int field3941 = 99;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "Z")
    public boolean field3927 = false;

    @OriginalMember(owner = "client!lp", name = "x", descriptor = "I")
    public int field3942 = 5;

    @OriginalMember(owner = "client!lp", name = "u", descriptor = "Z")
    public boolean field3939 = false;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "I")
    public int field3926 = -1;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "Z")
    public boolean field3920 = false;

    @OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
    public int field3932 = 2;

    @OriginalMember(owner = "client!lp", name = "z", descriptor = "I")
    public int field3944 = -1;

    @OriginalMember(owner = "client!lp", name = "r", descriptor = "I")
    public int field3936 = -1;

    @OriginalMember(owner = "client!lp", name = "o", descriptor = "I")
    public static int field3933 = 0;

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "Lsp;")
    public static class448 field3930 = new class448("WTI", 5);

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!lp", name = "q", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!lp", name = "s", descriptor = "I")
    public int field3937;

    @OriginalMember(owner = "client!lp", name = "y", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!lp", name = "C", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "Ll;")
    public static class16 field3928;

    @OriginalMember(owner = "client!lp", name = "m", descriptor = "Ldu;")
    public class238 field3931;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "[I")
    public int[] field3919;

    @OriginalMember(owner = "client!lp", name = "v", descriptor = "[I")
    public int[] field3940;

    @OriginalMember(owner = "client!lp", name = "A", descriptor = "[I")
    private int[] field3945;

    @OriginalMember(owner = "client!lp", name = "B", descriptor = "[Z")
    public boolean[] field3946;

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "[[I")
    public int[][] field3929;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Liv;II)V")
    private final void method1714(class65 arg0, int arg1, int arg2) {
        if (arg2 != -15734) {
            method1718(-111);
        }
        field3935++;
        if (arg1 == 1) {
            int var13 = arg0.method623((byte) -105);
            this.field3940 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3940[var14] = arg0.method623((byte) 88);
            }
            this.field3919 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field3919[var15] = arg0.method623((byte) -64);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field3919[var16] += arg0.method623((byte) -108) << 16;
            }
        } else if (arg1 == 2) {
            this.field3926 = arg0.method623((byte) -74);
        } else if (arg1 == 3) {
            this.field3946 = new boolean[256];
            int var4 = arg0.method577(arg2 + 15989);
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3946[arg0.method577(class429.method2613(arg2, -15755))] = true;
            }
        } else if (arg1 == 4) {
            this.field3939 = true;
        } else if (arg1 == 5) {
            this.field3942 = arg0.method577(255);
        } else if (arg1 == 6) {
            this.field3934 = arg0.method623((byte) 98);
        } else if (arg1 == 7) {
            this.field3944 = arg0.method623((byte) 113);
        } else if (arg1 == 8) {
            this.field3941 = arg0.method577(255);
        } else if (arg1 == 9) {
            this.field3922 = arg0.method577(255);
        } else if (arg1 == 10) {
            this.field3936 = arg0.method577(255);
        } else if (arg1 == 11) {
            this.field3932 = arg0.method577(255);
        } else if (arg1 == 12) {
            int var10 = arg0.method577(arg2 + 15989);
            this.field3945 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field3945[var11] = arg0.method623((byte) -101);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field3945[var12] = (arg0.method623((byte) -29) << 16) + this.field3945[var12];
            }
        } else if (arg1 == 13) {
            int var6 = arg0.method623((byte) -74);
            this.field3929 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method577(255);
                if (var8 > 0) {
                    this.field3929[var7] = new int[var8];
                    this.field3929[var7][0] = arg0.method580((byte) 29);
                    for (int var9 = 1; var9 < var8; var9++) {
                        this.field3929[var7][var9] = arg0.method623((byte) -128);
                    }
                }
            }
            return;
        } else if (arg1 == 14) {
            this.field3938 = true;
            return;
        } else if (arg1 == 15) {
            this.field3927 = true;
            return;
        } else if (arg1 == 16) {
            this.field3920 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Liv;I)V")
    public final void method1715(class65 arg0, int arg1) {
        int var3 = 111 % ((arg1 + 57) / 48);
        while (true) {
            int var4 = arg0.method577(255);
            if (var4 == 0) {
                field3943++;
                return;
            }
            this.method1714(arg0, var4, -15734);
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIILt;I)Lt;")
    public final class471 method1716(int arg0, int arg1, int arg2, int arg3, class471 arg4, int arg5) {
        if (arg5 >= -102) {
            this.field3919 = null;
        }
        field3924++;
        int var7 = this.field3940[arg3];
        int var8 = this.field3919[arg3];
        class367 var9 = this.field3931.method1579(var8 >> 16, 1);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg4.method458((byte) 1, arg1, true);
        }
        class367 var11 = null;
        if ((this.field3927 || class447.field6599) && arg2 != -1 && this.field3919.length > arg2) {
            int var12 = this.field3919[arg2];
            var11 = this.field3931.method1579(var12 >> 16, 1);
            arg2 = var12 & 0xFFFF;
        }
        class367 var13 = null;
        class367 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field3945 != null) {
            if (arg3 < this.field3945.length) {
                var15 = this.field3945[arg3];
                if (var15 != 65535) {
                    var13 = this.field3931.method1579(var15 >> 16, 1);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field3927 || class447.field6599) && arg2 != -1 && arg2 < this.field3945.length) {
                var16 = this.field3945[arg2];
                if (var16 != 65535) {
                    var14 = this.field3931.method1579(var16 >> 16, 1);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field3938) {
            arg1 |= 0x200;
        }
        if (var9.method2265((byte) -103, var10)) {
            arg1 |= 0x80;
        }
        if (var9.method2272(-6210, var10)) {
            arg1 |= 0x100;
        }
        if (var9.method2273(var10, (byte) 105)) {
            arg1 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2265((byte) -119, var15)) {
                arg1 |= 0x80;
            }
            if (var13.method2272(-6210, var15)) {
                arg1 |= 0x100;
            }
            if (var13.method2273(var15, (byte) 119)) {
                arg1 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method2265((byte) -110, arg2)) {
                arg1 |= 0x80;
            }
            if (var11.method2272(-6210, arg2)) {
                arg1 |= 0x100;
            }
            if (var11.method2273(arg2, (byte) 95)) {
                arg1 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method2265((byte) -125, var16)) {
                arg1 |= 0x80;
            }
            if (var14.method2272(-6210, var16)) {
                arg1 |= 0x100;
            }
            if (var14.method2273(var16, (byte) 116)) {
                arg1 |= 0x400;
            }
        }
        int var17 = arg1 | 0x20;
        class471 var18 = arg4.method458((byte) 1, var17, true);
        var18.method2849(0, var7, this.field3938, var10, arg2, var9, var11, arg0 - 1, 0);
        if (var13 != null) {
            var18.method2849(0, var7, this.field3938, var15, var16, var13, var14, arg0 - 1, 0);
        }
        return var18;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIZ)I")
    public final int method1717(int arg0, int arg1, int arg2, boolean arg3) {
        field3923++;
        int var5 = 0;
        int var6 = 0;
        if (arg1 != 256) {
            this.method1714(null, 46, 101);
        }
        int var7 = this.field3919[arg0];
        class367 var8 = null;
        class367 var9 = this.field3931.method1579(var7 >> 16, 1);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field3927 || class447.field6599) && arg2 != -1 && arg2 < this.field3919.length) {
            int var11 = this.field3919[arg2];
            var8 = this.field3931.method1579(var11 >> 16, 1);
            var6 = var11 & 0xFFFF;
        }
        if (this.field3938) {
            var5 |= 0x200;
        }
        if (var9.method2265((byte) -88, var10)) {
            var5 |= 0x80;
        }
        if (var9.method2272(-6210, var10)) {
            var5 |= 0x100;
        }
        if (var9.method2273(var10, (byte) 115)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method2265((byte) -108, var6)) {
                var5 |= 0x80;
            }
            if (var8.method2272(-6210, var6)) {
                var5 |= 0x100;
            }
            if (var8.method2273(var6, (byte) 109)) {
                var5 |= 0x400;
            }
        }
        if (this.field3945 != null && arg3) {
            if (this.field3945.length > arg0) {
                int var12 = this.field3945[arg0];
                if (var12 != 65535) {
                    class367 var13 = this.field3931.method1579(var12 >> 16, 1);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method2265((byte) -55, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method2272(-6210, var14)) {
                            var5 |= 0x100;
                        }
                        if (var13.method2273(var14, (byte) 95)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field3927 || class447.field6599) && arg2 != -1 && this.field3945.length > arg2) {
                int var15 = this.field3945[arg2];
                if (var15 != 65535) {
                    class367 var16 = this.field3931.method1579(var15 >> 16, 1);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method2265((byte) -55, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method2272(-6210, var17)) {
                            var5 |= 0x100;
                        }
                        if (var16.method2273(var17, (byte) 109)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
    public static final void method1718(int arg0) {
        if (arg0 > -41) {
            field3930 = null;
        }
        field3925++;
        int var1 = class75.field1027;
        int[] var2 = class334.field4634;
        for (int var3 = 0; var3 < var1; var3++) {
            class364 var4 = class384.field5647[var2[var3]];
            if (var4 != null) {
                class199.method1401(var4.method963((byte) 127), (byte) -10, var4);
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IBLt;IIIII)Lt;")
    public final class471 method1719(int arg0, byte arg1, class471 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3921++;
        int var9 = this.field3940[arg0];
        int var10 = this.field3919[arg0];
        class367 var11 = this.field3931.method1579(var10 >> 16, arg7 ^ 0x101);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg2.method458(arg1, arg6, true);
        }
        class367 var13 = null;
        if ((this.field3927 || class447.field6599) && arg4 != -1 && arg4 < this.field3919.length) {
            int var14 = this.field3919[arg4];
            var13 = this.field3931.method1579(var14 >> 16, arg7 ^ 0x101);
            arg4 = var14 & 0xFFFF;
        }
        if (this.field3938) {
            arg6 |= 0x200;
        }
        if (arg7 != 256) {
            this.field3920 = false;
        }
        if (var11.method2265((byte) -45, var12)) {
            arg6 |= 0x80;
        }
        if (var11.method2272(arg7 - 6466, var12)) {
            arg6 |= 0x100;
        }
        if (var11.method2273(var12, (byte) 96)) {
            arg6 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2265((byte) -92, arg4)) {
                arg6 |= 0x80;
            }
            if (var13.method2272(-6210, arg4)) {
                arg6 |= 0x100;
            }
            if (var13.method2273(arg4, (byte) 94)) {
                arg6 |= 0x400;
            }
        }
        int var15 = arg6 | 0x20;
        class471 var16 = arg2.method458(arg1, var15, true);
        var16.method2849(arg5, var9, this.field3938, var12, arg4, var11, var13, arg3 - 1, 0);
        return var16;
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)V")
    public final void method1720(int arg0) {
        if (this.field3922 == -1) {
            if (this.field3946 == null) {
                this.field3922 = 0;
            } else {
                this.field3922 = 2;
            }
        }
        if (arg0 != 2) {
            this.field3936 = -63;
        }
        field3947++;
        if (this.field3936 != -1) {
            return;
        }
        if (this.field3946 == null) {
            this.field3936 = 0;
        } else {
            this.field3936 = 2;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V")
    public static void method1721(byte arg0) {
        field3928 = null;
        field3930 = null;
        int var1 = 114 / ((arg0 - 44) / 38);
    }
}
