import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class613 {

    @OriginalMember(owner = "client!bca", name = "g", descriptor = "Lvg;")
    private class49 field8709 = new class49(64);

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "Lri;")
    private class97 field8703;

    @OriginalMember(owner = "client!bca", name = "e", descriptor = "[Loj;")
    public static class348[] field8707 = new class348[1024];

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "I")
    public static int field8704;

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "I")
    public static int field8705;

    @OriginalMember(owner = "client!bca", name = "f", descriptor = "I")
    public static int field8708;

    @OriginalMember(owner = "client!bca", name = "h", descriptor = "I")
    public static int field8710;

    @OriginalMember(owner = "client!bca", name = "j", descriptor = "I")
    public static int field8712;

    @OriginalMember(owner = "client!bca", name = "k", descriptor = "I")
    public static int field8713;

    @OriginalMember(owner = "client!bca", name = "i", descriptor = "Lri;")
    public static class97 field8711;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bca", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field8714;

    @OriginalMember(owner = "client!bca", name = "d", descriptor = "[I")
    public static int[] field8706;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)V")
    public final void method3565(int arg0) {
        class49 var2 = this.field8709;
        synchronized (this.field8709) {
            this.field8709.method569(arg0 ^ arg0);
        }
        field8712++;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(II)Lbs;")
    public final class638 method3566(int arg0, int arg1) {
        field8704++;
        class49 var3 = this.field8709;
        class638 var4;
        synchronized (this.field8709) {
            var4 = (class638) this.field8709.method560(false, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class97 var5 = this.field8703;
        byte[] var6;
        synchronized (this.field8703) {
            var6 = this.field8703.method926(11, -128, arg0);
            if (arg1 != -14724) {
                method3567((byte) 101, 83, null, -35);
            }
        }
        class638 var7 = new class638();
        if (var6 != null) {
            var7.method3705(new class6(var6), arg1 ^ 0xFFFFC67C);
        }
        class49 var8 = this.field8709;
        synchronized (this.field8709) {
            this.field8709.method559(var7, (long) arg0, 0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(BILri;I)Lufa;")
    public static final class632 method3567(byte arg0, int arg1, class97 arg2, int arg3) {
        field8710++;
        byte[] var4 = arg2.method926(arg3, -124, arg1);
        int var5 = -9 % ((arg0 + 9) / 63);
        return var4 == null ? null : new class632(var4);
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIII)Z")
    public static final boolean method3568(int arg0, int arg1, int arg2, int arg3) {
        field8708++;
        boolean var4 = true;
        class302 var5 = (class302) class681.method3880(arg3, arg2, arg0);
        if (var5 != null) {
            var4 &= class419.method2673(var5, -103);
        }
        class302 var6 = (class302) class618.method3589(arg3, arg2, arg0, field8714 == null ? (field8714 = method3572("ofa")) : field8714);
        if (var6 != null) {
            var4 &= class419.method2673(var6, 80);
        }
        if (arg1 > -89) {
            method3568(123, 53, 41, 70);
        }
        class302 var7 = (class302) class643.method3728(arg3, arg2, arg0);
        if (var7 != null) {
            var4 &= class419.method2673(var7, 77);
        }
        return var4;
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(I)V")
    public final void method3569(int arg0) {
        field8713++;
        class49 var2 = this.field8709;
        synchronized (this.field8709) {
            this.field8709.method563(arg0 ^ arg0);
        }
    }

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "(I)V")
    public static void method3570(int arg0) {
        field8707 = null;
        if (arg0 >= -62) {
            field8706 = null;
        }
        field8711 = null;
        field8706 = null;
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(II)V")
    public final void method3571(int arg0, int arg1) {
        if (arg0 != 11) {
            this.method3569(17);
        }
        field8705++;
        class49 var3 = this.field8709;
        synchronized (this.field8709) {
            this.field8709.method573((byte) 121, arg1);
        }
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Lei;ILri;)V")
    public class613(class162 arg0, int arg1, class97 arg2) {
        this.field8703 = arg2;
        if (this.field8703 != null) {
            this.field8703.method949(11, 0);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3572(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
