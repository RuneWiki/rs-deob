import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class285 {

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    private int field4407 = -1;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "Z")
    public boolean field4410 = true;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    private int field4411;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "[B")
    private static byte[] field4408 = new byte[16384];

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "Lpf;")
    private class264 field4413;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Lpf;")
    private class264 field4414;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4409;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4412;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "()V", line = 10)
    public final void method2015() {
        GL var1 = class109.field1456;
        class109.method752(this.field4411);
        if (this.field4414 == null) {
            if (class109.field1496) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field4412);
            class109.field1485 = false;
        } else {
            this.field4414.method1888();
            var1.glInterleavedArrays(10791, 20, 0L);
            class109.field1485 = false;
        }
        if (this.field4413 == null) {
            if (class109.field1496) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field4409);
        } else {
            this.field4413.method1889();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lci;II)Z", line = 46)
    public final boolean method2016(class201 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field3212;
        int var5 = arg0.field297;
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
        if (this.field4407 == var7) {
            return false;
        }
        this.field4407 = var7;
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
                    field4408[var11++] = (byte) (var14 * 17);
                } else {
                    field4408[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class109.field1456;
        ByteBuffer var16 = ByteBuffer.wrap(field4408);
        var16.limit(16384);
        class109.method752(this.field4411);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "()V", line = 130)
    public static void method2017() {
        field4408 = null;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V", line = 245)
    public class285() {
        GL var1 = class109.field1456;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field4411 = var2[0];
        class103.field1374 += 16384;
        class109.method752(this.field4411);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([[III)V", line = 142)
    public final void method2018(int[][] arg0, int arg1, int arg2) {
        class6 var4 = new class6(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class109.field1464) {
                    var4.method36((float) var6 / 8.0F, (byte) 121);
                    var4.method36((float) var5 / 8.0F, (byte) 119);
                    var4.method36((float) (var6 * 128), (byte) 124);
                    var4.method36((float) arg0[arg1 + var6][arg2 + var5], (byte) 125);
                    var4.method36((float) (var5 * 128), (byte) 119);
                } else {
                    var4.method91((float) var6 / 8.0F, -211870840);
                    var4.method91((float) var5 / 8.0F, -211870840);
                    var4.method91((float) (var6 * 128), -211870840);
                    var4.method91((float) arg0[arg1 + var6][arg2 + var5], -211870840);
                    var4.method91((float) (var5 * 128), -211870840);
                }
            }
        }
        if (class109.field1496) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field115, 0, var4.field111);
            this.field4414 = new class264();
            this.field4414.method1892(var7);
        } else {
            this.field4412 = ByteBuffer.allocateDirect(var4.field111).order(ByteOrder.nativeOrder());
            this.field4412.put(var4.field115, 0, var4.field111);
            this.field4412.flip();
        }
        class6 var8 = new class6(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class109.field1464) {
                    var8.method34((var9 + 1) * 9 + var10, 294335144);
                    var8.method34(var9 * 9 + var10, 294335144);
                    var8.method34(var9 * 9 + var10 + 1, 294335144);
                    var8.method34((var9 + 1) * 9 + var10, 294335144);
                    var8.method34(var9 * 9 + var10 + 1, 294335144);
                    var8.method34((var9 + 1) * 9 + var10 + 1, 294335144);
                } else {
                    var8.method44(854292648, (var9 + 1) * 9 + var10);
                    var8.method44(854292648, var9 * 9 + var10);
                    var8.method44(854292648, var9 * 9 + var10 + 1);
                    var8.method44(854292648, (var9 + 1) * 9 + var10);
                    var8.method44(854292648, var9 * 9 + var10 + 1);
                    var8.method44(854292648, (var9 + 1) * 9 + var10 + 1);
                }
            }
        }
        if (class109.field1496) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field115, 0, var8.field111);
            this.field4413 = new class264();
            this.field4413.method1891(var11);
        } else {
            this.field4409 = ByteBuffer.allocateDirect(var8.field111).order(ByteOrder.nativeOrder());
            this.field4409.put(var8.field115, 0, var8.field111);
            this.field4409.flip();
        }
    }
}
