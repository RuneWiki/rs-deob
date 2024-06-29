import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class188 {

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Lw;")
    private class228 field3476 = null;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Lw;")
    private class228 field3484 = null;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    private int field3492 = 65000;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    private int field3490;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Lvd;")
    public static class222 field3482 = class212.method1357(":clanreq:", 10731);

    @OriginalMember(owner = "client!s", name = "c", descriptor = "Lvd;")
    public static class222 field3478 = class212.method1357("Zu viele Verbindungen von Ihrer Adresse)3", 10731);

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Lvd;")
    public static class222 field3477 = class212.method1357("<br>(X100(U(Y", 10731);

    @OriginalMember(owner = "client!s", name = "l", descriptor = "Lvd;")
    public static class222 field3487 = class212.method1357("(Y", 10731);

    @OriginalMember(owner = "client!s", name = "n", descriptor = "Lvd;")
    public static class222 field3489 = class212.method1357("(Z", 10731);

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Lvd;")
    private static class222 field3485 = class212.method1357(" from your friend list first)3", 10731);

    @OriginalMember(owner = "client!s", name = "h", descriptor = "Lvd;")
    public static class222 field3483 = field3485;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Lme;")
    public static class133 field3480;

    @OriginalMember(owner = "client!s", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3488++;
        return "Cache:" + this.field3490;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z[BIBI)Z")
    private final boolean method1181(boolean arg0, byte[] arg1, int arg2, byte arg3, int arg4) {
        field3486++;
        class228 var6 = this.field3484;
        synchronized (this.field3484) {
            try {
                int var8;
                if (arg0) {
                    if ((long) (arg4 * 6 + 6) > this.field3476.method1504(-1)) {
                        return false;
                    }
                    this.field3476.method1501((byte) -122, (long) (arg4 * 6));
                    this.field3476.method1507(6, class221.field4084, 0, 16759);
                    var8 = ((class221.field4084[3] & 0xFF) << 16) - (-((class221.field4084[4] & 0xFF) << 8) - (class221.field4084[5] & 0xFF));
                    if (var8 <= 0 || (long) var8 > this.field3484.method1504(-1) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field3484.method1504(-1) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                int var10 = -82 / ((arg3 + 3) / 60);
                class221.field4084[0] = (byte) (arg2 >> 16);
                class221.field4084[2] = (byte) arg2;
                class221.field4084[5] = (byte) var8;
                class221.field4084[1] = (byte) (arg2 >> 8);
                class221.field4084[4] = (byte) (var8 >> 8);
                int var11 = 0;
                class221.field4084[3] = (byte) (var8 >> 16);
                int var12 = 0;
                this.field3476.method1501((byte) -102, (long) (arg4 * 6));
                this.field3476.method1496(6, 0, -1, class221.field4084);
                while (var12 < arg2) {
                    int var13 = 0;
                    if (arg0) {
                        label104: {
                            this.field3484.method1501((byte) -80, (long) (var8 * 520));
                            try {
                                this.field3484.method1507(8, class221.field4084, 0, 16759);
                            } catch (EOFException var34) {
                                return true;
                            }
                            var13 = (class221.field4084[6] & 0xFF) + (((class221.field4084[4] & 0xFF) << 16) + ((class221.field4084[5] & 0xFF) << 8));
                            int var14 = ((class221.field4084[2] & 0xFF) << 8) + (class221.field4084[3] & 0xFF);
                            int var15 = class221.field4084[7] & 0xFF;
                            int var16 = ((class221.field4084[0] & 0xFF) << 8) + (class221.field4084[1] & 0xFF);
                            if (arg4 == var16 && var11 == var14 && this.field3490 == var15) {
                                if (var13 >= 0 && this.field3484.method1504(-1) / 520L >= (long) var13) {
                                    break label104;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field3484.method1504(-1) + 519L) / 520L);
                        arg0 = false;
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    class221.field4084[3] = (byte) var11;
                    class221.field4084[2] = (byte) (var11 >> 8);
                    class221.field4084[1] = (byte) arg4;
                    int var19 = arg2 - var12;
                    var11++;
                    class221.field4084[0] = (byte) (arg4 >> 8);
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    if (arg2 - var12 <= 512) {
                        var13 = 0;
                    }
                    class221.field4084[7] = (byte) this.field3490;
                    class221.field4084[5] = (byte) (var13 >> 8);
                    class221.field4084[4] = (byte) (var13 >> 16);
                    class221.field4084[6] = (byte) var13;
                    this.field3484.method1501((byte) -98, (long) (var8 * 520));
                    this.field3484.method1496(8, 0, -1, class221.field4084);
                    this.field3484.method1496(var19, var12, -1, arg1);
                    var8 = var13;
                    var12 += var19;
                }
                return true;
            } catch (IOException var35) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)[B")
    public final byte[] method1182(int arg0, int arg1) {
        field3479++;
        class228 var3 = this.field3484;
        synchronized (this.field3484) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field3476.method1504(-1)) {
                    return null;
                }
                if (arg1 != -1786) {
                    this.field3476 = null;
                }
                this.field3476.method1501((byte) -79, (long) (arg0 * 6));
                this.field3476.method1507(6, class221.field4084, 0, 16759);
                int var5 = ((class221.field4084[1] & 0xFF) << 8) + ((class221.field4084[0] << 16 & 0xFF0000) + (class221.field4084[2] & 0xFF));
                int var6 = ((class221.field4084[4] & 0xFF) << 8) + ((class221.field4084[3] & 0xFF) << 16) + (class221.field4084[5] & 0xFF);
                if (var5 < 0 || var5 > this.field3492) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field3484.method1504(-1) / 520L) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    label72: while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3484.method1501((byte) -104, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3484.method1507(var13 + 8, class221.field4084, 0, 16759);
                        int var14 = ((class221.field4084[0] & 0xFF) << 8) + (class221.field4084[1] & 0xFF);
                        int var15 = ((class221.field4084[2] & 0xFF) << 8) + (class221.field4084[3] & 0xFF);
                        int var16 = class221.field4084[7] & 0xFF;
                        int var17 = (class221.field4084[6] & 0xFF) + ((class221.field4084[4] & 0xFF) << 16) + ((class221.field4084[5] & 0xFF) << 8);
                        if (arg0 == var14 && var11 == var15 && this.field3490 == var16) {
                            if (var17 >= 0 && this.field3484.method1504(arg1 + 1785) / 520L >= (long) var17) {
                                var11++;
                                var6 = var17;
                                int var20 = 0;
                                while (true) {
                                    if (var20 >= var13) {
                                        continue label72;
                                    }
                                    var9[var10++] = class221.field4084[var20 + 8];
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

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I[BII)Z")
    public final boolean method1183(int arg0, byte[] arg1, int arg2, int arg3) {
        field3491++;
        class228 var5 = this.field3484;
        synchronized (this.field3484) {
            if (arg3 < 0 || this.field3492 < arg3) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1181(true, arg1, arg3, (byte) 75, arg2);
            int var7 = 95 / ((arg0 + 21) / 33);
            if (!var6) {
                var6 = this.method1181(false, arg1, arg3, (byte) -79, arg2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method1184(int arg0) {
        field3485 = null;
        field3489 = null;
        field3480 = null;
        field3477 = null;
        field3478 = null;
        if (arg0 > -64) {
            field3477 = null;
        }
        field3483 = null;
        field3487 = null;
        field3482 = null;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(ILw;Lw;I)V")
    public class188(int arg0, class228 arg1, class228 arg2, int arg3) {
        this.field3490 = arg0;
        this.field3492 = arg3;
        this.field3484 = arg1;
        this.field3476 = arg2;
    }
}
