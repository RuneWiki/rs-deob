import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class195 {

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    private int field3405 = 65000;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Lbe;")
    private class218 field3407 = null;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "Lbe;")
    private class218 field3412 = null;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    private int field3402;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field3408 = 0;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static volatile int field3406 = 0;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "Lsc;")
    public static class181 field3404 = class149.method967(255, " <col=ffff00>");

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IB)[B")
    public final byte[] method1329(int arg0, byte arg1) {
        field3403++;
        class218 var3 = this.field3412;
        synchronized (this.field3412) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field3407.method1446(-1095)) {
                    return null;
                }
                this.field3407.method1456(false, (long) (arg0 * 6));
                this.field3407.method1454((byte) 75, 6, class209.field3591, 0);
                int var5 = (class209.field3591[2] & 0xFF) + (class209.field3591[1] & 0xFF << 8) + (class209.field3591[0] & 0xFF << 16);
                int var6 = (class209.field3591[3] & 0xFF << 16) + ((class209.field3591[4] & 0xFF) << 8) + (class209.field3591[5] & 0xFF);
                if (var5 < 0 || var5 > this.field3405) {
                    return null;
                } else if (var6 > 0 && ((long) var6) <= (this.field3412.method1446(-1095) / 520L)) {
                    byte[] var9 = new byte[var5];
                    if (arg1 >= -125) {
                        this.method1329(-37, (byte) -119);
                    }
                    int var10 = 0;
                    int var11 = 0;
                    while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3412.method1456(false, (long) (var6 * 520));
                        this.field3412.method1454((byte) 110, var13 + 8, class209.field3591, 0);
                        int var14 = ((class209.field3591[2] & 0xFF) << 8) + (class209.field3591[3] & 0xFF);
                        int var15 = ((class209.field3591[0] & 0xFF) << 8) + (class209.field3591[1] & 0xFF);
                        int var16 = class209.field3591[7] & 0xFF;
                        int var17 = ((class209.field3591[5] & 0xFF) << 8) + (class209.field3591[4] & 0xFF << 16) + (class209.field3591[6] & 0xFF);
                        if (arg0 == var15 && var11 == var14 && this.field3402 == var16) {
                            if (var17 >= 0 && (long) var17 <= this.field3412.method1446(-1095) / 520L) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class209.field3591[var20 + 8];
                                }
                                var11++;
                                var6 = var17;
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

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)V")
    public static final void method1330(int arg0, int arg1) {
        field3411++;
        class212.field3655.method1796(20, arg0);
        if (arg1 != 255) {
            method1332(114);
        }
        class170.field2848.method1796(arg1 - 235, arg0);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I[BIIZ)Z")
    private final boolean method1331(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        field3409++;
        class218 var6 = this.field3412;
        synchronized (this.field3412) {
            try {
                int var7;
                if (arg4) {
                    if ((long) (arg3 * 6 + 6) > this.field3407.method1446(-1095)) {
                        return false;
                    }
                    this.field3407.method1456(false, (long) (arg3 * 6));
                    this.field3407.method1454((byte) 108, 6, class209.field3591, 0);
                    var7 = (class209.field3591[3] & 0xFF << 16) - (-(class209.field3591[4] & 0xFF << 8) - (class209.field3591[5] & 0xFF));
                    if (var7 <= 0 || (long) var7 > this.field3412.method1446(-1095) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field3412.method1446(-1095) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class209.field3591[5] = (byte) var7;
                class209.field3591[3] = (byte) (var7 >> 16);
                int var10 = arg0;
                class209.field3591[0] = (byte) (arg2 >> 16);
                int var11 = 0;
                class209.field3591[1] = (byte) (arg2 >> 8);
                class209.field3591[4] = (byte) (var7 >> 8);
                class209.field3591[2] = (byte) arg2;
                this.field3407.method1456(false, (long) (arg3 * 6));
                this.field3407.method1448(6, class209.field3591, (byte) 120, 0);
                while (var11 < arg2) {
                    int var12 = 0;
                    if (arg4) {
                        label105: {
                            this.field3412.method1456(false, (long) (var7 * 520));
                            try {
                                this.field3412.method1454((byte) 81, 8, class209.field3591, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class209.field3591[0] & 0xFF << 8) + (class209.field3591[1] & 0xFF);
                            int var14 = (class209.field3591[2] & 0xFF << 8) + (class209.field3591[3] & 0xFF);
                            int var15 = class209.field3591[7] & 0xFF;
                            var12 = (class209.field3591[6] & 0xFF) + ((class209.field3591[4] & 0xFF) << 16) + (class209.field3591[5] & 0xFF << 8);
                            if (arg3 == var13 && var10 == var14 && this.field3402 == var15) {
                                if (var12 >= 0 && this.field3412.method1446(-1095) / 520L >= (long) var12) {
                                    break label105;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field3412.method1446(-1095) + 519L) / 520L);
                        arg4 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class209.field3591[3] = (byte) var10;
                    if (arg2 - var11 <= 512) {
                        var12 = 0;
                    }
                    class209.field3591[5] = (byte) (var12 >> 8);
                    class209.field3591[7] = (byte) this.field3402;
                    class209.field3591[0] = (byte) (arg3 >> 8);
                    class209.field3591[6] = (byte) var12;
                    class209.field3591[1] = (byte) arg3;
                    class209.field3591[2] = (byte) (var10 >> 8);
                    int var18 = arg2 - var11;
                    class209.field3591[4] = (byte) (var12 >> 16);
                    this.field3412.method1456(false, (long) (var7 * 520));
                    var10++;
                    this.field3412.method1448(8, class209.field3591, (byte) 108, 0);
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    var7 = var12;
                    this.field3412.method1448(var18, arg1, (byte) 124, var11);
                    var11 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static void method1332(int arg0) {
        field3404 = null;
        if (arg0 != 29546) {
            method1330(33, -37);
        }
    }

    @OriginalMember(owner = "client!lg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3401++;
        return "Cache:" + this.field3402;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I[BII)Z")
    public final boolean method1333(int arg0, byte[] arg1, int arg2, int arg3) {
        field3410++;
        class218 var5 = this.field3412;
        synchronized (this.field3412) {
            if (arg2 < 0 || this.field3405 < arg2) {
                throw new IllegalArgumentException();
            } else if (arg3 <= 47) {
                return true;
            } else {
                boolean var7 = this.method1331(0, arg1, arg2, arg0, true);
                if (!var7) {
                    var7 = this.method1331(0, arg1, arg2, arg0, false);
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(ILbe;Lbe;I)V")
    public class195(int arg0, class218 arg1, class218 arg2, int arg3) {
        this.field3407 = arg2;
        this.field3405 = arg3;
        this.field3402 = arg0;
        this.field3412 = arg1;
    }
}
