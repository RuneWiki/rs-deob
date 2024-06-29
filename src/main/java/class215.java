import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class215 {

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
    private int field3708 = 0;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "[Lli;")
    private class80[] field3697;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    private int field3695;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    public static int field3706 = 100;

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "[I")
    public static int[] field3709 = new int[1000];

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field3691 = -1;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "J")
    private long field3693;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "Lli;")
    private class80 field3689;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "Lli;")
    private class80 field3711;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "[[[Laa;")
    public static class16[][][] field3707;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLli;J)V")
    public final void method1380(byte arg0, class80 arg1, long arg2) {
        field3692++;
        int var5 = -127 % ((arg0 - 68) / 51);
        if (arg1.field1569 != null) {
            arg1.method560(-17554);
        }
        class80 var6 = this.field3697[(int) ((long) (this.field3695 - 1) & arg2)];
        arg1.field1571 = var6;
        arg1.field1560 = arg2;
        arg1.field1569 = var6.field1569;
        arg1.field1569.field1571 = arg1;
        arg1.field1571.field1569 = arg1;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(JI)Lli;")
    public final class80 method1381(long arg0, int arg1) {
        int var4 = -86 % ((16 - arg1) / 54);
        field3705++;
        this.field3693 = arg0;
        class80 var5 = this.field3697[(int) ((long) (this.field3695 - 1) & arg0)];
        for (this.field3689 = var5.field1571; this.field3689 != var5; this.field3689 = this.field3689.field1571) {
            if (this.field3689.field1560 == arg0) {
                class80 var6 = this.field3689;
                this.field3689 = this.field3689.field1571;
                return var6;
            }
        }
        this.field3689 = null;
        return null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)Lli;")
    public final class80 method1382(int arg0) {
        this.field3708 = 0;
        field3703++;
        if (arg0 != -32642) {
            this.method1389(-62);
        }
        return this.method1386((byte) -119);
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)I")
    public final int method1383(int arg0) {
        if (arg0 > -126) {
            this.field3693 = -127L;
        }
        field3710++;
        return this.field3695;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILfa;)V")
    public static final void method1384(int arg0, class45 arg1) {
        field3701++;
        class217 var2 = (class217) class52.field921.method1381(arg1.field815.method479(arg0 + 10909), 127);
        if (arg0 != -1) {
            field3707 = null;
        }
        if (var2 == null) {
            return;
        }
        if (var2.field3722 != null) {
            class206.field3528.method1031(var2.field3722);
            var2.field3722 = null;
        }
        var2.method560(-17554);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lha;I)V")
    public static final void method1385(class63 arg0, int arg1) {
        if (class163.field2926 == arg0.field1183) {
            class255.field4485[arg0.field1225] = true;
        }
        if (arg1 >= -112) {
            method1388((class196) null, false, true);
        }
        field3704++;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)Lli;")
    public final class80 method1386(byte arg0) {
        field3694++;
        if (arg0 > -95) {
            field3709 = null;
        }
        if (this.field3708 > 0 && this.field3697[this.field3708 - 1] != this.field3711) {
            class80 var2 = this.field3711;
            this.field3711 = var2.field1571;
            return var2;
        }
        while (this.field3708 < this.field3695) {
            class80 var3 = this.field3697[this.field3708++].field1571;
            if (this.field3697[this.field3708 - 1] != var3) {
                this.field3711 = var3.field1571;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V")
    public final void method1387(boolean arg0) {
        field3696++;
        if (arg0) {
            field3700 = -36;
        }
        for (int var2 = 0; var2 < this.field3695; var2++) {
            class80 var3 = this.field3697[var2];
            while (true) {
                class80 var4 = var3.field1571;
                if (var3 == var4) {
                    break;
                }
                var4.method560(-17554);
            }
        }
        this.field3711 = null;
        this.field3689 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljk;ZZ)V")
    public static final void method1388(class196 arg0, boolean arg1, boolean arg2) {
        if (class147.field2674 != null) {
            try {
                class147.field2674.method1277(-76);
            } catch (Exception var8) {
            }
            class147.field2674 = null;
        }
        field3698++;
        class147.field2674 = arg0;
        class91.method637(arg2, arg1);
        class252.field4432 = null;
        class250.field4407.field4335 = 0;
        class24.field313 = null;
        class90.field1745 = 0;
        while (true) {
            class54 var3 = (class54) class156.field2775.method1382(-32642);
            if (var3 == null) {
                while (true) {
                    class54 var4 = (class54) class257.field4519.method1382(-32642);
                    if (var4 == null) {
                        if (class86.field1684 != 0) {
                            try {
                                class249 var5 = new class249(4);
                                var5.method1638(32, 4);
                                var5.method1638(32, class86.field1684);
                                var5.method1650(false, 0);
                                class147.field2674.method1273(0, (byte) 92, 4, var5.field4350);
                            } catch (IOException var7) {
                                try {
                                    class147.field2674.method1277(-44);
                                } catch (Exception var6) {
                                }
                                class147.field2674 = null;
                                class49.field880++;
                            }
                        }
                        class125.field2363 = 0;
                        class64.field1273 = class3.method13(17161);
                        return;
                    }
                    class207.field3589.method1134(var4, (byte) 121);
                    class249.field4398.method1380((byte) -117, var4, var4.field1560);
                    class167.field3008++;
                    class110.field2123--;
                }
            }
            class252.field4427.method1380((byte) -116, var3, var3.field1560);
            class87.field1707++;
            class175.field3076--;
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)Lli;")
    public final class80 method1389(int arg0) {
        field3699++;
        if (this.field3689 == null) {
            return null;
        }
        class80 var2 = this.field3697[(int) (this.field3693 & (long) (this.field3695 - 1))];
        if (arg0 < 66) {
            this.field3711 = null;
        }
        while (this.field3689 != var2) {
            if (this.field3689.field1560 == this.field3693) {
                class80 var3 = this.field3689;
                this.field3689 = this.field3689.field1571;
                return var3;
            }
            this.field3689 = this.field3689.field1571;
        }
        this.field3689 = null;
        return null;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(I)V")
    public class215(int arg0) {
        this.field3697 = new class80[arg0];
        this.field3695 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class80 var3 = this.field3697[var2] = new class80();
            var3.field1569 = var3;
            var3.field1571 = var3;
        }
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)V")
    public static void method1390(int arg0) {
        field3707 = null;
        if (arg0 != 0) {
            field3700 = 72;
        }
        field3709 = null;
    }
}
