import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class286 extends class171 {

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    private int field4859 = 0;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
    public int field4861 = 0;

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "I")
    private int field4867 = 0;

    @OriginalMember(owner = "client!hi", name = "G", descriptor = "I")
    public int field4875 = 0;

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "I")
    public int field4869 = 0;

    @OriginalMember(owner = "client!hi", name = "U", descriptor = "I")
    private int field4889 = 0;

    @OriginalMember(owner = "client!hi", name = "C", descriptor = "I")
    public int field4871;

    @OriginalMember(owner = "client!hi", name = "P", descriptor = "F")
    private float field4884;

    @OriginalMember(owner = "client!hi", name = "F", descriptor = "Z")
    public boolean field4874;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "Z")
    private boolean field4863;

    @OriginalMember(owner = "client!hi", name = "N", descriptor = "I")
    public int field4882;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "Lld;")
    private class118 field4864;

    @OriginalMember(owner = "client!hi", name = "V", descriptor = "Lsg;")
    private class34 field4890;

    @OriginalMember(owner = "client!hi", name = "H", descriptor = "Lwe;")
    private static class47 field4876;

    @OriginalMember(owner = "client!hi", name = "I", descriptor = "Lwe;")
    private static class47 field4877;

    @OriginalMember(owner = "client!hi", name = "E", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field4873;

    @OriginalMember(owner = "client!hi", name = "O", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4883;

    @OriginalMember(owner = "client!hi", name = "R", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field4886;

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "[F")
    private float[] field4868;

    @OriginalMember(owner = "client!hi", name = "B", descriptor = "[F")
    private float[] field4870;

    @OriginalMember(owner = "client!hi", name = "J", descriptor = "[F")
    private float[] field4878;

    @OriginalMember(owner = "client!hi", name = "S", descriptor = "[F")
    private float[] field4887;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "[I")
    private int[] field4860;

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "[I")
    private int[] field4866;

    @OriginalMember(owner = "client!hi", name = "D", descriptor = "[I")
    private int[] field4872;

    @OriginalMember(owner = "client!hi", name = "L", descriptor = "[I")
    private int[] field4880;

    @OriginalMember(owner = "client!hi", name = "M", descriptor = "[I")
    private int[] field4881;

    @OriginalMember(owner = "client!hi", name = "Q", descriptor = "[I")
    private int[] field4885;

    @OriginalMember(owner = "client!hi", name = "T", descriptor = "[I")
    private int[] field4888;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "[Z")
    private boolean[] field4865;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "[[I")
    private int[][] field4862;

    @OriginalMember(owner = "client!hi", name = "K", descriptor = "[[I")
    private int[][] field4879;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III[I[IZ)I", line = 7)
    public final int method2054(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field4874) {
            this.field4879[this.field4867] = arg4;
            this.field4865[this.field4867] = arg5;
            if (arg4 != null) {
                this.field4889 += arg4.length;
            }
            if (arg5) {
                this.field4889 += (arg3.length - 2) * 3;
            } else {
                this.field4859 += (arg3.length - 2) * 3;
            }
        } else {
            this.field4859 += (arg3.length - 2) * 3;
        }
        this.field4866[this.field4867] = arg0;
        this.field4880[this.field4867] = arg1;
        this.field4872[this.field4867] = arg2;
        this.field4862[this.field4867] = arg3;
        return this.field4867++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "()V", line = 36)
    public final void method2055() {
        this.field4885 = new int[this.field4861];
        this.field4860 = new int[this.field4861];
        this.field4881 = new int[this.field4861];
        if (this.field4863) {
            this.field4870 = new float[this.field4861];
        }
        this.field4888 = new int[this.field4861];
        this.field4887 = new float[this.field4861];
        this.field4878 = new float[this.field4861];
        this.field4868 = new float[this.field4861];
        this.field4880 = new int[this.field4875];
        this.field4872 = new int[this.field4875];
        this.field4866 = new int[this.field4875];
        this.field4862 = new int[this.field4875][];
        this.field4864 = new class118(class272.method1993(this.field4861, 114));
        if (this.field4874) {
            this.field4879 = new int[this.field4875][];
            this.field4865 = new boolean[this.field4875];
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class286(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field4871 = arg0;
        this.field4884 = arg1;
        this.field4874 = arg2;
        this.field4863 = arg3;
        this.field4882 = arg4;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([[[Lse;FZ)V", line = 73)
    public final void method2056(class11[][][] arg0, float arg1, boolean arg2) {
        if (field4877 == null || field4877.field860.length < this.field4859 * 4) {
            field4877 = new class47(this.field4859 * 4);
        } else {
            field4877.field857 = 0;
        }
        if (field4876 == null || field4876.field860.length < this.field4889 * 4) {
            field4876 = new class47(this.field4889 * 4);
        } else {
            field4876.field857 = 0;
        }
        if (class271.field4657) {
            for (int var4 = 0; var4 < this.field4867; var4++) {
                class11 var5 = arg0[this.field4866[var4]][this.field4880[var4]][this.field4872[var4]];
                if (var5 != null && var5.field207) {
                    int[] var6 = this.field4862[var4];
                    class47 var9;
                    if (this.field4874) {
                        int[] var7 = this.field4879[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field4876.method387(var7[var8], 127);
                            }
                        }
                        var9 = this.field4865[var4] ? field4876 : field4877;
                    } else {
                        var9 = field4877;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method387(var6[0], 92);
                        var9.method387(var6[var10], 96);
                        var9.method387(var6[var10 + 1], 80);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field4867; var11++) {
                class11 var12 = arg0[this.field4866[var11]][this.field4880[var11]][this.field4872[var11]];
                if (var12 != null && var12.field207) {
                    int[] var13 = this.field4862[var11];
                    class47 var16;
                    if (this.field4874) {
                        int[] var14 = this.field4879[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field4876.method382((byte) 1, var14[var15]);
                            }
                        }
                        var16 = this.field4865[var11] ? field4876 : field4877;
                    } else {
                        var16 = field4877;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method382((byte) 1, var13[0]);
                        var16.method382((byte) 1, var13[var17]);
                        var16.method382((byte) 1, var13[var17 + 1]);
                    }
                }
            }
        }
        if (field4877.field857 == 0 && field4876.field857 == 0) {
            return;
        }
        GL var18 = class271.field4641;
        if (this.field4871 == -1 || arg2) {
            class271.method1978(-1);
            class140.method1033(0, 0, -5);
        } else {
            class109.field1747.method830(this.field4871, (byte) -40);
        }
        int var19 = this.field4863 ? 40 : 36;
        if (this.field4890 == null) {
            if (class271.field4634) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field4883.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field4883);
            this.field4883.position(12);
            var18.glColorPointer(4, 5121, var19, this.field4883);
            if (class102.field1641) {
                this.field4883.position(16);
                var18.glNormalPointer(5126, var19, this.field4883);
            }
            this.field4883.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field4883);
            if (this.field4863) {
                var18.glClientActiveTexture(class69.method516());
                this.field4883.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field4883);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field4890.method246();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class102.field1641) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field4863) {
                var18.glClientActiveTexture(class69.method516());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class271.field4634) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field4877.field857 != 0) {
            if (field4873 == null || field4873.capacity() < field4877.field857) {
                field4873 = ByteBuffer.allocateDirect(field4877.field857).order(ByteOrder.nativeOrder());
            } else {
                field4873.clear();
            }
            field4873.put(field4877.field860, 0, field4877.field857);
            field4873.flip();
            class271.method1979(arg1);
            var18.glDrawElements(4, field4877.field857 / 4, 5125, field4873);
        }
        if (field4876.field857 == 0) {
            return;
        }
        if (field4886 == null || field4886.capacity() < field4876.field857) {
            field4886 = ByteBuffer.allocateDirect(field4876.field857).order(ByteOrder.nativeOrder());
        } else {
            field4886.clear();
        }
        field4886.put(field4876.field860, 0, field4876.field857);
        field4886.flip();
        class271.method1979(arg1 - 100.0F);
        class271.method1960();
        var18.glDrawElements(4, field4876.field857 / 4, 5125, field4886);
        class271.method1963();
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIFFFIF)I", line = 283)
    public final int method2057(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class101 var11 = (class101) this.field4864.method810((byte) -92, var9);
            if (var11 != null) {
                if (arg1 < this.field4860[var11.field1627]) {
                    this.field4860[var11.field1627] = arg1;
                }
                return var11.field1627;
            }
        }
        this.field4885[this.field4869] = arg0;
        this.field4860[this.field4869] = arg1;
        this.field4881[this.field4869] = arg2;
        if (this.field4863) {
            this.field4870[this.field4869] = arg7;
        }
        this.field4887[this.field4869] = arg3;
        this.field4878[this.field4869] = arg4;
        this.field4868[this.field4869] = arg5;
        this.field4888[this.field4869] = arg6;
        if (var9 != 0L) {
            this.field4864.method805(new class101(this.field4869), var9, 119);
        }
        return this.field4869++;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "()V", line = 320)
    public static void method2058() {
        field4877 = null;
        field4876 = null;
        field4873 = null;
        field4886 = null;
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "()V", line = 333)
    public final void method2059() {
        class47 var1 = new class47((this.field4863 ? 40 : 36) * this.field4869);
        for (int var2 = 0; var2 < this.field4869; var2++) {
            if (class271.field4657) {
                var1.method384((byte) 108, (float) this.field4885[var2]);
                var1.method384((byte) 108, (float) this.field4860[var2]);
                var1.method384((byte) 108, (float) this.field4881[var2]);
                var1.method387(this.field4888[var2], 123);
                var1.method384((byte) 108, this.field4887[var2]);
                var1.method384((byte) 108, this.field4878[var2]);
                var1.method384((byte) 108, this.field4868[var2]);
                var1.method384((byte) 108, (float) this.field4885[var2] / this.field4884);
                var1.method384((byte) 108, (float) this.field4881[var2] / this.field4884);
                if (this.field4863) {
                    var1.method384((byte) 108, this.field4870[var2]);
                }
            } else {
                var1.method340((float) this.field4885[var2], -1489617032);
                var1.method340((float) this.field4860[var2], -1489617032);
                var1.method340((float) this.field4881[var2], -1489617032);
                var1.method387(this.field4888[var2], 106);
                var1.method340(this.field4887[var2], -1489617032);
                var1.method340(this.field4878[var2], -1489617032);
                var1.method340(this.field4868[var2], -1489617032);
                var1.method340((float) this.field4885[var2] / this.field4884, -1489617032);
                var1.method340((float) this.field4881[var2] / this.field4884, -1489617032);
                if (this.field4863) {
                    var1.method340(this.field4870[var2], -1489617032);
                }
            }
        }
        if (class271.field4634) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field860, 0, var1.field857);
            this.field4890 = new class34();
            this.field4890.method244(var3);
        } else {
            this.field4883 = ByteBuffer.allocateDirect(var1.field857).order(ByteOrder.nativeOrder());
            this.field4883.put(var1.field860, 0, var1.field857);
            this.field4883.flip();
        }
        this.field4885 = null;
        this.field4860 = null;
        this.field4881 = null;
        this.field4888 = null;
        this.field4887 = null;
        this.field4878 = null;
        this.field4868 = null;
        this.field4864 = null;
        this.field4870 = null;
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "()V", line = 409)
    public static final void method2060() {
        field4877 = null;
        field4876 = null;
        field4873 = null;
        field4886 = null;
    }
}
