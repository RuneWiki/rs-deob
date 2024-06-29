import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class289 extends class175 {

    @OriginalMember(owner = "client!oi", name = "F", descriptor = "I")
    public static int field4622 = 0;

    @OriginalMember(owner = "client!oi", name = "D", descriptor = "Ljava/lang/String;")
    public static String field4620 = "K";

    @OriginalMember(owner = "client!oi", name = "I", descriptor = "I")
    public static int field4624 = 0;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!oi", name = "C", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!oi", name = "E", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!oi", name = "H", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!oi", name = "K", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!oi", name = "J", descriptor = "Lgg;")
    private class61 field4625;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "(I)V")
    public static void method1933(int arg0) {
        if (arg0 > -86) {
            method1935((class264) null, 41);
        }
        field4620 = null;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(III)I")
    public final int method1934(int arg0, int arg1, int arg2) {
        field4623++;
        if (arg0 != 0) {
            return 106;
        } else if (this.field4625 == null) {
            return arg1;
        } else {
            class119 var4 = (class119) this.field4625.method457((long) arg2, (byte) -115);
            return var4 == null ? arg1 : var4.field2011;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lhi;I)Llk;")
    public static final class251 method1935(class264 arg0, int arg1) {
        if (arg1 == 12188) {
            field4618++;
            return new class251(arg0.method1756(-109), arg0.method1756(-116), arg0.method1756(-124), arg0.method1756(-105), arg0.method1756(arg1 - 12287), arg0.method1756(-103), arg0.method1756(-114), arg0.method1756(arg1 ^ 0xFFFFD03B), arg0.method1732(114), arg0.method1779(-61));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lvg;I)V")
    public static final void method1936(class237 arg0, int arg1) {
        if (arg1 != -14301) {
            field4620 = null;
        }
        class46.field562 = arg0;
        field4619++;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILhi;)V")
    public final void method1937(int arg0, class264 arg1) {
        if (arg0 != -1) {
            method1933(-120);
        }
        while (true) {
            int var3 = arg1.method1779(arg0 - 86);
            if (var3 == 0) {
                field4617++;
                return;
            }
            this.method1938(arg1, true, var3);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lhi;ZI)V")
    private final void method1938(class264 arg0, boolean arg1, int arg2) {
        field4621++;
        if (!arg1 || arg2 != 249) {
            return;
        }
        int var4 = arg0.method1779(-112);
        if (this.field4625 == null) {
            int var5 = class290.method1941(var4, -1675860440);
            this.field4625 = new class61(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg0.method1779(-121) == 1;
            int var8 = arg0.method1732(114);
            class69 var9;
            if (var7) {
                var9 = new class196(arg0.method1750((byte) 76));
            } else {
                var9 = new class119(arg0.method1765((byte) 118));
            }
            this.field4625.method466((long) var8, var9, (byte) 93);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZLjava/lang/String;I)Ljava/lang/String;")
    public final String method1939(boolean arg0, String arg1, int arg2) {
        field4626++;
        if (this.field4625 == null) {
            return arg1;
        } else if (arg0) {
            class196 var4 = (class196) this.field4625.method457((long) arg2, (byte) -115);
            return var4 == null ? arg1 : var4.field3164;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(III)J")
    public static final long method1940(int arg0, int arg1, int arg2) {
        class99 var3 = class273.field4415[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field1503; var4++) {
            class138 var5 = var3.field1496[var4];
            if ((var5.field2275 >> 29 & 0x3L) == 2L && var5.field2272 == arg1 && var5.field2284 == arg2) {
                return var5.field2275;
            }
        }
        return 0L;
    }
}
