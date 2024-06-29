import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class170 {

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "Lua;")
    private class90 field3068;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "Ltj;")
    private class177 field3074;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "Lpm;")
    private class103 field3070;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field3067 = 0;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "Lud;")
    public static class279 field3072 = class130.method1024("T", 255);

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "Lvh;")
    private class53 field3066;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "[Lqm;")
    private class230[] field3073;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V", line = 15)
    public static void method1322(int arg0) {
        if (arg0 != -22352) {
            field3072 = (class279) null;
        }
        field3072 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lda;IZLda;)Lqm;", line = 25)
    public final class230 method1323(class120 arg0, int arg1, boolean arg2, class120 arg3) {
        if (arg2) {
            this.field3074 = (class177) null;
        }
        field3071++;
        return this.method1326(arg1, true, arg3, (byte) 11, arg0);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIII)V", line = 45)
    public static final void method1324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3069++;
        class111.field2049[0].method423(arg3, arg0);
        int var6 = (arg5 - 32) * arg5 / arg1;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = 114 / ((-arg2 - 16) / 52);
        int var8 = (arg5 - var6 - 32) * arg4 / (arg1 - arg5);
        class111.field2049[1].method423(arg3, arg5 + arg0 - 16);
        if (!class97.field1824) {
            class146.method1110(arg3, arg0 + 16, 16, arg5 - 32, class261.field4640);
            class146.method1110(arg3, var8 + arg0 + 16, 16, var6, class125.field2322);
            class146.method1115(arg3, arg0 + var8 + 16, var6, class21.field590);
            class146.method1115(arg3 + 1, arg0 + 16 + var8, var6, class21.field590);
            class146.method1121(arg3, arg0 + var8 + 16, 16, class21.field590);
            class146.method1121(arg3, arg0 + var8 + 17, 16, class21.field590);
            class146.method1115(arg3 + 15, arg0 + var8 + 16, var6, class210.field3699);
            class146.method1115(arg3 + 14, arg0 + 17 + var8, var6 - 1, class210.field3699);
            class146.method1121(arg3, arg0 + var8 + var6 + 15, 16, class210.field3699);
            class146.method1121(arg3 + 1, arg0 + 14 + var8 + var6, 15, class210.field3699);
            return;
        }
        class256.method1827(arg3, arg0 + 16, 16, arg5 - 32, class261.field4640);
        class256.method1827(arg3, arg0 + var8 + 16, 16, var6, class125.field2322);
        class256.method1831(arg3, arg0 + var8 + 16, var6, class21.field590);
        class256.method1831(arg3 + 1, arg0 + 16 - -var8, var6, class21.field590);
        class256.method1834(arg3, var8 + arg0 + 16, 16, class21.field590);
        class256.method1834(arg3, arg0 + var8 + 17, 16, class21.field590);
        class256.method1831(arg3 + 15, var8 + 16 + arg0, var6, class210.field3699);
        class256.method1831(arg3 + 14, var8 + 17 + arg0, var6 - 1, class210.field3699);
        class256.method1834(arg3, var8 + var6 + arg0 + 15, 16, class210.field3699);
        class256.method1834(arg3 + 1, arg0 - -var8 + 14 + var6, 15, class210.field3699);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILud;ILud;ILud;)V", line = 90)
    public static final void method1325(int arg0, class279 arg1, int arg2, class279 arg3, int arg4, class279 arg5) {
        field3075++;
        for (int var6 = 99; var6 > 0; var6--) {
            class48.field977[var6] = class48.field977[var6 - 1];
            class275.field4886[var6] = class275.field4886[var6 - 1];
            class57.field1216[var6] = class57.field1216[var6 - 1];
            class88.field1682[var6] = class88.field1682[var6 - 1];
            class217.field3835[var6] = class217.field3835[var6 - 1];
        }
        class48.field977[0] = arg2;
        field3067++;
        class275.field4886[0] = arg5;
        class239.field4195 = class249.field4443;
        class57.field1216[0] = arg1;
        class217.field3835[arg0] = arg4;
        class88.field1682[0] = arg3;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZLda;BLda;)Lqm;", line = 129)
    private final class230 method1326(int arg0, boolean arg1, class120 arg2, byte arg3, class120 arg4) {
        field3076++;
        if (this.field3066 == null) {
            throw new RuntimeException();
        }
        this.field3066.field1142 = arg0 * 8 + 5;
        if (arg3 < 2) {
            this.field3074 = (class177) null;
        }
        if (this.field3066.field1168.length <= this.field3066.field1142) {
            throw new RuntimeException();
        } else if (this.field3073[arg0] == null) {
            int var6 = this.field3066.method453(1);
            int var7 = this.field3066.method453(1);
            class230 var8 = new class230(arg0, arg2, arg4, this.field3074, this.field3068, var6, var7, arg1);
            this.field3073[arg0] = var8;
            return var8;
        } else {
            return this.field3073[arg0];
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)Z", line = 173)
    public final boolean method1327(int arg0) {
        field3078++;
        if (this.field3066 != null) {
            return true;
        }
        if (this.field3070 == null) {
            if (this.field3074.method1377(88)) {
                return false;
            }
            this.field3070 = this.field3074.method1385(255, true, arg0 - 1436188094, 255, (byte) 0);
        }
        if (this.field3070.field4920) {
            return false;
        }
        if (arg0 != 6446) {
            method1322(-42);
        }
        this.field3066 = new class53(this.field3070.method873(-4958));
        this.field3073 = new class230[(this.field3066.field1168.length - 5) / 8];
        return true;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Ltj;Lua;)V", line = 199)
    public class170(class177 arg0, class90 arg1) {
        this.field3068 = arg1;
        this.field3074 = arg0;
        if (!this.field3074.method1377(78)) {
            this.field3070 = this.field3074.method1385(255, true, -1436181648, 255, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V", line = 213)
    public final void method1328(boolean arg0) {
        if (arg0) {
            method1325(-38, (class279) null, 43, (class279) null, 123, (class279) null);
        }
        field3064++;
        if (this.field3073 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3073.length; var2++) {
            if (this.field3073[var2] != null) {
                this.field3073[var2].method1668(-47);
            }
        }
        for (int var3 = 0; var3 < this.field3073.length; var3++) {
            if (this.field3073[var3] != null) {
                this.field3073[var3].method1662((byte) -6);
            }
        }
    }
}
