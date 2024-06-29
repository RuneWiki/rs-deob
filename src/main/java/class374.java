import jaggl.OpenGL;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class374 {

    @OriginalMember(owner = "client!ufa", name = "e", descriptor = "I")
    private int field4714 = 0;

    @OriginalMember(owner = "client!ufa", name = "h", descriptor = "Lil;")
    private class68 field4717;

    @OriginalMember(owner = "client!ufa", name = "j", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4719 = new CRC32();

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!ufa", name = "g", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!ufa", name = "i", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "J")
    public static long field4710;

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "Ld;")
    private class329 field4715;

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "Lpl;")
    public static class612 field4711;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)Ld;")
    public final class329 method2034(int arg0) {
        field4713++;
        if (this.field4714 > 0 && this.field4717.field927[this.field4714 - 1] != this.field4715) {
            class329 var2 = this.field4715;
            this.field4715 = var2.field4201;
            return var2;
        }
        while (this.field4717.field924 > this.field4714) {
            class329 var3 = this.field4717.field927[this.field4714++].field4201;
            if (this.field4717.field927[this.field4714 - 1] != var3) {
                this.field4715 = var3.field4201;
                return var3;
            }
        }
        if (arg0 != 1) {
            method2037(-1, 47);
        }
        return null;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(III[BZII)V")
    public static final void method2035(int arg0, int arg1, int arg2, byte[] arg3, boolean arg4, int arg5, int arg6) {
        field4712++;
        if (arg1 > 0 && !class4.method36(arg1, (byte) 98)) {
            throw new IllegalArgumentException("");
        } else if (arg5 <= 0 || class4.method36(arg5, (byte) 98)) {
            int var7 = class358.method1973(arg2, (byte) -108);
            int var8 = 0;
            int var9 = arg1 < arg5 ? arg1 : arg5;
            int var10 = arg1 >> 1;
            int var11 = arg5 >> 1;
            byte[] var12 = arg3;
            if (!arg4) {
                method2035(25, -1, 34, null, false, 100, -39);
            }
            byte[] var13 = new byte[var7 * var11 * var10];
            while (true) {
                OpenGL.glTexImage2Dub(arg0, var8, arg6, arg1, arg5, 0, arg2, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg1 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var15 + var14;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            int var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = (byte) (var27 >> 2);
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                byte[] var16 = var13;
                var13 = var12;
                var12 = var16;
                arg1 = var10;
                arg5 = var11;
                var8++;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var11 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)Ld;")
    public final class329 method2036(byte arg0) {
        int var2 = 101 / ((arg0 + 76) / 42);
        field4716++;
        this.field4714 = 0;
        return this.method2034(1);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(II)I")
    public static final int method2037(int arg0, int arg1) {
        field4718++;
        return arg0 > -61 ? -14 : arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(I)V")
    public static void method2038(int arg0) {
        if (arg0 != 0) {
            field4711 = null;
        }
        field4711 = null;
        field4719 = null;
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "()V")
    public class374() {
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(Lil;)V")
    public class374(class68 arg0) {
        this.field4717 = arg0;
    }
}
