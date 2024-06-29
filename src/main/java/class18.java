import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class18 extends class166 {

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "I")
    public static volatile int field269 = 0;

    @OriginalMember(owner = "client!sl", name = "u", descriptor = "I")
    public static int field272 = 127;

    @OriginalMember(owner = "client!sl", name = "w", descriptor = "Ldk;")
    public static class283 field274 = new class283();

    @OriginalMember(owner = "client!sl", name = "z", descriptor = "I")
    public static int field277 = 1;

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!sl", name = "x", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!sl", name = "v", descriptor = "J")
    public long field273;

    @OriginalMember(owner = "client!sl", name = "y", descriptor = "Lsl;")
    public class18 field276;

    @OriginalMember(owner = "client!sl", name = "A", descriptor = "Lsl;")
    public class18 field278;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)Lbh;")
    public static final class7 method170(int arg0, int arg1, int arg2) {
        class6 var3 = class269.field4298[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class7 var4 = var3.field147;
            var3.field147 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)V")
    public static void method171(int arg0) {
        field274 = null;
        if (arg0 != 29225) {
            method172(43);
        }
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(I)V")
    public static final void method172(int arg0) {
        field268++;
        int var1 = 70 / ((-arg0 - 50) / 46);
        for (class111 var2 = (class111) class187.field2892.method1221(119); var2 != null; var2 = (class111) class187.field2892.method1227(-10626)) {
            if (var2.field1825 == -1) {
                var2.field1815 = 0;
                class274.method1846(var2, 127);
            } else {
                var2.method1123(0);
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IBLjava/lang/String;Z)I")
    public static final int method173(int arg0, byte arg1, String arg2, boolean arg3) {
        field270++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg2.length();
        int var8 = 0;
        int var9 = -42 / ((-arg1 - 71) / 41);
        while (var8 < var7) {
            label82: {
                char var10 = arg2.charAt(var8);
                if (var8 == 0) {
                    if (var10 == '-') {
                        var5 = true;
                        break label82;
                    }
                    if (var10 == '+' && arg3) {
                        break label82;
                    }
                }
                int var12;
                if (var10 >= '0' && var10 <= '9') {
                    var12 = var10 - '0';
                } else if (var10 >= 'A' && var10 <= 'Z') {
                    var12 = var10 - '7';
                } else if (var10 >= 'a' && var10 <= 'z') {
                    var12 = var10 - 'W';
                } else {
                    throw new NumberFormatException();
                }
                if (var12 >= arg0) {
                    throw new NumberFormatException();
                }
                if (var5) {
                    var12 = -var12;
                }
                int var11 = arg0 * var6 + var12;
                if ((var11 / arg0) != var6) {
                    throw new NumberFormatException();
                }
                var6 = var11;
                var4 = true;
            }
            var8++;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "(I)V")
    public final void method174(int arg0) {
        field275++;
        if (this.field278 == null) {
            return;
        }
        this.field278.field276 = this.field276;
        this.field276.field278 = this.field278;
        if (arg0 != 31388) {
            this.method174(74);
        }
        this.field278 = null;
        this.field276 = null;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(II)V")
    public static final void method175(int arg0, int arg1) {
        class42.field607.method1897(true, arg1);
        if (arg0 != 43) {
            method175(-119, -98);
        }
        field271++;
    }
}
