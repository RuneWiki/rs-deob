import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class36 {

    @OriginalMember(owner = "client!gp", name = "j", descriptor = "I")
    private int field456;

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "[Lie;")
    private class6[] field454;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "Ldi;")
    public static class83 field453 = new class83(51, -1);

    @OriginalMember(owner = "client!gp", name = "k", descriptor = "Lmn;")
    public static class247 field457 = new class247(64);

    @OriginalMember(owner = "client!gp", name = "l", descriptor = "F")
    public static float field458;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!gp", name = "i", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "J")
    private long field447;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "Lie;")
    private class6 field450;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)Lie;", line = 3)
    public final class6 method210(byte arg0) {
        field449++;
        if (this.field450 == null) {
            return null;
        }
        class6 var2 = this.field454[(int) ((long) (this.field456 - 1) & this.field447)];
        while (this.field450 != var2) {
            if (this.field450.field115 == this.field447) {
                class6 var3 = this.field450;
                this.field450 = this.field450.field108;
                return var3;
            }
            this.field450 = this.field450.field108;
        }
        this.field450 = null;
        if (arg0 >= -123) {
            method217(null, -78, -114, 5);
        }
        return null;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(JLie;I)V", line = 34)
    public final void method211(long arg0, class6 arg1, int arg2) {
        if (arg1.field106 != null) {
            arg1.method36(arg2 + 1);
        }
        field451++;
        class6 var5 = this.field454[(int) ((long) (this.field456 + arg2) & arg0)];
        arg1.field106 = var5.field106;
        arg1.field108 = var5;
        arg1.field106.field108 = arg1;
        arg1.field108.field106 = arg1;
        arg1.field115 = arg0;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)V", line = 51)
    public static final void method212(int arg0, int arg1) {
        if (arg1 != 48) {
            field457 = null;
        }
        field455++;
        class97 var2 = class348.method2064(arg0, 4, 105);
        var2.method710(arg1 ^ 0xFFFFDBDB);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(BILvc;)V", line = 65)
    public static final void method213(byte arg0, int arg1, class207 arg2) {
        class450.field6622 = false;
        class292.field4039 = 0;
        field448++;
        class165.method1098(arg2, true);
        class343.method2036(arg2, (byte) 115);
        if (arg0 < 105) {
            method213((byte) -45, 118, null);
        }
        if (class450.field6622) {
            System.out.println("---endgpp---");
        }
        if (arg2.field5719 != arg1) {
            throw new RuntimeException("gpi1 pos:" + arg2.field5719 + " psize:" + arg1);
        }
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(B)V", line = 86)
    public static void method214(byte arg0) {
        field453 = null;
        if (arg0 > -99) {
            method214((byte) -63);
        }
        field457 = null;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(JI)Lie;", line = 99)
    public final class6 method215(long arg0, int arg1) {
        field452++;
        if (arg1 != 12306) {
            return null;
        }
        this.field447 = arg0;
        class6 var4 = this.field454[(int) ((long) (this.field456 - 1) & arg0)];
        for (this.field450 = var4.field108; this.field450 != var4; this.field450 = this.field450.field108) {
            if (this.field450.field115 == arg0) {
                class6 var5 = this.field450;
                this.field450 = this.field450.field108;
                return var5;
            }
        }
        this.field450 = null;
        return null;
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(II)I", line = 134)
    public static int method216(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Leo;III)V", line = 143)
    public static final void method217(class194 arg0, int arg1, int arg2, int arg3) {
        long var4 = class243.field3402[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field2765 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var8 <= 0) {
                break;
            }
            arg0.field2763[arg0.field2765++] = class94.field1451[var8 - 1].field7770;
            var6 += 16L;
        }
        for (int var9 = arg0.field2765; var9 < 4; var9++) {
            arg0.field2763[var9] = null;
        }
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(I)V", line = 184)
    public class36(int arg0) {
        this.field456 = arg0;
        this.field454 = new class6[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class6 var3 = this.field454[var2] = new class6();
            var3.field106 = var3;
            var3.field108 = var3;
        }
    }
}
