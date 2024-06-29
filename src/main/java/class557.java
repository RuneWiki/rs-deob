import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class557 {

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "Z")
    public boolean field6967;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field6965;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field6969;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field6970;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field6972;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "Lvl;")
    public class13 field6966;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "Lvl;")
    public class13 field6968;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "Lpfa;")
    public static class275 field6973;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "Z")
    public boolean field6971;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V", line = 4)
    public static void method2962(byte arg0) {
        field6973 = null;
        int var1 = 104 % ((arg0 - 3) / 37);
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)Z", line = 14)
    public final boolean method2963(byte arg0) {
        if (arg0 != 52) {
            this.field6967 = false;
        }
        field6972++;
        return this.field6971 && !this.field6967;
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)V", line = 31)
    public final void method2964(byte arg0) {
        field6965++;
        if (arg0 > -62) {
            method2966(1, true, false, 14, (byte) -38, null, null);
        }
        if (this.field6966 != null) {
            this.field6966.method60(5634);
        }
        this.field6971 = false;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)Z", line = 47)
    public static final boolean method2965(int arg0, int arg1, int arg2) {
        field6970++;
        if (arg1 == 0) {
            return (arg2 & 0x400) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Z)V", line = 59)
    public class557(boolean arg0) {
        this.field6967 = arg0;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZZIBLjava/lang/String;Ljava/lang/String;)V", line = 67)
    public static final void method2966(int arg0, boolean arg1, boolean arg2, int arg3, byte arg4, String arg5, String arg6) {
        field6969++;
        class336.field4147.field3500 = 1;
        String var7 = arg6.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (arg3 != -1) {
            class362 var11 = class46.field617.method1403(arg3, arg4 ^ 0x7B);
            if (var11 == null || var11.method2100((byte) 124) != arg2) {
                return;
            }
            if (var11.method2100((byte) 118)) {
                var10 = var11.field4639;
            } else {
                var9 = var11.field4635;
            }
        }
        int var12 = 0;
        for (int var13 = 0; var13 < class504.field6287.field3445; var13++) {
            class68 var16 = class504.field6287.method1628(var13, (byte) -80);
            if ((!arg1 || var16.field862) && var16.field861 == -1 && var16.field890 == -1 && var16.field895 == 0 && var16.field879.toLowerCase().indexOf(var7) != -1) {
                if (arg3 != -1) {
                    if (arg2) {
                        if (!arg5.equals(var16.method546(var10, 122, arg3))) {
                            continue;
                        }
                    } else if (var16.method534(var9, 12645, arg3) != arg0) {
                        continue;
                    }
                }
                if (var12 >= 250) {
                    class666.field9042 = null;
                    class111.field1382 = -1;
                    return;
                }
                if (var8.length <= var12) {
                    short[] var17 = new short[var8.length * 2];
                    for (int var18 = 0; var18 < var12; var18++) {
                        var17[var18] = var8[var18];
                    }
                    var8 = var17;
                }
                var8[var12++] = (short) var13;
            }
        }
        class111.field1382 = var12;
        if (arg4 != 59) {
            return;
        }
        class666.field9042 = var8;
        class253.field3268 = 0;
        String[] var14 = new String[class111.field1382];
        for (int var15 = 0; var15 < class111.field1382; var15++) {
            var14[var15] = class504.field6287.method1628(var8[var15], (byte) -115).field879;
        }
        class60.method504(var14, 2688, class666.field9042);
        class336.field4147.method1664(false);
        class336.field4147.field3500 = 2;
    }
}
