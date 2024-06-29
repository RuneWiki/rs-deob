import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class322 extends class93 {

    @OriginalMember(owner = "client!un", name = "t", descriptor = "Lic;")
    public static class329 field4726 = new class329(16);

    @OriginalMember(owner = "client!un", name = "u", descriptor = "Lwf;")
    public static class333 field4727 = null;

    @OriginalMember(owner = "client!un", name = "v", descriptor = "[I")
    public static int[] field4728 = new int[100];

    @OriginalMember(owner = "client!un", name = "y", descriptor = "I")
    public static int field4731 = 0;

    @OriginalMember(owner = "client!un", name = "w", descriptor = "[I")
    public static int[] field4729 = new int[5];

    @OriginalMember(owner = "client!un", name = "z", descriptor = "[S")
    public static short[] field4732 = new short[256];

    @OriginalMember(owner = "client!un", name = "r", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!un", name = "s", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!un", name = "x", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(I)V", line = 6)
    public static void method2227(int arg0) {
        field4726 = null;
        field4732 = null;
        if (arg0 >= -27) {
            field4726 = (class329) null;
        }
        field4727 = null;
        field4728 = null;
        field4729 = null;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(BI)Z", line = 34)
    public static final boolean method2228(byte arg0, int arg1) {
        class107.field1386 = arg1 + 1 & 0xFFFF;
        class360.field5625 = true;
        if (arg0 != -14) {
            field4730 = 35;
        }
        field4725++;
        return true;
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(B)V", line = 49)
    public static final void method2229(byte arg0) {
        field4724++;
        if (class318.field4688 == 0) {
            return;
        }
        try {
            int var1 = 102 % ((arg0 - 16) / 57);
            if (++class226.field3251 > 2000) {
                if (class265.field3848 != null) {
                    class265.field3848.method526(-19055);
                    class265.field3848 = null;
                }
                if (class145.field2025 >= 1) {
                    class210.field2970 = -5;
                    class318.field4688 = 0;
                    return;
                }
                class226.field3251 = 0;
                class318.field4688 = 1;
                class145.field2025++;
                if (class238.field3441 == class170.field2360) {
                    class238.field3441 = class331.field4941;
                } else {
                    class238.field3441 = class170.field2360;
                }
            }
            if (class318.field4688 == 1) {
                class236.field3406 = class157.field2216.method505(19, class167.field2336, class238.field3441);
                class318.field4688 = 2;
            }
            if (class318.field4688 == 2) {
                if (class236.field3406.field2608 == 2) {
                    throw new IOException();
                }
                if (class236.field3406.field2608 != 1) {
                    return;
                }
                class265.field3848 = new class71((Socket) class236.field3406.field2606, class157.field2216);
                class236.field3406 = null;
                class265.field3848.method530(0, class251.field3681.field4350, class251.field3681.field4351, 30000);
                if (class335.field5234 != null) {
                    class335.field5234.method2458(2);
                }
                if (class328.field4801 != null) {
                    class328.field4801.method2458(2);
                }
                int var2 = class265.field3848.method528(true);
                if (class335.field5234 != null) {
                    class335.field5234.method2458(2);
                }
                if (class328.field4801 != null) {
                    class328.field4801.method2458(2);
                }
                if (var2 != 21) {
                    class210.field2970 = var2;
                    class318.field4688 = 0;
                    class265.field3848.method526(-19055);
                    class265.field3848 = null;
                    return;
                }
                class318.field4688 = 3;
            }
            if (class318.field4688 == 3) {
                if (class265.field3848.method524((byte) 96) < 1) {
                    return;
                }
                class3.field31 = new String[class265.field3848.method528(true)];
                class318.field4688 = 4;
            }
            if (class318.field4688 == 4) {
                if (class265.field3848.method524((byte) 81) < class3.field31.length * 8) {
                    return;
                }
                class240.field3490.field4351 = 0;
                class265.field3848.method522(0, class240.field3490.field4350, class3.field31.length * 8, (byte) 77);
                for (int var3 = 0; var3 < class3.field31.length; var3++) {
                    class3.field31[var3] = class92.method667(0, class240.field3490.method2089((byte) 114));
                }
                class318.field4688 = 0;
                class210.field2970 = 21;
                class265.field3848.method526(-19055);
                class265.field3848 = null;
                return;
            }
        } catch (IOException var5) {
            if (class265.field3848 != null) {
                class265.field3848.method526(-19055);
                class265.field3848 = null;
            }
            if (class145.field2025 >= 1) {
                class318.field4688 = 0;
                class210.field2970 = -4;
            } else {
                class226.field3251 = 0;
                class318.field4688 = 1;
                if (class238.field3441 == class170.field2360) {
                    class238.field3441 = class331.field4941;
                } else {
                    class238.field3441 = class170.field2360;
                }
                class145.field2025++;
            }
        }
    }
}
