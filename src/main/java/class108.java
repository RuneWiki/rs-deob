import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class108 extends class147 {

    @OriginalMember(owner = "client!jd", name = "I", descriptor = "Lqj;")
    public static class196 field1545 = class80.method502("headicons_pk", -48);

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!jd", name = "K", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!jd", name = "L", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!jd", name = "M", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!jd", name = "N", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!jd", name = "J", descriptor = "Ldf;")
    private class231 field1546;

    @OriginalMember(owner = "client!jd", name = "O", descriptor = "Log;")
    public static class38 field1551;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjava/awt/Component;BLlj;I)Lgh;")
    public static final class168 method647(int arg0, Component arg1, byte arg2, class205 arg3, int arg4) {
        field1543++;
        if (class216.field3884 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class168 var5 = (class168) Class.forName("th").getDeclaredConstructor().newInstance();
                var5.field2843 = arg4;
                var5.field2826 = new int[(class165.field2715 ? 2 : 1) * 256];
                var5.method680(arg1);
                var5.field2836 = (arg4 & -1024) + 1024;
                if (var5.field2836 > 16384) {
                    var5.field2836 = 16384;
                }
                var5.method678(var5.field2836);
                if (class61.field817 > 0 && class1.field13 == null) {
                    class1.field13 = new class24();
                    class1.field13.field307 = arg3;
                    arg3.method1398(class61.field817, 0, class1.field13);
                }
                if (arg2 != -51) {
                    return null;
                }
                if (class1.field13 != null) {
                    if (class1.field13.field304[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class1.field13.field304[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class121 var6 = new class121(arg3, arg0);
                    var6.field2843 = arg4;
                    var6.field2826 = new int[(class165.field2715 ? 2 : 1) * 256];
                    var6.method680(arg1);
                    var6.field2836 = 16384;
                    var6.method678(var6.field2836);
                    if (class61.field817 > 0 && class1.field13 == null) {
                        class1.field13 = new class24();
                        class1.field13.field307 = arg3;
                        arg3.method1398(class61.field817, 0, class1.field13);
                    }
                    if (class1.field13 != null) {
                        if (class1.field13.field304[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class1.field13.field304[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class168();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZI)I")
    public final int method648(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return -64;
        }
        field1550++;
        if (this.field1546 == null) {
            return arg0;
        } else {
            class206 var4 = (class206) this.field1546.method1551(32768, (long) arg2);
            return var4 == null ? arg0 : var4.field3702;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILqj;)Lqj;")
    public final class196 method649(int arg0, int arg1, class196 arg2) {
        field1542++;
        if (this.field1546 == null) {
            return arg2;
        }
        class11 var4 = (class11) this.field1546.method1551(32768, (long) arg0);
        if (arg1 != 2005) {
            this.method648(-119, false, 91);
        }
        return var4 == null ? arg2 : var4.field126;
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)V")
    public static final void method650(int arg0) {
        field1548++;
        if (arg0 != 23789) {
            return;
        }
        if (class9.field103 != -1) {
            class149.method936(class9.field103, -1);
        }
        for (int var1 = 0; var1 < class46.field555; var1++) {
            if (class161.field2588[var1]) {
                class86.field1271[var1] = true;
            }
            class149.field2388[var1] = class161.field2588[var1];
            class161.field2588[var1] = false;
        }
        class99.field1424 = class171.field2879;
        class80.field1159 = null;
        class65.field917 = -1;
        class60.field799 = -1;
        if (class9.field103 != -1) {
            class46.field555 = 0;
            class171.method1116(0, 0, 0, class9.field103, -1, class61.field815, class249.field4407, (byte) -65, 0);
        }
        class55.method287();
        class113.field1658 = 0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lp;B)V")
    public final void method651(class56 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method367(1);
            if (var3 == 0) {
                field1549++;
                if (arg1 != -98) {
                    this.method653(-2, -3, null);
                    return;
                }
                return;
            }
            this.method653(var3, 1, arg0);
        }
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)V")
    public static void method652(byte arg0) {
        field1545 = null;
        field1551 = null;
        if (arg0 != -26) {
            method652((byte) -96);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILp;)V")
    private final void method653(int arg0, int arg1, class56 arg2) {
        field1544++;
        if (arg1 != 1 || arg0 != 249) {
            return;
        }
        int var4 = arg2.method367(arg1);
        if (this.field1546 == null) {
            int var5 = class251.method1697(var4, true);
            this.field1546 = new class231(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg2.method367(1) == 1;
            int var8 = arg2.method328(-1974);
            class130 var9;
            if (var7) {
                var9 = new class11(arg2.method326(true));
            } else {
                var9 = new class206(arg2.method311(arg1 ^ 0x1));
            }
            this.field1546.method1552(var9, (long) var8, 0);
        }
    }
}
