import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class47 {

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Z")
    public static boolean field776 = false;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "Z")
    public static boolean field783 = false;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "Lp;")
    public static class280 field781 = class18.method140((byte) -125, "(U");

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "Lp;")
    public static class280 field784 = class18.method140((byte) -120, ":assistreq:");

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "Lp;")
    public static class280 field782 = class18.method140((byte) -117, "Hierhin gehen");

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([Lti;[Leg;[Lti;[Lti;Z[Lti;Ltg;)V")
    public static final void method350(class5[] arg0, class223[] arg1, class5[] arg2, class5[] arg3, boolean arg4, class5[] arg5, class180 arg6) {
        class136.field2403 = arg1;
        class62.field1004 = arg2;
        class267.field4695 = arg3;
        field777++;
        class236.field4113 = arg6;
        if (!arg4) {
            method353(-65);
        }
        class104.field1735 = arg0;
        class255.field4501 = arg5;
        class101.field1647 = new boolean[class136.field2403.length];
        class104.field1725.method639(117);
        int var7 = class236.field4113.method1234((byte) -88, class118.field2119);
        int[] var8 = class236.field4113.method1237(var7, -1);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class104.field1725.method649(class8.method82((byte) -12, new class25(class236.field4113.method1258(var7, var8[var9], (byte) 113))), (byte) 84);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lug;I)V")
    public static final void method351(class198 arg0, int arg1) {
        field778++;
        class119 var2 = null;
        try {
            class174 var3 = arg0.method1362(arg1 ^ 0xFFFFFDB3, "runescape");
            if (arg1 != -583) {
                method351((class198) null, 3);
            }
            while (var3.field3025 == 0) {
                class159.method1130(1L, 0);
            }
            if (var3.field3025 == 1) {
                var2 = (class119) var3.field3028;
                class25 var4 = class107.method747(0);
                var2.method848(var4.field481, 0, true, var4.field475);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method849(86);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILjava/util/Random;I)I")
    public static final int method352(int arg0, Random arg1, int arg2) {
        field786++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class260.method1762(true, arg2)) {
            return (int) ((long) arg2 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg2);
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            if (arg0 != 1) {
                field776 = true;
            }
            return class4.method58(var4, arg0 - 2, arg2);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static void method353(int arg0) {
        field784 = null;
        field782 = null;
        if (arg0 != 0) {
            method350((class5[]) null, (class223[]) null, (class5[]) null, (class5[]) null, true, (class5[]) null, (class180) null);
        }
        field781 = null;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
    public static final void method354(int arg0) {
        int var1 = class160.field2789;
        int var2 = class145.field2527 - class190.field3328 - var1;
        int var3 = class35.field648;
        field785++;
        if (arg0 >= -76) {
            field782 = null;
        }
        int var4 = class126.field2202 - var3 - class103.field1724;
        if (var1 <= 0 && var2 <= 0 && var3 <= 0 && var4 <= 0) {
            return;
        }
        try {
            int var5 = 0;
            int var6 = 0;
            Container var7;
            if (class129.field2237 != null) {
                var7 = class129.field2237;
            } else if (class153.field2656 == null) {
                var7 = class118.field2117.field3473;
            } else {
                var7 = class153.field2656;
            }
            if (class153.field2656 == var7) {
                Insets var8 = class153.field2656.getInsets();
                var5 = var8.left;
                var6 = var8.top;
            }
            Graphics var9 = var7.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var5, var6, var1, class126.field2202);
            }
            if (var3 > 0) {
                var9.fillRect(var5, var6, class145.field2527, var3);
            }
            if (var2 > 0) {
                var9.fillRect(class145.field2527 + var5 - var2, var6, var2, class126.field2202);
            }
            if (var4 > 0) {
                var9.fillRect(var5, var6 + class126.field2202 - var4, class145.field2527, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }
}
