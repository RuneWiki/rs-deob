import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class246 extends class314 {

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public final int field4369;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    public final int field4372;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "Lhc;")
    public static class171 field4376 = new class171(64);

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)I", line = 6)
    public final int method1751(byte arg0) {
        if (arg0 <= 39) {
            field4376 = (class171) null;
        }
        field4379++;
        return class29.method265(this.field4372, (byte) 51);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)Z", line = 23)
    public final boolean method1752(int arg0) {
        field4374++;
        if (arg0 == -1) {
            return (this.field4372 >> 21 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)Z", line = 37)
    public final boolean method1753(int arg0) {
        if (arg0 != 5753) {
            this.method1761(-103);
        }
        field4380++;
        return (this.field4372 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILgf;)Z", line = 51)
    public static final boolean method1754(int arg0, class8 arg1) {
        field4377++;
        if (arg1.field326 == 205) {
            class243.field4315 = 250;
            return true;
        } else {
            if (arg0 > -58) {
                field4376 = (class171) null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)Z", line = 72)
    public final boolean method1755(int arg0) {
        int var2 = -16 % ((arg0 - 45) / 58);
        field4375++;
        return (this.field4372 & 0x3DA05B2D) >> 29 != 0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Z", line = 82)
    public final boolean method1756(int arg0, int arg1) {
        field4367++;
        if (arg1 >= -67) {
            field4376 = (class171) null;
        }
        return (this.field4372 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)Z", line = 93)
    public final boolean method1757(int arg0) {
        if (arg0 == 0) {
            field4370++;
            return (this.field4372 >> 28 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)I", line = 105)
    public final int method1758(int arg0) {
        field4366++;
        int var2 = -111 % ((arg0 + 25) / 47);
        return (this.field4372 & 0x1F5B56) >> 18;
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)V", line = 116)
    public static void method1759(int arg0) {
        if (arg0 != -22278) {
            method1760(30);
        }
        field4376 = null;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(II)V", line = 125)
    public class246(int arg0, int arg1) {
        this.field4369 = arg1;
        this.field4372 = arg0;
    }

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "(I)I", line = 137)
    public static final int method1760(int arg0) {
        if (arg0 != -4235) {
            field4376 = (class171) null;
        }
        field4373++;
        return 15;
    }

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "(I)Z", line = 152)
    public final boolean method1761(int arg0) {
        if (arg0 != 250) {
            field4376 = (class171) null;
        }
        field4378++;
        return (this.field4372 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(B)Z", line = 164)
    public final boolean method1762(byte arg0) {
        field4365++;
        if (arg0 > -90) {
            this.method1753(-78);
        }
        return (this.field4372 & 0x74490B) >> 22 != 0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lg;B)V", line = 179)
    public static final void method1763(class158 arg0, byte arg1) {
        field4364++;
        for (int var2 = 0; var2 < class26.field625.length; var2++) {
            class26.field625[var2] = 0;
        }
        short var3 = 256;
        int var4 = 0;
        if (arg1 != -42) {
            method1754(42, (class8) null);
        }
        while (var4 < 5000) {
            int var5 = (int) ((double) var3 * 128.0D * Math.random());
            class26.field625[var5] = (int) (Math.random() * 284.0D);
            var4++;
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < (var3 - 1); var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = (var7 << 7) + var8;
                    class134.field2448[var9] = (class26.field625[var9 - 1] + class26.field625[var9 + 1] + class26.field625[var9 + -128] + class26.field625[var9 - -128]) / 4;
                }
            }
            int[] var10 = class26.field625;
            class26.field625 = class134.field2448;
            class134.field2448 = var10;
        }
        if (arg0 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0.field1027; var12++) {
            for (int var13 = 0; var13 < arg0.field1041; var13++) {
                if (arg0.field2891[var11++] != 0) {
                    int var14 = var13 + arg0.field1034 + 16;
                    int var15 = var12 + arg0.field1028 + 16;
                    int var16 = (var15 << 7) + var14;
                    class26.field625[var16] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "(I)Z", line = 274)
    public final boolean method1764(int arg0) {
        if (arg0 != -1) {
            field4376 = (class171) null;
        }
        field4371++;
        return ((this.field4372 & 0x77ACF0AA) >> 30) != 0;
    }
}
