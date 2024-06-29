import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class17 extends class147 {

    @OriginalMember(owner = "client!tc", name = "K", descriptor = "I")
    public int field190 = 0;

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "Z")
    public boolean field187 = true;

    @OriginalMember(owner = "client!tc", name = "V", descriptor = "I")
    public int field201 = -1;

    @OriginalMember(owner = "client!tc", name = "R", descriptor = "I")
    public int field197 = -1;

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "Lqj;")
    public static class196 field189 = class80.method502("blaugr-Un:", -48);

    @OriginalMember(owner = "client!tc", name = "O", descriptor = "Lqj;")
    private static class196 field194 = class80.method502("shake:", -48);

    @OriginalMember(owner = "client!tc", name = "P", descriptor = "Lqj;")
    public static class196 field195 = field194;

    @OriginalMember(owner = "client!tc", name = "M", descriptor = "Lqj;")
    public static class196 field192 = field194;

    @OriginalMember(owner = "client!tc", name = "S", descriptor = "Lqj;")
    public static class196 field198 = class80.method502(")1p", -48);

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!tc", name = "N", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!tc", name = "Q", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!tc", name = "U", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "Lub;")
    public static class43 field185;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIZLp;)V")
    private final void method89(int arg0, int arg1, boolean arg2, class56 arg3) {
        field191++;
        if (!arg2) {
            method90(-59L, -112);
        }
        if (arg1 == 1) {
            this.field190 = class31.method168(arg3.method328(-1974), (byte) 26);
        } else if (arg1 == 2) {
            this.field197 = arg3.method367(1);
        } else if (arg1 == 3) {
            this.field197 = arg3.method318(true);
            if (this.field197 == 65535) {
                this.field197 = -1;
            }
        } else if (arg1 == 5) {
            this.field187 = false;
        } else if (arg1 == 7) {
            this.field201 = class31.method168(arg3.method328(-1974), (byte) 26);
        } else if (arg1 == 8) {
            class151.field2437 = arg0;
        } else if (arg1 == 9) {
            arg3.method318(true);
        } else if (arg1 != 10) {
            if (arg1 == 11) {
                arg3.method367(1);
                return;
            }
            if (arg1 != 12) {
                if (arg1 == 13) {
                    arg3.method328(-1974);
                    return;
                }
                if (arg1 == 14) {
                    arg3.method367(1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(JI)V")
    public static final void method90(long arg0, int arg1) {
        field188++;
        if (arg0 == 0L) {
            return;
        }
        int var3 = -107 / ((arg1 + 62) / 58);
        for (int var4 = 0; var4 < class211.field3796; var4++) {
            if (class116.field1680[var4] == arg0) {
                class211.field3796--;
                for (int var5 = var4; var5 < class211.field3796; var5++) {
                    class116.field1680[var5] = class116.field1680[var5 + 1];
                    class198.field3511[var5] = class198.field3511[var5 + 1];
                }
                class242.field4302 = class92.field1341;
                class8.field80++;
                class44.field520.method1173(60, 14592);
                class44.field520.method346(arg0, (byte) 109);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)Z")
    public static final boolean method91(int arg0, byte arg1) {
        field196++;
        if (arg1 != -32) {
            field185 = null;
        }
        return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)V")
    public static final void method92(int arg0, int arg1, int arg2) {
        if (arg0 < 3) {
            field194 = null;
        }
        field199++;
        if (class35.method182(arg1, (byte) -96)) {
            class80.method497(1180, class91.field1335[arg1], arg2);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILp;)V")
    public final void method93(int arg0, int arg1, class56 arg2) {
        field200++;
        if (arg1 >= -67) {
            field186 = 85;
        }
        while (true) {
            int var4 = arg2.method367(1);
            if (var4 == 0) {
                return;
            }
            this.method89(arg0, var4, true, arg2);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lqj;B)I")
    public static final int method94(class196 arg0, byte arg1) {
        if (arg1 == -12) {
            field193++;
            return arg0.method1299(37) + 1;
        } else {
            return -49;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V")
    public static void method95(boolean arg0) {
        field194 = null;
        field198 = null;
        field195 = null;
        field185 = null;
        field189 = null;
        if (arg0) {
            field192 = null;
        }
    }
}
