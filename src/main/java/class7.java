import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 {

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    private int field118 = 65000;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "Ldb;")
    private class24 field123 = null;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Ldb;")
    private class24 field121 = null;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    private int field124;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Ltd;")
    public static class136 field117 = class145.method1172("RuneScape wurde aktualisiert(Q", 45);

    @OriginalMember(owner = "client!af", name = "f", descriptor = "Ltd;")
    public static class136 field122 = class145.method1172("Die Verbindung konnte", 45);

    @OriginalMember(owner = "client!af", name = "k", descriptor = "Ljava/lang/Object;")
    public static Object field127 = new Object();

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public static int field132 = 0;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "[I")
    public static int[] field133 = new int[32];

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "J")
    public static long field129;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "Lsd;")
    public static class129 field131;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I[BIZI)Z")
    private final boolean method34(int arg0, byte[] arg1, int arg2, boolean arg3, int arg4) {
        field126++;
        class24 var6 = this.field123;
        synchronized (this.field123) {
            try {
                int var8;
                if (arg3) {
                    if (this.field121.method219((byte) -50) < (long) (arg0 * 6 + 6)) {
                        return false;
                    }
                    this.field121.method221((long) (arg0 * 6), (byte) -19);
                    this.field121.method220(class1.field19, 0, 6, (byte) -67);
                    var8 = (class1.field19[5] & 0xFF) + ((class1.field19[4] & 0xFF) << 8) + ((class1.field19[3] & 0xFF) << 16);
                    if (var8 <= 0 || (long) var8 > this.field123.method219((byte) -50) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field123.method219((byte) -50) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class1.field19[1] = (byte) (arg2 >> 8);
                class1.field19[2] = (byte) arg2;
                class1.field19[0] = (byte) (arg2 >> 16);
                int var10 = 0;
                class1.field19[arg4] = (byte) var8;
                class1.field19[3] = (byte) (var8 >> 16);
                class1.field19[4] = (byte) (var8 >> 8);
                this.field121.method221((long) (arg0 * 6), (byte) -86);
                int var11 = 0;
                this.field121.method216(0, 6, class1.field19, 0);
                while (var10 < arg2) {
                    int var12 = 0;
                    if (arg3) {
                        label104: {
                            this.field123.method221((long) (var8 * 520), (byte) -94);
                            try {
                                this.field123.method220(class1.field19, 0, 8, (byte) -116);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = (class1.field19[6] & 0xFF) + ((class1.field19[5] & 0xFF) << 8) + ((class1.field19[4] & 0xFF) << 16);
                            int var13 = ((class1.field19[0] & 0xFF) << 8) + (class1.field19[1] & 0xFF);
                            int var14 = ((class1.field19[2] & 0xFF) << 8) + (class1.field19[3] & 0xFF);
                            int var15 = class1.field19[7] & 0xFF;
                            if (arg0 == var13 && var11 == var14 && this.field124 == var15) {
                                if (var12 >= 0 && (long) var12 <= this.field123.method219((byte) -50) / 520L) {
                                    break label104;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg3 = false;
                        var12 = (int) ((this.field123.method219((byte) -50) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    int var18 = arg2 - var10;
                    class1.field19[1] = (byte) arg0;
                    class1.field19[3] = (byte) var11;
                    class1.field19[2] = (byte) (var11 >> 8);
                    var11++;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class1.field19[0] = (byte) (arg0 >> 8);
                    if (arg2 - var10 <= 512) {
                        var12 = 0;
                    }
                    class1.field19[5] = (byte) (var12 >> 8);
                    class1.field19[7] = (byte) this.field124;
                    class1.field19[6] = (byte) var12;
                    class1.field19[4] = (byte) (var12 >> 16);
                    this.field123.method221((long) (var8 * 520), (byte) -64);
                    this.field123.method216(0, 8, class1.field19, 0);
                    this.field123.method216(var10, var18, arg1, 0);
                    var8 = var12;
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIB[B)Z")
    public final boolean method35(int arg0, int arg1, byte arg2, byte[] arg3) {
        field130++;
        class24 var5 = this.field123;
        synchronized (this.field123) {
            if (arg1 < 0 || arg1 > this.field118) {
                throw new IllegalArgumentException();
            } else if (arg2 == 17) {
                boolean var7 = this.method34(arg0, arg3, arg1, true, 5);
                if (!var7) {
                    var7 = this.method34(arg0, arg3, arg1, false, arg2 ^ 0x14);
                }
                return var7;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
    public static void method36(byte arg0) {
        field117 = null;
        field122 = null;
        if (arg0 <= -103) {
            field127 = null;
            field133 = null;
            field131 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field119++;
        return "Cache:" + this.field124;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)[B")
    public final byte[] method37(int arg0, int arg1) {
        field128++;
        class24 var3 = this.field123;
        synchronized (this.field123) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field121.method219((byte) -50)) {
                    return null;
                }
                this.field121.method221((long) (arg1 * 6), (byte) -91);
                if (arg0 != -13300) {
                    this.field121 = null;
                }
                this.field121.method220(class1.field19, 0, 6, (byte) -17);
                int var5 = ((class1.field19[1] & 0xFF) << 8) + ((class1.field19[0] & 0xFF) << 16) + (class1.field19[2] & 0xFF);
                int var6 = ((class1.field19[3] & 0xFF) << 16) + (class1.field19[5] & 0xFF) + ((class1.field19[4] & 0xFF) << 8);
                if (var5 < 0 || var5 > this.field118) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field123.method219((byte) -50) / 520L) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    label72: while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field123.method221((long) (var6 * 520), (byte) -44);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field123.method220(class1.field19, 0, var13 + 8, (byte) -40);
                        int var14 = ((class1.field19[0] & 0xFF) << 8) + (class1.field19[1] & 0xFF);
                        int var15 = ((class1.field19[2] & 0xFF) << 8) + (class1.field19[3] & 0xFF);
                        int var16 = ((class1.field19[4] & 0xFF) << 16) + (class1.field19[6] & 0xFF) + ((class1.field19[5] & 0xFF) << 8);
                        int var17 = class1.field19[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field124 == var17) {
                            if (var16 >= 0 && this.field123.method219((byte) -50) / 520L >= (long) var16) {
                                var6 = var16;
                                var11++;
                                int var20 = 0;
                                while (true) {
                                    if (var20 >= var13) {
                                        continue label72;
                                    }
                                    var9[var10++] = class1.field19[var20 + 8];
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

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(ILdb;Ldb;I)V")
    public class7(int arg0, class24 arg1, class24 arg2, int arg3) {
        this.field124 = arg0;
        this.field118 = arg3;
        this.field121 = arg2;
        this.field123 = arg1;
    }
}
