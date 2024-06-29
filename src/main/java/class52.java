import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class52 implements class512 {

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "I")
    public static int field640 = 0;

    @OriginalMember(owner = "client!pv", name = "p", descriptor = "F")
    public static float field654 = 0.0F;

    @OriginalMember(owner = "client!pv", name = "q", descriptor = "I")
    public static int field655 = 1405;

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
    public int field641;

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "I")
    public int field642;

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!pv", name = "h", descriptor = "I")
    public int field646;

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "I")
    public int field647;

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "I")
    public int field648;

    @OriginalMember(owner = "client!pv", name = "k", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!pv", name = "l", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!pv", name = "m", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!pv", name = "n", descriptor = "I")
    public int field652;

    @OriginalMember(owner = "client!pv", name = "o", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "Lmv;")
    public static class255 field639;

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "Z")
    public boolean field645;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)Z")
    public static final boolean method497(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class305.field4596; var3++) {
            class74 var4 = class517.field7512[var3];
            if (var4.field1067 == 1) {
                int var5 = var4.field1051 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field1047 * var5 >> 8) + var4.field1055;
                    int var7 = (var4.field1054 * var5 >> 8) + var4.field1065;
                    int var8 = (var4.field1056 * var5 >> 8) + var4.field1060;
                    int var9 = (var4.field1066 * var5 >> 8) + var4.field1062;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field1067 == 2) {
                int var10 = arg0 - var4.field1051;
                if (var10 > 0) {
                    int var11 = (var4.field1047 * var10 >> 8) + var4.field1055;
                    int var12 = (var4.field1054 * var10 >> 8) + var4.field1065;
                    int var13 = (var4.field1056 * var10 >> 8) + var4.field1060;
                    int var14 = (var4.field1066 * var10 >> 8) + var4.field1062;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field1067 == 3) {
                int var15 = var4.field1055 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field1059 * var15 >> 8) + var4.field1051;
                    int var17 = (var4.field1046 * var15 >> 8) + var4.field1053;
                    int var18 = (var4.field1056 * var15 >> 8) + var4.field1060;
                    int var19 = (var4.field1066 * var15 >> 8) + var4.field1062;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field1067 == 4) {
                int var20 = arg2 - var4.field1055;
                if (var20 > 0) {
                    int var21 = (var4.field1059 * var20 >> 8) + var4.field1051;
                    int var22 = (var4.field1046 * var20 >> 8) + var4.field1053;
                    int var23 = (var4.field1056 * var20 >> 8) + var4.field1060;
                    int var24 = (var4.field1066 * var20 >> 8) + var4.field1062;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field1067 == 5) {
                int var25 = arg1 - var4.field1060;
                if (var25 > 0) {
                    int var26 = (var4.field1059 * var25 >> 8) + var4.field1051;
                    int var27 = (var4.field1046 * var25 >> 8) + var4.field1053;
                    int var28 = (var4.field1047 * var25 >> 8) + var4.field1055;
                    int var29 = (var4.field1054 * var25 >> 8) + var4.field1065;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Z)V")
    public static void method498(boolean arg0) {
        if (arg0) {
            field639 = null;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)V")
    public static final void method499(int arg0) {
        class142.field2181 = null;
        class459.field6687 = null;
        field649++;
        class528.field7701 = null;
        class40.field534 = null;
        class380.field5734 = null;
        class100.field1429 = null;
        class305.field4603 = null;
        class46.field601 = null;
        if (arg0 == 18328) {
            class124.field1846 = null;
        }
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(B)[Lrd;")
    public static final class224[] method500(byte arg0) {
        if (arg0 >= -20) {
            return null;
        }
        field650++;
        if (class143.field2191 == null) {
            class224[] var1 = class154.method1060(class360.field5349, 34);
            class224[] var2 = new class224[var1.length];
            int var3 = 0;
            label66: for (int var4 = 0; var4 < var1.length; var4++) {
                class224 var8 = var1[var4];
                if ((var8.field3669 <= 0 || var8.field3669 >= 24) && var8.field3666 >= 800 && var8.field3668 >= 600 && (class494.field7129 >= 96 || class96.field1384 != 0 || var8.field3666 <= 1024 && var8.field3668 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class224 var10 = var2[var9];
                        if (var8.field3666 == var10.field3666 && var8.field3668 == var10.field3668) {
                            if (var8.field3669 > var10.field3669) {
                                var2[var9] = var8;
                            }
                            continue label66;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class143.field2191 = new class224[var3];
            class414.method2599(var2, 0, class143.field2191, 0, var3);
            int[] var5 = new int[class143.field2191.length];
            for (int var6 = 0; var6 < class143.field2191.length; var6++) {
                class224 var7 = class143.field2191[var6];
                var5[var6] = var7.field3668 * var7.field3666;
            }
            class491.method2919(var5, true, class143.field2191);
        }
        return class143.field2191;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lya;I)V")
    public static final void method501(class38 arg0, int arg1) {
        if (arg1 != 0) {
            field654 = 0.33312073F;
        }
        if (class307.field4631) {
            class6.method32(arg0, (byte) -106);
        } else {
            class363.method2275(arg0, 104);
        }
        field644++;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)J")
    public final long method502(byte arg0) {
        field643++;
        int var2 = 69 % ((31 - arg0) / 55);
        long[] var3 = class111.field1546;
        long var4 = -1L;
        long var6 = var3[(int) ((var4 ^ (long) this.field652) & 0xFFL)] ^ var4 >>> 8;
        long var8 = var6 >>> 8 ^ var3[(int) ((var6 ^ (long) (this.field641 >> 8)) & 0xFFL)];
        long var10 = var3[(int) (((long) this.field641 ^ var8) & 0xFFL)] ^ var8 >>> 8;
        long var12 = var3[(int) ((var10 ^ (long) (this.field646 >> 24)) & 0xFFL)] ^ var10 >>> 8;
        long var14 = var3[(int) ((var12 ^ (long) (this.field646 >> 16)) & 0xFFL)] ^ var12 >>> 8;
        long var16 = var3[(int) (((long) (this.field646 >> 8) ^ var14) & 0xFFL)] ^ var14 >>> 8;
        long var18 = var16 >>> 8 ^ var3[(int) (((long) this.field646 ^ var16) & 0xFFL)];
        long var20 = var3[(int) ((var18 ^ (long) this.field642) & 0xFFL)] ^ var18 >>> 8;
        long var22 = var3[(int) ((var20 ^ (long) (this.field648 >> 24)) & 0xFFL)] ^ var20 >>> 8;
        long var24 = var3[(int) ((var22 ^ (long) (this.field648 >> 16)) & 0xFFL)] ^ var22 >>> 8;
        long var26 = var24 >>> 8 ^ var3[(int) (((long) (this.field648 >> 8) ^ var24) & 0xFFL)];
        long var28 = var26 >>> 8 ^ var3[(int) ((var26 ^ (long) this.field648) & 0xFFL)];
        long var30 = var28 >>> 8 ^ var3[(int) ((var28 ^ (long) this.field647) & 0xFFL)];
        return var30 >>> 8 ^ var3[(int) (((long) (this.field645 ? 1 : 0) ^ var30) & 0xFFL)];
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
    public static final void method503(boolean arg0, String arg1, boolean arg2) {
        field653++;
        class522.field7634.field6013 = 1;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class390.field5847.field571; var6++) {
            class532 var9 = class390.field5847.method467((byte) -101, var6);
            if ((!arg2 || var9.field7840) && var9.field7833 == -1 && var9.field7816 == -1 && var9.field7843 == 0 && var9.field7806.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class316.field4778 = -1;
                    class419.field6258 = null;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        if (!arg0) {
            field655 = 67;
        }
        class19.field248 = 0;
        class316.field4778 = var5;
        class419.field6258 = var4;
        String[] var7 = new String[class316.field4778];
        for (int var8 = 0; var8 < class316.field4778; var8++) {
            var7[var8] = class390.field5847.method467((byte) -101, var4[var8]).field7806;
        }
        class310.method1981(80, var7, class419.field6258);
        class522.field7634.method2533(-7767);
        class522.field7634.field6013 = 2;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILcp;)Z")
    public final boolean method504(int arg0, class512 arg1) {
        field651++;
        if (!(arg1 instanceof class52)) {
            return false;
        }
        class52 var3 = (class52) arg1;
        if (this.field652 != var3.field652) {
            return false;
        } else if (this.field641 != var3.field641) {
            return false;
        } else if (this.field646 == var3.field646) {
            if (arg0 != 4473) {
                method497(-83, -67, 40);
            }
            if (this.field642 != var3.field642) {
                return false;
            } else if (this.field648 != var3.field648) {
                return false;
            } else if (this.field647 == var3.field647) {
                return var3.field645 == this.field645;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
