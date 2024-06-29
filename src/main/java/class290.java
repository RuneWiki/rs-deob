import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class290 {

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "B")
    public byte field4674;

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4685 = new String[] { method2450(method2449("`+Wbr")), method2450(method2449("i8\u0015K")), method2450(method2449("|cW\t'")), method2450(method2449("`+Wfr")), method2450(method2449("`+W`r")), method2450(method2449("`+Wcr")), method2450(method2449("`+W\u001b3i$\r\u0019r")), method2450(method2449("`+Wdr")), method2450(method2449("`+War")), method2450(method2449("`+Wer")) };

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "Lqea;")
    public class135 field4670;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "Lgf;")
    public class290 field4681;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "Lpba;")
    public class350 field4678;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "Lpba;")
    public class350 field4684;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "Lmha;")
    public class438 field4669;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "Lmha;")
    public class438 field4673;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "Llv;")
    public class471 field4679;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "Llda;")
    public class513 field4677;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "S")
    public short field4671;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "S")
    public short field4675;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "S")
    public short field4676;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "S")
    public short field4683;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
    public static final void method2442(int arg0, int arg1) {
        try {
            field4668++;
            if (arg1 == -1912079896 && class239.field3682 != null && arg0 >= 0 && class239.field3682.field5381 > arg0) {
                class432 var2 = class239.field3682.field5376[arg0];
                if (var2.field6785 == -1) {
                    class164 var3 = class193.method1785(false);
                    class487 var4 = class618.method4519(94, class668.field9496, var3.field2659);
                    var4.field7362.method1678(class126.method1216(arg1 + 1912080013, var2.field6783) + 2, arg1 ^ 0x8E0706E8);
                    var4.field7362.method1650((byte) -95, arg0);
                    var4.field7362.method1681(var2.field6783, arg1 + 1912103033);
                    var3.method1546(var4, 1);
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4685[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BILoe;)V")
    public static final void method2443(byte arg0, int arg1, class210 arg2) {
        try {
            field4672++;
            if (class490.field7395 < 50 && arg2 != null && arg2.field3326 != null && arg2.field3326.length > arg1 && arg2.field3326[arg1] != null) {
                int var3 = arg2.field3326[arg1][0];
                int var4 = var3 >> 8;
                int var5 = (var3 & 0xE2) >> 5;
                if (arg2.field3326[arg1].length > 1) {
                    int var6 = (int) (Math.random() * (double) arg2.field3326[arg1].length);
                    if (var6 > 0) {
                        var4 = arg2.field3326[arg1][var6];
                    }
                }
                int var7 = -109 / ((arg0 + 3) / 55);
                int var8 = 256;
                if (arg2.field3332 != null && arg2.field3319 != null) {
                    var8 = class287.method2430((byte) 71, arg2.field3332[arg1], arg2.field3319[arg1]);
                }
                if (arg2.field3322) {
                    class136.method1271(var5, var8, var4, 0, 255, (byte) 112, false);
                } else {
                    class356.method2948(255, (byte) 122, var8, var5, 0, var4);
                }
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field4685[3] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field4685[1] : field4685[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
    public static final void method2444(byte arg0) {
        try {
            field4664++;
            class350.field5661.method1107(0);
            class550.field8070 = null;
            if (arg0 != 96) {
                method2445(103, -48, null);
            }
            class516.field7614 = 1;
            class787.field11509 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4685[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method2445(int arg0, int arg1, String arg2) {
        try {
            field4667++;
            class581.field8369++;
            class164 var3 = class193.method1785(false);
            if (arg1 != -28854) {
                field4666 = 118;
            }
            class487 var4 = class618.method4519(arg1 + 28967, class484.field7339, var3.field2659);
            var4.field7362.method1678(class126.method1216(-119, arg2) + 1, arg1 + 94134);
            var4.field7362.method1678(arg0, arg1 + 94134);
            var4.field7362.method1681(arg2, arg1 ^ 0xFFFFD52B);
            var3.method1546(var4, arg1 + 28855);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4685[5] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field4685[1] : field4685[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V")
    public final void method2446(boolean arg0) {
        try {
            while (this.field4670 != null) {
                class135 var2 = this.field4670.field1912;
                this.field4670.method1266(500);
                this.field4670 = var2;
            }
            field4680++;
            if (!arg0) {
                this.field4673 = null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4685[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(I)V")
    public class290(int arg0) {
        try {
            this.field4674 = (byte) arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4685[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZ)V")
    public static final void method2447(int arg0, boolean arg1) {
        try {
            class672.method4864(110);
            field4682++;
            if (class796.method5717(class315.field5127, (byte) -124)) {
                if (arg0 <= 44) {
                    method2443((byte) -77, 16, null);
                }
                class164[] var2 = class185.field2949;
                for (int var3 = 0; var3 < var2.length; var3++) {
                    class164 var4 = var2[var3];
                    var4.field2671++;
                    if (var4.field2671 < 50 && !arg1) {
                        return;
                    }
                    var4.field2671 = 0;
                    if (!var4.field2669 && var4.field2644 != null) {
                        class533.field7817++;
                        class487 var5 = class618.method4519(55, class355.field5712, var4.field2659);
                        var4.method1546(var5, 1);
                        try {
                            var4.method1545(121);
                        } catch (IOException var7) {
                            var4.field2669 = true;
                        }
                    }
                }
                class672.method4864(119);
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field4685[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I[B)Ljava/lang/String;")
    public static final String method2448(int arg0, byte[] arg1) {
        try {
            if (arg0 == 226) {
                field4665++;
                return class240.method2069(arg0 ^ 0x42, arg1, 0, arg1.length);
            } else {
                return null;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4685[0] + arg0 + ',' + (arg1 == null ? field4685[1] : field4685[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2449(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2450(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 7;
                    break;
                case 1:
                    var10005 = 77;
                    break;
                case 2:
                    var10005 = 121;
                    break;
                case 3:
                    var10005 = 39;
                    break;
                default:
                    var10005 = 90;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
