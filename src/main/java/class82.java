import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class82 extends class119 {

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    public static int field1428 = 0;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "Lai;")
    public static class10 field1434 = class44.method278("T", 93);

    @OriginalMember(owner = "client!j", name = "s", descriptor = "Lai;")
    public static class10 field1430 = class44.method278(" zuerst von Ihrer Ignorieren)2Liste(Q", -90);

    @OriginalMember(owner = "client!j", name = "A", descriptor = "Lvb;")
    public static class192 field1438 = new class192();

    @OriginalMember(owner = "client!j", name = "p", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!j", name = "D", descriptor = "I")
    public int field1441;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "Lmb;")
    public class111 field1429;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "Lje;")
    public class87 field1439;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "[B")
    public byte[] field1440;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "[[[B")
    public static byte[][][] field1433;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
    public static void method504(byte arg0) {
        field1433 = null;
        field1434 = null;
        field1430 = null;
        field1438 = null;
        int var1 = 79 % ((-arg0 - 32) / 47);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
    public static final Class method505(String arg0, byte arg1) throws ClassNotFoundException {
        if (arg1 != 32) {
            return null;
        }
        field1427++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IBI)I")
    public static final int method506(int arg0, byte arg1, int arg2) {
        if (arg1 != -37) {
            method508(69, null, null, (byte) -108);
        }
        field1435++;
        class131 var3 = (class131) class101.field1882.method213(arg1 ^ 0xFFFFFFA3, (long) arg0);
        if (var3 == null) {
            return -1;
        } else if (arg2 >= 0 && var3.field2482.length > arg2) {
            return var3.field2482[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BII)Lwa;")
    public static final class200 method507(byte arg0, int arg1, int arg2) {
        field1432++;
        if (arg0 <= 108) {
            field1430 = null;
        }
        class200 var3 = class66.method432(arg1, false);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field3796 == null || var3.field3796.length <= arg2) {
            return null;
        } else {
            return var3.field3796[arg2];
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I[BLje;B)V")
    public static final void method508(int arg0, byte[] arg1, class87 arg2, byte arg3) {
        field1437++;
        class82 var4 = new class82();
        var4.field1441 = 0;
        var4.field1440 = arg1;
        var4.field2291 = arg0;
        var4.field1439 = arg2;
        class192 var5 = class30.field460;
        synchronized (class30.field460) {
            class30.field460.method1230(var4, true);
        }
        int var6 = 81 % ((arg3 + 67) / 35);
        class126.method872((byte) -4);
    }
}
