import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class239 {

    @OriginalMember(owner = "client!t", name = "p", descriptor = "I")
    private int field4046 = 0;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "I")
    public int field4044;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "[Luk;")
    public class86[] field4042;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "Lbe;")
    public static class283 field4047 = class153.method941(-114, "Stufe)2");

    @OriginalMember(owner = "client!t", name = "j", descriptor = "Lbe;")
    public static class283 field4040 = class153.method941(125, "");

    @OriginalMember(owner = "client!t", name = "s", descriptor = "Lbe;")
    public static class283 field4049 = class153.method941(125, "Ausw-=hlen");

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "J")
    private long field4039;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "Lub;")
    public static class20 field4035;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "Luk;")
    private class86 field4038;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "Luk;")
    private class86 field4048;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)Luk;", line = 8)
    public final class86 method1604(byte arg0) {
        field4032++;
        int var2 = -18 / ((arg0 - 76) / 50);
        if (this.field4046 > 0 && this.field4042[this.field4046 - 1] != this.field4048) {
            class86 var3 = this.field4048;
            this.field4048 = var3.field1453;
            return var3;
        }
        class86 var4;
        do {
            if (this.field4046 >= this.field4044) {
                return null;
            }
            var4 = this.field4042[this.field4046++].field1453;
        } while (this.field4042[this.field4046 - 1] == var4);
        this.field4048 = var4.field1453;
        return var4;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)I", line = 45)
    public final int method1605(boolean arg0) {
        field4031++;
        return arg0 ? 72 : this.field4044;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V", line = 63)
    public final void method1606(byte arg0) {
        for (int var2 = 0; var2 < this.field4044; var2++) {
            class86 var3 = this.field4042[var2];
            while (true) {
                class86 var4 = var3.field1453;
                if (var3 == var4) {
                    break;
                }
                var4.method557((byte) -89);
            }
        }
        if (arg0 >= 120) {
            this.field4038 = null;
            field4033++;
            this.field4048 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)Luk;", line = 95)
    public final class86 method1607(int arg0) {
        field4034++;
        this.field4046 = arg0;
        return this.method1604((byte) 126);
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(B)I", line = 105)
    public final int method1608(byte arg0) {
        field4043++;
        int var2 = 0;
        if (arg0 > -57) {
            this.method1606((byte) 84);
        }
        for (int var3 = 0; var3 < this.field4044; var3++) {
            class86 var4 = this.field4042[var3];
            class86 var5 = var4.field1453;
            while (var4 != var5) {
                var5 = var5.field1453;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(B)Luk;", line = 147)
    public final class86 method1609(byte arg0) {
        field4045++;
        if (this.field4038 == null) {
            return null;
        }
        class86 var2 = this.field4042[(int) ((long) (this.field4044 - 1) & this.field4039)];
        while (this.field4038 != var2) {
            if (this.field4038.field1445 == this.field4039) {
                class86 var3 = this.field4038;
                this.field4038 = this.field4038.field1453;
                return var3;
            }
            this.field4038 = this.field4038.field1453;
        }
        this.field4038 = null;
        if (arg0 > -40) {
            this.field4044 = -128;
        }
        return null;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V", line = 189)
    public static void method1610(int arg0) {
        field4040 = null;
        field4047 = null;
        if (arg0 < 107) {
            method1610(-120);
        }
        field4049 = null;
        field4035 = null;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(I)V", line = 200)
    public class239(int arg0) {
        this.field4044 = arg0;
        this.field4042 = new class86[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class86 var3 = this.field4042[var2] = new class86();
            var3.field1447 = var3;
            var3.field1453 = var3;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Luk;IJ)V", line = 229)
    public final void method1611(class86 arg0, int arg1, long arg2) {
        if (arg0.field1447 != null) {
            arg0.method557((byte) -89);
        }
        field4037++;
        class86 var5 = this.field4042[(int) ((long) (this.field4044 + arg1) & arg2)];
        arg0.field1453 = var5;
        arg0.field1447 = var5.field1447;
        arg0.field1445 = arg2;
        arg0.field1447.field1453 = arg0;
        arg0.field1453.field1447 = arg0;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(JI)Luk;", line = 248)
    public final class86 method1612(long arg0, int arg1) {
        if (arg1 <= 93) {
            this.field4039 = 90L;
        }
        this.field4039 = arg0;
        field4036++;
        class86 var4 = this.field4042[(int) (arg0 & (long) (this.field4044 - 1))];
        for (this.field4038 = var4.field1453; this.field4038 != var4; this.field4038 = this.field4038.field1453) {
            if (this.field4038.field1445 == arg0) {
                class86 var5 = this.field4038;
                this.field4038 = this.field4038.field1453;
                return var5;
            }
        }
        this.field4038 = null;
        return null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I[Luk;)I", line = 279)
    public final int method1613(int arg0, class86[] arg1) {
        field4041++;
        if (arg0 != -1) {
            this.field4042 = (class86[]) null;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4044; var4++) {
            class86 var5 = this.field4042[var4];
            for (class86 var6 = var5.field1453; var6 != var5; var6 = var6.field1453) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }
}
