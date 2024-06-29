import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class50 {

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    private int field950 = 65000;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "Lwb;")
    private class155 field952 = null;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "Lwb;")
    private class155 field954 = null;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    private int field965;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field953 = 0;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field961 = 0;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field957 = 0;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field960 = 1;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "Lje;")
    public static class67 field962 = class85.method592(255, "Lade Eingabe)2Steuerungsprogramm)3)3)3");

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "Lje;")
    private static class67 field966 = class85.method592(255, " from your friend list first");

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "Lje;")
    public static class67 field955 = field966;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "Lje;")
    public static class67 field964 = class85.method592(255, "<col=ffffff>");

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    public static int field968 = 2301979;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public static final void method319(byte arg0) {
        field956++;
        int var1 = class9.field196.method283(arg0 ^ 0x20, 8);
        if (class155.field3540 > var1) {
            for (int var2 = var1; var2 < class155.field3540; var2++) {
                class127.field2790[class137.field3099++] = class151.field3464[var2];
            }
        }
        if (class155.field3540 < var1) {
            throw new RuntimeException("gppov1");
        }
        class155.field3540 = 0;
        int var3 = 0;
        if (arg0 != 40) {
            field962 = null;
        }
        while (var1 > var3) {
            int var4 = class151.field3464[var3];
            class83 var5 = class85.field1885[var4];
            int var6 = class9.field196.method283(8, 1);
            if (var6 == 0) {
                class151.field3464[class155.field3540++] = var4;
                var5.field2979 = class34.field627;
            } else {
                int var7 = class9.field196.method283(8, 2);
                if (var7 == 0) {
                    class151.field3464[class155.field3540++] = var4;
                    var5.field2979 = class34.field627;
                    class89.field1961[class71.field1442++] = var4;
                } else if (var7 == 1) {
                    class151.field3464[class155.field3540++] = var4;
                    var5.field2979 = class34.field627;
                    int var8 = class9.field196.method283(8, 3);
                    var5.method1010(false, (byte) 65, var8);
                    int var9 = class9.field196.method283(arg0 ^ 0x20, 1);
                    if (var9 == 1) {
                        class89.field1961[class71.field1442++] = var4;
                    }
                } else if (var7 == 2) {
                    class151.field3464[class155.field3540++] = var4;
                    var5.field2979 = class34.field627;
                    int var10 = class9.field196.method283(arg0 ^ 0x20, 3);
                    var5.method1010(true, (byte) 119, var10);
                    int var11 = class9.field196.method283(8, 3);
                    var5.method1010(true, (byte) 76, var11);
                    int var12 = class9.field196.method283(8, 1);
                    if (var12 == 1) {
                        class89.field1961[class71.field1442++] = var4;
                    }
                } else if (var7 == 3) {
                    class127.field2790[class137.field3099++] = var4;
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IB)V")
    public static final void method320(int arg0, byte arg1) {
        class38.field678 += arg0 * 128;
        if (class38.field678 > class138.field3121.length) {
            class38.field678 -= class138.field3121.length;
            int var2 = (int) (Math.random() * 12.0D);
            class86.method605(class85.field1893[var2], -98);
        }
        short var3 = 256;
        field948++;
        int var4 = arg0 * 128;
        if (arg1 <= 44) {
            return;
        }
        int var5 = 0;
        int var6 = (var3 - arg0) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var27 = class118.field2667[var4 + var5] - class138.field3121[var5 + class38.field678 & class138.field3121.length + -1] * arg0 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class118.field2667[var5++] = var27;
        }
        for (int var8 = var3 - arg0; var8 < var3; var8++) {
            int var24 = var8 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class118.field2667[var24 + var25] = 255;
                } else {
                    class118.field2667[var24 + var25] = 0;
                }
            }
        }
        if (class86.field1902 > 0) {
            class86.field1902 -= arg0 * 4;
        }
        if (class56.field1123 > 0) {
            class56.field1123 -= arg0 * 4;
        }
        if (class56.field1123 == 0 && class86.field1902 == 0) {
            int var9 = (int) ((double) (2000 / arg0) * Math.random());
            if (var9 == 1) {
                class86.field1902 = 1024;
            }
            if (var9 == 0) {
                class56.field1123 = 1024;
            }
        }
        for (int var10 = 0; var10 < var3 - arg0; var10++) {
            class151.field3463[var10] = class151.field3463[arg0 + var10];
        }
        for (int var11 = var3 - arg0; var11 < var3; var11++) {
            class151.field3463[var11] = (int) (Math.sin((double) class88.field1945 / 14.0D) * 16.0D + Math.sin((double) class88.field1945 / 15.0D) * 14.0D + Math.sin((double) class88.field1945 / 16.0D) * 12.0D);
            class88.field1945++;
        }
        int var12 = ((class34.field627 & 0x1) + arg0) / 2;
        class138.field3109 += arg0;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class138.field3109 * 100; var13++) {
            int var22 = (int) (Math.random() * 124.0D) + 2;
            int var23 = (int) (Math.random() * 128.0D) + 128;
            class118.field2667[(var23 << 7) + var22] = 192;
        }
        class138.field3109 = 0;
        for (int var14 = 0; var14 < var3; var14++) {
            int var19 = 0;
            int var20 = var14 * 128;
            for (int var21 = -var12; var21 < 128; var21++) {
                if (var12 + var21 < 128) {
                    var19 += class118.field2667[var21 + var20 + var12];
                }
                if (var21 - var12 - 1 >= 0) {
                    var19 -= class118.field2667[var21 + var20 - var12 - 1];
                }
                if (var21 >= 0) {
                    class150.field3441[var20 + var21] = var19 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var3; var17++) {
                int var18 = var17 * 128;
                if (var12 + var17 < var3) {
                    var16 += class150.field3441[var15 + var18 + var12 * 128];
                }
                if (var17 - var12 - 1 >= 0) {
                    var16 -= class150.field3441[var15 + var18 - var12 * 128 - 128];
                }
                if (var17 >= 0) {
                    class118.field2667[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZZI[BI)Z")
    private final boolean method321(boolean arg0, boolean arg1, int arg2, byte[] arg3, int arg4) {
        field969++;
        class155 var6 = this.field952;
        synchronized (this.field952) {
            try {
                int var7;
                if (arg1) {
                    if (this.field954.method1172(29922) < (long) (arg2 * 6 + 6)) {
                        return false;
                    }
                    this.field954.method1174(false, (long) (arg2 * 6));
                    this.field954.method1180(0, 6, class6.field140, 28965);
                    var7 = (class6.field140[5] & 0xFF) + ((class6.field140[3] & 0xFF) << 16) + ((class6.field140[4] & 0xFF) << 8);
                    if (var7 <= 0 || this.field952.method1172(29922) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field952.method1172(29922) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                int var10 = 0;
                class6.field140[3] = (byte) (var7 >> 16);
                class6.field140[1] = (byte) (arg4 >> 8);
                class6.field140[2] = (byte) arg4;
                class6.field140[4] = (byte) (var7 >> 8);
                class6.field140[0] = (byte) (arg4 >> 16);
                class6.field140[5] = (byte) var7;
                this.field954.method1174(false, (long) (arg2 * 6));
                int var11 = 0;
                this.field954.method1173(6, -1, 0, class6.field140);
                if (!arg0) {
                    method320(11, (byte) 123);
                }
                while (var10 < arg4) {
                    int var12 = 0;
                    if (arg1) {
                        label107: {
                            this.field952.method1174(false, (long) (var7 * 520));
                            try {
                                this.field952.method1180(0, 8, class6.field140, 28965);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = (class6.field140[6] & 0xFF) + (((class6.field140[4] & 0xFF) << 16) + ((class6.field140[5] & 0xFF) << 8));
                            int var13 = ((class6.field140[0] & 0xFF) << 8) + (class6.field140[1] & 0xFF);
                            int var14 = class6.field140[7] & 0xFF;
                            int var15 = ((class6.field140[2] & 0xFF) << 8) + (class6.field140[3] & 0xFF);
                            if (arg2 == var13 && var11 == var15 && this.field965 == var14) {
                                if (var12 >= 0 && (long) var12 <= this.field952.method1172(29922) / 520L) {
                                    break label107;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field952.method1172(29922) + 519L) / 520L);
                        arg1 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class6.field140[7] = (byte) this.field965;
                    class6.field140[3] = (byte) var11;
                    int var18 = arg4 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    if (arg4 - var10 <= 512) {
                        var12 = 0;
                    }
                    class6.field140[1] = (byte) arg2;
                    class6.field140[6] = (byte) var12;
                    class6.field140[2] = (byte) (var11 >> 8);
                    class6.field140[0] = (byte) (arg2 >> 8);
                    var11++;
                    class6.field140[5] = (byte) (var12 >> 8);
                    class6.field140[4] = (byte) (var12 >> 16);
                    this.field952.method1174(false, (long) (var7 * 520));
                    var7 = var12;
                    this.field952.method1173(8, -1, 0, class6.field140);
                    this.field952.method1173(var18, -1, var10, arg3);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public static void method322(boolean arg0) {
        field966 = null;
        field964 = null;
        field955 = null;
        if (!arg0) {
            method320(37, (byte) 13);
        }
        field962 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lfd;I)V")
    public static final void method323(class40 arg0, int arg1) {
        field970++;
        if (arg1 != 256) {
            method322(true);
        }
        class104.field2380 = arg0;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BI[BI)Z")
    public final boolean method324(byte arg0, int arg1, byte[] arg2, int arg3) {
        field967++;
        int var5 = 54 / ((arg0 + 23) / 54);
        class155 var6 = this.field952;
        synchronized (this.field952) {
            if (arg1 < 0 || this.field950 < arg1) {
                throw new IllegalArgumentException();
            }
            boolean var7 = this.method321(true, true, arg3, arg2, arg1);
            if (!var7) {
                var7 = this.method321(true, false, arg3, arg2, arg1);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!ha", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field951++;
        return "Cache:" + this.field965;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)[B")
    public final byte[] method325(int arg0, int arg1) {
        field949++;
        class155 var3 = this.field952;
        synchronized (this.field952) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field954.method1172(29922)) {
                    return null;
                }
                this.field954.method1174(false, (long) (arg0 * 6));
                this.field954.method1180(0, 6, class6.field140, 28965);
                int var5 = ((class6.field140[3] & 0xFF) << 16) - (-((class6.field140[4] & 0xFF) << 8) - (class6.field140[5] & 0xFF));
                int var6 = ((class6.field140[0] & 0xFF) << 16) + (((class6.field140[1] & 0xFF) << 8) + (class6.field140[2] & 0xFF));
                if (var6 < 0 || this.field950 < var6) {
                    return null;
                } else if (var5 > 0 && (long) var5 <= this.field952.method1172(29922) / 520L) {
                    byte[] var9 = new byte[var6];
                    if (arg1 != 5371) {
                        return null;
                    }
                    int var11 = 0;
                    int var12 = 0;
                    while (var6 > var12) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field952.method1174(false, (long) (var5 * 520));
                        int var14 = var6 - var12;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field952.method1180(0, var14 + 8, class6.field140, arg1 + 23594);
                        int var15 = ((class6.field140[0] & 0xFF) << 8) + (class6.field140[1] & 0xFF);
                        int var16 = class6.field140[7] & 0xFF;
                        int var17 = ((class6.field140[2] & 0xFF) << 8) + (class6.field140[3] & 0xFF);
                        int var18 = ((class6.field140[4] & 0xFF) << 16) - (-(class6.field140[5] << 8 & 0xFF00) - (class6.field140[6] & 0xFF));
                        if (arg0 == var15 && var11 == var17 && this.field965 == var16) {
                            if (var18 >= 0 && this.field952.method1172(29922) / 520L >= (long) var18) {
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var9[var12++] = class6.field140[var21 + 8];
                                }
                                var11++;
                                var5 = var18;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZIII)I")
    public static final int method326(boolean arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field958++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else if (arg0) {
            return 7 - arg1;
        } else {
            return -114;
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(ILwb;Lwb;I)V")
    public class50(int arg0, class155 arg1, class155 arg2, int arg3) {
        this.field965 = arg0;
        this.field950 = arg3;
        this.field954 = arg2;
        this.field952 = arg1;
    }
}
