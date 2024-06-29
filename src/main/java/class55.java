import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class55 {

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Log;")
    private class241 field727 = null;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    private int field738 = 65000;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "Log;")
    private class241 field744 = null;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    private int field729;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static volatile int field737 = -1;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "[[B")
    public static byte[][] field736 = new byte[50][];

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "Lqm;")
    public static class189 field745;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "[Lsh;")
    public static class230[] field741;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)V")
    public static final void method321(int arg0, byte arg1) {
        field730++;
        class102.field1547.method147(arg0, (byte) -123);
        if (arg1 <= 89) {
            method329((byte) -126, (StringBuffer) null, '\t', 23);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
    public static void method322(boolean arg0) {
        field741 = null;
        if (!arg0) {
            method328(-116, -80);
        }
        field745 = null;
        field736 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static final void method323(int arg0) {
        class1.field3 = arg0;
        for (int var1 = 0; var1 < class183.field2835; var1++) {
            for (int var2 = 0; var2 < class90.field1391; var2++) {
                if (class27.field346[arg0][var1][var2] == null) {
                    class27.field346[arg0][var1][var2] = new class154(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
    public static final void method324(int arg0) {
        class192.field3045.method145(-117);
        if (arg0 != 6) {
            field728 = -22;
        }
        class175.field2733.method145(-83);
        field734++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BI)I")
    public static final int method325(byte arg0, int arg1) {
        if (arg0 == -29) {
            field740++;
            return arg1 >>> 10;
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)[B")
    public final byte[] method326(int arg0, int arg1) {
        field739++;
        class241 var3 = this.field727;
        synchronized (this.field727) {
            try {
                if (this.field744.method1688(0) < (long) (arg0 * 6 + 6)) {
                    return null;
                }
                if (arg1 >= -98) {
                    this.method331(99, (byte[]) null, 25, true);
                }
                this.field744.method1679((long) (arg0 * 6), 0);
                this.field744.method1687(0, false, class197.field3125, 6);
                int var5 = (class197.field3125[5] & 0xFF) + ((class197.field3125[3] & 0xFF) << 16) + (class197.field3125[4] & 0xFF << 8);
                int var6 = (class197.field3125[2] & 0xFF) + ((class197.field3125[1] & 0xFF) << 8) + (class197.field3125[0] & 0xFF << 16);
                if (var6 < 0 || this.field738 < var6) {
                    return null;
                } else if (var5 > 0 && this.field727.method1688(0) / 520L >= (long) var5) {
                    byte[] var9 = new byte[var6];
                    int var10 = 0;
                    int var11 = 0;
                    label72: while (var6 > var10) {
                        if (var5 == 0) {
                            return null;
                        }
                        int var13 = var6 - var10;
                        this.field727.method1679((long) (var5 * 520), 0);
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field727.method1687(0, false, class197.field3125, var13 + 8);
                        int var14 = ((class197.field3125[2] & 0xFF) << 8) + (class197.field3125[3] & 0xFF);
                        int var15 = (class197.field3125[0] & 0xFF << 8) + (class197.field3125[1] & 0xFF);
                        int var16 = class197.field3125[7] & 0xFF;
                        int var17 = ((class197.field3125[5] & 0xFF) << 8) + ((class197.field3125[4] & 0xFF) << 16) + (class197.field3125[6] & 0xFF);
                        if (arg0 == var15 && var11 == var14 && this.field729 == var16) {
                            if (var17 >= 0 && (this.field727.method1688(0) / 520L) >= ((long) var17)) {
                                var5 = var17;
                                var11++;
                                int var20 = 0;
                                while (true) {
                                    if (var20 >= var13) {
                                        continue label72;
                                    }
                                    var9[var10++] = class197.field3125[var20 + 8];
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

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([BIIIZ)Z")
    private final boolean method327(byte[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field733++;
        class241 var6 = this.field727;
        synchronized (this.field727) {
            try {
                int var7;
                if (arg4) {
                    if (this.field744.method1688(0) < ((long) (arg3 * 6 + 6))) {
                        return false;
                    }
                    this.field744.method1679((long) (arg3 * 6), 0);
                    this.field744.method1687(0, false, class197.field3125, 6);
                    var7 = (class197.field3125[4] & 0xFF << 8) + (class197.field3125[3] & 0xFF << 16) + (class197.field3125[5] & 0xFF);
                    if (var7 <= 0 || ((long) var7) > (this.field727.method1688(0) / 520L)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field727.method1688(0) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class197.field3125[3] = (byte) (var7 >> 16);
                class197.field3125[5] = (byte) var7;
                class197.field3125[1] = (byte) (arg2 >> 8);
                class197.field3125[4] = (byte) (var7 >> 8);
                class197.field3125[2] = (byte) arg2;
                int var10 = 0;
                class197.field3125[0] = (byte) (arg2 >> 16);
                this.field744.method1679((long) (arg3 * 6), 0);
                this.field744.method1681(6, arg1 ^ 0xFFFF98F4, class197.field3125, 0);
                int var11 = 0;
                while (true) {
                    if (arg2 > var10) {
                        label120: {
                            int var12 = 0;
                            if (arg4) {
                                this.field727.method1679((long) (var7 * 520), 0);
                                try {
                                    this.field727.method1687(0, false, class197.field3125, 8);
                                } catch (EOFException var36) {
                                    break label120;
                                }
                                var12 = (class197.field3125[6] & 0xFF) + ((class197.field3125[5] & 0xFF) << 8) + ((class197.field3125[4] & 0xFF) << 16);
                                int var13 = (class197.field3125[2] & 0xFF << 8) + (class197.field3125[3] & 0xFF);
                                int var14 = ((class197.field3125[0] & 0xFF) << 8) + (class197.field3125[1] & 0xFF);
                                int var15 = class197.field3125[7] & 0xFF;
                                if (arg3 != var14 || var11 != var13 || this.field729 != var15) {
                                    return false;
                                }
                                if (var12 < 0 || (this.field727.method1688(arg1 ^ 0x670B) / 520L) < ((long) var12)) {
                                    return false;
                                }
                            }
                            int var18 = arg2 - var10;
                            if (var12 == 0) {
                                arg4 = false;
                                var12 = (int) ((this.field727.method1688(0) + 519L) / 520L);
                                if (var12 == 0) {
                                    var12++;
                                }
                                if (var7 == var12) {
                                    var12++;
                                }
                            }
                            class197.field3125[0] = (byte) (arg3 >> 8);
                            if (var18 > 512) {
                                var18 = 512;
                            }
                            class197.field3125[3] = (byte) var11;
                            class197.field3125[1] = (byte) arg3;
                            if (arg2 - var10 <= 512) {
                                var12 = 0;
                            }
                            class197.field3125[6] = (byte) var12;
                            class197.field3125[2] = (byte) (var11 >> 8);
                            class197.field3125[4] = (byte) (var12 >> 16);
                            var11++;
                            class197.field3125[5] = (byte) (var12 >> 8);
                            class197.field3125[7] = (byte) this.field729;
                            this.field727.method1679((long) (var7 * 520), 0);
                            var7 = var12;
                            this.field727.method1681(8, -1, class197.field3125, 0);
                            this.field727.method1681(var18, arg1 ^ 0xFFFF98F4, arg0, var10);
                            var10 += var18;
                            continue;
                        }
                    }
                    if (arg1 != 26379) {
                        return true;
                    }
                    return true;
                }
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)V")
    public static final void method328(int arg0, int arg1) {
        if (arg1 != 27736) {
            field745 = null;
        }
        field732++;
        class109.field1668.method147(arg0, (byte) -125);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLjava/lang/StringBuffer;CI)Ljava/lang/StringBuffer;")
    public static final StringBuffer method329(byte arg0, StringBuffer arg1, char arg2, int arg3) {
        if (arg0 != 79) {
            field728 = -105;
        }
        int var4 = arg1.length();
        field731++;
        arg1.setLength(arg3);
        for (int var5 = var4; var5 < arg3; var5++) {
            arg1.setCharAt(var5, arg2);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(JJ)J")
    public static long method330(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I[BIZ)Z")
    public final boolean method331(int arg0, byte[] arg1, int arg2, boolean arg3) {
        field742++;
        class241 var5 = this.field727;
        synchronized (this.field727) {
            if (arg0 < 0 || this.field738 < arg0) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method327(arg1, 26379, arg0, arg2, arg3);
            if (!var6) {
                var6 = this.method327(arg1, 26379, arg0, arg2, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!nh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field735++;
        return "Cache:" + this.field729;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(ILog;Log;I)V")
    public class55(int arg0, class241 arg1, class241 arg2, int arg3) {
        this.field738 = arg3;
        this.field744 = arg2;
        this.field727 = arg1;
        this.field729 = arg0;
    }
}
