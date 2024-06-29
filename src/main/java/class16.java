import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class16 {

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "Lmg;")
    public class117 field272 = new class117();

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "Lmg;")
    private class117 field278;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "[I")
    public static int[] field270;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)Lmg;", line = 5)
    public final class117 method93(byte arg0) {
        class117 var2 = this.field272.field1659;
        if (arg0 >= -18) {
            return (class117) null;
        }
        field273++;
        if (this.field272 == var2) {
            this.field278 = null;
            return null;
        } else {
            this.field278 = var2.field1659;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)Lmg;", line = 29)
    public final class117 method94(boolean arg0) {
        field266++;
        class117 var2 = this.field272.field1657;
        if (arg0) {
            field270 = (int[]) null;
        }
        if (this.field272 == var2) {
            this.field278 = null;
            return null;
        } else {
            this.field278 = var2.field1657;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V", line = 53)
    public final void method95(int arg0) {
        while (true) {
            class117 var2 = this.field272.field1659;
            if (this.field272 == var2) {
                this.field278 = null;
                field263++;
                if (arg0 != -30123) {
                    this.field278 = (class117) null;
                }
                return;
            }
            var2.method876(8);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(III)V", line = 72)
    public static final void method96(int arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            method98(false);
        }
        class95 var3 = class227.method1699(1, arg2 - 1855723171, arg0);
        var3.method738((byte) -117);
        field276++;
        var3.field1328 = arg1;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)Lmg;", line = 89)
    public final class117 method97(int arg0) {
        field275++;
        class117 var2 = this.field278;
        if (this.field272 == var2) {
            this.field278 = null;
            return null;
        } else if (arg0 >= -49) {
            return (class117) null;
        } else {
            this.field278 = var2.field1659;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(Z)V", line = 112)
    public static void method98(boolean arg0) {
        if (!arg0) {
            field270 = null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lmg;B)V", line = 122)
    public final void method99(class117 arg0, byte arg1) {
        if (arg1 != 33) {
            method98(false);
        }
        if (arg0.field1657 != null) {
            arg0.method876(8);
        }
        arg0.field1659 = this.field272.field1659;
        arg0.field1657 = this.field272;
        arg0.field1657.field1659 = arg0;
        arg0.field1659.field1657 = arg0;
        field267++;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)V", line = 143)
    public static final void method100(int arg0, int arg1) {
        class121.field1697.method464(3398, arg0);
        field268++;
        if (arg1 != 1) {
            method103(-89, -110);
        }
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)Lai;", line = 157)
    public static final class331 method101(int arg0) {
        field265++;
        if (arg0 != -1) {
            method103(75, 39);
        }
        try {
            return (class331) Class.forName("l").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)Lmg;", line = 181)
    public final class117 method102(byte arg0) {
        field271++;
        class117 var2 = this.field272.field1659;
        if (this.field272 == var2) {
            return null;
        }
        if (arg0 != -40) {
            method101(95);
        }
        var2.method876(8);
        return var2;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)V", line = 201)
    public static final void method103(int arg0, int arg1) {
        class68.field994 = 100;
        class41.field596 = -1;
        class209.field3047 = arg0;
        field264++;
        if (arg1 != 1) {
            method96(-73, -49, 19);
        }
        class107.field1528 = 3;
    }

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "(I)Lmg;", line = 220)
    public final class117 method104(int arg0) {
        if (arg0 != 1) {
            field277 = -109;
        }
        field274++;
        class117 var2 = this.field278;
        if (this.field272 == var2) {
            this.field278 = null;
            return null;
        } else {
            this.field278 = var2.field1657;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "(I)Z", line = 242)
    public final boolean method105(int arg0) {
        if (arg0 != 25459) {
            this.method102((byte) -33);
        }
        field269++;
        return this.field272.field1659 == this.field272;
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "()V", line = 280)
    public class16() {
        this.field272.field1657 = this.field272;
        this.field272.field1659 = this.field272;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lmg;I)V", line = 258)
    public final void method106(class117 arg0, int arg1) {
        if (arg0.field1657 != null) {
            arg0.method876(8);
        }
        if (arg1 >= -125) {
            return;
        }
        arg0.field1659 = this.field272;
        arg0.field1657 = this.field272.field1657;
        field279++;
        arg0.field1657.field1659 = arg0;
        arg0.field1659.field1657 = arg0;
    }
}
