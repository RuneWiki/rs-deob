import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class33 implements Runnable {

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    private int field790 = 0;

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "Z")
    private boolean field818 = false;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Z")
    private boolean field793 = false;

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "I")
    private int field819 = 0;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "Ljb;")
    private class56 field789;

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "Ljava/net/Socket;")
    private Socket field815;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "Ljava/io/InputStream;")
    private InputStream field799;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field800;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field792 = 0;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "Z")
    public static boolean field802 = false;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
    public static int field809 = 0;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "Lhb;")
    public static class44 field806 = class102.method810("RuneScape wurde aktualisiert(Q", -28606);

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "Lhb;")
    private static class44 field804 = class102.method810("Click to continue", -28606);

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "Lhb;")
    public static class44 field787 = field804;

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "Lhb;")
    private static class44 field814 = class102.method810(" from your friend list first", -28606);

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Lhb;")
    public static class44 field785 = field814;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "Ltd;")
    public static class116 field811;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "Lva;")
    private class123 field801;

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "Lne;")
    public static class83 field810;

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "[B")
    private byte[] field812;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B[B)[B", line = 19)
    public static final byte[] method318(byte arg0, byte[] arg1) {
        field797++;
        if (arg0 != 55) {
            return null;
        }
        class131 var2 = new class131(arg1);
        int var3 = var2.method971(true);
        int var4 = var2.method994((byte) 36);
        if (var4 < 0 || class89.field2268 != 0 && var4 > class89.field2268) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method970(var4, true, 0, var5);
            return var5;
        } else {
            int var6 = var2.method994((byte) 36);
            if (var6 < 0 || class89.field2268 != 0 && class89.field2268 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class26.method219(var7, var6, arg1, var4, 9);
            } else {
                try {
                    DataInputStream var8 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg1, 9, var4)));
                    var8.readFully(var7);
                    var8.close();
                } catch (IOException var9) {
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)I", line = 87)
    public static final int method319(int arg0) {
        if (arg0 != -14621) {
            method325(-48, -20, -41, -78, 121, null, 107, null, 30, 125);
        }
        field786++;
        return class107.field2720++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I[BZI)V", line = 99)
    public final void method320(int arg0, byte[] arg1, boolean arg2, int arg3) throws IOException {
        if (arg2) {
            field804 = null;
        }
        field813++;
        if (this.field793) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field799.read(arg1, arg0, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg3 -= var5;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 124)
    public static final void method321(byte arg0) {
        field808++;
        try {
            if (class98.field2493 == 0) {
                if (class107.field2711 != null) {
                    class107.field2711.method328(256);
                    class107.field2711 = null;
                }
                class86.field2185 = 0;
                class47.field1181 = false;
                class98.field2493 = 1;
                class72.field1829 = null;
            }
            if (class98.field2493 == 1) {
                if (class72.field1829 == null) {
                    class72.field1829 = class103.field2626.method523(class131.field3194, false);
                }
                if (class72.field1829.field2998 == 2) {
                    throw new IOException();
                }
                if (class72.field1829.field2998 == 1) {
                    class107.field2711 = new class33((Socket) class72.field1829.field2995, class103.field2626);
                    class72.field1829 = null;
                    class98.field2493 = 2;
                }
            }
            if (class98.field2493 == 2) {
                long var1 = class110.field2750 = class89.field2282.method407(true);
                class92.field2333.field3182 = 0;
                class92.field2333.method993(19579, 14);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class92.field2333.method993(19579, var3);
                class107.field2711.method323(0, (byte) 99, 2, class92.field2333.field3172);
                class98.field2493 = 3;
                class53.field1304.field3182 = 0;
            }
            if (class98.field2493 == 3) {
                int var4 = class107.field2711.method322((byte) 118);
                if (var4 != 0) {
                    class75.method634(var4, (byte) 124);
                    return;
                }
                class98.field2493 = 4;
                class53.field1304.field3182 = 0;
            }
            if (class98.field2493 == 4) {
                if (class53.field1304.field3182 < 8) {
                    int var5 = class107.field2711.method327((byte) -68);
                    if (var5 > 8 - class53.field1304.field3182) {
                        var5 = 8 - class53.field1304.field3182;
                    }
                    if (var5 > 0) {
                        class107.field2711.method320(class53.field1304.field3182, class53.field1304.field3172, false, var5);
                        class53.field1304.field3182 += var5;
                    }
                }
                if (class53.field1304.field3182 == 8) {
                    class53.field1304.field3182 = 0;
                    class28.field669 = class53.field1304.method1000((byte) -58);
                    class98.field2493 = 5;
                }
            }
            if (class98.field2493 == 5) {
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class28.field669 >> 32), (int) class28.field669 };
                class92.field2333.field3182 = 0;
                class92.field2333.method993(19579, 10);
                class92.field2333.method975(var6[0], false);
                class92.field2333.method975(var6[1], false);
                class92.field2333.method975(var6[2], false);
                class92.field2333.method975(var6[3], false);
                class92.field2333.method975(class103.field2626.field1438, false);
                class92.field2333.method1018(class89.field2282.method407(true), -5952);
                class92.field2333.method980(-95, class89.field2285);
                class92.field2333.method1013(arg0 - 25947, class74.field1883, class131.field3148);
                class57.field1494.field3182 = 0;
                if (class69.field1709 == 40) {
                    class57.field1494.method993(19579, 18);
                } else {
                    class57.field1494.method993(arg0 ^ 0xFFFFB3B1, 16);
                }
                class57.field1494.method993(19579, class92.field2333.field3182 + 53);
                class57.field1494.method975(423, false);
                class57.field1494.method993(arg0 ^ 0xFFFFB3B1, class81.field2085 ? 1 : 0);
                class57.field1494.method975(class92.field2345.field2807, false);
                class57.field1494.method975(class97.field2480.field2807, false);
                class57.field1494.method975(class102.field2608.field2807, false);
                class57.field1494.method975(class5.field132.field2807, false);
                class57.field1494.method975(class105.field2699.field2807, false);
                class57.field1494.method975(class79.field1983.field2807, false);
                class57.field1494.method975(class94.field2398.field2807, false);
                class57.field1494.method975(class25.field606.field2807, false);
                class57.field1494.method975(class105.field2688.field2807, false);
                class57.field1494.method975(class48.field1204.field2807, false);
                class57.field1494.method975(class128.field3071.field2807, false);
                class57.field1494.method975(class130.field3114.field2807, false);
                class57.field1494.method989(0, class92.field2333.field3172, 1480636552, class92.field2333.field3182);
                class107.field2711.method323(0, (byte) 111, class57.field1494.field3182, class57.field1494.field3172);
                class92.field2333.method703(var6, (byte) 0);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class53.field1304.method703(var6, (byte) 0);
                class98.field2493 = 6;
            }
            if (class98.field2493 == 6 && class107.field2711.method327((byte) -68) > 0) {
                int var8 = class107.field2711.method322((byte) -48);
                if (var8 == 21 && class69.field1709 == 20) {
                    class98.field2493 = 7;
                } else if (var8 == 2) {
                    class98.field2493 = 9;
                } else if (var8 == 15 && class69.field1709 == 40) {
                    class31.method308((byte) 81);
                    return;
                } else if (var8 == 23 && class98.field2481 < 1) {
                    class98.field2493 = 0;
                    class98.field2481++;
                } else {
                    class75.method634(var8, (byte) 115);
                    return;
                }
            }
            if (class98.field2493 == 7 && class107.field2711.method327((byte) -68) > 0) {
                class86.field2189 = (class107.field2711.method322((byte) -127) + 3) * 60;
                class98.field2493 = 8;
            }
            if (class98.field2493 == 8) {
                class86.field2185 = 0;
                class2.method14(class42.field960, class21.field433, -57, class117.method903(new class44[] { class116.method893(10, class86.field2189 / 60), class75.field1912 }, false));
                if (--class86.field2189 <= 0) {
                    class98.field2493 = 0;
                }
            } else {
                if (class98.field2493 == 9 && class107.field2711.method327((byte) -68) >= 8) {
                    class51.field1240 = class107.field2711.method322((byte) 117);
                    class88.field2247 = class107.field2711.method322((byte) 112) == 1;
                    class62.field1569 = class107.field2711.method322((byte) 122);
                    class62.field1569 <<= 0x8;
                    class62.field1569 += class107.field2711.method322((byte) -48);
                    class101.field2574 = class107.field2711.method322((byte) 110);
                    class107.field2711.method320(0, class53.field1304.field3172, false, 1);
                    class53.field1304.field3182 = 0;
                    class39.field882 = class53.field1304.method701(255);
                    class107.field2711.method320(0, class53.field1304.field3172, false, 2);
                    class53.field1304.field3182 = 0;
                    class14.field275 = class53.field1304.method1001(arg0 + 65334);
                    class98.field2493 = 10;
                }
                if (class98.field2493 != 10) {
                    class86.field2185++;
                    if (arg0 != -54) {
                        method321((byte) -30);
                    }
                    if (class86.field2185 > 2000) {
                        if (class98.field2481 < 1) {
                            class98.field2481++;
                            class98.field2493 = 0;
                            if (class69.field1713 == class131.field3194) {
                                class131.field3194 = class49.field1210;
                            } else {
                                class131.field3194 = class69.field1713;
                            }
                        } else {
                            class75.method634(-3, (byte) 119);
                        }
                    }
                } else if (class107.field2711.method327((byte) -68) >= class14.field275) {
                    class53.field1304.field3182 = 0;
                    class107.field2711.method320(0, class53.field1304.field3172, false, class14.field275);
                    class2.method21((byte) -95);
                    class16.field311 = -1;
                    class39.method344(false, -102);
                    class39.field882 = -1;
                }
            }
        } catch (IOException var9) {
            if (class98.field2481 < 1) {
                if (class69.field1713 == class131.field3194) {
                    class131.field3194 = class49.field1210;
                } else {
                    class131.field3194 = class69.field1713;
                }
                class98.field2493 = 0;
                class98.field2481++;
            } else {
                class75.method634(-2, (byte) 113);
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Ljava/net/Socket;Ljb;)V", line = 1081)
    public class33(Socket arg0, class56 arg1) throws IOException {
        this.field789 = arg1;
        this.field815 = arg0;
        this.field815.setSoTimeout(30000);
        this.field815.setTcpNoDelay(true);
        this.field799 = this.field815.getInputStream();
        this.field800 = this.field815.getOutputStream();
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)I", line = 435)
    public final int method322(byte arg0) throws IOException {
        int var2 = 1 / ((arg0 - 57) / 50);
        field807++;
        return this.field793 ? 0 : this.field799.read();
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBI[B)V", line = 451)
    public final void method323(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field796++;
        if (this.field793) {
            return;
        }
        if (this.field818) {
            this.field818 = false;
            throw new IOException();
        }
        if (this.field812 == null) {
            this.field812 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field812[this.field790] = arg3[arg0 + var6];
                this.field790 = (this.field790 + 1) % 5000;
                if ((this.field819 + 4900) % 5000 == this.field790) {
                    throw new IOException();
                }
            }
            if (this.field801 == null) {
                this.field801 = this.field789.method524(3, this, (byte) 43);
            }
            this.notifyAll();
        }
        if (arg1 < 97) {
            method319(-104);
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V", line = 504)
    public static void method324(int arg0) {
        if (arg0 != -22886) {
            method325(-15, -31, 105, -1, 11, null, -65, null, -24, 11);
        }
        field814 = null;
        field787 = null;
        field806 = null;
        field785 = null;
        field811 = null;
        field804 = null;
        field810 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIILed;ILpb;II)V", line = 538)
    public static final void method325(int arg0, int arg1, int arg2, int arg3, int arg4, class29 arg5, int arg6, class92 arg7, int arg8, int arg9) {
        if (arg0 != 0) {
            return;
        }
        field816++;
        int var10 = class64.field1620[arg4][arg1][arg9];
        int var11 = class64.field1620[arg4][arg1 + 1][arg9 + 1];
        int var12 = class64.field1620[arg4][arg1 + 1][arg9];
        int var13 = class64.field1620[arg4][arg1][arg9 + 1];
        class57 var14 = class130.method965(arg2, 121);
        int var15 = (arg3 << 6) + arg8;
        int var16 = var10 + var12 + var11 + var13 >> 2;
        int var17 = (arg9 << 7) + (arg2 << 14) + arg1 + 1073741824;
        if (var14.field1460 == 0) {
            var17 += Integer.MIN_VALUE;
        }
        if (var14.field1456 == 1) {
            var15 += 256;
        }
        if (arg8 == 22) {
            class97 var18;
            if (var14.field1468 == -1 && var14.field1446 == null) {
                var18 = var14.method536(var13, var10, 4, var12, 22, arg3, var11);
            } else {
                var18 = new class25(arg2, 22, arg3, var10, var12, var11, var13, var14.field1468, true);
            }
            arg5.method265(arg6, arg1, arg9, var16, var18, var17, var15);
            if (var14.field1499 && var14.field1460 == 1) {
                arg7.method736(arg1, arg0 - 125, arg9);
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class97 var38;
            if (var14.field1468 == -1 && var14.field1446 == null) {
                var38 = var14.method536(var13, var10, 4, var12, 10, arg3, var11);
            } else {
                var38 = new class25(arg2, 10, arg3, var10, var12, var11, var13, var14.field1468, true);
            }
            if (var38 != null) {
                int var39;
                int var40;
                if (arg3 == 1 || arg3 == 3) {
                    var40 = var14.field1498;
                    var39 = var14.field1458;
                } else {
                    var39 = var14.field1498;
                    var40 = var14.field1458;
                }
                int var41 = 0;
                if (arg8 == 11) {
                    var41 += 256;
                }
                arg5.method237(arg6, arg1, arg9, var16, var39, var40, var38, var41, var17, var15);
            }
            if (var14.field1499) {
                arg7.method745(arg1, arg9, -120, var14.field1489, arg3, var14.field1498, var14.field1458);
            }
        } else if (arg8 >= 12) {
            class97 var19;
            if (var14.field1468 == -1 && var14.field1446 == null) {
                var19 = var14.method536(var13, var10, 4, var12, arg8, arg3, var11);
            } else {
                var19 = new class25(arg2, arg8, arg3, var10, var12, var11, var13, var14.field1468, true);
            }
            arg5.method237(arg6, arg1, arg9, var16, 1, 1, var19, 0, var17, var15);
            if (var14.field1499) {
                arg7.method745(arg1, arg9, -118, var14.field1489, arg3, var14.field1498, var14.field1458);
            }
        } else if (arg8 == 0) {
            class97 var20;
            if (var14.field1468 == -1 && var14.field1446 == null) {
                var20 = var14.method536(var13, var10, 4, var12, 0, arg3, var11);
            } else {
                var20 = new class25(arg2, 0, arg3, var10, var12, var11, var13, var14.field1468, true);
            }
            arg5.method264(arg6, arg1, arg9, var16, var20, null, class79.field1996[arg3], 0, var17, var15);
            if (var14.field1499) {
                arg7.method742(var14.field1489, arg1, arg8, arg9, arg3, arg0 + 1);
            }
        } else if (arg8 == 1) {
            class97 var21;
            if (var14.field1468 == -1 && var14.field1446 == null) {
                var21 = var14.method536(var13, var10, 4, var12, 1, arg3, var11);
            } else {
                var21 = new class25(arg2, 1, arg3, var10, var12, var11, var13, var14.field1468, true);
            }
            arg5.method264(arg6, arg1, arg9, var16, var21, null, class21.field443[arg3], 0, var17, var15);
            if (var14.field1499) {
                arg7.method742(var14.field1489, arg1, arg8, arg9, arg3, 1);
            }
        } else if (arg8 == 2) {
            int var22 = arg3 + 1 & 0x3;
            class97 var23;
            class97 var24;
            if (var14.field1468 == -1 && var14.field1446 == null) {
                var23 = var14.method536(var13, var10, 4, var12, 2, arg3 + 4, var11);
                var24 = var14.method536(var13, var10, arg0 ^ 0x4, var12, 2, var22, var11);
            } else {
                var23 = new class25(arg2, 2, arg3 + 4, var10, var12, var11, var13, var14.field1468, true);
                var24 = new class25(arg2, 2, var22, var10, var12, var11, var13, var14.field1468, true);
            }
            arg5.method264(arg6, arg1, arg9, var16, var23, var24, class79.field1996[arg3], class79.field1996[var22], var17, var15);
            if (var14.field1499) {
                arg7.method742(var14.field1489, arg1, arg8, arg9, arg3, 1);
            }
        } else if (arg8 == 3) {
            class97 var25;
            if (var14.field1468 == -1 && var14.field1446 == null) {
                var25 = var14.method536(var13, var10, arg0 + 4, var12, 3, arg3, var11);
            } else {
                var25 = new class25(arg2, 3, arg3, var10, var12, var11, var13, var14.field1468, true);
            }
            arg5.method264(arg6, arg1, arg9, var16, var25, null, class21.field443[arg3], 0, var17, var15);
            if (var14.field1499) {
                arg7.method742(var14.field1489, arg1, arg8, arg9, arg3, 1);
            }
        } else if (arg8 == 9) {
            class97 var26;
            if (var14.field1468 == -1 && var14.field1446 == null) {
                var26 = var14.method536(var13, var10, 4, var12, arg8, arg3, var11);
            } else {
                var26 = new class25(arg2, arg8, arg3, var10, var12, var11, var13, var14.field1468, true);
            }
            arg5.method237(arg6, arg1, arg9, var16, 1, 1, var26, 0, var17, var15);
            if (var14.field1499) {
                arg7.method745(arg1, arg9, -115, var14.field1489, arg3, var14.field1498, var14.field1458);
            }
        } else {
            if (var14.field1497) {
                if (arg3 == 1) {
                    int var27 = var13;
                    var13 = var11;
                    var11 = var12;
                    var12 = var10;
                    var10 = var27;
                } else if (arg3 == 2) {
                    int var29 = var13;
                    var13 = var12;
                    var12 = var29;
                    int var30 = var11;
                    var11 = var10;
                    var10 = var30;
                } else if (arg3 == 3) {
                    int var28 = var13;
                    var13 = var10;
                    var10 = var12;
                    var12 = var11;
                    var11 = var28;
                }
            }
            if (arg8 == 4) {
                class97 var31;
                if (var14.field1468 == -1 && var14.field1446 == null) {
                    var31 = var14.method536(var13, var10, 4, var12, 4, 0, var11);
                } else {
                    var31 = new class25(arg2, 4, 0, var10, var12, var11, var13, var14.field1468, true);
                }
                arg5.method252(arg6, arg1, arg9, var16, var31, class79.field1996[arg3], arg3 * 512, 0, 0, var17, var15);
            } else if (arg8 == 5) {
                int var32 = 16;
                int var33 = arg5.method248(arg6, arg1, arg9);
                if (var33 > 0) {
                    var32 = class130.method965(var33 >> 14 & 0x7FFF, 38).field1501;
                }
                class97 var34;
                if (var14.field1468 == -1 && var14.field1446 == null) {
                    var34 = var14.method536(var13, var10, arg0 ^ 0x4, var12, 4, 0, var11);
                } else {
                    var34 = new class25(arg2, 4, 0, var10, var12, var11, var13, var14.field1468, true);
                }
                arg5.method252(arg6, arg1, arg9, var16, var34, class79.field1996[arg3], arg3 * 512, class84.field2149[arg3] * var32, class63.field1596[arg3] * var32, var17, var15);
            } else if (arg8 == 6) {
                class97 var35;
                if (var14.field1468 == -1 && var14.field1446 == null) {
                    var35 = var14.method536(var13, var10, 4, var12, 4, 0, var11);
                } else {
                    var35 = new class25(arg2, 4, 0, var10, var12, var11, var13, var14.field1468, true);
                }
                arg5.method252(arg6, arg1, arg9, var16, var35, 256, arg3, 0, 0, var17, var15);
            } else if (arg8 == 7) {
                class97 var36;
                if (var14.field1468 == -1 && var14.field1446 == null) {
                    var36 = var14.method536(var13, var10, 4, var12, 4, 0, var11);
                } else {
                    var36 = new class25(arg2, 4, 0, var10, var12, var11, var13, var14.field1468, true);
                }
                arg5.method252(arg6, arg1, arg9, var16, var36, 512, arg3, 0, 0, var17, var15);
            } else if (arg8 == 8) {
                class97 var37;
                if (var14.field1468 == -1 && var14.field1446 == null) {
                    var37 = var14.method536(var13, var10, 4, var12, 4, 0, var11);
                } else {
                    var37 = new class25(arg2, 4, 0, var10, var12, var11, var13, var14.field1468, true);
                }
                arg5.method252(arg6, arg1, arg9, var16, var37, 768, arg3, 0, 0, var17, var15);
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIILed;[Lpb;IIII[BI)V", line = 860)
    public static final void method326(int arg0, int arg1, int arg2, class29 arg3, class92[] arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9, int arg10) {
        field788++;
        if (arg0 != 22158) {
            field787 = null;
        }
        class131 var11 = new class131(arg9);
        int var12 = -1;
        while (true) {
            int var13 = var11.method1019(174545128);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method1019(arg0 ^ 0xA670E66);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 12;
                int var18 = var14 >> 6 & 0x3F;
                int var19 = var11.method971(true);
                int var20 = var19 & 0x3;
                int var21 = var19 >> 2;
                if (arg2 == var17 && var18 >= arg1 && arg1 + 8 > var18 && var16 >= arg5 && var16 < arg5 + 8) {
                    class57 var22 = class130.method965(var12, -65);
                    int var23 = arg7 + class103.method815(var16 & 0x7, arg10, var18 & 0x7, false, var22.field1498, var20, var22.field1458);
                    int var24 = arg8 + class67.method588(var20, var22.field1498, var18 & 0x7, arg10, var16 & 0x7, (byte) -59, var22.field1458);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        int var25 = arg6;
                        class92 var26 = null;
                        if ((class104.field2668[1][var23][var24] & 0x2) == 2) {
                            var25 = arg6 - 1;
                        }
                        if (var25 >= 0) {
                            var26 = arg4[var25];
                        }
                        class97.method768(var24, arg6, var12, var21, arg10 + var20 & 0x3, var23, 1, var26, arg3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "finalize", descriptor = "()V", line = 942)
    protected final void finalize() {
        field805++;
        this.method328(256);
    }

    @OriginalMember(owner = "client!fb", name = "run", descriptor = "()V", line = 953)
    public final void run() {
        field798++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field819 == this.field790) {
                        if (this.field793) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field790 < this.field819) {
                        var2 = 5000 - this.field819;
                    } else {
                        var2 = this.field790 - this.field819;
                    }
                    var3 = this.field819;
                }
                if (var2 > 0) {
                    try {
                        this.field800.write(this.field812, var3, var2);
                    } catch (IOException var9) {
                        this.field818 = true;
                    }
                    this.field819 = (this.field819 + var2) % 5000;
                    try {
                        if (this.field819 == this.field790) {
                            this.field800.flush();
                        }
                    } catch (IOException var8) {
                        this.field818 = true;
                    }
                }
            }
            try {
                if (this.field799 != null) {
                    this.field799.close();
                }
                if (this.field800 != null) {
                    this.field800.close();
                }
                if (this.field815 != null) {
                    this.field815.close();
                }
            } catch (IOException var7) {
            }
            this.field812 = null;
        } catch (Exception var12) {
            client.method132(null, var12, (byte) 68);
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(B)I", line = 1021)
    public final int method327(byte arg0) throws IOException {
        if (arg0 != -68) {
            this.field799 = null;
        }
        field795++;
        return this.field793 ? 0 : this.field799.available();
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V", line = 1036)
    public final void method328(int arg0) {
        field817++;
        if (this.field793) {
            return;
        }
        synchronized (this) {
            this.field793 = true;
            if (arg0 != 256) {
                this.field789 = null;
            }
            this.notifyAll();
        }
        if (this.field801 != null) {
            while (this.field801.field2998 == 0) {
                class47.method447((byte) -48, 1L);
            }
            if (this.field801.field2998 == 1) {
                try {
                    ((Thread) this.field801.field2995).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field801 = null;
    }
}
