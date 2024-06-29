import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class90 extends class147 {

    @OriginalMember(owner = "client!i", name = "o", descriptor = "Ljava/lang/String;")
    public String field1123;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "Lpn;")
    public static class72 field1126 = new class72(79, 4);

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "Lg;")
    public static class470 field1129;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V", line = 4)
    public static final void method452(int arg0) {
        field1125++;
        if (class348.field4961 != null) {
            return;
        }
        Container var1;
        if (class41.field500 == null) {
            var1 = class42.field512.field5106;
        } else {
            var1 = class41.field500;
        }
        class74.field898 = var1.getSize().width;
        class119.field1473 = var1.getSize().height;
        if (class41.field500 == var1) {
            Insets var2 = class41.field500.getInsets();
            class74.field898 -= var2.right + var2.left;
            class119.field1473 -= var2.top + var2.bottom;
        }
        if (class71.method366(80) == 1) {
            class110.field1336 = class48.field629;
            class428.field6173 = 0;
            class464.field6541 = class462.field6513;
            class171.field2020 = (class74.field898 - class48.field629) / 2;
        } else if (class275.field3918 < 96 && class375.field5347 == 0) {
            int var3 = class74.field898 > 1024 ? 1024 : class74.field898;
            class171.field2020 = (class74.field898 - var3) / 2;
            class110.field1336 = var3;
            int var4 = class119.field1473 > 768 ? 768 : class119.field1473;
            class464.field6541 = var4;
            class428.field6173 = 0;
        } else {
            class171.field2020 = 0;
            class428.field6173 = 0;
            class464.field6541 = class119.field1473;
            class110.field1336 = class74.field898;
        }
        if (class414.field5904 != class145.field1754) {
            boolean var10000;
            if (class110.field1336 < 1024 && class464.field6541 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class126.field1542.setSize(class110.field1336, class464.field6541);
        if (class231.field3205 != null) {
            class231.field3205.method1467();
        }
        if (class41.field500 == var1) {
            Insets var5 = class41.field500.getInsets();
            class126.field1542.setLocation(var5.left + class171.field2020, class428.field6173 + var5.top);
        } else {
            class126.field1542.setLocation(class171.field2020, class428.field6173);
        }
        if (class57.field725 != -1) {
            class418.method2486(true, false);
        }
        if (arg0 <= 5) {
            field1126 = null;
        }
        class85.method435(-1);
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(B)V", line = 101)
    public static void method453(byte arg0) {
        field1129 = null;
        field1126 = null;
        if (arg0 != 52) {
            field1129 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(B)V", line = 112)
    public static final void method454(byte arg0) {
        class388[] var1 = class36.field442;
        synchronized (class36.field442) {
            if (arg0 < 54) {
                method455(111, -21);
            }
            int var2 = 0;
            while (true) {
                if (class36.field442.length <= var2) {
                    break;
                }
                class36.field442[var2] = new class388();
                class94.field1178[var2] = 0;
                var2++;
            }
        }
        field1128++;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V", line = 137)
    public static final void method455(int arg0, int arg1) {
        field1127++;
        class89 var2 = class146.method695(12, arg0, (byte) -68);
        if (arg1 < -104) {
            var2.method448(13);
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V", line = 151)
    public class90() {
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 160)
    public class90(String arg0, int arg1) {
        this.field1123 = arg0;
    }
}
