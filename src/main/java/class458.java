import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class458 {

    @OriginalMember(owner = "client!p", name = "v", descriptor = "Lig;")
    private class15 field6774 = new class15();

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    private int field6764;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    private int field6761;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "Ldq;")
    private class90 field6756;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field6766 = 0;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field6762 = -1;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "I")
    public static int field6776 = 0;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "Lbn;")
    public static class160 field6777;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field6753;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field6765;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public static int field6767;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public static int field6768;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public static int field6769;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public static int field6770;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "Lpl;")
    public static class459 field6778;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "[Lae;")
    public static class285[] field6760;

    static {
        new class409("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field6777 = new class160(8, -1);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Object;Lur;I)V", line = 8)
    public final void method2829(Object arg0, class95 arg1, int arg2) {
        if (arg2 == -3284) {
            this.method2840(1, arg1, -119, arg0);
            field6767++;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V", line = 19)
    public final void method2830(byte arg0) {
        this.field6774.method214(7031);
        field6755++;
        this.field6756.method600(-68);
        int var2 = -108 % ((arg0 + 30) / 63);
        this.field6761 = this.field6764;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V", line = 33)
    public static final void method2831(byte arg0) {
        class208.field2933 = 0;
        field6758++;
        if (arg0 != -28) {
            field6766 = -127;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class228.field3433[var1] = null;
            class411.field5914[var1] = 1;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V", line = 54)
    public final void method2832(int arg0, int arg1) {
        if (arg0 != 5666) {
            this.field6764 = -106;
        }
        if (class464.field6843 != null) {
            for (class276 var3 = (class276) this.field6774.method209(28); var3 != null; var3 = (class276) this.field6774.method217(-27864)) {
                if (var3.method1882(true)) {
                    if (var3.method1881(0) == null) {
                        var3.method1820(arg0 ^ 0xFFFF8B40);
                        var3.method299((byte) -86);
                        this.field6761 += var3.field4086;
                    }
                } else if ((long) arg1 < ++var3.field406) {
                    class276 var4 = class464.field6843.method2245(var3, arg0 - 5659);
                    this.field6756.method606(1, var4, var3.field3907);
                    class286.method1926(var3, (byte) 125, var4);
                    var3.method1820(-25246);
                    var3.method299((byte) -86);
                }
            }
        }
        field6775++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)Lll;", line = 104)
    public static final class343 method2833(boolean arg0) {
        if (arg0) {
            method2837((byte) -79);
        }
        field6763++;
        try {
            return (class343) Class.forName("fg").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V", line = 121)
    public final void method2834(int arg0) {
        if (arg0 != -103) {
            return;
        }
        for (class276 var2 = (class276) this.field6774.method209(28); var2 != null; var2 = (class276) this.field6774.method217(arg0 - 27761)) {
            if (var2.method1882(true)) {
                var2.method1820(-25246);
                var2.method299((byte) -86);
                this.field6761 += var2.field4086;
            }
        }
        field6765++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lct;BLic;)V", line = 148)
    public static final void method2835(class104 arg0, byte arg1, class235 arg2) {
        field6757++;
        if (arg1 == 14) {
            class3.field43 = arg0;
            class343.field5051 = arg2;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V", line = 162)
    public static final void method2836(int arg0) {
        field6773++;
        if (class52.field655 != 0) {
            class13.field222 -= class52.field655 * 5;
            if (class120.field1608 <= class13.field222) {
                class13.field222 = class120.field1608 - 1;
            }
            class52.field655 = 0;
            if (class13.field222 < 0) {
                class13.field222 = 0;
            }
        }
        if (class217.field3091 < 102) {
            class217.field3091 += 6;
        }
        for (int var1 = 0; var1 < class34.field480; var1++) {
            int var2 = class33.field474[var1].method2459(~arg0);
            char var3 = class33.field474[var1].method2456((byte) 47);
            if (var2 == 84) {
                class63.method469(false);
            } else if (class436.field6368.method256(-107, 82) && var2 == 66) {
                if (class446.field6502 != null) {
                    String var8 = "";
                    for (int var9 = class206.field2886.length - 1; var9 >= 0; var9--) {
                        if (class206.field2886[var9] != null && class206.field2886[var9].length() > 0) {
                            var8 = var8 + class206.field2886[var9] + '\n';
                        }
                    }
                    class446.field6502.setContents(new StringSelection(var8), (ClipboardOwner) null);
                }
            } else if (class436.field6368.method256(-122, 82) && var2 == 67) {
                if (class446.field6502 != null) {
                    Transferable var4 = class446.field6502.getContents((Object) null);
                    if (var4 != null) {
                        try {
                            String var5 = (String) var4.getTransferData(DataFlavor.stringFlavor);
                            if (var5 != null) {
                                String[] var6 = class278.method1886('\n', arg0 - 19369, var5);
                                if (var6.length > 1) {
                                    for (int var7 = 0; var7 < var6.length; var7++) {
                                        class451.field6664 = var6[var7];
                                        class63.method469(false);
                                    }
                                } else {
                                    class451.field6664 = class451.field6664 + var5;
                                }
                            }
                        } catch (Exception var11) {
                        }
                    }
                }
            } else if (var2 == 85 && class432.field6300 > 0) {
                class451.field6664 = class451.field6664.substring(0, class432.field6300 - 1) + class451.field6664.substring(class432.field6300);
                class432.field6300--;
            } else if (var2 == 101 && class432.field6300 < class451.field6664.length()) {
                class451.field6664 = class451.field6664.substring(0, class432.field6300) + class451.field6664.substring(class432.field6300 + 1);
            } else if (var2 == 96 && class432.field6300 > 0) {
                class432.field6300--;
            } else if (var2 == 97 && class432.field6300 < class451.field6664.length()) {
                class432.field6300++;
            } else if (var2 == 102) {
                class432.field6300 = 0;
            } else if (var2 == 103) {
                class432.field6300 = class451.field6664.length();
            } else if (var2 == 104 && class206.field2886.length > class345.field5079) {
                class345.field5079++;
                class401.method2509(true);
                class432.field6300 = class451.field6664.length();
            } else if (var2 == 105 && class345.field5079 > 0) {
                class345.field5079--;
                class401.method2509(true);
                class432.field6300 = class451.field6664.length();
            } else if (class454.method2811(false, var3) || var3 == ':' || var3 == ',' || var3 == ' ' || var3 == '_' || var3 == '-' || var3 == '+' || var3 == '[' || var3 == ']') {
                class451.field6664 = class451.field6664.substring(0, class432.field6300) + class33.field474[var1].method2456((byte) 85) + class451.field6664.substring(class432.field6300);
                class432.field6300++;
            }
        }
        class34.field480 = arg0;
        for (int var10 = 0; var10 < 100; var10++) {
            int var10002;
            if (class169.field2215[var10]) {
                var10002 = class271.field4016[var10]++;
                if (class271.field4016[var10] > 102) {
                    class169.field2215[var10] = false;
                }
            } else {
                var10002 = class271.field4016[var10]--;
                if (class271.field4016[var10] < 0) {
                    class296.field4313[var10] = (int) (Math.random() * (double) class214.field3016);
                    class184.field2580[var10] = (int) (Math.random() * 350.0D);
                    class271.field4016[var10] = 0;
                    class169.field2215[var10] = true;
                }
            }
        }
        class51.method400(arg0 ^ 0xFFFFFFCF);
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V", line = 354)
    public static void method2837(byte arg0) {
        field6760 = null;
        field6778 = null;
        field6777 = null;
        if (arg0 != -25) {
            field6776 = -120;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)V", line = 366)
    public static final void method2838(int arg0, int arg1) {
        field6770++;
        if (!class103.method695(arg0, -110)) {
            return;
        }
        if (arg1 != -12823) {
            field6762 = -98;
        }
        class223[] var2 = class444.field6470[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class223 var4 = var2[var3];
            if (var4 != null) {
                var4.field3289 = 0;
                var4.field3344 = 1;
                var4.field3287 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(B)I", line = 402)
    public final int method2839(byte arg0) {
        field6771++;
        return arg0 == -13 ? this.field6764 : -29;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILur;ILjava/lang/Object;)V", line = 415)
    private final void method2840(int arg0, class95 arg1, int arg2, Object arg3) {
        field6772++;
        if (this.field6764 < arg0) {
            throw new IllegalStateException("s>cs");
        }
        this.method2843((byte) 98, arg1);
        this.field6761 -= arg0;
        while (this.field6761 < 0) {
            class276 var6 = (class276) this.field6774.method213(0);
            this.method2841(var6, (byte) -59);
        }
        if (arg2 <= -110) {
            class419 var5 = new class419(arg1, arg3, arg0);
            this.field6756.method606(1, var5, arg1.method638((byte) 73));
            this.field6774.method211(var5, -32256);
            var5.field406 = 0L;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lek;B)V", line = 451)
    private final void method2841(class276 arg0, byte arg1) {
        if (arg0 != null) {
            arg0.method1820(-25246);
            arg0.method299((byte) -86);
            this.field6761 += arg0.field4086;
        }
        field6769++;
        if (arg1 != -59) {
            this.method2843((byte) -97, (class95) null);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BLur;)Ljava/lang/Object;", line = 469)
    public final Object method2842(byte arg0, class95 arg1) {
        field6759++;
        long var3 = arg1.method638((byte) 107);
        if (arg0 < 46) {
            this.method2841((class276) null, (byte) 24);
        }
        for (class276 var5 = (class276) this.field6756.method609(var3, 90); var5 != null; var5 = (class276) this.field6756.method611(-73)) {
            if (var5.field4083.method639((byte) -57, arg1)) {
                Object var6 = var5.method1881(0);
                if (var6 != null) {
                    if (var5.method1882(true)) {
                        class419 var7 = new class419(arg1, var6, var5.field4086);
                        this.field6756.method606(1, var7, var5.field3907);
                        this.field6774.method211(var7, -32256);
                        var7.field406 = 0L;
                        var5.method1820(-25246);
                        var5.method299((byte) -86);
                    } else {
                        this.field6774.method211(var5, -32256);
                        var5.field406 = 0L;
                    }
                    return var6;
                }
                var5.method1820(-25246);
                var5.method299((byte) -86);
                this.field6761 += var5.field4086;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(BLur;)V", line = 529)
    private final void method2843(byte arg0, class95 arg1) {
        field6753++;
        long var3 = arg1.method638((byte) 115);
        for (class276 var5 = (class276) this.field6756.method609(var3, 94); var5 != null; var5 = (class276) this.field6756.method611(arg0 - 225)) {
            if (var5.field4083.method639((byte) -97, arg1)) {
                this.method2841(var5, (byte) -59);
                break;
            }
        }
        if (arg0 != 98) {
            this.field6764 = 96;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(Z)I", line = 555)
    public final int method2844(boolean arg0) {
        if (arg0) {
            this.method2830((byte) 8);
        }
        field6754++;
        return this.field6761;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(I)V", line = 572)
    public class458(int arg0) {
        this.field6764 = arg0;
        this.field6761 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field6756 = new class90(var2);
    }
}
