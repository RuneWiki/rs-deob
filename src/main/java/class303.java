import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class303 extends class344 {

    @OriginalMember(owner = "client!u", name = "X", descriptor = "Z")
    public static volatile boolean field4579 = true;

    @OriginalMember(owner = "client!u", name = "V", descriptor = "Ltm;")
    public static class354 field4577 = new class354();

    @OriginalMember(owner = "client!u", name = "eb", descriptor = "Ljava/lang/String;")
    public static String field4586 = "";

    @OriginalMember(owner = "client!u", name = "T", descriptor = "I")
    public int field4575;

    @OriginalMember(owner = "client!u", name = "U", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!u", name = "W", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!u", name = "ab", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!u", name = "bb", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!u", name = "fb", descriptor = "Liq;")
    public static class134 field4587;

    @OriginalMember(owner = "client!u", name = "Y", descriptor = "Lae;")
    public static class26 field4580;

    @OriginalMember(owner = "client!u", name = "Z", descriptor = "Ltc;")
    public static class396 field4581;

    @OriginalMember(owner = "client!u", name = "cb", descriptor = "Luj;")
    public class415 field4584;

    @OriginalMember(owner = "client!u", name = "db", descriptor = "Z")
    public static boolean field4585;

    @OriginalMember(owner = "client!u", name = "S", descriptor = "[B")
    public byte[] field4574;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "(I)V")
    public static final void method1862(int arg0) {
        ++field4578;
        if (arg0 > -124) {
            field4585 = true;
        }
        class140.field1886 = class362.method2174(8, 85, 4, 35, 2048, 8, 0.4F, true);
    }

    @OriginalMember(owner = "client!u", name = "g", descriptor = "(I)[B")
    public final byte[] method880(int arg0) {
        ++field4576;
        if (arg0 != 0) {
            method1863(19);
        }
        if (super.field5140) {
            throw new RuntimeException();
        } else {
            return this.field4574;
        }
    }

    @OriginalMember(owner = "client!u", name = "k", descriptor = "(I)V")
    public static void method1863(int arg0) {
        field4581 = null;
        if (arg0 == 100) {
            field4586 = null;
            field4587 = null;
            field4580 = null;
            field4577 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Llg;)V")
    public static final void method1864(class21 arg0) {
        if (class358.field5278 < 65535) {
            class281.field4303[class358.field5278] = arg0;
            class154.field2117[class358.field5278] = false;
            ++class358.field5278;
            int var1 = arg0.field284;
            if (arg0.field296) {
                var1 = 0;
            }
            int var2 = arg0.field284;
            if (arg0.field291) {
                var2 = class56.field750 - 1;
            }
            for (int var3 = var1; var3 <= var2; ++var3) {
                int var4 = 0;
                int var5 = arg0.field2038 - arg0.field2037 + class267.field4058 >> class254.field3869;
                if (var5 < 0) {
                    var4 -= var5;
                    var5 = 0;
                }
                int var6 = arg0.field2038 + arg0.field2037 - class267.field4058 >> class254.field3869;
                if (var6 >= class265.field4044) {
                    var6 = class265.field4044 - 1;
                }
                for (int var7 = var5; var7 <= var6; ++var7) {
                    short var8 = arg0.field281[var4++];
                    int var9 = (var8 >>> 8) + (arg0.field2033 - arg0.field2037 + class267.field4058 >> class254.field3869);
                    int var10 = (var8 & 255) + var9 - 1;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    if (var10 >= class275.field4206) {
                        var10 = class275.field4206 - 1;
                    }
                    for (int var11 = var9; var11 <= var10; ++var11) {
                        long var12 = class452.field6688[var3][var11][var7];
                        if ((var12 & 65535L) == 0L) {
                            class452.field6688[var3][var11][var7] = var12 | (long) class358.field5278;
                        } else if ((var12 & 4294901760L) == 0L) {
                            class452.field6688[var3][var11][var7] = var12 | (long) class358.field5278 << 16;
                        } else if ((var12 & 281470681743360L) == 0L) {
                            class452.field6688[var3][var11][var7] = var12 | (long) class358.field5278 << 32;
                        } else if ((var12 & -281474976710656L) == 0L) {
                            class452.field6688[var3][var11][var7] = var12 | (long) class358.field5278 << 48;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "h", descriptor = "(I)I")
    public final int method875(int arg0) {
        ++field4583;
        if (super.field5140) {
            return 0;
        } else {
            if (arg0 != 0) {
                method1862(126);
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/lang/String;Lef;Z)I")
    public static final int method1865(String arg0, class385 arg1, boolean arg2) {
        ++field4582;
        if (!arg2) {
            return -57;
        } else {
            int var3 = arg1.field5666;
            byte[] var4 = class459.method2846((byte) 127, arg0);
            arg1.method2336(var4.length, false);
            arg1.field5666 += class196.field2966.method208(var4, 255, arg1.field5685, var4.length, arg1.field5666, 0);
            return -var3 + arg1.field5666;
        }
    }
}
