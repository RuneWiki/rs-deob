import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class28 {

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field502 = 0;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field506 = 0;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "Lde;")
    public static class534 field500 = new class534(260);

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "[F")
    public static float[] field507 = new float[16];

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZLsl;)Lwm;", line = 19)
    public static final class566 method190(boolean arg0, class461 arg1) {
        field505++;
        if (!arg0) {
            field506 = -97;
        }
        class517 var2 = class424.method2363(arg1, (byte) 61);
        int var3 = arg1.method2582(-1);
        return new class566(var2.field7242, var2.field7249, var2.field7239, var2.field7250, var2.field7247, var3);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/lang/Object;ZII)[B", line = 35)
    public static final byte[] method191(Object arg0, boolean arg1, int arg2, int arg3) {
        field504++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var4 = (byte[]) arg0;
            return class359.method2081(0, var4, arg3, arg2);
        } else if (arg1) {
            return null;
        } else if (arg0 instanceof class287) {
            class287 var5 = (class287) arg0;
            return var5.method1705(arg3, arg2, (byte) -8);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 68)
    public static void method192(int arg0) {
        field507 = null;
        field500 = null;
        if (arg0 != 0) {
            field507 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZZ)I", line = 79)
    public static final int method193(int arg0, boolean arg1, boolean arg2) {
        field501++;
        if (arg1) {
            return 0;
        }
        class515 var3 = class534.method3075(arg1, arg0, -120);
        if (var3 == null) {
            return class343.field4343.method1776(arg0, (byte) -68).field1746;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field7226.length; var5++) {
            if (var3.field7226[var5] == -1) {
                var4++;
            }
        }
        if (arg2) {
            method193(-93, true, true);
        }
        return var4 + (class343.field4343.method1776(arg0, (byte) -68).field1746 - var3.field7226.length);
    }
}
