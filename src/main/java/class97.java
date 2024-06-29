import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class97 {

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "Lhm;")
    private class208 field1253 = new class208(64);

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "Lpfa;")
    private class275 field1255;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public int field1252;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field1257 = 0;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)Lnda;", line = 5)
    public final class523 method716(int arg0, int arg1) {
        field1254++;
        class208 var3 = this.field1253;
        class523 var4;
        synchronized (this.field1253) {
            var4 = (class523) this.field1253.method1221((long) arg1, true);
        }
        if (var4 != null) {
            return var4;
        }
        class275 var5 = this.field1255;
        byte[] var6;
        synchronized (this.field1255) {
            var6 = this.field1255.method1659(-111, arg1, arg0);
        }
        class523 var7 = new class523();
        if (var6 != null) {
            var7.method2825(0, new class572(var6));
        }
        class208 var8 = this.field1253;
        synchronized (this.field1253) {
            this.field1253.method1230((byte) -119, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V", line = 40)
    public static final void method717(int arg0) {
        field1258++;
        if (class305.field3866 == -1) {
            return;
        }
        int var1 = class113.field1423.method1074((byte) 121);
        int var2 = class113.field1423.method1078((byte) 124);
        class132 var3 = (class132) class500.field6235.method1909(true);
        if (var3 != null) {
            var1 = var3.method860(true);
            var2 = var3.method851(-1160828951);
        }
        if (arg0 < -77) {
            class205.method1189(0, 0, 0, class491.field6129, 0, class305.field3866, var2, class309.field3890, var1, -1);
            if (class578.field7767 != null) {
                class221.method1266(var1, var2, (byte) -123);
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)Z", line = 75)
    public static final boolean method718(int arg0, int arg1, int arg2) {
        if (arg0 != 64) {
            field1256 = -114;
        }
        field1259++;
        return class650.method3627(arg1, 1, arg2) & class339.method1946(arg1, arg2, (byte) -42);
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lbs;ILpfa;)V", line = 94)
    public class97(class643 arg0, int arg1, class275 arg2) {
        this.field1255 = arg2;
        this.field1252 = this.field1255.method1655(19, (byte) -82);
    }
}
