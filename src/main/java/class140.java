import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class140 extends class177 {

    @OriginalMember(owner = "client!jj", name = "U", descriptor = "Lbe;")
    private class283 field2332 = class162.field2659;

    @OriginalMember(owner = "client!jj", name = "Q", descriptor = "I")
    public static int field2328 = 0;

    @OriginalMember(owner = "client!jj", name = "cb", descriptor = "Z")
    public static boolean field2340 = false;

    @OriginalMember(owner = "client!jj", name = "ab", descriptor = "Lbe;")
    public static class283 field2338 = class153.method941(-49, "(U4");

    @OriginalMember(owner = "client!jj", name = "bb", descriptor = "I")
    public static int field2339 = 0;

    @OriginalMember(owner = "client!jj", name = "eb", descriptor = "Lbe;")
    private static class283 field2342 = class153.method941(-18, "skill)2");

    @OriginalMember(owner = "client!jj", name = "S", descriptor = "Lbe;")
    public static class283 field2330 = field2342;

    @OriginalMember(owner = "client!jj", name = "lb", descriptor = "Lbe;")
    public static class283 field2349 = class153.method941(126, "");

    @OriginalMember(owner = "client!jj", name = "T", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!jj", name = "W", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!jj", name = "X", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!jj", name = "db", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!jj", name = "fb", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!jj", name = "gb", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!jj", name = "hb", descriptor = "I")
    public int field2345;

    @OriginalMember(owner = "client!jj", name = "ib", descriptor = "I")
    public int field2346;

    @OriginalMember(owner = "client!jj", name = "jb", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!jj", name = "kb", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!jj", name = "mb", descriptor = "I")
    private int field2350;

    @OriginalMember(owner = "client!jj", name = "V", descriptor = "Lek;")
    public static class172 field2333;

    @OriginalMember(owner = "client!jj", name = "Y", descriptor = "Lek;")
    public static class172 field2336;

    @OriginalMember(owner = "client!jj", name = "P", descriptor = "Lt;")
    private class239 field2327;

    @OriginalMember(owner = "client!jj", name = "Z", descriptor = "Lt;")
    public class239 field2337;

    @OriginalMember(owner = "client!jj", name = "R", descriptor = "[[I")
    public static int[][] field2329;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IILfe;)V", line = 7)
    private final void method877(int arg0, int arg1, class229 arg2) {
        field2343++;
        if (arg0 < 80) {
            field2339 = 7;
        }
        if (arg1 == 1) {
            this.field2346 = arg2.method1535((byte) 77);
        } else if (arg1 == 2) {
            this.field2345 = arg2.method1535((byte) 98);
        } else if (arg1 == 3) {
            this.field2332 = arg2.method1549(true);
        } else if (arg1 == 4) {
            this.field2350 = arg2.method1528(true);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg2.method1496(true);
            this.field2337 = new class239(class53.method336(-1753429918, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1528(true);
                class86 var7;
                if (arg1 == 5) {
                    var7 = new class236(arg2.method1549(true));
                } else {
                    var7 = new class119(arg2.method1528(true));
                }
                this.field2337.method1611(var7, -1, (long) var6);
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)Z", line = 60)
    public final boolean method878(int arg0, byte arg1) {
        field2334++;
        if (this.field2337 == null) {
            return false;
        }
        if (this.field2327 == null) {
            this.method880(-1);
        }
        class119 var3 = (class119) this.field2327.method1612((long) arg0, 109);
        if (var3 == null) {
            return false;
        } else if (arg1 == 74) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZ)I", line = 89)
    public final int method879(int arg0, boolean arg1) {
        field2344++;
        if (this.field2337 == null) {
            return this.field2350;
        }
        class119 var3 = (class119) this.field2337.method1612((long) arg0, 126);
        if (arg1) {
            return 36;
        } else if (var3 == null) {
            return this.field2350;
        } else {
            return var3.field1998;
        }
    }

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "(I)V", line = 133)
    private final void method880(int arg0) {
        field2347++;
        this.field2327 = new class239(this.field2337.method1605(false));
        if (arg0 == -1) {
            for (class119 var2 = (class119) this.field2337.method1607(0); var2 != null; var2 = (class119) this.field2337.method1604((byte) 127)) {
                class119 var3 = new class119((int) var2.field1445);
                this.field2327.method1611(var3, arg0, (long) var2.field1998);
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "(I)V", line = 165)
    public static void method881(int arg0) {
        field2342 = null;
        if (arg0 != 9666) {
            return;
        }
        field2329 = (int[][]) null;
        field2338 = null;
        field2330 = null;
        field2333 = null;
        field2349 = null;
        field2336 = null;
    }

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "(I)V", line = 183)
    private final void method882(int arg0) {
        field2341++;
        this.field2327 = new class239(this.field2337.method1605(false));
        for (class236 var2 = (class236) this.field2337.method1607(arg0); var2 != null; var2 = (class236) this.field2337.method1604((byte) 126)) {
            class143 var3 = new class143(var2.field3955, (int) var2.field1445);
            this.field2327.method1611(var3, arg0 - 1, var2.field3955.method1937(arg0 + -93));
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lbe;I)Z", line = 223)
    public final boolean method883(class283 arg0, int arg1) {
        if (arg1 != -1) {
            return true;
        }
        field2335++;
        if (this.field2337 == null) {
            return false;
        }
        if (this.field2327 == null) {
            this.method882(0);
        }
        for (class143 var3 = (class143) this.field2327.method1612(arg0.method1937(-123), 100); var3 != null; var3 = (class143) this.field2327.method1609((byte) -76)) {
            if (var3.field2378.method1926(arg1 - 16619, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)Lbe;", line = 260)
    public final class283 method884(int arg0, int arg1) {
        field2348++;
        if (this.field2337 == null) {
            return this.field2332;
        }
        class236 var3 = (class236) this.field2337.method1612((long) arg0, 126);
        if (var3 == null) {
            return this.field2332;
        } else if (arg1 > -16) {
            return (class283) null;
        } else {
            return var3.field3955;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lfe;I)V", line = 290)
    public final void method885(class229 arg0, int arg1) {
        field2331++;
        while (true) {
            int var3 = arg0.method1535((byte) 102);
            if (var3 == 0) {
                if (arg1 != -1) {
                    this.field2327 = (class239) null;
                }
                return;
            }
            this.method877(127, var3, arg0);
        }
    }
}
