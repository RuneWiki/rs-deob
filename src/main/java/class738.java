import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class738 extends class114 {

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "I")
    private int field10507 = -1;

    @OriginalMember(owner = "client!hm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10513 = new String[] { method5359(method5358("><\u0019a>")), method5359(method5358("><\u0019b>")), method5359(method5358("-\u007f\u0019\tk")), method5359(method5358("8$[K")), method5359(method5358("><\u0019f>")), method5359(method5358("><\u0019c>")), method5359(method5358("{|\t\u0007")), method5359(method5358("><\u0019e>")), method5359(method5358("><\u0019d>")) };

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "I")
    public static int field10511 = 0;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "B")
    private byte field10505;

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "I")
    public static int field10503;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "I")
    public static int field10504;

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "I")
    public static int field10506;

    @OriginalMember(owner = "client!hm", name = "r", descriptor = "I")
    public static int field10508;

    @OriginalMember(owner = "client!hm", name = "s", descriptor = "I")
    public static int field10509;

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
    public static int field10510;

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
    public static int field10512;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
    public static final void method5354(int arg0) {
        try {
            field10509++;
            if (class326.field4462 != -1 && class444.field6552 != -1) {
                int var1 = ((class321.field4377 - class212.field3121) * class209.field3042 >> 16) + class212.field3121;
                class209.field3042 += var1;
                if (class209.field3042 >= 65535) {
                    if (class728.field10434) {
                        class113.field1456 = false;
                    } else {
                        class113.field1456 = true;
                    }
                    class209.field3042 = 65535;
                    class728.field10434 = true;
                } else {
                    class728.field10434 = false;
                    class113.field1456 = false;
                }
                float var2 = (float) class209.field3042 / 65535.0F;
                if (arg0 <= -106) {
                    float[] var3 = new float[3];
                    int var4 = class379.field5545 * 2;
                    for (int var5 = 0; var5 < 3; var5++) {
                        int var6 = class731.field10447[class326.field4462][var4][var5] * 3;
                        int var7 = class731.field10447[class326.field4462][var4 + 1][var5] * 3;
                        int var8 = (class731.field10447[class326.field4462][var4 + 2][var5] + class731.field10447[class326.field4462][var4 + 2][var5] - class731.field10447[class326.field4462][var4 + 3][var5]) * 3;
                        int var9 = class731.field10447[class326.field4462][var4][var5];
                        int var10 = var7 - var6;
                        int var11 = var6 + var8 - var7 * 2;
                        int var12 = var7 + class731.field10447[class326.field4462][var4 + 2][var5] - var9 - var8;
                        var3[var5] = (((float) var12 * var2 + (float) var11) * var2 + (float) var10) * var2 + (float) var9;
                    }
                    class670.field9442 = (int) var3[0] - (class537.field7895 * 512);
                    class525.field7650 = (int) var3[1] * -1;
                    class688.field9635 = (int) var3[2] - (class655.field9286 * 512);
                    float[] var13 = new float[3];
                    int var14 = class783.field11309 * 2;
                    for (int var15 = 0; var15 < 3; var15++) {
                        int var16 = class731.field10447[class444.field6552][var14][var15] * 3;
                        int var17 = class731.field10447[class444.field6552][var14 + 1][var15] * 3;
                        int var18 = (class731.field10447[class444.field6552][var14 + 2][var15] + class731.field10447[class444.field6552][var14 + 2][var15] - class731.field10447[class444.field6552][var14 + 3][var15]) * 3;
                        int var19 = class731.field10447[class444.field6552][var14][var15];
                        int var20 = var17 - var16;
                        int var21 = var16 + var18 - var17 * 2;
                        int var22 = class731.field10447[class444.field6552][var14 + 2][var15] + var17 - var19 - var18;
                        var13[var15] = (((float) var22 * var2 + (float) var21) * var2 + (float) var20) * var2 + (float) var19;
                    }
                    float var23 = var13[0] - var3[0];
                    float var24 = (var13[1] - var3[1]) * -1.0F;
                    float var25 = var13[2] - var3[2];
                    double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
                    class355.field5151 = (int) (Math.atan2((double) var24, var26) * 2607.5945876176133D) & 0x3FFF;
                    class57.field802 = (int) (-Math.atan2((double) var23, (double) var25) * 2607.5945876176133D) & 0x3FFF;
                    class282.field3974 = ((class731.field10447[class326.field4462][var4 + 2][3] - class731.field10447[class326.field4462][var4][3]) * class209.field3042 >> 16) + class731.field10447[class326.field4462][var4][3];
                }
            }
        } catch (RuntimeException var29) {
            throw class665.method4799(var29, field10513[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)I")
    public static final int method5355(int arg0, int arg1, int arg2) {
        try {
            arg2 = (arg1 & 0x7F) * arg2 >> 7;
            field10512++;
            if (arg2 < arg0) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return (arg1 & 0xFF80) + arg2;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10513[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(Z)V")
    public static final void method5356(boolean arg0) {
        try {
            if (!arg0) {
                if (class354.field5135 <= 0) {
                    class273.field3877 = "";
                } else {
                    int var1 = 0;
                    for (int var2 = 0; var2 < class789.field11405.length; var2++) {
                        if (class789.field11405[var2].indexOf(field10513[6]) != -1) {
                            var1++;
                            if (class354.field5135 == var1) {
                                class273.field3877 = class789.field11405[var2].substring(class789.field11405[var2].indexOf(">") + 2);
                                break;
                            }
                        }
                    }
                }
                field10510++;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10513[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Ljc;I)V")
    public final void method116(class711 arg0, int arg1) {
        try {
            this.field10507 = arg0.method5116((byte) -107);
            if (arg1 != -27800) {
                method5355(51, -110, 107);
            }
            field10506++;
            this.field10505 = arg0.method5125((byte) -64);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10513[4] + (arg0 == null ? field10513[3] : field10513[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)Z")
    public static final boolean method5357(int arg0, int arg1) {
        try {
            if (arg1 != 2) {
                method5354(-77);
            }
            field10508++;
            return arg0 == 23 || arg0 == 13 || arg0 == 15 || arg0 == 10 || arg0 == 53 || arg0 == 46 || arg0 == 58 || arg0 == 59 || arg0 == 30 || arg0 == 25 || arg0 == 48;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10513[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILwfa;)V")
    public final void method115(int arg0, class286 arg1) {
        try {
            arg1.method2312(this.field10507, this.field10505, (byte) 126);
            if (arg0 != 95) {
                this.field10505 = 70;
            }
            field10503++;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10513[5] + arg0 + ',' + (arg1 == null ? field10513[3] : field10513[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!hm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5358(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x16);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5359(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 86;
                    break;
                case 1:
                    var10005 = 81;
                    break;
                case 2:
                    var10005 = 55;
                    break;
                case 3:
                    var10005 = 39;
                    break;
                default:
                    var10005 = 22;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
