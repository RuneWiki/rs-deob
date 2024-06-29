import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class270 {

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    private int field3965 = 65000;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "Lip;")
    private class392 field3966 = null;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "Lip;")
    private class392 field3974 = null;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    private int field3970;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "Lpp;")
    public static class464 field3969 = new class464(49, 11);

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "[I")
    public static int[] field3978 = new int[14];

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "Lae;")
    public static class40 field3976;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "Lfa;")
    public static class482 field3977;

    static {
        new class567("From", "Von:", "De", "De");
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V", line = 4)
    public static void method1753(int arg0) {
        field3977 = null;
        field3976 = null;
        if (arg0 != 255) {
            method1756(109);
        }
        field3969 = null;
        field3978 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)[B", line = 21)
    public final byte[] method1754(int arg0, int arg1) {
        field3972++;
        class392 var3 = this.field3966;
        synchronized (this.field3966) {
            try {
                if (this.field3974.method2371(-2726) < ((long) (arg0 * 6 + 6))) {
                    return null;
                }
                this.field3974.method2375((long) (arg0 * 6), (byte) 59);
                if (arg1 <= 37) {
                    field3976 = null;
                }
                this.field3974.method2376(0, 6, class28.field373, -1);
                int var5 = ((class28.field373[0] & 0xFF) << 16) + (class28.field373[1] & 0xFF << 8) + (class28.field373[2] & 0xFF);
                int var6 = (class28.field373[5] & 0xFF) + ((class28.field373[3] & 0xFF) << 16) + (class28.field373[4] & 0xFF << 8);
                if (var5 < 0 || var5 > this.field3965) {
                    return null;
                } else if (var6 > 0 && this.field3966.method2371(-2726) / 520L >= (long) var6) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3966.method2375((long) (var6 * 520), (byte) 59);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3966.method2376(0, var13 + 8, class28.field373, -1);
                        int var14 = (class28.field373[0] & 0xFF << 8) + (class28.field373[1] & 0xFF);
                        int var15 = (class28.field373[2] & 0xFF << 8) + (class28.field373[3] & 0xFF);
                        int var16 = (class28.field373[6] & 0xFF) + ((class28.field373[5] & 0xFF) << 8) + (class28.field373[4] & 0xFF << 16);
                        int var17 = class28.field373[7] & 0xFF;
                        if (arg0 == var14 && var11 == var15 && this.field3970 == var17) {
                            if (var16 >= 0 && ((long) var16) <= (this.field3966.method2371(-2726) / 520L)) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class28.field373[var20 + 8];
                                }
                                var6 = var16;
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

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(ILip;Lip;I)V", line = 303)
    public class270(int arg0, class392 arg1, class392 arg2, int arg3) {
        this.field3970 = arg0;
        this.field3965 = arg3;
        this.field3974 = arg2;
        this.field3966 = arg1;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZII[B)Z", line = 106)
    private final boolean method1755(int arg0, boolean arg1, int arg2, int arg3, byte[] arg4) {
        field3968++;
        class392 var6 = this.field3966;
        synchronized (this.field3966) {
            try {
                int var7;
                if (arg1) {
                    if (this.field3974.method2371(-2726) < ((long) (arg3 * 6 + 6))) {
                        return false;
                    }
                    this.field3974.method2375((long) (arg3 * 6), (byte) 59);
                    this.field3974.method2376(0, 6, class28.field373, -1);
                    var7 = ((class28.field373[3] & 0xFF) << 16) + (class28.field373[4] & 0xFF << 8) + (class28.field373[5] & 0xFF);
                    if (var7 <= 0 || (long) var7 > this.field3966.method2371(-2726) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field3966.method2371(-2726) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class28.field373[5] = (byte) var7;
                class28.field373[1] = (byte) (arg2 >> 8);
                class28.field373[0] = (byte) (arg2 >> 16);
                class28.field373[4] = (byte) (var7 >> 8);
                class28.field373[2] = (byte) arg2;
                class28.field373[3] = (byte) (var7 >> 16);
                this.field3974.method2375((long) (arg3 * 6), (byte) 59);
                this.field3974.method2368(0, class28.field373, 92, 6);
                if (arg0 < 22) {
                    this.method1757(null, (byte) 97, -41, -77);
                }
                int var10 = 0;
                int var11 = 0;
                while (arg2 > var10) {
                    int var12 = 0;
                    if (arg1) {
                        label109: {
                            this.field3966.method2375((long) (var7 * 520), (byte) 59);
                            try {
                                this.field3966.method2376(0, 8, class28.field373, -1);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class28.field373[0] & 0xFF << 8) + (class28.field373[1] & 0xFF);
                            var12 = (class28.field373[6] & 0xFF) + (((class28.field373[4] & 0xFF) << 16) + ((class28.field373[5] & 0xFF) << 8));
                            int var14 = (class28.field373[2] & 0xFF << 8) + (class28.field373[3] & 0xFF);
                            int var15 = class28.field373[7] & 0xFF;
                            if (arg3 == var13 && var11 == var14 && this.field3970 == var15) {
                                if (var12 >= 0 && this.field3966.method2371(-2726) / 520L >= (long) var12) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg1 = false;
                        var12 = (int) ((this.field3966.method2371(-2726) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class28.field373[1] = (byte) arg3;
                    class28.field373[2] = (byte) (var11 >> 8);
                    if (arg2 - var10 <= 512) {
                        var12 = 0;
                    }
                    class28.field373[3] = (byte) var11;
                    class28.field373[0] = (byte) (arg3 >> 8);
                    class28.field373[7] = (byte) this.field3970;
                    class28.field373[6] = (byte) var12;
                    class28.field373[5] = (byte) (var12 >> 8);
                    class28.field373[4] = (byte) (var12 >> 16);
                    this.field3966.method2375((long) (var7 * 520), (byte) 59);
                    this.field3966.method2368(0, class28.field373, -126, 8);
                    int var18 = arg2 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field3966.method2368(var10, arg4, -119, var18);
                    var11++;
                    var7 = var12;
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)Z", line = 234)
    public static final boolean method1756(int arg0) {
        field3967++;
        if (class61.field852) {
            try {
                if ((Boolean) class630.method3564(field3976.field549, "showingVideoAd", (byte) 44)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 < 94) {
            method1756(115);
        }
        return true;
    }

    @OriginalMember(owner = "client!gg", name = "toString", descriptor = "()Ljava/lang/String;", line = 258)
    public final String toString() {
        field3973++;
        return "Cache:" + this.field3970;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([BBII)Z", line = 266)
    public final boolean method1757(byte[] arg0, byte arg1, int arg2, int arg3) {
        field3971++;
        class392 var5 = this.field3966;
        synchronized (this.field3966) {
            if (arg3 < 0 || arg3 > this.field3965) {
                throw new IllegalArgumentException();
            }
            int var6 = 32 / ((arg1 + 45) / 50);
            boolean var7 = this.method1755(61, true, arg3, arg2, arg0);
            if (!var7) {
                var7 = this.method1755(113, false, arg3, arg2, arg0);
            }
            return var7;
        }
    }
}
