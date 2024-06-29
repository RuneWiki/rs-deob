import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class92 {

    @OriginalMember(owner = "client!er", name = "a", descriptor = "Lvh;")
    private class328 field1213 = new class328(128);

    @OriginalMember(owner = "client!er", name = "m", descriptor = "Lpj;")
    private class132 field1225;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "I")
    public static int field1219 = 0;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "Lfc;")
    public static class235 field1214 = new class235(27, 8);

    @OriginalMember(owner = "client!er", name = "c", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!er", name = "h", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!er", name = "i", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!er", name = "j", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!er", name = "k", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!er", name = "l", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "Lst;")
    public static class397 field1218;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Ljava/lang/String;IIIIJIZLjava/lang/String;BZ)V", line = 3)
    public static final void method678(String arg0, int arg1, int arg2, int arg3, int arg4, long arg5, int arg6, boolean arg7, String arg8, byte arg9, boolean arg10) {
        if (arg9 != -74) {
            method684(125, -100, -118);
        }
        field1221++;
        if (!class229.field3278 && class315.field4697 < 500) {
            int var12 = arg6 == -1 ? class130.field1787 : arg6;
            class345 var13 = new class345(arg8, arg0, var12, arg2, arg3, arg5, arg1, arg4, arg7, arg10);
            class487.field6761.method1273(var13, (byte) 122);
            class315.field4697++;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V", line = 23)
    public static final void method679(int arg0) {
        field1224++;
        class288.field4014.field1301 = 0;
        class182.field2681 = null;
        class602.field8356.field1301 = 0;
        class532.field7250 = 0;
        class324.field4794 = null;
        class290.field4382 = null;
        class77.field1062 = 0;
        class220.field3192 = 0;
        int var1 = 17 % ((arg0 - 50) / 57);
        class522.field7092 = null;
        class535.method2960((byte) -123);
        class274.method1666(128);
        for (int var2 = 0; var2 < 2048; var2++) {
            class495.field6821[var2] = null;
        }
        class253.field3576 = null;
        for (int var3 = 0; var3 < class679.field9578; var3++) {
            class225 var5 = class252.field3537[var3].field2634;
            if (var5 != null) {
                var5.field6391 = -1;
            }
        }
        class252.method1554(-32219);
        class670.field9445 = 1;
        class94.method690(10, (byte) 125);
        for (int var4 = 0; var4 < 100; var4++) {
            class287.field3996[var4] = true;
        }
        class614.method3400((byte) 80);
        class161.field2404 = 0L;
        class622.field8659 = null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BI)Ldj;", line = 81)
    public final class312 method680(byte arg0, int arg1) {
        field1216++;
        class328 var3 = this.field1213;
        class312 var4;
        synchronized (this.field1213) {
            if (arg0 != 56) {
                method683(53);
            }
            var4 = (class312) this.field1213.method1986((byte) -100, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1225.method940(class486.method2740(arg1, arg0 + 65), class312.method1918(arg1, -59), 0);
        class312 var6 = new class312();
        if (var5 != null) {
            var6.method1913(-27481, new class96(var5));
        }
        class328 var7 = this.field1213;
        synchronized (this.field1213) {
            this.field1213.method1985(var6, (long) arg1, (byte) -102);
            return var6;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V", line = 116)
    public static void method681(byte arg0) {
        field1218 = null;
        field1214 = null;
        if (arg0 != 113) {
            method684(-4, -81, 113);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIZ)I", line = 127)
    public static final int method682(int arg0, int arg1, int arg2, boolean arg3) {
        field1215++;
        class421 var4 = class172.method1175(true, arg3, arg2);
        if (var4 == null) {
            return -1;
        } else if (arg0 >= 0 && arg0 < var4.field5945.length) {
            if (arg1 >= -50) {
                method679(-22);
            }
            return var4.field5945[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V", line = 151)
    public static final void method683(int arg0) {
        field1217++;
        class328 var1 = class205.field3010;
        synchronized (class205.field3010) {
            class205.field3010.method1997(arg0 + 1);
            if (arg0 != 0) {
                method681((byte) 75);
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(III)Z", line = 167)
    public static final boolean method684(int arg0, int arg1, int arg2) {
        field1220++;
        if (arg0 != -1) {
            field1219 = -42;
        }
        return class683.method3767(arg1, arg2, (byte) 93) & class395.method2251((byte) -63, arg1, arg2);
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Ldd;ILpj;)V", line = 189)
    public class92(class647 arg0, int arg1, class132 arg2) {
        this.field1225 = arg2;
        if (this.field1225 != null) {
            int var4 = this.field1225.method917((byte) -74) - 1;
            this.field1225.method936(var4, -119);
        }
    }
}
