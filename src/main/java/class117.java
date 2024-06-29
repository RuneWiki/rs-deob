import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class117 extends class414 {

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
    public int field1930;

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "I")
    public int field1931;

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
    public int field1932;

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
    public int field1933;

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "I")
    public int field1934;

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
    public int field1935;

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "I")
    public int field1936;

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "I")
    public int field1937;

    @OriginalMember(owner = "client!sq", name = "q", descriptor = "I")
    public int field1938;

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "I")
    public int field1939;

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "I")
    public int field1940;

    @OriginalMember(owner = "client!sq", name = "t", descriptor = "I")
    public int field1941;

    @OriginalMember(owner = "client!sq", name = "O", descriptor = "(I)V", line = 5)
    public final void method864(int arg0) {
        this.field1936 = 32768;
        this.field1932 = this.field1934 = class528.field7786[arg0 & 0x3FFF];
        this.field1931 = class528.field7783[arg0 & 0x3FFF];
        this.field1937 = -this.field1931;
        this.field1940 = this.field1941 = this.field1939 = this.field1930 = this.field1933 = this.field1938 = this.field1935 = 0;
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(I)V", line = 13)
    public final void method865(int arg0) {
        int var2 = class528.field7786[arg0 & 0x3FFF];
        int var3 = class528.field7783[arg0 & 0x3FFF];
        int var4 = this.field1932;
        int var5 = this.field1940;
        int var6 = this.field1931;
        int var7 = this.field1941;
        this.field1932 = this.field1937 * var3 + var2 * var4 >> 15;
        this.field1937 = this.field1937 * var2 - var3 * var4 >> 15;
        this.field1940 = this.field1938 * var3 + var2 * var5 >> 15;
        this.field1938 = this.field1938 * var2 - var3 * var5 >> 15;
        this.field1931 = this.field1934 * var3 + var2 * var6 >> 15;
        this.field1934 = this.field1934 * var2 - var3 * var6 >> 15;
        this.field1941 = this.field1935 * var3 + var2 * var7 >> 15;
        this.field1935 = this.field1935 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!sq", name = "ba", descriptor = "(Lia;)V", line = 37)
    public final void method866(class414 arg0) {
        class117 var2 = (class117) arg0;
        this.field1932 = var2.field1932;
        this.field1940 = var2.field1940;
        this.field1931 = var2.field1931;
        this.field1941 = var2.field1941;
        this.field1939 = var2.field1939;
        this.field1936 = var2.field1936;
        this.field1930 = var2.field1930;
        this.field1933 = var2.field1933;
        this.field1937 = var2.field1937;
        this.field1938 = var2.field1938;
        this.field1934 = var2.field1934;
        this.field1935 = var2.field1935;
    }

    @OriginalMember(owner = "client!sq", name = "na", descriptor = "(I)V", line = 53)
    public final void method867(int arg0) {
        int var2 = class528.field7786[arg0 & 0x3FFF];
        int var3 = class528.field7783[arg0 & 0x3FFF];
        int var4 = this.field1939;
        int var5 = this.field1936;
        int var6 = this.field1930;
        int var7 = this.field1933;
        this.field1939 = var2 * var4 - this.field1937 * var3 >> 15;
        this.field1937 = this.field1937 * var2 + var3 * var4 >> 15;
        this.field1936 = var2 * var5 - this.field1938 * var3 >> 15;
        this.field1938 = this.field1938 * var2 + var3 * var5 >> 15;
        this.field1930 = var2 * var6 - this.field1934 * var3 >> 15;
        this.field1934 = this.field1934 * var2 + var3 * var6 >> 15;
        this.field1933 = var2 * var7 - this.field1935 * var3 >> 15;
        this.field1935 = this.field1935 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!sq", name = "R", descriptor = "(III)V", line = 74)
    public final void method868(int arg0, int arg1, int arg2) {
        this.field1939 = this.field1937 = this.field1940 = this.field1938 = this.field1931 = this.field1930 = 0;
        this.field1932 = this.field1936 = this.field1934 = 32768;
        this.field1941 = arg0;
        this.field1933 = arg1;
        this.field1935 = arg2;
    }

    @OriginalMember(owner = "client!sq", name = "ma", descriptor = "(I)V", line = 82)
    public final void method869(int arg0) {
        this.field1934 = 32768;
        this.field1932 = this.field1936 = class528.field7786[arg0 & 0x3FFF];
        this.field1939 = class528.field7783[arg0 & 0x3FFF];
        this.field1940 = -this.field1939;
        this.field1931 = this.field1941 = this.field1930 = this.field1933 = this.field1937 = this.field1938 = this.field1935 = 0;
    }

    @OriginalMember(owner = "client!sq", name = "X", descriptor = "([I)V", line = 90)
    public final void method870(int[] arg0) {
        int var2 = arg0[0] - this.field1941;
        int var3 = arg0[1] - this.field1933;
        int var4 = arg0[2] - this.field1935;
        arg0[0] = this.field1937 * var4 + this.field1939 * var3 + this.field1932 * var2 >> 15;
        arg0[1] = this.field1938 * var4 + this.field1940 * var2 + this.field1936 * var3 >> 15;
        arg0[2] = this.field1934 * var4 + this.field1931 * var2 + this.field1930 * var3 >> 15;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "()Lia;", line = 108)
    public final class414 method871() {
        class117 var1 = new class117();
        var1.field1932 = this.field1932;
        var1.field1940 = this.field1940;
        var1.field1931 = this.field1931;
        var1.field1941 = this.field1941;
        var1.field1939 = this.field1939;
        var1.field1936 = this.field1936;
        var1.field1930 = this.field1930;
        var1.field1933 = this.field1933;
        var1.field1937 = this.field1937;
        var1.field1938 = this.field1938;
        var1.field1934 = this.field1934;
        var1.field1935 = this.field1935;
        return var1;
    }

    @OriginalMember(owner = "client!sq", name = "HA", descriptor = "()V", line = 124)
    public final void method872() {
        this.field1939 = this.field1937 = this.field1940 = this.field1938 = this.field1931 = this.field1930 = this.field1941 = this.field1933 = this.field1935 = 0;
        this.field1932 = this.field1936 = this.field1934 = 32768;
    }

    @OriginalMember(owner = "client!sq", name = "Q", descriptor = "(IIIIII)V", line = 129)
    public final void method873(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class528.field7786[arg3 & 0x3FFF];
        int var8 = class528.field7783[arg3 & 0x3FFF];
        int var9 = class528.field7786[arg4 & 0x3FFF];
        int var10 = class528.field7783[arg4 & 0x3FFF];
        int var11 = class528.field7786[arg5 & 0x3FFF];
        int var12 = class528.field7783[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field1932 = var9 * var11 + var10 * var14 >> 15;
        this.field1939 = -var9 * var12 + var10 * var13 >> 15;
        this.field1937 = var7 * var10 >> 15;
        this.field1940 = var7 * var12 >> 15;
        this.field1936 = var7 * var11 >> 15;
        this.field1938 = -var8;
        this.field1931 = -var10 * var11 + var9 * var14 >> 15;
        this.field1930 = var9 * var13 + var10 * var12 >> 15;
        this.field1934 = var7 * var9 >> 15;
        this.field1941 = -arg0 * this.field1932 - this.field1940 * arg1 - this.field1931 * arg2 >> 15;
        this.field1933 = -arg0 * this.field1939 - this.field1936 * arg1 - this.field1930 * arg2 >> 15;
        this.field1935 = -arg0 * this.field1937 - this.field1938 * arg1 - this.field1934 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!sq", name = "YA", descriptor = "(I)V", line = 158)
    public final void method874(int arg0) {
        this.field1932 = 32768;
        this.field1936 = this.field1934 = class528.field7786[arg0 & 0x3FFF];
        this.field1938 = class528.field7783[arg0 & 0x3FFF];
        this.field1930 = -this.field1938;
        this.field1940 = this.field1931 = this.field1941 = this.field1939 = this.field1933 = this.field1937 = this.field1935 = 0;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(III[I)V", line = 168)
    public final void method875(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field1931 * arg2 + this.field1940 * arg1 + this.field1932 * arg0 >> 15) + this.field1941;
        arg3[1] = (this.field1930 * arg2 + this.field1939 * arg0 + this.field1936 * arg1 >> 15) + this.field1933;
        arg3[2] = (this.field1934 * arg2 + this.field1938 * arg1 + this.field1937 * arg0 >> 15) + this.field1935;
    }

    @OriginalMember(owner = "client!sq", name = "ZA", descriptor = "(III)V", line = 173)
    public final void method876(int arg0, int arg1, int arg2) {
        this.field1941 += arg0;
        this.field1933 += arg1;
        this.field1935 += arg2;
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "()V", line = 177)
    public class117() {
        this.method872();
    }

    @OriginalMember(owner = "client!sq", name = "E", descriptor = "(III[I)V", line = 181)
    public final void method877(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field1931 * arg2 + this.field1940 * arg1 + this.field1932 * arg0 >> 15;
        arg3[1] = this.field1930 * arg2 + this.field1939 * arg0 + this.field1936 * arg1 >> 15;
        arg3[2] = this.field1934 * arg2 + this.field1938 * arg1 + this.field1937 * arg0 >> 15;
    }
}
