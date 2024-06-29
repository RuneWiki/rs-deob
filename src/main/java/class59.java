import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class59 {

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
    public static int field801 = -1;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "Laq;")
    public static class90 field802 = new class90();

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "[I")
    public static int[] field808 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "[I")
    public static int[] field810 = new int[50];

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "Lec;")
    public static class129 field809 = new class129(16);

    @OriginalMember(owner = "client!ri", name = "C", descriptor = "[I")
    public static int[] field813 = new int[50];

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "Lkn;")
    public static class442 field812 = new class442("Loading fonts - ", "Lade Schriftsätze - ", "Chargement des polices - ", "Carregando fontes - ");

    @OriginalMember(owner = "client!ri", name = "D", descriptor = "Lkn;")
    public static class442 field814 = new class442("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public int field785;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public int field787;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public int field788;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public int field791;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public int field792;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public int field793;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public int field794;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public int field795;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    public int field796;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public int field797;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
    public int field798;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    public int field799;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public int field803;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    public int field804;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    public int field805;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
    public int field806;

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
    public int field807;

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
    public int field811;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "[Ldp;")
    public static class2[] field789;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V", line = 4)
    public static void method462(boolean arg0) {
        if (arg0) {
            field802 = null;
        }
        field812 = null;
        field808 = null;
        field814 = null;
        field810 = null;
        field802 = null;
        field809 = null;
        field813 = null;
        field789 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 37)
    public static final void method463(int arg0) {
        field800++;
        class131 var1 = class366.field5155;
        synchronized (class366.field5155) {
            class366.field5155.method905((byte) 94);
        }
        if (arg0 > -68) {
            field801 = 123;
        }
        class131 var2 = class99.field1365;
        synchronized (class99.field1365) {
            class99.field1365.method905((byte) 24);
        }
        class416 var3 = class63.field867;
        synchronized (class63.field867) {
            class63.field867.method2611((byte) -14);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Luo;[BI[Lhh;IZIIIIII)V", line = 62)
    public static final void method464(class345 arg0, byte[] arg1, int arg2, class67[] arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field786++;
        class11 var12 = new class11(arg1);
        if (arg7 <= 106) {
            return;
        }
        int var13 = -1;
        while (true) {
            int var14 = var12.method180(true);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method175(255);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = (var15 & 0xFD0) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method172((byte) 52);
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg2 == var19 && arg6 <= var18 && var18 < (arg6 + 8) && arg9 <= var17 && (arg9 + 8) > var17) {
                    class64 var23 = class375.method2395((byte) 114, var13);
                    int var24 = class268.method1763(-117, var22, var18 & 0x7, var17 & 0x7, arg10, var23.field950, var23.field872) + arg8;
                    int var25 = arg11 + class285.method1857(var22, var23.field950, 11, var18 & 0x7, var17 & 0x7, var23.field872, arg10);
                    if (var24 > 0 && var25 > 0 && (class211.field2954 - 1) > var24 && (class290.field4061 - 1) > var25) {
                        class67 var26 = null;
                        if (!arg5) {
                            int var27 = arg4;
                            if ((class368.field5193[1][var24][var25] & 0x2) == 2) {
                                var27 = arg4 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg3[var27];
                            }
                        }
                        class99.method715(-1, var21, arg5, var13, true, arg4, arg4, arg10 + var22 & 0x3, arg0, var24, 1, var25, var26);
                    }
                }
            }
        }
    }
}
