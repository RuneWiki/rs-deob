import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public abstract class class391 implements class697 {

    @OriginalMember(owner = "client!rp", name = "l", descriptor = "I")
    private int field5692 = 0;

    @OriginalMember(owner = "client!rp", name = "k", descriptor = "I")
    private int field5698 = -1;

    @OriginalMember(owner = "client!rp", name = "y", descriptor = "I")
    private int field5705;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "Ldga;")
    public class713 field5711;

    @OriginalMember(owner = "client!rp", name = "u", descriptor = "Z")
    private boolean field5695;

    @OriginalMember(owner = "client!rp", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5716 = new String[] { method3065(method3064("\u001e\u001aK\u000bl")), method3065(method3064("\u0002\u001f\t3")), method3065(method3064("\u0017DKq9")), method3065(method3064("\u001e\u001aKc-\u0002\u0003\u0011al")), method3065(method3064("\u001e\u001aK\u000fl")), method3065(method3064("\u001e\u001aK\u0014l")), method3065(method3064("\u001e\u001aK\u0017l")), method3065(method3064("\u001e\u001aK\fl")), method3065(method3064("\u001e\u001aK9-\u0002\u000b\t6>\tB")), method3065(method3064("\u001e\u001aK\u0012l")), method3065(method3064("\u001e\u001aK\u000el")), method3065(method3064("-8\"\u0017e")), method3065(method3064("\u001e\u001aK\u0010l")), method3065(method3064("\u001e\u001aK\u0011l")), method3065(method3064("\u001e\u001aK\rl")), method3065(method3064("\u001e\u001aK\u0018l")) };

    @OriginalMember(owner = "client!rp", name = "p", descriptor = "Lui;")
    public static class251 field5710 = new class251(260);

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
    public static int field5712 = 0;

    @OriginalMember(owner = "client!rp", name = "j", descriptor = "I")
    public static int field5715 = 0;

    @OriginalMember(owner = "client!rp", name = "r", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
    private int field5693;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!rp", name = "n", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!rp", name = "s", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!rp", name = "o", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!rp", name = "q", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!rp", name = "x", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!rp", name = "t", descriptor = "I")
    private int field5708;

    @OriginalMember(owner = "client!rp", name = "v", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!rp", name = "m", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field5702;

    @OriginalMember(owner = "client!rp", name = "w", descriptor = "[Lrfa;")
    public static class202[] field5707;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "(Z)V", line = 3)
    public static void method3056(boolean arg0) {
        try {
            if (!arg0) {
                field5700 = -109;
            }
            field5707 = null;
            field5710 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5716[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Ldga;IZ)V", line = 297)
    public class391(class713 arg0, int arg1, boolean arg2) {
        try {
            this.field5705 = arg1;
            this.field5711 = arg0;
            this.field5695 = arg2;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5716[3] + (arg0 == null ? field5716[1] : field5716[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "(I)V", line = 34)
    private final void method3057(int arg0) {
        try {
            field5691++;
            if (~this.field5698 > arg0) {
                if (this.field5711.field10133) {
                    OpenGL.glGenBuffersARB(1, class3.field50, 0);
                    this.field5698 = class3.field50[0];
                    OpenGL.glBindBufferARB(this.field5705, this.field5698);
                } else {
                    this.field5698 = 0;
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5716[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILjaclib/memory/Source;B)Z", line = 57)
    public final boolean method3058(int arg0, Source arg1, byte arg2) {
        try {
            field5709++;
            if (arg0 > this.field5708) {
                this.method3057(-1);
                if (this.field5698 <= 0) {
                    throw new RuntimeException(field5716[11]);
                }
                OpenGL.glBindBufferARB(this.field5705, this.field5698);
                OpenGL.glBufferDataARBa(this.field5705, arg0, arg1.getAddress(), this.field5695 ? 35040 : 35044);
                this.field5711.field4712 += arg0 - this.field5693;
                this.field5708 = arg0;
            } else if (this.field5698 > 0) {
                OpenGL.glBindBufferARB(this.field5705, this.field5698);
                OpenGL.glBufferSubDataARBa(this.field5705, 0, this.field5693, arg1.getAddress());
                this.field5711.field4712 += arg0 - this.field5693;
            } else {
                throw new RuntimeException(field5716[11]);
            }
            if (arg2 != 39) {
                this.field5705 = 12;
            }
            this.field5693 = arg0;
            return true;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5716[10] + arg0 + ',' + (arg1 == null ? field5716[1] : field5716[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "(I)V", line = 98)
    public final void method3059(int arg0) {
        try {
            field5701++;
            if (this.field5711.field10133) {
                OpenGL.glBindBufferARB(this.field5705, this.field5698);
            }
            if (arg0 != 0) {
                method3060(15, null, (byte) -101);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5716[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rp", name = "finalize", descriptor = "()V", line = 112)
    protected final void finalize() throws Throwable {
        try {
            field5714++;
            this.method2342(true);
            super.finalize();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5716[8] + ')');
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I[FB)[F", line = 122)
    public static final float[] method3060(int arg0, float[] arg1, byte arg2) {
        try {
            field5694++;
            if (arg2 < 57) {
                field5710 = null;
            }
            float[] var3 = new float[arg0];
            class569.method4244(arg1, 0, var3, 0, arg0);
            return var3;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5716[13] + arg0 + ',' + (arg1 == null ? field5716[1] : field5716[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Z)V", line = 137)
    public void method2342(boolean arg0) {
        try {
            if (this.field5698 > 0) {
                this.field5711.method5162(34162, this.field5698, this.field5693);
                this.field5698 = -1;
            }
            if (!arg0) {
                this.method2344(56, -97);
            }
            field5696++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5716[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "(I)J", line = 154)
    public final long method3061(int arg0) {
        try {
            field5699++;
            if (arg0 == 0) {
                return this.field5698 == 0 ? this.field5702.getAddress() : 0L;
            } else {
                return -23L;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5716[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)V", line = 168)
    public void method2344(int arg0, int arg1) {
        try {
            if (this.field5708 < arg0) {
                this.method3057(-1);
                if (this.field5698 > 0) {
                    OpenGL.glBindBufferARB(this.field5705, this.field5698);
                    OpenGL.glBufferDataARBub(this.field5705, arg0, null, 0, this.field5695 ? 35040 : 35044);
                    this.field5711.field4712 += arg0 - this.field5708;
                } else {
                    this.field5702 = this.field5711.method2672(0, false, arg0);
                }
                this.field5708 = arg0;
            }
            if (arg1 <= 23) {
                field5712 = 53;
            }
            field5706++;
            this.field5693 = arg0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5716[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljaggl/MapBuffer;I)Z", line = 199)
    public final boolean method3062(MapBuffer arg0, int arg1) {
        try {
            field5704++;
            if (arg1 != -4014) {
                this.field5695 = false;
            }
            boolean var3 = true;
            if (this.field5692 != 0) {
                if (this.field5698 > 0) {
                    OpenGL.glBindBufferARB(this.field5705, this.field5698);
                    if (this.field5692 == 1) {
                        OpenGL.glBufferSubDataARBa(this.field5705, 0, this.field5708, this.field5711.field4524.getAddress());
                    } else {
                        var3 = arg0.method5236();
                    }
                }
                this.field5692 = 0;
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5716[7] + (arg0 == null ? field5716[1] : field5716[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)I", line = 234)
    public int method2346(int arg0) {
        try {
            if (arg0 != 34962) {
                method3060(19, null, (byte) 108);
            }
            field5703++;
            return this.field5693;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5716[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljaggl/MapBuffer;BZ)Ljaclib/memory/Buffer;", line = 251)
    public final Buffer method3063(MapBuffer arg0, byte arg1, boolean arg2) {
        try {
            int var4 = -4 / ((52 - arg1) / 37);
            field5697++;
            if (this.field5692 == 0) {
                this.method3057(-1);
                if (this.field5698 <= 0) {
                    this.field5692 = 2;
                    return this.field5702;
                }
                OpenGL.glBindBufferARB(this.field5705, this.field5698);
                if (arg2) {
                    OpenGL.glBufferDataARBub(this.field5705, this.field5708, null, 0, this.field5695 ? 35040 : 35044);
                    if (this.field5711.field4524.field5895 >= this.field5693) {
                        this.field5692 = 1;
                        return this.field5711.field4524;
                    }
                }
                if (!arg0.method5234() && arg0.method5235(this.field5705, this.field5693, 35001)) {
                    this.field5692 = 2;
                    return arg0;
                }
            }
            return null;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field5716[4] + (arg0 == null ? field5716[1] : field5716[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3064(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x44);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3065(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 108;
                    break;
                case 1:
                    var10005 = 106;
                    break;
                case 2:
                    var10005 = 101;
                    break;
                case 3:
                    var10005 = 95;
                    break;
                default:
                    var10005 = 68;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
