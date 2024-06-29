import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class576 extends class578 {

    @OriginalMember(owner = "client!mca", name = "H", descriptor = "I")
    public int field8323 = 0;

    @OriginalMember(owner = "client!mca", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field8355 = new String[] { method4285(method4284("\u001e=\u0010fY")), method4285(method4284("\bp_faM")), method4285(method4284("\u000bfR$")), method4285(method4284("\bp_feM")), method4285(method4284("\bp_fgM")), method4285(method4284("\bp_f`M")) };

    @OriginalMember(owner = "client!mca", name = "E", descriptor = "I")
    public static int field8327 = -1;

    @OriginalMember(owner = "client!mca", name = "Q", descriptor = "I")
    public int field8320;

    @OriginalMember(owner = "client!mca", name = "D", descriptor = "I")
    public int field8321;

    @OriginalMember(owner = "client!mca", name = "N", descriptor = "I")
    public int field8322;

    @OriginalMember(owner = "client!mca", name = "J", descriptor = "I")
    public static int field8325;

    @OriginalMember(owner = "client!mca", name = "F", descriptor = "I")
    public int field8328;

    @OriginalMember(owner = "client!mca", name = "O", descriptor = "I")
    public int field8331;

    @OriginalMember(owner = "client!mca", name = "p", descriptor = "I")
    public static int field8332;

    @OriginalMember(owner = "client!mca", name = "l", descriptor = "I")
    public int field8334;

    @OriginalMember(owner = "client!mca", name = "j", descriptor = "I")
    public int field8335;

    @OriginalMember(owner = "client!mca", name = "I", descriptor = "I")
    public int field8337;

    @OriginalMember(owner = "client!mca", name = "r", descriptor = "I")
    public int field8338;

    @OriginalMember(owner = "client!mca", name = "t", descriptor = "I")
    public int field8339;

    @OriginalMember(owner = "client!mca", name = "y", descriptor = "I")
    public int field8340;

    @OriginalMember(owner = "client!mca", name = "n", descriptor = "I")
    public int field8341;

    @OriginalMember(owner = "client!mca", name = "k", descriptor = "I")
    public static int field8343;

    @OriginalMember(owner = "client!mca", name = "R", descriptor = "I")
    public static int field8344;

    @OriginalMember(owner = "client!mca", name = "u", descriptor = "I")
    public static int field8346;

    @OriginalMember(owner = "client!mca", name = "v", descriptor = "I")
    public int field8349;

    @OriginalMember(owner = "client!mca", name = "K", descriptor = "I")
    public static int field8351;

    @OriginalMember(owner = "client!mca", name = "m", descriptor = "I")
    public int field8352;

    @OriginalMember(owner = "client!mca", name = "w", descriptor = "Leia;")
    public class186 field8350;

    @OriginalMember(owner = "client!mca", name = "A", descriptor = "Leia;")
    public class186 field8354;

    @OriginalMember(owner = "client!mca", name = "M", descriptor = "Lvfa;")
    public class313 field8336;

    @OriginalMember(owner = "client!mca", name = "o", descriptor = "Lvfa;")
    public class313 field8345;

    @OriginalMember(owner = "client!mca", name = "i", descriptor = "Lem;")
    public class339 field8353;

    @OriginalMember(owner = "client!mca", name = "s", descriptor = "Lih;")
    public class717 field8329;

    @OriginalMember(owner = "client!mca", name = "z", descriptor = "Lfw;")
    public class789 field8347;

    @OriginalMember(owner = "client!mca", name = "L", descriptor = "Lhba;")
    public class93 field8324;

    @OriginalMember(owner = "client!mca", name = "G", descriptor = "Lhba;")
    public class93 field8333;

    @OriginalMember(owner = "client!mca", name = "x", descriptor = "Z")
    public boolean field8330;

    @OriginalMember(owner = "client!mca", name = "P", descriptor = "Z")
    public boolean field8342;

    @OriginalMember(owner = "client!mca", name = "B", descriptor = "Z")
    public boolean field8348;

    @OriginalMember(owner = "client!mca", name = "q", descriptor = "[I")
    public int[] field8326;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)V", line = 4)
    public final void method4279(int arg0) {
        try {
            if (arg0 != -1) {
                method4283(null);
            }
            field8343++;
            int var2 = this.field8321;
            boolean var3 = this.field8330;
            if (this.field8347 != null) {
                class789 var6 = this.field8347.method5688(-107, class734.field10459);
                if (var6 == null) {
                    this.field8352 = 256;
                    this.field8339 = 0;
                    this.field8331 = 0;
                    this.field8330 = false;
                    this.field8334 = 256;
                    this.field8321 = -1;
                    this.field8349 = 0;
                    this.field8326 = null;
                    this.field8348 = false;
                    this.field8328 = 0;
                    this.field8322 = 0;
                } else {
                    this.field8330 = var6.field11414;
                    this.field8334 = var6.field11472;
                    this.field8326 = var6.field11400;
                    this.field8328 = var6.field11435 << 9;
                    this.field8349 = var6.field11406;
                    this.field8339 = var6.field11455;
                    this.field8352 = var6.field11439;
                    this.field8348 = var6.field11384;
                    this.field8321 = var6.field11441;
                    this.field8331 = var6.field11388;
                }
            } else if (this.field8329 != null) {
                int var4 = class453.method3507(this.field8329, -1);
                if (var2 != var4) {
                    this.field8321 = var4;
                    class134 var5 = this.field8329.field10229;
                    if (var5.field1659 != null) {
                        var5 = var5.method1178(class734.field10459, (byte) -83);
                    }
                    if (var5 == null) {
                        this.field8334 = 256;
                        this.field8331 = this.field8328 = this.field8322 = 0;
                        this.field8330 = this.field8329.field10229.field1709;
                        this.field8352 = 256;
                    } else {
                        this.field8328 = var5.field1673 << 9;
                        this.field8322 = var5.field1701 << 9;
                        this.field8352 = var5.field1693;
                        this.field8330 = var5.field1709;
                        this.field8334 = var5.field1664;
                        this.field8331 = var5.field1706;
                    }
                }
            } else if (this.field8353 != null) {
                this.field8321 = class608.method4491(this.field8353, 0);
                this.field8330 = this.field8353.field4947;
                this.field8334 = 256;
                this.field8331 = this.field8353.field4907;
                this.field8328 = this.field8353.field4930 << 9;
                this.field8322 = 0;
                this.field8352 = 256;
            }
            if (this.field8321 != var2 || this.field8330 != var3) {
                if (this.field8324 == null) {
                    return;
                }
                class261.field3699.method4232(this.field8324);
                this.field8354 = null;
                this.field8324 = null;
                this.field8345 = null;
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field8355[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)V", line = 133)
    public static final void method4280(int arg0) {
        try {
            field8344++;
            for (class228 var1 = (class228) class45.field644.method3977((byte) -44); var1 != null; var1 = (class228) class45.field644.method3987(0)) {
                if (class711.method5124(11411, var1.field3311)) {
                    class314.method2497((byte) -101, var1);
                }
            }
            if (arg0 >= -43) {
                field8332 = -64;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8355[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Z)V", line = 157)
    public static final void method4281(boolean arg0) {
        try {
            if (class758.field10827 == null) {
                class758.field10827 = class746.method5397(-92);
                class201.field2963 = class758.field10827[0];
                class389.field5666 = class614.method4531(-119);
            }
            if (arg0) {
                method4282(-48, -3, 101, null, -121);
            }
            field8351++;
            if (class298.field4155 == null) {
                class353.method2821((byte) -121);
            }
            class746 var1 = class201.field2963;
            int var2 = class241.method1992((byte) -50);
            if (class201.field2963 == var1) {
                class736.field10485 = class201.field2963.field10586.method4068((byte) -70, class405.field5883);
                if (class201.field2963.field10583) {
                    class46.field654 = (class201.field2963.field10580 - class201.field2963.field10585) * var2 / 100 + class201.field2963.field10585;
                }
                if (class201.field2963.field10584) {
                    class736.field10485 = class736.field10485 + class46.field654 + "%";
                }
            } else if (class746.field10607 == class201.field2963) {
                class298.field4155 = null;
                class699.method5035(3, 31754);
            } else {
                class736.field10485 = var1.field10581.method4068((byte) -118, class405.field5883);
                if (class201.field2963.field10584) {
                    class736.field10485 = class736.field10485 + var1.field10580 + "%";
                }
                class46.field654 = var1.field10580;
                if (class201.field2963.field10583 || var1.field10583) {
                    class389.field5666 = class614.method4531(-71);
                }
            }
            if (class298.field4155 != null) {
                class298.field4155.method2235((byte) 78, class201.field2963, class46.field654, class389.field5666, class736.field10485);
                if (class230.field3333 != null) {
                    for (int var3 = class606.field8685 + 1; var3 < class230.field3333.length; var3++) {
                        if (class230.field3333[var3].method807((byte) 120) >= 100 && (var3 - 1) == class606.field8685 && class559.field8139 >= 1 && class298.field4155.method2227((byte) 11)) {
                            try {
                                class230.field3333[var3].method806(31428);
                            } catch (Exception var5) {
                                class230.field3333 = null;
                                return;
                            }
                            class298.field4155.method2224(class230.field3333[var3], (byte) -118);
                            class606.field8685++;
                            if (class230.field3333.length - 1 <= class606.field8685 && class230.field3333.length > 1) {
                                class606.field8685 = class305.field4243.method2549(111) ? 0 : -1;
                            }
                        }
                    }
                    return;
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field8355[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(III[II)V", line = 262)
    public static final void method4282(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        try {
            arg1--;
            field8346++;
            int var15 = arg4 - 1;
            int var5 = arg0 + var15;
            while (arg1 < var5) {
                int var8 = arg1 + 1;
                arg3[var8] = arg2;
                int var9 = var8 + 1;
                arg3[var9] = arg2;
                int var10 = var9 + 1;
                arg3[var10] = arg2;
                int var11 = var10 + 1;
                arg3[var11] = arg2;
                int var12 = var11 + 1;
                arg3[var12] = arg2;
                int var13 = var12 + 1;
                arg3[var13] = arg2;
                int var14 = var13 + 1;
                arg3[var14] = arg2;
                arg1 = var14 + 1;
                arg3[arg1] = arg2;
            }
            while (arg1 < var15) {
                arg1++;
                arg3[arg1] = arg2;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field8355[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field8355[2] : field8355[0]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lda;)V", line = 294)
    public static final void method4283(class216 arg0) {
        class287.field4066 = arg0;
    }

    @OriginalMember(owner = "client!mca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4284(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x24);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4285(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 101;
                    break;
                case 1:
                    var10005 = 19;
                    break;
                case 2:
                    var10005 = 62;
                    break;
                case 3:
                    var10005 = 72;
                    break;
                default:
                    var10005 = 36;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
