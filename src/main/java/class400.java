import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class400 extends class435 {

    @OriginalMember(owner = "client!or", name = "t", descriptor = "I")
    public static int field5777 = -1;

    @OriginalMember(owner = "client!or", name = "A", descriptor = "I")
    public static int field5784 = 0;

    @OriginalMember(owner = "client!or", name = "J", descriptor = "Lwea;")
    public static class90 field5793 = new class90();

    @OriginalMember(owner = "client!or", name = "q", descriptor = "I")
    public static int field5774;

    @OriginalMember(owner = "client!or", name = "v", descriptor = "I")
    public static int field5779;

    @OriginalMember(owner = "client!or", name = "w", descriptor = "I")
    public int field5780;

    @OriginalMember(owner = "client!or", name = "y", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!or", name = "B", descriptor = "I")
    public int field5785;

    @OriginalMember(owner = "client!or", name = "C", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!or", name = "D", descriptor = "I")
    public int field5787;

    @OriginalMember(owner = "client!or", name = "E", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!or", name = "F", descriptor = "I")
    public int field5789;

    @OriginalMember(owner = "client!or", name = "H", descriptor = "I")
    public int field5791;

    @OriginalMember(owner = "client!or", name = "I", descriptor = "I")
    public int field5792;

    @OriginalMember(owner = "client!or", name = "s", descriptor = "Lis;")
    public class101 field5776;

    @OriginalMember(owner = "client!or", name = "z", descriptor = "Lis;")
    public class101 field5783;

    @OriginalMember(owner = "client!or", name = "x", descriptor = "Lvo;")
    public static class345 field5781;

    @OriginalMember(owner = "client!or", name = "r", descriptor = "Ljava/lang/String;")
    public String field5775;

    @OriginalMember(owner = "client!or", name = "u", descriptor = "Z")
    public boolean field5778;

    @OriginalMember(owner = "client!or", name = "G", descriptor = "[Ljava/lang/Object;")
    public Object[] field5790;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V", line = 4)
    public static void method2427(boolean arg0) {
        field5781 = null;
        field5793 = null;
        if (arg0) {
            method2427(true);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(II)V", line = 19)
    public static final void method2428(int arg0, int arg1) {
        field5786++;
        class136.field2184 = arg1;
        class117 var2 = class691.field9789;
        synchronized (class691.field9789) {
            class691.field9789.method936(-34);
        }
        if (arg0 != -17979) {
            field5777 = -58;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)Lep;", line = 37)
    public static final class449 method2429(int arg0) {
        if (arg0 <= 39) {
            method2432(15, (byte) -37);
        }
        field5782++;
        class449 var1 = (class449) class223.field3337.method2112((byte) 125);
        if (var1 != null) {
            var1.method2549((byte) 106);
            var1.method1113(32730);
            return var1;
        }
        class449 var2;
        do {
            var2 = (class449) class693.field9846.method2112((byte) 123);
            if (var2 == null) {
                return null;
            }
            if (var2.method2617(0) > class254.method1619(true)) {
                return null;
            }
            var2.method2549((byte) 40);
            var2.method1113(32730);
        } while ((Long.MIN_VALUE & var2.field2469) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(II)I", line = 81)
    public static final int method2430(int arg0, int arg1) {
        field5774++;
        int var2 = 1 % ((arg1 - 7) / 38);
        int var3 = arg0 & 0x3F;
        int var4 = (arg0 & 0xE5) >> 6;
        if (var3 == 18) {
            if (var4 == 0) {
                return 1;
            }
            if (var4 == 1) {
                return 2;
            }
            if (var4 == 2) {
                return 4;
            }
            if (var4 == 3) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (var4 == 0) {
                return 16;
            }
            if (var4 == 1) {
                return 32;
            }
            if (var4 == 2) {
                return 64;
            }
            if (var4 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(IB)V", line = 136)
    public static final void method2431(int arg0, byte arg1) {
        field5779++;
        if (arg1 < 9) {
            field5793 = null;
        }
        class69.field1096 = arg0;
        class117 var2 = class45.field602;
        synchronized (class45.field602) {
            class45.field602.method936(-55);
        }
        class117 var3 = class603.field8668;
        synchronized (class603.field8668) {
            class603.field8668.method936(-41);
        }
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(IB)V", line = 174)
    public static final void method2432(int arg0, byte arg1) {
        class681.field9691.method939(arg1 + 28209, arg0);
        if (arg1 != -116) {
            method2429(2);
        }
        field5788++;
    }
}
