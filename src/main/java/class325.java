import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class325 extends class122 implements class675 {

    @OriginalMember(owner = "client!gea", name = "ib", descriptor = "B")
    private byte field4432;

    @OriginalMember(owner = "client!gea", name = "N", descriptor = "Z")
    private boolean field4441;

    @OriginalMember(owner = "client!gea", name = "eb", descriptor = "Z")
    private boolean field4422;

    @OriginalMember(owner = "client!gea", name = "ab", descriptor = "Z")
    private boolean field4437;

    @OriginalMember(owner = "client!gea", name = "K", descriptor = "S")
    private short field4449;

    @OriginalMember(owner = "client!gea", name = "Q", descriptor = "Z")
    private boolean field4445;

    @OriginalMember(owner = "client!gea", name = "lb", descriptor = "Lka;")
    private class761 field4433;

    @OriginalMember(owner = "client!gea", name = "Y", descriptor = "Lr;")
    private class412 field4421;

    @OriginalMember(owner = "client!gea", name = "ob", descriptor = "[Ljava/lang/String;")
    private static final String[] field4451 = new String[] { method2573(method2572("\u001d\u00077ZtR")), method2573(method2572("\u0014\u0017:\u0018")), method2573(method2572("\u0001LxZY")), method2573(method2572("\u001d\u00077ZfR")), method2573(method2572("\u001d\u00077ZiR")), method2573(method2572("\u001d\u00077ZoR")), method2573(method2572("\u001d\u00077Z\u0018\u0013\f?\u0000\u001aR")), method2573(method2572("\u001d\u00077Z`;J")), method2573(method2572("\u001d\u00077ZaR")), method2573(method2572("\u001d\u00077Z`R")), method2573(method2572("\u001d\u00077ZuR")), method2573(method2572("\u001d\u00077ZkR")), method2573(method2572("\u001d\u00077ZhR")), method2573(method2572("\u001d\u00077ZgR")), method2573(method2572("\u001d\u00077ZlR")), method2573(method2572("\u001d\u00077ZjR")), method2573(method2572("\u001d\u00077ZeR")), method2573(method2572("\u001d\u00077ZcR")), method2573(method2572("\u001d\u00077Zg;J")), method2573(method2572("\u001d\u00077Zf;J")), method2573(method2572("\u001d\u00077ZpR")), method2573(method2572("\u001d\u00077ZbR")), method2573(method2572("\u001d\u00077ZmR")), method2573(method2572("\u001d\u00077ZrR")) };

    @OriginalMember(owner = "client!gea", name = "bb", descriptor = "Z")
    public static boolean field4448 = true;

    @OriginalMember(owner = "client!gea", name = "R", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!gea", name = "L", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!gea", name = "S", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!gea", name = "jb", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!gea", name = "W", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!gea", name = "V", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!gea", name = "T", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!gea", name = "X", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!gea", name = "J", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!gea", name = "cb", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!gea", name = "nb", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!gea", name = "mb", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!gea", name = "gb", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!gea", name = "Z", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!gea", name = "O", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!gea", name = "M", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!gea", name = "U", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!gea", name = "db", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!gea", name = "kb", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!gea", name = "hb", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!gea", name = "fb", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!gea", name = "P", descriptor = "Lsba;")
    private class311 field4424;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILha;)V", line = 4)
    public final void method581(int arg0, class18 arg1) {
        try {
            ++field4442;
            Object var3 = null;
            class412 var5;
            if (this.field4421 == null && this.field4445) {
                class795 var4 = this.method2568(262144, arg1, true, -22104);
                var5 = var4 != null ? var4.field11564 : null;
            } else {
                var5 = this.field4421;
                this.field4421 = null;
            }
            if (arg0 == -18864) {
                if (var5 != null) {
                    class779.method5602(var5, super.field2971, super.field2969, super.field2984, (boolean[]) null);
                }
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field4451[8] + arg0 + ',' + (arg1 != null ? field4451[2] : field4451[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)Z", line = 33)
    public final boolean method590(int arg0) {
        try {
            if (arg0 < 96) {
                field4448 = true;
            }
            ++field4420;
            return this.field4445;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4451[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IBILrfa;ZILha;)V", line = 47)
    public final void method40(int arg0, byte arg1, int arg2, class202 arg3, boolean arg4, int arg5, class18 arg6) {
        try {
            if (arg3 instanceof class325) {
                class325 var8 = (class325) arg3;
                if (this.field4433 != null && var8.field4433 != null) {
                    this.field4433.method391(var8.field4433, arg5, arg2, arg0, arg4);
                }
            }
            ++field4450;
            int var9 = -78 / ((9 - arg1) / 35);
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field4451[17] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4451[2] : field4451[1]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field4451[2] : field4451[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILha;ZI)Lni;", line = 71)
    private final class795 method2568(int arg0, class18 arg1, boolean arg2, int arg3) {
        try {
            if (arg3 != -22104) {
                field4448 = false;
            }
            ++field4443;
            class789 var5 = class101.field1359.method2832(125, 65535 & this.field4449);
            class751 var6;
            class751 var7;
            if (this.field4441) {
                var6 = class213.field3124[0];
                var7 = class677.field9474[super.field2971];
            } else {
                if (~super.field2971 <= -4) {
                    var6 = null;
                } else {
                    var6 = class213.field3124[super.field2971 - -1];
                }
                var7 = class213.field3124[super.field2971];
            }
            return var5.method5692(22, arg1, arg2, var7, this.field4432, -27447, super.field2969, (class626) null, super.field2975, var6, super.field2984, arg0);
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field4451[12] + arg0 + ',' + (arg1 != null ? field4451[2] : field4451[1]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!gea", name = "d", descriptor = "(B)V", line = 102)
    public final void method44(byte arg0) {
        try {
            ++field4429;
            this.field4422 = false;
            if (arg0 <= 111) {
                this.field4437 = true;
            }
            if (this.field4433 != null) {
                this.field4433.method411(-65537 & this.field4433.method395());
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4451[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Z)I", line = 121)
    public final int method584(boolean arg0) {
        try {
            ++field4423;
            return arg0 ? -105 : 65535 & this.field4449;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4451[22] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Ljava/awt/Canvas;ILlga;Ld;II)Lha;", line = 134)
    public static final class18 method2569(Canvas arg0, int arg1, class47 arg2, class673 arg3, int arg4, int arg5) {
        try {
            ++field4431;
            int var6 = 0;
            int var7 = arg5;
            if (arg0 != null) {
                Dimension var8 = arg0.getSize();
                var7 = var8.height;
                var6 = var8.width;
            }
            return class18.method144(arg3, arg2, arg4, var7, (byte) 123, var6, arg0, arg1);
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field4451[10] + (arg0 != null ? field4451[2] : field4451[1]) + ',' + arg1 + ',' + (arg2 != null ? field4451[2] : field4451[1]) + ',' + (arg3 != null ? field4451[2] : field4451[1]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(Lha;Lfw;IIIIIZIZ)V", line = 156)
    public class325(class18 arg0, class789 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field11450);
        try {
            this.field4432 = (byte) arg8;
            super.field2969 = arg4;
            this.field4441 = arg7;
            this.field4422 = arg9;
            super.field2984 = arg6;
            this.field4437 = ~arg1.field11409 != -1 && !arg7;
            this.field4449 = (short) arg1.field11478;
            this.field4445 = arg0.method158() && arg1.field11415 && !this.field4441 && class451.field6612.field9113.method1072(3) != 0;
            int var11 = 2048;
            if (this.field4422) {
                var11 |= 65536;
            }
            class795 var12 = this.method2568(var11, arg0, this.field4445, -22104);
            if (var12 != null) {
                this.field4433 = var12.field11559;
                this.field4421 = var12.field11564;
                if (this.field4422) {
                    this.field4433 = this.field4433.method418((byte) 0, var11, false);
                    return;
                }
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field4451[6] + (arg0 != null ? field4451[2] : field4451[1]) + ',' + (arg1 != null ? field4451[2] : field4451[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IILha;)Lka;", line = 190)
    private final class761 method2570(int arg0, int arg1, class18 arg2) {
        try {
            if (arg0 != 22) {
                this.field4432 = 126;
            }
            ++field4440;
            if (this.field4433 != null && ~arg2.method226(this.field4433.method395(), arg1) == -1) {
                return this.field4433;
            } else {
                class795 var4 = this.method2568(arg1, arg2, false, arg0 ^ -22082);
                return var4 == null ? null : var4.field11559;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4451[14] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4451[2] : field4451[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!gea", name = "d", descriptor = "(Z)Z", line = 211)
    public final boolean method579(boolean arg0) {
        try {
            ++field4435;
            if (arg0) {
                this.method585(-53);
            }
            return this.field4433 == null ? false : this.field4433.method422();
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4451[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "(Z)I", line = 226)
    public final int method575(boolean arg0) {
        try {
            ++field4430;
            if (arg0) {
                return 1;
            } else {
                return this.field4433 == null ? 0 : this.field4433.method432();
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4451[23] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lha;III)Z", line = 238)
    public final boolean method580(class18 arg0, int arg1, int arg2, int arg3) {
        try {
            ++field4447;
            class761 var5 = this.method2570(22, 131072, arg0);
            if (arg2 != -1) {
                this.field4422 = true;
            }
            if (var5 != null) {
                class104 var6 = arg0.method136();
                var6.method739(super.field2969, super.field2975, super.field2984);
                return class149.field1902 ? var5.method440(arg3, arg1, var6, false, 0, class194.field2686) : var5.method382(arg3, arg1, var6, false, 0);
            } else {
                return false;
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field4451[16] + (arg0 != null ? field4451[2] : field4451[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lrfa;)V", line = 262)
    public static final void method2571(class202 arg0) {
        class531.field7699.method223(arg0.field2969, arg0.field2975 + (arg0.method575(false) >> 1), arg0.field2984, class229.field3322);
        arg0.field2974 = class229.field3322[0];
        arg0.field2982 = class229.field3322[1];
        arg0.field2970 = class229.field3322[2];
    }

    @OriginalMember(owner = "client!gea", name = "e", descriptor = "(Z)Z", line = 269)
    public final boolean method582(boolean arg0) {
        try {
            ++field4427;
            if (arg0) {
                this.field4424 = null;
            }
            if (this.field4433 != null) {
                return !this.field4433.method396();
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4451[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(Z)V", line = 284)
    public final void method576(boolean arg0) {
        try {
            if (this.field4433 != null) {
                this.field4433.method403();
            }
            ++field4425;
            if (!arg0) {
                this.field4441 = false;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4451[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(ZLha;)V", line = 297)
    public final void method589(boolean arg0, class18 arg1) {
        try {
            ++field4436;
            Object var3 = null;
            if (arg0) {
                this.field4441 = true;
            }
            class412 var5;
            if (this.field4421 == null && this.field4445) {
                class795 var4 = this.method2568(262144, arg1, true, -22104);
                var5 = var4 == null ? null : var4.field11564;
            } else {
                var5 = this.field4421;
                this.field4421 = null;
            }
            if (var5 != null) {
                class164.method1396(var5, super.field2971, super.field2969, super.field2984, (boolean[]) null);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field4451[15] + arg0 + ',' + (arg1 != null ? field4451[2] : field4451[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(ZLha;)Lrs;", line = 326)
    public final class297 method573(boolean arg0, class18 arg1) {
        try {
            ++field4434;
            if (this.field4433 == null) {
                return null;
            } else {
                if (arg0) {
                    this.method578((byte) 36);
                }
                class104 var3 = arg1.method136();
                var3.method739(super.field2969, super.field2975, super.field2984);
                class297 var4 = class674.method4839(this.field4437, 1, 12853);
                if (!class149.field1902) {
                    this.field4433.method415(var3, var4.field4153[0], 0);
                } else {
                    this.field4433.method427(var3, var4.field4153[0], class194.field2686, 0);
                }
                return var4;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4451[13] + arg0 + ',' + (arg1 != null ? field4451[2] : field4451[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "(B)I", line = 353)
    public final int method578(byte arg0) {
        try {
            if (arg0 != 114) {
                this.method576(false);
            }
            ++field4438;
            return this.field4433 != null ? this.field4433.method423() : 0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4451[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)I", line = 367)
    public final int method585(int arg0) {
        try {
            if (arg0 != -20175) {
                this.method589(false, (class18) null);
            }
            ++field4426;
            return this.field4432;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4451[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "(I)I", line = 378)
    public final int method572(int arg0) {
        try {
            if (arg0 < 70) {
                return -88;
            } else {
                ++field4444;
                return 22;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4451[21] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gea", name = "g", descriptor = "(I)Z", line = 389)
    public final boolean method46(int arg0) {
        try {
            ++field4439;
            if (arg0 >= -97) {
                this.method573(true, (class18) null);
            }
            return this.field4422;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4451[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lha;I)V", line = 401)
    public final void method586(class18 arg0, int arg1) {
        try {
            if (arg1 != 0) {
                this.field4432 = 47;
            }
            ++field4428;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4451[20] + (arg0 != null ? field4451[2] : field4451[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lha;B)Lsba;", line = 412)
    public final class311 method587(class18 arg0, byte arg1) {
        try {
            if (this.field4424 == null) {
                this.field4424 = class640.method4679(super.field2969, super.field2984, super.field2975, this.method2570(22, 0, arg0), 10327);
            }
            ++field4446;
            return arg1 <= 94 ? null : this.field4424;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4451[0] + (arg0 != null ? field4451[2] : field4451[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2572(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 36);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2573(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 122;
                    break;
                case 1:
                    var10005 = 98;
                    break;
                case 2:
                    var10005 = 86;
                    break;
                case 3:
                    var10005 = 116;
                    break;
                default:
                    var10005 = 36;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
