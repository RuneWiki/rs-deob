import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class308 {

    @OriginalMember(owner = "client!pr", name = "q", descriptor = "Ljava/lang/String;")
    private String field4711 = "null";

    @OriginalMember(owner = "client!pr", name = "p", descriptor = "I")
    public static int field4710 = -1;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "Lhl;")
    public static class366 field4696 = new class366(128);

    @OriginalMember(owner = "client!pr", name = "s", descriptor = "I")
    public static int field4713 = 2;

    @OriginalMember(owner = "client!pr", name = "t", descriptor = "Lpi;")
    public static class342 field4714 = new class342("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "C")
    public char field4695;

    @OriginalMember(owner = "client!pr", name = "r", descriptor = "C")
    public char field4712;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
    private int field4697;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!pr", name = "i", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!pr", name = "k", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!pr", name = "l", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!pr", name = "m", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!pr", name = "n", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!pr", name = "u", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "Lan;")
    private class20 field4699;

    @OriginalMember(owner = "client!pr", name = "o", descriptor = "Lan;")
    public class20 field4709;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)Z")
    public final boolean method2013(int arg0, int arg1) {
        field4708++;
        if (this.field4709 == null) {
            return false;
        }
        if (this.field4699 == null) {
            this.method2015((byte) 57);
        }
        class451 var3 = (class451) this.field4699.method171((byte) -85, (long) arg1);
        if (arg0 != 0) {
            this.field4699 = null;
        }
        return var3 != null;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V")
    private final void method2014(byte arg0) {
        this.field4699 = new class20(this.field4709.method162((byte) -128));
        field4701++;
        if (arg0 != 102) {
            this.method2016(false, 58);
        }
        for (class521 var2 = (class521) this.field4709.method160((byte) -20); var2 != null; var2 = (class521) this.field4709.method163(arg0 ^ 0x1B)) {
            class349 var3 = new class349(var2.field7736, (int) var2.field4904);
            this.field4699.method166(var3, class453.method2710(80, var2.field7736), -126);
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(B)V")
    private final void method2015(byte arg0) {
        field4704++;
        this.field4699 = new class20(this.field4709.method162((byte) -98));
        if (arg0 == 57) {
            for (class451 var2 = (class451) this.field4709.method160((byte) -20); var2 != null; var2 = (class451) this.field4709.method163(127)) {
                class451 var3 = new class451((int) var2.field4904);
                this.field4699.method166(var3, (long) var2.field6742, 117);
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZI)I")
    public final int method2016(boolean arg0, int arg1) {
        field4698++;
        if (this.field4709 == null) {
            return this.field4697;
        }
        if (!arg0) {
            this.method2014((byte) -36);
        }
        class451 var3 = (class451) this.field4709.method171((byte) -86, (long) arg1);
        return var3 == null ? this.field4697 : var3.field6742;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
    public static void method2017(int arg0) {
        field4696 = null;
        if (arg0 != 1) {
            field4696 = null;
        }
        field4714 = null;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)I")
    public static final int method2018(boolean arg0) {
        field4700++;
        class162 var1 = class4.field109;
        boolean var2 = arg0;
        if (class169.field2624 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class162.method1199(0, 0, 1, null, null, var3);
        }
        long var4 = class211.method1419(12921);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method244(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class211.method1419(12921) - var4);
        var1.method1200(-16777216, 100, 0, 0, 100, 10);
        if (var2) {
            var1.method1203(-19);
        }
        return var7;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZLcu;I)V")
    private final void method2019(boolean arg0, class145 arg1, int arg2) {
        field4707++;
        if (arg0) {
            this.method2015((byte) -114);
        }
        if (arg2 == 1) {
            this.field4695 = class305.method1999(arg1.method1093(15), (byte) 22);
        } else if (arg2 == 2) {
            this.field4712 = class305.method1999(arg1.method1093(15), (byte) 105);
        } else if (arg2 == 3) {
            this.field4711 = arg1.method1101((byte) -96);
        } else if (arg2 == 4) {
            this.field4697 = arg1.method1070(-32387);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method1069((byte) -8);
            this.field4709 = new class20(class51.method464(1905326856, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1070(-32387);
                class320 var7;
                if (arg2 == 5) {
                    var7 = new class521(arg1.method1101((byte) -85));
                } else {
                    var7 = new class451(arg1.method1070(-32387));
                }
                this.field4709.method166(var7, (long) var6, -72);
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(II)Ljava/lang/String;")
    public final String method2020(int arg0, int arg1) {
        field4705++;
        if (this.field4709 == null) {
            return this.field4711;
        }
        if (arg0 != 50) {
            this.field4699 = null;
        }
        class521 var3 = (class521) this.field4709.method171((byte) -83, (long) arg1);
        return var3 == null ? this.field4711 : var3.field7736;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(BLcu;)V")
    public final void method2021(byte arg0, class145 arg1) {
        while (true) {
            int var3 = arg1.method1063((byte) 109);
            if (var3 == 0) {
                field4703++;
                if (arg0 != -100) {
                    field4715 = -65;
                    return;
                }
                return;
            }
            this.method2019(false, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method2022(int arg0, String arg1) {
        field4702++;
        if (arg0 < 61) {
            return true;
        } else if (this.field4709 == null) {
            return false;
        } else {
            if (this.field4699 == null) {
                this.method2014((byte) 102);
            }
            for (class349 var3 = (class349) this.field4699.method171((byte) -98, class453.method2710(76, arg1)); var3 != null; var3 = (class349) this.field4699.method165((byte) -128)) {
                if (var3.field5209.equals(arg1)) {
                    return true;
                }
            }
            return false;
        }
    }
}
