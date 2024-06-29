import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class48 extends class53 {

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "I")
    private int field778 = 1;

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "I")
    private int field779 = 204;

    @OriginalMember(owner = "client!ff", name = "Y", descriptor = "I")
    private int field785 = 1;

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "Lwa;")
    public static class75 field777 = class66.method560("; Expires=", false);

    @OriginalMember(owner = "client!ff", name = "X", descriptor = "Lwa;")
    public static class75 field784 = class66.method560(" zuerst von Ihrer Ignorieren)2Liste(Q", false);

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "I")
    public static int field780 = 0;

    @OriginalMember(owner = "client!ff", name = "W", descriptor = "Lwa;")
    private static class75 field783 = class66.method560(" from your ignore list first)3", false);

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "Lwa;")
    public static class75 field781 = field783;

    @OriginalMember(owner = "client!ff", name = "Z", descriptor = "[Lja;")
    public static class60[] field786 = new class60[2048];

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!ff", name = "V", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!ff", name = "ab", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)V", line = 9)
    public static void method347(int arg0) {
        field777 = null;
        field781 = null;
        if (arg0 < -97) {
            field783 = null;
            field784 = null;
            field786 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)[I", line = 26)
    public final int[] method59(int arg0, int arg1) {
        field776++;
        int[] var3 = this.field878.method1603(arg1, (byte) 117);
        if (this.field878.field3749) {
            for (int var4 = 0; var4 < class269.field4644; var4++) {
                int var5 = class50.field814[arg1];
                int var6 = this.field778 * var5 >> 12;
                int var7 = class67.field1178[var4];
                int var8 = this.field785 * var7 >> 12;
                int var9 = var7 % (4096 / this.field785) * this.field785;
                int var10 = var5 % (4096 / this.field778) * this.field778;
                if (var10 < this.field779) {
                    for (var8 -= var6; var8 < 0; var8 += 4) {
                    }
                    while (var8 > 3) {
                        var8 -= 4;
                    }
                    if (var8 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var9 < this.field779) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field779) {
                    int var11;
                    for (var11 = var8 - var6; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return arg0 == -15196 ? var3 : (int[]) null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILre;)Lwa;", line = 113)
    public static final class75 method348(int arg0, class262 arg1) {
        field782++;
        if (class133.method1035(7127, client.method1734(arg1)) == 0) {
            return null;
        } else if (arg0 < 106) {
            return (class75) null;
        } else if (arg1.field4424 == null || arg1.field4424.method649(255).method640(1) == 0) {
            return class214.field3662 ? class70.field1198 : null;
        } else {
            return arg1.field4424;
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V", line = 238)
    public class48() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIBLre;)V", line = 159)
    public static final void method349(int arg0, int arg1, byte arg2, class262 arg3) {
        field774++;
        if (class270.field4675 != null || class153.field2625 || arg3 == null || class198.method1473(19329, arg3) == null) {
            return;
        }
        class270.field4675 = arg3;
        class126.field2175 = class198.method1473(19329, arg3);
        if (arg2 <= 78) {
            method349(-82, 72, (byte) -23, (class262) null);
        }
        class25.field328 = arg1;
        class87.field1438 = arg0;
        class113.field1915 = 0;
        class285.field4916 = false;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILja;Z)V", line = 192)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        field775++;
        if (arg0 == 0) {
            this.field785 = arg1.method501(0);
        } else if (arg0 == 1) {
            this.field778 = arg1.method501(0);
        } else if (arg0 == 2) {
            this.field779 = arg1.method485((byte) -2);
        }
        if (!arg2) {
            field780 = -25;
        }
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(III)V", line = 249)
    public static final void method350(int arg0, int arg1, int arg2) {
        if (arg2 != 2157) {
            method350(94, -115, 99);
        }
        if (class164.field2783 != 0 && arg0 != -1) {
            class61.method539(false, arg0, class164.field2783, 0, class66.field1150, false);
            class283.field4886 = true;
        }
        field787++;
    }
}
