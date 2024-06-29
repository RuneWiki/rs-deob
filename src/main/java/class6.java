import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 {

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "F")
    public float field59 = 1.0F;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "F")
    public float field67 = 1.0F;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "F")
    public float field78 = 0.25F;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "F")
    public float field79;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public int field58;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "F")
    public float field69;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public int field74;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public int field66;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public int field62;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "F")
    public float field63;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public int field71;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public int field64;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "Lob;")
    public class521 field65;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field60 = -1;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "Lwq;")
    public static class115 field61 = new class115(2, 14);

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "Lao;")
    public static class191 field70 = new class191(38, 10);

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "[J")
    public static long[] field77 = new long[256];

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "Lo;")
    public static class24 field75;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "Lfo;")
    public static class361 field76;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public static final void method32(int arg0) {
        int var1 = -68 % ((-arg0 - 59) / 35);
        if (class99.field1362 < 102) {
            class99.field1362 += 6;
        }
        field72++;
        if (class180.field2351 != 0) {
            class4.field15 -= class180.field2351 * 5;
            if (class277.field3678 <= class4.field15) {
                class4.field15 = class277.field3678 - 1;
            }
            class180.field2351 = 0;
            if (class4.field15 < 0) {
                class4.field15 = 0;
            }
        }
        for (int var2 = 0; var2 < class329.field4364; var2++) {
            int var3 = class152.field1991[var2].method340(101);
            char var4 = class152.field1991[var2].method342(true);
            if (var3 == 84) {
                class347.method2008(false, 127);
            }
            if (var3 == 80) {
                class347.method2008(true, 126);
            } else if (class413.field5893.method1472(28251, 82) && var3 == 66) {
                if (class155.field2033 != null) {
                    String var5 = "";
                    for (int var6 = class176.field2278.length - 1; var6 >= 0; var6--) {
                        if (class176.field2278[var6] != null && class176.field2278[var6].length() > 0) {
                            var5 = var5 + class176.field2278[var6] + '\n';
                        }
                    }
                    class155.field2033.setContents(new StringSelection(var5), null);
                }
            } else if (class413.field5893.method1472(28251, 82) && var3 == 67) {
                if (class155.field2033 != null) {
                    Transferable var7 = class155.field2033.getContents(null);
                    if (var7 != null) {
                        try {
                            String var8 = (String) var7.getTransferData(DataFlavor.stringFlavor);
                            if (var8 != null) {
                                String[] var9 = class436.method2679((byte) 73, '\n', var8);
                                if (var9.length > 1) {
                                    for (int var10 = 0; var10 < var9.length; var10++) {
                                        class470.field6980 = var9[var10];
                                        class347.method2008(false, 23);
                                    }
                                } else {
                                    class470.field6980 = class470.field6980 + var8;
                                }
                            }
                        } catch (Exception var11) {
                        }
                    }
                }
            } else if (var3 == 85 && class330.field4386 > 0) {
                class470.field6980 = class470.field6980.substring(0, class330.field4386 - 1) + class470.field6980.substring(class330.field4386);
                class330.field4386--;
            } else if (var3 == 101 && class330.field4386 < class470.field6980.length()) {
                class470.field6980 = class470.field6980.substring(0, class330.field4386) + class470.field6980.substring(class330.field4386 + 1);
            } else if (var3 == 96 && class330.field4386 > 0) {
                class330.field4386--;
            } else if (var3 == 97 && class330.field4386 < class470.field6980.length()) {
                class330.field4386++;
            } else if (var3 == 102) {
                class330.field4386 = 0;
            } else if (var3 == 103) {
                class330.field4386 = class470.field6980.length();
            } else if (var3 == 104 && class176.field2278.length > class264.field3541) {
                class264.field3541++;
                class365.method2170(-2830);
                class330.field4386 = class470.field6980.length();
            } else if (var3 == 105 && class264.field3541 > 0) {
                class264.field3541--;
                class365.method2170(-2830);
                class330.field4386 = class470.field6980.length();
            } else if (class273.method1663(var4, (byte) 99) || var4 == ':' || var4 == ',' || var4 == ' ' || var4 == '_' || var4 == '-' || var4 == '+' || var4 == '[' || var4 == ']') {
                class470.field6980 = class470.field6980.substring(0, class330.field4386) + class152.field1991[var2].method342(true) + class470.field6980.substring(class330.field4386);
                class330.field4386++;
            }
        }
        class329.field4364 = 0;
        class104.method628(-100);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILug;)V")
    public final void method33(int arg0, class396 arg1) {
        this.field59 = (float) (arg1.method2388((byte) -114) * 8) / 255.0F;
        field73++;
        this.field78 = (float) (arg1.method2388((byte) -117) * 8) / 255.0F;
        this.field67 = (float) (arg1.method2388((byte) -127) * 8) / 255.0F;
        if (arg0 > -70) {
            field70 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILie;)Z")
    public final boolean method34(int arg0, class6 arg1) {
        field68++;
        if (arg0 > -11) {
            return false;
        } else {
            return this.field74 == arg1.field74 && this.field63 == arg1.field63 && this.field79 == arg1.field79 && this.field69 == arg1.field69 && this.field78 == arg1.field78 && this.field59 == arg1.field59 && this.field67 == arg1.field67 && this.field62 == arg1.field62 && this.field58 == arg1.field58 && this.field65 == arg1.field65;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
    public static void method35(int arg0) {
        field75 = null;
        field61 = null;
        field76 = null;
        if (arg0 != -22876) {
            method32(10);
        }
        field77 = null;
        field70 = null;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
    public class6() {
        this.field79 = 0.69921875F;
        this.field58 = 0;
        this.field69 = 1.2F;
        this.field74 = class378.field5477;
        this.field66 = -50;
        this.field62 = class485.field7142;
        this.field63 = 1.1523438F;
        this.field71 = -60;
        this.field64 = -50;
        this.field65 = class525.field7728;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lug;)V")
    public class6(class396 arg0) {
        int var2 = arg0.method2388((byte) -112);
        if (class319.field4256.method2061((byte) 101, class20.field183) && class275.field3667.method1176() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field74 = class378.field5477;
            } else {
                this.field74 = arg0.method2406((byte) -92);
            }
            if ((var2 & 0x2) == 0) {
                this.field63 = 1.1523438F;
            } else {
                this.field63 = (float) arg0.method2386(-23648) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field79 = 0.69921875F;
            } else {
                this.field79 = (float) arg0.method2386(-23648) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field69 = 1.2F;
            } else {
                this.field69 = (float) arg0.method2386(-23648) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method2406((byte) -103);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method2386(-23648);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method2386(-23648);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method2386(-23648);
            }
            this.field79 = 0.69921875F;
            this.field69 = 1.2F;
            this.field74 = class378.field5477;
            this.field63 = 1.1523438F;
        }
        if ((var2 & 0x10) == 0) {
            this.field71 = -60;
            this.field64 = -50;
            this.field66 = -50;
        } else {
            this.field64 = arg0.method2433((byte) 115);
            this.field71 = arg0.method2433((byte) 115);
            this.field66 = arg0.method2433((byte) 115);
        }
        if ((var2 & 0x20) == 0) {
            this.field62 = class485.field7142;
        } else {
            this.field62 = arg0.method2406((byte) -82);
        }
        if ((var2 & 0x40) == 0) {
            this.field58 = 0;
        } else {
            this.field58 = arg0.method2386(-23648);
        }
        if ((var2 & 0x80) == 0) {
            this.field65 = class525.field7728;
        } else {
            int var3 = arg0.method2386(-23648);
            int var4 = arg0.method2386(-23648);
            int var5 = arg0.method2386(-23648);
            int var6 = arg0.method2386(-23648);
            int var7 = arg0.method2386(-23648);
            int var8 = arg0.method2386(-23648);
            this.field65 = class500.method3003(var5, var4, var7, var3, var8, (byte) 121, var6);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field77[var0] = var1;
        }
    }
}
