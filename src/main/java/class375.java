import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class375 {

    @OriginalMember(owner = "client!ts", name = "k", descriptor = "[B")
    private byte[] field5088;

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "[I")
    private int[] field5080;

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "[I")
    private int[] field5079;

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "Lwq;")
    public static class115 field5083 = new class115(12, 6);

    @OriginalMember(owner = "client!ts", name = "j", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(III[BB[B)I")
    public final int method2213(int arg0, int arg1, int arg2, byte[] arg3, byte arg4, byte[] arg5) {
        field5081++;
        int var7 = 0;
        int var8 = arg1 + arg2;
        int var9 = arg0 << 3;
        if (arg4 <= 81) {
            this.field5079 = null;
        }
        while (var8 > arg2) {
            int var10 = arg5[arg2] & 0xFF;
            int var11 = this.field5080[var10];
            byte var12 = this.field5088[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = var13 + (var12 + var14 - 1 >> 3);
            int var17 = var14 + 24;
            arg3[var13] = (byte) (var7 = class219.method1381(var15, var11 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg3[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg3[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg3[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg3[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var9 += var12;
            arg2++;
        }
        return (var9 + 7 >> 3) - arg0;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I[BIII[B)I")
    private final int method2214(int arg0, byte[] arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        if (arg0 != 32) {
            method2217(-16);
        }
        field5082++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg3 + arg4;
        int var8 = 0;
        int var9 = arg2;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 < 0) {
                var8 = this.field5079[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field5079[var8]) < 0) {
                arg1[arg4++] = (byte) (~var11);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field5079[var8];
            }
            int var12;
            if ((var12 = this.field5079[var8]) < 0) {
                arg1[arg4++] = (byte) (~var12);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field5079[var8];
            }
            int var13;
            if ((var13 = this.field5079[var8]) < 0) {
                arg1[arg4++] = (byte) (~var13);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field5079[var8];
            }
            int var14;
            if ((var14 = this.field5079[var8]) < 0) {
                arg1[arg4++] = (byte) (~var14);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field5079[var8];
            }
            int var15;
            if ((var15 = this.field5079[var8]) < 0) {
                arg1[arg4++] = (byte) (~var15);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field5079[var8];
            }
            int var16;
            if ((var16 = this.field5079[var8]) < 0) {
                arg1[arg4++] = (byte) (~var16);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field5079[var8];
            }
            int var17;
            if ((var17 = this.field5079[var8]) < 0) {
                arg1[arg4++] = (byte) (~var17);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field5079[var8];
            }
            int var18;
            if ((var18 = this.field5079[var8]) < 0) {
                arg1[arg4++] = (byte) (~var18);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg2;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILug;I)Ljava/lang/String;")
    public static final String method2215(int arg0, class396 arg1, int arg2) {
        field5078++;
        try {
            int var3 = arg1.method2443(117);
            if (arg2 < var3) {
                var3 = arg2;
            }
            byte[] var4 = new byte[var3];
            arg1.field5729 += class319.field4258.method2214(32, var4, arg1.field5729, var3, 0, arg1.field5761);
            if (arg0 != 229068417) {
                method2216(9, null);
            }
            return class527.method3129(var3, arg0 ^ 0xF258B1DE, 0, var4);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method2216(int arg0, String arg1) {
        field5084++;
        int var2 = arg1.length();
        long var3 = 0L;
        int var5 = 0;
        if (arg0 >= -2) {
            method2217(-101);
        }
        while (var2 > var5) {
            var3 = (var3 << 5) + (long) arg1.charAt(var5) - var3;
            var5++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
    public static void method2217(int arg0) {
        field5083 = null;
        if (arg0 > -61) {
            method2215(3, null, -5);
        }
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "([B)V")
    public class375(byte[] arg0) {
        int var2 = arg0.length;
        this.field5088 = arg0;
        this.field5080 = new int[var2];
        this.field5079 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field5080[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class219.method1381(var11, var12);
                    }
                    var9 = var8 | var7;
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field5079[var14] == 0) {
                            this.field5079[var14] = var4;
                        }
                        var14 = this.field5079[var14];
                    }
                    if (this.field5079.length <= var14) {
                        int[] var17 = new int[this.field5079.length * 2];
                        for (int var18 = 0; var18 < this.field5079.length; var18++) {
                            var17[var18] = this.field5079[var18];
                        }
                        this.field5079 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field5079[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    static {
        new class305("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field5087 = 0;
    }
}
