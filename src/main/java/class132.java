import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class132 {

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "Lpq;")
    private class159 field1681;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public int field1677;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "Lcb;")
    public static class318 field1678 = new class318(111, 8);

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ldga;B)Ltf;")
    public static final class316 method864(class138 arg0, byte arg1) {
        field1680++;
        class422 var2 = class411.method2411(arg0, (byte) 59);
        int var3 = arg0.method910(-1703526384);
        int var4 = 114 / ((arg1 - 8) / 45);
        return new class316(var2.field5883, var2.field5881, var2.field5884, var2.field5877, var2.field5880, var3);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public static void method865(byte arg0) {
        field1678 = null;
        if (arg0 != -3) {
            method864(null, (byte) 45);
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Luea;ILpq;)V")
    public class132(class484 arg0, int arg1, class159 arg2) {
        new class560(64);
        this.field1681 = arg2;
        this.field1677 = this.field1681.method1076(15, 0);
    }
}
