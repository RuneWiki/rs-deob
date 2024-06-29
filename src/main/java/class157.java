import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class157 {

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "Ltq;")
    private class537 field2326 = null;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "I")
    private int field2325 = 65000;

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "Ltq;")
    private class537 field2332 = null;

    @OriginalMember(owner = "client!cw", name = "l", descriptor = "I")
    private int field2336;

    @OriginalMember(owner = "client!cw", name = "k", descriptor = "Lada;")
    public static class144 field2335;

    @OriginalMember(owner = "client!cw", name = "m", descriptor = "[I")
    public static int[] field2337;

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!cw", name = "i", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!cw", name = "j", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)V")
    public static final void method1128(byte arg0) {
        field2330++;
        class446.field6245 = false;
        if (arg0 <= -68) {
            class118.method852(class37.field454, class483.field6896, class131.field1805, class340.field4704, true);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(II)I")
    public static final int method1129(int arg0, int arg1) {
        if (arg0 == 1) {
            field2334++;
            return arg1 & 0xFF;
        } else {
            return 90;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(II[BI)Z")
    public final boolean method1130(int arg0, int arg1, byte[] arg2, int arg3) {
        field2329++;
        class537 var5 = this.field2332;
        synchronized (this.field2332) {
            if (arg3 != 16035) {
                this.method1131(97, 96, 38, null, true);
            }
            if (arg1 < 0 || arg1 > this.field2325) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1131(arg1, arg0, 25533, arg2, true);
            if (!var6) {
                var6 = this.method1131(arg1, arg0, arg3 + 9498, arg2, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!cw", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2327++;
        return "Cache:" + this.field2336;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(III[BZ)Z")
    private final boolean method1131(int arg0, int arg1, int arg2, byte[] arg3, boolean arg4) {
        field2333++;
        class537 var6 = this.field2332;
        synchronized (this.field2332) {
            try {
                int var8;
                if (arg4) {
                    if (((long) (arg1 * 6 + 6)) > this.field2326.method3255((byte) -82)) {
                        return false;
                    }
                    this.field2326.method3253((byte) 126, (long) (arg1 * 6));
                    this.field2326.method3260(0, class588.field8721, (byte) -67, 6);
                    var8 = ((class588.field8721[3] & 0xFF) << 16) + ((class588.field8721[4] & 0xFF) << 8) + (class588.field8721[5] & 0xFF);
                    if (var8 <= 0 || this.field2332.method3255((byte) -99) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field2332.method3255((byte) -56) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class588.field8721[5] = (byte) var8;
                class588.field8721[3] = (byte) (var8 >> 16);
                class588.field8721[4] = (byte) (var8 >> 8);
                class588.field8721[1] = (byte) (arg0 >> 8);
                class588.field8721[0] = (byte) (arg0 >> 16);
                class588.field8721[2] = (byte) arg0;
                this.field2326.method3253((byte) 125, (long) (arg1 * 6));
                if (arg2 != 25533) {
                    this.field2336 = -34;
                }
                this.field2326.method3261(0, (byte) -52, class588.field8721, 6);
                int var10 = 0;
                int var11 = 0;
                while (var10 < arg0) {
                    int var12 = 0;
                    if (arg4) {
                        label108: {
                            this.field2332.method3253((byte) 126, (long) (var8 * 520));
                            try {
                                this.field2332.method3260(0, class588.field8721, (byte) -106, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class588.field8721[0] & 0xFF << 8) + (class588.field8721[1] & 0xFF);
                            int var14 = (class588.field8721[2] & 0xFF << 8) + (class588.field8721[3] & 0xFF);
                            var12 = ((class588.field8721[4] & 0xFF) << 16) + (class588.field8721[5] & 0xFF << 8) + (class588.field8721[6] & 0xFF);
                            int var15 = class588.field8721[7] & 0xFF;
                            if (arg1 == var13 && var11 == var14 && this.field2336 == var15) {
                                if (var12 >= 0 && ((long) var12) <= (this.field2332.method3255((byte) -70) / 520L)) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg4 = false;
                        var12 = (int) ((this.field2332.method3255((byte) -54) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class588.field8721[3] = (byte) var11;
                    class588.field8721[1] = (byte) arg1;
                    if (arg0 - var10 <= 512) {
                        var12 = 0;
                    }
                    class588.field8721[2] = (byte) (var11 >> 8);
                    class588.field8721[0] = (byte) (arg1 >> 8);
                    class588.field8721[6] = (byte) var12;
                    class588.field8721[5] = (byte) (var12 >> 8);
                    class588.field8721[7] = (byte) this.field2336;
                    class588.field8721[4] = (byte) (var12 >> 16);
                    this.field2332.method3253((byte) 127, (long) (var8 * 520));
                    this.field2332.method3261(0, (byte) -52, class588.field8721, 8);
                    int var18 = arg0 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field2332.method3261(var10, (byte) -52, arg3, var18);
                    var11++;
                    var10 += var18;
                    var8 = var12;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V")
    public static void method1132(int arg0) {
        if (arg0 < 113) {
            field2335 = null;
        }
        field2335 = null;
        field2337 = null;
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(II)[B")
    public final byte[] method1133(int arg0, int arg1) {
        field2328++;
        class537 var3 = this.field2332;
        synchronized (this.field2332) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field2326.method3255((byte) -118)) {
                    return null;
                }
                this.field2326.method3253((byte) 125, (long) (arg1 * 6));
                this.field2326.method3260(0, class588.field8721, (byte) -116, 6);
                int var5 = (class588.field8721[0] & 0xFF << 16) - (-((class588.field8721[1] & 0xFF) << 8) - (class588.field8721[2] & 0xFF));
                int var6 = (class588.field8721[5] & 0xFF) + (((class588.field8721[3] & 0xFF) << 16) + (class588.field8721[4] & 0xFF << 8));
                if (var5 < 0 || var5 > this.field2325) {
                    return null;
                } else if (var6 > 0 && (this.field2332.method3255((byte) -71) / 520L) >= ((long) var6)) {
                    byte[] var9 = new byte[var5];
                    if (arg0 >= -38) {
                        this.field2326 = null;
                    }
                    int var10 = 0;
                    int var11 = 0;
                    while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field2332.method3253((byte) 127, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field2332.method3260(0, class588.field8721, (byte) -102, var13 + 8);
                        int var14 = (class588.field8721[0] & 0xFF << 8) + (class588.field8721[1] & 0xFF);
                        int var15 = ((class588.field8721[2] & 0xFF) << 8) + (class588.field8721[3] & 0xFF);
                        int var16 = ((class588.field8721[4] & 0xFF) << 16) + (class588.field8721[5] & 0xFF << 8) + (class588.field8721[6] & 0xFF);
                        int var17 = class588.field8721[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field2336 == var17) {
                            if (var16 >= 0 && (this.field2332.method3255((byte) -62) / 520L) >= ((long) var16)) {
                                var6 = var16;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class588.field8721[var20 + 8];
                                }
                                var11++;
                                continue;
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

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(ILtq;Ltq;I)V")
    public class157(int arg0, class537 arg1, class537 arg2, int arg3) {
        this.field2336 = arg0;
        this.field2332 = arg1;
        this.field2325 = arg3;
        this.field2326 = arg2;
    }

    static {
        new class572("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
        field2335 = new class144(111, 12);
        field2337 = new int[] { 4, 4, 1, 2, 6, 4, 2, 45, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    }
}
