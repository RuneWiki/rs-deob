import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class355 implements class415 {

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "Lct;")
    private class374 field5164;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "Lfba;")
    private class667 field5167;

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field5166 = new Hashtable();

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "Lcb;")
    public static class318 field5171 = new class318(82, 3);

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "Lpq;")
    public static class159 field5163;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZB)V")
    public final void method277(boolean arg0, byte arg1) {
        field5170++;
        if (arg1 >= -13) {
            this.method193(-42);
        }
        class548 var3 = this.field5164.method2283(this.field5167.field9475, (byte) -80);
        if (var3 == null) {
            return;
        }
        int var4 = this.field5167.field9478.method2304(class432.field5995, this.field5167.field9483, 65535) + this.field5167.field9480;
        int var5 = this.field5167.field9482.method536(class384.field5582, -26620, this.field5167.field9476) + this.field5167.field9490;
        if (this.field5167.field9485) {
            class9.field103.method1975(var4, var5, this.field5167.field9483, this.field5167.field9476, this.field5167.field9484, 0);
        }
        int var6 = var5 + this.method2209(var3.field7498, 5, 120, class622.field8452, var4, var5) * 12;
        int var9 = var6 + 8;
        if (this.field5167.field9485) {
            class9.field103.method2010(var4, var9, this.field5167.field9483 + var4 - 1, var9, this.field5167.field9484, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method2209(var3.field7499, 5, 120, class622.field8452, var4, var6) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method2209(var3.field7491, 5, 115, class622.field8452, var4, var10) * 12;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(B)V")
    public static void method2208(byte arg0) {
        field5171 = null;
        field5166 = null;
        field5163 = null;
        int var1 = 108 / ((arg0 - 34) / 41);
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lct;Lfba;)V")
    public class355(class374 arg0, class667 arg1) {
        this.field5164 = arg0;
        this.field5167 = arg1;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/lang/String;IILta;II)I")
    private final int method2209(String arg0, int arg1, int arg2, class301 arg3, int arg4, int arg5) {
        field5169++;
        if (arg2 < 111) {
            this.field5167 = null;
        }
        return arg3.method1817(null, 0, this.field5167.field9476 - (arg1 * 2), -(arg1 * 2) + this.field5167.field9483, arg0, (byte) 113, 0, 0, 0, null, null, arg1 + arg4, 0, this.field5167.field9491, this.field5167.field9481, arg1 + arg5);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)Z")
    public final boolean method193(int arg0) {
        field5165++;
        if (arg0 != -29581) {
            method2208((byte) 55);
        }
        return this.field5164.method2281((byte) 79);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)V")
    public final void method191(byte arg0) {
        field5168++;
        if (arg0 >= -5) {
            this.method191((byte) -13);
        }
    }
}
