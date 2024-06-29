import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class39 {

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    private int field708 = 0;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "[Lug;")
    public class181[] field696;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public int field703;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field691 = 0;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field693 = 0;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "J")
    private long field690;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "Lug;")
    private class181 field704;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "Lug;")
    private class181 field705;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
    public final void method305(byte arg0) {
        int var2 = 0;
        if (arg0 != -67) {
            return;
        }
        while (this.field703 > var2) {
            class181 var3 = this.field696[var2];
            while (true) {
                class181 var4 = var3.field2633;
                if (var3 == var4) {
                    var2++;
                    break;
                }
                var4.method1193(arg0 + 175);
            }
        }
        field698++;
        this.field705 = null;
        this.field704 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(JI)Lug;")
    public final class181 method306(long arg0, int arg1) {
        field707++;
        this.field690 = arg0;
        class181 var4 = this.field696[(int) ((long) (this.field703 - 1) & arg0)];
        for (this.field704 = var4.field2633; this.field704 != var4; this.field704 = this.field704.field2633) {
            if (this.field704.field2628 == arg0) {
                class181 var5 = this.field704;
                this.field704 = this.field704.field2633;
                return var5;
            }
        }
        if (arg1 == 16216) {
            this.field704 = null;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)I")
    public final int method307(int arg0) {
        field702++;
        return arg0 == -65 ? this.field703 : -112;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IBLdg;I)V")
    public static final void method308(int arg0, byte arg1, class87 arg2, int arg3) {
        field695++;
        if (arg2.field483 == arg3 && arg3 != -1) {
            class220 var4 = class108.method781(arg3, -1);
            int var5 = var4.field3406;
            if (var5 == 1) {
                arg2.field410 = 0;
                arg2.field475 = arg0;
                arg2.field412 = 0;
                arg2.field437 = 0;
                arg2.field453 = 1;
                class244.method1664(arg2.field455, false, arg2.field412, arg2.field425, 8890, var4);
            }
            if (var5 == 2) {
                arg2.field410 = 0;
            }
        } else if (arg3 == -1 || arg2.field483 == -1 || class108.method781(arg3, -1).field3427 >= class108.method781(arg2.field483, -1).field3427) {
            arg2.field483 = arg3;
            arg2.field412 = 0;
            arg2.field426 = arg2.field441;
            arg2.field475 = arg0;
            arg2.field437 = 0;
            arg2.field453 = 1;
            arg2.field410 = 0;
            if (arg2.field483 != -1) {
                class244.method1664(arg2.field455, false, arg2.field412, arg2.field425, 8890, class108.method781(arg2.field483, -1));
            }
        }
        if (arg1 > -7) {
            method308(-71, (byte) 97, (class87) null, 127);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BLug;J)V")
    public final void method309(byte arg0, class181 arg1, long arg2) {
        if (arg1.field2635 != null) {
            arg1.method1193(108);
        }
        field699++;
        if (arg0 != -8) {
            this.method306(-91L, -92);
        }
        class181 var5 = this.field696[(int) (arg2 & (long) (this.field703 - 1))];
        arg1.field2628 = arg2;
        arg1.field2635 = var5.field2635;
        arg1.field2633 = var5;
        arg1.field2635.field2633 = arg1;
        arg1.field2633.field2635 = arg1;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)Lug;")
    public final class181 method310(int arg0) {
        field706++;
        if (this.field708 > 0 && this.field696[this.field708 - 1] != this.field705) {
            class181 var2 = this.field705;
            this.field705 = var2.field2633;
            return var2;
        } else if (arg0 > -45) {
            return null;
        } else {
            while (this.field708 < this.field703) {
                class181 var3 = this.field696[this.field708++].field2633;
                if (this.field696[this.field708 - 1] != var3) {
                    this.field705 = var3.field2633;
                    return var3;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)Lug;")
    public final class181 method311(int arg0) {
        field700++;
        if (this.field704 == null) {
            return null;
        }
        class181 var2 = this.field696[(int) ((long) (this.field703 - 1) & this.field690)];
        while (this.field704 != var2) {
            if (this.field704.field2628 == this.field690) {
                class181 var4 = this.field704;
                this.field704 = this.field704.field2633;
                return var4;
            }
            this.field704 = this.field704.field2633;
        }
        this.field704 = null;
        int var3 = 63 % ((arg0 - 41) / 49);
        return null;
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
    public static final void method312(int arg0) {
        field701++;
        if (arg0 != 20717) {
            field693 = 26;
        }
        if (class275.field4244) {
            return;
        }
        class275.field4244 = true;
        if (class117.field1767) {
            class89.field1349 = (float) ((int) class89.field1349 - 65 & 0xFFFFFF80);
        } else {
            class101.field1482 += (-24.0F - class101.field1482) / 2.0F;
        }
        class36.field641 = true;
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(I)I")
    public final int method313(int arg0) {
        field694++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field703; var3++) {
            class181 var4 = this.field696[var3];
            for (class181 var5 = var4.field2633; var5 != var4; var5 = var5.field2633) {
                var2++;
            }
        }
        if (arg0 <= 85) {
            this.field708 = -57;
        }
        return var2;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V")
    public static final void method314(int arg0, int arg1) {
        if (arg1 == 37) {
            class44.field777 = 3.0F;
        } else if (arg1 == 50) {
            class44.field777 = 4.0F;
        } else if (arg1 == 75) {
            class44.field777 = 6.0F;
        } else if (arg1 == 100) {
            class44.field777 = 8.0F;
        } else if (arg1 == 200) {
            class44.field777 = 16.0F;
        }
        class244.field3784 = -1;
        if (arg0 != -101) {
            field691 = 107;
        }
        class244.field3784 = -1;
        field692++;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(I)V")
    public class39(int arg0) {
        this.field696 = new class181[arg0];
        this.field703 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class181 var3 = this.field696[var2] = new class181();
            var3.field2633 = var3;
            var3.field2635 = var3;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)Lug;")
    public final class181 method315(byte arg0) {
        this.field708 = 0;
        int var2 = 36 % ((65 - arg0) / 48);
        field697++;
        return this.method310(-104);
    }
}
