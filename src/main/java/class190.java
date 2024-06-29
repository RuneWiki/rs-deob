import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class190 {

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public int field2633 = -1;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Z")
    public boolean field2632 = false;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public int field2631 = 2;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Z")
    public boolean field2635 = false;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public int field2629 = 64;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public int field2637 = 64;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public int field2640 = 1;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "Ltk;")
    public static class228 field2628 = new class228(8, 0, 4, 1);

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Ljm;")
    public static class485 field2638 = new class485(15, 3);

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "[I")
    public static int[] field2642;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "Ljm;")
    public static class485 field2641;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "Lof;")
    public static class438 field2645;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field2643;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLlh;I)V")
    public final void method1138(byte arg0, class365 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method2099(255);
            if (var4 == 0) {
                field2634++;
                int var5 = 20 % ((12 - arg0) / 46);
                return;
            }
            this.method1144(arg2, var4, 5, arg1);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static void method1139(int arg0) {
        if (arg0 != 23418) {
            field2628 = null;
        }
        field2645 = null;
        field2643 = null;
        field2642 = null;
        field2641 = null;
        field2628 = null;
        field2638 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)Z")
    public static final boolean method1140(int arg0, int arg1) {
        class514.field7551 = arg0 & arg1 + 1;
        field2624++;
        class424.field6187 = true;
        return true;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lvh;B)V")
    public static final void method1141(class240 arg0, byte arg1) {
        class316.field4390 = arg0.method1396("p11_full", (byte) 71);
        field2636++;
        class483.field7100 = arg0.method1396("p12_full", (byte) 71);
        class171.field2448 = arg0.method1396("b12_full", (byte) 71);
        class23.field383 = arg0.method1396("hitmarks", (byte) 71);
        class466.field6800 = arg0.method1396("hitbar_default", (byte) 71);
        class266.field3644 = arg0.method1396("timerbar_default", (byte) 71);
        class330.field4496 = arg0.method1396("headicons_pk", (byte) 71);
        class47.field644 = arg0.method1396("headicons_prayer", (byte) 71);
        class162.field2316 = arg0.method1396("hint_headicons", (byte) 71);
        class516.field7578 = arg0.method1396("hint_mapmarkers", (byte) 71);
        class283.field3814 = arg0.method1396("mapflag", (byte) 71);
        class138.field1981 = arg0.method1396("cross", (byte) 71);
        class413.field6069 = arg0.method1396("mapdots", (byte) 71);
        class85.field1173 = arg0.method1396("scrollbar", (byte) 71);
        class271.field3699 = arg0.method1396("name_icons", (byte) 71);
        class124.field1693 = arg0.method1396("floorshadows", (byte) 71);
        class343.field4723 = arg0.method1396("compass", (byte) 71);
        class63.field871 = arg0.method1396("otherlevel", (byte) 71);
        class213.field3036 = arg0.method1396("hint_mapedge", (byte) 71);
        if (arg1 != -9) {
            method1145(-55, -95, -41);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILel;)V")
    public static final void method1142(int arg0, class383 arg1) {
        class245.field3415 = arg1;
        if (arg0 == 31590) {
            field2625++;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public static final void method1143(int arg0) {
        int var1 = 116 % ((arg0 + 87) / 38);
        if (class488.method2868(0)) {
            if (class306.field4199 == null) {
                class12.method104(1);
            }
            class408.field5646 = 0;
            class366.field5141 = true;
            try {
                class263.field3604 = class407.field5639.getToolkit().getSystemClipboard();
            } catch (Exception var2) {
            }
        }
        field2639++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIILlh;)V")
    private final void method1144(int arg0, int arg1, int arg2, class365 arg3) {
        if (arg1 == 1) {
            this.field2633 = arg3.method2062((byte) 14);
            if (this.field2633 == 65535) {
                this.field2633 = -1;
            }
        } else if (arg1 == 2) {
            this.field2629 = arg3.method2062((byte) 14) + 1;
            this.field2637 = arg3.method2062((byte) 14) + 1;
        } else if (arg1 == 3) {
            arg3.method2081((byte) 103);
        } else if (arg1 == 4) {
            this.field2631 = arg3.method2099(255);
        } else if (arg1 == 5) {
            this.field2640 = arg3.method2099(255);
        } else if (arg1 == 6) {
            this.field2632 = true;
        } else if (arg1 == 7) {
            this.field2635 = true;
        }
        if (arg2 != 5) {
            this.method1144(43, -60, 109, null);
        }
        field2627++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)V")
    public static final void method1145(int arg0, int arg1, int arg2) {
        field2630++;
        int var3 = class105.field1430.method362(class56.field767.method590(class105.field1434, arg2 ^ 0xFFFFA7AC), (byte) 82);
        if (arg2 != 26) {
            field2643 = null;
        }
        for (class149 var4 = (class149) class260.field3585.method3072((byte) 111); var4 != null; var4 = (class149) class260.field3585.method3066(2)) {
            int var8 = class384.method2208(65, var4);
            if (var8 > var3) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class370.field5198 * 16 + 21;
        int var6 = arg0 - (var3 / 2);
        if (var6 + var3 > class177.field2513) {
            var6 = class177.field2513 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if ((var5 + arg1) > class351.field4795) {
            var7 = class351.field4795 - var5;
        }
        class267.field3662 = var6;
        if (var7 < 0) {
            var7 = 0;
        }
        class224.field3155 = (class205.field2910 ? 26 : 22) + class370.field5198 * 16;
        class312.field4293 = var3;
        class217.field3071 = var7;
        class9.field86 = true;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(III)Lfq;")
    public static final class134 method1146(int arg0, int arg1, int arg2) {
        class61 var3 = class385.field5410[arg0][arg1][arg2];
        return var3 == null ? null : var3.field832;
    }

    static {
        new class83("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field2642 = new int[] { 1, -1, -1, 1 };
        field2644 = 0;
        field2641 = new class485(14, 7);
        field2645 = new class438("WTQA", 2);
    }
}
