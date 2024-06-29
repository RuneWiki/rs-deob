import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class147 implements Runnable {

    @OriginalMember(owner = "client!la", name = "m", descriptor = "[Lfl;")
    public volatile class239[] field2049 = new class239[2];

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Z")
    public volatile boolean field2040 = false;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Z")
    public volatile boolean field2041 = false;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Z")
    public static boolean field2042 = false;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "[[[I")
    public static int[][][] field2045 = new int[2][][];

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Ltk;")
    public class265 field2038;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 10)
    public static final void method989(int arg0) {
        field2048++;
        class259.field3929.method1237((byte) 106);
        if (arg0 <= 115) {
            method993((byte) 88);
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V", line = 21)
    public static void method990(int arg0) {
        if (arg0 != 3) {
            field2045 = (int[][][]) ((int[][][]) null);
        }
        field2045 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V", line = 34)
    public static final void method991(int arg0) {
        field2037++;
        class307.field4742.method572(-115);
        int var1 = class307.field4742.method566(8, 0);
        if (var1 < class127.field1735) {
            for (int var2 = var1; var2 < class127.field1735; var2++) {
                class330.field5038[class128.field1749++] = class269.field4238[var2];
            }
        }
        if (class127.field1735 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class127.field1735 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class269.field4238[var3];
            class184 var5 = class223.field3159[var4];
            int var6 = class307.field4742.method566(1, 0);
            if (var6 == 0) {
                class269.field4238[class127.field1735++] = var4;
                var5.field2422 = class38.field463;
            } else {
                int var7 = class307.field4742.method566(2, 0);
                if (var7 == 0) {
                    class269.field4238[class127.field1735++] = var4;
                    var5.field2422 = class38.field463;
                    class129.field1772[class21.field278++] = var4;
                } else if (var7 == 1) {
                    class269.field4238[class127.field1735++] = var4;
                    var5.field2422 = class38.field463;
                    int var12 = class307.field4742.method566(3, arg0 + 4);
                    var5.method1111((byte) 44, var12, 1);
                    int var13 = class307.field4742.method566(1, 0);
                    if (var13 == 1) {
                        class129.field1772[class21.field278++] = var4;
                    }
                } else if (var7 == 2) {
                    class269.field4238[class127.field1735++] = var4;
                    var5.field2422 = class38.field463;
                    if (class307.field4742.method566(1, 0) == 1) {
                        int var8 = class307.field4742.method566(3, 0);
                        var5.method1111((byte) 44, var8, 2);
                        int var9 = class307.field4742.method566(3, 0);
                        var5.method1111((byte) 44, var9, 2);
                    } else {
                        int var10 = class307.field4742.method566(3, arg0 ^ 0xFFFFFFFC);
                        var5.method1111((byte) 44, var10, 0);
                    }
                    int var11 = class307.field4742.method566(1, 0);
                    if (var11 == 1) {
                        class129.field1772[class21.field278++] = var4;
                    }
                } else if (var7 == 3) {
                    class330.field5038[class128.field1749++] = var4;
                }
            }
        }
        if (arg0 != -4) {
            method994((class175) null, (byte) 116, (class175) null);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIZLra;I)Lbi;", line = 148)
    public static final class91 method992(int arg0, int arg1, int arg2, int arg3, boolean arg4, class336 arg5, int arg6) {
        field2044++;
        int var8 = (arg0 << 19) + (arg4 ? 65536 : 0) + arg3 + (arg1 << 17);
        if (arg2 != 7975) {
            field2045 = (int[][][]) ((int[][][]) null);
        }
        long var9 = (long) arg6 * 3147483667L + (long) var8 * 3849834839L;
        class91 var11 = (class91) class230.field3359.method1239((byte) -113, var9);
        if (var11 != null) {
            return var11;
        }
        class215.field3025 = false;
        class91 var12 = class5.method20(arg2 ^ 0xFFFFE0D9, false, arg0, false, arg4, arg3, arg5, arg6, arg1);
        if (var12 != null && !class215.field3025) {
            class230.field3359.method1243(var12, var9, -29282);
        }
        return var12;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)I", line = 176)
    public static final int method993(byte arg0) {
        if (arg0 != 37) {
            field2042 = true;
        }
        field2050++;
        return class163.field2247 && class184.field2650[81] && class310.field4794 > 2 ? class76.field968[class310.field4794 - 2] : class76.field968[class310.field4794 - 1];
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Llc;BLlc;)V", line = 191)
    public static final void method994(class175 arg0, byte arg1, class175 arg2) {
        field2047++;
        class154.field2111 = arg2;
        class225.field3193 = arg0;
        class97.field1259 = class154.field2111.method1197(-107, 3);
        int var3 = -106 % ((arg1 - 23) / 52);
    }

    @OriginalMember(owner = "client!la", name = "run", descriptor = "()V", line = 209)
    public final void run() {
        this.field2041 = true;
        try {
            while (!this.field2040) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class239 var2 = this.field2049[var1];
                    if (var2 != null) {
                        var2.method1721(79);
                    }
                }
                class81.method485(10L, 1);
                class84.method496((Object) null, 6946, this.field2038);
            }
        } catch (Exception var7) {
            class42.method245((String) null, 1, var7);
        } finally {
            this.field2041 = false;
        }
        field2046++;
    }
}
