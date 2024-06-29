import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class316 extends class446 implements class4 {

    @OriginalMember(owner = "client!cs", name = "B", descriptor = "Lne;")
    private class294 field4348;

    @OriginalMember(owner = "client!cs", name = "C", descriptor = "[I")
    public static int[] field4349 = new int[1000];

    @OriginalMember(owner = "client!cs", name = "K", descriptor = "[I")
    public static int[] field4356 = new int[14];

    @OriginalMember(owner = "client!cs", name = "F", descriptor = "I")
    public static int field4351 = 0;

    @OriginalMember(owner = "client!cs", name = "y", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!cs", name = "z", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!cs", name = "A", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!cs", name = "E", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!cs", name = "G", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!cs", name = "H", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!cs", name = "I", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!cs", name = "J", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!cs", name = "x", descriptor = "Leda;")
    public static class90 field4344;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    public final Buffer method27(byte arg0, boolean arg1) {
        field4352++;
        if (arg0 != -64) {
            field4349 = null;
        }
        return super.method27((byte) -64, arg1);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
    public final void method24(byte arg0) {
        field4346++;
        super.method24(arg0);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)Z")
    public static final boolean method1883(int arg0, int arg1, int arg2) {
        field4350++;
        if (arg2 < 98) {
            return false;
        } else {
            return (arg0 & 0x400) != 0;
        }
    }

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "(I)V")
    public static void method1884(int arg0) {
        field4349 = null;
        field4356 = null;
        if (arg0 < 13) {
            method1883(14, -25, 71);
        }
        field4344 = null;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)Z")
    public final boolean method28(int arg0) {
        field4347++;
        return arg0 == 11390 ? super.method28(11390) : false;
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Ldc;Lne;Z)V")
    public class316(class5 arg0, class294 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field4348 = arg1;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIZ)V")
    public static final void method1885(int arg0, int arg1, boolean arg2) {
        field4345++;
        class521 var3 = class265.method1620(arg0, arg2, false);
        if (var3 == null) {
            return;
        }
        if (arg1 != -17422) {
            field4349 = null;
        }
        for (int var4 = 0; var4 < var3.field6961.length; var4++) {
            var3.field6961[var4] = -1;
            var3.field6958[var4] = 0;
        }
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(B)Lne;")
    public final class294 method25(byte arg0) {
        field4353++;
        if (arg0 <= 88) {
            field4356 = null;
        }
        return this.field4348;
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)I")
    public final int method1656(int arg0) {
        field4355++;
        if (arg0 != -15151) {
            this.method28(121);
        }
        return super.method1656(-15151);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)V")
    public final void method26(int arg0, int arg1) {
        super.method26(arg0, this.field4348.field4155 * arg1);
        if (arg0 == -24955) {
            field4354++;
        }
    }
}
