import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class305 extends class447 {

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "Ljava/lang/String;")
    public static String field4190 = "Hidden";

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "[Lbl;")
    public static class387[] field4187 = new class387[14];

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "C")
    private char field4194;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
    public int field4191;

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "Ljava/lang/String;")
    public String field4193;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIILsk;I)V", line = 4)
    public static final void method1942(int arg0, int arg1, int arg2, class369 arg3, int arg4) {
        field4188++;
        if (arg4 != 128) {
            field4196 = -96;
        }
        for (class398 var5 = (class398) class140.field1993.method1312((byte) 25); var5 != null; var5 = (class398) class140.field1993.method1304(-82)) {
            if (var5.field5819 == arg0 && (arg2 * 128) == var5.field5823 && (arg1 * 128) == var5.field5796 && var5.field5803.field5204 == arg3.field5204) {
                if (var5.field5799 != null) {
                    class252.field3467.method852(var5.field5799);
                    var5.field5799 = null;
                }
                if (var5.field5820 != null) {
                    class252.field3467.method852(var5.field5820);
                    var5.field5820 = null;
                }
                var5.method2459(198);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)I", line = 42)
    public static final int method1943(int arg0) {
        field4189++;
        if (arg0 != 11503) {
            field4190 = null;
        }
        return 15;
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)Z", line = 54)
    public final boolean method1944(int arg0) {
        field4195++;
        if (arg0 != -29253) {
            field4190 = null;
        }
        return this.field4194 == 's';
    }

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)V", line = 69)
    public static final void method1945(int arg0) {
        class442.field6400.field5273 = 0;
        field4197++;
        class308.field4231 = 0;
        class91.field1386 = -1;
        class387.field5637 = -1;
        class234.field3188 = -1;
        class326.field4452 = 0;
        class143.field2060 = -1;
        class120.field1712 = 0;
        class393.field5747.field5273 = 0;
        class170.method1147((byte) -106);
        class282.method1829(-1);
        for (int var1 = 0; var1 < class12.field153.length; var1++) {
            if (class12.field153[var1] != null) {
                class12.field153[var1].field915 = -1;
            }
        }
        for (int var2 = 0; var2 < class445.field6422.length; var2++) {
            if (class445.field6422[var2] != null) {
                class445.field6422[var2].field915 = -1;
            }
        }
        class206.method1345(-86);
        class123.field1731 = 1;
        class312.method1977(30, (byte) -73);
        for (int var3 = 0; var3 < 100; var3++) {
            class259.field3553[var3] = true;
        }
        if (arg0 < 99) {
            method1946(-19, 17, 54);
        }
        class298.method1924(11296);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)V", line = 123)
    public static final void method1946(int arg0, int arg1, int arg2) {
        field4198++;
        if (arg2 != 13239) {
            field4190 = null;
        }
        class300.field4147[arg1] = arg0;
        class322 var3 = (class322) class341.field4756.method1412((byte) -54, (long) arg1);
        if (var3 == null) {
            class322 var4 = new class322(4611686018427387905L);
            class341.field4756.method1419((long) arg1, 35, var4);
        } else if (var3.field4417 != 4611686018427387905L) {
            var3.field4417 = class224.method1425(-26805) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BILeb;)V", line = 156)
    private final void method1947(byte arg0, int arg1, class371 arg2) {
        field4186++;
        if (arg1 == 1) {
            this.field4194 = class46.method329(arg2.method2418(-21337), 0);
        } else if (arg1 == 2) {
            this.field4191 = arg2.method2413((byte) -30);
        } else if (arg1 == 5) {
            this.field4193 = arg2.method2422(-1);
        }
        if (arg0 <= 88) {
            this.method1944(103);
        }
    }

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "(I)V", line = 180)
    public static void method1948(int arg0) {
        field4190 = null;
        if (arg0 != -1) {
            method1948(65);
        }
        field4187 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lkq;Ljava/awt/Frame;I)V", line = 196)
    public static final void method1949(class351 arg0, Frame arg1, int arg2) {
        while (true) {
            class295 var3 = arg0.method2248(true, arg1);
            while (var3.field4068 == 0) {
                class4.method28(10L, 125);
            }
            if (var3.field4068 == 1) {
                field4192++;
                arg1.setVisible(false);
                if (arg2 != -1) {
                    method1949((class351) null, (Frame) null, 27);
                }
                arg1.dispose();
                return;
            }
            class4.method28(100L, 67);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Leb;B)V", line = 237)
    public final void method1950(class371 arg0, byte arg1) {
        field4185++;
        while (true) {
            int var3 = arg0.method2429(0);
            if (var3 == 0) {
                if (arg1 > -115) {
                    method1943(-106);
                    return;
                } else {
                    return;
                }
            }
            this.method1947((byte) 121, var3, arg0);
        }
    }
}
