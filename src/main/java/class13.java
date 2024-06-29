import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class13 {

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "Ljc;")
    private class285 field170 = new class285();

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "Lma;")
    private class274 field181 = new class274();

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
    private int field182;

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "I")
    private int field187;

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "Lff;")
    private class47 field185;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "Lve;")
    public static class255 field171 = class87.method607(111, "Versteckt");

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "Lve;")
    public static class255 field173 = class87.method607(113, "runes");

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    public static int field176 = 2;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "Ljm;")
    public static class225 field177 = class248.method1707(0);

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "Z")
    public static volatile boolean field186 = true;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IJ)Ljc;", line = 5)
    public final class285 method58(int arg0, long arg1) {
        class285 var4 = (class285) this.field185.method280(arg1, 29153);
        if (arg0 != 0) {
            method62(23);
        }
        if (var4 != null) {
            this.field181.method1923(arg0 - 8121, var4);
        }
        field178++;
        return var4;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V", line = 29)
    public final void method59(byte arg0) {
        field172++;
        this.field181.method1918((byte) -88);
        this.field185.method275(-671198520);
        this.field170 = new class285();
        int var2 = -50 / ((-arg0 - 4) / 49);
        this.field187 = this.field182;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)Lli;", line = 43)
    public final class208 method60(byte arg0) {
        if (arg0 < 126) {
            this.method59((byte) 60);
        }
        field175++;
        return this.field185.method289(65);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)Lli;", line = 57)
    public final class208 method61(int arg0) {
        int var2 = -74 / ((12 - arg0) / 39);
        field184++;
        return this.field185.method288((byte) -42);
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V", line = 90)
    public static void method62(int arg0) {
        field177 = null;
        field171 = null;
        field173 = null;
        if (arg0 >= -66) {
            field173 = (class255) null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IJLjc;)V", line = 102)
    public final void method63(int arg0, long arg1, class285 arg2) {
        field174++;
        if (this.field187 == arg0) {
            class285 var5 = this.field181.method1920((byte) 11);
            var5.method1502((byte) -82);
            var5.method2024((byte) 98);
            if (this.field170 == var5) {
                class285 var6 = this.field181.method1920((byte) 11);
                var6.method1502((byte) -82);
                var6.method2024((byte) 97);
            }
        } else {
            this.field187--;
        }
        this.field185.method284(true, arg1, arg2);
        this.field181.method1923(arg0 - 8121, arg2);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZIIIIII)V", line = 139)
    public static final void method64(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class125.field2082 <= (arg1 - arg4) && arg1 + arg4 <= class30.field473 && class261.field4427 <= arg6 - arg4 && arg4 + arg6 <= class11.field156) {
            class145.method1080(arg3, arg4, arg6, 9778, arg1, arg2, arg5);
        } else {
            class221.method1550(arg2, arg4, arg1, (byte) -66, arg3, arg6, arg5);
        }
        if (arg0) {
            field179++;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BLrg;)V", line = 156)
    public static final void method65(byte arg0, class88 arg1) {
        field169++;
        if (arg0 <= -120) {
            class100.field1700 = arg1;
            class6.field96 = class100.field1700.method617(17374, 4);
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(I)V", line = 195)
    public class13(int arg0) {
        this.field182 = arg0;
        this.field187 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field185 = new class47(var2);
    }
}
