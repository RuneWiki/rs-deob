import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class522 {

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "[B")
    private byte[] field7271 = new byte[32];

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "[J")
    private long[] field7266 = new long[8];

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "[J")
    private long[] field7265 = new long[8];

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "[J")
    private long[] field7277 = new long[8];

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    private int field7276 = 0;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "[J")
    private long[] field7279 = new long[8];

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "[J")
    private long[] field7270 = new long[8];

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    private int field7272 = 0;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "[B")
    private byte[] field7275 = new byte[64];

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field7278 = 0;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field7269;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field7273;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public static int field7274;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
    public static int field7280;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    public static int field7282;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public static int field7283;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "Lra;")
    public static class262 field7281;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
    public static void method2913(byte arg0) {
        int var1 = -35 / (arg0 / 52);
        field7281 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([BIJ)V")
    public final void method2914(byte[] arg0, int arg1, long arg2) {
        field7283++;
        int var5 = 0;
        int var6 = 8 - ((int) arg2 & 0x7) & 0x7;
        int var7 = this.field7276 & 0x7;
        if (arg1 != 255) {
            return;
        }
        long var8 = arg2;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field7271[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field7271[var10] = (byte) var16;
            var11 = var16 >>> 8;
            var8 >>>= 0x8;
            var10--;
        }
        while (arg2 > 8L) {
            int var15 = arg0[var5] << var6 & 0xFF | (arg0[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field7275[this.field7272] = (byte) class292.method1790(this.field7275[this.field7272], var15 >>> var7);
            this.field7272++;
            this.field7276 += 8 - var7;
            if (this.field7276 == 512) {
                this.method2915(-128);
                this.field7276 = this.field7272 = 0;
            }
            this.field7275[this.field7272] = (byte) class143.method783(255, var15 << 8 - var7);
            arg2 -= 8L;
            var5++;
            this.field7276 += var7;
        }
        int var12;
        if (arg2 <= 0L) {
            var12 = 0;
        } else {
            var12 = arg0[var5] << var6 & 0xFF;
            this.field7275[this.field7272] = (byte) class292.method1790(this.field7275[this.field7272], var12 >>> var7);
        }
        if ((long) var7 + arg2 < 8L) {
            this.field7276 = (int) ((long) this.field7276 + arg2);
            return;
        }
        this.field7272++;
        long var13 = arg2 - (long) (8 - var7);
        this.field7276 += 8 - var7;
        if (this.field7276 == 512) {
            this.method2915(-114);
            this.field7276 = this.field7272 = 0;
        }
        this.field7275[this.field7272] = (byte) class143.method783(255, var12 << 8 - var7);
        this.field7276 += (int) var13;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    private final void method2915(int arg0) {
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field7277[var2] = class93.method509(class491.method2760(255L, (long) this.field7275[var3 + 7]), class93.method509(class93.method509(class491.method2760(255L, (long) this.field7275[var3 + 5]) << 16, class93.method509(class491.method2760(255L, (long) this.field7275[var3 + 4]) << 24, class93.method509(class93.method509(class93.method509((long) this.field7275[var3] << 56, class491.method2760((long) this.field7275[var3 + 1], 255L) << 48), class491.method2760(255L, (long) this.field7275[var3 + 2]) << 40), class491.method2760((long) this.field7275[var3 + 3] << 32, 0xFFL << 32)))), class491.method2760((long) this.field7275[var3 + 6] << 8, 0xFFL << 8)));
            var2++;
            var3 += 8;
        }
        field7282++;
        for (int var4 = 0; var4 < 8; var4++) {
            this.field7279[var4] = class93.method509(this.field7277[var4], this.field7266[var4] = this.field7270[var4]);
        }
        int var5 = 115 % ((-arg0 - 67) / 41);
        for (int var6 = 1; var6 <= 10; var6++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.field7265[var8] = 0L;
                int var14 = 0;
                int var15 = 56;
                while (var14 < 8) {
                    this.field7265[var8] = class93.method509(this.field7265[var8], class176.field2270[var14][class143.method783((int) (this.field7266[class143.method783(7, var8 - var14)] >>> var15), 255)]);
                    var14++;
                    var15 -= 8;
                }
            }
            for (int var9 = 0; var9 < 8; var9++) {
                this.field7266[var9] = this.field7265[var9];
            }
            this.field7266[0] = class93.method509(this.field7266[0], class176.field2269[var6]);
            for (int var10 = 0; var10 < 8; var10++) {
                this.field7265[var10] = this.field7266[var10];
                int var12 = 0;
                int var13 = 56;
                while (var12 < 8) {
                    this.field7265[var10] = class93.method509(this.field7265[var10], class176.field2270[var12][class143.method783(255, (int) (this.field7279[class143.method783(var10 - var12, 7)] >>> var13))]);
                    var12++;
                    var13 -= 8;
                }
            }
            for (int var11 = 0; var11 < 8; var11++) {
                this.field7279[var11] = this.field7265[var11];
            }
        }
        for (int var7 = 0; var7 < 8; var7++) {
            this.field7270[var7] = class93.method509(this.field7270[var7], class93.method509(this.field7277[var7], this.field7279[var7]));
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V")
    public static final void method2916(boolean arg0) {
        field7274++;
        if (class558.field7815 != null) {
            return;
        }
        Container var1;
        if (class247.field3111 == null) {
            var1 = class31.field488.field3644;
        } else {
            var1 = class247.field3111;
        }
        class611.field8788 = var1.getSize().width;
        class322.field4443 = var1.getSize().height;
        if (!arg0) {
            method2920(true, 111);
        }
        if (class247.field3111 == var1) {
            Insets var2 = class247.field3111.getInsets();
            class611.field8788 -= var2.right + var2.left;
            class322.field4443 -= var2.top + var2.bottom;
        }
        if (class207.method1324((byte) 106) == 1) {
            class223.field2857 = (class611.field8788 - class586.field8501) / 2;
            class221.field2819 = 0;
            class604.field8711 = class164.field2082;
            class502.field6955 = class586.field8501;
        } else if (class282.field3697 < 96 && class428.field5845 == 0) {
            int var3 = class611.field8788 > 1024 ? 1024 : class611.field8788;
            int var4 = class322.field4443 > 768 ? 768 : class322.field4443;
            class223.field2857 = (class611.field8788 - var3) / 2;
            class502.field6955 = var3;
            class604.field8711 = var4;
            class221.field2819 = 0;
        } else {
            class502.field6955 = class611.field8788;
            class604.field8711 = class322.field4443;
            class221.field2819 = 0;
            class223.field2857 = 0;
        }
        if (class628.field9174 != class602.field8701) {
            boolean var10000;
            if (class502.field6955 < 1024 && class604.field8711 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class141.field1806.setSize(class502.field6955, class604.field8711);
        if (class301.field3918 != null) {
            class301.field3918.method187(class141.field1806);
        }
        if (class247.field3111 == var1) {
            Insets var5 = class247.field3111.getInsets();
            class141.field1806.setLocation(class223.field2857 + var5.left, class221.field2819 + var5.top);
        } else {
            class141.field1806.setLocation(class223.field2857, class221.field2819);
        }
        if (class126.field1565 != -1) {
            class266.method1638(true, true);
        }
        class342.method2152(-97);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB[B)V")
    public final void method2917(int arg0, byte arg1, byte[] arg2) {
        field7267++;
        this.field7275[this.field7272] = (byte) class292.method1790(this.field7275[this.field7272], 0x80 >>> class143.method783(7, this.field7276));
        this.field7272++;
        int var4 = 96 % ((-arg1 - 42) / 39);
        if (this.field7272 > 32) {
            while (true) {
                if (this.field7272 >= 64) {
                    this.method2915(84);
                    this.field7272 = 0;
                    break;
                }
                this.field7275[this.field7272++] = 0;
            }
        }
        while (this.field7272 < 32) {
            this.field7275[this.field7272++] = 0;
        }
        class205.method1311(this.field7271, 0, this.field7275, 32, 32);
        this.method2915(-21);
        int var5 = 0;
        int var6 = arg0;
        while (var5 < 8) {
            long var7 = this.field7270[var5];
            arg2[var6] = (byte) ((int) (var7 >>> 56));
            arg2[var6 + 1] = (byte) ((int) (var7 >>> 48));
            arg2[var6 + 2] = (byte) ((int) (var7 >>> 40));
            arg2[var6 + 3] = (byte) ((int) (var7 >>> 32));
            arg2[var6 + 4] = (byte) ((int) (var7 >>> 24));
            arg2[var6 + 5] = (byte) ((int) (var7 >>> 16));
            arg2[var6 + 6] = (byte) ((int) (var7 >>> 8));
            arg2[var6 + 7] = (byte) ((int) var7);
            var6 += 8;
            var5++;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
    public final void method2918(int arg0) {
        for (int var2 = 0; var2 < 32; var2++) {
            this.field7271[var2] = 0;
        }
        field7280++;
        this.field7275[0] = 0;
        if (arg0 != 7) {
            this.field7279 = null;
        }
        this.field7276 = this.field7272 = 0;
        for (int var3 = 0; var3 < 8; var3++) {
            this.field7270[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljq;B)Ljava/lang/String;")
    public static final String method2919(class447 arg0, byte arg1) {
        field7268++;
        if (client.method3572(arg0).method2768(19270) == 0) {
            return null;
        } else if (arg1 > -30) {
            return null;
        } else if (arg0.field6204 == null || arg0.field6204.trim().length() == 0) {
            return class427.field5824 ? "Hidden-use" : null;
        } else {
            return arg0.field6204;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZI)V")
    public static final void method2920(boolean arg0, int arg1) {
        if (!arg0) {
            method2919(null, (byte) -50);
        }
        field7269++;
        class632 var2 = class641.method3699(-118, 12, arg1);
        var2.method3655(0);
    }
}
