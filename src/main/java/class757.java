import java.awt.Component;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public abstract class class757 extends class337 {

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
    private int field10315;

    @OriginalMember(owner = "client!gu", name = "D", descriptor = "I")
    public int field10332;

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
    public int field10314;

    @OriginalMember(owner = "client!gu", name = "w", descriptor = "F")
    public float field10325;

    @OriginalMember(owner = "client!gu", name = "v", descriptor = "I")
    private int field10324;

    @OriginalMember(owner = "client!gu", name = "o", descriptor = "I")
    public int field10317;

    @OriginalMember(owner = "client!gu", name = "C", descriptor = "Z")
    public static boolean field10331 = false;

    @OriginalMember(owner = "client!gu", name = "A", descriptor = "I")
    public static int field10329 = 0;

    @OriginalMember(owner = "client!gu", name = "r", descriptor = "I")
    public static int field10320 = 0;

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "I")
    public static int field10316;

    @OriginalMember(owner = "client!gu", name = "p", descriptor = "I")
    public static int field10318;

    @OriginalMember(owner = "client!gu", name = "q", descriptor = "I")
    public static int field10319;

    @OriginalMember(owner = "client!gu", name = "s", descriptor = "I")
    public static int field10321;

    @OriginalMember(owner = "client!gu", name = "u", descriptor = "I")
    public static int field10323;

    @OriginalMember(owner = "client!gu", name = "x", descriptor = "I")
    public static int field10326;

    @OriginalMember(owner = "client!gu", name = "z", descriptor = "I")
    public static int field10328;

    @OriginalMember(owner = "client!gu", name = "B", descriptor = "I")
    public static int field10330;

    @OriginalMember(owner = "client!gu", name = "E", descriptor = "I")
    public static int field10333;

    @OriginalMember(owner = "client!gu", name = "F", descriptor = "I")
    public static int field10334;

    @OriginalMember(owner = "client!gu", name = "t", descriptor = "[J")
    public static long[] field10322;

    @OriginalMember(owner = "client!gu", name = "y", descriptor = "[Lhd;")
    public static class620[] field10327;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILjava/awt/Component;)Lnl;")
    public static final class394 method4114(int arg0, Component arg1) {
        field10323++;
        if (arg0 != 2) {
            method4125((byte) -111);
        }
        return new class45(arg1);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(FI)V")
    public abstract void method10(float arg0, int arg1);

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIBI)V")
    public abstract void method6(int arg0, int arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)Lrca;")
    public static final class389 method4115(byte arg0) {
        field10330++;
        if (arg0 != 45) {
            field10322 = null;
        }
        return class402.field5326;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method4116(int arg0, long arg1) {
        class497.field6375.setTime(new Date(arg1));
        field10318++;
        int var3 = class497.field6375.get(7);
        if (arg0 <= 19) {
            field10331 = true;
        }
        int var4 = class497.field6375.get(5);
        int var5 = class497.field6375.get(2);
        int var6 = class497.field6375.get(1);
        int var7 = class497.field6375.get(11);
        int var8 = class497.field6375.get(12);
        int var9 = class497.field6375.get(13);
        return class600.field7630[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class111.field1489[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)I")
    public final int method4117(boolean arg0) {
        if (!arg0) {
            field10322 = null;
        }
        field10319++;
        return this.field10314;
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(Z)V")
    public static void method4118(boolean arg0) {
        field10327 = null;
        if (!arg0) {
            field10322 = null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "()V")
    public static final void method4119() {
        class106.method632(1, class78.field1121);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)F")
    public final float method4120(int arg0) {
        int var2 = -76 % ((-arg0 - 82) / 44);
        field10328++;
        return this.field10325;
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)I")
    public final int method4121(byte arg0) {
        field10333++;
        if (arg0 != -124) {
            this.method4123(-97);
        }
        return this.field10332;
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)I")
    public final int method4122(int arg0) {
        field10316++;
        int var2 = 84 % ((arg0 + 57) / 60);
        return this.field10324;
    }

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "(I)I")
    public final int method4123(int arg0) {
        if (arg0 != 22290) {
            this.method10(0.85013634F, -37);
        }
        field10321++;
        return this.field10317;
    }

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "(Z)I")
    public final int method4124(boolean arg0) {
        field10326++;
        if (arg0) {
            field10331 = true;
        }
        return this.field10315;
    }

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "(B)V")
    public static final void method4125(byte arg0) {
        field10334++;
        if (arg0 != 28) {
            field10322 = null;
        }
        int var1 = 0;
        if (class485.field6252 != null) {
            var1 = class485.field6252.field6955.method1462(false);
        }
        if (var1 == 2) {
            int var4 = class773.field10518 <= 800 ? class773.field10518 : 800;
            class483.field6237 = (class773.field10518 - var4) / 2;
            class372.field4550 = var4;
            int var5 = class310.field3886 <= 600 ? class310.field3886 : 600;
            class463.field6021 = var5;
            class257.field3477 = 0;
        } else if (var1 == 1) {
            int var2 = class773.field10518 > 1024 ? 1024 : class773.field10518;
            class483.field6237 = (class773.field10518 - var2) / 2;
            class372.field4550 = var2;
            int var3 = class310.field3886 > 768 ? 768 : class310.field3886;
            class463.field6021 = var3;
            class257.field3477 = 0;
        } else {
            class463.field6021 = class310.field3886;
            class483.field6237 = 0;
            class372.field4550 = class773.field10518;
            class257.field3477 = 0;
        }
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(IIIIIF)V")
    public class757(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field10315 = arg4;
        this.field10332 = arg0;
        this.field10314 = arg1;
        this.field10325 = arg5;
        this.field10324 = arg3;
        this.field10317 = arg2;
    }
}
