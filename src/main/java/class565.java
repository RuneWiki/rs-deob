import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class565 implements class255 {

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "Lkfa;")
    public class407 field7902;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "Lgq;")
    public class761 field7905;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
    public int field7910;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public int field7903;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public int field7904;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "Lqia;")
    public static class547 field7906 = new class547();

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field7907;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
    public static int field7908;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
    public static int field7909;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "Lkha;")
    public static class687 field7911;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)I")
    public static final int method3189(int arg0, int arg1, int arg2) {
        field7908++;
        if (arg1 != -16515) {
            method3189(35, -107, 92);
        }
        int var3 = arg2 >>> 24;
        int var4 = ((arg2 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg2 & 0xFF00) * var3 & 0xFF0000) >>> 8;
        int var5 = 255 - var3;
        return (((arg0 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg0 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)Lqi;")
    public class669 method271(boolean arg0) {
        if (arg0) {
            this.method271(true);
        }
        field7907++;
        return class63.field861;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
    public static void method3190(int arg0) {
        field7906 = null;
        field7911 = null;
        if (arg0 != 255) {
            field7911 = null;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)Lbt;")
    public static final class496 method3191(int arg0, int arg1) {
        field7909++;
        class496 var2 = (class496) class30.field488.method778((long) arg0, arg1 - 99);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class726.field10175.method3810(arg1, arg1 - 23361, arg0);
        class496 var4 = new class496();
        var4.field7008 = arg0;
        if (var3 != null) {
            var4.method2882(new class179(var3), arg1 - 1);
        }
        var4.method2884((byte) -33);
        if (var4.field7013 == 2 && class326.field4170.method3248((long) arg0, 0) == null) {
            class326.field4170.method3249((long) arg0, new class394(class142.field1683), (byte) -109);
            class168.field2221[class142.field1683++] = var4;
        }
        class30.field488.method774((long) arg0, 116, var4);
        return var4;
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(ILgq;Lkfa;II)V")
    public class565(int arg0, class761 arg1, class407 arg2, int arg3, int arg4) {
        this.field7902 = arg2;
        this.field7905 = arg1;
        this.field7910 = arg3;
        this.field7903 = arg4;
        this.field7904 = arg0;
    }
}
