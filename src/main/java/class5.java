import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class5 extends class147 {

    @OriginalMember(owner = "client!il", name = "G", descriptor = "I")
    public int field76 = -1;

    @OriginalMember(owner = "client!il", name = "N", descriptor = "I")
    public int field81 = -1;

    @OriginalMember(owner = "client!il", name = "J", descriptor = "Lkn;")
    public static class442 field78 = new class442();

    @OriginalMember(owner = "client!il", name = "Q", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "I")
    public int field70;

    @OriginalMember(owner = "client!il", name = "A", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!il", name = "C", descriptor = "I")
    public int field72;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!il", name = "E", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!il", name = "F", descriptor = "I")
    public int field75;

    @OriginalMember(owner = "client!il", name = "I", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!il", name = "L", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!il", name = "M", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!il", name = "O", descriptor = "I")
    public int field82;

    @OriginalMember(owner = "client!il", name = "P", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BLvq;)Lbf;")
    public final class316 method15(byte arg0, class269 arg1) {
        ++field83;
        class154 var3 = arg1.method884();
        var3.method1133(super.field2201, super.field2196, super.field2190);
        class316 var4 = class105.method616(-15465, 3);
        int var5 = -17 % ((-8 - arg0) / 51);
        if (this.field81 != -1) {
            class305 var6 = class167.method1202(true, this.field81).method2588(arg1, (class183) null, 1024, 0, 0, this.field72, (class301) null, (byte) 126, -1);
            if (var6 != null) {
                var6.method230(var3, var4.field4631[2], 0);
            }
        }
        if (this.field76 != -1) {
            class305 var7 = class167.method1202(true, this.field76).method2588(arg1, (class183) null, 1024, 0, 0, this.field75, (class301) null, (byte) -97, -1);
            if (var7 != null) {
                var7.method230(var3, var4.field4631[1], 0);
            }
        }
        class305 var8 = class167.method1202(true, this.field70).method2588(arg1, (class183) null, 1024, 0, 0, this.field82, (class301) null, (byte) 126, -1);
        if (var8 != null) {
            var8.method230(var3, var4.field4631[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lvq;IIB)Z")
    public final boolean method16(class269 arg0, int arg1, int arg2, byte arg3) {
        ++field79;
        class154 var5 = arg0.method884();
        var5.method1133(super.field2201, super.field2196, super.field2190);
        class305 var6 = class167.method1202(true, this.field70).method2588(arg0, (class183) null, 65536, 0, 0, this.field82, (class301) null, (byte) -11, -1);
        if (var6 != null && var6.method209(arg1, arg2, var5, true)) {
            return true;
        } else {
            if (this.field76 != -1) {
                class305 var7 = class167.method1202(true, this.field76).method2588(arg0, (class183) null, 65536, 0, 0, this.field75, (class301) null, (byte) -104, -1);
                if (var7 != null && var7.method209(arg1, arg2, var5, true)) {
                    return true;
                }
            }
            if (this.field81 != -1) {
                class305 var8 = class167.method1202(true, this.field81).method2588(arg0, (class183) null, 65536, 0, 0, this.field72, (class301) null, (byte) -44, -1);
                if (var8 != null && var8.method209(arg1, arg2, var5, true)) {
                    return true;
                }
            }
            int var9 = -78 / ((19 - arg3) / 45);
            return false;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "([IIIBI)V")
    public static final void method17(int[] arg0, int arg1, int arg2, byte arg3, int arg4) {
        --arg4;
        if (arg3 <= 62) {
            field78 = null;
        }
        ++field77;
        int var6 = arg1 - 1;
        int var5 = var6 - 7;
        while (~arg4 > ~var5) {
            int var7 = arg4 + 1;
            arg0[var7] = arg2;
            int var8 = var7 + 1;
            arg0[var8] = arg2;
            int var9 = var8 + 1;
            arg0[var9] = arg2;
            int var10 = var9 + 1;
            arg0[var10] = arg2;
            int var11 = var10 + 1;
            arg0[var11] = arg2;
            int var12 = var11 + 1;
            arg0[var12] = arg2;
            int var13 = var12 + 1;
            arg0[var13] = arg2;
            arg4 = var13 + 1;
            arg0[arg4] = arg2;
        }
        while (~arg4 > ~var6) {
            ++arg4;
            arg0[arg4] = arg2;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V")
    public static void method18(boolean arg0) {
        field78 = null;
        if (!arg0) {
            field84 = -74;
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
    public static final void method19(int arg0) {
        class15 var1 = class197.field2819;
        synchronized (class197.field2819) {
            class197.field2819.method98(0);
        }
        ++field73;
        if (arg0 != 1203489091) {
            method21(-65);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IB)V")
    public static final void method20(int arg0, byte arg1) {
        ++field71;
        if (~class393.field5533 != ~arg0) {
            class80.field1034 = class381.field5414 = class72.field943[arg0];
            class59.field786.method980(50, (int) ((double) class80.field1034 * 34.46D));
            class366.field5241 = new int[4][class80.field1034 >> 3][class381.field5414 >> 3];
            class377.field5364 = new int[class80.field1034][class381.field5414];
            class425.field6079 = new int[class80.field1034][class381.field5414];
            for (int var2 = 0; var2 < 4; ++var2) {
                class85.field1090[var2] = class178.method1271(13801, class381.field5414, class80.field1034);
            }
            class32.field398 = new byte[4][class80.field1034][class381.field5414];
            class302.method2035(4, 246, class381.field5414, class80.field1034);
            class287.method1960(class59.field786, class381.field5414 >> 3, class80.field1034 >> 3, (byte) 106);
            class393.field5533 = arg0;
            if (arg1 > -79) {
                method20(-14, (byte) 104);
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "(I)V")
    public static final void method21(int arg0) {
        ++field74;
        if (arg0 != 0) {
            method20(-29, (byte) -23);
        }
        class24.field305.method102((byte) -124);
        class381.field5408.method102((byte) -108);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lvq;B)V")
    public final void method22(class269 arg0, byte arg1) {
        ++field80;
        if (arg1 < 11) {
            this.field76 = -78;
        }
    }

    static {
        new class349("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        field84 = 0;
    }
}
