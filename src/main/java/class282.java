import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class282 {

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "Ljg;")
    private class140 field4735 = null;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    private int field4733 = 65000;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "Ljg;")
    private class140 field4741 = null;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    private int field4737;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "[I")
    public static int[] field4739 = new int[99];

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "Z")
    public static boolean field4743;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "Z")
    public static boolean field4745;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1960(int arg0, int arg1) {
        field4736++;
        class227 var2 = class215.method1531(-1, arg1, arg0);
        var2.method1624((byte) -101);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V", line = 18)
    public static void method1961(boolean arg0) {
        if (!arg0) {
            field4739 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(ILjg;Ljg;I)V", line = 316)
    public class282(int arg0, class140 arg1, class140 arg2, int arg3) {
        this.field4737 = arg0;
        this.field4735 = arg1;
        this.field4733 = arg3;
        this.field4741 = arg2;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([BIBZI)Z", line = 50)
    private final boolean method1962(byte[] arg0, int arg1, byte arg2, boolean arg3, int arg4) {
        field4738++;
        class140 var6 = this.field4735;
        synchronized (this.field4735) {
            try {
                int var7;
                boolean var10000;
                if (arg3) {
                    if (this.field4741.method955(-122) < ((long) (arg4 * 6 + 6))) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field4741.method956((long) (arg4 * 6), (byte) 104);
                    this.field4741.method948(arg2 + 94, 6, class22.field305, 0);
                    var7 = ((class22.field305[4] & 0xFF) << 8) + ((class22.field305[3] & 0xFF) << 16) + (class22.field305[5] & 0xFF);
                    if (var7 <= 0 || (this.field4735.method955(77) / 520L) < ((long) var7)) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field4735.method955(-107) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class22.field305[3] = (byte) (var7 >> 16);
                class22.field305[2] = (byte) arg1;
                class22.field305[1] = (byte) (arg1 >> 8);
                class22.field305[5] = (byte) var7;
                class22.field305[4] = (byte) (var7 >> 8);
                int var8 = 0;
                class22.field305[0] = (byte) (arg1 >> 16);
                int var9 = 0;
                this.field4741.method956((long) (arg4 * 6), (byte) 104);
                this.field4741.method957(arg2, class22.field305, 0, 6);
                while (true) {
                    if (arg1 > var8) {
                        label136: {
                            int var10 = 0;
                            if (arg3) {
                                this.field4735.method956((long) (var7 * 520), (byte) 104);
                                try {
                                    this.field4735.method948(0, 8, class22.field305, 0);
                                } catch (EOFException var18) {
                                    break label136;
                                }
                                var10 = (class22.field305[6] & 0xFF) + (((class22.field305[4] & 0xFF) << 16) + (class22.field305[5] & 0xFF << 8));
                                int var12 = ((class22.field305[0] & 0xFF) << 8) + (class22.field305[1] & 0xFF);
                                int var13 = (class22.field305[2] & 0xFF << 8) + (class22.field305[3] & 0xFF);
                                int var14 = class22.field305[7] & 0xFF;
                                if (arg4 != var12 || var9 != var13 || this.field4737 != var14) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || ((long) var10) > (this.field4735.method955(arg2 - 27) / 520L)) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                arg3 = false;
                                var10 = (int) ((this.field4735.method955(arg2 ^ 0xFFFFFFFB) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            class22.field305[2] = (byte) (var9 >> 8);
                            class22.field305[7] = (byte) this.field4737;
                            class22.field305[3] = (byte) var9;
                            class22.field305[1] = (byte) arg4;
                            var9++;
                            class22.field305[0] = (byte) (arg4 >> 8);
                            int var15 = arg1 - var8;
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            if (arg1 - var8 <= 512) {
                                var10 = 0;
                            }
                            class22.field305[6] = (byte) var10;
                            class22.field305[4] = (byte) (var10 >> 16);
                            class22.field305[5] = (byte) (var10 >> 8);
                            this.field4735.method956((long) (var7 * 520), (byte) 104);
                            this.field4735.method957((byte) -94, class22.field305, 0, 8);
                            this.field4735.method957((byte) -94, arg0, var8, var15);
                            var8 += var15;
                            var7 = var10;
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

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III[B)Z", line = 176)
    public final boolean method1963(int arg0, int arg1, int arg2, byte[] arg3) {
        field4744++;
        class140 var5 = this.field4735;
        synchronized (this.field4735) {
            if (arg1 != -19849) {
                method1960(-41, -104);
            }
            if (arg2 < 0 || this.field4733 < arg2) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1962(arg3, arg2, (byte) -94, true, arg0);
            if (!var6) {
                var6 = this.method1962(arg3, arg2, (byte) -94, false, arg0);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)[B", line = 212)
    public final byte[] method1964(byte arg0, int arg1) {
        field4734++;
        class140 var3 = this.field4735;
        synchronized (this.field4735) {
            try {
                Object var10000;
                if (((long) (arg1 * 6 + 6)) > this.field4741.method955(48)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field4741.method956((long) (arg1 * 6), (byte) 104);
                this.field4741.method948(0, 6, class22.field305, 0);
                int var4 = (class22.field305[1] & 0xFF << 8) + (class22.field305[0] & 0xFF << 16) + (class22.field305[2] & 0xFF);
                int var5 = ((class22.field305[3] & 0xFF) << 16) + ((class22.field305[4] & 0xFF) << 8) + (class22.field305[5] & 0xFF);
                if (var4 < 0 || var4 > this.field4733) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var5 <= 0 || ((long) var5) > (this.field4735.method955(-115) / 520L)) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    byte[] var19;
                    if (arg0 >= -21) {
                        var19 = (byte[]) null;
                        return var19;
                    }
                    byte[] var6 = new byte[var4];
                    int var7 = 0;
                    int var8 = 0;
                    while (var8 < var4) {
                        if (var5 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field4735.method956((long) (var5 * 520), (byte) 104);
                        int var9 = var4 - var8;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field4735.method948(0, var9 + 8, class22.field305, 0);
                        int var10 = (class22.field305[2] & 0xFF << 8) + (class22.field305[3] & 0xFF);
                        int var11 = (class22.field305[0] & 0xFF << 8) + (class22.field305[1] & 0xFF);
                        int var12 = ((class22.field305[5] & 0xFF) << 8) + (class22.field305[4] & 0xFF << 16) + (class22.field305[6] & 0xFF);
                        int var13 = class22.field305[7] & 0xFF;
                        if (arg1 == var11 && var7 == var10 && this.field4737 == var13) {
                            if (var12 >= 0 && (long) var12 <= this.field4735.method955(-10) / 520L) {
                                for (int var14 = 0; var14 < var9; var14++) {
                                    var6[var8++] = class22.field305[var14 + 8];
                                }
                                var7++;
                                var5 = var12;
                                continue;
                            }
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var10000 = null;
                        return (byte[]) var10000;
                    }
                    var19 = var6;
                    return var19;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field4739[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!ph", name = "toString", descriptor = "()Ljava/lang/String;", line = 335)
    public final String toString() {
        field4740++;
        return "Cache:" + this.field4737;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)Lme;", line = 345)
    public static final class75 method1965(int arg0, byte arg1) {
        field4742++;
        if (arg1 != 6) {
            method1965(-122, (byte) -21);
        }
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class277.field4660[var2] == null || class277.field4660[var2][var3] == null) {
            boolean var4 = class113.method777((byte) -43, var2);
            if (!var4) {
                return null;
            }
        }
        return class277.field4660[var2][var3];
    }
}
