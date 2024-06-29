import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 {

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    private int field145 = 65000;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "Lbc;")
    private class15 field137 = null;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "Lbc;")
    private class15 field149 = null;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    private int field147;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Ldj;")
    public static class44 field144 = class89.method650(255, "und Ihr Passwort ein)3");

    @OriginalMember(owner = "client!af", name = "h", descriptor = "Ldj;")
    private static class44 field143 = class89.method650(255, "Error connecting to server)3");

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public static int field151 = 0;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    public static int field152 = 500;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "Ldj;")
    public static class44 field138 = field143;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "Lve;")
    public static class225 field153;

    @OriginalMember(owner = "client!af", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field148++;
        return "Cache:" + this.field147;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II[BI)Z")
    public final boolean method72(int arg0, int arg1, byte[] arg2, int arg3) {
        field141++;
        if (arg0 != 32570) {
            this.method72(-5, -62, null, -23);
        }
        class15 var5 = this.field149;
        synchronized (this.field149) {
            if (arg1 < 0 || this.field145 < arg1) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method73(arg2, true, arg1, (byte) -74, arg3);
            if (!var6) {
                var6 = this.method73(arg2, false, arg1, (byte) -65, arg3);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([BZIBI)Z")
    private final boolean method73(byte[] arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        field139++;
        class15 var6 = this.field149;
        synchronized (this.field149) {
            try {
                int var7;
                if (arg1) {
                    if ((long) (arg4 * 6 + 6) > this.field137.method137((byte) -58)) {
                        return false;
                    }
                    this.field137.method130((long) (arg4 * 6), (byte) 89);
                    this.field137.method138(0, 6, class211.field3767, 0);
                    var7 = (class211.field3767[5] & 0xFF) + ((class211.field3767[3] & 0xFF) << 16) + ((class211.field3767[4] & 0xFF) << 8);
                    if (var7 <= 0 || this.field149.method137((byte) -58) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field149.method137((byte) -58) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class211.field3767[3] = (byte) (var7 >> 16);
                class211.field3767[4] = (byte) (var7 >> 8);
                class211.field3767[1] = (byte) (arg2 >> 8);
                class211.field3767[5] = (byte) var7;
                class211.field3767[2] = (byte) arg2;
                class211.field3767[0] = (byte) (arg2 >> 16);
                int var10 = 0;
                if (arg3 >= -53) {
                    field150 = 119;
                }
                this.field137.method130((long) (arg4 * 6), (byte) 89);
                this.field137.method136(6, 0, class211.field3767, (byte) 88);
                int var11 = 0;
                while (arg2 > var10) {
                    int var12 = 0;
                    if (arg1) {
                        label108: {
                            this.field149.method130((long) (var7 * 520), (byte) 89);
                            try {
                                this.field149.method138(0, 8, class211.field3767, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class211.field3767[0] & 0xFF) << 8) + (class211.field3767[1] & 0xFF);
                            var12 = ((class211.field3767[4] & 0xFF) << 16) - (-((class211.field3767[5] & 0xFF) << 8) - (class211.field3767[6] & 0xFF));
                            int var14 = class211.field3767[7] & 0xFF;
                            int var15 = ((class211.field3767[2] & 0xFF) << 8) + (class211.field3767[3] & 0xFF);
                            if (arg4 == var13 && var11 == var15 && this.field147 == var14) {
                                if (var12 >= 0 && (long) var12 <= this.field149.method137((byte) -58) / 520L) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg1 = false;
                        var12 = (int) ((this.field149.method137((byte) -58) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class211.field3767[1] = (byte) arg4;
                    if (arg2 - var10 <= 512) {
                        var12 = 0;
                    }
                    class211.field3767[5] = (byte) (var12 >> 8);
                    class211.field3767[2] = (byte) (var11 >> 8);
                    class211.field3767[0] = (byte) (arg4 >> 8);
                    class211.field3767[3] = (byte) var11;
                    class211.field3767[7] = (byte) this.field147;
                    class211.field3767[6] = (byte) var12;
                    var11++;
                    class211.field3767[4] = (byte) (var12 >> 16);
                    this.field149.method130((long) (var7 * 520), (byte) 89);
                    var7 = var12;
                    this.field149.method136(8, 0, class211.field3767, (byte) 88);
                    int var18 = arg2 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field149.method136(var18, var10, arg0, (byte) 88);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILva;)V")
    public static final void method74(int arg0, class221 arg1) {
        if (arg0 != 25345) {
            field150 = 10;
        }
        field142++;
        class97.field1784 = arg1;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static void method75(int arg0) {
        if (arg0 != 536129096) {
            method76(-107, (byte) -44);
        }
        field144 = null;
        field138 = null;
        field143 = null;
        field153 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)I")
    public static final int method76(int arg0, byte arg1) {
        if (arg1 > -32) {
            method76(-44, (byte) -95);
        }
        field146++;
        return arg0 == 16711935 ? -1 : class146.method955(arg0, -69);
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(IB)[B")
    public final byte[] method77(int arg0, byte arg1) {
        if (arg1 < 64) {
            return null;
        }
        field136++;
        class15 var3 = this.field149;
        synchronized (this.field149) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field137.method137((byte) -58)) {
                    return null;
                }
                this.field137.method130((long) (arg0 * 6), (byte) 89);
                this.field137.method138(0, 6, class211.field3767, 0);
                int var5 = ((class211.field3767[3] & 0xFF) << 16) + (class211.field3767[5] & 0xFF) + ((class211.field3767[4] & 0xFF) << 8);
                int var6 = (class211.field3767[2] & 0xFF) + ((class211.field3767[0] & 0xFF) << 16) + ((class211.field3767[1] & 0xFF) << 8);
                if (var6 < 0 || var6 > this.field145) {
                    return null;
                } else if (var5 > 0 && this.field149.method137((byte) -58) / 520L >= (long) var5) {
                    byte[] var9 = new byte[var6];
                    int var10 = 0;
                    int var11 = 0;
                    while (var10 < var6) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field149.method130((long) (var5 * 520), (byte) 89);
                        int var13 = var6 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field149.method138(0, var13 + 8, class211.field3767, 0);
                        int var14 = ((class211.field3767[2] & 0xFF) << 8) + (class211.field3767[3] & 0xFF);
                        int var15 = class211.field3767[7] & 0xFF;
                        int var16 = ((class211.field3767[4] & 0xFF) << 16) + ((class211.field3767[5] & 0xFF) << 8) + (class211.field3767[6] & 0xFF);
                        int var17 = ((class211.field3767[0] & 0xFF) << 8) + (class211.field3767[1] & 0xFF);
                        if (arg0 == var17 && var11 == var14 && this.field147 == var15) {
                            if (var16 >= 0 && this.field149.method137((byte) -58) / 520L >= (long) var16) {
                                var11++;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class211.field3767[var20 + 8];
                                }
                                var5 = var16;
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

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(ILbc;Lbc;I)V")
    public class7(int arg0, class15 arg1, class15 arg2, int arg3) {
        this.field137 = arg2;
        this.field145 = arg3;
        this.field149 = arg1;
        this.field147 = arg0;
    }
}
