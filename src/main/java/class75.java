import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class75 {

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "Lcf;")
    private class174 field1166 = null;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
    private int field1180 = 65000;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "Lcf;")
    private class174 field1182 = null;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    private int field1172;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "[I")
    public static int[] field1168 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "Z")
    public static volatile boolean field1176 = false;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "Lck;")
    public static class119 field1174 = class298.method1987((byte) 67, "blinken2:");

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "Lck;")
    private static class119 field1165 = class298.method1987((byte) 92, "Loading sprites )2 ");

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "I")
    public static int field1181 = 0;

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "Lck;")
    public static class119 field1183 = field1165;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIII)Z", line = 6)
    public static final boolean method535(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class283.field4686[arg0][var8][var9] == -class64.field1017) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class57.field926[arg0][arg1][arg3] + arg5;
            if (!class114.method727(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class114.method727(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class114.method727(var10, var12, var14)) {
                return false;
            } else if (class114.method727(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class216.method1360(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class114.method727(var6 + 1, class57.field926[arg0][arg1][arg3] + arg5, var7 + 1) && class114.method727(var6 + 128 - 1, class57.field926[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class114.method727(var6 + 128 - 1, class57.field926[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class114.method727(var6 + 1, class57.field926[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(ILcf;Lcf;I)V", line = 457)
    public class75(int arg0, class174 arg1, class174 arg2, int arg3) {
        this.field1166 = arg1;
        this.field1180 = arg3;
        this.field1172 = arg0;
        this.field1182 = arg2;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z[BBII)Z", line = 71)
    private final boolean method536(boolean arg0, byte[] arg1, byte arg2, int arg3, int arg4) {
        field1178++;
        class174 var6 = this.field1166;
        synchronized (this.field1166) {
            try {
                int var7;
                boolean var10000;
                if (arg0) {
                    if (this.field1182.method1117((byte) 120) < (long) (arg3 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field1182.method1118((long) (arg3 * 6), (byte) -1);
                    this.field1182.method1116(6, class184.field2921, (byte) 39, 0);
                    var7 = (class184.field2921[3] & 0xFF << 16) + (class184.field2921[5] & 0xFF) + (class184.field2921[4] & 0xFF << 8);
                    if (var7 <= 0 || this.field1166.method1117((byte) 122) / 520L < (long) var7) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field1166.method1117((byte) 121) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class184.field2921[0] = (byte) (arg4 >> 16);
                class184.field2921[2] = (byte) arg4;
                class184.field2921[5] = (byte) var7;
                class184.field2921[1] = (byte) (arg4 >> 8);
                int var8 = 15 / ((arg2 + 19) / 54);
                class184.field2921[4] = (byte) (var7 >> 8);
                class184.field2921[3] = (byte) (var7 >> 16);
                int var9 = 0;
                this.field1182.method1118((long) (arg3 * 6), (byte) -1);
                this.field1182.method1119(class184.field2921, 0, 6, (byte) 69);
                int var10 = 0;
                while (true) {
                    if (arg4 > var9) {
                        label135: {
                            int var11 = 0;
                            if (arg0) {
                                this.field1166.method1118((long) (var7 * 520), (byte) -1);
                                try {
                                    this.field1166.method1116(8, class184.field2921, (byte) 39, 0);
                                } catch (EOFException var19) {
                                    break label135;
                                }
                                var11 = (class184.field2921[5] & 0xFF << 8) + (class184.field2921[4] & 0xFF << 16) + (class184.field2921[6] & 0xFF);
                                int var13 = ((class184.field2921[2] & 0xFF) << 8) + (class184.field2921[3] & 0xFF);
                                int var14 = ((class184.field2921[0] & 0xFF) << 8) + (class184.field2921[1] & 0xFF);
                                int var15 = class184.field2921[7] & 0xFF;
                                if (arg3 != var14 || var10 != var13 || this.field1172 != var15) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var11 < 0 || ((long) var11) > (this.field1166.method1117((byte) 119) / 520L)) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var11 == 0) {
                                var11 = (int) ((this.field1166.method1117((byte) 121) + 519L) / 520L);
                                if (var11 == 0) {
                                    var11++;
                                }
                                arg0 = false;
                                if (var7 == var11) {
                                    var11++;
                                }
                            }
                            int var16 = arg4 - var9;
                            class184.field2921[0] = (byte) (arg3 >> 8);
                            class184.field2921[2] = (byte) (var10 >> 8);
                            class184.field2921[3] = (byte) var10;
                            if (var16 > 512) {
                                var16 = 512;
                            }
                            class184.field2921[1] = (byte) arg3;
                            class184.field2921[7] = (byte) this.field1172;
                            var10++;
                            if ((arg4 - var9) <= 512) {
                                var11 = 0;
                            }
                            class184.field2921[5] = (byte) (var11 >> 8);
                            class184.field2921[4] = (byte) (var11 >> 16);
                            class184.field2921[6] = (byte) var11;
                            this.field1166.method1118((long) (var7 * 520), (byte) -1);
                            var7 = var11;
                            this.field1166.method1119(class184.field2921, 0, 8, (byte) 78);
                            this.field1166.method1119(arg1, var9, var16, (byte) 61);
                            var9 += var16;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var20) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lva;ILva;ZI)Lla;", line = 190)
    public static final class113 method537(class36 arg0, int arg1, class36 arg2, boolean arg3, int arg4) {
        field1175++;
        int[] var5 = arg0.method281(arg1, -1);
        boolean var6 = true;
        for (int var7 = arg4; var7 < var5.length; var7++) {
            byte[] var8 = arg0.method262(arg1, var5[var7], true);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = var8[1] & 0xFF | var8[0] & 0xFF << 8;
                byte[] var10;
                if (arg3) {
                    var10 = arg2.method262(0, var9, true);
                } else {
                    var10 = arg2.method262(var9, 0, true);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        if (!var6) {
            return null;
        }
        try {
            return new class113(arg0, arg2, arg1, arg3);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 244)
    public static void method538(int arg0) {
        field1183 = null;
        field1174 = null;
        field1168 = null;
        if (arg0 != 9982) {
            field1167 = 93;
        }
        field1165 = null;
    }

    @OriginalMember(owner = "client!kl", name = "toString", descriptor = "()Ljava/lang/String;", line = 262)
    public final String toString() {
        field1171++;
        return "Cache:" + this.field1172;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lfj;B)Lwj;", line = 270)
    public static final class268 method539(class3 arg0, byte arg1) {
        field1169++;
        if (arg1 == -23) {
            class268 var2 = new class268();
            var2.field4418 = arg0.method63((byte) 1);
            var2.field4428 = class13.method112(127, var2.field4418);
            return var2;
        } else {
            return (class268) null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIB[B)Z", line = 287)
    public final boolean method540(int arg0, int arg1, byte arg2, byte[] arg3) {
        if (arg2 < 8) {
            method538(16);
        }
        field1179++;
        class174 var5 = this.field1166;
        synchronized (this.field1166) {
            if (arg0 < 0 || this.field1180 < arg0) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method536(true, arg3, (byte) 52, arg1, arg0);
            if (!var6) {
                var6 = this.method536(false, arg3, (byte) -98, arg1, arg0);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)[B", line = 334)
    public final byte[] method541(int arg0, int arg1) {
        field1173++;
        class174 var3 = this.field1166;
        synchronized (this.field1166) {
            try {
                Object var10000;
                if ((long) (arg1 * 6 + 6) > this.field1182.method1117((byte) 126)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field1182.method1118((long) (arg1 * 6), (byte) -1);
                this.field1182.method1116(6, class184.field2921, (byte) 39, 0);
                int var4 = (class184.field2921[2] & arg0) + ((class184.field2921[0] & 0xFF << 16) + ((class184.field2921[1] & 0xFF) << 8));
                int var5 = (class184.field2921[3] & 0xFF << 16) + ((class184.field2921[4] & 0xFF) << 8) + (class184.field2921[5] & 0xFF);
                if (var4 < 0 || var4 > this.field1180) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var5 > 0 && (long) var5 <= this.field1166.method1117((byte) 123) / 520L) {
                    byte[] var6 = new byte[var4];
                    int var7 = 0;
                    int var8 = 0;
                    while (var8 < var4) {
                        if (var5 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        int var9 = var4 - var8;
                        this.field1166.method1118((long) (var5 * 520), (byte) -1);
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field1166.method1116(var9 + 8, class184.field2921, (byte) 39, 0);
                        int var10 = ((class184.field2921[2] & 0xFF) << 8) + (class184.field2921[3] & 0xFF);
                        int var11 = (class184.field2921[6] & 0xFF) + ((class184.field2921[4] & 0xFF) << 16) + ((class184.field2921[5] & 0xFF) << 8);
                        int var12 = (class184.field2921[0] & 0xFF << 8) + (class184.field2921[1] & 0xFF);
                        int var13 = class184.field2921[7] & 0xFF;
                        if (arg1 != var12 || var7 != var10 || this.field1172 != var13) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var11 < 0 || ((long) var11) > (this.field1166.method1117((byte) 121) / 520L)) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var5 = var11;
                        var7++;
                        for (int var14 = 0; var14 < var9; var14++) {
                            var6[var8++] = class184.field2921[var14 + 8];
                        }
                    }
                    byte[] var19 = var6;
                    return var19;
                } else {
                    var10000 = null;
                    return (byte[]) var10000;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V", line = 429)
    public static final void method542(int arg0) {
        field1170++;
        if (!class114.field1725) {
            return;
        }
        class134 var1 = class171.method1083(class20.field289, class44.field655, 126);
        if (var1 != null && var1.field2144 != null) {
            class1 var2 = new class1();
            var2.field8 = var1;
            var2.field14 = var1.field2144;
            class184.method1170(var2, 101);
        }
        if (arg0 <= 113) {
            method542(126);
        }
        class114.field1725 = false;
        class26.method194(var1, -121);
    }
}
