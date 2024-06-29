import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class256 {

    @OriginalMember(owner = "client!g", name = "g", descriptor = "Lfb;")
    private class96 field3587;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "Lbo;")
    private class471 field3589;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "Leb;")
    private class183 field3583;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field3582 = 127;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "[Lld;")
    public static class196[] field3581 = new class196[32768];

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "Llk;")
    private class425 field3590;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "[Lks;")
    private class136[] field3584;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)Lwj;")
    public static final class334 method1590(int arg0) {
        field3588++;
        if (arg0 != 13892) {
            method1590(-50);
        }
        return class330.field4542 < class199.field2849.length ? class199.field2849[class330.field4542++] : null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)Z")
    public final boolean method1591(byte arg0) {
        field3591++;
        if (this.field3590 != null) {
            return true;
        }
        if (arg0 >= -124) {
            this.field3590 = null;
        }
        if (this.field3583 == null) {
            if (this.field3589.method2757(20)) {
                return false;
            }
            this.field3583 = this.field3589.method2764(255, 88, true, 255, (byte) 0);
        }
        if (this.field3583.field3373) {
            return false;
        } else {
            this.field3590 = new class425(this.field3583.method414(0));
            this.field3584 = new class136[(this.field3590.field5886.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
    public static final void method1592(int arg0) {
        int var1 = 96 / ((arg0 - 70) / 42);
        field3592++;
        class460.field6479.method656(100);
        class9.field184.method656(105);
        class118.field1651.method656(96);
        class285.field3901.method656(111);
        class343.field4670.method656(108);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lnk;IILnk;)Lks;")
    public final class136 method1593(class18 arg0, int arg1, int arg2, class18 arg3) {
        field3586++;
        if (arg2 != 255) {
            field3581 = null;
        }
        return this.method1595(arg3, arg0, 32768, arg1, true);
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
    public final void method1594(int arg0) {
        field3593++;
        if (this.field3584 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3584.length; var2++) {
            if (this.field3584[var2] != null) {
                this.field3584[var2].method834(-43);
            }
        }
        for (int var3 = arg0; var3 < this.field3584.length; var3++) {
            if (this.field3584[var3] != null) {
                this.field3584[var3].method831(124);
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lnk;Lnk;IIZ)Lks;")
    private final class136 method1595(class18 arg0, class18 arg1, int arg2, int arg3, boolean arg4) {
        field3585++;
        if (this.field3590 == null) {
            throw new RuntimeException();
        }
        this.field3590.field5830 = arg3 * 8 + 5;
        if (this.field3590.field5886.length <= this.field3590.field5830) {
            throw new RuntimeException();
        } else if (this.field3584[arg3] == null) {
            int var6 = this.field3590.method2502((byte) -86);
            if (arg2 == 32768) {
                int var7 = this.field3590.method2502((byte) -86);
                class136 var8 = new class136(arg3, arg0, arg1, this.field3589, this.field3587, var6, var7, arg4);
                this.field3584[arg3] = var8;
                return var8;
            } else {
                return null;
            }
        } else {
            return this.field3584[arg3];
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V")
    public static void method1596(byte arg0) {
        if (arg0 == -91) {
            field3581 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lbo;Lfb;)V")
    public class256(class471 arg0, class96 arg1) {
        this.field3587 = arg1;
        this.field3589 = arg0;
        if (!this.field3589.method2757(20)) {
            this.field3583 = this.field3589.method2764(255, -68, true, 255, (byte) 0);
        }
    }
}
