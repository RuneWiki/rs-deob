import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class class663 {

    @OriginalMember(owner = "client!lga", name = "p", descriptor = "Lje;")
    private class367 field9309;

    @OriginalMember(owner = "client!lga", name = "f", descriptor = "I")
    private int field9299;

    @OriginalMember(owner = "client!lga", name = "g", descriptor = "I")
    private int field9300;

    @OriginalMember(owner = "client!lga", name = "s", descriptor = "Lfaa;")
    private class139 field9312;

    @OriginalMember(owner = "client!lga", name = "k", descriptor = "I")
    public static int field9304;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "I")
    public static int field9294;

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "I")
    public static int field9295;

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "I")
    public static int field9296;

    @OriginalMember(owner = "client!lga", name = "d", descriptor = "I")
    public static int field9297;

    @OriginalMember(owner = "client!lga", name = "e", descriptor = "I")
    public static int field9298;

    @OriginalMember(owner = "client!lga", name = "h", descriptor = "I")
    public static int field9301;

    @OriginalMember(owner = "client!lga", name = "i", descriptor = "I")
    public static int field9302;

    @OriginalMember(owner = "client!lga", name = "j", descriptor = "I")
    public static int field9303;

    @OriginalMember(owner = "client!lga", name = "l", descriptor = "I")
    public static int field9305;

    @OriginalMember(owner = "client!lga", name = "m", descriptor = "I")
    public static int field9306;

    @OriginalMember(owner = "client!lga", name = "n", descriptor = "I")
    public static int field9307;

    @OriginalMember(owner = "client!lga", name = "o", descriptor = "I")
    public static int field9308;

    @OriginalMember(owner = "client!lga", name = "q", descriptor = "I")
    public static int field9310;

    @OriginalMember(owner = "client!lga", name = "r", descriptor = "I")
    public static int field9311;

    @OriginalMember(owner = "client!lga", name = "t", descriptor = "I")
    public static int field9313;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method3741(byte arg0) {
        field9307++;
        if (arg0 != -30) {
            this.field9312 = null;
        }
        class95 var2 = (class95) this.field9312.method975(-1);
        while (var2 != null) {
            Object var3 = var2.method692(-120);
            if (var3 != null) {
                return var3;
            }
            class95 var4 = var2;
            var2 = (class95) this.field9312.method975(-1);
            var4.method2340(arg0 + 130);
            var4.method3301(83);
            this.field9300 += var4.field1332;
        }
        return null;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(Lrv;B)V")
    private final void method3742(class95 arg0, byte arg1) {
        field9313++;
        if (arg1 != 124) {
            this.method3745((byte) 24);
        }
        if (arg0 != null) {
            arg0.method2340(-60);
            arg0.method3301(107);
            this.field9300 += arg0.field1332;
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(BJ)V")
    private final void method3743(byte arg0, long arg1) {
        field9310++;
        class95 var4 = (class95) this.field9312.method970((byte) 89, arg1);
        this.method3742(var4, (byte) 124);
        if (arg0 != 94) {
            this.method3742(null, (byte) 86);
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(JILjava/lang/Object;I)V")
    public final void method3744(long arg0, int arg1, Object arg2, int arg3) {
        field9303++;
        if (arg1 > this.field9299) {
            throw new IllegalStateException("s>cs");
        }
        this.method3743((byte) 94, arg0);
        this.field9300 -= arg1;
        while (this.field9300 < 0) {
            class95 var7 = (class95) this.field9309.method2116(arg3 + 4);
            this.method3742(var7, (byte) 124);
        }
        class552 var6 = new class552(arg2, arg1);
        this.field9312.method968(arg0, var6, -1);
        this.field9309.method2123(var6, -1);
        var6.field8154 = arg3;
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(B)I")
    public final int method3745(byte arg0) {
        field9294++;
        if (arg0 < 110) {
            this.method3743((byte) -75, -88L);
        }
        return this.field9300;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(I)I")
    public final int method3746(int arg0) {
        field9295++;
        int var2 = 0;
        for (class95 var3 = (class95) this.field9309.method2126(-1); var3 != null; var3 = (class95) this.field9309.method2117(100)) {
            if (!var3.method696((byte) 123)) {
                var2++;
            }
        }
        if (arg0 < 4) {
            this.method3742(null, (byte) 62);
        }
        return var2;
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(BJ)Ljava/lang/Object;")
    public final Object method3747(byte arg0, long arg1) {
        field9296++;
        class95 var4 = (class95) this.field9312.method970((byte) 89, arg1);
        if (var4 == null) {
            return null;
        }
        if (arg0 != -66) {
            this.method3741((byte) -85);
        }
        Object var5 = var4.method692(-59);
        if (var5 == null) {
            var4.method2340(103);
            var4.method3301(arg0 ^ 0xFFFFFFE5);
            this.field9300 += var4.field1332;
            return null;
        }
        if (var4.method696((byte) 119)) {
            class552 var6 = new class552(var5, var4.field1332);
            this.field9312.method968(var4.field5623, var6, arg0 ^ 0x41);
            this.field9309.method2123(var6, -1);
            var6.field8154 = 0L;
            var4.method2340(84);
            var4.method3301(119);
        } else {
            this.field9309.method2123(var4, -1);
            var4.field8154 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(JLjava/lang/Object;I)V")
    public final void method3748(long arg0, Object arg1, int arg2) {
        if (arg2 != 12537) {
            this.method3747((byte) 46, 95L);
        }
        this.method3744(arg0, 1, arg1, 0);
        field9306++;
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)V")
    public final void method3749(int arg0) {
        field9302++;
        if (arg0 != 7648) {
            this.field9300 = 34;
        }
        this.field9309.method2119(0);
        this.field9312.method974(-20470);
        this.field9300 = this.field9299;
    }

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "(B)I")
    public final int method3750(byte arg0) {
        field9301++;
        if (arg0 < 120) {
            this.method3753((byte) -107);
        }
        return this.field9299;
    }

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(I)V")
    public class663(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(CI)Z")
    public static final boolean method3751(char arg0, int arg1) {
        field9297++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else if (arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ') {
            return true;
        } else {
            if (arg1 != 1) {
                field9304 = 12;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(BLac;)Lpe;")
    public static final class566 method3752(byte arg0, class501 arg1) {
        field9298++;
        class497 var2 = class248.method1532(arg1, -23);
        int var3 = arg1.method2845(-1);
        int var4 = arg1.method2845(-1);
        int var5 = arg1.method2845(-1);
        int var6 = arg1.method2845(-1);
        if (arg0 >= -6) {
            field9304 = 116;
        }
        int var7 = arg1.method2845(-1);
        int var8 = arg1.method2845(-1);
        return new class566(var2.field6762, var2.field6763, var2.field6765, var2.field6754, var2.field6764, var2.field6757, var2.field6760, var2.field6759, var2.field6758, var3, var4, var5, var6, var7, var8);
    }

    @OriginalMember(owner = "client!lga", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public final Object method3753(byte arg0) {
        field9308++;
        class95 var2 = (class95) this.field9312.method977(arg0 ^ 0x6C);
        while (var2 != null) {
            Object var3 = var2.method692(-99);
            if (var3 != null) {
                return var3;
            }
            class95 var4 = var2;
            var2 = (class95) this.field9312.method975(-1);
            var4.method2340(-117);
            var4.method3301(61);
            this.field9300 += var4.field1332;
        }
        if (arg0 != 108) {
            this.field9309 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(IZ)V")
    public final void method3754(int arg0, boolean arg1) {
        field9305++;
        if (class586.field8252 != null) {
            for (class95 var3 = (class95) this.field9309.method2126(-1); var3 != null; var3 = (class95) this.field9309.method2117(100)) {
                if (var3.method696((byte) 75)) {
                    if (var3.method692(68) == null) {
                        var3.method2340(-82);
                        var3.method3301(90);
                        this.field9300++;
                    }
                } else if (((long) arg0) < (++var3.field8154)) {
                    class95 var4 = class586.field8252.method1915(-59, var3);
                    this.field9312.method968(var3.field5623, var4, -1);
                    class17.method84(var3, var4, 26180);
                    var3.method2340(107);
                    var3.method3301(50);
                }
            }
        }
        if (!arg1) {
            this.method3754(29, true);
        }
    }

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "(I)V")
    public final void method3755(int arg0) {
        field9311++;
        if (arg0 != 19713) {
            return;
        }
        for (class95 var2 = (class95) this.field9309.method2126(-1); var2 != null; var2 = (class95) this.field9309.method2117(100)) {
            if (var2.method696((byte) 122)) {
                var2.method2340(-112);
                var2.method3301(arg0 ^ 0x4D7B);
                this.field9300 += var2.field1332;
            }
        }
    }

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(II)V")
    public class663(int arg0, int arg1) {
        this.field9309 = new class367();
        this.field9299 = arg0;
        this.field9300 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && arg1 > var3; var3 += var3) {
        }
        this.field9312 = new class139(var3);
    }

    static {
        new class290("", 73);
        field9304 = 1;
    }
}
