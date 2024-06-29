import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public abstract class class40 {

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "J")
    public static long field427 = 0L;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(III)[B")
    public abstract byte[] method207(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method208(int arg0, long arg1) {
        field428++;
        if (arg0 > -19) {
            field427 = 124L;
        }
        class97.field1075.setTime(new Date(arg1));
        int var3 = class97.field1075.get(7);
        int var4 = class97.field1075.get(5);
        int var5 = class97.field1075.get(2);
        int var6 = class97.field1075.get(1);
        int var7 = class97.field1075.get(11);
        int var8 = class97.field1075.get(12);
        int var9 = class97.field1075.get(13);
        return class92.field1049[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class657.field9373[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Z)[B")
    public abstract byte[] method209(boolean arg0);

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)I")
    public static final int method210(int arg0, byte arg1) {
        int var2 = -27 % ((arg1 - 29) / 52);
        field429++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I[B)V")
    public abstract void method211(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lfu;IB)Lqr;")
    public static final class60 method212(class354 arg0, int arg1, byte arg2) {
        if (arg2 != 98) {
            field427 = -120L;
        }
        field426++;
        class60 var3;
        if (class394.field5251 == null) {
            var3 = new class60();
        } else {
            var3 = class394.field5251;
            class394.field5251 = class394.field5251.field623;
            var3.field623 = null;
            class419.field5574--;
        }
        var3.field625 = arg0;
        var3.field624 = arg1;
        return var3;
    }
}
