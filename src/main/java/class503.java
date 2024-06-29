import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class503 {

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public static int field6917 = -1;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public int field6899;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field6900;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public int field6901;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public int field6902;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public int field6903;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public int field6904;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public int field6905;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public int field6906;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field6907;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field6908;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public int field6909;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public int field6910;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public int field6912;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field6913;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public int field6914;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public static int field6915;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public int field6916;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "Lvn;")
    public static class283 field6911;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILih;)V", line = 4)
    public static final void method2880(int arg0, class651 arg1) {
        field6915++;
        arg1.field9045 = null;
        if (class554.field7475 < 20) {
            class507.field6948.method3906(arg1, (byte) -19);
            class554.field7475++;
        }
        if (arg0 != 14625) {
            method2885((byte) 35);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V", line = 24)
    public static final void method2881(boolean arg0) {
        if (arg0) {
            class295.field4051 = class310.field4290;
            class409.field5812 = class52.field606;
        } else {
            class295.field4051 = class468.field6438;
            class409.field5812 = class497.field6766;
        }
        class107.field1493 = class295.field4051.length;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)Ljava/lang/String;", line = 38)
    public static final String method2882(int arg0) {
        field6907++;
        String var1 = "www";
        if (class603.field8404 == class542.field7336) {
            var1 = "www-wtrc";
        } else if (class603.field8404 == class564.field7618) {
            var1 = "www-wtqa";
        } else if (class603.field8404 == class131.field1878) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class400.field5614 != null) {
            var2 = "/p=" + class400.field5614;
        }
        if (arg0 != -1) {
            field6911 = null;
        }
        return "http://" + var1 + "." + class219.field3065.field5862 + ".com/l=" + class697.field9900 + "/a=" + class254.field3462 + var2 + "/";
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBLkj;I)J", line = 75)
    public static final long method2883(int arg0, byte arg1, class526 arg2, int arg3) {
        field6908++;
        long var4 = 4194304L;
        long var6 = Long.MIN_VALUE;
        if (arg1 != -88) {
            method2885((byte) 94);
        }
        class301 var8 = class475.field6543.method2685(arg2.method211((byte) 103), -89);
        long var9 = (long) (arg0 | 0x40000000 | arg3 << 7 | arg2.method222(true) << 14 | arg2.method213((byte) 101) << 20);
        if (var8.field4164 == 0) {
            var9 |= var6;
        }
        if (var8.field4110 == 1) {
            var9 |= var4;
        }
        return var9 | (long) arg2.method211((byte) 98) << 32;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLlb;)Z", line = 103)
    public final boolean method2884(boolean arg0, class503 arg1) {
        if (arg0) {
            method2886(-114);
        }
        field6900++;
        return this.field6904 == arg1.field6904 && this.field6903 == arg1.field6903 && this.field6905 == arg1.field6905;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V", line = 119)
    public static void method2885(byte arg0) {
        field6911 = null;
        if (arg0 < 17) {
            field6911 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V", line = 131)
    public static final void method2886(int arg0) {
        field6913++;
        class24.method243(4, class366.field4875.field9368);
        int var1 = (class666.field9335 >> 12) + (class498.field6774 >> 3);
        class367.field4944 = class143.field2063.field4053 = 0;
        int var2 = (class613.field8555 >> 3) + (class11.field114 >> 12);
        class143.field2063.method3855(8, 8, -122);
        byte var3 = 18;
        class519.field7078 = new int[var3];
        class666.field9327 = new byte[var3][];
        class479.field6606 = new byte[var3][];
        class306.field4223 = new byte[var3][];
        class518.field7052 = new byte[var3][];
        class416.field5870 = new int[var3][4];
        class314.field4342 = new int[var3];
        class111.field1540 = new int[var3];
        class180.field2611 = new int[var3];
        class372.field5015 = new byte[var3][];
        class416.field5868 = new int[var3];
        class699.field9915 = new int[var3];
        int var4 = 0;
        for (int var5 = (var1 - (class401.field5620 >> 4)) / 8; var5 <= (((class401.field5620 >> 4) + var1) / 8); var5++) {
            for (int var9 = (var2 - (class257.field3508 >> 4)) / 8; var9 <= ((class257.field3508 >> 4) + var2) / 8; var9++) {
                int var10 = (var5 << 8) + var9;
                class111.field1540[var4] = var10;
                class314.field4342[var4] = class609.field8458.method3643("m" + var5 + "_" + var9, 1);
                class180.field2611[var4] = class609.field8458.method3643("l" + var5 + "_" + var9, 1);
                class416.field5868[var4] = class609.field8458.method3643("n" + var5 + "_" + var9, 1);
                class699.field9915[var4] = class609.field8458.method3643("um" + var5 + "_" + var9, 1);
                class519.field7078[var4] = class609.field8458.method3643("ul" + var5 + "_" + var9, 1);
                if (class416.field5868[var4] == -1) {
                    class314.field4342[var4] = -1;
                    class180.field2611[var4] = -1;
                    class699.field9915[var4] = -1;
                    class519.field7078[var4] = -1;
                }
                var4++;
            }
        }
        int var6 = 16 % ((19 - arg0) / 44);
        for (int var7 = var4; var7 < class416.field5868.length; var7++) {
            class416.field5868[var7] = -1;
            class314.field4342[var7] = -1;
            class180.field2611[var7] = -1;
            class699.field9915[var7] = -1;
            class519.field7078[var7] = -1;
        }
        byte var8;
        if (class285.field3921 == 3) {
            var8 = 4;
        } else {
            var8 = 8;
        }
        class165.method1156(var2, var1, false, -4525, var8);
    }
}
