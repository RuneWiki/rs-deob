import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class179 {

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "Lvm;")
    private class84 field2600 = new class84();

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    private int field2599;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    private int field2596;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "Llb;")
    private class224 field2588;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "Ldh;")
    public static class179 field2597 = new class179(64);

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field2604 = new String[100];

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public static int field2602 = 0;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "Lwh;")
    public static class11 field2601;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "Llc;")
    public static class175 field2592;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "[Lri;")
    public static class74[] field2605;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V", line = 14)
    public final void method1236(int arg0, int arg1) {
        field2595++;
        if (class154.field2146 != null) {
            for (class164 var3 = (class164) this.field2600.method499(3346); var3 != null; var3 = (class164) this.field2600.method501((byte) 102)) {
                if (var3.method1074((byte) 47)) {
                    if (var3.method1075((byte) -39) == null) {
                        var3.method2285(true);
                        var3.method610(arg0 + 495037016);
                        this.field2599++;
                    }
                } else if ((++var3.field1344) > ((long) arg1)) {
                    class164 var4 = class154.field2146.method933(arg0 ^ 0xE27E5584, var3);
                    this.field2588.method1541(false, var4, var3.field5065);
                    class218.method1504(var4, (byte) -53, var3);
                    var3.method2285(true);
                    var3.method610(-1);
                }
            }
        }
        if (arg0 != -495037017) {
            this.field2596 = 34;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V", line = 66)
    public final void method1237(byte arg0) {
        this.field2600.method491(-96);
        field2587++;
        int var2 = -93 / ((-arg0 - 29) / 41);
        this.field2588.method1533(9);
        this.field2599 = this.field2596;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V", line = 78)
    public static void method1238(int arg0) {
        field2597 = null;
        field2592 = null;
        field2605 = null;
        field2601 = null;
        field2604 = null;
        if (arg0 != 0) {
            field2605 = (class74[]) null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BJ)Ljava/lang/Object;", line = 93)
    public final Object method1239(byte arg0, long arg1) {
        class164 var4 = (class164) this.field2588.method1537(arg1, -22708);
        field2589++;
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method1075((byte) -124);
        if (var5 == null) {
            var4.method2285(true);
            var4.method610(-1);
            this.field2599++;
            return null;
        }
        if (var4.method1074((byte) 47)) {
            class188 var6 = new class188(var5);
            this.field2588.method1541(false, var6, var4.field5065);
            this.field2600.method495((byte) -121, var6);
            var6.field1344 = 0L;
            var4.method2285(true);
            var4.method610(-1);
        } else {
            this.field2600.method495((byte) -116, var4);
            var4.field1344 = 0L;
        }
        if (arg0 >= -1) {
            method1244(true, true);
        }
        return var5;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)I", line = 134)
    public final int method1240(int arg0) {
        if (arg0 != -4070) {
            field2604 = (String[]) null;
        }
        field2593++;
        int var2 = 0;
        for (class164 var3 = (class164) this.field2600.method499(3346); var3 != null; var3 = (class164) this.field2600.method501((byte) 102)) {
            if (!var3.method1074((byte) 47)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)V", line = 164)
    public final void method1241(int arg0) {
        field2590++;
        class164 var2 = (class164) this.field2600.method499(3346);
        if (arg0 <= 112) {
            field2602 = -111;
        }
        while (var2 != null) {
            if (var2.method1074((byte) 47)) {
                var2.method2285(true);
                var2.method610(-1);
                this.field2599++;
            }
            var2 = (class164) this.field2600.method501((byte) 102);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IJ)V", line = 190)
    public final void method1242(int arg0, long arg1) {
        if (arg0 != -1) {
            method1244(true, false);
        }
        field2594++;
        class164 var4 = (class164) this.field2588.method1537(arg1, arg0 ^ 0x58B3);
        if (var4 != null) {
            var4.method2285(true);
            var4.method610(-1);
            this.field2599++;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/lang/Object;JI)V", line = 212)
    public final void method1243(Object arg0, long arg1, int arg2) {
        this.method1242(arg2 + 29281, arg1);
        field2598++;
        if (this.field2599 == 0) {
            class164 var5 = (class164) this.field2600.method494(10425);
            var5.method2285(true);
            var5.method610(arg2 + 29281);
        } else {
            this.field2599--;
        }
        class188 var6 = new class188(arg0);
        this.field2588.method1541(false, var6, arg1);
        if (arg2 == -29282) {
            this.field2600.method495((byte) -126, var6);
            var6.field1344 = 0L;
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(I)V", line = 317)
    public class179(int arg0) {
        this.field2599 = arg0;
        this.field2596 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field2588 = new class224(var2);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZZ)V", line = 258)
    public static final void method1244(boolean arg0, boolean arg1) {
        if (arg0) {
            method1238(-39);
        }
        field2591++;
        if (arg1) {
            if (class146.field2031 != -1) {
                class242.method1746(class146.field2031, (byte) -116);
            }
            for (class343 var2 = (class343) class292.field4585.method1540(69); var2 != null; var2 = (class343) class292.field4585.method1544(126)) {
                class84.method500(var2, true, 23139);
            }
            class146.field2031 = -1;
            class292.field4585 = new class224(8);
            class342.method2367(-67);
            class146.field2031 = class244.field3678;
            class112.method774(-27290, false);
            class180.method1249(-101);
            class142.method944(7485, class146.field2031);
        }
        class275.field4288 = -1;
        class166.method1085(6376, class166.field2293);
        class118.field1664 = new class109();
        class118.field1664.field2392 = 3000;
        class118.field1664.field2357 = 3000;
        if (!class250.field3787 && class249.field3769 == 0) {
            class188.method1303(class164.field2271, -54);
            class97.method587(-15525, 10);
            return;
        }
        if (class118.field1671 == 2) {
            class109.field1506 = class329.field5021 << 7;
            class130.field1792 = class332.field5072 << 7;
        } else {
            class262.method1885(5);
        }
        if (class250.field3787) {
            class134.method889((byte) 52);
        }
        class329.method2276(78);
        class97.method587(-15525, 28);
    }
}
