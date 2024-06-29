import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class155 {

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public int field2394;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public int field2397;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public int field2407;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public int field2409;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Lpf;")
    private class264 field2399;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "Lpf;")
    private class264 field2403;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "Lqf;")
    private class311 field2404;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2405;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2406;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "[B")
    private byte[] field2396;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "[B")
    private byte[] field2398;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "[B")
    private byte[] field2408;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "[I")
    private int[] field2395;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "[I")
    private int[] field2400;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "[I")
    private int[] field2401;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "[I")
    private int[] field2402;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "()V", line = 5)
    public final void method1122() {
        this.field2401 = new int[this.field2409];
        this.field2400 = new int[this.field2407];
        this.field2402 = new int[this.field2407];
        this.field2395 = new int[this.field2407];
        this.field2396 = new byte[this.field2407];
        this.field2408 = new byte[this.field2407];
        this.field2398 = new byte[this.field2407];
        this.field2404 = new class311(class215.method1568(479166497, this.field2407));
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lvb;IIIFFF)I", line = 18)
    public final int method1123(class79 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class233 var10 = (class233) this.field2404.method2168(var8, (byte) -120);
            if (var10 != null) {
                return var10.field3633;
            }
        }
        int var11 = arg0.field1062;
        float var12 = (float) (arg0.field1068 - arg1);
        float var13 = (float) (arg0.field1060 - arg2);
        float var14 = (float) (arg0.field1072 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field1056 << 7) + 64);
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
        this.field2396[this.field2394] = (byte) var24;
        this.field2408[this.field2394] = (byte) var25;
        this.field2398[this.field2394] = (byte) var26;
        this.field2400[this.field2394] = arg1;
        this.field2402[this.field2394] = arg2;
        this.field2395[this.field2394] = arg3;
        this.field2404.method2161(new class233(this.field2394), var8, -1);
        return this.field2394++;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "()V", line = 93)
    public final void method1124() {
        GL var1 = class109.field1456;
        if (class109.field1496) {
            this.field2403.method1888();
            var1.glInterleavedArrays(10787, 16, 0L);
            class109.field1485 = false;
            this.field2399.method1889();
            var1.glDrawElements(4, this.field2397, 5125, 0L);
            return;
        }
        if (class109.field1496) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field2406);
        class109.field1485 = false;
        var1.glDrawElements(4, this.field2397, 5125, this.field2405);
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "()V", line = 118)
    public final void method1125() {
        class6 var1 = new class6(this.field2397 * 4);
        class6 var2 = new class6(this.field2394 * 16);
        if (class109.field1464) {
            for (int var3 = 0; var3 < this.field2394; var3++) {
                var2.method81((byte) -99, this.field2396[var3]);
                var2.method81((byte) -102, this.field2408[var3]);
                var2.method81((byte) -121, this.field2398[var3]);
                var2.method81((byte) -113, 255);
                var2.method36((float) this.field2400[var3], (byte) 122);
                var2.method36((float) this.field2402[var3], (byte) 120);
                var2.method36((float) this.field2395[var3], (byte) 119);
            }
            for (int var4 = 0; var4 < this.field2397; var4++) {
                var1.method34(this.field2401[var4], 294335144);
            }
        } else {
            for (int var5 = 0; var5 < this.field2394; var5++) {
                var2.method81((byte) -119, this.field2396[var5]);
                var2.method81((byte) -106, this.field2408[var5]);
                var2.method81((byte) -123, this.field2398[var5]);
                var2.method81((byte) -119, 255);
                var2.method91((float) this.field2400[var5], -211870840);
                var2.method91((float) this.field2402[var5], -211870840);
                var2.method91((float) this.field2395[var5], -211870840);
            }
            for (int var6 = 0; var6 < this.field2397; var6++) {
                var1.method44(854292648, this.field2401[var6]);
            }
        }
        if (class109.field1496) {
            this.field2403 = new class264();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field115);
            this.field2403.method1892(var7);
            this.field2399 = new class264();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field115);
            this.field2399.method1891(var8);
        } else {
            this.field2406 = ByteBuffer.allocateDirect(var2.field111);
            this.field2406.put(var2.field115);
            this.field2406.flip();
            this.field2405 = ByteBuffer.allocateDirect(var1.field111);
            this.field2405.put(var1.field115);
            this.field2405.flip();
        }
        this.field2400 = null;
        this.field2402 = null;
        this.field2395 = null;
        this.field2396 = null;
        this.field2408 = null;
        this.field2398 = null;
        this.field2401 = null;
        this.field2404 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([I)V", line = 205)
    public final void method1126(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field2401[this.field2397++] = arg0[0];
            this.field2401[this.field2397++] = arg0[var2];
            this.field2401[this.field2397++] = arg0[var2 + 1];
        }
    }
}
