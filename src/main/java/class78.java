import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class78 {

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "Ltd;")
    public class263 field922 = new class263();

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "Ljava/lang/String;")
    public static String field924 = "";

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "Ltd;")
    private class263 field926;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V", line = 3)
    public static final void method432(int arg0) {
        field919++;
        if (class255.field3680 != null || arg0 != 503) {
            return;
        }
        Container var1;
        if (class272.field3857 == null) {
            var1 = class14.field185.field2685;
        } else {
            var1 = class272.field3857;
        }
        class410.field5896 = var1.getSize().width;
        class282.field3988 = var1.getSize().height;
        if (class272.field3857 == var1) {
            Insets var2 = class272.field3857.getInsets();
            class410.field5896 -= var2.right + var2.left;
            class282.field3988 -= var2.top + var2.bottom;
        }
        if (class26.method180(-107) == 1) {
            class330.field4671 = 765;
            class323.field4601 = (class410.field5896 - 765) / 2;
            class105.field1259 = 503;
            class338.field4800 = 0;
        } else if (class268.field3812 < 96 && class26.field329 == 0) {
            int var3 = class410.field5896 <= 1024 ? class410.field5896 : 1024;
            int var4 = class282.field3988 > 768 ? 768 : class282.field3988;
            class330.field4671 = var3;
            class323.field4601 = (class410.field5896 - var3) / 2;
            class105.field1259 = var4;
            class338.field4800 = 0;
        } else {
            class330.field4671 = class410.field5896;
            class105.field1259 = class282.field3988;
            class323.field4601 = 0;
            class338.field4800 = 0;
        }
        if (class237.field3389 != 0) {
            boolean var10000;
            if (class330.field4671 < 1024 && class105.field1259 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class402.field5767.setSize(class330.field4671, class105.field1259);
        if (class151.field1873 != null) {
            class151.field1873.method631();
        }
        if (class272.field3857 == var1) {
            Insets var5 = class272.field3857.getInsets();
            class402.field5767.setLocation(class323.field4601 + var5.left, class338.field4800 + var5.top);
        } else {
            class402.field5767.setLocation(class323.field4601, class338.field4800);
        }
        if (class248.field3548 != -1) {
            class340.method2185(false, true);
        }
        class237.method1632((byte) 114);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLtd;)V", line = 99)
    public final void method433(byte arg0, class263 arg1) {
        field923++;
        if (arg1.field3749 != null) {
            arg1.method1753(false);
        }
        arg1.field3749 = this.field922.field3749;
        arg1.field3745 = this.field922;
        if (arg0 == 110) {
            arg1.field3749.field3745 = arg1;
            arg1.field3745.field3749 = arg1;
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)Ltd;", line = 119)
    public final class263 method434(int arg0) {
        field921++;
        class263 var2 = this.field926;
        if (this.field922 == var2) {
            this.field926 = null;
            return null;
        }
        this.field926 = var2.field3745;
        if (arg0 != -1) {
            method432(-7);
        }
        return var2;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)Ltd;", line = 141)
    public final class263 method435(boolean arg0) {
        field925++;
        if (arg0) {
            return null;
        }
        class263 var2 = this.field922.field3745;
        if (this.field922 == var2) {
            this.field926 = null;
            return null;
        } else {
            this.field926 = var2.field3745;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V", line = 212)
    public class78() {
        this.field922.field3745 = this.field922;
        this.field922.field3749 = this.field922;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V", line = 175)
    public final void method436(byte arg0) {
        while (true) {
            class263 var2 = this.field922.field3745;
            if (this.field922 == var2) {
                if (arg0 != -110) {
                    this.field922 = null;
                }
                field920++;
                this.field926 = null;
                return;
            }
            var2.method1753(false);
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)V", line = 200)
    public static void method437(byte arg0) {
        int var1 = 68 / ((-arg0 - 57) / 32);
        field924 = null;
    }
}
