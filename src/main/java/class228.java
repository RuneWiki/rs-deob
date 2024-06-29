import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class228 extends class236 {

    @OriginalMember(owner = "client!a", name = "D", descriptor = "[B")
    public byte[] field4079;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "Lsg;")
    private static class30 field4068 = class167.method1221((byte) 33, "Members object");

    @OriginalMember(owner = "client!a", name = "u", descriptor = "Lsg;")
    public static class30 field4070 = class167.method1221((byte) 33, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!a", name = "v", descriptor = "I")
    public static int field4071 = 0;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "Lsg;")
    public static class30 field4074 = class167.method1221((byte) 33, "M");

    @OriginalMember(owner = "client!a", name = "A", descriptor = "[I")
    public static int[] field4076 = new int[2000];

    @OriginalMember(owner = "client!a", name = "w", descriptor = "I")
    public static int field4072 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "I")
    public static int field4069 = 0;

    @OriginalMember(owner = "client!a", name = "C", descriptor = "Lsg;")
    public static class30 field4078 = field4068;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!a", name = "B", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
    public static final void method1623(int arg0) {
        field4077++;
        for (int var1 = arg0; var1 < class28.field528; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class183.field3378[var1];
            }
            class120 var6 = class75.field1670[var5];
            if (var6 != null && var6.field1374 > 0) {
                var6.field1374--;
                if (var6.field1374 == 0) {
                    var6.field1357 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class221.field3985; var2++) {
            int var3 = class4.field55[var2];
            class275 var4 = class125.field2443[var3];
            if (var4 != null && var4.field1374 > 0) {
                var4.field1374--;
                if (var4.field1374 == 0) {
                    var4.field1357 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIBLsg;)V")
    public static final void method1624(int arg0, int arg1, int arg2, byte arg3, class30 arg4) {
        field4075++;
        if (arg3 > -87) {
            return;
        }
        class31 var5 = class122.method931(arg0, (byte) 127, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field786 != null) {
            class183 var6 = new class183();
            var6.field3367 = arg4;
            var6.field3363 = var5.field786;
            var6.field3368 = arg1;
            var6.field3369 = var5;
            class104.method835(var6, (byte) 41);
        }
        boolean var7 = true;
        if (var5.field664 > 0) {
            var7 = class46.method462(var5, 890);
        }
        if (!var7 || !class64.method575(arg1 - 1, client.method1498(var5), 1)) {
            return;
        }
        if (arg1 == 1) {
            class212.field3832++;
            class196.field3553.method1267(53, -9);
            class196.field3553.method57(arg2, 81);
            class196.field3553.method97(arg0, (byte) -2);
        }
        if (arg1 == 2) {
            class22.field415++;
            class196.field3553.method1267(68, -9);
            class196.field3553.method57(arg2, 104);
            class196.field3553.method97(arg0, (byte) -2);
        }
        if (arg1 == 3) {
            class81.field1733++;
            class196.field3553.method1267(138, -9);
            class196.field3553.method57(arg2, 75);
            class196.field3553.method97(arg0, (byte) -2);
        }
        if (arg1 == 4) {
            class196.field3553.method1267(11, -9);
            class196.field3553.method57(arg2, 89);
            class175.field3256++;
            class196.field3553.method97(arg0, (byte) -2);
        }
        if (arg1 == 5) {
            class235.field4204++;
            class196.field3553.method1267(255, -9);
            class196.field3553.method57(arg2, 74);
            class196.field3553.method97(arg0, (byte) -2);
        }
        if (arg1 == 6) {
            class94.field1900++;
            class196.field3553.method1267(130, -9);
            class196.field3553.method57(arg2, 64);
            class196.field3553.method97(arg0, (byte) -2);
        }
        if (arg1 == 7) {
            class216.field3946++;
            class196.field3553.method1267(182, -9);
            class196.field3553.method57(arg2, 79);
            class196.field3553.method97(arg0, (byte) -2);
        }
        if (arg1 == 8) {
            class20.field370++;
            class196.field3553.method1267(71, -9);
            class196.field3553.method57(arg2, 87);
            class196.field3553.method97(arg0, (byte) -2);
        }
        if (arg1 == 9) {
            class196.field3553.method1267(196, -9);
            class178.field3295++;
            class196.field3553.method57(arg2, 72);
            class196.field3553.method97(arg0, (byte) -2);
        }
        if (arg1 == 10) {
            class185.field3394++;
            class196.field3553.method1267(186, -9);
            class196.field3553.method57(arg2, 92);
            class196.field3553.method97(arg0, (byte) -2);
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)V")
    public static void method1625(boolean arg0) {
        field4076 = null;
        if (!arg0) {
            field4078 = null;
            field4070 = null;
            field4068 = null;
            field4074 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILmc;)V")
    public static final void method1626(int arg0, class151 arg1) {
        if (arg0 == -19558) {
            field4073++;
            class77.field1689 = arg1;
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "([B)V")
    public class228(byte[] arg0) {
        this.field4079 = arg0;
    }
}
