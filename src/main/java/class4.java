import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class4 {

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "Lqc;")
    private class325 field42 = new class325(128);

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "Ldda;")
    private class597 field38;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
    public static int field41 = 1400;

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "[S")
    public static short[] field44;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
    public final void method17(int arg0) {
        field36++;
        class325 var2 = this.field42;
        synchronized (this.field42) {
            this.field42.method2024((byte) -110);
            if (arg0 != 0) {
                method19(123, null, null, null);
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V")
    public final void method18(int arg0) {
        class325 var2 = this.field42;
        synchronized (this.field42) {
            if (arg0 <= 103) {
                return;
            }
            this.field42.method2037(true);
        }
        field39++;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method19(int arg0, String arg1, String arg2, String arg3) {
        if (arg0 != 0) {
            field44 = null;
        }
        field35++;
        for (int var4 = arg2.indexOf(arg3); var4 != -1; var4 = arg2.indexOf(arg3, var4 + arg1.length())) {
            arg2 = arg2.substring(0, var4) + arg1 + arg2.substring(arg3.length() + var4);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)V")
    public final void method20(int arg0, int arg1) {
        field40++;
        class325 var3 = this.field42;
        synchronized (this.field42) {
            if (arg1 > 61) {
                this.field42.method2028(arg0, true);
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(II)Lli;")
    public final class467 method21(int arg0, int arg1) {
        field37++;
        class325 var3 = this.field42;
        class467 var4;
        synchronized (this.field42) {
            if (arg1 <= 65) {
                this.method21(-97, -84);
            }
            var4 = (class467) this.field42.method2025((long) arg0, 2);
        }
        if (var4 != null) {
            return var4;
        }
        class597 var5 = this.field38;
        byte[] var6;
        synchronized (this.field38) {
            var6 = this.field38.method3486((byte) -37, arg0, 1);
        }
        class467 var7 = new class467();
        if (var6 != null) {
            var7.method2765(-7095, new class428(var6));
        }
        class325 var8 = this.field42;
        synchronized (this.field42) {
            this.field42.method2029(false, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Loda;ILdda;)V")
    public class4(class559 arg0, int arg1, class597 arg2) {
        this.field38 = arg2;
        this.field38.method3462(1, -90);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V")
    public static void method22(byte arg0) {
        field44 = null;
        if (arg0 < 17) {
            field41 = -126;
        }
    }

    static {
        new class487("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        field44 = new short[256];
    }
}
