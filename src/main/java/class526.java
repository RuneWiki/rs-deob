import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class526 {

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "Z")
    public boolean field7725 = false;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "[Lan;")
    public static class20[] field7723 = new class20[50];

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "Ljm;")
    public static class485 field7717 = new class485(4, 2);

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "Ljava/lang/String;")
    public static String field7728 = null;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field7719;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    public static int field7720;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public static int field7721;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "I")
    public static int field7722;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
    public static int field7724;

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
    public int field7726;

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "I")
    public int field7727;

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
    public static int field7729;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "Lje;")
    public class275 field7718;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
    public static void method3080(int arg0) {
        field7723 = null;
        if (arg0 != 50) {
            method3081(null, -18);
        }
        field7717 = null;
        field7728 = null;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lip;I)V")
    public static final void method3081(class498 arg0, int arg1) {
        field7724++;
        arg0.field7328 = null;
        int var2 = arg0.field7332.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field7332[var3].field7712 = false;
        }
        class398[] var4 = class109.field1494;
        synchronized (class109.field1494) {
            if (var2 < class109.field1494.length && class371.field5210[var2] < 200) {
                class109.field1494[var2].method2310(arg0, -21801);
                int var10002 = class371.field5210[var2]++;
            }
        }
        if (arg1 >= -115) {
            method3080(118);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lqa;IZI)Lf;")
    public final class529 method3082(class162 arg0, int arg1, boolean arg2, int arg3) {
        field7722++;
        int var5 = 88 / ((arg1 - 48) / 38);
        long var6 = (long) (arg0.field2310 << 19 | this.field7727 | arg3 << 16 | (arg2 ? 262144 : 0));
        class529 var8 = (class529) this.field7718.field3739.method56(var6, 57);
        if (var8 != null) {
            return var8;
        } else if (this.field7718.field3731.method1412(this.field7727, 1)) {
            class531 var9 = class531.method3134(this.field7718.field3731, this.field7727, 0);
            if (var9 != null) {
                var9.field7819 = var9.field7814 = var9.field7818 = var9.field7820 = 0;
                if (arg2) {
                    var9.method3124();
                }
                for (int var10 = 0; var10 < arg3; var10++) {
                    var9.method3123();
                }
            }
            class529 var11 = arg0.method482(var9, true);
            if (var11 != null) {
                this.field7718.field3739.method73(var6, var11, 26425);
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Llh;I)V")
    public final void method3083(class365 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2099(255);
            if (var3 == 0) {
                if (arg1 != -2606) {
                    method3081(null, -28);
                }
                field7719++;
                return;
            }
            this.method3085(arg0, -27, var3);
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)Z")
    public final boolean method3084(int arg0) {
        field7720++;
        int var2 = -57 % ((arg0 + 54) / 55);
        return this.field7718.field3731.method1412(this.field7727, 1);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Llh;II)V")
    private final void method3085(class365 arg0, int arg1, int arg2) {
        field7721++;
        if (arg1 >= -17) {
            field7717 = null;
        }
        if (arg2 == 1) {
            this.field7727 = arg0.method2062((byte) 14);
        } else if (arg2 == 2) {
            this.field7726 = arg0.method2111(-2);
        } else if (arg2 == 3) {
            this.field7725 = true;
        } else if (arg2 == 4) {
            this.field7727 = -1;
            return;
        }
    }
}
