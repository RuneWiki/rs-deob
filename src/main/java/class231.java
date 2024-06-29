import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class231 {

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
    private int field3112 = 0;

    @OriginalMember(owner = "client!ts", name = "j", descriptor = "I")
    private int field3114 = 0;

    @OriginalMember(owner = "client!ts", name = "n", descriptor = "I")
    private int field3118 = 0;

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "Lck;")
    private class733 field3109;

    @OriginalMember(owner = "client!ts", name = "m", descriptor = "Lwo;")
    private class722 field3117;

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "[Lmk;")
    private class301[] field3107;

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "Lpp;")
    public class92 field3110;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!ts", name = "k", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!ts", name = "l", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "Lija;")
    public static class364 field3108;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIZZI)V")
    public final void method1479(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        field3116++;
        boolean var7 = arg3 & this.field3109.method917();
        if (!var7 && (arg5 == 4 || arg5 == 8 || arg5 == 9)) {
            if (arg5 == 4) {
                arg1 = arg2;
            }
            arg5 = 2;
        }
        if (arg5 != 0 && arg4) {
            arg5 |= Integer.MIN_VALUE;
        }
        if (this.field3112 != arg5) {
            if (this.field3112 != 0) {
                this.field3107[this.field3112 & Integer.MAX_VALUE].method24((byte) -91);
            }
            if (arg5 != 0) {
                this.field3107[arg5 & Integer.MAX_VALUE].method29(arg0 + 78, arg4);
                this.field3107[Integer.MAX_VALUE & arg5].method27(0, arg4);
                this.field3107[arg5 & Integer.MAX_VALUE].method22(arg1, arg2, 0);
            }
            this.field3114 = arg1;
            this.field3112 = arg5;
            this.field3118 = arg2;
        } else if (this.field3112 != 0) {
            this.field3107[Integer.MAX_VALUE & this.field3112].method27(0, arg4);
            if (this.field3118 != arg2 || this.field3114 != arg1) {
                this.field3107[this.field3112 & Integer.MAX_VALUE].method22(arg1, arg2, 0);
                this.field3118 = arg2;
                this.field3114 = arg1;
            }
        }
        if (arg0 != 4) {
            method1482(-44, null, null);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)Z")
    public final boolean method1480(int arg0, int arg1) {
        if (arg1 == 9) {
            field3106++;
            return this.field3107[arg0].method25((byte) 43);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILwj;I)Z")
    public final boolean method1481(int arg0, class128 arg1, int arg2) {
        if (arg0 != 9) {
            return true;
        }
        field3111++;
        if (this.field3112 == 0) {
            return false;
        } else {
            this.field3107[Integer.MAX_VALUE & this.field3112].method28(arg1, 0, arg2);
            return true;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILkh;Lkh;)V")
    public static final void method1482(int arg0, class173 arg1, class173 arg2) {
        field3105++;
        if (arg0 != 12514) {
            method1483(89);
        }
        if (arg2.field2282 != null) {
            arg2.method1084((byte) -127);
        }
        arg2.field2279 = arg1;
        arg2.field2282 = arg1.field2282;
        arg2.field2282.field2279 = arg2;
        arg2.field2279.field2282 = arg2;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
    public static void method1483(int arg0) {
        int var1 = -56 / ((arg0 + 57) / 40);
        field3108 = null;
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(II)Luk;")
    public static final class225 method1484(int arg0, int arg1) {
        if (arg1 != 8) {
            return null;
        }
        field3113++;
        class225 var2 = (class225) class77.field1076.method2931((long) arg0, (byte) -75);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class405.field5379.method139(0, (byte) -94, arg0);
        class225 var4 = new class225();
        if (var3 != null) {
            var4.method1456(arg0, new class234(var3), arg1 ^ 0x4C);
        }
        class77.field1076.method2918((long) arg0, var4, arg1 ^ 0x78);
        return var4;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(BJ)V")
    public static final void method1485(byte arg0, long arg1) {
        field3115++;
        if (class28.field252 != null) {
            if (class507.field6476 == 1 || class507.field6476 == 5) {
                class453.method2577(arg1, arg0 ^ 0xFFFFC406);
            } else if (class507.field6476 == 4) {
                class519.method2865(arg1, (byte) -42);
            }
        }
        class127.method740(class576.field7320, (long) class693.field8900, 0);
        if (client.field6070 != -1) {
            class766.method4165(-1, client.field6070);
        }
        for (int var3 = 0; var3 < class547.field6839; var3++) {
            if (class454.field5919[var3]) {
                class576.field7318[var3] = true;
            }
            class40.field461[var3] = class454.field5919[var3];
            class454.field5919[var3] = false;
        }
        if (arg0 != 74) {
            method1483(-122);
        }
        class655.field8444 = class693.field8900;
        class500.method2774(-1, -26279, -1, null);
        class37.method221((byte) -111, -1, null, -1);
        if (client.field6070 != -1) {
            class547.field6839 = 0;
            class747.method4057((byte) 28);
        }
        class576.field7320.method957();
        class120.method711(class576.field7320, (byte) -75);
        int var4 = class789.method4320(3);
        if (var4 == -1) {
            var4 = class20.field185;
        }
        if (var4 == -1) {
            var4 = class32.field314;
        }
        class681.method3660(var4, -1);
        int var5 = class422.field5564.method190((byte) -85) << 8;
        class484.method2717(class621.field7858, class422.field5564.field2895, -97, class422.field5564.field2896 + var5, class422.field5564.field2900 + var5);
        class621.field7858 = 0;
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lck;)V")
    public class231(class733 arg0) {
        this.field3109 = arg0;
        this.field3117 = new class722(arg0);
        this.field3107 = new class301[10];
        this.field3107[1] = new class514(arg0);
        this.field3107[2] = new class169(arg0, this.field3117);
        this.field3107[4] = new class281(arg0, this.field3117);
        this.field3107[5] = new class742(arg0, this.field3117);
        this.field3107[6] = new class9(arg0);
        this.field3107[7] = new class96(arg0);
        this.field3107[3] = this.field3110 = new class92(arg0);
        this.field3107[8] = new class380(arg0, this.field3117);
        this.field3107[9] = new class126(arg0, this.field3117);
        if (!this.field3107[8].method25((byte) 40)) {
            this.field3107[8] = this.field3107[4];
        }
        if (!this.field3107[9].method25((byte) 91)) {
            this.field3107[9] = this.field3107[8];
        }
    }
}
