import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class205 {

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "Lhi;")
    public static class82 field3591 = class95.method664((byte) -87, "rot:");

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field3592 = 0;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "F")
    public static float field3585;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public int field3582;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public int field3587;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public int field3596;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "[Lhi;")
    public static class82[] field3589;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILhi;)V", line = 4)
    public static final void method1467(int arg0, class82 arg1) {
        field3598++;
        if (arg0 != 4) {
            method1470((byte) -73);
        }
        for (class109 var2 = (class109) class42.field741.method1936(16173); var2 != null; var2 = (class109) class42.field741.method1926((byte) 90)) {
            if (var2.field1955.method534(-110, arg1)) {
                class47.field781 = var2;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)Z", line = 29)
    public final boolean method1468(int arg0) {
        if (arg0 < 103) {
            this.method1471(47);
        }
        field3597++;
        return (this.field3587 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)Z", line = 65)
    public final boolean method1469(byte arg0) {
        if (arg0 == -99) {
            field3583++;
            return (this.field3587 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V", line = 77)
    public static final void method1470(byte arg0) {
        field3588++;
        if (arg0 != -85) {
            field3591 = (class82) null;
        }
        if (class80.field1362 == 5) {
            class80.field1362 = 6;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)Z", line = 96)
    public final boolean method1471(int arg0) {
        if (arg0 != 16) {
            field3590 = 24;
        }
        field3594++;
        return (this.field3587 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)Lin;", line = 108)
    public static final class37 method1472(byte arg0, int arg1) {
        field3595++;
        class37 var2 = (class37) class307.field5234.method2250((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class91.field1637.method1577(class256.method1832((byte) -101, arg1), class193.method1345(arg1, 255), -29569);
        class37 var4 = new class37();
        if (var3 != null) {
            var4.method284(new class153(var3), arg0 - 148);
        }
        class307.field5234.method2255(var4, (long) arg1, false);
        return arg0 == 20 ? var4 : (class37) null;
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)Z", line = 131)
    public final boolean method1473(int arg0) {
        if (arg0 != 16) {
            this.field3582 = -114;
        }
        field3586++;
        return (this.field3587 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lkl;ZIIIB)V", line = 152)
    public static final void method1474(class35 arg0, boolean arg1, int arg2, int arg3, int arg4, byte arg5) {
        field3593++;
        if (class21.field282 >= 50 || arg0.field552 == null || arg0.field552.length <= arg2 || arg0.field552[arg2] == null) {
            return;
        }
        int var6 = arg0.field552[arg2][0];
        int var7 = var6 >> 4 & 0x7;
        int var8 = var6 >> 8;
        int var9 = var6 & 0xF;
        if (arg0.field552[arg2].length > 1) {
            int var10 = (int) ((double) arg0.field552[arg2].length * Math.random());
            if (var10 > 0) {
                var8 = arg0.field552[arg2][var10];
            }
        }
        if (arg5 >= -66) {
            return;
        }
        if (var9 == 0) {
            if (arg1) {
                class222.method1588((byte) 85, 0, var7, var8);
            }
        } else if (class138.field2373 != 0) {
            class184.field3130[class21.field282] = var8;
            int var11 = (arg4 - 64) / 128;
            int var12 = (arg3 - 64) / 128;
            class22.field310[class21.field282] = var7;
            class105.field1862[class21.field282] = 0;
            class238.field4141[class21.field282] = null;
            class56.field897[class21.field282] = (var11 << 8) + (var12 << 16) + var9;
            class21.field282++;
        }
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)V", line = 208)
    public static void method1475(byte arg0) {
        field3591 = null;
        if (arg0 <= -8) {
            field3589 = null;
        }
    }
}
