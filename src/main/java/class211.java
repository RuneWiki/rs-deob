import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class211 {

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "Lda;")
    private class189 field3169 = null;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "Lda;")
    private class189 field3164 = null;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    private int field3171 = 65000;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    private int field3166;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field3170 = 0;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "Z")
    public static volatile boolean field3174 = true;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field3168;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
    public static void method1350(int arg0) {
        field3168 = null;
        if (arg0 != 11173) {
            method1350(71);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II[BI)Z")
    public final boolean method1351(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg1 != 14346) {
            this.method1352(91, (byte[]) null, false, -10, -109);
        }
        field3172++;
        class189 var5 = this.field3169;
        synchronized (this.field3169) {
            if (arg3 < 0 || arg3 > this.field3171) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1352(arg3, arg2, true, arg1 ^ 0x380E, arg0);
            if (!var6) {
                var6 = this.method1352(arg3, arg2, false, 4, arg0);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I[BZII)Z")
    private final boolean method1352(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4) {
        field3167++;
        class189 var6 = this.field3169;
        synchronized (this.field3169) {
            try {
                int var7;
                if (arg2) {
                    if (((long) (arg4 * 6 + 6)) > this.field3164.method1180(-1)) {
                        return false;
                    }
                    this.field3164.method1187((long) (arg4 * 6), (byte) 59);
                    this.field3164.method1183(6, class49.field790, false, 0);
                    var7 = ((class49.field790[4] & 0xFF) << 8) + ((class49.field790[3] & 0xFF << 16) + (class49.field790[5] & 0xFF));
                    if (var7 <= 0 || this.field3169.method1180(-1) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field3169.method1180(-1) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class49.field790[3] = (byte) (var7 >> 16);
                class49.field790[2] = (byte) arg0;
                class49.field790[5] = (byte) var7;
                class49.field790[0] = (byte) (arg0 >> 16);
                class49.field790[arg3] = (byte) (var7 >> 8);
                class49.field790[1] = (byte) (arg0 >> 8);
                this.field3164.method1187((long) (arg4 * 6), (byte) 81);
                this.field3164.method1188(class49.field790, -1, 0, 6);
                int var10 = 0;
                int var11 = 0;
                while (arg0 > var10) {
                    int var12 = 0;
                    if (arg2) {
                        label105: {
                            this.field3169.method1187((long) (var7 * 520), (byte) 105);
                            try {
                                this.field3169.method1183(8, class49.field790, false, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = ((class49.field790[4] & 0xFF) << 16) + (class49.field790[6] & 0xFF) + (class49.field790[5] & 0xFF << 8);
                            int var13 = (class49.field790[0] & 0xFF << 8) + (class49.field790[1] & 0xFF);
                            int var14 = class49.field790[7] & 0xFF;
                            int var15 = ((class49.field790[2] & 0xFF) << 8) + (class49.field790[3] & 0xFF);
                            if (arg4 == var13 && var11 == var15 && this.field3166 == var14) {
                                if (var12 >= 0 && ((long) var12) <= (this.field3169.method1180(-1) / 520L)) {
                                    break label105;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg2 = false;
                        var12 = (int) ((this.field3169.method1180(-1) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class49.field790[3] = (byte) var11;
                    if ((arg0 - var10) <= 512) {
                        var12 = 0;
                    }
                    class49.field790[4] = (byte) (var12 >> 16);
                    class49.field790[1] = (byte) arg4;
                    class49.field790[0] = (byte) (arg4 >> 8);
                    class49.field790[5] = (byte) (var12 >> 8);
                    class49.field790[2] = (byte) (var11 >> 8);
                    class49.field790[6] = (byte) var12;
                    var11++;
                    int var18 = arg0 - var10;
                    class49.field790[7] = (byte) this.field3166;
                    this.field3169.method1187((long) (var7 * 520), (byte) 102);
                    this.field3169.method1188(class49.field790, arg3 - 5, 0, 8);
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field3169.method1188(arg1, arg3 - 5, var10, var18);
                    var10 += var18;
                    var7 = var12;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BI)[B")
    public final byte[] method1353(byte arg0, int arg1) {
        field3165++;
        class189 var3 = this.field3169;
        synchronized (this.field3169) {
            try {
                if (this.field3164.method1180(-1) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field3164.method1187((long) (arg1 * 6), (byte) 59);
                this.field3164.method1183(6, class49.field790, false, 0);
                int var5 = (class49.field790[2] & 0xFF) + ((class49.field790[1] & 0xFF) << 8) + (class49.field790[0] & 0xFF << 16);
                int var6 = ((class49.field790[3] & 0xFF) << 16) + (class49.field790[5] & 0xFF) + ((class49.field790[4] & 0xFF) << 8);
                if (var5 < 0 || this.field3171 < var5) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field3169.method1180(-1) / 520L) {
                    int var9 = 0;
                    if (arg0 <= 101) {
                        this.method1353((byte) -47, -117);
                    }
                    byte[] var10 = new byte[var5];
                    int var11 = 0;
                    while (var9 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3169.method1187((long) (var6 * 520), (byte) 52);
                        int var13 = var5 - var9;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3169.method1183(var13 + 8, class49.field790, false, 0);
                        int var14 = (class49.field790[0] & 0xFF << 8) + (class49.field790[1] & 0xFF);
                        int var15 = (class49.field790[6] & 0xFF) + ((class49.field790[4] & 0xFF) << 16) + ((class49.field790[5] & 0xFF) << 8);
                        int var16 = ((class49.field790[2] & 0xFF) << 8) + (class49.field790[3] & 0xFF);
                        int var17 = class49.field790[7] & 0xFF;
                        if (arg1 == var14 && var11 == var16 && this.field3166 == var17) {
                            if (var15 >= 0 && (this.field3169.method1180(-1) / 520L) >= ((long) var15)) {
                                var11++;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var10[var9++] = class49.field790[var20 + 8];
                                }
                                var6 = var15;
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
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3173++;
        return "Cache:" + this.field3166;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(ILda;Lda;I)V")
    public class211(int arg0, class189 arg1, class189 arg2, int arg3) {
        this.field3169 = arg1;
        this.field3164 = arg2;
        this.field3171 = arg3;
        this.field3166 = arg0;
    }
}
