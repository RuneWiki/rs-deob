import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class507 {

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "Lkh;")
    private class13 field7411 = new class13(256);

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "Lul;")
    private class406 field7403;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "Z")
    public static boolean field7405 = true;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "Lob;")
    public static class521 field7402 = new class521(11, 16);

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "Z")
    public static boolean field7413 = false;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field7401;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field7404;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field7406;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public static int field7407;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
    public static int field7409;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
    public static int field7410;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "Lm;")
    public static class130 field7412;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lhp;I)Lwh;", line = 6)
    public static final class102 method3018(class217 arg0, int arg1) {
        int var2 = -122 / ((arg1 + 85) / 36);
        field7410++;
        return new class102(arg0.method1529((byte) -114), arg0.method1529((byte) 115), arg0.method1529((byte) -86), arg0.method1529((byte) -29), arg0.method1529((byte) 114), arg0.method1529((byte) -88), arg0.method1529((byte) -98), arg0.method1529((byte) 92), arg0.method1548(31529), arg0.method1515((byte) 126));
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)Lau;", line = 17)
    public final class520 method3019(int arg0, int arg1) {
        field7407++;
        class13 var3 = this.field7411;
        class520 var4;
        synchronized (this.field7411) {
            var4 = (class520) this.field7411.method87((long) arg1, arg0 ^ 0x7AECF37D);
            if (arg0 != -19524) {
                this.method3025(-10, -27);
            }
        }
        if (var4 != null) {
            return var4;
        }
        class406 var5 = this.field7403;
        byte[] var6;
        synchronized (this.field7403) {
            var6 = this.field7403.method2536(26, 0, arg1);
        }
        class520 var7 = new class520();
        if (var6 != null) {
            var7.method3100(18709, new class217(var6));
        }
        class13 var8 = this.field7411;
        synchronized (this.field7411) {
            this.field7411.method84((long) arg1, var7, (byte) 27);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V", line = 47)
    public static void method3020(int arg0) {
        field7402 = null;
        if (arg0 > -36) {
            field7413 = true;
        }
        field7412 = null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZFFFI)F", line = 61)
    public static final float method3021(boolean arg0, float arg1, float arg2, float arg3, int arg4) {
        if (arg0) {
            field7409++;
            float[] var5 = class89.field1275[arg4];
            return var5[2] * arg1 + var5[1] * arg3 + var5[0] * arg2;
        } else {
            return -0.9152419F;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V", line = 80)
    public final void method3022(byte arg0) {
        field7404++;
        class13 var2 = this.field7411;
        synchronized (this.field7411) {
            int var3 = -58 % ((arg0 - 48) / 34);
            this.field7411.method88(104);
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)V", line = 92)
    public final void method3023(byte arg0) {
        field7408++;
        class13 var2 = this.field7411;
        synchronized (this.field7411) {
            if (arg0 == 67) {
                this.field7411.method93((byte) 100);
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIB)I", line = 111)
    public static final int method3024(int arg0, int arg1, byte arg2) {
        if (arg0 < arg1) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        if (arg2 > -34) {
            return 33;
        }
        field7401++;
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lee;ILul;)V", line = 157)
    public class507(class480 arg0, int arg1, class406 arg2) {
        this.field7403 = arg2;
        this.field7403.method2551(26, -26070);
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(II)V", line = 145)
    public final void method3025(int arg0, int arg1) {
        if (arg0 != -1384) {
            field7413 = false;
        }
        field7406++;
        class13 var3 = this.field7411;
        synchronized (this.field7411) {
            this.field7411.method91(99, arg1);
        }
    }
}
