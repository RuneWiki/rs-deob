import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class212 extends class464 {

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "Lwt;")
    public static class194 field3002 = new class194("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field3007 = 0;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "Z")
    public static boolean field3006 = false;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "Lne;")
    public static class199 field3009;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "Lhe;")
    public static class239 field3005;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "Lhe;")
    public static class239 field3008;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "Lqg;")
    public static class307 field3004;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V", line = 7)
    public static final void method1315(int arg0) {
        class400.field5886 = new class383(8);
        field3003++;
        class38.field591 = arg0;
        for (class332 var1 = (class332) class156.field1989.method242(false); var1 != null; var1 = (class332) class156.field1989.method244((byte) -73)) {
            var1.method2009();
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V", line = 25)
    public static void method1316(byte arg0) {
        field3009 = null;
        if (arg0 < 36) {
            method1316((byte) 85);
        }
        field3008 = null;
        field3004 = null;
        field3002 = null;
        field3005 = null;
    }
}
