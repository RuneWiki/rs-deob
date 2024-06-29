import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class87 {

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "[I")
    private int[] field1912;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "[I")
    private int[] field1921;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "[B")
    private byte[] field1920;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Z")
    public static boolean field1914 = false;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field1910 = -1;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1913 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "Llc;")
    public static class69 field1922 = class69.method470((byte) -107, "Loaded update list");

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "Llc;")
    public static class69 field1924 = class69.method470((byte) -125, "Loaded fonts");

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "Llc;")
    public static class69 field1923 = class69.method470((byte) -127, "mapback");

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "Llc;")
    public static class69 field1925 = class69.method470((byte) -99, "mapmarker");

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Llc;ZILlc;)V")
    public static final void method619(class69 arg0, boolean arg1, int arg2, class69 arg3) {
        if (!arg1) {
            return;
        }
        field1918++;
        if (arg2 == 0 && class46.field968 != -1) {
            class62.field1278 = 0;
            class6.field115 = arg0;
        }
        if (class60.field1244 == -1) {
            class35.field709 = true;
        }
        for (int var4 = 99; var4 > 0; var4--) {
            class72.field1603[var4] = class72.field1603[var4 - 1];
            class10.field214[var4] = class10.field214[var4 - 1];
            class36.field722[var4] = class36.field722[var4 - 1];
        }
        class72.field1603[0] = arg2;
        class10.field214[0] = arg3;
        class36.field722[0] = arg0;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I[BIII[B)I")
    public final int method620(int arg0, byte[] arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field1919++;
        int var7 = arg0 + arg4;
        int var8 = 0;
        int var9 = arg2 << 3;
        while (arg4 < var7) {
            int var10 = arg5[arg4] & 0xFF;
            int var11 = this.field1912[var10];
            byte var12 = this.field1920[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 & 0x7;
            int var14 = var8 & -var13 >> 31;
            int var15 = var9 >> 3;
            int var16 = (var13 + var12 - 1 >> 3) + var15;
            var9 += var12;
            int var17 = var13 + 24;
            arg1[var15] = (byte) (var8 = class107.method795(var14, var11 >>> var17));
            if (var15 < var16) {
                var13 = var17 - 8;
                var15++;
                arg1[var15] = (byte) (var8 = var11 >>> var13);
                if (var15 < var16) {
                    var15++;
                    var13 -= 8;
                    arg1[var15] = (byte) (var8 = var11 >>> var13);
                    if (var15 < var16) {
                        var15++;
                        var13 -= 8;
                        arg1[var15] = (byte) (var8 = var11 >>> var13);
                        if (var15 < var16) {
                            var13 -= 8;
                            var15++;
                            arg1[var15] = (byte) (var8 = var11 << -var13);
                        }
                    }
                }
            }
            arg4++;
        }
        if (arg3 <= 22) {
            field1922 = null;
        }
        return (var9 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method621(int arg0) {
        if (arg0 <= 71) {
            return;
        }
        field1925 = null;
        field1922 = null;
        field1924 = null;
        field1913 = null;
        field1923 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([BIII[BI)I")
    public final int method622(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field1911++;
        if (arg2 == 0) {
            return 0;
        }
        int var7 = arg1 + arg2;
        int var8 = 0;
        int var9 = arg3;
        while (true) {
            byte var10 = arg0[var9];
            if (var10 < 0) {
                var8 = this.field1921[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field1921[var8]) < 0) {
                arg4[arg1++] = (byte) ~var11;
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1921[var8];
            }
            int var12;
            if ((var12 = this.field1921[var8]) < 0) {
                arg4[arg1++] = (byte) ~var12;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1921[var8];
            }
            int var13;
            if ((var13 = this.field1921[var8]) < 0) {
                arg4[arg1++] = (byte) ~var13;
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1921[var8];
            }
            int var14;
            if ((var14 = this.field1921[var8]) < 0) {
                arg4[arg1++] = (byte) ~var14;
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1921[var8];
            }
            int var15;
            if ((var15 = this.field1921[var8]) < 0) {
                arg4[arg1++] = (byte) ~var15;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1921[var8];
            }
            int var16;
            if ((var16 = this.field1921[var8]) < 0) {
                arg4[arg1++] = (byte) ~var16;
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1921[var8];
            }
            int var17;
            if ((var17 = this.field1921[var8]) < 0) {
                arg4[arg1++] = (byte) ~var17;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1921[var8];
            }
            int var18;
            if ((var18 = this.field1921[var8]) < 0) {
                arg4[arg1++] = (byte) ~var18;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return arg5 == 1 ? var9 + 1 - arg3 : 11;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IJ)V")
    public static final void method623(int arg0, long arg1) {
        field1916++;
        if ((long) arg0 == arg1) {
            return;
        }
        for (int var3 = 0; var3 < class104.field2271; var3++) {
            if (class22.field470[var3] == arg1) {
                class23.field475++;
                class104.field2271--;
                class110.field2418 = true;
                for (int var4 = var3; var4 < class104.field2271; var4++) {
                    class22.field470[var4] = class22.field470[var4 + 1];
                }
                class26.field557.method178(arg0 ^ 0xFFFFFFFB, 168);
                class26.field557.method664(arg1, 64);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "([B)V")
    public class87(byte[] arg0) {
        int var2 = arg0.length;
        this.field1912 = new int[var2];
        this.field1921 = new int[8];
        this.field1920 = arg0;
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = var3[var6];
                int var8 = 0x1 << 32 - var6;
                this.field1912[var5] = var7;
                int var12;
                if ((var8 & var7) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var7 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var11 & var10) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class107.method795(var11, var10);
                    }
                    var12 = var7 | var8;
                } else {
                    var12 = var3[var6 - 1];
                }
                var3[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var7) {
                        var3[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var7 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field1921[var14] == 0) {
                            this.field1921[var14] = var4;
                        }
                        var14 = this.field1921[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field1921.length) {
                        int[] var18 = new int[this.field1921.length * 2];
                        for (int var19 = 0; var19 < this.field1921.length; var19++) {
                            var18[var19] = this.field1921[var19];
                        }
                        this.field1921 = var18;
                    }
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field1921[var14] = ~var5;
            }
        }
    }
}
