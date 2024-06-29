import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class305 {

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "Ln;")
    private class232 field4896 = null;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "Z")
    private boolean field4905;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "Lv;")
    private class270 field4910;

    @OriginalMember(owner = "client!nh", name = "U", descriptor = "Z")
    private boolean field4920;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field4880 = 0;

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "I")
    public static int field4912 = 0;

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "I")
    public static int field4917 = -1;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "Lae;")
    public static class16 field4889 = new class16();

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!nh", name = "S", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!nh", name = "T", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "[Ljava/lang/Object;")
    private Object[] field4877;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field4900;

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field4916;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)I")
    public static final int method2047(int arg0, byte arg1) {
        field4890++;
        if (arg1 > -103) {
            method2083(52, 2, -102, 73, -117);
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)I")
    public final int method2048(boolean arg0) {
        field4892++;
        if (!arg0) {
            this.field4910 = null;
        }
        return this.method2058(0) ? this.field4896.field3621.length : -1;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)Z")
    private final boolean method2049(int arg0, int arg1) {
        field4887++;
        if (!this.method2058(0)) {
            return false;
        }
        int var3 = 79 % ((72 - arg0) / 36);
        if (arg1 >= 0 && this.field4896.field3621.length > arg1 && this.field4896.field3621[arg1] != 0) {
            return true;
        } else if (class95.field1368) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)[B")
    public final byte[] method2050(int arg0, int arg1, int arg2) {
        field4885++;
        if (arg0 <= 70) {
            this.method2075(59, (String) null, (String) null);
        }
        return this.method2072(arg1, false, arg2, (int[]) null);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZZ)V")
    public final void method2051(int arg0, boolean arg1, boolean arg2) {
        field4882++;
        if (!this.method2058(0) || arg0 != -2) {
            return;
        }
        if (arg1) {
            this.field4896.field3618 = null;
            this.field4896.field3616 = null;
        }
        if (arg2) {
            this.field4896.field3628 = null;
            this.field4896.field3626 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I[II)Z")
    private final boolean method2052(int arg0, int[] arg1, int arg2) {
        field4897++;
        if (!this.method2049(arg0 - 79, arg2)) {
            return false;
        } else if (this.field4877[arg2] == null) {
            return false;
        } else {
            int var4 = this.field4896.field3617[arg2];
            int[] var5 = this.field4896.field3620[arg2];
            boolean var6 = true;
            if (this.field4916[arg2] == null) {
                this.field4916[arg2] = new Object[this.field4896.field3621[arg2]];
            }
            Object[] var7 = this.field4916[arg2];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
                }
                if (var7[var9] == null) {
                    var6 = false;
                    break;
                }
            }
            if (var6) {
                return true;
            }
            byte[] var10;
            if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
                var10 = class308.method2098(this.field4877[arg2], (byte) 49, false);
            } else {
                var10 = class308.method2098(this.field4877[arg2], (byte) 62, true);
                class215 var11 = new class215(var10);
                var11.method1394(var11.field3287.length, 1769282021, 5, arg1);
            }
            if (arg0 != -2) {
                this.method2053(64);
            }
            byte[] var12;
            try {
                var12 = class151.method955(var10, (byte) -80);
            } catch (RuntimeException var31) {
                throw class129.method824(var31, "T3 - " + (arg1 != null) + "," + arg2 + "," + var10.length + "," + class233.method1531(var10.length, false, var10) + "," + class233.method1531(var10.length - 2, false, var10) + "," + this.field4896.field3637[arg2] + "," + this.field4896.field3629);
            }
            if (this.field4920) {
                this.field4877[arg2] = null;
            }
            if (var4 <= 1) {
                int var14;
                if (var5 == null) {
                    var14 = 0;
                } else {
                    var14 = var5[0];
                }
                if (this.field4905) {
                    var7[var14] = var12;
                } else {
                    var7[var14] = class306.method2087(false, (byte) -47, var12);
                }
            } else {
                int var15 = var12.length;
                int var32 = var15 - 1;
                int var16 = var12[var32] & 0xFF;
                int var17 = var32 - var4 * var16 * 4;
                class215 var18 = new class215(var12);
                var18.field3280 = var17;
                int[] var19 = new int[var4];
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var4; var22++) {
                        var21 += var18.method1383((byte) -109);
                        var19[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var4][];
                for (int var24 = 0; var24 < var4; var24++) {
                    var23[var24] = new byte[var19[var24]];
                    var19[var24] = 0;
                }
                var18.field3280 = var17;
                int var25 = 0;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var4; var28++) {
                        var27 += var18.method1383((byte) -109);
                        class285.method1880(var12, var25, var23[var28], var19[var28], var27);
                        var19[var28] += var27;
                        var25 += var27;
                    }
                }
                for (int var29 = 0; var29 < var4; var29++) {
                    int var30;
                    if (var5 == null) {
                        var30 = var29;
                    } else {
                        var30 = var5[var29];
                    }
                    if (this.field4905) {
                        var7[var30] = var23[var29];
                    } else {
                        var7[var30] = class306.method2087(false, (byte) -50, var23[var29]);
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)I")
    public final int method2053(int arg0) {
        field4909++;
        if (arg0 != 26007) {
            return -39;
        } else if (this.method2058(0)) {
            return this.field4896.field3629;
        } else {
            throw new IllegalStateException("");
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(III)V")
    public static final void method2054(int arg0, int arg1, int arg2) {
        field4911++;
        class39 var3 = class149.method935(-116, arg1, arg0);
        var3.method261(0);
        var3.field598 = arg2;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method2055(int arg0, String arg1) {
        field4891++;
        if (arg0 < 29) {
            return false;
        } else if (this.method2058(0)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field4896.field3628.method1953(class308.method2092((byte) 122, var3), (byte) -97);
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZI)Z")
    public final boolean method2056(boolean arg0, int arg1) {
        field4884++;
        if (!this.method2058(0)) {
            return false;
        }
        if (!arg0) {
            this.method2071(-117, 106);
        }
        if (this.field4896.field3621.length == 1) {
            return this.method2061(0, arg1, false);
        } else if (!this.method2049(116, arg1)) {
            return false;
        } else if (this.field4896.field3621[arg1] == 1) {
            return this.method2061(arg1, 0, false);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method2057(int arg0, String arg1) {
        field4874++;
        if (this.method2058(arg0 + arg0)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field4896.field3628.method1953(class308.method2092((byte) 126, var3), (byte) 96);
            return this.method2060(var4, -31657);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)Z")
    private final boolean method2058(int arg0) {
        field4914++;
        if (this.field4896 == null) {
            this.field4896 = this.field4910.method536(113);
            if (this.field4896 == null) {
                return false;
            }
            this.field4877 = new Object[this.field4896.field3615];
            this.field4916 = new Object[this.field4896.field3615][];
        }
        if (arg0 != 0) {
            field4900 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)[B")
    public final byte[] method2059(int arg0, int arg1) {
        field4879++;
        if (!this.method2058(arg0)) {
            return null;
        } else if (this.field4896.field3621.length == 1) {
            return this.method2050(91, 0, arg1);
        } else if (!this.method2049(117, arg1)) {
            return null;
        } else if (this.field4896.field3621[arg1] == 1) {
            return this.method2050(81, arg1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(II)Z")
    public final boolean method2060(int arg0, int arg1) {
        field4907++;
        if (arg1 != -31657) {
            method2083(52, 28, -120, 105, -5);
        }
        if (!this.method2049(-114, arg0)) {
            return false;
        } else if (this.field4877[arg0] == null) {
            this.method2070(arg0, -2);
            return this.field4877[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIZ)Z")
    public final boolean method2061(int arg0, int arg1, boolean arg2) {
        field4908++;
        if (!this.method2073(arg1, arg0, (byte) 77)) {
            return false;
        } else if (this.field4916[arg0] != null && this.field4916[arg0][arg1] != null) {
            return true;
        } else if (this.field4877[arg0] == null) {
            this.method2070(arg0, -2);
            if (arg2) {
                this.field4896 = null;
            }
            return this.field4877[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V")
    public static void method2062(int arg0) {
        field4900 = null;
        field4889 = null;
        if (arg0 != 24415) {
            method2062(0);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIB)[B")
    public final byte[] method2063(int arg0, int arg1, byte arg2) {
        field4915++;
        if (!this.method2073(arg1, arg0, (byte) 77)) {
            return null;
        }
        if (this.field4916[arg0] == null || this.field4916[arg0][arg1] == null) {
            boolean var4 = this.method2052(-2, (int[]) null, arg0);
            if (!var4) {
                this.method2070(arg0, -2);
                boolean var5 = this.method2052(-2, (int[]) null, arg0);
                if (!var5) {
                    return null;
                }
            }
        }
        if (arg2 <= 62) {
            this.method2082(125, -2);
        }
        return class308.method2098(this.field4916[arg0][arg1], (byte) 64, false);
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)V")
    public final void method2064(int arg0) {
        field4876++;
        if (arg0 == 0 && this.field4916 != null) {
            for (int var2 = 0; var2 < this.field4916.length; var2++) {
                this.field4916[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lnh;I)V")
    public static final void method2065(class305 arg0, int arg1) {
        field4898++;
        class230.field3603 = arg0.method2081(-125, "p11_full");
        class224.field3493 = arg0.method2081(-126, "p12_full");
        class25.field391 = arg0.method2081(arg1 ^ 0x30B6, "b12_full");
        class314.field5029 = arg0.method2081(-126, "hitmarks");
        class126.field1774 = arg0.method2081(-125, "hitbar_default");
        class194.field2965 = arg0.method2081(-127, "headicons_pk");
        class258.field4177 = arg0.method2081(arg1 + 12365, "headicons_prayer");
        class121.field1725 = arg0.method2081(-127, "hint_headicons");
        class38.field576 = arg0.method2081(arg1 + 12366, "hint_mapmarkers");
        class230.field3604 = arg0.method2081(-128, "mapflag");
        class72.field1039 = arg0.method2081(arg1 + 12366, "cross");
        class278.field4413 = arg0.method2081(-124, "mapdots");
        class291.field4643 = arg0.method2081(-124, "scrollbar");
        class170.field2419 = arg0.method2081(-126, "name_icons");
        if (arg1 != -12491) {
            field4880 = 32;
        }
        class243.field3824 = arg0.method2081(-126, "floorshadows");
        class15.field264 = arg0.method2081(-124, "compass");
        class48.field696 = arg0.method2081(-128, "hint_mapedge");
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(ILjava/lang/String;)V")
    public final void method2066(int arg0, String arg1) {
        if (arg0 <= 109) {
            return;
        }
        field4894++;
        if (this.method2058(0)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field4896.field3628.method1953(class308.method2092((byte) 120, var3), (byte) -115);
            this.method2068(var4, -2);
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(IB)I")
    public final int method2067(int arg0, byte arg1) {
        field4899++;
        if (this.method2049(111, arg0)) {
            if (arg1 != 51) {
                this.method2060(-31, 92);
            }
            return this.field4896.field3621[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(II)V")
    private final void method2068(int arg0, int arg1) {
        this.field4910.method541(arg0, 128);
        if (arg1 != -2) {
            this.field4877 = null;
        }
        field4906++;
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(ILjava/lang/String;)I")
    public final int method2069(int arg0, String arg1) {
        if (arg0 != 25634) {
            return -14;
        }
        field4895++;
        if (this.method2058(0)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field4896.field3628.method1953(class308.method2092((byte) 119, var3), (byte) -121);
            return this.method2074(var4, 0);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(II)V")
    private final void method2070(int arg0, int arg1) {
        if (arg1 != -2) {
            method2078(-33);
        }
        if (this.field4920) {
            this.field4877[arg0] = this.field4910.method538(-20587, arg0);
        } else {
            this.field4877[arg0] = class306.method2087(false, (byte) -40, this.field4910.method538(-20587, arg0));
        }
        field4875++;
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(II)[I")
    public final int[] method2071(int arg0, int arg1) {
        if (arg0 != 4846) {
            method2047(-45, (byte) -121);
        }
        field4913++;
        if (!this.method2049(-66, arg1)) {
            return null;
        }
        int[] var3 = this.field4896.field3620[arg1];
        if (var3 == null) {
            var3 = new int[this.field4896.field3617[arg1]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZI[I)[B")
    public final byte[] method2072(int arg0, boolean arg1, int arg2, int[] arg3) {
        field4904++;
        if (!this.method2073(arg2, arg0, (byte) 77)) {
            return null;
        }
        if (this.field4916[arg0] == null || this.field4916[arg0][arg2] == null) {
            boolean var5 = this.method2052(-2, arg3, arg0);
            if (!var5) {
                this.method2070(arg0, -2);
                boolean var6 = this.method2052(-2, arg3, arg0);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class308.method2098(this.field4916[arg0][arg2], (byte) 104, arg1);
        if (this.field4905) {
            this.field4916[arg0][arg2] = null;
            if (this.field4896.field3621[arg0] == 1) {
                this.field4916[arg0] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(IIB)Z")
    private final boolean method2073(int arg0, int arg1, byte arg2) {
        field4901++;
        if (!this.method2058(0)) {
            return false;
        }
        if (arg2 != 77) {
            field4889 = null;
        }
        if (arg1 >= 0 && arg0 >= 0 && arg1 < this.field4896.field3621.length && this.field4896.field3621[arg1] > arg0) {
            return true;
        } else if (class95.field1368) {
            throw new IllegalArgumentException(arg1 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "(II)I")
    private final int method2074(int arg0, int arg1) {
        if (arg1 != 0) {
            field4912 = 15;
        }
        field4888++;
        if (this.method2049(113, arg0)) {
            return this.field4877[arg0] == null ? this.field4910.method530((byte) 113, arg0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
    public final boolean method2075(int arg0, String arg1, String arg2) {
        field4902++;
        if (!this.method2058(arg0 + arg0)) {
            return false;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field4896.field3628.method1953(class308.method2092((byte) 126, var4), (byte) 73);
        if (this.method2049(arg0 - 47, var6)) {
            int var7 = this.field4896.field3616[var6].method1953(class308.method2092((byte) 126, var5), (byte) 51);
            return this.method2061(var6, var7, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "(II)I")
    public final int method2076(int arg0, int arg1) {
        field4881++;
        if (arg0 != -1) {
            method2083(-87, 109, -42, 66, 37);
        }
        if (this.method2058(0)) {
            int var3 = this.field4896.field3628.method1953(arg1, (byte) 40);
            return this.method2049(-43, var3) ? var3 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;)[B")
    public final byte[] method2077(boolean arg0, String arg1, String arg2) {
        field4919++;
        if (!this.method2058(0)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field4896.field3628.method1953(class308.method2092((byte) 117, var4), (byte) -108);
        if (!this.method2049(126, var6)) {
            return null;
        }
        int var7 = this.field4896.field3616[var6].method1953(class308.method2092((byte) 122, var5), (byte) 79);
        if (arg0) {
            field4900 = null;
        }
        return this.method2050(120, var6, var7);
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)V")
    public static final void method2078(int arg0) {
        field4903++;
        class90.field1304.method948((byte) 58);
        if (arg0 != -1) {
            method2062(-83);
        }
        class297.field4729.method948((byte) 58);
        class290.field4625.method948((byte) 58);
        class160.field2237.method948((byte) 58);
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)I")
    public final int method2079(int arg0) {
        field4918++;
        if (!this.method2058(0)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4877.length; var4++) {
            if (this.field4896.field3617[var4] > 0) {
                var3 += this.method2074(var4, 0);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return arg0 * var3 / var2;
        }
    }

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "(I)Z")
    public final boolean method2080(int arg0) {
        field4893++;
        if (!this.method2058(0)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field4896.field3636.length; var3++) {
            int var4 = this.field4896.field3636[var3];
            if (this.field4877[var4] == null) {
                this.method2070(var4, -2);
                if (this.field4877[var4] == null) {
                    var2 = false;
                }
            }
        }
        if (arg0 < 24) {
            this.method2072(105, false, 23, (int[]) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(ILjava/lang/String;)I")
    public final int method2081(int arg0, String arg1) {
        field4883++;
        if (!this.method2058(0)) {
            return -1;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field4896.field3628.method1953(class308.method2092((byte) 120, var3), (byte) 80);
        if (arg0 > -123) {
            return -39;
        } else if (this.method2049(111, var4)) {
            return var4;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "(II)V")
    public final void method2082(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field4920 = true;
        }
        field4878++;
        if (this.method2049(118, arg1) && this.field4916 != null) {
            this.field4916[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIII)V")
    public static final void method2083(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class39 var5 = class149.method935(-94, arg3, 4);
        var5.method261(0);
        if (arg1 == 7508) {
            var5.field593 = arg2;
            field4886++;
            var5.field591 = arg0;
            var5.field598 = arg4;
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lv;ZZ)V")
    public class305(class270 arg0, boolean arg1, boolean arg2) {
        this.field4905 = arg2;
        this.field4910 = arg0;
        this.field4920 = arg1;
    }
}
