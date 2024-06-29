import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class105 {

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "Llh;")
    public class213 field1368 = new class213();

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field1361 = 0;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "Llh;")
    private class213 field1371;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)Llh;", line = 4)
    public final class213 method739(byte arg0) {
        if (arg0 < 30) {
            return (class213) null;
        }
        class213 var2 = this.field1368.field3012;
        field1372++;
        if (this.field1368 == var2) {
            this.field1371 = null;
            return null;
        } else {
            this.field1371 = var2.field3012;
            return var2;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILlh;)V", line = 25)
    public final void method740(int arg0, class213 arg1) {
        int var3 = -53 / ((arg0 + 44) / 54);
        if (arg1.field3007 != null) {
            arg1.method1556(255);
        }
        field1370++;
        arg1.field3012 = this.field1368;
        arg1.field3007 = this.field1368.field3007;
        arg1.field3007.field3012 = arg1;
        arg1.field3012.field3007 = arg1;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)I", line = 51)
    public final int method741(boolean arg0) {
        int var2 = 0;
        field1365++;
        class213 var3 = this.field1368.field3012;
        if (!arg0) {
            return 30;
        }
        while (this.field1368 != var3) {
            var3 = var3.field3012;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "([[IB)V", line = 72)
    public static final void method742(int[][] arg0, byte arg1) {
        field1363++;
        class331.field4902 = arg0;
        int var2 = -59 / ((arg1 + 48) / 42);
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(Z)Llh;", line = 88)
    public final class213 method743(boolean arg0) {
        if (arg0) {
            return (class213) null;
        }
        field1366++;
        class213 var2 = this.field1368.field3012;
        if (this.field1368 == var2) {
            return null;
        } else {
            var2.method1556(255);
            return var2;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V", line = 116)
    public final void method744(int arg0) {
        while (true) {
            class213 var2 = this.field1368.field3012;
            if (this.field1368 == var2) {
                this.field1371 = null;
                if (arg0 != -15997) {
                    return;
                }
                field1360++;
                return;
            }
            var2.method1556(255);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIII)I", line = 136)
    public static final int method745(int arg0, int arg1, int arg2, int arg3) {
        field1364++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (arg3 == var4) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZIIII)V", line = 157)
    public static final void method746(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        class251.field3681.field4351 = 0;
        field1369++;
        class251.field3681.method2048(20, 104);
        if (arg0) {
            return;
        }
        class251.field3681.method2048(arg4, 115);
        class251.field3681.method2048(arg3, 125);
        class251.field3681.method2098(-45, arg1);
        class251.field3681.method2098(-107, arg2);
        class226.field3251 = 0;
        class318.field4688 = 1;
        class210.field2970 = -3;
        class145.field2025 = 0;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V", line = 205)
    public class105() {
        this.field1368.field3007 = this.field1368;
        this.field1368.field3012 = this.field1368;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)Llh;", line = 185)
    public final class213 method747(int arg0) {
        class213 var2 = this.field1371;
        field1362++;
        if (this.field1368 == var2) {
            this.field1371 = null;
            return null;
        }
        if (arg0 != 1) {
            this.method740(64, (class213) null);
        }
        this.field1371 = var2.field3012;
        return var2;
    }
}
