import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class491 {

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "Lnga;")
    private class510 field7000 = new class510(16);

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "Leq;")
    private class209 field7001;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field6996 = -1;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Z")
    public static boolean field6993 = true;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field6994;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field6995;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field6997;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field6998;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    public static int field7003;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    public static int field7004;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "Leq;")
    public static class209 field7005;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "[I")
    public static int[] field7002;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V", line = 3)
    public final void method2951(byte arg0) {
        class510 var2 = this.field7000;
        synchronized (this.field7000) {
            if (arg0 >= -73) {
                return;
            }
            this.field7000.method3050(false);
        }
        field7004++;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 18)
    public static void method2952(int arg0) {
        field7002 = null;
        int var1 = -60 % ((14 - arg0) / 57);
        field7005 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLoea;)V", line = 29)
    public static final void method2953(byte arg0, class594 arg1) {
        if (class23.field300 == null) {
            class456 var2 = new class456();
            byte[] var3 = var2.method2788(arg0 ^ 0xFFFFFFA4, 128, 128, 16);
            class23.field300 = class187.method1323(100, false, var3);
        }
        field6998++;
        if (class429.field6002 == null) {
            class343 var4 = new class343();
            byte[] var5 = var4.method2175(128, 16, (byte) -90, 128);
            class429.field6002 = class187.method1323(100, false, var5);
        }
        if (arg0 != -43) {
            method2955(null, true);
        }
        class292 var6 = arg1.field8549;
        if (var6.method1880(35632) && class428.field5986 == null) {
            byte[] var7 = class677.method3831(4.0F, new class579(419684), 16, 8, 0.6F, 16.0F, 0.5F, 4.0F, 128, 128, 2046);
            class428.field5986 = class187.method1323(100, false, var7);
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V", line = 70)
    public final void method2954(int arg0) {
        class510 var2 = this.field7000;
        synchronized (this.field7000) {
            this.field7000.method3048(false);
        }
        field6995++;
        if (arg0 != 419684) {
            this.field7001 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lkca;Z)I", line = 89)
    public static final int method2955(class82 arg0, boolean arg1) {
        if (arg1) {
            return -128;
        }
        field7003++;
        if (class369.field5177 == arg0) {
            return 6407;
        } else if (class282.field4019 == arg0) {
            return 6408;
        } else if (class643.field9137 == arg0) {
            return 6406;
        } else if (class582.field8222 == arg0) {
            return 6409;
        } else if (class98.field1673 == arg0) {
            return 6410;
        } else if (class218.field3109 == arg0) {
            return 6145;
        } else {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)V", line = 133)
    public final void method2956(int arg0, int arg1) {
        class510 var3 = this.field7000;
        synchronized (this.field7000) {
            this.field7000.method3049(arg1, (byte) 126);
        }
        if (arg0 != 419684) {
            this.method2957(57, -57);
        }
        field6994++;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lcw;ILeq;)V", line = 210)
    public class491(class179 arg0, int arg1, class209 arg2) {
        this.field7001 = arg2;
        this.field7001.method1477(0, 29);
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)Ldh;", line = 150)
    private final class320 method2957(int arg0, int arg1) {
        field6999++;
        class510 var3 = this.field7000;
        class320 var4;
        synchronized (this.field7000) {
            var4 = (class320) this.field7000.method3054((byte) -103, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class209 var5 = this.field7001;
        byte[] var6;
        synchronized (this.field7001) {
            var6 = this.field7001.method1453(arg1, 61, 29);
        }
        class320 var7 = new class320();
        if (var6 != null) {
            var7.method2060(new class35(var6), -1);
        }
        class510 var8 = this.field7000;
        synchronized (this.field7000) {
            this.field7000.method3047(false, var7, (long) arg1);
            if (arg0 != -21143) {
                field6996 = -79;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lum;IIIIB)Laj;", line = 179)
    public final class312 method2958(class521 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field6997++;
        class370[] var7 = null;
        class320 var8 = this.method2957(-21143, arg1);
        if (var8.field4544 != null) {
            var7 = new class370[var8.field4544.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class688 var10 = arg0.method3090(350, var8.field4544[var9]);
                var7[var9] = new class370(var10.field9695, var10.field9707, var10.field9705, var10.field9701, var10.field9699, var10.field9696, var10.field9698, var10.field9703);
            }
        }
        if (arg5 != 20) {
            this.method2951((byte) 77);
        }
        return new class312(var8.field4546, var7, var8.field4553, arg2, arg4, arg3);
    }
}
