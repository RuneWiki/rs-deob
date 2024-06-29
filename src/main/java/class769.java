import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class769 extends class54 {

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11141 = new String[] { method5554(method5553("|KW<N")), method5554(method5553("|KW=N")), method5554(method5553("|KW;N")), method5554(method5553("|KW>N")), method5554(method5553("|KW?N")), method5554(method5553("|KW:N")), method5554(method5553("|KW0N")), method5554(method5553("tR\u0015\u0015")), method5554(method5553("7\nGY")), method5554(method5553("a\tWW\u001b")), method5554(method5553("XR\u0010\u0015\u0002 \u0007OLT")), method5554(method5553("|KW1N")), method5554(method5553("|KW8N")), method5554(method5553("|KW3N")) };

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "Ldea;")
    public static class259 field11134 = new class259();

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    public static int field11130;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    public static int field11131;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public static int field11132;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    public static int field11133;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
    public static int field11135;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    public static int field11136;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    public static int field11138;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public static int field11139;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public static int field11140;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "[[Lcn;")
    public static class541[][] field11137;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(Z)V")
    public static void method5547(boolean arg0) {
        try {
            field11134 = null;
            if (arg0) {
                field11134 = null;
            }
            field11137 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field11141[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(Z)I")
    public final int method111(boolean arg0) {
        try {
            if (arg0) {
                return -34;
            } else {
                ++field11131;
                return !super.field589.method662(82).method2134((byte) -106) ? 2 : 3;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11141[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)V")
    public static final void method5548(int arg0) {
        try {
            ++field11130;
            if (class717.field10385 == null) {
                class717.field10385 = class626.method4648(-86);
                class722.field10460 = class717.field10385[0];
                class520.field7619 = class430.method3299(79);
            }
            if (class768.field11101 == null) {
                class43.method291(-26770);
            }
            class626 var1 = class722.field10460;
            if (arg0 != 100) {
                method5548(-124);
            }
            int var2 = class622.method4632((byte) -125);
            if (class722.field10460 != var1) {
                if (class722.field10460 == class626.field9180) {
                    class768.field11101 = null;
                    class86.method728(3, (byte) -96);
                } else {
                    class466.field6795 = var1.field9155.method2616(false, class167.field2300);
                    class197.field2667 = var1.field9149;
                    if (class722.field10460.field9154) {
                        class466.field6795 = class466.field6795 + var1.field9149 + "%";
                    }
                    if (class722.field10460.field9153 || var1.field9153) {
                        class520.field7619 = class430.method3299(117);
                    }
                }
            } else {
                class466.field6795 = class722.field10460.field9150.method2616(false, class167.field2300);
                if (class722.field10460.field9153) {
                    class197.field2667 = (-class722.field10460.field9159 + class722.field10460.field9149) * var2 / 100 + class722.field10460.field9159;
                }
                if (class722.field10460.field9154) {
                    class466.field6795 = class466.field6795 + class197.field2667 + "%";
                }
            }
            if (class768.field11101 != null) {
                class768.field11101.method5230(class520.field7619, false, class722.field10460, class197.field2667, class466.field6795);
                if (class360.field5498 != null) {
                    for (int var3 = class153.field1894 + 1; ~var3 > ~class360.field5498.length; ++var3) {
                        if (~class360.field5498[var3].method3386(19607) <= -101 && var3 - 1 == class153.field1894 && ~class138.field1645 <= -2 && class768.field11101.method5225(arg0 + -162)) {
                            try {
                                class360.field5498[var3].method3385((byte) -17);
                            } catch (Exception var5) {
                                class360.field5498 = null;
                                return;
                            }
                            class768.field11101.method5219(class360.field5498[var3], -85);
                            ++class153.field1894;
                            if (class153.field1894 >= class360.field5498.length + -1 && ~class360.field5498.length < -2) {
                                class153.field1894 = !class415.field6114.method1236((byte) 56) ? -1 : 0;
                            }
                        }
                    }
                    return;
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field11141[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)V")
    public static final void method5549(int arg0) {
        try {
            class198.field3097.method497(class326.field5132, class391.field5887, class239.field3623);
            ++field11140;
            int var1 = 97 / ((83 - arg0) / 38);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11141[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V")
    public final void method115(boolean arg0) {
        try {
            ++field11135;
            if (~super.field593 > -2 || super.field593 > 3) {
                super.field593 = this.method111(false);
            }
            if (!arg0) {
                field11137 = null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11141[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lha;I)V")
    public static final void method5550(class66 arg0, int arg1) {
        try {
            ++field11139;
            int var2 = 0;
            int var3 = 0;
            if (class235.field3549) {
                var2 = class398.method3141(1);
                var3 = class779.method5635((byte) 32);
            }
            arg0.method489(var2, var3, class179.field2489 + var2, 350 - -var3);
            arg0.method556(var2, var3, class179.field2489, 350, 3351159 | class597.field8757 << 24, 1);
            class758.method5495((byte) 50, var3 + 350, var3, var2 - -class179.field2489, var2);
            int var4 = 350 / class667.field9702;
            if (class627.field9183 > 0) {
                int var5 = -class667.field9702 - 4 + 346;
                int var6 = var4 * var5 / (var4 - (-class627.field9183 - -1));
                int var7 = 4;
                if (~class627.field9183 < -2) {
                    var7 += (-class787.field11485 + class627.field9183 - 1) * (-var6 + var5) / (class627.field9183 + -1);
                }
                arg0.method556(class179.field2489 + -16 + var2, var3 + var7, 12, var6, 3351159 | class597.field8757 << 24, 2);
                for (int var8 = class787.field11485; ~var8 > ~(class787.field11485 + var4) && ~var8 > ~class627.field9183; ++var8) {
                    String[] var9 = class350.method2878(class725.field10472[var8], '\b', (byte) 124);
                    int var10 = (class179.field2489 + -8 + -16) / var9.length;
                    for (int var11 = 0; var11 < var9.length; ++var11) {
                        int var12 = var10 * var11 + 8;
                        arg0.method489(var2 - -var12, var3, var10 + var12 + var2 + -8, var3 + 350);
                        class309.field4911.method596(-16777216, 31, class269.method2231(var9[var11], true), -2 - (-class787.field11485 + var8) * class667.field9702 + (var3 - (client.field5015 + -350)) + -class64.field664.field8571, -1, var2 + var12);
                    }
                }
            }
            class562.field8349.method611(class179.field2489 + var2 + -25, field11141[10], -1, -16777216, var3 - -350 - 20, 16895);
            arg0.method489(var2, var3, class179.field2489 + var2, var3 - -350);
            arg0.method564(-1, (byte) 88, class179.field2489, var2, -client.field5015 + var3 + 350);
            if (arg1 < -37) {
                class269.field4100.method596(-16777216, 31, field11141[8] + class269.method2231(class194.field2609, true), var3 + 350 + -class475.field6895.field8571 + -1, -1, var2 + 10);
                if (class377.field5750) {
                    int var13 = -1;
                    if (~(class375.field5711 % 30) < -16) {
                        var13 = 16777215;
                    }
                    arg0.method476(12, -class475.field6895.field8571 + -11 + 350 + var3, class475.field6895.method4322(256, field11141[8] + class269.method2231(class194.field2609, true).substring(0, class373.field5696)) + 10 + var2, var13, (byte) 74);
                }
            }
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field11141[6] + (arg0 != null ? field11141[9] : field11141[7]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V")
    public final void method113(int arg0, int arg1) {
        try {
            if (arg0 != 0) {
                this.method109(-91, (byte) -78);
            }
            ++field11133;
            super.field593 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11141[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lhia;)V")
    public class769(class73 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(IB)I")
    public final int method109(int arg0, byte arg1) {
        try {
            if (arg1 > -106) {
                return 47;
            } else {
                ++field11136;
                return 1;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11141[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(Z)I")
    public final int method5551(boolean arg0) {
        try {
            ++field11138;
            return arg0 ? 57 : super.field593;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11141[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(ILhia;)V")
    public class769(int arg0, class73 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
    public static final void method5552(byte arg0) {
        try {
            ++field11132;
            if (arg0 >= -4) {
                method5548(-60);
            }
            class315.method2652(-1);
            class235.field3549 = false;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field11141[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5553(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 102);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5554(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 26;
                    break;
                case 1:
                    var10005 = 39;
                    break;
                case 2:
                    var10005 = 121;
                    break;
                case 3:
                    var10005 = 121;
                    break;
                default:
                    var10005 = 102;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
