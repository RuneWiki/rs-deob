import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class87 {

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "Z")
    public boolean field1024 = true;

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "I")
    public static int field1029 = 0;

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "C")
    private char field1027;

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!hu", name = "h", descriptor = "I")
    public int field1031;

    @OriginalMember(owner = "client!hu", name = "l", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!hu", name = "m", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!hu", name = "n", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!hu", name = "k", descriptor = "Lfq;")
    public static class137 field1034;

    @OriginalMember(owner = "client!hu", name = "i", descriptor = "Ltb;")
    public static class275 field1032;

    @OriginalMember(owner = "client!hu", name = "j", descriptor = "Ljava/lang/String;")
    public String field1033;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)V", line = 6)
    public static void method475(byte arg0) {
        field1034 = null;
        field1032 = null;
        if (arg0 != -6) {
            field1032 = null;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lug;B)V", line = 20)
    public final void method476(class396 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2388((byte) -111);
            if (var3 == 0) {
                field1025++;
                if (arg1 != 68) {
                    this.method481(-120);
                    return;
                }
                return;
            }
            this.method480(arg0, -4955, var3);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIIII)V", line = 41)
    public static final void method477(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1028++;
        int var6 = arg0 - arg1;
        int var7 = arg5 - arg2;
        if (var6 == 0) {
            if (var7 != 0) {
                class116.method701(arg1, 116, arg4, arg2, arg5);
            }
        } else if (var7 == 0) {
            class428.method2633(arg4, arg0, (byte) -3, arg2, arg1);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = -92 / ((arg3 + 24) / 53);
            int var10 = arg2 - (arg1 * var8 >> 12);
            int var11;
            int var12;
            if (class307.field4111 > arg1) {
                var11 = (class307.field4111 * var8 >> 12) + var10;
                var12 = class307.field4111;
            } else if (class91.field1086 >= arg1) {
                var11 = arg2;
                var12 = arg1;
            } else {
                var11 = (class91.field1086 * var8 >> 12) + var10;
                var12 = class91.field1086;
            }
            int var13;
            int var14;
            if (class307.field4111 > arg0) {
                var14 = (class307.field4111 * var8 >> 12) + var10;
                var13 = class307.field4111;
            } else if (class91.field1086 >= arg0) {
                var13 = arg0;
                var14 = arg5;
            } else {
                var13 = class91.field1086;
                var14 = (class91.field1086 * var8 >> 12) + var10;
            }
            if (class169.field2184 > var14) {
                var13 = (class169.field2184 - var10 << 12) / var8;
                var14 = class169.field2184;
            } else if (class386.field5620 < var14) {
                var14 = class386.field5620;
                var13 = (class386.field5620 - var10 << 12) / var8;
            }
            if (var11 < class169.field2184) {
                var11 = class169.field2184;
                var12 = (class169.field2184 - var10 << 12) / var8;
            } else if (var11 > class386.field5620) {
                var12 = (class386.field5620 - var10 << 12) / var8;
                var11 = class386.field5620;
            }
            class442.method2720(var14, var13, var12, arg4, var11, 1);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IBI)V", line = 151)
    public static final void method478(int arg0, byte arg1, int arg2) {
        if (arg1 != 39) {
            method477(-127, -15, 83, 92, -58, 0);
        }
        field1037++;
        class184 var3 = class277.method1682(arg0, 7, -56);
        var3.method1069(true);
        var3.field2393 = arg2;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I[BII)[B", line = 176)
    public static final byte[] method479(int arg0, byte[] arg1, int arg2, int arg3) {
        field1035++;
        byte[] var4 = new byte[arg2];
        int var5 = -24 / ((arg0 + 53) / 58);
        class438.method2687(arg1, arg3, var4, 0, arg2);
        return var4;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lug;II)V", line = 190)
    private final void method480(class396 arg0, int arg1, int arg2) {
        field1026++;
        if (arg2 == 1) {
            this.field1027 = class42.method246(0, arg0.method2418(-110));
        } else if (arg2 == 2) {
            this.field1031 = arg0.method2406((byte) -92);
        } else if (arg2 == 4) {
            this.field1024 = false;
        } else if (arg2 == 5) {
            this.field1033 = arg0.method2432((byte) 125);
        }
        if (arg1 != -4955) {
            this.field1033 = null;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)Z", line = 218)
    public final boolean method481(int arg0) {
        field1036++;
        if (arg0 != 115) {
            field1029 = 21;
        }
        return this.field1027 == 's';
    }
}
