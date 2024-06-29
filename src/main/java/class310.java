import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class310 {

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public int field4947 = -1;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "[I")
    private int[] field4957 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "Z")
    public boolean field4952 = false;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4954 = "yellow:";

    @OriginalMember(owner = "client!rl", name = "v", descriptor = "[[B")
    public static byte[][] field4965 = new byte[250][];

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!rl", name = "u", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!rl", name = "w", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "Ldk;")
    public static class251 field4962;

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "[I")
    private int[] field4960;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "[S")
    private short[] field4945;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "[S")
    private short[] field4949;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "[S")
    private short[] field4953;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "[S")
    private short[] field4958;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)Z")
    public final boolean method2068(byte arg0) {
        field4946++;
        int var2 = 33 / ((-arg0 - 23) / 49);
        if (this.field4960 == null) {
            return true;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field4960.length; var4++) {
            if (!class109.field1739.method1693(3943, this.field4960[var4], 0)) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)V")
    public static void method2069(byte arg0) {
        if (arg0 <= 103) {
            method2069((byte) -94);
        }
        field4962 = null;
        field4965 = null;
        field4954 = null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILdk;I)[Lsa;")
    public static final class260[] method2070(int arg0, class251 arg1, int arg2) {
        field4959++;
        if (class187.method1339(arg0, arg1, (byte) 60)) {
            if (arg2 != -24240) {
                field4954 = null;
            }
            return class6.method32(false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2071(int arg0, String arg1) {
        field4966++;
        if (arg1 == null) {
            return null;
        }
        int var2 = arg1.length();
        int var3;
        for (var3 = 0; var2 > var3 && class47.method334(95, arg1.charAt(var3)); var3++) {
        }
        if (arg0 != -28047) {
            return null;
        }
        while (var2 > var3 && class47.method334(95, arg1.charAt(var2 - 1))) {
            var2--;
        }
        int var4 = var2 - var3;
        if (var4 < 1 || var4 > 20) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var3; var6 < var2; var6++) {
            char var7 = arg1.charAt(var6);
            if (class299.method1978((byte) 119, var7)) {
                char var8 = class59.method406((byte) 105, var7);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(B)Z")
    public final boolean method2072(byte arg0) {
        field4961++;
        boolean var2 = true;
        int var3 = 0;
        if (arg0 < 118) {
            method2071(-123, (String) null);
        }
        while (var3 < 5) {
            if (this.field4957[var3] != -1 && !class109.field1739.method1693(3943, this.field4957[var3], 0)) {
                var2 = false;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)V")
    public static final void method2073(boolean arg0) {
        if (!arg0) {
            method2078(78, (class251) null, -56);
        }
        class84.field1390.method1255(-70);
        field4948++;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)Lom;")
    public final class166 method2074(int arg0) {
        field4955++;
        if (arg0 <= 45) {
            method2076(127, 86, -88, -23, 104, -17, (byte) 95, (class162) null, -103, false, 1, false);
        }
        if (this.field4960 == null) {
            return null;
        }
        class166[] var2 = new class166[this.field4960.length];
        for (int var3 = 0; var3 < this.field4960.length; var3++) {
            var2[var3] = class166.method1200(class109.field1739, this.field4960[var3], 0);
        }
        class166 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class166(var2, var2.length);
        }
        if (this.field4953 != null) {
            for (int var5 = 0; var5 < this.field4953.length; var5++) {
                var4.method1203(this.field4953[var5], this.field4949[var5]);
            }
        }
        if (this.field4945 != null) {
            for (int var6 = 0; var6 < this.field4945.length; var6++) {
                var4.method1197(this.field4945[var6], this.field4958[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BLwd;I)V")
    private final void method2075(byte arg0, class162 arg1, int arg2) {
        field4951++;
        if (arg2 == 1) {
            this.field4947 = arg1.method1133((byte) 53);
        } else if (arg2 == 2) {
            int var4 = arg1.method1133((byte) 53);
            this.field4960 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4960[var5] = arg1.method1142(-18970);
            }
        } else if (arg2 == 3) {
            this.field4952 = true;
        } else if (arg2 == 40) {
            int var6 = arg1.method1133((byte) 53);
            this.field4949 = new short[var6];
            this.field4953 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4953[var7] = (short) arg1.method1142(-18970);
                this.field4949[var7] = (short) arg1.method1142(-18970);
            }
        } else if (arg2 == 41) {
            int var8 = arg1.method1133((byte) 53);
            this.field4945 = new short[var8];
            this.field4958 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4945[var9] = (short) arg1.method1142(-18970);
                this.field4958[var9] = (short) arg1.method1142(-18970);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field4957[arg2 - 60] = arg1.method1142(-18970);
        }
        if (arg0 > -81) {
            this.field4952 = true;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIIBLwd;IZIZ)V")
    public static final void method2076(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, class162 arg7, int arg8, boolean arg9, int arg10, boolean arg11) {
        if (arg5 >= 0 && arg5 < 104 && arg0 >= 0 && arg0 < 104) {
            if (!arg9 && !arg11) {
                class301.field4818[arg10][arg5][arg0] = 0;
            }
            while (true) {
                int var12 = arg7.method1133((byte) 53);
                if (var12 == 0) {
                    if (arg9) {
                        class267.field4304[0][arg5 + arg8][arg0 + arg2] = class148.field2320[0][arg5 + arg8][arg0 + arg2];
                    } else if (arg10 == 0) {
                        class267.field4304[0][arg5 + arg8][arg0 + arg2] = -class118.method839(arg3 + 932731, -1114, arg4 + 556238) * 8;
                    } else {
                        class267.field4304[arg10][arg5 + arg8][arg0 + arg2] = class267.field4304[arg10 - 1][arg5 + arg8][arg0 + arg2] - 240;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg7.method1133((byte) 53);
                    if (arg9) {
                        class267.field4304[0][arg5 + arg8][arg0 + arg2] = class148.field2320[0][arg5 + arg8][arg0 + arg2] + (var13 * 8);
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg10 == 0) {
                            class267.field4304[0][arg5 + arg8][arg0 + arg2] = -var13 * 8;
                        } else {
                            class267.field4304[arg10][arg5 + arg8][arg0 + arg2] = class267.field4304[arg10 - 1][arg5 + arg8][arg0 + arg2] - (var13 * 8);
                        }
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg11) {
                        arg7.method1133((byte) 53);
                    } else {
                        class79.field1316[arg10][arg5][arg0] = arg7.method1107((byte) -98);
                        class308.field4929[arg10][arg5][arg0] = (byte) ((var12 - 2) / 4);
                        class301.field4814[arg10][arg5][arg0] = (byte) class51.method359(arg1 + var12 - 2, 3);
                    }
                } else if (var12 <= 81) {
                    if (!arg9 && !arg11) {
                        class301.field4818[arg10][arg5][arg0] = (byte) (var12 - 49);
                    }
                } else if (!arg11) {
                    class263.field4225[arg10][arg5][arg0] = (byte) (var12 - 81);
                }
            }
        } else {
            while (true) {
                int var14 = arg7.method1133((byte) 53);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg7.method1133((byte) 53);
                    break;
                }
                if (var14 <= 49) {
                    arg7.method1133((byte) 53);
                }
            }
        }
        if (arg6 != -98) {
            method2071(-50, (String) null);
        }
        field4950++;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)Lom;")
    public final class166 method2077(int arg0) {
        field4963++;
        class166[] var2 = new class166[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field4957[var4] != -1) {
                var2[var3++] = class166.method1200(class109.field1739, this.field4957[var4], 0);
            }
        }
        if (arg0 != 40) {
            return null;
        }
        class166 var5 = new class166(var2, var3);
        if (this.field4953 != null) {
            for (int var6 = 0; var6 < this.field4953.length; var6++) {
                var5.method1203(this.field4953[var6], this.field4949[var6]);
            }
        }
        if (this.field4945 != null) {
            for (int var7 = 0; var7 < this.field4945.length; var7++) {
                var5.method1197(this.field4945[var7], this.field4958[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(ILdk;I)Lbl;")
    public static final class146 method2078(int arg0, class251 arg1, int arg2) {
        field4956++;
        if (class187.method1339(arg2, arg1, (byte) 60)) {
            if (arg0 != -24352) {
                field4964 = 3;
            }
            return class51.method357(19983);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lwd;I)V")
    public final void method2079(class162 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1133((byte) 53);
            if (var3 == 0) {
                if (arg1 >= -38) {
                    return;
                }
                field4944++;
                return;
            }
            this.method2075((byte) -98, arg0, var3);
        }
    }
}
