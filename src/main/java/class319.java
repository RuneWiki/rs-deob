import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class319 {

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "Llp;")
    private class256 field4796 = null;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "Llp;")
    private class256 field4793 = null;

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
    private int field4801 = 65000;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    private int field4795;

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "[[Z")
    public static boolean[][] field4803 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
    public static int field4797 = 0;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "Lmf;")
    public static class276 field4802;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)V")
    public static void method1996(byte arg0) {
        if (arg0 > -54) {
            field4803 = null;
        }
        field4802 = null;
        field4803 = null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(II[BZI)Z")
    private final boolean method1997(int arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        field4799++;
        class256 var6 = this.field4793;
        synchronized (this.field4793) {
            try {
                int var7;
                if (arg3) {
                    if (this.field4796.method1536(false) < ((long) (arg1 * 6 + 6))) {
                        return false;
                    }
                    this.field4796.method1543((long) (arg1 * 6), (byte) -97);
                    this.field4796.method1542(6, 0, class220.field3380, true);
                    var7 = (class220.field3380[5] & 0xFF) + ((class220.field3380[3] & 0xFF << 16) + (class220.field3380[4] & 0xFF << 8));
                    if (var7 <= 0 || (long) var7 > this.field4793.method1536(false) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field4793.method1536(false) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class220.field3380[5] = (byte) var7;
                class220.field3380[0] = (byte) (arg4 >> 16);
                class220.field3380[4] = (byte) (var7 >> 8);
                class220.field3380[2] = (byte) arg4;
                class220.field3380[1] = (byte) (arg4 >> 8);
                class220.field3380[arg0] = (byte) (var7 >> 16);
                this.field4796.method1543((long) (arg1 * 6), (byte) 34);
                this.field4796.method1534(-15020, 6, class220.field3380, 0);
                int var10 = 0;
                int var11 = 0;
                while (arg4 > var10) {
                    int var12 = 0;
                    if (arg3) {
                        label105: {
                            this.field4793.method1543((long) (var7 * 520), (byte) -79);
                            try {
                                this.field4793.method1542(8, 0, class220.field3380, true);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class220.field3380[0] & 0xFF << 8) + (class220.field3380[1] & 0xFF);
                            int var14 = ((class220.field3380[2] & 0xFF) << 8) + (class220.field3380[3] & 0xFF);
                            var12 = ((class220.field3380[5] & 0xFF) << 8) + (class220.field3380[4] & 0xFF << 16) + (class220.field3380[6] & 0xFF);
                            int var15 = class220.field3380[7] & 0xFF;
                            if (arg1 == var13 && var11 == var14 && this.field4795 == var15) {
                                if (var12 >= 0 && (long) var12 <= this.field4793.method1536(false) / 520L) {
                                    break label105;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field4793.method1536(false) + 519L) / 520L);
                        arg3 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class220.field3380[1] = (byte) arg1;
                    class220.field3380[0] = (byte) (arg1 >> 8);
                    class220.field3380[3] = (byte) var11;
                    class220.field3380[2] = (byte) (var11 >> 8);
                    if (arg4 - var10 <= 512) {
                        var12 = 0;
                    }
                    class220.field3380[6] = (byte) var12;
                    class220.field3380[5] = (byte) (var12 >> 8);
                    class220.field3380[7] = (byte) this.field4795;
                    class220.field3380[4] = (byte) (var12 >> 16);
                    this.field4793.method1543((long) (var7 * 520), (byte) 78);
                    this.field4793.method1534(-15020, 8, class220.field3380, 0);
                    int var18 = arg4 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field4793.method1534(-15020, var18, arg2, var10);
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

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)[B")
    public final byte[] method1998(int arg0, int arg1) {
        field4800++;
        class256 var3 = this.field4793;
        synchronized (this.field4793) {
            try {
                if (this.field4796.method1536(false) < ((long) (arg0 * 6 + 6))) {
                    return null;
                } else if (arg1 < 6) {
                    return null;
                } else {
                    this.field4796.method1543((long) (arg0 * 6), (byte) -109);
                    this.field4796.method1542(6, 0, class220.field3380, true);
                    int var6 = (class220.field3380[2] & 0xFF) + ((class220.field3380[0] & 0xFF << 16) + ((class220.field3380[1] & 0xFF) << 8));
                    int var7 = (class220.field3380[5] & 0xFF) + (((class220.field3380[3] & 0xFF) << 16) + ((class220.field3380[4] & 0xFF) << 8));
                    if (var6 < 0 || var6 > this.field4801) {
                        return null;
                    } else if (var7 > 0 && this.field4793.method1536(false) / 520L >= (long) var7) {
                        byte[] var10 = new byte[var6];
                        int var11 = 0;
                        int var12 = 0;
                        while (var11 < var6) {
                            if (var7 == 0) {
                                return null;
                            }
                            this.field4793.method1543((long) (var7 * 520), (byte) -109);
                            int var14 = var6 - var11;
                            if (var14 > 512) {
                                var14 = 512;
                            }
                            this.field4793.method1542(var14 + 8, 0, class220.field3380, true);
                            int var15 = (class220.field3380[0] & 0xFF << 8) + (class220.field3380[1] & 0xFF);
                            int var16 = (class220.field3380[2] & 0xFF << 8) + (class220.field3380[3] & 0xFF);
                            int var17 = ((class220.field3380[5] & 0xFF) << 8) + ((class220.field3380[4] & 0xFF) << 16) + (class220.field3380[6] & 0xFF);
                            int var18 = class220.field3380[7] & 0xFF;
                            if (arg0 == var15 && var12 == var16 && this.field4795 == var18) {
                                if (var17 >= 0 && this.field4793.method1536(false) / 520L >= (long) var17) {
                                    for (int var21 = 0; var21 < var14; var21++) {
                                        var10[var11++] = class220.field3380[var21 + 8];
                                    }
                                    var12++;
                                    var7 = var17;
                                    continue;
                                }
                                return null;
                            }
                            return null;
                        }
                        return var10;
                    } else {
                        return null;
                    }
                }
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(B)Lbd;")
    public static final class42 method1999(byte arg0) {
        if (arg0 != 119) {
            method1996((byte) 9);
        }
        field4798++;
        try {
            return (class42) Class.forName("wd").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ap", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4804++;
        return "Cache:" + this.field4795;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZ[BI)Z")
    public final boolean method2000(int arg0, boolean arg1, byte[] arg2, int arg3) {
        field4805++;
        class256 var5 = this.field4793;
        synchronized (this.field4793) {
            if (arg3 < 0 || arg3 > this.field4801) {
                throw new IllegalArgumentException();
            }
            if (arg1) {
                this.field4801 = -73;
            }
            boolean var6 = this.method1997(3, arg0, arg2, true, arg3);
            if (!var6) {
                var6 = this.method1997(3, arg0, arg2, false, arg3);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(ILlp;Llp;I)V")
    public class319(int arg0, class256 arg1, class256 arg2, int arg3) {
        this.field4801 = arg3;
        this.field4796 = arg2;
        this.field4795 = arg0;
        this.field4793 = arg1;
    }
}
