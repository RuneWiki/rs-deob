import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class233 extends class170 {

    @OriginalMember(owner = "client!se", name = "A", descriptor = "[I")
    private int[] field3742 = new int[this.field2590];

    @OriginalMember(owner = "client!se", name = "t", descriptor = "Z")
    public static boolean field3735 = false;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public static int field3733 = 1;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "Z")
    public static boolean field3752 = true;

    @OriginalMember(owner = "client!se", name = "H", descriptor = "Ljava/lang/String;")
    public static String field3749 = "shake:";

    @OriginalMember(owner = "client!se", name = "F", descriptor = "Z")
    public static boolean field3747 = false;

    @OriginalMember(owner = "client!se", name = "I", descriptor = "[I")
    public static int[] field3750 = new int[100];

    @OriginalMember(owner = "client!se", name = "z", descriptor = "I")
    public static int field3741 = 0;

    @OriginalMember(owner = "client!se", name = "L", descriptor = "I")
    public static int field3753 = 2;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    private int field3740;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "I")
    private int field3748;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "[B")
    private byte[] field3745;

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(IIIIIF)V", line = 3)
    public class233(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field2590; var7++) {
            this.field3742[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZII)V", line = 25)
    public final void method1149(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field3738++;
            this.field3748 += this.field3742[arg1] * arg2 >> 12;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIILum;)V", line = 41)
    public static final void method1590(int arg0, int arg1, int arg2, int arg3, class82 arg4) {
        field3744++;
        if (class79.field1173 == arg4 || class168.field2565 >= 400) {
            return;
        }
        String var5;
        if (arg4.field1237 == 0) {
            boolean var6 = true;
            if (class79.field1173.field1213 != -1 && arg4.field1213 != -1) {
                int var7 = class79.field1173.field1236 > arg4.field1236 ? class79.field1173.field1236 : arg4.field1236;
                int var8 = arg4.field1213 <= class79.field1173.field1213 ? arg4.field1213 : class79.field1173.field1213;
                int var9 = var7 * 10 / 100 + (var8 + 5);
                int var10 = class79.field1173.field1236 - arg4.field1236;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var9 < var10) {
                    var6 = false;
                }
            }
            String var11 = class2.field25 == 1 ? class27.field353 : class185.field2832;
            if (arg4.field1236 >= arg4.field1222) {
                var5 = arg4.method565(18548) + (var6 ? class234.method1595(class79.field1173.field1236, arg4.field1236, -22543) : "<col=ffffff>") + " (" + var11 + arg4.field1236 + ")";
            } else {
                var5 = arg4.method565(arg3 ^ 0x56C7FDB0) + (var6 ? class234.method1595(class79.field1173.field1236, arg4.field1236, -22543) : "<col=ffffff>") + " (" + var11 + arg4.field1236 + "+" + (arg4.field1222 - arg4.field1236) + ")";
            }
        } else {
            var5 = arg4.method565(18548) + " (" + class231.field3726 + arg4.field1237 + ")";
        }
        if (class81.field1199 == 1) {
            class85.method584((long) arg0, (short) 44, arg2, (byte) -117, class86.field1299 + " -> <col=ffffff>" + var5, arg1, class82.field1217, class165.field2545);
            class142.field2253++;
        } else if (!class120.field1841) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class245.field3851[var12] != null) {
                    client.field2048++;
                    boolean var13 = false;
                    short var14 = 0;
                    if (class2.field25 == 0 && class245.field3851[var12].equalsIgnoreCase(class293.field4511)) {
                        if (arg4.field1236 > class79.field1173.field1236) {
                            var14 = 2000;
                        }
                        if (class79.field1173.field1223 != 0 && arg4.field1223 != 0) {
                            if (class79.field1173.field1223 == arg4.field1223) {
                                var14 = 2000;
                            } else {
                                var14 = 0;
                            }
                        }
                    } else if (class278.field4292[var12]) {
                        var14 = 2000;
                    }
                    short var15 = class99.field1541[var12];
                    short var16 = (short) (var14 + var15);
                    class85.method584((long) arg0, var16, arg2, (byte) -113, "<col=ffffff>" + var5, arg1, class245.field3851[var12], class315.field4960[var12]);
                }
            }
        } else if ((class310.field4920 & 0x8) != 0) {
            class85.method584((long) arg0, (short) 9, arg2, (byte) -110, class302.field4663 + " -> <col=ffffff>" + var5, arg1, class227.field3638, class139.field2150);
            class89.field1351++;
        }
        if (arg3 != 1455928772) {
            field3741 = -11;
        }
        for (int var17 = 0; var17 < class168.field2565; var17++) {
            if (class194.field2925[var17] == 37) {
                class76.field1144[var17] = "<col=ffffff>" + var5;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(I)V", line = 167)
    public static void method1591(int arg0) {
        field3750 = null;
        if (arg0 > -126) {
            method1590(-87, -56, -113, 85, (class82) null);
        }
        field3749 = null;
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(I)V", line = 183)
    public final void method1154(int arg0) {
        field3734++;
        if (arg0 != 255) {
            this.field3748 = -18;
        }
        this.field3748 = Math.abs(this.field3748);
        if (this.field3748 >= 4096) {
            this.field3748 = 4095;
        }
        this.method166(this.field3740++, (byte) (this.field3748 >> 4));
        this.field3748 = 0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V", line = 200)
    public static final void method1592(boolean arg0) {
        if (!arg0) {
            return;
        }
        field3743++;
        if (class196.field2944 != null) {
            class196.field2944.method1199((byte) 43);
        }
        if (class228.field3654 != null) {
            class228.field3654.method1199((byte) -104);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljf;Lan;I)Lqa;", line = 221)
    public static final class217 method1593(class227 arg0, class319 arg1, int arg2) {
        long var3 = ((long) arg1.field4997 << 56) + ((long) arg1.field4996 << 32) + (long) ((arg1.field4994 + 1 << 16) - -arg1.field5006);
        field3739++;
        class217 var5 = (class217) arg0.method1558(var3, false);
        if (var5 == null) {
            var5 = new class217(arg1.field4994, (float) arg1.field5006, true, false, arg1.field4996);
            arg0.method1550(var5, var3, (byte) 64);
        }
        return arg2 < 13 ? (class217) null : var5;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)V", line = 250)
    public void method166(int arg0, byte arg1) {
        this.field3745[this.field3740++] = (byte) (class311.method2135(127, arg1 >> 1) + 127);
        field3736++;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V", line = 265)
    public final void method1152(int arg0) {
        if (arg0 != 4096) {
            field3749 = (String) null;
        }
        field3737++;
        this.field3740 = 0;
        this.field3748 = 0;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V", line = 282)
    public static final void method1594(byte arg0) {
        field3751++;
        if (class220.field3502 == 0) {
            return;
        }
        try {
            if (++class219.field3492 > 1500) {
                if (class308.field4851 != null) {
                    class308.field4851.method596(false);
                    class308.field4851 = null;
                }
                if (class47.field669 >= 1) {
                    class51.field728 = -5;
                    class220.field3502 = 0;
                    return;
                }
                class220.field3502 = 1;
                class219.field3492 = 0;
                class47.field669++;
                if (class7.field82 == class274.field4220) {
                    class7.field82 = class152.field2401;
                } else {
                    class7.field82 = class274.field4220;
                }
            }
            int var1 = -21 % ((arg0 + 26) / 43);
            if (class220.field3502 == 1) {
                class84.field1266 = class89.field1359.method1508(-41, class7.field82, class196.field2943);
                class220.field3502 = 2;
            }
            if (class220.field3502 == 2) {
                if (class84.field1266.field3931 == 2) {
                    throw new IOException();
                }
                if (class84.field1266.field3931 != 1) {
                    return;
                }
                class308.field4851 = new class88((Socket) class84.field1266.field3929, class89.field1359);
                class84.field1266 = null;
                class308.field4851.method598(0, class265.field4095.field4679, 1, class265.field4095.field4716);
                if (class228.field3654 != null) {
                    class228.field3654.method1192(false);
                }
                if (class196.field2944 != null) {
                    class196.field2944.method1192(false);
                }
                int var2 = class308.field4851.method602(-123);
                if (class228.field3654 != null) {
                    class228.field3654.method1192(false);
                }
                if (class196.field2944 != null) {
                    class196.field2944.method1192(false);
                }
                if (var2 != 101) {
                    class51.field728 = var2;
                    class220.field3502 = 0;
                    class308.field4851.method596(false);
                    class308.field4851 = null;
                    return;
                }
                class220.field3502 = 3;
            }
            if (class220.field3502 == 3) {
                if (class308.field4851.method607(35) < 2) {
                    return;
                }
                int var3 = class308.field4851.method602(-116) << 8 | class308.field4851.method602(109);
                class47.method328(-8451, var3);
                if (class19.field259 == -1) {
                    class51.field728 = 6;
                    class220.field3502 = 0;
                    class308.field4851.method596(false);
                    class308.field4851 = null;
                    return;
                }
                class220.field3502 = 0;
                class308.field4851.method596(false);
                class308.field4851 = null;
                class268.method1776(0);
                return;
            }
        } catch (IOException var5) {
            if (class308.field4851 != null) {
                class308.field4851.method596(false);
                class308.field4851 = null;
            }
            if (class47.field669 < 1) {
                class220.field3502 = 1;
                class219.field3492 = 0;
                if (class7.field82 == class274.field4220) {
                    class7.field82 = class152.field2401;
                } else {
                    class7.field82 = class274.field4220;
                }
                class47.field669++;
            } else {
                class220.field3502 = 0;
                class51.field728 = -4;
            }
        }
    }
}
