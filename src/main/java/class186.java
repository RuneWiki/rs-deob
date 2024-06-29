import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class186 extends class413 {

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
    public static int field2707 = 0;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public int field2695;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public int field2701;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public int field2702;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "Lna;")
    public class29 field2703;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "Ltq;")
    public static class376 field2699;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "[Lkf;")
    public class136[] field2704;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lon;B)V")
    public static final void method1277(class184 arg0, byte arg1) {
        if (class244.field3460 == arg0.field2568) {
            class394.field5556[arg0.field2542] = true;
        }
        int var2 = 34 / ((33 - arg1) / 39);
        field2697++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIZ)I")
    public static final int method1278(int arg0, int arg1, int arg2, boolean arg3) {
        field2700++;
        class411 var4 = class144.method878(arg3, arg2, -56);
        if (var4 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var5 = 0;
            if (arg0 <= 117) {
                method1281(true, 126);
            }
            for (int var6 = 0; var6 < var4.field5902.length; var6++) {
                if (var4.field5904[var6] == arg1) {
                    var5 += var4.field5902[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public static void method1279(int arg0) {
        field2699 = null;
        if (arg0 != 12208) {
            field2699 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIII)V")
    public static final void method1280(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg0; var5 < class421.field6017; var5++) {
            Rectangle var6 = class130.field1584[var5];
            if (arg2 < (var6.x + var6.width) && var6.x < (arg2 + arg4) && var6.y + var6.height > arg3 && var6.y < (arg1 + arg3)) {
                class394.field5556[var5] = true;
            }
        }
        field2698++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)Lss;")
    public static final class247 method1281(boolean arg0, int arg1) {
        if (arg0) {
            method1280(103, 25, 19, 90, -37);
        }
        field2705++;
        class247 var2 = (class247) class135.field1670.method1625((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class401.field5725.method2431((byte) 69, 26, arg1);
        class247 var4 = new class247();
        if (var3 != null) {
            var4.method1681(-1, new class236(var3));
        }
        class135.field1670.method1622((byte) 13, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILae;II)Z")
    public final boolean method1282(int arg0, class134 arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            this.field2701 = 37;
        }
        field2696++;
        if (this.field2704 != null) {
            for (int var5 = 0; var5 < this.field2704.length; var5++) {
                if (this.field2704[var5].method846(arg3, arg2) && this.field2703.method56(arg3, arg1, arg0 + 4835, arg2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V")
    public static final void method1283(int arg0) {
        if (arg0 <= 120) {
            method1278(94, 98, -26, false);
        }
        field2706++;
        class230.field3251.method1626((byte) 106);
    }
}
