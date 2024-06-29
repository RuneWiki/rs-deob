import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class293 {

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "Lob;")
    private class4 field4206 = new class4();

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "Lvu;")
    private class680 field4209 = new class680();

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    private int field4210;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    private int field4212;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "Lbaa;")
    private class130 field4208;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field4201 = -1;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "Lst;")
    public static class335 field4202 = new class335(51, 7);

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "Lst;")
    public static class335 field4211 = new class335(12, 8);

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "Z")
    public static boolean field4213 = false;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZI)V")
    public static final void method1939(int arg0, boolean arg1, int arg2) {
        field4205++;
        class169 var3 = class170.method1090(arg1, (byte) -94, arg0);
        if (var3 != null) {
            var3.method549(arg2 - 17079);
            if (arg2 != 23489) {
                field4202 = null;
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lob;BJ)V")
    public final void method1940(class4 arg0, byte arg1, long arg2) {
        field4200++;
        if (this.field4210 == 0) {
            class4 var5 = this.field4209.method3834((byte) 127);
            var5.method549(6410);
            var5.method21(127);
            if (this.field4206 == var5) {
                class4 var6 = this.field4209.method3834((byte) 102);
                var6.method549(6410);
                var6.method21(arg1 + 151);
            }
        } else {
            this.field4210--;
        }
        this.field4208.method820(arg2, (byte) -42, arg0);
        if (arg1 == -27) {
            this.field4209.method3827(arg1 ^ 0xFFFFFFA8, arg0);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
    public final void method1941(byte arg0) {
        if (arg0 != 104) {
            field4201 = 7;
        }
        field4199++;
        this.field4209.method3833(20975);
        this.field4208.method819(23738);
        this.field4206 = new class4();
        this.field4210 = this.field4212;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static void method1942(int arg0) {
        field4202 = null;
        field4211 = null;
        if (arg0 > -45) {
            field4211 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
    public static final void method1943(int arg0) {
        field4203++;
        class647.method3624(11, true);
        class273.method1835((byte) -126);
        if (arg0 != 7) {
            field4202 = null;
        }
        System.gc();
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(JZ)V")
    public final void method1944(long arg0, boolean arg1) {
        field4204++;
        if (!arg1) {
            return;
        }
        class4 var4 = (class4) this.field4208.method812(114, arg0);
        if (var4 != null) {
            var4.method549(6410);
            var4.method21(110);
            this.field4210++;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BJ)Lob;")
    public final class4 method1945(byte arg0, long arg1) {
        field4207++;
        if (arg0 != -52) {
            return null;
        }
        class4 var4 = (class4) this.field4208.method812(arg0 ^ 0xFFFFFFB8, arg1);
        if (var4 != null) {
            this.field4209.method3827(55, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(I)V")
    public class293(int arg0) {
        this.field4210 = arg0;
        this.field4212 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field4208 = new class130(var2);
    }
}
