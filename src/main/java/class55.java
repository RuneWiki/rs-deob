import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class55 extends class196 {

    @OriginalMember(owner = "client!fn", name = "F", descriptor = "I")
    private int field692 = 0;

    @OriginalMember(owner = "client!fn", name = "I", descriptor = "I")
    private int field695 = -1;

    @OriginalMember(owner = "client!fn", name = "J", descriptor = "I")
    private int field696;

    @OriginalMember(owner = "client!fn", name = "C", descriptor = "I")
    public static int field689 = 0;

    @OriginalMember(owner = "client!fn", name = "B", descriptor = "I")
    public static int field688 = 0;

    @OriginalMember(owner = "client!fn", name = "H", descriptor = "I")
    public static int field694 = -1;

    @OriginalMember(owner = "client!fn", name = "x", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!fn", name = "y", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!fn", name = "A", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!fn", name = "E", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!fn", name = "G", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!fn", name = "K", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!fn", name = "D", descriptor = "[[[I")
    public static int[][][] field690;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIIIIIII)V", line = 9)
    public static final void method361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 == arg4 && arg5 == arg8 && arg1 == arg7 && arg0 == arg2) {
            class51.method344(arg4, arg7, (byte) -14, arg0, arg9, arg8);
        } else {
            int var10 = arg4;
            int var11 = arg8;
            int var12 = arg4 * 3;
            int var13 = arg8 * 3;
            int var14 = arg1 * 3;
            int var15 = arg3 * 3;
            int var16 = arg5 * 3;
            int var17 = arg7 + var15 - var14 - arg4;
            int var18 = arg2 * 3;
            int var19 = var14 + var12 - var15 - var15;
            int var20 = arg0 + var16 - var18 - arg8;
            int var21 = var18 - var16 - (var16 - var13);
            int var22 = var15 - var12;
            int var23 = var16 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var17 * var26;
                int var28 = var19 * var25;
                int var29 = var20 * var26;
                int var30 = var22 * var24;
                int var31 = var21 * var25;
                int var32 = var23 * var24;
                int var33 = arg8 + (var29 + var31 + var32 >> 12);
                int var34 = (var27 + var28 + var30 >> 12) + arg4;
                class51.method344(var10, var34, (byte) -122, var33, arg9, var11);
                var11 = var33;
                var10 = var34;
            }
        }
        if (arg6 == 3) {
            field693++;
        }
    }

    @OriginalMember(owner = "client!fn", name = "finalize", descriptor = "()V", line = 84)
    protected final void finalize() throws Throwable {
        if (this.field695 != -1) {
            class174.method1213(this.field695, this.field692, this.field696);
            this.field692 = 0;
            this.field695 = -1;
        }
        super.finalize();
        field687++;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Llm;Llm;BLfj;Llm;)Z", line = 103)
    public static final boolean method362(class210 arg0, class210 arg1, byte arg2, class290 arg3, class210 arg4) {
        if (arg2 != -45) {
            return true;
        }
        field691++;
        class302.field4609 = arg0;
        class54.field673 = arg3;
        class135.field2062 = arg1;
        class210.field3172 = arg4;
        return true;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lre;B)Lmg;", line = 122)
    public static final class61 method363(class263 arg0, byte arg1) {
        field685++;
        class61 var2 = new class61(arg0.method1801(-30054), arg0.method1801(-30054), arg0.method1830((byte) -77), arg0.method1830((byte) -77), arg0.method1826(-206227536), arg0.method1787(false) == 1, arg0.method1787(false));
        int var3 = arg0.method1787(false);
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field822.method1108(new class40(arg0.method1830((byte) -77), arg0.method1830((byte) -77), arg0.method1830((byte) -77), arg0.method1830((byte) -77)), 65280);
        }
        if (arg1 >= -89) {
            return (class61) null;
        } else {
            var2.method407(false);
            return var2;
        }
    }

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "(I)V", line = 149)
    public final void method364(int arg0) {
        if (arg0 <= 33) {
            return;
        }
        field684++;
        int var2 = class178.method1232((byte) -113);
        if ((var2 & 0x1) == 0) {
            class117.method814(this.field695);
        }
        if ((var2 & 0x2) == 0) {
            class117.method809(0);
        }
        if ((var2 & 0x4) == 0) {
            class117.method823(0);
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(B)V", line = 179)
    public static void method365(byte arg0) {
        int var1 = -87 / ((arg0 - 45) / 44);
        field690 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZIIIIIIIIIIZ)Z", line = 187)
    public static final boolean method366(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        field686++;
        if (class114.field1750.method696((byte) 117) == 2) {
            return class125.method918(arg4, arg5, arg1, arg8, arg11, 1, arg7, arg3, arg9, arg10, arg2, arg6);
        } else if (class114.field1750.method696((byte) 117) > 2) {
            return class72.method469(arg7, arg10, arg2, arg8, 104, arg1, arg9, arg3, arg6, arg4, arg5, arg11, class114.field1750.method696((byte) 117));
        } else {
            if (arg0) {
                field689 = -128;
            }
            return class272.method1916(arg11, arg5, arg4, arg1, (byte) 123, arg3, arg6, arg2, arg9, arg10, arg8, arg7);
        }
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(I)V", line = 296)
    public class55(int arg0) {
        GL var2 = class117.field1801;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field696 = class174.field2589;
        this.field695 = var3[0];
        class117.method814(this.field695);
        int var4 = class148.field2222[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class174.field2592 += var6.limit() - this.field692;
        this.field692 = var6.limit();
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZIILjava/lang/String;)I", line = 219)
    public static final int method367(boolean arg0, int arg1, int arg2, String arg3) {
        field697++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = arg3.length();
        int var7 = 0;
        for (int var8 = 0; var8 < var6; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg2 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var7 + var11;
            if ((var10 / arg2) != var7) {
                throw new NumberFormatException();
            }
            var7 = var10;
            var5 = true;
        }
        if (arg1 != 28637) {
            field694 = 21;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var7;
    }
}
