import jaggl.OpenGL;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class368 extends class221 {

    @OriginalMember(owner = "client!gh", name = "E", descriptor = "I")
    private int field5523 = -1;

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "I")
    private int field5529 = -1;

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "I")
    public int field5528;

    @OriginalMember(owner = "client!gh", name = "I", descriptor = "Ldc;")
    public static class5 field5527 = new class5(64);

    @OriginalMember(owner = "client!gh", name = "O", descriptor = "I")
    public static int field5533 = -2;

    @OriginalMember(owner = "client!gh", name = "N", descriptor = "Z")
    public static boolean field5532 = false;

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "Liu;")
    public static class390 field5530 = new class390(72, -2);

    @OriginalMember(owner = "client!gh", name = "C", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!gh", name = "D", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!gh", name = "F", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!gh", name = "G", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!gh", name = "H", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!gh", name = "M", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
    public static void method2241(int arg0) {
        field5530 = null;
        if (arg0 != 6) {
            field5533 = -8;
        }
        field5527 = null;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lrl;II)V")
    public class368(class487 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field5528 = arg2;
        super.field3112.method2883(this, 96);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field3119, arg2, arg2, 0, class195.method1221(101, super.field3119), 5121, (byte[]) null, 0);
        }
        this.method1357(true, (byte) 119);
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V")
    public static final void method2242(int arg0) {
        ++field5522;
        class142.field1855 = class372.method2265((byte) 80, 4, true, 35, 2048, arg0, 8, 0.4F);
    }

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "(I)V")
    public static final void method2243(int arg0) {
        ++field5524;
        for (int var1 = arg0; class339.field4942 > var1; ++var1) {
            int var2 = class263.field3749[var1];
            class139 var3 = class504.field7697[var2];
            if (var3 != null) {
                class399.method2381((byte) -98, var3, var3.field1825.field3806);
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method2244(long arg0, int arg1) {
        ++field5526;
        class457.field6661.setTime(new Date(arg0));
        int var3 = class457.field6661.get(7);
        int var4 = class457.field6661.get(5);
        int var5 = class457.field6661.get(2);
        int var6 = class457.field6661.get(arg1);
        int var7 = class457.field6661.get(11);
        int var8 = class457.field6661.get(12);
        int var9 = class457.field6661.get(13);
        return class487.field7284[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + class135.field1731[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIII)V")
    public final void method2245(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5525;
        OpenGL.glFramebufferTexture2DEXT(arg4, arg0, arg3, super.field3131, arg1);
        this.field5529 = arg4;
        if (arg2 >= 35) {
            this.field5523 = arg0;
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lrl;IIZ[[BI)V")
    public class368(class487 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field5528 = arg2;
        super.field3112.method2883(this, -96);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(34069 - -var7, 0, super.field3119, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method1357(true, (byte) 86);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lso;I)V")
    public static final void method2246(class313 arg0, int arg1) {
        ++field5521;
        class173 var2 = (class173) class99.field1347.method2310((byte) 84, (long) arg0.field4262);
        if (var2 != null) {
            var2.method1090(-1);
        } else {
            class204.method1256(arg0.field2956, 0, (class486) null, (class139) null, true, arg0.field4279[0], arg0, arg0.field4282[0]);
        }
        if (arg1 <= 70) {
            method2246((class313) null, 76);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public final void method224(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field5529, this.field5523, 3553, arg0, 0);
        ++field5531;
        this.field5529 = -1;
        this.field5523 = -1;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lrl;IIZ[[I)V")
    public class368(class487 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field5528 = arg2;
        super.field3112.method2883(this, 126);
        if (!arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, super.field3119, arg2, arg2, 0, 32993, super.field3112.field7403, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                class405.method2422(super.field3112.field7403, super.field3119, arg4[var7], arg2, arg2, 91, 32993, var7 + 34069);
            }
        }
        this.method1357(true, (byte) 97);
    }
}
