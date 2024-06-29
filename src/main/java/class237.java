import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class237 {

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "Lde;")
    private class534 field3090 = new class534(64);

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Lnd;")
    private class547 field3085;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "Lnd;")
    private class547 field3087;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "Lpw;")
    public static class708 field3088 = new class708(128);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "[Lcu;")
    public static class222[] field3091;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static void method1484(int arg0) {
        field3088 = null;
        field3091 = null;
        int var1 = -10 / (arg0 / 51);
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
    public static final void method1485(int arg0) {
        if (arg0 != 26524) {
            method1487(-121, null, 105, -128, -72, (byte) -51);
        }
        field3086++;
        class687.field9574.method3065(true);
        class60.field844.method3065(true);
        class272.field3411.method3065(true);
        class327.field4192.method3065(true);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Lfb;")
    public final class676 method1486(int arg0, int arg1) {
        field3089++;
        if (arg1 <= 121) {
            this.field3090 = null;
        }
        class676 var3 = (class676) this.field3090.method3079((long) arg0, 0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field3085.method3153(arg0 & 0x7FFF, 0, 0);
        } else {
            var4 = this.field3087.method3153(arg0, 0, 0);
        }
        class676 var5 = new class676();
        if (var4 != null) {
            var5.method3811(-124, new class461(var4));
        }
        if (arg0 >= 32768) {
            var5.method3814(true);
        }
        this.field3090.method3077((byte) -87, (long) arg0, var5);
        return var5;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILqg;IIIB)Ljava/awt/Frame;")
    public static final Frame method1487(int arg0, class465 arg1, int arg2, int arg3, int arg4, byte arg5) {
        field3084++;
        if (!arg1.method2656(arg5 + 56)) {
            return null;
        }
        if (arg3 == 0) {
            class72[] var6 = class299.method1787(true, arg1);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field1004 == arg2 && var6[var8].field1009 == arg0 && (arg4 == 0 || var6[var8].field1007 == arg4) && (!var7 || var6[var8].field1001 > arg3)) {
                    var7 = true;
                    arg3 = var6[var8].field1001;
                }
            }
            if (!var7) {
                return null;
            }
        }
        if (arg5 != -72) {
            return null;
        }
        class181 var9 = arg1.method2655(arg2, (byte) 120, arg3, arg4, arg0);
        while (var9.field2538 == 0) {
            class149.method1052(10L, true);
        }
        Frame var10 = (Frame) var9.field2540;
        if (var10 == null) {
            return null;
        } else if (var9.field2538 == 2) {
            class621.method3495((byte) 8, var10, arg1);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(ILnd;Lnd;)V")
    public class237(int arg0, class547 arg1, class547 arg2) {
        this.field3085 = arg2;
        this.field3087 = arg1;
        if (this.field3087 != null) {
            this.field3087.method3178((byte) 105, 0);
        }
        if (this.field3085 != null) {
            this.field3085.method3178((byte) 54, 0);
        }
    }
}
