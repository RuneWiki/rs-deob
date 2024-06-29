import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class18 {

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "[J")
    public static long[] field338 = new long[200];

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "Lrd;")
    private static class114 field341 = class84.method656("Offline", (byte) 127);

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Lrd;")
    public static class114 field336 = field341;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "[Lrd;")
    public static class114[] field340 = new class114[1000];

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "Lrd;")
    public static class114 field342 = class84.method656("redstone1", (byte) 126);

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Lrd;")
    public static class114 field344 = class84.method656(" zuerst von Ihrer Ignorieren)2Liste(Q", (byte) 119);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Lid;")
    public static class60 field333 = new class60(new byte[5000]);

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "Lff;")
    public static class42 field343;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "[Lhe;")
    public static class54[] field345;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public static final void method125(byte arg0) {
        class124.field2941.method200(-123);
        if (arg0 == 74) {
            field335++;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static void method126(int arg0) {
        field343 = null;
        field336 = null;
        field338 = null;
        field341 = null;
        field340 = null;
        field333 = null;
        field344 = null;
        if (arg0 < 21) {
            method125((byte) 34);
        }
        field345 = null;
        field342 = null;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
    public static final void method127(byte arg0) {
        field339++;
        for (int var1 = -1; var1 < class8.field116; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class110.field2573[var1];
            }
            class126 var3 = class36.field762[var2];
            if (var3 != null) {
                class106.method812(1, (byte) -74, var3);
            }
        }
        if (arg0 != -32) {
            method126(98);
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)V")
    public static final void method128(byte arg0) {
        if (field343 != null) {
            field343.method292(25830);
            field343 = null;
        }
        class128.method992(-1);
        class101.field2325.method1017();
        field337++;
        for (int var1 = 0; var1 < 4; var1++) {
            class90.field2132[var1].method673(arg0 ^ 0xD01);
        }
        if (arg0 != -61) {
            field343 = null;
        }
        System.gc();
        class78.method622(10, (byte) 13);
        class82.field1828 = 0;
        class8.field112 = -1;
        class110.method839(arg0 - 16);
        class12.method101(false, 10);
    }
}
