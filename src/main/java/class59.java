import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public abstract class class59 {

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IBIII)V", line = 8)
    public static final void method418(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 58) {
            field1008 = -28;
        }
        field1007++;
        if (arg2 >= class248.field3808 && arg2 <= class478.field7310) {
            int var5 = class167.method1056(class320.field4818, (byte) -125, class355.field5296, arg3);
            int var6 = class167.method1056(class320.field4818, (byte) -126, class355.field5296, arg4);
            class15.method79(var6, arg0, (byte) -4, arg2, var5);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(III)Ltq;", line = 27)
    public static final class427 method419(int arg0, int arg1, int arg2) {
        field1006++;
        class427 var3 = class413.method2435(160291920, arg2);
        if (arg0 == -1) {
            return var3;
        } else if (arg1 == 12782) {
            return var3 == null || var3.field6193 == null || var3.field6193.length <= arg0 ? null : var3.field6193[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IBII)V", line = 47)
    public static final void method420(int arg0, byte arg1, int arg2, int arg3) {
        field1005++;
        if (class321.field4830 == null) {
            return;
        }
        long var4 = (long) (arg0 | arg3 << 28 | arg2 << 14);
        class163 var6 = (class163) class252.field3845.method2409(false, var4);
        if (var6 == null) {
            class91.method684(arg3, arg0, arg2);
            return;
        }
        if (arg1 != 40) {
            method418(-18, (byte) 110, -1, 80, -21);
        }
        class1 var7 = (class1) var6.field2536.method8((byte) -98);
        if (var7 == null) {
            class91.method684(arg3, arg0, arg2);
            return;
        }
        class377 var8 = (class377) class91.method684(arg3, arg0, arg2);
        if (var8 == null) {
            var8 = new class377();
        } else {
            var8.field5506 = var8.field5496 = -1;
        }
        var8.field5494 = var7.field1;
        var8.field5503 = var7.field3;
        label48: while (true) {
            class1 var9 = (class1) var6.field2536.method17((byte) -94);
            if (var9 == null) {
                break;
            }
            if (var8.field5494 != var9.field1) {
                var8.field5506 = var9.field1;
                var8.field5497 = var9.field3;
                while (true) {
                    class1 var10 = (class1) var6.field2536.method17((byte) -115);
                    if (var10 == null) {
                        break label48;
                    }
                    if (var8.field5494 != var10.field1 && var8.field5506 != var10.field1) {
                        var8.field5496 = var10.field1;
                        var8.field5495 = var10.field3;
                    }
                }
            }
        }
        int var11 = class7.method38((arg0 << 7) + 64, arg3, (arg2 << 7) + 64, (byte) -54);
        class440.method2564(arg3, arg0, arg2, var11, var8);
    }

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "(I)V", line = 131)
    public static final void method421(int arg0) {
        class432.field6354 = new class456[50];
        field1004++;
        class255.field3888 = 0;
        int var1 = -104 / ((arg0 + 11) / 54);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(BLqq;)Lkm;")
    public abstract class227 method169(byte arg0, class318 arg1);

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "(I)Z")
    public abstract boolean method164(int arg0);

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(ZLqq;)V")
    public abstract void method172(boolean arg0, class318 arg1);

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILqq;Lps;ZZII)V")
    public abstract void method165(int arg0, class318 arg1, class59 arg2, boolean arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lqq;BII)Z")
    public abstract boolean method162(class318 arg0, byte arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "(I)V")
    public abstract void method168(int arg0);
}
