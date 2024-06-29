import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class269 extends class317 {

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    private final int field4495;

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "I")
    private final int field4502;

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
    private final int field4501;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    private final int field4494;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "[Lak;")
    public static class159[] field4499;

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "[[[B")
    public static byte[][][] field4503;

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(IIIIIII)V", line = 5)
    public class269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4495 = arg2;
        this.field4502 = arg0;
        this.field4501 = arg1;
        this.field4494 = arg3;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 17)
    public static final void method1839(int arg0) {
        field4498++;
        if (class131.field2364 == 5) {
            class131.field2364 = 6;
            if (arg0 != -300975924) {
                field4499 = (class159[]) null;
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I[B)Lbj;", line = 31)
    public static final class276 method1840(int arg0, byte[] arg1) {
        field4493++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 != -3) {
            field4499 = (class159[]) null;
        }
        class276 var2;
        if (class117.field2159) {
            var2 = new class191(arg1, class127.field2312, class40.field646, class190.field3253, class260.field4333, class317.field5350);
        } else {
            var2 = new class189(arg1, class127.field2312, class40.field646, class190.field3253, class260.field4333, class317.field5350);
        }
        class247.method1738(arg0 + 119);
        return var2;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(III)V", line = 58)
    public final void method424(int arg0, int arg1, int arg2) {
        if (arg2 != 50) {
            field4503 = (byte[][][]) ((byte[][][]) null);
        }
        int var4 = this.field4501 * arg0 >> 12;
        field4497++;
        int var5 = this.field4502 * arg1 >> 12;
        int var6 = this.field4494 * arg0 >> 12;
        int var7 = this.field4495 * arg1 >> 12;
        class242.method1714(var7, 123, var5, var4, var6, this.field5347);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZIIIII)V", line = 85)
    public static final void method1841(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class212.field3568 = arg5;
        class61.field951 = arg2;
        class279.field4703 = arg4;
        class43.field698 = arg1;
        field4496++;
        class190.field3256 = arg3;
        if (arg0) {
            method1843(-34);
        }
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(III)V", line = 100)
    public final void method422(int arg0, int arg1, int arg2) {
        field4504++;
        if (arg2 != 4) {
            method1844((class162) null, (class162) null, -102, (class162) null, (byte) -107);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIB)I", line = 113)
    public static final int method1842(int arg0, int arg1, byte arg2) {
        field4500++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return arg2 == 41 ? (arg0 & 0xFF80) + var3 : 80;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V", line = 136)
    public final void method421(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field4503 = (byte[][][]) ((byte[][][]) null);
        }
        field4505++;
        int var4 = this.field4495 * arg1 >> 12;
        int var5 = this.field4494 * arg2 >> 12;
        int var6 = this.field4502 * arg1 >> 12;
        int var7 = this.field4501 * arg2 >> 12;
        class228.method1633(this.field5343, var7, var6, this.field5347, (byte) 99, var4, var5, this.field5345);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V", line = 169)
    public static void method1843(int arg0) {
        field4503 = (byte[][][]) null;
        if (arg0 > 92) {
            field4499 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lbd;Lbd;ILbd;B)V", line = 182)
    public static final void method1844(class162 arg0, class162 arg1, int arg2, class162 arg3, byte arg4) {
        if (arg4 != 75) {
            field4503 = (byte[][][]) ((byte[][][]) null);
        }
        field4492++;
        class63.method426(arg2, -1, arg1, -1, arg0, arg3);
    }
}
