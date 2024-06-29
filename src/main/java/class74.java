import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class74 extends class86 {

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "[I")
    public int[] field1288 = new int[] { 0 };

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "[I")
    public int[] field1290 = new int[] { -1 };

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "Lbe;")
    private static class283 field1286 = class153.method941(-71, "Drop");

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
    public static int field1294 = -1;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "[I")
    public static int[] field1299 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "S")
    public static short field1298 = 1;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "Lbe;")
    public static class283 field1289 = field1286;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "[S")
    public static short[] field1300 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "Lek;")
    public static class172 field1291;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "Llb;")
    public static class199 field1296;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "[[[S")
    public static short[][][] field1297;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V", line = 36)
    public static void method491(int arg0) {
        field1291 = null;
        field1296 = null;
        field1299 = null;
        if (arg0 == -22860) {
            field1300 = null;
            field1289 = null;
            field1286 = null;
            field1297 = (short[][][]) null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)V", line = 52)
    public static final void method492(int arg0) {
        field1292++;
        if (arg0 != 4) {
            field1298 = -14;
        }
        class46.field632.method1636(arg0 + 105);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([Lbe;IBI)Lbe;", line = 64)
    public static final class283 method493(class283[] arg0, int arg1, byte arg2, int arg3) {
        int var4 = 0;
        field1287++;
        for (int var5 = 0; var5 < arg3; var5++) {
            if (arg0[arg1 + var5] == null) {
                arg0[arg1 + var5] = class215.field3649;
            }
            var4 += arg0[arg1 + var5].field4812;
        }
        if (arg2 != 93) {
            method491(-3);
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg3; var8++) {
            class283 var9 = arg0[arg1 + var8];
            class136.method843(var9.field4843, 0, var6, var7, var9.field4812);
            var7 += var9.field4812;
        }
        class283 var10 = new class283();
        var10.field4812 = var4;
        var10.field4843 = var6;
        return var10;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)Lgd;", line = 140)
    public static final class294 method494(int arg0, int arg1) {
        field1295++;
        class294 var2 = (class294) class69.field1002.method77((long) arg1, 12);
        int var3 = -98 % ((arg0 - 3) / 60);
        if (var2 != null) {
            return var2;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = class162.field2667.method1107(0, arg1, 124);
        } else {
            var4 = class46.field623.method1107(0, arg1 & 0x7FFF, 123);
        }
        class294 var5 = new class294();
        if (var4 != null) {
            var5.method1994(-12453, new class229(var4));
        }
        if (arg1 >= 32768) {
            var5.method1988((byte) -91);
        }
        class69.field1002.method85(var5, (long) arg1, (byte) -97);
        return var5;
    }
}
