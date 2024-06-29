import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class77 {

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "Ljava/lang/String;")
    public static String field959 = " ";

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public static int field960 = 0;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "Z")
    public static boolean field962 = false;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field964 = 0;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "Z")
    public static boolean field963 = false;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    public static int field967 = 0;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)Z", line = 4)
    public static final boolean method481(int arg0, int arg1) {
        if (arg1 > -48) {
            return false;
        } else {
            class160.field2530 = arg0 + 1 & 0xFFFF;
            class82.field1021 = true;
            field966++;
            return true;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljg;I)Luo;", line = 25)
    public static final class343 method482(class186 arg0, int arg1) {
        field961++;
        class343 var2 = new class343();
        var2.field5288 = arg0.method1272((byte) -71);
        var2.field5289 = class344.method2253((byte) 118, var2.field5288);
        return arg1 == 0 ? var2 : null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V", line = 62)
    public static void method483(int arg0) {
        int var1 = -112 % ((-arg0 - 20) / 54);
        field959 = null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZLum;)V", line = 71)
    public static final void method484(boolean arg0, class306 arg1) {
        arg1.field4859 = null;
        field965++;
        int var2 = arg1.field4856.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg1.field4856[var3].field2671 = false;
        }
        if (arg0) {
            method483(-99);
        }
        class385[] var4 = class104.field1457;
        synchronized (class104.field1457) {
            if (var2 < class104.field1457.length && class51.field630[var2] < 200) {
                class104.field1457[var2].method2442(arg1, (byte) 114);
                int var10002 = class51.field630[var2]++;
            }
        }
    }
}
