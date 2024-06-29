import java.awt.Canvas;
import java.awt.Dimension;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class437 {

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public int field6433 = 99;

    @OriginalMember(owner = "client!kn", name = "r", descriptor = "I")
    public int field6439 = 2;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "Z")
    public boolean field6427 = false;

    @OriginalMember(owner = "client!kn", name = "x", descriptor = "I")
    public int field6424 = -1;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public int field6436 = -1;

    @OriginalMember(owner = "client!kn", name = "q", descriptor = "Z")
    public boolean field6432 = false;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
    public int field6442 = 5;

    @OriginalMember(owner = "client!kn", name = "t", descriptor = "I")
    public int field6441 = -1;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "Z")
    public boolean field6426 = false;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public int field6445 = -1;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
    public int field6449 = -1;

    @OriginalMember(owner = "client!kn", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field6451 = new String[] { method3414(method3413("v\u0012\f-")), method3414(method3413("s\tN\u0006T")), method3414(method3413("cINo\u0001")), method3414(method3413("s\tN\u0002T")), method3414(method3413("s\tN\u0004T")), method3414(method3413("s\tN\u0000T")), method3414(method3413("s\tN\u0003T")), method3414(method3413("s\tN\u0007T")), method3414(method3413("s\tN\u0005T")), method3414(method3413("s\tN\tT")) };

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "Lhj;")
    public static class671 field6448 = new class671(8, 0, 4, 1);

    @OriginalMember(owner = "client!kn", name = "v", descriptor = "I")
    public static int field6423;

    @OriginalMember(owner = "client!kn", name = "A", descriptor = "I")
    public static int field6425;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public int field6430;

    @OriginalMember(owner = "client!kn", name = "s", descriptor = "I")
    public static int field6437;

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!kn", name = "B", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!kn", name = "w", descriptor = "I")
    public static int field6446;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public static int field6447;

    @OriginalMember(owner = "client!kn", name = "u", descriptor = "[I")
    public int[] field6428;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "[I")
    public int[] field6429;

    @OriginalMember(owner = "client!kn", name = "z", descriptor = "[I")
    public int[] field6434;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "[I")
    public int[] field6443;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "[I")
    private int[] field6444;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "[I")
    public int[] field6450;

    @OriginalMember(owner = "client!kn", name = "y", descriptor = "[Z")
    public boolean[] field6431;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "[[I")
    public int[][] field6435;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V", line = 10)
    public static void method3405(int arg0) {
        try {
            if (arg0 == -26883) {
                field6448 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6451[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(BILjc;)V", line = 21)
    private final void method3406(byte arg0, int arg1, class711 arg2) {
        try {
            field6437++;
            if (arg1 == 1) {
                int var4 = arg2.method5116((byte) -112);
                this.field6450 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field6450[var5] = arg2.method5116((byte) -109);
                }
                this.field6434 = new int[var4];
                for (int var6 = 0; var6 < var4; var6++) {
                    this.field6434[var6] = arg2.method5116((byte) -106);
                }
                for (int var7 = 0; var7 < var4; var7++) {
                    this.field6434[var7] = (arg2.method5116((byte) -123) << 16) + this.field6434[var7];
                }
            } else if (arg1 == 2) {
                this.field6424 = arg2.method5116((byte) -125);
            } else if (arg1 == 3) {
                this.field6431 = new boolean[256];
                int var8 = arg2.method5128(0);
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field6431[arg2.method5128(0)] = true;
                }
            } else if (arg1 == 5) {
                this.field6442 = arg2.method5128(0);
            } else if (arg1 == 6) {
                this.field6436 = arg2.method5116((byte) -117);
            } else if (arg1 == 7) {
                this.field6441 = arg2.method5116((byte) -110);
            } else if (arg1 == 8) {
                this.field6433 = arg2.method5128(arg0 ^ 0x2F);
            } else if (arg1 == 9) {
                this.field6449 = arg2.method5128(0);
            } else if (arg1 == 10) {
                this.field6445 = arg2.method5128(arg0 - 47);
            } else if (arg1 == 11) {
                this.field6439 = arg2.method5128(0);
            } else if (arg1 == 12) {
                int var17 = arg2.method5128(0);
                this.field6444 = new int[var17];
                for (int var18 = 0; var18 < var17; var18++) {
                    this.field6444[var18] = arg2.method5116((byte) -111);
                }
                for (int var19 = 0; var19 < var17; var19++) {
                    this.field6444[var19] = (arg2.method5116((byte) -114) << 16) + this.field6444[var19];
                }
            } else if (arg1 == 13) {
                int var10 = arg2.method5116((byte) -106);
                this.field6435 = new int[var10][];
                for (int var11 = 0; var11 < var10; var11++) {
                    int var12 = arg2.method5128(0);
                    if (var12 > 0) {
                        this.field6435[var11] = new int[var12];
                        this.field6435[var11][0] = arg2.method5085(true);
                        for (int var13 = 1; var13 < var12; var13++) {
                            this.field6435[var11][var13] = arg2.method5116((byte) -119);
                        }
                    }
                }
            } else if (arg1 == 14) {
                this.field6426 = true;
            } else if (arg1 == 15) {
                this.field6432 = true;
            } else if (arg1 != 16) {
                if (arg1 == 18) {
                    this.field6427 = true;
                } else if (arg1 == 19) {
                    if (this.field6443 == null) {
                        this.field6443 = new int[this.field6435.length];
                        for (int var14 = 0; var14 < this.field6435.length; var14++) {
                            this.field6443[var14] = 255;
                        }
                    }
                    this.field6443[arg2.method5128(class52.method560(arg0, 47))] = arg2.method5128(0);
                } else if (arg1 == 20) {
                    if (this.field6429 == null || this.field6428 == null) {
                        this.field6429 = new int[this.field6435.length];
                        this.field6428 = new int[this.field6435.length];
                        for (int var15 = 0; var15 < this.field6435.length; var15++) {
                            this.field6429[var15] = 256;
                            this.field6428[var15] = 256;
                        }
                    }
                    int var16 = arg2.method5128(0);
                    this.field6429[var16] = arg2.method5116((byte) -127);
                    this.field6428[var16] = arg2.method5116((byte) -126);
                }
            }
            if (arg0 != 47) {
                this.field6442 = -59;
            }
        } catch (RuntimeException var21) {
            throw class665.method4799(var21, field6451[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field6451[0] : field6451[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V", line = 226)
    public final void method3407(int arg0) {
        try {
            if (~this.field6449 == arg0) {
                if (this.field6431 == null) {
                    this.field6449 = 0;
                } else {
                    this.field6449 = 2;
                }
            }
            field6425++;
            if (this.field6445 == -1) {
                if (this.field6431 == null) {
                    this.field6445 = 0;
                } else {
                    this.field6445 = 2;
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6451[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V", line = 266)
    public static final void method3408(Canvas arg0, boolean arg1) {
        try {
            field6438++;
            Dimension var2 = arg0.getSize();
            class260.method2162(var2.width, 12, var2.height);
            if (!arg1) {
                if (class101.field1360 == 1) {
                    class349.field5060.method168(arg0, class576.field8332, class5.field63);
                } else {
                    class349.field5060.method168(arg0, class608.field8720, class63.field971);
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6451[1] + (arg0 == null ? field6451[0] : field6451[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILjava/lang/String;)I", line = 289)
    public static final int method3409(int arg0, String arg1) {
        try {
            field6423++;
            if (!class306.field4249.field2479) {
                return -1;
            } else if (class231.field3344.containsKey(arg1)) {
                return 100;
            } else {
                String var2 = class408.method3210(30000, arg1);
                if (var2 == null) {
                    return -1;
                }
                String var3 = class740.field10523 + var2;
                if (!class97.field1320.method523("", 0, var3)) {
                    return -1;
                } else if (class97.field1320.method503(arg0 - 5, var3)) {
                    if (arg0 != 8) {
                        field6448 = null;
                    }
                    byte[] var4 = class97.field1320.method529(var3, 1, "");
                    Object var5 = null;
                    File var6;
                    try {
                        var6 = class633.method4627(var2, (byte) 116);
                    } catch (RuntimeException var11) {
                        return -1;
                    }
                    if (var4 == null || var6 == null) {
                        return -1;
                    }
                    boolean var7 = true;
                    byte[] var8 = class422.method3283(arg0 ^ 0x4771, var6);
                    if (var8 != null && var4.length == var8.length) {
                        for (int var9 = 0; var9 < var8.length; var9++) {
                            if (var4[var9] != var8[var9]) {
                                var7 = false;
                                break;
                            }
                        }
                    } else {
                        var7 = false;
                    }
                    try {
                        if (!var7) {
                            class306.field4249.method1567(314572800, var4, var6);
                        }
                    } catch (Throwable var12) {
                        return -1;
                    }
                    class623.method4577(var6, arg1, -5);
                    return 100;
                } else {
                    return class97.field1320.method519(var3, 0);
                }
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field6451[5] + arg0 + ',' + (arg1 == null ? field6451[0] : field6451[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(BLjc;)V", line = 403)
    public final void method3410(byte arg0, class711 arg1) {
        try {
            while (true) {
                int var3 = arg1.method5128(0);
                if (var3 == 0) {
                    if (arg0 <= 50) {
                        this.field6432 = true;
                    }
                    field6440++;
                    return;
                }
                this.method3406((byte) 47, var3, arg1);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6451[7] + arg0 + ',' + (arg1 == null ? field6451[0] : field6451[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)V", line = 424)
    public static final void method3411(int arg0, int arg1) {
        try {
            field6447++;
            class294 var2 = class146.method1261((long) arg0, -89, 2);
            var2.method2376(-103);
            if (arg1 != 12) {
                field6448 = null;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6451[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)V", line = 439)
    public static final void method3412(int arg0, int arg1, int arg2) {
        try {
            if (arg2 == 9476) {
                field6446++;
                class294 var3 = class146.method1261(0L, 106, 15);
                var3.method2378(arg2 - 9535);
                var3.field4136 = arg1;
                var3.field4133 = arg0;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6451[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3413(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3414(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 24;
                    break;
                case 1:
                    var10005 = 103;
                    break;
                case 2:
                    var10005 = 96;
                    break;
                case 3:
                    var10005 = 65;
                    break;
                default:
                    var10005 = 124;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
