import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class54 {

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    private int field785 = 65000;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "Lae;")
    private class174 field789 = null;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "Lae;")
    private class174 field788 = null;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    private int field783;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field781 = 0;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "[Lgk;")
    public static class159[] field780 = new class159[14];

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "Ljava/lang/String;")
    public static String field791 = null;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public static int field790 = 0;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field792 = 0;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "Lgf;")
    public static class126 field787;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Lcl;")
    public static class200 field784;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "[I")
    public static int[] field778;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([BIBI)Z")
    public final boolean method336(byte[] arg0, int arg1, byte arg2, int arg3) {
        field777++;
        class174 var5 = this.field789;
        synchronized (this.field789) {
            if (arg2 <= 10) {
                field792 = 11;
            }
            if (arg3 < 0 || this.field785 < arg3) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method340(8, arg1, arg0, arg3, true);
            if (!var6) {
                var6 = this.method340(8, arg1, arg0, arg3, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)[B")
    public final byte[] method337(int arg0, boolean arg1) {
        field786++;
        class174 var3 = this.field789;
        synchronized (this.field789) {
            try {
                if (((long) (arg0 * 6 + 6)) > this.field788.method1140((byte) 37)) {
                    return null;
                }
                this.field788.method1143((long) (arg0 * 6), -77);
                this.field788.method1142(6, class15.field150, 0, 53);
                int var5 = (class15.field150[5] & 0xFF) + ((class15.field150[3] & 0xFF) << 16) + ((class15.field150[4] & 0xFF) << 8);
                int var6 = ((class15.field150[1] & 0xFF) << 8) + (class15.field150[0] & 0xFF << 16) + (class15.field150[2] & 0xFF);
                if (var6 < 0 || this.field785 < var6) {
                    return null;
                } else if (var5 <= 0 || (this.field789.method1140((byte) 37) / 520L) < ((long) var5)) {
                    return null;
                } else if (arg1) {
                    int var10 = 0;
                    byte[] var11 = new byte[var6];
                    int var12 = 0;
                    while (var6 > var10) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field789.method1143((long) (var5 * 520), -114);
                        int var14 = var6 - var10;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field789.method1142(var14 + 8, class15.field150, 0, 80);
                        int var15 = (class15.field150[2] & 0xFF << 8) + (class15.field150[3] & 0xFF);
                        int var16 = (class15.field150[0] & 0xFF << 8) + (class15.field150[1] & 0xFF);
                        int var17 = (class15.field150[6] & 0xFF) + (class15.field150[5] & 0xFF << 8) + (class15.field150[4] & 0xFF << 16);
                        int var18 = class15.field150[7] & 0xFF;
                        if (arg0 == var16 && var12 == var15 && this.field783 == var18) {
                            if (var17 >= 0 && ((long) var17) <= (this.field789.method1140((byte) 37) / 520L)) {
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var11[var10++] = class15.field150[var21 + 8];
                                }
                                var12++;
                                var5 = var17;
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
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field779++;
        return "Cache:" + this.field783;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static void method338(byte arg0) {
        field787 = null;
        field780 = null;
        if (arg0 != 124) {
            field778 = null;
        }
        field791 = null;
        field778 = null;
        field784 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)I")
    public static int method339(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[BIZ)Z")
    private final boolean method340(int arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        field782++;
        class174 var6 = this.field789;
        synchronized (this.field789) {
            try {
                if (arg0 != 8) {
                    return false;
                }
                int var9;
                if (arg4) {
                    if ((long) (arg1 * 6 + 6) > this.field788.method1140((byte) 37)) {
                        return false;
                    }
                    this.field788.method1143((long) (arg1 * 6), -106);
                    this.field788.method1142(6, class15.field150, 0, 104);
                    var9 = (class15.field150[5] & 0xFF) + (class15.field150[4] & 0xFF << 8) + (class15.field150[3] & 0xFF << 16);
                    if (var9 <= 0 || ((long) var9) > (this.field789.method1140((byte) 37) / 520L)) {
                        return false;
                    }
                } else {
                    var9 = (int) ((this.field789.method1140((byte) 37) + 519L) / 520L);
                    if (var9 == 0) {
                        var9 = 1;
                    }
                }
                class15.field150[5] = (byte) var9;
                class15.field150[3] = (byte) (var9 >> 16);
                class15.field150[4] = (byte) (var9 >> 8);
                int var11 = 0;
                class15.field150[2] = (byte) arg3;
                class15.field150[0] = (byte) (arg3 >> 16);
                class15.field150[1] = (byte) (arg3 >> 8);
                int var12 = 0;
                this.field788.method1143((long) (arg1 * 6), -78);
                this.field788.method1138(0, 6, (byte) 30, class15.field150);
                while (arg3 > var12) {
                    int var13 = 0;
                    if (arg4) {
                        label112: {
                            this.field789.method1143((long) (var9 * 520), arg0 - 69);
                            try {
                                this.field789.method1142(8, class15.field150, 0, 41);
                            } catch (EOFException var36) {
                                return true;
                            }
                            var13 = (class15.field150[5] & 0xFF << 8) + (class15.field150[4] & 0xFF << 16) + (class15.field150[6] & 0xFF);
                            int var14 = ((class15.field150[2] & 0xFF) << 8) + (class15.field150[3] & 0xFF);
                            int var15 = ((class15.field150[0] & 0xFF) << 8) + (class15.field150[1] & 0xFF);
                            int var16 = class15.field150[7] & 0xFF;
                            if (arg1 == var15 && var11 == var14 && this.field783 == var16) {
                                if (var13 >= 0 && this.field789.method1140((byte) 37) / 520L >= (long) var13) {
                                    break label112;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field789.method1140((byte) 37) + 519L) / 520L);
                        arg4 = false;
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var9 == var13) {
                            var13++;
                        }
                    }
                    class15.field150[3] = (byte) var11;
                    class15.field150[2] = (byte) (var11 >> 8);
                    class15.field150[7] = (byte) this.field783;
                    var11++;
                    int var19 = arg3 - var12;
                    if (arg3 - var12 <= 512) {
                        var13 = 0;
                    }
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    class15.field150[1] = (byte) arg1;
                    class15.field150[5] = (byte) (var13 >> 8);
                    class15.field150[4] = (byte) (var13 >> 16);
                    class15.field150[0] = (byte) (arg1 >> 8);
                    class15.field150[6] = (byte) var13;
                    this.field789.method1143((long) (var9 * 520), -73);
                    var9 = var13;
                    this.field789.method1138(0, 8, (byte) 30, class15.field150);
                    this.field789.method1138(var12, var19, (byte) 30, arg2);
                    var12 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(ILae;Lae;I)V")
    public class54(int arg0, class174 arg1, class174 arg2, int arg3) {
        this.field785 = arg3;
        this.field788 = arg2;
        this.field789 = arg1;
        this.field783 = arg0;
    }
}
