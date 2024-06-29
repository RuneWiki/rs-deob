import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class65 {

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field974 = 20;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "Lic;")
    public static class491 field976;

    // $FF: synthetic field
    @OriginalMember(owner = "client!al", name = "e", descriptor = "Ljava/lang/Class;")
    public static Class field978;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
    public static void method382(byte arg0) {
        field976 = null;
        if (arg0 != 5) {
            field976 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I[BII)I")
    public static final int method383(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg2 < 90) {
            method383(55, null, -112, -79);
        }
        field975++;
        int var4 = -1;
        for (int var5 = arg0; var5 < arg3; var5++) {
            var4 = class154.field2273[(arg1[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILoh;)V")
    public static final void method384(int arg0, class278 arg1) {
        field977++;
        if (class108.field1553 == null) {
            return;
        }
        class351 var2 = null;
        if (arg1.field4015 == 0) {
            var2 = (class351) class426.method2557(arg1.field4016, arg1.field4008, arg1.field4002);
        }
        if (arg1.field4015 == 1) {
            var2 = (class351) class444.method2670(arg1.field4016, arg1.field4008, arg1.field4002);
        }
        if (arg1.field4015 == 2) {
            var2 = (class351) class342.method2093(arg1.field4016, arg1.field4008, arg1.field4002, field978 == null ? (field978 = method385("mq")) : field978);
        }
        if (arg0 != -12268) {
            return;
        }
        if (arg1.field4015 == 3) {
            var2 = (class351) class196.method1340(arg1.field4016, arg1.field4008, arg1.field4002);
        }
        if (var2 == null) {
            arg1.field4007 = 0;
            arg1.field4010 = -1;
            arg1.field4009 = 0;
        } else {
            arg1.field4010 = var2.method20(-30685);
            arg1.field4009 = var2.method5((byte) -65);
            arg1.field4007 = var2.method17(-115);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method385(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
