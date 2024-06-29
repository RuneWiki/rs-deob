import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 {

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "Lhp;")
    private class277 field56 = new class277(64);

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "Lkea;")
    private class203 field62;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V", line = 12)
    public final void method29(int arg0, int arg1) {
        class277 var3 = this.field56;
        synchronized (this.field56) {
            this.field56.method1811((byte) 113, arg0);
        }
        if (arg1 == 19819) {
            field60++;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)Ltr;", line = 27)
    public static final class247 method30(int arg0, int arg1, int arg2) {
        class99 var3 = class431.field6408[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class247 var4 = var3.field1177;
            var3.field1177 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 37)
    public final void method31(int arg0) {
        class277 var2 = this.field56;
        synchronized (this.field56) {
            this.field56.method1810(false);
        }
        if (arg0 != 32) {
            this.field62 = null;
        }
        field64++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZIIIZI)V", line = 52)
    public static final void method32(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field57++;
        if (arg3 > -58 || arg2 <= arg6) {
            return;
        }
        int var7 = (arg2 + arg6) / 2;
        int var8 = arg6;
        class511 var9 = class257.field3662[var7];
        class257.field3662[var7] = class257.field3662[arg2];
        class257.field3662[arg2] = var9;
        for (int var10 = arg6; var10 < arg2; var10++) {
            if (class259.method1725(var9, (byte) 93, arg5, arg0, class257.field3662[var10], arg4, arg1) <= 0) {
                class511 var11 = class257.field3662[var10];
                class257.field3662[var10] = class257.field3662[var8];
                class257.field3662[var8++] = var11;
            }
        }
        class257.field3662[arg2] = class257.field3662[var8];
        class257.field3662[var8] = var9;
        method32(arg0, arg1, var8 - 1, -82, arg4, arg5, arg6);
        method32(arg0, arg1, arg2, -67, arg4, arg5, var8 + 1);
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lcda;ILkea;)V", line = 100)
    public class6(class149 arg0, int arg1, class203 arg2) {
        this.field62 = arg2;
        this.field62.method1309(1675886592, 32);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V", line = 115)
    public final void method33(int arg0) {
        if (arg0 >= -10) {
            return;
        }
        class277 var2 = this.field56;
        synchronized (this.field56) {
            this.field56.method1805(44);
        }
        field59++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V", line = 128)
    public static final void method34(byte arg0) {
        field63++;
        if (arg0 != 41) {
            method32(-122, false, -1, -35, 36, true, 99);
        }
        class254.field3619.method528(-519011192);
        class158.field1948.method1641(-5681);
        class493.field7174.method1641(-5681);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)Lei;", line = 141)
    public final class154 method35(int arg0, int arg1) {
        int var3 = 56 / ((-arg0 - 17) / 39);
        field61++;
        class277 var4 = this.field56;
        class154 var5;
        synchronized (this.field56) {
            var5 = (class154) this.field56.method1801(0, (long) arg1);
        }
        if (var5 != null) {
            return var5;
        }
        class203 var6 = this.field62;
        byte[] var7;
        synchronized (this.field62) {
            var7 = this.field62.method1286(arg1, 32, (byte) -49);
        }
        class154 var8 = new class154();
        if (var7 != null) {
            var8.method897((byte) 66, new class194(var7));
        }
        class277 var9 = this.field56;
        synchronized (this.field56) {
            this.field56.method1808((long) arg1, var8, (byte) -15);
            return var8;
        }
    }
}
