import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class238 {

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "Lng;")
    private class226 field3501 = new class226(256);

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "Lic;")
    private class491 field3500;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!ws", name = "j", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)V", line = 5)
    public final void method1604(int arg0, int arg1) {
        class226 var3 = this.field3501;
        synchronized (this.field3501) {
            this.field3501.method1534(0, arg1);
        }
        if (arg0 != 2079318495) {
            field3506 = -47;
        }
        field3505++;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)V", line = 22)
    public final void method1605(byte arg0) {
        class226 var2 = this.field3501;
        synchronized (this.field3501) {
            this.field3501.method1540(0);
            if (arg0 != -21) {
                field3499 = -102;
            }
        }
        field3504++;
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(II)Lch;", line = 35)
    public final class322 method1606(int arg0, int arg1) {
        field3498++;
        class226 var3 = this.field3501;
        class322 var4;
        synchronized (this.field3501) {
            var4 = (class322) this.field3501.method1536((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        } else if (arg1 == 20275) {
            byte[] var5 = this.field3500.method2945(26, arg0, true);
            class322 var6 = new class322();
            if (var5 != null) {
                var6.method2001(arg1 ^ 0xFFFFB098, new class209(var5));
            }
            class226 var7 = this.field3501;
            synchronized (this.field3501) {
                this.field3501.method1542(var6, (byte) 112, (long) arg0);
                return var6;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IZI)I", line = 64)
    public static final int method1607(int arg0, boolean arg1, int arg2) {
        field3503++;
        if (!arg1) {
            field3506 = 113;
        }
        int var3 = arg2 >>> 31;
        return (arg2 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(F[BIIFIFFIILuv;IF)V", line = 78)
    public static final void method1608(float arg0, byte[] arg1, int arg2, int arg3, float arg4, int arg5, float arg6, float arg7, int arg8, int arg9, class243 arg10, int arg11, float arg12) {
        if (arg8 != 11625) {
            return;
        }
        for (int var13 = 0; var13 < arg2; var13++) {
            class85.method496(arg7, arg3, false, arg9, arg4, arg10, arg0, arg6, arg2, arg11, arg12, var13, arg1, arg5);
            arg11 += arg3 * arg5;
        }
        field3502++;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V", line = 101)
    public final void method1609(int arg0) {
        field3507++;
        if (arg0 != 26) {
            field3499 = 98;
        }
        class226 var2 = this.field3501;
        synchronized (this.field3501) {
            this.field3501.method1539(-69);
        }
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lai;ILic;)V", line = 121)
    public class238(class423 arg0, int arg1, class491 arg2) {
        this.field3500 = arg2;
        this.field3500.method2942(false, 26);
    }
}
