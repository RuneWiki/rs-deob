import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class125 {

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "B")
    public byte field1745 = 0;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "B")
    public byte field1735;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "B")
    public byte field1737;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "S")
    public short field1734;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "S")
    public short field1757;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "Lbj;")
    public static class131 field1747 = new class131(200);

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
    public static int field1760 = 0;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
    public static int field1758 = 0;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "B")
    public byte field1733;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "B")
    public byte field1744;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "B")
    public byte field1746;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "B")
    public byte field1748;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "Lpk;")
    public class109 field1739;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "Lem;")
    public class123 field1749;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "Ljd;")
    public class125 field1762;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "Ljo;")
    public class184 field1741;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "Les;")
    public class214 field1740;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "Les;")
    public class214 field1750;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "Lmk;")
    public class34 field1756;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "Lmk;")
    public class34 field1761;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "Lmr;")
    public class77 field1742;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "S")
    public short field1736;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "Z")
    public boolean field1732;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "Z")
    public boolean field1754;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "Z")
    public boolean field1759;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BII)V", line = 3)
    public static final void method849(byte arg0, int arg1, int arg2) {
        field1738++;
        class239 var3 = class436.method2740(14, arg2, arg0 ^ 0xECBB0CD9);
        if (arg0 == 57) {
            var3.method1622(28);
            var3.field3399 = arg1;
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(III)V", line = 16)
    public class125(int arg0, int arg1, int arg2) {
        this.field1737 = this.field1735 = (byte) arg0;
        this.field1734 = (short) arg1;
        this.field1757 = (short) arg2;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 27)
    public static void method850(int arg0) {
        if (arg0 == 0) {
            field1747 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V", line = 39)
    public final void method851(int arg0) {
        if (arg0 != -12572) {
            return;
        }
        while (this.field1749 != null) {
            class123 var2 = this.field1749.field1711;
            this.field1749.method833(500);
            this.field1749 = var2;
        }
        field1751++;
        this.field1745 = 0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZI)V", line = 60)
    public static final void method852(boolean arg0, int arg1) {
        field1753++;
        class292.field4088++;
        class46.field648.method1178(63, arg1);
        for (class26 var2 = (class26) class454.field6477.method885(-122); var2 != null; var2 = (class26) class454.field6477.method881((byte) -68)) {
            if (!var2.method2470((byte) -123)) {
                var2 = (class26) class454.field6477.method885(-124);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field462 == 0) {
                class325.method2090(var2, true, arg0, -10);
            }
        }
        if (class109.field1567 != null) {
            class404.method2531(26878, class109.field1567);
            class109.field1567 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)I", line = 96)
    public static final int method853(int arg0, boolean arg1) {
        if (!arg1) {
            method850(-80);
        }
        field1755++;
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BILms;I)V", line = 107)
    public static final void method854(byte arg0, int arg1, class453 arg2, int arg3) {
        field1743++;
        if (!class327.field4511) {
            for (int var4 = 9; var4 >= 5; var4--) {
                String var8 = class133.method919(arg2, (byte) -46, var4);
                if (var8 != null) {
                    class397.field5675++;
                    class66.method514(arg2.field6314, arg2.field6406, 1002, arg2.field6437, (byte) -16, class173.method1138(var4, arg2, 123), (long) (var4 + 1), var8);
                }
            }
            String var5 = class13.method225(false, arg2);
            if (var5 != null) {
                class66.method514(arg2.field6314, arg2.field6406, 9, arg2.field6437, (byte) -16, arg2.field6410, 0L, var5);
                class28.field473++;
            }
            for (int var6 = 4; var6 >= 0; var6--) {
                String var7 = class133.method919(arg2, (byte) -46, var6);
                if (var7 != null) {
                    class397.field5675++;
                    class66.method514(arg2.field6314, arg2.field6406, 47, arg2.field6437, (byte) -16, class173.method1138(var6, arg2, 124), (long) (var6 + 1), var7);
                }
            }
            if (client.method1091(arg2).method955(-109)) {
                if (arg2.field6340 == null) {
                    class66.method514(arg2.field6314, arg2.field6406, 2, "", (byte) -16, -1, 0L, class274.field3814.method2763(arg0 + 99, class210.field2935));
                } else {
                    class66.method514(arg2.field6314, arg2.field6406, 2, "", (byte) -16, -1, 0L, arg2.field6340);
                }
                class249.field3524++;
            }
        } else if (client.method1091(arg2).method951(-18995) && (class319.field4354 & 0x20) != 0) {
            class66.method514(arg2.field6314, arg2.field6406, 6, class416.field5913 + " -> " + arg2.field6437, (byte) -16, class92.field1289, 0L, class249.field3519);
            class248.field3507++;
        }
        if (arg0 != 14) {
            method853(13, false);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V", line = 191)
    public static final void method855(boolean arg0) {
        field1752++;
        if (!arg0) {
            method850(106);
        }
        class199 var1 = null;
        try {
            class283 var2 = class241.field3426.method1897(13);
            while (var2.field3998 == 0) {
                class349.method2219(1L, -43);
            }
            if (var2.field3998 == 1) {
                var1 = (class199) var2.field3999;
                byte[] var3 = new byte[(int) var1.method1303(-120)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method1302(var4, var3, var3.length - var4, 0);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class198.method1293(new class11(var3), (byte) 118);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method1304(0);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V", line = 250)
    public static final void method856(int arg0, int arg1) {
        class69 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class242 var4 = class418.field5939[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class264.field3687; var5++) {
                    for (int var6 = 0; var6 < class200.field2772; var6++) {
                        var2 = var4.method733(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << 7;
                            int var8 = var5 << 7;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class242 var10 = class418.field5939[var9];
                                if (var10 != null) {
                                    int var11 = var4.method737(var6, var5) - var10.method737(var6, var5);
                                    int var12 = var4.method737(var6 + 1, var5) - var10.method737(var6 + 1, var5);
                                    int var13 = var4.method737(var6 + 1, var5 + 1) - var10.method737(var6 + 1, var5 + 1);
                                    int var14 = var4.method737(var6, var5 + 1) - var10.method737(var6, var5 + 1);
                                    var10.method739(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
