import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class116 extends class43 {

    @OriginalMember(owner = "client!kh", name = "fb", descriptor = "I")
    private int field2227 = 4096;

    @OriginalMember(owner = "client!kh", name = "ib", descriptor = "Z")
    private boolean field2230 = true;

    @OriginalMember(owner = "client!kh", name = "X", descriptor = "Z")
    public static boolean field2219 = false;

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "Z")
    public static boolean field2216 = false;

    @OriginalMember(owner = "client!kh", name = "W", descriptor = "Lmb;")
    public static class132 field2218 = class166.method1092("Starte 3D)2Softwarebibliothek)3", 117);

    @OriginalMember(owner = "client!kh", name = "hb", descriptor = "Lmb;")
    private static class132 field2229 = class166.method1092("Username: ", 111);

    @OriginalMember(owner = "client!kh", name = "kb", descriptor = "Lmb;")
    public static class132 field2232 = field2229;

    @OriginalMember(owner = "client!kh", name = "Z", descriptor = "[B")
    public static byte[] field2221 = new byte[32896];

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!kh", name = "V", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!kh", name = "Y", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!kh", name = "ab", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!kh", name = "bb", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!kh", name = "cb", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!kh", name = "db", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!kh", name = "eb", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!kh", name = "jb", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!kh", name = "gb", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2228;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        if (arg1 != -73) {
            field2218 = null;
        }
        ++field2215;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field2230 = arg2.method716(-1308) == 1;
            }
        } else {
            this.field2227 = arg2.method739(-26);
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)V")
    public static final void method779(byte arg0) {
        ++field2223;
        if (arg0 >= 100) {
            try {
                if (~class39.field633 == -2) {
                    int var1 = class34.field556.method169(128);
                    if (var1 > 0 && class34.field556.method171((byte) 93)) {
                        int var2 = var1 - class65.field1065;
                        if (var2 < 0) {
                            var2 = 0;
                        }
                        class34.field556.method155(true, var2);
                    } else {
                        class34.field556.method184((byte) -6);
                        class34.field556.method163(2);
                        class192.field3592 = null;
                        if (class25.field405 != null) {
                            class39.field633 = 2;
                        } else {
                            class39.field633 = 0;
                        }
                        class106.field1973 = null;
                    }
                }
            } catch (Exception var4) {
                var4.printStackTrace();
                class34.field556.method184((byte) -6);
                class25.field405 = null;
                class39.field633 = 0;
                class192.field3592 = null;
                class106.field1973 = null;
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)Lbi;")
    public static final class21 method780(int arg0, byte arg1) {
        class21 var2 = (class21) class86.field1497.method777(-1, (long) arg0);
        if (arg1 != 100) {
            field2221 = null;
        }
        ++field2222;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class127.field2360.method1079(27, 104, arg0);
            class21 var4 = new class21();
            if (var3 != null) {
                var4.method137(new class112(var3), -31440);
            }
            class86.field1497.method774((long) arg0, var4, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(III)I")
    public static final int method781(int arg0, int arg1, int arg2) {
        ++field2220;
        if (arg0 > -45) {
            field2229 = null;
        }
        int var3 = arg2 >> 31 & arg1 + -1;
        return ((arg2 >>> 31) + arg2) % arg1 + var3;
    }

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)V")
    public static final void method782(int arg0) {
        int var1 = -23 / ((29 - arg0) / 51);
        class211.field3872 = new class19();
        ++field2226;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(Z)V")
    public static void method783(boolean arg0) {
        if (arg0) {
            method784(-111, 7, (class96[]) null);
        }
        field2228 = null;
        field2218 = null;
        field2232 = null;
        field2229 = null;
        field2221 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)[[I")
    public final int[][] method203(int arg0, int arg1) {
        ++field2217;
        if (arg0 != -1893) {
            return null;
        } else {
            int[][] var3 = super.field764.method1350((byte) 125, arg1);
            if (super.field764.field3960) {
                int[] var4 = this.method300(53, 0, arg1 + -1 & class185.field3423);
                int[] var5 = this.method300(-58, 0, arg1);
                int[] var6 = this.method300(-74, 0, arg1 + 1 & class185.field3423);
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                int[] var9 = var3[0];
                for (int var10 = 0; ~class131.field2427 < ~var10; ++var10) {
                    int var11 = (var5[class90.field1593 & var10 + 1] + -var5[class90.field1593 & var10 + -1]) * this.field2227;
                    int var12 = (var6[var10] + -var4[var10]) * this.field2227;
                    int var13 = var12 >> 12;
                    int var14 = var11 >> 12;
                    int var15 = var14 * var14 >> 12;
                    int var16 = var13 * var13 >> 12;
                    int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 + 4096 + var15) / 4096.0F)));
                    int var18;
                    int var19;
                    int var20;
                    if (~var17 == -1) {
                        var18 = 0;
                        var19 = 0;
                        var20 = 0;
                    } else {
                        var18 = var11 / var17;
                        var19 = 16777216 / var17;
                        var20 = var12 / var17;
                    }
                    if (this.field2230) {
                        var18 = (var18 >> 1) + 2048;
                        var19 = (var19 >> 1) + 2048;
                        var20 = 2048 - -(var20 >> 1);
                    }
                    var9[var10] = var18;
                    var7[var10] = var20;
                    var8[var10] = var19;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
    public class116() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II[Lii;)V")
    public static final void method784(int arg0, int arg1, class96[] arg2) {
        ++field2224;
        int var3 = -45 / ((-43 - arg0) / 57);
        for (int var4 = 0; arg2.length > var4; ++var4) {
            class96 var5 = arg2[var4];
            if (var5 != null && var5.field1776 == arg1 && (!var5.field1766 || !class93.method577(var5, -1))) {
                if (~var5.field1760 == -1) {
                    if (!var5.field1766 && class93.method577(var5, -1) && class8.field80 != var5) {
                        continue;
                    }
                    method784(86, var5.field1794, arg2);
                    if (var5.field1770 != null) {
                        method784(-123, var5.field1794, var5.field1770);
                    }
                    class73 var6 = (class73) class55.field927.method806(-1, (long) var5.field1794);
                    if (var6 != null) {
                        class214.method1336(var6.field1216, -26564);
                    }
                }
                if (~var5.field1760 == -7) {
                    if (var5.field1710 != -1 || var5.field1784 != -1) {
                        boolean var7 = class105.method645(var5, -102);
                        int var8;
                        if (var7) {
                            var8 = var5.field1784;
                        } else {
                            var8 = var5.field1710;
                        }
                        if (~var8 != 0) {
                            class236 var9 = class99.method619(var8, 4);
                            if (var9 != null) {
                                var5.field1813 += class112.field2118;
                                while (var9.field4253[var5.field1758] < var5.field1813) {
                                    var5.field1813 -= var9.field4253[var5.field1758];
                                    ++var5.field1758;
                                    if (var9.field4274.length <= var5.field1758) {
                                        var5.field1758 -= var9.field4265;
                                        if (~var5.field1758 > -1 || ~var9.field4274.length >= ~var5.field1758) {
                                            var5.field1758 = 0;
                                        }
                                    }
                                    class183.method1174(var5, 16235);
                                }
                            }
                        }
                    }
                    if (~var5.field1754 != -1 && !var5.field1766) {
                        int var10 = var5.field1754 >> 16;
                        int var11 = var5.field1754 << 16 >> 16;
                        int var12 = class112.field2118 * var10;
                        var5.field1750 = var5.field1750 + var12 & 2047;
                        int var13 = class112.field2118 * var11;
                        var5.field1741 = var5.field1741 - -var13 & 2047;
                        class183.method1174(var5, 16235);
                    }
                }
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; ++var1) {
            for (int var2 = 0; ~var1 <= ~var2; ++var2) {
                field2221[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }
}
