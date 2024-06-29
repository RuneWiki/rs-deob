import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class165 {

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    private int field2972 = 32;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "J")
    private long field2977 = class217.method1351(86);

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "I")
    private int field2992 = 0;

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "Z")
    private boolean field2991 = true;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "J")
    private long field2993 = 0L;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    private int field2986 = 0;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "J")
    private long field2999 = 0L;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "[Ld;")
    private class34[] field3000 = new class34[8];

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "[Ld;")
    private class34[] field2994 = new class34[8];

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "I")
    private int field2995 = 0;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    private int field2985 = 0;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "Loc;")
    private static class151 field2976 = class137.method873(2, "Invalid username or password)3");

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "Loc;")
    public static class151 field2969 = field2976;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    public int field2987;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
    private int field2990;

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
    public int field3001;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "Ld;")
    private class34 field2982;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "[I")
    public int[] field2983;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "()I")
    public int method38() throws Exception {
        field2967++;
        return this.field3001;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public final synchronized void method1058(int arg0) {
        field2979++;
        if (arg0 != 1024 || this.field2983 == null) {
            return;
        }
        long var2 = class217.method1351(-111);
        try {
            if (this.field2999 != 0L) {
                if (var2 < this.field2999) {
                    return;
                }
                this.method39(this.field3001);
                this.field2999 = 0L;
                this.field2991 = true;
            }
            int var4 = this.method38();
            if (this.field2986 - var4 > this.field2992) {
                this.field2992 = this.field2986 - var4;
            }
            int var5 = this.field2990 + this.field2987;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field3001 < var5 + 256) {
                this.field3001 += 1024;
                var4 = 0;
                if (this.field3001 > 16384) {
                    this.field3001 = 16384;
                }
                this.method35();
                this.method39(this.field3001);
                this.field2991 = true;
                if (var5 + 256 > this.field3001) {
                    var5 = this.field3001 - 256;
                    this.field2990 = var5 - this.field2987;
                }
            }
            while (var5 > var4) {
                var4 += 256;
                this.method1070(this.field2983, 256);
                this.method37();
            }
            if (var2 > this.field2993) {
                if (this.field2991) {
                    this.field2991 = false;
                } else if (this.field2992 == 0 && this.field2995 == 0) {
                    this.method35();
                    this.field2999 = var2 + 2000L;
                    return;
                } else {
                    this.field2990 = Math.min(this.field2995, this.field2992);
                    this.field2995 = this.field2992;
                }
                this.field2992 = 0;
                this.field2993 = var2 + 2000L;
            }
            this.field2986 = var4;
        } catch (Exception var7) {
            this.method35();
            this.field2999 = var2 + 2000L;
        }
        try {
            if (this.field2977 + 500000L < var2) {
                var2 = this.field2977;
            }
            while (this.field2977 + 5000L < var2) {
                this.method1061(256, arg0 ^ 0xFFFFB2F6);
                this.field2977 += 256000 / class204.field3624;
            }
        } catch (Exception var6) {
            this.field2977 = var2;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "()V")
    public void method37() throws Exception {
        field2975++;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "()V")
    public void method41() throws Exception {
        field2968++;
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "()V")
    public void method35() {
        field2978++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I[Ln;I[BIIIIII)V")
    public static final void method1059(int arg0, class138[] arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2980++;
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg9 + var10 > 0 && arg9 + var10 < 103 && arg0 + var16 > 0 && arg0 + var16 < 103) {
                    arg1[arg6].field2512[arg9 + var10][arg0 + var16] = class26.method206(arg1[arg6].field2512[arg9 + var10][arg0 + var16], -16777217);
                }
            }
        }
        int var11 = -92 / ((71 - arg4) / 53);
        class229 var12 = new class229(arg3);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg7 == var13 && var14 >= arg2 && var14 < arg2 + 8 && var15 >= arg5 && var15 < arg5 + 8) {
                        class1.method1(var12, arg9 + class39.method287(arg8, var15 & 0x7, var14 & 0x7, -17905), 100, 0, arg8, arg6, 0, class122.method738(var14 & 0x7, var15 & 0x7, arg8, -89) + arg0);
                    } else {
                        class1.method1(var12, -1, -103, 0, 0, 0, 0, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
    public final synchronized void method1060(boolean arg0) {
        this.field2991 = arg0;
        try {
            this.method41();
        } catch (Exception var2) {
            this.method35();
            this.field2999 = class217.method1351(-90) + 2000L;
        }
        field2988++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V")
    private final void method1061(int arg0, int arg1) {
        this.field2985 -= arg0;
        if (this.field2985 < 0) {
            this.field2985 = 0;
        }
        if (this.field2982 != null) {
            this.field2982.method255(arg0);
        }
        field2971++;
        if (arg1 != -18698) {
            this.method1060(false);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method36(Component arg0) throws Exception {
        field2970++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ld;II)V")
    private final void method1062(class34 arg0, int arg1, int arg2) {
        field2973++;
        int var4 = arg1 >> 5;
        class34 var5 = this.field2994[var4];
        if (var5 == null) {
            this.field3000[var4] = arg0;
        } else {
            var5.field706 = arg0;
        }
        if (arg2 != 2041803557) {
            method1064((byte) 34, -123);
        }
        this.field2994[var4] = arg0;
        arg0.field704 = arg1;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
    public final void method1063(int arg0) {
        field2997++;
        this.field2991 = true;
        if (arg0 != 21835) {
            this.field2972 = 34;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)I")
    public static final int method1064(byte arg0, int arg1) {
        field2974++;
        return arg0 <= 70 ? -119 : arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public static void method1065(byte arg0) {
        int var1 = -37 / ((arg0 + 49) / 47);
        field2976 = null;
        field2969 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIBI)V")
    public static final void method1066(int arg0, int arg1, byte arg2, int arg3) {
        field2996++;
        if (class197.method1234(arg3, 116) && arg2 >= 35) {
            class53.method364(arg0, -1, arg1, class115.field2067[arg3], 0);
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
    public final synchronized void method1067(int arg0) {
        if (class29.field612 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class29.field612.field1225[var3] == this) {
                    class29.field612.field1225[var3] = null;
                }
                if (class29.field612.field1225[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class29.field612.field1233 = true;
                while (class29.field612.field1217) {
                    class156.method1027(0, 50L);
                }
                class29.field612 = null;
            }
        }
        if (arg0 != 0) {
            this.method1067(-3);
        }
        this.method35();
        field2981++;
        this.field2983 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILd;)V")
    public final synchronized void method1068(int arg0, class34 arg1) {
        if (arg0 != 0) {
            this.field2993 = 84L;
        }
        this.field2982 = arg1;
        field2998++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lsd;Lsd;Lsd;BLsd;)V")
    public static final void method1069(class192 arg0, class192 arg1, class192 arg2, byte arg3, class192 arg4) {
        field2984++;
        class156.field2829 = arg1;
        int var5 = -39 % ((8 - arg3) / 32);
        class137.field2495 = arg4;
        class67.field1281 = arg0;
        class93.field1751 = arg2;
        class115.field2067 = new class232[class67.field1281.method1199(2495)][];
        class116.field2089 = new boolean[class67.field1281.method1199(2495)];
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
    public void method39(int arg0) throws Exception {
        field2989++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([II)V")
    private final void method1070(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class149.field2668) {
            var3 = arg1 << 1;
        }
        class145.method922(arg0, 0, var3);
        this.field2985 -= arg1;
        if (this.field2982 != null && this.field2985 <= 0) {
            this.field2985 += class204.field3624 >> 4;
            class32.method238(this.field2982, 0);
            this.method1062(this.field2982, this.field2982.method254(), 2041803557);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class34 var10 = null;
                        class34 var11 = this.field3000[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class207 var12 = var11.field705;
                                if (var12 == null || var12.field3658 <= var8) {
                                    var11.field707 = true;
                                    int var13 = var11.method256();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3658 += var13;
                                    }
                                    if (var4 >= this.field2972) {
                                        break label107;
                                    }
                                    class34 var14 = var11.method250();
                                    if (var14 != null) {
                                        int var15 = var11.field704;
                                        while (var14 != null) {
                                            this.method1062(var14, var15 * var14.method254() >> 8, 2041803557);
                                            var14 = var11.method251();
                                        }
                                    }
                                    class34 var16 = var11.field706;
                                    var11.field706 = null;
                                    if (var10 == null) {
                                        this.field3000[var7] = var16;
                                    } else {
                                        var10.field706 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2994[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field706;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class34 var18 = this.field3000[var17];
                this.field3000[var17] = this.field2994[var17] = null;
                while (var18 != null) {
                    class34 var19 = var18.field706;
                    var18.field706 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2985 < 0) {
            this.field2985 = 0;
        }
        if (this.field2982 != null) {
            this.field2982.method253(arg0, 0, arg1);
        }
        this.field2977 = class217.method1351(36);
    }
}
