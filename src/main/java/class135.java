import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class135 {

    @OriginalMember(owner = "client!b", name = "d", descriptor = "Z")
    public boolean field2353 = true;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    private int field2351 = -1;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    private int field2352;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "[B")
    private static byte[] field2355 = new byte[16384];

    @OriginalMember(owner = "client!b", name = "e", descriptor = "Lgb;")
    private class83 field2354;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "Lgb;")
    private class83 field2357;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2350;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2356;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([[III)V", line = 7)
    public final void method983(int[][] arg0, int arg1, int arg2) {
        class134 var4 = new class134(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class56.field845) {
                    var4.method956((float) var6 / 8.0F, false);
                    var4.method956((float) var5 / 8.0F, false);
                    var4.method956((float) (var6 * 128), false);
                    var4.method956((float) arg0[arg1 + var6][arg2 + var5], false);
                    var4.method956((float) (var5 * 128), false);
                } else {
                    var4.method940((float) var6 / 8.0F, 967648728);
                    var4.method940((float) var5 / 8.0F, 967648728);
                    var4.method940((float) (var6 * 128), 967648728);
                    var4.method940((float) arg0[arg1 + var6][arg2 + var5], 967648728);
                    var4.method940((float) (var5 * 128), 967648728);
                }
            }
        }
        if (class56.field855) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field2282, 0, var4.field2299);
            this.field2354 = new class83();
            this.field2354.method585(var7);
        } else {
            this.field2350 = ByteBuffer.allocateDirect(var4.field2299).order(ByteOrder.nativeOrder());
            this.field2350.put(var4.field2282, 0, var4.field2299);
            this.field2350.flip();
        }
        class134 var8 = new class134(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class56.field845) {
                    var8.method947((var9 + 1) * 9 + var10, (byte) 125);
                    var8.method947(var9 * 9 + var10, (byte) 106);
                    var8.method947(var9 * 9 + var10 + 1, (byte) 99);
                    var8.method947((var9 + 1) * 9 + var10, (byte) 113);
                    var8.method947(var9 * 9 + var10 + 1, (byte) 119);
                    var8.method947((var9 + 1) * 9 + var10 + 1, (byte) 104);
                } else {
                    var8.method941(-109, (var9 + 1) * 9 + var10);
                    var8.method941(-95, var9 * 9 + var10);
                    var8.method941(-105, var9 * 9 + var10 + 1);
                    var8.method941(-122, (var9 + 1) * 9 + var10);
                    var8.method941(-126, var9 * 9 + var10 + 1);
                    var8.method941(-120, (var9 + 1) * 9 + var10 + 1);
                }
            }
        }
        if (class56.field855) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field2282, 0, var8.field2299);
            this.field2357 = new class83();
            this.field2357.method586(var11);
        } else {
            this.field2356 = ByteBuffer.allocateDirect(var8.field2299).order(ByteOrder.nativeOrder());
            this.field2356.put(var8.field2282, 0, var8.field2299);
            this.field2356.flip();
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lie;II)Z", line = 109)
    public final boolean method984(class2 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field14;
        int var5 = arg0.field376;
        int var6 = (arg2 * 128 + 1) * var5 + arg1 * 128 + 1;
        int var7 = 0;
        for (int var8 = -128; var8 < 0; var8++) {
            var7 = (var7 << 8) - var7;
            for (int var9 = -128; var9 < 0; var9++) {
                if (var4[var6++] != 0) {
                    var7++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field2351 == var7) {
            return false;
        }
        this.field2351 = var7;
        int var10 = (arg2 * 128 + 1) * var5 + arg1 * 128 + 1;
        int var11 = 0;
        for (int var12 = -128; var12 < 0; var12++) {
            for (int var13 = -128; var13 < 0; var13++) {
                if (var4[var10] == 0) {
                    int var14 = 0;
                    if (var4[var10 - 1] != 0) {
                        var14++;
                    }
                    if (var4[var10 + 1] != 0) {
                        var14++;
                    }
                    if (var4[var10 - var5] != 0) {
                        var14++;
                    }
                    if (var4[var5 + var10] != 0) {
                        var14++;
                    }
                    field2355[var11++] = (byte) (var14 * 17);
                } else {
                    field2355[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class56.field848;
        ByteBuffer var16 = ByteBuffer.wrap(field2355);
        var16.limit(16384);
        class56.method354(this.field2352);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()V", line = 198)
    public final void method985() {
        GL var1 = class56.field848;
        class56.method354(this.field2352);
        if (this.field2354 == null) {
            if (class56.field855) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field2350);
            class56.field865 = false;
        } else {
            this.field2354.method588();
            var1.glInterleavedArrays(10791, 20, 0L);
            class56.field865 = false;
        }
        if (this.field2357 == null) {
            if (class56.field855) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field2356);
        } else {
            this.field2357.method587();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V", line = 245)
    public class135() {
        GL var1 = class56.field848;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field2352 = var2[0];
        class121.field2025 += 16384;
        class56.method354(this.field2352);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "()V", line = 239)
    public static void method986() {
        field2355 = null;
    }
}
