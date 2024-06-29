import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class113 extends class163 {

    @OriginalMember(owner = "client!gf", name = "A", descriptor = "I")
    public int field1981 = 0;

    @OriginalMember(owner = "client!gf", name = "F", descriptor = "I")
    private int field1986 = 0;

    @OriginalMember(owner = "client!gf", name = "Q", descriptor = "I")
    public int field1996 = 0;

    @OriginalMember(owner = "client!gf", name = "R", descriptor = "I")
    public int field1997 = 0;

    @OriginalMember(owner = "client!gf", name = "T", descriptor = "I")
    private int field1999 = 0;

    @OriginalMember(owner = "client!gf", name = "S", descriptor = "I")
    private int field1998 = 0;

    @OriginalMember(owner = "client!gf", name = "U", descriptor = "I")
    public int field2000;

    @OriginalMember(owner = "client!gf", name = "G", descriptor = "F")
    private float field1987;

    @OriginalMember(owner = "client!gf", name = "E", descriptor = "Z")
    public boolean field1985;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "Z")
    private boolean field1977;

    @OriginalMember(owner = "client!gf", name = "B", descriptor = "I")
    public int field1982;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "Lrj;")
    private class254 field1976;

    @OriginalMember(owner = "client!gf", name = "W", descriptor = "Lre;")
    private class259 field2002;

    @OriginalMember(owner = "client!gf", name = "O", descriptor = "Lra;")
    private static class41 field1994;

    @OriginalMember(owner = "client!gf", name = "V", descriptor = "Lra;")
    private static class41 field2001;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1974;

    @OriginalMember(owner = "client!gf", name = "L", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1991;

    @OriginalMember(owner = "client!gf", name = "N", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1993;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "[F")
    private float[] field1973;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "[F")
    private float[] field1975;

    @OriginalMember(owner = "client!gf", name = "M", descriptor = "[F")
    private float[] field1992;

    @OriginalMember(owner = "client!gf", name = "P", descriptor = "[F")
    private float[] field1995;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "[I")
    private int[] field1972;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "[I")
    private int[] field1978;

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "[I")
    private int[] field1979;

    @OriginalMember(owner = "client!gf", name = "C", descriptor = "[I")
    private int[] field1983;

    @OriginalMember(owner = "client!gf", name = "J", descriptor = "[I")
    private int[] field1989;

    @OriginalMember(owner = "client!gf", name = "K", descriptor = "[I")
    private int[] field1990;

    @OriginalMember(owner = "client!gf", name = "X", descriptor = "[I")
    private int[] field2003;

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "[Z")
    private boolean[] field1980;

    @OriginalMember(owner = "client!gf", name = "D", descriptor = "[[I")
    private int[][] field1984;

    @OriginalMember(owner = "client!gf", name = "H", descriptor = "[[I")
    private int[][] field1988;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "()V", line = 8)
    public static void method775() {
        field1994 = null;
        field2001 = null;
        field1991 = null;
        field1974 = null;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "()V", line = 17)
    public final void method776() {
        class41 var1 = new class41((this.field1977 ? 40 : 36) * this.field1981);
        for (int var2 = 0; var2 < this.field1981; var2++) {
            if (class253.field4331) {
                var1.method316((float) this.field1983[var2], -1244406608);
                var1.method316((float) this.field1978[var2], -1244406608);
                var1.method316((float) this.field1972[var2], -1244406608);
                var1.method365((byte) -32, this.field1979[var2]);
                var1.method316(this.field1973[var2], -1244406608);
                var1.method316(this.field1995[var2], -1244406608);
                var1.method316(this.field1992[var2], -1244406608);
                var1.method316((float) this.field1983[var2] / this.field1987, -1244406608);
                var1.method316((float) this.field1972[var2] / this.field1987, -1244406608);
                if (this.field1977) {
                    var1.method316(this.field1975[var2], -1244406608);
                }
            } else {
                var1.method320(false, (float) this.field1983[var2]);
                var1.method320(false, (float) this.field1978[var2]);
                var1.method320(false, (float) this.field1972[var2]);
                var1.method365((byte) -32, this.field1979[var2]);
                var1.method320(false, this.field1973[var2]);
                var1.method320(false, this.field1995[var2]);
                var1.method320(false, this.field1992[var2]);
                var1.method320(false, (float) this.field1983[var2] / this.field1987);
                var1.method320(false, (float) this.field1972[var2] / this.field1987);
                if (this.field1977) {
                    var1.method320(false, this.field1975[var2]);
                }
            }
        }
        if (class253.field4304) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field772, 0, var1.field738);
            this.field2002 = new class259();
            this.field2002.method1822(var3);
        } else {
            this.field1993 = ByteBuffer.allocateDirect(var1.field738).order(ByteOrder.nativeOrder());
            this.field1993.put(var1.field772, 0, var1.field738);
            this.field1993.flip();
        }
        this.field1983 = null;
        this.field1978 = null;
        this.field1972 = null;
        this.field1979 = null;
        this.field1973 = null;
        this.field1995 = null;
        this.field1992 = null;
        this.field1976 = null;
        this.field1975 = null;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class113(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field2000 = arg0;
        this.field1987 = arg1;
        this.field1985 = arg2;
        this.field1977 = arg3;
        this.field1982 = arg4;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III[I[IZ)I", line = 106)
    public final int method777(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field1985) {
            this.field1984[this.field1986] = arg4;
            this.field1980[this.field1986] = arg5;
            if (arg4 != null) {
                this.field1999 += arg4.length;
            }
            if (arg5) {
                this.field1999 += (arg3.length - 2) * 3;
            } else {
                this.field1998 += (arg3.length - 2) * 3;
            }
        } else {
            this.field1998 += (arg3.length - 2) * 3;
        }
        this.field2003[this.field1986] = arg0;
        this.field1989[this.field1986] = arg1;
        this.field1990[this.field1986] = arg2;
        this.field1988[this.field1986] = arg3;
        return this.field1986++;
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "()V", line = 131)
    public static final void method778() {
        field1994 = null;
        field2001 = null;
        field1991 = null;
        field1974 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "([[[Lmh;FZ)V", line = 148)
    public final void method779(class271[][][] arg0, float arg1, boolean arg2) {
        if (field1994 == null || field1994.field772.length < this.field1998 * 4) {
            field1994 = new class41(this.field1998 * 4);
        } else {
            field1994.field738 = 0;
        }
        if (field2001 == null || field2001.field772.length < this.field1999 * 4) {
            field2001 = new class41(this.field1999 * 4);
        } else {
            field2001.field738 = 0;
        }
        if (class253.field4331) {
            for (int var4 = 0; var4 < this.field1986; var4++) {
                class271 var5 = arg0[this.field2003[var4]][this.field1989[var4]][this.field1990[var4]];
                if (var5 != null && var5.field4644) {
                    int[] var6 = this.field1988[var4];
                    class41 var9;
                    if (this.field1985) {
                        int[] var7 = this.field1984[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field2001.method365((byte) -32, var7[var8]);
                            }
                        }
                        var9 = this.field1980[var4] ? field2001 : field1994;
                    } else {
                        var9 = field1994;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method365((byte) -32, var6[0]);
                        var9.method365((byte) -32, var6[var10]);
                        var9.method365((byte) -32, var6[var10 + 1]);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field1986; var11++) {
                class271 var12 = arg0[this.field2003[var11]][this.field1989[var11]][this.field1990[var11]];
                if (var12 != null && var12.field4644) {
                    int[] var13 = this.field1988[var11];
                    class41 var16;
                    if (this.field1985) {
                        int[] var14 = this.field1984[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field2001.method325(true, var14[var15]);
                            }
                        }
                        var16 = this.field1980[var11] ? field2001 : field1994;
                    } else {
                        var16 = field1994;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method325(true, var13[0]);
                        var16.method325(true, var13[var17]);
                        var16.method325(true, var13[var17 + 1]);
                    }
                }
            }
        }
        if (field1994.field738 == 0 && field2001.field738 == 0) {
            return;
        }
        GL var18 = class253.field4319;
        if (this.field2000 == -1 || arg2) {
            class253.method1714(-1);
            class277.method1910(0, 0, -19856);
        } else {
            class136.field2373.method195(this.field2000, 95);
        }
        int var19 = this.field1977 ? 40 : 36;
        if (this.field2002 == null) {
            if (class253.field4304) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field1993.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field1993);
            this.field1993.position(12);
            var18.glColorPointer(4, 5121, var19, this.field1993);
            if (class193.field3531) {
                this.field1993.position(16);
                var18.glNormalPointer(5126, var19, this.field1993);
            }
            this.field1993.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field1993);
            if (this.field1977) {
                var18.glClientActiveTexture(class263.method1844());
                this.field1993.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field1993);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field2002.method1821();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class193.field3531) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field1977) {
                var18.glClientActiveTexture(class263.method1844());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class253.field4304) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field1994.field738 != 0) {
            if (field1991 == null || field1991.capacity() < field1994.field738) {
                field1991 = ByteBuffer.allocateDirect(field1994.field738).order(ByteOrder.nativeOrder());
            } else {
                field1991.clear();
            }
            field1991.put(field1994.field772, 0, field1994.field738);
            field1991.flip();
            class253.method1718(arg1);
            var18.glDrawElements(4, field1994.field738 / 4, 5125, field1991);
        }
        if (field2001.field738 == 0) {
            return;
        }
        if (field1974 == null || field1974.capacity() < field2001.field738) {
            field1974 = ByteBuffer.allocateDirect(field2001.field738).order(ByteOrder.nativeOrder());
        } else {
            field1974.clear();
        }
        field1974.put(field2001.field772, 0, field2001.field738);
        field1974.flip();
        class253.method1718(arg1 - 100.0F);
        class253.method1709();
        var18.glDrawElements(4, field2001.field738 / 4, 5125, field1974);
        class253.method1728();
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIFFFIF)I", line = 359)
    public final int method780(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class6 var11 = (class6) this.field1976.method1744((byte) 125, var9);
            if (var11 != null) {
                if (arg1 < this.field1978[var11.field94]) {
                    this.field1978[var11.field94] = arg1;
                }
                return var11.field94;
            }
        }
        this.field1983[this.field1981] = arg0;
        this.field1978[this.field1981] = arg1;
        this.field1972[this.field1981] = arg2;
        if (this.field1977) {
            this.field1975[this.field1981] = arg7;
        }
        this.field1973[this.field1981] = arg3;
        this.field1995[this.field1981] = arg4;
        this.field1992[this.field1981] = arg5;
        this.field1979[this.field1981] = arg6;
        if (var9 != 0L) {
            this.field1976.method1749(true, new class6(this.field1981), var9);
        }
        return this.field1981++;
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "()V", line = 394)
    public final void method781() {
        this.field1983 = new int[this.field1996];
        this.field1978 = new int[this.field1996];
        this.field1972 = new int[this.field1996];
        if (this.field1977) {
            this.field1975 = new float[this.field1996];
        }
        this.field1979 = new int[this.field1996];
        this.field1973 = new float[this.field1996];
        this.field1995 = new float[this.field1996];
        this.field1992 = new float[this.field1996];
        this.field1989 = new int[this.field1997];
        this.field1990 = new int[this.field1997];
        this.field2003 = new int[this.field1997];
        this.field1988 = new int[this.field1997][];
        this.field1976 = new class254(class124.method859((byte) -105, this.field1996));
        if (this.field1985) {
            this.field1984 = new int[this.field1997][];
            this.field1980 = new boolean[this.field1997];
        }
    }
}
