import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class145 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field2014 = 0;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field2018 = -1;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2019 = "M";

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V", line = 4)
    public static void method980(int arg0) {
        field2019 = null;
        if (arg0 != 873896416) {
            field2016 = -1;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z[Ljava/lang/Object;[I)V", line = 22)
    public static final void method981(boolean arg0, Object[] arg1, int[] arg2) {
        if (arg0) {
            class219.method1507(0, arg2.length - 1, !arg0, arg2, arg1);
            field2017++;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLlb;Ldm;)Lgj;", line = 42)
    public static final class245 method982(byte arg0, class224 arg1, class300 arg2) {
        long var3 = ((long) arg2.field4679 << 32) + ((long) arg2.field4677 << 56) + (long) ((arg2.field4673 - -1 << 16) - -arg2.field4672);
        field2015++;
        if (arg0 != -105) {
            return (class245) null;
        }
        class245 var5 = (class245) arg1.method1537(var3, arg0 ^ 0x58DB);
        if (var5 == null) {
            var5 = new class245(arg2.field4673, (float) arg2.field4672, true, false, arg2.field4679);
            arg1.method1541(false, var5, var3);
        }
        return var5;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(JIZ)V", line = 65)
    public static final void method983(long arg0, int arg1, boolean arg2) {
        field2020++;
        if (arg0 == 0L) {
            return;
        }
        if (class96.field1248 >= 100) {
            class150.method1010(class286.field4504, 0, (byte) -59, "");
            return;
        }
        String var4 = class109.method743(arg0, 1);
        for (int var5 = 0; var5 < class96.field1248; var5++) {
            if (class113.field1615[var5] == arg0) {
                class150.method1010(var4 + class204.field2860, 0, (byte) -59, "");
                return;
            }
        }
        for (int var6 = 0; var6 < class74.field954; var6++) {
            if (class233.field3398[var6] == arg0) {
                class150.method1010(class40.field482 + var4 + class284.field4453, 0, (byte) -59, "");
                return;
            }
        }
        int var7 = -82 / ((5 - arg1) / 60);
        if (var4.equals(class118.field1664.field1496)) {
            class150.method1010(class15.field199, 0, (byte) -59, "");
            return;
        }
        class113.field1615[class96.field1248] = arg0;
        class37.field439[class96.field1248] = class133.method886(arg0, (byte) -22);
        class100.field1317[class96.field1248++] = arg2;
        class186.field2686 = class331.field5060;
        class279.field4333++;
        class140.field1954.method573(121, 135);
        class140.field1954.method678(arg0, (byte) 105);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)Lwl;", line = 140)
    public static final class96 method984(boolean arg0) {
        if (!arg0) {
            field2016 = 14;
        }
        field2021++;
        class96 var1 = (class96) class63.field803.method499(3346);
        if (var1 != null) {
            var1.method2285(true);
            var1.method610(-1);
            return var1;
        }
        class96 var2;
        do {
            var2 = (class96) class257.field3906.method499(3346);
            if (var2 == null) {
                return null;
            }
            if (var2.method585(-120) > class200.method1375(-16185)) {
                return null;
            }
            var2.method2285(arg0);
            var2.method610(-1);
        } while ((var2.field1344 & Long.MIN_VALUE) == 0L);
        return var2;
    }
}
