import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class230 {

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "Lck;")
    private class97 field3774;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "Lja;")
    private class264 field3777;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "Lbc;")
    private class7 field3785;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "Ltl;")
    public static class59 field3773 = class85.method639("; Expires=", 9588);

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "F")
    public static float field3778;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "Ls;")
    private class170 field3788;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "[Lwg;")
    private class233[] field3782;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "[[B")
    public static byte[][] field3784;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "[[[B")
    public static byte[][][] field3780;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 5)
    public final void method1607(int arg0) {
        field3783++;
        if (this.field3782 == null || arg0 != -30963) {
            return;
        }
        for (int var2 = 0; var2 < this.field3782.length; var2++) {
            if (this.field3782[var2] != null) {
                this.field3782[var2].method1631((byte) -1);
            }
        }
        for (int var3 = 0; var3 < this.field3782.length; var3++) {
            if (this.field3782[var3] != null) {
                this.field3782[var3].method1634(2001);
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ltg;ILtg;B)Lwg;", line = 45)
    public final class233 method1608(class154 arg0, int arg1, class154 arg2, byte arg3) {
        field3781++;
        if (arg3 >= -114) {
            method1610((byte) 51);
        }
        return this.method1612((byte) -30, true, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)Z", line = 56)
    public final boolean method1609(boolean arg0) {
        if (arg0) {
            this.method1608((class154) null, 4, (class154) null, (byte) 125);
        }
        field3789++;
        if (this.field3788 != null) {
            return true;
        }
        if (this.field3785 == null) {
            if (this.field3774.method745((byte) -26)) {
                return false;
            }
            this.field3785 = this.field3774.method736(255, true, 255, (byte) 0, -2);
        }
        if (this.field3785.field1577) {
            return false;
        } else {
            this.field3788 = new class170(this.field3785.method53(117));
            this.field3782 = new class233[(this.field3788.field2758.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V", line = 94)
    public static void method1610(byte arg0) {
        field3784 = (byte[][]) null;
        field3780 = (byte[][][]) null;
        if (arg0 == -96) {
            field3773 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)V", line = 107)
    public static final void method1611(int arg0, int arg1, int arg2) {
        field3776++;
        if (arg1 == 5) {
            class259.field4327 = class167.field2711[arg0][arg2].field2475;
            class137.field2260 = class167.field2711[arg0][arg2].field2454;
            class198.field3293 = class167.field2711[arg0][arg2].field2480;
            class141.method1024((float) class259.field4327, (float) class137.field2260, (float) class198.field3293);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BZLtg;ILtg;)Lwg;", line = 140)
    private final class233 method1612(byte arg0, boolean arg1, class154 arg2, int arg3, class154 arg4) {
        field3786++;
        if (this.field3788 == null) {
            throw new RuntimeException();
        }
        this.field3788.field2787 = arg3 * 8 + 5;
        if (this.field3788.field2758.length <= this.field3788.field2787) {
            throw new RuntimeException();
        } else if (this.field3782[arg3] == null) {
            int var6 = this.field3788.method1233((byte) -77);
            int var7 = this.field3788.method1233((byte) -77);
            class233 var8 = new class233(arg3, arg4, arg2, this.field3774, this.field3777, var6, var7, arg1);
            this.field3782[arg3] = var8;
            if (arg0 != -30) {
                this.method1609(true);
            }
            return var8;
        } else {
            return this.field3782[arg3];
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lck;Lja;)V", line = 177)
    public class230(class97 arg0, class264 arg1) {
        this.field3774 = arg0;
        this.field3777 = arg1;
        if (!this.field3774.method745((byte) -26)) {
            this.field3785 = this.field3774.method736(255, true, 255, (byte) 0, -2);
        }
    }
}
