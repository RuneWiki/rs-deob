import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class17 {

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Lia;")
    private class57 field491 = null;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Lia;")
    private class57 field496 = null;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    private int field492 = 65000;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    private int field490;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Lhe;")
    private static class54 field489 = class6.method58("flash2:", false);

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Lhe;")
    public static class54 field497 = field489;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Lhe;")
    public static class54 field499 = field489;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "Lsf;")
    public static class131 field501 = new class131(500);

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "Lhe;")
    public static class54 field503 = class6.method58(")4l", false);

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "Lhe;")
    public static class54 field502 = class6.method58("leuchten2:", false);

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "Lhe;")
    public static class54 field511 = class6.method58("va", false);

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "Lhe;")
    public static class54 field512 = class6.method58("Ausw-=hlen", false);

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public static int field509 = 0;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "Lhe;")
    private static class54 field506 = class6.method58("Connecting to server)3)3)3", false);

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public static int field508 = 0;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "Lhe;")
    public static class54 field510 = class6.method58("http:)4)4", false);

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "Lhe;")
    public static class54 field513 = field506;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "Lhe;")
    public static class54 field504 = class6.method58("Der Server wird gerade aktualisiert)3", false);

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "Lhe;")
    public static class54 field505 = class6.method58("<col=00ffff>", false);

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "Lhe;")
    public static class54 field514 = class6.method58(" steht bereits auf Ihrer Ignorieren)2Liste(Q", false);

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
    public static int field515 = 0;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "Lme;")
    public static class88 field507;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III[B)Z")
    public final boolean method148(int arg0, int arg1, int arg2, byte[] arg3) {
        field493++;
        class57 var5 = this.field496;
        synchronized (this.field496) {
            if (arg0 < 0 || this.field492 < arg0) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method150(arg0, arg1, arg2 - 27208, true, arg3);
            if (arg2 != 27463) {
                method149(-108);
            }
            if (!var6) {
                var6 = this.method150(arg0, arg1, 255, false, arg3);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method149(int arg0) {
        field511 = null;
        field505 = null;
        field506 = null;
        field510 = null;
        field502 = null;
        field499 = null;
        if (arg0 != 0) {
            return;
        }
        field489 = null;
        field514 = null;
        field503 = null;
        field512 = null;
        field497 = null;
        field504 = null;
        field501 = null;
        field507 = null;
        field513 = null;
    }

    @OriginalMember(owner = "client!cb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field495++;
        return "Cache:" + this.field490;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIZ[B)Z")
    private final boolean method150(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4) {
        field498++;
        class57 var6 = this.field496;
        synchronized (this.field496) {
            try {
                int var7;
                if (arg3) {
                    if (this.field491.method444(arg2 + 31294) < (long) (arg1 * 6 + 6)) {
                        return false;
                    }
                    this.field491.method451((byte) -75, (long) (arg1 * 6));
                    this.field491.method446(class13.field364, 2094, 6, 0);
                    var7 = ((class13.field364[4] & 0xFF) << 8) + ((class13.field364[3] & 0xFF) << 16) + (class13.field364[5] & 0xFF);
                    if (var7 <= 0 || (long) var7 > this.field496.method444(31549) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field496.method444(31549) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class13.field364[3] = (byte) (var7 >> 16);
                class13.field364[4] = (byte) (var7 >> 8);
                int var10 = 0;
                class13.field364[1] = (byte) (arg0 >> 8);
                class13.field364[5] = (byte) var7;
                if (arg2 != 255) {
                    field513 = null;
                }
                int var11 = 0;
                class13.field364[0] = (byte) (arg0 >> 16);
                class13.field364[2] = (byte) arg0;
                this.field491.method451((byte) -106, (long) (arg1 * 6));
                this.field491.method449(class13.field364, -1, 6, 0);
                while (var10 < arg0) {
                    int var12 = 0;
                    if (arg3) {
                        label109: {
                            this.field496.method451((byte) -103, (long) (var7 * 520));
                            try {
                                this.field496.method446(class13.field364, 2094, 8, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = ((class13.field364[4] & 0xFF) << 16) + (((class13.field364[5] & 0xFF) << 8) + (class13.field364[6] & 0xFF));
                            int var13 = ((class13.field364[0] & 0xFF) << 8) + (class13.field364[1] & 0xFF);
                            int var14 = ((class13.field364[2] & 0xFF) << 8) + (class13.field364[3] & 0xFF);
                            int var15 = class13.field364[7] & 0xFF;
                            if (arg1 == var13 && var11 == var14 && this.field490 == var15) {
                                if (var12 >= 0 && (long) var12 <= this.field496.method444(31549) / 520L) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    int var18 = arg0 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    if (var12 == 0) {
                        arg3 = false;
                        var12 = (int) ((this.field496.method444(31549) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class13.field364[0] = (byte) (arg1 >> 8);
                    class13.field364[1] = (byte) arg1;
                    class13.field364[3] = (byte) var11;
                    class13.field364[7] = (byte) this.field490;
                    class13.field364[2] = (byte) (var11 >> 8);
                    if (arg0 - var10 <= 512) {
                        var12 = 0;
                    }
                    class13.field364[4] = (byte) (var12 >> 16);
                    class13.field364[5] = (byte) (var12 >> 8);
                    class13.field364[6] = (byte) var12;
                    this.field496.method451((byte) -79, (long) (var7 * 520));
                    this.field496.method449(class13.field364, -1, 8, 0);
                    var11++;
                    this.field496.method449(arg4, -1, var18, var10);
                    var7 = var12;
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public static final void method151(int arg0) {
        int var1 = class40.field1044.method456(-1432215741, 8);
        if (class74.field1823 > var1) {
            for (int var2 = var1; var2 < class74.field1823; var2++) {
                class115.field2730[class70.field1723++] = class141.field3227[var2];
            }
        }
        field500++;
        if (class74.field1823 < var1) {
            throw new RuntimeException("gppov1");
        }
        class74.field1823 = arg0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class141.field3227[var3];
            class22 var5 = class48.field1148[var4];
            int var6 = class40.field1044.method456(-1432215741, 1);
            if (var6 == 0) {
                class141.field3227[class74.field1823++] = var4;
                var5.field960 = class4.field138;
            } else {
                int var7 = class40.field1044.method456(-1432215741, 2);
                if (var7 == 0) {
                    class141.field3227[class74.field1823++] = var4;
                    var5.field960 = class4.field138;
                    class89.field2193[class21.field579++] = var4;
                } else if (var7 == 1) {
                    class141.field3227[class74.field1823++] = var4;
                    var5.field960 = class4.field138;
                    int var8 = class40.field1044.method456(-1432215741, 3);
                    var5.method289(false, false, var8);
                    int var9 = class40.field1044.method456(arg0 ^ 0xAAA21F43, 1);
                    if (var9 == 1) {
                        class89.field2193[class21.field579++] = var4;
                    }
                } else if (var7 == 2) {
                    class141.field3227[class74.field1823++] = var4;
                    var5.field960 = class4.field138;
                    int var10 = class40.field1044.method456(-1432215741, 3);
                    var5.method289(false, true, var10);
                    int var11 = class40.field1044.method456(-1432215741, 3);
                    var5.method289(false, true, var11);
                    int var12 = class40.field1044.method456(-1432215741, 1);
                    if (var12 == 1) {
                        class89.field2193[class21.field579++] = var4;
                    }
                } else if (var7 == 3) {
                    class115.field2730[class70.field1723++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)[B")
    public final byte[] method152(int arg0, int arg1) {
        field488++;
        class57 var3 = this.field496;
        synchronized (this.field496) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field491.method444(31549)) {
                    return null;
                }
                this.field491.method451((byte) -118, (long) (arg0 * 6));
                this.field491.method446(class13.field364, arg1 ^ 0x8D1, 6, 0);
                int var5 = ((class13.field364[0] & 0xFF) << 16) + (class13.field364[2] & 0xFF) + ((class13.field364[1] & 0xFF) << 8);
                int var6 = (class13.field364[5] & arg1) + ((class13.field364[4] & 0xFF) << 8) + ((class13.field364[3] & 0xFF) << 16);
                if (var5 < 0 || var5 > this.field492) {
                    return null;
                } else if (var6 > 0 && this.field496.method444(arg1 + 31294) / 520L >= (long) var6) {
                    int var9 = 0;
                    byte[] var10 = new byte[var5];
                    int var11 = 0;
                    label70: while (var5 > var9) {
                        if (var6 == 0) {
                            return null;
                        }
                        int var13 = var5 - var9;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field496.method451((byte) -58, (long) (var6 * 520));
                        this.field496.method446(class13.field364, 2094, var13 + 8, 0);
                        int var14 = class13.field364[7] & 0xFF;
                        int var15 = ((class13.field364[2] & 0xFF) << 8) + (class13.field364[3] & 0xFF);
                        int var16 = ((class13.field364[0] & 0xFF) << 8) + (class13.field364[1] & 0xFF);
                        int var17 = ((class13.field364[4] & 0xFF) << 16) + ((class13.field364[5] & 0xFF) << 8) + (class13.field364[6] & 0xFF);
                        if (arg0 == var16 && var11 == var15 && this.field490 == var14) {
                            if (var17 >= 0 && this.field496.method444(31549) / 520L >= (long) var17) {
                                var6 = var17;
                                var11++;
                                int var20 = 0;
                                while (true) {
                                    if (var20 >= var13) {
                                        continue label70;
                                    }
                                    var10[var9++] = class13.field364[var20 + 8];
                                    var20++;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return var10;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z[Lhe;)[Lhe;")
    public static final class54[] method153(boolean arg0, class54[] arg1) {
        class54[] var2 = new class54[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class143.method1105(new class54[] { class147.method1117(-96, var3), class72.field1805 }, -842);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class143.method1105(new class54[] { var2[var3], arg1[var3] }, -842);
            }
        }
        if (arg0) {
            field502 = null;
        }
        field494++;
        return var2;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(ILia;Lia;I)V")
    public class17(int arg0, class57 arg1, class57 arg2, int arg3) {
        this.field496 = arg1;
        this.field492 = arg3;
        this.field491 = arg2;
        this.field490 = arg0;
    }
}
