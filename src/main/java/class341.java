import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class341 {

    @OriginalMember(owner = "client!db", name = "b", descriptor = "[J")
    private long[] field5562 = new long[8];

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    private int field5563 = 0;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "[J")
    private long[] field5570 = new long[8];

    @OriginalMember(owner = "client!db", name = "l", descriptor = "[J")
    private long[] field5569 = new long[8];

    @OriginalMember(owner = "client!db", name = "f", descriptor = "[B")
    private byte[] field5566 = new byte[64];

    @OriginalMember(owner = "client!db", name = "g", descriptor = "[B")
    private byte[] field5576 = new byte[32];

    @OriginalMember(owner = "client!db", name = "o", descriptor = "[J")
    private long[] field5565 = new long[8];

    @OriginalMember(owner = "client!db", name = "j", descriptor = "[J")
    private long[] field5574 = new long[8];

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    private int field5578 = 0;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5579 = new String[] { method2875(method2874("\u0015x\nJ>")), method2875(method2874("\u0015x\nK>")), method2875(method2874("\u0015x\nH>")), method2875(method2874("\n4\n k")), method2875(method2874("\u0015x\nM>")), method2875(method2874("\u001foHb")), method2875(method2874("=UcGUQ_v\\Y#")), method2875(method2874("\u0015x\nO>")), method2875(method2874("\u0015x\nL>")), method2875(method2874("\u0015x\nI>")) };

    @OriginalMember(owner = "client!db", name = "r", descriptor = "Z")
    public static boolean field5572 = false;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "Lgj;")
    public static class663 field5575;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B[BJ)V")
    public final void method2867(byte arg0, byte[] arg1, long arg2) {
        try {
            field5561++;
            int var5 = 0;
            int var6 = 8 - ((int) arg2 & 0x7) & 0x7;
            int var7 = this.field5578 & 0x7;
            long var8 = arg2;
            int var10 = 31;
            int var11 = 0;
            if (arg0 <= 17) {
                this.field5570 = null;
            }
            while (var10 >= 0) {
                int var12 = (this.field5576[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
                this.field5576[var10] = (byte) var12;
                var8 >>>= 0x8;
                var11 = var12 >>> 8;
                var10--;
            }
            while (arg2 > 8L) {
                int var13 = arg1[var5] << var6 & 0xFF | (arg1[var5 + 1] & 0xFF) >>> 8 - var6;
                if (var13 < 0 || var13 >= 256) {
                    throw new RuntimeException(field5579[6]);
                }
                this.field5566[this.field5563] = (byte) class553.method4099(this.field5566[this.field5563], var13 >>> var7);
                this.field5563++;
                this.field5578 += 8 - var7;
                if (this.field5578 == 512) {
                    this.method2872((byte) 48);
                    this.field5578 = this.field5563 = 0;
                }
                this.field5566[this.field5563] = (byte) class292.method2485(var13 << 8 - var7, 255);
                arg2 -= 8L;
                this.field5578 += var7;
                var5++;
            }
            int var14;
            if (arg2 <= 0L) {
                var14 = 0;
            } else {
                var14 = arg1[var5] << var6 & 0xFF;
                this.field5566[this.field5563] = (byte) class553.method4099(this.field5566[this.field5563], var14 >>> var7);
            }
            if ((long) var7 + arg2 < 8L) {
                this.field5578 = (int) ((long) this.field5578 + arg2);
            } else {
                arg2 -= (8 - var7);
                this.field5563++;
                this.field5578 += 8 - var7;
                if (this.field5578 == 512) {
                    this.method2872((byte) 48);
                    this.field5578 = this.field5563 = 0;
                }
                this.field5566[this.field5563] = (byte) class292.method2485(255, var14 << 8 - var7);
                this.field5578 += (int) arg2;
            }
        } catch (RuntimeException var16) {
            throw class590.method4333(var16, field5579[7] + arg0 + ',' + (arg1 == null ? field5579[5] : field5579[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([BII)V")
    public final void method2868(byte[] arg0, int arg1, int arg2) {
        try {
            field5571++;
            this.field5566[this.field5563] = (byte) class553.method4099(this.field5566[this.field5563], 0x80 >>> class292.method2485(this.field5578, 7));
            this.field5563++;
            if (this.field5563 > 32) {
                while (true) {
                    if (this.field5563 >= 64) {
                        this.method2872((byte) 48);
                        this.field5563 = 0;
                        break;
                    }
                    this.field5566[this.field5563++] = 0;
                }
            }
            while (this.field5563 < 32) {
                this.field5566[this.field5563++] = 0;
            }
            class405.method3259(this.field5576, 0, this.field5566, 32, 32);
            this.method2872((byte) 48);
            int var4 = 0;
            int var5 = arg1;
            while (var4 < 8) {
                long var6 = this.field5570[var4];
                arg0[var5] = (byte) ((int) (var6 >>> 56));
                arg0[var5 + 1] = (byte) ((int) (var6 >>> 48));
                arg0[var5 + 2] = (byte) ((int) (var6 >>> 40));
                arg0[var5 + 3] = (byte) ((int) (var6 >>> 32));
                arg0[var5 + 4] = (byte) ((int) (var6 >>> 24));
                arg0[var5 + 5] = (byte) ((int) (var6 >>> 16));
                arg0[var5 + 6] = (byte) ((int) (var6 >>> 8));
                arg0[var5 + 7] = (byte) ((int) var6);
                var4++;
                var5 += 8;
            }
            if (arg2 != 1376312589) {
                this.field5574 = null;
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field5579[4] + (arg0 == null ? field5579[5] : field5579[3]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public final void method2869(int arg0) {
        try {
            field5567++;
            if (arg0 > 94) {
                for (int var2 = 0; var2 < 32; var2++) {
                    this.field5576[var2] = 0;
                }
                this.field5578 = this.field5563 = 0;
                this.field5566[0] = 0;
                for (int var3 = 0; var3 < 8; var3++) {
                    this.field5570[var3] = 0L;
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5579[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2870(int arg0, boolean arg1) {
        try {
            field5577++;
            if (arg1) {
                return false;
            } else {
                return arg0 == 3 || arg0 == 5 || arg0 == 6;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5579[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)I")
    public static final int method2871(int arg0, int arg1, int arg2) {
        try {
            field5564++;
            int var3 = arg2 * 57 + arg0;
            int var4 = var3 ^ var3 << 13;
            int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
            if (arg1 != -1740228621) {
                field5575 = null;
            }
            return (var5 & 0x7FD01B5) >> 19;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field5579[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
    private final void method2872(byte arg0) {
        try {
            if (arg0 == 48) {
                int var2 = 0;
                int var3 = 0;
                while (var2 < 8) {
                    this.field5569[var2] = class423.method3362(class488.method3706((long) this.field5566[var3 + 7], 255L), class423.method3362(class423.method3362(class488.method3706(255L, (long) this.field5566[var3 + 5]) << 16, class423.method3362(class488.method3706((long) this.field5566[var3 + 4], 255L) << 24, class423.method3362(class488.method3706(255L, (long) this.field5566[var3 + 3]) << 32, class423.method3362(class488.method3706(255L, (long) this.field5566[var3 + 2]) << 40, class423.method3362(class488.method3706((long) this.field5566[var3 + 1], 255L) << 48, (long) this.field5566[var3] << 56))))), class488.method3706(0xFFL << 8, (long) this.field5566[var3 + 6] << 8)));
                    var3 += 8;
                    var2++;
                }
                field5573++;
                for (int var4 = 0; var4 < 8; var4++) {
                    this.field5562[var4] = class423.method3362(this.field5569[var4], this.field5565[var4] = this.field5570[var4]);
                }
                for (int var5 = 1; var5 <= 10; var5++) {
                    for (int var6 = 0; var6 < 8; var6++) {
                        this.field5574[var6] = 0L;
                        int var7 = 0;
                        int var8 = 56;
                        while (var7 < 8) {
                            this.field5574[var6] = class423.method3362(this.field5574[var6], class760.field11177[var7][class292.method2485((int) (this.field5565[class292.method2485(7, var6 - var7)] >>> var8), 255)]);
                            var7++;
                            var8 -= 8;
                        }
                    }
                    for (int var9 = 0; var9 < 8; var9++) {
                        this.field5565[var9] = this.field5574[var9];
                    }
                    this.field5565[0] = class423.method3362(this.field5565[0], class760.field11178[var5]);
                    for (int var10 = 0; var10 < 8; var10++) {
                        this.field5574[var10] = this.field5565[var10];
                        int var11 = 0;
                        int var12 = 56;
                        while (var11 < 8) {
                            this.field5574[var10] = class423.method3362(this.field5574[var10], class760.field11177[var11][class292.method2485((int) (this.field5562[class292.method2485(var10 - var11, 7)] >>> var12), 255)]);
                            var12 -= 8;
                            var11++;
                        }
                    }
                    for (int var13 = 0; var13 < 8; var13++) {
                        this.field5562[var13] = this.field5574[var13];
                    }
                }
                for (int var14 = 0; var14 < 8; var14++) {
                    this.field5570[var14] = class423.method3362(this.field5570[var14], class423.method3362(this.field5569[var14], this.field5562[var14]));
                }
            }
        } catch (RuntimeException var16) {
            throw class590.method4333(var16, field5579[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
    public static void method2873(boolean arg0) {
        try {
            field5575 = null;
            if (arg0) {
                field5572 = true;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5579[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!db", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2874(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x16);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!db", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2875(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 113;
                    break;
                case 1:
                    var10005 = 26;
                    break;
                case 2:
                    var10005 = 36;
                    break;
                case 3:
                    var10005 = 14;
                    break;
                default:
                    var10005 = 22;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
