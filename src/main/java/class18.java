import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class18 implements Runnable {

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    private int field338 = 0;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "Z")
    private boolean field357 = false;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    private int field335 = 0;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Z")
    private boolean field336 = false;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "Ljava/net/Socket;")
    private Socket field362;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "Lnd;")
    private class82 field363;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "Ljava/io/InputStream;")
    private InputStream field352;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field359;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "Z")
    public static boolean field345 = true;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "Z")
    public static boolean field347 = false;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "I")
    public static int field360 = 0;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "I")
    public static int field364 = 0;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "Lpa;")
    public static class91 field361 = new class91(64);

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "I")
    public static int field368 = -1;

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "I")
    public static int field365 = 0;

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "Lec;")
    public static class28 field370 = class28.method210(-46, "(X100(U(Y");

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "Lpa;")
    public static class91 field367 = new class91(64);

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "Lec;")
    public static class28 field373 = class28.method210(-46, "From:  ");

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "Lj;")
    public static class54 field369;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "Lqb;")
    private class97 field356;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "[B")
    private byte[] field342;

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "[[Ln;")
    public static class78[][] field372;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static final void method100(int arg0) {
        field353++;
        for (int var1 = -1; var1 < class74.field1641; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class4.field66[var1];
            }
            class43 var3 = class129.field2779[var2];
            if (var3 != null) {
                class119.method881(1, var3, (byte) -68);
            }
        }
        if (arg0 != 2047) {
            method102(false, null, null);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)I")
    public final int method101(boolean arg0) throws IOException {
        if (arg0) {
            field348++;
            return this.field357 ? 0 : this.field352.read();
        } else {
            return -56;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZLvb;Lvb;)V")
    public static final void method102(boolean arg0, class122 arg1, class122 arg2) {
        class56.field1294 = arg2;
        if (arg0) {
            field368 = 98;
        }
        field354++;
        class66.field1514 = arg1;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public static void method103(byte arg0) {
        field367 = null;
        if (arg0 < 5) {
            method109((byte) -41);
        }
        field373 = null;
        field372 = null;
        field370 = null;
        field369 = null;
        field361 = null;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(Z)V")
    public final void method104(boolean arg0) {
        field358++;
        if (this.field357) {
            return;
        }
        synchronized (this) {
            this.field357 = arg0;
            this.notifyAll();
        }
        if (this.field356 != null) {
            while (this.field356.field2157 == 0) {
                class31.method247(1L, (byte) 123);
            }
            if (this.field356.field2157 == 1) {
                try {
                    ((Thread) this.field356.field2154).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field356 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IJ)V")
    public static final void method105(int arg0, long arg1) {
        field346++;
        if (arg1 == 0L) {
            return;
        }
        if (class69.field1546 >= 100) {
            class87.method645(115, class21.field454, class125.field2721, 0);
            return;
        }
        class28 var3 = class46.method365(-118, arg1).method212((byte) 124);
        for (int var4 = 0; var4 < class69.field1546; var4++) {
            if (class5.field92[var4] == arg1) {
                class87.method645(-51, class68.method537(1, new class28[] { var3, class48.field1116 }), class125.field2721, 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class36.field829; var5++) {
            if (class1.field5[var5] == arg1) {
                class87.method645(-59, class68.method537(1, new class28[] { class105.field2218, var3, class96.field2146 }), class125.field2721, 0);
                return;
            }
        }
        class5.field92[class69.field1546++] = arg1;
        class5.field80++;
        if (arg0 <= 126) {
            field360 = 12;
        }
        class30.field646 = true;
        class5.field85.method161((byte) 106, 186);
        class5.field85.method854(false, arg1);
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)I")
    public final int method106(int arg0) throws IOException {
        field349++;
        if (this.field357) {
            return 0;
        } else if (arg0 == -1) {
            return this.field352.available();
        } else {
            return -66;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIII)I")
    public static final int method107(int arg0, int arg1, int arg2, int arg3) {
        field339++;
        int var4 = arg1 >> 7;
        int var5 = arg0 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg3;
        int var7 = arg1 & 0x7F;
        if (arg3 < 3 && (class47.field1080[1][var4][var5] & 0x2) == 2) {
            var6 = arg3 + 1;
        }
        int var8 = arg0 & 0x7F;
        if (arg2 != -2049) {
            method109((byte) -117);
        }
        int var9 = (128 - var7) * class118.field2523[var6][var4][var5] + class118.field2523[var6][var4 + 1][var5] * var7 >> 7;
        int var10 = (128 - var7) * class118.field2523[var6][var4][var5 - -1] + class118.field2523[var6][var4 + 1][var5 + 1] * var7 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!ce", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field334++;
        this.method104(true);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method108(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (!class72.field1591) {
            arg4 = 0;
        }
        field350++;
        if (class90.field1994 == arg1 && class92.field2039 == arg3 && class42.field905 == arg4) {
            return;
        }
        class42.field905 = arg4;
        class90.field1994 = arg1;
        if (!arg5) {
            return;
        }
        class92.field2039 = arg3;
        class74.method574(0, 25);
        class124.method958((byte) 62, class8.field149, null, false);
        int var6 = class87.field1934;
        class87.field1934 = (arg3 - 6) * 8;
        int var7 = class87.field1934 - var6;
        int var8 = class87.field1934;
        int var9 = field366;
        field366 = arg1 * 8 - 48;
        int var10 = field366 - var9;
        int var11 = field366;
        for (int var12 = 0; var12 < 16384; var12++) {
            class90 var28 = class88.field1956[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field1487[var29] -= var10;
                    var28.field1466[var29] -= var7;
                }
                var28.field1501 -= var7 * 128;
                var28.field1446 -= var10 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class43 var26 = class129.field2779[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field1487[var27] -= var10;
                    var26.field1466[var27] -= var7;
                }
                var26.field1446 -= var10 * 128;
                var26.field1501 -= var7 * 128;
            }
        }
        byte var14 = 0;
        class122.field2657 = arg4;
        byte var15 = 104;
        class37.field848.method519(64, false, arg0, arg2);
        byte var16 = 1;
        byte var17 = 104;
        byte var18 = 1;
        byte var19 = 0;
        if (var7 < 0) {
            var18 = -1;
            var17 = -1;
            var19 = 103;
        }
        if (var10 < 0) {
            var16 = -1;
            var15 = -1;
            var14 = 103;
        }
        for (int var20 = var14; var20 != var15; var20 += var16) {
            for (int var22 = var19; var22 != var17; var22 += var18) {
                int var23 = var10 + var20;
                int var24 = var7 + var22;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        class127.field2746[var25][var20][var22] = class127.field2746[var25][var23][var24];
                    } else {
                        class127.field2746[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class109 var21 = (class109) class37.field842.method326(0); var21 != null; var21 = (class109) class37.field842.method325((byte) 119)) {
            var21.field2286 -= var10;
            var21.field2296 -= var7;
            if (var21.field2286 < 0 || var21.field2296 < 0 || var21.field2286 >= 104 || var21.field2296 >= 104) {
                var21.method319((byte) -13);
            }
        }
        if (class127.field2750 != 0) {
            class127.field2750 -= var10;
            class27.field585 -= var7;
        }
        class9.field169 = -1;
        class61.field1360 = false;
        class76.field1694.method329((byte) -57);
        class93.field2044.method329((byte) -57);
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V")
    public static final void method109(byte arg0) {
        int var1 = class56.field1282.method159(0, 8);
        field355++;
        int var2 = 111 % ((arg0 - 27) / 56);
        if (class74.field1641 > var1) {
            for (int var3 = var1; var3 < class74.field1641; var3++) {
                class17.field327[class91.field2003++] = class4.field66[var3];
            }
        }
        if (class74.field1641 < var1) {
            throw new RuntimeException("gppov1");
        }
        class74.field1641 = 0;
        for (int var4 = 0; var4 < var1; var4++) {
            int var5 = class4.field66[var4];
            class43 var6 = class129.field2779[var5];
            int var7 = class56.field1282.method159(0, 1);
            if (var7 == 0) {
                class4.field66[class74.field1641++] = var5;
                var6.field1458 = class83.field1888;
            } else {
                int var8 = class56.field1282.method159(0, 2);
                if (var8 == 0) {
                    class4.field66[class74.field1641++] = var5;
                    var6.field1458 = class83.field1888;
                    class25.field557[class16.field306++] = var5;
                } else if (var8 == 1) {
                    class4.field66[class74.field1641++] = var5;
                    var6.field1458 = class83.field1888;
                    int var9 = class56.field1282.method159(0, 3);
                    var6.method523(var9, false, -2);
                    int var10 = class56.field1282.method159(0, 1);
                    if (var10 == 1) {
                        class25.field557[class16.field306++] = var5;
                    }
                } else if (var8 == 2) {
                    class4.field66[class74.field1641++] = var5;
                    var6.field1458 = class83.field1888;
                    int var11 = class56.field1282.method159(0, 3);
                    var6.method523(var11, true, -2);
                    int var12 = class56.field1282.method159(0, 3);
                    var6.method523(var12, true, -2);
                    int var13 = class56.field1282.method159(0, 1);
                    if (var13 == 1) {
                        class25.field557[class16.field306++] = var5;
                    }
                } else if (var8 == 3) {
                    class17.field327[class91.field2003++] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "([BIBI)V")
    public final void method110(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field343++;
        if (this.field357) {
            return;
        }
        if (this.field336) {
            this.field336 = false;
            throw new IOException();
        }
        if (this.field342 == null) {
            this.field342 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field342[this.field338] = arg0[arg1 + var6];
                this.field338 = (this.field338 + 1) % 5000;
                if ((this.field335 + 4900) % 5000 == this.field338) {
                    throw new IOException();
                }
            }
            if (this.field356 == null) {
                this.field356 = this.field363.method617(this, -10172, 3);
            }
            this.notifyAll();
            if (arg2 >= -35) {
                field368 = -40;
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIIIII)Z")
    public static final boolean method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 != -1) {
            field366 = -102;
        }
        field337++;
        if (!class37.method305(-1, arg2)) {
            return false;
        }
        class120.method918(arg0, arg4, arg6, arg5);
        class78[] var9 = field372[arg2];
        boolean var10 = true;
        for (int var11 = 0; var11 < var9.length; var11++) {
            class78 var12 = var9[var11];
            if (var12 != null && var12.field1787 == arg8) {
                if (var12.field1796 > 0) {
                    class48.method388(var12, (byte) -106);
                }
                int var13 = var12.field1783 + arg0;
                int var14 = var12.field1788 + arg4 - arg3;
                if (var12.field1757 == 0) {
                    if (var12.field1802 && !class62.method500(arg1 ^ 0xFFFFFFAD, var11, arg7)) {
                        continue;
                    }
                    if (var12.field1742 > var12.field1756 - var12.field1765) {
                        var12.field1742 = var12.field1756 - var12.field1765;
                    }
                    if (var12.field1742 < 0) {
                        var12.field1742 = 0;
                    }
                    var10 &= method111(var13, -1, arg2, var12.field1742, var14, var14 + var12.field1765, var12.field1790 + var13, arg7, var11);
                    class120.method918(arg0, arg4, arg6, arg5);
                    if (var12.field1765 < var12.field1756) {
                        class86.method640((byte) -89, var12.field1742, var12.field1790 + var13, var12.field1756, var14, var12.field1765);
                    }
                }
                if (var12.field1757 != 1) {
                    if (var12.field1757 == 2) {
                        int var15 = 0;
                        for (int var16 = 0; var16 < var12.field1765; var16++) {
                            for (int var17 = 0; var17 < var12.field1790; var17++) {
                                int var18 = var13 + (var12.field1814 + 32) * var17;
                                int var19 = (var12.field1775 + 32) * var16 + var14;
                                if (var15 < 20) {
                                    var19 += var12.field1749[var15];
                                    var18 += var12.field1794[var15];
                                }
                                if (var12.field1795[var15] > 0) {
                                    int var20 = 0;
                                    int var21 = 0;
                                    int var22 = var12.field1795[var15] - 1;
                                    if (var18 > class120.field2596 - 32 && class120.field2590 > var18 && var19 > class120.field2593 - 32 && var19 < class120.field2592 || class79.field1839 != 0 && class87.field1933 == var15) {
                                        int var23 = 0;
                                        if (class76.field1691 == 1 && class79.field1825 == var15 && (arg2 << 16) + var11 == class51.field1198) {
                                            var23 = 16777215;
                                        }
                                        class26 var24 = class3.method21(var22, arg1 + 32, var23, var12.field1792[var15]);
                                        if (var24 == null) {
                                            var10 = false;
                                        } else {
                                            if (class79.field1839 != 0 && class87.field1933 == var15 && (arg2 << 16) + var11 == class65.field1490) {
                                                var21 = class88.field1960 - class98.field2173;
                                                var20 = class23.field530 - class94.field2074;
                                                if (var20 < 5 && var20 > -5) {
                                                    var20 = 0;
                                                }
                                                if (var21 < 5 && var21 > -5) {
                                                    var21 = 0;
                                                }
                                                if (class78.field1744 < 5) {
                                                    var20 = 0;
                                                    var21 = 0;
                                                }
                                                var24.method193(var18 + var20, var19 + var21, 128);
                                                if (arg8 != -1) {
                                                    class78 var25 = var9[arg8];
                                                    if (class120.field2593 > var19 + var21 && var25.field1742 > 0) {
                                                        int var26 = (class120.field2593 - var21 - var19) * class12.field197 / 3;
                                                        if (var26 > class12.field197 * 10) {
                                                            var26 = class12.field197 * 10;
                                                        }
                                                        if (var26 > var25.field1742) {
                                                            var26 = var25.field1742;
                                                        }
                                                        class98.field2173 += var26;
                                                        var25.field1742 -= var26;
                                                    }
                                                    if (class120.field2592 < var21 + var19 + 32 && var25.field1742 < var25.field1756 - var25.field1765) {
                                                        int var27 = (var21 + var19 + 32 - class120.field2592) * class12.field197 / 3;
                                                        if (class12.field197 * 10 < var27) {
                                                            var27 = class12.field197 * 10;
                                                        }
                                                        if (var25.field1756 - var25.field1765 - var25.field1742 < var27) {
                                                            var27 = var25.field1756 - var25.field1765 - var25.field1742;
                                                        }
                                                        var25.field1742 += var27;
                                                        class98.field2173 -= var27;
                                                    }
                                                }
                                            } else if (class69.field1545 != 0 && class118.field2515 == var15 && (arg2 << 16) + var11 == class53.field1226) {
                                                var24.method193(var18, var19, 128);
                                            } else {
                                                var24.method188(var18, var19);
                                            }
                                            if (var24.field566 == 33 || var12.field1792[var15] != 1) {
                                                int var28 = var12.field1792[var15];
                                                class124.field2700.method449(class47.method383(arg1 ^ 0xFFFFFF99, var28), var20 + var18 + 1, var19 + 10 + var21, 0);
                                                class124.field2700.method449(class47.method383(arg1 + 43, var28), var18 + var20, var19 + var21 + 9, 16776960);
                                            }
                                        }
                                    }
                                } else if (var12.field1769 != null && var15 < 20) {
                                    class26 var29 = var12.method593(var15, -1);
                                    if (var29 != null) {
                                        var29.method188(var18, var19);
                                    } else if (field347) {
                                        var10 = false;
                                    }
                                }
                                var15++;
                            }
                        }
                    } else if (var12.field1757 == 3) {
                        int var30;
                        if (class15.method84(var12, true)) {
                            var30 = var12.field1755;
                            if (class62.method500(84, var11, arg7) && var12.field1785 != 0) {
                                var30 = var12.field1785;
                            }
                        } else {
                            var30 = var12.field1761;
                            if (class62.method500(100, var11, arg7) && var12.field1745 != 0) {
                                var30 = var12.field1745;
                            }
                        }
                        if (var12.field1753 == 0) {
                            if (var12.field1754) {
                                class120.method915(var13, var14, var12.field1790, var12.field1765, var30);
                            } else {
                                class120.method911(var13, var14, var12.field1790, var12.field1765, var30);
                            }
                        } else if (var12.field1754) {
                            class120.method917(var13, var14, var12.field1790, var12.field1765, var30, 256 - (var12.field1753 & 0xFF));
                        } else {
                            class120.method910(var13, var14, var12.field1790, var12.field1765, var30, 256 - (var12.field1753 & 0xFF));
                        }
                    } else if (var12.field1757 == 4) {
                        class54 var31 = class47.field1076[var12.field1815];
                        class28 var32 = var12.field1803;
                        int var33;
                        if (class15.method84(var12, true)) {
                            var33 = var12.field1755;
                            if (class62.method500(82, var11, arg7) && var12.field1785 != 0) {
                                var33 = var12.field1785;
                            }
                            if (var12.field1766.method214(119) > 0) {
                                var32 = var12.field1766;
                            }
                        } else {
                            var33 = var12.field1761;
                            if (class62.method500(90, var11, arg7) && var12.field1745 != 0) {
                                var33 = var12.field1745;
                            }
                        }
                        if (var12.field1806 == 6 && class36.field794) {
                            var32 = class2.field20;
                            var33 = var12.field1761;
                        }
                        if (class120.field2591 == 479) {
                            if (var33 == 16776960) {
                                var33 = 255;
                            }
                            if (var33 == 49152) {
                                var33 = 16777215;
                            }
                        }
                        class28 var34 = class63.method507(var12, 68, var32);
                        int var35 = var14 + var31.field1255;
                        while (var34.method214(-119) > 0) {
                            int var36 = var34.method203(class74.field1638, (byte) -71);
                            class28 var37;
                            if (var36 == -1) {
                                var37 = var34;
                                var34 = class125.field2721;
                            } else {
                                var37 = var34.method228(var36, true, 0);
                                var34 = var34.method218(var36 + 2, false);
                            }
                            if (var12.field1772) {
                                var31.method433(var37, var12.field1790 / 2 + var13, var35, var33, var12.field1776);
                            } else {
                                var31.method441(var37, var13, var35, var33, var12.field1776);
                            }
                            var35 += var31.field1255;
                        }
                    } else if (var12.field1757 == 5) {
                        class26 var38 = var12.method594((byte) 36, class15.method84(var12, true));
                        if (var38 != null) {
                            var38.method188(var13, var14);
                        } else if (field347) {
                            var10 = false;
                        }
                    } else if (var12.field1757 == 6) {
                        class60.method492(var13 + var12.field1790 / 2, var12.field1765 / 2 + var14);
                        int var39 = class60.field1323[var12.field1771] * var12.field1750 >> 16;
                        int var40 = class60.field1326[var12.field1771] * var12.field1750 >> 16;
                        boolean var41 = class15.method84(var12, true);
                        int var42;
                        if (var41) {
                            var42 = var12.field1759;
                        } else {
                            var42 = var12.field1797;
                        }
                        class33 var44;
                        if (var12.field1746 == 5) {
                            var44 = class49.field1144.method814(3582, null, -1, -1, null);
                        } else if (var42 == -1) {
                            var44 = var12.method597(null, var41, -1, class37.field848.field936, -1);
                            if (var44 == null && field347) {
                                var10 = false;
                            }
                        } else {
                            class13 var43 = class23.method166(0, var42);
                            var44 = var12.method597(var43, var41, var12.field1762, class37.field848.field936, arg1);
                            if (var44 == null && field347) {
                                var10 = false;
                            }
                        }
                        if (var44 != null) {
                            var44.method258(0, var12.field1773, 0, var12.field1771, 0, var40, var39);
                        }
                        class60.method479();
                    } else {
                        if (var12.field1757 == 7) {
                            class54 var45 = class47.field1076[var12.field1815];
                            int var46 = 0;
                            for (int var47 = 0; var47 < var12.field1765; var47++) {
                                for (int var48 = 0; var48 < var12.field1790; var48++) {
                                    if (var12.field1795[var46] > 0) {
                                        class129 var49 = class129.method992(var12.field1795[var46] - 1, -86);
                                        class28 var50 = var49.field2765;
                                        if (var50 == null) {
                                            var50 = class122.field2641;
                                        }
                                        if (var49.field2801 || var12.field1792[var46] != 1) {
                                            var50 = class68.method537(1, new class28[] { var50, client.field402, class79.method603(var12.field1792[var46], true) });
                                        }
                                        int var51 = var14 + (var12.field1775 + 12) * var47;
                                        int var52 = var13 + (var12.field1814 + 115) * var48;
                                        if (var12.field1772) {
                                            var45.method433(var50, var52 + var12.field1790 / 2, var51, var12.field1761, var12.field1776);
                                        } else {
                                            var45.method441(var50, var52, var51, var12.field1761, var12.field1776);
                                        }
                                    }
                                    var46++;
                                }
                            }
                        }
                        if (var12.field1757 == 8 && class27.method198(var11, 463, arg7) && class123.field2669 == 100) {
                            int var53 = 0;
                            class54 var54 = class124.field2697;
                            class28 var55 = var12.field1803;
                            class28 var56 = class63.method507(var12, 96, var55);
                            int var57 = 0;
                            while (var56.method214(arg1 - 121) > 0) {
                                int var65 = var56.method203(class74.field1638, (byte) -71);
                                class28 var66;
                                if (var65 == -1) {
                                    var66 = var56;
                                    var56 = class125.field2721;
                                } else {
                                    var66 = var56.method228(var65, true, 0);
                                    var56 = var56.method218(var65 + 2, false);
                                }
                                int var67 = var54.method446(var66);
                                if (var67 > var53) {
                                    var53 = var67;
                                }
                                var57 += var54.field1255 + 1;
                            }
                            var53 += 6;
                            int var58 = var12.field1790 + var13 - var53 - 5;
                            if (var58 < var13 + 5) {
                                var58 = var13 + 5;
                            }
                            if (var58 + var53 > arg6) {
                                var58 = arg6 - var53;
                            }
                            var57 += 7;
                            int var59 = var12.field1765 + var14 + 5;
                            if (var57 + var59 > arg5) {
                                var59 = arg5 - var57;
                            }
                            class120.method915(var58, var59, var53, var57, 16777120);
                            class120.method911(var58, var59, var53, var57, 0);
                            class28 var60 = var12.field1803;
                            int var61 = var54.field1255 + var59 + 2;
                            class28 var62 = class63.method507(var12, 63, var60);
                            while (var62.method214(116) > 0) {
                                int var63 = var62.method203(class74.field1638, (byte) -71);
                                class28 var64;
                                if (var63 == -1) {
                                    var64 = var62;
                                    var62 = class125.field2721;
                                } else {
                                    var64 = var62.method228(var63, true, 0);
                                    var62 = var62.method218(var63 + 2, false);
                                }
                                var54.method441(var64, var58 + 3, var61, 0, false);
                                var61 += var54.field1255 + 1;
                            }
                        }
                    }
                }
            }
        }
        return var10;
    }

    @OriginalMember(owner = "client!ce", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field338 == this.field335) {
                            if (this.field357) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field335 > this.field338) {
                            var2 = 5000 - this.field335;
                        } else {
                            var2 = this.field338 - this.field335;
                        }
                        var3 = this.field335;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field359.write(this.field342, var3, var2);
                    } catch (IOException var9) {
                        this.field336 = true;
                    }
                    this.field335 = (this.field335 + var2) % 5000;
                    try {
                        if (this.field338 == this.field335) {
                            this.field359.flush();
                        }
                    } catch (IOException var8) {
                        this.field336 = true;
                    }
                    continue;
                }
                try {
                    if (this.field352 != null) {
                        this.field352.close();
                    }
                    if (this.field359 != null) {
                        this.field359.close();
                    }
                    if (this.field362 != null) {
                        this.field362.close();
                    }
                } catch (IOException var7) {
                }
                this.field342 = null;
                break;
            }
        } catch (Exception var12) {
            class119.method884(32, var12, null);
        }
        field344++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III[B)V")
    public final void method112(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field351++;
        if (this.field357) {
            return;
        }
        if (arg0 != -1527) {
            method103((byte) 25);
        }
        while (arg2 > 0) {
            int var5 = this.field352.read(arg3, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Ljava/net/Socket;Lnd;)V")
    public class18(Socket arg0, class82 arg1) throws IOException {
        this.field362 = arg0;
        this.field363 = arg1;
        this.field362.setSoTimeout(30000);
        this.field362.setTcpNoDelay(true);
        this.field352 = this.field362.getInputStream();
        this.field359 = this.field362.getOutputStream();
    }
}
