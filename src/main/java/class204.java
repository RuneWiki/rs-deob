import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class204 {

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Z")
    public boolean field3678 = true;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    private int field3684 = -1;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    private int field3680;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "[B")
    private static byte[] field3683 = new byte[16384];

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Lnd;")
    private class319 field3677;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Lnd;")
    private class319 field3681;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3679;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3682;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "()V", line = 9)
    public static void method1437() {
        field3683 = null;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "()V", line = 13)
    public final void method1438() {
        GL var1 = class231.field4052;
        class231.method1597(this.field3680);
        if (this.field3681 == null) {
            if (class231.field4060) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field3679);
            class231.field4062 = false;
        } else {
            this.field3681.method2215();
            var1.glInterleavedArrays(10791, 20, 0L);
            class231.field4062 = false;
        }
        if (this.field3677 == null) {
            if (class231.field4060) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field3682);
        } else {
            this.field3677.method2214();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V", line = 245)
    public class204() {
        GL var1 = class231.field4052;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field3680 = var2[0];
        class124.field2103 += 16384;
        class231.method1597(this.field3680);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([[III)V", line = 49)
    public final void method1439(int[][] arg0, int arg1, int arg2) {
        class249 var4 = new class249(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class231.field4068) {
                    var4.method1743((byte) 65, (float) var6 / 8.0F);
                    var4.method1743((byte) 65, (float) var5 / 8.0F);
                    var4.method1743((byte) 65, (float) (var6 * 128));
                    var4.method1743((byte) 65, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method1743((byte) 65, (float) (var5 * 128));
                } else {
                    var4.method1722(-53, (float) var6 / 8.0F);
                    var4.method1722(84, (float) var5 / 8.0F);
                    var4.method1722(126, (float) (var6 * 128));
                    var4.method1722(-58, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method1722(90, (float) (var5 * 128));
                }
            }
        }
        if (class231.field4060) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field4338, 0, var4.field4314);
            this.field3681 = new class319();
            this.field3681.method2211(var7);
        } else {
            this.field3679 = ByteBuffer.allocateDirect(var4.field4314).order(ByteOrder.nativeOrder());
            this.field3679.put(var4.field4338, 0, var4.field4314);
            this.field3679.flip();
        }
        class249 var8 = new class249(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class231.field4068) {
                    var8.method1741((var9 + 1) * 9 + var10, -1580277072);
                    var8.method1741(var9 * 9 + var10, -1580277072);
                    var8.method1741(var9 * 9 + var10 + 1, -1580277072);
                    var8.method1741((var9 + 1) * 9 + var10, -1580277072);
                    var8.method1741(var9 * 9 + var10 + 1, -1580277072);
                    var8.method1741((var9 + 1) * 9 + var10 + 1, -1580277072);
                } else {
                    var8.method1745((var9 + 1) * 9 + var10, -427081032);
                    var8.method1745(var9 * 9 + var10, -427081032);
                    var8.method1745(var9 * 9 + var10 + 1, -427081032);
                    var8.method1745((var9 + 1) * 9 + var10, -427081032);
                    var8.method1745(var9 * 9 + var10 + 1, -427081032);
                    var8.method1745((var9 + 1) * 9 + var10 + 1, -427081032);
                }
            }
        }
        if (class231.field4060) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field4338, 0, var8.field4314);
            this.field3677 = new class319();
            this.field3677.method2213(var11);
        } else {
            this.field3682 = ByteBuffer.allocateDirect(var8.field4314).order(ByteOrder.nativeOrder());
            this.field3682.put(var8.field4338, 0, var8.field4314);
            this.field3682.flip();
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lt;II)Z", line = 154)
    public final boolean method1440(class257 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field4551;
        int var5 = arg0.field889;
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
        if (this.field3684 == var7) {
            return false;
        }
        this.field3684 = var7;
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
                    field3683[var11++] = (byte) (var14 * 17);
                } else {
                    field3683[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class231.field4052;
        ByteBuffer var16 = ByteBuffer.wrap(field3683);
        var16.limit(16384);
        class231.method1597(this.field3680);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }
}
