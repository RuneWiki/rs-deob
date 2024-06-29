import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class382 {

    @OriginalMember(owner = "client!je", name = "k", descriptor = "Ltq;")
    private class536 field4778 = new class536(64);

    @OriginalMember(owner = "client!je", name = "n", descriptor = "Ltq;")
    public class536 field4781 = new class536(2);

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Lwm;")
    public class30 field4769;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "Lwm;")
    private class30 field4772;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "Z")
    public static boolean field4780 = true;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Luw;")
    public static class208 field4768 = new class208(25, 4);

    @OriginalMember(owner = "client!je", name = "p", descriptor = "[I")
    public static int[] field4783 = new int[1000];

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field4779;

    // $FF: synthetic field
    @OriginalMember(owner = "client!je", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field4784;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "[I")
    public static int[] field4771;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "[[I")
    public static int[][] field4782;

    // $FF: synthetic method
    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2196(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIII)Z", line = 4)
    public static final boolean method2188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4776++;
        if (arg5 >= -51) {
            field4782 = null;
        }
        for (int var6 = arg3; var6 <= arg1; var6++) {
            for (int var7 = arg4; var7 <= arg2; var7++) {
                if (class310.field3885[var6][var7] == arg0 && class562.field7136[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)V", line = 40)
    public final void method2189(byte arg0, int arg1) {
        class536 var3 = this.field4778;
        synchronized (this.field4778) {
            this.field4778.method2928(true, arg1);
        }
        field4779++;
        class536 var4 = this.field4781;
        synchronized (this.field4781) {
            this.field4781.method2928(true, arg1);
            if (arg0 >= -71) {
                this.method2190((byte) -26);
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V", line = 56)
    public final void method2190(byte arg0) {
        field4777++;
        class536 var2 = this.field4778;
        synchronized (this.field4778) {
            this.field4778.method2919(0);
        }
        class536 var3 = this.field4781;
        synchronized (this.field4781) {
            this.field4781.method2919(0);
        }
        if (arg0 != 52) {
            field4771 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V", line = 76)
    public static void method2191(byte arg0) {
        field4783 = null;
        field4782 = null;
        if (arg0 != -57) {
            field4782 = null;
        }
        field4768 = null;
        field4771 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIB)I", line = 92)
    public static final int method2192(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 > -26) {
            method2191((byte) 16);
        }
        field4775++;
        if (arg1 > 243) {
            arg2 >>= 0x4;
        } else if (arg1 > 217) {
            arg2 >>= 0x3;
        } else if (arg1 > 192) {
            arg2 >>= 0x2;
        } else if (arg1 > 179) {
            arg2 >>= 0x1;
        }
        return ((arg0 & 0xFF) >> 2 << 10) + (arg2 >> 5 << 7) + (arg1 >> 1);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 120)
    public final void method2193(int arg0) {
        field4774++;
        class536 var2 = this.field4778;
        synchronized (this.field4778) {
            if (arg0 != -25031) {
                field4782 = null;
            }
            this.field4778.method2932((byte) 80);
        }
        class536 var3 = this.field4781;
        synchronized (this.field4781) {
            this.field4781.method2932((byte) 80);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 142)
    public static final boolean method2194(String arg0, int arg1) {
        if (arg1 != 31749) {
            field4768 = null;
        }
        field4773++;
        return class275.method1697(true, field4784 == null ? (field4784 = method2196("he")) : field4784, arg0);
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lega;ILwm;Lwm;)V", line = 197)
    public class382(class473 arg0, int arg1, class30 arg2, class30 arg3) {
        this.field4769 = arg3;
        this.field4772 = arg2;
        this.field4772.method138(0, 33);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Lcca;", line = 161)
    public final class483 method2195(int arg0, int arg1) {
        field4770++;
        class536 var3 = this.field4778;
        class483 var4;
        synchronized (this.field4778) {
            var4 = (class483) this.field4778.method2931((long) arg0, (byte) -103);
        }
        if (var4 != null) {
            return var4;
        }
        class30 var5 = this.field4772;
        byte[] var6;
        synchronized (this.field4772) {
            var6 = this.field4772.method139(arg1, (byte) -94, arg0);
        }
        class483 var7 = new class483();
        var7.field6233 = this;
        if (var6 != null) {
            var7.method2712(new class234(var6), arg1 - 159);
        }
        class536 var8 = this.field4778;
        synchronized (this.field4778) {
            this.field4778.method2918((long) arg0, var7, 110);
            return var7;
        }
    }
}
