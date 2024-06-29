import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class111 {

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public int field1933;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public int field1935;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public int field1946;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public int field1947;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lof;")
    private class242 field1942;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Lnd;")
    private class319 field1934;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "Lnd;")
    private class319 field1936;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1943;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1944;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "[B")
    private byte[] field1932;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "[B")
    private byte[] field1940;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "[B")
    private byte[] field1945;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "[I")
    private int[] field1937;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "[I")
    private int[] field1938;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "[I")
    private int[] field1939;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "[I")
    private int[] field1941;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "()V", line = 11)
    public final void method799() {
        GL var1 = class231.field4052;
        if (class231.field4060) {
            this.field1936.method2215();
            var1.glInterleavedArrays(10787, 16, 0L);
            class231.field4062 = false;
            this.field1934.method2214();
            var1.glDrawElements(4, this.field1946, 5125, 0L);
            return;
        }
        if (class231.field4060) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field1944);
        class231.field4062 = false;
        var1.glDrawElements(4, this.field1946, 5125, this.field1943);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lfk;IIIFFF)I", line = 37)
    public final int method800(class46 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class236 var10 = (class236) this.field1942.method1676(var8, (byte) -76);
            if (var10 != null) {
                return var10.field4144;
            }
        }
        int var11 = arg0.field662;
        float var12 = (float) (arg0.field678 - arg1);
        float var13 = (float) (arg0.field683 - arg2);
        float var14 = (float) (arg0.field674 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field670 << 7) + 64);
        float var21 = 1.0F - var20 * var20;
        if (var21 < 0.0F) {
            var21 = 0.0F;
        }
        float var22 = arg6 * var19 + arg4 * var17 + arg5 * var18;
        if (var22 < 0.0F) {
            var22 = 0.0F;
        }
        float var23 = var21 * var22 * 2.0F;
        if (var23 > 1.0F) {
            var23 = 1.0F;
        }
        int var24 = (int) ((float) (var11 >> 16 & 0xFF) * var23);
        if (var24 > 255) {
            var24 = 255;
        }
        int var25 = (int) ((float) (var11 >> 8 & 0xFF) * var23);
        if (var25 > 255) {
            var25 = 255;
        }
        int var26 = (int) ((float) (var11 & 0xFF) * var23);
        if (var26 > 255) {
            var26 = 255;
        }
        this.field1940[this.field1947] = (byte) var24;
        this.field1932[this.field1947] = (byte) var25;
        this.field1945[this.field1947] = (byte) var26;
        this.field1941[this.field1947] = arg1;
        this.field1939[this.field1947] = arg2;
        this.field1937[this.field1947] = arg3;
        this.field1942.method1681(1, new class236(this.field1947), var8);
        return this.field1947++;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "()V", line = 110)
    public final void method801() {
        class249 var1 = new class249(this.field1946 * 4);
        class249 var2 = new class249(this.field1947 * 16);
        if (class231.field4068) {
            for (int var3 = 0; var3 < this.field1947; var3++) {
                var2.method1759(-32768, this.field1940[var3]);
                var2.method1759(-32768, this.field1932[var3]);
                var2.method1759(-32768, this.field1945[var3]);
                var2.method1759(-32768, 255);
                var2.method1743((byte) 65, (float) this.field1941[var3]);
                var2.method1743((byte) 65, (float) this.field1939[var3]);
                var2.method1743((byte) 65, (float) this.field1937[var3]);
            }
            for (int var4 = 0; var4 < this.field1946; var4++) {
                var1.method1741(this.field1938[var4], -1580277072);
            }
        } else {
            for (int var5 = 0; var5 < this.field1947; var5++) {
                var2.method1759(-32768, this.field1940[var5]);
                var2.method1759(-32768, this.field1932[var5]);
                var2.method1759(-32768, this.field1945[var5]);
                var2.method1759(-32768, 255);
                var2.method1722(99, (float) this.field1941[var5]);
                var2.method1722(114, (float) this.field1939[var5]);
                var2.method1722(-88, (float) this.field1937[var5]);
            }
            for (int var6 = 0; var6 < this.field1946; var6++) {
                var1.method1745(this.field1938[var6], -427081032);
            }
        }
        if (class231.field4060) {
            this.field1936 = new class319();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field4338);
            this.field1936.method2211(var7);
            this.field1934 = new class319();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field4338);
            this.field1934.method2213(var8);
        } else {
            this.field1944 = ByteBuffer.allocateDirect(var2.field4314);
            this.field1944.put(var2.field4338);
            this.field1944.flip();
            this.field1943 = ByteBuffer.allocateDirect(var1.field4314);
            this.field1943.put(var1.field4338);
            this.field1943.flip();
        }
        this.field1941 = null;
        this.field1939 = null;
        this.field1937 = null;
        this.field1940 = null;
        this.field1932 = null;
        this.field1945 = null;
        this.field1938 = null;
        this.field1942 = null;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "()V", line = 195)
    public final void method802() {
        this.field1938 = new int[this.field1933];
        this.field1941 = new int[this.field1935];
        this.field1939 = new int[this.field1935];
        this.field1937 = new int[this.field1935];
        this.field1940 = new byte[this.field1935];
        this.field1932 = new byte[this.field1935];
        this.field1945 = new byte[this.field1935];
        this.field1942 = new class242(class117.method832(this.field1935, (byte) 68));
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "([I)V", line = 209)
    public final void method803(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field1938[this.field1946++] = arg0[0];
            this.field1938[this.field1946++] = arg0[var2];
            this.field1938[this.field1946++] = arg0[var2 + 1];
        }
    }
}
