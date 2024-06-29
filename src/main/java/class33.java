import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class33 {

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "Lrg;")
    private class70 field412 = null;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "Lrg;")
    private class70 field416 = null;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    private int field414 = 65000;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    private int field411;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "[Z")
    public static boolean[] field413 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public static int field420 = 0;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field417 = 0;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "[Lwb;")
    public static class294[] field425 = new class294[4];

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "Ls;")
    public static class304 field426 = new class304(5000);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "Lwf;")
    public static class306 field428;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIII)V", line = 9)
    public static final void method244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class58 var7 = new class58();
        var7.field816 = arg1 / 128;
        var7.field815 = arg2 / 128;
        var7.field814 = arg3 / 128;
        var7.field819 = arg4 / 128;
        var7.field817 = arg0;
        var7.field804 = arg1;
        var7.field811 = arg2;
        var7.field809 = arg3;
        var7.field820 = arg4;
        var7.field807 = arg5;
        var7.field803 = arg6;
        class234.field3766[class175.field2684++] = var7;
    }

    @OriginalMember(owner = "client!ch", name = "toString", descriptor = "()Ljava/lang/String;", line = 25)
    public final String toString() {
        field427++;
        return "Cache:" + this.field411;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "([II[III)V", line = 38)
    public static final void method245(int[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field424++;
        if (arg1 < arg4) {
            int var5 = arg1;
            int var6 = (arg1 + arg4) / 2;
            int var7 = arg2[var6];
            arg2[var6] = arg2[arg4];
            arg2[arg4] = var7;
            int var8 = arg0[var6];
            arg0[var6] = arg0[arg4];
            arg0[arg4] = var8;
            for (int var9 = arg1; var9 < arg4; var9++) {
                if (arg2[var9] > ((var9 & 0x1) + var7)) {
                    int var10 = arg2[var9];
                    arg2[var9] = arg2[var5];
                    arg2[var5] = var10;
                    int var11 = arg0[var9];
                    arg0[var9] = arg0[var5];
                    arg0[var5++] = var11;
                }
            }
            arg2[arg4] = arg2[var5];
            arg2[var5] = var7;
            arg0[arg4] = arg0[var5];
            arg0[var5] = var8;
            method245(arg0, arg1, arg2, 98, var5 - 1);
            method245(arg0, var5 + 1, arg2, 63, arg4);
        }
        if (arg3 < 29) {
            method245((int[]) null, 75, (int[]) null, 125, 50);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II[BI)Z", line = 101)
    public final boolean method246(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg1 != 26115) {
            return false;
        }
        field421++;
        class70 var5 = this.field412;
        synchronized (this.field412) {
            if (arg0 < 0 || this.field414 < arg0) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method247(0, arg0, true, arg2, arg3);
            if (!var6) {
                var6 = this.method247(0, arg0, false, arg2, arg3);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(ILrg;Lrg;I)V", line = 370)
    public class33(int arg0, class70 arg1, class70 arg2, int arg3) {
        this.field414 = arg3;
        this.field416 = arg2;
        this.field411 = arg0;
        this.field412 = arg1;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIZ[BI)Z", line = 139)
    private final boolean method247(int arg0, int arg1, boolean arg2, byte[] arg3, int arg4) {
        field419++;
        class70 var6 = this.field412;
        synchronized (this.field412) {
            try {
                int var7;
                boolean var10000;
                if (arg2) {
                    if ((long) (arg4 * 6 + 6) > this.field416.method506(false)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field416.method498((byte) -69, (long) (arg4 * 6));
                    this.field416.method500(6, (byte) -23, 0, class59.field828);
                    var7 = ((class59.field828[3] & 0xFF) << 16) + (class59.field828[4] & 0xFF << 8) + (class59.field828[5] & 0xFF);
                    if (var7 <= 0 || this.field412.method506(false) / 520L < (long) var7) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field412.method506(false) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class59.field828[3] = (byte) (var7 >> 16);
                class59.field828[4] = (byte) (var7 >> 8);
                class59.field828[1] = (byte) (arg1 >> 8);
                class59.field828[5] = (byte) var7;
                class59.field828[2] = (byte) arg1;
                class59.field828[0] = (byte) (arg1 >> 16);
                this.field416.method498((byte) -69, (long) (arg4 * 6));
                int var8 = 0;
                int var9 = 0;
                this.field416.method504((byte) -11, 6, class59.field828, arg0);
                while (true) {
                    if (var9 < arg1) {
                        label135: {
                            int var10 = 0;
                            if (arg2) {
                                this.field412.method498((byte) -69, (long) (var7 * 520));
                                try {
                                    this.field412.method500(8, (byte) -23, 0, class59.field828);
                                } catch (EOFException var18) {
                                    break label135;
                                }
                                int var12 = (class59.field828[0] & 0xFF << 8) + (class59.field828[1] & 0xFF);
                                var10 = ((class59.field828[4] & 0xFF) << 16) + ((class59.field828[5] & 0xFF) << 8) + (class59.field828[6] & 0xFF);
                                int var13 = class59.field828[7] & 0xFF;
                                int var14 = (class59.field828[2] & 0xFF << 8) + (class59.field828[3] & 0xFF);
                                if (arg4 != var12 || var8 != var14 || this.field411 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || ((long) var10) > (this.field412.method506(false) / 520L)) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                arg2 = false;
                                var10 = (int) ((this.field412.method506(false) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            class59.field828[2] = (byte) (var8 >> 8);
                            class59.field828[3] = (byte) var8;
                            class59.field828[0] = (byte) (arg4 >> 8);
                            if (arg1 - var9 <= 512) {
                                var10 = 0;
                            }
                            class59.field828[4] = (byte) (var10 >> 16);
                            class59.field828[5] = (byte) (var10 >> 8);
                            int var15 = arg1 - var9;
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            var8++;
                            class59.field828[1] = (byte) arg4;
                            class59.field828[7] = (byte) this.field411;
                            class59.field828[6] = (byte) var10;
                            this.field412.method498((byte) -69, (long) (var7 * 520));
                            this.field412.method504((byte) -11, 8, class59.field828, 0);
                            this.field412.method504((byte) -11, var15, arg3, var9);
                            var7 = var10;
                            var9 += var15;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var19) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIBI)V", line = 267)
    public static final void method248(int arg0, int arg1, byte arg2, int arg3) {
        field410++;
        class75 var4 = class204.method1371(9, 7, arg0);
        var4.method524((byte) 57);
        var4.field1124 = arg1;
        var4.field1122 = arg3;
        if (arg2 != -48) {
            method245((int[]) null, -35, (int[]) null, 102, 19);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)[B", line = 283)
    public final byte[] method249(int arg0, int arg1) {
        field422++;
        class70 var3 = this.field412;
        synchronized (this.field412) {
            try {
                Object var10000;
                if ((long) (arg0 * arg1 + 6) > this.field416.method506(false)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field416.method498((byte) -69, (long) (arg0 * 6));
                this.field416.method500(6, (byte) -23, 0, class59.field828);
                int var4 = (class59.field828[3] & 0xFF << 16) - (-((class59.field828[4] & 0xFF) << 8) - (class59.field828[5] & 0xFF));
                int var5 = (class59.field828[2] & 0xFF) + ((class59.field828[1] & 0xFF) << 8) + ((class59.field828[0] & 0xFF) << 16);
                if (var5 < 0 || this.field414 < var5) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var4 > 0 && ((long) var4) <= (this.field412.method506(false) / 520L)) {
                    byte[] var6 = new byte[var5];
                    int var7 = 0;
                    int var8 = 0;
                    while (var5 > var7) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field412.method498((byte) -69, (long) (var4 * 520));
                        int var9 = var5 - var7;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field412.method500(var9 + 8, (byte) -23, 0, class59.field828);
                        int var10 = ((class59.field828[2] & 0xFF) << 8) + (class59.field828[3] & 0xFF);
                        int var11 = (class59.field828[0] & 0xFF << 8) + (class59.field828[1] & 0xFF);
                        int var12 = class59.field828[7] & 0xFF;
                        int var13 = (class59.field828[6] & 0xFF) + (((class59.field828[4] & 0xFF) << 16) + ((class59.field828[5] & 0xFF) << 8));
                        if (arg0 == var11 && var8 == var10 && this.field411 == var12) {
                            if (var13 >= 0 && (this.field412.method506(false) / 520L) >= ((long) var13)) {
                                for (int var14 = 0; var14 < var9; var14++) {
                                    var6[var7++] = class59.field828[var14 + 8];
                                }
                                var8++;
                                var4 = var13;
                                continue;
                            }
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var10000 = null;
                        return (byte[]) var10000;
                    }
                    byte[] var19 = var6;
                    return var19;
                } else {
                    var10000 = null;
                    return (byte[]) var10000;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V", line = 384)
    public static void method250(int arg0) {
        field413 = null;
        field425 = null;
        field426 = null;
        field428 = null;
        if (arg0 != -334548688) {
            field429 = -51;
        }
    }
}
