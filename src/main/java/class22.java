import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class22 {

    @OriginalMember(owner = "client!an", name = "a", descriptor = "Lvda;")
    private class164 field546 = new class164();

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!an", name = "i", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!an", name = "j", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!an", name = "k", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!an", name = "m", descriptor = "Lvda;")
    private class164 field558;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)Lvda;")
    public final class164 method344(byte arg0) {
        field550++;
        class164 var2 = this.field558;
        if (this.field546 == var2) {
            this.field558 = null;
            return null;
        }
        this.field558 = var2.field2003;
        if (arg0 != 24) {
            this.method353(33);
        }
        return var2;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lvda;I)V")
    public final void method345(class164 arg0, int arg1) {
        if (arg0.field2002 != null) {
            arg0.method1037(arg1 - 67);
        }
        if (arg1 != -1) {
            field548 = 77;
        }
        field555++;
        arg0.field2003 = this.field546;
        arg0.field2002 = this.field546.field2002;
        arg0.field2002.field2003 = arg0;
        arg0.field2003.field2002 = arg0;
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(B)V")
    public static final void method346(byte arg0) {
        if (arg0 > -4) {
            field548 = -65;
        }
        class231.field3009.method2778((byte) 117);
        field547++;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)Lvda;")
    public final class164 method347(int arg0) {
        field549++;
        class164 var2 = this.field546.field2003;
        if (arg0 != 0) {
            this.method345(null, -9);
        }
        if (this.field546 == var2) {
            this.field558 = null;
            return null;
        } else {
            this.field558 = var2.field2003;
            return var2;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BLvda;)V")
    public final void method348(byte arg0, class164 arg1) {
        field557++;
        if (arg1.field2002 != null) {
            arg1.method1037(-98);
        }
        arg1.field2003 = this.field546.field2003;
        arg1.field2002 = this.field546;
        if (arg0 < 54) {
            method346((byte) -16);
        }
        arg1.field2002.field2003 = arg1;
        arg1.field2003.field2002 = arg1;
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(B)Lvda;")
    public final class164 method349(byte arg0) {
        field554++;
        class164 var2 = this.field546.field2002;
        if (this.field546 == var2) {
            return null;
        } else {
            var2.method1037(-117);
            return arg0 < 76 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!an", name = "d", descriptor = "(B)I")
    public final int method350(byte arg0) {
        field551++;
        if (arg0 < 53) {
            this.field558 = null;
        }
        int var2 = 0;
        for (class164 var3 = this.field546.field2003; var3 != this.field546; var3 = var3.field2003) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(I)V")
    public static final void method351(int arg0) {
        class432.field6201 = -1;
        class147.field1798 = -1;
        class301.field4043 = 0;
        field553++;
        class172.field2099 = -1;
        if (arg0 > -71) {
            field548 = -42;
        }
    }

    @OriginalMember(owner = "client!an", name = "e", descriptor = "(B)Lvda;")
    public final class164 method352(byte arg0) {
        field552++;
        class164 var2 = this.field546.field2003;
        if (this.field546 == var2) {
            return null;
        } else {
            var2.method1037(-99);
            return arg0 == 115 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V")
    public class22() {
        this.field546.field2002 = this.field546;
        this.field546.field2003 = this.field546;
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(I)V")
    public final void method353(int arg0) {
        field556++;
        while (true) {
            class164 var2 = this.field546.field2003;
            if (this.field546 == var2) {
                if (arg0 == 0) {
                    this.field558 = null;
                    return;
                } else {
                    return;
                }
            }
            var2.method1037(-122);
        }
    }
}
