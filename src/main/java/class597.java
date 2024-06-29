import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class597 {

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "Lfba;")
    private class348 field8485 = new class348(256);

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "Ld;")
    private class267 field8483;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Lch;")
    private class38 field8486;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "[Ljava/awt/Color;")
    public static Color[] field8487 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "Lfw;")
    public static class215 field8488 = new class215();

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field8492 = 64;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "[I")
    public static int[] field8490 = new int[250];

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "Llc;")
    public static class435 field8489 = new class435(10, 4);

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field8480;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field8481;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field8482;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field8484;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "Loba;")
    public static class305 field8491;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V", line = 3)
    public final void method3491(byte arg0) {
        this.field8485.method2220(false);
        int var2 = 1 / ((arg0 - 51) / 48);
        field8480++;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V", line = 14)
    public final void method3492(boolean arg0) {
        if (!arg0) {
            this.field8485 = null;
        }
        field8481++;
        this.field8485.method2207(5, 1);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V", line = 27)
    public static void method3493(int arg0) {
        field8491 = null;
        field8490 = null;
        field8489 = null;
        if (arg0 < 121) {
            field8488 = null;
        }
        field8487 = null;
        field8488 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)Lug;", line = 43)
    public final class60 method3494(int arg0, int arg1) {
        field8482++;
        Object var3 = this.field8485.method2216(0, (long) arg0);
        if (var3 != null) {
            return (class60) var3;
        } else if (this.field8483.method963((byte) 41, arg0)) {
            class679 var4 = this.field8483.method962(arg0, arg1 ^ 0xB5D);
            int var5 = var4.field9636 ? 64 : this.field8486.field564;
            class60 var7;
            if (var4.field9642 && this.field8486.method1242()) {
                float[] var6 = this.field8483.method961(arg0, false, 0.7F, var5, var5, (byte) 107);
                var7 = this.field8486.method367(var4.field9634 != 0, class482.field6922, var5, var5, var6, (byte) -126);
            } else {
                int[] var8;
                if (var4.field9632 != 2 && class250.method1691((byte) -102, var4.field9648)) {
                    var8 = this.field8483.method964(83, true, var5, arg0, var5, 0.7F);
                } else {
                    var8 = this.field8483.method966(var5, false, 0.7F, var5, false, arg0);
                }
                var7 = this.field8486.method303(var4.field9634 != 0, var5, var5, var8, arg1 ^ 0xFFFFFFFE);
            }
            var7.method560(var4.field9641, 16609, var4.field9635);
            if (arg1 != 5) {
                method3493(41);
            }
            this.field8485.method2213((byte) -16, (long) arg0, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V", line = 91)
    public static final void method3495(int arg0) {
        field8484++;
        if (~class369.field5392 == arg0) {
            class79.method649(-19704, 5);
        } else if (class369.field5392 == 5 || class369.field5392 == 6) {
            class79.method649(-19704, 3);
            return;
        } else if (class369.field5392 == 12) {
            class79.method649(-19704, 3);
            return;
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lch;Ld;)V", line = 135)
    public class597(class38 arg0, class267 arg1) {
        this.field8483 = arg1;
        this.field8486 = arg0;
    }
}
