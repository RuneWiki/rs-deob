import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class563 {

    @OriginalMember(owner = "client!tea", name = "f", descriptor = "I")
    public int field7971 = -1;

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "I")
    public int field7970 = -1;

    @OriginalMember(owner = "client!tea", name = "i", descriptor = "I")
    public static int field7974 = 0;

    @OriginalMember(owner = "client!tea", name = "h", descriptor = "Lbu;")
    public static class147 field7973 = new class147(0);

    @OriginalMember(owner = "client!tea", name = "l", descriptor = "[I")
    public static int[] field7977 = new int[50];

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "I")
    public static int field7966;

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "I")
    public static int field7967;

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "I")
    public static int field7968;

    @OriginalMember(owner = "client!tea", name = "d", descriptor = "I")
    public static int field7969;

    @OriginalMember(owner = "client!tea", name = "g", descriptor = "I")
    public static int field7972;

    @OriginalMember(owner = "client!tea", name = "j", descriptor = "[I")
    public int[] field7975;

    @OriginalMember(owner = "client!tea", name = "k", descriptor = "[Lov;")
    public static class668[] field7976;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IB)Z")
    public static final boolean method3255(int arg0, byte arg1) {
        field7969++;
        if (arg1 != -40) {
            method3258(true);
        }
        return arg0 == 7 || arg0 == 8 || arg0 == 9;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(ZZ)V")
    public static final void method3256(boolean arg0, boolean arg1) {
        if (arg1) {
            if (class673.field9523 != -1) {
                class135.method1085((byte) -13, class673.field9523);
            }
            for (class520 var2 = (class520) class36.field340.method3508((byte) -46); var2 != null; var2 = (class520) class36.field340.method3520(-1)) {
                if (!var2.method637((byte) 115)) {
                    var2 = (class520) class36.field340.method3508((byte) -55);
                    if (var2 == null) {
                        break;
                    }
                }
                class197.method1479(true, var2, false, (byte) 37);
            }
            class673.field9523 = -1;
            class36.field340 = new class616(8);
            class735.method4102(-4007);
            class673.field9523 = class575.field8159;
            class173.method1363(false, (byte) 77);
            class353.method2259((byte) -95);
            class464.method2847(class673.field9523);
        }
        field7972++;
        class195.field3351 = arg0;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Z)V")
    public static void method3257(boolean arg0) {
        field7977 = null;
        field7976 = null;
        field7973 = null;
        if (!arg0) {
            method3255(-103, (byte) 12);
        }
    }

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "(Z)Z")
    public static final boolean method3258(boolean arg0) {
        field7967++;
        if (class656.field9338 == null) {
            return false;
        }
        if (class656.field9338.field3488 >= 2000) {
            class656.field9338.field3488 -= 2000;
        }
        if (arg0) {
            method3256(false, true);
        }
        return class656.field9338.field3488 == 1001;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lofa;I)V")
    public final void method3259(class301 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1987(-63);
            if (var3 == 0) {
                field7968++;
                if (arg1 != -1) {
                    field7976 = null;
                    return;
                }
                return;
            }
            this.method3260(false, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(ZILofa;)V")
    private final void method3260(boolean arg0, int arg1, class301 arg2) {
        if (arg1 == 1) {
            this.field7970 = arg2.method1989((byte) -70);
        } else if (arg1 == 2) {
            this.field7975 = new int[arg2.method1987(-43)];
            for (int var4 = 0; var4 < this.field7975.length; var4++) {
                this.field7975[var4] = arg2.method1989((byte) -68);
            }
        } else if (arg1 == 3) {
            this.field7971 = arg2.method1987(-56);
        }
        field7966++;
        if (arg0) {
            field7974 = 23;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)V")
    public static final void method3261(int arg0) {
        if (arg0 == 0) {
            if (class23.field228 == 2) {
                class147.field2305[0].method3285(class222.field3605[0]);
                class147.field2305[1].method3285(class222.field3605[1]);
            } else if (class23.field228 == 3) {
                class147.field2305[0].method3285(class222.field3605[0]);
                class147.field2305[1].method3285(class222.field3605[1]);
                class147.field2305[2].method3285(class222.field3605[2]);
            } else {
                class147.field2305[0].method3285(class222.field3605[0]);
                class147.field2305[1].method3285(class222.field3605[1]);
                class147.field2305[2].method3285(class222.field3605[2]);
                class147.field2305[3].method3285(class222.field3605[3]);
            }
        } else if (arg0 == 1) {
            if (class23.field228 == 2) {
                class147.field2305[0].method3285(class222.field3605[2]);
            } else if (class23.field228 == 3) {
                class147.field2305[0].method3285(class222.field3605[3]);
                class147.field2305[1].method3285(class222.field3605[4]);
            } else {
                class147.field2305[0].method3285(class222.field3605[4]);
                class147.field2305[1].method3285(class222.field3605[5]);
                class147.field2305[2].method3285(class222.field3605[6]);
            }
        } else if (arg0 == 2) {
            if (class23.field228 == 2) {
                class147.field2305[0].method3285(class222.field3605[3]);
                return;
            }
            if (class23.field228 == 3) {
                class147.field2305[0].method3285(class222.field3605[5]);
                return;
            }
            class147.field2305[0].method3285(class222.field3605[7]);
        }
    }
}
