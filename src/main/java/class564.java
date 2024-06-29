import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public abstract class class564 extends class49 {

    @OriginalMember(owner = "client!aw", name = "x", descriptor = "Lwt;")
    public class520 field7974;

    @OriginalMember(owner = "client!aw", name = "z", descriptor = "I")
    public int field7976;

    @OriginalMember(owner = "client!aw", name = "A", descriptor = "Lqk;")
    public static class1 field7977 = new class1(85, 3);

    @OriginalMember(owner = "client!aw", name = "C", descriptor = "Ljn;")
    public static class134 field7979 = new class134(22, -1);

    @OriginalMember(owner = "client!aw", name = "w", descriptor = "I")
    public static int field7973;

    @OriginalMember(owner = "client!aw", name = "y", descriptor = "I")
    public static int field7975;

    @OriginalMember(owner = "client!aw", name = "B", descriptor = "Lae;")
    public static class283 field7978;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lns;I)V", line = 3)
    public static final void method3334(class654 arg0, int arg1) {
        field7975++;
        if (arg0.field9169 == null && arg0.field9177 == null) {
            return;
        }
        boolean var2 = true;
        int var3 = 0;
        if (arg1 != -1) {
            return;
        }
        while (var3 < arg0.field9169.length) {
            int var4 = -1;
            if (arg0.field9169 != null) {
                var4 = arg0.field9169[var3];
            }
            if (var4 != -1) {
                label61: {
                    var2 = false;
                    boolean var5 = false;
                    boolean var6 = false;
                    int var10;
                    int var11;
                    if ((var4 & 0xC0000000) == -1073741824) {
                        int var7 = var4 & 0xFFFFFFF;
                        int var8 = var7 >> 14;
                        int var9 = var7 & 0x3FFF;
                        var10 = arg0.field3470 - (var8 - class444.field6151) * 512 - 256;
                        var11 = arg0.field3460 - ((var9 - class236.field3535) * 512) - 256;
                    } else if ((var4 & 0x8000) == 0) {
                        class685 var12 = (class685) class450.field6288.method3669(false, (long) var4);
                        if (var12 == null) {
                            arg0.method3749(-1, -1, var3);
                            break label61;
                        }
                        class359 var13 = var12.field9573;
                        var11 = arg0.field3460 - var13.field3460;
                        var10 = arg0.field3470 - var13.field3470;
                    } else {
                        int var14 = var4 & 0x7FFF;
                        class723 var15 = class413.field5787[var14];
                        if (var15 == null) {
                            arg0.method3749(-1, -1, var3);
                            break label61;
                        }
                        var11 = arg0.field3460 - var15.field3460;
                        var10 = arg0.field3470 - var15.field3470;
                    }
                    if (var10 != 0 || var11 != 0) {
                        arg0.method3749(arg1, (int) (Math.atan2((double) var10, (double) var11) * 2607.5945876176133D) & 0x3FFF, var3);
                    }
                }
            } else if (!arg0.method3749(-1, -1, var3)) {
                var2 = false;
            }
            var3++;
        }
        if (var2) {
            arg0.field9177 = null;
            arg0.field9169 = null;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(ZIILjava/lang/String;)Z", line = 114)
    public static final boolean method3335(boolean arg0, int arg1, int arg2, String arg3) {
        field7973++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        if (arg2 != -16230) {
            return false;
        }
        int var6 = 0;
        int var7 = arg3.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
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
            if (var11 >= arg1) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if ((var10 / arg1) != var6) {
                return false;
            }
            var5 = true;
            var6 = var10;
        }
        return var5;
    }

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "(B)V", line = 190)
    public static void method3336(byte arg0) {
        field7977 = null;
        field7978 = null;
        if (arg0 <= -90) {
            field7979 = null;
        }
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lwt;I)V", line = 205)
    public class564(class520 arg0, int arg1) {
        this.field7974 = arg0;
        this.field7976 = arg1;
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method294(byte arg0);

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Z)Z")
    public abstract boolean method293(boolean arg0);
}
