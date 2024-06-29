import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class607 {

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    private int field8737 = 0;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "[Lum;")
    public class108[] field8724;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public int field8731;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "Lvt;")
    public static class344 field8733 = new class344("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field8723;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field8725;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field8726;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field8728;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field8729;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field8730;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field8732;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field8734;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public static int field8735;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "J")
    private long field8727;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "Lum;")
    private class108 field8736;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "Lum;")
    private class108 field8738;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
    public final void method3472(byte arg0) {
        field8728++;
        if (arg0 != -128) {
            return;
        }
        for (int var2 = 0; var2 < this.field8731; var2++) {
            class108 var3 = this.field8724[var2];
            while (true) {
                class108 var4 = var3.field1403;
                if (var3 == var4) {
                    break;
                }
                var4.method589(-8880);
            }
        }
        this.field8736 = null;
        this.field8738 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)Lum;")
    public final class108 method3473(int arg0) {
        if (arg0 != -27089) {
            this.method3480(-53);
        }
        this.field8737 = 0;
        field8726++;
        return this.method3478((byte) 5);
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)I")
    public final int method3474(byte arg0) {
        int var2 = 51 % ((arg0 - 21) / 63);
        field8735++;
        return this.field8731;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILum;J)V")
    public final void method3475(int arg0, class108 arg1, long arg2) {
        field8730++;
        if (arg1.field1399 != null) {
            arg1.method589(-8880);
        }
        class108 var5 = this.field8724[(int) (arg2 & (long) (this.field8731 - 1))];
        arg1.field1403 = var5;
        arg1.field1399 = var5.field1399;
        arg1.field1399.field1403 = arg1;
        arg1.field1403.field1399 = arg1;
        arg1.field1401 = arg2;
        if (arg0 >= -87) {
            this.method3475(10, null, 71L);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(JB)Lum;")
    public final class108 method3476(long arg0, byte arg1) {
        field8723++;
        if (arg1 != 28) {
            this.field8731 = -57;
        }
        this.field8727 = arg0;
        class108 var4 = this.field8724[(int) (arg0 & (long) (this.field8731 - 1))];
        for (this.field8736 = var4.field1403; this.field8736 != var4; this.field8736 = this.field8736.field1403) {
            if (this.field8736.field1401 == arg0) {
                class108 var5 = this.field8736;
                this.field8736 = this.field8736.field1403;
                return var5;
            }
        }
        this.field8736 = null;
        return null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([Lum;B)I")
    public final int method3477(class108[] arg0, byte arg1) {
        field8734++;
        int var3 = 0;
        if (arg1 != -101) {
            this.method3474((byte) -33);
        }
        for (int var4 = 0; var4 < this.field8731; var4++) {
            class108 var5 = this.field8724[var4];
            for (class108 var6 = var5.field1403; var6 != var5; var6 = var6.field1403) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)Lum;")
    public final class108 method3478(byte arg0) {
        field8725++;
        if (this.field8737 > 0 && this.field8724[this.field8737 - 1] != this.field8738) {
            class108 var2 = this.field8738;
            this.field8738 = var2.field1403;
            return var2;
        }
        if (arg0 != 5) {
            this.field8731 = 53;
        }
        while (this.field8737 < this.field8731) {
            class108 var3 = this.field8724[this.field8737++].field1403;
            if (this.field8724[this.field8737 - 1] != var3) {
                this.field8738 = var3.field1403;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(B)V")
    public static void method3479(byte arg0) {
        if (arg0 != -2) {
            method3479((byte) 51);
        }
        field8733 = null;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)I")
    public final int method3480(int arg0) {
        if (arg0 != -24064) {
            return 0;
        }
        field8729++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field8731; var3++) {
            class108 var4 = this.field8724[var3];
            class108 var5 = var4.field1403;
            while (var4 != var5) {
                var5 = var5.field1403;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)Lum;")
    public final class108 method3481(int arg0) {
        field8732++;
        if (this.field8736 == null) {
            return null;
        } else if (arg0 <= 36) {
            return null;
        } else {
            class108 var2 = this.field8724[(int) (this.field8727 & (long) (this.field8731 - 1))];
            while (this.field8736 != var2) {
                if (this.field8736.field1401 == this.field8727) {
                    class108 var3 = this.field8736;
                    this.field8736 = this.field8736.field1403;
                    return var3;
                }
                this.field8736 = this.field8736.field1403;
            }
            this.field8736 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(I)V")
    public class607(int arg0) {
        this.field8724 = new class108[arg0];
        this.field8731 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class108 var3 = this.field8724[var2] = new class108();
            var3.field1403 = var3;
            var3.field1399 = var3;
        }
    }
}
