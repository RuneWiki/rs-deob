import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class133 {

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public int field2429;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "[S")
    public short[] field2423;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "[I")
    public int[] field2439;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "[Lud;")
    public class279[] field2438;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "[B")
    public byte[] field2430;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "[S")
    public short[] field2436;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "Lud;")
    public static class279 field2425 = class130.method1024(" )2> <col=ffffff>", 255);

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "Lud;")
    public static class279 field2420 = class130.method1024("Lade Texturen )2 ", 255);

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "Lud;")
    public static class279 field2431 = class130.method1024("Lade Titelbild )2 ", 255);

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "Lud;")
    public static class279 field2441 = class130.method1024("<col=80ff00>", 255);

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "Llm;")
    public static class49 field2428;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "[I")
    public static int[] field2424;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)I", line = 9)
    public final int method1040(int arg0, byte arg1) {
        if (arg1 < 70) {
            method1046(-105);
        }
        field2437++;
        return this.field2430[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/util/Random;II)I", line = 20)
    public static final int method1041(Random arg0, int arg1, int arg2) {
        field2426++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class14.method100(93, arg1)) {
            return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            if (arg2 != 10061) {
                method1046(77);
            }
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var4 >= var3);
            return class33.method297(var4, (byte) 124, arg1);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZLcg;Lcg;II)I", line = 50)
    public static final int method1042(boolean arg0, class42 arg1, class42 arg2, int arg3, int arg4) {
        field2440++;
        if (arg4 == 1) {
            int var5 = arg2.field2585;
            int var6 = arg1.field2585;
            if (!arg0) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg3 >= -42) {
            return -27;
        } else if (arg4 == 2) {
            return arg2.method358((byte) -128).field4768.method1968(-83, arg1.method358((byte) -128).field4768);
        } else if (arg4 == 3) {
            if (arg2.field882.method1990((byte) 26, class271.field4835)) {
                if (arg1.field882.method1990((byte) 39, class271.field4835)) {
                    return 0;
                } else if (arg0) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field882.method1990((byte) 122, class271.field4835)) {
                return arg0 ? 1 : -1;
            } else {
                return arg2.field882.method1968(-70, arg1.field882);
            }
        } else if (arg4 == 4) {
            return arg2.method1099(4259) ? (arg1.method1099(4259) ? 0 : 1) : (arg1.method1099(4259) ? -1 : 0);
        } else if (arg4 == 5) {
            return arg2.method1098(2) ? (arg1.method1098(2) ? 0 : 1) : (arg1.method1098(2) ? -1 : 0);
        } else if (arg4 == 6) {
            return arg2.method1094(0) ? (arg1.method1094(0) ? 0 : 1) : (arg1.method1094(0) ? -1 : 0);
        } else if (arg4 == 7) {
            return arg2.method1096((byte) 92) ? (arg1.method1096((byte) -77) ? 0 : 1) : (arg1.method1096((byte) 87) ? -1 : 0);
        } else {
            return arg2.field884 - arg1.field884;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZZ)V", line = 121)
    public static final void method1043(boolean arg0, boolean arg1) {
        field2421++;
        if (arg1) {
            field2424 = (int[]) null;
        }
        if (arg0) {
            if (class307.field5444 != -1) {
                class18.method155(true, class307.field5444);
            }
            for (class176 var2 = (class176) class226.field3977.method609(-26368); var2 != null; var2 = (class176) class226.field3977.method604(2)) {
                class5.method29(arg1, var2, true);
            }
            class307.field5444 = -1;
            class226.field3977 = new class69(8);
            class126.method1013(-121);
            class307.field5444 = class184.field3372;
            class237.method1702(false, (byte) -15);
            class37.method327(0);
            class64.method563(!arg1, class307.field5444);
        }
        class222.field3935 = -1;
        class292.method2079(class150.field2745, !arg1);
        class72.field1420 = new class239();
        class72.field1420.field79 = 3000;
        class72.field1420.field86 = 3000;
        if (!class97.field1824) {
            class48.method395(class266.field4799, -13551);
            class172.method1343(10, -29401);
            return;
        }
        if (class122.field2191 == 2) {
            class21.field589 = class322.field5632 << 7;
            class92.field1747 = class214.field3758 << 7;
        } else {
            class248.method1777(3);
        }
        class29.method266(-128);
        class54.method508(107);
        class172.method1343(28, -29401);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)Z", line = 181)
    public final boolean method1044(int arg0, int arg1) {
        field2434++;
        if (arg0 != 8) {
            field2420 = (class279) null;
        }
        return (this.field2430[arg1] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)Z", line = 193)
    public final boolean method1045(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field2430 = (byte[]) null;
        }
        field2422++;
        return (this.field2430[arg0] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V", line = 215)
    public static void method1046(int arg0) {
        field2425 = null;
        field2431 = null;
        if (arg0 != -8) {
            method1042(false, (class42) null, (class42) null, -92, 36);
        }
        field2420 = null;
        field2424 = null;
        field2441 = null;
        field2428 = null;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(II)Z", line = 235)
    public final boolean method1047(int arg0, int arg1) {
        field2432++;
        int var3 = 93 % ((arg1 + 16) / 42);
        return (this.field2430[arg0] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZLgf;)I", line = 248)
    public static final int method1048(int arg0, boolean arg1, class8 arg2) {
        if (arg1) {
            method1042(false, (class42) null, (class42) null, 71, -86);
        }
        field2433++;
        if (!client.method1798(arg2).method1756(arg0, -69) && arg2.field233 == null) {
            return -1;
        } else if (arg2.field192 == null || arg2.field192.length <= arg0) {
            return -1;
        } else {
            return arg2.field192[arg0];
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(I)V", line = 267)
    public class133(int arg0) {
        this.field2429 = arg0;
        this.field2423 = new short[this.field2429];
        this.field2439 = new int[this.field2429];
        this.field2438 = new class279[this.field2429];
        this.field2430 = new byte[this.field2429];
        this.field2436 = new short[this.field2429];
    }
}
