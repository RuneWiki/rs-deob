import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class647 {

    @OriginalMember(owner = "client!sba", name = "j", descriptor = "Luf;")
    private class380 field8947 = new class380(64);

    @OriginalMember(owner = "client!sba", name = "h", descriptor = "Lga;")
    private class332 field8945;

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "I")
    public static int field8940 = 0;

    @OriginalMember(owner = "client!sba", name = "d", descriptor = "Lbr;")
    public static class192 field8941 = new class192("", 11);

    @OriginalMember(owner = "client!sba", name = "l", descriptor = "I")
    public static int field8949 = 0;

    @OriginalMember(owner = "client!sba", name = "i", descriptor = "F")
    public static float field8946;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "I")
    public static int field8938;

    @OriginalMember(owner = "client!sba", name = "e", descriptor = "I")
    public static int field8942;

    @OriginalMember(owner = "client!sba", name = "f", descriptor = "I")
    public static int field8943;

    @OriginalMember(owner = "client!sba", name = "g", descriptor = "I")
    public static int field8944;

    @OriginalMember(owner = "client!sba", name = "k", descriptor = "I")
    public static int field8948;

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "J")
    public static long field8939;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)V", line = 3)
    public final void method3592(int arg0) {
        class380 var2 = this.field8947;
        synchronized (this.field8947) {
            this.field8947.method2172(-15112);
        }
        field8938++;
        if (arg0 > -72) {
            this.field8945 = null;
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(BI)V", line = 23)
    public final void method3593(byte arg0, int arg1) {
        field8948++;
        class380 var3 = this.field8947;
        synchronized (this.field8947) {
            this.field8947.method2179(false, arg1);
        }
        if (arg0 <= 77) {
            field8946 = 0.7335778F;
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(Ljava/lang/String;II)Z", line = 36)
    public static final boolean method3594(String arg0, int arg1, int arg2) {
        if (arg2 != 40000) {
            return true;
        }
        field8942++;
        if (class312.field4206.field5176) {
            class540.field7409 = new class285();
            class540.field7409.field3772 = arg0;
            class540.field7409.field3769 = arg1;
            if (class480.field6673 != class180.field2522) {
                class540.field7409.field3764 = class540.field7409.field3769 + 50000;
                class540.field7409.field3773 = class540.field7409.field3769 + 40000;
            }
            if (class159.field2279.length > arg1 && class159.field2279[arg1] != null) {
                class693.field9779 = class159.field2279[arg1].field5256;
            }
            return true;
        }
        String var3 = "";
        if (class480.field6673 != class180.field2522) {
            var3 = ":" + (arg1 + 7000);
        }
        String var4 = "";
        if (class291.field3850 != null) {
            var4 = "/p=" + class291.field3850;
        }
        String var5 = "http://" + arg0 + var3 + "/l=" + class422.field5539 + "/a=" + class190.field2640 + var4 + "/j" + (class480.field6682 ? "1" : "0") + ",o" + (class120.field1546 ? "1" : "0") + ",a2";
        try {
            class386.field5153.getAppletContext().showDocument(new URL(var5), "_self");
            return true;
        } catch (Exception var6) {
            return false;
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(II)Lhj;", line = 85)
    public final class266 method3595(int arg0, int arg1) {
        field8944++;
        class380 var3 = this.field8947;
        class266 var4;
        synchronized (this.field8947) {
            var4 = (class266) this.field8947.method2176(-126, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class332 var5 = this.field8945;
        byte[] var6;
        synchronized (this.field8945) {
            var6 = this.field8945.method1938(arg0, 32, -17);
            if (arg1 < 39) {
                field8939 = 41L;
            }
        }
        class266 var7 = new class266();
        if (var6 != null) {
            var7.method1591(new class157(var6), -1);
        }
        class380 var8 = this.field8947;
        synchronized (this.field8947) {
            this.field8947.method2174(var7, (long) arg0, (byte) 126);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(Lnq;ILga;)V", line = 144)
    public class647(class650 arg0, int arg1, class332 arg2) {
        this.field8945 = arg2;
        this.field8945.method1939(0, 32);
    }

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "(I)V", line = 133)
    public final void method3596(int arg0) {
        class380 var2 = this.field8947;
        synchronized (this.field8947) {
            this.field8947.method2168((byte) -127);
            int var3 = -20 / ((33 - arg0) / 52);
        }
        field8943++;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(B)V", line = 162)
    public static void method3597(byte arg0) {
        field8941 = null;
        if (arg0 != -11) {
            field8939 = -92L;
        }
    }
}
