import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class256 {

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "Lhl;")
    public class71 field4068 = new class71();

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "[I")
    public static int[] field4064 = new int[128];

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "Lkb;")
    public static class39 field4062;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "Lhl;")
    private class71 field4073;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "[Lfj;")
    public static class254[] field4061;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)Lhl;", line = 5)
    public final class71 method1801(int arg0) {
        class71 var2 = this.field4073;
        field4065++;
        if (this.field4068 == var2) {
            this.field4073 = null;
            return null;
        }
        this.field4073 = var2.field908;
        if (arg0 != -1) {
            method1803(-117, 79, -53, -88, 40);
        }
        return var2;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)Lhl;", line = 27)
    public final class71 method1802(int arg0) {
        field4060++;
        class71 var2 = this.field4068.field908;
        if (arg0 != 2838) {
            this.method1809((class71) null, (byte) 84);
        }
        if (this.field4068 == var2) {
            this.field4073 = null;
            return null;
        } else {
            this.field4073 = var2.field908;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIII)V", line = 51)
    public static final void method1803(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4059++;
        if (class334.field5182 < 100) {
            class131.method890(true);
        }
        if (class186.field2991) {
            class344.method2376(arg3, arg2, arg1 + arg3, arg2 - -arg0);
        } else {
            class216.method1571(arg3, arg2, arg1 + arg3, arg0 + arg2);
        }
        if (class334.field5182 < 100) {
            int var14 = arg1 / 2 + arg3;
            byte var15 = 20;
            int var16 = arg2 + (arg0 / 2) - var15 - 18;
            if (class186.field2991) {
                class344.method2375(arg3, arg2, arg1, arg0, 0);
                class344.method2371(var14 - 152, var16, 304, 34, 9179409);
                class344.method2371(var14 - 151, var16 + 1, 302, 32, 0);
                class344.method2375(var14 - 150, var16 + 2, class334.field5182 * 3, 30, 9179409);
                class344.method2375(var14 + (class334.field5182 * 3) - 150, var16 + 2, 300 - (class334.field5182 * 3), 30, 0);
            } else {
                class216.method1573(arg3, arg2, arg1, arg0, 0);
                class216.method1579(var14 - 152, var16, 304, 34, 9179409);
                class216.method1579(var14 - 151, var16 + 1, 302, 32, 0);
                class216.method1573(var14 - 150, var16 + 2, class334.field5182 * 3, 30, 9179409);
                class216.method1573(class334.field5182 * 3 + var14 - 150, var16 - -2, 300 - (class334.field5182 * 3), 30, 0);
            }
            class55.field732.method1001(class309.field4831, var14, var15 + var16, 16777215, -1);
            return;
        }
        class149.field2268 = (int) ((float) (arg0 * 2) / class42.field584);
        class291.field4587 = class242.field3841 - ((int) ((float) arg1 / class42.field584));
        class303.field4737 = class231.field3698 - ((int) ((float) arg0 / class42.field584));
        class325.field5069 = (int) ((float) (arg1 * 2) / class42.field584);
        int var5 = class242.field3841 - ((int) ((float) arg1 / class42.field584));
        int var6 = class231.field3698 - ((int) ((float) arg0 / class42.field584));
        int var7 = (int) ((float) arg0 / class42.field584) + class231.field3698;
        int var8 = (int) ((float) arg1 / class42.field584) + class242.field3841;
        if (class186.field2991) {
            if (class95.field1460 == null || class95.field1460.field5040 != arg1 || class95.field1460.field5030 != arg0) {
                class95.field1460 = null;
                class95.field1460 = new class298(arg1, arg0);
            }
            class216.method1572(class95.field1460.field4659, arg1, arg0);
            class157.method1089(var8, 0, -29904368, var7, arg1, arg0, var5, 0, var6);
            class24.method154(var7, 0, var8, var5, class255.field4057, arg0, var6, 0, arg1, (byte) 2);
            class224.method1640(arg0, var6, 0, var5, var7, 0, 5, arg1, var8);
            class95.field1460.method2075();
            class344.method2381(class95.field1460.field4659, arg3, arg2, arg1, arg0);
            class216.field3480 = null;
        } else {
            class157.method1089(var8, arg2, -29904368, var7, arg3 + arg1, arg0 + arg2, var5, arg3, var6);
            class24.method154(var7, arg3, var8, var5, class255.field4057, arg2 + arg0, var6, arg2, arg1 + arg3, (byte) 2);
            class224.method1640(arg2 + arg0, var6, arg2, var5, var7, arg3, 5, arg1 + arg3, var8);
        }
        if (arg4 < 20) {
            method1803(-65, -90, -121, 8, -5);
        }
        if (class198.field3246 > 0) {
            class232.field3713--;
            if (class232.field3713 == 0) {
                class198.field3246--;
                class232.field3713 = 20;
            }
        }
        if (!class305.field4762) {
            return;
        }
        int var9 = arg3 - (5 - arg1);
        int var10 = arg2 - (8 - arg0);
        class295.field4628.method1008("Fps:" + class44.field604, var9, var10, 16776960, -1);
        Runtime var11 = Runtime.getRuntime();
        int var12 = (int) ((var11.totalMemory() - var11.freeMemory()) / 1024L);
        int var13 = 16776960;
        if (var12 > 65536) {
            var13 = 16711680;
        }
        var10 -= 15;
        class295.field4628.method1008("Mem:" + var12 + "k", var9, var10, var13, -1);
        var10 -= 15;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V", line = 168)
    public static final void method1804(byte arg0) {
        field4067++;
        if (arg0 > -114) {
            method1803(92, 71, 83, -37, 86);
        }
        for (class323 var1 = (class323) class136.field2049.method1807((byte) 121); var1 != null; var1 = (class323) class136.field2049.method1808(18051)) {
            class282 var2 = var1.field5049;
            if (class148.field2209 != var2.field4434 || var2.field4435) {
                var1.method465((byte) -122);
            } else if (var2.field4439 <= class48.field648) {
                var2.method1997(-187338239, class274.field4353);
                if (var2.field4435) {
                    var1.method465((byte) -122);
                } else {
                    class290.method2033(var2.field4434, var2.field4451, var2.field4457, var2.field4440, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)Z", line = 203)
    public final boolean method1805(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            field4071++;
            return this.field4068.field921 == this.field4068;
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V", line = 223)
    public static final void method1806(int arg0) {
        field4075++;
        class164.field2664 = new class246(32);
        if (arg0 != -1170672536) {
            field4062 = (class39) null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)Lhl;", line = 236)
    public final class71 method1807(byte arg0) {
        if (arg0 <= 5) {
            return (class71) null;
        }
        class71 var2 = this.field4068.field921;
        field4074++;
        if (this.field4068 == var2) {
            this.field4073 = null;
            return null;
        } else {
            this.field4073 = var2.field921;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)Lhl;", line = 266)
    public final class71 method1808(int arg0) {
        field4076++;
        class71 var2 = this.field4073;
        if (arg0 != 18051) {
            this.method1801(30);
        }
        if (this.field4068 == var2) {
            this.field4073 = null;
            return null;
        } else {
            this.field4073 = var2.field921;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lhl;B)V", line = 287)
    public final void method1809(class71 arg0, byte arg1) {
        field4063++;
        if (arg0.field908 != null) {
            arg0.method465((byte) -122);
        }
        arg0.field908 = this.field4068;
        arg0.field921 = this.field4068.field921;
        arg0.field908.field921 = arg0;
        if (arg1 == -52) {
            arg0.field921.field908 = arg0;
        }
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)V", line = 305)
    public static void method1810(int arg0) {
        field4061 = null;
        if (arg0 > -85) {
            field4064 = (int[]) null;
        }
        field4064 = null;
        field4062 = null;
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(B)V", line = 320)
    public final void method1811(byte arg0) {
        while (true) {
            class71 var2 = this.field4068.field921;
            if (this.field4068 == var2) {
                if (arg0 != 25) {
                    method1804((byte) -57);
                }
                field4058++;
                this.field4073 = null;
                return;
            }
            var2.method465((byte) -122);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIII)I", line = 347)
    public static final int method1812(int arg0, int arg1, int arg2, int arg3) {
        field4066++;
        int var4 = class25.field368[class76.method554(arg3, arg2)];
        if (arg1 > 0) {
            int var5 = class25.field365.method377((byte) 102, arg1 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 <= 127) {
                    var6 = arg2 * 131586;
                } else {
                    var6 = 16777215;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var6 & 0xFF00FF) * var5 + ((var4 & 0xFF00FF) * var8) & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class25.field365.method375(arg1 & 0xFFFF, (byte) -100);
            if (var9 != 0) {
                var9 += 256;
                int var10 = (var4 >> 8 & 0xFF) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = (var4 & 0xFF) * var9;
                int var12 = (var4 >> 16 & 0xFF) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = ((var12 & 0xF600FF00) << 8) + (var11 >> 8) + (var10 & 0xFF00);
            }
        }
        return arg0 > -31 ? -119 : var4;
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V", line = 482)
    public class256() {
        this.field4068.field921 = this.field4068;
        this.field4068.field908 = this.field4068;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "([IJIZ)Ljava/lang/String;", line = 426)
    public static final String method1813(int[] arg0, long arg1, int arg2, boolean arg3) {
        field4069++;
        if (arg3) {
            return (String) null;
        }
        if (class27.field395 != null) {
            String var5 = class27.field395.method472(arg1, arg3, arg0, arg2);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg1);
    }

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "(I)Lhl;", line = 448)
    public final class71 method1814(int arg0) {
        field4070++;
        if (arg0 != -30321) {
            return (class71) null;
        }
        class71 var2 = this.field4068.field921;
        if (this.field4068 == var2) {
            return null;
        } else {
            var2.method465((byte) -122);
            return var2;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLhl;)V", line = 467)
    public final void method1815(byte arg0, class71 arg1) {
        if (arg1.field908 != null) {
            arg1.method465((byte) -122);
        }
        arg1.field921 = this.field4068;
        field4072++;
        arg1.field908 = this.field4068.field908;
        arg1.field908.field921 = arg1;
        arg1.field921.field908 = arg1;
        int var3 = 29 / ((arg0 + 82) / 40);
    }
}
