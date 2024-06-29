import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class114 {

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "Lvm;")
    public static class297 field2008 = new class297(2);

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field2009 = 0;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field2012 = 0;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field2010 = 0;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field2013 = 0;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
    public static int field2016 = 2301979;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public static int field2014 = 128;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "Lwi;")
    public static class195 field2011;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "[[[Lmh;")
    public static class271[][][] field2015;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 4)
    public static void method782(int arg0) {
        field2008 = null;
        field2015 = (class271[][][]) null;
        if (arg0 != 2) {
            method783((class138) null, 124, -37, 78);
        }
        field2011 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lng;III)[Lrd;", line = 22)
    public static final class135[] method783(class138 arg0, int arg1, int arg2, int arg3) {
        field2005++;
        if (class83.method611(arg2, 112, arg0, arg3)) {
            if (arg1 != 2301979) {
                field2008 = (class297) null;
            }
            return class92.method680(arg1 - 2300443);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V", line = 53)
    public static final void method784(int arg0) {
        field2007++;
        class270.field4611.method2076(95);
        class19.field261.method2076(92);
        if (arg0 < 39) {
            field2011 = (class195) null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 115)
    public static final void method785(Component arg0, boolean arg1) {
        arg0.removeKeyListener(class233.field3981);
        arg0.removeFocusListener(class233.field3981);
        if (arg1) {
            field2006++;
            class287.field4972 = -1;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZ)V", line = 172)
    public static final void method786(int arg0, boolean arg1) {
        field2004++;
        class185 var2 = (class185) class254.field4355.method1744((byte) 127, (long) arg0);
        if (var2 != null && arg1) {
            var2.method1199(21966);
        }
    }
}
