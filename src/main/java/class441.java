import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class441 extends class417 {

    @OriginalMember(owner = "client!go", name = "H", descriptor = "I")
    private int field6590 = -1;

    @OriginalMember(owner = "client!go", name = "B", descriptor = "I")
    private int field6584 = -32768;

    @OriginalMember(owner = "client!go", name = "T", descriptor = "I")
    private int field6602 = 0;

    @OriginalMember(owner = "client!go", name = "W", descriptor = "Z")
    public boolean field6605 = false;

    @OriginalMember(owner = "client!go", name = "Z", descriptor = "I")
    private int field6608 = 0;

    @OriginalMember(owner = "client!go", name = "N", descriptor = "I")
    private int field6596 = 0;

    @OriginalMember(owner = "client!go", name = "O", descriptor = "I")
    private int field6597;

    @OriginalMember(owner = "client!go", name = "Y", descriptor = "I")
    private int field6607;

    @OriginalMember(owner = "client!go", name = "bb", descriptor = "I")
    public int field6610;

    @OriginalMember(owner = "client!go", name = "A", descriptor = "Lkf;")
    private class165 field6583;

    @OriginalMember(owner = "client!go", name = "M", descriptor = "[B")
    public static byte[] field6595;

    @OriginalMember(owner = "client!go", name = "ab", descriptor = "[Ljava/lang/String;")
    public static String[] field6609;

    @OriginalMember(owner = "client!go", name = "z", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!go", name = "C", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!go", name = "F", descriptor = "I")
    public static int field6588;

    @OriginalMember(owner = "client!go", name = "G", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!go", name = "I", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!go", name = "J", descriptor = "I")
    public static int field6592;

    @OriginalMember(owner = "client!go", name = "K", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!go", name = "L", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!go", name = "P", descriptor = "I")
    public static int field6598;

    @OriginalMember(owner = "client!go", name = "Q", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!go", name = "R", descriptor = "I")
    public static int field6600;

    @OriginalMember(owner = "client!go", name = "S", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!go", name = "U", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!go", name = "V", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!go", name = "X", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!go", name = "D", descriptor = "Lwk;")
    private class94 field6586;

    @OriginalMember(owner = "client!go", name = "E", descriptor = "[I")
    public static int[] field6587;

    static {
        new class342((String) null, "der Spieler ist momentan nicht verfügbar.", (String) null, (String) null);
        field6595 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
        field6609 = new String[100];
        new class342("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
    }

    @OriginalMember(owner = "client!go", name = "d", descriptor = "(I)I", line = 5)
    public final int method547(int arg0) {
        if (arg0 != 3) {
            this.field6610 = 126;
        }
        ++field6588;
        return this.field6584;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ILqa;II)Z", line = 21)
    public final boolean method14(int arg0, class162 arg1, int arg2, int arg3) {
        if (arg0 != 131072) {
            this.method2643((byte) 59, -8, (class162) null, 120);
        }
        ++field6594;
        return false;
    }

    @OriginalMember(owner = "client!go", name = "finalize", descriptor = "()V", line = 37)
    protected final void finalize() {
        ++field6600;
        if (this.field6586 != null) {
            this.field6586.method720();
        }
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 49)
    public class441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field6602 = arg12;
        this.field6597 = arg4;
        this.field6607 = arg0;
        this.field6610 = arg1 + arg2;
        class110 var14 = class140.field2233.method2249(this.field6607, -12502);
        int var15 = var14.field1853;
        if (var15 == -1) {
            this.field6605 = true;
        } else {
            this.field6583 = class431.field6419.method1137(62, var15);
            this.field6605 = false;
        }
        if (~this.field6610 == ~arg2) {
            method2642((byte) 101, this.field6608, this.field6583, super.field6233, false, super.field6228, super.field6232);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BLqa;)V", line = 78)
    public final void method25(byte arg0, class162 arg1) {
        ++field6606;
        class121 var3 = this.method2643((byte) -75, 0, arg1, this.field6607);
        if (var3 != null) {
            this.method2647(var3, arg1, 106);
        }
        int var4 = 95 % ((-45 - arg0) / 48);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BILkf;IZII)V", line = 98)
    public static final void method2642(byte arg0, int arg1, class165 arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field6582;
        if (~class148.field2361 > -51) {
            if (arg2 != null && arg2.field2544 != null && arg1 < arg2.field2544.length && arg2.field2544[arg1] != null) {
                int var7 = arg2.field2544[arg1][0];
                int var8 = var7 >> 8;
                int var9 = 7 & var7 >> 5;
                int var10 = 31 & var7;
                if (~arg2.field2544[arg1].length < -2) {
                    int var11 = (int) ((double) arg2.field2544[arg1].length * Math.random());
                    if (var11 > 0) {
                        var8 = arg2.field2544[arg1][var11];
                    }
                }
                if (~var10 == -1) {
                    if (arg4) {
                        class215.method1434(0, 255, var8, var9, 2);
                    }
                } else if (~class443.field6623.field607 != -1) {
                    int var12 = arg5 + -64 >> 7;
                    if (arg0 >= 5) {
                        int var13 = arg3 - 64 >> 7;
                        class245.field3527[class148.field2361++] = new class150((byte) 1, var8, var9, 0, 255, (arg6 << 24) + (var12 << 16) - -(var13 << 8) + var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(B)V", line = 150)
    public final void method22(byte arg0) {
        if (arg0 != -3) {
            field6609 = null;
        }
        ++field6598;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(Z)Z", line = 161)
    public final boolean method24(boolean arg0) {
        if (arg0) {
            this.field6590 = -102;
        }
        ++field6599;
        return false;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ILqa;ZLto;III)V", line = 175)
    public final void method18(int arg0, class162 arg1, boolean arg2, class8 arg3, int arg4, int arg5, int arg6) {
        if (arg4 != -1) {
            this.field6607 = 58;
        }
        ++field6604;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BILqa;I)Lc;", line = 190)
    private final class121 method2643(byte arg0, int arg1, class162 arg2, int arg3) {
        ++field6591;
        class110 var5 = class140.field2233.method2249(arg3, -12502);
        class35 var6 = class43.field829[super.field6232];
        int var7 = -123 / ((-17 - arg0) / 46);
        class35 var8 = ~this.field6597 > -4 ? class43.field829[this.field6597 + 1] : null;
        return this.field6605 ? var5.method823(-1, super.field6228, 0, arg1, super.field6230, var8, (byte) -45, class431.field6419, arg2, super.field6233, -1, true, var6) : var5.method823(this.field6590, super.field6228, this.field6596, arg1, super.field6230, var8, (byte) 125, class431.field6419, arg2, super.field6233, this.field6608, true, var6);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IB)V", line = 209)
    public final void method2644(int arg0, byte arg1) {
        ++field6592;
        if (arg1 > 36) {
            if (!this.field6605) {
                this.field6596 += arg0;
                while (this.field6596 > this.field6583.field2564[this.field6608]) {
                    this.field6596 -= this.field6583.field2564[this.field6608];
                    ++this.field6608;
                    if (this.field6608 >= this.field6583.field2539.length) {
                        this.field6605 = true;
                        break;
                    }
                }
                if (!this.field6605) {
                    method2642((byte) 115, this.field6608, this.field6583, super.field6233, false, super.field6228, super.field6232);
                }
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIILag;)V", line = 240)
    public static final void method2645(int arg0, int arg1, int arg2, class480 arg3) {
        class429 var4 = class394.method2438(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field6366 = arg3;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BLbu;)V", line = 253)
    public static final void method2646(byte arg0, class17 arg1) {
        ++field6603;
        class272.field3931 = arg1.method136("p11_full", 98);
        class228.field3246 = arg1.method136("p12_full", 67);
        class244.field3498 = arg1.method136("b12_full", 89);
        class398.field6005 = arg1.method136("hitmarks", -59);
        class284.field4057 = arg1.method136("hitbar_default", -82);
        if (arg0 <= 24) {
            method2646((byte) 101, (class17) null);
        }
        class76.field1277 = arg1.method136("timerbar_default", -85);
        class77.field1300 = arg1.method136("headicons_pk", -61);
        class333.field5038 = arg1.method136("headicons_prayer", -111);
        class463.field6932 = arg1.method136("hint_headicons", -107);
        class349.field5210 = arg1.method136("hint_mapmarkers", 117);
        class491.field7264 = arg1.method136("mapflag", 67);
        class470.field7058 = arg1.method136("cross", 109);
        class263.field3799 = arg1.method136("mapdots", 72);
        class104.field1728 = arg1.method136("scrollbar", -89);
        class100.field1647 = arg1.method136("name_icons", -57);
        class296.field4209 = arg1.method136("floorshadows", 63);
        class19.field330 = arg1.method136("compass", 96);
        class173.field2665 = arg1.method136("otherlevel", 72);
        class271.field3919 = arg1.method136("hint_mapedge", -95);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lc;Lqa;I)V", line = 288)
    private final void method2647(class121 arg0, class162 arg1, int arg2) {
        ++field6593;
        class26[] var4 = arg0.method893();
        class501[] var5 = arg0.method903();
        if ((this.field6586 == null || this.field6586.field1590) && (var4 != null || var5 != null)) {
            this.field6586 = new class94(class531.field7821);
        }
        if (this.field6586 != null) {
            this.field6586.method721(arg1, (long) class531.field7821, var4, var5, false);
            this.field6586.method718(super.field6232, super.field6231, super.field6235, super.field6238, super.field6226);
        }
        if (arg2 < 90) {
            field6585 = 91;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V", line = 312)
    public final void method2648(byte arg0) {
        if (arg0 == 29) {
            if (this.field6586 != null) {
                this.field6586.method720();
            }
            ++field6601;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZLqa;)Lae;", line = 333)
    public final class163 method13(boolean arg0, class162 arg1) {
        ++field6589;
        class121 var3 = this.method2643((byte) -97, 2048 | (~this.field6602 != -1 ? 5 : 0), arg1, this.field6607);
        if (var3 == null) {
            return null;
        } else {
            if (~this.field6602 != -1) {
                var3.method912(this.field6602 * 2048);
            }
            class414 var4 = arg1.method240();
            var4.method868(super.field6228, super.field6230, super.field6233);
            if (arg0) {
                return null;
            } else {
                if (this.field6586 == null) {
                    var3.method927(var4, (class456) null, 0);
                } else {
                    class49 var5 = this.field6586.method724();
                    arg1.method249(var3, var5, var4, (class456) null, 0);
                }
                this.field6584 = var3.method930();
                this.method2647(var3, arg1, 104);
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(B)V", line = 369)
    public static void method2649(byte arg0) {
        field6609 = null;
        field6595 = null;
        if (arg0 > -61) {
            method2642((byte) -80, 14, (class165) null, 79, false, 49, 32);
        }
        field6587 = null;
    }
}
