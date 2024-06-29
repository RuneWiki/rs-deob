import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class224 {

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "Ldk;")
    private class477 field3858;

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "Llq;")
    private class226 field3864;

    @OriginalMember(owner = "client!lt", name = "k", descriptor = "Lwk;")
    private class171 field3868;

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "Lvv;")
    public static class313 field3863 = new class313(38, 3);

    @OriginalMember(owner = "client!lt", name = "o", descriptor = "Lnk;")
    public static class326 field3872 = new class326(11, -1);

    @OriginalMember(owner = "client!lt", name = "p", descriptor = "J")
    public static volatile long field3873 = 0L;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!lt", name = "j", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!lt", name = "l", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!lt", name = "i", descriptor = "Lun;")
    public static class201 field3866;

    @OriginalMember(owner = "client!lt", name = "n", descriptor = "Lia;")
    private class23 field3871;

    @OriginalMember(owner = "client!lt", name = "m", descriptor = "Lvk;")
    public static class302 field3870;

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "[Lhs;")
    private class94[] field3861;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIZZ)I")
    public static final int method1541(int arg0, int arg1, boolean arg2, boolean arg3) {
        field3865++;
        class112 var4 = class295.method1888(arg2, arg1, (byte) 73);
        if (!arg3) {
            field3866 = null;
        }
        if (var4 == null) {
            return -1;
        } else if (arg0 >= 0 && arg0 < var4.field1971.length) {
            return var4.field1971[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILia;)Lpj;")
    public static final class512 method1542(int arg0, class23 arg1) {
        field3867++;
        arg1.method126((byte) -121);
        if (arg0 != 255) {
            field3872 = null;
        }
        int var2 = arg1.method126((byte) -119);
        class512 var3 = class20.method107(var2, (byte) -109);
        var3.field7495 = arg1.method126((byte) -84);
        int var4 = arg1.method126((byte) -105);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method126((byte) -76);
            var3.method71(true, var6, arg1);
        }
        var3.method74(12388);
        return var3;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V")
    public static void method1543(int arg0) {
        field3863 = null;
        field3866 = null;
        field3872 = null;
        field3870 = null;
        int var1 = 64 % ((arg0 - 32) / 36);
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)V")
    public final void method1544(int arg0) {
        field3859++;
        if (this.field3861 == null) {
            return;
        }
        if (arg0 >= -112) {
            this.field3861 = null;
        }
        for (int var2 = 0; var2 < this.field3861.length; var2++) {
            if (this.field3861[var2] != null) {
                this.field3861[var2].method659((byte) -128);
            }
        }
        for (int var3 = 0; var3 < this.field3861.length; var3++) {
            if (this.field3861[var3] != null) {
                this.field3861[var3].method652(-3);
            }
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZLpd;ILpd;I)Lhs;")
    private final class94 method1545(boolean arg0, class436 arg1, int arg2, class436 arg3, int arg4) {
        field3862++;
        if (this.field3871 == null) {
            throw new RuntimeException();
        }
        this.field3871.field301 = arg4 * 8 + arg2;
        if (this.field3871.field302.length <= this.field3871.field301) {
            throw new RuntimeException();
        } else if (this.field3861[arg4] == null) {
            int var6 = this.field3871.method143(-3230);
            int var7 = this.field3871.method143(-3230);
            class94 var8 = new class94(arg4, arg3, arg1, this.field3864, this.field3858, var6, var7, arg0);
            this.field3861[arg4] = var8;
            return var8;
        } else {
            return this.field3861[arg4];
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z)Z")
    public final boolean method1546(boolean arg0) {
        field3860++;
        if (this.field3871 != null) {
            return true;
        }
        if (this.field3868 == null) {
            if (this.field3864.method1562(20)) {
                return false;
            }
            this.field3868 = this.field3864.method1555(255, true, 556956784, 255, (byte) 0);
        }
        if (this.field3868.field6303) {
            return false;
        }
        if (!arg0) {
            field3866 = null;
        }
        this.field3871 = new class23(this.field3868.method88((byte) 32));
        this.field3861 = new class94[(this.field3871.field302.length - 5) / 8];
        return true;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lpd;IZLpd;)Lhs;")
    public final class94 method1547(class436 arg0, int arg1, boolean arg2, class436 arg3) {
        field3869++;
        if (!arg2) {
            field3870 = null;
        }
        return this.method1545(true, arg0, 5, arg3, arg1);
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Llq;Ldk;)V")
    public class224(class226 arg0, class477 arg1) {
        this.field3858 = arg1;
        this.field3864 = arg0;
        if (!this.field3864.method1562(20)) {
            this.field3868 = this.field3864.method1555(255, true, 556956784, 255, (byte) 0);
        }
    }
}
