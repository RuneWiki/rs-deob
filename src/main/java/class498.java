import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class498 {

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "Loga;")
    private class158 field7038 = new class158();

    @OriginalMember(owner = "client!oaa", name = "o", descriptor = "Loga;")
    private class158 field7052 = new class158();

    @OriginalMember(owner = "client!oaa", name = "p", descriptor = "Loga;")
    private class158 field7053 = new class158();

    @OriginalMember(owner = "client!oaa", name = "s", descriptor = "Loga;")
    private class158 field7056 = new class158();

    @OriginalMember(owner = "client!oaa", name = "u", descriptor = "Lgk;")
    private class540 field7058 = new class540(4);

    @OriginalMember(owner = "client!oaa", name = "x", descriptor = "B")
    private byte field7061 = 0;

    @OriginalMember(owner = "client!oaa", name = "A", descriptor = "I")
    public volatile int field7064 = 0;

    @OriginalMember(owner = "client!oaa", name = "z", descriptor = "I")
    public volatile int field7063 = 0;

    @OriginalMember(owner = "client!oaa", name = "y", descriptor = "Lgk;")
    private class540 field7062 = new class540(8);

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "Lmh;")
    public static class139 field7042 = new class139(6, 1);

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "I")
    public static int field7039;

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "I")
    public static int field7040;

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "I")
    public static int field7041;

    @OriginalMember(owner = "client!oaa", name = "f", descriptor = "I")
    public static int field7043;

    @OriginalMember(owner = "client!oaa", name = "g", descriptor = "I")
    public static int field7044;

    @OriginalMember(owner = "client!oaa", name = "h", descriptor = "I")
    public static int field7045;

    @OriginalMember(owner = "client!oaa", name = "i", descriptor = "I")
    public static int field7046;

    @OriginalMember(owner = "client!oaa", name = "j", descriptor = "I")
    public static int field7047;

    @OriginalMember(owner = "client!oaa", name = "k", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!oaa", name = "l", descriptor = "I")
    public static int field7049;

    @OriginalMember(owner = "client!oaa", name = "m", descriptor = "I")
    public static int field7050;

    @OriginalMember(owner = "client!oaa", name = "n", descriptor = "I")
    public static int field7051;

    @OriginalMember(owner = "client!oaa", name = "q", descriptor = "I")
    public static int field7054;

    @OriginalMember(owner = "client!oaa", name = "r", descriptor = "I")
    public static int field7055;

    @OriginalMember(owner = "client!oaa", name = "t", descriptor = "I")
    private int field7057;

    @OriginalMember(owner = "client!oaa", name = "v", descriptor = "J")
    private long field7059;

    @OriginalMember(owner = "client!oaa", name = "w", descriptor = "Lqfa;")
    private class347 field7060;

    @OriginalMember(owner = "client!oaa", name = "B", descriptor = "Llaa;")
    private class448 field7065;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Z)V")
    public final void method2837(boolean arg0) {
        field7051++;
        if (this.field7060 == null) {
            return;
        }
        try {
            this.field7058.field7956 = 0;
            this.field7058.method3110(7, 31);
            this.field7058.method3113(0, arg0);
            this.field7060.method2155(this.field7058.field7952, -31137, 0, 4);
        } catch (IOException var3) {
            try {
                this.field7060.method2156(-96);
            } catch (Exception var2) {
            }
            this.field7063 = -2;
            this.field7060 = null;
            this.field7064++;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)Z")
    public final boolean method2838(int arg0) {
        field7054++;
        if (arg0 >= -4) {
            return true;
        } else {
            return this.method2845((byte) -11) >= 20;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)I")
    private final int method2839(int arg0) {
        if (arg0 != 1) {
            this.field7063 = -99;
        }
        field7046++;
        return this.field7053.method1127(false) + this.field7056.method1127(false);
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(Z)V")
    public final void method2840(boolean arg0) {
        try {
            this.field7060.method2156(110);
        } catch (Exception var2) {
        }
        field7040++;
        this.field7060 = null;
        this.field7061 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field7064++;
        if (arg0) {
            this.field7063 = -1;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IZLqfa;)V")
    public final void method2841(int arg0, boolean arg1, class347 arg2) {
        if (arg0 > -33) {
            this.field7062 = null;
        }
        field7049++;
        if (this.field7060 != null) {
            try {
                this.field7060.method2156(-100);
            } catch (Exception var8) {
            }
            this.field7060 = null;
        }
        this.field7060 = arg2;
        this.method2846(-7660);
        this.method2848((byte) -114, arg1);
        this.field7062.field7956 = 0;
        this.field7065 = null;
        while (true) {
            class448 var4 = (class448) this.field7052.method1132(-1);
            if (var4 == null) {
                while (true) {
                    class448 var5 = (class448) this.field7056.method1132(-1);
                    if (var5 == null) {
                        if (this.field7061 != 0) {
                            try {
                                this.field7058.field7956 = 0;
                                this.field7058.method3110(4, 67);
                                this.field7058.method3110(this.field7061, 109);
                                this.field7058.method3162(-2003712696, 0);
                                this.field7060.method2155(this.field7058.field7952, -31137, 0, 4);
                            } catch (IOException var7) {
                                try {
                                    this.field7060.method2156(-25);
                                } catch (Exception var6) {
                                }
                                this.field7063 = -2;
                                this.field7060 = null;
                                this.field7064++;
                            }
                        }
                        this.field7057 = 0;
                        this.field7059 = class60.method371(false);
                        return;
                    }
                    this.field7053.method1134(var5, -1);
                }
            }
            this.field7038.method1134(var4, -1);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "(I)V")
    public final void method2842(int arg0) {
        if (arg0 > -18) {
            this.field7061 = -19;
        }
        if (this.field7060 != null) {
            this.field7060.method2156(-100);
        }
        field7043++;
    }

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "(I)Z")
    public final boolean method2843(int arg0) {
        if (this.field7060 != null) {
            long var2 = class60.method371(false);
            int var4 = (int) (var2 - this.field7059);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field7059 = var2;
            this.field7057 += var4;
            if (this.field7057 > 30000) {
                try {
                    this.field7060.method2156(117);
                } catch (Exception var27) {
                }
                this.field7060 = null;
            }
        }
        field7044++;
        if (this.field7060 == null) {
            return this.method2845((byte) -11) == 0 && this.method2839(1) == 0;
        }
        try {
            this.field7060.method2159((byte) 105);
            for (class448 var5 = (class448) this.field7038.method1126(114); var5 != null; var5 = (class448) this.field7038.method1128(11)) {
                this.field7058.field7956 = 0;
                this.field7058.method3110(1, 31);
                this.field7058.method3113((int) var5.field4679, false);
                this.field7060.method2155(this.field7058.field7952, -31137, 0, 4);
                this.field7052.method1134(var5, -1);
            }
            for (class448 var6 = (class448) this.field7053.method1126(-120); var6 != null; var6 = (class448) this.field7053.method1128(11)) {
                this.field7058.field7956 = 0;
                this.field7058.method3110(0, 101);
                this.field7058.method3113((int) var6.field4679, false);
                this.field7060.method2155(this.field7058.field7952, -31137, 0, 4);
                this.field7056.method1134(var6, -1);
            }
            int var7 = 0;
            if (arg0 > -127) {
                this.field7052 = null;
            }
            while (var7 < 100) {
                int var8 = this.field7060.method2157(true);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field7057 = 0;
                byte var9 = 0;
                if (this.field7065 == null) {
                    var9 = 8;
                } else if (this.field7065.field6492 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field7062.field7956;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field7060.method2162((byte) 1, this.field7062.field7952, this.field7062.field7956, var10);
                    if (this.field7061 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field7062.field7952[this.field7062.field7956 + var11] = (byte) class145.method1006(this.field7062.field7952[this.field7062.field7956 + var11], this.field7061);
                        }
                    }
                    this.field7062.field7956 += var10;
                    if (this.field7062.field7956 >= var9) {
                        if (this.field7065 == null) {
                            this.field7062.field7956 = 0;
                            int var12 = this.field7062.method3115(29871);
                            int var13 = this.field7062.method3169(26488);
                            int var14 = this.field7062.method3115(29871);
                            int var15 = this.field7062.method3160(false);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class448 var21;
                            if (var17) {
                                for (var21 = (class448) this.field7056.method1126(101); var21 != null && var21.field4679 != var18; var21 = (class448) this.field7056.method1128(11)) {
                                }
                            } else {
                                for (var21 = (class448) this.field7052.method1126(-128); var21 != null && var21.field4679 != var18; var21 = (class448) this.field7052.method1128(11)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field7065 = var21;
                            this.field7065.field6489 = new class540(var15 + var22 + this.field7065.field6490);
                            this.field7065.field6489.method3110(var16, 81);
                            this.field7065.field6489.method3146(var15, 101);
                            this.field7065.field6492 = 8;
                            this.field7062.field7956 = 0;
                        } else if (this.field7065.field6492 != 0) {
                            throw new IOException();
                        } else if (this.field7062.field7952[0] == -1) {
                            this.field7062.field7956 = 0;
                            this.field7065.field6492 = 1;
                        } else {
                            this.field7065 = null;
                        }
                    }
                } else {
                    int var23 = this.field7065.field6489.field7952.length - this.field7065.field6490;
                    int var24 = 512 - this.field7065.field6492;
                    if (var24 > var23 - this.field7065.field6489.field7956) {
                        var24 = var23 - this.field7065.field6489.field7956;
                    }
                    if (var8 < var24) {
                        var24 = var8;
                    }
                    this.field7060.method2162((byte) 1, this.field7065.field6489.field7952, this.field7065.field6489.field7956, var24);
                    if (this.field7061 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field7065.field6489.field7952[this.field7065.field6489.field7956 + var25] = (byte) class145.method1006(this.field7065.field6489.field7952[this.field7065.field6489.field7956 + var25], this.field7061);
                        }
                    }
                    this.field7065.field6492 += var24;
                    this.field7065.field6489.field7956 += var24;
                    if (this.field7065.field6489.field7956 == var23) {
                        this.field7065.method1989((byte) 93);
                        this.field7065.field8640 = false;
                        this.field7065 = null;
                    } else if (this.field7065.field6492 == 512) {
                        this.field7065.field6492 = 0;
                    }
                }
                var7++;
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field7060.method2156(124);
            } catch (Exception var26) {
            }
            this.field7063 = -2;
            this.field7064++;
            this.field7060 = null;
            return this.method2845((byte) -11) == 0 && this.method2839(1) == 0;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "(I)Z")
    public final boolean method2844(int arg0) {
        if (arg0 != -21) {
            this.field7058 = null;
        }
        field7055++;
        return this.method2839(1) >= 20;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(B)I")
    public final int method2845(byte arg0) {
        if (arg0 != -11) {
            this.field7061 = -45;
        }
        field7050++;
        return this.field7038.method1127(false) + this.field7052.method1127(false);
    }

    @OriginalMember(owner = "client!oaa", name = "f", descriptor = "(I)V")
    private final void method2846(int arg0) {
        field7048++;
        if (this.field7060 == null) {
            return;
        }
        if (arg0 != -7660) {
            this.field7061 = 26;
        }
        try {
            this.field7058.field7956 = 0;
            this.field7058.method3110(6, 123);
            this.field7058.method3113(3, false);
            this.field7060.method2155(this.field7058.field7952, -31137, 0, 4);
        } catch (IOException var3) {
            try {
                this.field7060.method2156(96);
            } catch (Exception var2) {
            }
            this.field7063 = -2;
            this.field7064++;
            this.field7060 = null;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method2847(String arg0, byte arg1) {
        field7047++;
        for (int var2 = 0; var2 < class325.field4712.length; var2++) {
            if (class325.field4712[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return arg1 == 17 ? -1 : 26;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BZ)V")
    public final void method2848(byte arg0, boolean arg1) {
        field7039++;
        if (this.field7060 == null) {
            return;
        }
        try {
            this.field7058.field7956 = 0;
            this.field7058.method3110(arg1 ? 2 : 3, 59);
            this.field7058.method3113(0, false);
            if (arg0 <= -108) {
                this.field7060.method2155(this.field7058.field7952, -31137, 0, 4);
            }
        } catch (IOException var4) {
            try {
                this.field7060.method2156(-54);
            } catch (Exception var3) {
            }
            this.field7063 = -2;
            this.field7064++;
            this.field7060 = null;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(B)V")
    public static void method2849(byte arg0) {
        field7042 = null;
        if (arg0 < 69) {
            method2847(null, (byte) 47);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "(B)V")
    public final void method2850(byte arg0) {
        if (this.field7060 != null) {
            this.field7060.method2153(-1);
        }
        if (arg0 == -70) {
            field7041++;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IZZIB)Llaa;")
    public final class448 method2851(int arg0, boolean arg1, boolean arg2, int arg3, byte arg4) {
        field7045++;
        long var6 = (long) ((arg3 << 16) + arg0);
        class448 var8 = new class448();
        var8.field6490 = arg4;
        var8.field8641 = arg1;
        if (!arg2) {
            this.method2840(true);
        }
        var8.field4679 = var6;
        if (arg1) {
            if (this.method2845((byte) -11) >= 20) {
                throw new RuntimeException();
            }
            this.field7038.method1134(var8, -1);
        } else if (this.method2839(1) < 20) {
            this.field7053.method1134(var8, -1);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }
}
