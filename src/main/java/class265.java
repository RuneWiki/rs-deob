import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public abstract class class265 {

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static volatile int field4670 = 0;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "Lsg;")
    private static class30 field4677 = class167.method1221((byte) 33, "Prepared sound engine");

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "Lsg;")
    public static class30 field4678 = field4677;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public int field4672;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public int field4673;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public int field4675;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public int field4676;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public int field4679;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public int field4680;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Z")
    public static boolean field4669;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V")
    public abstract void method1393(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)V")
    public abstract void method1387(int arg0, int arg1);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZ)Lvf;")
    public static final class259 method1821(int arg0, boolean arg1) {
        field4671++;
        if (!arg1) {
            method1823((byte) -121);
        }
        if (arg0 == 0) {
            return new class182();
        } else if (arg0 == 1) {
            return new class54();
        } else if (arg0 == 2) {
            return new class276();
        } else if (arg0 == 3) {
            return new class164();
        } else if (arg0 == 4) {
            return new class204();
        } else if (arg0 == 5) {
            return new class238();
        } else if (arg0 == 6) {
            return new class74();
        } else if (arg0 == 7) {
            return new class249();
        } else if (arg0 == 8) {
            return new class234();
        } else if (arg0 == 9) {
            return new class64();
        } else if (arg0 == 10) {
            return new class47();
        } else if (arg0 == 11) {
            return new class23();
        } else if (arg0 == 12) {
            return new class254();
        } else if (arg0 == 13) {
            return new class32();
        } else if (arg0 == 14) {
            return new class113();
        } else if (arg0 == 15) {
            return new class167();
        } else if (arg0 == 16) {
            return new class160();
        } else if (arg0 == 17) {
            return new class100();
        } else if (arg0 == 18) {
            return new class46();
        } else if (arg0 == 19) {
            return new class226();
        } else if (arg0 == 20) {
            return new class52();
        } else if (arg0 == 21) {
            return new class227();
        } else if (arg0 == 22) {
            return new class137();
        } else if (arg0 == 23) {
            return new class115();
        } else if (arg0 == 24) {
            return new class82();
        } else if (arg0 == 25) {
            return new class273();
        } else if (arg0 == 26) {
            return new class114();
        } else if (arg0 == 27) {
            return new class2();
        } else if (arg0 == 28) {
            return new class71();
        } else if (arg0 == 29) {
            return new class33();
        } else if (arg0 == 30) {
            return new class80();
        } else if (arg0 == 31) {
            return new class244();
        } else if (arg0 == 32) {
            return new class90();
        } else if (arg0 == 33) {
            return new class139();
        } else if (arg0 == 34) {
            return new class159();
        } else if (arg0 == 35) {
            return new class209();
        } else if (arg0 == 36) {
            return new class87();
        } else if (arg0 == 37) {
            return new class135();
        } else if (arg0 == 38) {
            return new class263();
        } else if (arg0 == 39) {
            return new class1();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLwd;)V")
    public static final void method1822(byte arg0, class63 arg1) {
        field4674++;
        if (class133.field2617 == arg1.field1394 || arg1.field1364 == -1 || arg1.field1386 != 0 || (arg1.field1381 + 1) > class193.method1396(-30590, arg1.field1364).field2690[arg1.field1402]) {
            int var2 = arg1.field1394 - arg1.field1367;
            int var3 = class133.field2617 - arg1.field1367;
            int var4 = arg1.field1363 * 128 + arg1.method574(true) * 64;
            int var5 = arg1.field1382 * 128 + arg1.method574(true) * 64;
            int var6 = arg1.field1352 * 128 + arg1.method574(true) * 64;
            int var7 = arg1.field1404 * 128 + arg1.method574(true) * 64;
            arg1.field1360 = ((var2 - var3) * var4 + (var3 * var6)) / var2;
            arg1.field1336 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        arg1.field1347 = 0;
        if (arg1.field1393 == 0) {
            arg1.field1337 = 1024;
        }
        if (arg1.field1393 == 1) {
            arg1.field1337 = 1536;
        }
        if (arg1.field1393 == 2) {
            arg1.field1337 = 0;
        }
        if (arg1.field1393 == 3) {
            arg1.field1337 = 512;
        }
        if (arg0 > 37) {
            arg1.field1389 = arg1.field1337;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
    public static void method1823(byte arg0) {
        field4678 = null;
        if (arg0 != -21) {
            method1821(76, false);
        }
        field4677 = null;
    }
}
