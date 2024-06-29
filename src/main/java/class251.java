import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class251 {

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "Lui;")
    private class234 field3867;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "Lth;")
    private class112 field3865;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "Le;")
    private class65 field3853;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "Lll;")
    public static class211 field3858 = new class211(32);

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "Z")
    public static boolean field3864 = false;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public static int field3866 = 0;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Luf;")
    public static class176 field3851;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Luf;")
    public static class176 field3855;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "Lf;")
    private class37 field3860;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "[Lnj;")
    private class143[] field3856;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lpe;ILpe;IZ)Lnj;")
    private final class143 method1676(class252 arg0, int arg1, class252 arg2, int arg3, boolean arg4) {
        field3862++;
        if (this.field3860 == null) {
            throw new RuntimeException();
        }
        this.field3860.field588 = arg3 * 8 + 5;
        if (this.field3860.field583.length <= this.field3860.field588) {
            throw new RuntimeException();
        }
        if (arg1 > -124) {
            this.field3860 = null;
        }
        if (this.field3856[arg3] != null) {
            return this.field3856[arg3];
        }
        int var6 = this.field3860.method307(-90);
        int var7 = this.field3860.method307(-43);
        class143 var8 = new class143(arg3, arg2, arg0, this.field3867, this.field3865, var6, var7, arg4);
        this.field3856[arg3] = var8;
        return var8;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static void method1677(int arg0) {
        field3858 = null;
        if (arg0 > 59) {
            field3851 = null;
            field3855 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)Z")
    public final boolean method1678(byte arg0) {
        field3861++;
        if (this.field3860 != null) {
            return true;
        }
        if (this.field3853 == null) {
            if (this.field3867.method1559((byte) -41)) {
                return false;
            }
            this.field3853 = this.field3867.method1569(true, 255, (byte) 0, 255, 20);
        }
        if (this.field3853.field2386) {
            return false;
        }
        if (arg0 != 4) {
            this.field3853 = null;
        }
        this.field3860 = new class37(this.field3853.method517(10933));
        this.field3856 = new class143[(this.field3860.field583.length - 5) / 8];
        return true;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V")
    public final void method1679(byte arg0) {
        field3859++;
        if (this.field3856 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3856.length; var2++) {
            if (this.field3856[var2] != null) {
                this.field3856[var2].method991((byte) -69);
            }
        }
        int var3 = -12 % ((arg0 - 62) / 60);
        for (int var4 = 0; var4 < this.field3856.length; var4++) {
            if (this.field3856[var4] != null) {
                this.field3856[var4].method993((byte) 23);
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;B)J")
    public static final long method1680(String arg0, byte arg1) {
        int var2 = arg0.length();
        field3863++;
        long var3 = 0L;
        if (arg1 >= -31) {
            method1682(115);
        }
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (long) arg0.charAt(var5) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZLpe;Lpe;I)Lnj;")
    public final class143 method1681(boolean arg0, class252 arg1, class252 arg2, int arg3) {
        field3852++;
        return arg0 ? null : this.method1676(arg1, -125, arg2, arg3, true);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
    public static final void method1682(int arg0) {
        if (arg0 <= 100) {
            method1680((String) null, (byte) 84);
        }
        class292.field4607.method1251(184, (byte) -114);
        class292.field4607.method337(2103219728, 0L);
        class98.field1565++;
        field3854++;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lui;Lth;)V")
    public class251(class234 arg0, class112 arg1) {
        this.field3867 = arg0;
        this.field3865 = arg1;
        if (!this.field3867.method1559((byte) -41)) {
            this.field3853 = this.field3867.method1569(true, 255, (byte) 0, 255, 20);
        }
    }
}
