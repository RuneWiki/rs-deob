import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class676 {

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "Lcv;")
    private class635 field9493 = null;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    private int field9492 = 65000;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "Lcv;")
    private class635 field9491 = null;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    private int field9495;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "Lrc;")
    public static class29 field9488 = new class29();

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "Lwp;")
    public static class453 field9499 = new class453(11, 0);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field9487;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field9489;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field9490;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field9494;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field9496;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field9497;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    public static int field9501;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "Lcw;")
    public static class515 field9498;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "[S")
    public static short[] field9500;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public static void method3789(int arg0) {
        if (arg0 == 4) {
            field9500 = null;
            field9498 = null;
            field9499 = null;
            field9488 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([BIIIIBII[B)V")
    public static final void method3790(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, byte[] arg8) {
        field9496++;
        if (arg5 > -80) {
            method3790(null, 82, 124, 91, 20, (byte) 37, -28, -127, null);
        }
        int var9 = -(arg3 >> 2);
        int var10 = -(arg3 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg4++;
                arg8[var10001] += arg0[arg1++];
                int var14 = arg4++;
                arg8[var14] += arg0[arg1++];
                int var15 = arg4++;
                arg8[var15] += arg0[arg1++];
                int var16 = arg4++;
                arg8[var16] += arg0[arg1++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg4++;
                arg8[var10001] += arg0[arg1++];
            }
            arg1 += arg2;
            arg4 += arg7;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)[B")
    public final byte[] method3791(byte arg0, int arg1) {
        field9487++;
        if (arg0 != 108) {
            field9488 = null;
        }
        class635 var3 = this.field9491;
        synchronized (this.field9491) {
            try {
                if (this.field9493.method3559(0) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field9493.method3555(13755, (long) (arg1 * 6));
                this.field9493.method3550(0, (byte) 121, 6, class117.field1516);
                int var5 = (class117.field1516[1] & 0xFF << 8) + ((class117.field1516[0] & 0xFF) << 16) + (class117.field1516[2] & 0xFF);
                int var6 = (class117.field1516[5] & 0xFF) + (class117.field1516[4] & 0xFF << 8) + (class117.field1516[3] & 0xFF << 16);
                if (var5 < 0 || var5 > this.field9492) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field9491.method3559(0) / 520L) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    label72: while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field9491.method3555(arg0 ^ 0x35D7, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field9491.method3550(0, (byte) 113, var13 + 8, class117.field1516);
                        int var14 = ((class117.field1516[0] & 0xFF) << 8) + (class117.field1516[1] & 0xFF);
                        int var15 = ((class117.field1516[2] & 0xFF) << 8) + (class117.field1516[3] & 0xFF);
                        int var16 = (class117.field1516[6] & 0xFF) + ((class117.field1516[5] & 0xFF) << 8) + (class117.field1516[4] & 0xFF << 16);
                        int var17 = class117.field1516[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field9495 == var17) {
                            if (var16 >= 0 && this.field9491.method3559(0) / 520L >= (long) var16) {
                                var11++;
                                var6 = var16;
                                int var20 = 0;
                                while (true) {
                                    if (var20 >= var13) {
                                        continue label72;
                                    }
                                    var9[var10++] = class117.field1516[var20 + 8];
                                    var20++;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IBZI[B)Z")
    private final boolean method3792(int arg0, byte arg1, boolean arg2, int arg3, byte[] arg4) {
        field9497++;
        class635 var6 = this.field9491;
        synchronized (this.field9491) {
            if (arg1 != -15) {
                method3789(-47);
            }
            try {
                int var7;
                if (arg2) {
                    if ((long) (arg0 * 6 + 6) > this.field9493.method3559(arg1 + 15)) {
                        return false;
                    }
                    this.field9493.method3555(13755, (long) (arg0 * 6));
                    this.field9493.method3550(0, (byte) 113, 6, class117.field1516);
                    var7 = ((class117.field1516[3] & 0xFF) << 16) + (class117.field1516[4] & 0xFF << 8) + (class117.field1516[5] & 0xFF);
                    if (var7 <= 0 || ((long) var7) > (this.field9491.method3559(0) / 520L)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field9491.method3559(arg1 + 15) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class117.field1516[3] = (byte) (var7 >> 16);
                class117.field1516[5] = (byte) var7;
                class117.field1516[2] = (byte) arg3;
                class117.field1516[1] = (byte) (arg3 >> 8);
                class117.field1516[4] = (byte) (var7 >> 8);
                class117.field1516[0] = (byte) (arg3 >> 16);
                this.field9493.method3555(13755, (long) (arg0 * 6));
                this.field9493.method3556(class117.field1516, 0, 6, 27895);
                int var10 = 0;
                int var11 = 0;
                while (arg3 > var10) {
                    int var12 = 0;
                    if (arg2) {
                        label109: {
                            this.field9491.method3555(13755, (long) (var7 * 520));
                            try {
                                this.field9491.method3550(0, (byte) 121, 8, class117.field1516);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class117.field1516[0] & 0xFF << 8) + (class117.field1516[1] & 0xFF);
                            int var14 = (class117.field1516[2] & 0xFF << 8) + (class117.field1516[3] & 0xFF);
                            var12 = (class117.field1516[5] & 0xFF << 8) + (class117.field1516[4] & 0xFF << 16) + (class117.field1516[6] & 0xFF);
                            int var15 = class117.field1516[7] & 0xFF;
                            if (arg0 == var13 && var11 == var14 && this.field9495 == var15) {
                                if (var12 >= 0 && (this.field9491.method3559(0) / 520L) >= ((long) var12)) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field9491.method3559(arg1 + 15) + 519L) / 520L);
                        arg2 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class117.field1516[3] = (byte) var11;
                    class117.field1516[2] = (byte) (var11 >> 8);
                    class117.field1516[1] = (byte) arg0;
                    class117.field1516[0] = (byte) (arg0 >> 8);
                    if ((arg3 - var10) <= 512) {
                        var12 = 0;
                    }
                    class117.field1516[7] = (byte) this.field9495;
                    class117.field1516[4] = (byte) (var12 >> 16);
                    class117.field1516[5] = (byte) (var12 >> 8);
                    class117.field1516[6] = (byte) var12;
                    this.field9491.method3555(13755, (long) (var7 * 520));
                    this.field9491.method3556(class117.field1516, 0, 8, 27895);
                    int var18 = arg3 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field9491.method3556(arg4, var10, var18, 27895);
                    var7 = var12;
                    var11++;
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I[BII)Z")
    public final boolean method3793(int arg0, byte[] arg1, int arg2, int arg3) {
        field9490++;
        class635 var5 = this.field9491;
        synchronized (this.field9491) {
            if (arg0 < 0 || arg0 > this.field9492) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method3792(arg2, (byte) -15, true, arg0, arg1);
            if (!var6) {
                var6 = this.method3792(arg2, (byte) -15, false, arg0, arg1);
            }
            if (arg3 >= -25) {
                this.method3791((byte) 56, 9);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!lf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9489++;
        return "Cache:" + this.field9495;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)Log;")
    public static final class101 method3794(boolean arg0, int arg1) {
        field9494++;
        class139[] var2 = class588.field8267;
        synchronized (class588.field8267) {
            if (!arg0) {
                method3794(false, -8);
            }
            class101 var3;
            if (class588.field8267.length <= arg1 || class588.field8267[arg1].method796(17494)) {
                var3 = new class101();
                var3.field1361 = new class151[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    var3.field1361[var4] = new class151();
                }
            } else {
                var3 = (class101) class588.field8267[arg1].method803(127);
                var3.method3146(2);
                int var10002 = class300.field3690[arg1]--;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(ILcv;Lcv;I)V")
    public class676(int arg0, class635 arg1, class635 arg2, int arg3) {
        this.field9495 = arg0;
        this.field9493 = arg2;
        this.field9491 = arg1;
        this.field9492 = arg3;
    }
}
