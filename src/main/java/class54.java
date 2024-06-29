import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class54 {

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "Lwd;")
    private class23 field860 = null;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Lwd;")
    private class23 field853 = null;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    private int field862 = 65000;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    private int field864;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Z")
    public static boolean field854 = false;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "[Lsj;")
    public static class50[] field850 = new class50[14];

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "Lub;")
    public static class92 field861;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Ljava/lang/String;")
    public static String field852;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "[Lig;")
    public static class9[] field863;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method456(String arg0, int arg1) {
        field855++;
        if (arg1 != 0) {
            method457(72);
        }
        int var2 = class260.method1747((byte) 110, arg0);
        return var2 == -1 ? "" : class260.method1743(" ", "<br>", class183.field2895.field4797[var2], -1);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static void method457(int arg0) {
        field852 = null;
        field850 = null;
        if (arg0 != 65000) {
            field850 = null;
        }
        field863 = null;
        field861 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)[B")
    public final byte[] method458(int arg0, int arg1) {
        field856++;
        class23 var3 = this.field853;
        synchronized (this.field853) {
            try {
                if (arg0 != 7) {
                    field863 = null;
                }
                if ((long) (arg1 * 6 + 6) > this.field860.method204(15914854)) {
                    return null;
                }
                this.field860.method201((long) (arg1 * 6), (byte) 92);
                this.field860.method200(-1, 6, class294.field4570, 0);
                int var5 = (class294.field4570[2] & 0xFF) + ((class294.field4570[1] & 0xFF) << 8) + (class294.field4570[0] & 0xFF << 16);
                int var6 = (class294.field4570[3] & 0xFF << 16) + ((class294.field4570[4] & 0xFF) << 8) + (class294.field4570[5] & 0xFF);
                if (var5 < 0 || this.field862 < var5) {
                    return null;
                } else if (var6 > 0 && (this.field853.method204(arg0 + 15914847) / 520L) >= ((long) var6)) {
                    int var9 = 0;
                    int var10 = 0;
                    byte[] var11 = new byte[var5];
                    while (var5 > var9) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field853.method201((long) (var6 * 520), (byte) 64);
                        int var13 = var5 - var9;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field853.method200(-1, var13 + 8, class294.field4570, 0);
                        int var14 = ((class294.field4570[0] & 0xFF) << 8) + (class294.field4570[1] & 0xFF);
                        int var15 = class294.field4570[7] & 0xFF;
                        int var16 = ((class294.field4570[2] & 0xFF) << 8) + (class294.field4570[3] & 0xFF);
                        int var17 = ((class294.field4570[4] & 0xFF) << 16) + (class294.field4570[6] & 0xFF) + (class294.field4570[5] & 0xFF << 8);
                        if (arg1 == var14 && var10 == var16 && this.field864 == var15) {
                            if (var17 >= 0 && ((long) var17) <= (this.field853.method204(arg0 ^ 0xF2D761) / 520L)) {
                                var6 = var17;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var11[var9++] = class294.field4570[var20 + 8];
                                }
                                var10++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var11;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[BBZI)Z")
    private final boolean method459(int arg0, byte[] arg1, byte arg2, boolean arg3, int arg4) {
        field851++;
        class23 var6 = this.field853;
        synchronized (this.field853) {
            try {
                int var7;
                if (arg3) {
                    if (this.field860.method204(15914854) < ((long) (arg4 * 6 + 6))) {
                        return false;
                    }
                    this.field860.method201((long) (arg4 * 6), (byte) -62);
                    this.field860.method200(-1, 6, class294.field4570, 0);
                    var7 = (class294.field4570[4] & 0xFF << 8) + (class294.field4570[3] & 0xFF << 16) + (class294.field4570[5] & 0xFF);
                    if (var7 <= 0 || this.field853.method204(15914854) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field853.method204(15914854) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class294.field4570[5] = (byte) var7;
                class294.field4570[2] = (byte) arg0;
                class294.field4570[4] = (byte) (var7 >> 8);
                class294.field4570[1] = (byte) (arg0 >> 8);
                class294.field4570[0] = (byte) (arg0 >> 16);
                if (arg2 < 54) {
                    return true;
                }
                int var11 = 0;
                class294.field4570[3] = (byte) (var7 >> 16);
                int var12 = 0;
                this.field860.method201((long) (arg4 * 6), (byte) -101);
                this.field860.method202(class294.field4570, 6, false, 0);
                while (var11 < arg0) {
                    int var13 = 0;
                    if (arg3) {
                        label110: {
                            this.field853.method201((long) (var7 * 520), (byte) 74);
                            try {
                                this.field853.method200(-1, 8, class294.field4570, 0);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = ((class294.field4570[0] & 0xFF) << 8) + (class294.field4570[1] & 0xFF);
                            var13 = ((class294.field4570[5] & 0xFF) << 8) + ((class294.field4570[4] & 0xFF) << 16) + (class294.field4570[6] & 0xFF);
                            int var15 = class294.field4570[7] & 0xFF;
                            int var16 = ((class294.field4570[2] & 0xFF) << 8) + (class294.field4570[3] & 0xFF);
                            if (arg4 == var14 && var12 == var16 && this.field864 == var15) {
                                if (var13 >= 0 && (this.field853.method204(15914854) / 520L) >= ((long) var13)) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg3 = false;
                        var13 = (int) ((this.field853.method204(15914854) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var7 == var13) {
                            var13++;
                        }
                    }
                    class294.field4570[7] = (byte) this.field864;
                    class294.field4570[2] = (byte) (var12 >> 8);
                    if ((arg0 - var11) <= 512) {
                        var13 = 0;
                    }
                    class294.field4570[6] = (byte) var13;
                    class294.field4570[5] = (byte) (var13 >> 8);
                    class294.field4570[3] = (byte) var12;
                    int var19 = arg0 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    class294.field4570[4] = (byte) (var13 >> 16);
                    class294.field4570[0] = (byte) (arg4 >> 8);
                    class294.field4570[1] = (byte) arg4;
                    var12++;
                    this.field853.method201((long) (var7 * 520), (byte) -97);
                    var7 = var13;
                    this.field853.method202(class294.field4570, 8, false, 0);
                    this.field853.method202(arg1, var19, false, var11);
                    var11 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field859++;
        return "Cache:" + this.field864;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III[B)Z")
    public final boolean method460(int arg0, int arg1, int arg2, byte[] arg3) {
        field858++;
        class23 var5 = this.field853;
        synchronized (this.field853) {
            if (arg0 != 8) {
                return true;
            } else if (arg2 >= 0 && arg2 <= this.field862) {
                boolean var7 = this.method459(arg2, arg3, (byte) 124, true, arg1);
                if (!var7) {
                    var7 = this.method459(arg2, arg3, (byte) 93, false, arg1);
                }
                return var7;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(ILwd;Lwd;I)V")
    public class54(int arg0, class23 arg1, class23 arg2, int arg3) {
        this.field864 = arg0;
        this.field862 = arg3;
        this.field860 = arg2;
        this.field853 = arg1;
    }
}
