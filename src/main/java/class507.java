import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class507 {

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "Lkp;")
    private class337 field7445;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "Lgl;")
    private class425 field7449;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "Lwf;")
    private class88 field7448;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "[F")
    public static float[] field7455 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "Luf;")
    public static class310 field7446 = new class310(28, -1);

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "I")
    public static int field7458 = 0;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "Luf;")
    public static class310 field7459 = new class310(91, -2);

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field7447;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field7450;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public static int field7451;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    public static int field7453;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
    public static int field7456;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "Lvh;")
    public static class240 field7457;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "Llh;")
    private class365 field7454;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "[Lau;")
    private class517[] field7452;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V", line = 5)
    public static void method2980(int arg0) {
        field7457 = null;
        field7446 = null;
        field7459 = null;
        if (arg0 != 255) {
            method2980(-48);
        }
        field7455 = null;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)Z", line = 20)
    public final boolean method2981(int arg0) {
        int var2 = 109 % ((-arg0 - 27) / 51);
        field7450++;
        if (this.field7454 != null) {
            return true;
        }
        if (this.field7448 == null) {
            if (this.field7449.method2538((byte) 94)) {
                return false;
            }
            this.field7448 = this.field7449.method2543(255, 47, 255, true, (byte) 0);
        }
        if (this.field7448.field3807) {
            return false;
        } else {
            this.field7454 = new class365(this.field7448.method614(21));
            this.field7452 = new class517[(this.field7454.field5073.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)V", line = 47)
    public final void method2982(int arg0) {
        field7453++;
        if (this.field7452 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field7452.length; var2++) {
            if (this.field7452[var2] != null) {
                this.field7452[var2].method3032(arg0 ^ 0x4);
            }
        }
        if (arg0 != -5) {
            field7459 = null;
        }
        for (int var3 = 0; var3 < this.field7452.length; var3++) {
            if (this.field7452[var3] != null) {
                this.field7452[var3].method3036(36);
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILdh;Ldh;I)Lau;", line = 83)
    public final class517 method2983(int arg0, class209 arg1, class209 arg2, int arg3) {
        if (arg3 != 0) {
            this.method2984(-54, null, true, 114, null);
        }
        field7451++;
        return this.method2984(arg3 ^ 0x5, arg1, true, arg0, arg2);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILdh;ZILdh;)Lau;", line = 96)
    private final class517 method2984(int arg0, class209 arg1, boolean arg2, int arg3, class209 arg4) {
        field7447++;
        if (this.field7454 == null) {
            throw new RuntimeException();
        }
        this.field7454.field5069 = arg3 * 8 + arg0;
        if (this.field7454.field5069 >= this.field7454.field5073.length) {
            throw new RuntimeException();
        } else if (this.field7452[arg3] == null) {
            int var6 = this.field7454.method2056((byte) -127);
            int var7 = this.field7454.method2056((byte) 92);
            class517 var8 = new class517(arg3, arg1, arg4, this.field7449, this.field7445, var6, var7, arg2);
            this.field7452[arg3] = var8;
            return var8;
        } else {
            return this.field7452[arg3];
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lgl;Lkp;)V", line = 141)
    public class507(class425 arg0, class337 arg1) {
        this.field7445 = arg1;
        this.field7449 = arg0;
        if (!this.field7449.method2538((byte) 73)) {
            this.field7448 = this.field7449.method2543(255, 74, 255, true, (byte) 0);
        }
    }
}
