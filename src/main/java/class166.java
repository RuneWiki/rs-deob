import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class166 {

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Lsa;")
    private class260 field3079 = null;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "Lsa;")
    private class260 field3088 = null;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    private int field3082 = 65000;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    private int field3078;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "Lid;")
    public static class149 field3080 = class60.method382("Lade Schrifts-=tze )2 ", (byte) 44);

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field3086 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "Lgk;")
    public static class157 field3083 = new class157();

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "[I")
    public static int[] field3090 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "Lid;")
    public static class149 field3091 = class60.method382("<br>", (byte) 13);

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II[BB)Z")
    public final boolean method1211(int arg0, int arg1, byte[] arg2, byte arg3) {
        field3085++;
        class260 var5 = this.field3079;
        synchronized (this.field3079) {
            if (arg0 < 0 || this.field3082 < arg0) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1212(arg1, arg0, (byte) 104, true, arg2);
            if (arg3 != 57) {
                this.field3088 = null;
            }
            if (!var6) {
                var6 = this.method1212(arg1, arg0, (byte) 122, false, arg2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIBZ[B)Z")
    private final boolean method1212(int arg0, int arg1, byte arg2, boolean arg3, byte[] arg4) {
        field3089++;
        class260 var6 = this.field3079;
        synchronized (this.field3079) {
            try {
                int var7 = 111 % ((66 - arg2) / 37);
                int var8;
                if (arg3) {
                    if ((long) (arg0 * 6 + 6) > this.field3088.method1793(0)) {
                        return false;
                    }
                    this.field3088.method1792((long) (arg0 * 6), -115);
                    this.field3088.method1791(6, class43.field662, (byte) 121, 0);
                    var8 = ((class43.field662[3] & 0xFF) << 16) + (class43.field662[4] & 0xFF << 8) + (class43.field662[5] & 0xFF);
                    if (var8 <= 0 || (long) var8 > this.field3079.method1793(0) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field3079.method1793(0) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class43.field662[4] = (byte) (var8 >> 8);
                class43.field662[1] = (byte) (arg1 >> 8);
                class43.field662[5] = (byte) var8;
                class43.field662[2] = (byte) arg1;
                class43.field662[0] = (byte) (arg1 >> 16);
                int var11 = 0;
                class43.field662[3] = (byte) (var8 >> 16);
                this.field3088.method1792((long) (arg0 * 6), -117);
                int var12 = 0;
                this.field3088.method1794((byte) 50, 0, class43.field662, 6);
                while (var11 < arg1) {
                    int var13 = 0;
                    if (arg3) {
                        label105: {
                            this.field3079.method1792((long) (var8 * 520), -124);
                            try {
                                this.field3079.method1791(8, class43.field662, (byte) 122, 0);
                            } catch (EOFException var34) {
                                return true;
                            }
                            var13 = ((class43.field662[4] & 0xFF) << 16) - (-((class43.field662[5] & 0xFF) << 8) - (class43.field662[6] & 0xFF));
                            int var14 = ((class43.field662[0] & 0xFF) << 8) + (class43.field662[1] & 0xFF);
                            int var15 = (class43.field662[2] & 0xFF << 8) + (class43.field662[3] & 0xFF);
                            int var16 = class43.field662[7] & 0xFF;
                            if (arg0 == var14 && var12 == var15 && this.field3078 == var16) {
                                if (var13 >= 0 && (this.field3079.method1793(0) / 520L) >= ((long) var13)) {
                                    break label105;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg3 = false;
                        var13 = (int) ((this.field3079.method1793(0) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    class43.field662[3] = (byte) var12;
                    class43.field662[0] = (byte) (arg0 >> 8);
                    if (arg1 - var11 <= 512) {
                        var13 = 0;
                    }
                    class43.field662[7] = (byte) this.field3078;
                    class43.field662[4] = (byte) (var13 >> 16);
                    class43.field662[1] = (byte) arg0;
                    class43.field662[2] = (byte) (var12 >> 8);
                    int var19 = arg1 - var11;
                    var12++;
                    class43.field662[6] = (byte) var13;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    class43.field662[5] = (byte) (var13 >> 8);
                    this.field3079.method1792((long) (var8 * 520), -118);
                    var8 = var13;
                    this.field3079.method1794((byte) 50, 0, class43.field662, 8);
                    this.field3079.method1794((byte) 50, var11, arg4, var19);
                    var11 += var19;
                }
                return true;
            } catch (IOException var35) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3081++;
        return "Cache:" + this.field3078;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
    public static void method1213(byte arg0) {
        field3080 = null;
        if (arg0 != 14) {
            method1213((byte) 99);
        }
        field3091 = null;
        field3090 = null;
        field3083 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)[B")
    public final byte[] method1214(int arg0, int arg1) {
        field3087++;
        class260 var3 = this.field3079;
        synchronized (this.field3079) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field3088.method1793(arg0 ^ 0xFF00)) {
                    return null;
                }
                this.field3088.method1792((long) (arg1 * 6), -127);
                this.field3088.method1791(6, class43.field662, (byte) -64, 0);
                int var5 = ((class43.field662[0] & 0xFF) << 16) + (arg0 & class43.field662[1] << 8) + (class43.field662[2] & 0xFF);
                int var6 = (class43.field662[5] & 0xFF) + ((class43.field662[4] & 0xFF) << 8) + ((class43.field662[3] & 0xFF) << 16);
                if (var5 < 0 || var5 > this.field3082) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field3079.method1793(0) / 520L) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3079.method1792((long) (var6 * 520), -119);
                        this.field3079.method1791(var13 + 8, class43.field662, (byte) 101, 0);
                        int var14 = ((class43.field662[0] & 0xFF) << 8) + (class43.field662[1] & 0xFF);
                        int var15 = ((class43.field662[2] & 0xFF) << 8) + (class43.field662[3] & 0xFF);
                        int var16 = (class43.field662[6] & 0xFF) + (class43.field662[5] & 0xFF << 8) + (class43.field662[4] & 0xFF << 16);
                        int var17 = class43.field662[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field3078 == var17) {
                            if (var16 >= 0 && ((long) var16) <= (this.field3079.method1793(0) / 520L)) {
                                var6 = var16;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class43.field662[var20 + 8];
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

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(ILsa;Lsa;I)V")
    public class166(int arg0, class260 arg1, class260 arg2, int arg3) {
        this.field3079 = arg1;
        this.field3082 = arg3;
        this.field3088 = arg2;
        this.field3078 = arg0;
    }
}
