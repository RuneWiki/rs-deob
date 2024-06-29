import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class347 {

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(JBIZI)Ljava/lang/String;", line = 10)
    public static final String method2116(long arg0, byte arg1, int arg2, boolean arg3, int arg4) {
        field5128++;
        char var6 = ',';
        char var7 = '.';
        int var8 = -35 / ((-arg1 - 43) / 32);
        if (arg2 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg2 == 2) {
            var7 = ' ';
        }
        boolean var9 = false;
        if (arg0 < 0L) {
            arg0 = -arg0;
            var9 = true;
        }
        StringBuffer var10 = new StringBuffer(26);
        if (arg4 > 0) {
            for (int var11 = 0; var11 < arg4; var11++) {
                int var12 = (int) arg0;
                arg0 /= 10L;
                var10.append((char) (var12 + 48 - (int) arg0 * 10));
            }
            var10.append(var6);
        }
        int var13 = 0;
        while (true) {
            int var14 = (int) arg0;
            arg0 /= 10L;
            var10.append((char) (var14 + 48 - ((int) arg0 * 10)));
            if (arg0 == 0L) {
                if (var9) {
                    var10.append('-');
                }
                return var10.reverse().toString();
            }
            if (arg3) {
                var13++;
                if ((var13 % 3) == 0) {
                    var10.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 89)
    public static final boolean method2117(int arg0, String arg1) {
        field5130++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < class7.field79; var2++) {
            if (arg1.equalsIgnoreCase(class51.field767[var2])) {
                return true;
            }
        }
        return arg1.equalsIgnoreCase(class286.field4329.field685);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([II[ILuj;[I)V", line = 116)
    public static final void method2118(int[] arg0, int arg1, int[] arg2, class249 arg3, int[] arg4) {
        if (arg1 != -25354) {
            field5132 = 116;
        }
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg2[var5];
            int var8 = arg0[var5];
            for (int var9 = 0; var7 != 0 && arg3.field2206.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field2206[var9] = null;
                    } else {
                        class87 var10 = class429.field6302.method106(-118, var6);
                        int var11 = var10.field1503;
                        class493 var12 = arg3.field2206[var9];
                        if (var12 != null) {
                            if (var12.field7507 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field2206[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field7510 = var8;
                                    var12.field7509 = 0;
                                    var12.field7512 = 0;
                                    var12.field7505 = 1;
                                    var12.field7508 = 0;
                                    class70.method516(var10, arg3.field3217, 0, false, arg3.field3218, arg3.field3222, (byte) -79);
                                } else if (var11 == 2) {
                                    var12.field7508 = 0;
                                }
                            } else if (var10.field1527 >= class429.field6302.method106(-81, var12.field7507).field1527) {
                                var12 = arg3.field2206[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class493 var13 = arg3.field2206[var9] = new class493();
                            var13.field7508 = 0;
                            var13.field7510 = var8;
                            var13.field7509 = 0;
                            var13.field7507 = var6;
                            var13.field7512 = 0;
                            var13.field7505 = 1;
                            class70.method516(var10, arg3.field3217, 0, false, arg3.field3218, arg3.field3222, (byte) -79);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        field5129++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILta;)V", line = 212)
    public static final void method2119(int arg0, class135 arg1) {
        if (arg0 != 10) {
            return;
        }
        if (arg1 instanceof class249) {
            class249 var2 = (class249) arg1;
            if (var2.field3819 != null) {
                class30.method159(var2, class286.field4329.field3217 != var2.field3217, (byte) 126);
            }
        } else if (arg1 instanceof class47) {
            class47 var3 = (class47) arg1;
            class28.method140(0, class286.field4329.field3217 != var3.field3217, var3);
        }
        field5131++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)I", line = 240)
    public static final int method2120(int arg0, int arg1) {
        return class31.field407 == null ? 0 : class31.field407[arg0][arg1] & 0xFF;
    }
}
