import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class463 {

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Lvh;")
    private class626 field6737 = null;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "Lvh;")
    private class626 field6742 = null;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    private int field6741 = 65000;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    private int field6746;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "Ljava/lang/String;")
    public static String field6747 = null;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "Ltm;")
    public static class334 field6736 = new class334(10, -2);

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field6749 = 0;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field6744;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "[I")
    public static int[] field6739;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
    public static void method2833(byte arg0) {
        field6739 = null;
        field6747 = null;
        field6736 = null;
        if (arg0 > -94) {
            field6739 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II[BZI)Z")
    private final boolean method2834(int arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        if (arg1 != -2714) {
            this.method2835(null, -36, 111, (byte) 104);
        }
        field6745++;
        class626 var6 = this.field6742;
        synchronized (this.field6742) {
            try {
                int var7;
                if (arg3) {
                    if (this.field6737.method3537(arg1 ^ 0xFFFFABFD) < (long) (arg0 * 6 + 6)) {
                        return false;
                    }
                    this.field6737.method3545((long) (arg0 * 6), (byte) 70);
                    this.field6737.method3539(class474.field6884, 0, 6, -84);
                    var7 = ((class474.field6884[3] & 0xFF) << 16) + (((class474.field6884[4] & 0xFF) << 8) + (class474.field6884[5] & 0xFF));
                    if (var7 <= 0 || (long) var7 > this.field6742.method3537(24219) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field6742.method3537(24219) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class474.field6884[5] = (byte) var7;
                class474.field6884[2] = (byte) arg4;
                class474.field6884[4] = (byte) (var7 >> 8);
                class474.field6884[0] = (byte) (arg4 >> 16);
                class474.field6884[1] = (byte) (arg4 >> 8);
                class474.field6884[3] = (byte) (var7 >> 16);
                this.field6737.method3545((long) (arg0 * 6), (byte) 70);
                this.field6737.method3544(6, 3589, 0, class474.field6884);
                int var10 = 0;
                int var11 = 0;
                while (arg4 > var10) {
                    int var12 = 0;
                    if (arg3) {
                        label110: {
                            this.field6742.method3545((long) (var7 * 520), (byte) 70);
                            try {
                                this.field6742.method3539(class474.field6884, 0, 8, -119);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class474.field6884[0] & 0xFF) << 8) + (class474.field6884[1] & 0xFF);
                            int var14 = (class474.field6884[2] & 0xFF << 8) + (class474.field6884[3] & 0xFF);
                            var12 = (class474.field6884[6] & 0xFF) + ((class474.field6884[5] & 0xFF) << 8) + (class474.field6884[4] & 0xFF << 16);
                            int var15 = class474.field6884[7] & 0xFF;
                            if (arg0 == var13 && var11 == var14 && this.field6746 == var15) {
                                if (var12 >= 0 && (this.field6742.method3537(24219) / 520L) >= ((long) var12)) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg3 = false;
                        var12 = (int) ((this.field6742.method3537(arg1 ^ 0xFFFFABFD) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class474.field6884[3] = (byte) var11;
                    if (arg4 - var10 <= 512) {
                        var12 = 0;
                    }
                    class474.field6884[2] = (byte) (var11 >> 8);
                    class474.field6884[1] = (byte) arg0;
                    class474.field6884[0] = (byte) (arg0 >> 8);
                    class474.field6884[6] = (byte) var12;
                    class474.field6884[5] = (byte) (var12 >> 8);
                    class474.field6884[4] = (byte) (var12 >> 16);
                    class474.field6884[7] = (byte) this.field6746;
                    this.field6742.method3545((long) (var7 * 520), (byte) 70);
                    this.field6742.method3544(8, 3589, 0, class474.field6884);
                    int var18 = arg4 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field6742.method3544(var18, 3589, var10, arg2);
                    var10 += var18;
                    var7 = var12;
                    var11++;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "([BIIB)Z")
    public final boolean method2835(byte[] arg0, int arg1, int arg2, byte arg3) {
        field6743++;
        class626 var5 = this.field6742;
        synchronized (this.field6742) {
            if (arg3 != 13) {
                this.method2835(null, -65, 51, (byte) 81);
            }
            if (arg2 < 0 || this.field6741 < arg2) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method2834(arg1, -2714, arg0, true, arg2);
            if (!var6) {
                var6 = this.method2834(arg1, arg3 - 2727, arg0, false, arg2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!id", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6744++;
        return "Cache:" + this.field6746;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZI)I")
    public static final int method2836(int arg0, boolean arg1, int arg2) {
        field6748++;
        if (arg2 == 1 || arg2 == 3) {
            return class388.field5818[arg0 & 0x3];
        } else if (arg1) {
            return 65;
        } else {
            return class100.field1479[arg0 & 0x3];
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(ILvh;Lvh;I)V")
    public class463(int arg0, class626 arg1, class626 arg2, int arg3) {
        this.field6737 = arg2;
        this.field6746 = arg0;
        this.field6741 = arg3;
        this.field6742 = arg1;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)[B")
    public final byte[] method2837(int arg0, int arg1) {
        field6740++;
        class626 var3 = this.field6742;
        synchronized (this.field6742) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field6737.method3537(24219)) {
                    return null;
                }
                this.field6737.method3545((long) (arg0 * 6), (byte) 70);
                this.field6737.method3539(class474.field6884, 0, 6, -78);
                int var5 = (class474.field6884[0] & 0xFF << 16) - (-((class474.field6884[1] & 0xFF) << 8) - (class474.field6884[2] & 0xFF));
                int var6 = (class474.field6884[3] & 0xFF << 16) - (-(class474.field6884[4] & 0xFF << 8) - (class474.field6884[arg1] & 0xFF));
                if (var5 < 0 || var5 > this.field6741) {
                    return null;
                } else if (var6 > 0 && ((long) var6) <= (this.field6742.method3537(24219) / 520L)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field6742.method3545((long) (var6 * 520), (byte) 70);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field6742.method3539(class474.field6884, 0, var13 + 8, -103);
                        int var14 = (class474.field6884[0] & 0xFF << 8) + (class474.field6884[1] & 0xFF);
                        int var15 = (class474.field6884[2] & 0xFF << 8) + (class474.field6884[3] & 0xFF);
                        int var16 = ((class474.field6884[4] & 0xFF) << 16) + (class474.field6884[5] & 0xFF << 8) + (class474.field6884[6] & 0xFF);
                        int var17 = class474.field6884[7] & 0xFF;
                        if (arg0 == var14 && var11 == var15 && this.field6746 == var17) {
                            if (var16 >= 0 && (this.field6742.method3537(24219) / 520L) >= ((long) var16)) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class474.field6884[var20 + 8];
                                }
                                var11++;
                                var6 = var16;
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
}
