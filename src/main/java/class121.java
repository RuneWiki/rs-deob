import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class121 {

    @OriginalMember(owner = "client!km", name = "w", descriptor = "I")
    public int field1583;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "[B")
    private byte[] field1573;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "[Lnaa;")
    public static class669[] field1575 = new class669[8];

    @OriginalMember(owner = "client!km", name = "s", descriptor = "Ltt;")
    public static class338 field1579 = new class338(12, 11);

    @OriginalMember(owner = "client!km", name = "y", descriptor = "I")
    public static int field1585 = 0;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public int field1564;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!km", name = "r", descriptor = "I")
    public int field1578;

    @OriginalMember(owner = "client!km", name = "v", descriptor = "I")
    public int field1582;

    @OriginalMember(owner = "client!km", name = "z", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!km", name = "A", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!km", name = "B", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "Lpr;")
    public class328 field1563;

    @OriginalMember(owner = "client!km", name = "u", descriptor = "Lf;")
    public static class532 field1581;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "[I")
    public int[] field1562;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "[I")
    public int[] field1566;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "[I")
    public int[] field1569;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "[I")
    public int[] field1570;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "[I")
    public int[] field1572;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "[I")
    public int[] field1576;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "[Lpr;")
    public class328[] field1574;

    @OriginalMember(owner = "client!km", name = "x", descriptor = "[[B")
    public byte[][] field1584;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "[[I")
    public int[][] field1565;

    @OriginalMember(owner = "client!km", name = "t", descriptor = "[[I")
    public int[][] field1580;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)I", line = 4)
    public static final int method712(int arg0, int arg1, String arg2, String arg3) {
        field1568++;
        int var4 = arg3.length();
        int var5 = arg2.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while ((var6 - var8) < var4 || (var7 - var9) < var5) {
            if (var4 <= (var6 - var8)) {
                return -1;
            }
            if ((var7 - var9) >= var5) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg3.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg2.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class183.method1216(-339, var22);
            var9 = class183.method1216(arg1 + 6260, var24);
            char var26 = class610.method3381(4, var22, arg0);
            char var27 = class610.method3381(30, var24, arg0);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class267.method1595(var28, arg1 ^ 0xFFFFB7FD, arg0) - class267.method1595(var29, 20932, arg0);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg0 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg3.charAt(var17);
            char var19 = arg2.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class267.method1595(var20, 20932, arg0) - class267.method1595(var21, 20932, arg0);
                }
            }
        }
        if (arg1 != -6599) {
            field1585 = -118;
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg3.charAt(var13);
            char var15 = arg2.charAt(var13);
            if (var14 != var15) {
                return class267.method1595(var14, arg1 ^ 0xFFFFB7FD, arg0) - class267.method1595(var15, 20932, arg0);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V", line = 137)
    public static final void method713(int arg0) {
        field1577++;
        class322.method1865(5088);
        class59.field745 = null;
        class54.field704 = null;
        class610.field8468 = null;
        int var1 = -8 / ((arg0 - 5) / 48);
        class569.field7760 = null;
        class494.field6810 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BLgba;)[Lwn;", line = 154)
    public static final class232[] method714(byte arg0, class388 arg1) {
        field1571++;
        if (!arg1.method2227((byte) -120)) {
            return new class232[0];
        }
        class661 var2 = arg1.method2232(false);
        if (arg0 != -83) {
            field1575 = null;
        }
        while (var2.field9420 == 0) {
            class588.method3253(0, 10L);
        }
        if (var2.field9420 == 2) {
            return new class232[0];
        }
        int[] var3 = (int[]) var2.field9421;
        class232[] var4 = new class232[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class232 var6 = new class232();
            var4[var5] = var6;
            var6.field3101 = var3[var5 << 2];
            var6.field3099 = var3[(var5 << 2) + 1];
            var6.field3097 = var3[(var5 << 2) + 2];
            var6.field3098 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V", line = 206)
    public static void method715(byte arg0) {
        field1579 = null;
        field1581 = null;
        if (arg0 != 34) {
            field1585 = -31;
        }
        field1575 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I[B)V", line = 223)
    private final void method716(int arg0, byte[] arg1) {
        field1561++;
        class157 var3 = new class157(class209.method1326(0, arg1));
        int var4 = var3.method930(255);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field1578 = var3.method908(false);
        } else {
            this.field1578 = 0;
        }
        int var5 = var3.method930(255);
        boolean var6 = (var5 & 0x1) != 0;
        this.field1582 = var3.method963(arg0 ^ 0x3577);
        boolean var7 = (var5 & 0x2) != 0;
        int var8 = 0;
        int var9 = -1;
        this.field1569 = new int[this.field1582];
        for (int var10 = 0; var10 < this.field1582; var10++) {
            this.field1569[var10] = var8 += var3.method963(arg0 + 13461);
            if (var9 < this.field1569[var10]) {
                var9 = this.field1569[var10];
            }
        }
        this.field1564 = var9 + 1;
        this.field1570 = new int[this.field1564];
        this.field1572 = new int[this.field1564];
        this.field1562 = new int[this.field1564];
        this.field1565 = new int[this.field1564][];
        this.field1576 = new int[this.field1564];
        if (var7) {
            this.field1584 = new byte[this.field1564][];
        }
        if (var6) {
            this.field1566 = new int[this.field1564];
            for (int var11 = 0; var11 < this.field1564; var11++) {
                this.field1566[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field1582; var12++) {
                this.field1566[this.field1569[var12]] = var3.method908(false);
            }
            this.field1563 = new class328(this.field1566);
        }
        for (int var13 = 0; var13 < this.field1582; var13++) {
            this.field1562[this.field1569[var13]] = var3.method908(false);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field1582; var14++) {
                byte[] var15 = new byte[64];
                var3.method962(var15, arg0 + 13701, 64, 0);
                this.field1584[this.field1569[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field1582; var16++) {
            this.field1572[this.field1569[var16]] = var3.method908(false);
        }
        for (int var17 = 0; var17 < this.field1582; var17++) {
            this.field1570[this.field1569[var17]] = var3.method963(-118);
        }
        for (int var18 = 0; var18 < this.field1582; var18++) {
            int var25 = this.field1569[var18];
            int var26 = 0;
            int var27 = this.field1570[var25];
            this.field1565[var25] = new int[var27];
            int var28 = -1;
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = this.field1565[var25][var29] = var26 += var3.method963(-125);
                if (var28 < var30) {
                    var28 = var30;
                }
            }
            this.field1576[var25] = var28 + 1;
            if (var28 + 1 == var27) {
                this.field1565[var25] = null;
            }
        }
        if (var6) {
            this.field1580 = new int[var9 + 1][];
            this.field1574 = new class328[var9 + 1];
            for (int var19 = 0; var19 < this.field1582; var19++) {
                int var20 = this.field1569[var19];
                int var21 = this.field1570[var20];
                this.field1580[var20] = new int[this.field1576[var20]];
                for (int var22 = 0; var22 < this.field1576[var20]; var22++) {
                    this.field1580[var20][var22] = -1;
                }
                for (int var23 = 0; var23 < var21; var23++) {
                    int var24;
                    if (this.field1565[var20] == null) {
                        var24 = var23;
                    } else {
                        var24 = this.field1565[var20][var23];
                    }
                    this.field1580[var20][var24] = var3.method908(false);
                }
                this.field1574[var20] = new class328(this.field1580[var20]);
            }
        }
        if (arg0 != -13583) {
            method712(44, 98, null, null);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 422)
    public static final String method717(String arg0, int arg1) {
        field1588++;
        String var2 = class216.method1371(class633.method3510(-28, arg0), (byte) 76);
        if (arg1 == 9240) {
            if (var2 == null) {
                var2 = "";
            }
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "([BI[B)V", line = 438)
    public class121(byte[] arg0, int arg1, byte[] arg2) {
        this.field1583 = class77.method420(-3282, arg0, arg0.length);
        if (this.field1583 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field1573 = class286.method1695(arg0.length, arg0, 0, 122);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field1573[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method716(-13583, arg0);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IZ)V", line = 483)
    public static final void method718(int arg0, boolean arg1) {
        field1567++;
        if (!arg1) {
            return;
        }
        if (arg0 == 37) {
            class672.field9562 = 3.0F;
        } else if (arg0 == 50) {
            class672.field9562 = 4.0F;
        } else if (arg0 == 75) {
            class672.field9562 = 6.0F;
        } else if (arg0 == 100) {
            class672.field9562 = 8.0F;
        } else if (arg0 == 200) {
            class672.field9562 = 16.0F;
        }
        class68.field827 = -1;
        class68.field827 = -1;
    }
}
