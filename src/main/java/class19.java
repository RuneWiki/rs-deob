import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class19 {

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "Leea;")
    private class131 field288;

    @OriginalMember(owner = "client!bu", name = "h", descriptor = "J")
    public long field293;

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "Lhb;")
    public static class725 field291 = new class725();

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ZZB)V", line = 4)
    public static final void method116(boolean arg0, boolean arg1, byte arg2) {
        field287++;
        if (arg2 != 66) {
            field291 = null;
        }
        if (arg0) {
            class731.field10209--;
            if (class731.field10209 == 0) {
                class295.field4163 = null;
            }
        }
        if (!arg1) {
            return;
        }
        class477.field6769--;
        if (class477.field6769 == 0) {
            class2.field23 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(BLjava/lang/String;IZ)Z", line = 34)
    public static final boolean method117(byte arg0, String arg1, int arg2, boolean arg3) {
        field286++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        if (arg0 < 61) {
            method117((byte) -126, null, -45, true);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg1.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg2 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if (var10 / arg2 != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!bu", name = "finalize", descriptor = "()V", line = 111)
    protected final void finalize() throws Throwable {
        this.field288.method930(this.field293, -1);
        field289++;
        super.finalize();
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(BII)Z", line = 123)
    public static final boolean method118(byte arg0, int arg1, int arg2) {
        if (arg0 == 9) {
            field292++;
            return (arg2 & 0x100) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIIII)Z", line = 134)
    public static final boolean method119(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field290++;
        if (!class734.field10226 || !class377.field5290) {
            return false;
        } else if (class744.field10348 < 100) {
            return false;
        } else if (class662.method3629(arg4, 843095752, arg2, arg3)) {
            int var5 = arg3 << class660.field9038;
            int var6 = arg2 << class660.field9038;
            if (class263.method1723(arg0, class586.field8250, class586.field8250, var6, (byte) 108, class459.field6474[arg4].method1816((byte) -126, arg2, arg3), var5)) {
                class125.field1522++;
                return true;
            } else {
                return arg1 < 54;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Leea;JI)V", line = 168)
    public class19(class131 arg0, long arg1, int arg2) {
        this.field288 = arg0;
        this.field293 = arg1;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V", line = 183)
    public static void method120(int arg0) {
        if (arg0 != 36) {
            field291 = null;
        }
        field291 = null;
    }
}
