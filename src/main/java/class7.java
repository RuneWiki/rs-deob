import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class7 {

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "J")
    public long field154 = 0L;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "Lia;")
    public static class257 field145 = class28.method234(121, "::fps ");

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "Lia;")
    public static class257 field152 = class28.method234(81, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "Lia;")
    public static class257 field143 = class28.method234(103, "<)4col> x");

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field153 = 0;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "Lia;")
    public static class257 field146 = class28.method234(-12, "Hidden)2");

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public int field144;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public int field148;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    public int field150;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
    public int field155;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
    public int field157;

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
    public int field158;

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "I")
    public int field159;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "Lij;")
    public class166 field147;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "Lij;")
    public class166 field156;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public static void method106(int arg0) {
        field143 = null;
        field146 = null;
        field152 = null;
        field145 = null;
        if (arg0 != 22) {
            method106(38);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public static final void method107(Component arg0, boolean arg1) {
        field149++;
        if (arg1) {
            field153 = 58;
        }
        arg0.removeMouseListener(class152.field2635);
        arg0.removeMouseMotionListener(class152.field2635);
        arg0.removeFocusListener(class152.field2635);
        class24.field470 = 0;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lk;Z)V")
    public static final void method108(class152 arg0, boolean arg1) {
        field151++;
        if (!arg1) {
            field145 = null;
        }
        if (arg0.field2638.length - arg0.field2677 < 1) {
            return;
        }
        int var2 = arg0.method1051((byte) 84);
        if (var2 < 0 || var2 > 2) {
            return;
        }
        byte var3;
        if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (arg0.field2638.length - arg0.field2677 < var3) {
            return;
        }
        class30.field566 = arg0.method1051((byte) 83);
        if (class30.field566 < 1) {
            class30.field566 = 1;
        } else if (class30.field566 > 4) {
            class30.field566 = 4;
        }
        class133.method925((byte) -18, arg0.method1051((byte) 100) == 1);
        class72.field1409 = arg0.method1051((byte) 100) == 1;
        class133.field2387 = arg0.method1051((byte) -106) == 1;
        class2.field62 = arg0.method1051((byte) 92) == 1;
        class204.field3503 = arg0.method1051((byte) 110) == 1;
        class169.field2918 = arg0.method1051((byte) -107) == 1;
        class152.field2649 = arg0.method1051((byte) 123) == 1;
        class19.field399 = arg0.method1051((byte) -111) == 1;
        class25.field488 = arg0.method1051((byte) -101);
        if (class25.field488 > 2) {
            class25.field488 = 2;
        }
        if (var2 >= 2) {
            class209.field3573 = arg0.method1051((byte) 114) == 1;
        } else {
            class209.field3573 = arg0.method1051((byte) 90) == 1;
            arg0.method1051((byte) 109);
        }
        class179.field3093 = arg0.method1051((byte) -86) == 1;
        class81.field1574 = arg0.method1051((byte) -35) == 1;
        class238.field4089 = arg0.method1051((byte) 91);
        if (class238.field4089 > 2) {
            class238.field4089 = 2;
        }
        class2.field45 = arg0.method1051((byte) -77) == 1;
        class38.field747 = arg0.method1051((byte) 114);
        if (class38.field747 > 127) {
            class38.field747 = 127;
        }
        class26.field513 = arg0.method1051((byte) 91);
        class99.field1830 = arg0.method1051((byte) -61);
        if (class99.field1830 > 127) {
            class99.field1830 = 127;
        }
        if (var2 >= 1) {
            class115.field2080 = arg0.method1063(-17162);
            class115.field2070 = arg0.method1063(-17162);
        }
    }
}
