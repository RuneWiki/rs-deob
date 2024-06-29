import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class58 {

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    private int field1040 = -32768;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    private int field1025 = -1;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "Z")
    private boolean field1045 = false;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "Z")
    private boolean field1027 = false;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    private int field1028 = -1;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "B")
    private byte field1041;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "B")
    private byte field1026;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public int field1016;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    private int field1017;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public int field1031;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "I")
    private int field1053;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    public int field1038;

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "Z")
    private boolean field1050;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "Ldv;")
    public static class566 field1035 = new class566(60, 4);

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "F")
    public static float field1048 = 0.25F;

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "Lej;")
    public static class104 field1051 = new class104("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "Z")
    public static boolean field1054 = false;

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "Lcba;")
    public static class471 field1055 = new class471(33, 0);

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "[I")
    public static int[] field1056 = new int[32];

    @OriginalMember(owner = "client!wc", name = "Q", descriptor = "[I")
    public static int[] field1058 = new int[8];

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    private int field1018;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    private int field1029;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    private int field1032;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
    private int field1043;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "Lr;")
    private class157 field1033;

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "Ln;")
    public static class17 field1057;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "Ljw;")
    public class475 field1034;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "Lk;")
    private class485 field1023;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "Ldba;")
    private class78 field1019;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "[Z")
    private boolean[] field1024;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILr;Lqa;IZIB)V")
    public final void method517(int arg0, int arg1, class157 arg2, class207 arg3, int arg4, boolean arg5, int arg6, byte arg7) {
        field1052++;
        if (arg7 >= -9) {
            this.field1053 = -44;
        }
        class203[] var9 = arg2.method161();
        class225[] var10 = arg2.method131();
        if ((this.field1034 == null || this.field1034.field6686) && (var9 != null || var10 != null)) {
            class364 var11 = class18.field227.method1201((byte) -85, this.field1031);
            if (var11.field4904 != null) {
                var11 = var11.method2183(true, class189.field2681);
            }
            if (var11 != null) {
                this.field1034 = class475.method2757(class405.field5763);
            }
        }
        if (this.field1034 == null) {
            return;
        }
        if (arg5) {
            this.field1034.method2767(arg3, (long) class405.field5763, var9, var10, false);
        } else {
            this.field1034.method2761((long) class405.field5763);
        }
        this.field1034.method2759(this.field1026, arg0, arg6, arg4, arg1);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lqa;I)V")
    public final void method518(class207 arg0, int arg1) {
        if (arg1 != 8821) {
            field1051 = null;
        }
        field1020++;
        if (this.field1023 != null) {
            class294.method1888(this.field1023, this.field1041, this.field1053, this.field1017, this.field1024);
            this.field1024 = null;
            this.field1023 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    public static void method519(byte arg0) {
        field1035 = null;
        int var1 = -127 % (arg0 / 61);
        field1055 = null;
        field1058 = null;
        field1057 = null;
        field1051 = null;
        field1056 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([BB)[B")
    public static final byte[] method520(byte[] arg0, byte arg1) {
        int var2 = -47 % ((arg1 - 3) / 60);
        field1021++;
        if (arg0 == null) {
            return null;
        } else {
            byte[] var3 = new byte[arg0.length];
            class416.method2498(arg0, 0, var3, 0, arg0.length);
            return var3;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V")
    private final void method521(int arg0, int arg1) {
        field1039++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class364 var5 = class18.field227.method1201((byte) -116, this.field1031);
            class364 var6 = var5;
            if (var5.field4904 != null) {
                var5 = var5.method2183(true, class189.field2681);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field4932 != null) {
                if (this.field1019 != null && var5.method2189(false, this.field1019.field1281)) {
                    return;
                }
                var3 = var5.method2184(90);
                if (this.field1025 != var5.field4944) {
                    var4 = var5.field4918;
                }
            } else if (var5.field4901 == -1) {
                if (var6 != null && var6.field4932 != null) {
                    if (this.field1019 != null && var6.method2189(false, this.field1019.field1281)) {
                        return;
                    }
                    var3 = var6.method2184(114);
                    if (this.field1025 != var6.field4944) {
                        var4 = var6.field4918;
                    }
                } else if (var6 != null && var6.field4901 != -1 && this.field1025 != var6.field4944) {
                    var4 = var6.field4918;
                    var3 = var6.field4901;
                }
            } else if (this.field1025 != var5.field4944) {
                var4 = var5.field4918;
                var3 = var5.field4901;
            }
        }
        if (var3 == -1) {
            this.field1019 = null;
            return;
        }
        this.field1033 = null;
        if (this.field1019 == null || this.field1019.field1281 != var3) {
            this.field1019 = class331.field4418.method195(var3, (byte) 13);
        } else if (this.field1019.field1282 == 0) {
            return;
        }
        if (this.field1019.field1261 == null) {
            this.field1019 = null;
            return;
        }
        if (var4) {
            this.field1018 = (int) (Math.random() * (double) this.field1019.field1261.length);
            this.field1029 = (int) ((double) this.field1019.field1260[this.field1018] * Math.random()) + 1;
        } else {
            this.field1029 = 1;
            this.field1018 = 0;
        }
        this.field1043 = this.field1018 + 1;
        if (arg1 > this.field1043 || this.field1043 >= this.field1019.field1261.length) {
            this.field1043 = -1;
        }
        this.field1032 = class405.field5763 - this.field1029;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)V")
    public final void method522(int arg0, int arg1) {
        field1022++;
        this.field1027 = true;
        if (arg0 > 18) {
            this.method521(arg1, 0);
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)I")
    public final int method523(byte arg0) {
        if (arg0 <= 43) {
            field1058 = null;
        }
        field1030++;
        return this.field1040;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)Z")
    public static final boolean method524(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method520(null, (byte) -84);
        }
        field1046++;
        return class16.method181(arg1, arg0, 16) & class452.method2654(arg1, arg0, 74);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(III)V")
    private final void method525(int arg0, int arg1, int arg2) {
        field1042++;
        if (arg0 != -10314) {
            field1051 = null;
        }
        label90: while (true) {
            if (this.field1019 == null) {
                if (this.field1027) {
                    return;
                }
                this.method521(-1, 0);
                if (this.field1019 == null) {
                    return;
                }
            }
            int var4 = class405.field5763 - this.field1032;
            if (var4 > 100 && this.field1019.field1270 > 0) {
                int var5 = this.field1019.field1261.length - this.field1019.field1270;
                while (var5 > this.field1018 && this.field1019.field1260[this.field1018] < var4) {
                    var4 -= this.field1019.field1260[this.field1018];
                    this.field1018++;
                }
                if (var5 <= this.field1018) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field1019.field1261.length; var7++) {
                        var6 += this.field1019.field1260[var7];
                    }
                    var4 %= var6;
                }
                this.field1043 = this.field1018 + 1;
                if (this.field1043 >= this.field1019.field1261.length) {
                    this.field1043 -= this.field1019.field1270;
                    if (this.field1043 < 0 || this.field1043 >= this.field1019.field1261.length) {
                        this.field1043 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field1019.field1260[this.field1018] >= var4) {
                            this.field1032 = class405.field5763 - var4;
                            this.field1029 = var4;
                            return;
                        }
                        class170.method1085(arg1, this.field1026, false, (byte) 109, this.field1018, this.field1019, arg2);
                        var4 -= this.field1019.field1260[this.field1018];
                        this.field1018++;
                        if (this.field1018 >= this.field1019.field1261.length) {
                            this.field1018 -= this.field1019.field1270;
                            if (this.field1018 < 0 || this.field1018 >= this.field1019.field1261.length) {
                                this.field1019 = null;
                                continue label90;
                            }
                        }
                        this.field1043 = this.field1018 + 1;
                    } while (this.field1019.field1261.length > this.field1043);
                    this.field1043 -= this.field1019.field1270;
                } while (this.field1043 >= 0 && this.field1043 < this.field1019.field1261.length);
                this.field1043 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field1034 != null) {
            this.field1034.method2762();
        }
        field1047++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIZLqa;IIZ)Lr;")
    public final class157 method526(int arg0, int arg1, boolean arg2, class207 arg3, int arg4, int arg5, boolean arg6) {
        field1049++;
        class364 var8 = class18.field227.method1201((byte) -105, this.field1031);
        if (var8.field4904 != null) {
            var8 = var8.method2183(true, class189.field2681);
        }
        if (var8 == null) {
            this.method518(arg3, 8821);
            this.field1028 = this.field1018;
            this.field1025 = -1;
            return null;
        }
        if (!this.field1027 && this.field1025 != var8.field4944) {
            this.field1033 = null;
            this.method521(-1, 0);
        }
        this.method525(-10314, arg4, arg0);
        boolean var9 = arg2 & this.field1050 & class491.field6875.method1507(class103.field1570, (byte) 43) != 0;
        boolean var10 = var9 & (this.field1025 != var8.field4944 || (this.field1028 != this.field1018 || this.field1019 != null && (this.field1019.field1283 || class536.field7500) && this.field1043 != this.field1018) && class491.field6875.method1507(class103.field1570, (byte) 31) >= 2);
        if (arg5 != 0) {
            method519((byte) -109);
        }
        if (arg6 && !var10) {
            this.field1025 = var8.field4944;
            this.field1028 = this.field1018;
            return null;
        }
        if (var10) {
            class294.method1888(this.field1023, this.field1041, this.field1053, this.field1017, this.field1024);
        }
        class174 var11 = class590.field8430[this.field1041];
        class174 var12;
        if (this.field1045) {
            var12 = class608.field8767[0];
        } else {
            var12 = this.field1041 < 3 ? class590.field8430[this.field1041 + 1] : null;
        }
        class157 var13 = null;
        if (this.field1019 != null) {
            if (var10) {
                arg1 |= 0x40000;
            }
            var13 = var8.method2180(this.field1029, this.field1053, -99, var11, this.field1016 == 11 ? 10 : this.field1016, arg1, this.field1017, this.field1043, arg3, var11.method1105(this.field1053, this.field1017), this.field1016 == 11 ? this.field1038 + 4 : this.field1038, this.field1018, this.field1019, var12);
            if (var13 == null) {
                this.field1023 = null;
                this.field1040 = 0;
                this.field1024 = null;
            } else {
                if (var10) {
                    if (this.field1024 == null) {
                        this.field1024 = new boolean[4];
                    }
                    this.field1023 = var13.method149(this.field1023);
                    class104.method734(this.field1023, this.field1041, arg0, arg4, this.field1024);
                }
                this.field1040 = var13.method133();
            }
            this.field1033 = null;
        } else if (this.field1033 != null && arg1 == (this.field1033.method166() & arg1) && this.field1025 == var8.field4944) {
            var13 = this.field1033;
        } else {
            if (this.field1033 != null) {
                arg1 |= this.field1033.method166();
            }
            class105 var14 = var8.method2176(this.field1016 == 11 ? 10 : this.field1016, arg3, this.field1053, var11, this.field1016 == 11 ? this.field1038 + 4 : this.field1038, var10, this.field1017, var12, -333, var11.method1105(this.field1053, this.field1017), arg1);
            if (var14 == null) {
                this.field1040 = 0;
                this.field1033 = null;
                this.field1023 = null;
                this.field1024 = null;
            } else {
                var13 = var14.field1580;
                this.field1033 = var14.field1580;
                if (var10) {
                    this.field1024 = null;
                    this.field1023 = var14.field1585;
                    class104.method734(this.field1023, this.field1041, arg0, arg4, null);
                }
                this.field1040 = var13.method133();
            }
        }
        this.field1053 = arg0;
        this.field1025 = var8.field4944;
        this.field1028 = this.field1018;
        this.field1017 = arg4;
        return var13;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(B)Z")
    public final boolean method527(byte arg0) {
        field1037++;
        return arg0 > -76 ? true : this.field1050;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZLqa;)V")
    public final void method528(boolean arg0, class207 arg1) {
        this.method526(this.field1053, 262144, arg0, arg1, this.field1017, 0, true);
        field1044++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/lang/String;IZLan;)Lji;")
    public static final class525 method529(String arg0, int arg1, boolean arg2, class21 arg3) {
        field1036++;
        int var4 = arg3.method252((byte) 69, arg0);
        if (var4 == -1) {
            return new class525(0);
        }
        int[] var5 = arg3.method219((byte) 72, var4);
        class525 var6 = new class525(var5.length);
        if (arg1 <= 73) {
            return null;
        }
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field7382) {
                class11 var9 = new class11(arg3.method240(var4, var5[var8++], (byte) -124));
                int var10 = var9.method119(-113);
                int var11 = var9.method93((byte) 98);
                int var12 = var9.method110((byte) 100);
                if (!arg2 && var12 == 1) {
                    var6.field7382--;
                } else {
                    var6.field7378[var7] = var10;
                    var6.field7380[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lqa;Lss;IIIIIIZI)V")
    public class58(class207 arg0, class364 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field1041 = (byte) arg5;
        this.field1026 = (byte) arg4;
        this.field1045 = arg8;
        this.field1016 = arg2;
        this.field1017 = arg7;
        this.field1031 = arg1.field4944;
        this.field1053 = arg6;
        this.field1038 = arg3;
        this.field1050 = arg0.method1345() && arg1.field4913 && !this.field1045;
        if (arg9 != -1) {
            this.field1027 = true;
        }
        this.method521(arg9, 0);
    }
}
