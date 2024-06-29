import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class32 extends class98 {

    @OriginalMember(owner = "client!al", name = "E", descriptor = "Llg;")
    public class152 field504;

    @OriginalMember(owner = "client!al", name = "D", descriptor = "Z")
    public static boolean field503 = false;

    @OriginalMember(owner = "client!al", name = "H", descriptor = "I")
    public static int field507 = 0;

    @OriginalMember(owner = "client!al", name = "J", descriptor = "Lmb;")
    public static class96 field509 = class243.method1708("Verbindung abgebrochen)3", (byte) 92);

    @OriginalMember(owner = "client!al", name = "K", descriptor = "Lmb;")
    public static class96 field510 = class243.method1708("<)4col> x", (byte) 118);

    @OriginalMember(owner = "client!al", name = "L", descriptor = "Lmb;")
    public static class96 field511 = class243.method1708("Clientscript error )2 check log for details", (byte) 101);

    @OriginalMember(owner = "client!al", name = "G", descriptor = "Lmb;")
    public static class96 field506 = class243.method1708("blinken2:", (byte) 127);

    @OriginalMember(owner = "client!al", name = "C", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!al", name = "F", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!al", name = "I", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!al", name = "M", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!al", name = "N", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!al", name = "O", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!al", name = "A", descriptor = "[[[B")
    public static byte[][][] field500;

    @OriginalMember(owner = "client!al", name = "B", descriptor = "[[[Ldk;")
    public static class187[][][] field501;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IILff;I)[Lnj;")
    public static final class87[] method210(int arg0, int arg1, class3 arg2, int arg3) {
        field513++;
        if (class224.method1530(arg1, arg3, (byte) -47, arg2)) {
            if (arg0 != -26647) {
                method211((byte) 102);
            }
            return class260.method1792(arg0 + 26725);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(B)Lnj;")
    public static final class87 method211(byte arg0) {
        if (arg0 > -69) {
            field500 = null;
        }
        field505++;
        class30 var1 = new class30(class249.field4309, class109.field2019, class241.field4187[0], class176.field3064[0], class31.field490[0], class170.field2982[0], class217.field3724[0], class139.field2492);
        class192.method1344(0);
        return var1;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Llg;)V")
    public class32(class152 arg0) {
        this.field504 = arg0;
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "(B)V")
    public static void method212(byte arg0) {
        field500 = null;
        if (arg0 != 126) {
            return;
        }
        field511 = null;
        field509 = null;
        field510 = null;
        field501 = null;
        field506 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V")
    public static final void method213(int arg0, int arg1) {
        class60 var2 = (class60) class132.field2373.method1081(arg1, (long) arg0);
        field512++;
        if (var2 != null) {
            var2.method1743((byte) 82);
        }
    }
}
