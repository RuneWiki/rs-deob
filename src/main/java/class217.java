import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class217 {

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public int field4196 = -1;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field4203 = 0;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Z")
    public static boolean field4200 = true;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "Lrd;")
    public static class173 field4206 = class133.method843(" <col=ffffff>", 106);

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field4197 = 0;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "Llg;")
    public class116 field4205;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "[I")
    public static int[] field4198;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "[I")
    public int[] field4204;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "[Lrd;")
    public class173[] field4199;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IILlb;[B)V")
    public static final void method1418(int arg0, int arg1, class111 arg2, byte[] arg3) {
        int var4 = -124 / ((-arg1 - 43) / 46);
        field4202++;
        class77 var5 = new class77();
        var5.field2437 = arg0;
        var5.field1502 = arg3;
        var5.field1498 = 0;
        var5.field1503 = arg2;
        class145 var6 = class131.field2479;
        synchronized (class131.field2479) {
            class131.field2479.method920(false, var5);
        }
        class31.method252((byte) -106);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
    public static final void method1419(byte arg0) {
        class107.field2003 = true;
        field4201++;
        if (arg0 <= 116) {
            method1418(-126, -112, null, null);
        }
        field4200 = true;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lbc;Lbc;B)V")
    public static final void method1420(class14 arg0, class14 arg1, byte arg2) {
        if (arg2 != 53) {
            field4203 = 48;
        }
        field4195++;
        class37.field795 = arg1;
        class190.field3722 = arg0;
        class196.field3824 = class37.field795.method138(3, true);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static void method1421(int arg0) {
        int var1 = -23 / ((51 - arg0) / 55);
        field4198 = null;
        field4206 = null;
    }
}
