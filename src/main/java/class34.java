import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class34 {

    @OriginalMember(owner = "client!va", name = "a", descriptor = "Ljava/lang/String;")
    public static String field536 = "M";

    @OriginalMember(owner = "client!va", name = "c", descriptor = "Ljava/lang/String;")
    public static String field538 = " from your ignore list first.";

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field539 = 0;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "[Lq;")
    public static class126[] field541;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public static void method286(int arg0) {
        field536 = null;
        if (arg0 != -1) {
            field541 = null;
        }
        field538 = null;
        field541 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILp;)V")
    public static final void method287(int arg0, class285 arg1) {
        long var2 = 0L;
        if (arg1.field4497 == 0) {
            var2 = class132.method928(arg1.field4505, arg1.field4501, arg1.field4509);
        }
        field537++;
        if (arg1.field4497 == 1) {
            var2 = class118.method861(arg1.field4505, arg1.field4501, arg1.field4509);
        }
        int var4 = -126 % ((-arg0 - 8) / 54);
        if (arg1.field4497 == 2) {
            var2 = class92.method693(arg1.field4505, arg1.field4501, arg1.field4509);
        }
        if (arg1.field4497 == 3) {
            var2 = class124.method896(arg1.field4505, arg1.field4501, arg1.field4509);
        }
        int var5 = -1;
        int var6 = 0;
        int var7 = 0;
        if (var2 != 0L) {
            var5 = Integer.MAX_VALUE & (int) (var2 >>> 32);
            var7 = ((int) var2 & 0x7DF24) >> 14;
            var6 = (int) var2 >> 20 & 0x3;
        }
        arg1.field4510 = var7;
        arg1.field4496 = var6;
        arg1.field4499 = var5;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
    public static final void method288(byte arg0) {
        class131.field2095.method481(false);
        if (arg0 != 21) {
            method288((byte) -100);
        }
        field542++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)Luf;")
    public static final class173 method289(int arg0, byte arg1) {
        field540++;
        class173 var2 = (class173) class180.field2827.method480((long) arg0, 86);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class193.field3088.method1357(class72.method516(arg0, (byte) -88), class141.method976(-456230998, arg0), -1);
        if (arg1 != -94) {
            field541 = null;
        }
        class173 var4 = new class173();
        if (var3 != null) {
            var4.method1181((byte) 126, new class221(var3));
        }
        class180.field2827.method474((long) arg0, (byte) 102, var4);
        return var4;
    }
}
