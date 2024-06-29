import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public abstract class class127 {

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field2267 = -1;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "Z")
    public static boolean field2273 = true;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field2265 = 0;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "[S")
    public static short[] field2270 = new short[256];

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public int field2266;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public int field2271;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "Ljava/awt/Image;")
    public Image field2264;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "[I")
    public int[] field2274;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "[S")
    public static short[] field2276;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)I")
    public static final int method844(int arg0) {
        field2272++;
        if (class171.field3092) {
            return 0;
        } else if (class231.method1561(25088)) {
            if (arg0 != 2) {
                method848(false);
            }
            return class117.field2077 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public abstract void method578(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IILjava/awt/Graphics;Z)V")
    public abstract void method580(int arg0, int arg1, Graphics arg2, boolean arg3);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIBLjava/awt/Component;)V")
    public abstract void method579(int arg0, int arg1, byte arg2, Component arg3);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lgk;ZIII)V")
    public static final void method845(class6 arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field2268++;
        int var5 = arg0.field89;
        if (arg0.field237 == 0) {
            arg0.field89 = arg0.field161;
        } else if (arg0.field237 == 1) {
            arg0.field89 = arg2 - arg0.field161;
        } else if (arg0.field237 == 2) {
            arg0.field89 = arg0.field161 * arg2 >> 14;
        } else if (arg0.field237 == 3) {
            if (arg0.field187 == 2) {
                arg0.field89 = (arg0.field161 - 1) * arg0.field176 + arg0.field161 * 32;
            } else if (arg0.field187 == 7) {
                arg0.field89 = (arg0.field161 - 1) * arg0.field176 + arg0.field161 * 115;
            }
        }
        int var6 = arg0.field84;
        if (arg0.field238 == 0) {
            arg0.field84 = arg0.field105;
        } else if (arg0.field238 == 1) {
            arg0.field84 = arg3 - arg0.field105;
        } else if (arg0.field238 == 2) {
            arg0.field84 = arg0.field105 * arg3 >> 14;
        } else if (arg0.field238 == 3) {
            if (arg0.field187 == 2) {
                arg0.field84 = (arg0.field105 - 1) * arg0.field139 + arg0.field105 * 32;
            } else if (arg0.field187 == 7) {
                arg0.field84 = (arg0.field105 - 1) * arg0.field139 + arg0.field105 * 12;
            }
        }
        if (arg0.field237 == 4) {
            arg0.field89 = arg0.field84 * arg0.field121 / arg0.field95;
        }
        if (arg0.field238 == 4) {
            arg0.field84 = arg0.field95 * arg0.field89 / arg0.field121;
        }
        if (class267.field4710 && (client.method1474(arg0) != 0 || arg0.field187 == 0)) {
            if (arg0.field84 < 5 && arg0.field89 < 5) {
                arg0.field84 = 5;
                arg0.field89 = 5;
            } else {
                if (arg0.field89 <= 0) {
                    arg0.field89 = 5;
                }
                if (arg0.field84 <= 0) {
                    arg0.field84 = 5;
                }
            }
        }
        if (arg0.field146 == 1337) {
            class278.field4912 = arg0;
        }
        if (arg1 && arg0.field211 != null && (arg0.field89 != var5 || arg0.field84 != var6)) {
            class277 var7 = new class277();
            var7.field4883 = arg0.field211;
            var7.field4901 = arg0;
            class64.field1245.method785(var7, -29);
        }
        int var8 = -113 % ((arg4 + 23) / 45);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
    public final void method846(byte arg0) {
        class35.method281(this.field2274, this.field2266, this.field2271);
        field2275++;
        if (arg0 != 2) {
            this.method578(2, (Graphics) null, 11, -79, 13, -115);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)I")
    public static final int method847(int arg0, int arg1) {
        if (arg1 != -31257) {
            method844(-91);
        }
        field2269++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V")
    public static void method848(boolean arg0) {
        field2276 = null;
        field2270 = null;
        if (!arg0) {
            method847(-14, -78);
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
    protected class127() {
    }
}
