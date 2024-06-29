import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class309 extends class709 {

    @OriginalMember(owner = "client!wt", name = "o", descriptor = "I")
    public static int field4363 = 0;

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "Lnga;")
    public static class510 field4361 = new class510(8);

    @OriginalMember(owner = "client!wt", name = "x", descriptor = "Lqe;")
    public static class465 field4372 = new class465(46, 5);

    @OriginalMember(owner = "client!wt", name = "l", descriptor = "I")
    public int field4360;

    @OriginalMember(owner = "client!wt", name = "n", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!wt", name = "p", descriptor = "I")
    public int field4364;

    @OriginalMember(owner = "client!wt", name = "q", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!wt", name = "r", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!wt", name = "s", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!wt", name = "t", descriptor = "I")
    public int field4368;

    @OriginalMember(owner = "client!wt", name = "u", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!wt", name = "v", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!wt", name = "w", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!wt", name = "y", descriptor = "I")
    public int field4373;

    @OriginalMember(owner = "client!wt", name = "z", descriptor = "J")
    public long field4374;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)I", line = 4)
    public final int method2002(byte arg0) {
        if (arg0 > -66) {
            field4361 = null;
        }
        field4369++;
        return this.field4368;
    }

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "(I)I", line = 15)
    public final int method2003(int arg0) {
        field4362++;
        if (arg0 != -4) {
            this.field4368 = -91;
        }
        return this.field4373;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)I", line = 29)
    public final int method2004(int arg0) {
        if (arg0 != 5) {
            this.field4368 = 14;
        }
        field4365++;
        return this.field4360;
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(III)V", line = 42)
    public static final void method2005(int arg0, int arg1, int arg2) {
        class183.field2608++;
        field4371++;
        if (arg0 > -82) {
            field4363 = 78;
        }
        class135 var3 = class273.method1801(class459.field6629, class64.field1163, 2);
        var3.field2109.method238((byte) -71, arg2);
        var3.field2109.method269(10543, arg1);
        class539.method3178(var3, -18925);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Z)J", line = 63)
    public final long method2006(boolean arg0) {
        field4367++;
        if (arg0) {
            this.method2002((byte) 53);
        }
        return this.field4374;
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)I", line = 80)
    public final int method2007(int arg0) {
        if (arg0 == -24956) {
            field4370++;
            return this.field4364;
        } else {
            return 48;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(II)V", line = 91)
    public static final void method2008(int arg0, int arg1) {
        field4366++;
        int var2 = 101 / ((21 - arg1) / 39);
        class354 var3 = class501.method3012(arg0, 5, 2145997216);
        var3.method2216(0);
    }

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "(I)V", line = 115)
    public static void method2009(int arg0) {
        if (arg0 != 8) {
            method2009(121);
        }
        field4372 = null;
        field4361 = null;
    }
}
