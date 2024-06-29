import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class5 extends class25 {

    @OriginalMember(owner = "client!ti", name = "T", descriptor = "I")
    public int field50 = 12800;

    @OriginalMember(owner = "client!ti", name = "U", descriptor = "I")
    public int field51 = 0;

    @OriginalMember(owner = "client!ti", name = "W", descriptor = "Z")
    public boolean field53 = true;

    @OriginalMember(owner = "client!ti", name = "O", descriptor = "I")
    public int field45 = -1;

    @OriginalMember(owner = "client!ti", name = "R", descriptor = "I")
    public int field48 = 12800;

    @OriginalMember(owner = "client!ti", name = "bb", descriptor = "I")
    public int field58 = 0;

    @OriginalMember(owner = "client!ti", name = "J", descriptor = "Ldf;")
    public class51 field41;

    @OriginalMember(owner = "client!ti", name = "M", descriptor = "Ldf;")
    public class51 field44;

    @OriginalMember(owner = "client!ti", name = "V", descriptor = "I")
    public int field52;

    @OriginalMember(owner = "client!ti", name = "db", descriptor = "I")
    public int field60;

    @OriginalMember(owner = "client!ti", name = "Y", descriptor = "Lvh;")
    public class252 field55;

    @OriginalMember(owner = "client!ti", name = "I", descriptor = "I")
    public static int field40 = 0;

    @OriginalMember(owner = "client!ti", name = "ab", descriptor = "I")
    public static int field57 = 0;

    @OriginalMember(owner = "client!ti", name = "cb", descriptor = "Ldf;")
    private static class51 field59 = class46.method233("Please wait )2 attempting to reestablish)3", 100);

    @OriginalMember(owner = "client!ti", name = "S", descriptor = "Ldf;")
    public static class51 field49 = field59;

    @OriginalMember(owner = "client!ti", name = "F", descriptor = "J")
    public static long field37 = 0L;

    @OriginalMember(owner = "client!ti", name = "E", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ti", name = "G", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!ti", name = "H", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ti", name = "K", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ti", name = "L", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ti", name = "P", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!ti", name = "Q", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!ti", name = "X", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!ti", name = "Z", descriptor = "[[[I")
    public static int[][][] field56;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BIIII)V")
    public static final void method18(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 111) {
            return;
        }
        field43++;
        for (class93 var5 = (class93) class209.field3485.method1720(true); var5 != null; var5 = (class93) class209.field3485.method1712((byte) 112)) {
            class246.method1674(40, arg3, arg4, arg2, arg1, var5);
        }
        for (class93 var6 = (class93) class179.field2958.method1720(true); var6 != null; var6 = (class93) class179.field2958.method1712((byte) 112)) {
            byte var10 = 1;
            if (var6.field1542.field4314 == var6.field1542.field4304) {
                var10 = 0;
            } else if (var6.field1542.field4354 == var6.field1542.field4314) {
                var10 = 2;
            }
            if (var6.field1533 != var10) {
                int var11 = class180.method1283(var6.field1542, (byte) -79);
                if (var6.field1534 != var11) {
                    if (var6.field1552 != null) {
                        class166.field2709.method488(var6.field1552);
                        var6.field1552 = null;
                    }
                    var6.field1534 = var11;
                }
                var6.field1533 = var10;
            }
            var6.field1536 = var6.field1542.field4319;
            var6.field1558 = var6.field1542.field4348;
            var6.field1555 = var6.field1542.field4319 + (var6.field1542.field4345 * 64);
            var6.field1553 = var6.field1542.field4345 * 64 + var6.field1542.field4348;
            class246.method1674(40, arg3, arg4, arg2, arg1, var6);
        }
        for (class93 var7 = (class93) class36.field556.method1451(-94); var7 != null; var7 = (class93) class36.field556.method1449(-1)) {
            byte var8 = 1;
            if (var7.field1541.field4314 == var7.field1541.field4304) {
                var8 = 0;
            } else if (var7.field1541.field4354 == var7.field1541.field4314) {
                var8 = 2;
            }
            if (var7.field1533 != var8) {
                int var9 = class76.method546(var7.field1541, -64);
                if (var7.field1534 != var9) {
                    if (var7.field1552 != null) {
                        class166.field2709.method488(var7.field1552);
                        var7.field1552 = null;
                    }
                    var7.field1534 = var9;
                }
                var7.field1533 = var8;
            }
            var7.field1558 = var7.field1541.field4348;
            var7.field1536 = var7.field1541.field4319;
            var7.field1555 = var7.field1541.field4345 * 64 + var7.field1541.field4319;
            var7.field1553 = var7.field1541.field4345 * 64 + var7.field1541.field4348;
            class246.method1674(40, arg3, arg4, arg2, arg1, var7);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)Z")
    public final boolean method19(int arg0, int arg1, int arg2) {
        field47++;
        if (arg0 < this.field50 || arg0 > this.field58 || this.field48 > arg2 || this.field51 < arg2) {
            return false;
        }
        for (class144 var4 = (class144) this.field55.method1720(true); var4 != null; var4 = (class144) this.field55.method1712((byte) 112)) {
            if (var4.method1035((byte) -125, arg0, arg2)) {
                return true;
            }
        }
        if (arg1 != 0) {
            method21(-120, -41, (byte) -9, -42, 66, -57);
        }
        return false;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V")
    public static void method20(boolean arg0) {
        field49 = null;
        field56 = null;
        if (arg0) {
            field39 = 113;
        }
        field59 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIBIII)V")
    public static final void method21(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field46++;
        for (int var6 = arg0; var6 <= arg0 + arg3; var6++) {
            for (int var11 = arg1; var11 <= (arg1 + arg4); var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class64.field1039[arg5][var11][var6] = 127;
                }
            }
        }
        for (int var7 = arg0; var7 < arg0 + arg3; var7++) {
            for (int var10 = arg1; var10 < (arg1 + arg4); var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class172.field2820[arg5][var10][var7] = arg5 > 0 ? class172.field2820[arg5 - 1][var10][var7] : 0;
                }
            }
        }
        if (arg1 > 0 && arg1 < 104) {
            for (int var8 = arg0 + 1; var8 < arg0 + arg3; var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class172.field2820[arg5][arg1][var8] = class172.field2820[arg5][arg1 - 1][var8];
                }
            }
        }
        if (arg2 >= -78) {
            method21(112, 123, (byte) -44, -126, -100, -86);
        }
        if (arg0 > 0 && arg0 < 104) {
            for (int var9 = arg1 + 1; var9 < arg1 + arg4; var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class172.field2820[arg5][var9][arg0] = class172.field2820[arg5][var9][arg0 - 1];
                }
            }
        }
        if (arg1 < 0 || arg0 < 0 || arg1 >= 104 || arg0 >= 104) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 > 0 && class172.field2820[arg5][arg1 - 1][arg0] != 0) {
                class172.field2820[arg5][arg1][arg0] = class172.field2820[arg5][arg1 - 1][arg0];
                return;
            }
            if (arg0 > 0 && class172.field2820[arg5][arg1][arg0 - 1] != 0) {
                class172.field2820[arg5][arg1][arg0] = class172.field2820[arg5][arg1][arg0 - 1];
                return;
            }
            if (arg1 > 0 && arg0 > 0 && class172.field2820[arg5][arg1 - 1][arg0 - 1] != 0) {
                class172.field2820[arg5][arg1][arg0] = class172.field2820[arg5][arg1 - 1][arg0 - 1];
                return;
            }
            return;
        }
        if (arg1 > 0 && class172.field2820[arg5 - 1][arg1 - 1][arg0] != class172.field2820[arg5][arg1 - 1][arg0]) {
            class172.field2820[arg5][arg1][arg0] = class172.field2820[arg5][arg1 - 1][arg0];
            return;
        }
        if (arg0 > 0 && class172.field2820[arg5][arg1][arg0 - 1] != class172.field2820[arg5 - 1][arg1][arg0 - 1]) {
            class172.field2820[arg5][arg1][arg0] = class172.field2820[arg5][arg1][arg0 - 1];
            return;
        }
        if (arg1 > 0 && arg0 > 0 && class172.field2820[arg5][arg1 - 1][arg0 - 1] != class172.field2820[arg5 - 1][arg1 - 1][arg0 - 1]) {
            class172.field2820[arg5][arg1][arg0] = class172.field2820[arg5][arg1 - 1][arg0 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)V")
    public final void method22(byte arg0) {
        field42++;
        this.field51 = 0;
        this.field48 = 12800;
        this.field58 = 0;
        this.field50 = 12800;
        class144 var2 = (class144) this.field55.method1720(true);
        int var3 = -69 % ((77 - arg0) / 33);
        while (var2 != null) {
            if (var2.field2412 > this.field51) {
                this.field51 = var2.field2412;
            }
            if (this.field58 < var2.field2411) {
                this.field58 = var2.field2411;
            }
            if (var2.field2404 < this.field48) {
                this.field48 = var2.field2404;
            }
            if (this.field50 > var2.field2416) {
                this.field50 = var2.field2416;
            }
            var2 = (class144) this.field55.method1712((byte) 112);
        }
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(B)V")
    public static final void method23(byte arg0) {
        class213.field3708.method1350((byte) 126);
        field36++;
        class63.field1024.method1350((byte) 112);
        class233.field4069.method1350((byte) 117);
        if (arg0 != -14) {
            field57 = 74;
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Ldf;Ldf;IIIZ)V")
    public class5(class51 arg0, class51 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field41 = arg1;
        this.field44 = arg0;
        this.field52 = arg3;
        this.field45 = arg4;
        this.field53 = arg5;
        this.field60 = arg2;
        this.field55 = new class252();
    }
}
