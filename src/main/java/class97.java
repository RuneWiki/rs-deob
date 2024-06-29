import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class97 {

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "Lqk;")
    private class1 field1543 = new class1();

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "Lqk;")
    private class1 field1549 = new class1();

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "Lqk;")
    private class1 field1550 = new class1();

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "Lqk;")
    private class1 field1553 = new class1();

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "Ls;")
    private class170 field1563 = new class170(4);

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    public volatile int field1566 = 0;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
    public volatile int field1564 = 0;

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "B")
    private byte field1565 = 0;

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "Ls;")
    private class170 field1567 = new class170(8);

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1541 = Calendar.getInstance();

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "Ltl;")
    public static class59 field1548 = class85.method639("document)3cookie=(R", 9588);

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "Lqk;")
    public static class1 field1547 = new class1();

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "[Ltl;")
    public static class59[] field1560 = new class59[200];

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "Z")
    public static boolean field1562 = false;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "I")
    private int field1554;

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "J")
    private long field1556;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "Lki;")
    public static class166 field1559;

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "Lmb;")
    private class171 field1557;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "Lim;")
    public static class175 field1555;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "Lbc;")
    private class7 field1568;

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "[[[I")
    public static int[][][] field1558;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)V", line = 4)
    private final void method728(boolean arg0) {
        field1539++;
        if (this.field1557 == null) {
            return;
        }
        try {
            this.field1563.field2787 = 0;
            this.field1563.method1219(6, arg0);
            this.field1563.method1255(3, (byte) 126);
            this.field1557.method1267(this.field1563.field2758, 4, 0, (byte) 56);
        } catch (IOException var5) {
            try {
                this.field1557.method1257(1185568552);
            } catch (Exception var4) {
            }
            this.field1557 = null;
            this.field1564 = -2;
            this.field1566++;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZ)V", line = 29)
    public static final void method729(int arg0, boolean arg1) {
        if ((class286.field4920.field1774 >> 7) == class72.field1123 && class286.field4920.field1769 >> 7 == class18.field227) {
            class72.field1123 = 0;
        }
        field1542++;
        int var2 = class29.field385;
        if (arg1) {
            var2 = 1;
        }
        if (arg0 != -11564) {
            return;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            long var4;
            class102 var6;
            if (arg1) {
                var4 = 8791798054912L;
                var6 = class286.field4920;
            } else {
                var6 = class211.field3438[class243.field4060[var3]];
                var4 = (long) class243.field4060[var3] << 32;
            }
            if (var6 != null && var6.method149((byte) 104)) {
                int var7 = var6.field1774 >> 7;
                var6.field1697 = false;
                int var8 = var6.field1769 >> 7;
                if ((class300.field5124 && class29.field385 > 200 || class29.field385 > 50) && !arg1 && var6.field1767 == var6.field1720) {
                    var6.field1697 = true;
                }
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var6.field1662 == null || class30.field420 < var6.field1684 || class30.field420 >= var6.field1661) {
                        if (var6.method776(true) == 1 && (var6.field1774 & 0x7F) == 64 && (var6.field1769 & 0x7F) == 64) {
                            if (class310.field5253[var7][var8] == class178.field2914) {
                                continue;
                            }
                            class310.field5253[var7][var8] = class178.field2914;
                        }
                        var6.field1753 = class73.method589(class247.field4119, true, var6.field1774, var6.field1769);
                        class262.method1807(class247.field4119, var6.field1774, var6.field1769, var6.field1753, var6.method776(true) * 64 + 60 - 64, var6, var6.field1765, var4, var6.field1731);
                    } else {
                        var6.field1697 = false;
                        var6.field1753 = class73.method589(class247.field4119, true, var6.field1774, var6.field1769);
                        class121.method902(class247.field4119, var6.field1774, var6.field1769, var6.field1753, var6, var6.field1765, var4, var6.field1696, var6.field1682, var6.field1665, var6.field1680);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(Z)V", line = 116)
    public final void method730(boolean arg0) {
        field1528++;
        if (this.field1557 == null) {
            return;
        }
        try {
            this.field1563.field2787 = 0;
            this.field1563.method1219(7, arg0);
            this.field1563.method1255(0, (byte) 126);
            this.field1557.method1267(this.field1563.field2758, 4, 0, (byte) 56);
        } catch (IOException var5) {
            try {
                this.field1557.method1257(1185568552);
            } catch (Exception var4) {
            }
            this.field1566++;
            this.field1564 = -2;
            this.field1557 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(Z)I", line = 140)
    private final int method731(boolean arg0) {
        field1534++;
        return arg0 ? -126 : this.field1550.method4(0) + this.field1553.method4(0);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V", line = 153)
    public final void method732(byte arg0) {
        field1533++;
        if (arg0 < 80) {
            method742((byte) -31, (byte[]) null);
        }
        if (this.field1557 != null) {
            this.field1557.method1257(1185568552);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)Z", line = 166)
    public final boolean method733(int arg0) {
        if (arg0 <= 69) {
            this.field1565 = 86;
        }
        field1545++;
        return this.method731(false) >= 20;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)V", line = 178)
    public static final void method734(byte arg0, int arg1) {
        class22 var2 = (class22) class238.field3969.method685((long) arg1, 128);
        field1551++;
        if (arg0 != 18) {
            field1547 = (class1) null;
        }
        if (var2 != null) {
            var2.method2000(arg0 - 24);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZLjava/lang/String;)Ltl;", line = 195)
    public static final class59 method735(boolean arg0, String arg1) {
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg1.getBytes();
        }
        field1540++;
        if (!arg0) {
            field1561 = 62;
        }
        class59 var4 = new class59();
        var4.field889 = var2;
        var4.field863 = 0;
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var4.field863++] = var2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZIBI)Lbc;", line = 228)
    public final class7 method736(int arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        field1527++;
        long var6 = (long) ((arg2 << 16) + arg0);
        class7 var8 = new class7();
        var8.field1569 = arg1;
        var8.field87 = arg3;
        if (arg4 != -2) {
            field1560 = (class59[]) null;
        }
        var8.field2264 = var6;
        if (arg1) {
            if (this.method744((byte) -122) >= 20) {
                throw new RuntimeException();
            }
            this.field1543.method6(var8, -106);
        } else if (this.method731(false) < 20) {
            this.field1550.method6(var8, -95);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)V", line = 276)
    public final void method737(byte arg0) {
        try {
            this.field1557.method1257(arg0 + 1185568609);
        } catch (Exception var3) {
        }
        if (arg0 != -57) {
            field1555 = (class175) null;
        }
        field1546++;
        this.field1564 = -1;
        this.field1557 = null;
        this.field1565 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field1566++;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIII)I", line = 294)
    public static final int method738(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field1552++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg1;
        } else if (arg0 == var4) {
            return 7 - arg2;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZZ)V", line = 312)
    public final void method739(boolean arg0, boolean arg1) {
        field1532++;
        if (this.field1557 == null) {
            return;
        }
        try {
            this.field1563.field2787 = 0;
            this.field1563.method1219(arg1 ? 2 : 3, arg0);
            this.field1563.method1255(0, (byte) 126);
            this.field1557.method1267(this.field1563.field2758, 4, 0, (byte) 56);
        } catch (IOException var6) {
            try {
                this.field1557.method1257(1185568552);
            } catch (Exception var5) {
            }
            this.field1566++;
            this.field1564 = -2;
            this.field1557 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V", line = 338)
    public final void method740(int arg0) {
        int var2 = 74 % ((-arg0 - 45) / 32);
        field1535++;
        if (this.field1557 != null) {
            this.field1557.method1260(16711680);
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)V", line = 350)
    public static void method741(int arg0) {
        if (arg0 != 20599) {
            field1555 = (class175) null;
        }
        field1541 = null;
        field1555 = null;
        field1559 = null;
        field1558 = (int[][][]) null;
        field1560 = null;
        field1548 = null;
        field1547 = null;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B[B)[B", line = 367)
    public static final byte[] method742(byte arg0, byte[] arg1) {
        field1531++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        if (arg0 > -22) {
            method746(93, 111, -1, 43, -127, -67);
        }
        class63.method520(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(I)Z", line = 384)
    public final boolean method743(int arg0) {
        field1536++;
        if (this.field1557 != null) {
            long var2 = class205.method1451(20);
            int var4 = (int) (var2 - this.field1556);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field1554 += var4;
            this.field1556 = var2;
            if (this.field1554 > 30000) {
                try {
                    this.field1557.method1257(1185568552);
                } catch (Exception var30) {
                }
                this.field1557 = null;
            }
        }
        if (this.field1557 == null) {
            return this.method744((byte) -122) == 0 && this.method731(false) == 0;
        }
        try {
            this.field1557.method1265(false);
            for (class7 var6 = (class7) this.field1543.method7(arg0 ^ 0xFFFFFF80); var6 != null; var6 = (class7) this.field1543.method1((byte) 121)) {
                this.field1563.field2787 = 0;
                this.field1563.method1219(1, true);
                this.field1563.method1255((int) var6.field2264, (byte) 126);
                this.field1557.method1267(this.field1563.field2758, 4, 0, (byte) 56);
                this.field1549.method6(var6, -90);
            }
            for (class7 var7 = (class7) this.field1550.method7(-77); var7 != null; var7 = (class7) this.field1550.method1((byte) 109)) {
                this.field1563.field2787 = 0;
                this.field1563.method1219(0, true);
                this.field1563.method1255((int) var7.field2264, (byte) 126);
                this.field1557.method1267(this.field1563.field2758, 4, 0, (byte) 56);
                this.field1553.method6(var7, -67);
            }
            for (int var8 = arg0; var8 < 100; var8++) {
                int var9 = this.field1557.method1256(95);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field1554 = 0;
                byte var10 = 0;
                if (this.field1568 == null) {
                    var10 = 8;
                } else if (this.field1568.field91 == 0) {
                    var10 = 1;
                }
                if (var10 <= 0) {
                    int var11 = 512 - this.field1568.field91;
                    int var12 = this.field1568.field81.field2758.length - this.field1568.field87;
                    if ((var12 - this.field1568.field81.field2787) < var11) {
                        var11 = var12 - this.field1568.field81.field2787;
                    }
                    if (var9 < var11) {
                        var11 = var9;
                    }
                    this.field1557.method1268(false, this.field1568.field81.field2758, var11, this.field1568.field81.field2787);
                    if (this.field1565 != 0) {
                        for (int var13 = 0; var13 < var11; var13++) {
                            this.field1568.field81.field2758[this.field1568.field81.field2787 + var13] = (byte) class310.method2143(this.field1568.field81.field2758[this.field1568.field81.field2787 + var13], this.field1565);
                        }
                    }
                    this.field1568.field91 += var11;
                    this.field1568.field81.field2787 += var11;
                    if (this.field1568.field81.field2787 == var12) {
                        this.field1568.method997(arg0 - 110);
                        this.field1568.field1577 = false;
                        this.field1568 = null;
                    } else if (this.field1568.field91 == 512) {
                        this.field1568.field91 = 0;
                    }
                } else {
                    int var14 = var10 - this.field1567.field2787;
                    if (var9 < var14) {
                        var14 = var9;
                    }
                    this.field1557.method1268(false, this.field1567.field2758, var14, this.field1567.field2787);
                    if (this.field1565 != 0) {
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field1567.field2758[this.field1567.field2787 + var15] = (byte) class310.method2143(this.field1567.field2758[this.field1567.field2787 + var15], this.field1565);
                        }
                    }
                    this.field1567.field2787 += var14;
                    if (this.field1567.field2787 >= var10) {
                        if (this.field1568 == null) {
                            this.field1567.field2787 = 0;
                            int var16 = this.field1567.method1221(114);
                            int var17 = this.field1567.method1214(-18254);
                            int var18 = this.field1567.method1221(100);
                            int var19 = this.field1567.method1233((byte) -77);
                            int var20 = var18 & 0x7F;
                            long var21 = (long) ((var16 << 16) + var17);
                            boolean var23 = (var18 & 0x80) != 0;
                            Object var24 = null;
                            class7 var25;
                            if (var23) {
                                for (var25 = (class7) this.field1553.method7(arg0 - 48); var25 != null && var25.field2264 != var21; var25 = (class7) this.field1553.method1((byte) 118)) {
                                }
                            } else {
                                for (var25 = (class7) this.field1549.method7(-39); var25 != null && var25.field2264 != var21; var25 = (class7) this.field1549.method1((byte) 110)) {
                                }
                            }
                            if (var25 == null) {
                                throw new IOException();
                            }
                            this.field1568 = var25;
                            int var26 = var20 == 0 ? 5 : 9;
                            this.field1568.field81 = new class170(var19 + var26 + this.field1568.field87);
                            this.field1568.field81.method1219(var20, true);
                            this.field1568.field81.method1213(-1, var19);
                            this.field1567.field2787 = 0;
                            this.field1568.field91 = 8;
                        } else if (this.field1568.field91 != 0) {
                            throw new IOException();
                        } else if (this.field1567.field2758[0] == -1) {
                            this.field1567.field2787 = 0;
                            this.field1568.field91 = 1;
                        } else {
                            this.field1568 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field1557.method1257(1185568552);
            } catch (Exception var29) {
            }
            this.field1564 = -2;
            this.field1566++;
            this.field1557 = null;
            return this.method744((byte) -122) == 0 && this.method731(false) == 0;
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(B)I", line = 660)
    public final int method744(byte arg0) {
        if (arg0 == -122) {
            field1529++;
            return this.field1543.method4(0) + this.field1549.method4(0);
        } else {
            return -65;
        }
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(B)Z", line = 671)
    public final boolean method745(byte arg0) {
        if (arg0 != -26) {
            this.method739(true, true);
        }
        field1530++;
        return this.method744((byte) -122) >= 20;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIII)V", line = 702)
    public static final void method746(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class73.field1158 = arg5;
        field1537++;
        class314.field5316 = arg4;
        class120.field2003 = arg0;
        class310.field5267 = arg1;
        class283.field4866 = arg2;
        if (class314.field5316 >= 100) {
            int var6 = class283.field4866 * 128 + 64;
            int var7 = class73.field1158 * 128 + 64;
            int var8 = class73.method589(class247.field4119, true, var6, var7) - class310.field5267;
            int var9 = var6 - class226.field3640;
            int var10 = var8 - class185.field3109;
            int var11 = var7 - class216.field3528;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class100.field1627 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class58.field853 = (int) (-325.949D * Math.atan2((double) var9, (double) var11)) & 0x7FF;
            if (class100.field1627 < 128) {
                class100.field1627 = 128;
            }
            if (class100.field1627 > 383) {
                class100.field1627 = 383;
            }
        }
        class266.field4585 = 2;
        if (arg3 != 128) {
            field1548 = (class59) null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lmb;ZI)V", line = 754)
    public final void method747(class171 arg0, boolean arg1, int arg2) {
        field1538++;
        if (arg2 != 8) {
            this.method743(-128);
        }
        if (this.field1557 != null) {
            try {
                this.field1557.method1257(1185568552);
            } catch (Exception var11) {
            }
            this.field1557 = null;
        }
        this.field1557 = arg0;
        this.method728(true);
        this.method739(true, arg1);
        this.field1567.field2787 = 0;
        this.field1568 = null;
        while (true) {
            class7 var5 = (class7) this.field1549.method3(0);
            if (var5 == null) {
                while (true) {
                    class7 var6 = (class7) this.field1553.method3(0);
                    if (var6 == null) {
                        if (this.field1565 != 0) {
                            try {
                                this.field1563.field2787 = 0;
                                this.field1563.method1219(4, true);
                                this.field1563.method1219(this.field1565, true);
                                this.field1563.method1237(true, 0);
                                this.field1557.method1267(this.field1563.field2758, 4, 0, (byte) 56);
                            } catch (IOException var10) {
                                try {
                                    this.field1557.method1257(1185568552);
                                } catch (Exception var9) {
                                }
                                this.field1564 = -2;
                                this.field1557 = null;
                                this.field1566++;
                            }
                        }
                        this.field1554 = 0;
                        this.field1556 = class205.method1451(123);
                        return;
                    }
                    this.field1550.method6(var6, arg2 - 89);
                }
            }
            this.field1543.method6(var5, -106);
        }
    }
}
