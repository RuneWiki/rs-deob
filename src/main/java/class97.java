import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class97 {

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field1928 = 0;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field1926 = 0;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "[I")
    public static int[] field1932 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field1929 = 0;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public int field1920;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public int field1921;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public int field1923;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public int field1925;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "J")
    public long field1934;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "Leh;")
    public class80 field1924;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "Leh;")
    public class80 field1927;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "Leh;")
    public class80 field1933;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "Ljd;")
    public static class86 field1931;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILig;III)V")
    public static final void method704(int arg0, int arg1, int arg2, class9 arg3, int arg4, int arg5, int arg6) {
        long var7 = 0L;
        if (arg5 != -13591) {
            method706((byte) -64);
        }
        field1922++;
        boolean var9 = false;
        if (arg2 == 0) {
            var7 = class5.method30(arg0, arg6, arg4);
        } else if (arg2 == 1) {
            var7 = class139.method993(arg0, arg6, arg4);
        } else if (arg2 == 2) {
            var7 = class215.method1525(arg0, arg6, arg4);
        } else if (arg2 == 3) {
            var7 = class218.method1537(arg0, arg6, arg4);
        }
        boolean var10 = false;
        int var11 = (int) var7 >> 20 & 0x3;
        int var12 = (int) var7 >> 14 & 0x1F;
        boolean var13 = true;
        int var14 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        class117 var15 = class268.method1845(var14, (byte) -107);
        if (var15.method832(arg5 ^ 0xFFFFCA8D)) {
            class260.method1779(arg4, arg6, (byte) -111, var15, arg0);
        }
        if (var7 == 0L) {
            return;
        }
        if (arg2 == 0) {
            class37.method290(arg0, arg6, arg4);
            if (var15.field2288 != 0) {
                arg3.method65(arg6, var15.field2281, arg4, (byte) 57, var12, var11);
                return;
            }
        } else if (arg2 == 1) {
            class158.method1149(arg0, arg6, arg4);
        } else if (arg2 == 2) {
            class75.method541(arg0, arg6, arg4);
            if (var15.field2288 != 0 && (var15.field2307 + arg6) < 104 && (arg4 + var15.field2307) < 104 && var15.field2273 + arg6 < 104 && var15.field2273 + arg4 < 104) {
                arg3.method59(arg4, var15.field2307, arg6, var15.field2281, var11, var15.field2273, arg5 + 13591);
                return;
            }
            return;
        } else if (arg2 == 3) {
            class190.method1308(arg0, arg6, arg4);
            if (var15.field2288 == 1) {
                arg3.method75(arg6, arg4, -262145);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/Object;Lof;I)V")
    public static final void method705(Object arg0, class254 arg1, int arg2) {
        field1930++;
        if (arg1.field4508 == null) {
            return;
        }
        if (arg2 != -4367) {
            method707(91);
        }
        for (int var3 = 0; var3 < 50 && arg1.field4508.peekEvent() != null; var3++) {
            class91.method677(0, 1L);
        }
        if (arg0 != null) {
            arg1.field4508.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public static final void method706(byte arg0) {
        class195.field3506 = false;
        class116.field2234 = -1;
        class16.field463 = 0;
        class112.field2143 = 0;
        class36.field809.field3565 = 0;
        class133.field2514 = 0;
        class186.field3299 = 0;
        class255.field4539 = -1;
        class168.field3102.field3565 = 0;
        field1936++;
        class34.field784 = 0;
        class44.field969 = -1;
        class226.field4104 = 0;
        class217.field3916 = -1;
        for (int var1 = 0; var1 < class186.field3294.length; var1++) {
            if (class186.field3294[var1] != null) {
                class186.field3294[var1].field743 = -1;
            }
        }
        for (int var2 = 0; var2 < class233.field4217.length; var2++) {
            if (class233.field4217[var2] != null) {
                class233.field4217[var2].field743 = -1;
            }
        }
        class206.method1470((byte) 43);
        class152.field2874 = 1;
        class138.method983(30, (byte) 111);
        int var3 = 56 % ((8 - arg0) / 40);
        for (int var4 = 0; var4 < 100; var4++) {
            class21.field540[var4] = true;
        }
        class115.method813(-8);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static void method707(int arg0) {
        field1931 = null;
        if (arg0 != 4047) {
            method705((Object) null, (class254) null, -50);
        }
        field1932 = null;
    }
}
