import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public abstract class class446 implements class410 {

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    private int field6186 = -1;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    private int field6205 = 0;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "Z")
    private boolean field6193;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    private int field6187;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "Leea;")
    public class132 field6184;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "[S")
    private static short[] field6198 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "[S")
    private static short[] field6191 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "[S")
    private static short[] field6203 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "[S")
    private static short[] field6209 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "[[S")
    public static short[][] field6199 = new short[][] { field6209, field6198, field6191, field6203 };

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public static int field6192;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    private int field6194;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    private int field6196;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field6197;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(Z)V")
    public static void method2663(boolean arg0) {
        if (arg0) {
            field6203 = null;
        }
        field6209 = null;
        field6199 = null;
        field6198 = null;
        field6203 = null;
        field6191 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILjaclib/memory/Source;I)Z")
    public final boolean method2664(int arg0, Source arg1, int arg2) {
        field6204++;
        int var4 = 87 / ((arg0 - 51) / 33);
        if (arg2 <= this.field6196) {
            if (this.field6186 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field6187, this.field6186);
            OpenGL.glBufferSubDataARBa(this.field6187, 0, this.field6194, arg1.getAddress());
            this.field6184.field6439 += arg2 - this.field6194;
        } else {
            this.method2669((byte) 121);
            if (this.field6186 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field6187, this.field6186);
            OpenGL.glBufferDataARBa(this.field6187, arg2, arg1.getAddress(), this.field6193 ? 35040 : 35044);
            this.field6184.field6439 += arg2 - this.field6194;
            this.field6196 = arg2;
        }
        this.field6194 = arg2;
        return true;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
    public void method1496(boolean arg0) {
        if (arg0) {
            return;
        }
        if (this.field6186 > 0) {
            this.field6184.method1026(false, this.field6194, this.field6186);
            this.field6186 = -1;
        }
        field6201++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljaggl/MapBuffer;I)Z")
    public final boolean method2665(MapBuffer arg0, int arg1) {
        if (arg1 != 15064) {
            method2671((byte) -99, 87, 70, -34);
        }
        field6202++;
        boolean var3 = true;
        if (this.field6205 != 0) {
            if (this.field6186 > 0) {
                OpenGL.glBindBufferARB(this.field6187, this.field6186);
                if (this.field6205 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field6187, 0, this.field6196, this.field6184.field6385.getAddress());
                } else {
                    var3 = arg0.method3604();
                }
            }
            this.field6205 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)J")
    public final long method2666(byte arg0) {
        field6206++;
        if (arg0 <= 115) {
            return -34L;
        } else if (this.field6186 == 0) {
            return this.field6197.getAddress();
        } else {
            return 0L;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([JI[Ljava/lang/Object;II)V")
    public static final void method2667(long[] arg0, int arg1, Object[] arg2, int arg3, int arg4) {
        if (arg4 > arg1) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg1;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var7;
            Object var9 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg1; var11 < arg4; var11++) {
                if (arg0[var11] < ((long) (var11 & var10) + var7)) {
                    long var12 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6] = var12;
                    Object var14 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6++] = var14;
                }
            }
            arg0[arg4] = arg0[var6];
            arg0[var6] = var7;
            arg2[arg4] = arg2[var6];
            arg2[var6] = var9;
            method2667(arg0, arg1, arg2, -127, var6 - 1);
            method2667(arg0, var6 + 1, arg2, -114, arg4);
        }
        field6192++;
        if (arg3 > -81) {
            method2663(false);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V")
    public void method1600(int arg0, int arg1) {
        int var3 = -16 / ((-arg1 - 34) / 62);
        field6200++;
        if (this.field6196 < arg0) {
            this.method2669((byte) -123);
            if (this.field6186 > 0) {
                OpenGL.glBindBufferARB(this.field6187, this.field6186);
                OpenGL.glBufferDataARBub(this.field6187, arg0, null, 0, this.field6193 ? 35040 : 35044);
                this.field6184.field6439 += arg0 - this.field6196;
            } else {
                this.field6197 = this.field6184.method2766(arg0, 0, false);
            }
            this.field6196 = arg0;
        }
        this.field6194 = arg0;
    }

    @OriginalMember(owner = "client!qd", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1496(false);
        field6189++;
        super.finalize();
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)I")
    public int method1491(int arg0) {
        field6185++;
        int var2 = -83 / ((-arg0 - 42) / 46);
        return this.field6194;
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
    public static final void method2668(int arg0) {
        field6188++;
        for (int var1 = arg0; var1 < class688.field9694; var1++) {
            int var2 = class742.method4127((byte) -81, class213.field3061 + var1, class688.field9694) * class63.field1151;
            for (int var3 = 0; var3 < class63.field1151; var3++) {
                int var4 = class742.method4127((byte) 81, var3 + class179.field2578, class63.field1151) + var2;
                if (class168.field2469[var4] == class575.field8150) {
                    class724.field10127[var4].method124(0, 0, class208.field2997, class653.field9197, class208.field2997 * var3, class653.field9197 * var1, true, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V")
    private final void method2669(byte arg0) {
        field6195++;
        if (this.field6186 >= 0) {
            return;
        }
        if (this.field6184.field2090) {
            OpenGL.glGenBuffersARB(1, class280.field3933, 0);
            this.field6186 = class280.field3933[0];
            OpenGL.glBindBufferARB(this.field6187, this.field6186);
        } else {
            this.field6186 = 0;
        }
        int var2 = 6 % ((arg0 - 60) / 41);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZILjaggl/MapBuffer;)Ljaclib/memory/Buffer;")
    public final Buffer method2670(boolean arg0, int arg1, MapBuffer arg2) {
        field6207++;
        if (this.field6205 == 0) {
            this.method2669((byte) -42);
            if (this.field6186 <= 0) {
                this.field6205 = 2;
                return this.field6197;
            }
            OpenGL.glBindBufferARB(this.field6187, this.field6186);
            if (arg0) {
                OpenGL.glBufferDataARBub(this.field6187, this.field6196, null, 0, this.field6193 ? 35040 : 35044);
                if (this.field6194 <= this.field6184.field6385.field9384) {
                    this.field6205 = 1;
                    return this.field6184.field6385;
                }
            }
            if (!arg2.method3602() && arg2.method3603(this.field6187, this.field6194, 35001)) {
                this.field6205 = 2;
                return arg2;
            }
        }
        return arg1 == 1 ? null : null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BIII)Lvg;")
    public static final class52 method2671(byte arg0, int arg1, int arg2, int arg3) {
        field6190++;
        class416 var4 = class390.field5454[arg1][arg3][arg2];
        if (var4 == null) {
            return null;
        }
        class52 var5 = null;
        int var6 = -1;
        for (class217 var7 = var4.field5844; var7 != null; var7 = var7.field3091) {
            class113 var8 = var7.field3090;
            if (var8 instanceof class52) {
                class52 var9 = (class52) var8;
                int var10 = var9.method482(false) * 256 - 4;
                int var11 = var9.field644 - var10 >> 9;
                int var12 = var9.field648 - var10 >> 9;
                int var13 = var9.field644 + var10 >> 9;
                int var14 = var9.field648 + var10 >> 9;
                if (arg3 >= var11 && var12 <= arg2 && arg3 <= var13 && arg2 <= var14) {
                    int var15 = (var13 + 1 - arg3) * (var14 + 1 - arg2);
                    if (var6 < var15) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
        }
        if (arg0 != 69) {
            method2668(-97);
        }
        return var5;
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)V")
    public final void method2672(byte arg0) {
        if (arg0 > -109) {
            field6191 = null;
        }
        field6208++;
        if (this.field6184.field2090) {
            OpenGL.glBindBufferARB(this.field6187, this.field6186);
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Leea;IZ)V")
    public class446(class132 arg0, int arg1, boolean arg2) {
        this.field6193 = arg2;
        this.field6187 = arg1;
        this.field6184 = arg0;
    }
}
