import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class151 extends class10 {

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "F")
    public float field1917;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "F")
    public float field1918;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "F")
    public float field1920;

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "F")
    public float field1922;

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "F")
    public float field1925;

    @OriginalMember(owner = "client!ho", name = "q", descriptor = "F")
    public float field1928;

    @OriginalMember(owner = "client!ho", name = "s", descriptor = "F")
    public float field1930;

    @OriginalMember(owner = "client!ho", name = "u", descriptor = "F")
    public float field1932;

    @OriginalMember(owner = "client!ho", name = "v", descriptor = "F")
    public float field1933;

    @OriginalMember(owner = "client!ho", name = "B", descriptor = "F")
    public float field1939;

    @OriginalMember(owner = "client!ho", name = "C", descriptor = "F")
    public float field1940;

    @OriginalMember(owner = "client!ho", name = "F", descriptor = "F")
    public float field1943;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!ho", name = "t", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!ho", name = "w", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!ho", name = "x", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!ho", name = "y", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!ho", name = "z", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!ho", name = "A", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!ho", name = "D", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!ho", name = "E", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!ho", name = "G", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!ho", name = "H", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "(I)V", line = 4)
    public final void method40(int arg0) {
        field1945++;
        this.field1943 = 1.0F;
        this.field1917 = this.field1930 = class385.field5415[arg0 & 0x3FFF];
        this.field1939 = class385.field5413[arg0 & 0x3FFF];
        this.field1940 = this.field1920 = this.field1933 = this.field1925 = this.field1922 = this.field1928 = this.field1918 = 0.0F;
        this.field1932 = -this.field1939;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "()V", line = 20)
    public final void method24() {
        this.field1943 = this.field1917 = this.field1930 = 1.0F;
        this.field1925 = this.field1928 = this.field1940 = this.field1939 = this.field1920 = this.field1932 = this.field1933 = this.field1922 = this.field1918 = 0.0F;
        field1916++;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(III[I)V", line = 32)
    public final void method29(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg0 - this.field1933);
        int var6 = (int) ((float) arg1 - this.field1922);
        field1924++;
        int var7 = (int) ((float) arg2 - this.field1918);
        arg3[0] = (int) ((float) var7 * this.field1928 + (float) var5 * this.field1943 + (float) var6 * this.field1925);
        arg3[2] = (int) ((float) var7 * this.field1930 + (float) var5 * this.field1920 + (float) var6 * this.field1932);
        arg3[1] = (int) ((float) var7 * this.field1939 + (float) var5 * this.field1940 + (float) var6 * this.field1917);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)V", line = 51)
    public final void method33(int arg0, int arg1, int arg2) {
        this.field1933 = arg0;
        this.field1943 = this.field1917 = this.field1930 = 1.0F;
        this.field1922 = arg1;
        this.field1918 = arg2;
        field1934++;
        this.field1925 = this.field1928 = this.field1940 = this.field1939 = this.field1920 = this.field1932 = 0.0F;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIII)V", line = 63)
    public final void method26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1929++;
        float var7 = class385.field5415[arg3 & 0x3FFF];
        float var8 = class385.field5413[arg3 & 0x3FFF];
        float var9 = class385.field5415[arg4 & 0x3FFF];
        float var10 = class385.field5413[arg4 & 0x3FFF];
        float var11 = class385.field5415[arg5 & 0x3FFF];
        float var12 = class385.field5413[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field1940 = var7 * var12;
        this.field1925 = -var9 * var12 + var10 * var13;
        this.field1917 = var7 * var11;
        this.field1939 = -var8;
        this.field1932 = var9 * var13 + var10 * var12;
        this.field1928 = var7 * var10;
        this.field1943 = var9 * var11 + var10 * var14;
        this.field1920 = -var10 * var11 + var9 * var14;
        this.field1930 = var7 * var9;
        this.field1922 = (float) (-arg0) * this.field1925 - ((float) arg1 * this.field1917) - (float) arg2 * this.field1932;
        this.field1918 = (float) (-arg0) * this.field1928 - ((float) arg1 * this.field1939) - (float) arg2 * this.field1930;
        this.field1933 = (float) (-arg0) * this.field1943 - (float) arg1 * this.field1940 - (float) arg2 * this.field1920;
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)V", line = 98)
    public final void method34(int arg0) {
        this.field1917 = 1.0F;
        field1919++;
        this.field1943 = this.field1930 = class385.field5415[arg0 & 0x3FFF];
        this.field1920 = class385.field5413[arg0 & 0x3FFF];
        this.field1940 = this.field1933 = this.field1925 = this.field1932 = this.field1922 = this.field1939 = this.field1918 = 0.0F;
        this.field1928 = -this.field1920;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "([I)V", line = 115)
    public final void method41(int[] arg0) {
        field1938++;
        float var2 = (float) arg0[0] - this.field1933;
        float var3 = (float) arg0[1] - this.field1922;
        float var4 = (float) arg0[2] - this.field1918;
        arg0[0] = (int) (this.field1928 * var4 + this.field1943 * var2 + this.field1925 * var3);
        arg0[2] = (int) (this.field1930 * var4 + this.field1932 * var3 + this.field1920 * var2);
        arg0[1] = (int) (this.field1939 * var4 + this.field1940 * var2 + this.field1917 * var3);
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)V", line = 135)
    public final void method30(int arg0) {
        field1937++;
        float var2 = class385.field5415[arg0 & 0x3FFF];
        float var3 = class385.field5413[arg0 & 0x3FFF];
        float var4 = this.field1943;
        float var5 = this.field1940;
        float var6 = this.field1920;
        float var7 = this.field1933;
        this.field1943 = this.field1928 * var3 + var2 * var4;
        this.field1940 = this.field1939 * var3 + var2 * var5;
        this.field1928 = this.field1928 * var2 - (var3 * var4);
        this.field1939 = this.field1939 * var2 - (var3 * var5);
        this.field1920 = this.field1930 * var3 + var2 * var6;
        this.field1930 = this.field1930 * var2 - var3 * var6;
        this.field1933 = this.field1918 * var3 + var2 * var7;
        this.field1918 = this.field1918 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "(I)V", line = 164)
    public final void method37(int arg0) {
        this.field1930 = 1.0F;
        field1923++;
        this.field1943 = this.field1917 = class385.field5415[arg0 & 0x3FFF];
        this.field1925 = class385.field5413[arg0 & 0x3FFF];
        this.field1920 = this.field1933 = this.field1932 = this.field1922 = this.field1928 = this.field1939 = this.field1918 = 0.0F;
        this.field1940 = -this.field1925;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(II)S", line = 176)
    public static final short method921(int arg0, int arg1) {
        field1944++;
        int var2 = (arg0 & 0xFCC8) >> 10;
        int var3 = -63 % ((arg1 - 5) / 40);
        int var4 = arg0 >> 3 & 0x70;
        int var5 = arg0 & 0x7F;
        int var6 = var5 > 64 ? (127 - var5) * var4 >> 7 : var4 * var5 >> 7;
        int var7 = var5 + var6;
        int var8;
        if (var7 == 0) {
            var8 = var6 << 1;
        } else {
            var8 = (var6 << 8) / var7;
        }
        return (short) (var2 << 10 | var8 >> 4 << 7 | var7);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lhba;)V", line = 206)
    public final void method25(class10 arg0) {
        field1927++;
        class151 var2 = (class151) arg0;
        this.field1932 = var2.field1932;
        this.field1930 = var2.field1930;
        this.field1918 = var2.field1918;
        this.field1917 = var2.field1917;
        this.field1922 = var2.field1922;
        this.field1943 = var2.field1943;
        this.field1928 = var2.field1928;
        this.field1920 = var2.field1920;
        this.field1940 = var2.field1940;
        this.field1925 = var2.field1925;
        this.field1939 = var2.field1939;
        this.field1933 = var2.field1933;
    }

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "(I)V", line = 239)
    public final void method38(int arg0) {
        field1935++;
        float var2 = class385.field5415[arg0 & 0x3FFF];
        float var3 = class385.field5413[arg0 & 0x3FFF];
        float var4 = this.field1925;
        float var5 = this.field1917;
        float var6 = this.field1932;
        this.field1925 = var2 * var4 - (this.field1928 * var3);
        float var7 = this.field1922;
        this.field1917 = var2 * var5 - (this.field1939 * var3);
        this.field1928 = this.field1928 * var2 + var3 * var4;
        this.field1939 = this.field1939 * var2 + var3 * var5;
        this.field1932 = var2 * var6 - (this.field1930 * var3);
        this.field1922 = var2 * var7 - (this.field1918 * var3);
        this.field1930 = this.field1930 * var2 + var3 * var6;
        this.field1918 = this.field1918 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "()Lhba;", line = 267)
    public final class10 method35() {
        field1936++;
        class151 var1 = new class151();
        var1.field1920 = this.field1920;
        var1.field1918 = this.field1918;
        var1.field1930 = this.field1930;
        var1.field1939 = this.field1939;
        var1.field1925 = this.field1925;
        var1.field1932 = this.field1932;
        var1.field1943 = this.field1943;
        var1.field1922 = this.field1922;
        var1.field1928 = this.field1928;
        var1.field1933 = this.field1933;
        var1.field1940 = this.field1940;
        var1.field1917 = this.field1917;
        return var1;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(III[I)V", line = 296)
    public final void method32(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field1930 + (float) arg0 * this.field1928 + (float) arg1 * this.field1939);
        field1942++;
        arg3[1] = (int) ((float) arg2 * this.field1932 + (float) arg0 * this.field1925 + (float) arg1 * this.field1917);
        arg3[0] = (int) ((float) arg2 * this.field1920 + (float) arg0 * this.field1943 + (float) arg1 * this.field1940);
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(III)V", line = 306)
    public final void method39(int arg0, int arg1, int arg2) {
        field1926++;
        this.field1933 += arg0;
        this.field1922 += arg1;
        this.field1918 += arg2;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V", line = 319)
    public final void method23(int arg0) {
        field1941++;
        float var2 = class385.field5415[arg0 & 0x3FFF];
        float var3 = class385.field5413[arg0 & 0x3FFF];
        float var4 = this.field1943;
        float var5 = this.field1940;
        float var6 = this.field1920;
        this.field1943 = var2 * var4 - this.field1925 * var3;
        float var7 = this.field1933;
        this.field1940 = var2 * var5 - this.field1917 * var3;
        this.field1925 = this.field1925 * var2 + var3 * var4;
        this.field1920 = var2 * var6 - this.field1932 * var3;
        this.field1917 = this.field1917 * var2 + var3 * var5;
        this.field1933 = var2 * var7 - this.field1922 * var3;
        this.field1932 = this.field1932 * var2 + var3 * var6;
        this.field1922 = this.field1922 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(III[I)V", line = 346)
    public final void method36(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field1930 + (float) arg0 * this.field1928 + (float) arg1 * this.field1939 + this.field1918);
        field1921++;
        arg3[1] = (int) ((float) arg2 * this.field1932 + (float) arg0 * this.field1925 + (float) arg1 * this.field1917 + this.field1922);
        arg3[0] = (int) ((float) arg2 * this.field1920 + (float) arg0 * this.field1943 + (float) arg1 * this.field1940 + this.field1933);
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V", line = 359)
    public class151() {
        this.method24();
    }
}
