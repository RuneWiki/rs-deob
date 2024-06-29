import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class564 {

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "Lfu;")
    private class638 field7983 = new class638();

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public static int field7991 = 1;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Lcb;")
    public static class631 field7979 = new class631(46, -1);

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "Z")
    public static boolean field7994 = false;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "Lcb;")
    public static class631 field7995 = new class631(31, 16);

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public static int field7997 = -1;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    public static int field7999 = 0;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field7978;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field7980;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field7981;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field7982;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field7984;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field7985;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field7986;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public static int field7987;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field7988;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field7989;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field7990;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public static int field7993;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "J")
    public static long field7996;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "Lla;")
    public static class422 field7992;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "Lfu;")
    private class638 field7998;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)I")
    public final int method3262(int arg0) {
        field7990++;
        if (arg0 > -32) {
            return 27;
        }
        int var2 = 0;
        class638 var3 = this.field7983.field8962;
        while (this.field7983 != var3) {
            var3 = var3.field8962;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)Z")
    public final boolean method3263(byte arg0) {
        if (arg0 != 88) {
            method3264(96, -34, true, 36, -67, (byte) -64);
        }
        field7993++;
        return this.field7983.field8962 == this.field7983;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIZIIB)V")
    public static final void method3264(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5) {
        field7988++;
        if (class196.field3382 != null && (arg4 != 3 || class120.field1835 != arg1 || class463.field6738 != arg3)) {
            class714.method3947(class196.field3382, class706.field9962, false);
            class196.field3382 = null;
        }
        if (arg4 == 3 && class196.field3382 == null) {
            class196.field3382 = class551.method3215(0, class706.field9962, arg3, arg1, 0, 0);
            if (class196.field3382 != null) {
                class120.field1835 = arg1;
                class463.field6738 = arg3;
                class580.method3351((byte) -90);
            }
        }
        if (arg4 == 3 && class196.field3382 == null) {
            method3264(arg0, -1, true, -1, class654.field9289.field5421.method2689(3), (byte) -100);
            return;
        }
        Container var6;
        if (class196.field3382 != null) {
            class205.field3443 = arg1;
            var6 = class196.field3382;
            class245.field3938 = arg3;
        } else if (class530.field7619 == null) {
            if (class351.field5138 == null) {
                var6 = class690.field9800;
            } else {
                var6 = class351.field5138;
            }
            class205.field3443 = var6.getSize().width;
            class245.field3938 = var6.getSize().height;
        } else {
            Insets var7 = class530.field7619.getInsets();
            int var10001 = -var7.right;
            class205.field3443 = class530.field7619.getSize().width + var10001 - var7.left;
            class245.field3938 = class530.field7619.getSize().height - var7.top - var7.bottom;
            var6 = class530.field7619;
        }
        if (arg4 == 1) {
            class189.field3184 = (class205.field3443 - class335.field4917) / 2;
            class660.field9408 = class335.field4917;
            class581.field8223 = 0;
            class412.field6066 = class614.field8651;
        } else {
            class72.method658(800);
        }
        if (class478.field6941 != class209.field3494) {
            boolean var10000;
            if (class660.field9408 < 1024 && class412.field6066 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg2) {
            class242.method1680(74);
        } else {
            class400.field5941.setSize(class660.field9408, class412.field6066);
            if (class250.field3989) {
                class148.method1126(class400.field5941, false);
            } else {
                class364.field5573.method361(class400.field5941, class660.field9408, class412.field6066);
            }
            if (class530.field7619 == var6) {
                Insets var8 = class530.field7619.getInsets();
                class400.field5941.setLocation(class189.field3184 + var8.left, class581.field8223 + var8.top);
            } else {
                class400.field5941.setLocation(class189.field3184, class581.field8223);
            }
        }
        if (arg4 >= 2) {
            class138.field2166 = true;
        } else {
            class138.field2166 = false;
        }
        if (class673.field9523 != -1) {
            class173.method1363(true, (byte) 79);
        }
        if (class166.field2624 != null && client.method2740(class521.field7529, (byte) 121)) {
            class24.method130(1);
        }
        for (int var9 = 0; var9 < 100; var9++) {
            class6.field66[var9] = true;
        }
        class468.field6816 = true;
        if (arg5 > -80) {
            method3273((byte) 86, 100, 65);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)I")
    public static final int method3265(int arg0) {
        if (arg0 != -4) {
            method3270(120);
        }
        field7980++;
        return class403.field5985;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lfu;Z)V")
    public final void method3266(class638 arg0, boolean arg1) {
        field7986++;
        if (arg0.field8961 != null) {
            arg0.method3610(-25057);
        }
        arg0.field8961 = this.field7983.field8961;
        arg0.field8962 = this.field7983;
        arg0.field8961.field8962 = arg0;
        if (!arg1) {
            field7999 = -124;
        }
        arg0.field8962.field8961 = arg0;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)Lfu;")
    public final class638 method3267(int arg0) {
        field7985++;
        if (arg0 != -4) {
            field7991 = -77;
        }
        class638 var2 = this.field7983.field8961;
        if (this.field7983 == var2) {
            this.field7998 = null;
            return null;
        } else {
            this.field7998 = var2.field8961;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method3268(String arg0, int arg1, int arg2) {
        class157.method1177("", 0, arg0, "", "", arg1 - 17136, arg2);
        if (arg1 != 17137) {
            method3268(null, -124, -93);
        }
        field7978++;
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V")
    public final void method3269(int arg0) {
        if (arg0 != 0) {
            this.method3267(12);
        }
        field7987++;
        while (true) {
            class638 var2 = this.field7983.field8962;
            if (this.field7983 == var2) {
                this.field7998 = null;
                return;
            }
            var2.method3610(-25057);
        }
    }

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)V")
    public static void method3270(int arg0) {
        field7995 = null;
        field7979 = null;
        field7992 = null;
        if (arg0 >= -126) {
            method3268(null, -74, 75);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)Lfu;")
    public final class638 method3271(byte arg0) {
        field7982++;
        class638 var2 = this.field7983.field8962;
        int var3 = -112 % ((68 - arg0) / 41);
        if (this.field7983 == var2) {
            return null;
        } else {
            var2.method3610(-25057);
            return var2;
        }
    }

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "(I)Lfu;")
    public final class638 method3272(int arg0) {
        if (arg0 > -112) {
            return null;
        }
        field7981++;
        class638 var2 = this.field7983.field8962;
        if (this.field7983 == var2) {
            this.field7998 = null;
            return null;
        } else {
            this.field7998 = var2.field8962;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BII)V")
    public static final void method3273(byte arg0, int arg1, int arg2) {
        class127.method981(arg1, arg2, (byte) 109);
        if (arg0 != -109) {
            method3264(96, 11, false, 37, -119, (byte) -53);
        }
        field7984++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)Lfu;")
    public final class638 method3274(boolean arg0) {
        field7989++;
        class638 var2 = this.field7998;
        if (arg0) {
            field7992 = null;
        }
        if (this.field7983 == var2) {
            this.field7998 = null;
            return null;
        } else {
            this.field7998 = var2.field8962;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    public class564() {
        this.field7983.field8962 = this.field7983;
        this.field7983.field8961 = this.field7983;
    }
}
