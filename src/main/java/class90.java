import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class90 extends class32 {

    @OriginalMember(owner = "client!od", name = "M", descriptor = "I")
    public static int field1617 = 0;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "I")
    public int field1612;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    public int field1613;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!od", name = "L", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!od", name = "O", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!od", name = "P", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
    public int field1621;

    @OriginalMember(owner = "client!od", name = "R", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!od", name = "S", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "Lqk;")
    public class207 field1615;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(B)J")
    public final long method647(byte arg0) {
        ++field1623;
        return arg0 <= 50 ? 67L : super.field643 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(B)V")
    public final void method648(byte arg0) {
        ++field1620;
        super.field643 |= Long.MIN_VALUE;
        if (this.method647((byte) 55) == 0L) {
            class174.field3129.method389(false, this);
        }
        if (arg0 > -20) {
            method653(62, (class14) null);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "()V")
    public static final void method649() {
        for (int var0 = 0; var0 < field1617; ++var0) {
            class288 var1 = class18.field270[var0];
            class16.method99(var1);
            class18.field270[var0] = null;
        }
        field1617 = 0;
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(B)I")
    public final int method650(byte arg0) {
        ++field1622;
        if (arg0 > -74) {
            this.field1621 = 35;
        }
        return (int) (super.field3407 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(I)V")
    public final void method651(int arg0) {
        if (arg0 != -27655) {
            this.method647((byte) -21);
        }
        super.field643 = super.field643 & Long.MIN_VALUE | class53.method405(81) + 500L;
        class277.field4861.method389(false, this);
        ++field1614;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([S[Lqk;Z)V")
    public static final void method652(short[] arg0, class207[] arg1, boolean arg2) {
        class98.method693(2047, 0, arg1.length + -1, arg1, arg0);
        if (!arg2) {
            ++field1618;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILfk;)V")
    public static final void method653(int arg0, class14 arg1) {
        if (arg0 != -15716) {
            method653(90, (class14) null);
        }
        ++field1610;
        class79 var2 = (class79) class175.field3168.method1867(arg1.field209.method1428(0), true);
        if (var2 == null) {
            class118.method842((byte) -30, arg1.field5022[0], arg1.field5074[0], 0, (class22) null, class93.field1645, (class256) null, arg1);
        } else {
            var2.method599(53);
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(II)V")
    public class90(int arg0, int arg1) {
        super.field3407 = (long) arg1 | (long) arg0 << 32;
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "(B)I")
    public final int method654(byte arg0) {
        ++field1611;
        int var2 = -24 / ((34 - arg0) / 44);
        return (int) super.field3407;
    }
}
