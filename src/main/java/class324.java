import java.awt.Canvas;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class324 extends class69 {

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "I")
    public int field4575;

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "Ljn;")
    public static class134 field4572 = new class134(75, 3);

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "I")
    public static int field4578 = -1;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!lq", name = "m", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IJ)V", line = 7)
    public static final void method2052(int arg0, long arg1) {
        class448.field6277.setTime(new Date(arg1));
        field4574++;
        int var3 = 64 % ((-arg0 - 19) / 43);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BLsha;Z)V", line = 19)
    public static final void method2053(byte arg0, class115 arg1, boolean arg2) {
        field4573++;
        int var3 = 30 % ((arg0 - 33) / 61);
        int var4 = arg1.field1511 == 0 ? arg1.field1560 : arg1.field1511;
        int var5 = arg1.field1422 == 0 ? arg1.field1517 : arg1.field1422;
        class109.method802(arg2, 23783, var4, arg1.field1446, var5, class609.field8594[arg1.field1446 >> 16]);
        if (arg1.field1394 != null) {
            class109.method802(arg2, 23783, var4, arg1.field1446, var5, arg1.field1394);
        }
        class610 var6 = (class610) class278.field3993.method3669(false, (long) arg1.field1446);
        if (var6 != null) {
            class49.method414(var5, arg2, var4, -1, var6.field8600);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILgga;)Lvj;", line = 42)
    public static final class229 method2054(int arg0, class511 arg1) {
        field4571++;
        int var2 = -72 % ((arg0 - 23) / 62);
        class176 var3 = class81.method575(arg1, -94);
        int var4 = arg1.method2979(75212712);
        return new class229(var3.field2220, var3.field2228, var3.field2221, var3.field2222, var3.field2227, var4);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Ljava/awt/Canvas;BII)Lfb;", line = 56)
    public static final class540 method2055(Canvas arg0, byte arg1, int arg2, int arg3) {
        field4576++;
        try {
            if (arg1 > -52) {
                field4578 = 16;
            }
            Class var4 = Class.forName("hm");
            class540 var5 = (class540) var4.getDeclaredConstructor().newInstance();
            var5.method1621(arg0, arg3, arg2, (byte) -19);
            return var5;
        } catch (Throwable var7) {
            class401 var6 = new class401();
            var6.method1621(arg0, arg3, arg2, (byte) -19);
            return var6;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIZIII)V", line = 85)
    public static final void method2056(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg1 != (arg3 ? class688.field9602.field8535.method1981((byte) -98) : class688.field9602.field8548.method1981((byte) -98)) && arg0 != 0 && class70.field770 < 50 && arg5 != -1) {
            class7.field40[class70.field770++] = new class22((byte) (arg3 ? 3 : 2), arg5, arg0, arg4, arg2, 0, arg6, null);
        }
        field4577++;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V", line = 102)
    public static void method2057(int arg0) {
        field4572 = null;
        int var1 = 91 % ((arg0 + 15) / 63);
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "()V", line = 111)
    public class324() {
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(I)V", line = 113)
    public class324(int arg0) {
        this.field4575 = arg0;
    }
}
