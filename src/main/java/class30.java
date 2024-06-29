import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class30 {

    @OriginalMember(owner = "client!il", name = "j", descriptor = "Lgl;")
    public class307 field490 = new class307();

    @OriginalMember(owner = "client!il", name = "a", descriptor = "Lph;")
    public static class229 field481 = class266.method1858("leuchten1:", 0);

    @OriginalMember(owner = "client!il", name = "i", descriptor = "Lph;")
    public static class229 field489 = class266.method1858("Benutzen", 0);

    @OriginalMember(owner = "client!il", name = "k", descriptor = "Lph;")
    public static class229 field491 = class266.method1858("b12_full", 0);

    @OriginalMember(owner = "client!il", name = "l", descriptor = "Lph;")
    public static class229 field492 = class266.method1858("Hierhin drehen", 0);

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "Lri;")
    public static class301 field487;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "Lgl;")
    private class307 field494;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "[Lal;")
    public static class142[] field484;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III)V", line = 5)
    public static final void method230(int arg0, int arg1, int arg2) {
        class198.field3304 = true;
        class298.field4848 = arg0;
        class111.field1874 = arg1;
        class7.field98 = arg2;
        class110.field1869 = -1;
        class24.field310 = -1;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)Lgl;", line = 19)
    public final class307 method231(byte arg0) {
        if (arg0 != -75) {
            this.method231((byte) -97);
        }
        field488++;
        class307 var2 = this.field490.field5176;
        if (this.field490 == var2) {
            this.field494 = null;
            return null;
        } else {
            this.field494 = var2.field5176;
            return var2;
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(B)Lgl;", line = 55)
    public final class307 method232(byte arg0) {
        class307 var2 = this.field494;
        field482++;
        if (this.field490 == var2) {
            this.field494 = null;
            return null;
        }
        this.field494 = var2.field5176;
        if (arg0 != 11) {
            this.method232((byte) 93);
        }
        return var2;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BI)V", line = 77)
    public static final void method233(byte arg0, int arg1) {
        field486++;
        if (arg0 <= 84) {
            method236((byte) 68);
        }
        class281 var2 = class135.method957(0, arg1, 6);
        var2.method1933(0);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)I", line = 90)
    public final int method234(int arg0) {
        field483++;
        int var2 = 0;
        for (class307 var3 = this.field490.field5176; var3 != this.field490; var3 = var3.field5176) {
            var2++;
        }
        if (arg0 > -73) {
            method237((byte) 77);
        }
        return var2;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZLgl;)V", line = 111)
    public final void method235(boolean arg0, class307 arg1) {
        if (arg1.field5179 != null) {
            arg1.method2075(6204);
        }
        field493++;
        arg1.field5179 = this.field490.field5179;
        arg1.field5176 = this.field490;
        arg1.field5179.field5176 = arg1;
        arg1.field5176.field5179 = arg1;
        if (arg0) {
            this.method232((byte) 5);
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V", line = 164)
    public class30() {
        this.field490.field5179 = this.field490;
        this.field490.field5176 = this.field490;
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(B)V", line = 147)
    public static void method236(byte arg0) {
        field487 = null;
        field484 = null;
        field491 = null;
        int var1 = -23 % ((arg0 + 54) / 35);
        field481 = null;
        field489 = null;
        field492 = null;
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(B)V", line = 176)
    public static final void method237(byte arg0) {
        if (arg0 != -57) {
            method237((byte) -91);
        }
        if (class145.field2351 == 2) {
            if (class295.field4826 == class18.field248 && class312.field5254 == class136.field2207) {
                class145.field2351 = 0;
                if (class25.field336 && class94.field1583[81] && class314.field5337 > 2) {
                    class108.method832(class314.field5337 - 2, 0);
                } else {
                    class108.method832(class314.field5337 - 1, 0);
                }
            }
        } else if (class48.field697 == class18.field248 && class312.field5254 == class220.field3613) {
            class145.field2351 = 0;
            if (class25.field336 && class94.field1583[81] && class314.field5337 > 2) {
                class108.method832(class314.field5337 - 2, arg0 ^ 0xFFFFFFC7);
            } else {
                class108.method832(class314.field5337 - 1, arg0 + 57);
            }
        } else {
            class295.field4826 = class48.field697;
            class145.field2351 = 2;
            class136.field2207 = class220.field3613;
        }
        field485++;
    }
}
