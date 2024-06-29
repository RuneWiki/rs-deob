import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class282 {

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public static int field4352 = 500;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field4348 = -2;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "[I")
    public static int[] field4360 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public int field4347;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public int field4350;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public int field4351;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public int field4353;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public int field4354;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public int field4355;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public int field4356;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public int field4357;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public int field4358;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    public int field4359;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public int field4361;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    public int field4364;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "I")
    public int field4365;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "I")
    public int field4369;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "I")
    public int field4370;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "I")
    public int field4371;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "I")
    public int field4372;

    @OriginalMember(owner = "client!il", name = "B", descriptor = "I")
    public int field4374;

    @OriginalMember(owner = "client!il", name = "A", descriptor = "Ltb;")
    public static class220 field4373;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIZ)V", line = 5)
    public static final void method1929(int arg0, int arg1, boolean arg2) {
        field4363++;
        class190 var3 = class320.method2172(arg0, 32370);
        int var4 = var3.field2848;
        int var5 = var3.field2850;
        if (!arg2) {
            method1931((byte) 84);
        }
        int var6 = var3.field2852;
        int var7 = class280.field4307[var6 - var5];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class52.method435(var4, ~var8 & class285.field4461[var4] | var8 & arg1 << var5, (byte) 123);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BI)V", line = 32)
    public static final void method1930(byte arg0, int arg1) {
        field4366++;
        if (arg0 >= -81) {
            field4348 = -86;
        }
        class217.field3298.method2175(arg1, -1401253017);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V", line = 44)
    public static final void method1931(byte arg0) {
        class192.field2881.method642(false);
        int var1 = 0;
        if (arg0 != -51) {
            field4352 = 34;
        }
        while (var1 < 32) {
            class132.field2086[var1] = 0L;
            var1++;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class131.field2057[var2] = 0L;
        }
        class169.field2559 = 0;
        field4367++;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BLl;Ll;)V", line = 80)
    public static final void method1932(byte arg0, class133 arg1, class133 arg2) {
        class200.field3004 = arg1;
        field4362++;
        int var3 = (int) (Math.random() * 21.0D) - 10;
        int var4 = (int) (Math.random() * 21.0D) - 10;
        int var5 = (int) (Math.random() * 41.0D) - 20;
        class279.field4304 = arg2;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        class200.field3004.method954(arg0 ^ 0x5DC4, 34);
        if (arg0 != -5) {
            method1933(false);
        }
        class173.field2620 = var3 + var5;
        class201.field3011 = var5 + var6;
        class20.field277 = var4 + var5;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V", line = 106)
    public static void method1933(boolean arg0) {
        if (!arg0) {
            field4360 = null;
            field4373 = null;
        }
    }
}
