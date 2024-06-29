import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class186 {

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "Lkh;")
    private class13 field2818 = new class13(16);

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "Lul;")
    private class406 field2813;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "Loe;")
    public static class137 field2821 = new class137();

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "Lob;")
    public static class521 field2822 = new class521(76, 0);

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "I")
    public static int field2823 = -1;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)V")
    public final void method1232(boolean arg0) {
        class13 var2 = this.field2818;
        synchronized (this.field2818) {
            if (arg0) {
                this.field2813 = null;
            }
            this.field2818.method88(82);
        }
        field2815++;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
    public static void method1233(int arg0) {
        field2822 = null;
        field2821 = null;
        if (arg0 >= -81) {
            method1236(false, -50);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lkt;IIIII)Lng;")
    public final class229 method1234(class110 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2819++;
        class90[] var7 = null;
        class191 var8 = this.method1238(false, arg5);
        if (arg2 != 903) {
            return null;
        }
        if (var8.field3221 != null) {
            var7 = new class90[var8.field3221.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class435 var10 = arg0.method841(var8.field3221[var9], (byte) 118);
                var7[var9] = new class90(var10.field6426, var10.field6427, var10.field6437, var10.field6425, var10.field6431, var10.field6436, var10.field6430, var10.field6428);
            }
        }
        return new class229(var8.field3227, var7, var8.field3228, arg4, arg3, arg1);
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V")
    public final void method1235(int arg0) {
        field2816++;
        class13 var2 = this.field2818;
        synchronized (this.field2818) {
            this.field2818.method93((byte) 88);
            if (arg0 > -14) {
                this.method1235(39);
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZI)S")
    public static final short method1236(boolean arg0, int arg1) {
        field2820++;
        int var2 = (arg1 & 0xFE1F) >> 10;
        int var3 = (arg1 & 0x387) >> 3;
        if (arg0) {
            method1233(-127);
        }
        int var4 = arg1 & 0x7F;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var7 >> 4 << 7 | var2 << 10 | var6);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V")
    public final void method1237(int arg0, int arg1) {
        class13 var3 = this.field2818;
        synchronized (this.field2818) {
            if (arg0 != -28063) {
                return;
            }
            this.field2818.method91(31, arg1);
        }
        field2817++;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(ZI)Luu;")
    private final class191 method1238(boolean arg0, int arg1) {
        field2812++;
        class13 var3 = this.field2818;
        class191 var4;
        synchronized (this.field2818) {
            var4 = (class191) this.field2818.method87((long) arg1, -2062335807);
        }
        if (var4 != null) {
            return var4;
        }
        class406 var5 = this.field2813;
        byte[] var6;
        synchronized (this.field2813) {
            var6 = this.field2813.method2536(29, 0, arg1);
        }
        class191 var7 = new class191();
        if (var6 != null) {
            var7.method1337(-107, new class217(var6));
        }
        class13 var8 = this.field2818;
        synchronized (this.field2818) {
            this.field2818.method84((long) arg1, var7, (byte) 27);
        }
        if (arg0) {
            field2821 = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lee;ILul;)V")
    public class186(class480 arg0, int arg1, class406 arg2) {
        this.field2813 = arg2;
        this.field2813.method2551(29, -26070);
    }
}
