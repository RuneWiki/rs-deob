import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public abstract class class422 implements class471 {

    @OriginalMember(owner = "client!ks", name = "l", descriptor = "I")
    private int field5458 = 0;

    @OriginalMember(owner = "client!ks", name = "q", descriptor = "I")
    private int field5463 = -1;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "I")
    private int field5449;

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "Lia;")
    private class27 field5454;

    @OriginalMember(owner = "client!ks", name = "p", descriptor = "Z")
    private boolean field5462;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!ks", name = "j", descriptor = "I")
    private int field5456;

    @OriginalMember(owner = "client!ks", name = "k", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!ks", name = "m", descriptor = "I")
    private int field5459;

    @OriginalMember(owner = "client!ks", name = "n", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!ks", name = "s", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!ks", name = "t", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!ks", name = "u", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!ks", name = "o", descriptor = "Loo;")
    public static class10 field5461;

    @OriginalMember(owner = "client!ks", name = "i", descriptor = "Lxa;")
    public static class511 field5455;

    @OriginalMember(owner = "client!ks", name = "r", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field5464;

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "(I)J")
    public final long method2426(int arg0) {
        if (arg0 != -19672) {
            method2430((byte) -10);
        }
        field5448++;
        return this.field5463 == 0 ? this.field5464.getAddress() : 0L;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)I")
    public int method648(boolean arg0) {
        if (!arg0) {
            this.method2428((byte) -54);
        }
        field5466++;
        return this.field5459;
    }

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "(I)V")
    private final void method2427(int arg0) {
        int var2 = 121 % ((-arg0 - 45) / 49);
        field5457++;
        if (this.field5463 >= 0) {
            return;
        }
        if (this.field5454.field427) {
            OpenGL.glGenBuffersARB(1, class243.field3264, 0);
            this.field5463 = class243.field3264[0];
            OpenGL.glBindBufferARB(this.field5449, this.field5463);
        } else {
            this.field5463 = 0;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V")
    public final void method2428(byte arg0) {
        if (this.field5454.field427) {
            OpenGL.glBindBufferARB(this.field5449, this.field5463);
        }
        if (arg0 > 17) {
            field5452++;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V")
    public void method645(int arg0) {
        int var2 = -53 % ((37 - arg0) / 36);
        if (this.field5463 > 0) {
            this.field5454.method175(this.field5463, this.field5459, -127);
            this.field5463 = -1;
        }
        field5447++;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IB)V")
    public void method2429(int arg0, byte arg1) {
        if (arg0 > this.field5456) {
            this.method2427(50);
            if (this.field5463 <= 0) {
                this.field5464 = this.field5454.method3098(arg0, false, (byte) -116);
            } else {
                OpenGL.glBindBufferARB(this.field5449, this.field5463);
                OpenGL.glBufferDataARBub(this.field5449, arg0, null, 0, this.field5462 ? 35040 : 35044);
                this.field5454.field7668 += arg0 - this.field5456;
            }
            this.field5456 = arg0;
        }
        field5467++;
        this.field5459 = arg0;
        if (arg1 > -29) {
            method2431(false, -17, null, 105);
        }
    }

    @OriginalMember(owner = "client!ks", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method645(-42);
        field5460++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)Z")
    public boolean method646(int arg0) {
        field5453++;
        if (arg0 >= -100) {
            field5461 = null;
        }
        boolean var2 = true;
        if (this.field5458 != 0) {
            if (this.field5463 > 0) {
                OpenGL.glBindBufferARB(this.field5449, this.field5463);
                if (this.field5458 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field5449, 0, this.field5456, this.field5454.field7570.getAddress());
                } else {
                    var2 = this.field5454.field420.method127();
                }
            }
            this.field5458 = 0;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(B)V")
    public static void method2430(byte arg0) {
        field5455 = null;
        if (arg0 == -2) {
            field5461 = null;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;")
    public Buffer method647(boolean arg0, boolean arg1) {
        if (arg0) {
            this.field5462 = false;
        }
        field5451++;
        if (this.field5458 == 0) {
            this.method2427(-108);
            if (this.field5463 <= 0) {
                this.field5458 = 2;
                return this.field5464;
            }
            OpenGL.glBindBufferARB(this.field5449, this.field5463);
            if (arg1) {
                OpenGL.glBufferDataARBub(this.field5449, this.field5456, null, 0, this.field5462 ? 35040 : 35044);
                if (this.field5459 <= this.field5454.field7570.field4371) {
                    this.field5458 = 1;
                    return this.field5454.field7570;
                }
            }
            MapBuffer var3 = this.field5454.field420;
            if (!var3.method126() && var3.method128(this.field5449, this.field5459, 35001)) {
                this.field5458 = 2;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZI[BI)[B")
    public static final byte[] method2431(boolean arg0, int arg1, byte[] arg2, int arg3) {
        field5465++;
        byte[] var4;
        if (arg3 <= 0) {
            var4 = arg2;
        } else {
            var4 = new byte[arg1];
            for (int var5 = 0; var5 < arg1; var5++) {
                var4[var5] = arg2[arg3 + var5];
            }
        }
        class369 var6 = new class369();
        var6.method2125(8);
        var6.method2124((long) (arg1 * 8), var4, (byte) 42);
        byte[] var7 = new byte[64];
        if (arg0) {
            var6.method2126(0, (byte) 61, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILjaclib/memory/Source;Z)Z")
    public final boolean method2432(int arg0, Source arg1, boolean arg2) {
        if (!arg2) {
            this.method2432(34, null, false);
        }
        field5450++;
        if (arg0 <= this.field5456) {
            if (this.field5463 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field5449, this.field5463);
            OpenGL.glBufferSubDataARBa(this.field5449, 0, this.field5459, arg1.getAddress());
            this.field5454.field7668 += arg0 - this.field5459;
        } else {
            this.method2427(-118);
            if (this.field5463 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field5449, this.field5463);
            OpenGL.glBufferDataARBa(this.field5449, arg0, arg1.getAddress(), this.field5462 ? 35040 : 35044);
            this.field5454.field7668 += arg0 - this.field5459;
            this.field5456 = arg0;
        }
        this.field5459 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lia;IZ)V")
    public class422(class27 arg0, int arg1, boolean arg2) {
        this.field5449 = arg1;
        this.field5454 = arg0;
        this.field5462 = arg2;
    }
}
