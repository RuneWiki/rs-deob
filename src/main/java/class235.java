import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class235 {

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
    public int field3921 = -1;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "Z")
    public boolean field3927 = false;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "Z")
    public boolean field3922 = true;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
    public int field3925 = 1190717;

    @OriginalMember(owner = "client!fr", name = "p", descriptor = "I")
    public int field3936 = 8;

    @OriginalMember(owner = "client!fr", name = "o", descriptor = "I")
    public int field3935 = 0;

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "I")
    public int field3930 = -1;

    @OriginalMember(owner = "client!fr", name = "n", descriptor = "Z")
    public boolean field3934 = true;

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
    public int field3929 = 16;

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
    public int field3931 = -1;

    @OriginalMember(owner = "client!fr", name = "s", descriptor = "I")
    public int field3939 = 128;

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "Lbd;")
    public static class37 field3928 = new class37();

    @OriginalMember(owner = "client!fr", name = "u", descriptor = "Ljava/lang/String;")
    public static String field3941 = "rating: ";

    @OriginalMember(owner = "client!fr", name = "t", descriptor = "Lal;")
    public static class52 field3940 = new class52(260);

    @OriginalMember(owner = "client!fr", name = "w", descriptor = "Lrm;")
    public static class234 field3943 = new class234(64);

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!fr", name = "l", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!fr", name = "m", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!fr", name = "q", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!fr", name = "r", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!fr", name = "v", descriptor = "J")
    public static long field3942;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BILjg;)V")
    public final void method1662(byte arg0, int arg1, class186 arg2) {
        while (true) {
            int var4 = arg2.method1322(false);
            if (var4 == 0) {
                field3924++;
                if (arg0 != 34) {
                    this.method1662((byte) -103, 110, (class186) null);
                    return;
                }
                return;
            }
            this.method1665(var4, 11, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IILjava/lang/String;Z)I")
    public static final int method1663(int arg0, int arg1, String arg2, boolean arg3) {
        field3932++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        if (arg0 != -2) {
            method1667((byte) 96);
        }
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg1 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if (var10 / arg1 != var6) {
                throw new NumberFormatException();
            }
            var6 = var10;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V")
    public final void method1664(int arg0, int arg1) {
        if (arg0 != -1644) {
            this.field3939 = -10;
        }
        if (this.field3930 == -1) {
            this.field3930 = this.field3921;
        }
        this.field3936 = this.field3936 << 8 | arg1;
        field3926++;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IILjg;I)V")
    private final void method1665(int arg0, int arg1, class186 arg2, int arg3) {
        if (arg1 != 11) {
            return;
        }
        if (arg0 == 1) {
            this.field3935 = class212.method1493(65536, arg2.method1275(arg1 - 12));
        } else if (arg0 == 2) {
            this.field3921 = arg2.method1322(false);
        } else if (arg0 == 3) {
            this.field3921 = arg2.method1272((byte) -119);
            if (this.field3921 == 65535) {
                this.field3921 = -1;
            }
        } else if (arg0 == 5) {
            this.field3934 = false;
        } else if (arg0 == 7) {
            this.field3931 = class212.method1493(65536, arg2.method1275(-1));
        } else if (arg0 == 8) {
            class105.field1469 = arg3;
        } else if (arg0 == 9) {
            this.field3939 = arg2.method1272((byte) -62);
        } else if (arg0 == 10) {
            this.field3922 = false;
        } else if (arg0 == 11) {
            this.field3936 = arg2.method1322(false);
        } else if (arg0 == 12) {
            this.field3927 = true;
        } else if (arg0 == 13) {
            this.field3925 = arg2.method1275(arg1 - 12);
        } else if (arg0 == 14) {
            this.field3929 = arg2.method1322(false);
        } else if (arg0 == 15) {
            this.field3930 = arg2.method1272((byte) -95);
            if (this.field3930 == 65535) {
                this.field3930 = -1;
            }
        }
        field3938++;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
    public static void method1666(int arg0) {
        field3928 = null;
        field3943 = null;
        field3941 = null;
        if (arg0 != -2) {
            method1663(-48, -22, (String) null, true);
        }
        field3940 = null;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)V")
    public static final void method1667(byte arg0) {
        field3923++;
        class359 var1 = (class359) field3928.method253((byte) -6);
        if (arg0 < 54) {
            return;
        }
        while (var1 != null) {
            if (var1.field5502 > 0) {
                var1.field5502--;
            }
            if (var1.field5502 != 0) {
                if (var1.field5503 > 0) {
                    var1.field5503--;
                }
                if (var1.field5503 == 0 && var1.field5490 >= 1 && var1.field5498 >= 1 && (class80.field1003 - 2) >= var1.field5490 && var1.field5498 <= (class380.field5751 - 2) && (var1.field5497 < 0 || class134.method988(var1.field5497, 2, var1.field5493))) {
                    class150.method1061(var1.field5492, var1.field5498, true, var1.field5493, -1, var1.field5497, var1.field5490, var1.field5488, var1.field5491);
                    var1.field5503 = -1;
                    if (var1.field5501 == var1.field5497 && var1.field5501 == -1) {
                        var1.method1120(-115);
                    } else if (var1.field5501 == var1.field5497 && var1.field5491 == var1.field5489 && var1.field5494 == var1.field5493) {
                        var1.method1120(122);
                    }
                }
            } else if (var1.field5501 < 0 || class134.method988(var1.field5501, 2, var1.field5494)) {
                class150.method1061(var1.field5492, var1.field5498, true, var1.field5494, -1, var1.field5501, var1.field5490, var1.field5488, var1.field5489);
                var1.method1120(80);
            }
            var1 = (class359) field3928.method247((byte) 71);
        }
    }
}
