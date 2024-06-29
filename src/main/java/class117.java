import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class117 {

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Lcc;")
    private class251 field2074 = null;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    private int field2078 = 65000;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "Lcc;")
    private class251 field2090 = null;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    private int field2077;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Lda;")
    public static class275 field2075 = class255.method1672(114, "Fps:");

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "Lda;")
    private static class275 field2076 = class255.method1672(114, "Discard");

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "Lda;")
    public static class275 field2085 = field2076;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public static int field2087 = 0;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "Lda;")
    private static class275 field2081 = class255.method1672(93, "Loaded wordpack");

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "Z")
    public static boolean field2082 = false;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "Lda;")
    public static class275 field2089 = class255.method1672(102, ":clanreq:");

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "Lda;")
    public static class275 field2091 = field2081;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "[S")
    public static short[] field2080;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
    public static void method849(byte arg0) {
        field2091 = null;
        field2080 = null;
        field2076 = null;
        if (arg0 != -45) {
            method849((byte) -115);
        }
        field2075 = null;
        field2085 = null;
        field2089 = null;
        field2081 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([BIII)Z")
    public final boolean method850(byte[] arg0, int arg1, int arg2, int arg3) {
        field2083++;
        class251 var5 = this.field2074;
        synchronized (this.field2074) {
            int var6 = -12 % ((-arg1 - 47) / 57);
            if (arg2 < 0 || arg2 > this.field2078) {
                throw new IllegalArgumentException();
            }
            boolean var7 = this.method851(true, arg3, arg0, (byte) -35, arg2);
            if (!var7) {
                var7 = this.method851(false, arg3, arg0, (byte) -35, arg2);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZI[BBI)Z")
    private final boolean method851(boolean arg0, int arg1, byte[] arg2, byte arg3, int arg4) {
        field2088++;
        class251 var6 = this.field2074;
        synchronized (this.field2074) {
            try {
                int var8;
                if (arg0) {
                    if (this.field2090.method1648(arg3 + 37) < ((long) (arg1 * 6 + 6))) {
                        return false;
                    }
                    this.field2090.method1650((byte) 95, (long) (arg1 * 6));
                    this.field2090.method1645(class70.field1129, 0, 6, (byte) 43);
                    var8 = (class70.field1129[3] & 0xFF << 16) + (class70.field1129[5] & 0xFF) + ((class70.field1129[4] & 0xFF) << 8);
                    if (var8 <= 0 || this.field2074.method1648(2) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field2074.method1648(2) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class70.field1129[1] = (byte) (arg4 >> 8);
                class70.field1129[3] = (byte) (var8 >> 16);
                class70.field1129[5] = (byte) var8;
                class70.field1129[0] = (byte) (arg4 >> 16);
                class70.field1129[4] = (byte) (var8 >> 8);
                if (arg3 != -35) {
                    return false;
                }
                class70.field1129[2] = (byte) arg4;
                this.field2090.method1650((byte) 98, (long) (arg1 * 6));
                this.field2090.method1646(0, class70.field1129, 6, 127);
                int var11 = 0;
                int var12 = 0;
                while (arg4 > var11) {
                    int var13 = 0;
                    if (arg0) {
                        label110: {
                            this.field2074.method1650((byte) 92, (long) (var8 * 520));
                            try {
                                this.field2074.method1645(class70.field1129, 0, 8, (byte) 65);
                            } catch (EOFException var36) {
                                return true;
                            }
                            var13 = (class70.field1129[6] & 0xFF) + ((class70.field1129[4] & 0xFF) << 16) + (class70.field1129[5] & 0xFF << 8);
                            int var14 = ((class70.field1129[2] & 0xFF) << 8) + (class70.field1129[3] & 0xFF);
                            int var15 = class70.field1129[7] & 0xFF;
                            int var16 = (class70.field1129[0] & 0xFF << 8) + (class70.field1129[1] & 0xFF);
                            if (arg1 == var16 && var12 == var14 && this.field2077 == var15) {
                                if (var13 >= 0 && (this.field2074.method1648(2) / 520L) >= ((long) var13)) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field2074.method1648(2) + 519L) / 520L);
                        arg0 = false;
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    class70.field1129[0] = (byte) (arg1 >> 8);
                    if ((arg4 - var11) <= 512) {
                        var13 = 0;
                    }
                    class70.field1129[7] = (byte) this.field2077;
                    int var19 = arg4 - var11;
                    class70.field1129[2] = (byte) (var12 >> 8);
                    class70.field1129[6] = (byte) var13;
                    class70.field1129[5] = (byte) (var13 >> 8);
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    class70.field1129[3] = (byte) var12;
                    class70.field1129[1] = (byte) arg1;
                    var12++;
                    class70.field1129[4] = (byte) (var13 >> 16);
                    this.field2074.method1650((byte) 83, (long) (var8 * 520));
                    this.field2074.method1646(0, class70.field1129, 8, 126);
                    this.field2074.method1646(var11, arg2, var19, 127);
                    var8 = var13;
                    var11 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2079++;
        return "Cache:" + this.field2077;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)[B")
    public final byte[] method852(int arg0, int arg1) {
        field2084++;
        class251 var3 = this.field2074;
        synchronized (this.field2074) {
            try {
                if (((long) (arg0 * 6 + 6)) > this.field2090.method1648(2)) {
                    return null;
                }
                this.field2090.method1650((byte) 49, (long) (arg0 * 6));
                this.field2090.method1645(class70.field1129, 0, 6, (byte) 112);
                int var5 = (class70.field1129[5] & 0xFF) + ((class70.field1129[4] & 0xFF) << 8) + ((class70.field1129[3] & 0xFF) << 16);
                int var6 = (class70.field1129[arg1] & 0xFF << 16) + (class70.field1129[1] & 0xFF << 8) + (class70.field1129[2] & 0xFF);
                if (var6 < 0 || this.field2078 < var6) {
                    return null;
                } else if (var5 > 0 && ((long) var5) <= (this.field2074.method1648(arg1 + 2) / 520L)) {
                    int var9 = 0;
                    int var10 = 0;
                    byte[] var11 = new byte[var6];
                    label70: while (var10 < var6) {
                        if (var5 == 0) {
                            return null;
                        }
                        int var13 = var6 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field2074.method1650((byte) 35, (long) (var5 * 520));
                        this.field2074.method1645(class70.field1129, 0, var13 + 8, (byte) 50);
                        int var14 = ((class70.field1129[0] & 0xFF) << 8) + (class70.field1129[1] & 0xFF);
                        int var15 = (class70.field1129[2] & 0xFF << 8) + (class70.field1129[3] & 0xFF);
                        int var16 = (class70.field1129[5] & 0xFF << 8) + ((class70.field1129[4] & 0xFF) << 16) + (class70.field1129[6] & 0xFF);
                        int var17 = class70.field1129[7] & 0xFF;
                        if (arg0 == var14 && var9 == var15 && this.field2077 == var17) {
                            if (var16 >= 0 && ((long) var16) <= (this.field2074.method1648(2) / 520L)) {
                                var9++;
                                var5 = var16;
                                int var20 = 0;
                                while (true) {
                                    if (var13 <= var20) {
                                        continue label70;
                                    }
                                    var11[var10++] = class70.field1129[var20 + 8];
                                    var20++;
                                }
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

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljg;)V")
    public static final void method853(class37 arg0) {
        for (int var1 = arg0.field616; var1 <= arg0.field610; var1++) {
            for (int var2 = arg0.field617; var2 <= arg0.field604; var2++) {
                class3 var3 = class235.field4101[arg0.field621][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field29; var4++) {
                        if (var3.field48[var4] == arg0) {
                            var3.field29--;
                            for (int var5 = var4; var5 < var3.field29; var5++) {
                                var3.field48[var5] = var3.field48[var5 + 1];
                                var3.field30[var5] = var3.field30[var5 + 1];
                            }
                            var3.field48[var3.field29] = null;
                            break;
                        }
                    }
                    var3.field40 = 0;
                    for (int var6 = 0; var6 < var3.field29; var6++) {
                        var3.field40 |= var3.field30[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(ILcc;Lcc;I)V")
    public class117(int arg0, class251 arg1, class251 arg2, int arg3) {
        this.field2090 = arg2;
        this.field2078 = arg3;
        this.field2074 = arg1;
        this.field2077 = arg0;
    }
}
