import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class202 {

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "[I")
    public static int[] field3341 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Z")
    public static boolean field3343 = false;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Ltl;")
    public static class59 field3339 = class85.method639("Lade Benutzeroberfl-=che )2 ", 9588);

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Ltl;")
    public static class59 field3345 = null;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "Ltl;")
    public static class59 field3347 = class85.method639("::fpson", 9588);

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "[I")
    public static int[] field3348 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ls;I)V", line = 15)
    public static final void method1444(class170 arg0, int arg1) {
        field3340++;
        if (arg1 >= -86) {
            return;
        }
        while (true) {
            while (arg0.field2787 < arg0.field2758.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method1221(95) == 1) {
                    var2 = true;
                    var3 = arg0.method1221(82);
                    var4 = arg0.method1221(82);
                }
                int var5 = arg0.method1221(117);
                int var6 = arg0.method1221(75);
                int var7 = class216.field3532 + class155.field2540 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class140.field2304;
                if (var8 >= 0 && (var7 - 63) >= 0 && (var8 + 63) < class62.field966 && class216.field3532 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var3 * 8 <= var11 && var11 < (var3 * 8 + 8) && var12 >= var4 * 8 && var4 * 8 + 8 > var12) {
                                byte var13 = arg0.method1205(-1);
                                if (var13 != 0) {
                                    if (class248.field4134[var9][var10] == null) {
                                        class248.field4134[var9][var10] = new byte[4096];
                                    }
                                    class248.field4134[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method1205(-1);
                                    if (class262.field4366[var9][var10] == null) {
                                        class262.field4366[var9][var10] = new byte[4096];
                                    }
                                    class262.field4366[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method1205(-1);
                        if (var16 != 0) {
                            arg0.field2787++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 120)
    public static void method1445(int arg0) {
        if (arg0 != -27) {
            method1445(31);
        }
        field3348 = null;
        field3345 = null;
        field3339 = null;
        field3347 = null;
        field3341 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V", line = 135)
    public static final void method1446(byte arg0) {
        field3342++;
        class161.field2617.method1484(false);
        if (arg0 != 83) {
            field3347 = (class59) null;
        }
        class231.field3793.method1484(false);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ltl;B)V", line = 148)
    public static final void method1447(class59 arg0, byte arg1) {
        int var2 = class40.method259(arg0, true);
        field3349++;
        if (var2 == -1) {
            return;
        }
        class119.field1942 = class23.field310.field122[var2] - class140.field2304;
        class69.field1065 = class216.field3532 - (class23.field310.field121[var2] + 1 - class155.field2540);
        int var3 = class119.field1942 - ((int) ((float) class14.field202.field4420 / class293.field4998));
        if (arg1 != -29) {
            method1448(false);
        }
        int var4 = (int) ((float) class14.field202.field4420 / class293.field4998) + class119.field1942;
        int var5 = class69.field1065 - ((int) ((float) class14.field202.field4467 / class293.field4998));
        if (var3 < 0) {
            class119.field1942 = (int) ((float) class14.field202.field4420 / class293.field4998);
        }
        int var6 = class69.field1065 + ((int) ((float) class14.field202.field4467 / class293.field4998));
        if (class62.field966 < var4) {
            class119.field1942 = class62.field966 - ((int) ((float) class14.field202.field4420 / class293.field4998));
        }
        if (var5 < 0) {
            class69.field1065 = (int) ((float) class14.field202.field4467 / class293.field4998);
        }
        if (var6 > class216.field3532) {
            class69.field1065 = class216.field3532 - ((int) ((float) class14.field202.field4467 / class293.field4998));
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V", line = 190)
    public static final void method1448(boolean arg0) {
        field3346++;
        try {
            if (class212.field3471 == 1) {
                int var1 = class84.field1316.method1582(arg0);
                if (var1 > 0 && class84.field1316.method1580(2624)) {
                    int var2 = var1 - class113.field1823;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class84.field1316.method1597(var2, (byte) 89);
                    return;
                }
                class84.field1316.method1570((byte) 107);
                class84.field1316.method1589(121);
                class173.field2842 = null;
                if (class149.field2442 == null) {
                    class212.field3471 = 0;
                } else {
                    class212.field3471 = 2;
                }
                class23.field300 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class84.field1316.method1570((byte) 91);
            class23.field300 = null;
            class212.field3471 = 0;
            class173.field2842 = null;
            class149.field2442 = null;
        }
        if (!arg0) {
            method1444((class170) null, -112);
        }
    }
}
