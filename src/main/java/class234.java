import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public abstract class class234 implements class534 {

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    private int field3044 = -1;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
    private int field3052 = 0;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "Lmc;")
    private class381 field3047;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    private int field3039;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "Z")
    private boolean field3036;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "Lrh;")
    public static class59 field3049 = new class59();

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "[S")
    public static short[] field3054 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    private int field3042;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    private int field3043;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field3041;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)V")
    public void method1446(int arg0, int arg1) {
        if (this.field3043 < arg0) {
            this.method1447((byte) -67);
            if (this.field3044 > 0) {
                OpenGL.glBindBufferARB(this.field3039, this.field3044);
                OpenGL.glBufferDataARBub(this.field3039, arg0, null, 0, this.field3036 ? 35040 : 35044);
                this.field3047.field4373 += arg0 - this.field3043;
            } else {
                this.field3041 = this.field3047.method1923(false, arg0, 1);
            }
            this.field3043 = arg0;
        }
        if (arg1 != 30419) {
            this.method1446(-1, -96);
        }
        field3046++;
        this.field3042 = arg0;
    }

    @OriginalMember(owner = "client!qk", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field3045++;
        this.method1022((byte) 33);
        super.finalize();
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(B)V")
    private final void method1447(byte arg0) {
        field3048++;
        if (this.field3044 >= 0) {
            return;
        }
        if (arg0 >= -60) {
            this.field3039 = 29;
        }
        if (this.field3047.field5545) {
            OpenGL.glGenBuffersARB(1, class292.field3900, 0);
            this.field3044 = class292.field3900[0];
            OpenGL.glBindBufferARB(this.field3039, this.field3044);
        } else {
            this.field3044 = 0;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILjaclib/memory/Source;B)Z")
    public final boolean method1448(int arg0, Source arg1, byte arg2) {
        field3038++;
        if (arg2 >= -79) {
            this.method1024((byte) 98);
        }
        if (this.field3043 < arg0) {
            this.method1447((byte) -120);
            if (this.field3044 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field3039, this.field3044);
            OpenGL.glBufferDataARBa(this.field3039, arg0, arg1.getAddress(), this.field3036 ? 35040 : 35044);
            this.field3047.field4373 += arg0 - this.field3042;
            this.field3043 = arg0;
        } else if (this.field3044 > 0) {
            OpenGL.glBindBufferARB(this.field3039, this.field3044);
            OpenGL.glBufferSubDataARBa(this.field3039, 0, this.field3042, arg1.getAddress());
            this.field3047.field4373 += arg0 - this.field3042;
        } else {
            throw new RuntimeException("ARGH!");
        }
        this.field3042 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)Z")
    public boolean method1021(boolean arg0) {
        field3050++;
        boolean var2 = arg0;
        if (this.field3052 != 0) {
            if (this.field3044 > 0) {
                OpenGL.glBindBufferARB(this.field3039, this.field3044);
                if (this.field3052 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field3039, 0, this.field3043, this.field3047.field4324.getAddress());
                } else {
                    var2 = this.field3047.field5543.method3345();
                }
            }
            this.field3052 = 0;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
    public static void method1449(int arg0) {
        if (arg0 <= 74) {
            method1450(false, null);
        }
        field3054 = null;
        field3049 = null;
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(B)I")
    public int method1024(byte arg0) {
        if (arg0 != 54) {
            this.method1446(17, -48);
        }
        field3053++;
        return this.field3042;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZLoa;)V")
    public static final void method1450(boolean arg0, class689 arg1) {
        field3034++;
        class422.field5874 = new class427[class376.field5407.length];
        for (int var2 = 0; var2 < class376.field5407.length; var2++) {
            int var3 = class376.field5407[var2];
            class598 var4 = class261.method1631(var3, class482.field6486, (byte) 46);
            class301 var5 = arg1.method2020(var4, class366.method2242(class284.field3836, var3), true);
            class422.field5874[var2] = new class427(var5, var4);
        }
        if (arg0) {
            field3054 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
    public final void method1451(int arg0) {
        if (arg0 > -114) {
            this.field3036 = true;
        }
        if (this.field3047.field5545) {
            OpenGL.glBindBufferARB(this.field3039, this.field3044);
        }
        field3037++;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V")
    public void method1022(byte arg0) {
        if (arg0 != 33) {
            return;
        }
        if (this.field3044 > 0) {
            this.field3047.method2306(this.field3044, (byte) -127, this.field3042);
            this.field3044 = -1;
        }
        field3035++;
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)J")
    public final long method1452(int arg0) {
        field3051++;
        if (arg0 != 18456) {
            this.method1022((byte) -9);
        }
        return this.field3044 == 0 ? this.field3041.getAddress() : 0L;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    public Buffer method1025(boolean arg0, byte arg1) {
        field3040++;
        if (this.field3052 == 0) {
            this.method1447((byte) -101);
            if (this.field3044 <= 0) {
                this.field3052 = 2;
                return this.field3041;
            }
            OpenGL.glBindBufferARB(this.field3039, this.field3044);
            if (arg0) {
                OpenGL.glBufferDataARBub(this.field3039, this.field3043, null, 0, this.field3036 ? 35040 : 35044);
                if (this.field3047.field4324.field3328 >= this.field3042) {
                    this.field3052 = 1;
                    return this.field3047.field4324;
                }
            }
            MapBuffer var3 = this.field3047.field5543;
            if (!var3.method3344() && var3.method3346(this.field3039, this.field3042, 35001)) {
                this.field3052 = 2;
                return var3;
            }
        }
        if (arg1 != 67) {
            this.method1446(-37, -39);
        }
        return null;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lmc;IZ)V")
    public class234(class381 arg0, int arg1, boolean arg2) {
        this.field3047 = arg0;
        this.field3039 = arg1;
        this.field3036 = arg2;
    }
}
