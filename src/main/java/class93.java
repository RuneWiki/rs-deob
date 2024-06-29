import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class93 {

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "Lum;")
    private class83 field1491;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
    public int field1490;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "Lpn;")
    public static class49 field1492 = new class49(30, 7);

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "Z")
    public static boolean field1494 = false;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "Lum;")
    public static class83 field1493;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "Lum;")
    public static class83 field1495;

    static {
        new class179("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZBLfi;)V", line = 7)
    public static final void method789(boolean arg0, byte arg1, class38 arg2) {
        field1489++;
        int var3 = arg2.field595 == 0 ? arg2.field629 : arg2.field595;
        int var4 = arg2.field604 == 0 ? arg2.field591 : arg2.field604;
        class503.method2996(var3, var4, arg0, true, arg2.field580, class237.field3555[arg2.field580 >> 16]);
        if (arg2.field610 != null) {
            class503.method2996(var3, var4, arg0, true, arg2.field580, arg2.field610);
        }
        class295 var5 = (class295) class215.field3248.method358((byte) -117, (long) arg2.field580);
        if (arg1 > -67) {
            method792(102, -116);
        }
        if (var5 != null) {
            class280.method1893(var4, arg0, var5.field4546, var3, 0);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V", line = 33)
    public static void method790(int arg0) {
        field1495 = null;
        field1493 = null;
        field1492 = null;
        int var1 = 85 % ((arg0 - 32) / 60);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)I", line = 45)
    public static final int method791(int arg0, int arg1) {
        if (arg0 != 1186545864) {
            field1495 = null;
        }
        field1488++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(II)V", line = 58)
    public static final void method792(int arg0, int arg1) {
        field1487++;
        class439.field6547 = arg0;
        class40.field655 = -1;
        class169.field2569 = arg1;
        class367.field5417 = -1;
        class215.field3250 = false;
        class386.field5678 = 1;
        class134.field1992 = null;
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lpt;ILum;)V", line = 97)
    public class93(class308 arg0, int arg1, class83 arg2) {
        new class242(64);
        this.field1491 = arg2;
        this.field1490 = this.field1491.method748(15, 12408);
    }
}
