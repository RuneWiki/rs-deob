import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class125 extends class172 {

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
    private int field2072 = 0;

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "I")
    public int field2091 = 0;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "I")
    public int field2080 = 0;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "I")
    private int field2079 = 0;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "I")
    public int field2074 = 0;

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "I")
    private int field2092 = 0;

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "I")
    public int field2086;

    @OriginalMember(owner = "client!mi", name = "Q", descriptor = "F")
    private float field2099;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "Z")
    public boolean field2076;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "Z")
    private boolean field2075;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    public int field2073;

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "Lug;")
    private static class25 field2087;

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "Lug;")
    private static class25 field2090;

    @OriginalMember(owner = "client!mi", name = "B", descriptor = "Lib;")
    private class35 field2084;

    @OriginalMember(owner = "client!mi", name = "M", descriptor = "Lcn;")
    private class37 field2095;

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2083;

    @OriginalMember(owner = "client!mi", name = "O", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2097;

    @OriginalMember(owner = "client!mi", name = "P", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2098;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "[F")
    private float[] field2071;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "[F")
    private float[] field2082;

    @OriginalMember(owner = "client!mi", name = "R", descriptor = "[F")
    private float[] field2100;

    @OriginalMember(owner = "client!mi", name = "S", descriptor = "[F")
    private float[] field2101;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "[I")
    private int[] field2070;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "[I")
    private int[] field2081;

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "[I")
    private int[] field2085;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "[I")
    private int[] field2088;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "[I")
    private int[] field2089;

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "[I")
    private int[] field2093;

    @OriginalMember(owner = "client!mi", name = "L", descriptor = "[I")
    private int[] field2094;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "[Z")
    private boolean[] field2078;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "[[I")
    private int[][] field2077;

    @OriginalMember(owner = "client!mi", name = "N", descriptor = "[[I")
    private int[][] field2096;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIFFFIF)I", line = 9)
    public final int method1081(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class164 var11 = (class164) this.field2095.method370((byte) -120, var9);
            if (var11 != null) {
                if (arg1 < this.field2081[var11.field2610]) {
                    this.field2081[var11.field2610] = arg1;
                }
                return var11.field2610;
            }
        }
        this.field2094[this.field2074] = arg0;
        this.field2081[this.field2074] = arg1;
        this.field2070[this.field2074] = arg2;
        if (this.field2075) {
            this.field2071[this.field2074] = arg7;
        }
        this.field2101[this.field2074] = arg3;
        this.field2100[this.field2074] = arg4;
        this.field2082[this.field2074] = arg5;
        this.field2093[this.field2074] = arg6;
        if (var9 != 0L) {
            this.field2095.method375(new class164(this.field2074), var9, -122);
        }
        return this.field2074++;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "()V", line = 47)
    public final void method1082() {
        this.field2094 = new int[this.field2080];
        this.field2081 = new int[this.field2080];
        this.field2070 = new int[this.field2080];
        if (this.field2075) {
            this.field2071 = new float[this.field2080];
        }
        this.field2093 = new int[this.field2080];
        this.field2101 = new float[this.field2080];
        this.field2100 = new float[this.field2080];
        this.field2082 = new float[this.field2080];
        this.field2089 = new int[this.field2091];
        this.field2085 = new int[this.field2091];
        this.field2088 = new int[this.field2091];
        this.field2096 = new int[this.field2091][];
        this.field2095 = new class37(class261.method1918(this.field2080, 22));
        if (this.field2076) {
            this.field2077 = new int[this.field2091][];
            this.field2078 = new boolean[this.field2091];
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "()V", line = 72)
    public final void method1083() {
        class25 var1 = new class25((this.field2075 ? 40 : 36) * this.field2074);
        for (int var2 = 0; var2 < this.field2074; var2++) {
            if (class240.field3757) {
                var1.method299((float) this.field2094[var2], -891392056);
                var1.method299((float) this.field2081[var2], -891392056);
                var1.method299((float) this.field2070[var2], -891392056);
                var1.method310(86, this.field2093[var2]);
                var1.method299(this.field2101[var2], -891392056);
                var1.method299(this.field2100[var2], -891392056);
                var1.method299(this.field2082[var2], -891392056);
                var1.method299((float) this.field2094[var2] / this.field2099, -891392056);
                var1.method299((float) this.field2070[var2] / this.field2099, -891392056);
                if (this.field2075) {
                    var1.method299(this.field2071[var2], -891392056);
                }
            } else {
                var1.method300((byte) -30, (float) this.field2094[var2]);
                var1.method300((byte) -30, (float) this.field2081[var2]);
                var1.method300((byte) -30, (float) this.field2070[var2]);
                var1.method310(29, this.field2093[var2]);
                var1.method300((byte) -30, this.field2101[var2]);
                var1.method300((byte) -30, this.field2100[var2]);
                var1.method300((byte) -30, this.field2082[var2]);
                var1.method300((byte) -30, (float) this.field2094[var2] / this.field2099);
                var1.method300((byte) -30, (float) this.field2070[var2] / this.field2099);
                if (this.field2075) {
                    var1.method300((byte) -30, this.field2071[var2]);
                }
            }
        }
        if (class240.field3764) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field448, 0, var1.field397);
            this.field2084 = new class35();
            this.field2084.method359(var3);
        } else {
            this.field2083 = ByteBuffer.allocateDirect(var1.field397).order(ByteOrder.nativeOrder());
            this.field2083.put(var1.field448, 0, var1.field397);
            this.field2083.flip();
        }
        this.field2094 = null;
        this.field2081 = null;
        this.field2070 = null;
        this.field2093 = null;
        this.field2101 = null;
        this.field2100 = null;
        this.field2082 = null;
        this.field2095 = null;
        this.field2071 = null;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class125(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field2086 = arg0;
        this.field2099 = arg1;
        this.field2076 = arg2;
        this.field2075 = arg3;
        this.field2073 = arg4;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([[[Lqo;FZ)V", line = 146)
    public final void method1084(class329[][][] arg0, float arg1, boolean arg2) {
        if (field2090 == null || field2090.field448.length < this.field2072 * 4) {
            field2090 = new class25(this.field2072 * 4);
        } else {
            field2090.field397 = 0;
        }
        if (field2087 == null || field2087.field448.length < this.field2092 * 4) {
            field2087 = new class25(this.field2092 * 4);
        } else {
            field2087.field397 = 0;
        }
        if (class240.field3757) {
            for (int var4 = 0; var4 < this.field2079; var4++) {
                class329 var5 = arg0[this.field2088[var4]][this.field2089[var4]][this.field2085[var4]];
                if (var5 != null && var5.field5076) {
                    int[] var6 = this.field2096[var4];
                    class25 var9;
                    if (this.field2076) {
                        int[] var7 = this.field2077[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field2087.method310(97, var7[var8]);
                            }
                        }
                        var9 = this.field2078[var4] ? field2087 : field2090;
                    } else {
                        var9 = field2090;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method310(43, var6[0]);
                        var9.method310(74, var6[var10]);
                        var9.method310(48, var6[var10 + 1]);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field2079; var11++) {
                class329 var12 = arg0[this.field2088[var11]][this.field2089[var11]][this.field2085[var11]];
                if (var12 != null && var12.field5076) {
                    int[] var13 = this.field2096[var11];
                    class25 var16;
                    if (this.field2076) {
                        int[] var14 = this.field2077[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field2087.method288(true, var14[var15]);
                            }
                        }
                        var16 = this.field2078[var11] ? field2087 : field2090;
                    } else {
                        var16 = field2090;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method288(true, var13[0]);
                        var16.method288(true, var13[var17]);
                        var16.method288(true, var13[var17 + 1]);
                    }
                }
            }
        }
        if (field2090.field397 == 0 && field2087.field397 == 0) {
            return;
        }
        GL var18 = class240.field3771;
        if (this.field2086 == -1 || arg2) {
            class240.method1786(-1);
            class211.method1562(0, 0, -73);
        } else {
            class107.field1619.method756(this.field2086, true);
        }
        int var19 = this.field2075 ? 40 : 36;
        if (this.field2084 == null) {
            if (class240.field3764) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field2083.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field2083);
            this.field2083.position(12);
            var18.glColorPointer(4, 5121, var19, this.field2083);
            if (class59.field927) {
                this.field2083.position(16);
                var18.glNormalPointer(5126, var19, this.field2083);
            }
            this.field2083.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field2083);
            if (this.field2075) {
                var18.glClientActiveTexture(class272.method1989());
                this.field2083.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field2083);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field2084.method358();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class59.field927) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field2075) {
                var18.glClientActiveTexture(class272.method1989());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class240.field3764) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field2090.field397 != 0) {
            if (field2097 == null || field2097.capacity() < field2090.field397) {
                field2097 = ByteBuffer.allocateDirect(field2090.field397).order(ByteOrder.nativeOrder());
            } else {
                field2097.clear();
            }
            field2097.put(field2090.field448, 0, field2090.field397);
            field2097.flip();
            class240.method1784(arg1);
            var18.glDrawElements(4, field2090.field397 / 4, 5125, field2097);
        }
        if (field2087.field397 == 0) {
            return;
        }
        if (field2098 == null || field2098.capacity() < field2087.field397) {
            field2098 = ByteBuffer.allocateDirect(field2087.field397).order(ByteOrder.nativeOrder());
        } else {
            field2098.clear();
        }
        field2098.put(field2087.field448, 0, field2087.field397);
        field2098.flip();
        class240.method1784(arg1 - 100.0F);
        class240.method1791();
        var18.glDrawElements(4, field2087.field397 / 4, 5125, field2098);
        class240.method1803();
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III[I[IZ)I", line = 359)
    public final int method1085(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field2076) {
            this.field2077[this.field2079] = arg4;
            this.field2078[this.field2079] = arg5;
            if (arg4 != null) {
                this.field2092 += arg4.length;
            }
            if (arg5) {
                this.field2092 += (arg3.length - 2) * 3;
            } else {
                this.field2072 += (arg3.length - 2) * 3;
            }
        } else {
            this.field2072 += (arg3.length - 2) * 3;
        }
        this.field2088[this.field2079] = arg0;
        this.field2089[this.field2079] = arg1;
        this.field2085[this.field2079] = arg2;
        this.field2096[this.field2079] = arg3;
        return this.field2079++;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "()V", line = 399)
    public static void method1086() {
        field2090 = null;
        field2087 = null;
        field2097 = null;
        field2098 = null;
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "()V", line = 409)
    public static final void method1087() {
        field2090 = null;
        field2087 = null;
        field2097 = null;
        field2098 = null;
    }
}
