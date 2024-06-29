import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public abstract class class147 implements class225 {

    @OriginalMember(owner = "client!tba", name = "f", descriptor = "I")
    private int field2145 = 0;

    @OriginalMember(owner = "client!tba", name = "u", descriptor = "I")
    private int field2160 = -1;

    @OriginalMember(owner = "client!tba", name = "o", descriptor = "Z")
    private boolean field2154;

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "Lhp;")
    public class296 field2141;

    @OriginalMember(owner = "client!tba", name = "i", descriptor = "I")
    private int field2148;

    @OriginalMember(owner = "client!tba", name = "t", descriptor = "I")
    public static int field2159 = 0;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!tba", name = "g", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!tba", name = "h", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!tba", name = "j", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!tba", name = "k", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!tba", name = "l", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!tba", name = "m", descriptor = "I")
    private int field2152;

    @OriginalMember(owner = "client!tba", name = "n", descriptor = "I")
    private int field2153;

    @OriginalMember(owner = "client!tba", name = "p", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!tba", name = "q", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!tba", name = "s", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!tba", name = "v", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!tba", name = "w", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!tba", name = "r", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field2157;

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(III)Z", line = 4)
    public static final boolean method1047(int arg0, int arg1, int arg2) {
        field2150++;
        if (arg2 != 0) {
            method1056((byte) -127, null);
        }
        return (arg0 & 0x70000) != 0 | class332.method2094(arg1, (byte) -116, arg0) || class182.method1225(arg1, 118, arg0);
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(B)I", line = 18)
    public int method4(byte arg0) {
        field2151++;
        if (arg0 != 1) {
            this.method1048(-70, false, null);
        }
        return this.field2152;
    }

    @OriginalMember(owner = "client!tba", name = "finalize", descriptor = "()V", line = 32)
    protected final void finalize() throws Throwable {
        field2143++;
        this.method7(-103);
        super.finalize();
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(II)V", line = 41)
    public void method1(int arg0, int arg1) {
        int var3 = -60 % ((arg0 - 72) / 43);
        field2158++;
        if (this.field2153 < arg1) {
            this.method1053(0);
            if (this.field2160 > 0) {
                OpenGL.glBindBufferARB(this.field2148, this.field2160);
                OpenGL.glBufferDataARBub(this.field2148, arg1, null, 0, this.field2154 ? 35040 : 35044);
                this.field2141.field5627 += arg1 - this.field2153;
            } else {
                this.field2157 = this.field2141.method2333(arg1, (byte) 61, false);
            }
            this.field2153 = arg1;
        }
        this.field2152 = arg1;
    }

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Lhp;IZ)V", line = 395)
    public class147(class296 arg0, int arg1, boolean arg2) {
        this.field2154 = arg2;
        this.field2141 = arg0;
        this.field2148 = arg1;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(IZLjaggl/MapBuffer;)Ljaclib/memory/Buffer;", line = 73)
    public final Buffer method1048(int arg0, boolean arg1, MapBuffer arg2) {
        field2142++;
        if (arg0 < 102) {
            return null;
        }
        if (this.field2145 == 0) {
            this.method1053(0);
            if (this.field2160 <= 0) {
                this.field2145 = 2;
                return this.field2157;
            }
            OpenGL.glBindBufferARB(this.field2148, this.field2160);
            if (arg1) {
                OpenGL.glBufferDataARBub(this.field2148, this.field2153, null, 0, this.field2154 ? 35040 : 35044);
                if (this.field2152 <= this.field2141.field5516.field8751) {
                    this.field2145 = 1;
                    return this.field2141.field5516;
                }
            }
            if (!arg2.method3280() && arg2.method3282(this.field2148, this.field2152, 35001)) {
                this.field2145 = 2;
                return arg2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "(I)V", line = 128)
    public final void method1049(int arg0) {
        if (this.field2141.field4444) {
            OpenGL.glBindBufferARB(this.field2148, this.field2160);
        }
        if (arg0 <= 25) {
            field2159 = 90;
        }
        field2156++;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Ljaggl/MapBuffer;I)Z", line = 141)
    public final boolean method1050(MapBuffer arg0, int arg1) {
        field2149++;
        boolean var3 = true;
        if (arg1 != 1) {
            this.method1053(47);
        }
        if (this.field2145 != 0) {
            if (this.field2160 > 0) {
                OpenGL.glBindBufferARB(this.field2148, this.field2160);
                if (this.field2145 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field2148, 0, this.field2153, this.field2141.field5516.getAddress());
                } else {
                    var3 = arg0.method3281();
                }
            }
            this.field2145 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lft;I)[Lwl;", line = 174)
    public static final class373[] method1051(class4 arg0, int arg1) {
        field2155++;
        if (!arg0.method24((byte) -98)) {
            return new class373[0];
        }
        class494 var2 = arg0.method29((byte) -62);
        while (var2.field7024 == 0) {
            class561.method3202(10L, (byte) -104);
        }
        if (var2.field7024 == 2) {
            return new class373[0];
        }
        int[] var3 = (int[]) var2.field7019;
        class373[] var4 = new class373[var3.length >> 2];
        int var5 = 113 % ((-arg1 - 27) / 58);
        for (int var6 = 0; var6 < var4.length; var6++) {
            class373 var7 = new class373();
            var4[var6] = var7;
            var7.field5319 = var3[var6 << 2];
            var7.field5318 = var3[(var6 << 2) + 1];
            var7.field5320 = var3[(var6 << 2) + 2];
            var7.field5315 = var3[(var6 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "(I)J", line = 216)
    public final long method1052(int arg0) {
        field2162++;
        if (arg0 == -1) {
            return this.field2160 == 0 ? this.field2157.getAddress() : 0L;
        } else {
            return -6L;
        }
    }

    @OriginalMember(owner = "client!tba", name = "f", descriptor = "(I)V", line = 233)
    private final void method1053(int arg0) {
        field2146++;
        if (arg0 != 0 || this.field2160 >= 0) {
            return;
        }
        if (this.field2141.field4444) {
            OpenGL.glGenBuffersARB(1, class416.field6032, 0);
            this.field2160 = class416.field6032[0];
            OpenGL.glBindBufferARB(this.field2148, this.field2160);
        } else {
            this.field2160 = 0;
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(ZIIIIIII)V", line = 259)
    public static final void method1054(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2147++;
        int var8 = class537.method3051(-10168, arg4, class239.field3747, class520.field7329);
        if (arg0) {
            return;
        }
        int var9 = class537.method3051(-10168, arg6, class239.field3747, class520.field7329);
        int var10 = class537.method3051(-10168, arg2, class248.field3859, class15.field153);
        int var11 = class537.method3051(-10168, arg1, class248.field3859, class15.field153);
        int var12 = class537.method3051(-10168, arg4 + arg7, class239.field3747, class520.field7329);
        int var13 = class537.method3051(-10168, arg6 - arg7, class239.field3747, class520.field7329);
        for (int var14 = var8; var14 < var12; var14++) {
            class58.method623(arg5, var11, 23309, class651.field9125[var14], var10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class58.method623(arg5, var11, 23309, class651.field9125[var15], var10);
        }
        int var16 = class537.method3051(-10168, arg2 + arg7, class248.field3859, class15.field153);
        int var17 = class537.method3051(-10168, arg1 - arg7, class248.field3859, class15.field153);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class651.field9125[var18];
            class58.method623(arg5, var16, 23309, var19, var10);
            class58.method623(arg3, var17, 23309, var19, var16);
            class58.method623(arg5, var11, 23309, var19, var17);
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V", line = 312)
    public void method7(int arg0) {
        if (arg0 >= -98) {
            this.field2160 = -121;
        }
        if (this.field2160 > 0) {
            this.field2141.method1905(this.field2160, this.field2152, false);
            this.field2160 = -1;
        }
        field2161++;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(ZILjaclib/memory/Source;)Z", line = 328)
    public final boolean method1055(boolean arg0, int arg1, Source arg2) {
        field2140++;
        if (!arg0) {
            return true;
        }
        if (arg1 <= this.field2153) {
            if (this.field2160 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field2148, this.field2160);
            OpenGL.glBufferSubDataARBa(this.field2148, 0, this.field2152, arg2.getAddress());
            this.field2141.field5627 += arg1 - this.field2152;
        } else {
            this.method1053(0);
            if (this.field2160 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field2148, this.field2160);
            OpenGL.glBufferDataARBa(this.field2148, arg1, arg2.getAddress(), this.field2154 ? 35040 : 35044);
            this.field2141.field5627 += arg1 - this.field2152;
            this.field2153 = arg1;
        }
        this.field2152 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(BLmw;)Lfv;", line = 369)
    public static final class106 method1056(byte arg0, class454 arg1) {
        field2144++;
        class106 var2;
        if (class316.field4681 == null) {
            var2 = new class106();
        } else {
            var2 = class316.field4681;
            class316.field4681 = class316.field4681.field1641;
            class500.field7086--;
            var2.field1641 = null;
        }
        var2.field1638 = arg1;
        if (arg0 > -118) {
            field2159 = 53;
        }
        return var2;
    }
}
