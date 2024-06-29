import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public abstract class class439 implements class499 {

    @OriginalMember(owner = "client!cn", name = "y", descriptor = "I")
    private int field6249 = -1;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
    private int field6241 = 0;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    private int field6225;

    @OriginalMember(owner = "client!cn", name = "w", descriptor = "Z")
    private boolean field6247;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "Lpi;")
    private class424 field6237;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "Lcba;")
    public static class471 field6239 = new class471(111, 8);

    @OriginalMember(owner = "client!cn", name = "u", descriptor = "[J")
    public static long[] field6245 = new long[256];

    @OriginalMember(owner = "client!cn", name = "z", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field6226;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public static int field6228;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    private int field6231;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
    public static int field6233;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
    public static int field6235;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
    private int field6238;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!cn", name = "r", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!cn", name = "v", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!cn", name = "x", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!cn", name = "A", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!cn", name = "t", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field6244;

    @OriginalMember(owner = "client!cn", name = "s", descriptor = "[I")
    public static int[] field6243;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method2588(byte arg0, String arg1) {
        if (arg0 != 52) {
            method2591(-62);
        }
        field6228++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 <= '\u007F') {
                var3++;
            } else if (var5 <= '߿') {
                var3 += 2;
            } else {
                var3 += 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)V")
    public void method1477(int arg0, int arg1) {
        if (this.field6238 < arg1) {
            this.method2593(arg0 ^ 0x49A6);
            if (this.field6249 <= 0) {
                this.field6244 = this.field6237.method2293(arg1, arg0 + 18730, false);
            } else {
                OpenGL.glBindBufferARB(this.field6225, this.field6249);
                OpenGL.glBufferDataARBub(this.field6225, arg1, null, 0, this.field6247 ? 35040 : 35044);
                this.field6237.field5379 += arg1 - this.field6238;
            }
            this.field6238 = arg1;
        }
        field6236++;
        if (arg0 != -18855) {
            this.method620(11);
        }
        this.field6231 = arg1;
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(I)V")
    public final void method2589(int arg0) {
        if (arg0 <= 38) {
            this.method620(11);
        }
        if (this.field6237.field6020) {
            OpenGL.glBindBufferARB(this.field6225, this.field6249);
        }
        field6229++;
    }

    @OriginalMember(owner = "client!cn", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method618((byte) 59);
        field6226++;
        super.finalize();
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
    public void method618(byte arg0) {
        if (this.field6249 > 0) {
            this.field6237.method2525(this.field6231, this.field6249, 16384);
            this.field6249 = -1;
        }
        if (arg0 >= 11) {
            field6232++;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)I")
    public int method620(int arg0) {
        field6240++;
        if (arg0 >= -120) {
            this.field6238 = 52;
        }
        return this.field6231;
    }

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "(I)V")
    public static void method2590(int arg0) {
        field6239 = null;
        field6245 = null;
        field6243 = null;
        if (arg0 != 0) {
            field6235 = -91;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    public Buffer method613(boolean arg0, int arg1) {
        if (arg1 != -25838) {
            return null;
        }
        field6227++;
        if (this.field6241 == 0) {
            this.method2593(-1);
            if (this.field6249 <= 0) {
                this.field6241 = 2;
                return this.field6244;
            }
            OpenGL.glBindBufferARB(this.field6225, this.field6249);
            if (arg0) {
                OpenGL.glBufferDataARBub(this.field6225, this.field6238, null, 0, this.field6247 ? 35040 : 35044);
                if (this.field6237.field5339.field7937 >= this.field6231) {
                    this.field6241 = 1;
                    return this.field6237.field5339;
                }
            }
            MapBuffer var3 = this.field6237.field6016;
            if (!var3.method3075() && var3.method3074(this.field6225, this.field6231, 35001)) {
                this.field6241 = 2;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "(I)V")
    public static final void method2591(int arg0) {
        field6230++;
        int var1 = -120 / ((-arg0 - 71) / 55);
        class634.field9270 = 0;
        class118.field1943 = -1;
        class145.field2248 = -1;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(B)Z")
    public boolean method616(byte arg0) {
        if (arg0 >= -65) {
            return false;
        }
        field6246++;
        boolean var2 = true;
        if (this.field6241 != 0) {
            if (this.field6249 > 0) {
                OpenGL.glBindBufferARB(this.field6225, this.field6249);
                if (this.field6241 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field6225, 0, this.field6238, this.field6237.field5339.getAddress());
                } else {
                    var2 = this.field6237.field6016.method3076();
                }
            }
            this.field6241 = 0;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILjaclib/memory/Source;B)Z")
    public final boolean method2592(int arg0, Source arg1, byte arg2) {
        field6233++;
        if (arg0 > this.field6238) {
            this.method2593(-1);
            if (this.field6249 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field6225, this.field6249);
            OpenGL.glBufferDataARBa(this.field6225, arg0, arg1.getAddress(), this.field6247 ? 35040 : 35044);
            this.field6237.field5379 += arg0 - this.field6231;
            this.field6238 = arg0;
        } else if (this.field6249 > 0) {
            OpenGL.glBindBufferARB(this.field6225, this.field6249);
            OpenGL.glBufferSubDataARBa(this.field6225, 0, this.field6231, arg1.getAddress());
            this.field6237.field5379 += arg0 - this.field6231;
        } else {
            throw new RuntimeException("ARGH!");
        }
        if (arg2 != 69) {
            field6239 = null;
        }
        this.field6231 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "(I)V")
    private final void method2593(int arg0) {
        field6248++;
        if (~this.field6249 <= arg0) {
            return;
        }
        if (this.field6237.field6020) {
            OpenGL.glGenBuffersARB(1, class187.field2624, 0);
            this.field6249 = class187.field2624[0];
            OpenGL.glBindBufferARB(this.field6225, this.field6249);
        } else {
            this.field6249 = 0;
        }
    }

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "(I)J")
    public final long method2594(int arg0) {
        if (arg0 != 0) {
            this.method616((byte) -62);
        }
        field6242++;
        return this.field6249 == 0 ? this.field6244.getAddress() : 0L;
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lpi;IZ)V")
    public class439(class424 arg0, int arg1, boolean arg2) {
        this.field6225 = arg1;
        this.field6247 = arg2;
        this.field6237 = arg0;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Ldaa;B)V")
    public static final void method2595(class11 arg0, byte arg1) {
        int var2 = 0;
        if (arg1 != -6) {
            return;
        }
        while (var2 < class602.field8671) {
            int var3 = arg0.method112(-8838);
            int var4 = arg0.method93((byte) 97);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class239.field3332[var3] != null) {
                class239.field3332[var3].field4363 = var4;
            }
            var2++;
        }
        field6234++;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field6245[var0] = var1;
        }
        field6250 = 0;
    }
}
