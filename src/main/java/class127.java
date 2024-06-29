import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class127 extends class46 {

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
    public int field1973 = 0;

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "I")
    public int field1979 = 0;

    @OriginalMember(owner = "client!fm", name = "C", descriptor = "I")
    private int field1984 = 0;

    @OriginalMember(owner = "client!fm", name = "I", descriptor = "I")
    private int field1990 = 0;

    @OriginalMember(owner = "client!fm", name = "K", descriptor = "I")
    private int field1992 = 0;

    @OriginalMember(owner = "client!fm", name = "N", descriptor = "I")
    public int field1995 = 0;

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "I")
    public int field1981;

    @OriginalMember(owner = "client!fm", name = "Q", descriptor = "F")
    private float field1998;

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "Z")
    public boolean field1972;

    @OriginalMember(owner = "client!fm", name = "D", descriptor = "Z")
    private boolean field1985;

    @OriginalMember(owner = "client!fm", name = "A", descriptor = "I")
    public int field1982;

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "Lmg;")
    private class113 field1974;

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "Lkh;")
    private static class166 field1980;

    @OriginalMember(owner = "client!fm", name = "H", descriptor = "Lkh;")
    private static class166 field1989;

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "Lgd;")
    private class170 field1975;

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1978;

    @OriginalMember(owner = "client!fm", name = "B", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1983;

    @OriginalMember(owner = "client!fm", name = "J", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1991;

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "[F")
    private float[] field1976;

    @OriginalMember(owner = "client!fm", name = "v", descriptor = "[F")
    private float[] field1977;

    @OriginalMember(owner = "client!fm", name = "E", descriptor = "[F")
    private float[] field1986;

    @OriginalMember(owner = "client!fm", name = "G", descriptor = "[F")
    private float[] field1988;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "[I")
    private int[] field1970;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "[I")
    private int[] field1971;

    @OriginalMember(owner = "client!fm", name = "F", descriptor = "[I")
    private int[] field1987;

    @OriginalMember(owner = "client!fm", name = "M", descriptor = "[I")
    private int[] field1994;

    @OriginalMember(owner = "client!fm", name = "O", descriptor = "[I")
    private int[] field1996;

    @OriginalMember(owner = "client!fm", name = "P", descriptor = "[I")
    private int[] field1997;

    @OriginalMember(owner = "client!fm", name = "R", descriptor = "[I")
    private int[] field1999;

    @OriginalMember(owner = "client!fm", name = "L", descriptor = "[Z")
    private boolean[] field1993;

    @OriginalMember(owner = "client!fm", name = "S", descriptor = "[[I")
    private int[][] field2000;

    @OriginalMember(owner = "client!fm", name = "T", descriptor = "[[I")
    private int[][] field2001;

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class127(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field1981 = arg0;
        this.field1998 = arg1;
        this.field1972 = arg2;
        this.field1985 = arg3;
        this.field1982 = arg4;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "()V", line = 30)
    public static void method918() {
        field1989 = null;
        field1980 = null;
        field1983 = null;
        field1991 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "([[[Lff;FZ)V", line = 47)
    public final void method919(class142[][][] arg0, float arg1, boolean arg2) {
        if (field1989 == null || field1989.field2500.length < this.field1992 * 4) {
            field1989 = new class166(this.field1992 * 4);
        } else {
            field1989.field2532 = 0;
        }
        if (field1980 == null || field1980.field2500.length < this.field1984 * 4) {
            field1980 = new class166(this.field1984 * 4);
        } else {
            field1980.field2532 = 0;
        }
        if (class94.field1512) {
            for (int var4 = 0; var4 < this.field1990; var4++) {
                class142 var5 = arg0[this.field1994[var4]][this.field1971[var4]][this.field1996[var4]];
                if (var5 != null && var5.field2202) {
                    int[] var6 = this.field2000[var4];
                    class166 var9;
                    if (this.field1972) {
                        int[] var7 = this.field2001[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field1980.method1174((byte) -32, var7[var8]);
                            }
                        }
                        var9 = this.field1993[var4] ? field1980 : field1989;
                    } else {
                        var9 = field1989;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method1174((byte) -32, var6[0]);
                        var9.method1174((byte) -32, var6[var10]);
                        var9.method1174((byte) -32, var6[var10 + 1]);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field1990; var11++) {
                class142 var12 = arg0[this.field1994[var11]][this.field1971[var11]][this.field1996[var11]];
                if (var12 != null && var12.field2202) {
                    int[] var13 = this.field2000[var11];
                    class166 var16;
                    if (this.field1972) {
                        int[] var14 = this.field2001[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field1980.method1169(var14[var15], 30148);
                            }
                        }
                        var16 = this.field1993[var11] ? field1980 : field1989;
                    } else {
                        var16 = field1989;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method1169(var13[0], 30148);
                        var16.method1169(var13[var17], 30148);
                        var16.method1169(var13[var17 + 1], 30148);
                    }
                }
            }
        }
        if (field1989.field2532 == 0 && field1980.field2532 == 0) {
            return;
        }
        GL var18 = class94.field1473;
        if (this.field1981 == -1 || arg2) {
            class94.method698(-1);
            class37.method313(0, 0, 0);
        } else {
            class15.field207.method2083(32612, this.field1981);
        }
        int var19 = this.field1985 ? 40 : 36;
        if (this.field1974 == null) {
            if (class94.field1507) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field1978.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field1978);
            this.field1978.position(12);
            var18.glColorPointer(4, 5121, var19, this.field1978);
            if (class208.field3191) {
                this.field1978.position(16);
                var18.glNormalPointer(5126, var19, this.field1978);
            }
            this.field1978.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field1978);
            if (this.field1985) {
                var18.glClientActiveTexture(class100.method736());
                this.field1978.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field1978);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field1974.method837();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class208.field3191) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field1985) {
                var18.glClientActiveTexture(class100.method736());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class94.field1507) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field1989.field2532 != 0) {
            if (field1983 == null || field1983.capacity() < field1989.field2532) {
                field1983 = ByteBuffer.allocateDirect(field1989.field2532).order(ByteOrder.nativeOrder());
            } else {
                field1983.clear();
            }
            field1983.put(field1989.field2500, 0, field1989.field2532);
            field1983.flip();
            class94.method671(arg1);
            var18.glDrawElements(4, field1989.field2532 / 4, 5125, field1983);
        }
        if (field1980.field2532 == 0) {
            return;
        }
        if (field1991 == null || field1991.capacity() < field1980.field2532) {
            field1991 = ByteBuffer.allocateDirect(field1980.field2532).order(ByteOrder.nativeOrder());
        } else {
            field1991.clear();
        }
        field1991.put(field1980.field2500, 0, field1980.field2532);
        field1991.flip();
        class94.method671(arg1 - 100.0F);
        class94.method674();
        var18.glDrawElements(4, field1980.field2532 / 4, 5125, field1991);
        class94.method683();
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "()V", line = 257)
    public final void method920() {
        class166 var1 = new class166((this.field1985 ? 40 : 36) * this.field1979);
        for (int var2 = 0; var2 < this.field1979; var2++) {
            if (class94.field1512) {
                var1.method1160(1, (float) this.field1999[var2]);
                var1.method1160(1, (float) this.field1970[var2]);
                var1.method1160(1, (float) this.field1997[var2]);
                var1.method1174((byte) -32, this.field1987[var2]);
                var1.method1160(1, this.field1977[var2]);
                var1.method1160(1, this.field1988[var2]);
                var1.method1160(1, this.field1986[var2]);
                var1.method1160(1, (float) this.field1999[var2] / this.field1998);
                var1.method1160(1, (float) this.field1997[var2] / this.field1998);
                if (this.field1985) {
                    var1.method1160(1, this.field1976[var2]);
                }
            } else {
                var1.method1144((byte) -127, (float) this.field1999[var2]);
                var1.method1144((byte) -122, (float) this.field1970[var2]);
                var1.method1144((byte) -126, (float) this.field1997[var2]);
                var1.method1174((byte) -32, this.field1987[var2]);
                var1.method1144((byte) -112, this.field1977[var2]);
                var1.method1144((byte) -97, this.field1988[var2]);
                var1.method1144((byte) -119, this.field1986[var2]);
                var1.method1144((byte) -124, (float) this.field1999[var2] / this.field1998);
                var1.method1144((byte) -102, (float) this.field1997[var2] / this.field1998);
                if (this.field1985) {
                    var1.method1144((byte) -112, this.field1976[var2]);
                }
            }
        }
        if (class94.field1507) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field2500, 0, var1.field2532);
            this.field1974 = new class113();
            this.field1974.method841(var3);
        } else {
            this.field1978 = ByteBuffer.allocateDirect(var1.field2532).order(ByteOrder.nativeOrder());
            this.field1978.put(var1.field2500, 0, var1.field2532);
            this.field1978.flip();
        }
        this.field1999 = null;
        this.field1970 = null;
        this.field1997 = null;
        this.field1987 = null;
        this.field1977 = null;
        this.field1988 = null;
        this.field1986 = null;
        this.field1975 = null;
        this.field1976 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIFFFIF)I", line = 324)
    public final int method921(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class295 var11 = (class295) this.field1975.method1222(0, var9);
            if (var11 != null) {
                if (arg1 < this.field1970[var11.field4562]) {
                    this.field1970[var11.field4562] = arg1;
                }
                return var11.field4562;
            }
        }
        this.field1999[this.field1979] = arg0;
        this.field1970[this.field1979] = arg1;
        this.field1997[this.field1979] = arg2;
        if (this.field1985) {
            this.field1976[this.field1979] = arg7;
        }
        this.field1977[this.field1979] = arg3;
        this.field1988[this.field1979] = arg4;
        this.field1986[this.field1979] = arg5;
        this.field1987[this.field1979] = arg6;
        if (var9 != 0L) {
            this.field1975.method1227(new class295(this.field1979), 0, var9);
        }
        return this.field1979++;
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "()V", line = 361)
    public static final void method922() {
        field1989 = null;
        field1980 = null;
        field1983 = null;
        field1991 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(III[I[IZ)I", line = 367)
    public final int method923(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field1972) {
            this.field2001[this.field1990] = arg4;
            this.field1993[this.field1990] = arg5;
            if (arg4 != null) {
                this.field1984 += arg4.length;
            }
            if (arg5) {
                this.field1984 += (arg3.length - 2) * 3;
            } else {
                this.field1992 += (arg3.length - 2) * 3;
            }
        } else {
            this.field1992 += (arg3.length - 2) * 3;
        }
        this.field1994[this.field1990] = arg0;
        this.field1971[this.field1990] = arg1;
        this.field1996[this.field1990] = arg2;
        this.field2000[this.field1990] = arg3;
        return this.field1990++;
    }

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "()V", line = 392)
    public final void method924() {
        this.field1999 = new int[this.field1995];
        this.field1970 = new int[this.field1995];
        this.field1997 = new int[this.field1995];
        if (this.field1985) {
            this.field1976 = new float[this.field1995];
        }
        this.field1987 = new int[this.field1995];
        this.field1977 = new float[this.field1995];
        this.field1988 = new float[this.field1995];
        this.field1986 = new float[this.field1995];
        this.field1971 = new int[this.field1973];
        this.field1996 = new int[this.field1973];
        this.field1994 = new int[this.field1973];
        this.field2000 = new int[this.field1973][];
        this.field1975 = new class170(class10.method73((byte) -65, this.field1995));
        if (this.field1972) {
            this.field2001 = new int[this.field1973][];
            this.field1993 = new boolean[this.field1973];
        }
    }
}
