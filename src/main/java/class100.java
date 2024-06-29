import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class100 extends class71 {

    @OriginalMember(owner = "client!p", name = "J", descriptor = "I")
    private int field1859 = 2048;

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "I")
    private int field1874 = 5;

    @OriginalMember(owner = "client!p", name = "U", descriptor = "[B")
    private byte[] field1870 = new byte[512];

    @OriginalMember(owner = "client!p", name = "db", descriptor = "I")
    private int field1879 = 2;

    @OriginalMember(owner = "client!p", name = "S", descriptor = "I")
    private int field1868 = 0;

    @OriginalMember(owner = "client!p", name = "cb", descriptor = "[S")
    private short[] field1878 = new short[512];

    @OriginalMember(owner = "client!p", name = "fb", descriptor = "I")
    private int field1881 = 1;

    @OriginalMember(owner = "client!p", name = "bb", descriptor = "I")
    private int field1877 = 5;

    @OriginalMember(owner = "client!p", name = "L", descriptor = "[Lud;")
    public static class279[] field1861 = new class279[200];

    @OriginalMember(owner = "client!p", name = "K", descriptor = "I")
    public static int field1860 = 0;

    @OriginalMember(owner = "client!p", name = "M", descriptor = "I")
    public static int field1862 = 0;

    @OriginalMember(owner = "client!p", name = "W", descriptor = "I")
    public static int field1872 = 0;

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "Lo;")
    public static class204 field1866 = new class204();

    @OriginalMember(owner = "client!p", name = "gb", descriptor = "I")
    public static int field1882 = 0;

    @OriginalMember(owner = "client!p", name = "hb", descriptor = "Lud;")
    public static class279 field1883 = class130.method1024("Stufe: ", 255);

    @OriginalMember(owner = "client!p", name = "N", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!p", name = "O", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!p", name = "P", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!p", name = "R", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!p", name = "T", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!p", name = "V", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!p", name = "X", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!p", name = "Z", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!p", name = "ab", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!p", name = "eb", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!p", name = "ib", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(B)V", line = 5)
    public static final void method848(byte arg0) {
        field1865++;
        if (arg0 >= -48) {
            method855((class149) null, -16);
        }
        int var1 = class90.field1703;
        int var2 = class113.field2082 - var1 - class221.field3899;
        int var3 = class252.field4496;
        int var4 = class105.field1985 - var3 - class176.field3150;
        if (var1 <= 0 && var2 <= 0 && var3 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class120.field2159 != null) {
                var5 = class120.field2159;
            } else if (class5.field115 == null) {
                var5 = class110.field2022.field5418;
            } else {
                var5 = class5.field115;
            }
            int var6 = 0;
            int var7 = 0;
            if (class5.field115 == var5) {
                Insets var8 = class5.field115.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class105.field1985);
            }
            if (var3 > 0) {
                var9.fillRect(var6, var7, class113.field2082, var3);
            }
            if (var2 > 0) {
                var9.fillRect(class113.field2082 + var6 - var2, var7, var2, class105.field1985);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class105.field1985 + var7 - var4, class113.field2082, var4);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IZLvh;)V", line = 73)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        field1863++;
        if (!arg1) {
            method854(-109);
        }
        if (arg0 == 0) {
            this.field1877 = this.field1874 = arg2.method483(-118);
        } else if (arg0 == 1) {
            this.field1868 = arg2.method483(-106);
        } else if (arg0 == 2) {
            this.field1859 = arg2.method468(28214);
        } else if (arg0 == 3) {
            this.field1879 = arg2.method483(-107);
        } else if (arg0 == 4) {
            this.field1881 = arg2.method483(-108);
        } else if (arg0 == 5) {
            this.field1877 = arg2.method483(-114);
        } else if (arg0 == 6) {
            this.field1874 = arg2.method483(-117);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BLok;[Lbn;)V", line = 155)
    public static final void method849(byte arg0, class149 arg1, class66[] arg2) {
        class99.field1852 = arg1;
        field1873++;
        class279.field4929 = arg2;
        class33.field740 = new boolean[class279.field4929.length];
        class119.field2144.method2243(69);
        int var3 = class99.field1852.method1167(class260.field4622, 116);
        int[] var4 = class99.field1852.method1182(var3, 0);
        int var5 = 0;
        int var6 = -66 / ((arg0 - 63) / 62);
        while (var4.length > var5) {
            class119.field2144.method2246(true, class286.method2048(new class53(class99.field1852.method1192(0, var3, var4[var5])), 0));
            var5++;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(Z)V", line = 183)
    private final void method850(boolean arg0) {
        field1875++;
        Random var2 = new Random((long) this.field1868);
        this.field1878 = new short[512];
        if (arg0) {
            this.field1859 = 15;
        }
        if (this.field1859 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field1878[var3] = (short) class133.method1041(var2, this.field1859, 10061);
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(Z)V", line = 212)
    public static final void method851(boolean arg0) {
        class232.field4070 = 0;
        class314.field5534.field1142 = 0;
        client.field4470 = 0;
        class143.field2597 = -1;
        if (!arg0) {
            method851(true);
        }
        class302.field5366 = -1;
        class238.field4184 = false;
        class33.field748 = 0;
        class194.field3488 = 0;
        class287.field5106.field1142 = 0;
        class264.field4741 = 0;
        field1862 = -1;
        field1867++;
        class165.field2969 = -1;
        field1882 = 0;
        for (int var1 = 0; var1 < class96.field1780.length; var1++) {
            if (class96.field1780[var1] != null) {
                class96.field1780[var1].field62 = -1;
            }
        }
        for (int var2 = 0; var2 < class122.field2196.length; var2++) {
            if (class122.field2196[var2] != null) {
                class122.field2196[var2].field62 = -1;
            }
        }
        class144.method1100(-1);
        class122.field2191 = 1;
        class172.method1343(30, -29401);
        for (int var3 = 0; var3 < 100; var3++) {
            class71.field1398[var3] = true;
        }
        class38.method342((byte) 123);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(IB)[I", line = 277)
    public final int[] method199(int arg0, byte arg1) {
        int[] var3 = this.field1390.method549(arg0, true);
        if (arg1 >= -69) {
            return (int[]) null;
        }
        if (this.field1390.field1304) {
            int var4 = class200.field3574[arg0] * this.field1874 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class215.field3787; var7++) {
                class310.field5493 = Integer.MAX_VALUE;
                class7.field131 = Integer.MAX_VALUE;
                class220.field3891 = Integer.MAX_VALUE;
                class101.field1895 = Integer.MAX_VALUE;
                int var8 = (class133.field2424[var7] * this.field1877) + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field1870[(var11 >= this.field1874 ? var11 - this.field1874 : var11) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field1870[var12 + (this.field1877 <= var13 ? var13 - this.field1877 : var13) & 0xFF] & 0xFF) * 2;
                        int var10001 = -(var13 << 12);
                        int var27 = var14 + 1;
                        int var15 = var8 + var10001 - this.field1878[var14];
                        int var16 = var4 - (var11 << 12) - this.field1878[var27];
                        int var17 = this.field1881;
                        int var18;
                        if (var17 == 1) {
                            var18 = var15 * var15 + var16 * var16 >> 12;
                        } else if (var17 == 3) {
                            int var19 = var15 < 0 ? -var15 : var15;
                            int var20 = var16 >= 0 ? var16 : -var16;
                            var18 = var20 >= var19 ? var20 : var19;
                        } else if (var17 == 4) {
                            int var21 = (int) (Math.sqrt((double) ((float) (var15 < 0 ? -var15 : var15) / 4096.0F)) * 4096.0D);
                            int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                            int var23 = var21 + var22;
                            var18 = var23 * var23 >> 12;
                        } else if (var17 == 5) {
                            int var24 = var16 * var16;
                            int var25 = var15 * var15;
                            var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var24 + var25) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var18 = (var15 >= 0 ? var15 : -var15) + (var16 >= 0 ? var16 : -var16);
                        } else {
                            var18 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (var18 < class101.field1895) {
                            class310.field5493 = class7.field131;
                            class7.field131 = class220.field3891;
                            class220.field3891 = class101.field1895;
                            class101.field1895 = var18;
                        } else if (class220.field3891 > var18) {
                            class310.field5493 = class7.field131;
                            class7.field131 = class220.field3891;
                            class220.field3891 = var18;
                        } else if (var18 < class7.field131) {
                            class310.field5493 = class7.field131;
                            class7.field131 = var18;
                        } else if (var18 < class310.field5493) {
                            class310.field5493 = var18;
                        }
                    }
                }
                int var26 = this.field1879;
                if (var26 == 0) {
                    var3[var7] = class101.field1895;
                } else if (var26 == 1) {
                    var3[var7] = class220.field3891;
                } else if (var26 == 3) {
                    var3[var7] = class7.field131;
                } else if (var26 == 4) {
                    var3[var7] = class310.field5493;
                } else if (var26 == 2) {
                    var3[var7] = class220.field3891 - class101.field1895;
                }
            }
        }
        field1869++;
        return var3;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V", line = 487)
    public class100() {
        super(0, true);
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "(I)V", line = 498)
    public static void method852(int arg0) {
        field1866 = null;
        field1883 = null;
        field1861 = null;
        if (arg0 >= -100) {
            field1866 = (class204) null;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)Lkb;", line = 518)
    public static final class34 method853(int arg0, int arg1) {
        field1871++;
        class34 var2 = (class34) class140.field2546.method1336((long) arg1, arg0 ^ arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class69.field1364.method1192(0, 32, arg1);
        class34 var4 = new class34();
        if (var3 != null) {
            var4.method307(true, new class53(var3));
        }
        var4.method305(false);
        class140.field2546.method1331(var4, arg0 + 28955, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!p", name = "g", descriptor = "(I)Llj;", line = 545)
    public static final class50 method854(int arg0) {
        if (arg0 >= -17) {
            field1872 = 44;
        }
        field1880++;
        class50 var1;
        if (class97.field1824) {
            var1 = new class56(class86.field1646, class111.field2045, class44.field915[0], class216.field3811[0], class1.field92[0], class115.field2097[0], class113.field2080[0], class217.field3839);
        } else {
            var1 = new class158(class86.field1646, class111.field2045, class44.field915[0], class216.field3811[0], class1.field92[0], class115.field2097[0], class113.field2080[0], class217.field3839);
        }
        class162.method1278(false);
        return var1;
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(I)V", line = 576)
    public final void method627(int arg0) {
        field1864++;
        if (arg0 != 7) {
            method853(-128, -117);
        }
        this.field1870 = class140.method1080(this.field1868, (byte) -123);
        this.method850(false);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lok;I)V", line = 595)
    public static final void method855(class149 arg0, int arg1) {
        class312.field5518 = arg0;
        if (arg1 != 26317) {
            field1876 = 118;
        }
        field1884++;
    }
}
