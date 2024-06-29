import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class110 {

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "Lud;")
    private class235 field2208 = null;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    private int field2214 = 65000;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "Lud;")
    private class235 field2218 = null;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    private int field2215;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field2204 = 0;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "Lsg;")
    public static class30 field2209 = class167.method1221((byte) 33, "::tele ");

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field2202 = 0;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "[I")
    public static int[] field2211 = new int[100];

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "Lsg;")
    public static class30 field2219 = class167.method1221((byte) 33, "Clientscript error in: ");

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "Lgj;")
    public static class192 field2220 = null;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "[Lbj;")
    public static class44[] field2207;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII)V")
    public static final void method867(int arg0, int arg1, int arg2, int arg3) {
        field2217++;
        class31 var4 = class122.method931(arg1, (byte) 125, arg3);
        if (var4 != null && var4.field669 != null) {
            class183 var5 = new class183();
            var5.field3369 = var4;
            var5.field3363 = var4.field669;
            class104.method835(var5, (byte) 41);
        }
        class125.field2445 = arg1;
        class195.field3514 = arg2;
        if (arg0 != -28279) {
            field2216 = 127;
        }
        class175.field3258 = true;
        class210.field3772 = arg3;
        class254.method1771(var4, 8);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I[BII)Z")
    public final boolean method868(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 != -1427226832) {
            return false;
        }
        field2206++;
        class235 var5 = this.field2218;
        synchronized (this.field2218) {
            if (arg3 < 0 || this.field2214 < arg3) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method873(arg2, arg3, true, -1119776472, arg1);
            if (!var6) {
                var6 = this.method873(arg2, arg3, false, arg0 ^ 0x17AFAE18, arg1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!vd", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2212++;
        return "Cache:" + this.field2215;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)[B")
    public final byte[] method869(int arg0, int arg1) {
        field2203++;
        class235 var3 = this.field2218;
        synchronized (this.field2218) {
            try {
                if (this.field2208.method1668(97) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field2208.method1677(0, (long) (arg1 * 6));
                this.field2208.method1672(0, class133.field2615, 6, true);
                int var5 = ((class133.field2615[0] & arg0) << 16) + (class133.field2615[1] & 0xFF << 8) + (class133.field2615[2] & 0xFF);
                int var6 = (class133.field2615[3] & 0xFF << 16) + ((class133.field2615[4] & 0xFF) << 8) + (class133.field2615[5] & 0xFF);
                if (var5 < 0 || this.field2214 < var5) {
                    return null;
                } else if (var6 > 0 && (this.field2218.method1668(56) / 520L) >= ((long) var6)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        int var13 = var5 - var10;
                        this.field2218.method1677(0, (long) (var6 * 520));
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field2218.method1672(0, class133.field2615, var13 + 8, true);
                        int var14 = (class133.field2615[0] & 0xFF << 8) + (class133.field2615[1] & 0xFF);
                        int var15 = ((class133.field2615[2] & 0xFF) << 8) + (class133.field2615[3] & 0xFF);
                        int var16 = (class133.field2615[5] & 0xFF << 8) + (class133.field2615[4] & 0xFF << 16) + (class133.field2615[6] & 0xFF);
                        int var17 = class133.field2615[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field2215 == var17) {
                            if (var16 >= 0 && (long) var16 <= this.field2218.method1668(arg0 - 308) / 520L) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class133.field2615[var20 + 8];
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

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lig;")
    public static final class148 method870(Throwable arg0, String arg1) {
        field2213++;
        class148 var2;
        if (arg0 instanceof class148) {
            var2 = (class148) arg0;
            var2.field2830 = var2.field2830 + ' ' + arg1;
        } else {
            var2 = new class148(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public static void method871(byte arg0) {
        field2219 = null;
        field2207 = null;
        field2209 = null;
        field2211 = null;
        if (arg0 == -42) {
            field2220 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIII)I")
    public static final int method872(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2205++;
        int var7 = arg1 & 0x3;
        if ((arg0 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg3;
            arg3 = var8;
        }
        if (~var7 == arg6) {
            return arg2;
        } else if (var7 == 1) {
            return arg4;
        } else if (var7 == 2) {
            return 7 - (arg5 - 1) - arg2;
        } else {
            return 1 + 7 - arg4 - arg3;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIZI[B)Z")
    private final boolean method873(int arg0, int arg1, boolean arg2, int arg3, byte[] arg4) {
        field2210++;
        class235 var6 = this.field2218;
        synchronized (this.field2218) {
            try {
                int var8;
                if (arg2) {
                    if (this.field2208.method1668(-44) < (long) (arg0 * 6 + 6)) {
                        return false;
                    }
                    this.field2208.method1677(0, (long) (arg0 * 6));
                    this.field2208.method1672(0, class133.field2615, 6, true);
                    var8 = (class133.field2615[5] & 0xFF) + (class133.field2615[4] & 0xFF << 8) + (class133.field2615[3] & 0xFF << 16);
                    if (var8 <= 0 || this.field2218.method1668(123) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field2218.method1668(-62) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class133.field2615[1] = (byte) (arg1 >> 8);
                class133.field2615[5] = (byte) var8;
                class133.field2615[2] = (byte) arg1;
                int var10 = 0;
                class133.field2615[4] = (byte) (var8 >> 8);
                class133.field2615[3] = (byte) (var8 >> 16);
                class133.field2615[0] = (byte) (arg1 >> 16);
                this.field2208.method1677(arg3 ^ arg3, (long) (arg0 * 6));
                this.field2208.method1675(0, (byte) -117, class133.field2615, 6);
                int var11 = 0;
                while (arg1 > var10) {
                    int var12 = 0;
                    if (arg2) {
                        label104: {
                            this.field2218.method1677(arg3 ^ 0xBD419128, (long) (var8 * 520));
                            try {
                                this.field2218.method1672(0, class133.field2615, 8, true);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = (class133.field2615[5] & 0xFF << 8) + (class133.field2615[4] & 0xFF << 16) + (class133.field2615[6] & 0xFF);
                            int var13 = ((class133.field2615[0] & 0xFF) << 8) + (class133.field2615[1] & 0xFF);
                            int var14 = class133.field2615[7] & 0xFF;
                            int var15 = (class133.field2615[2] & 0xFF << 8) + (class133.field2615[3] & 0xFF);
                            if (arg0 == var13 && var11 == var15 && this.field2215 == var14) {
                                if (var12 >= 0 && (long) var12 <= this.field2218.method1668(-35) / 520L) {
                                    break label104;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    int var18 = arg1 - var10;
                    if (var12 == 0) {
                        arg2 = false;
                        var12 = (int) ((this.field2218.method1668(arg3 ^ 0xBD41914A) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class133.field2615[7] = (byte) this.field2215;
                    class133.field2615[2] = (byte) (var11 >> 8);
                    class133.field2615[1] = (byte) arg0;
                    if (arg1 - var10 <= 512) {
                        var12 = 0;
                    }
                    class133.field2615[5] = (byte) (var12 >> 8);
                    class133.field2615[0] = (byte) (arg0 >> 8);
                    class133.field2615[6] = (byte) var12;
                    class133.field2615[3] = (byte) var11;
                    class133.field2615[4] = (byte) (var12 >> 16);
                    var11++;
                    this.field2218.method1677(0, (long) (var8 * 520));
                    var8 = var12;
                    this.field2218.method1675(0, (byte) -118, class133.field2615, 8);
                    this.field2218.method1675(var10, (byte) -123, arg4, var18);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(ILud;Lud;I)V")
    public class110(int arg0, class235 arg1, class235 arg2, int arg3) {
        this.field2215 = arg0;
        this.field2214 = arg3;
        this.field2218 = arg1;
        this.field2208 = arg2;
    }
}
