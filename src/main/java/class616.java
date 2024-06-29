import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class616 {

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public int field8889;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "[B")
    private byte[] field8885;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8897 = new String[] { method4502(method4501("H-P?s")), method4502(method4501("ZbPP&")), method4502(method4501("]v\u0012}")), method4502(method4501("ZbP-g]j\n/&")), method4502(method4501("ZbPS&")) };

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "Lvn;")
    public static class330 field8890 = new class330(69, -1);

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public int field8879;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public int field8880;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public int field8883;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field8893;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "Lbc;")
    public class386 field8892;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "[I")
    public int[] field8882;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "[I")
    public int[] field8884;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "[I")
    public int[] field8886;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "[I")
    public int[] field8888;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "[I")
    public int[] field8891;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "[I")
    public int[] field8894;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "[Lbc;")
    public class386[] field8895;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "[[B")
    public byte[][] field8896;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "[[I")
    public int[][] field8881;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "[[I")
    public int[][] field8887;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static void method4499(int arg0) {
        try {
            field8890 = null;
            int var1 = 86 / ((-arg0 - 17) / 47);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8897[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([BI)V")
    private final void method4500(byte[] arg0, int arg1) {
        try {
            field8893++;
            class176 var3 = new class176(class240.method2068(112, arg0));
            int var4 = var3.method1645((byte) -117);
            if (var4 < 5 || var4 > 6) {
                throw new RuntimeException();
            }
            if (var4 >= 6) {
                this.field8880 = var3.method1622(-18712);
            } else {
                this.field8880 = 0;
            }
            int var5 = var3.method1645((byte) -96);
            boolean var6 = (var5 & 0x1) != 0;
            this.field8879 = var3.method1687((byte) -112);
            boolean var7 = (var5 & 0x2) != 0;
            int var8 = 0;
            this.field8888 = new int[this.field8879];
            int var9 = -1;
            for (int var10 = 0; var10 < this.field8879; var10++) {
                this.field8888[var10] = var8 += var3.method1687((byte) -50);
                if (this.field8888[var10] > var9) {
                    var9 = this.field8888[var10];
                }
            }
            this.field8883 = var9 + 1;
            this.field8884 = new int[this.field8883];
            this.field8887 = new int[this.field8883][];
            this.field8891 = new int[this.field8883];
            this.field8886 = new int[this.field8883];
            if (var7) {
                this.field8896 = new byte[this.field8883][];
            }
            this.field8894 = new int[this.field8883];
            if (var6) {
                this.field8882 = new int[this.field8883];
                for (int var11 = 0; var11 < this.field8883; var11++) {
                    this.field8882[var11] = -1;
                }
                for (int var12 = 0; var12 < this.field8879; var12++) {
                    this.field8882[this.field8888[var12]] = var3.method1622(-18712);
                }
                this.field8892 = new class386(this.field8882);
            }
            for (int var13 = 0; var13 < this.field8879; var13++) {
                this.field8891[this.field8888[var13]] = var3.method1622(-18712);
            }
            if (var7) {
                for (int var14 = 0; var14 < this.field8879; var14++) {
                    byte[] var15 = new byte[64];
                    var3.method1651(var15, 128, 0, 64);
                    this.field8896[this.field8888[var14]] = var15;
                }
            }
            for (int var16 = 0; var16 < this.field8879; var16++) {
                this.field8894[this.field8888[var16]] = var3.method1622(-18712);
            }
            if (arg1 < 88) {
                method4499(93);
            }
            for (int var17 = 0; var17 < this.field8879; var17++) {
                this.field8886[this.field8888[var17]] = var3.method1687((byte) -116);
            }
            for (int var18 = 0; var18 < this.field8879; var18++) {
                int var19 = this.field8888[var18];
                int var20 = this.field8886[var19];
                int var21 = 0;
                int var22 = -1;
                this.field8887[var19] = new int[var20];
                for (int var23 = 0; var23 < var20; var23++) {
                    int var24 = this.field8887[var19][var23] = var21 += var3.method1687((byte) -44);
                    if (var22 < var24) {
                        var22 = var24;
                    }
                }
                this.field8884[var19] = var22 + 1;
                if (var20 == var22 + 1) {
                    this.field8887[var19] = null;
                }
            }
            if (var6) {
                this.field8895 = new class386[var9 + 1];
                this.field8881 = new int[var9 + 1][];
                for (int var25 = 0; var25 < this.field8879; var25++) {
                    int var26 = this.field8888[var25];
                    int var27 = this.field8886[var26];
                    this.field8881[var26] = new int[this.field8884[var26]];
                    for (int var28 = 0; var28 < this.field8884[var26]; var28++) {
                        this.field8881[var26][var28] = -1;
                    }
                    for (int var29 = 0; var29 < var27; var29++) {
                        int var30;
                        if (this.field8887[var26] == null) {
                            var30 = var29;
                        } else {
                            var30 = this.field8887[var26][var29];
                        }
                        this.field8881[var26][var30] = var3.method1622(-18712);
                    }
                    this.field8895[var26] = new class386(this.field8881[var26]);
                }
            }
        } catch (RuntimeException var32) {
            throw class590.method4333(var32, field8897[1] + (arg0 == null ? field8897[2] : field8897[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "([BI[B)V")
    public class616(byte[] arg0, int arg1, byte[] arg2) {
        try {
            this.field8889 = class523.method3909(arg0.length, arg0, (byte) -123);
            if (this.field8889 != arg1) {
                throw new RuntimeException();
            }
            if (arg2 != null) {
                if (arg2.length != 64) {
                    throw new RuntimeException();
                }
                this.field8885 = class198.method1816((byte) -106, arg0.length, arg0, 0);
                for (int var4 = 0; var4 < 64; var4++) {
                    if (this.field8885[var4] != arg2[var4]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.method4500(arg0, 102);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field8897[3] + (arg0 == null ? field8897[2] : field8897[0]) + ',' + arg1 + ',' + (arg2 == null ? field8897[2] : field8897[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4501(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xE);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4502(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 51;
                    break;
                case 1:
                    var10005 = 3;
                    break;
                case 2:
                    var10005 = 126;
                    break;
                case 3:
                    var10005 = 17;
                    break;
                default:
                    var10005 = 14;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
