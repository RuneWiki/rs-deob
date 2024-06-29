import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class92 {

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "Lrs;")
    public class449 field1299 = new class449();

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "Z")
    public static boolean field1302 = false;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "Lrn;")
    public static class417 field1298;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "Lrs;")
    private class449 field1305;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Lrs;")
    public final class449 method763(int arg0) {
        field1297++;
        if (arg0 != 0) {
            this.method773(-96);
        }
        class449 var2 = this.field1305;
        if (this.field1299 == var2) {
            this.field1305 = null;
            return null;
        } else {
            this.field1305 = var2.field6385;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZLjava/lang/String;I)Z")
    public static final boolean method764(int arg0, boolean arg1, String arg2, int arg3) {
        field1301++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        if (arg3 != 1) {
            field1302 = true;
        }
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg0 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if ((var10 / arg0) != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)Z")
    public final boolean method765(int arg0) {
        if (arg0 >= -16) {
            this.field1305 = null;
        }
        field1306++;
        return this.field1299.field6385 == this.field1299;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lrs;I)V")
    public final void method766(class449 arg0, int arg1) {
        field1285++;
        if (arg0.field6388 != null) {
            arg0.method2714(arg1 ^ 0x4A);
        }
        arg0.field6385 = this.field1299;
        arg0.field6388 = this.field1299.field6388;
        arg0.field6388.field6385 = arg0;
        if (arg1 != -1) {
            this.method774((class449) null, (byte) 91);
        }
        arg0.field6385.field6388 = arg0;
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)Lrs;")
    public final class449 method767(int arg0) {
        field1286++;
        class449 var2 = this.field1305;
        if (this.field1299 == var2) {
            this.field1305 = null;
            return null;
        } else {
            this.field1305 = var2.field6388;
            return arg0 == 97 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)I")
    public final int method768(boolean arg0) {
        field1290++;
        if (arg0) {
            return -124;
        }
        int var2 = 0;
        for (class449 var3 = this.field1299.field6385; var3 != this.field1299; var3 = var3.field6385) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static final void method769(byte arg0) {
        class164.field2396 = class293.field4144.field2888 + class293.field4144.field2883 + 2;
        class75.field1083 = class402.field5516.field2888 + class402.field5516.field2883 + 2;
        field1291++;
        class390.field5397 = new String[500];
        for (int var1 = 0; var1 < class390.field5397.length; var1++) {
            class390.field5397[var1] = "";
        }
        int var2 = 76 % ((77 - arg0) / 39);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLfo;)V")
    public static final void method770(byte arg0, class418 arg1) {
        field1288++;
        arg1.field5794 = false;
        if (arg1.field5763 != -1) {
            class303 var2 = class386.field5289.method1856(43, arg1.field5763);
            if (var2 == null || var2.field4286 == null) {
                arg1.field5763 = -1;
                arg1.field5765 = false;
            } else {
                label301: {
                    arg1.field5797++;
                    if (arg1.field5752 < var2.field4286.length && var2.field4283[arg1.field5752] < arg1.field5797) {
                        arg1.field5797 = 1;
                        arg1.field5752++;
                        arg1.field5767++;
                        class178.method1275(arg1.field5752, class262.field3781 == arg1, false, arg1.field4531, arg1.field4537, var2, arg1.field4530);
                    }
                    if (arg1.field5752 >= var2.field4286.length) {
                        arg1.field5752 = 0;
                        arg1.field5797 = 0;
                        if (arg1.field5765) {
                            arg1.field5763 = arg1.method2506(-16338).method2367(true);
                            if (arg1.field5763 == -1) {
                                arg1.field5765 = false;
                                break label301;
                            }
                            var2 = class386.field5289.method1856(11, arg1.field5763);
                        }
                        class178.method1275(arg1.field5752, class262.field3781 == arg1, false, arg1.field4531, arg1.field4537, var2, arg1.field4530);
                    }
                    arg1.field5767 = arg1.field5752 + 1;
                    if (arg1.field5767 >= var2.field4286.length) {
                        arg1.field5767 = 0;
                    }
                }
            }
        }
        if (arg1.field5759 != -1 && arg1.field5730 <= class364.field5010) {
            class217 var3 = class371.field5108.method1664(arg1.field5759, 48);
            int var4 = var3.field3129;
            if (var4 == -1) {
                arg1.field5759 = -1;
            } else {
                label303: {
                    class303 var5 = class386.field5289.method1856(109, var4);
                    if (var3.field3128) {
                        if (var5.field4296 == 3) {
                            if (arg1.field5809 > 0 && arg1.field5750 <= class364.field5010 && class364.field5010 > arg1.field5787) {
                                arg1.field5759 = -1;
                                break label303;
                            }
                        } else if (var5.field4296 == 1 && arg1.field5809 > 0 && arg1.field5750 <= class364.field5010 && class364.field5010 > arg1.field5787) {
                            arg1.field5730 = class364.field5010 + 1;
                            break label303;
                        }
                    }
                    if (var5 == null || var5.field4286 == null) {
                        arg1.field5759 = -1;
                    } else {
                        if (arg1.field5741 < 0) {
                            arg1.field5741 = 0;
                            class178.method1275(0, class262.field3781 == arg1, false, arg1.field4531, arg1.field4537, var5, arg1.field4530);
                        }
                        arg1.field5737++;
                        if (var5.field4286.length > arg1.field5741 && arg1.field5737 > var5.field4283[arg1.field5741]) {
                            arg1.field5741++;
                            arg1.field5737 = 1;
                            class178.method1275(arg1.field5741, class262.field3781 == arg1, false, arg1.field4531, arg1.field4537, var5, arg1.field4530);
                        }
                        if (var5.field4286.length <= arg1.field5741) {
                            if (var3.field3128) {
                                arg1.field5741 -= var5.field4304;
                                arg1.field5746++;
                                if (var5.field4280 <= arg1.field5746) {
                                    arg1.field5759 = -1;
                                } else if (arg1.field5741 >= 0 && var5.field4286.length > arg1.field5741) {
                                    class178.method1275(arg1.field5741, class262.field3781 == arg1, false, arg1.field4531, arg1.field4537, var5, arg1.field4530);
                                } else {
                                    arg1.field5759 = -1;
                                }
                            } else {
                                arg1.field5759 = -1;
                            }
                        }
                        arg1.field5788 = arg1.field5741 + 1;
                        if (var5.field4286.length <= arg1.field5788) {
                            if (var3.field3128) {
                                arg1.field5788 -= var5.field4304;
                                if (arg1.field5746 + 1 >= var5.field4280) {
                                    arg1.field5788 = -1;
                                } else if (arg1.field5788 < 0 || arg1.field5788 >= var5.field4286.length) {
                                    arg1.field5788 = -1;
                                }
                            } else {
                                arg1.field5788 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field5742 != -1 && arg1.field5773 <= 1) {
            class303 var6 = class386.field5289.method1856(64, arg1.field5742);
            if (var6.field4296 == 3) {
                if (arg1.field5809 > 0 && arg1.field5750 <= class364.field5010 && class364.field5010 > arg1.field5787) {
                    arg1.field5742 = -1;
                }
            } else if (var6.field4296 == 1 && arg1.field5809 > 0 && arg1.field5750 <= class364.field5010 && class364.field5010 > arg1.field5787) {
                arg1.field5773 = 2;
            }
        }
        if (arg1.field5742 != -1 && arg1.field5773 == 0) {
            class303 var7 = class386.field5289.method1856(41, arg1.field5742);
            if (var7 == null || var7.field4286 == null) {
                arg1.field5742 = -1;
            } else {
                arg1.field5770++;
                if (arg1.field5789 < var7.field4286.length && arg1.field5770 > var7.field4283[arg1.field5789]) {
                    arg1.field5770 = 1;
                    arg1.field5789++;
                    class178.method1275(arg1.field5789, class262.field3781 == arg1, false, arg1.field4531, arg1.field4537, var7, arg1.field4530);
                }
                if (arg1.field5789 >= var7.field4286.length) {
                    arg1.field5789 -= var7.field4304;
                    arg1.field5800++;
                    if (arg1.field5800 >= var7.field4280) {
                        arg1.field5742 = -1;
                    } else if (arg1.field5789 >= 0 && var7.field4286.length > arg1.field5789) {
                        class178.method1275(arg1.field5789, class262.field3781 == arg1, false, arg1.field4531, arg1.field4537, var7, arg1.field4530);
                    } else {
                        arg1.field5742 = -1;
                    }
                }
                arg1.field5781 = arg1.field5789 + 1;
                if (arg1.field5781 >= var7.field4286.length) {
                    arg1.field5781 -= var7.field4304;
                    if (var7.field4280 <= arg1.field5800 + 1) {
                        arg1.field5781 = -1;
                    } else if (arg1.field5781 < 0 || arg1.field5781 >= var7.field4286.length) {
                        arg1.field5781 = -1;
                    }
                }
                arg1.field5794 = var7.field4297;
            }
        }
        if (arg1.field5773 > 0) {
            arg1.field5773--;
        }
        int var8 = 0;
        if (arg0 >= -84) {
            method764(-48, false, (String) null, -114);
        }
        while (arg1.field5734.length > var8) {
            class305 var9 = arg1.field5734[var8];
            if (var9 != null) {
                if (var9.field4330 > 0) {
                    var9.field4330--;
                } else {
                    class303 var10 = class386.field5289.method1856(116, var9.field4333);
                    if (var10 == null || var10.field4286 == null) {
                        arg1.field5734[var8] = null;
                    } else {
                        var9.field4335++;
                        if (var9.field4332 < var10.field4286.length && var10.field4283[var9.field4332] < var9.field4335) {
                            var9.field4335 = 1;
                            var9.field4332++;
                            class178.method1275(var9.field4332, class262.field3781 == arg1, false, arg1.field4531, arg1.field4537, var10, arg1.field4530);
                        }
                        if (var10.field4286.length <= var9.field4332) {
                            var9.field4332 -= var10.field4304;
                            var9.field4331++;
                            if (var9.field4331 >= var10.field4280) {
                                arg1.field5734[var8] = null;
                            } else if (var9.field4332 >= 0 && var9.field4332 < var10.field4286.length) {
                                class178.method1275(var9.field4332, class262.field3781 == arg1, false, arg1.field4531, arg1.field4537, var10, arg1.field4530);
                            } else {
                                arg1.field5734[var8] = null;
                            }
                        }
                        var9.field4334 = var9.field4332 + 1;
                        if (var9.field4334 >= var10.field4286.length) {
                            var9.field4334 -= var10.field4304;
                            if (var9.field4331 + 1 >= var10.field4280) {
                                var9.field4334 = -1;
                            } else if (var9.field4334 < 0 || var10.field4286.length <= var9.field4334) {
                                var9.field4334 = -1;
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIZ)I")
    public static final int method771(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field1287++;
            return arg0 == 4 || arg0 == 5 ? class387.field5304[arg1 & 0x3] : 256;
        } else {
            return 20;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V")
    public static void method772(byte arg0) {
        field1298 = null;
        if (arg0 > -22) {
            field1302 = false;
        }
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V")
    public final void method773(int arg0) {
        while (true) {
            class449 var2 = this.field1299.field6385;
            if (this.field1299 == var2) {
                if (arg0 != -1568) {
                    return;
                }
                field1304++;
                this.field1305 = null;
                return;
            }
            var2.method2714(-123);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lrs;B)V")
    public final void method774(class449 arg0, byte arg1) {
        field1295++;
        if (arg0.field6388 != null) {
            arg0.method2714(-58);
        }
        arg0.field6385 = this.field1299.field6385;
        arg0.field6388 = this.field1299;
        int var3 = -37 / ((arg1 - 76) / 42);
        arg0.field6388.field6385 = arg0;
        arg0.field6385.field6388 = arg0;
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)Lrs;")
    public final class449 method775(int arg0) {
        field1294++;
        class449 var2 = this.field1299.field6385;
        if (this.field1299 == var2) {
            this.field1305 = null;
            return null;
        }
        if (arg0 != 1) {
            this.method773(-63);
        }
        this.field1305 = var2.field6385;
        return var2;
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(B)Lrs;")
    public final class449 method776(byte arg0) {
        int var2 = 6 / ((arg0 + 3) / 35);
        field1289++;
        class449 var3 = this.field1299.field6385;
        if (this.field1299 == var3) {
            return null;
        } else {
            var3.method2714(67);
            return var3;
        }
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)Lrs;")
    public final class449 method777(int arg0) {
        field1293++;
        class449 var2 = this.field1299.field6388;
        if (arg0 <= 101) {
            this.method763(-55);
        }
        if (this.field1299 == var2) {
            this.field1305 = null;
            return null;
        } else {
            this.field1305 = var2.field6388;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILcf;)V")
    public final void method778(int arg0, class92 arg1) {
        if (arg0 == -1) {
            field1292++;
            this.method779(arg1, -18456, this.field1299.field6385);
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
    public class92() {
        this.field1299.field6388 = this.field1299;
        this.field1299.field6385 = this.field1299;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lcf;ILrs;)V")
    private final void method779(class92 arg0, int arg1, class449 arg2) {
        field1296++;
        class449 var4 = this.field1299.field6388;
        if (arg1 != -18456) {
            return;
        }
        this.field1299.field6388 = arg2.field6388;
        arg2.field6388.field6385 = this.field1299;
        if (this.field1299 != arg2) {
            arg2.field6388 = arg0.field1299.field6388;
            arg2.field6388.field6385 = arg2;
            var4.field6385 = arg0.field1299;
            arg0.field1299.field6388 = var4;
        }
    }
}
