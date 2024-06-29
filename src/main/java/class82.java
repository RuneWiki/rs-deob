import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class82 extends class121 {

    @OriginalMember(owner = "client!se", name = "s", descriptor = "Laa;")
    public class39 field1572 = new class39();

    @OriginalMember(owner = "client!se", name = "J", descriptor = "Lpf;")
    public class253 field1588 = new class253();

    @OriginalMember(owner = "client!se", name = "r", descriptor = "Lkj;")
    private class106 field1571;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "Lha;")
    public static class46 field1574 = class271.method1828("Verbindung mit Update)2Server)3)3)3", -46);

    @OriginalMember(owner = "client!se", name = "D", descriptor = "Lha;")
    public static class46 field1583 = class271.method1828("<br>(X", -46);

    @OriginalMember(owner = "client!se", name = "t", descriptor = "Lha;")
    public static class46 field1573 = class271.method1828(":allyreq:", -46);

    @OriginalMember(owner = "client!se", name = "F", descriptor = "Lha;")
    public static class46 field1585 = class271.method1828("Lade Liste der Welten", -46);

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!se", name = "I", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!se", name = "H", descriptor = "Lhh;")
    public static class263 field1586;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([III)V")
    public final void method649(int[] arg0, int arg1, int arg2) {
        this.field1588.method649(arg0, arg1, arg2);
        field1584++;
        for (class174 var4 = (class174) this.field1572.method264(-121); var4 != null; var4 = (class174) this.field1572.method269((byte) 7)) {
            if (!this.field1571.method797(false, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field3137) {
                        this.method657(var4, (byte) -27, var6, var5 + var6, var5, arg0);
                        var4.field3137 -= var5;
                        break;
                    }
                    this.method657(var4, (byte) -67, var6, var6 + var5, var4.field3137, arg0);
                    var6 += var4.field3137;
                    var5 -= var4.field3137;
                } while (!this.field1571.method793(var6, 32013, var5, arg0, var4));
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V")
    public static void method650(byte arg0) {
        field1574 = null;
        if (arg0 >= 69) {
            field1583 = null;
            field1586 = null;
            field1573 = null;
            field1585 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "()Lwj;")
    public final class121 method651() {
        field1576++;
        class174 var1 = (class174) this.field1572.method264(-117);
        if (var1 == null) {
            return null;
        } else if (var1.field3112 == null) {
            return this.method656();
        } else {
            return var1.field3112;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
    public final void method652(int arg0) {
        this.field1588.method652(arg0);
        field1582++;
        for (class174 var2 = (class174) this.field1572.method264(-59); var2 != null; var2 = (class174) this.field1572.method269((byte) 7)) {
            if (!this.field1571.method797(false, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3137) {
                        this.method653(4, var2, var3);
                        var2.field3137 -= var3;
                        break;
                    }
                    this.method653(4, var2, var2.field3137);
                    var3 -= var2.field3137;
                } while (!this.field1571.method793(0, 32013, var3, (int[]) null, var2));
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILug;I)V")
    private final void method653(int arg0, class174 arg1, int arg2) {
        if ((this.field1571.field1940[arg1.field3124] & arg0) != 0 && arg1.field3132 < 0) {
            int var4 = this.field1571.field1919[arg1.field3124] / class265.field4606;
            int var5 = (var4 + 1048575 - arg1.field3117) / var4;
            arg1.field3117 = arg2 * var4 + arg1.field3117 & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field1571.field1930[arg1.field3124] == 0) {
                    arg1.field3112 = class110.method878(arg1.field3141, arg1.field3112.method900(), arg1.field3112.method875(), arg1.field3112.method886());
                } else {
                    arg1.field3112 = class110.method878(arg1.field3141, arg1.field3112.method900(), 0, arg1.field3112.method886());
                    this.field1571.method830(8, arg1, arg1.field3113.field4825[arg1.field3136] < 0);
                }
                if (arg1.field3113.field4825[arg1.field3136] < 0) {
                    arg1.field3112.method884(-1);
                }
                arg2 = arg1.field3117 / var4;
            }
        }
        field1580++;
        arg1.field3112.method652(arg2);
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(B)V")
    public static final void method654(byte arg0) {
        class85.field1618.method161(true);
        field1587++;
        if (arg0 > -60) {
            method650((byte) -81);
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class239.field4264[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class70.field1204[var2] = 0L;
        }
        class197.field3512 = 0;
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "()I")
    public final int method655() {
        field1575++;
        return 0;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "()Lwj;")
    public final class121 method656() {
        field1579++;
        class174 var1;
        do {
            var1 = (class174) this.field1572.method269((byte) 7);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3112 == null);
        return var1.field3112;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lug;BIII[I)V")
    private final void method657(class174 arg0, byte arg1, int arg2, int arg3, int arg4, int[] arg5) {
        if ((this.field1571.field1940[arg0.field3124] & 0x4) != 0 && arg0.field3132 < 0) {
            int var7 = this.field1571.field1919[arg0.field3124] / class265.field4606;
            while (true) {
                int var8 = (1048575 - (arg0.field3117 - var7)) / var7;
                if (arg4 < var8) {
                    arg0.field3117 += arg4 * var7;
                    break;
                }
                arg4 -= var8;
                arg0.field3112.method649(arg5, arg2, var8);
                arg0.field3117 += var7 * var8 - 1048576;
                arg2 += var8;
                class110 var9 = arg0.field3112;
                int var10 = 262144 / var7;
                int var11 = class265.field4606 / 100;
                if (var10 < var11) {
                    var11 = var10;
                }
                if (this.field1571.field1930[arg0.field3124] == 0) {
                    arg0.field3112 = class110.method878(arg0.field3141, var9.method900(), var9.method875(), var9.method886());
                } else {
                    arg0.field3112 = class110.method878(arg0.field3141, var9.method900(), 0, var9.method886());
                    this.field1571.method830(8, arg0, arg0.field3113.field4825[arg0.field3136] < 0);
                    arg0.field3112.method887(var11, var9.method875());
                }
                if (arg0.field3113.field4825[arg0.field3136] < 0) {
                    arg0.field3112.method884(-1);
                }
                var9.method893(var11);
                var9.method649(arg5, arg2, arg3 - arg2);
                if (var9.method879()) {
                    this.field1588.method1710(var9);
                }
            }
        }
        if (arg1 < -2) {
            arg0.field3112.method649(arg5, arg2, arg4);
            field1581++;
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lkj;)V")
    public class82(class106 arg0) {
        this.field1571 = arg0;
    }
}
