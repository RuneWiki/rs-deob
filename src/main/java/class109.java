import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class109 {

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "Lpca;")
    private class653 field1264 = new class653(256);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "Lfo;")
    private class473 field1260;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "Le;")
    private class486 field1268;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "Ltq;")
    public static class572 field1265 = new class572(8);

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)Lae;")
    public final class228 method677(int arg0, int arg1) {
        field1262++;
        Object var3 = this.field1264.method3690((byte) 117, (long) arg0);
        if (var3 != null) {
            return (class228) var3;
        } else if (this.field1268.method843(arg0, 31340)) {
            class414 var4 = this.field1268.method846((byte) -113, arg0);
            int var5 = var4.field5499 ? 64 : this.field1260.field6840;
            class228 var7;
            if (var4.field5485 && this.field1260.method310()) {
                float[] var6 = this.field1268.method851(false, 0.7F, (byte) -71, arg0, var5, var5);
                var7 = this.field1260.method2762(var5, class581.field8260, var4.field5497 != 0, (byte) -37, var6, var5);
            } else {
                int[] var8 = var4.field5496 ? this.field1268.method845(arg0, 0.7F, var5, true, var5, false) : this.field1268.method854(0.7F, -4476, true, var5, arg0, var5);
                var7 = this.field1260.method2732(var8, var5, var4.field5497 != 0, 0, var5);
            }
            int var9 = -42 / ((arg1 - 34) / 55);
            var7.method1331(-7684, var4.field5494, var4.field5490);
            this.field1264.method3683(var7, (byte) -17, (long) arg0);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
    public final void method678(int arg0) {
        if (arg0 == -1) {
            this.field1264.method3687((byte) -10);
            field1263++;
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
    public final void method679(int arg0) {
        int var2 = -43 % ((arg0 - 28) / 61);
        field1267++;
        this.field1264.method3691(false, 5);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIB)Z")
    public static final boolean method680(int arg0, int arg1, byte arg2) {
        field1261++;
        if (arg2 >= -104) {
            return true;
        } else {
            return class277.method1572(arg1, (byte) 38, arg0) | (arg1 & 0x800) != 0 || class407.method2209(arg0, 45056, arg1);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
    public static void method681(byte arg0) {
        field1265 = null;
        if (arg0 >= -125) {
            method682((byte) -121);
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lfo;Le;)V")
    public class109(class473 arg0, class486 arg1) {
        this.field1260 = arg0;
        this.field1268 = arg1;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)Ljava/lang/String;")
    public static final String method682(byte arg0) {
        field1266++;
        if (class215.field2615 || class122.field1377 == null) {
            return "";
        } else {
            if (arg0 != 54) {
                field1265 = null;
            }
            return class122.field1377.field2525;
        }
    }
}
