import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class343 {

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "[Lmb;")
    public static class383[] field5072 = new class383[5];

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "I")
    private int field5075;

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "I")
    public int field5078;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)V")
    public static void method2123(boolean arg0) {
        if (arg0) {
            field5072 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BIII)Z")
    public final boolean method2124(byte arg0, int arg1, int arg2, int arg3) {
        field5070++;
        int var5 = this.field5075;
        if (this.field5078 == arg3 && this.field5075 == 0) {
            return false;
        }
        boolean var8;
        if (this.field5075 == 0) {
            if (this.field5078 < arg3 && this.field5078 + arg2 >= arg3 || arg3 < this.field5078 && (this.field5078 - arg2) <= arg3) {
                this.field5078 = arg3;
                return false;
            }
            var8 = true;
        } else if (this.field5075 > 0 && this.field5078 < arg3) {
            int var6 = this.field5075 * this.field5075 / (arg2 * 2);
            int var7 = this.field5078 + var6;
            if (arg3 > var7 && var7 >= this.field5078) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field5075 < 0 && this.field5078 > arg3) {
            int var9 = this.field5075 * this.field5075 / (arg2 * 2);
            int var10 = this.field5078 - var9;
            if (arg3 < var10 && var10 <= this.field5078) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (this.field5078 >= arg3) {
                this.field5075 -= arg2;
                if (arg1 != 0 && (-arg1) > this.field5075) {
                    this.field5075 = -arg1;
                }
            } else {
                this.field5075 += arg2;
                if (arg1 != 0 && this.field5075 > arg1) {
                    this.field5075 = arg1;
                }
            }
            if (this.field5075 != var5) {
                int var11 = this.field5075 * this.field5075 / (arg2 * 2);
                if (this.field5078 < arg3) {
                    if (this.field5078 + var11 > arg3) {
                        this.field5075 = var5;
                    }
                } else if (arg3 < this.field5078 && arg3 > (this.field5078 - var11)) {
                    this.field5075 = var5;
                }
            }
        } else if (this.field5075 <= 0) {
            this.field5075 += arg2;
            if (this.field5075 > 0) {
                this.field5075 = 0;
            }
        } else {
            this.field5075 -= arg2;
            if (this.field5075 < 0) {
                this.field5075 = 0;
            }
        }
        this.field5078 += this.field5075 + var5 >> 1;
        return arg0 >= -42 ? false : var8;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)V")
    public final void method2125(int arg0, int arg1) {
        this.field5078 = arg0;
        field5069++;
        if (arg1 != -17182) {
            this.field5075 = 19;
        }
        this.field5075 = 0;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
    public final void method2126(int arg0) {
        field5074++;
        this.field5078 &= arg0;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(III)Z")
    public static final boolean method2127(int arg0, int arg1, int arg2) {
        field5073++;
        if (arg1 <= 35) {
            return false;
        } else {
            return class144.method1000(true, arg0, arg2) | (arg0 & 0x70000) != 0 || class566.method3263(arg2, arg0, 127);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BLgk;)V")
    public static final void method2128(byte arg0, class540 arg1) {
        if (arg0 >= -100) {
            field5072 = null;
        }
        field5071++;
        byte[] var2 = new byte[24];
        if (class259.field3354 != null) {
            try {
                class259.field3354.method2139(0L, (byte) 8);
                class259.field3354.method2134(var2, (byte) 44);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method3149(0, var2, 24, -100);
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(Z)I")
    public final int method2129(boolean arg0) {
        field5077++;
        if (!arg0) {
            method2127(-16, -55, 61);
        }
        return this.field5078 & 0x3FFF;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "([SBI)[S")
    public static final short[] method2130(short[] arg0, byte arg1, int arg2) {
        field5076++;
        short[] var3 = new short[arg2];
        if (arg1 < 102) {
            method2127(-2, 14, -104);
        }
        class667.method3742(arg0, 0, var3, 0, arg2);
        return var3;
    }

    static {
        for (int var0 = 0; var0 < field5072.length; var0++) {
            field5072[var0] = new class383();
        }
        field5079 = 0;
    }
}
