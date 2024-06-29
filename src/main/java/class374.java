import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class374 {

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    private int field4856 = 65000;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Lup;")
    private class275 field4859 = null;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "Lup;")
    private class275 field4863 = null;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    private int field4866;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "[Liu;")
    public static class424[] field4864 = new class424[14];

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Z")
    public static boolean field4865 = false;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Lpi;")
    public static class340 field4861 = new class340(56, 7);

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "[[I")
    public static int[][] field4867 = new int[128][128];

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "[I")
    public static int[] field4857;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)[B")
    public final byte[] method2186(int arg0, byte arg1) {
        field4858++;
        class275 var3 = this.field4863;
        synchronized (this.field4863) {
            try {
                if (this.field4859.method1692(3645) < ((long) (arg0 * 6 + 6))) {
                    return null;
                }
                this.field4859.method1689(26, (long) (arg0 * 6));
                this.field4859.method1695(class60.field785, 22393, 6, 0);
                int var5 = (class60.field785[2] & 0xFF) + ((class60.field785[0] & 0xFF) << 16) + (class60.field785[1] & 0xFF << 8);
                int var6 = (class60.field785[5] & 0xFF) + ((class60.field785[3] & 0xFF) << 16) + (class60.field785[4] & 0xFF << 8);
                if (var5 < 0 || var5 > this.field4856) {
                    return null;
                } else if (var6 > 0 && ((long) var6) <= (this.field4863.method1692(3645) / 520L)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field4863.method1689(-125, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field4863.method1695(class60.field785, 22393, var13 + 8, 0);
                        int var14 = ((class60.field785[0] & 0xFF) << 8) + (class60.field785[1] & 0xFF);
                        int var15 = (class60.field785[2] & 0xFF << 8) + (class60.field785[3] & 0xFF);
                        int var16 = ((class60.field785[5] & 0xFF) << 8) + ((class60.field785[4] & 0xFF) << 16) + (class60.field785[6] & 0xFF);
                        int var17 = class60.field785[7] & 0xFF;
                        if (arg0 == var14 && var11 == var15 && this.field4866 == var17) {
                            if (var16 >= 0 && ((long) var16) <= (this.field4863.method1692(3645) / 520L)) {
                                var11++;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class60.field785[var20 + 8];
                                }
                                var6 = var16;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    int var21 = 23 / ((arg1 + 41) / 36);
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var40) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4855++;
        return "Cache:" + this.field4866;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI[BI)Z")
    public final boolean method2187(byte arg0, int arg1, byte[] arg2, int arg3) {
        field4860++;
        class275 var5 = this.field4863;
        synchronized (this.field4863) {
            if (arg3 < 0 || arg3 > this.field4856) {
                throw new IllegalArgumentException();
            }
            if (arg0 < 100) {
                method2188((byte) -64);
            }
            boolean var6 = this.method2189(arg2, arg3, true, (byte) 53, arg1);
            if (!var6) {
                var6 = this.method2189(arg2, arg3, false, (byte) 53, arg1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public static void method2188(byte arg0) {
        field4861 = null;
        field4867 = null;
        if (arg0 != -57) {
            method2188((byte) -36);
        }
        field4857 = null;
        field4864 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([BIZBI)Z")
    private final boolean method2189(byte[] arg0, int arg1, boolean arg2, byte arg3, int arg4) {
        field4862++;
        class275 var6 = this.field4863;
        synchronized (this.field4863) {
            try {
                int var7;
                if (arg2) {
                    if (((long) (arg4 * 6 + 6)) > this.field4859.method1692(arg3 + 3592)) {
                        return false;
                    }
                    this.field4859.method1689(-119, (long) (arg4 * 6));
                    this.field4859.method1695(class60.field785, 22393, 6, 0);
                    var7 = (class60.field785[3] & 0xFF << 16) - (-(class60.field785[4] & 0xFF << 8) - (class60.field785[5] & 0xFF));
                    if (var7 <= 0 || this.field4863.method1692(3645) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field4863.method1692(arg3 ^ 0xE08) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                if (arg3 != 53) {
                    this.method2189(null, -112, true, (byte) 44, -38);
                }
                class60.field785[2] = (byte) arg1;
                class60.field785[4] = (byte) (var7 >> 8);
                class60.field785[3] = (byte) (var7 >> 16);
                class60.field785[0] = (byte) (arg1 >> 16);
                class60.field785[5] = (byte) var7;
                class60.field785[1] = (byte) (arg1 >> 8);
                this.field4859.method1689(-127, (long) (arg4 * 6));
                this.field4859.method1688(class60.field785, 0, 6, 94);
                int var10 = 0;
                int var11 = 0;
                while (var10 < arg1) {
                    int var12 = 0;
                    if (arg2) {
                        label109: {
                            this.field4863.method1689(-115, (long) (var7 * 520));
                            try {
                                this.field4863.method1695(class60.field785, 22393, 8, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class60.field785[0] & 0xFF) << 8) + (class60.field785[1] & 0xFF);
                            var12 = ((class60.field785[4] & 0xFF) << 16) + ((class60.field785[5] & 0xFF) << 8) + (class60.field785[6] & 0xFF);
                            int var14 = (class60.field785[2] & 0xFF << 8) + (class60.field785[3] & 0xFF);
                            int var15 = class60.field785[7] & 0xFF;
                            if (arg4 == var13 && var11 == var14 && this.field4866 == var15) {
                                if (var12 >= 0 && (this.field4863.method1692(3645) / 520L) >= ((long) var12)) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg2 = false;
                        var12 = (int) ((this.field4863.method1692(3645) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class60.field785[1] = (byte) arg4;
                    if ((arg1 - var10) <= 512) {
                        var12 = 0;
                    }
                    class60.field785[3] = (byte) var11;
                    class60.field785[2] = (byte) (var11 >> 8);
                    class60.field785[0] = (byte) (arg4 >> 8);
                    class60.field785[4] = (byte) (var12 >> 16);
                    class60.field785[7] = (byte) this.field4866;
                    class60.field785[5] = (byte) (var12 >> 8);
                    class60.field785[6] = (byte) var12;
                    this.field4863.method1689(-124, (long) (var7 * 520));
                    this.field4863.method1688(class60.field785, 0, 8, -29);
                    int var18 = arg1 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field4863.method1688(arg0, var10, var18, -115);
                    var11++;
                    var10 += var18;
                    var7 = var12;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(ILup;Lup;I)V")
    public class374(int arg0, class275 arg1, class275 arg2, int arg3) {
        this.field4866 = arg0;
        this.field4859 = arg2;
        this.field4863 = arg1;
        this.field4856 = arg3;
    }
}
