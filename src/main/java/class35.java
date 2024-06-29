import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class35 {

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field808 = 0;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Lrc;")
    private static class105 field811 = class43.method374("Enter name of friend to delete from list", 0);

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "Lrc;")
    public static class105 field814 = class43.method374("m", 0);

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field807 = 0;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "Z")
    public static boolean field818 = false;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field816 = 0;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "Lrc;")
    public static class105 field819 = field811;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "Lrc;")
    public static class105 field822 = class43.method374("cross", 0);

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "Lrc;")
    public static class105 field823 = class43.method374("Name eingeben:", 0);

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "Z")
    public static boolean field810 = false;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "Leb;")
    public static class27 field824;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "Lpb;")
    public static class92 field821;

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(I)V", line = 10)
    public class35(int arg0) {
        class76.field1698 = arg0;
        class31.field707 = class1.method3(false);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(J)V", line = 29)
    public void method327(long arg0) {
        field812++;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)V", line = 36)
    public static final synchronized void method328(byte arg0, int arg1) {
        int var2 = 34 % ((-arg0 - 20) / 59);
        if (class80.field1799 != null) {
            class80.field1799.method155(arg1);
        }
        field817++;
        class34.method325(arg1, 0);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lc;I)V", line = 49)
    public static final synchronized void method329(class13 arg0, int arg1) {
        field825++;
        if (arg1 != 0) {
            field821 = null;
        }
        class80.field1799 = arg0;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "()V", line = 60)
    public void method114() {
        field820++;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V", line = 69)
    public static final void method330(boolean arg0) {
        class105.field2421++;
        field809++;
        class102.method816(127, true);
        class3.method27(true, -105);
        class102.method816(127, arg0);
        class3.method27(false, -105);
        class108.method879((byte) -26);
        class112.method918((byte) -54);
        if (!class117.field2738) {
            int var1 = client.field432 + class81.field1813 & 0x7FF;
            int var2 = class34.field806;
            if (class71.field1567 / 256 > var2) {
                var2 = class71.field1567 / 256;
            }
            if (class110.field2553[4] && var2 < class113.field2653[4] + 128) {
                var2 = class113.field2653[4] + 128;
            }
            class80.method690(class117.field2728, var2 * 3 + 600, var2, class134.method1061(11387, class73.field1619, class119.field2842.field1229, class119.field2842.field1274) - 50, class83.field1870, -7420, var1);
        }
        int var3;
        if (class117.field2738) {
            var3 = class112.method921(83);
        } else {
            var3 = class96.method801(true);
        }
        int var4 = class113.field2658;
        int var5 = class10.field214;
        int var6 = class78.field1755;
        int var7 = class100.field2291;
        int var8 = class3.field52;
        for (int var9 = 0; var9 < 5; var9++) {
            if (class110.field2553[var9]) {
                int var10 = (int) ((double) -class80.field1797[var9] + Math.random() * (double) (class80.field1797[var9] * 2 + 1) + Math.sin((double) class118.field2762[var9] / 100.0D * (double) class104.field2358[var9]) * (double) class113.field2653[var9]);
                if (var9 == 2) {
                    class78.field1755 += var10;
                }
                if (var9 == 4) {
                    class100.field2291 += var10;
                    if (class100.field2291 < 128) {
                        class100.field2291 = 128;
                    }
                    if (class100.field2291 > 383) {
                        class100.field2291 = 383;
                    }
                }
                if (var9 == 3) {
                    class3.field52 = class3.field52 + var10 & 0x7FF;
                }
                if (var9 == 0) {
                    class113.field2658 += var10;
                }
                if (var9 == 1) {
                    class10.field214 += var10;
                }
            }
        }
        class36.method335(-128);
        class56.field1167 = class75.field1664 - 4;
        class56.field1175 = field816 - 4;
        class56.field1172 = true;
        class56.field1162 = 0;
        class69.method583();
        class130.field3161.method525(class113.field2658, class10.field214, class78.field1755, class100.field2291, class3.field52, var3);
        class130.field3161.method512();
        class96.method794((byte) -95);
        class7.method79(true);
        ((class30) class38.field874).method282(27777, class59.field1319);
        class104.method825(-111);
        if (class10.field217 && class29.method278(false, true, 17752) == 0) {
            class10.field217 = false;
        }
        if (class10.field217) {
            class36.method335(104);
            class69.method583();
            class129.method1038(null, false, class90.field2057, (byte) -119);
        }
        class84.method705(true);
        class78.field1755 = var6;
        class3.field52 = var8;
        class113.field2658 = var4;
        class100.field2291 = var7;
        class10.field214 = var5;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 219)
    public static void method331(int arg0) {
        field823 = null;
        field811 = null;
        field814 = null;
        field824 = null;
        field822 = null;
        if (arg0 != 0) {
            field808 = 104;
        }
        field819 = null;
        field821 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([II)V", line = 238)
    public static final synchronized void method332(int[] arg0, int arg1) {
        int var2 = 0;
        int var3 = arg1 - 7;
        while (var2 < var3) {
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
        }
        var3 += 7;
        while (var2 < var3) {
            arg0[var2++] = 0;
        }
        if (class80.field1799 != null) {
            class80.field1799.method154(arg0, 0, var3);
        }
        class34.method325(var3, 0);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lme;ZLpb;ILpb;)V", line = 267)
    public static final void method333(class77 arg0, boolean arg1, class92 arg2, int arg3, class92 arg4) {
        class50.field1055 = arg2;
        if (arg3 != 10) {
            method331(-124);
        }
        class78.field1752 = arg1;
        field815++;
        class111.field2615 = arg4;
        class92.field2149 = class111.field2615.method749(arg3 - 10, 10);
        class89.field2045 = arg0;
    }
}
