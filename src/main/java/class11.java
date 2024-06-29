import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class11 {

    @OriginalMember(owner = "client!b", name = "e", descriptor = "Lbh;")
    private class19 field199 = new class19();

    @OriginalMember(owner = "client!b", name = "q", descriptor = "Lle;")
    private class104 field211 = new class104();

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    private int field216;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    private int field214;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "Ld;")
    private class29 field212;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "[Lsd;")
    public static class166[] field197 = new class166[500];

    @OriginalMember(owner = "client!b", name = "g", descriptor = "Lvd;")
    public static class193 field201 = null;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "Lsd;")
    public static class166 field208 = class135.method935("Clientscript error in: ", 0);

    @OriginalMember(owner = "client!b", name = "d", descriptor = "Lsd;")
    public static class166 field198 = null;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "Lsd;")
    public static class166 field210 = class135.method935("Passwort: ", 0);

    @OriginalMember(owner = "client!b", name = "j", descriptor = "Lsd;")
    private static class166 field204 = class135.method935("Members only world", 0);

    @OriginalMember(owner = "client!b", name = "f", descriptor = "Lsd;")
    public static class166 field200 = field204;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "Lqe;")
    public static class149 field206;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "Lcb;")
    public static class22 field213;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)Lod;")
    public final class130 method63(byte arg0) {
        field205++;
        int var2 = 112 % ((-arg0 - 59) / 53);
        return this.field212.method222(-89);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BJ)Lbh;")
    public final class19 method64(byte arg0, long arg1) {
        field203++;
        class19 var4 = (class19) this.field212.method224(-1, arg1);
        if (var4 != null) {
            this.field211.method780(var4, arg0 ^ 0x257F);
        }
        return arg0 == 28 ? var4 : null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lvd;I)Z")
    public static final boolean method65(class193 arg0, int arg1) {
        field195++;
        if (arg1 != -1) {
            method69((byte) -26);
        }
        if (class8.field163) {
            if (class140.method955(arg1 ^ 0x43, arg0) != 0) {
                return false;
            }
            if (arg0.field3797 == 0) {
                return false;
            }
        }
        return arg0.field3750;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public static final void method66(int arg0) {
        class109.field2120 = null;
        class5.field114 = null;
        if (arg0 != 90) {
            method69((byte) -43);
        }
        class157.field3006 = null;
        field196++;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lbh;IJ)V")
    public final void method67(class19 arg0, int arg1, long arg2) {
        if (arg1 != 15266) {
            method65(null, 96);
        }
        field209++;
        if (this.field216 == 0) {
            class19 var5 = this.field211.method779((byte) -85);
            var5.method915(0);
            var5.method116(256);
            if (this.field199 == var5) {
                class19 var6 = this.field211.method779((byte) -85);
                var6.method915(0);
                var6.method116(arg1 ^ 0x3AA2);
            }
        } else {
            this.field216--;
        }
        this.field212.method216(arg0, 12682, arg2);
        this.field211.method780(arg0, 9571);
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)Lod;")
    public final class130 method68(int arg0) {
        if (arg0 == -51) {
            field202++;
            return this.field212.method221(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V")
    public static void method69(byte arg0) {
        field208 = null;
        field201 = null;
        if (arg0 <= 6) {
            method66(-41);
        }
        field210 = null;
        field204 = null;
        field200 = null;
        field198 = null;
        field206 = null;
        field197 = null;
        field213 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IJ)V")
    public final void method70(int arg0, long arg1) {
        class19 var4 = (class19) this.field212.method224(arg0 - 1, arg1);
        if (arg0 != 0) {
            field204 = null;
        }
        field207++;
        if (var4 != null) {
            var4.method915(arg0);
            var4.method116(256);
            this.field216++;
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
    public final void method71(int arg0) {
        if (arg0 != 500) {
            this.field211 = null;
        }
        while (true) {
            class19 var2 = this.field211.method779((byte) -85);
            if (var2 == null) {
                this.field216 = this.field214;
                field215++;
                return;
            }
            var2.method915(0);
            var2.method116(256);
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(I)V")
    public class11(int arg0) {
        this.field216 = arg0;
        this.field214 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field212 = new class29(var2);
    }
}
