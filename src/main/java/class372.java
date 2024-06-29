import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class372 {

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "Lnja;")
    private class456 field4685 = null;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    private int field4684 = 65000;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "Lnja;")
    private class456 field4691 = null;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    private int field4689;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4688 = null;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "Z")
    public static boolean field4675 = false;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "Llc;")
    public static class675 field4687;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "[I")
    public static int[] field4690;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(FIFFI)F", line = 10)
    public static final float method2173(float arg0, int arg1, float arg2, float arg3, int arg4) {
        field4686++;
        if (arg1 != 1) {
            field4678 = -31;
        }
        float[] var5 = class419.field5475[arg4];
        return var5[2] * arg0 + var5[1] * arg2 + var5[0] * arg3;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V", line = 26)
    public static void method2174(byte arg0) {
        field4688 = null;
        field4690 = null;
        int var1 = 84 % ((arg0 - 31) / 54);
        field4687 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI[BIZ)Z", line = 41)
    private final boolean method2175(byte arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        field4673++;
        class456 var6 = this.field4685;
        synchronized (this.field4685) {
            try {
                int var7;
                if (arg4) {
                    if ((long) (arg3 * 6 + 6) > this.field4691.method2770((byte) 113)) {
                        return false;
                    }
                    this.field4691.method2759(68, (long) (arg3 * 6));
                    this.field4691.method2766(class117.field1497, 6, 0, 127);
                    var7 = (class117.field1497[5] & 0xFF) + ((class117.field1497[4] & 0xFF) << 8) + (class117.field1497[3] & 0xFF << 16);
                    if (var7 <= 0 || (this.field4685.method2770((byte) -85) / 520L) < ((long) var7)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field4685.method2770((byte) 94) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                int var10 = -10 % (-arg0 / 54);
                class117.field1497[3] = (byte) (var7 >> 16);
                class117.field1497[4] = (byte) (var7 >> 8);
                class117.field1497[5] = (byte) var7;
                class117.field1497[2] = (byte) arg1;
                class117.field1497[1] = (byte) (arg1 >> 8);
                class117.field1497[0] = (byte) (arg1 >> 16);
                this.field4691.method2759(68, (long) (arg3 * 6));
                this.field4691.method2769(0, 125, 6, class117.field1497);
                int var11 = 0;
                int var12 = 0;
                while (arg1 > var11) {
                    int var13 = 0;
                    if (arg4) {
                        label105: {
                            this.field4685.method2759(71, (long) (var7 * 520));
                            try {
                                this.field4685.method2766(class117.field1497, 8, 0, 127);
                            } catch (EOFException var34) {
                                return true;
                            }
                            int var14 = ((class117.field1497[0] & 0xFF) << 8) + (class117.field1497[1] & 0xFF);
                            int var15 = (class117.field1497[2] & 0xFF << 8) + (class117.field1497[3] & 0xFF);
                            var13 = ((class117.field1497[5] & 0xFF) << 8) + (class117.field1497[4] & 0xFF << 16) + (class117.field1497[6] & 0xFF);
                            int var16 = class117.field1497[7] & 0xFF;
                            if (arg3 == var14 && var12 == var15 && this.field4689 == var16) {
                                if (var13 >= 0 && ((long) var13) <= (this.field4685.method2770((byte) -74) / 520L)) {
                                    break label105;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg4 = false;
                        var13 = (int) ((this.field4685.method2770((byte) -45) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var7 == var13) {
                            var13++;
                        }
                    }
                    if (arg1 - var11 <= 512) {
                        var13 = 0;
                    }
                    class117.field1497[3] = (byte) var12;
                    class117.field1497[0] = (byte) (arg3 >> 8);
                    class117.field1497[1] = (byte) arg3;
                    class117.field1497[2] = (byte) (var12 >> 8);
                    class117.field1497[7] = (byte) this.field4689;
                    class117.field1497[6] = (byte) var13;
                    class117.field1497[4] = (byte) (var13 >> 16);
                    class117.field1497[5] = (byte) (var13 >> 8);
                    this.field4685.method2759(13, (long) (var7 * 520));
                    this.field4685.method2769(0, 88, 8, class117.field1497);
                    int var19 = arg1 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field4685.method2769(var11, 44, var19, arg2);
                    var12++;
                    var11 += var19;
                    var7 = var13;
                }
                return true;
            } catch (IOException var35) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lkg;I)V", line = 159)
    public static final void method2176(class287 arg0, int arg1) {
        field4676++;
        int var2 = arg0.field3375 - class228.field2707;
        int var3 = arg0.field3383 * 512 + (arg0.method1665(arg1 ^ 0x66908308) * 256);
        int var4 = arg0.field3401 * 512 + arg0.method1665(1720746760) * 256;
        arg0.field3457 = arg1;
        arg0.field823 += (var3 - arg0.field823) / var2;
        arg0.field813 += (var4 - arg0.field813) / var2;
        if (arg0.field3418 == 0) {
            arg0.method1675((byte) -8, 8192);
        }
        if (arg0.field3418 == 1) {
            arg0.method1675((byte) -8, 12288);
        }
        if (arg0.field3418 == 2) {
            arg0.method1675((byte) -8, 0);
        }
        if (arg0.field3418 == 3) {
            arg0.method1675((byte) -8, 4096);
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(ILnja;Lnja;I)V", line = 373)
    public class372(int arg0, class456 arg1, class456 arg2, int arg3) {
        this.field4684 = arg3;
        this.field4689 = arg0;
        this.field4691 = arg2;
        this.field4685 = arg1;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V", line = 197)
    public static final void method2177(byte arg0) {
        field4679++;
        if (class699.field9510 != null) {
            class699.field9510.method559((byte) 1);
            class699.field9510 = null;
            class498.field6969 = null;
        }
        if (arg0 != -55) {
            method2173(-0.6014553F, -120, 0.36495012F, -0.4942517F, 110);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI)[B", line = 226)
    public final byte[] method2178(byte arg0, int arg1) {
        field4677++;
        class456 var3 = this.field4685;
        synchronized (this.field4685) {
            try {
                if (this.field4691.method2770((byte) 123) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field4691.method2759(42, (long) (arg1 * 6));
                this.field4691.method2766(class117.field1497, 6, 0, 125);
                int var5 = ((class117.field1497[0] & 0xFF) << 16) + ((class117.field1497[1] & 0xFF) << 8) + (class117.field1497[2] & 0xFF);
                int var6 = ((class117.field1497[3] & 0xFF) << 16) + (class117.field1497[4] & 0xFF << 8) + (class117.field1497[5] & 0xFF);
                if (var5 < 0 || var5 > this.field4684) {
                    return null;
                } else if (var6 > 0 && (this.field4685.method2770((byte) -47) / 520L) >= ((long) var6)) {
                    if (arg0 != -31) {
                        this.toString();
                    }
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field4685.method2759(61, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field4685.method2766(class117.field1497, var13 + 8, 0, 127);
                        int var14 = ((class117.field1497[0] & 0xFF) << 8) + (class117.field1497[1] & 0xFF);
                        int var15 = ((class117.field1497[2] & 0xFF) << 8) + (class117.field1497[3] & 0xFF);
                        int var16 = ((class117.field1497[4] & 0xFF) << 16) + (class117.field1497[5] & 0xFF << 8) + (class117.field1497[6] & 0xFF);
                        int var17 = class117.field1497[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field4689 == var17) {
                            if (var16 >= 0 && (this.field4685.method2770((byte) -122) / 520L) >= ((long) var16)) {
                                var11++;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class117.field1497[var20 + 8];
                                }
                                var6 = var16;
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
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZII[B)Z", line = 308)
    public final boolean method2179(boolean arg0, int arg1, int arg2, byte[] arg3) {
        field4680++;
        class456 var5 = this.field4685;
        synchronized (this.field4685) {
            if (arg2 < 0 || this.field4684 < arg2) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method2175((byte) 77, arg2, arg3, arg1, true);
            if (arg0) {
                field4690 = null;
            }
            if (!var6) {
                var6 = this.method2175((byte) 106, arg2, arg3, arg1, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Lbo;", line = 333)
    public static final class760 method2180(int arg0, int arg1) {
        field4681++;
        class760 var2 = (class760) class569.field7811.method901((long) arg0, -71);
        if (var2 != null) {
            return var2;
        } else if (arg1 > -6) {
            return null;
        } else {
            byte[] var3 = class251.field2945.method437(arg0, (byte) -53, 0);
            if (var3 == null || var3.length <= 1) {
                return null;
            }
            class760 var4;
            try {
                var4 = class776.method4312(-68, var3);
            } catch (Exception var6) {
                throw new RuntimeException(var6.getMessage() + " S: " + arg0);
            }
            class569.field7811.method897((long) arg0, var4, false);
            return var4;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)Z", line = 363)
    public static final boolean method2181(int arg0, int arg1, int arg2) {
        field4682++;
        if (arg2 != 10504) {
            method2176(null, 47);
        }
        return (class17.method208(arg2 - 16913, arg0, arg1) | class688.method3843(89, arg1, arg0) | class99.method843(arg1, -1, arg0)) & class539.method3199(false, arg0, arg1);
    }

    @OriginalMember(owner = "client!tc", name = "toString", descriptor = "()Ljava/lang/String;", line = 386)
    public final String toString() {
        field4674++;
        return "Cache:" + this.field4689;
    }
}
