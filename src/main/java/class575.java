import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class575 {

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "Z")
    public boolean field7943 = true;

    @OriginalMember(owner = "client!aba", name = "k", descriptor = "I")
    private int field7951 = -1;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "I")
    private int field7941;

    @OriginalMember(owner = "client!aba", name = "n", descriptor = "Lsv;")
    private class312 field7954;

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "Lrv;")
    private class273 field7944;

    @OriginalMember(owner = "client!aba", name = "l", descriptor = "I")
    private int field7952;

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "I")
    public int field7945;

    @OriginalMember(owner = "client!aba", name = "g", descriptor = "Lsd;")
    private class595 field7947;

    @OriginalMember(owner = "client!aba", name = "h", descriptor = "I")
    private int field7948;

    @OriginalMember(owner = "client!aba", name = "v", descriptor = "I")
    private int field7962;

    @OriginalMember(owner = "client!aba", name = "i", descriptor = "Lgo;")
    private class526 field7949;

    @OriginalMember(owner = "client!aba", name = "o", descriptor = "Ljj;")
    public static class398 field7955 = new class398(77, -1);

    @OriginalMember(owner = "client!aba", name = "s", descriptor = "Z")
    public static boolean field7959 = false;

    @OriginalMember(owner = "client!aba", name = "t", descriptor = "[I")
    public static int[] field7960 = new int[120];

    @OriginalMember(owner = "client!aba", name = "r", descriptor = "Luaa;")
    public static class319 field7958 = null;

    @OriginalMember(owner = "client!aba", name = "w", descriptor = "Z")
    public static boolean field7963;

    @OriginalMember(owner = "client!aba", name = "p", descriptor = "F")
    public static float field7956;

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "I")
    public static int field7942;

    @OriginalMember(owner = "client!aba", name = "f", descriptor = "I")
    public static int field7946;

    @OriginalMember(owner = "client!aba", name = "j", descriptor = "I")
    public static int field7950;

    @OriginalMember(owner = "client!aba", name = "m", descriptor = "I")
    public static int field7953;

    @OriginalMember(owner = "client!aba", name = "q", descriptor = "I")
    public static int field7957;

    @OriginalMember(owner = "client!aba", name = "u", descriptor = "I")
    public static int field7961;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field7960[var1] = var0 / 4;
        }
        field7963 = false;
    }

    @OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(Lsv;Lrv;Lua;IIIII)V", line = 273)
    public class575(class312 arg0, class273 arg1, class303 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field7941 = arg7;
        this.field7954 = arg0;
        this.field7944 = arg1;
        this.field7952 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field2214 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field4049[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field7945 = 0;
            this.field7947 = null;
        } else {
            this.field7948 = Integer.MAX_VALUE;
            this.field7962 = Integer.MIN_VALUE;
            this.field7949 = this.field7954.method850(true, false);
            this.field7949.method1446(var10, 30419);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field7949.method1025(true, (byte) 67);
                if (var15 != null) {
                    Stream var16 = this.field7954.method1920((byte) 98, var15);
                    if (Stream.method1519()) {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field2214 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field4049[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (var22 > this.field7962) {
                                            this.field7962 = var22;
                                        }
                                        if (this.field7948 > var22) {
                                            this.field7948 = var22;
                                        }
                                        var16.method1531(var22);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field2214 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field4049[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (this.field7962 < var28) {
                                            this.field7962 = var28;
                                        }
                                        if (this.field7948 > var28) {
                                            this.field7948 = var28;
                                        }
                                        var16.method1525(var28);
                                    }
                                }
                            }
                        }
                    }
                    var16.method1523();
                    if (this.field7949.method1021(true)) {
                        break;
                    }
                }
            }
            this.field7945 = var10 / 3;
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(CI)Z", line = 12)
    public static final boolean method3241(char arg0, int arg1) {
        field7957++;
        if (arg1 != 32) {
            field7946 = -63;
        }
        return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Z)V", line = 23)
    private final void method3242(boolean arg0) {
        field7953++;
        if (!this.field7943) {
            return;
        }
        this.field7943 = false;
        byte[] var2 = this.field7944.field3698;
        int var3 = 0;
        int var4 = this.field7944.field3695;
        int var5 = this.field7944.field3695 * this.field7941 + this.field7952;
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field7947 != null && this.field7951 == var3) {
            this.field7943 = false;
            return;
        }
        this.field7951 = var3;
        int var7 = 0;
        int var8 = this.field7952 + (this.field7941 * var4);
        if (!this.field7954.method826(class394.field5654, class680.field9664, arg0)) {
            if (class565.field7840 == null) {
                class565.field7840 = new int[16384];
            }
            int[] var13 = class565.field7840;
            for (int var14 = -128; var14 < 0; var14++) {
                for (int var15 = -128; var15 < 0; var15++) {
                    if (var2[var8] == 0) {
                        int var16 = 0;
                        if (var2[var8 - 1] != 0) {
                            var16++;
                        }
                        if (var2[var8 + 1] != 0) {
                            var16++;
                        }
                        if (var2[var8 - var4] != 0) {
                            var16++;
                        }
                        if (var2[var8 + var4] != 0) {
                            var16++;
                        }
                        var13[var7++] = var16 * 17 << 24;
                    } else {
                        var13[var7++] = 1140850688;
                    }
                    var8++;
                }
                var8 += this.field7944.field3695 - 128;
            }
            if (this.field7947 == null) {
                this.field7947 = this.field7954.method1974(128, 128, false, class565.field7840, false);
                this.field7947.method169(false, (byte) -68, false);
            } else {
                this.field7947.method171(0, 27729, 128, 0, class565.field7840, 128, 0, 128);
            }
            return;
        }
        if (class23.field221 == null) {
            class23.field221 = new byte[16384];
        }
        byte[] var9 = class23.field221;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var4] != 0) {
                        var12++;
                    }
                    if (var2[var4 + var8] != 0) {
                        var12++;
                    }
                    var9[var7++] = (byte) (var12 * 17);
                } else {
                    var9[var7++] = 68;
                }
                var8++;
            }
            var8 += this.field7944.field3695 - 128;
        }
        if (this.field7947 == null) {
            this.field7947 = this.field7954.method1978((byte) 55, 128, class23.field221, 128, false, class394.field5654);
            this.field7947.method169(false, (byte) -68, false);
        } else {
            this.field7947.method173(class394.field5654, 128, (byte) -99, class23.field221, 0, 0, 128, 128, 0);
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(ILgo;B)V", line = 192)
    public final void method3243(int arg0, class526 arg1, byte arg2) {
        if (arg0 > 0) {
            this.method3242(true);
            this.field7954.method1884(this.field7947, -2);
            this.field7954.method818(this.field7948, this.field7962 - (this.field7948 - 1), arg1, arg0, -1, class319.field4687, 0);
        }
        field7961++;
        if (arg2 < 90) {
            field7959 = true;
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Ljava/io/File;II)[B", line = 211)
    public static final byte[] method3244(File arg0, int arg1, int arg2) {
        field7942++;
        try {
            byte[] var3 = new byte[arg2];
            class507.method2867(var3, 33, arg2, arg0);
            if (arg1 < 63) {
                method3246(-86);
            }
            return var3;
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(B)V", line = 248)
    public final void method3245(byte arg0) {
        if (arg0 == -116) {
            this.method3243(this.field7945, this.field7949, (byte) 99);
            field7950++;
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)V", line = 260)
    public static void method3246(int arg0) {
        if (arg0 == -128) {
            field7955 = null;
            field7960 = null;
        }
    }
}
