import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class23 extends class198 {

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public int field228;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public int field234;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public int field237;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "Lot;")
    public class419 field236;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "[Lut;")
    public class82[] field226;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Lnc;", line = 7)
    public static final class21 method134(int arg0, int arg1) {
        field227++;
        if (arg0 != 1707933639) {
            method135(66, 6, 112);
        }
        class21 var2 = (class21) class449.field6540.method324((long) arg1, -103);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class230.field3101.method2130(arg1, 0, -109);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class21 var4 = class277.method1681((byte) 60, var3);
            class449.field6540.method322((long) arg1, var4, (byte) -70);
            return var4;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)Z", line = 31)
    public static final boolean method135(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            method137(false, 73);
        }
        field232++;
        return class445.method2749(arg1, (byte) 9, arg2) & class401.method2477(arg2, (byte) -42, arg1);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIILza;)Z", line = 44)
    public final boolean method136(int arg0, int arg1, int arg2, class287 arg3) {
        if (arg2 != 0) {
            this.field236 = null;
        }
        field231++;
        if (this.field226 != null) {
            for (int var5 = 0; var5 < this.field226.length; var5++) {
                if (this.field226[var5].method456(arg1, arg0) && this.field236.method37(arg0, arg3, (byte) -82, arg1)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI)I", line = 74)
    public static final int method137(boolean arg0, int arg1) {
        field233++;
        if (arg0) {
            method139((byte) -35, null);
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V", line = 85)
    public static final void method138(int arg0) {
        field235++;
        class86 var1 = null;
        try {
            class236 var2 = class381.field5518.method850("2", true, true);
            while (var2.field3149 == 0) {
                class316.method1873(1L, false);
            }
            if (var2.field3149 == 1) {
                var1 = (class86) var2.field3151;
                byte[] var3 = new byte[(int) var1.method473((byte) 86)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method471(0, var3.length - var4, var4, var3);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class71.method421(arg0 - 6966, new class396(var3));
            }
            if (arg0 != 6965) {
                method134(99, -65);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method472(-29827);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLlr;)V", line = 137)
    public static final void method139(byte arg0, class531 arg1) {
        if (arg0 > -24) {
            return;
        }
        field230++;
        class325 var2 = (class325) class264.field3548.method295((long) arg1.field1211, -91);
        if (var2 == null) {
            class471.method2875(arg1.field3695, 0, (byte) -81, arg1.field1251[0], null, null, arg1.field1249[0], arg1);
        } else {
            var2.method1915(-40751577);
        }
    }
}
