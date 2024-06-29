import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class252 extends class6 {

    @OriginalMember(owner = "client!om", name = "C", descriptor = "I")
    public int field3480 = 12800;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "I")
    public int field3484 = -1;

    @OriginalMember(owner = "client!om", name = "Q", descriptor = "I")
    public int field3493 = 0;

    @OriginalMember(owner = "client!om", name = "N", descriptor = "Z")
    public boolean field3491 = true;

    @OriginalMember(owner = "client!om", name = "O", descriptor = "I")
    public int field3492 = 0;

    @OriginalMember(owner = "client!om", name = "M", descriptor = "I")
    public int field3490 = -1;

    @OriginalMember(owner = "client!om", name = "R", descriptor = "I")
    public int field3494 = 12800;

    @OriginalMember(owner = "client!om", name = "A", descriptor = "Ljava/lang/String;")
    public String field3478;

    @OriginalMember(owner = "client!om", name = "J", descriptor = "I")
    public int field3487;

    @OriginalMember(owner = "client!om", name = "y", descriptor = "Ljava/lang/String;")
    public String field3476;

    @OriginalMember(owner = "client!om", name = "B", descriptor = "I")
    public int field3479;

    @OriginalMember(owner = "client!om", name = "F", descriptor = "Lar;")
    public class479 field3483;

    @OriginalMember(owner = "client!om", name = "K", descriptor = "Lkl;")
    public static class55 field3488 = new class55(6, 0, 4, 2);

    @OriginalMember(owner = "client!om", name = "V", descriptor = "F")
    public static float field3498 = 1024.0F;

    @OriginalMember(owner = "client!om", name = "w", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!om", name = "x", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!om", name = "z", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!om", name = "D", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!om", name = "E", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!om", name = "H", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!om", name = "I", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!om", name = "L", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!om", name = "S", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!om", name = "T", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!om", name = "U", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!om", name = "W", descriptor = "Lmg;")
    public static class101 field3499;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "(I)V")
    public final void method1505(int arg0) {
        this.field3494 = 12800;
        this.field3480 = 12800;
        field3489++;
        this.field3493 = arg0;
        this.field3492 = 0;
        for (class41 var2 = (class41) this.field3483.method2818((byte) 115); var2 != null; var2 = (class41) this.field3483.method2820((byte) -58)) {
            if (var2.field519 > this.field3492) {
                this.field3492 = var2.field519;
            }
            if (var2.field514 > this.field3493) {
                this.field3493 = var2.field514;
            }
            if (var2.field523 < this.field3494) {
                this.field3494 = var2.field523;
            }
            if (var2.field520 < this.field3480) {
                this.field3480 = var2.field520;
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "g", descriptor = "(I)V")
    public static void method1506(int arg0) {
        field3499 = null;
        field3488 = null;
        if (arg0 != 14282) {
            method1507(null, true);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method1507(String arg0, boolean arg1) {
        if (arg1) {
            field3485++;
            return arg0.length() + 1;
        } else {
            return -9;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I[IIII)Z")
    public final boolean method1508(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field3481++;
        if (arg4 != 10593) {
            this.method1505(-79);
        }
        for (class41 var6 = (class41) this.field3483.method2818((byte) -56); var6 != null; var6 = (class41) this.field3483.method2820((byte) -58)) {
            if (var6.method348(arg2, (byte) -127, arg3, arg0)) {
                var6.method345(arg2, arg0, arg1, (byte) -26);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(III)V")
    public static final void method1509(int arg0, int arg1, int arg2) {
        field3482++;
        class97 var3 = class348.method2064(arg1, 6, -123);
        int var4 = 51 % ((-arg2 - 2) / 44);
        var3.method712((byte) -113);
        var3.field1468 = arg0;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZIIIIIIF)[I")
    public static final int[] method1510(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float arg7) {
        field3477++;
        int[] var8 = new int[arg5];
        class318 var9 = new class318();
        var9.field4362 = arg3;
        var9.field4360 = (int) (arg7 * 4096.0F);
        var9.field4365 = arg1;
        var9.field4368 = arg0;
        var9.field4355 = arg6;
        var9.field4356 = arg2;
        var9.method42(true);
        class44.method412(1, (byte) -115, arg5);
        if (arg4 == 44) {
            var9.method1855(0, (byte) 88, var8);
            return var8;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1511(String arg0, byte arg1) {
        field3495++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class525.method3124(false, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class18.field235; var3++) {
            String var4 = class165.field2479[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class525.method3124(false, var4);
            if (var5 != null && var5.equals(var2)) {
                class18.field235--;
                for (int var6 = var3; var6 < class18.field235; var6++) {
                    class165.field2479[var6] = class165.field2479[var6 + 1];
                    class267.field3692[var6] = class267.field3692[var6 + 1];
                    class413.field6031[var6] = class413.field6031[var6 + 1];
                    class353.field5182[var6] = class353.field5182[var6 + 1];
                    class366.field5375[var6] = class366.field5375[var6 + 1];
                }
                class78.field1138 = class483.field7062;
                class359.field5229++;
                class491.method2878((byte) 92, class501.field7374);
                class481.field7027.method2302(-4, method1507(arg0, true));
                class481.field7027.method2349(arg0, true);
                break;
            }
        }
        int var7 = -101 / ((4 - arg1) / 34);
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(III)Z")
    public final boolean method1512(int arg0, int arg1, int arg2) {
        field3474++;
        if (arg0 != 1) {
            return true;
        }
        for (class41 var4 = (class41) this.field3483.method2818((byte) 108); var4 != null; var4 = (class41) this.field3483.method2820((byte) -58)) {
            if (var4.method344((byte) 0, arg1, arg2)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!om", name = "h", descriptor = "(I)V")
    public static final void method1513(int arg0) {
        field3497++;
        if (!class60.field752 || arg0 > -102) {
            return;
        }
        while (true) {
            while (class393.field5757.length > class445.field6562) {
                class61 var1 = class393.field5757[class445.field6562];
                if (var1 != null && var1.field755 == -1) {
                    if (class128.field1895 == null) {
                        class128.field1895 = class239.field3360.method1502(var1.field762, (byte) -92);
                    }
                    int var2 = class128.field1895.field4516;
                    if (var2 == -1) {
                        return;
                    }
                    class445.field6562++;
                    var1.field755 = var2;
                    class128.field1895 = null;
                } else {
                    class445.field6562++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IZJIB)Ljava/lang/String;")
    public static final String method1514(int arg0, boolean arg1, long arg2, int arg3, byte arg4) {
        field3486++;
        char var6 = ',';
        char var7 = '.';
        if (arg0 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg0 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg2 < 0L) {
            var8 = true;
            arg2 = -arg2;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg3 > 0) {
            for (int var10 = 0; var10 < arg3; var10++) {
                int var11 = (int) arg2;
                arg2 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg2 * 10)));
            }
            var9.append(var6);
        }
        if (arg4 != 62) {
            return null;
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg2;
            arg2 /= 10L;
            var9.append((char) (48 - (((int) arg2 * 10) - var13)));
            if (arg2 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg1) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I[IIZ)Z")
    public final boolean method1515(int arg0, int[] arg1, int arg2, boolean arg3) {
        field3496++;
        for (class41 var5 = (class41) this.field3483.method2818((byte) -21); var5 != null; var5 = (class41) this.field3483.method2820((byte) -58)) {
            if (var5.method344((byte) 0, arg0, arg2)) {
                var5.method345(arg0, arg2, arg1, (byte) -7);
                return true;
            }
        }
        if (!arg3) {
            this.method1505(-90);
        }
        return false;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B[III)Z")
    public final boolean method1516(byte arg0, int[] arg1, int arg2, int arg3) {
        field3475++;
        class41 var5 = (class41) this.field3483.method2818((byte) 111);
        if (arg0 > -53) {
            this.field3484 = -10;
        }
        while (var5 != null) {
            if (var5.method350((byte) 116, arg2, arg3)) {
                var5.method347(arg3, (byte) -107, arg2, arg1);
                return true;
            }
            var5 = (class41) this.field3483.method2820((byte) -58);
        }
        return false;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class252(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field3491 = arg5;
        this.field3484 = arg6;
        this.field3478 = arg1;
        this.field3490 = arg4;
        this.field3487 = arg0;
        this.field3476 = arg2;
        this.field3479 = arg3;
        if (this.field3484 == 255) {
            this.field3484 = 0;
        }
        this.field3483 = new class479();
    }
}
