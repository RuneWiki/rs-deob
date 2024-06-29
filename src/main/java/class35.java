import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class35 {

    @OriginalMember(owner = "client!be", name = "b", descriptor = "Lkfa;")
    public static class549 field395 = new class549(71, 3);

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field400 = 0;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Lxa;")
    public static class458 field398;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IJ)V", line = 3)
    public static final void method190(int arg0, long arg1) {
        field396++;
        int var3 = class538.field7744 + class377.field4914.field4641;
        int var4 = class320.field4155 + class377.field4914.field4647;
        if (class534.field7634 - var3 < -2000 || class534.field7634 - var3 > 2000 || (class656.field9368 - var4) < -2000 || (class656.field9368 - var4) > 2000) {
            class534.field7634 = var3;
            class656.field9368 = var4;
        }
        if (class534.field7634 != var3) {
            int var5 = var3 - class534.field7634;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            class534.field7634 += var6;
        }
        if (!class601.field8530.field2880) {
            class89.field958 += (float) arg1 * class526.field7522 / 6.0F;
            class90.field1041 += (float) arg1 * class574.field8149 / 6.0F;
        }
        if (arg0 <= 10) {
            method190(-1, 81L);
        }
        if (class656.field9368 != var4) {
            int var7 = var4 - class656.field9368;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class656.field9368 += var8;
        }
        class61.method406(16384);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)I", line = 105)
    public static final int method191(int arg0, int arg1, int arg2) {
        field399++;
        if (arg1 != 0) {
            method194((byte) 3);
        }
        return arg2 == 1 || arg2 == 3 ? class18.field161[arg0 & 0x3] : class402.field5357[arg0 & 0x3];
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V", line = 119)
    public static final void method192(int arg0, int arg1) {
        class122.field1375 = arg1;
        class580.field8249 = -1;
        field394++;
        class580.field8249 = arg0;
        class99.method613((byte) 126);
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(II)[B", line = 132)
    public static final synchronized byte[] method193(int arg0, int arg1) {
        field397++;
        if (arg1 == 100 && class656.field9371 > 0) {
            byte[] var2 = class324.field4224[--class656.field9371];
            class324.field4224[class656.field9371] = null;
            return var2;
        } else if (arg1 == 5000 && class255.field3253 > 0) {
            byte[] var3 = class257.field3292[--class255.field3253];
            class257.field3292[class255.field3253] = null;
            return var3;
        } else if (arg0 == arg1 && class358.field4695 > 0) {
            byte[] var4 = class325.field4236[--class358.field4695];
            class325.field4236[class358.field4695] = null;
            return var4;
        } else {
            if (class600.field8525 != null) {
                for (int var5 = 0; var5 < class417.field5539.length; var5++) {
                    if (class417.field5539[var5] == arg1 && class575.field8177[var5] > 0) {
                        byte[] var6 = class600.field8525[var5][--class575.field8177[var5]];
                        class600.field8525[var5][class575.field8177[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V", line = 189)
    public static void method194(byte arg0) {
        if (arg0 < -69) {
            field398 = null;
            field395 = null;
        }
    }
}
