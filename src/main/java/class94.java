import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class94 {

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Ldn;")
    private class359 field1145;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "Lsu;")
    private class141 field1152;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Ldv;")
    private class470 field1149;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "Lfh;")
    private class463 field1150;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "[Lwc;")
    private class49[] field1147;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lqn;I)I", line = 6)
    public static final int method722(class47 arg0, int arg1) {
        field1142++;
        int var2 = arg1;
        if (arg0.method486(false, class449.field6420)) {
            var2 = arg1 + 1;
        }
        if (arg0.method486(false, class428.field6080)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)Z", line = 22)
    public final boolean method723(byte arg0) {
        field1148++;
        if (this.field1150 != null) {
            return true;
        }
        if (this.field1149 == null) {
            if (this.field1145.method2068((byte) -15)) {
                return false;
            }
            this.field1149 = this.field1145.method2062(true, 255, 255, true, (byte) 0);
        }
        if (this.field1149.field7502) {
            return false;
        } else if (arg0 == 88) {
            this.field1150 = new class463(this.field1149.method1951(8));
            this.field1147 = new class49[(this.field1150.field6618.length - 5) / 8];
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZII)V", line = 61)
    public static final void method724(boolean arg0, int arg1, int arg2) {
        field1143++;
        class352 var3 = new class352(16);
        if (arg0) {
            method722(null, -6);
        }
        for (class91 var4 = (class91) class201.field2614.method2021(-90); var4 != null; var4 = (class91) class201.field2614.method2017(-96)) {
            var4.method2165(16225);
            int var5 = (int) (var4.field5043 >> 28);
            int var6 = (int) (var4.field5043 >> 14 & 0x3FFFL) - arg2;
            int var7 = (int) (var4.field5043 & 0x3FFFL) - arg1;
            if (var7 >= 0 && var6 >= 0 && var7 < class452.field6526 && class440.field6307 > var6) {
                var3.method2019((byte) -104, var4, (long) (var7 | var5 << 28 | var6 << 14));
            }
        }
        class201.field2614 = var3;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILht;ILht;)Lwc;", line = 94)
    public final class49 method725(int arg0, class412 arg1, int arg2, class412 arg3) {
        if (arg2 != 30217) {
            this.method726(-9, null, 119, null, false);
        }
        field1146++;
        return this.method726(-12608, arg3, arg0, arg1, true);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILht;ILht;Z)Lwc;", line = 106)
    private final class49 method726(int arg0, class412 arg1, int arg2, class412 arg3, boolean arg4) {
        field1141++;
        if (this.field1150 == null) {
            throw new RuntimeException();
        }
        this.field1150.field6631 = arg2 * 8 + 5;
        if (this.field1150.field6631 >= this.field1150.field6618.length) {
            throw new RuntimeException();
        }
        if (arg0 != -12608) {
            this.method725(-107, null, -111, null);
        }
        if (this.field1147[arg2] != null) {
            return this.field1147[arg2];
        }
        int var6 = this.field1150.method2727(-122);
        int var7 = this.field1150.method2727(-84);
        class49 var8 = new class49(arg2, arg3, arg1, this.field1145, this.field1152, var6, var7, arg4);
        this.field1147[arg2] = var8;
        return var8;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Ldn;Lsu;)V", line = 144)
    public class94(class359 arg0, class141 arg1) {
        this.field1145 = arg0;
        this.field1152 = arg1;
        if (!this.field1145.method2068((byte) -40)) {
            this.field1149 = this.field1145.method2062(true, 255, 255, true, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V", line = 157)
    public final void method727(byte arg0) {
        field1151++;
        if (this.field1147 == null) {
            return;
        }
        if (arg0 <= 80) {
            this.field1147 = null;
        }
        for (int var2 = 0; var2 < this.field1147.length; var2++) {
            if (this.field1147[var2] != null) {
                this.field1147[var2].method495((byte) -63);
            }
        }
        for (int var3 = 0; var3 < this.field1147.length; var3++) {
            if (this.field1147[var3] != null) {
                this.field1147[var3].method496(70);
            }
        }
    }
}
