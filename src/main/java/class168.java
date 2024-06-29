import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class168 extends class175 {

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    private int field2917 = 0;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "Z")
    public boolean field2935 = false;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    private int field2919 = 0;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    private int field2929 = -32768;

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "Z")
    private boolean field2938 = false;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public int field2916;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
    public int field2940;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    private int field2921;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public int field2928;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public int field2920;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public int field2922;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "Lkl;")
    private class35 field2924;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "Lhi;")
    public static class82 field2926 = class95.method664((byte) -69, "::wm3");

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "I")
    public static int field2933 = -1;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public static volatile int field2925 = 0;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "Lhi;")
    public static class82 field2936 = class95.method664((byte) -125, "Ablegen");

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "Lab;")
    private class295 field2931;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "Lsa;")
    public static class81 field2932;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "()I", line = 6)
    public final int method238() {
        field2927++;
        return this.field2929;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(IIIIIII)V", line = 340)
    public class168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2916 = arg1;
        this.field2940 = arg2;
        this.field2921 = arg0;
        this.field2928 = arg3;
        this.field2920 = arg6 + arg5;
        this.field2922 = arg4;
        int var8 = class187.method1289(this.field2921, (byte) 74).field999;
        if (var8 == -1) {
            this.field2935 = true;
        } else {
            this.field2935 = false;
            this.field2924 = class284.method1973(var8, false);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V", line = 19)
    public static final void method1202(int arg0) {
        field2918++;
        if (class285.field4791 == 0) {
            return;
        }
        try {
            if ((++class221.field3835) > 1500) {
                if (class66.field1036 != null) {
                    class66.field1036.method2085(true);
                    class66.field1036 = null;
                }
                if (class83.field1481 >= 1) {
                    class95.field1735 = -5;
                    class285.field4791 = 0;
                    return;
                }
                class285.field4791 = 1;
                class221.field3835 = 0;
                class83.field1481++;
                if (class47.field791 == class34.field516) {
                    class34.field516 = class164.field2879;
                } else {
                    class34.field516 = class47.field791;
                }
            }
            if (class285.field4791 == 1) {
                class133.field2297 = class55.field881.method831(class34.field516, (byte) 118, class261.field4469);
                class285.field4791 = 2;
            }
            if (class285.field4791 == 2) {
                if (class133.field2297.field5121 == 2) {
                    throw new IOException();
                }
                if (class133.field2297.field5121 != 1) {
                    return;
                }
                class66.field1036 = new class302((Socket) class133.field2297.field5122, class55.field881);
                class133.field2297 = null;
                class66.field1036.method2083(true, class61.field957.field2611, class61.field957.field2598, 0);
                if (class67.field1048 != null) {
                    class67.field1048.method752((byte) -48);
                }
                if (class142.field2435 != null) {
                    class142.field2435.method752((byte) -97);
                }
                int var1 = class66.field1036.method2089(arg0 + 21126);
                if (class67.field1048 != null) {
                    class67.field1048.method752((byte) -105);
                }
                if (class142.field2435 != null) {
                    class142.field2435.method752((byte) -94);
                }
                if (var1 != 101) {
                    class95.field1735 = var1;
                    class285.field4791 = 0;
                    class66.field1036.method2085(true);
                    class66.field1036 = null;
                    return;
                }
                class285.field4791 = 3;
            }
            if (arg0 != -21238) {
                return;
            }
            if (class285.field4791 == 3) {
                if (class66.field1036.method2088((byte) 91) >= 2) {
                    int var2 = class66.field1036.method2089(-119) << 8 | class66.field1036.method2089(53);
                    class273.method1910(var2, (byte) 69);
                    if (class47.field786 == -1) {
                        class95.field1735 = 6;
                        class285.field4791 = 0;
                        class66.field1036.method2085(true);
                        class66.field1036 = null;
                        return;
                    }
                    class285.field4791 = 0;
                    class66.field1036.method2085(true);
                    class66.field1036 = null;
                    class212.method1522(6127);
                    return;
                }
                return;
            }
        } catch (IOException var4) {
            if (class66.field1036 != null) {
                class66.field1036.method2085(true);
                class66.field1036 = null;
            }
            if (class83.field1481 < 1) {
                if (class47.field791 == class34.field516) {
                    class34.field516 = class164.field2879;
                } else {
                    class34.field516 = class47.field791;
                }
                class285.field4791 = 1;
                class221.field3835 = 0;
                class83.field1481++;
            } else {
                class285.field4791 = 0;
                class95.field1735 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIIIJILab;)V", line = 167)
    public final void method209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class295 arg10) {
        field2939++;
        class155 var13 = this.method1204(-51);
        if (var13 != null) {
            this.method1205(var13, 1);
            var13.method209(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2931);
            this.field2929 = var13.method238();
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)V", line = 186)
    public final void method1203(int arg0, int arg1) {
        int var3 = 30 / ((arg0 - 54) / 48);
        field2937++;
        if (this.field2935) {
            return;
        }
        this.field2917 += arg1;
        while (this.field2917 > this.field2924.field539[this.field2919]) {
            this.field2917 -= this.field2924.field539[this.field2919];
            this.field2919++;
            if (this.field2919 >= this.field2924.field547.length) {
                this.field2935 = true;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIII)V", line = 216)
    public final void method301(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2923++;
        if (!this.field2938) {
            class155 var6 = this.method1204(-77);
            if (var6 == null) {
                return;
            }
            this.method1205(var6, 1);
        }
        if (this.field2931 != null) {
            this.field2931.method2034(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)Lpa;", line = 250)
    private final class155 method1204(int arg0) {
        field2930++;
        int var2 = -46 / ((70 - arg0) / 51);
        class64 var3 = class187.method1289(this.field2921, (byte) -91);
        class155 var4;
        if (this.field2935) {
            var4 = var3.method412((byte) 124, -1);
        } else {
            var4 = var3.method412((byte) 33, this.field2919);
        }
        return var4 == null ? null : var4;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lpa;I)V", line = 280)
    private final void method1205(class155 arg0, int arg1) {
        if (class147.field2485) {
            class30 var3 = (class30) arg0;
            if ((this.field2931 == null || this.field2931.field4943) && (var3.field408 != null || var3.field436 != null)) {
                this.field2931 = new class295(class212.field3708, 1, 1);
            }
            if (this.field2931 != null) {
                this.field2931.method2029(var3.field408, var3.field436, false, var3.field427, var3.field422, var3.field418);
            }
        } else {
            class318 var4 = (class318) arg0;
            if ((this.field2931 == null || this.field2931.field4943) && (var4.field5461 != null || var4.field5460 != null)) {
                this.field2931 = new class295(class212.field3708, 1, 1);
            }
            if (this.field2931 != null) {
                this.field2931.method2029(var4.field5461, var4.field5460, false, var4.field5454, var4.field5474, var4.field5452);
            }
        }
        this.field2938 = true;
        field2934++;
        if (arg1 != 1) {
            this.field2938 = true;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V", line = 364)
    public static void method1206(byte arg0) {
        if (arg0 == 75) {
            field2926 = null;
            field2936 = null;
            field2932 = null;
        }
    }
}
