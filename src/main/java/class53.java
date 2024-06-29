import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class53 {

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "Lf;")
    private class291 field825 = new class291();

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "Lci;")
    private class171 field831 = new class171();

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    private int field828;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    private int field829;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "Lpa;")
    private class140 field830;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "Z")
    public static boolean field826 = false;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "Lbf;")
    public static class202 field824 = new class202(64);

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "Z")
    public static boolean field827 = false;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLf;J)V")
    public final void method341(byte arg0, class291 arg1, long arg2) {
        if (this.field828 == 0) {
            class291 var5 = this.field831.method1150(arg0 - 19129);
            var5.method441(16773377);
            var5.method1953(91923);
            if (this.field825 == var5) {
                class291 var6 = this.field831.method1150(-19113);
                var6.method441(16773377);
                var6.method1953(arg0 ^ 0x16703);
            }
        } else {
            this.field828--;
        }
        if (arg0 == 16) {
            this.field830.method986(arg1, arg2, -1);
            field820++;
            this.field831.method1152(76, arg1);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public static void method342(int arg0) {
        field824 = null;
        if (arg0 != -21458) {
            method342(37);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)Lbe;")
    public static final class17 method343(byte arg0) {
        field815++;
        int var1 = 8 % ((arg0 - 62) / 39);
        class36.field535 = 0;
        return class126.method899((byte) 86);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BJ)Lf;")
    public final class291 method344(byte arg0, long arg1) {
        field817++;
        if (arg0 != 14) {
            this.field829 = 49;
        }
        class291 var4 = (class291) this.field830.method992((byte) 125, arg1);
        if (var4 != null) {
            this.field831.method1152(arg0 + 45, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)Z")
    public static final boolean method345(byte arg0) {
        field819++;
        if (class30.field440) {
            try {
                if ((Boolean) class88.field1383.method234(0, class177.field2957.field3504)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != -23) {
            field827 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    public final void method346(int arg0) {
        if (arg0 <= 17) {
            method343((byte) 112);
        }
        field816++;
        this.field831.method1145(104);
        this.field830.method985(0);
        this.field825 = new class291();
        this.field828 = this.field829;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)Lei;")
    public final class62 method347(int arg0) {
        field822++;
        if (arg0 != 64) {
            this.method344((byte) -108, 105L);
        }
        return this.field830.method988(arg0 ^ 0x11AA);
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)Lei;")
    public final class62 method348(byte arg0) {
        int var2 = -46 % ((3 - arg0) / 37);
        field821++;
        return this.field830.method993(-15322);
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(I)V")
    public class53(int arg0) {
        this.field828 = arg0;
        this.field829 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field830 = new class140(var2);
    }
}
