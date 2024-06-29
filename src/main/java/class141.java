import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class141 {

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "Z")
    public boolean field2443 = true;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    private int field2442 = -1;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    private int field2448;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "[B")
    private static byte[] field2447 = new byte[16384];

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "Lsl;")
    private class92 field2441;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "Lsl;")
    private class92 field2444;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2445;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2446;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "()V", line = 8)
    public final void method1093() {
        GL var1 = class47.field739;
        class47.method317(this.field2448);
        if (this.field2444 == null) {
            if (class47.field768) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field2446);
            class47.field752 = false;
        } else {
            this.field2444.method722();
            var1.glInterleavedArrays(10791, 20, 0L);
            class47.field752 = false;
        }
        if (this.field2441 == null) {
            if (class47.field768) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field2445);
        } else {
            this.field2441.method719();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V", line = 242)
    public class141() {
        GL var1 = class47.field739;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field2448 = var2[0];
        class119.field2008 += 16384;
        class47.method317(this.field2448);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lje;II)Z", line = 48)
    public final boolean method1094(class68 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field1179;
        int var5 = arg0.field4007;
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
        if (this.field2442 == var7) {
            return false;
        }
        this.field2442 = var7;
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
                    field2447[var11++] = (byte) (var14 * 17);
                } else {
                    field2447[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class47.field739;
        ByteBuffer var16 = ByteBuffer.wrap(field2447);
        var16.limit(16384);
        class47.method317(this.field2448);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([[III)V", line = 134)
    public final void method1095(int[][] arg0, int arg1, int arg2) {
        class60 var4 = new class60(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class47.field749) {
                    var4.method521((float) var6 / 8.0F, (byte) 98);
                    var4.method521((float) var5 / 8.0F, (byte) 98);
                    var4.method521((float) (var6 * 128), (byte) 98);
                    var4.method521((float) arg0[arg1 + var6][arg2 + var5], (byte) 98);
                    var4.method521((float) (var5 * 128), (byte) 98);
                } else {
                    var4.method475(-19674, (float) var6 / 8.0F);
                    var4.method475(-19674, (float) var5 / 8.0F);
                    var4.method475(-19674, (float) (var6 * 128));
                    var4.method475(-19674, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method475(-19674, (float) (var5 * 128));
                }
            }
        }
        if (class47.field768) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field997, 0, var4.field1012);
            this.field2444 = new class92();
            this.field2444.method720(var7);
        } else {
            this.field2446 = ByteBuffer.allocateDirect(var4.field1012).order(ByteOrder.nativeOrder());
            this.field2446.put(var4.field997, 0, var4.field1012);
            this.field2446.flip();
        }
        class60 var8 = new class60(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class47.field749) {
                    var8.method510((var9 + 1) * 9 + var10, -36);
                    var8.method510(var9 * 9 + var10, 123);
                    var8.method510(var9 * 9 + var10 + 1, 73);
                    var8.method510((var9 + 1) * 9 + var10, -71);
                    var8.method510(var9 * 9 + var10 + 1, -86);
                    var8.method510((var9 + 1) * 9 + var10 + 1, 90);
                } else {
                    var8.method528((byte) 126, (var9 + 1) * 9 + var10);
                    var8.method528((byte) 125, var9 * 9 + var10);
                    var8.method528((byte) 120, var9 * 9 + var10 + 1);
                    var8.method528((byte) 114, (var9 + 1) * 9 + var10);
                    var8.method528((byte) 127, var9 * 9 + var10 + 1);
                    var8.method528((byte) 110, (var9 + 1) * 9 + var10 + 1);
                }
            }
        }
        if (class47.field768) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field997, 0, var8.field1012);
            this.field2441 = new class92();
            this.field2441.method718(var11);
        } else {
            this.field2445 = ByteBuffer.allocateDirect(var8.field1012).order(ByteOrder.nativeOrder());
            this.field2445.put(var8.field997, 0, var8.field1012);
            this.field2445.flip();
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "()V", line = 257)
    public static void method1096() {
        field2447 = null;
    }
}
