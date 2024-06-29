import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class32 {

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public int field499 = -1;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "Loh;")
    public static class274 field490 = class206.method1425(true);

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field498 = -1;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "[I")
    public static int[] field497 = new int[8];

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "[I")
    public static int[] field501 = new int[2];

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field500 = 2;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "Lhe;")
    public class19 field494;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "Lqh;")
    public static class201 field496;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "[I")
    public int[] field495;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "[Ljava/lang/String;")
    public String[] field493;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
    public static final void method275(byte arg0) {
        field492++;
        if (class12.field234 != null) {
            class184 var1 = class12.field234;
            synchronized (class12.field234) {
                class12.field234 = null;
            }
        }
        if (arg0 > -42) {
            field501 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([IZLbl;[I[I)V")
    public static final void method276(int[] arg0, boolean arg1, class33 arg2, int[] arg3, int[] arg4) {
        int var5 = 0;
        if (!arg1) {
            method276((int[]) null, true, (class33) null, (int[]) null, (int[]) null);
        }
        while (var5 < arg0.length) {
            int var6 = arg0[var5];
            int var7 = arg3[var5];
            int var8 = arg4[var5];
            for (int var9 = 0; var7 != 0 && arg2.field3363.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg2.field3363[var9] = null;
                    } else {
                        class181 var10 = class49.method384(var6, 17);
                        class47 var11 = arg2.field3363[var9];
                        int var12 = var10.field2847;
                        if (var11 != null) {
                            if (var11.field842 == var6) {
                                if (var12 == 0) {
                                    var11 = arg2.field3363[var9] = null;
                                } else if (var12 == 1) {
                                    var11.field843 = 0;
                                    var11.field841 = 0;
                                    var11.field845 = 0;
                                    var11.field844 = 1;
                                    var11.field850 = var8;
                                    class132.method934((byte) 112, var10, arg2.field3389, arg2.field3341, 0, class167.field2655 == arg2);
                                } else if (var12 == 2) {
                                    var11.field841 = 0;
                                }
                            } else if (var10.field2855 >= class49.method384(var11.field842, 56).field2855) {
                                var11 = arg2.field3363[var9] = null;
                            }
                        }
                        if (var11 == null) {
                            class47 var13 = arg2.field3363[var9] = new class47();
                            var13.field844 = 1;
                            var13.field850 = var8;
                            var13.field841 = 0;
                            var13.field843 = 0;
                            var13.field845 = 0;
                            var13.field842 = var6;
                            class132.method934((byte) 112, var10, arg2.field3389, arg2.field3341, 0, class167.field2655 == arg2);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
            var5++;
        }
        field491++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public static void method277(int arg0) {
        field501 = null;
        field490 = null;
        field497 = null;
        field496 = null;
        int var1 = -1 / ((arg0 + 28) / 45);
    }
}
