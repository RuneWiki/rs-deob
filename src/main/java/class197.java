import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class197 {

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "[Lia;")
    public static class175[] field3497 = new class175[500];

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "Lqj;")
    public static class196 field3498 = class80.method502("::rect_debug", -48);

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "Lqj;")
    public static class196 field3501 = class80.method502("Lade Texturen )2 ", -48);

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "Lqj;")
    public static class196 field3505 = class80.method502("gleiten:", -48);

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Lh;")
    public static class139 field3500;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "[I")
    public static int[] field3499;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)I")
    public static final int method1337(int arg0, int arg1) {
        int var2 = (arg1 & 0x55555555) + (arg1 >>> 1 & 0xD5555555);
        int var3 = (var2 >>> 2 & 0x73333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        if (arg0 > -30) {
            field3498 = null;
        }
        field3504++;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILbe;)V")
    public static final void method1338(int arg0, class117 arg1) {
        if (arg1.field1684 != null) {
            arg1.field1684.field4486 = 0;
        }
        field3503++;
        arg1.field1687 = false;
        if (arg0 <= -57) {
            for (class117 var2 = arg1.method695(); var2 != null; var2 = arg1.method699()) {
                method1338(-125, var2);
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)J")
    public static final long method1339(int arg0, int arg1, int arg2) {
        class61 var3 = class249.field4410[arg0][arg1][arg2];
        return var3 == null || var3.field818 == null ? 0L : var3.field818.field1671;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lbk;Lbk;Lbk;Lbk;I)V")
    public static final void method1340(class136 arg0, class136 arg1, class136 arg2, class136 arg3, int arg4) {
        class130.field1846 = arg3;
        class51.field637 = arg1;
        class219.field3938 = arg0;
        field3502++;
        class242.field4294 = arg2;
        class91.field1335 = new class178[class51.field637.method834((byte) 113)][];
        if (arg4 != 460521282) {
            method1340(null, null, null, null, 118);
        }
        class165.field2727 = new boolean[class51.field637.method834((byte) 113)];
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    public static void method1341(byte arg0) {
        field3498 = null;
        field3505 = null;
        field3500 = null;
        int var1 = 100 % ((5 - arg0) / 60);
        field3499 = null;
        field3501 = null;
        field3497 = null;
    }
}
