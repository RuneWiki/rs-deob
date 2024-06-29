import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class390 extends class682 {

    @OriginalMember(owner = "client!bw", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field5690 = new String[] { method3055(method3054("\u0018&\u001akp")), method3055(method3054("\u0018&\u001anp")), method3055(method3054("\u0018&\u001ajp")), method3055(method3054("\u0018&\u001amp")), method3055(method3054("\u0018&\u001aop")), method3055(method3054("\u0018&\u001alp")), method3055(method3054("\u0018&\u001aip")) };

    @OriginalMember(owner = "client!bw", name = "w", descriptor = "Lsb;")
    public static class261 field5678 = new class261(25, -2);

    @OriginalMember(owner = "client!bw", name = "q", descriptor = "Lsb;")
    public static class261 field5688 = new class261(49, 6);

    @OriginalMember(owner = "client!bw", name = "z", descriptor = "[Llq;")
    public static class728[] field5689 = new class728[0];

    @OriginalMember(owner = "client!bw", name = "u", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!bw", name = "s", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!bw", name = "v", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!bw", name = "o", descriptor = "I")
    public int field5679;

    @OriginalMember(owner = "client!bw", name = "t", descriptor = "I")
    public int field5681;

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
    public int field5683;

    @OriginalMember(owner = "client!bw", name = "x", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!bw", name = "r", descriptor = "I")
    public int field5685;

    @OriginalMember(owner = "client!bw", name = "y", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!bw", name = "p", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!bw", name = "A", descriptor = "J")
    public long field5680;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)I", line = 8)
    public final int method1086(byte arg0) {
        try {
            int var2 = -58 / ((arg0 - 60) / 63);
            field5675++;
            return this.field5679;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5690[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZII)Z", line = 19)
    public static final boolean method3052(boolean arg0, int arg1, int arg2) {
        try {
            field5676++;
            if (!class86.field1217) {
                return false;
            }
            int var3 = arg1 >> 16;
            int var4 = arg1 & 0xFFFF;
            if (class9.field117[var3] == null || class9.field117[var3][var4] == null) {
                return false;
            }
            class782 var5 = class9.field117[var3][var4];
            if (arg2 == -1 && var5.field11291 == 0) {
                for (class228 var6 = (class228) class45.field644.method3977((byte) -63); var6 != null; var6 = (class228) class45.field644.method3987(0)) {
                    if (var6.field3311 == 45 || var6.field3311 == 1007 || var6.field3311 == 11 || var6.field3311 == 6 || var6.field3311 == 60) {
                        for (class782 var7 = class435.method3389(var6.field3297, (byte) -122); var7 != null; var7 = class737.method5350((byte) 127, var7)) {
                            if (var5.field11158 == var7.field11158) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                for (class228 var8 = (class228) class45.field644.method3977((byte) -84); var8 != null; var8 = (class228) class45.field644.method3987(0)) {
                    if (var8.field3298 == arg2 && var5.field11158 == var8.field3297 && (var8.field3311 == 45 || var8.field3311 == 1007 || var8.field3311 == 11 || var8.field3311 == 6 || var8.field3311 == 60)) {
                        return true;
                    }
                }
            }
            if (arg0) {
                method3053(-62);
            }
            return false;
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field5690[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)I", line = 88)
    public final int method1087(int arg0) {
        try {
            field5682++;
            if (arg0 != 24700) {
                field5688 = null;
            }
            return this.field5685;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5690[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)I", line = 101)
    public final int method1088(int arg0) {
        try {
            if (arg0 != -6) {
                field5687 = -71;
            }
            field5684++;
            return this.field5681;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5690[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "(I)V", line = 113)
    public static void method3053(int arg0) {
        try {
            field5678 = null;
            field5689 = null;
            if (arg0 == 60) {
                field5688 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5690[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)I", line = 125)
    public final int method1084(int arg0) {
        try {
            field5686++;
            if (arg0 != 128) {
                this.method1086((byte) 86);
            }
            return this.field5683;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5690[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "(I)J", line = 145)
    public final long method1085(int arg0) {
        try {
            field5677++;
            if (arg0 != -6709) {
                this.method1086((byte) -38);
            }
            return this.field5680;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5690[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3054(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x58);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3055(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 122;
                    break;
                case 1:
                    var10005 = 81;
                    break;
                case 2:
                    var10005 = 52;
                    break;
                case 3:
                    var10005 = 40;
                    break;
                default:
                    var10005 = 88;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
