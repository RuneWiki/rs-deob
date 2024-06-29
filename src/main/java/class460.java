import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public abstract class class460 implements class664 {

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "I")
    private int field6478 = -1;

    @OriginalMember(owner = "client!nq", name = "q", descriptor = "I")
    private int field6491 = 0;

    @OriginalMember(owner = "client!nq", name = "r", descriptor = "Z")
    private boolean field6492;

    @OriginalMember(owner = "client!nq", name = "k", descriptor = "I")
    private int field6485;

    @OriginalMember(owner = "client!nq", name = "t", descriptor = "Lfha;")
    public class378 field6494;

    @OriginalMember(owner = "client!nq", name = "o", descriptor = "J")
    public static long field6489 = 0L;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "I")
    public static int field6477;

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "I")
    public static int field6481;

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "I")
    public static int field6482;

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "I")
    private int field6483;

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "I")
    public static int field6484;

    @OriginalMember(owner = "client!nq", name = "l", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!nq", name = "n", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!nq", name = "p", descriptor = "I")
    private int field6490;

    @OriginalMember(owner = "client!nq", name = "s", descriptor = "I")
    public static int field6493;

    @OriginalMember(owner = "client!nq", name = "m", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field6487;

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)V")
    private final void method2730(int arg0) {
        field6479++;
        if (this.field6478 >= arg0) {
            return;
        }
        if (this.field6494.field5417) {
            OpenGL.glGenBuffersARB(1, class350.field4951, 0);
            this.field6478 = class350.field4951[0];
            OpenGL.glBindBufferARB(this.field6485, this.field6478);
        } else {
            this.field6478 = 0;
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(Z)J")
    public final long method2731(boolean arg0) {
        if (!arg0) {
            this.field6490 = -123;
        }
        field6476++;
        return this.field6478 == 0 ? this.field6487.getAddress() : 0L;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)I")
    public int method1564(boolean arg0) {
        if (arg0) {
            field6475++;
            return this.field6490;
        } else {
            return 60;
        }
    }

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "(I)V")
    public final void method2732(int arg0) {
        if (this.field6494.field5417) {
            OpenGL.glBindBufferARB(this.field6485, this.field6478);
        }
        field6477++;
        if (arg0 != -24568) {
            this.method2733((byte) 24, null);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BLjaggl/MapBuffer;)Z")
    public final boolean method2733(byte arg0, MapBuffer arg1) {
        field6493++;
        if (arg0 != 100) {
            return true;
        }
        boolean var3 = true;
        if (this.field6491 != 0) {
            if (this.field6478 > 0) {
                OpenGL.glBindBufferARB(this.field6485, this.field6478);
                if (this.field6491 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field6485, 0, this.field6483, this.field6494.field3382.getAddress());
                } else {
                    var3 = arg1.method3504();
                }
            }
            this.field6491 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IB)V")
    public void method2157(int arg0, byte arg1) {
        field6488++;
        int var3 = 122 % ((arg1 - 3) / 47);
        if (this.field6483 < arg0) {
            this.method2730(0);
            if (this.field6478 <= 0) {
                this.field6487 = this.field6494.method1620(-16455, arg0, false);
            } else {
                OpenGL.glBindBufferARB(this.field6485, this.field6478);
                OpenGL.glBufferDataARBub(this.field6485, arg0, null, 0, this.field6492 ? 35040 : 35044);
                this.field6494.field3516 += arg0 - this.field6483;
            }
            this.field6483 = arg0;
        }
        this.field6490 = arg0;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILha;IIIII)Lka;")
    public static final class471 method2734(int arg0, class58 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6480++;
        long var7 = (long) arg5;
        class471 var9 = (class471) class287.field4061.method4022(var7, (byte) -48);
        short var10 = 2055;
        if (var9 == null) {
            class6 var11 = class393.method2470(0, class626.field8695, arg5, 0);
            if (var11 == null) {
                return null;
            }
            if (var11.field62 < 13) {
                var11.method33(2, true);
            }
            var9 = arg1.method397(var11, var10, class609.field8570, 64, 768);
            class287.field4061.method4018((byte) 126, var9, var7);
        }
        class471 var12 = var9.method226((byte) 2, var10, true);
        if (arg2 != 0) {
            var12.method231(arg2);
        }
        if (arg3 != 0) {
            var12.method238(arg3);
        }
        if (arg6 >= -75) {
            field6489 = 102L;
        }
        if (arg0 != 0) {
            var12.method249(arg0);
        }
        if (arg4 != 0) {
            var12.method235(0, arg4, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZLjaggl/MapBuffer;B)Ljaclib/memory/Buffer;")
    public final Buffer method2735(boolean arg0, MapBuffer arg1, byte arg2) {
        field6484++;
        if (arg2 != -24) {
            this.method1059(81);
        }
        if (this.field6491 == 0) {
            this.method2730(0);
            if (this.field6478 <= 0) {
                this.field6491 = 2;
                return this.field6487;
            }
            OpenGL.glBindBufferARB(this.field6485, this.field6478);
            if (arg0) {
                OpenGL.glBufferDataARBub(this.field6485, this.field6483, null, 0, this.field6492 ? 35040 : 35044);
                if (this.field6494.field3382.field9096 >= this.field6490) {
                    this.field6491 = 1;
                    return this.field6494.field3382;
                }
            }
            if (!arg1.method3505() && arg1.method3503(this.field6485, this.field6490, 35001)) {
                this.field6491 = 2;
                return arg1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V")
    public void method1059(int arg0) {
        if (this.field6478 > 0) {
            this.field6494.method2376(arg0 - 5267, this.field6478, this.field6490);
            this.field6478 = -1;
        }
        field6481++;
        if (arg0 != 5342) {
            field6489 = 54L;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljaclib/memory/Source;II)Z")
    public final boolean method2736(Source arg0, int arg1, int arg2) {
        if (arg2 != 2) {
            this.field6492 = false;
        }
        field6482++;
        if (arg1 <= this.field6483) {
            if (this.field6478 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field6485, this.field6478);
            OpenGL.glBufferSubDataARBa(this.field6485, 0, this.field6490, arg0.getAddress());
            this.field6494.field3516 += arg1 - this.field6490;
        } else {
            this.method2730(0);
            if (this.field6478 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field6485, this.field6478);
            OpenGL.glBufferDataARBa(this.field6485, arg1, arg0.getAddress(), this.field6492 ? 35040 : 35044);
            this.field6494.field3516 += arg1 - this.field6490;
            this.field6483 = arg1;
        }
        this.field6490 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!nq", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field6486++;
        this.method1059(5342);
        super.finalize();
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lfha;IZ)V")
    public class460(class378 arg0, int arg1, boolean arg2) {
        this.field6492 = arg2;
        this.field6485 = arg1;
        this.field6494 = arg0;
    }
}
