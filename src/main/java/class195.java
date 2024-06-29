import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class195 {

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public int field2606 = 43594;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "Z")
    public boolean field2608 = false;

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
    public int field2611 = 443;

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "Z")
    public static boolean field2613 = false;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "Lof;")
    public static class446 field2605 = new class446("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public int field2602;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!tr", name = "n", descriptor = "Lte;")
    public static class443 field2615;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "Ljava/lang/String;")
    public String field2603;

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "[I")
    public static int[] field2616;

    @OriginalMember(owner = "client!tr", name = "m", descriptor = "[Lga;")
    public static class282[] field2614;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)Z", line = 7)
    public static final boolean method1313(int arg0) {
        field2610++;
        if (arg0 != -2) {
            field2614 = null;
        }
        return class178.field2378;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(JB)V", line = 30)
    public static final void method1314(long arg0, byte arg1) {
        field2604++;
        if (class443.field6672 != null) {
            if (class340.field5269 == 1 || class340.field5269 == 5) {
                class328.method2118((byte) -60, arg0);
            } else if (class340.field5269 == 4) {
                class187.method1255(0, arg0);
            }
        }
        class112.method699((byte) 110, (long) class393.field6017, class400.field6090);
        if (class337.field5232 != -1) {
            class536.method3167(false, class337.field5232);
        }
        for (int var3 = 0; var3 < class428.field6506; var3++) {
            if (class430.field6553[var3]) {
                class106.field1497[var3] = true;
            }
            class447.field6721[var3] = class430.field6553[var3];
            class430.field6553[var3] = false;
        }
        class347.field5348 = class393.field6017;
        if (class400.field6090.method755()) {
            class347.field5367 = true;
        }
        if (class337.field5232 != -1) {
            class428.field6506 = 0;
            class230.method1549(false);
        }
        class400.field6090.method753();
        class142.method954(class400.field6090, 24307);
        int var4 = class78.method539(-27627);
        if (var4 == -1) {
            var4 = class449.field6752;
        }
        if (var4 == -1) {
            var4 = class271.field3768;
        }
        class278.method1789(-105, var4);
        class289.method1848(class56.field800.field1867, 6, class56.field800.field1866, class56.field800.field1862, class205.field2728);
        class205.field2728 = 0;
        if (arg1 >= -99) {
            method1316((byte) 16, -62, 117, -127);
        }
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(I)I", line = 100)
    public final int method1315(int arg0) {
        field2609++;
        if (arg0 >= -84) {
            this.method1315(53);
        }
        return this.field2608 ? this.field2611 : this.field2606;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(BIII)I", line = 114)
    public static final int method1316(byte arg0, int arg1, int arg2, int arg3) {
        field2612++;
        if (class357.field5502 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg1 - class12.field247;
        int var7 = arg2 - class12.field245;
        for (class484 var8 = (class484) class12.field216.method445(33); var8 != null; var8 = (class484) class12.field216.method451(false)) {
            if (var8.field7129 == arg3) {
                int var9 = var8.field7125;
                int var10 = var8.field7130;
                int var11 = class12.field245 + var10 | class12.field247 + var9 << 14;
                int var12 = (var7 - var10) * (var7 - var10) + (var6 - var9) * (var6 - var9);
                if (var4 < 0 || var5 > var12) {
                    var4 = var11;
                    var5 = var12;
                }
            }
        }
        if (arg0 != -100) {
            field2605 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILtr;)Z", line = 166)
    public final boolean method1317(int arg0, class195 arg1) {
        int var3 = -12 / ((79 - arg0) / 33);
        field2607++;
        if (arg1 == null) {
            return false;
        } else {
            return this.field2602 == arg1.field2602 && this.field2603.equals(arg1.field2603);
        }
    }

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "(I)V", line = 181)
    public static void method1318(int arg0) {
        field2614 = null;
        field2615 = null;
        field2605 = null;
        if (arg0 != 20634) {
            method1314(27L, (byte) -49);
        }
        field2616 = null;
    }
}
