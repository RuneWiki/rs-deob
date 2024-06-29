import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class16 extends class35 {

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
    public int field287 = 0;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
    public int field284 = 0;

    @OriginalMember(owner = "client!ml", name = "J", descriptor = "I")
    private int field305 = 0;

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "I")
    public int field293 = 0;

    @OriginalMember(owner = "client!ml", name = "L", descriptor = "I")
    private int field307 = 0;

    @OriginalMember(owner = "client!ml", name = "S", descriptor = "I")
    private int field314 = 0;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
    public int field290;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "F")
    private float field291;

    @OriginalMember(owner = "client!ml", name = "R", descriptor = "Z")
    public boolean field313;

    @OriginalMember(owner = "client!ml", name = "M", descriptor = "Z")
    private boolean field308;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "I")
    public int field295;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "Lag;")
    private static class202 field289;

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "Lag;")
    private static class202 field297;

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "Lle;")
    private class231 field299;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "Lsl;")
    private class39 field286;

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field298;

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field301;

    @OriginalMember(owner = "client!ml", name = "P", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field311;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "[F")
    private float[] field285;

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "[F")
    private float[] field296;

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "[F")
    private float[] field302;

    @OriginalMember(owner = "client!ml", name = "K", descriptor = "[F")
    private float[] field306;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "[I")
    private int[] field288;

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "[I")
    private int[] field294;

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "[I")
    private int[] field300;

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "[I")
    private int[] field304;

    @OriginalMember(owner = "client!ml", name = "N", descriptor = "[I")
    private int[] field309;

    @OriginalMember(owner = "client!ml", name = "O", descriptor = "[I")
    private int[] field310;

    @OriginalMember(owner = "client!ml", name = "Q", descriptor = "[I")
    private int[] field312;

    @OriginalMember(owner = "client!ml", name = "T", descriptor = "[Z")
    private boolean[] field315;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "[[I")
    private int[][] field292;

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "[[I")
    private int[][] field303;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "()V", line = 9)
    public final void method114() {
        this.field300 = new int[this.field293];
        this.field304 = new int[this.field293];
        this.field310 = new int[this.field293];
        if (this.field308) {
            this.field306 = new float[this.field293];
        }
        this.field312 = new int[this.field293];
        this.field285 = new float[this.field293];
        this.field302 = new float[this.field293];
        this.field296 = new float[this.field293];
        this.field294 = new int[this.field284];
        this.field309 = new int[this.field284];
        this.field288 = new int[this.field284];
        this.field292 = new int[this.field284][];
        this.field286 = new class39(class226.method1510(27147, this.field293));
        if (this.field313) {
            this.field303 = new int[this.field284][];
            this.field315 = new boolean[this.field284];
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "([[[Lmj;FZ)V", line = 40)
    public final void method115(class47[][][] arg0, float arg1, boolean arg2) {
        if (field297 == null || field297.field3273.length < this.field314 * 4) {
            field297 = new class202(this.field314 * 4);
        } else {
            field297.field3249 = 0;
        }
        if (field289 == null || field289.field3273.length < this.field305 * 4) {
            field289 = new class202(this.field305 * 4);
        } else {
            field289.field3249 = 0;
        }
        if (class249.field3916) {
            for (int var4 = 0; var4 < this.field307; var4++) {
                class47 var5 = arg0[this.field288[var4]][this.field294[var4]][this.field309[var4]];
                if (var5 != null && var5.field963) {
                    int[] var6 = this.field292[var4];
                    class202 var9;
                    if (this.field313) {
                        int[] var7 = this.field303[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field289.method1359(16705, var7[var8]);
                            }
                        }
                        var9 = this.field315[var4] ? field289 : field297;
                    } else {
                        var9 = field297;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method1359(16705, var6[0]);
                        var9.method1359(16705, var6[var10]);
                        var9.method1359(16705, var6[var10 + 1]);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field307; var11++) {
                class47 var12 = arg0[this.field288[var11]][this.field294[var11]][this.field309[var11]];
                if (var12 != null && var12.field963) {
                    int[] var13 = this.field292[var11];
                    class202 var16;
                    if (this.field313) {
                        int[] var14 = this.field303[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field289.method1348(var14[var15], true);
                            }
                        }
                        var16 = this.field315[var11] ? field289 : field297;
                    } else {
                        var16 = field297;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method1348(var13[0], true);
                        var16.method1348(var13[var17], true);
                        var16.method1348(var13[var17 + 1], true);
                    }
                }
            }
        }
        if (field297.field3249 == 0 && field289.field3249 == 0) {
            return;
        }
        GL var18 = class249.field3898;
        if (this.field290 == -1 || arg2) {
            class249.method1689(-1);
            class128.method844(0, 0, (byte) -49);
        } else {
            class284.field4393.method404((byte) -54, this.field290);
        }
        int var19 = this.field308 ? 40 : 36;
        if (this.field299 == null) {
            if (class249.field3877) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field298.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field298);
            this.field298.position(12);
            var18.glColorPointer(4, 5121, var19, this.field298);
            if (class334.field5115) {
                this.field298.position(16);
                var18.glNormalPointer(5126, var19, this.field298);
            }
            this.field298.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field298);
            if (this.field308) {
                var18.glClientActiveTexture(class316.method2181());
                this.field298.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field298);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field299.method1529();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class334.field5115) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field308) {
                var18.glClientActiveTexture(class316.method2181());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class249.field3877) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field297.field3249 != 0) {
            if (field301 == null || field301.capacity() < field297.field3249) {
                field301 = ByteBuffer.allocateDirect(field297.field3249).order(ByteOrder.nativeOrder());
            } else {
                field301.clear();
            }
            field301.put(field297.field3273, 0, field297.field3249);
            field301.flip();
            class249.method1678(arg1);
            var18.glDrawElements(4, field297.field3249 / 4, 5125, field301);
        }
        if (field289.field3249 == 0) {
            return;
        }
        if (field311 == null || field311.capacity() < field289.field3249) {
            field311 = ByteBuffer.allocateDirect(field289.field3249).order(ByteOrder.nativeOrder());
        } else {
            field311.clear();
        }
        field311.put(field289.field3273, 0, field289.field3249);
        field311.flip();
        class249.method1678(arg1 - 100.0F);
        class249.method1650();
        var18.glDrawElements(4, field289.field3249 / 4, 5125, field311);
        class249.method1659();
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class16(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field290 = arg0;
        this.field291 = arg1;
        this.field313 = arg2;
        this.field308 = arg3;
        this.field295 = arg4;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(III[I[IZ)I", line = 257)
    public final int method116(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field313) {
            this.field303[this.field307] = arg4;
            this.field315[this.field307] = arg5;
            if (arg4 != null) {
                this.field305 += arg4.length;
            }
            if (arg5) {
                this.field305 += (arg3.length - 2) * 3;
            } else {
                this.field314 += (arg3.length - 2) * 3;
            }
        } else {
            this.field314 += (arg3.length - 2) * 3;
        }
        this.field288[this.field307] = arg0;
        this.field294[this.field307] = arg1;
        this.field309[this.field307] = arg2;
        this.field292[this.field307] = arg3;
        return this.field307++;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIFFFIF)I", line = 282)
    public final int method117(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class166 var11 = (class166) this.field286.method303(var9, (byte) 110);
            if (var11 != null) {
                if (arg1 < this.field304[var11.field2682]) {
                    this.field304[var11.field2682] = arg1;
                }
                return var11.field2682;
            }
        }
        this.field300[this.field287] = arg0;
        this.field304[this.field287] = arg1;
        this.field310[this.field287] = arg2;
        if (this.field308) {
            this.field306[this.field287] = arg7;
        }
        this.field285[this.field287] = arg3;
        this.field302[this.field287] = arg4;
        this.field296[this.field287] = arg5;
        this.field312[this.field287] = arg6;
        if (var9 != 0L) {
            this.field286.method310(var9, new class166(this.field287), 25357);
        }
        return this.field287++;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "()V", line = 316)
    public static final void method118() {
        field297 = null;
        field289 = null;
        field301 = null;
        field311 = null;
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "()V", line = 325)
    public static void method119() {
        field297 = null;
        field289 = null;
        field301 = null;
        field311 = null;
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "()V", line = 346)
    public final void method120() {
        class202 var1 = new class202((this.field308 ? 40 : 36) * this.field287);
        for (int var2 = 0; var2 < this.field287; var2++) {
            if (class249.field3916) {
                var1.method1328(27700, (float) this.field300[var2]);
                var1.method1328(27700, (float) this.field304[var2]);
                var1.method1328(27700, (float) this.field310[var2]);
                var1.method1359(16705, this.field312[var2]);
                var1.method1328(27700, this.field285[var2]);
                var1.method1328(27700, this.field302[var2]);
                var1.method1328(27700, this.field296[var2]);
                var1.method1328(27700, (float) this.field300[var2] / this.field291);
                var1.method1328(27700, (float) this.field310[var2] / this.field291);
                if (this.field308) {
                    var1.method1328(27700, this.field306[var2]);
                }
            } else {
                var1.method1301((float) this.field300[var2], false);
                var1.method1301((float) this.field304[var2], false);
                var1.method1301((float) this.field310[var2], false);
                var1.method1359(16705, this.field312[var2]);
                var1.method1301(this.field285[var2], false);
                var1.method1301(this.field302[var2], false);
                var1.method1301(this.field296[var2], false);
                var1.method1301((float) this.field300[var2] / this.field291, false);
                var1.method1301((float) this.field310[var2] / this.field291, false);
                if (this.field308) {
                    var1.method1301(this.field306[var2], false);
                }
            }
        }
        if (class249.field3877) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field3273, 0, var1.field3249);
            this.field299 = new class231();
            this.field299.method1532(var3);
        } else {
            this.field298 = ByteBuffer.allocateDirect(var1.field3249).order(ByteOrder.nativeOrder());
            this.field298.put(var1.field3273, 0, var1.field3249);
            this.field298.flip();
        }
        this.field300 = null;
        this.field304 = null;
        this.field310 = null;
        this.field312 = null;
        this.field285 = null;
        this.field302 = null;
        this.field296 = null;
        this.field286 = null;
        this.field306 = null;
    }
}
