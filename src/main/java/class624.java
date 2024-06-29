import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class624 extends class41 {

    @OriginalMember(owner = "client!oea", name = "w", descriptor = "I")
    private int field8562 = -1;

    @OriginalMember(owner = "client!oea", name = "s", descriptor = "[I")
    public static int[] field8558 = new int[] { 1, 4, 1, 2 };

    @OriginalMember(owner = "client!oea", name = "B", descriptor = "Z")
    public static boolean field8566 = false;

    @OriginalMember(owner = "client!oea", name = "p", descriptor = "I")
    public static int field8555;

    @OriginalMember(owner = "client!oea", name = "q", descriptor = "I")
    private int field8556;

    @OriginalMember(owner = "client!oea", name = "r", descriptor = "I")
    private int field8557;

    @OriginalMember(owner = "client!oea", name = "t", descriptor = "I")
    private int field8559;

    @OriginalMember(owner = "client!oea", name = "u", descriptor = "I")
    public static int field8560;

    @OriginalMember(owner = "client!oea", name = "v", descriptor = "I")
    public static int field8561;

    @OriginalMember(owner = "client!oea", name = "x", descriptor = "I")
    public static int field8563;

    @OriginalMember(owner = "client!oea", name = "y", descriptor = "I")
    public static int field8564;

    @OriginalMember(owner = "client!oea", name = "z", descriptor = "I")
    public static int field8565;

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(Z)V", line = 4)
    public static void method3544(boolean arg0) {
        field8558 = null;
        if (!arg0) {
            field8566 = true;
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(ILes;)V", line = 16)
    public final void method329(int arg0, class403 arg1) {
        field8564++;
        this.field8562 = arg1.method2390((byte) 12);
        if (arg0 == -3999) {
            this.field8556 = arg1.method2381((byte) 52);
            this.field8557 = arg1.method2396((byte) -97);
            this.field8559 = arg1.method2396((byte) 127);
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 32)
    public static final int method3545(String arg0, int arg1) {
        field8561++;
        if (arg1 != -1) {
            return 66;
        } else if (arg0 == null) {
            return -1;
        } else {
            for (int var2 = 0; var2 < class651.field8992; var2++) {
                if (arg0.equalsIgnoreCase(class375.field4702[var2])) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIIIII)V", line = 59)
    public static final void method3546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class595.field8081 = arg1;
        class31.field494 = arg4;
        class110.field1382 = arg2;
        class201.field2410 = arg6;
        class55.field742 = arg0;
        class92.field1220 = arg5;
        field8563++;
        if (arg3 != -1) {
            field8558 = null;
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Loga;I)V", line = 78)
    public final void method331(class500 arg0, int arg1) {
        if (arg1 == 55) {
            arg0.method2966(this.field8557, this.field8559, this.field8556, -1, this.field8562);
            field8555++;
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "([[[Ldq;I)V", line = 92)
    public static final void method3547(class727[][][] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class727[][] var4 = arg0[var2];
            for (int var5 = 0; var5 < var4.length; var5++) {
                for (int var6 = 0; var6 < var4[var5].length; var6++) {
                    class727 var7 = var4[var5][var6];
                    if (var7 != null) {
                        if (var7.field10177 instanceof class238) {
                            ((class238) var7.field10177).method936(false);
                        }
                        if (var7.field10171 instanceof class238) {
                            ((class238) var7.field10171).method936(false);
                        }
                        if (var7.field10181 instanceof class238) {
                            ((class238) var7.field10181).method936(false);
                        }
                        if (var7.field10173 instanceof class238) {
                            ((class238) var7.field10173).method936(false);
                        }
                        if (var7.field10187 instanceof class238) {
                            ((class238) var7.field10187).method936(false);
                        }
                        for (class10 var8 = var7.field10174; var8 != null; var8 = var8.field186) {
                            class712 var9 = var8.field187;
                            if (var9 instanceof class238) {
                                ((class238) var9).method936(false);
                            }
                        }
                    }
                }
            }
        }
        int var3 = -25 / ((arg1 - 85) / 35);
        field8565++;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(ZII)V", line = 174)
    public static final void method3548(boolean arg0, int arg1, int arg2) {
        field8560++;
        class330 var3 = arg0 ? class227.field2671 : class32.field501;
        if (var3 == null || arg1 < 0 || arg1 >= var3.field4081) {
            return;
        }
        class216 var4 = var3.field4076[arg1];
        if (~var4.field2539 != arg2) {
            return;
        }
        String var5 = var4.field2544;
        class336 var6 = class512.method3076(class55.field740, class591.field8030, (byte) 109);
        var6.field4150.method2353(-88, class615.method3482(var5, 1) + 3);
        var6.field4150.method2353(-60, arg0 ? 1 : 0);
        var6.field4150.method2369(-18090, arg1);
        var6.field4150.method2388(255, var5);
        class578.method3334(4, var6);
    }
}
