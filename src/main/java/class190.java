import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class190 {

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public int field2698;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "B")
    public byte field2685;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public int field2695;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public int field2696;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "B")
    public byte field2686;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public int field2694;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "S")
    public short field2689;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "Z")
    public boolean field2687;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "S")
    public short field2688;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public int field2692;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "S")
    public short field2700;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "Lgv;")
    public static class53 field2699 = null;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "J")
    public static long field2702;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "Lqg;")
    public static class307 field2703;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLtb;)I")
    public static final int method1195(byte arg0, class262 arg1) {
        field2697++;
        String var2 = class162.method1027(arg1, 0);
        int[] var3 = null;
        if (class166.method1048(12474, arg1.field3737)) {
            var3 = class405.field5947.method1162((int) arg1.field3733, 0).field5430;
        } else if (arg1.field3736 != -1) {
            var3 = class405.field5947.method1162(arg1.field3736, 0).field5430;
        } else if (class117.method669((byte) 13, arg1.field3737)) {
            class139 var6 = class504.field7697[(int) arg1.field3733];
            if (var6 != null) {
                class272 var7 = var6.field1825;
                if (var7.field3797 != null) {
                    var7 = var7.method1656(class453.field6591, 120);
                }
                if (var7 != null) {
                    var3 = var7.field3823;
                }
            }
        } else if (class478.method2792(arg1.field3737, (byte) -87)) {
            Object var4 = null;
            class486 var5;
            if (arg1.field3737 == 1002) {
                var5 = class114.field1471.method2132((byte) 121, (int) arg1.field3733);
            } else {
                var5 = class114.field1471.method2132((byte) 125, (int) (arg1.field3733 >>> 32 & 0x7FFFFFFFL));
            }
            if (var5.field7043 != null) {
                var5 = var5.method2834(class453.field6591, false);
            }
            if (var5 != null) {
                var3 = var5.field7077;
            }
        }
        if (var3 != null) {
            var2 = var2 + class103.method616(var3, 0);
        }
        int var8 = class482.field6989.method3047(var2, -11538, class93.field1255);
        int var9 = 65 % ((arg0 + 16) / 36);
        if (arg1.field3740) {
            var8 += class7.field117.method93() + 4;
        }
        return var8;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBI)Ljava/lang/String;")
    public static final String method1196(int arg0, byte arg1, int arg2) {
        field2691++;
        int var3 = arg0 - arg2;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else {
            if (arg1 != -101) {
                method1197(102, (byte) -83);
            }
            return var3 > 0 ? "<col=c0ff00>" : "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)V")
    public static final void method1197(int arg0, byte arg1) {
        class96.field1293 = arg0;
        if (arg1 == -84) {
            field2701++;
            class28.field488.method38((byte) -3);
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(IB)V")
    public static final void method1198(int arg0, byte arg1) {
        class49.method374((byte) -124);
        field2693++;
        int var2 = -19 % ((-arg1 - 71) / 51);
        int var3 = class503.field7685.method1168(-5814, arg0).field567;
        if (var3 == 0) {
            return;
        }
        int var4 = class453.field6591.field209[arg0];
        if (var3 == 5) {
            class318.field4671 = var4;
        }
        if (var3 == 6) {
            class284.field4052 = var4;
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field2698 = arg2;
        this.field2685 = (byte) arg7;
        this.field2695 = arg0;
        this.field2696 = arg3;
        this.field2686 = (byte) arg8;
        this.field2694 = arg1;
        this.field2689 = (short) arg6;
        this.field2687 = arg10;
        this.field2688 = (short) arg5;
        this.field2692 = arg11;
        this.field2700 = (short) arg4;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method1199(int arg0) {
        field2703 = null;
        if (arg0 != -4) {
            method1196(87, (byte) -32, -113);
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
    public static final void method1200(int arg0) {
        field2690++;
        class383.field5696 = 0;
        class230.field3220.method2089(328);
        if (arg0 >= 85) {
            class230.field3220.method2086((byte) -111, class378.field5657);
            class383.field5696++;
        }
    }

    static {
        new class194("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field2702 = 0L;
    }
}
