import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public class class268 extends class747 {

    @OriginalMember(owner = "client!uga", name = "J", descriptor = "I")
    private int field3920;

    @OriginalMember(owner = "client!uga", name = "E", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!uga", name = "G", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!uga", name = "H", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!uga", name = "I", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!uga", name = "L", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!uga", name = "M", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!uga", name = "O", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!uga", name = "K", descriptor = "Lrp;")
    public static class135 field3921;

    @OriginalMember(owner = "client!uga", name = "N", descriptor = "Ljava/lang/Object;")
    public static Object field3924;

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(II)[I", line = 4)
    public final int[] method182(int arg0, int arg1) {
        if (arg1 >= -89) {
            return null;
        } else {
            ++field3923;
            int[] var3 = super.field10279.method3479(true, arg0);
            if (super.field10279.field8263) {
                class245.method1648(var3, 0, class73.field1095, this.field3920);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(IBI)Z", line = 29)
    public static final boolean method1818(int arg0, byte arg1, int arg2) {
        if (arg1 >= -104) {
            method1818(-128, (byte) -96, 58);
        }
        ++field3917;
        return ~(2048 & arg2) != -1;
    }

    @OriginalMember(owner = "client!uga", name = "c", descriptor = "(I)V", line = 40)
    public static void method1819(int arg0) {
        if (arg0 != 255) {
            field3924 = null;
        }
        field3924 = null;
        field3921 = null;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(Ldc;II)V", line = 55)
    public final void method183(class63 arg0, int arg1, int arg2) {
        if (arg1 != 11608) {
            field3921 = null;
        }
        if (arg2 == 0) {
            this.field3920 = (arg0.method505((byte) -119) << 12) / 255;
        }
        ++field3918;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(BIIZ)V", line = 84)
    public static final void method1820(byte arg0, int arg1, int arg2, boolean arg3) {
        if (arg0 == -92) {
            if (class131.field1826.method812(122, (long) arg1) == null) {
                if (class602.field8149) {
                    class160 var4 = new class160(arg1, new class111(4096, class449.field6213, arg1), arg2, arg3);
                    var4.field2234.method3574((byte) -77, class344.field4905[class120.field1576]);
                    class131.field1826.method820((long) arg1, (byte) -42, var4);
                } else {
                    class612.method3474(arg1, 0, arg3);
                }
            }
            ++field3916;
        }
    }

    @OriginalMember(owner = "client!uga", name = "d", descriptor = "(Z)V", line = 110)
    public static final void method1821(boolean arg0) {
        ++field3922;
        class216 var1 = null;
        try {
            if (arg0) {
                return;
            }
            class246 var2 = class159.field2227.method873("2", true, (byte) -21);
            while (~var2.field3633 == -1) {
                class688.method3874(1L, -7375);
            }
            if (var2.field3633 == 1) {
                var1 = (class216) var2.field3638;
                byte[] var3 = new byte[(int) var1.method1274(112)];
                int var5;
                for (int var4 = 0; ~var4 > ~var3.length; var4 += var5) {
                    var5 = var1.method1268(var3, var3.length + -var4, var4, 31833);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class122.method759(new class63(var3), -4097);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method1273(85);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(II[BI)I", line = 159)
    public static final int method1822(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 != 0) {
            field3924 = null;
        }
        ++field3925;
        int var4 = -1;
        for (int var5 = arg1; arg0 > var5; ++var5) {
            var4 = var4 >>> 8 ^ class424.field5955[(var4 ^ arg2[var5]) & 255];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(IIIII)V", line = 182)
    public static final void method1823(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3919;
        if (~class607.field8185 >= ~arg3 && arg3 <= class726.field10064) {
            int var5 = class41.method223(true, class262.field3848, class291.field4181, arg1);
            int var6 = class41.method223(true, class262.field3848, class291.field4181, arg2);
            class158.method993(arg0, var6, var5, arg3, true);
        }
        if (arg4 != 6257) {
            field3921 = null;
        }
    }

    @OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(I)V", line = 199)
    public class268(int arg0) {
        super(0, true);
        this.field3920 = 4096;
        this.field3920 = arg0;
    }

    @OriginalMember(owner = "client!uga", name = "<init>", descriptor = "()V", line = 211)
    public class268() {
        this(4096);
    }
}
