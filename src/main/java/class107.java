import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public abstract class class107 {

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field1500 = 0;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "Lbd;")
    public static class37 field1499 = new class37();

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field1503 = -60;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "Lwd;")
    public static class148 field1496;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "Ljm;")
    public static class409 field1504;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V", line = 3)
    public static void method805(int arg0) {
        if (arg0 != 17872) {
            field1499 = null;
        }
        field1504 = null;
        field1496 = null;
        field1499 = null;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V", line = 17)
    public static final void method806(int arg0) {
        field1506++;
        class50.field622 = class31.method212(true, 8, 0.4F, 4, 8, true, 2048, 35);
        if (arg0 >= -35) {
            method808(-113, -7);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIILmo;)Lgh;", line = 29)
    public static final class325 method807(int arg0, int arg1, int arg2, class447 arg3) {
        field1497++;
        byte[] var4 = arg3.method2771(arg0, arg2, 3);
        if (arg1 < 49) {
            method809(-103, (byte) -52, -3);
        }
        return var4 == null ? null : new class325(var4);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)V", line = 53)
    public static final void method808(int arg0, int arg1) {
        class52 var2 = class410.field6080;
        synchronized (class410.field6080) {
            class410.field6080.method337(arg0, (byte) -116);
        }
        field1502++;
        if (arg1 <= 4) {
            field1503 = -46;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IBI)V", line = 67)
    public static final void method809(int arg0, byte arg1, int arg2) {
        if (arg1 != -109) {
            field1500 = 68;
        }
        field1501++;
        class391.field5869[arg0] = arg2;
        class317 var3 = (class317) class58.field746.method1770(arg1 - 771, (long) arg0);
        if (var3 == null) {
            class317 var4 = new class317(4611686018427387905L);
            class58.field746.method1766((long) arg0, var4, -84);
        } else if (var3.field4968 != 4611686018427387905L) {
            var3.field4968 = class46.method297(27104) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)Loh;", line = 95)
    public static final class231 method810(int arg0) {
        field1505++;
        if (class354.field5449 < class28.field323.length) {
            return class28.field323[class354.field5449++];
        } else {
            if (arg0 != 22068) {
                field1496 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([BB)V")
    public abstract void method79(byte[] arg0, byte arg1);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)[B")
    public abstract byte[] method80(byte arg0);
}
