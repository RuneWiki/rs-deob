import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class138 extends class656 implements class675 {

    @OriginalMember(owner = "client!sfa", name = "Q", descriptor = "B")
    private byte field1796;

    @OriginalMember(owner = "client!sfa", name = "M", descriptor = "S")
    private short field1780;

    @OriginalMember(owner = "client!sfa", name = "fb", descriptor = "Z")
    private boolean field1785;

    @OriginalMember(owner = "client!sfa", name = "Z", descriptor = "B")
    private byte field1786;

    @OriginalMember(owner = "client!sfa", name = "cb", descriptor = "Z")
    private boolean field1781;

    @OriginalMember(owner = "client!sfa", name = "N", descriptor = "Z")
    private boolean field1803;

    @OriginalMember(owner = "client!sfa", name = "ab", descriptor = "Lka;")
    private class761 field1792;

    @OriginalMember(owner = "client!sfa", name = "L", descriptor = "Lr;")
    private class412 field1804;

    @OriginalMember(owner = "client!sfa", name = "T", descriptor = "[Ljava/lang/String;")
    private static final String[] field1809 = new String[] { method1212(method1211("\u001d\nVr7")), method1212(method1211("\u0015B\u0019r\u0006N")), method1212(method1211("\bQ\u00140")), method1212(method1211("\u0015B\u0019r\u001eN")), method1212(method1211("\u0015B\u0019r\u0001N")), method1212(method1211("\u0015B\u0019r\fN")), method1212(method1211("\u0015B\u0019r\u001aN")), method1212(method1211("\u0015B\u0019r\u000bN")), method1212(method1211("\u0015B\u0019r\u0007N")), method1212(method1211("\u0015B\u0019rv\u000fJ\u0011(tN")), method1212(method1211("\u0015B\u0019r\u0003N")), method1212(method1211("\u0015B\u0019r\t'\f")), method1212(method1211("\u0015B\u0019r\u001bN")), method1212(method1211("\u0015B\u0019r\u000fN")), method1212(method1211("\u0015B\u0019r\b'\f")), method1212(method1211("\u0015B\u0019r\u001cN")), method1212(method1211("\u0015B\u0019r\tN")), method1212(method1211("\u0015B\u0019r\u0000N")), method1212(method1211("\u0015B\u0019r\u0018N")), method1212(method1211("\u0015B\u0019r\u000e'\f")), method1212(method1211("\u0015B\u0019r\u0005N")), method1212(method1211("\u0015B\u0019r\u0004N")) };

    @OriginalMember(owner = "client!sfa", name = "lb", descriptor = "I")
    public static int field1788 = 0;

    @OriginalMember(owner = "client!sfa", name = "Y", descriptor = "Lmv;")
    public static class125 field1798 = new class125(74, 8);

    @OriginalMember(owner = "client!sfa", name = "ob", descriptor = "I")
    public static int field1805 = 0;

    @OriginalMember(owner = "client!sfa", name = "U", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!sfa", name = "gb", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!sfa", name = "db", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!sfa", name = "ib", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!sfa", name = "X", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!sfa", name = "pb", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!sfa", name = "P", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!sfa", name = "R", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!sfa", name = "bb", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!sfa", name = "eb", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!sfa", name = "hb", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!sfa", name = "W", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!sfa", name = "kb", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!sfa", name = "mb", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!sfa", name = "O", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!sfa", name = "nb", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!sfa", name = "jb", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!sfa", name = "V", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!sfa", name = "S", descriptor = "Lsba;")
    private class311 field1800;

    @OriginalMember(owner = "client!sfa", name = "d", descriptor = "(Z)Z")
    public final boolean method579(boolean arg0) {
        try {
            if (arg0) {
                return true;
            } else {
                ++field1799;
                return this.field1792 != null ? this.field1792.method422() : false;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1809[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "(B)I")
    public final int method578(byte arg0) {
        try {
            if (arg0 != 114) {
                this.method1206((class18) null, 104, -5);
            }
            ++field1784;
            return this.field1792 == null ? 0 : this.field1792.method423();
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1809[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ILha;)V")
    public final void method581(int arg0, class18 arg1) {
        try {
            ++field1790;
            Object var3 = null;
            if (arg0 == -18864) {
                class412 var4;
                if (this.field1804 == null && this.field1803) {
                    class795 var5 = this.method1210(arg1, true, 262144, (byte) -14);
                    var4 = var5 == null ? null : var5.field11564;
                } else {
                    var4 = this.field1804;
                    this.field1804 = null;
                }
                if (var4 != null) {
                    class779.method5602(var4, super.field2971, super.field2969, super.field2984, (boolean[]) null);
                }
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field1809[13] + arg0 + ',' + (arg1 != null ? field1809[0] : field1809[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lha;I)V")
    public final void method586(class18 arg0, int arg1) {
        try {
            if (arg1 != 0) {
                field1798 = null;
            }
            ++field1795;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1809[3] + (arg0 != null ? field1809[0] : field1809[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ZLha;)V")
    public final void method589(boolean arg0, class18 arg1) {
        try {
            ++field1782;
            Object var3 = null;
            class412 var5;
            if (this.field1804 == null && this.field1803) {
                class795 var4 = this.method1210(arg1, true, 262144, (byte) -75);
                var5 = var4 != null ? var4.field11564 : null;
            } else {
                var5 = this.field1804;
                this.field1804 = null;
            }
            if (var5 != null) {
                class164.method1396(var5, super.field2971, super.field2969, super.field2984, (boolean[]) null);
            }
            if (arg0) {
                this.field1796 = 121;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field1809[21] + arg0 + ',' + (arg1 != null ? field1809[0] : field1809[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(Lha;Lfw;IIIIIZIIII)V")
    public class138(class18 arg0, class789 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        try {
            super.field2984 = arg6;
            this.field1796 = (byte) arg10;
            this.field1780 = (short) arg1.field11478;
            super.field2969 = arg4;
            this.field1785 = arg7;
            this.field1786 = (byte) arg11;
            this.field1781 = ~arg1.field11409 != -1 && !arg7;
            this.field1803 = arg0.method158() && arg1.field11415 && !this.field1785 && class451.field6612.field9113.method1072(3) != 0;
            class795 var13 = this.method1210(arg0, this.field1803, 2048, (byte) -87);
            if (var13 != null) {
                this.field1792 = var13.field11559;
                this.field1804 = var13.field11564;
            }
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field1809[9] + (arg0 != null ? field1809[0] : field1809[2]) + ',' + (arg1 != null ? field1809[0] : field1809[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method580(class18 arg0, int arg1, int arg2, int arg3) {
        try {
            ++field1797;
            class761 var5 = this.method1206(arg0, 131072, arg2 ^ 125);
            if (var5 != null) {
                class104 var6 = arg0.method136();
                var6.method739(super.field2969, super.field2975, super.field2984);
                return class149.field1902 ? var5.method440(arg3, arg1, var6, false, 0, class194.field2686) : var5.method382(arg3, arg1, var6, false, 0);
            } else {
                if (arg2 != -1) {
                    this.method578((byte) 47);
                }
                return false;
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field1809[7] + (arg0 != null ? field1809[0] : field1809[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!sfa", name = "e", descriptor = "(Z)Z")
    public final boolean method582(boolean arg0) {
        try {
            ++field1779;
            if (arg0) {
                return false;
            } else if (this.field1792 != null) {
                return !this.field1792.method396();
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1809[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "(I)I")
    public final int method585(int arg0) {
        try {
            if (arg0 != -20175) {
                return 100;
            } else {
                ++field1802;
                return this.field1786;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1809[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lha;B)Lsba;")
    public final class311 method587(class18 arg0, byte arg1) {
        try {
            ++field1801;
            if (arg1 <= 94) {
                return null;
            } else {
                if (this.field1800 == null) {
                    this.field1800 = class640.method4679(super.field2969, super.field2984, super.field2975, this.method1206(arg0, 0, -99), 10327);
                }
                return this.field1800;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1809[6] + (arg0 != null ? field1809[0] : field1809[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "(ZLha;)Lrs;")
    public final class297 method573(boolean arg0, class18 arg1) {
        try {
            ++field1806;
            if (this.field1792 == null) {
                return null;
            } else {
                if (arg0) {
                    this.field1780 = 28;
                }
                class104 var3 = arg1.method136();
                var3.method739(super.field9299 + super.field2969, super.field2975, super.field9298 + super.field2984);
                class297 var4 = class674.method4839(this.field1781, 1, 12853);
                if (class149.field1902) {
                    this.field1792.method427(var3, var4.field4153[0], class194.field2686, 0);
                } else {
                    this.field1792.method415(var3, var4.field4153[0], 0);
                }
                return var4;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field1809[16] + arg0 + ',' + (arg1 != null ? field1809[0] : field1809[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "(Z)V")
    public final void method576(boolean arg0) {
        try {
            if (!arg0) {
                this.method590(-32);
            }
            if (this.field1792 != null) {
                this.field1792.method403();
            }
            ++field1787;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1809[20] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lha;II)Lka;")
    private final class761 method1206(class18 arg0, int arg1, int arg2) {
        try {
            ++field1783;
            if (this.field1792 != null && arg0.method226(this.field1792.method395(), arg1) == 0) {
                return this.field1792;
            } else {
                if (arg2 >= -65) {
                    this.field1792 = null;
                }
                class795 var4 = this.method1210(arg0, false, arg1, (byte) -53);
                return var4 != null ? var4.field11559 : null;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field1809[18] + (arg0 != null ? field1809[0] : field1809[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Z)I")
    public final int method584(boolean arg0) {
        try {
            ++field1789;
            if (arg0) {
                this.method575(true);
            }
            return 65535 & this.field1780;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1809[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sfa", name = "e", descriptor = "(B)V")
    public static final void method1207(byte arg0) {
        try {
            class653.field9271 = new class230(8);
            ++field1791;
            class527.field7668 = 0;
            for (class464 var1 = (class464) class21.field262.method3617(false); var1 != null; var1 = (class464) class21.field262.method3612(3)) {
                var1.method3578();
            }
            if (arg0 > -71) {
                method1208(-90);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1809[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sfa", name = "h", descriptor = "(I)V")
    public static void method1208(int arg0) {
        try {
            if (arg0 <= -65) {
                field1798 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1809[17] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I)Z")
    public final boolean method590(int arg0) {
        try {
            if (arg0 <= 96) {
                return true;
            } else {
                ++field1807;
                return this.field1803;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1809[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "(I)I")
    public final int method572(int arg0) {
        try {
            ++field1794;
            return arg0 < 70 ? 9 : this.field1796;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1809[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(III)Lgb;")
    public static final class571 method1209(int arg0, int arg1, int arg2) {
        class621 var3 = class608.field8715[arg0][arg1][arg2];
        return var3 == null ? null : var3.field8845;
    }

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "(Z)I")
    public final int method575(boolean arg0) {
        try {
            ++field1808;
            if (arg0) {
                this.field1792 = null;
            }
            return this.field1792 == null ? 0 : this.field1792.method432();
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1809[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lha;ZIB)Lni;")
    private final class795 method1210(class18 arg0, boolean arg1, int arg2, byte arg3) {
        try {
            ++field1793;
            if (arg3 > -7) {
                this.method589(true, (class18) null);
            }
            class789 var5 = class101.field1359.method2832(124, this.field1780 & 65535);
            class751 var6;
            class751 var7;
            if (!this.field1785) {
                if (super.field2971 < 3) {
                    var6 = class213.field3124[super.field2971 - -1];
                } else {
                    var6 = null;
                }
                var7 = class213.field3124[super.field2971];
            } else {
                var6 = class213.field3124[0];
                var7 = class677.field9474[super.field2971];
            }
            return var5.method5692(this.field1796, arg0, arg1, var7, this.field1786, -27447, super.field2969, (class626) null, super.field2975, var6, super.field2984, arg2);
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field1809[1] + (arg0 != null ? field1809[0] : field1809[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!sfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1211(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 74);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1212(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 102;
                    break;
                case 1:
                    var10005 = 36;
                    break;
                case 2:
                    var10005 = 120;
                    break;
                case 3:
                    var10005 = 92;
                    break;
                default:
                    var10005 = 74;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
