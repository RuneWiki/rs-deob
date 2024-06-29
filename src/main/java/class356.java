import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class356 extends class459 {

    @OriginalMember(owner = "client!vu", name = "v", descriptor = "I")
    private int field5730;

    @OriginalMember(owner = "client!vu", name = "J", descriptor = "[Ljava/lang/String;")
    private static final String[] field5736 = new String[] { method2956(method2955("(f\u0003lN")), method2956(method2955("%=\u0003\u000b\u001b")), method2956(method2955("0fAI")), method2956(method2955("(f\u0003bN")), method2956(method2955("(f\u0003`N")), method2956(method2955("(f\u0003aN")), method2956(method2955("(f\u0003\u0019\u000f0zY\u001bN")), method2956(method2955("(f\u0003dN")), method2956(method2955("(f\u0003gN")), method2956(method2955("(f\u0003fN")), method2956(method2955("(f\u0003cN")), method2956(method2955("(f\u0003mN")) };

    @OriginalMember(owner = "client!vu", name = "B", descriptor = "Ljj;")
    public static class126 field5727 = new class126();

    @OriginalMember(owner = "client!vu", name = "E", descriptor = "I")
    public static int field5733 = -1;

    @OriginalMember(owner = "client!vu", name = "w", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!vu", name = "I", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!vu", name = "A", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!vu", name = "G", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!vu", name = "z", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!vu", name = "C", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!vu", name = "x", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!vu", name = "F", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!vu", name = "y", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!vu", name = "H", descriptor = "[Lle;")
    public class323[] field5735;

    @OriginalMember(owner = "client!vu", name = "D", descriptor = "[[B")
    private byte[][] field5728;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method2946(int arg0, int arg1, int arg2) {
        try {
            field5732++;
            if (arg0 != 52) {
                method2949(null, -45);
            }
            return (arg2 & 0x34) != 0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5736[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "(II)Z", line = 15)
    public final boolean method2947(int arg0, int arg1) {
        try {
            if (arg1 != -1) {
                this.field5735 = null;
            }
            field5729++;
            return this.field5735[arg0].field5234;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5736[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IBIIII)V", line = 30)
    public static final void method2948(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            field5726++;
            if (class623.field8996.field6358.method4796(true) != 0 && arg3 != 0 && class490.field7395 < 50 && arg5 != -1) {
                class771.field11308[class490.field7395++] = new class746((byte) 1, arg5, arg3, arg4, arg0, 0, arg2, null);
            }
            int var6 = -66 / ((arg1 - 62) / 55);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field5736[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lns;I)I", line = 49)
    public static final int method2949(class426 arg0, int arg1) {
        try {
            if (arg1 != 50) {
                method2946(13, -17, -61);
            }
            field5724++;
            class162 var2 = arg0.field6716;
            if (var2.field2620 != null) {
                var2 = var2.method1530(-128, class398.field6315);
                if (var2 == null) {
                    return -1;
                }
            }
            int var3 = var2.field2597;
            class707 var4 = arg0.method802(-69);
            if (arg0.field1121 == -1 || arg0.field1150) {
                var3 = var2.field2608;
            } else if (arg0.field1121 == var4.field10142 || arg0.field1121 == var4.field10133 || arg0.field1121 == var4.field10165 || arg0.field1121 == var4.field10153) {
                var3 = var2.field2577;
            } else if (arg0.field1121 == var4.field10177 || arg0.field1121 == var4.field10134 || arg0.field1121 == var4.field10181 || arg0.field1121 == var4.field10149) {
                var3 = var2.field2560;
            }
            return var3;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field5736[3] + (arg0 == null ? field5736[2] : field5736[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "(B)Z", line = 90)
    public final boolean method2950(byte arg0) {
        try {
            field5731++;
            if (this.field5735 != null) {
                return true;
            }
            if (this.field5728 == null) {
                class58 var2 = class449.field6960;
                synchronized (class449.field6960) {
                    if (!class449.field6960.method602(this.field5730, arg0 ^ 0xFFFFFF9A)) {
                        return false;
                    }
                    int[] var4 = class449.field6960.method601(this.field5730, -127);
                    this.field5728 = new byte[var4.length][];
                    for (int var5 = 0; var5 < var4.length; var5++) {
                        this.field5728[var5] = class449.field6960.method604((byte) -125, var4[var5], this.field5730);
                    }
                }
            }
            boolean var6 = true;
            for (int var7 = 0; var7 < this.field5728.length; var7++) {
                byte[] var8 = this.field5728[var7];
                class176 var9 = new class176(var8);
                var9.field2799 = 1;
                int var10 = var9.method1687((byte) -74);
                class58 var11 = class199.field3152;
                synchronized (class199.field3152) {
                    var6 &= class199.field3152.method595(-2, var10);
                }
            }
            if (!var6) {
                return false;
            }
            class398 var12 = new class398();
            class58 var13 = class449.field6960;
            int[] var15;
            synchronized (class449.field6960) {
                int var14 = class449.field6960.method580(125, this.field5730);
                this.field5735 = new class323[var14];
                var15 = class449.field6960.method601(this.field5730, -127);
                if (arg0 != -102) {
                    field5733 = 104;
                }
            }
            for (int var16 = 0; var16 < var15.length; var16++) {
                byte[] var17 = this.field5728[var16];
                class176 var18 = new class176(var17);
                var18.field2799 = 1;
                int var19 = var18.method1687((byte) -54);
                class498 var20 = null;
                for (class498 var21 = (class498) var12.method3228(11); var21 != null; var21 = (class498) var12.method3216(true)) {
                    if (var21.field7470 == var19) {
                        var20 = var21;
                        break;
                    }
                }
                if (var20 == null) {
                    class58 var22 = class199.field3152;
                    synchronized (class199.field3152) {
                        var20 = new class498(var19, class199.field3152.method587(var19, true));
                    }
                    var12.method3220(var20, 0);
                }
                this.field5735[var15[var16]] = new class323(var17, var20);
            }
            this.field5728 = null;
            return true;
        } catch (RuntimeException var30) {
            throw class590.method4333(var30, field5736[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IB)Z", line = 201)
    public final boolean method2951(int arg0, byte arg1) {
        try {
            field5723++;
            return arg1 == 93 ? this.field5735[arg0].field5240 : false;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5736[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V", line = 212)
    public static final void method2952(int arg0) {
        try {
            field5722++;
            class163.method1536(1024);
            class148.method1348((byte) -122, 22050, 2, class623.field8996.field6389.method5170(true) == 1);
            class254.field3874 = class768.method5535(class393.field6256, 0, 0, 22050, class442.field6902);
            class535.method3990(class409.method3285(-3064, null), true, (byte) 78);
            class477.field7261 = class768.method5535(class393.field6256, arg0, 1, 2048, class442.field6902);
            class477.field7261.method5702((byte) 126, class476.field7253);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5736[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(B)V", line = 225)
    public static void method2953(byte arg0) {
        try {
            if (arg0 > -77) {
                field5733 = -28;
            }
            field5727 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5736[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(II)Z", line = 235)
    public final boolean method2954(int arg0, int arg1) {
        try {
            field5734++;
            return arg1 == -19459 ? this.field5735[arg0].field5233 : true;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5736[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(I)V", line = 254)
    public class356(int arg0) {
        try {
            this.field5730 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5736[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2955(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x66);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2956(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 94;
                    break;
                case 1:
                    var10005 = 19;
                    break;
                case 2:
                    var10005 = 45;
                    break;
                case 3:
                    var10005 = 37;
                    break;
                default:
                    var10005 = 102;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
