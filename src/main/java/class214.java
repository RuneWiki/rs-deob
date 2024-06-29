import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class214 {

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    private int field3905 = 65000;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Lbb;")
    private class14 field3907 = null;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Lbb;")
    private class14 field3906 = null;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    private int field3909;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "[I")
    public static int[] field3904 = new int[5];

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field3910 = -1;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)[B")
    public final byte[] method1332(byte arg0, int arg1) {
        field3912++;
        class14 var3 = this.field3906;
        synchronized (this.field3906) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field3907.method73(-1)) {
                    return null;
                }
                if (arg0 != -90) {
                    this.field3907 = null;
                }
                this.field3907.method68(0, (long) (arg1 * 6));
                this.field3907.method69(0, -1, class30.field467, 6);
                int var5 = ((class30.field467[4] & 0xFF) << 8) + ((class30.field467[3] & 0xFF) << 16) + (class30.field467[5] & 0xFF);
                int var6 = ((class30.field467[0] & 0xFF) << 16) - (-((class30.field467[1] & 0xFF) << 8) - (class30.field467[2] & 0xFF));
                if (var6 < 0 || this.field3905 < var6) {
                    return null;
                } else if (var5 > 0 && (long) var5 <= this.field3906.method73(arg0 + 89) / 520L) {
                    byte[] var9 = new byte[var6];
                    int var10 = 0;
                    int var11 = 0;
                    while (var6 > var11) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field3906.method68(0, (long) (var5 * 520));
                        int var13 = var6 - var11;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3906.method69(0, arg0 ^ 0x59, class30.field467, var13 + 8);
                        int var14 = ((class30.field467[0] & 0xFF) << 8) + (class30.field467[1] & 0xFF);
                        int var15 = ((class30.field467[5] & 0xFF) << 8) + (class30.field467[4] << 16 & 0xFF0000) + (class30.field467[6] & 0xFF);
                        int var16 = class30.field467[7] & 0xFF;
                        int var17 = ((class30.field467[2] & 0xFF) << 8) + (class30.field467[3] & 0xFF);
                        if (arg1 == var14 && var10 == var17 && this.field3909 == var16) {
                            if (var15 >= 0 && (long) var15 <= this.field3906.method73(arg0 + 89) / 520L) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var11++] = class30.field467[var20 + 8];
                                }
                                var10++;
                                var5 = var15;
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

    @OriginalMember(owner = "client!u", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3913++;
        return "Cache:" + this.field3909;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static void method1333(int arg0) {
        field3904 = null;
        if (arg0 != -5688) {
            method1336(-4, -122);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public static final void method1334(byte arg0) {
        class182.field3339.method778((byte) 104);
        field3914++;
        if (arg0 != -75) {
            method1334((byte) -42);
        }
        class95.field1685.method1137(6902);
        class9.field94.method778((byte) 120);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([BIZII)Z")
    private final boolean method1335(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field3902++;
        class14 var6 = this.field3906;
        synchronized (this.field3906) {
            try {
                int var7;
                if (arg2) {
                    if ((long) (arg4 * 6 + 6) > this.field3907.method73(-1)) {
                        return false;
                    }
                    this.field3907.method68(0, (long) (arg4 * 6));
                    this.field3907.method69(0, -1, class30.field467, 6);
                    var7 = (class30.field467[5] & 0xFF) + ((class30.field467[3] & 0xFF) << 16) + ((class30.field467[4] & 0xFF) << 8);
                    if (var7 <= 0 || this.field3906.method73(arg3 - 6) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field3906.method73(-1) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class30.field467[0] = (byte) (arg1 >> 16);
                class30.field467[4] = (byte) (var7 >> 8);
                class30.field467[3] = (byte) (var7 >> 16);
                class30.field467[arg3] = (byte) var7;
                class30.field467[1] = (byte) (arg1 >> 8);
                class30.field467[2] = (byte) arg1;
                this.field3907.method68(0, (long) (arg4 * 6));
                this.field3907.method75(6, 0, arg3 - 4, class30.field467);
                int var10 = 0;
                int var11 = 0;
                while (arg1 > var10) {
                    int var12 = 0;
                    if (arg2) {
                        label105: {
                            this.field3906.method68(0, (long) (var7 * 520));
                            try {
                                this.field3906.method69(0, -1, class30.field467, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = class30.field467[7] & 0xFF;
                            int var14 = ((class30.field467[2] & 0xFF) << 8) + (class30.field467[3] & 0xFF);
                            int var15 = ((class30.field467[0] & 0xFF) << 8) + (class30.field467[1] & 0xFF);
                            var12 = (class30.field467[6] & 0xFF) + ((class30.field467[4] & 0xFF) << 16) + ((class30.field467[5] & 0xFF) << 8);
                            if (arg4 == var15 && var11 == var14 && this.field3909 == var13) {
                                if (var12 >= 0 && this.field3906.method73(arg3 ^ 0xFFFFFFFA) / 520L >= (long) var12) {
                                    break label105;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    int var18 = arg1 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field3906.method73(arg3 - 6) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        arg2 = false;
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class30.field467[7] = (byte) this.field3909;
                    class30.field467[3] = (byte) var11;
                    class30.field467[0] = (byte) (arg4 >> 8);
                    class30.field467[1] = (byte) arg4;
                    if (arg1 - var10 <= 512) {
                        var12 = 0;
                    }
                    class30.field467[6] = (byte) var12;
                    class30.field467[5] = (byte) (var12 >> 8);
                    class30.field467[2] = (byte) (var11 >> 8);
                    class30.field467[4] = (byte) (var12 >> 16);
                    var11++;
                    this.field3906.method68(0, (long) (var7 * 520));
                    var7 = var12;
                    this.field3906.method75(8, 0, 1, class30.field467);
                    this.field3906.method75(var18, var10, 1, arg0);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)V")
    public static final void method1336(int arg0, int arg1) {
        field3903++;
        if (arg1 != -26564) {
            method1336(-19, 41);
        }
        if (class137.method933(256, arg0)) {
            class116.method784(arg1 ^ 0xFFFF9803, -1, class97.field1866[arg0]);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II[BI)Z")
    public final boolean method1337(int arg0, int arg1, byte[] arg2, int arg3) {
        field3908++;
        class14 var5 = this.field3906;
        synchronized (this.field3906) {
            if (arg1 < 0 || this.field3905 < arg1) {
                throw new IllegalArgumentException();
            }
            if (arg3 >= -21) {
                this.field3909 = -38;
            }
            boolean var6 = this.method1335(arg2, arg1, true, 5, arg0);
            if (!var6) {
                var6 = this.method1335(arg2, arg1, false, 5, arg0);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(ILbb;Lbb;I)V")
    public class214(int arg0, class14 arg1, class14 arg2, int arg3) {
        this.field3909 = arg0;
        this.field3907 = arg2;
        this.field3905 = arg3;
        this.field3906 = arg1;
    }
}
