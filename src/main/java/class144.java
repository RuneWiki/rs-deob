import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class144 extends class177 {

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "I")
    private int field2386 = 0;

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "I")
    private int field2387 = -1;

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "I")
    private int field2383;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "[I")
    public static int[] field2380 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "I")
    public static int field2382 = 1;

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!wb", name = "X", descriptor = "Lek;")
    public static class172 field2388;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(IIII)Z", line = 15)
    public static final boolean method904(int arg0, int arg1, int arg2, int arg3) {
        if (!class196.method1262(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class65.field890[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class231.field3926) {
                    if (!class46.method267(var4, var6, var5)) {
                        return false;
                    }
                    if (!class46.method267(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class46.method267(var4, var7, var5)) {
                        return false;
                    }
                    if (!class46.method267(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class46.method267(var4, var8, var5)) {
                    return false;
                }
                if (!class46.method267(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class160.field2635) {
                    if (!class46.method267(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class46.method267(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class46.method267(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class46.method267(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class46.method267(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class46.method267(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class231.field3926) {
                    if (!class46.method267(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class46.method267(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class46.method267(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class46.method267(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class46.method267(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class46.method267(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class160.field2635) {
                    if (!class46.method267(var4, var6, var5)) {
                        return false;
                    }
                    if (!class46.method267(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class46.method267(var4, var7, var5)) {
                        return false;
                    }
                    if (!class46.method267(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class46.method267(var4, var8, var5)) {
                    return false;
                }
                if (!class46.method267(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class46.method267(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class46.method267(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class46.method267(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class46.method267(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class46.method267(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V", line = 210)
    public static void method905(boolean arg0) {
        if (arg0) {
            field2388 = (class172) null;
        }
        field2380 = null;
        field2388 = null;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(B)V", line = 224)
    public final void method906(byte arg0) {
        field2381++;
        if (arg0 != 58) {
            this.field2387 = 11;
        }
        int var2 = class232.method1564(4);
        if ((var2 & 0x1) == 0) {
            class167.method1033(this.field2387);
        }
        if ((var2 & 0x2) == 0) {
            class167.method1047(0);
        }
        if ((var2 & 0x4) == 0) {
            class167.method1055(0);
        }
    }

    @OriginalMember(owner = "client!wb", name = "finalize", descriptor = "()V", line = 253)
    protected final void finalize() throws Throwable {
        if (this.field2387 != -1) {
            class101.method672(this.field2387, this.field2386, this.field2383);
            this.field2386 = 0;
            this.field2387 = -1;
        }
        field2385++;
        super.finalize();
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(I)V", line = 275)
    public class144(int arg0) {
        GL var2 = class167.field2806;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field2387 = var3[0];
        this.field2383 = class101.field1723;
        class167.method1033(this.field2387);
        int var4 = class139.field2317[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class101.field1720 += var6.limit() - this.field2386;
        this.field2386 = var6.limit();
    }
}
