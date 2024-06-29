import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class40 extends class233 {

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
    private int field612;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
    private int field619;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
    private int field618;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    private int field613;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "[I")
    public static int[] field607 = new int[2];

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
    public static int field616 = 0;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public static int field610 = 0;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "[I")
    public static int[] field617 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "Le;")
    public static class67 field614;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
    public static void method277(boolean arg0) {
        field607 = null;
        field617 = null;
        if (arg0) {
            field616 = 35;
        }
        field614 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BB)V")
    public static final void method278(byte arg0, byte arg1) {
        if (class217.field3412 == null) {
            class217.field3412 = new byte[4][104][104];
        }
        if (arg1 >= -64) {
            method277(true);
        }
        for (int var2 = 0; var2 < 4; ++var2) {
            for (int var3 = 0; var3 < 104; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    class217.field3412[var2][var3][var4] = arg0;
                }
            }
        }
        ++field608;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
    public final void method279(int arg0, int arg1, int arg2) {
        if (arg0 > -121) {
            method277(false);
        }
        ++field606;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)V")
    public static final void method280(int arg0, byte arg1) {
        int var2 = 53 / ((arg1 - 42) / 37);
        class291 var3 = class61.method389(arg0, 6, 0);
        ++field611;
        var3.method2010(0);
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(IIIIII)V")
    public class40(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field612 = arg3;
        this.field619 = arg1;
        this.field618 = arg0;
        this.field613 = arg2;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBI)V")
    public final void method281(int arg0, byte arg1, int arg2) {
        ++field605;
        int var4 = this.field618 * arg2 >> 12;
        int var5 = this.field612 * arg0 >> 12;
        int var6 = this.field613 * arg2 >> 12;
        int var7 = 108 % ((arg1 - -43) / 49);
        int var8 = this.field619 * arg0 >> 12;
        class307.method2088(var5, (byte) -14, var6, super.field3641, var4, var8);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIZ)V")
    public final void method282(int arg0, int arg1, boolean arg2) {
        ++field609;
        if (!arg2) {
            this.method279(-98, -101, -4);
        }
    }
}
