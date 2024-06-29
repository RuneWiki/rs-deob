import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class51 {

    @OriginalMember(owner = "client!we", name = "a", descriptor = "Lwm;")
    private static class152 field783 = class157.method1048("Wed", 103);

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Lwm;")
    private static class152 field784 = class157.method1048("Thu", 98);

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Lwm;")
    private static class152 field793 = class157.method1048("Fri", 111);

    @OriginalMember(owner = "client!we", name = "j", descriptor = "[I")
    public static int[] field792 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!we", name = "p", descriptor = "Lwm;")
    private static class152 field798 = class157.method1048("Tue", 120);

    @OriginalMember(owner = "client!we", name = "r", descriptor = "Lwm;")
    private static class152 field800 = class157.method1048("Sun", 117);

    @OriginalMember(owner = "client!we", name = "s", descriptor = "Lwm;")
    private static class152 field801 = class157.method1048("Mon", 116);

    @OriginalMember(owner = "client!we", name = "n", descriptor = "Lwm;")
    private static class152 field796 = class157.method1048("Loading wordpack )2 ", 98);

    @OriginalMember(owner = "client!we", name = "o", descriptor = "Lwm;")
    public static class152 field797 = field796;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "Lwm;")
    private static class152 field802 = class157.method1048("Sat", 109);

    @OriginalMember(owner = "client!we", name = "u", descriptor = "[Lwm;")
    public static class152[] field803 = new class152[] { field800, field801, field798, field783, field784, field793, field802 };

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public int field787;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public int field789;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public int field790;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public int field804;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "J")
    public long field786;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Lv;")
    public class73 field788;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Lv;")
    public class73 field794;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "Lv;")
    public class73 field799;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILhi;)V", line = 16)
    public static final void method351(int arg0, class291 arg1) {
        field805++;
        while (true) {
            while (arg1.field4946 < arg1.field4950.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method2011(-110) == 1) {
                    var3 = arg1.method2011(arg0 ^ 0x4D9A);
                    var4 = arg1.method2011(-119);
                    var2 = true;
                }
                int var5 = arg1.method2011(arg0 ^ 0x4DBD);
                int var6 = arg1.method2011(-22);
                int var7 = class26.field446 - (var6 * 64 + -class197.field3160) - 1;
                int var8 = var5 * 64 - class252.field4335;
                if (var8 >= 0 && (var7 - 63) >= 0 && class239.field3921 > var8 + 63 && class26.field446 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || (var3 * 8) <= var11 && (var3 * 8 + 8) > var11 && var12 >= var4 * 8 && var4 * 8 + 8 > var12) {
                                byte var13 = arg1.method1962(false);
                                if (var13 != 0) {
                                    if (class2.field41[var9][var10] == null) {
                                        class2.field41[var9][var10] = new byte[4096];
                                    }
                                    class2.field41[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method1962(false);
                                    if (class291.field4981[var9][var10] == null) {
                                        class291.field4981[var9][var10] = new byte[4096];
                                    }
                                    class291.field4981[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method1962(false);
                        if (var16 != 0) {
                            arg1.field4946++;
                        }
                    }
                }
            }
            if (arg0 != -19852) {
                field802 = (class152) null;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 151)
    public static void method352(int arg0) {
        field796 = null;
        field803 = null;
        field798 = null;
        field802 = null;
        field801 = null;
        field793 = null;
        field797 = null;
        field784 = null;
        field783 = null;
        field792 = null;
        field800 = null;
        if (arg0 != 64) {
            field803 = (class152[]) null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)V", line = 171)
    public static final void method353(boolean arg0, int arg1) {
        class195 var2 = class91.field1268;
        synchronized (class91.field1268) {
            class162.field2569 = arg1;
        }
        if (!arg0) {
            field791++;
        }
    }
}
