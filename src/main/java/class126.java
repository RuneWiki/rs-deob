import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class126 extends class60 {

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "B")
    private byte field2117 = 0;

    @OriginalMember(owner = "client!ml", name = "U", descriptor = "I")
    private int field2132 = 0;

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "I")
    public int field2120 = 0;

    @OriginalMember(owner = "client!ml", name = "Z", descriptor = "B")
    private byte field2137 = 0;

    @OriginalMember(owner = "client!ml", name = "ib", descriptor = "Z")
    public boolean field2146 = false;

    @OriginalMember(owner = "client!ml", name = "bb", descriptor = "I")
    private int field2139 = 0;

    @OriginalMember(owner = "client!ml", name = "ab", descriptor = "[I")
    private int[] field2138;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "[I")
    public int[] field2109;

    @OriginalMember(owner = "client!ml", name = "L", descriptor = "[I")
    public int[] field2124;

    @OriginalMember(owner = "client!ml", name = "gb", descriptor = "[I")
    public int[] field2144;

    @OriginalMember(owner = "client!ml", name = "S", descriptor = "[I")
    private int[] field2130;

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "[S")
    private short[] field2116;

    @OriginalMember(owner = "client!ml", name = "db", descriptor = "[S")
    private short[] field2141;

    @OriginalMember(owner = "client!ml", name = "eb", descriptor = "[S")
    private short[] field2142;

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "[S")
    private short[] field2119;

    @OriginalMember(owner = "client!ml", name = "P", descriptor = "[F")
    private float[] field2128;

    @OriginalMember(owner = "client!ml", name = "cb", descriptor = "[F")
    private float[] field2140;

    @OriginalMember(owner = "client!ml", name = "T", descriptor = "[S")
    private short[] field2131;

    @OriginalMember(owner = "client!ml", name = "R", descriptor = "[B")
    private byte[] field2129;

    @OriginalMember(owner = "client!ml", name = "M", descriptor = "[S")
    private short[] field2125;

    @OriginalMember(owner = "client!ml", name = "J", descriptor = "[S")
    private short[] field2122;

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "[S")
    private short[] field2112;

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "[S")
    private short[] field2115;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "[B")
    private byte[] field2107;

    @OriginalMember(owner = "client!ml", name = "Y", descriptor = "Lm;")
    public class44 field2136;

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "Lea;")
    public class193 field2121;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "Lea;")
    private class193 field2113;

    @OriginalMember(owner = "client!ml", name = "X", descriptor = "Lea;")
    private class193 field2135;

    @OriginalMember(owner = "client!ml", name = "O", descriptor = "Lea;")
    private class193 field2127;

    @OriginalMember(owner = "client!ml", name = "K", descriptor = "Lea;")
    private class193 field2123;

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "S")
    private short field2118;

    @OriginalMember(owner = "client!ml", name = "jb", descriptor = "S")
    private short field2147;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "[S")
    private short[] field2108;

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "[I")
    private int[] field2111;

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "Lbg;")
    private static class194 field2114 = new class194(10000);

    @OriginalMember(owner = "client!ml", name = "hb", descriptor = "Lml;")
    private static class126 field2145 = new class126();

    @OriginalMember(owner = "client!ml", name = "lb", descriptor = "Lml;")
    private static class126 field2149 = new class126();

    @OriginalMember(owner = "client!ml", name = "mb", descriptor = "Lml;")
    private static class126 field2150 = new class126();

    @OriginalMember(owner = "client!ml", name = "nb", descriptor = "Lml;")
    private static class126 field2151 = new class126();

    @OriginalMember(owner = "client!ml", name = "ob", descriptor = "[I")
    private static int[] field2152 = new int[1];

    @OriginalMember(owner = "client!ml", name = "xb", descriptor = "[I")
    private static int[] field2161 = new int[1];

    @OriginalMember(owner = "client!ml", name = "pb", descriptor = "F")
    private static float field2153;

    @OriginalMember(owner = "client!ml", name = "qb", descriptor = "F")
    private static float field2154;

    @OriginalMember(owner = "client!ml", name = "rb", descriptor = "F")
    private static float field2155;

    @OriginalMember(owner = "client!ml", name = "tb", descriptor = "F")
    private static float field2157;

    @OriginalMember(owner = "client!ml", name = "ub", descriptor = "F")
    private static float field2158;

    @OriginalMember(owner = "client!ml", name = "vb", descriptor = "F")
    private static float field2159;

    @OriginalMember(owner = "client!ml", name = "sb", descriptor = "I")
    private static int field2156;

    @OriginalMember(owner = "client!ml", name = "wb", descriptor = "I")
    private static int field2160;

    @OriginalMember(owner = "client!ml", name = "yb", descriptor = "I")
    private static int field2162;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "Lam;")
    private class244 field2110;

    @OriginalMember(owner = "client!ml", name = "V", descriptor = "Lfk;")
    private class41 field2133;

    @OriginalMember(owner = "client!ml", name = "fb", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2143;

    @OriginalMember(owner = "client!ml", name = "W", descriptor = "[J")
    private static long[] field2134;

    @OriginalMember(owner = "client!ml", name = "N", descriptor = "[[I")
    private int[][] field2126;

    @OriginalMember(owner = "client!ml", name = "kb", descriptor = "[[I")
    private int[][] field2148;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "()I", line = 5)
    public final int method205() {
        if (!this.field2136.field893) {
            this.method772();
        }
        return this.field2136.field891;
    }

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "()I", line = 13)
    public final int method182() {
        if (!this.field2136.field893) {
            this.method772();
        }
        return this.field2136.field892;
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V", line = 21)
    public final void method181(int arg0) {
        int var2 = class141.field2424[arg0];
        int var3 = class141.field2411[arg0];
        for (int var4 = 0; var4 < this.field2120; var4++) {
            int var5 = this.field2124[var4] * var2 + this.field2109[var4] * var3 >> 16;
            this.field2124[var4] = this.field2124[var4] * var3 - this.field2109[var4] * var2 >> 16;
            this.field2109[var4] = var5;
        }
        this.field2136.field893 = false;
        this.field2121.field3344 = false;
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(III)V", line = 42)
    public final void method213(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2120; var4++) {
            this.field2109[var4] = this.field2109[var4] * arg0 >> 7;
            this.field2124[var4] = this.field2124[var4] * arg1 >> 7;
            this.field2144[var4] = this.field2144[var4] * arg2 >> 7;
        }
        this.field2136.field893 = false;
        this.field2121.field3344 = false;
    }

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "()V", line = 55)
    private final void method769() {
        if (field2114.field3417.length < this.field2139 * 12) {
            field2114 = new class194((this.field2139 + 100) * 12);
        } else {
            field2114.field3380 = 0;
        }
        if (class247.field4235) {
            for (int var1 = 0; var1 < this.field2132; var1++) {
                field2114.method1337(-58, this.field2125[var1]);
                field2114.method1337(-87, this.field2122[var1]);
                field2114.method1337(-75, this.field2112[var1]);
            }
        } else {
            for (int var2 = 0; var2 < this.field2132; var2++) {
                field2114.method1333(this.field2125[var2], (byte) -124);
                field2114.method1333(this.field2122[var2], (byte) 74);
                field2114.method1333(this.field2112[var2], (byte) 62);
            }
        }
        if (!class247.field4248) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field2114.field3380);
            var5.put(field2114.field3417, 0, field2114.field3380);
            var5.flip();
            this.field2123.field3344 = true;
            this.field2123.field3342 = var5;
            this.field2123.field3340 = null;
            return;
        }
        class244 var3 = new class244();
        ByteBuffer var4 = ByteBuffer.wrap(field2114.field3417, 0, field2114.field3380);
        var3.method1662(var4);
        this.field2123.field3344 = true;
        this.field2123.field3342 = null;
        this.field2123.field3340 = var3;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lme;I)V", line = 114)
    public final void method203(class178 arg0, int arg1) {
        if (this.field2126 == null || arg1 == -1) {
            return;
        }
        class73 var3 = arg0.field3132[arg1];
        class58 var4 = var3.field1356;
        field2162 = 0;
        field2156 = 0;
        field2160 = 0;
        for (int var5 = 0; var5 < var3.field1354; var5++) {
            short var6 = var3.field1357[var5];
            if (var4.field1102[var6]) {
                if (var3.field1351[var5] != -1) {
                    this.method776(0, 0, 0, 0);
                }
                this.method776(var4.field1107[var6], var3.field1355[var5], var3.field1358[var5], var3.field1352[var5]);
            }
        }
        this.field2121.field3344 = false;
        this.field2136.field893 = false;
    }

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "()V", line = 150)
    private final void method770() {
        GL var1 = class247.field4253;
        if (this.field2132 == 0) {
            return;
        }
        if (this.field2137 != 0) {
            this.method785(true, !this.field2121.field3344 && (this.field2137 & 0x1) != 0, !this.field2113.field3344 && (this.field2137 & 0x2) != 0, this.field2135 != null && !this.field2135.field3344 && (this.field2137 & 0x4) != 0, false);
        }
        this.method785(false, !this.field2121.field3344, !this.field2113.field3344, this.field2135 != null && !this.field2135.field3344, !this.field2127.field3344);
        if (!this.field2123.field3344) {
            this.method769();
        }
        if (this.field2117 != 0) {
            if ((this.field2117 & 0x1) != 0) {
                this.field2109 = null;
                this.field2124 = null;
                this.field2144 = null;
                this.field2108 = null;
                this.field2138 = null;
            }
            if ((this.field2117 & 0x2) != 0) {
                this.field2131 = null;
                this.field2129 = null;
            }
            if ((this.field2117 & 0x4) != 0) {
                this.field2116 = null;
                this.field2141 = null;
                this.field2142 = null;
                this.field2119 = null;
            }
            if ((this.field2117 & 0x8) != 0) {
                this.field2128 = null;
                this.field2140 = null;
            }
            if ((this.field2117 & 0x10) != 0) {
                this.field2125 = null;
                this.field2122 = null;
                this.field2112 = null;
            }
            this.field2117 = 0;
        }
        class244 var2 = null;
        if (this.field2121.field3340 != null) {
            this.field2121.field3340.method1661();
            var2 = this.field2121.field3340;
            var1.glVertexPointer(3, 5126, this.field2121.field3341, (long) this.field2121.field3334);
        }
        if (this.field2113.field3340 != null) {
            if (this.field2113.field3340 != var2) {
                this.field2113.field3340.method1661();
                var2 = this.field2113.field3340;
            }
            var1.glColorPointer(4, 5121, this.field2113.field3341, (long) this.field2113.field3334);
        }
        if (class90.field1536 && this.field2135.field3340 != null) {
            if (this.field2135.field3340 != var2) {
                this.field2135.field3340.method1661();
                var2 = this.field2135.field3340;
            }
            var1.glNormalPointer(5126, this.field2135.field3341, (long) this.field2135.field3334);
        }
        if (this.field2127.field3340 != null) {
            if (this.field2127.field3340 != var2) {
                this.field2127.field3340.method1661();
                class244 var3 = this.field2127.field3340;
            }
            var1.glTexCoordPointer(2, 5126, this.field2127.field3341, (long) this.field2127.field3334);
        }
        if (this.field2123.field3340 != null) {
            this.field2123.field3340.method1660();
        }
        if (this.field2121.field3340 == null || this.field2113.field3340 == null || class90.field1536 && this.field2135.field3340 == null || this.field2127.field3340 == null) {
            if (class247.field4248) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field2121.field3340 == null) {
                this.field2121.field3342.position(this.field2121.field3334);
                var1.glVertexPointer(3, 5126, this.field2121.field3341, this.field2121.field3342);
            }
            if (this.field2113.field3340 == null) {
                this.field2113.field3342.position(this.field2113.field3334);
                var1.glColorPointer(4, 5121, this.field2113.field3341, this.field2113.field3342);
            }
            if (class90.field1536 && this.field2135.field3340 == null) {
                this.field2135.field3342.position(this.field2135.field3334);
                var1.glNormalPointer(5126, this.field2135.field3341, this.field2135.field3342);
            }
            if (this.field2127.field3340 == null) {
                this.field2127.field3342.position(this.field2127.field3334);
                var1.glTexCoordPointer(2, 5126, this.field2127.field3341, this.field2127.field3342);
            }
        }
        if (this.field2123.field3340 == null && class247.field4248) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field2111.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field2111[var5];
            int var7 = this.field2111[var5 + 1];
            short var8 = this.field2115[var6];
            if (var8 == -1) {
                class247.method1691(-1);
                class217.method1498((byte) -29, 0, 0);
            } else {
                class141.field2419.method99(var8 & 0xFFFF, (byte) -37);
            }
            if (this.field2123.field3340 == null) {
                this.field2123.field3342.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field2123.field3342);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "()V", line = 323)
    public final void method189() {
        for (int var1 = 0; var1 < this.field2120; var1++) {
            this.field2109[var1] = -this.field2109[var1];
            this.field2144[var1] = -this.field2144[var1];
        }
        this.field2136.field893 = false;
        this.field2121.field3344 = false;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "()Z", line = 335)
    public final boolean method771() {
        return this.field2146 && this.field2109 != null && this.field2116 != null;
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "()V", line = 341)
    public final void method197() {
        for (int var1 = 0; var1 < this.field2120; var1++) {
            int var2 = this.field2109[var1];
            this.field2109[var1] = this.field2144[var1];
            this.field2144[var1] = -var2;
        }
        this.field2136.field893 = false;
        this.field2121.field3344 = false;
    }

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "()V", line = 357)
    private final void method772() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field2120; var9++) {
            int var10 = this.field2109[var9];
            int var11 = this.field2124[var9];
            int var12 = this.field2144[var9];
            if (var10 < var1) {
                var1 = var10;
            }
            if (var10 > var4) {
                var4 = var10;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = var10 * var10 + var12 * var12;
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var10 * var10 + var12 * var12;
            if (var14 > var8) {
                var8 = var14;
            }
        }
        this.field2136.field891 = (short) var1;
        this.field2136.field894 = (short) var4;
        this.field2136.field895 = (short) var2;
        this.field2136.field890 = (short) var5;
        this.field2136.field892 = (short) var3;
        this.field2136.field889 = (short) var6;
        this.field2136.field896 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field2136.field893 = true;
    }

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "()I", line = 427)
    public final int method773() {
        return this.field2118;
    }

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "()V", line = 430)
    public final void method774() {
        if (this.field2116 == null) {
            this.method192();
            return;
        }
        for (int var1 = 0; var1 < this.field2120; var1++) {
            int var2 = this.field2144[var1];
            this.field2144[var1] = this.field2109[var1];
            this.field2109[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field2139; var3++) {
            short var4 = this.field2142[var3];
            this.field2142[var3] = this.field2116[var3];
            this.field2116[var3] = (short) (-var4);
        }
        this.field2136.field893 = false;
        this.field2121.field3344 = false;
        if (this.field2135 != null) {
            this.field2135.field3344 = false;
        }
    }

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "()I", line = 467)
    public final int method211() {
        if (!this.field2136.field893) {
            this.method772();
        }
        return this.field2136.field896;
    }

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "()V", line = 475)
    public final void method775() {
        for (int var1 = 0; var1 < this.field2120; var1++) {
            this.field2144[var1] = -this.field2144[var1];
        }
        if (this.field2142 != null) {
            for (int var2 = 0; var2 < this.field2139; var2++) {
                this.field2142[var2] = (short) (-this.field2142[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field2132; var3++) {
            short var4 = this.field2125[var3];
            this.field2125[var3] = this.field2112[var3];
            this.field2112[var3] = var4;
        }
        this.field2136.field893 = false;
        this.field2121.field3344 = false;
        if (this.field2135 != null) {
            this.field2135.field3344 = false;
        }
        this.field2123.field3344 = false;
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "()V", line = 513)
    public final void method192() {
        for (int var1 = 0; var1 < this.field2120; var1++) {
            int var2 = this.field2144[var1];
            this.field2144[var1] = this.field2109[var1];
            this.field2109[var1] = -var2;
        }
        this.field2136.field893 = false;
        this.field2121.field3344 = false;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lme;ILme;I[IZ)V", line = 529)
    public final void method194(class178 arg0, int arg1, class178 arg2, int arg3, int[] arg4, boolean arg5) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method198(arg0, arg1, arg5);
            return;
        }
        class73 var7 = arg0.field3132[arg1];
        class73 var8 = arg2.field3132[arg3];
        class58 var9 = var7.field1356;
        for (int var10 = 0; var10 < this.field2120; var10++) {
            this.field2109[var10] <<= 0x4;
            this.field2124[var10] <<= 0x4;
            this.field2144[var10] <<= 0x4;
        }
        field2162 = 0;
        field2156 = 0;
        field2160 = 0;
        byte var11 = 0;
        int var20 = var11 + 1;
        int var12 = arg4[var11];
        for (int var13 = 0; var13 < var7.field1354; var13++) {
            short var14 = var7.field1357[var13];
            while (var14 > var12) {
                var12 = arg4[var20++];
            }
            if (var12 != var14 || var9.field1107[var14] == 0) {
                if (var7.field1351[var13] != -1) {
                    this.method784(0, var9.field1112[var7.field1351[var13]], 0, 0, 0, arg5);
                }
                this.method784(var9.field1107[var14], var9.field1112[var14], var7.field1355[var13], var7.field1358[var13], var7.field1352[var13], arg5);
            }
        }
        field2162 = 0;
        field2156 = 0;
        field2160 = 0;
        byte var15 = 0;
        int var21 = var15 + 1;
        int var16 = arg4[var15];
        for (int var17 = 0; var17 < var8.field1354; var17++) {
            short var18 = var8.field1357[var17];
            while (var18 > var16) {
                var16 = arg4[var21++];
            }
            if (var16 == var18 || var9.field1107[var18] == 0) {
                if (var8.field1351[var17] != -1) {
                    this.method784(0, var9.field1112[var8.field1351[var17]], 0, 0, 0, arg5);
                }
                this.method784(var9.field1107[var18], var9.field1112[var18], var8.field1355[var17], var8.field1358[var17], var8.field1352[var17], arg5);
            }
        }
        for (int var19 = 0; var19 < this.field2120; var19++) {
            this.field2109[var19] >>= 0x4;
            this.field2124[var19] >>= 0x4;
            this.field2144[var19] >>= 0x4;
        }
        this.field2136.field893 = false;
        this.field2121.field3344 = false;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIII)V", line = 624)
    private final void method776(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field2162 = 0;
            field2156 = 0;
            field2160 = 0;
            for (int var6 = 0; var6 < this.field2120; var6++) {
                field2162 += this.field2109[var6];
                field2156 += this.field2124[var6];
                field2160 += this.field2144[var6];
                var5++;
            }
            if (var5 > 0) {
                field2162 = field2162 / var5 + arg1;
                field2156 = field2156 / var5 + arg2;
                field2160 = field2160 / var5 + arg3;
            } else {
                field2162 = arg1;
                field2156 = arg2;
                field2160 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field2120; var7++) {
                this.field2109[var7] += arg1;
                this.field2124[var7] += arg2;
                this.field2144[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field2120; var8++) {
                this.field2109[var8] -= field2162;
                this.field2124[var8] -= field2156;
                this.field2144[var8] -= field2160;
                if (arg3 != 0) {
                    int var9 = class141.field2424[arg3];
                    int var10 = class141.field2411[arg3];
                    int var11 = this.field2124[var8] * var9 + this.field2109[var8] * var10 + 32767 >> 16;
                    this.field2124[var8] = this.field2124[var8] * var10 + 32767 - this.field2109[var8] * var9 >> 16;
                    this.field2109[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class141.field2424[arg1];
                    int var13 = class141.field2411[arg1];
                    int var14 = this.field2124[var8] * var13 + 32767 - this.field2144[var8] * var12 >> 16;
                    this.field2144[var8] = this.field2144[var8] * var13 + this.field2124[var8] * var12 + 32767 >> 16;
                    this.field2124[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class141.field2424[arg2];
                    int var16 = class141.field2411[arg2];
                    int var17 = this.field2144[var8] * var15 + this.field2109[var8] * var16 + 32767 >> 16;
                    this.field2144[var8] = this.field2144[var8] * var16 + 32767 - this.field2109[var8] * var15 >> 16;
                    this.field2109[var8] = var17;
                }
                this.field2109[var8] += field2162;
                this.field2124[var8] += field2156;
                this.field2144[var8] += field2160;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field2120; var18++) {
                this.field2109[var18] -= field2162;
                this.field2124[var18] -= field2156;
                this.field2144[var18] -= field2160;
                this.field2109[var18] = this.field2109[var18] * arg1 / 128;
                this.field2124[var18] = this.field2124[var18] * arg2 / 128;
                this.field2144[var18] = this.field2144[var18] * arg3 / 128;
                this.field2109[var18] += field2162;
                this.field2124[var18] += field2156;
                this.field2144[var18] += field2160;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field2132; var19++) {
                int var20 = (this.field2129[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field2129[var19] = (byte) var20;
            }
            this.field2113.field3344 = false;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZZZZZZZZZZZ)Lml;", line = 779)
    public final class126 method777(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class126 var12 = new class126();
        var12.field2120 = this.field2120;
        var12.field2139 = this.field2139;
        var12.field2132 = this.field2132;
        if (arg0) {
            var12.field2109 = this.field2109;
            var12.field2144 = this.field2144;
        } else {
            var12.field2109 = class273.method1915(-26424, this.field2109);
            var12.field2144 = class273.method1915(-26424, this.field2144);
        }
        if (arg1) {
            var12.field2124 = this.field2124;
        } else {
            var12.field2124 = class273.method1915(-26424, this.field2124);
        }
        if (arg0 && arg1) {
            var12.field2121 = this.field2121;
            var12.field2136 = this.field2136;
        } else {
            var12.field2121 = new class193();
            var12.field2136 = new class44();
        }
        if (arg2) {
            var12.field2131 = this.field2131;
        } else {
            var12.field2131 = client.method1656(this.field2131, (byte) 118);
        }
        if (arg3) {
            var12.field2129 = this.field2129;
        } else {
            var12.field2129 = class279.method1954(false, this.field2129);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class90.field1536) {
            var12.field2113 = new class193();
        } else {
            var12.field2113 = this.field2113;
        }
        if (arg5) {
            var12.field2116 = this.field2116;
            var12.field2141 = this.field2141;
            var12.field2142 = this.field2142;
            var12.field2119 = this.field2119;
        } else {
            var12.field2116 = client.method1656(this.field2116, (byte) 118);
            var12.field2141 = client.method1656(this.field2141, (byte) 118);
            var12.field2142 = client.method1656(this.field2142, (byte) 118);
            var12.field2119 = client.method1656(this.field2119, (byte) 118);
        }
        if (!class90.field1536) {
            var12.field2135 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field2135 = this.field2135;
        } else {
            var12.field2135 = new class193();
        }
        if (arg8) {
            var12.field2128 = this.field2128;
            var12.field2140 = this.field2140;
            var12.field2127 = this.field2127;
        } else {
            var12.field2128 = class260.method1823(0, this.field2128);
            var12.field2140 = class260.method1823(0, this.field2140);
            var12.field2127 = new class193();
        }
        if (arg9) {
            var12.field2125 = this.field2125;
            var12.field2122 = this.field2122;
            var12.field2112 = this.field2112;
            var12.field2123 = this.field2123;
        } else {
            var12.field2125 = client.method1656(this.field2125, (byte) 118);
            var12.field2122 = client.method1656(this.field2122, (byte) 118);
            var12.field2112 = client.method1656(this.field2112, (byte) 118);
            var12.field2123 = new class193();
        }
        if (arg10) {
            var12.field2115 = this.field2115;
        } else {
            var12.field2115 = client.method1656(this.field2115, (byte) 118);
        }
        var12.field2130 = this.field2130;
        var12.field2126 = this.field2126;
        var12.field2107 = this.field2107;
        var12.field2148 = this.field2148;
        var12.field2111 = this.field2111;
        var12.field2108 = this.field2108;
        var12.field2138 = this.field2138;
        var12.field2118 = this.field2118;
        var12.field2147 = this.field2147;
        return var12;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIII[FIF)V", line = 915)
    private static final void method778(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
        int var9 = arg0 - arg3;
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg5;
        float var12 = arg6[2] * (float) var11 + arg6[0] * (float) var9 + arg6[1] * (float) var10;
        float var13 = arg6[5] * (float) var11 + arg6[3] * (float) var9 + arg6[4] * (float) var10;
        float var14 = arg6[8] * (float) var11 + arg6[6] * (float) var9 + arg6[7] * (float) var10;
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = (float) Math.atan2((double) var12, (double) var14) / 6.2831855F + 0.5F;
        float var17 = (float) Math.asin((double) (var13 / var15)) / 3.1415927F + arg8 + 0.5F;
        if (arg7 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg7 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field2153 = var16;
        field2158 = var17;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljm;IIIZ)V", line = 959)
    public final void method779(class226 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class126 var6 = (class126) arg0;
        if (this.field2132 == 0 || var6.field2132 == 0) {
            return;
        }
        int var7 = var6.field2120;
        int[] var8 = var6.field2109;
        int[] var9 = var6.field2124;
        int[] var10 = var6.field2144;
        short[] var11 = var6.field2116;
        short[] var12 = var6.field2141;
        short[] var13 = var6.field2142;
        short[] var14 = var6.field2119;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field2133 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field2133.field849;
            var16 = this.field2133.field850;
            var17 = this.field2133.field847;
            var18 = this.field2133.field848;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field2133 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field2133.field849;
            var20 = var6.field2133.field850;
            var21 = var6.field2133.field847;
            var22 = var6.field2133.field848;
        }
        int[] var23 = var6.field2138;
        short[] var24 = var6.field2108;
        if (!var6.field2136.field893) {
            var6.method772();
        }
        short var25 = var6.field2136.field895;
        short var26 = var6.field2136.field890;
        short var27 = var6.field2136.field891;
        short var28 = var6.field2136.field894;
        short var29 = var6.field2136.field892;
        short var30 = var6.field2136.field889;
        for (int var31 = 0; var31 < this.field2120; var31++) {
            int var32 = this.field2124[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field2109[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field2144[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field2138[var31];
                        int var37 = this.field2138[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field2108[var38] - 1;
                            if (var35 == -1 || this.field2119[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var15 == null) {
                                            this.field2133 = new class41();
                                            var15 = this.field2133.field849 = client.method1656(this.field2116, (byte) 118);
                                            var16 = this.field2133.field850 = client.method1656(this.field2141, (byte) 118);
                                            var17 = this.field2133.field847 = client.method1656(this.field2142, (byte) 118);
                                            var18 = this.field2133.field848 = client.method1656(this.field2119, (byte) 118);
                                        }
                                        if (var19 == null) {
                                            class41 var44 = var6.field2133 = new class41();
                                            var19 = var44.field849 = client.method1656(var11, (byte) 118);
                                            var20 = var44.field850 = client.method1656(var12, (byte) 118);
                                            var21 = var44.field847 = client.method1656(var13, (byte) 118);
                                            var22 = var44.field848 = client.method1656(var14, (byte) 118);
                                        }
                                        short var45 = this.field2116[var35];
                                        short var46 = this.field2141[var35];
                                        short var47 = this.field2142[var35];
                                        short var48 = this.field2119[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var40];
                                        short var54 = var12[var40];
                                        short var55 = var13[var40];
                                        short var56 = var14[var40];
                                        int var57 = this.field2138[var31];
                                        int var58 = this.field2138[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field2108[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var15[var60] += var53;
                                                var16[var60] += var54;
                                                var17[var60] += var55;
                                                var18[var60] += var56;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)Ljm;", line = 1196)
    public final class226 method780(int arg0, int arg1, int arg2) {
        this.field2146 = false;
        if (this.field2133 != null) {
            this.field2116 = this.field2133.field849;
            this.field2141 = this.field2133.field850;
            this.field2142 = this.field2133.field847;
            this.field2119 = this.field2133.field848;
            this.field2133 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)V", line = 1213)
    public final void method781(int arg0) {
        if (this.field2116 == null) {
            this.method195(arg0);
            return;
        }
        int var2 = class141.field2424[arg0];
        int var3 = class141.field2411[arg0];
        for (int var4 = 0; var4 < this.field2120; var4++) {
            int var5 = this.field2144[var4] * var2 + this.field2109[var4] * var3 >> 16;
            this.field2144[var4] = this.field2144[var4] * var3 - this.field2109[var4] * var2 >> 16;
            this.field2109[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field2139; var6++) {
            int var7 = this.field2142[var6] * var2 + this.field2116[var6] * var3 >> 16;
            this.field2142[var6] = (short) (this.field2142[var6] * var3 - this.field2116[var6] * var2 >> 16);
            this.field2116[var6] = (short) var7;
        }
        this.field2136.field893 = false;
        this.field2121.field3344 = false;
        if (this.field2135 != null) {
            this.field2135.field3344 = false;
        }
    }

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "()V", line = 1254)
    public static void method782() {
        field2134 = null;
        field2114 = null;
        field2143 = null;
        field2145 = null;
        field2149 = null;
        field2150 = null;
        field2151 = null;
        field2152 = null;
        field2161 = null;
    }

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "()I", line = 1266)
    public final int method783() {
        return this.field2147;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I[IIIIZ)V", line = 1270)
    private final void method784(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field2162 = 0;
            field2156 = 0;
            field2160 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field2126.length) {
                    int[] var14 = this.field2126[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field2162 += this.field2109[var16];
                        field2156 += this.field2124[var16];
                        field2160 += this.field2144[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field2162 = field2162 / var11 + var8;
                field2156 = field2156 / var11 + var9;
                field2160 = field2160 / var11 + var10;
            } else {
                field2162 = var8;
                field2156 = var9;
                field2160 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field2126.length) {
                    int[] var22 = this.field2126[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field2109[var24] += var17;
                        this.field2124[var24] += var18;
                        this.field2144[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field2126.length) {
                    int[] var27 = this.field2126[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field2109[var29] -= field2162;
                        this.field2124[var29] -= field2156;
                        this.field2144[var29] -= field2160;
                        if (arg4 != 0) {
                            int var30 = class141.field2424[arg4];
                            int var31 = class141.field2411[arg4];
                            int var32 = this.field2124[var29] * var30 + this.field2109[var29] * var31 + 32767 >> 16;
                            this.field2124[var29] = this.field2124[var29] * var31 + 32767 - this.field2109[var29] * var30 >> 16;
                            this.field2109[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class141.field2424[arg2];
                            int var34 = class141.field2411[arg2];
                            int var35 = this.field2124[var29] * var34 + 32767 - this.field2144[var29] * var33 >> 16;
                            this.field2144[var29] = this.field2144[var29] * var34 + this.field2124[var29] * var33 + 32767 >> 16;
                            this.field2124[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class141.field2424[arg3];
                            int var37 = class141.field2411[arg3];
                            int var38 = this.field2144[var29] * var36 + this.field2109[var29] * var37 + 32767 >> 16;
                            this.field2144[var29] = this.field2144[var29] * var37 + 32767 - this.field2109[var29] * var36 >> 16;
                            this.field2109[var29] = var38;
                        }
                        this.field2109[var29] += field2162;
                        this.field2124[var29] += field2156;
                        this.field2144[var29] += field2160;
                    }
                }
            }
            if (arg5 && this.field2116 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field2126.length) {
                        int[] var41 = this.field2126[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field2138[var43];
                            int var45 = this.field2138[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field2108[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class141.field2424[arg4];
                                    int var49 = class141.field2411[arg4];
                                    int var50 = this.field2141[var47] * var48 + this.field2116[var47] * var49 + 32767 >> 16;
                                    this.field2141[var47] = (short) (this.field2141[var47] * var49 + 32767 - this.field2116[var47] * var48 >> 16);
                                    this.field2116[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class141.field2424[arg2];
                                    int var52 = class141.field2411[arg2];
                                    int var53 = this.field2141[var47] * var52 + 32767 - this.field2142[var47] * var51 >> 16;
                                    this.field2142[var47] = (short) (this.field2142[var47] * var52 + this.field2141[var47] * var51 + 32767 >> 16);
                                    this.field2141[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class141.field2424[arg3];
                                    int var55 = class141.field2411[arg3];
                                    int var56 = this.field2142[var47] * var54 + this.field2116[var47] * var55 + 32767 >> 16;
                                    this.field2142[var47] = (short) (this.field2142[var47] * var55 + 32767 - this.field2116[var47] * var54 >> 16);
                                    this.field2116[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field2135 != null) {
                    this.field2135.field3344 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field2126.length) {
                    int[] var59 = this.field2126[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field2109[var61] -= field2162;
                        this.field2124[var61] -= field2156;
                        this.field2144[var61] -= field2160;
                        this.field2109[var61] = this.field2109[var61] * arg2 >> 7;
                        this.field2124[var61] = this.field2124[var61] * arg3 >> 7;
                        this.field2144[var61] = this.field2144[var61] * arg4 >> 7;
                        this.field2109[var61] += field2162;
                        this.field2124[var61] += field2156;
                        this.field2144[var61] += field2160;
                    }
                }
            }
        } else if (arg0 == 5 && this.field2148 != null && this.field2129 != null) {
            for (int var62 = 0; var62 < var7; var62++) {
                int var63 = arg1[var62];
                if (var63 < this.field2148.length) {
                    int[] var64 = this.field2148[var63];
                    for (int var65 = 0; var65 < var64.length; var65++) {
                        int var66 = var64[var65];
                        int var67 = (this.field2129[var66] & 0xFF) + arg2 * 8;
                        if (var67 < 0) {
                            var67 = 0;
                        } else if (var67 > 255) {
                            var67 = 255;
                        }
                        this.field2129[var66] = (byte) var67;
                    }
                    if (var64.length > 0) {
                        this.field2113.field3344 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZZZZZ)V", line = 1614)
    private final void method785(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field2121.field3334 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field2113.field3334 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field2135.field3334 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field2127.field3334 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field2114.field3417.length < this.field2139 * var6) {
            field2114 = new class194((this.field2139 + 100) * var6);
        } else {
            field2114.field3380 = 0;
        }
        if (arg1) {
            if (class247.field4235) {
                for (int var7 = 0; var7 < this.field2120; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field2109[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field2124[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field2144[var7]);
                    int var11 = this.field2138[var7];
                    int var12 = this.field2138[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field2108[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field2114.field3380 = var6 * var14;
                        field2114.method1337(-71, var8);
                        field2114.method1337(-97, var9);
                        field2114.method1337(-114, var10);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field2120; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field2109[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field2124[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field2144[var15]);
                    int var19 = this.field2138[var15];
                    int var20 = this.field2138[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field2108[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field2114.field3380 = var6 * var22;
                        field2114.method1333(var16, (byte) -35);
                        field2114.method1333(var17, (byte) 73);
                        field2114.method1333(var18, (byte) 101);
                    }
                }
            }
        }
        if (arg2) {
            if (class90.field1536) {
                for (int var42 = 0; var42 < this.field2132; var42++) {
                    int var43 = method801(this.field2131[var42], this.field2115[var42], this.field2118, this.field2129[var42]);
                    field2114.field3380 = this.field2125[var42] * var6 + this.field2113.field3334;
                    field2114.method1337(-62, var43);
                    field2114.field3380 = this.field2122[var42] * var6 + this.field2113.field3334;
                    field2114.method1337(-101, var43);
                    field2114.field3380 = this.field2112[var42] * var6 + this.field2113.field3334;
                    field2114.method1337(-60, var43);
                }
            } else {
                int var23 = (int) class119.field2011[0];
                int var24 = (int) class119.field2011[1];
                int var25 = (int) class119.field2011[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field2118 * 1.3F);
                int var28 = this.field2147 * var26 >> 8;
                for (int var29 = 0; var29 < this.field2132; var29++) {
                    short var30 = this.field2125[var29];
                    short var31 = this.field2119[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field2142[var30] * var25 + this.field2141[var30] * var24 + this.field2116[var30] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field2142[var30] * var25 + this.field2141[var30] * var24 + this.field2116[var30] * var23) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field2119[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field2122[var29];
                    short var34 = this.field2119[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field2142[var33] * var25 + this.field2141[var33] * var24 + this.field2116[var33] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field2142[var33] * var25 + this.field2141[var33] * var24 + this.field2116[var33] * var23) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field2119[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field2112[var29];
                    short var37 = this.field2119[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field2142[var36] * var25 + this.field2141[var36] * var24 + this.field2116[var36] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field2142[var36] * var25 + this.field2141[var36] * var24 + this.field2116[var36] * var23) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field2119[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method801(this.field2131[var29], this.field2115[var29], var32, this.field2129[var29]);
                    int var40 = method801(this.field2131[var29], this.field2115[var29], var35, this.field2129[var29]);
                    int var41 = method801(this.field2131[var29], this.field2115[var29], var38, this.field2129[var29]);
                    field2114.field3380 = var6 * var30 + this.field2113.field3334;
                    field2114.method1337(-62, var39);
                    field2114.field3380 = var6 * var33 + this.field2113.field3334;
                    field2114.method1337(-95, var40);
                    field2114.field3380 = var6 * var36 + this.field2113.field3334;
                    field2114.method1337(-85, var41);
                }
                this.field2116 = null;
                this.field2141 = null;
                this.field2142 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field2147;
            float var45 = 3.0F / (float) (this.field2147 / 2 + this.field2147);
            field2114.field3380 = this.field2135.field3334;
            if (class247.field4235) {
                for (int var46 = 0; var46 < this.field2139; var46++) {
                    short var47 = this.field2119[var46];
                    if (var47 == 0) {
                        field2114.method1328(24180, (float) this.field2116[var46] * var45);
                        field2114.method1328(24180, (float) this.field2141[var46] * var45);
                        field2114.method1328(24180, (float) this.field2142[var46] * var45);
                    } else {
                        float var48 = var44 / (float) var47;
                        field2114.method1328(24180, (float) this.field2116[var46] * var48);
                        field2114.method1328(24180, (float) this.field2141[var46] * var48);
                        field2114.method1328(24180, (float) this.field2142[var46] * var48);
                    }
                    field2114.field3380 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field2139; var49++) {
                    short var50 = this.field2119[var49];
                    if (var50 == 0) {
                        field2114.method1302((float) this.field2116[var49] * var45, -550459832);
                        field2114.method1302((float) this.field2141[var49] * var45, -550459832);
                        field2114.method1302((float) this.field2142[var49] * var45, -550459832);
                    } else {
                        float var51 = var44 / (float) var50;
                        field2114.method1302((float) this.field2116[var49] * var51, -550459832);
                        field2114.method1302((float) this.field2141[var49] * var51, -550459832);
                        field2114.method1302((float) this.field2142[var49] * var51, -550459832);
                    }
                    field2114.field3380 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field2114.field3380 = this.field2127.field3334;
            if (class247.field4235) {
                for (int var52 = 0; var52 < this.field2139; var52++) {
                    field2114.method1328(24180, this.field2128[var52]);
                    field2114.method1328(24180, this.field2140[var52]);
                    field2114.field3380 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field2139; var53++) {
                    field2114.method1302(this.field2128[var53], -550459832);
                    field2114.method1302(this.field2140[var53], -550459832);
                    field2114.field3380 += var6 - 8;
                }
            }
        }
        field2114.field3380 = this.field2139 * var6;
        if (arg0) {
            if (class247.field4258) {
                ByteBuffer var54 = ByteBuffer.wrap(field2114.field3417, 0, field2114.field3380);
                if (this.field2110 == null) {
                    this.field2110 = new class244(true);
                    this.field2110.method1662(var54);
                } else {
                    this.field2110.method1663(var54);
                }
                if (arg1) {
                    this.field2121.field3344 = true;
                    this.field2121.field3342 = null;
                    this.field2121.field3340 = this.field2110;
                    this.field2121.field3341 = var6;
                }
                if (arg2) {
                    this.field2113.field3344 = true;
                    this.field2113.field3342 = null;
                    this.field2113.field3340 = this.field2110;
                    this.field2113.field3341 = var6;
                }
                if (arg3) {
                    this.field2135.field3344 = true;
                    this.field2135.field3342 = null;
                    this.field2135.field3340 = this.field2110;
                    this.field2135.field3341 = var6;
                }
                if (arg4) {
                    this.field2127.field3344 = true;
                    this.field2127.field3342 = null;
                    this.field2127.field3340 = this.field2110;
                    this.field2127.field3341 = var6;
                }
            } else {
                if (field2143 == null || field2143.capacity() < field2114.field3380) {
                    field2143 = ByteBuffer.allocateDirect(var6 * 100 + field2114.field3380);
                } else {
                    field2143.clear();
                }
                field2143.put(field2114.field3417, 0, field2114.field3380);
                field2143.flip();
                if (arg1) {
                    this.field2121.field3344 = true;
                    this.field2121.field3342 = field2143;
                    this.field2121.field3340 = null;
                    this.field2121.field3341 = var6;
                }
                if (arg2) {
                    this.field2113.field3344 = true;
                    this.field2113.field3342 = field2143;
                    this.field2121.field3340 = null;
                    this.field2113.field3341 = var6;
                }
                if (arg3) {
                    this.field2135.field3344 = true;
                    this.field2135.field3342 = field2143;
                    this.field2135.field3340 = null;
                    this.field2135.field3341 = var6;
                }
                if (arg4) {
                    this.field2127.field3344 = true;
                    this.field2127.field3342 = field2143;
                    this.field2127.field3340 = null;
                    this.field2127.field3341 = var6;
                }
            }
        } else if (class247.field4248) {
            class244 var55 = new class244();
            ByteBuffer var56 = ByteBuffer.wrap(field2114.field3417, 0, field2114.field3380);
            var55.method1662(var56);
            if (arg1) {
                this.field2121.field3344 = true;
                this.field2121.field3342 = null;
                this.field2121.field3340 = var55;
                this.field2121.field3341 = var6;
            }
            if (arg2) {
                this.field2113.field3344 = true;
                this.field2113.field3342 = null;
                this.field2113.field3340 = var55;
                this.field2113.field3341 = var6;
            }
            if (arg3) {
                this.field2135.field3344 = true;
                this.field2135.field3342 = null;
                this.field2135.field3340 = var55;
                this.field2135.field3341 = var6;
            }
            if (arg4) {
                this.field2127.field3344 = true;
                this.field2127.field3342 = null;
                this.field2127.field3340 = var55;
                this.field2127.field3341 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field2114.field3380);
            var57.put(field2114.field3417, 0, field2114.field3380);
            var57.flip();
            if (arg1) {
                this.field2121.field3344 = true;
                this.field2121.field3342 = var57;
                this.field2121.field3340 = null;
                this.field2121.field3341 = var6;
            }
            if (arg2) {
                this.field2113.field3344 = true;
                this.field2113.field3342 = var57;
                this.field2121.field3340 = null;
                this.field2113.field3341 = var6;
            }
            if (arg3) {
                this.field2135.field3344 = true;
                this.field2135.field3342 = var57;
                this.field2135.field3340 = null;
                this.field2135.field3341 = var6;
            }
            if (arg4) {
                this.field2127.field3344 = true;
                this.field2127.field3342 = var57;
                this.field2127.field3340 = null;
                this.field2127.field3341 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIIII)Z", line = 2143)
    private final boolean method786(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "()V", line = 2158)
    public final void method787() {
        if (this.field2116 == null) {
            this.method197();
            return;
        }
        for (int var1 = 0; var1 < this.field2120; var1++) {
            int var2 = this.field2109[var1];
            this.field2109[var1] = this.field2144[var1];
            this.field2144[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field2139; var3++) {
            short var4 = this.field2116[var3];
            this.field2116[var3] = this.field2142[var3];
            this.field2142[var3] = (short) (-var4);
        }
        this.field2136.field893 = false;
        this.field2121.field3344 = false;
        if (this.field2135 != null) {
            this.field2135.field3344 = false;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIII)V", line = 2196)
    public final void method199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field2139 == 0) {
            return;
        }
        GL var8 = class247.field4253;
        var8.glPushMatrix();
        if (arg3 != 0) {
            var8.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var8.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var8.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var8.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var8.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method770();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "()V", line = 2219)
    public final void method788() {
        int var10002;
        if (this.field2130 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2120; var3++) {
                int var4 = this.field2130[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2126 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2126[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2120) {
                int var7 = this.field2130[var6] & 0xFF;
                this.field2126[var7][var1[var7]++] = var6++;
            }
            this.field2130 = null;
        }
        if (this.field2107 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2132; var10++) {
            int var11 = this.field2107[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2148 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2148[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2132) {
            int var14 = this.field2107[var13] & 0xFF;
            this.field2148[var14][var8[var14]++] = var13++;
        }
        this.field2107 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lig;IJIIIIFF)S", line = 2312)
    private final short method789(class168 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field2138[arg1];
        int var12 = this.field2138[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field2108[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field2134[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field2108[var13] = (short) (this.field2139 + 1);
        field2134[var13] = arg2;
        this.field2116[this.field2139] = (short) arg3;
        this.field2141[this.field2139] = (short) arg4;
        this.field2142[this.field2139] = (short) arg5;
        this.field2119[this.field2139] = (short) arg6;
        this.field2128[this.field2139] = arg7;
        this.field2140[this.field2139] = arg8;
        return (short) (this.field2139++);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(FFF)I", line = 2348)
    private static final int method790(float arg0, float arg1, float arg2) {
        float var3 = arg0 < 0.0F ? -arg0 : arg0;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 > var3 && var4 > var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var5 > var3 && var5 > var4) {
            return arg2 > 0.0F ? 2 : 3;
        } else if (arg0 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "([SI)[S", line = 2383)
    private static final short[] method791(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class224.method1544(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "(I)V", line = 2390)
    public final void method792(int arg0) {
        this.field2147 = (short) arg0;
        if (this.field2135 != null) {
            this.field2135.field3344 = false;
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "()I", line = 2397)
    public final int method204() {
        if (!this.field2136.field893) {
            this.method772();
        }
        return this.field2136.field895;
    }

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "(I)V", line = 2403)
    public final void method793(int arg0) {
        this.field2118 = (short) arg0;
        this.field2113.field3344 = false;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lme;IZ)V", line = 2407)
    public final void method198(class178 arg0, int arg1, boolean arg2) {
        if (this.field2126 == null || arg1 == -1) {
            return;
        }
        class73 var4 = arg0.field3132[arg1];
        class58 var5 = var4.field1356;
        for (int var6 = 0; var6 < this.field2120; var6++) {
            this.field2109[var6] <<= 0x4;
            this.field2124[var6] <<= 0x4;
            this.field2144[var6] <<= 0x4;
        }
        field2162 = 0;
        field2156 = 0;
        field2160 = 0;
        for (int var7 = 0; var7 < var4.field1354; var7++) {
            short var8 = var4.field1357[var7];
            if (var4.field1351[var7] != -1) {
                this.method784(0, var5.field1112[var4.field1351[var7]], 0, 0, 0, arg2);
            }
            this.method784(var5.field1107[var8], var5.field1112[var8], var4.field1355[var7], var4.field1358[var7], var4.field1352[var7], arg2);
        }
        for (int var9 = 0; var9 < this.field2120; var9++) {
            this.field2109[var9] >>= 0x4;
            this.field2124[var9] >>= 0x4;
            this.field2144[var9] >>= 0x4;
        }
        this.field2136.field893 = false;
        this.field2121.field3344 = false;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZZ)Lja;", line = 2461)
    public final class60 method212(boolean arg0, boolean arg1) {
        return this.method798(arg0, arg1, field2151, field2150);
    }

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "()V", line = 2465)
    public final void method794() {
        if (this.field2116 == null) {
            this.method189();
            return;
        }
        for (int var1 = 0; var1 < this.field2120; var1++) {
            this.field2109[var1] = -this.field2109[var1];
            this.field2144[var1] = -this.field2144[var1];
        }
        for (int var2 = 0; var2 < this.field2139; var2++) {
            this.field2116[var2] = (short) (-this.field2116[var2]);
            this.field2142[var2] = (short) (-this.field2142[var2]);
        }
        this.field2136.field893 = false;
        this.field2121.field3344 = false;
        if (this.field2135 != null) {
            this.field2135.field3344 = false;
        }
    }

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "()I", line = 2499)
    public final int method190() {
        if (!this.field2136.field893) {
            this.method772();
        }
        return this.field2136.field894;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(III)V", line = 2507)
    public final void method186(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2120; var4++) {
            this.field2109[var4] += arg0;
            this.field2124[var4] += arg1;
            this.field2144[var4] += arg2;
        }
        this.field2136.field893 = false;
        this.field2121.field3344 = false;
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V", line = 2523)
    public final void method208(int arg0) {
        int var2 = class141.field2424[arg0];
        int var3 = class141.field2411[arg0];
        for (int var4 = 0; var4 < this.field2120; var4++) {
            int var5 = this.field2124[var4] * var3 - this.field2144[var4] * var2 >> 16;
            this.field2144[var4] = this.field2144[var4] * var3 + this.field2124[var4] * var2 >> 16;
            this.field2124[var4] = var5;
        }
        this.field2136.field893 = false;
        this.field2121.field3344 = false;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(ZZ)Lja;", line = 2542)
    public final class60 method216(boolean arg0, boolean arg1) {
        return this.method798(arg0, arg1, field2149, field2145);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(SS)V", line = 2547)
    public final void method795(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2132; var3++) {
            if (this.field2131[var3] == arg0) {
                this.field2131[var3] = arg1;
            }
        }
        this.field2113.field3344 = false;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZZZZZZZ)V", line = 2559)
    public final void method796(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field2137 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field2139 != 0) {
            if (arg6) {
                boolean var8 = !this.field2113.field3344 && (arg1 || arg2 && !class90.field1536);
                this.method785(false, !this.field2121.field3344 && arg0, var8, this.field2135 != null && !this.field2135.field3344 && arg2, !this.field2127.field3344 && arg3);
                if (!this.field2123.field3344 && arg4 && arg1) {
                    this.method769();
                }
            }
            if (arg0) {
                if (this.field2121.field3344) {
                    this.field2109 = null;
                    this.field2124 = null;
                    this.field2144 = null;
                    this.field2108 = null;
                    this.field2138 = null;
                } else {
                    this.field2117 = (byte) (this.field2117 | 0x1);
                }
            }
            if (arg1) {
                if (this.field2113.field3344) {
                    this.field2131 = null;
                    this.field2129 = null;
                } else {
                    this.field2117 = (byte) (this.field2117 | 0x2);
                }
            }
            if (arg2 && class90.field1536) {
                if (this.field2135.field3344) {
                    this.field2116 = null;
                    this.field2141 = null;
                    this.field2142 = null;
                    this.field2119 = null;
                } else {
                    this.field2117 = (byte) (this.field2117 | 0x4);
                }
            }
            if (arg3) {
                if (this.field2127.field3344) {
                    this.field2128 = null;
                    this.field2140 = null;
                } else {
                    this.field2117 = (byte) (this.field2117 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field2123.field3344 && this.field2113.field3344) {
                    this.field2125 = null;
                    this.field2122 = null;
                    this.field2112 = null;
                } else {
                    this.field2117 = (byte) (this.field2117 | 0x10);
                }
            }
            if (arg5) {
                this.field2130 = null;
                this.field2107 = null;
                this.field2126 = (int[][]) null;
                this.field2148 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V", line = 3633)
    private class126() {
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lig;IIZ)V", line = 3733)
    public class126(class168 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field2885];
        this.field2138 = new int[arg0.field2892 + 1];
        for (int var6 = 0; var6 < arg0.field2885; var6++) {
            if ((arg0.field2886 == null || arg0.field2886[var6] != 2) && (arg0.field2887 == null || arg0.field2887[var6] == -1 || !class141.field2419.method95(arg0.field2887[var6] & 0xFFFF, (byte) 6))) {
                var5[this.field2132++] = var6;
                this.field2138[arg0.field2925[var6]]++;
                this.field2138[arg0.field2884[var6]]++;
                this.field2138[arg0.field2923[var6]]++;
            }
        }
        long[] var7 = new long[this.field2132];
        for (int var8 = 0; var8 < this.field2132; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field2887 != null) {
                var14 = arg0.field2887[var9];
                if (var14 != -1) {
                    var12 = class141.field2419.method101(var14 & 0xFFFF, 107);
                    var13 = class141.field2419.method96(255, var14 & 0xFFFF);
                }
            }
            boolean var15 = arg0.field2909 != null && arg0.field2909[var9] != 0 || var14 != -1 && !class141.field2419.method100(0, var14 & 0xFFFF);
            if ((arg3 || var15) && arg0.field2922 != null) {
                var10 += arg0.field2922[var9] << 17;
            }
            if (var15) {
                var10 += 65536;
            }
            int var16 = ((var12 & 0xFF) << 8) + var10;
            int var17 = (var13 & 0xFF) + var16;
            int var18 = ((var14 & 0xFFFF) << 16) + var11;
            int var19 = (var8 & 0xFFFF) + var18;
            var7[var8] = ((long) var17 << 32) + (long) var19;
        }
        class303.method2057(var5, 7656, var7);
        this.field2120 = arg0.field2892;
        this.field2109 = arg0.field2910;
        this.field2124 = arg0.field2919;
        this.field2144 = arg0.field2927;
        this.field2130 = arg0.field2932;
        int var20 = this.field2132 * 3;
        this.field2116 = new short[var20];
        this.field2141 = new short[var20];
        this.field2142 = new short[var20];
        this.field2119 = new short[var20];
        this.field2128 = new float[var20];
        this.field2140 = new float[var20];
        this.field2131 = new short[this.field2132];
        this.field2129 = new byte[this.field2132];
        this.field2125 = new short[this.field2132];
        this.field2122 = new short[this.field2132];
        this.field2112 = new short[this.field2132];
        this.field2115 = new short[this.field2132];
        if (arg0.field2914 != null) {
            this.field2107 = new byte[this.field2132];
        }
        this.field2136 = new class44();
        this.field2121 = new class193();
        this.field2113 = new class193();
        if (class90.field1536) {
            this.field2135 = new class193();
        }
        this.field2127 = new class193();
        this.field2123 = new class193();
        this.field2118 = (short) arg1;
        this.field2147 = (short) arg2;
        this.field2108 = new short[var20];
        field2134 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < arg0.field2892; var22++) {
            int var23 = this.field2138[var22];
            this.field2138[var22] = var21;
            var21 += var23;
        }
        this.field2138[arg0.field2892] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field2893 != null) {
            int var28 = arg0.field2921;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            for (int var36 = 0; var36 < this.field2132; var36++) {
                int var37 = var5[var36];
                if (arg0.field2893[var37] != -1) {
                    int var38 = arg0.field2893[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field2925[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field2884[var37];
                        } else {
                            var40 = arg0.field2923[var37];
                        }
                        int var41 = arg0.field2910[var40];
                        int var42 = arg0.field2919[var40];
                        int var43 = arg0.field2927[var40];
                        if (var41 < var29[var38]) {
                            var29[var38] = var41;
                        }
                        if (var41 > var30[var38]) {
                            var30[var38] = var41;
                        }
                        if (var42 < var31[var38]) {
                            var31[var38] = var42;
                        }
                        if (var42 > var32[var38]) {
                            var32[var38] = var42;
                        }
                        if (var43 < var33[var38]) {
                            var33[var38] = var43;
                        }
                        if (var43 > var34[var38]) {
                            var34[var38] = var43;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var25 = new int[var28];
            var26 = new int[var28];
            var27 = new float[var28][];
            for (int var44 = 0; var44 < var28; var44++) {
                byte var45 = arg0.field2913[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field2891[var44];
                        if (var46 == 0) {
                            var47 = 1.0F;
                            var48 = 1.0F;
                        } else if (var46 > 0) {
                            var47 = 1.0F;
                            var48 = (float) var46 / 1024.0F;
                        } else {
                            var48 = 1.0F;
                            var47 = (float) (-var46) / 1024.0F;
                        }
                        var49 = 64.0F / (float) (arg0.field2903[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field2891[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field2903[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field2896[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field2891[var44] / 1024.0F;
                        var49 = (float) arg0.field2903[var44] / 1024.0F;
                        var48 = (float) arg0.field2896[var44] / 1024.0F;
                    }
                    var27[var44] = method797(arg0.field2901[var44], arg0.field2898[var44], arg0.field2924[var44], arg0.field2931[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field2132; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field2894[var51] & 0xFFFF;
            short var53;
            if (arg0.field2887 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field2887[var51];
            }
            int var54;
            if (arg0.field2893 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field2893[var51];
            }
            int var55;
            if (arg0.field2909 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field2909[var51] & 0xFF;
            }
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            float var60 = 0.0F;
            float var61 = 0.0F;
            byte var62 = 0;
            byte var63 = 0;
            int var64 = 0;
            if (var53 != -1) {
                if (var54 == -1) {
                    var56 = 0.0F;
                    var57 = 1.0F;
                    var58 = 1.0F;
                    var59 = 1.0F;
                    var62 = 1;
                    var60 = 0.0F;
                    var61 = 0.0F;
                    var63 = 2;
                } else {
                    var54 &= 0xFF;
                    byte var65 = arg0.field2913[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field2925[var51];
                        int var67 = arg0.field2884[var51];
                        int var68 = arg0.field2923[var51];
                        short var69 = arg0.field2901[var54];
                        short var70 = arg0.field2898[var54];
                        short var71 = arg0.field2924[var54];
                        float var72 = (float) arg0.field2910[var69];
                        float var73 = (float) arg0.field2919[var69];
                        float var74 = (float) arg0.field2927[var69];
                        float var75 = (float) arg0.field2910[var70] - var72;
                        float var76 = (float) arg0.field2919[var70] - var73;
                        float var77 = (float) arg0.field2927[var70] - var74;
                        float var78 = (float) arg0.field2910[var71] - var72;
                        float var79 = (float) arg0.field2919[var71] - var73;
                        float var80 = (float) arg0.field2927[var71] - var74;
                        float var81 = (float) arg0.field2910[var66] - var72;
                        float var82 = (float) arg0.field2919[var66] - var73;
                        float var83 = (float) arg0.field2927[var66] - var74;
                        float var84 = (float) arg0.field2910[var67] - var72;
                        float var85 = (float) arg0.field2919[var67] - var73;
                        float var86 = (float) arg0.field2927[var67] - var74;
                        float var87 = (float) arg0.field2910[var68] - var72;
                        float var88 = (float) arg0.field2919[var68] - var73;
                        float var89 = (float) arg0.field2927[var68] - var74;
                        float var90 = var76 * var80 - var77 * var79;
                        float var91 = var77 * var78 - var75 * var80;
                        float var92 = var75 * var79 - var76 * var78;
                        float var93 = var79 * var92 - var80 * var91;
                        float var94 = var80 * var90 - var78 * var92;
                        float var95 = var78 * var91 - var79 * var90;
                        float var96 = 1.0F / (var77 * var95 + var75 * var93 + var76 * var94);
                        var56 = (var83 * var95 + var81 * var93 + var82 * var94) * var96;
                        var58 = (var86 * var95 + var84 * var93 + var85 * var94) * var96;
                        var60 = (var89 * var95 + var87 * var93 + var88 * var94) * var96;
                        float var97 = var76 * var92 - var77 * var91;
                        float var98 = var77 * var90 - var75 * var92;
                        float var99 = var75 * var91 - var76 * var90;
                        float var100 = 1.0F / (var80 * var99 + var78 * var97 + var79 * var98);
                        var57 = (var83 * var99 + var81 * var97 + var82 * var98) * var100;
                        var59 = (var86 * var99 + var84 * var97 + var85 * var98) * var100;
                        var61 = (var89 * var99 + var87 * var97 + var88 * var98) * var100;
                    } else {
                        int var101 = arg0.field2925[var51];
                        int var102 = arg0.field2884[var51];
                        int var103 = arg0.field2923[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field2906[var54];
                        float var109 = (float) arg0.field2929[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field2896[var54] & 0xFFFF) / 1024.0F;
                            method803(arg0.field2910[var101], arg0.field2919[var101], arg0.field2927[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field2159;
                            var57 = field2157;
                            method803(arg0.field2910[var102], arg0.field2919[var102], arg0.field2927[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field2159;
                            var59 = field2157;
                            method803(arg0.field2910[var103], arg0.field2919[var103], arg0.field2927[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field2159;
                            var61 = field2157;
                            float var111 = var110 / 2.0F;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > var111) {
                                    var58 -= var110;
                                    var62 = 1;
                                } else if (var56 - var58 > var111) {
                                    var58 += var110;
                                    var62 = 2;
                                }
                                if (var60 - var56 > var111) {
                                    var60 -= var110;
                                    var63 = 1;
                                } else if (var56 - var60 > var111) {
                                    var60 += var110;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > var111) {
                                    var59 -= var110;
                                    var62 = 1;
                                } else if (var57 - var59 > var111) {
                                    var59 += var110;
                                    var62 = 2;
                                }
                                if (var61 - var57 > var111) {
                                    var61 -= var110;
                                    var63 = 1;
                                } else if (var57 - var61 > var111) {
                                    var61 += var110;
                                    var63 = 2;
                                }
                            }
                        } else if (var65 == 2) {
                            float var112 = (float) arg0.field2890[var54] / 256.0F;
                            float var113 = (float) arg0.field2902[var54] / 256.0F;
                            int var114 = arg0.field2910[var102] - arg0.field2910[var101];
                            int var115 = arg0.field2919[var102] - arg0.field2919[var101];
                            int var116 = arg0.field2927[var102] - arg0.field2927[var101];
                            int var117 = arg0.field2910[var103] - arg0.field2910[var101];
                            int var118 = arg0.field2919[var103] - arg0.field2919[var101];
                            int var119 = arg0.field2927[var103] - arg0.field2927[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field2891[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field2903[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field2896[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method790(var126, var127, var128);
                            method806(arg0.field2910[var101], arg0.field2919[var101], arg0.field2927[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field2155;
                            var57 = field2154;
                            method806(arg0.field2910[var102], arg0.field2919[var102], arg0.field2927[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field2155;
                            var59 = field2154;
                            method806(arg0.field2910[var103], arg0.field2919[var103], arg0.field2927[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field2155;
                            var61 = field2154;
                        } else if (var65 == 3) {
                            method778(arg0.field2910[var101], arg0.field2919[var101], arg0.field2927[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field2153;
                            var57 = field2158;
                            method778(arg0.field2910[var102], arg0.field2919[var102], arg0.field2927[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field2153;
                            var59 = field2158;
                            method778(arg0.field2910[var103], arg0.field2919[var103], arg0.field2927[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field2153;
                            var61 = field2158;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > 0.5F) {
                                    var58--;
                                    var62 = 1;
                                } else if (var56 - var58 > 0.5F) {
                                    var58++;
                                    var62 = 2;
                                }
                                if (var60 - var56 > 0.5F) {
                                    var60--;
                                    var63 = 1;
                                } else if (var56 - var60 > 0.5F) {
                                    var60++;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > 0.5F) {
                                    var59--;
                                    var62 = 1;
                                } else if (var57 - var59 > 0.5F) {
                                    var59++;
                                    var62 = 2;
                                }
                                if (var61 - var57 > 0.5F) {
                                    var61--;
                                    var63 = 1;
                                } else if (var57 - var61 > 0.5F) {
                                    var61++;
                                    var63 = 2;
                                }
                            }
                        }
                    }
                }
            }
            arg0.method1124();
            byte var129;
            if (arg0.field2886 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field2886[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field2925[var51];
                class143 var133 = arg0.field2916[var132];
                this.field2125[var50] = this.method789(arg0, var132, var130, var133.field2449, var133.field2444, var133.field2450, var133.field2451, var56, var57);
                int var134 = arg0.field2884[var51];
                class143 var135 = arg0.field2916[var134];
                this.field2122[var50] = this.method789(arg0, var134, (long) var62 + var130, var135.field2449, var135.field2444, var135.field2450, var135.field2451, var58, var59);
                int var136 = arg0.field2923[var51];
                class143 var137 = arg0.field2916[var136];
                this.field2112[var50] = this.method789(arg0, var136, (long) var63 + var130, var137.field2449, var137.field2444, var137.field2450, var137.field2451, var60, var61);
            } else if (var129 == 1) {
                class250 var138 = arg0.field2897[var51];
                long var139 = (long) ((var54 << 2) + (var138.field4335 > 0 ? 1024 : 2048) + (var138.field4331 + 256 << 12) + (var138.field4328 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field2125[var50] = this.method789(arg0, arg0.field2925[var51], var139, var138.field4335, var138.field4331, var138.field4328, 0, var56, var57);
                this.field2122[var50] = this.method789(arg0, arg0.field2884[var51], (long) var62 + var139, var138.field4335, var138.field4331, var138.field4328, 0, var58, var59);
                this.field2112[var50] = this.method789(arg0, arg0.field2923[var51], (long) var63 + var139, var138.field4335, var138.field4331, var138.field4328, 0, var60, var61);
            }
            if (arg0.field2887 == null) {
                this.field2115[var50] = -1;
            } else {
                this.field2115[var50] = arg0.field2887[var51];
            }
            if (this.field2107 != null) {
                this.field2107[var50] = (byte) arg0.field2914[var51];
            }
            this.field2131[var50] = arg0.field2894[var51];
            if (arg0.field2909 != null) {
                this.field2129[var50] = arg0.field2909[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field2132; var143++) {
            short var144 = this.field2115[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field2111 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field2132; var147++) {
            short var148 = this.field2115[var147];
            if (var146 != var148) {
                this.field2111[var145++] = var147;
                var146 = var148;
            }
        }
        this.field2111[var145] = this.field2132;
        field2134 = null;
        this.field2116 = method791(this.field2116, this.field2139);
        this.field2141 = method791(this.field2141, this.field2139);
        this.field2142 = method791(this.field2142, this.field2139);
        this.field2119 = method791(this.field2119, this.field2139);
        this.field2128 = method800(this.field2128, this.field2139);
        this.field2140 = method800(this.field2140, this.field2139);
    }

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "()I", line = 2657)
    public final int method206() {
        if (!this.field2136.field893) {
            this.method772();
        }
        return this.field2136.field889;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIFFF)[F", line = 2665)
    private static final float[] method797(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float[] var8 = new float[9];
        float var9 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var10 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var11 = 1.0F - var9;
        var7[0] = var9;
        var7[1] = 0.0F;
        var7[2] = var10;
        var7[3] = 0.0F;
        var7[4] = 1.0F;
        var7[5] = 0.0F;
        var7[6] = -var10;
        var7[7] = 0.0F;
        var7[8] = var9;
        float[] var12 = new float[9];
        float var13 = 1.0F;
        float var14 = 0.0F;
        float var15 = (float) arg1 / 32767.0F;
        float var16 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var17 = 1.0F - var15;
        float var18 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var18 == 0.0F && var15 == 0.0F) {
            var8 = var7;
        } else {
            if (var18 != 0.0F) {
                var13 = (float) (-arg2) / var18;
                var14 = (float) arg0 / var18;
            }
            var12[0] = var13 * var13 * var17 + var15;
            var12[1] = var14 * var16;
            var12[2] = var13 * var14 * var17;
            var12[3] = -var14 * var16;
            var12[4] = var15;
            var12[5] = var13 * var16;
            var12[6] = var13 * var14 * var17;
            var12[7] = -var13 * var16;
            var12[8] = var14 * var14 * var17 + var15;
            var8[0] = var7[2] * var12[6] + var7[0] * var12[0] + var7[1] * var12[3];
            var8[1] = var7[2] * var12[7] + var7[0] * var12[1] + var7[1] * var12[4];
            var8[2] = var7[2] * var12[8] + var7[0] * var12[2] + var7[1] * var12[5];
            var8[3] = var7[5] * var12[6] + var7[3] * var12[0] + var7[4] * var12[3];
            var8[4] = var7[5] * var12[7] + var7[3] * var12[1] + var7[4] * var12[4];
            var8[5] = var7[5] * var12[8] + var7[3] * var12[2] + var7[4] * var12[5];
            var8[6] = var7[8] * var12[6] + var7[6] * var12[0] + var7[7] * var12[3];
            var8[7] = var7[8] * var12[7] + var7[6] * var12[1] + var7[7] * var12[4];
            var8[8] = var7[8] * var12[8] + var7[6] * var12[2] + var7[7] * var12[5];
        }
        var8[0] *= arg4;
        var8[1] *= arg4;
        var8[2] *= arg4;
        var8[3] *= arg5;
        var8[4] *= arg5;
        var8[5] *= arg5;
        var8[6] *= arg6;
        var8[7] *= arg6;
        var8[8] *= arg6;
        return var8;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZZLml;Lml;)Lja;", line = 2738)
    private final class60 method798(boolean arg0, boolean arg1, class126 arg2, class126 arg3) {
        arg2.field2120 = this.field2120;
        arg2.field2139 = this.field2139;
        arg2.field2132 = this.field2132;
        arg2.field2118 = this.field2118;
        arg2.field2147 = this.field2147;
        arg2.field2137 = (byte) ((arg0 ? 0 : 2) | 0x1 | (arg1 ? 0 : 4));
        if (arg2.field2109 == null || arg2.field2109.length < this.field2120) {
            arg2.field2109 = new int[this.field2120 + 100];
            arg2.field2124 = new int[this.field2120 + 100];
            arg2.field2144 = new int[this.field2120 + 100];
        }
        for (int var5 = 0; var5 < this.field2120; var5++) {
            arg2.field2109[var5] = this.field2109[var5];
            arg2.field2124[var5] = this.field2124[var5];
            arg2.field2144[var5] = this.field2144[var5];
        }
        if (arg2.field2121 == null) {
            arg2.field2121 = new class193();
        }
        arg2.field2121.field3344 = false;
        if (arg2.field2136 == null) {
            arg2.field2136 = new class44();
        }
        arg2.field2136.field893 = false;
        if (arg0) {
            arg2.field2129 = this.field2129;
            arg2.field2113 = this.field2113;
        } else {
            if (arg3.field2129 == null || arg3.field2129.length < this.field2132) {
                arg3.field2129 = new byte[this.field2132 + 100];
            }
            arg2.field2129 = arg3.field2129;
            for (int var6 = 0; var6 < this.field2132; var6++) {
                arg2.field2129[var6] = this.field2129[var6];
            }
            if (arg3.field2113 == null) {
                arg3.field2113 = new class193();
            }
            arg2.field2113 = arg3.field2113;
            arg2.field2113.field3344 = false;
        }
        if (arg1) {
            arg2.field2116 = this.field2116;
            arg2.field2141 = this.field2141;
            arg2.field2142 = this.field2142;
            arg2.field2119 = this.field2119;
            arg2.field2135 = this.field2135;
        } else {
            if (arg3.field2116 == null || arg3.field2116.length < this.field2139) {
                arg3.field2116 = new short[this.field2139 + 100];
                arg3.field2141 = new short[this.field2139 + 100];
                arg3.field2142 = new short[this.field2139 + 100];
                arg3.field2119 = new short[this.field2139 + 100];
            }
            arg2.field2116 = arg3.field2116;
            arg2.field2141 = arg3.field2141;
            arg2.field2142 = arg3.field2142;
            arg2.field2119 = arg3.field2119;
            for (int var7 = 0; var7 < this.field2139; var7++) {
                arg2.field2116[var7] = this.field2116[var7];
                arg2.field2141[var7] = this.field2141[var7];
                arg2.field2142[var7] = this.field2142[var7];
                arg2.field2119[var7] = this.field2119[var7];
            }
            if (class90.field1536) {
                if (arg3.field2135 == null) {
                    arg3.field2135 = new class193();
                }
                arg2.field2135 = arg3.field2135;
                arg2.field2135.field3344 = false;
            } else {
                arg2.field2135 = null;
            }
        }
        arg2.field2128 = this.field2128;
        arg2.field2140 = this.field2140;
        arg2.field2130 = this.field2130;
        arg2.field2126 = this.field2126;
        arg2.field2131 = this.field2131;
        arg2.field2125 = this.field2125;
        arg2.field2122 = this.field2122;
        arg2.field2112 = this.field2112;
        arg2.field2115 = this.field2115;
        arg2.field2107 = this.field2107;
        arg2.field2148 = this.field2148;
        arg2.field2127 = this.field2127;
        arg2.field2123 = this.field2123;
        arg2.field2111 = this.field2111;
        arg2.field2108 = this.field2108;
        arg2.field2138 = this.field2138;
        arg2.field1123 = this.field1123;
        return arg2;
    }

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "()V", line = 2862)
    public static final void method799() {
        field2145 = new class126();
        field2149 = new class126();
        field2150 = new class126();
        field2151 = new class126();
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "([FI)[F", line = 2874)
    private static final float[] method800(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class224.method1545(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ISIB)I", line = 2883)
    private static final int method801(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class141.field2413[class29.method188(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class141.field2419.method104(69, arg1 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg2 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class141.field2419.method102(arg1 & 0xFFFF, -24769);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 >> 8) + (var10 & 0xFF00 << 8) + (var11 & 0xFF00);
            }
        }
        return (var4 << 8) + (255 - (arg3 & 0xFF));
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lvd;)Lvd;", line = 2944)
    public final class127 method802(class127 arg0) {
        if (this.field2139 == 0) {
            return null;
        }
        if (!this.field2136.field893) {
            this.method772();
        }
        int var2;
        int var3;
        if (class119.field2007 > 0) {
            var2 = this.field2136.field891 - (class119.field2007 * this.field2136.field890 >> 8) >> 3;
            var3 = this.field2136.field894 - (class119.field2007 * this.field2136.field895 >> 8) >> 3;
        } else {
            var2 = this.field2136.field891 - (class119.field2007 * this.field2136.field895 >> 8) >> 3;
            var3 = this.field2136.field894 - (class119.field2007 * this.field2136.field890 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class119.field2006 > 0) {
            var4 = this.field2136.field892 - (class119.field2006 * this.field2136.field890 >> 8) >> 3;
            var5 = this.field2136.field889 - (class119.field2006 * this.field2136.field895 >> 8) >> 3;
        } else {
            var4 = this.field2136.field892 - (class119.field2006 * this.field2136.field895 >> 8) >> 3;
            var5 = this.field2136.field889 - (class119.field2006 * this.field2136.field890 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class127 var8;
        if (arg0 == null || arg0.field2163.length < var6 * var7) {
            var8 = new class127(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field2619 = arg0.field2625 = var6;
            arg0.field2611 = arg0.field2610 = var7;
            arg0.method812();
        }
        var8.field2626 = var2;
        var8.field2615 = var4;
        if (field2152.length < this.field2139) {
            field2152 = new int[this.field2139];
            field2161 = new int[this.field2139];
        }
        for (int var9 = 0; var9 < this.field2120; var9++) {
            int var10 = (this.field2109[var9] - (this.field2124[var9] * class119.field2007 >> 8) >> 3) - var2;
            int var11 = (this.field2144[var9] - (this.field2124[var9] * class119.field2006 >> 8) >> 3) - var4;
            int var12 = this.field2138[var9];
            int var13 = this.field2138[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field2108[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field2152[var15] = var10;
                field2161[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field2132; var16++) {
            if (this.field2129[var16] <= 128) {
                short var17 = this.field2125[var16];
                short var18 = this.field2122[var16];
                short var19 = this.field2112[var16];
                int var20 = field2152[var17];
                int var21 = field2152[var18];
                int var22 = field2152[var19];
                int var23 = field2161[var17];
                int var24 = field2161[var18];
                int var25 = field2161[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class141.method944(var8.field2163, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIII[FFIF)V", line = 3071)
    private static final void method803(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
        int var10 = arg0 - arg3;
        int var11 = arg1 - arg4;
        int var12 = arg2 - arg5;
        float var13 = arg6[2] * (float) var12 + arg6[0] * (float) var10 + arg6[1] * (float) var11;
        float var14 = arg6[5] * (float) var12 + arg6[3] * (float) var10 + arg6[4] * (float) var11;
        float var15 = arg6[8] * (float) var12 + arg6[6] * (float) var10 + arg6[7] * (float) var11;
        float var16 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var16 = arg7 * var16;
        }
        float var17 = var14 + arg9 + 0.5F;
        if (arg8 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg8 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg8 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field2159 = var16;
        field2157 = var17;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(SS)V", line = 3121)
    public final void method804(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2132; var3++) {
            if (this.field2115[var3] == arg0) {
                this.field2115[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class141.field2419.method104(-118, arg0 & 0xFFFF);
            var5 = class141.field2419.method102(arg0 & 0xFFFF, -24769);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class141.field2419.method104(48, arg1 & 0xFFFF);
            var7 = class141.field2419.method102(arg1 & 0xFFFF, -24769);
        }
        if (var4 != var6 || var5 != var7) {
            this.field2113.field3344 = false;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILml;[[I[[IIII)V", line = 3162)
    public final void method805(int arg0, int arg1, class126 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field2136.field893) {
            arg2.method772();
        }
        int var9 = arg2.field2136.field891 + arg5;
        int var10 = arg2.field2136.field894 + arg5;
        int var11 = arg2.field2136.field892 + arg7;
        int var12 = arg2.field2136.field889 + arg7;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var9 < 0 || var10 + 128 >> 7 >= arg3.length || var11 < 0 || var12 + 128 >> 7 >= arg3[0].length) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg4 == null) {
                return;
            }
            if (var9 < 0 || var10 + 128 >> 7 >= arg4.length || var11 < 0 || var12 + 128 >> 7 >= arg4[0].length) {
                return;
            }
        } else {
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            int var15 = var11 >> 7;
            int var16 = var12 + 127 >> 7;
            if (arg3[var13][var15] == arg6 && arg3[var14][var15] == arg6 && arg3[var13][var16] == arg6 && arg3[var14][var16] == arg6) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var17 = 0; var17 < this.field2120; var17++) {
                int var18 = this.field2109[var17] + arg5;
                int var19 = this.field2144[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field2124[var17] = this.field2124[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field2136.field895;
            for (int var28 = 0; var28 < this.field2120; var28++) {
                int var29 = (this.field2124[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field2109[var28] + arg5;
                    int var31 = this.field2144[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field2124[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method399(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field2136.field890 - arg2.field2136.field895;
            for (int var42 = 0; var42 < this.field2120; var42++) {
                int var43 = this.field2109[var42] + arg5;
                int var44 = this.field2144[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field2124[var42] = var51 + this.field2124[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field2136.field890 - arg2.field2136.field895;
            for (int var53 = 0; var53 < this.field2120; var53++) {
                int var54 = this.field2109[var53] + arg5;
                int var55 = this.field2144[var53] + arg7;
                int var56 = var54 & 0x7F;
                int var57 = var55 & 0x7F;
                int var58 = var54 >> 7;
                int var59 = var55 >> 7;
                int var60 = (128 - var56) * arg3[var58][var59] + arg3[var58 + 1][var59] * var56 >> 7;
                int var61 = (128 - var56) * arg3[var58][var59 + 1] + arg3[var58 + 1][var59 + 1] * var56 >> 7;
                int var62 = (128 - var57) * var60 + var57 * var61 >> 7;
                int var63 = (128 - var56) * arg4[var58][var59] + arg4[var58 + 1][var59] * var56 >> 7;
                int var64 = (128 - var56) * arg4[var58][var59 + 1] + arg4[var58 + 1][var59 + 1] * var56 >> 7;
                int var65 = (128 - var57) * var63 + var57 * var64 >> 7;
                int var66 = var62 - var65;
                this.field2124[var53] = ((this.field2124[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field2121.field3344 = false;
        this.field2136.field893 = false;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIIIIJ)V", line = 3362)
    public final void method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        if (this.field2139 == 0) {
            return;
        }
        if (!this.field2136.field893) {
            this.method772();
        }
        short var11 = this.field2136.field896;
        short var12 = this.field2136.field895;
        short var13 = this.field2136.field890;
        int var14 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var15 = arg1 * arg6 + arg2 * var14 >> 16;
        int var16 = (arg1 * var13 + arg2 * var11 >> 16) + var15;
        if (var16 <= 50) {
            return;
        }
        int var17 = (-var11 * arg2 + arg1 * var12 >> 16) + var15;
        if (var17 >= 3584) {
            return;
        }
        int var18 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var19 = var11 + var18 << 9;
        if (var19 / var16 <= class170.field2965) {
            return;
        }
        int var20 = var18 - var11 << 9;
        if (var20 / var16 >= class98.field1704) {
            return;
        }
        int var21 = arg2 * arg6 - arg1 * var14 >> 16;
        int var22 = (arg1 * var11 + arg2 * var13 >> 16) + var21 << 9;
        if (var22 / var16 <= class262.field4550) {
            return;
        }
        int var23 = (-var11 * arg1 + arg2 * var12 >> 16) + var21 << 9;
        if (var23 / var16 >= class8.field189) {
            return;
        }
        int var24 = 0;
        int var25 = 0;
        if (arg0 != 0) {
            var24 = class141.field2424[arg0];
            var25 = class141.field2411[arg0];
        }
        if (arg8 > 0L && class77.field1419 && var17 > 0) {
            int var26;
            int var27;
            if (var18 > 0) {
                var26 = var20 / var16;
                var27 = var19 / var17;
            } else {
                var26 = var20 / var17;
                var27 = var19 / var16;
            }
            int var28;
            int var29;
            if (var21 > 0) {
                var28 = var23 / var16;
                var29 = var22 / var17;
            } else {
                var28 = var23 / var17;
                var29 = var22 / var16;
            }
            if (class15.field409 >= var26 && class15.field409 <= var27 && class152.field2614 >= var28 && class152.field2614 <= var29) {
                int var30 = 999999;
                int var31 = -999999;
                int var32 = 999999;
                int var33 = -999999;
                short var34 = this.field2136.field891;
                short var35 = this.field2136.field894;
                short var36 = this.field2136.field892;
                short var37 = this.field2136.field889;
                int[] var38 = new int[] { var34, var35, var34, var35, var34, var35, var34, var35 };
                int[] var39 = new int[] { var36, var36, var37, var37, var36, var36, var37, var37 };
                int[] var40 = new int[] { var12, var12, var12, var12, var13, var13, var13, var13 };
                for (int var41 = 0; var41 < 8; var41++) {
                    int var42 = var38[var41];
                    int var43 = var40[var41];
                    int var44 = var39[var41];
                    if (arg0 != 0) {
                        int var45 = var24 * var44 + var25 * var42 >> 16;
                        var44 = var25 * var44 - var24 * var42 >> 16;
                        var42 = var45;
                    }
                    int var46 = arg5 + var42;
                    int var47 = arg6 + var43;
                    int var48 = arg7 + var44;
                    int var49 = arg3 * var48 + arg4 * var46 >> 16;
                    int var50 = arg4 * var48 - arg3 * var46 >> 16;
                    int var52 = arg2 * var47 - arg1 * var50 >> 16;
                    int var53 = arg1 * var47 + arg2 * var50 >> 16;
                    if (var53 > 0) {
                        int var55 = (var49 << 9) / var53;
                        int var56 = (var52 << 9) / var53;
                        if (var55 < var30) {
                            var30 = var55;
                        }
                        if (var55 > var31) {
                            var31 = var55;
                        }
                        if (var56 < var32) {
                            var32 = var56;
                        }
                        if (var56 > var33) {
                            var33 = var56;
                        }
                    }
                }
                if (class15.field409 >= var30 && class15.field409 <= var31 && class152.field2614 >= var32 && class152.field2614 <= var33) {
                    if (this.field1123) {
                        class235.field4044[class281.field4853++] = arg8;
                    } else {
                        if (field2152.length < this.field2139) {
                            field2152 = new int[this.field2139];
                            field2161 = new int[this.field2139];
                        }
                        int var57 = 0;
                        label118: while (true) {
                            if (var57 >= this.field2120) {
                                int var77 = 0;
                                while (true) {
                                    if (var77 >= this.field2132) {
                                        break label118;
                                    }
                                    short var78 = this.field2125[var77];
                                    short var79 = this.field2122[var77];
                                    short var80 = this.field2112[var77];
                                    if (this.method786(class15.field409, class152.field2614, field2161[var78], field2161[var79], field2161[var80], field2152[var78], field2152[var79], field2152[var80])) {
                                        class235.field4044[class281.field4853++] = arg8;
                                        break label118;
                                    }
                                    var77++;
                                }
                            }
                            int var58 = this.field2109[var57];
                            int var59 = this.field2124[var57];
                            int var60 = this.field2144[var57];
                            if (arg0 != 0) {
                                int var61 = var24 * var60 + var25 * var58 >> 16;
                                var60 = var25 * var60 - var24 * var58 >> 16;
                                var58 = var61;
                            }
                            int var62 = arg5 + var58;
                            int var63 = arg6 + var59;
                            int var64 = arg7 + var60;
                            int var65 = arg3 * var64 + arg4 * var62 >> 16;
                            int var66 = arg4 * var64 - arg3 * var62 >> 16;
                            int var68 = arg2 * var63 - arg1 * var66 >> 16;
                            int var69 = arg1 * var63 + arg2 * var66 >> 16;
                            if (var69 < 50) {
                                break;
                            }
                            int var71 = (var65 << 9) / var69;
                            int var72 = (var68 << 9) / var69;
                            int var73 = this.field2138[var57];
                            int var74 = this.field2138[var57 + 1];
                            for (int var75 = var73; var75 < var74; var75++) {
                                int var76 = this.field2108[var75] - 1;
                                if (var76 == -1) {
                                    break;
                                }
                                field2152[var76] = var71;
                                field2161[var76] = var72;
                            }
                            var57++;
                        }
                    }
                }
            }
        }
        GL var81 = class247.field4253;
        var81.glPushMatrix();
        var81.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var81.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method770();
        var81.glPopMatrix();
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)V", line = 3637)
    public final void method195(int arg0) {
        int var2 = class141.field2424[arg0];
        int var3 = class141.field2411[arg0];
        for (int var4 = 0; var4 < this.field2120; var4++) {
            int var5 = this.field2144[var4] * var2 + this.field2109[var4] * var3 >> 16;
            this.field2144[var4] = this.field2144[var4] * var3 - this.field2109[var4] * var2 >> 16;
            this.field2109[var4] = var5;
        }
        this.field2136.field893 = false;
        this.field2121.field3344 = false;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 3656)
    private static final void method806(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
        int var12 = arg0 - arg3;
        int var13 = arg1 - arg4;
        int var14 = arg2 - arg5;
        float var15 = arg7[2] * (float) var14 + arg7[0] * (float) var12 + arg7[1] * (float) var13;
        float var16 = arg7[5] * (float) var14 + arg7[3] * (float) var12 + arg7[4] * (float) var13;
        float var17 = arg7[8] * (float) var14 + arg7[6] * (float) var12 + arg7[7] * (float) var13;
        float var18;
        float var19;
        if (arg6 == 0) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + 0.5F - var17;
        } else if (arg6 == 1) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + var17 + 0.5F;
        } else if (arg6 == 2) {
            var18 = arg9 + 0.5F - var15;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 3) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 4) {
            var18 = arg11 + var17 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else {
            var18 = arg11 + 0.5F - var17;
            var19 = arg10 + 0.5F - var16;
        }
        if (arg8 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg8 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        field2155 = var18;
        field2154 = var19;
    }
}
