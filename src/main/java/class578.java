import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class578 {

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    public int field8319;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "Lvf;")
    private class159 field8320;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8323 = new String[] { method4236(method4235("\u0003JE\u0016")), method4236(method4235("\u0016\u0011\u0007T=")), method4236(method4235("\u0003S\u0007F)\u0003V]Dh")), method4236(method4235("\u0003S\u0007;h")), method4236(method4235("\u0003S\u00079h")), method4236(method4235("\u0003S\u0007\u001c)\u0003^E\u0013:\b\u0017")), method4236(method4235("\u0003S\u00078h")) };

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field8316;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    public static int field8317;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field8318;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public static int field8321;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public static int field8322;

    @OriginalMember(owner = "client!nl", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() throws Throwable {
        try {
            this.field8320.method1442(this.field8319, 0);
            field8322++;
            super.finalize();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8323[5] + ')');
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lgda;B)I", line = 18)
    public static final int method4232(class58 arg0, byte arg1) {
        try {
            field8318++;
            if (arg1 != 92) {
                method4234((byte) -70, 37, 112, null, 102);
            }
            int var2 = 0;
            if (arg0.method595(-2, class58.field751)) {
                var2++;
            }
            if (arg0.method595(arg1 - 94, class44.field494)) {
                var2++;
            }
            if (arg0.method595(arg1 - 94, class622.field8981)) {
                var2++;
            }
            if (arg0.method595(-2, class196.field3118)) {
                var2++;
            }
            if (arg0.method595(-2, class7.field82)) {
                var2++;
            }
            if (arg0.method595(-2, class350.field5659)) {
                var2++;
            }
            if (arg0.method595(-2, class176.field2855)) {
                var2++;
            }
            if (arg0.method595(arg1 ^ 0xFFFFFFA2, class276.field4419)) {
                var2++;
            }
            if (arg0.method595(arg1 ^ 0xFFFFFFA2, class531.field7805)) {
                var2++;
            }
            if (arg0.method595(-2, class187.field2975)) {
                var2++;
            }
            if (arg0.method595(-2, class597.field8642)) {
                var2++;
            }
            if (arg0.method595(arg1 - 94, class719.field10518)) {
                var2++;
            }
            if (arg0.method595(-2, class239.field3683)) {
                var2++;
            }
            if (arg0.method595(arg1 ^ 0xFFFFFFA2, class544.field8009)) {
                var2++;
            }
            if (arg0.method595(-2, class68.field967)) {
                var2++;
            }
            if (arg0.method595(-2, class182.field2899)) {
                var2++;
            }
            return var2;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8323[6] + (arg0 == null ? field8323[0] : field8323[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Loi;Z)I", line = 90)
    public static final int method4233(class77 arg0, boolean arg1) {
        try {
            if (arg1) {
                return 10;
            }
            field8317++;
            if (arg0.field1145 == 0) {
                return 0;
            }
            if (arg0.field1155 != -1) {
                class77 var2 = null;
                if (arg0.field1155 < 32768) {
                    class19 var3 = (class19) class176.field2797.method737((byte) -39, (long) arg0.field1155);
                    if (var3 != null) {
                        var2 = var3.field194;
                    }
                } else if (arg0.field1155 >= 32768) {
                    var2 = class33.field395[arg0.field1155 - 32768];
                }
                if (var2 != null) {
                    int var4 = arg0.field9985 - var2.field9985;
                    int var5 = arg0.field9983 - var2.field9983;
                    if (var4 != 0 || var5 != 0) {
                        arg0.method800((int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF, -29);
                    }
                }
            }
            if ((arg0 instanceof class738)) {
                class738 var9 = (class738) arg0;
                if (var9.field10837 != -1 && (var9.field1205 == 0 || var9.field1206 > 0)) {
                    var9.method800(var9.field10837, -79);
                    var9.field10837 = -1;
                }
            } else if (arg0 instanceof class426) {
                class426 var6 = (class426) arg0;
                if (var6.field6725 != -1 && (var6.field1205 == 0 || var6.field1206 > 0)) {
                    int var7 = var6.field9985 - ((var6.field6725 - class397.field6289 - class397.field6289) * 256);
                    int var8 = var6.field9983 - ((var6.field6712 - class141.field2011 - class141.field2011) * 256);
                    if (var7 != 0 || var8 != 0) {
                        var6.method800((int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF, -42);
                    }
                    var6.field6725 = -1;
                }
            }
            return arg0.method801(105);
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field8323[3] + (arg0 == null ? field8323[0] : field8323[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BIILtk;I)V", line = 172)
    public static final void method4234(byte arg0, int arg1, int arg2, class362 arg3, int arg4) {
        try {
            field8321++;
            if (arg0 != -102) {
                method4234((byte) -76, 21, 38, null, -49);
            }
            for (class195 var5 = (class195) class669.field9510.method3228(11); var5 != null; var5 = (class195) class669.field9510.method3216(true)) {
                if (var5.field3097 == arg4 && arg2 << 9 == var5.field3094 && arg1 << 9 == var5.field3110 && var5.field3089.field5855 == arg3.field5855) {
                    if (var5.field3081 != null) {
                        class476.field7253.method2594(var5.field3081);
                        var5.field3081 = null;
                    }
                    if (var5.field3101 != null) {
                        class476.field7253.method2594(var5.field3101);
                        var5.field3101 = null;
                    }
                    var5.method4173(-1);
                    return;
                }
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field8323[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field8323[0] : field8323[1]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lvf;II)V", line = 210)
    public class578(class159 arg0, int arg1, int arg2) {
        try {
            this.field8319 = arg2;
            this.field8320 = arg0;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8323[2] + (arg0 == null ? field8323[0] : field8323[1]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4235(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x40);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4236(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 109;
                    break;
                case 1:
                    var10005 = 63;
                    break;
                case 2:
                    var10005 = 41;
                    break;
                case 3:
                    var10005 = 122;
                    break;
                default:
                    var10005 = 64;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
