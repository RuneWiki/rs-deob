import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class617 {

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "[Lug;")
    private class60[] field8791 = null;

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "[Lug;")
    public class60[] field8787 = null;

    @OriginalMember(owner = "client!ur", name = "l", descriptor = "Liv;")
    public class24 field8796 = null;

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "Liv;")
    public class24 field8788 = null;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "Lch;")
    private class38 field8785;

    @OriginalMember(owner = "client!ur", name = "k", descriptor = "Z")
    public boolean field8795;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "[I")
    public static int[] field8786 = new int[6];

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
    public static int field8789;

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "I")
    public static int field8792;

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "I")
    public static int field8793;

    @OriginalMember(owner = "client!ur", name = "j", descriptor = "I")
    public static int field8794;

    @OriginalMember(owner = "client!ur", name = "m", descriptor = "I")
    public static int field8797;

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "Lla;")
    public static class423 field8790;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)Z")
    public final boolean method3581(int arg0) {
        field8789++;
        if (arg0 != 128) {
            return true;
        } else if (this.field8795) {
            return this.field8796 != null;
        } else {
            return this.field8787 != null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "([BIBI)[B")
    public static final byte[] method3582(byte[] arg0, int arg1, byte arg2, int arg3) {
        field8793++;
        if (arg2 <= 76) {
            method3586(false);
        }
        byte[] var4 = new byte[arg3];
        class85.method683(arg0, arg1, var4, 0, arg3);
        return var4;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)Z")
    public final boolean method3583(byte arg0) {
        if (this.field8788 == null) {
            if (class732.field10251 == null) {
                byte[] var2 = class439.method2689((byte) -46, 4.0F, 128, 0.5F, 0.6F, 4.0F, new class490(419684), 16, 8, 16.0F, 128);
                class732.field10251 = class452.method2769(var2, false, -104);
            }
            byte[] var3 = class535.method3238(arg0, false, class732.field10251);
            byte[] var4 = new byte[var3.length * 4];
            int var5 = 0;
            for (int var6 = 0; var6 < 16; var6++) {
                int var7 = var6 * 128 * 128;
                int var8 = var7;
                for (int var9 = 0; var9 < 128; var9++) {
                    int var10 = var9 * 128 + var8;
                    int var11 = var8 + ((var9 - 1 & 0x7F) * 128);
                    int var12 = var8 + ((var9 + 1 & 0x7F) * 128);
                    for (int var13 = 0; var13 < 128; var13++) {
                        float var14 = (float) ((var3[var11 + var13] & 0xFF) - (var3[var12 + var13] & 0xFF));
                        float var15 = (float) ((var3[var10 + (var13 - 1 & 0x7F)] & 0xFF) - (var3[(var13 + 1 & 0x7F) + var10] & 0xFF));
                        float var16 = (float) (128.0D / Math.sqrt((double) (var14 * var14 + var15 * var15 + 16384.0F)));
                        var4[var5++] = (byte) ((int) (var15 * var16 + 127.0F));
                        var4[var5++] = (byte) ((int) (var16 * 128.0F + 127.0F));
                        var4[var5++] = (byte) ((int) (var14 * var16 + 127.0F));
                        var4[var5++] = var3[var7++];
                    }
                }
            }
            this.field8788 = this.field8785.method310(class482.field6922, (byte) -69, 128, 16, var4, 128);
        }
        if (arg0 != 26) {
            this.field8788 = null;
        }
        field8797++;
        return this.field8788 != null;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILdk;)[I")
    public static final int[] method3584(int arg0, class88 arg1) {
        field8792++;
        class479 var2 = new class479(518);
        int[] var3 = new int[4];
        for (int var4 = 0; var4 < 4; var4++) {
            var3[var4] = (int) (Math.random() * 9.9999999E7D);
        }
        var2.method2881(10, (byte) 127);
        var2.method2926((byte) -128, var3[0]);
        var2.method2926((byte) -119, var3[1]);
        var2.method2926((byte) -123, var3[2]);
        var2.method2926((byte) -117, var3[3]);
        for (int var5 = 0; var5 < 10; var5++) {
            var2.method2926((byte) -127, (int) (Math.random() * 9.9999999E7D));
        }
        var2.method2862((int) ((double) arg0 * Math.random()), -1166933656);
        var2.method2895(arg0 - 100000127, class204.field3059, class481.field6868);
        arg1.field1260.method2898(0, var2.field6800, (byte) -126, var2.field6864);
        return var3;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(II[F[IIII[II[FIII)V")
    public static final void method3585(int arg0, int arg1, float[] arg2, int[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, float[] arg9, int arg10, int arg11, int arg12) {
        if (arg4 != 0) {
            field8790 = null;
        }
        field8794++;
        int var13 = arg5 * arg11 + arg10;
        int var14 = arg1 * arg6 + arg12;
        int var15 = arg5 - arg8;
        int var16 = arg6 - arg8;
        if (arg7 == null) {
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = arg8 + var13;
                while (var13 < var18) {
                    arg9[var14++] = arg2[var13++];
                }
                var14 += var16;
                var13 += var15;
            }
        } else if (arg2 == null) {
            for (int var19 = 0; var19 < arg0; var19++) {
                int var20 = arg8 + var13;
                while (var20 > var13) {
                    arg3[var14++] = arg7[var13++];
                }
                var13 += var15;
                var14 += var16;
            }
        } else {
            for (int var21 = 0; var21 < arg0; var21++) {
                int var22 = var13 + arg8;
                while (var22 > var13) {
                    arg3[var14] = arg7[var13];
                    arg9[var14++] = arg2[var13++];
                }
                var13 += var15;
                var14 += var16;
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)V")
    public static void method3586(boolean arg0) {
        field8786 = null;
        field8790 = null;
        if (arg0) {
            field8786 = null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lch;)V")
    public class617(class38 arg0) {
        this.field8785 = arg0;
        this.field8795 = this.field8785.field600;
        if (this.field8795 && !this.field8785.method283(-25, class674.field9590, class367.field5365)) {
            this.field8795 = false;
        }
        if (this.field8795 || this.field8785.method256(0, class367.field5365, class674.field9590)) {
            class121.method843(-124);
            if (this.field8795) {
                byte[] var2 = class535.method3238(26, false, class376.field5444);
                this.field8796 = this.field8785.method310(class367.field5365, (byte) -69, 128, 16, var2, 128);
                byte[] var3 = class535.method3238(26, false, class271.field3852);
                this.field8785.method310(class367.field5365, (byte) -69, 128, 16, var3, 128);
            } else {
                this.field8787 = new class60[16];
                for (int var4 = 0; var4 < 16; var4++) {
                    byte[] var7 = class26.method114(var4 * 128 * 128 * 2, 4080, 32768, class376.field5444);
                    this.field8787[var4] = this.field8785.method350(128, var7, true, -98, 128, class367.field5365);
                }
                this.field8791 = new class60[16];
                for (int var5 = 0; var5 < 16; var5++) {
                    byte[] var6 = class26.method114(var5 * 128 * 256, 4080, 32768, class271.field3852);
                    this.field8791[var5] = this.field8785.method350(128, var6, true, -122, 128, class367.field5365);
                }
            }
        }
    }
}
