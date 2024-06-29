import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class415 {

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "Lal;")
    private class198 field6167 = null;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "Lal;")
    private class198 field6169 = null;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    private int field6170 = 65000;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    private int field6159;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field6165 = 328;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "Lwl;")
    public static class452 field6162 = new class452(9, 6);

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "[I")
    public static int[] field6171 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field6158;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field6163;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field6166;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field6168;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BILiq;)Lgo;")
    public static final class272 method2588(byte arg0, int arg1, class134 arg2) {
        field6158++;
        byte[] var3 = arg2.method825(arg1, 0);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 < 121) {
                method2588((byte) 60, -31, (class134) null);
            }
            return new class272(var3);
        }
    }

    @OriginalMember(owner = "client!uj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6161++;
        return "Cache:" + this.field6159;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public static void method2589(int arg0) {
        field6171 = null;
        field6162 = null;
        if (arg0 != 1) {
            method2589(62);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIII)I")
    public static final int method2590(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field6163++;
        if (arg0 > -84) {
            return -25;
        } else if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 1023 - arg3;
        } else if (var4 == 2) {
            return 1023 - arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I[BBIZ)Z")
    private final boolean method2591(int arg0, byte[] arg1, byte arg2, int arg3, boolean arg4) {
        field6168++;
        class198 var6 = this.field6167;
        synchronized (this.field6167) {
            try {
                int var7;
                if (arg4) {
                    if ((long) (arg0 * 6 + 6) > this.field6169.method1177(76)) {
                        return false;
                    }
                    this.field6169.method1189((long) (arg0 * 6), (byte) 83);
                    this.field6169.method1183(0, true, class466.field6859, 6);
                    var7 = ((class466.field6859[4] & 0xFF) << 8) + (class466.field6859[3] & 0xFF << 16) + (class466.field6859[5] & 0xFF);
                    if (var7 <= 0 || (long) var7 > this.field6167.method1177(82) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field6167.method1177(112) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class466.field6859[1] = (byte) (arg3 >> 8);
                class466.field6859[5] = (byte) var7;
                class466.field6859[2] = (byte) arg3;
                if (arg2 >= -16) {
                    return false;
                }
                class466.field6859[4] = (byte) (var7 >> 8);
                class466.field6859[0] = (byte) (arg3 >> 16);
                class466.field6859[3] = (byte) (var7 >> 16);
                this.field6169.method1189((long) (arg0 * 6), (byte) 83);
                this.field6169.method1179(false, 0, 6, class466.field6859);
                int var11 = 0;
                int var12 = 0;
                while (arg3 > var11) {
                    int var13 = 0;
                    if (arg4) {
                        label110: {
                            this.field6167.method1189((long) (var7 * 520), (byte) 83);
                            try {
                                this.field6167.method1183(0, true, class466.field6859, 8);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = ((class466.field6859[0] & 0xFF) << 8) + (class466.field6859[1] & 0xFF);
                            int var15 = ((class466.field6859[2] & 0xFF) << 8) + (class466.field6859[3] & 0xFF);
                            var13 = (class466.field6859[6] & 0xFF) + ((class466.field6859[5] & 0xFF) << 8) + ((class466.field6859[4] & 0xFF) << 16);
                            int var16 = class466.field6859[7] & 0xFF;
                            if (arg0 == var14 && var12 == var15 && this.field6159 == var16) {
                                if (var13 >= 0 && (this.field6167.method1177(107) / 520L) >= ((long) var13)) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg4 = false;
                        var13 = (int) ((this.field6167.method1177(117) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var7 == var13) {
                            var13++;
                        }
                    }
                    class466.field6859[3] = (byte) var12;
                    class466.field6859[2] = (byte) (var12 >> 8);
                    class466.field6859[0] = (byte) (arg0 >> 8);
                    class466.field6859[1] = (byte) arg0;
                    if (arg3 - var11 <= 512) {
                        var13 = 0;
                    }
                    class466.field6859[7] = (byte) this.field6159;
                    class466.field6859[5] = (byte) (var13 >> 8);
                    class466.field6859[6] = (byte) var13;
                    class466.field6859[4] = (byte) (var13 >> 16);
                    this.field6167.method1189((long) (var7 * 520), (byte) 83);
                    this.field6167.method1179(false, 0, 8, class466.field6859);
                    int var19 = arg3 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field6167.method1179(false, var11, var19, arg1);
                    var11 += var19;
                    var12++;
                    var7 = var13;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)[B")
    public final byte[] method2592(int arg0, int arg1) {
        field6166++;
        class198 var3 = this.field6167;
        synchronized (this.field6167) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field6169.method1177(68)) {
                    return null;
                }
                this.field6169.method1189((long) (arg0 * 6), (byte) 83);
                this.field6169.method1183(0, true, class466.field6859, 6);
                int var5 = (class466.field6859[2] & 0xFF) + ((class466.field6859[0] & 0xFF << 16) + (class466.field6859[1] & 0xFF << 8));
                int var6 = (class466.field6859[5] & 0xFF) + (class466.field6859[4] & 0xFF << 8) + (class466.field6859[3] & 0xFF << 16);
                if (var5 < 0 || var5 > this.field6170) {
                    return null;
                } else if (var6 > 0 && this.field6167.method1177(101) / 520L >= (long) var6) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = -69 % ((arg1 - 86) / 32);
                    int var12 = 0;
                    label70: while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field6167.method1189((long) (var6 * 520), (byte) 83);
                        int var14 = var5 - var10;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field6167.method1183(0, true, class466.field6859, var14 + 8);
                        int var15 = ((class466.field6859[0] & 0xFF) << 8) + (class466.field6859[1] & 0xFF);
                        int var16 = (class466.field6859[2] & 0xFF << 8) + (class466.field6859[3] & 0xFF);
                        int var17 = (class466.field6859[6] & 0xFF) + ((class466.field6859[4] & 0xFF << 16) + ((class466.field6859[5] & 0xFF) << 8));
                        int var18 = class466.field6859[7] & 0xFF;
                        if (arg0 == var15 && var12 == var16 && this.field6159 == var18) {
                            if (var17 >= 0 && ((long) var17) <= (this.field6167.method1177(84) / 520L)) {
                                var6 = var17;
                                var12++;
                                int var21 = 0;
                                while (true) {
                                    if (var14 <= var21) {
                                        continue label70;
                                    }
                                    var9[var10++] = class466.field6859[var21 + 8];
                                    var21++;
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
            } catch (IOException var40) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I[BII)Z")
    public final boolean method2593(int arg0, byte[] arg1, int arg2, int arg3) {
        field6164++;
        int var5 = -113 / ((arg3 - 49) / 63);
        class198 var6 = this.field6167;
        synchronized (this.field6167) {
            if (arg2 < 0 || this.field6170 < arg2) {
                throw new IllegalArgumentException();
            }
            boolean var7 = this.method2591(arg0, arg1, (byte) -125, arg2, true);
            if (!var7) {
                var7 = this.method2591(arg0, arg1, (byte) -28, arg2, false);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(ILal;Lal;I)V")
    public class415(int arg0, class198 arg1, class198 arg2, int arg3) {
        this.field6167 = arg1;
        this.field6159 = arg0;
        this.field6169 = arg2;
        this.field6170 = arg3;
    }
}
