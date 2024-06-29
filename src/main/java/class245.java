import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class245 extends class15 {

    @OriginalMember(owner = "client!im", name = "P", descriptor = "I")
    public static int field4147 = 99;

    @OriginalMember(owner = "client!im", name = "Y", descriptor = "[Lce;")
    public static class126[] field4156 = new class126[5];

    @OriginalMember(owner = "client!im", name = "X", descriptor = "Lce;")
    public static class126 field4155 = class206.method1445(-7923, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!im", name = "J", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!im", name = "K", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!im", name = "L", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!im", name = "N", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!im", name = "O", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!im", name = "R", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!im", name = "S", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!im", name = "T", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!im", name = "U", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!im", name = "V", descriptor = "I")
    public int field4153;

    @OriginalMember(owner = "client!im", name = "W", descriptor = "I")
    public int field4154;

    @OriginalMember(owner = "client!im", name = "Z", descriptor = "I")
    public int field4157;

    @OriginalMember(owner = "client!im", name = "Q", descriptor = "Lce;")
    public class126 field4148;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "(B)V", line = 4)
    public static void method1681(byte arg0) {
        field4155 = null;
        if (arg0 == -11) {
            field4156 = null;
        }
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(I)V", line = 23)
    public final void method1682(int arg0) {
        this.field202 = class261.method1765(16299) + 500L | Long.MIN_VALUE & this.field202;
        class242.field4104.method1295(-128, this);
        field4152++;
        if (arg0 <= 81) {
            method1685((byte) -62);
        }
    }

    @OriginalMember(owner = "client!im", name = "d", descriptor = "(I)V", line = 38)
    public final void method1683(int arg0) {
        field4149++;
        this.field202 |= Long.MIN_VALUE;
        if ((long) arg0 == this.method1688(true)) {
            class32.field473.method1295(-120, this);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BB)V", line = 57)
    public static final void method1684(byte arg0, byte arg1) {
        field4144++;
        if (class214.field3639 == null) {
            class214.field3639 = new byte[4][104][104];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class214.field3639[var2][var3][var4] = arg1;
                }
            }
        }
        if (arg0 >= -5) {
            method1686(true);
        }
    }

    @OriginalMember(owner = "client!im", name = "f", descriptor = "(B)V", line = 98)
    public static final void method1685(byte arg0) {
        if (arg0 > -9) {
            return;
        }
        class297 var1 = (class297) class203.field3483.method898((byte) -126);
        field4151++;
        while (var1 != null) {
            class59 var2 = var1.field4937;
            if (class131.field2250 != var2.field941 || class249.field4174 > var2.field949) {
                var1.method499((byte) 64);
            } else if (class249.field4174 >= var2.field925) {
                if (var2.field961 > 0) {
                    class89 var3 = class199.field3391[var2.field961 - 1];
                    if (var3 != null && var3.field2461 >= 0 && var3.field2461 < 13312 && var3.field2487 >= 0 && var3.field2487 < 13312) {
                        var2.method409(class249.field4174, class174.method1265(var3.field2487, 8100, var2.field941, var3.field2461) - var2.field935, -67, var3.field2487, var3.field2461);
                    }
                }
                if (var2.field961 < 0) {
                    int var4 = -var2.field961 - 1;
                    class301 var5;
                    if (class11.field145 == var4) {
                        var5 = class286.field4744;
                    } else {
                        var5 = class85.field1352[var4];
                    }
                    if (var5 != null && var5.field2461 >= 0 && var5.field2461 < 13312 && var5.field2487 >= 0 && var5.field2487 < 13312) {
                        var2.method409(class249.field4174, class174.method1265(var5.field2487, 8100, var2.field941, var5.field2461) - var2.field935, 53, var5.field2487, var5.field2461);
                    }
                }
                var2.method410((byte) -56, class303.field5038);
                class199.method1411(class131.field2250, (int) var2.field940, (int) var2.field933, (int) var2.field955, 60, var2, var2.field958, -1L, false);
            }
            var1 = (class297) class203.field3483.method893((byte) -120);
        }
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(Z)V", line = 162)
    public static final void method1686(boolean arg0) {
        if (class139.field2522 < 0) {
            class100.field1624 = -1;
            class134.field2335 = -1;
            class139.field2522 = 0;
        }
        field4143++;
        if (arg0) {
            field4155 = (class126) null;
        }
        if (class139.field2522 > class36.field521) {
            class100.field1624 = -1;
            class139.field2522 = class36.field521;
            class134.field2335 = -1;
        }
        if (class253.field4249 < 0) {
            class253.field4249 = 0;
            class134.field2335 = -1;
            class100.field1624 = -1;
        }
        if (class253.field4249 > class143.field2602) {
            class100.field1624 = -1;
            class253.field4249 = class143.field2602;
            class134.field2335 = -1;
        }
    }

    @OriginalMember(owner = "client!im", name = "g", descriptor = "(B)I", line = 201)
    public final int method1687(byte arg0) {
        field4150++;
        if (arg0 < 14) {
            method1681((byte) 85);
        }
        return (int) (this.field1117 >>> 32 & 0xFFL);
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(Z)J", line = 217)
    public final long method1688(boolean arg0) {
        field4145++;
        if (!arg0) {
            field4147 = -50;
        }
        return this.field202 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(II)V", line = 232)
    public class245(int arg0, int arg1) {
        this.field1117 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!im", name = "e", descriptor = "(I)I", line = 242)
    public final int method1689(int arg0) {
        int var2 = 124 % ((-arg0 - 59) / 42);
        field4142++;
        return (int) this.field1117;
    }
}
