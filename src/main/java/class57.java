import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class57 extends class69 {

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "Leg;")
    public static class272 field794 = new class272(50);

    @OriginalMember(owner = "client!hl", name = "y", descriptor = "I")
    public static int field804 = 0;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "I")
    public int field801;

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "I")
    public int field805;

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "Ljg;")
    public static class271 field802;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "[I")
    public int[] field792;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "[I")
    public int[] field798;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "[I")
    public int[] field800;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "[Lge;")
    public class137[] field790;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "[Lge;")
    public class137[] field793;

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "[[[B")
    public byte[][][] field803;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)Ltg;")
    public static final class284 method437(int arg0, int arg1) {
        if (arg1 != 14908) {
            return null;
        }
        field797++;
        class284 var2 = (class284) class136.field2260.method1579((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class20.field230.method940((byte) 121, arg0, 0);
        } else {
            var3 = class66.field934.method940((byte) 96, arg0 & 0x7FFF, 0);
        }
        class284 var4 = new class284();
        if (var3 != null) {
            var4.method1910(new class264(var3), (byte) 53);
        }
        if (arg0 >= 32768) {
            var4.method1909(-22382);
        }
        class136.field2260.method1578(var4, (long) arg0, 50);
        return var4;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method438(int arg0, String arg1) {
        field791++;
        int var2 = class140.method961(arg1, -1644);
        if (var2 == -1) {
            return;
        }
        int[] var3 = class247.field3968.method871(-8251, class225.field3572.field1088[var2] >> 28 & 0x3, class225.field3572.field1088[var2] & 0x3FFF, class225.field3572.field1088[var2] >> 14 & 0x3FFF);
        if (arg0 != -1863210852) {
            field802 = null;
        }
        class62.method478(-1, var3[2], var3[1]);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method439(byte arg0, String arg1) {
        field795++;
        if (arg0 <= 51) {
            field804 = -123;
        }
        return class142.method962(arg1, true, 13900, 10);
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(II)Lmj;")
    public static final class207 method440(int arg0, int arg1) {
        field799++;
        if (arg1 != -353) {
            return null;
        }
        class207 var2 = (class207) class235.field3751.method1839((byte) 66, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class178.field2893.method940((byte) 40, arg0, 30);
        class207 var4 = new class207();
        if (var3 != null) {
            var4.method1399(new class264(var3), arg1 ^ 0x1C69, arg0);
        }
        class235.field3751.method1830((long) arg0, -114, var4);
        return var4;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBIII)V")
    public static final void method441(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 93) {
            return;
        }
        if (class9.field142 == 1) {
            class30.field362[class153.field2480 / 100].method174(class71.field973 - 8, class8.field125 + -8);
        }
        field796++;
        if (class9.field142 == 2) {
            class30.field362[(class153.field2480 / 100) + 4].method174(class71.field973 - 8, class8.field125 + -8);
        }
        class205.method1374((byte) 123);
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(Z)V")
    public static void method442(boolean arg0) {
        if (arg0) {
            method439((byte) 68, (String) null);
        }
        field794 = null;
        field802 = null;
    }
}
