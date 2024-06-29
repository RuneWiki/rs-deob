import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class296 {

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public int field4511 = 2;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "Z")
    public boolean field4514 = false;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public int field4515 = -1;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "Z")
    public boolean field4517 = false;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public int field4518 = 64;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public int field4521 = 64;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public int field4512 = 1;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "[S")
    public static short[] field4507 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field4509 = 0;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field4520 = -1;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "[Ll;")
    public static class16[] field4508;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lhp;ZII)V")
    private final void method1921(class217 arg0, boolean arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            this.field4515 = arg0.method1511(-118);
            if (this.field4515 == 65535) {
                this.field4515 = -1;
            }
        } else if (arg3 == 2) {
            this.field4518 = arg0.method1511(122) + 1;
            this.field4521 = arg0.method1511(-35) + 1;
        } else if (arg3 == 3) {
            arg0.method1565(true);
        } else if (arg3 == 4) {
            this.field4511 = arg0.method1515((byte) 122);
        } else if (arg3 == 5) {
            this.field4512 = arg0.method1515((byte) 123);
        } else if (arg3 == 6) {
            this.field4514 = true;
        } else if (arg3 == 7) {
            this.field4517 = true;
        }
        if (!arg1) {
            field4516++;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBLhp;)V")
    public final void method1922(int arg0, byte arg1, class217 arg2) {
        field4510++;
        int var4 = -80 % ((arg1 - 68) / 51);
        while (true) {
            int var5 = arg2.method1515((byte) 125);
            if (var5 == 0) {
                return;
            }
            this.method1921(arg2, false, arg0, var5);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    public static void method1923(byte arg0) {
        if (arg0 != -100) {
            method1925(false);
        }
        field4508 = null;
        field4507 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([BI)Ljava/lang/String;")
    public static final String method1924(byte[] arg0, int arg1) {
        field4522++;
        int var2 = arg0.length;
        if (arg1 > -65) {
            method1926(null, (byte) 89, null);
        }
        char[] var3 = new char[var2];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            int var6 = arg0[var5] & 0xFF;
            if (var6 >= 128) {
                if (var6 < 194) {
                    throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var6);
                }
                if (var6 < 224) {
                    if (var5 + 1 >= var2) {
                        throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                    }
                    var5++;
                    int var7 = arg0[var5] & 0xFF;
                    if (var7 < 128 || var7 > 191) {
                        throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                    }
                    var3[var4++] = (char) class264.method1763(class74.method644(-12352, var6 << 6), class74.method644(-129, var7));
                } else if (var6 < 240) {
                    if (var5 + 2 >= var2) {
                        throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                    }
                    var5++;
                    int var8 = arg0[var5] & 0xFF;
                    if (var8 >= 128 && var8 <= 191) {
                        var5++;
                        int var9 = arg0[var5] & 0xFF;
                        if (var9 >= 128 && var9 <= 191) {
                            var3[var4++] = (char) class264.method1763(class74.method644(-129, var9), class264.method1763(class74.method644(-225, var6) << 12, class74.method644(var8 << 6, -8256)));
                            continue;
                        }
                        throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                    }
                    throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                } else if (var6 < 244) {
                    throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                } else {
                    throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var6);
                }
            } else {
                var3[var4++] = (char) var6;
            }
        }
        return new String(var3, 0, var4);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
    public static final void method1925(boolean arg0) {
        class508.field7444.method93((byte) 87);
        if (arg0) {
            field4519++;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lhp;BLjava/lang/String;)I")
    public static final int method1926(class217 arg0, byte arg1, String arg2) {
        field4513++;
        int var3 = 106 % ((arg1 - 57) / 41);
        int var4 = arg0.field3556;
        byte[] var5 = class180.method1205(25146, arg2);
        arg0.method1557(17, var5.length);
        arg0.field3556 += class60.field720.method1664(arg0.field3572, var5, 0, 28137, var5.length, arg0.field3556);
        return arg0.field3556 - var4;
    }
}
