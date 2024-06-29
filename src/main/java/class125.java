import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class125 {

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "[[I")
    public static int[][] field1614 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
    public int field1608;

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "I")
    public int field1609;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
    public int field1610;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "I")
    public int field1612;

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "I")
    public int field1613;

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "I")
    public int field1615;

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "I")
    public int field1616;

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!hs", name = "n", descriptor = "I")
    public int field1621;

    @OriginalMember(owner = "client!hs", name = "o", descriptor = "I")
    public int field1622;

    @OriginalMember(owner = "client!hs", name = "q", descriptor = "I")
    public int field1624;

    @OriginalMember(owner = "client!hs", name = "r", descriptor = "I")
    public int field1625;

    @OriginalMember(owner = "client!hs", name = "s", descriptor = "I")
    public int field1626;

    @OriginalMember(owner = "client!hs", name = "p", descriptor = "Lq;")
    public static class151 field1623;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lpe;ZLpe;Lpe;Lpe;)V", line = 8)
    public static final void method914(class615 arg0, boolean arg1, class615 arg2, class615 arg3, class615 arg4) {
        class666.field9238 = arg0;
        if (!arg1) {
            method919(-9, (byte) -94, 95);
        }
        class427.field5534 = arg4;
        class12.field123 = arg2;
        field1619++;
        class322.field4179 = new class477[class12.field123.method3366(-60)][];
        class245.field3279 = new boolean[class12.field123.method3366(-93)];
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lhs;B)Z", line = 25)
    public final boolean method915(class125 arg0, byte arg1) {
        field1617++;
        if (arg1 != -108) {
            method919(-74, (byte) 24, -51);
        }
        return this.field1608 == arg0.field1608 && this.field1613 == arg0.field1613 && this.field1609 == arg0.field1609;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IZIIII)V", line = 42)
    public static final void method916(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg4;
        if (arg1) {
            method917(54, (byte) 119, -126, -24, 49, null);
        }
        while (var6 <= arg0) {
            class349.method2008(arg5, (byte) 116, class213.field2746[var6], arg3, arg2);
            var6++;
        }
        field1620++;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IBIIILji;)Lch;", line = 71)
    public static final class219 method917(int arg0, byte arg1, int arg2, int arg3, int arg4, class622 arg5) {
        if (arg1 <= 108) {
            return null;
        }
        field1618++;
        if (!arg5.field8694 && (!class386.method2202(-95, arg0) || !class386.method2202(-48, arg2))) {
            return arg5.field8650 ? new class219(arg5, 34037, arg4, arg3, arg0, arg2, true) : new class219(arg5, arg4, arg3, arg0, arg2, class426.method2447(arg0, 250), class426.method2447(arg2, 250), true);
        } else {
            return new class219(arg5, 3553, arg4, arg3, arg0, arg2, true);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V", line = 94)
    public static void method918(byte arg0) {
        field1614 = null;
        if (arg0 == 14) {
            field1623 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IBI)Z", line = 105)
    public static final boolean method919(int arg0, byte arg1, int arg2) {
        field1611++;
        if (arg1 != -125) {
            field1614 = null;
        }
        return (arg2 & 0x800) != 0;
    }
}
