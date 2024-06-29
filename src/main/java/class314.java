import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class314 {

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "I")
    private int field4717;

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "J")
    private long field4718;

    @OriginalMember(owner = "client!uq", name = "k", descriptor = "I")
    public static int field4724 = 0;

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "F")
    public static float field4719;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(BI)Lkb;", line = 5)
    public final class176 method1938(byte arg0, int arg1) {
        int var3 = 78 % ((arg0 - 29) / 53);
        field4716++;
        return class176.method1183(false)[this.method1939((byte) -93, arg1)];
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(BI)I", line = 15)
    private final int method1939(byte arg0, int arg1) {
        if (arg0 > -71) {
            return -28;
        } else {
            field4715++;
            return (int) (this.field4718 >> class176.field2682 * arg1) & 0xF;
        }
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lkb;)V", line = 28)
    public class314(class176 arg0) {
        this.field4717 = 1;
        this.field4718 = arg0.field2670;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIBII)V", line = 38)
    public static final void method1940(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field4721++;
        int var6 = arg5 - arg4;
        int var7 = arg2 - arg0;
        if (var7 == 0) {
            if (var6 != 0) {
                class548.method3210(arg5, true, arg4, arg1, arg0);
            }
        } else if (var6 == 0) {
            class562.method3286((byte) 64, arg1, arg2, arg0, arg4);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg0;
                int var10 = arg2;
                arg0 = arg4;
                arg2 = arg5;
                arg4 = var9;
                arg5 = var10;
            }
            if (arg2 < arg0) {
                int var11 = arg0;
                arg0 = arg2;
                int var12 = arg4;
                arg2 = var11;
                arg4 = arg5;
                arg5 = var12;
            }
            int var13 = arg4;
            int var14 = arg2 - arg0;
            int var15 = arg5 - arg4;
            int var16 = -(var14 >> 1);
            int var17 = arg4 >= arg5 ? -1 : 1;
            if (var15 < 0) {
                var15 = -var15;
            }
            if (arg3 < 93) {
                field4724 = -67;
            }
            if (var8) {
                for (int var19 = arg0; var19 <= arg2; var19++) {
                    class47.field558[var19][var13] = arg1;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var18 = arg0; var18 <= arg2; var18++) {
                    class47.field558[var13][var18] = arg1;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIB)B", line = 154)
    public static final byte method1941(int arg0, int arg1, byte arg2) {
        field4714++;
        if (arg1 != 9) {
            return 0;
        } else if (arg2 >= -90) {
            return 22;
        } else {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)Ljava/lang/String;", line = 172)
    public static final String method1942(int arg0) {
        if (arg0 != -3615) {
            method1942(98);
        }
        field4723++;
        return class139.field1826 || class281.field4172 == null ? "" : class281.field4172.field8165;
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)I", line = 189)
    public final int method1943(int arg0) {
        if (arg0 != 0) {
            method1940(-24, 120, -39, (byte) -47, -53, 126);
        }
        field4722++;
        return this.field4717;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZLkb;)V", line = 202)
    private final void method1944(boolean arg0, class176 arg1) {
        if (!arg0) {
            this.field4718 = -51L;
        }
        this.field4718 |= (arg1.field2670 << class176.field2682 * this.field4717++);
        field4720++;
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "([Lkb;)V", line = 212)
    public class314(class176[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method1944(true, arg0[var2]);
        }
    }
}
