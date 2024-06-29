import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class72 {

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public int field1176;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public int field1177;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public int field1182;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public int field1183;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "Lmg;")
    private class113 field1181;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "Lmg;")
    private class113 field1186;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "Lgd;")
    private class170 field1178;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1179;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1190;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "[B")
    private byte[] field1180;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "[B")
    private byte[] field1184;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "[B")
    private byte[] field1191;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "[I")
    private int[] field1185;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "[I")
    private int[] field1187;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "[I")
    private int[] field1188;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "[I")
    private int[] field1189;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "()V", line = 10)
    public final void method540() {
        this.field1187 = new int[this.field1177];
        this.field1189 = new int[this.field1182];
        this.field1188 = new int[this.field1182];
        this.field1185 = new int[this.field1182];
        this.field1180 = new byte[this.field1182];
        this.field1191 = new byte[this.field1182];
        this.field1184 = new byte[this.field1182];
        this.field1178 = new class170(class10.method73((byte) -43, this.field1182));
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "()V", line = 25)
    public final void method541() {
        class166 var1 = new class166(this.field1183 * 4);
        class166 var2 = new class166(this.field1176 * 16);
        if (class94.field1512) {
            for (int var3 = 0; var3 < this.field1176; var3++) {
                var2.method1132((byte) 29, this.field1180[var3]);
                var2.method1132((byte) 29, this.field1191[var3]);
                var2.method1132((byte) 29, this.field1184[var3]);
                var2.method1132((byte) 29, 255);
                var2.method1160(1, (float) this.field1189[var3]);
                var2.method1160(1, (float) this.field1188[var3]);
                var2.method1160(1, (float) this.field1185[var3]);
            }
            for (int var4 = 0; var4 < this.field1183; var4++) {
                var1.method1174((byte) -32, this.field1187[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field1176; var5++) {
                var2.method1132((byte) 29, this.field1180[var5]);
                var2.method1132((byte) 29, this.field1191[var5]);
                var2.method1132((byte) 29, this.field1184[var5]);
                var2.method1132((byte) 29, 255);
                var2.method1144((byte) -111, (float) this.field1189[var5]);
                var2.method1144((byte) -109, (float) this.field1188[var5]);
                var2.method1144((byte) -120, (float) this.field1185[var5]);
            }
            for (int var6 = 0; var6 < this.field1183; var6++) {
                var1.method1169(this.field1187[var6], 30148);
            }
        }
        if (class94.field1507) {
            this.field1186 = new class113();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field2500);
            this.field1186.method841(var7);
            this.field1181 = new class113();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field2500);
            this.field1181.method839(var8);
        } else {
            this.field1190 = ByteBuffer.allocateDirect(var2.field2532);
            this.field1190.put(var2.field2500);
            this.field1190.flip();
            this.field1179 = ByteBuffer.allocateDirect(var1.field2532);
            this.field1179.put(var1.field2500);
            this.field1179.flip();
        }
        this.field1189 = null;
        this.field1188 = null;
        this.field1185 = null;
        this.field1180 = null;
        this.field1191 = null;
        this.field1184 = null;
        this.field1187 = null;
        this.field1178 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lri;IIIFFF)I", line = 110)
    public final int method542(class204 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class295 var10 = (class295) this.field1178.method1222(0, var8);
            if (var10 != null) {
                return var10.field4562;
            }
        }
        int var11 = arg0.field3067;
        float var12 = (float) (arg0.field3061 - arg1);
        float var13 = (float) (arg0.field3051 - arg2);
        float var14 = (float) (arg0.field3070 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field3068 << 7) + 64);
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
        this.field1180[this.field1176] = (byte) var24;
        this.field1191[this.field1176] = (byte) var25;
        this.field1184[this.field1176] = (byte) var26;
        this.field1189[this.field1176] = arg1;
        this.field1188[this.field1176] = arg2;
        this.field1185[this.field1176] = arg3;
        this.field1178.method1227(new class295(this.field1176), 0, var8);
        return this.field1176++;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "()V", line = 179)
    public final void method543() {
        GL var1 = class94.field1473;
        if (class94.field1507) {
            this.field1186.method837();
            var1.glInterleavedArrays(10787, 16, 0L);
            class94.field1520 = false;
            this.field1181.method840();
            var1.glDrawElements(4, this.field1183, 5125, 0L);
            return;
        }
        if (class94.field1507) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field1190);
        class94.field1520 = false;
        var1.glDrawElements(4, this.field1183, 5125, this.field1179);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([I)V", line = 206)
    public final void method544(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field1187[this.field1183++] = arg0[0];
            this.field1187[this.field1183++] = arg0[var2];
            this.field1187[this.field1183++] = arg0[var2 + 1];
        }
    }
}
