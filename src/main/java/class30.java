import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class30 {

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "Lgl;")
    private class180 field449 = null;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "Lgl;")
    private class180 field451 = null;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "I")
    private int field461 = 65000;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    private int field458;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "Lbe;")
    public static class283 field450 = class153.method941(-126, "(Y<)4col>");

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field445 = 0;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "[I")
    public static int[] field460 = new int[50];

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "Lbe;")
    public static class283 field456 = class153.method941(127, ":chalreq:");

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "I")
    public static volatile int field464 = -1;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public static int field454 = -1;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "Ltf;")
    public static class242 field452 = new class242(20);

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "Lbe;")
    public static class283 field467 = class153.method941(125, "Lade)3)3)3");

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "[S")
    public static short[] field465 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "I")
    public static int field468 = 0;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "[[S")
    public static short[][] field447;

    @OriginalMember(owner = "client!ih", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field453++;
        return "Cache:" + this.field458;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILbe;I)V", line = 30)
    public static final void method205(int arg0, class283 arg1, int arg2) {
        field459++;
        if (arg2 != 24892) {
            method206(-84, 34, -90, -36, -50, (class104) null, -76);
        }
        class72 var3 = class25.method174(arg0, (byte) -50, 2);
        var3.method477(-127);
        var3.field1271 = arg1;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(ILgl;Lgl;I)V", line = 556)
    public class30(int arg0, class180 arg1, class180 arg2, int arg3) {
        this.field451 = arg1;
        this.field449 = arg2;
        this.field458 = arg0;
        this.field461 = arg3;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIILpk;I)V", line = 83)
    public static final void method206(int arg0, int arg1, int arg2, int arg3, int arg4, class104 arg5, int arg6) {
        field446++;
        long var7 = 0L;
        if (arg0 == 0) {
            var7 = class288.method1972(arg2, arg3, arg1);
        } else if (arg0 == 1) {
            var7 = class177.method1170(arg2, arg3, arg1);
        } else if (arg0 == 2) {
            var7 = class184.method1214(arg2, arg3, arg1);
        } else if (arg0 == 3) {
            var7 = class263.method1783(arg2, arg3, arg1);
        }
        boolean var9 = true;
        int var10 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        if (arg4 > -84) {
            return;
        }
        class281 var11 = class254.method1722(0, var10);
        boolean var12 = false;
        boolean var13 = false;
        int var14 = (int) var7 >> 20 & 0x3;
        if (var11.method1883(true)) {
            class245.method1670(arg2, (byte) -57, arg3, var11, arg1);
        }
        int var15 = (int) var7 >> 14 & 0x1F;
        if (var7 == 0L) {
            return;
        }
        class7 var16 = null;
        class7 var17 = null;
        if (arg0 == 0) {
            class197 var21 = class1.method6(arg2, arg3, arg1);
            if (var21 != null) {
                var16 = var21.field3375;
                var17 = var21.field3376;
            }
            if (var11.field4742 != 0) {
                arg5.method696(arg1, var11.field4758, var15, 32768, var14, arg3);
            }
        } else if (arg0 == 1) {
            class291 var18 = class207.method1375(arg2, arg3, arg1);
            if (var18 != null) {
                var17 = var18.field4941;
                var16 = var18.field4943;
            }
        } else if (arg0 == 2) {
            class26 var19 = class143.method898(arg2, arg3, arg1);
            if (var19 != null) {
                var16 = var19.field381;
            }
            if (var11.field4742 != 0 && (var11.field4727 + arg3) < 104 && var11.field4727 + arg1 < 104 && (var11.field4754 + arg3) < 104 && arg1 + var11.field4754 < 104) {
                arg5.method695(arg3, var11.field4754, var14, 131072, var11.field4758, arg1, var11.field4727);
            }
        } else if (arg0 == 3) {
            class110 var20 = class183.method1210(arg2, arg3, arg1);
            if (var20 != null) {
                var16 = var20.field1855;
            }
            if (var11.field4742 == 1) {
                arg5.method685(-262145, arg1, arg3);
            }
        }
        if (!var11.field4755) {
            return;
        }
        if (var15 == 2) {
            if ((var16 instanceof class163)) {
                ((class163) var16).method995(0);
            } else {
                class295.method2008(64, var11, 0, arg1, var14 + 4, arg6, arg3, 0, var15);
            }
            if (var17 instanceof class163) {
                ((class163) var17).method995(0);
            } else {
                class295.method2008(64, var11, 0, arg1, var14 + 1 & 0x3, arg6, arg3, 0, var15);
            }
        } else if (var15 == 5) {
            if (var16 instanceof class163) {
                ((class163) var16).method995(0);
            } else {
                class295.method2008(64, var11, class99.field1674[var14] * 8, arg1, var14, arg6, arg3, class210.field3581[var14] * 8, 4);
            }
        } else if (var15 == 6) {
            if ((var16 instanceof class163)) {
                ((class163) var16).method995(0);
            } else {
                class295.method2008(64, var11, class283.field4845[var14] * 8, arg1, var14 + 4, arg6, arg3, class190.field3241[var14] * 8, 4);
            }
        } else if (var15 == 7) {
            if (var16 instanceof class163) {
                ((class163) var16).method995(0);
            } else {
                class295.method2008(64, var11, 0, arg1, (var14 + 2 & 0x3) + 4, arg6, arg3, 0, 4);
            }
        } else if (var15 == 8) {
            if (var16 instanceof class163) {
                ((class163) var16).method995(0);
            } else {
                class295.method2008(64, var11, class283.field4845[var14] * 8, arg1, var14 + 4, arg6, arg3, class190.field3241[var14] * 8, 4);
            }
            if (var17 instanceof class163) {
                ((class163) var17).method995(0);
            } else {
                class295.method2008(64, var11, class283.field4845[var14] * 8, arg1, (var14 + 2 & 0x3) + 4, arg6, arg3, class190.field3241[var14] * 8, 4);
            }
        } else if (var15 == 11) {
            if (var16 instanceof class163) {
                ((class163) var16).method995(0);
            } else {
                class295.method2008(64, var11, 0, arg1, var14 + 4, arg6, arg3, 0, 10);
            }
        } else if ((var16 instanceof class163)) {
            ((class163) var16).method995(0);
        } else {
            class295.method2008(64, var11, 0, arg1, var14, arg6, arg3, 0, var15);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V", line = 274)
    public static void method207(int arg0) {
        field465 = null;
        field452 = null;
        field447 = (short[][]) null;
        field456 = null;
        field460 = null;
        field467 = null;
        field450 = null;
        if (arg0 > -22) {
            field454 = 4;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)[B", line = 291)
    public final byte[] method208(int arg0, int arg1) {
        field463++;
        class180 var3 = this.field451;
        synchronized (this.field451) {
            Object var10000;
            try {
                if (this.field449.method1178(-72) < ((long) (arg1 * 6 + 6))) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field449.method1180((byte) -37, (long) (arg1 * 6));
                this.field449.method1183(class275.field4617, (byte) -125, 6, 0);
                int var4 = (class275.field4617[2] & 0xFF) + ((class275.field4617[1] & 0xFF) << 8) + (class275.field4617[0] & 0xFF << 16);
                int var5 = ((class275.field4617[4] & 0xFF) << 8) + (((class275.field4617[3] & 0xFF) << 16) + (class275.field4617[5] & 0xFF));
                if (var4 < 0 || var4 > this.field461) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                if (var5 > 0 && ((long) var5) <= (this.field451.method1178(-90) / 520L)) {
                    int var6 = 0;
                    byte[] var7 = new byte[var4];
                    int var8 = 0;
                    while (var4 > var6) {
                        if (var5 != 0) {
                            this.field451.method1180((byte) -37, (long) (var5 * 520));
                            int var9 = var4 - var6;
                            if (var9 > 512) {
                                var9 = 512;
                            }
                            this.field451.method1183(class275.field4617, (byte) -125, var9 + 8, 0);
                            int var10 = ((class275.field4617[0] & 0xFF) << 8) + (class275.field4617[1] & 0xFF);
                            int var11 = (class275.field4617[6] & 0xFF) + (class275.field4617[5] & 0xFF << 8) + (class275.field4617[4] & 0xFF << 16);
                            int var12 = class275.field4617[7] & 0xFF;
                            int var13 = (class275.field4617[2] & 0xFF << 8) + (class275.field4617[3] & 0xFF);
                            if (arg1 == var10 && var8 == var13 && this.field458 == var12) {
                                if (var11 >= 0 && this.field451.method1178(arg0 ^ 0x7E92) / 520L >= (long) var11) {
                                    var5 = var11;
                                    for (int var14 = 0; var14 < var9; var14++) {
                                        var7[var6++] = class275.field4617[var14 + 8];
                                    }
                                    var8++;
                                    continue;
                                }
                                var10000 = null;
                                return (byte[]) var10000;
                            }
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var10000 = null;
                        return (byte[]) var10000;
                    }
                    if (arg0 != -32459) {
                        field452 = (class242) null;
                    }
                    byte[] var19 = var7;
                    return var19;
                }
                var10000 = null;
            } catch (IOException var17) {
                return null;
            }
            return (byte[]) var10000;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZI[BII)Z", line = 372)
    private final boolean method209(boolean arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        field444++;
        class180 var6 = this.field451;
        synchronized (this.field451) {
            try {
                int var7;
                boolean var10000;
                if (arg0) {
                    if (this.field449.method1178(-119) < ((long) (arg4 * 6 + 6))) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field449.method1180((byte) -37, (long) (arg4 * 6));
                    this.field449.method1183(class275.field4617, (byte) -125, 6, 0);
                    var7 = ((class275.field4617[3] & 0xFF) << 16) - (-((class275.field4617[4] & 0xFF) << 8) - (class275.field4617[5] & 0xFF));
                    if (var7 <= 0 || (long) var7 > this.field451.method1178(-126) / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field451.method1178(-123) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class275.field4617[3] = (byte) (var7 >> 16);
                class275.field4617[5] = (byte) var7;
                class275.field4617[0] = (byte) (arg3 >> 16);
                class275.field4617[1] = (byte) (arg3 >> 8);
                class275.field4617[2] = (byte) arg3;
                class275.field4617[4] = (byte) (var7 >> 8);
                int var8 = 0;
                if (arg1 <= 121) {
                    this.field458 = 90;
                }
                int var9 = 0;
                this.field449.method1180((byte) -37, (long) (arg4 * 6));
                this.field449.method1190(class275.field4617, 0, 6, 23065);
                while (true) {
                    if (var8 < arg3) {
                        label143: {
                            int var10 = 0;
                            if (arg0) {
                                this.field451.method1180((byte) -37, (long) (var7 * 520));
                                try {
                                    this.field451.method1183(class275.field4617, (byte) -125, 8, 0);
                                } catch (EOFException var18) {
                                    break label143;
                                }
                                var10 = ((class275.field4617[4] & 0xFF) << 16) + (class275.field4617[6] & 0xFF) + (class275.field4617[5] & 0xFF << 8);
                                int var12 = ((class275.field4617[0] & 0xFF) << 8) + (class275.field4617[1] & 0xFF);
                                int var13 = ((class275.field4617[2] & 0xFF) << 8) + (class275.field4617[3] & 0xFF);
                                int var14 = class275.field4617[7] & 0xFF;
                                if (arg4 != var12 || var9 != var13 || this.field458 != var14) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || (long) var10 > this.field451.method1178(-105) / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                var10 = (int) ((this.field451.method1178(-59) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                                arg0 = false;
                            }
                            class275.field4617[3] = (byte) var9;
                            class275.field4617[0] = (byte) (arg4 >> 8);
                            class275.field4617[1] = (byte) arg4;
                            class275.field4617[7] = (byte) this.field458;
                            class275.field4617[2] = (byte) (var9 >> 8);
                            int var15 = arg3 - var8;
                            if ((arg3 - var8) <= 512) {
                                var10 = 0;
                            }
                            class275.field4617[4] = (byte) (var10 >> 16);
                            var9++;
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            class275.field4617[5] = (byte) (var10 >> 8);
                            class275.field4617[6] = (byte) var10;
                            this.field451.method1180((byte) -37, (long) (var7 * 520));
                            this.field451.method1190(class275.field4617, 0, 8, 23065);
                            var7 = var10;
                            this.field451.method1190(arg2, var8, var15, 23065);
                            var8 += var15;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var19) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II[BI)Z", line = 507)
    public final boolean method210(int arg0, int arg1, byte[] arg2, int arg3) {
        field448++;
        class180 var5 = this.field451;
        synchronized (this.field451) {
            if (arg3 != -29303) {
                method207(-77);
            }
            if (arg0 < 0 || this.field461 < arg0) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method209(true, 124, arg2, arg0, arg1);
            if (!var6) {
                var6 = this.method209(false, arg3 + 29428, arg2, arg0, arg1);
            }
            return var6;
        }
    }
}
