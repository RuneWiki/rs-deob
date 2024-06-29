import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class1 extends class83 {

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "[J")
    private long[] field2 = new long[10];

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
    private int field10 = 0;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    private int field1 = 1;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    private int field3 = 256;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "J")
    private long field7 = class27.method198((byte) -115);

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "Le;")
    public static class191 field11 = class54.method368("Lade Konfiguration )2 ", 2047);

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "Le;")
    public static class191 field18 = class54.method368("null", 2047);

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "Le;")
    private static class191 field14 = class54.method368("M", 2047);

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "Le;")
    public static class191 field15 = field14;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "Le;")
    public static class191 field6 = field14;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "Lvc;")
    public static class111 field9 = class13.method89((byte) -109);

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
    private int field12;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "Lac;")
    public static class195 field5;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(Z)V")
    public static final void method1(boolean arg0) {
        field13++;
        for (class57 var1 = (class57) class191.field3397.method1173(99); var1 != null; var1 = (class57) class191.field3397.method1175(-1)) {
            if (var1.field1053) {
                var1.method384(0);
            }
        }
        class57 var2 = (class57) class269.field4750.method1173(123);
        if (!arg0) {
            return;
        }
        while (var2 != null) {
            if (var2.field1053) {
                var2.method384(0);
            }
            var2 = (class57) class269.field4750.method1175(-1);
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V")
    public static final void method2(byte arg0) {
        if (arg0 < -62) {
            field17++;
            class230.field4125.method992(-31);
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)V")
    public static void method3(byte arg0) {
        field11 = null;
        field6 = null;
        field5 = null;
        field9 = null;
        field18 = null;
        field14 = null;
        field15 = null;
        int var1 = 40 % ((-arg0 - 68) / 46);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLqb;)I")
    public static final int method4(byte arg0, class76 arg1) {
        if (arg0 >= -102) {
            method4((byte) 88, (class76) null);
        }
        int var2 = arg1.field1326;
        field8++;
        if (arg1.field2977 == arg1.field2974) {
            var2 = arg1.field1291;
        } else if (arg1.field2977 == arg1.field2947) {
            var2 = arg1.field1307;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)I")
    public final int method5(int arg0, int arg1, int arg2) {
        field4++;
        int var4 = this.field3;
        int var5 = this.field1;
        this.field3 = 300;
        if (arg2 != -405) {
            return 98;
        }
        this.field1 = 1;
        this.field7 = class27.method198((byte) -113);
        if (this.field2[this.field12] == 0L) {
            this.field3 = var4;
            this.field1 = var5;
        } else if (this.field2[this.field12] < this.field7) {
            this.field3 = (int) ((long) (arg0 * 2560) / (this.field7 - this.field2[this.field12]));
        }
        if (this.field3 < 25) {
            this.field3 = 25;
        }
        if (this.field3 > 256) {
            this.field3 = 256;
            this.field1 = (int) ((long) arg0 - ((this.field7 - this.field2[this.field12]) / 10L));
        }
        if (this.field1 > arg0) {
            this.field1 = arg0;
        }
        this.field2[this.field12] = this.field7;
        this.field12 = (this.field12 + 1) % 10;
        if (this.field1 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field2[var6] != 0L) {
                    this.field2[var6] += (long) this.field1;
                }
            }
        }
        if (this.field1 < arg1) {
            this.field1 = arg1;
        }
        class18.method142(true, (long) this.field1);
        int var7 = 0;
        while (this.field10 < 256) {
            var7++;
            this.field10 += this.field3;
        }
        this.field10 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public final void method6(int arg0) {
        if (arg0 != -6660) {
            method3((byte) 61);
        }
        field16++;
        for (int var2 = 0; var2 < 10; var2++) {
            this.field2[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class1() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2[var1] = this.field7;
        }
    }
}
