import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class693 {

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "I")
    private int field9823 = 0;

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
    private int field9822 = -1;

    @OriginalMember(owner = "client!ws", name = "p", descriptor = "Ltg;")
    private class605 field9835 = new class605();

    @OriginalMember(owner = "client!ws", name = "q", descriptor = "Z")
    public boolean field9836 = false;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "I")
    private int field9825;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
    private int field9824;

    @OriginalMember(owner = "client!ws", name = "k", descriptor = "[[I")
    private int[][] field9830;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "[Luga;")
    private class265[] field9821;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
    public static int field9820;

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "I")
    public static int field9826;

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "I")
    public static int field9828;

    @OriginalMember(owner = "client!ws", name = "j", descriptor = "I")
    public static int field9829;

    @OriginalMember(owner = "client!ws", name = "l", descriptor = "I")
    public static int field9831;

    @OriginalMember(owner = "client!ws", name = "m", descriptor = "I")
    public static int field9832;

    @OriginalMember(owner = "client!ws", name = "o", descriptor = "I")
    public static int field9834;

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "[I")
    public static int[] field9827;

    @OriginalMember(owner = "client!ws", name = "n", descriptor = "[[B")
    public static byte[][] field9833;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)[[I")
    public final int[][] method3866(byte arg0) {
        int var2 = -119 / ((arg0 + 41) / 61);
        field9820++;
        if (this.field9825 != this.field9824) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var3 = 0; var3 < this.field9825; var3++) {
            this.field9821[var3] = class4.field22;
        }
        return this.field9830;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lpe;Z)I")
    public static final int method3867(class109 arg0, boolean arg1) {
        if (!arg1) {
            return -59;
        }
        field9826++;
        if (arg0.field1606 == 0) {
            return 0;
        }
        if (arg0.field1687 != -1) {
            class109 var2 = null;
            if (arg0.field1687 < 32768) {
                class53 var3 = (class53) class332.field4881.method3512(true, (long) arg0.field1687);
                if (var3 != null) {
                    var2 = var3.field847;
                }
            } else if (arg0.field1687 >= 32768) {
                var2 = class279.field4271[arg0.field1687 - 32768];
            }
            if (var2 != null) {
                int var4 = arg0.field9477 - var2.field9477;
                int var5 = arg0.field9475 - var2.field9475;
                if (var4 != 0 || var5 != 0) {
                    arg0.method897((int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF, -60);
                }
            }
        }
        if (arg0 instanceof class573) {
            class573 var6 = (class573) arg0;
            if (var6.field8139 != -1 && (var6.field1706 == 0 || var6.field1703 > 0)) {
                var6.method897(var6.field8139, -108);
                var6.field8139 = -1;
            }
        } else if (arg0 instanceof class461) {
            class461 var7 = (class461) arg0;
            if (var7.field6690 != -1 && (var7.field1706 == 0 || var7.field1703 > 0)) {
                int var8 = var7.field9477 - ((var7.field6690 - class265.field4123 - class265.field4123) * 256);
                int var9 = var7.field9475 - ((var7.field6692 - class723.field10155 - class723.field10155) * 256);
                if (var8 != 0 || var9 != 0) {
                    var7.method897((int) (Math.atan2((double) var8, (double) var9) * 2607.5945876176133D) & 0x3FFF, -79);
                }
                var7.field6690 = -1;
            }
        }
        return arg0.method881(-65);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
    public final void method3868(int arg0) {
        field9831++;
        for (int var2 = 0; var2 < this.field9825; var2++) {
            this.field9830[var2] = null;
        }
        this.field9830 = null;
        this.field9821 = null;
        this.field9835.method3465(arg0);
        this.field9835 = null;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)[I")
    public final int[] method3869(int arg0, int arg1) {
        if (arg1 > -113) {
            return null;
        }
        field9832++;
        if (this.field9825 == this.field9824) {
            this.field9836 = this.field9821[arg0] == null;
            this.field9821[arg0] = class4.field22;
            return this.field9830[arg0];
        } else if (this.field9825 == 1) {
            this.field9836 = this.field9822 != arg0;
            this.field9822 = arg0;
            return this.field9830[0];
        } else {
            class265 var3 = this.field9821[arg0];
            if (var3 == null) {
                this.field9836 = true;
                if (this.field9825 <= this.field9823) {
                    class265 var4 = (class265) this.field9835.method3468((byte) 70);
                    var3 = new class265(arg0, var4.field4126);
                    this.field9821[var4.field4127] = null;
                    var4.method636((byte) 97);
                } else {
                    var3 = new class265(arg0, this.field9823);
                    this.field9823++;
                }
                this.field9821[arg0] = var3;
            } else {
                this.field9836 = false;
            }
            this.field9835.method3474(1807, var3);
            return this.field9830[var3.field4126];
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method3870(long arg0, int arg1) {
        field9834++;
        if (arg1 != -1) {
            method3867(null, true);
        }
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class467.field6806[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    var9 = ' ';
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(III)V")
    public class693(int arg0, int arg1, int arg2) {
        this.field9825 = arg0;
        this.field9824 = arg1;
        this.field9830 = new int[this.field9825][arg2];
        this.field9821 = new class265[this.field9824];
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)V")
    public static void method3871(int arg0) {
        field9833 = null;
        field9827 = null;
        if (arg0 != 37) {
            field9833 = null;
        }
    }
}
