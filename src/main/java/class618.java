import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class618 {

    @OriginalMember(owner = "client!gba", name = "i", descriptor = "F")
    public float field8868 = 1.0F;

    @OriginalMember(owner = "client!gba", name = "p", descriptor = "F")
    public float field8875 = 1.0F;

    @OriginalMember(owner = "client!gba", name = "s", descriptor = "F")
    public float field8878 = 0.25F;

    @OriginalMember(owner = "client!gba", name = "j", descriptor = "I")
    public int field8869;

    @OriginalMember(owner = "client!gba", name = "r", descriptor = "I")
    public int field8877;

    @OriginalMember(owner = "client!gba", name = "o", descriptor = "F")
    public float field8874;

    @OriginalMember(owner = "client!gba", name = "l", descriptor = "Lcaa;")
    public class275 field8871;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "I")
    public int field8860;

    @OriginalMember(owner = "client!gba", name = "d", descriptor = "F")
    public float field8863;

    @OriginalMember(owner = "client!gba", name = "e", descriptor = "I")
    public int field8864;

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "I")
    public int field8861;

    @OriginalMember(owner = "client!gba", name = "n", descriptor = "F")
    public float field8873;

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "I")
    public int field8862;

    @OriginalMember(owner = "client!gba", name = "f", descriptor = "I")
    public static int field8865;

    @OriginalMember(owner = "client!gba", name = "g", descriptor = "I")
    public static int field8866;

    @OriginalMember(owner = "client!gba", name = "h", descriptor = "I")
    public static int field8867;

    @OriginalMember(owner = "client!gba", name = "k", descriptor = "I")
    public static int field8870;

    @OriginalMember(owner = "client!gba", name = "q", descriptor = "I")
    public static int field8876;

    @OriginalMember(owner = "client!gba", name = "m", descriptor = "Ljn;")
    public static class668 field8872;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public static final String method3534(int arg0, byte arg1) {
        field8876++;
        String var2 = Integer.toString(arg0);
        if (arg1 != 108) {
            field8872 = null;
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class424.field6071.method2561(class370.field4980, 0) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class424.field6073.method2561(class370.field4980, 0) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lun;I)V")
    public final void method3535(class389 arg0, int arg1) {
        field8865++;
        if (arg1 != -7495) {
            this.field8860 = 38;
        }
        this.field8868 = (float) (arg0.method2229(255) * 8) / 255.0F;
        this.field8878 = (float) (arg0.method2229(255) * 8) / 255.0F;
        this.field8875 = (float) (arg0.method2229(255) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IZII)Ljava/lang/String;")
    public static final String method3536(int arg0, boolean arg1, int arg2, int arg3) {
        field8870++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        } else if (arg1 && arg0 >= 0) {
            int var4 = 2;
            for (int var5 = arg0 / arg2; var5 != 0; var5 /= arg2) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            if (arg3 != 87) {
                method3540(true);
            }
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg0;
                arg0 /= arg2;
                int var9 = var8 - (arg0 * arg2);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(B)V")
    public static final void method3537(byte arg0) {
        if (arg0 != 46) {
            method3539(-58, -59, 12, 98);
        }
        class237.field3191 = true;
        field8867++;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lgba;I)Z")
    public final boolean method3538(class618 arg0, int arg1) {
        field8866++;
        if (arg1 > -65) {
            this.field8874 = 1.0397736F;
        }
        return this.field8864 == arg0.field8864 && this.field8863 == arg0.field8863 && this.field8874 == arg0.field8874 && this.field8873 == arg0.field8873 && this.field8878 == arg0.field8878 && this.field8868 == arg0.field8868 && this.field8875 == arg0.field8875 && this.field8869 == arg0.field8869 && this.field8860 == arg0.field8860 && this.field8871 == arg0.field8871;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIII)V")
    public static final void method3539(int arg0, int arg1, int arg2, int arg3) {
        class433 var4 = class281.field3808[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class480 var5 = var4.field6212;
        class480 var6 = var4.field6209;
        if (var5 != null) {
            var5.field6731 = (short) (var5.field6731 * arg3 / (0x10 << class295.field3981 - 7));
            var5.field6732 = (short) (var5.field6732 * arg3 / (0x10 << class295.field3981 - 7));
        }
        if (var6 != null) {
            var6.field6731 = (short) (var6.field6731 * arg3 / (0x10 << class295.field3981 - 7));
            var6.field6732 = (short) (var6.field6732 * arg3 / (0x10 << class295.field3981 - 7));
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Z)V")
    public static void method3540(boolean arg0) {
        if (!arg0) {
            method3534(18, (byte) 22);
        }
        field8872 = null;
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "()V")
    public class618() {
        this.field8869 = class362.field4822;
        this.field8877 = -50;
        this.field8874 = 0.69921875F;
        this.field8871 = class143.field1780;
        this.field8860 = 0;
        this.field8863 = 1.1523438F;
        this.field8864 = class268.field3677;
        this.field8861 = -50;
        this.field8873 = 1.2F;
        this.field8862 = -60;
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lun;)V")
    public class618(class389 arg0) {
        int var2 = arg0.method2229(255);
        if (class221.field2851.method1841(class375.field5039, 3) && class377.field5073.method232() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field8864 = class268.field3677;
            } else {
                this.field8864 = arg0.method2255(255);
            }
            if ((var2 & 0x2) == 0) {
                this.field8863 = 1.1523438F;
            } else {
                this.field8863 = (float) arg0.method2260(-56) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field8874 = 0.69921875F;
            } else {
                this.field8874 = (float) arg0.method2260(-49) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field8873 = 1.2F;
            } else {
                this.field8873 = (float) arg0.method2260(-61) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method2255(255);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method2260(-98);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method2260(-38);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method2260(-82);
            }
            this.field8864 = class268.field3677;
            this.field8873 = 1.2F;
            this.field8874 = 0.69921875F;
            this.field8863 = 1.1523438F;
        }
        if ((var2 & 0x10) == 0) {
            this.field8862 = -60;
            this.field8861 = -50;
            this.field8877 = -50;
        } else {
            this.field8877 = arg0.method2270((byte) 71);
            this.field8862 = arg0.method2270((byte) 71);
            this.field8861 = arg0.method2270((byte) 71);
        }
        if ((var2 & 0x20) == 0) {
            this.field8869 = class362.field4822;
        } else {
            this.field8869 = arg0.method2255(255);
        }
        if ((var2 & 0x40) == 0) {
            this.field8860 = 0;
        } else {
            this.field8860 = arg0.method2260(-96);
        }
        if ((var2 & 0x80) == 0) {
            this.field8871 = class143.field1780;
        } else {
            int var3 = arg0.method2260(-71);
            int var4 = arg0.method2260(-90);
            int var5 = arg0.method2260(-77);
            int var6 = arg0.method2260(-70);
            int var7 = arg0.method2260(-72);
            int var8 = arg0.method2260(-45);
            this.field8871 = class209.method1249(var3, var5, var4, var8, false, var7, var6);
        }
    }
}
