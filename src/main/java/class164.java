import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class164 extends class77 {

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "I")
    public static int field2335 = 0;

    @OriginalMember(owner = "client!cl", name = "F", descriptor = "J")
    public static long field2339 = 0L;

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!cl", name = "D", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!cl", name = "E", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "Ls;")
    private class196 field2330;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;", line = 4)
    public final String method1159(int arg0, int arg1, String arg2) {
        field2332++;
        if (this.field2330 == null) {
            return arg2;
        }
        class145 var4 = (class145) this.field2330.method1405((long) arg1, false);
        if (var4 == null) {
            return arg2;
        } else {
            if (arg0 != 10) {
                this.method1159(47, 116, (String) null);
            }
            return var4.field2092;
        }
    }

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)V", line = 29)
    public static final void method1160(int arg0) {
        field2334++;
        int var1 = class126.field1846.method203(class173.field2493);
        for (int var2 = 0; var2 < class264.field4043; var2++) {
            int var3 = class126.field1846.method203(class181.method1252(var2, -21419));
            if (var3 > var1) {
                var1 = var3;
            }
        }
        var1 += 8;
        int var4 = class255.field3814;
        int var5 = class193.field2807 - (var1 / 2);
        int var6 = class264.field4043 * 15 + 21;
        if (class19.field301 < (var4 + var6)) {
            var4 = class19.field301 - var6;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        if (class286.field4312 < var1 + var5) {
            var5 = class286.field4312 - var1;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class181.field2603 == 1) {
            if (class193.field2807 == class152.field2192 && class354.field5444 == class255.field3814) {
                class172.field2482 = var1;
                class181.field2603 = 0;
                class131.field1899 = var4;
                class134.field1957 = (class304.field4564 ? 26 : 22) + class264.field4043 * 15;
                class15.field246 = true;
                class173.field2499 = var5;
            }
        } else if (class193.field2807 == class180.field2592 && class255.field3814 == class227.field3425) {
            class172.field2482 = var1;
            class181.field2603 = 0;
            class173.field2499 = var5;
            class131.field1899 = var4;
            class15.field246 = true;
            class134.field1957 = class264.field4043 * 15 + (class304.field4564 ? 26 : 22);
        } else {
            class354.field5444 = class227.field3425;
            class181.field2603 = 1;
            class152.field2192 = class180.field2592;
        }
        int var7 = -55 / ((arg0 - 28) / 35);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B[JII[I)V", line = 122)
    public static final void method1161(byte arg0, long[] arg1, int arg2, int arg3, int[] arg4) {
        if (arg3 > arg2) {
            int var5 = arg2;
            int var6 = (arg2 + arg3) / 2;
            long var7 = arg1[var6];
            arg1[var6] = arg1[arg3];
            arg1[arg3] = var7;
            int var9 = arg4[var6];
            arg4[var6] = arg4[arg3];
            arg4[arg3] = var9;
            for (int var10 = arg2; var10 < arg3; var10++) {
                if (arg1[var10] < (long) (var10 & 0x1) + var7) {
                    long var11 = arg1[var10];
                    arg1[var10] = arg1[var5];
                    arg1[var5] = var11;
                    int var13 = arg4[var10];
                    arg4[var10] = arg4[var5];
                    arg4[var5++] = var13;
                }
            }
            arg1[arg3] = arg1[var5];
            arg1[var5] = var7;
            arg4[arg3] = arg4[var5];
            arg4[var5] = var9;
            method1161((byte) -109, arg1, arg2, var5 - 1, arg4);
            method1161((byte) -117, arg1, var5 + 1, arg3, arg4);
        }
        field2336++;
        if (arg0 > -108) {
            method1160(62);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILsb;)V", line = 178)
    private final void method1162(int arg0, int arg1, class190 arg2) {
        if (arg1 == 249) {
            int var4 = arg2.method1319(255);
            if (this.field2330 == null) {
                int var5 = class344.method2409(var4, -24724);
                this.field2330 = new class196(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method1319(255) == 1;
                int var8 = arg2.method1312(62);
                class117 var9;
                if (var7) {
                    var9 = new class145(arg2.method1329((byte) 59));
                } else {
                    var9 = new class35(arg2.method1371(-4));
                }
                this.field2330.method1400((long) var8, 119, var9);
            }
        }
        if (arg0 != 26) {
            field2339 = -54L;
        }
        field2331++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)I", line = 224)
    public final int method1163(int arg0, int arg1, int arg2) {
        field2333++;
        if (this.field2330 == null) {
            return arg2;
        }
        class35 var4 = (class35) this.field2330.method1405((long) arg1, false);
        if (arg0 != 1) {
            method1160(119);
        }
        return var4 == null ? arg2 : var4.field515;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 250)
    public static final String method1164(byte arg0, long arg1) {
        field2337++;
        class67.field985.setTime(new Date(arg1));
        int var3 = class67.field985.get(7);
        int var4 = class67.field985.get(5);
        int var5 = class67.field985.get(2);
        int var6 = class67.field985.get(1);
        int var7 = class67.field985.get(11);
        if (arg0 != -76) {
            method1161((byte) 113, (long[]) null, 0, -49, (int[]) null);
        }
        int var8 = class67.field985.get(12);
        int var9 = class67.field985.get(13);
        return class354.field5442[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class86.field1229[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lsb;Z)V", line = 285)
    public final void method1165(class190 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method1319(255);
            if (var3 == 0) {
                if (!arg1) {
                    field2339 = 4L;
                }
                field2338++;
                return;
            }
            this.method1162(26, var3, arg0);
        }
    }
}
