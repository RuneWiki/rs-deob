import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class295 {

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "I")
    public int field4147;

    @OriginalMember(owner = "client!pfa", name = "f", descriptor = "I")
    private int field4151;

    @OriginalMember(owner = "client!pfa", name = "c", descriptor = "Lwt;")
    private class309 field4148;

    @OriginalMember(owner = "client!pfa", name = "h", descriptor = "I")
    public int field4153;

    @OriginalMember(owner = "client!pfa", name = "d", descriptor = "Lpfa;")
    public static class295 field4149 = new class295(0, 3, class309.field4309);

    @OriginalMember(owner = "client!pfa", name = "j", descriptor = "Lpfa;")
    public static class295 field4155 = new class295(1, 3, class309.field4309);

    @OriginalMember(owner = "client!pfa", name = "k", descriptor = "Lpfa;")
    public static class295 field4156 = new class295(2, 4, class309.field4305);

    @OriginalMember(owner = "client!pfa", name = "l", descriptor = "Lpfa;")
    public static class295 field4157 = new class295(3, 1, class309.field4309);

    @OriginalMember(owner = "client!pfa", name = "m", descriptor = "Lpfa;")
    public static class295 field4158 = new class295(4, 2, class309.field4309);

    @OriginalMember(owner = "client!pfa", name = "n", descriptor = "Lpfa;")
    public static class295 field4159 = new class295(5, 3, class309.field4309);

    @OriginalMember(owner = "client!pfa", name = "o", descriptor = "Lpfa;")
    public static class295 field4160 = new class295(6, 4, class309.field4309);

    @OriginalMember(owner = "client!pfa", name = "p", descriptor = "I")
    public static int field4161 = class378.method2374((byte) 66, 16);

    @OriginalMember(owner = "client!pfa", name = "q", descriptor = "[I")
    public static int[] field4162 = new int[4096];

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!pfa", name = "e", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!pfa", name = "g", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!pfa", name = "i", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!pfa", name = "r", descriptor = "[I")
    public static int[] field4163;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(B)V", line = 3)
    public static final void method1918(byte arg0) {
        field4146++;
        int var1 = class376.field5273.length;
        int var2 = 0;
        int var3 = -35 / ((arg0 - 32) / 52);
        while (var1 > var2) {
            if (class376.field5273[var2] != null) {
                int var4 = -1;
                for (int var5 = 0; var5 < class225.field3037; var5++) {
                    if (class207.field2720[var2] == class135.field1973[var5]) {
                        var4 = var5;
                        break;
                    }
                }
                if (var4 == -1) {
                    class135.field1973[class225.field3037] = class207.field2720[var2];
                    var4 = class225.field3037++;
                }
                class675 var6 = new class675(class376.field5273[var2]);
                int var7 = 0;
                while (var6.field9146 < class376.field5273[var2].length && var7 < 511 && class344.field4849 < 1023) {
                    int var8 = var4 | var7++ << 6;
                    int var9 = var6.method3757((byte) -65);
                    int var10 = var9 >> 14;
                    int var11 = var9 >> 7 & 0x3F;
                    int var12 = var9 & 0x3F;
                    int var13 = (class207.field2720[var2] >> 8) * 64 + var11 - class228.field3063;
                    int var14 = (class207.field2720[var2] & 0xFF) * 64 + var12 - class3.field30;
                    class353 var15 = class231.field3110.method2797(var6.method3757((byte) -65), false);
                    class740 var16 = (class740) class373.field5230.method1180((byte) 26, (long) var8);
                    if (var16 == null && (var15.field5002 & 0x1) > 0 && class310.field4320 == var10 && var13 >= 0 && class336.field4683 > (var15.field5051 + var13) && var14 >= 0 && class700.field9768 > var15.field5051 + var14) {
                        class468 var17 = new class468();
                        var17.field7958 = var8;
                        class740 var18 = new class740(var17);
                        class373.field5230.method1179((long) var8, var18, (byte) -26);
                        class30.field399[class438.field6239++] = var18;
                        class100.field1196[class344.field4849++] = var8;
                        var17.field7961 = class740.field10285;
                        var17.method2789(-1, var15);
                        var17.method3243(109, var17.field6632.field5051);
                        var17.field7959 = var17.field6632.field5035 << 3;
                        var17.method3248(true, 100, (var17.field6632.field5019 + 4 & 0x24E00007) << 11);
                        var17.method2794(true, var17.method1835((byte) 127), var10, var14, (byte) 107, var13);
                    }
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I[BIII[BIII)V", line = 107)
    public static final void method1919(int arg0, byte[] arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        field4150++;
        int var9 = -(arg3 >> 2);
        int var10 = -(arg3 & 0x3);
        for (int var11 = -arg7; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg6++;
                arg1[var10001] = (byte) (arg1[var10001] - arg5[arg2++]);
                int var14 = arg6++;
                arg1[var14] = (byte) (arg1[var14] - arg5[arg2++]);
                int var15 = arg6++;
                arg1[var15] = (byte) (arg1[var15] - arg5[arg2++]);
                int var16 = arg6++;
                arg1[var16] = (byte) (arg1[var16] - arg5[arg2++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg6++;
                arg1[var10001] = (byte) (arg1[var10001] - arg5[arg2++]);
            }
            arg2 += arg4;
            arg6 += arg8;
        }
        if (arg0 != -1) {
            field4162 = null;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "toString", descriptor = "()Ljava/lang/String;", line = 152)
    public final String toString() {
        field4152++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(BI)Lpfa;", line = 166)
    public static final class295 method1920(byte arg0, int arg1) {
        field4154++;
        if (arg1 == 0) {
            return field4149;
        } else if (arg1 == 1) {
            return field4155;
        } else if (arg1 == 2) {
            return field4156;
        } else if (arg1 == 3) {
            return field4157;
        } else if (arg1 == 4) {
            return field4158;
        } else if (arg1 == 5) {
            return field4159;
        } else if (arg1 == 6) {
            return field4160;
        } else {
            if (arg0 != 38) {
                method1918((byte) 52);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I)V", line = 239)
    public static void method1921(int arg0) {
        field4163 = null;
        field4162 = null;
        if (arg0 > -19) {
            return;
        }
        field4157 = null;
        field4159 = null;
        field4160 = null;
        field4158 = null;
        field4155 = null;
        field4149 = null;
        field4156 = null;
    }

    @OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(IILwt;)V", line = 262)
    private class295(int arg0, int arg1, class309 arg2) {
        this.field4147 = arg0;
        this.field4151 = arg1;
        this.field4148 = arg2;
        this.field4153 = this.field4148.field4299 * this.field4151;
        if (this.field4147 >= 16) {
            throw new RuntimeException();
        }
    }
}
