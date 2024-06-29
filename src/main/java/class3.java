import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public abstract class class3 implements class175 {

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    private int field26 = 0;

    @OriginalMember(owner = "client!dp", name = "t", descriptor = "I")
    private int field39 = -1;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "Z")
    private boolean field19;

    @OriginalMember(owner = "client!dp", name = "s", descriptor = "I")
    private int field29;

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "Lrda;")
    public class690 field24;

    @OriginalMember(owner = "client!dp", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field40 = new String[] { method27(method26("\u0016Y\u0013WK")), method27(method26("\u001c\\Qh")), method27(method26("\t\u0007\u0013*\u001e")), method27(method26("\u0016Y\u0013KK")), method27(method26("\u0016Y\u0013b\n\u001cHQm\u0019\u0017\u0001")), method27(method26("\u0016Y\u0013TK")), method27(method26("\u0016Y\u0013RK")), method27(method26("\u0016Y\u0013VK")), method27(method26("3{zLB")), method27(method26("\u0016Y\u0013EK")), method27(method26("\u0016Y\u00138\n\u001c@I:K")), method27(method26("\u0016Y\u0013UK")), method27(method26("\u0016Y\u0013QK")), method27(method26("\u0016Y\u0013PK")), method27(method26("\u0016Y\u0013CK")), method27(method26("\u0016Y\u0013IK")) };

    @OriginalMember(owner = "client!dp", name = "x", descriptor = "Lkia;")
    public static class646 field17 = new class646(method27(method26(">f~E/")), "", method27(method26("\u001eF^e\u000f")), 4);

    @OriginalMember(owner = "client!dp", name = "r", descriptor = "I")
    public static int field34 = 0;

    @OriginalMember(owner = "client!dp", name = "p", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!dp", name = "o", descriptor = "I")
    private int field20;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!dp", name = "m", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!dp", name = "u", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!dp", name = "q", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!dp", name = "l", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!dp", name = "w", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!dp", name = "v", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
    private int field38;

    @OriginalMember(owner = "client!dp", name = "n", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field23;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)J", line = 4)
    public final long method15(byte arg0) {
        try {
            if (arg0 >= -98) {
                this.method15((byte) 62);
            }
            field30++;
            return this.field39 == 0 ? this.field23.getAddress() : 0L;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field40[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "(I)V", line = 15)
    private final void method16(int arg0) {
        try {
            field35++;
            if (arg0 < ~this.field39) {
                if (this.field24.field10110) {
                    OpenGL.glGenBuffersARB(1, class235.field3551, 0);
                    this.field39 = class235.field3551[0];
                    OpenGL.glBindBufferARB(this.field29, this.field39);
                } else {
                    this.field39 = 0;
                }
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field40[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(BZLjaggl/MapBuffer;)Ljaclib/memory/Buffer;", line = 47)
    public final Buffer method17(byte arg0, boolean arg1, MapBuffer arg2) {
        try {
            field27++;
            if (arg0 != 51) {
                this.field20 = -46;
            }
            if (this.field26 == 0) {
                this.method16(-1);
                if (this.field39 <= 0) {
                    this.field26 = 2;
                    return this.field23;
                }
                OpenGL.glBindBufferARB(this.field29, this.field39);
                if (arg1) {
                    OpenGL.glBufferDataARBub(this.field29, this.field20, null, 0, this.field19 ? 35040 : 35044);
                    if (this.field24.field4374.field10179 >= this.field38) {
                        this.field26 = 1;
                        return this.field24.field4374;
                    }
                }
                if (!arg2.method4779() && arg2.method4781(this.field29, this.field38, 35001)) {
                    this.field26 = 2;
                    return arg2;
                }
            }
            return null;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field40[0] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field40[1] : field40[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ljaggl/MapBuffer;B)Z", line = 94)
    public final boolean method18(MapBuffer arg0, byte arg1) {
        try {
            field33++;
            boolean var3 = true;
            if (arg1 <= 53) {
                this.method19(0, true, null);
            }
            if (this.field26 != 0) {
                if (this.field39 > 0) {
                    OpenGL.glBindBufferARB(this.field29, this.field39);
                    if (this.field26 == 1) {
                        OpenGL.glBufferSubDataARBa(this.field29, 0, this.field20, this.field24.field4374.getAddress());
                    } else {
                        var3 = arg0.method4780();
                    }
                }
                this.field26 = 0;
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field40[13] + (arg0 == null ? field40[1] : field40[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IZLjaclib/memory/Source;)Z", line = 126)
    public final boolean method19(int arg0, boolean arg1, Source arg2) {
        try {
            field21++;
            if (!arg1) {
                this.method20(true);
            }
            if (this.field20 < arg0) {
                this.method16(-1);
                if (this.field39 <= 0) {
                    throw new RuntimeException(field40[8]);
                }
                OpenGL.glBindBufferARB(this.field29, this.field39);
                OpenGL.glBufferDataARBa(this.field29, arg0, arg2.getAddress(), this.field19 ? 35040 : 35044);
                this.field24.field4543 += arg0 - this.field38;
                this.field20 = arg0;
            } else if (this.field39 > 0) {
                OpenGL.glBindBufferARB(this.field29, this.field39);
                OpenGL.glBufferSubDataARBa(this.field29, 0, this.field38, arg2.getAddress());
                this.field24.field4543 += arg0 - this.field38;
            } else {
                throw new RuntimeException(field40[8]);
            }
            this.field38 = arg0;
            return true;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field40[7] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field40[1] : field40[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Z)V", line = 167)
    public void method20(boolean arg0) {
        try {
            if (this.field39 > 0) {
                this.field24.method5056(this.field39, this.field38, -1);
                this.field39 = -1;
            }
            field36++;
            if (!arg0) {
                field28 = -57;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field40[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "(I)V", line = 184)
    public final void method21(int arg0) {
        try {
            if (this.field24.field10110) {
                OpenGL.glBindBufferARB(this.field29, this.field39);
            }
            field16++;
            if (arg0 != 35040) {
                this.method25(-100);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field40[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(II[IILffa;[I)Ltc;", line = 198)
    public static final class370 method22(int arg0, int arg1, int[] arg2, int arg3, class197 arg4, int[] arg5) {
        try {
            field32++;
            byte[] var6 = new byte[arg1 * arg3];
            for (int var7 = arg0; var7 < arg1; var7++) {
                int var8 = arg3 * var7 + arg2[var7];
                for (int var9 = 0; var9 < arg5[var7]; var9++) {
                    var6[var8++] = -1;
                }
            }
            return new class370(arg4, arg3, arg1, var6);
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field40[11] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field40[1] : field40[2]) + ',' + arg3 + ',' + (arg4 == null ? field40[1] : field40[2]) + ',' + (arg5 == null ? field40[1] : field40[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "(I)V", line = 239)
    public static void method23(int arg0) {
        try {
            if (arg0 != 1) {
                field31 = -85;
            }
            field17 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field40[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)V", line = 250)
    public void method24(int arg0, int arg1) {
        try {
            if (arg0 > this.field20) {
                this.method16(arg1 + 10748);
                if (this.field39 <= 0) {
                    this.field23 = this.field24.method2421(false, arg0, 81);
                } else {
                    OpenGL.glBindBufferARB(this.field29, this.field39);
                    OpenGL.glBufferDataARBub(this.field29, arg0, null, 0, this.field19 ? 35040 : 35044);
                    this.field24.field4543 += arg0 - this.field20;
                }
                this.field20 = arg0;
            }
            field18++;
            this.field38 = arg0;
            if (arg1 != -10749) {
                field28 = -125;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field40[15] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dp", name = "finalize", descriptor = "()V", line = 278)
    protected final void finalize() throws Throwable {
        try {
            field25++;
            this.method20(true);
            super.finalize();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field40[4] + ')');
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)I", line = 287)
    public int method25(int arg0) {
        try {
            field22++;
            if (arg0 != -12502) {
                this.method24(-88, 8);
            }
            return this.field38;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field40[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lrda;IZ)V", line = 308)
    public class3(class690 arg0, int arg1, boolean arg2) {
        try {
            this.field19 = arg2;
            this.field29 = arg1;
            this.field24 = arg0;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field40[10] + (arg0 == null ? field40[1] : field40[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method26(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x63);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method27(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 114;
                    break;
                case 1:
                    var10005 = 41;
                    break;
                case 2:
                    var10005 = 61;
                    break;
                case 3:
                    var10005 = 4;
                    break;
                default:
                    var10005 = 99;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
