import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class276 {

    @OriginalMember(owner = "client!js", name = "a", descriptor = "I")
    public int field3813 = 128;

    @OriginalMember(owner = "client!js", name = "i", descriptor = "I")
    public int field3821 = 128;

    @OriginalMember(owner = "client!js", name = "m", descriptor = "I")
    public int field3825;

    @OriginalMember(owner = "client!js", name = "o", descriptor = "I")
    public int field3827;

    @OriginalMember(owner = "client!js", name = "j", descriptor = "I")
    public int field3822;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "I")
    public int field3814;

    @OriginalMember(owner = "client!js", name = "n", descriptor = "[Lln;")
    public static class317[] field3826 = new class317[4];

    @OriginalMember(owner = "client!js", name = "c", descriptor = "I")
    public int field3815;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "I")
    public int field3816;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!js", name = "g", descriptor = "I")
    public int field3819;

    @OriginalMember(owner = "client!js", name = "h", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!js", name = "k", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!js", name = "l", descriptor = "I")
    public int field3824;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "([BZI)V")
    public static final void method1778(byte[] arg0, boolean arg1, int arg2) {
        field3817++;
        int var3 = 0 / ((42 - arg2) / 45);
        if (class203.field2837 == null) {
            class203.field2837 = new class11(20000);
        }
        class203.field2837.method87(arg0, 0, arg0.length, 18278);
        if (!arg1) {
            return;
        }
        class152.method996(class203.field2837.field138, -29213);
        class35.field749 = new class212[class602.field8671];
        int var4 = 0;
        for (int var5 = class74.field1186; var5 <= class560.field7763; var5++) {
            class212 var6 = class521.method3007(var5, (byte) -86);
            if (var6 != null) {
                class35.field749[var4++] = var6;
            }
        }
        class313.field4218 = false;
        class476.field6711 = class488.method2835(30160);
        class203.field2837 = null;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)Ljs;")
    public final class276 method1779(int arg0) {
        field3823++;
        if (arg0 >= -122) {
            this.field3827 = -88;
        }
        return new class276(this.field3825, this.field3813, this.field3821, this.field3822, this.field3814, this.field3827);
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V")
    public static void method1780(int arg0) {
        field3826 = null;
        if (arg0 != 4) {
            method1780(-84);
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljs;Z)V")
    public final void method1781(class276 arg0, boolean arg1) {
        this.field3813 = arg0.field3813;
        this.field3814 = arg0.field3814;
        this.field3827 = arg0.field3827;
        if (!arg1) {
            this.field3825 = 73;
        }
        this.field3825 = arg0.field3825;
        field3818++;
        this.field3822 = arg0.field3822;
        this.field3821 = arg0.field3821;
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(I)V")
    public class276(int arg0) {
        this.field3825 = arg0;
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(IIIIII)V")
    private class276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3813 = arg1;
        this.field3821 = arg2;
        this.field3827 = arg5;
        this.field3825 = arg0;
        this.field3822 = arg3;
        this.field3814 = arg4;
    }
}
