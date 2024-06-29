import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class164 extends class513 {

    @OriginalMember(owner = "client!vda", name = "q", descriptor = "Lwo;")
    public static class690 field2008 = new class690(92, 8);

    @OriginalMember(owner = "client!vda", name = "j", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!vda", name = "m", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!vda", name = "n", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!vda", name = "p", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!vda", name = "r", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!vda", name = "s", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!vda", name = "o", descriptor = "J")
    public long field2006;

    @OriginalMember(owner = "client!vda", name = "k", descriptor = "Lvda;")
    public class164 field2002;

    @OriginalMember(owner = "client!vda", name = "l", descriptor = "Lvda;")
    public class164 field2003;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V", line = 3)
    public static void method1032(int arg0) {
        if (arg0 != 3405) {
            method1033(false, 56);
        }
        field2008 = null;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(ZI)V", line = 13)
    public static final void method1033(boolean arg0, int arg1) {
        field2010++;
        if (arg0) {
            if (class127.field1619 != -1) {
                class185.method1151(class127.field1619, 256);
            }
            for (class21 var2 = (class21) class113.field1442.method3669((byte) 28); var2 != null; var2 = (class21) class113.field1442.method3676((byte) -12)) {
                if (!var2.method3047(32)) {
                    var2 = (class21) class113.field1442.method3669((byte) 28);
                    if (var2 == null) {
                        break;
                    }
                }
                class658.method3727(false, 7070, true, var2);
            }
            class127.field1619 = -1;
            class113.field1442 = new class652(8);
            class687.method3888(1003);
            class127.field1619 = class358.field4771;
            class161.method1019((byte) 105, false);
            class100.method747(false);
            class545.method3198(class127.field1619);
        }
        class422.field6010 = "";
        class468.field6540 = "";
        class189.field2305 = false;
        class53.method566(119);
        class10.field99 = -1;
        class257.method1565(-1, class208.field2540);
        class206.field2472 = new class613();
        class206.field2472.field531 = class205.field2465 * 512 / 2;
        class206.field2472.field530 = class473.field6604 * 512 / 2;
        class206.field2472.field2689[0] = class473.field6604 / 2;
        class206.field2472.field2686[0] = class205.field2465 / 2;
        class627.field8995 = 0;
        class346.field4550 = 0;
        if (class586.field8507 == 2) {
            class627.field8995 = class451.field6341 << 9;
            class346.field4550 = class473.field6626 << 9;
        } else {
            class178.method1111(2);
        }
        class221.method1337(4);
        if (arg1 != -1) {
            method1036(null, (byte) 11);
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(B[Ljava/lang/Object;[J)V", line = 80)
    public static final void method1034(byte arg0, Object[] arg1, long[] arg2) {
        if (arg0 > 107) {
            class197.method1207(arg2.length - 1, arg2, arg1, (byte) 54, 0);
            field2001++;
        }
    }

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "(B)Z", line = 93)
    public final boolean method1035(byte arg0) {
        field2005++;
        if (arg0 != -61) {
            this.method1035((byte) -113);
        }
        return this.field2002 != null;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lkfa;B)V", line = 114)
    public static final void method1036(class557 arg0, byte arg1) {
        field2007++;
        if (arg1 != -50) {
            method1033(true, -74);
        }
        for (class58 var2 = (class58) class188.field2301.method1132((byte) 84); var2 != null; var2 = (class58) class188.field2301.method1134(8446)) {
            if (var2.field916 == arg0) {
                if (var2.field906 != null) {
                    class399.field5624.method1805(var2.field906);
                    var2.field906 = null;
                }
                var2.method3045(true);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)V", line = 153)
    public final void method1037(int arg0) {
        field2009++;
        if (arg0 <= -63 && this.field2002 != null) {
            this.field2002.field2003 = this.field2003;
            this.field2003.field2002 = this.field2002;
            this.field2003 = null;
            this.field2002 = null;
        }
    }
}
