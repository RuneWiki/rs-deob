import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class302 {

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "Lfr;")
    private class231 field4845 = new class231(64);

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "Lqs;")
    private class496 field4847;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "Lfr;")
    public static class231 field4836 = new class231(32);

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "[F")
    public static float[] field4842 = new float[16384];

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "[F")
    public static float[] field4843 = new float[16384];

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "Lvv;")
    public static class313 field4846;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "Z")
    public static boolean field4849;

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "Lch;")
    public static class166 field4850;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4843[var2] = (float) Math.sin((double) var2 * var0);
            field4842[var2] = (float) Math.cos((double) var2 * var0);
        }
        field4846 = new class313(3, -2);
        field4849 = false;
        field4848 = -1;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V", line = 3)
    public static void method1933(byte arg0) {
        if (arg0 < 110) {
            return;
        }
        field4850 = null;
        field4836 = null;
        field4842 = null;
        field4843 = null;
        field4846 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)Lqv;", line = 17)
    public final class49 method1934(int arg0, int arg1) {
        field4840++;
        class231 var3 = this.field4845;
        class49 var4;
        synchronized (this.field4845) {
            var4 = (class49) this.field4845.method1593((byte) -30, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class496 var5 = this.field4847;
        byte[] var6;
        synchronized (this.field4847) {
            var6 = this.field4847.method2926(arg1, -122, 32);
        }
        class49 var7 = new class49();
        if (var6 != null) {
            var7.method357(-1, new class23(var6));
        }
        class231 var8 = this.field4845;
        synchronized (this.field4845) {
            if (arg0 <= 119) {
                return null;
            } else {
                this.field4845.method1595(var7, (long) arg1, (byte) 35);
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ldv;[[BZ)V", line = 53)
    public static final void method1935(class83 arg0, byte[][] arg1, boolean arg2) {
        field4844++;
        int var3 = class162.field2567.length;
        int var4 = 0;
        if (arg2) {
            field4836 = null;
        }
        while (var3 > var4) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                int var6 = (class23.field328[var4] >> 8) * 64 - class16.field181;
                int var7 = (class23.field328[var4] & 0xFF) * 64 - class455.field6794;
                class529.method3131(-62);
                arg0.method597(var7, class305.field4873, var5, var6, 27401, class106.field1865);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V", line = 92)
    public final void method1936(int arg0) {
        field4837++;
        class231 var2 = this.field4845;
        synchronized (this.field4845) {
            this.field4845.method1598(127);
            if (arg0 != 3018) {
                this.method1939(47, 49);
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V", line = 105)
    public final void method1937(int arg0) {
        field4839++;
        if (arg0 == -32011) {
            class231 var2 = this.field4845;
            synchronized (this.field4845) {
                this.field4845.method1604(4);
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIB)V", line = 122)
    public static final void method1938(int arg0, int arg1, byte arg2) {
        if (class210.field3339 > class210.field3335) {
            class210.field3335 = (float) ((double) class210.field3335 / 30.0D + (double) class210.field3335);
            if (class210.field3335 > class210.field3339) {
                class210.field3335 = class210.field3339;
            }
            class430.method2621((byte) 124);
            class210.field3336 = (int) class210.field3335 >> 1;
            class210.field3331 = class382.method2410(class210.field3336, (byte) 74);
        } else if (class210.field3339 < class210.field3335) {
            class210.field3335 = (float) ((double) class210.field3335 - (double) class210.field3335 / 30.0D);
            if (class210.field3335 < class210.field3339) {
                class210.field3335 = class210.field3339;
            }
            class430.method2621((byte) 127);
            class210.field3336 = (int) class210.field3335 >> 1;
            class210.field3331 = class382.method2410(class210.field3336, (byte) 112);
        }
        field4835++;
        if (class435.field6504 != -1 && class129.field2226 != -1) {
            int var3 = class435.field6504 - class494.field7217;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class129.field2226 - class471.field6970;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class494.field7217 += var3;
            if (var3 == 0 && var4 == 0) {
                class129.field2226 = -1;
                class435.field6504 = -1;
            }
            class471.field6970 += var4;
            class430.method2621((byte) 126);
        }
        if (class461.field6825 > 0) {
            class187.field2933--;
            if (class187.field2933 == 0) {
                class461.field6825--;
                class187.field2933 = 100;
            }
        } else {
            class1.field10 = -1;
            class536.field7876 = -1;
        }
        if (arg2 != 85) {
            method1933((byte) 104);
        }
        if (!class2.field17 || class536.field7873 == null) {
            return;
        }
        for (class417 var5 = (class417) class536.field7873.method2538(-3); var5 != null; var5 = (class417) class536.field7873.method2535((byte) -64)) {
            class445 var6 = class210.field3329.method492(var5.field6313.field5694, (byte) -10);
            if (var5.method2569(arg0, arg1, 1)) {
                if (var6.field6631 != null) {
                    if (var6.field6631[4] != null) {
                        class307.method1956(1012, true, arg2 ^ 0xFFFFFFAA, false, -1, -1, 0, (long) var5.field6313.field5694, var6.field6613, var6.field6631[4], var6.field6643);
                    }
                    if (var6.field6631[3] != null) {
                        class307.method1956(1008, true, -1, false, -1, -1, 0, (long) var5.field6313.field5694, var6.field6613, var6.field6631[3], var6.field6643);
                    }
                    if (var6.field6631[2] != null) {
                        class307.method1956(1003, true, -1, false, -1, -1, 0, (long) var5.field6313.field5694, var6.field6613, var6.field6631[2], var6.field6643);
                    }
                    if (var6.field6631[1] != null) {
                        class307.method1956(1001, true, -1, false, -1, -1, 0, (long) var5.field6313.field5694, var6.field6613, var6.field6631[1], var6.field6643);
                    }
                    if (var6.field6631[0] != null) {
                        class307.method1956(1004, true, arg2 - 86, false, -1, -1, 0, (long) var5.field6313.field5694, var6.field6613, var6.field6631[0], var6.field6643);
                    }
                }
                if (!var5.field6313.field5697) {
                    var5.field6313.field5697 = true;
                    class521.method3077(class447.field6676, var5.field6313.field5694, var6.field6613);
                }
                if (var5.field6313.field5697) {
                    class521.method3077(class82.field1442, var5.field6313.field5694, var6.field6613);
                }
            } else if (var5.field6313.field5697) {
                var5.field6313.field5697 = false;
                class521.method3077(class326.field5139, var5.field6313.field5694, var6.field6613);
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(II)V", line = 259)
    public final void method1939(int arg0, int arg1) {
        field4841++;
        class231 var3 = this.field4845;
        synchronized (this.field4845) {
            if (arg1 == 5845) {
                this.field4845.method1603((byte) -124, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lwv;ILqs;)V", line = 309)
    public class302(class535 arg0, int arg1, class496 arg2) {
        this.field4847 = arg2;
        this.field4847.method2940(32, -10511);
    }
}
