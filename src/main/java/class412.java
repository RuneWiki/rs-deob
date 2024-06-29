import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class412 {

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "I")
    private int field5877 = 65000;

    @OriginalMember(owner = "client!ht", name = "i", descriptor = "Ljv;")
    private class56 field5879 = null;

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "Ljv;")
    private class56 field5875 = null;

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "I")
    private int field5874;

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "Lek;")
    public static class352 field5876 = new class352(512);

    @OriginalMember(owner = "client!ht", name = "j", descriptor = "Lup;")
    public static class181 field5880;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!ht", name = "h", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!ht", name = "k", descriptor = "I")
    public static int field5881;

    static {
        new class335(null, "Dieses System darf nicht missbraucht werden!", null, null);
        field5880 = new class181(9, 18);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)[B", line = 8)
    public final byte[] method2438(int arg0, int arg1) {
        field5878++;
        class56 var3 = this.field5875;
        synchronized (this.field5875) {
            try {
                if (((long) (arg1 * 6 + 6)) > this.field5879.method531((byte) -82)) {
                    return null;
                }
                this.field5879.method533(0, (long) (arg1 * 6));
                this.field5879.method537(-1, 0, class191.field2478, 6);
                int var5 = (class191.field2478[1] & 0xFF << 8) + (class191.field2478[0] & 0xFF << 16) + (class191.field2478[2] & 0xFF);
                int var6 = ((class191.field2478[3] & 0xFF) << 16) + (class191.field2478[4] & 0xFF << 8) + (class191.field2478[5] & 0xFF);
                if (var5 < 0 || this.field5877 < var5) {
                    return null;
                } else if (var6 > 0 && ((long) var6) <= (this.field5875.method531((byte) -82) / 520L)) {
                    byte[] var9 = new byte[var5];
                    if (arg0 != 665786192) {
                        return null;
                    }
                    int var11 = 0;
                    int var12 = 0;
                    label76: while (var11 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field5875.method533(arg0 - 665786192, (long) (var6 * 520));
                        int var14 = var5 - var11;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field5875.method537(-1, 0, class191.field2478, var14 + 8);
                        int var15 = (class191.field2478[0] & 0xFF << 8) + (class191.field2478[1] & 0xFF);
                        int var16 = (class191.field2478[2] & 0xFF << 8) + (class191.field2478[3] & 0xFF);
                        int var17 = (class191.field2478[4] & 0xFF << 16) + (class191.field2478[6] & 0xFF) + ((class191.field2478[5] & 0xFF) << 8);
                        int var18 = class191.field2478[7] & 0xFF;
                        if (arg1 == var15 && var12 == var16 && this.field5874 == var18) {
                            if (var17 >= 0 && (this.field5875.method531((byte) -82) / 520L) >= ((long) var17)) {
                                var6 = var17;
                                var12++;
                                int var21 = 0;
                                while (true) {
                                    if (var21 >= var14) {
                                        continue label76;
                                    }
                                    var9[var11++] = class191.field2478[var21 + 8];
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
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(III[B)Z", line = 86)
    public final boolean method2439(int arg0, int arg1, int arg2, byte[] arg3) {
        field5872++;
        class56 var5 = this.field5875;
        synchronized (this.field5875) {
            if (arg1 <= 74) {
                this.method2440((byte) 30, -35, true, 85, null);
            }
            if (arg2 < 0 || arg2 > this.field5877) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method2440((byte) 14, arg0, true, arg2, arg3);
            if (!var6) {
                var6 = this.method2440((byte) 14, arg0, false, arg2, arg3);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(BIZI[B)Z", line = 111)
    private final boolean method2440(byte arg0, int arg1, boolean arg2, int arg3, byte[] arg4) {
        field5881++;
        class56 var6 = this.field5875;
        synchronized (this.field5875) {
            try {
                int var8;
                if (arg2) {
                    if (this.field5879.method531((byte) -82) < (long) (arg1 * 6 + 6)) {
                        return false;
                    }
                    this.field5879.method533(0, (long) (arg1 * 6));
                    this.field5879.method537(-1, 0, class191.field2478, 6);
                    var8 = ((class191.field2478[3] & 0xFF) << 16) + ((class191.field2478[4] & 0xFF << 8) + (class191.field2478[5] & 0xFF));
                    if (var8 <= 0 || ((long) var8) > (this.field5875.method531((byte) -82) / 520L)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field5875.method531((byte) -82) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class191.field2478[4] = (byte) (var8 >> 8);
                class191.field2478[0] = (byte) (arg3 >> 16);
                class191.field2478[2] = (byte) arg3;
                class191.field2478[5] = (byte) var8;
                class191.field2478[3] = (byte) (var8 >> 16);
                class191.field2478[1] = (byte) (arg3 >> 8);
                if (arg0 != 14) {
                    return false;
                }
                this.field5879.method533(0, (long) (arg1 * 6));
                this.field5879.method535(class191.field2478, (byte) -128, 6, 0);
                int var11 = 0;
                int var12 = 0;
                while (arg3 > var11) {
                    int var13 = 0;
                    if (arg2) {
                        label110: {
                            this.field5875.method533(0, (long) (var8 * 520));
                            try {
                                this.field5875.method537(arg0 ^ 0xFFFFFFF1, 0, class191.field2478, 8);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = ((class191.field2478[0] & 0xFF) << 8) + (class191.field2478[1] & 0xFF);
                            var13 = (class191.field2478[6] & 0xFF) + ((class191.field2478[5] & 0xFF) << 8) + (class191.field2478[4] & 0xFF << 16);
                            int var15 = (class191.field2478[2] & 0xFF << 8) + (class191.field2478[3] & 0xFF);
                            int var16 = class191.field2478[7] & 0xFF;
                            if (arg1 == var14 && var12 == var15 && this.field5874 == var16) {
                                if (var13 >= 0 && this.field5875.method531((byte) -82) / 520L >= (long) var13) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg2 = false;
                        var13 = (int) ((this.field5875.method531((byte) -82) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    class191.field2478[2] = (byte) (var12 >> 8);
                    if ((arg3 - var11) <= 512) {
                        var13 = 0;
                    }
                    class191.field2478[1] = (byte) arg1;
                    class191.field2478[3] = (byte) var12;
                    class191.field2478[0] = (byte) (arg1 >> 8);
                    class191.field2478[4] = (byte) (var13 >> 16);
                    class191.field2478[7] = (byte) this.field5874;
                    class191.field2478[5] = (byte) (var13 >> 8);
                    class191.field2478[6] = (byte) var13;
                    this.field5875.method533(arg0 ^ 0xE, (long) (var8 * 520));
                    this.field5875.method535(class191.field2478, (byte) 97, 8, 0);
                    int var19 = arg3 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field5875.method535(arg4, (byte) 80, var19, var11);
                    var11 += var19;
                    var12++;
                    var8 = var13;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ht", name = "toString", descriptor = "()Ljava/lang/String;", line = 240)
    public final String toString() {
        field5871++;
        return "Cache:" + this.field5874;
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(ILjv;Ljv;I)V", line = 308)
    public class412(int arg0, class56 arg1, class56 arg2, int arg3) {
        this.field5875 = arg1;
        this.field5877 = arg3;
        this.field5879 = arg2;
        this.field5874 = arg0;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljava/lang/String;IC)I", line = 265)
    public static final int method2441(String arg0, int arg1, char arg2) {
        field5873++;
        int var3 = 0;
        int var4 = arg0.length();
        int var5 = 0;
        if (arg1 != -29161) {
            method2442(47);
        }
        while (var5 < var4) {
            if (arg0.charAt(var5) == arg2) {
                var3++;
            }
            var5++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V", line = 291)
    public static void method2442(int arg0) {
        field5880 = null;
        if (arg0 != 520) {
            method2441(null, -82, '4');
        }
        field5876 = null;
    }
}
