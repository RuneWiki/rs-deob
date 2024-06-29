import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wja")
public class class281 extends class46 {

    @OriginalMember(owner = "client!wja", name = "G", descriptor = "[Ljava/lang/String;")
    private static final String[] field4221 = new String[] { method2309(method2308("$}\u0019=\b{")), method2309(method2308("$}\u0019=\u0006{")), method2309(method2308("(9V=3")), method2309(method2308("=b\u0014\u007f")), method2309(method2308("$}\u0019=\u0002{")), method2309(method2308("$}\u0019=\u0007{")), method2309(method2308("$}\u0019=\u0004{")), method2309(method2308("$}\u0019=\t{")), method2309(method2308("$}\u0019=\u0005{")), method2309(method2308("$}\u0019=\u0000{")), method2309(method2308("$}\u0019=\u0003{")) };

    @OriginalMember(owner = "client!wja", name = "u", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!wja", name = "r", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!wja", name = "x", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!wja", name = "E", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!wja", name = "s", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!wja", name = "y", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!wja", name = "A", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!wja", name = "F", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!wja", name = "B", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!wja", name = "v", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!wja", name = "D", descriptor = "Ljava/lang/String;")
    public String field4209;

    @OriginalMember(owner = "client!wja", name = "w", descriptor = "[C")
    public char[] field4207;

    @OriginalMember(owner = "client!wja", name = "z", descriptor = "[C")
    public char[] field4218;

    @OriginalMember(owner = "client!wja", name = "t", descriptor = "[I")
    public int[] field4206;

    @OriginalMember(owner = "client!wja", name = "C", descriptor = "[I")
    public int[] field4213;

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(I)V")
    public static final void method2299(int arg0) {
        try {
            field4208++;
            for (class536 var1 = (class536) class622.field9116.method4545((byte) -80); var1 != null; var1 = (class536) class622.field9116.method4545((byte) -80)) {
                class252.method2131(122, var1);
            }
            int var2 = -114 % ((arg0 - 47) / 63);
            int var3;
            int var4;
            if (class289.field4305.field825.method717(false) == 1) {
                var4 = 0;
                var3 = 3;
            } else {
                var3 = class419.field6182;
                var4 = class419.field6182;
            }
            client.method2673();
            for (int var5 = var4; var5 <= var3; var5++) {
                client.method2662();
                client.method2669(var5);
                client.method2680(var5);
            }
            client.method2664();
            client.method2665();
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field4221[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(CB)I")
    public final int method2300(char arg0, byte arg1) {
        try {
            field4216++;
            if (this.field4213 == null) {
                return -1;
            }
            if (arg1 != -67) {
                this.field4218 = null;
            }
            for (int var3 = 0; var3 < this.field4213.length; var3++) {
                if (this.field4207[var3] == arg0) {
                    return this.field4213[var3];
                }
            }
            return -1;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4221[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wja", name = "g", descriptor = "(I)V")
    public final void method2301(int arg0) {
        try {
            if (this.field4213 != null) {
                for (int var2 = 0; var2 < this.field4213.length; var2++) {
                    this.field4213[var2] = class544.method4107(this.field4213[var2], 32768);
                }
            }
            field4212++;
            if (this.field4206 != null) {
                for (int var3 = 0; var3 < this.field4206.length; var3++) {
                    this.field4206[var3] = class544.method4107(this.field4206[var3], 32768);
                }
            }
            if (arg0 != -11128) {
                this.method2304(-123, null, -119);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4221[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wja", name = "h", descriptor = "(I)V")
    public static final void method2302(int arg0) {
        try {
            if (arg0 > 121) {
                field4220++;
                class616.field9022.method1559(0);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4221[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(III)Z")
    public static final boolean method2303(int arg0, int arg1, int arg2) {
        try {
            int var3 = 52 % ((arg0 - 7) / 35);
            field4210++;
            return class578.method4318(90, arg2, arg1) | (arg1 & 0x70000) != 0 || class318.method2690((byte) 79, arg1, arg2);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4221[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(ILib;I)V")
    private final void method2304(int arg0, class163 arg1, int arg2) {
        try {
            if (arg2 < -31) {
                if (arg0 == 1) {
                    this.field4209 = arg1.method1423(-35);
                } else if (arg0 == 2) {
                    int var7 = arg1.method1455((byte) 62);
                    this.field4206 = new int[var7];
                    this.field4218 = new char[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field4206[var8] = arg1.method1445((byte) 103);
                        byte var9 = arg1.method1414(1);
                        this.field4218[var8] = var9 == 0 ? 0 : class259.method2185(-161, var9);
                    }
                } else if (arg0 == 3) {
                    int var4 = arg1.method1455((byte) 62);
                    this.field4213 = new int[var4];
                    this.field4207 = new char[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field4213[var5] = arg1.method1445((byte) 106);
                        byte var6 = arg1.method1414(1);
                        this.field4207[var5] = var6 == 0 ? 0 : class259.method2185(-161, var6);
                    }
                }
                field4214++;
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field4221[1] + arg0 + ',' + (arg1 == null ? field4221[3] : field4221[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!wja", name = "c", descriptor = "(I)V")
    public static final void method2305(int arg0) {
        try {
            class548.field8188 = 0;
            field4215++;
            int var1 = 16 / ((arg0 + 56) / 36);
            class772.field11216 = 0;
            for (int var2 = 0; var2 < class601.field8825; var2++) {
                int var3 = class187.field2571 * var2;
                for (int var4 = 0; var4 < class187.field2571; var4++) {
                    int var5 = var3 + var4;
                    class792.field11524[var5].method709(class283.field4239 * var4, class335.field5236 * var2, class283.field4239, class335.field5236, 0, 0, true, true);
                }
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field4221[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(BC)I")
    public final int method2306(byte arg0, char arg1) {
        try {
            if (arg0 != 100) {
                this.field4213 = null;
            }
            field4211++;
            if (this.field4206 == null) {
                return -1;
            }
            for (int var3 = 0; var3 < this.field4206.length; var3++) {
                if (this.field4218[var3] == arg1) {
                    return this.field4206[var3];
                }
            }
            return -1;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4221[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(BLib;)V")
    public final void method2307(byte arg0, class163 arg1) {
        try {
            field4217++;
            while (true) {
                int var3 = arg1.method1455((byte) 62);
                if (var3 == 0) {
                    if (arg0 <= 80) {
                        this.method2300(',', (byte) 92);
                        return;
                    } else {
                        return;
                    }
                }
                this.method2304(var3, arg1, -94);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4221[9] + arg0 + ',' + (arg1 == null ? field4221[3] : field4221[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!wja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2308(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2309(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 83;
                    break;
                case 1:
                    var10005 = 23;
                    break;
                case 2:
                    var10005 = 120;
                    break;
                case 3:
                    var10005 = 19;
                    break;
                default:
                    var10005 = 78;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
