import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class130 {

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public int field1869;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public int field1876;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public int field1874;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public int field1875;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "[Lgn;")
    public static class493[] field1868 = new class493[5];

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
    public static final void method998(byte arg0) {
        field1870++;
        for (int var1 = 0; var1 < class200.field2934; var1++) {
            int var2 = class89.field1217[var1];
            class461 var3 = class250.field3690[var2];
            int var4 = class85.field1163.method577(255);
            if ((var4 & 0x40) != 0) {
                var4 += class85.field1163.method577(255) << 8;
            }
            if ((var4 & 0x1000) != 0) {
                int var5 = class85.field1163.method610(-101);
                int[] var6 = new int[var5];
                int[] var7 = new int[var5];
                int[] var8 = new int[var5];
                for (int var9 = 0; var9 < var5; var9++) {
                    int var10 = class85.field1163.method623((byte) -95);
                    if (var10 == 65535) {
                        var10 = -1;
                    }
                    var6[var9] = var10;
                    var7[var9] = class85.field1163.method607(27574);
                    var8[var9] = class85.field1163.method623((byte) 91);
                }
                class380.method2327(var7, var3, var6, false, var8);
            }
            if ((var4 & 0x10) != 0) {
                if (var3.field6790.method852(-61)) {
                    class248.method1626(var3, 16777216);
                }
                var3.method2771((byte) -121, class515.field7587.method1215(class85.field1163.method623((byte) 101), 1));
                var3.method966(var3.field6790.field1344, (byte) -120);
                var3.field1767 = var3.field6790.field1378 << 3;
                if (var3.field6790.method852(112)) {
                    class477.method2886(var3.field1777[0], -1, var3, null, var3.field1778[0], 0, var3.field6328, null);
                }
            }
            if ((var4 & 0x2) != 0) {
                int var11 = class85.field1163.method593((byte) 74);
                int var12 = class85.field1163.method607(27574);
                var3.method958(68, var11, class263.field3867, var12);
            }
            if ((var4 & 0x400) != 0) {
                var3.field6770 = class85.field1163.method635(952968608);
                var3.field6777 = class85.field1163.method625(119);
            }
            if ((var4 & 0x100) != 0) {
                var3.field1726 = class85.field1163.method621(128);
                var3.field1735 = class85.field1163.method621(128);
                var3.field1727 = class85.field1163.method594(0);
                var3.field1759 = class85.field1163.method621(128);
                var3.field1692 = class85.field1163.method623((byte) -112) + class263.field3867;
                var3.field1698 = class85.field1163.method635(952968608) + class263.field3867;
                var3.field1724 = class85.field1163.method576((byte) -80);
                var3.field1735 += var3.field1778[0];
                var3.field1759 += var3.field1778[0];
                var3.field1726 += var3.field1777[0];
                var3.field1727 += var3.field1777[0];
                var3.field1779 = 1;
                var3.field1783 = 0;
            }
            if ((var4 & 0x800) != 0) {
                int var13 = class85.field1163.method623((byte) -107);
                int var14 = class85.field1163.method578(-99);
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var15 = class85.field1163.method576((byte) -101);
                var3.method960(0, var15, var14, true, var13);
            }
            if ((var4 & 0x4) != 0) {
                int var16 = class85.field1163.method625(123);
                if (var16 == 65535) {
                    var16 = -1;
                }
                int var17 = class85.field1163.method576((byte) 122);
                class75.method708(var16, var17, 1, var3);
            }
            if ((var4 & 0x2000) != 0) {
                var3.field1761 = class85.field1163.method636(-109);
                var3.field1706 = class85.field1163.method636(-98);
                var3.field1725 = class85.field1163.method636(-70);
                var3.field1695 = (byte) class85.field1163.method610(-123);
                var3.field1694 = class263.field3867 + class85.field1163.method602((byte) 55);
                var3.field1753 = class263.field3867 + class85.field1163.method623((byte) 110);
            }
            if ((var4 & 0x1) != 0) {
                int var18 = class85.field1163.method635(952968608);
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var19 = class85.field1163.method597(97);
                int var20 = class85.field1163.method576((byte) -12);
                var3.method960(0, var20, var19, false, var18);
            }
            if ((var4 & 0x200) != 0) {
                int var21 = class85.field1163.method602((byte) 55);
                var3.field1734 = class85.field1163.method607(27574);
                var3.field1737 = class85.field1163.method577(255);
                var3.field1722 = var21 & 0x7FFF;
                var3.field1684 = (var21 & 0x8000) != 0;
                var3.field1714 = class263.field3867 + var3.field1734 + var3.field1722;
            }
            if ((var4 & 0x8) != 0) {
                var3.field1713 = class85.field1163.method635(952968608);
                if (var3.field1713 == 65535) {
                    var3.field1713 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field1699 = class85.field1163.method624((byte) -40);
                var3.field1764 = 100;
            }
            if ((var4 & 0x20) != 0) {
                int var22 = class85.field1163.method593((byte) 94);
                int var23 = class85.field1163.method607(27574);
                var3.method958(69, var22, class263.field3867, var23);
                var3.field1757 = class263.field3867 + 300;
                var3.field1702 = class85.field1163.method607(27574);
            }
        }
        if (arg0 < 123) {
            method999(-125);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public static void method999(int arg0) {
        field1868 = null;
        if (arg0 != 1) {
            method998((byte) 85);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZI)Lme;")
    public final class130 method1000(boolean arg0, int arg1) {
        if (arg0) {
            field1871++;
            return new class130(this.field1874, arg1, this.field1875, this.field1876);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V")
    public static final void method1001(byte arg0) {
        for (int var1 = 0; var1 < class238.field3497.length; var1++) {
            for (int var2 = 0; var2 < class238.field3497[0].length; var2++) {
                for (int var3 = 0; var3 < class238.field3497[0][0].length; var3++) {
                    class238.field3497[var1][var2][var3] = 0;
                }
            }
        }
        if (arg0 > 7) {
            field1872++;
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(IIII)V")
    public class130(int arg0, int arg1, int arg2, int arg3) {
        this.field1869 = arg1;
        this.field1876 = arg3;
        this.field1874 = arg0;
        this.field1875 = arg2;
    }

    static {
        for (int var0 = 0; var0 < field1868.length; var0++) {
            field1868[var0] = new class493();
        }
        new class331("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
    }
}
