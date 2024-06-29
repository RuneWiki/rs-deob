import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cja")
public class class46 extends class206 {

    @OriginalMember(owner = "client!cja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field535 = new String[] { method365(method364("(Q20\u0019c")), method365(method364("(Q20\u001fc")), method365(method364("(Q20\u001dc")), method365(method364("(Q20\u0018c")), method365(method364("%N?r")), method365(method364("0\u0015}0!")), method365(method364("(Q20\u001ec")) };

    @OriginalMember(owner = "client!cja", name = "k", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!cja", name = "j", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!cja", name = "o", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!cja", name = "l", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!cja", name = "q", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!cja", name = "m", descriptor = "J")
    public long field533;

    @OriginalMember(owner = "client!cja", name = "n", descriptor = "Lcja;")
    public class46 field527;

    @OriginalMember(owner = "client!cja", name = "p", descriptor = "Lcja;")
    public class46 field529;

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(Lec;B)V", line = 4)
    public static final void method359(class247 arg0, byte arg1) {
        try {
            field531++;
            boolean var2 = false;
            if (class375.field5711 == arg0.field3833 || arg0.field3814 == -1 || arg0.field3850 != 0) {
                var2 = true;
            } else {
                class344 var3 = class272.field4122.method2242(arg0.field3814, 100);
                if (var3.field5342 || var3.field5361[arg0.field3821] < arg0.field3794 + 1) {
                    var2 = true;
                }
            }
            if (arg1 <= -49) {
                if (var2) {
                    int var4 = arg0.field3833 - arg0.field3827;
                    int var5 = class375.field5711 - arg0.field3827;
                    int var6 = arg0.field3818 * 512 + arg0.method2101(31463) * 256;
                    int var7 = arg0.field3767 * 512 + arg0.method2101(31463) * 256;
                    int var8 = arg0.field3791 * 512 + arg0.method2101(31463) * 256;
                    int var9 = arg0.field3788 * 512 + (arg0.method2101(31463) * 256);
                    arg0.field6211 = ((var4 - var5) * var7 + var5 * var9) / var4;
                    arg0.field6197 = ((var4 - var5) * var6 + var5 * var8) / var4;
                }
                arg0.field3867 = 0;
                if (arg0.field3832 == 0) {
                    arg0.method2103(0, 8192, false);
                }
                if (arg0.field3832 == 1) {
                    arg0.method2103(0, 12288, false);
                }
                if (arg0.field3832 == 2) {
                    arg0.method2103(0, 0, false);
                }
                if (arg0.field3832 == 3) {
                    arg0.method2103(0, 4096, false);
                }
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field535[6] + (arg0 == null ? field535[4] : field535[5]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cja", name = "b", descriptor = "(I)V", line = 64)
    public static final void method360(int arg0) {
        try {
            class317.field5024 = class358.field5488;
            class216.field3282 = false;
            class340.field5291 = new class367[500];
            class440.field6489 = arg0;
            class80.field902 = new int[class501.field7246][class132.field1543 + 1][class216.field3296 + 1];
            class48.field547 = 0;
            class107.field1235 = new class367[1000];
            class241.field3642 = 0;
            class655.field9468 = 0;
            field528++;
            class399.field5960 = class358.field5488;
            class137.field1598 = new class367[2000];
            class247.field3848 = new class367[500];
            if (class606.field8877 instanceof class721) {
                class64.field658 = false;
            } else {
                class64.field658 = true;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field535[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(I[III[I)V", line = 92)
    public static final void method361(int arg0, int[] arg1, int arg2, int arg3, int[] arg4) {
        try {
            if (arg0 != 28494) {
                method359(null, (byte) -122);
            }
            if (arg2 < arg3) {
                int var5 = (arg2 + arg3) / 2;
                int var6 = arg2;
                int var7 = arg4[var5];
                arg4[var5] = arg4[arg3];
                arg4[arg3] = var7;
                int var8 = arg1[var5];
                arg1[var5] = arg1[arg3];
                arg1[arg3] = var8;
                int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
                for (int var10 = arg2; var10 < arg3; var10++) {
                    if (arg4[var10] < ((var10 & var9) + var7)) {
                        int var11 = arg4[var10];
                        arg4[var10] = arg4[var6];
                        arg4[var6] = var11;
                        int var12 = arg1[var10];
                        arg1[var10] = arg1[var6];
                        arg1[var6++] = var12;
                    }
                }
                arg4[arg3] = arg4[var6];
                arg4[var6] = var7;
                arg1[arg3] = arg1[var6];
                arg1[var6] = var8;
                method361(28494, arg1, arg2, var6 - 1, arg4);
                method361(28494, arg1, var6 + 1, arg3, arg4);
            }
            field532++;
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field535[3] + arg0 + ',' + (arg1 == null ? field535[4] : field535[5]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field535[4] : field535[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(B)V", line = 152)
    public final void method362(byte arg0) {
        try {
            field534++;
            if (this.field527 != null) {
                this.field527.field529 = this.field529;
                this.field529.field527 = this.field527;
                if (arg0 != 72) {
                    this.field533 = -119L;
                }
                this.field529 = null;
                this.field527 = null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field535[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cja", name = "b", descriptor = "(B)Z", line = 171)
    public final boolean method363(byte arg0) {
        try {
            int var2 = -86 % ((arg0 + 18) / 47);
            field530++;
            return this.field527 != null;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field535[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method364(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method365(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 75;
                    break;
                case 1:
                    var10005 = 59;
                    break;
                case 2:
                    var10005 = 83;
                    break;
                case 3:
                    var10005 = 30;
                    break;
                default:
                    var10005 = 92;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
