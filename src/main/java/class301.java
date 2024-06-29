import java.awt.Component;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class301 extends class203 {

    @OriginalMember(owner = "client!wl", name = "T", descriptor = "Lok;")
    public class41 field5187;

    @OriginalMember(owner = "client!wl", name = "L", descriptor = "I")
    public static int field5179 = 2;

    @OriginalMember(owner = "client!wl", name = "N", descriptor = "Lmh;")
    private static class62 field5181 = class201.method1405(true, "Select a world");

    @OriginalMember(owner = "client!wl", name = "S", descriptor = "[Lu;")
    public static class204[] field5186 = new class204[32768];

    @OriginalMember(owner = "client!wl", name = "R", descriptor = "Lmh;")
    public static class62 field5185 = field5181;

    @OriginalMember(owner = "client!wl", name = "P", descriptor = "I")
    public static int field5183 = -1;

    @OriginalMember(owner = "client!wl", name = "V", descriptor = "Lmh;")
    public static class62 field5189 = class201.method1405(true, "::");

    @OriginalMember(owner = "client!wl", name = "O", descriptor = "Lsk;")
    public static class199 field5182 = new class199(20);

    @OriginalMember(owner = "client!wl", name = "G", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!wl", name = "H", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!wl", name = "I", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!wl", name = "J", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!wl", name = "K", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!wl", name = "Q", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!wl", name = "U", descriptor = "I")
    public static int field5188;

    @OriginalMember(owner = "client!wl", name = "M", descriptor = "Lhi;")
    public static class26 field5180;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)V", line = 6)
    public static void method2060(boolean arg0) {
        field5186 = null;
        field5180 = null;
        field5181 = null;
        field5185 = null;
        if (!arg0) {
            field5182 = null;
            field5189 = null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 21)
    public static final void method2061(int arg0, Component arg1) {
        arg1.removeMouseListener(class81.field1345);
        field5176++;
        if (arg0 > -104) {
            method2063(-99, -15);
        }
        arg1.removeMouseMotionListener(class81.field1345);
        arg1.removeFocusListener(class81.field1345);
        class19.field184 = 0;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZZJI)Lmh;", line = 51)
    public static final class62 method2062(boolean arg0, boolean arg1, long arg2, int arg3) {
        field5178++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        int var5 = 1;
        long var6 = arg2 / (long) arg3;
        while (var6 != 0L) {
            var6 /= (long) arg3;
            var5++;
        }
        int var8 = var5;
        if (arg2 < 0L || arg1) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg2 < 0L) {
            var9[0] = 45;
        } else if (arg1) {
            var9[0] = 43;
        }
        if (arg0) {
            return (class62) null;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var11 = (int) (arg2 % (long) arg3);
            arg2 /= (long) arg3;
            if (var11 < 0) {
                var11 = -var11;
            }
            if (var11 > 9) {
                var11 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var11 + 48);
        }
        class62 var12 = new class62();
        var12.field906 = var9;
        var12.field893 = var8;
        return var12;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)I", line = 122)
    public static final int method2063(int arg0, int arg1) {
        int var2 = -9 / ((arg0 - 17) / 38);
        field5184++;
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(II)V", line = 134)
    public static final void method2064(int arg0, int arg1) {
        field5177++;
        class219.field3773.method1390(arg1, -54);
        if (arg0 != 48) {
            field5180 = (class26) null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IILgi;III)Ljava/awt/Frame;", line = 153)
    public static final Frame method2065(int arg0, int arg1, class285 arg2, int arg3, int arg4, int arg5) {
        field5188++;
        if (arg3 >= -75) {
            return (Frame) null;
        } else if (arg2.method1941(3)) {
            if (arg1 == 0) {
                class304[] var6 = class102.method811((byte) -83, arg2);
                if (var6 == null) {
                    return null;
                }
                boolean var7 = false;
                for (int var8 = 0; var8 < var6.length; var8++) {
                    if (var6[var8].field5226 == arg0 && var6[var8].field5233 == arg5 && (arg4 == 0 || var6[var8].field5234 == arg4) && (!var7 || arg1 < var6[var8].field5224)) {
                        var7 = true;
                        arg1 = var6[var8].field5224;
                    }
                }
                if (!var7) {
                    return null;
                }
            }
            class147 var9 = arg2.method1940(arg5, arg0, true, arg1, arg4);
            while (var9.field2322 == 0) {
                class99.method792(-1, 10L);
            }
            Frame var10 = (Frame) var9.field2323;
            if (var10 == null) {
                return null;
            } else if (var9.field2322 == 2) {
                class184.method1289(var10, arg2, (byte) 106);
                return null;
            } else {
                return var10;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(Z)V", line = 222)
    public static final void method2066(boolean arg0) {
        class307.field5267.method1395((byte) -43);
        field5174++;
        if (arg0) {
            field5181 = (class62) null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lok;)V", line = 239)
    public class301(class41 arg0) {
        this.field5187 = arg0;
    }
}
