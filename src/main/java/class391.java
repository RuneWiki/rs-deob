import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class391 {

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public int field5435 = 16777215;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public int field5433 = 8;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "[[B")
    public static byte[][] field5437 = new byte[50][];

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public static int field5440 = 0;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public int field5430;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public int field5434;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public int field5436;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public int field5438;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public int field5442;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "Z")
    public boolean field5441;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lrg;IZI)V")
    private final void method2429(class366 arg0, int arg1, boolean arg2, int arg3) {
        field5432++;
        if (arg1 == 1) {
            this.field5433 = arg0.method2297(13352);
        } else if (arg1 == 2) {
            this.field5441 = true;
        } else if (arg1 == 3) {
            this.field5434 = arg0.method2257((byte) 110);
            this.field5442 = arg0.method2257((byte) 110);
            this.field5430 = arg0.method2257((byte) 110);
        } else if (arg1 == 4) {
            this.field5438 = arg0.method2306((byte) 45);
        } else if (arg1 == 5) {
            this.field5436 = arg0.method2297(13352);
        } else if (arg1 == 6) {
            this.field5435 = arg0.method2263((byte) 10);
        }
        if (!arg2) {
            this.method2431((class366) null, -77, 99);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
    public static void method2430(boolean arg0) {
        if (arg0) {
            field5437 = null;
        }
        field5437 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lrg;II)V")
    public final void method2431(class366 arg0, int arg1, int arg2) {
        field5439++;
        while (true) {
            int var4 = arg0.method2306((byte) 67);
            if (var4 == 0) {
                int var5 = -35 / ((arg2 + 66) / 58);
                return;
            }
            this.method2429(arg0, var4, true, arg1);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIILjq;I)V")
    public static final void method2432(int arg0, int arg1, int arg2, class185 arg3, int arg4) {
        field5431++;
        if (arg1 != -3) {
            return;
        }
        class60 var5 = arg3.method1283((byte) 92);
        int var6 = arg3.field2574 - arg3.field2609.field276 & 0x3FFF;
        if (arg0 == -1) {
            if (var6 != 0 || arg3.field2651 > 25) {
                arg3.field2597 = false;
                if (arg4 < 0 && var5.field779 != -1) {
                    arg3.field2587 = var5.field779;
                } else if (arg4 <= 0 || var5.field764 == -1) {
                    arg3.field2587 = var5.field783;
                } else {
                    arg3.field2587 = var5.field764;
                }
            } else if (!arg3.field2597 || !var5.method477(arg3.field2587, (byte) 120)) {
                arg3.field2587 = var5.method478(arg1 + 6595);
                arg3.field2597 = arg3.field2587 != -1;
            }
        } else if (arg3.field2590 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class361.field4983[arg2] - arg3.field2609.field276 & 0x3FFF;
            if (arg0 == 2 && var5.field765 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field786 != -1) {
                    arg3.field2587 = var5.field786;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field769 != -1) {
                    arg3.field2587 = var5.field769;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field782 == -1) {
                    arg3.field2587 = var5.field765;
                } else {
                    arg3.field2587 = var5.field782;
                }
            } else if (arg0 == 0 && var5.field770 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field814 != -1) {
                    arg3.field2587 = var5.field814;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field802 != -1) {
                    arg3.field2587 = var5.field802;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field806 == -1) {
                    arg3.field2587 = var5.field770;
                } else {
                    arg3.field2587 = var5.field806;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field776 != -1) {
                arg3.field2587 = var5.field776;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field784 != -1) {
                arg3.field2587 = var5.field784;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field794 == -1) {
                arg3.field2587 = var5.field783;
            } else {
                arg3.field2587 = var5.field794;
            }
            arg3.field2597 = false;
        } else if (var6 == 0 && arg3.field2651 <= 25) {
            if (arg0 == 2 && var5.field765 != -1) {
                arg3.field2587 = var5.field765;
            } else if (arg0 == 0 && var5.field770 != -1) {
                arg3.field2587 = var5.field770;
            } else {
                arg3.field2587 = var5.field783;
            }
            arg3.field2597 = false;
        } else {
            arg3.field2597 = false;
            if (arg0 == 2 && var5.field765 != -1) {
                if (arg4 < 0 && var5.field774 != -1) {
                    arg3.field2587 = var5.field774;
                } else if (arg4 <= 0 || var5.field798 == -1) {
                    arg3.field2587 = var5.field765;
                } else {
                    arg3.field2587 = var5.field798;
                }
            } else if (arg0 == 0 && var5.field770 != -1) {
                if (arg4 < 0 && var5.field775 != -1) {
                    arg3.field2587 = var5.field775;
                } else if (arg4 <= 0 || var5.field807 == -1) {
                    arg3.field2587 = var5.field770;
                } else {
                    arg3.field2587 = var5.field807;
                }
            } else if (arg4 < 0 && var5.field809 != -1) {
                arg3.field2587 = var5.field809;
            } else if (arg4 <= 0 || var5.field796 == -1) {
                arg3.field2587 = var5.field783;
            } else {
                arg3.field2587 = var5.field796;
            }
        }
    }
}
