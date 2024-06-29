import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class9 {

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public int field179 = -1;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "Z")
    public boolean field187 = false;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "[I")
    private int[] field176 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "[Lmb;")
    public static class159[] field175 = new class159[0];

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "Lcc;")
    public static class209 field177 = class95.method669(124, "(U5");

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "[I")
    public static int[] field178 = new int[5];

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "Z")
    public static boolean field185 = true;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "Lcc;")
    public static class209 field172 = class95.method669(111, "null");

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "Lcc;")
    public static class209 field173 = class95.method669(111, " )4 ");

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "Lcc;")
    public static class209 field181 = class95.method669(97, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "Lcc;")
    public static class209 field190 = class95.method669(81, "");

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "Lta;")
    public static class255 field183 = new class255(512);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "[I")
    private int[] field189;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "[S")
    private short[] field171;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "[S")
    private short[] field174;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "[S")
    private short[] field184;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "[S")
    private short[] field186;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBIIII)V")
    public static final void method80(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 >= class262.field4723 && class230.field4184 >= arg3 && class102.field1957 <= arg0 && class155.field2847 >= arg4) {
            class136.method944(arg0, arg4, arg5, arg3, arg2, 552);
        } else {
            class218.method1540(arg5, arg4, arg2, (byte) 33, arg3, arg0);
        }
        field191++;
        if (arg1 != 109) {
            method83(true);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)Z")
    public final boolean method81(int arg0) {
        field193++;
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field176[var3] != -1 && !class14.field269.method371(this.field176[var3], arg0 ^ 0xFFFFC879, 0)) {
                var2 = false;
            }
        }
        if (arg0 != -30978) {
            this.field171 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)Lol;")
    public final class208 method82(byte arg0) {
        field180++;
        int var2 = 0;
        class208[] var3 = new class208[5];
        if (arg0 < 109) {
            return null;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field176[var4] != -1) {
                var3[var2++] = class208.method1429(class14.field269, this.field176[var4], 0);
            }
        }
        class208 var5 = new class208(var3, var2);
        if (this.field174 != null) {
            for (int var6 = 0; var6 < this.field174.length; var6++) {
                var5.method1440(this.field174[var6], this.field186[var6]);
            }
        }
        if (this.field171 != null) {
            for (int var7 = 0; var7 < this.field171.length; var7++) {
                var5.method1434(this.field171[var7], this.field184[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)V")
    public static void method83(boolean arg0) {
        if (!arg0) {
            method80(43, (byte) 80, 127, -37, -33, 67);
        }
        field175 = null;
        field183 = null;
        field172 = null;
        field178 = null;
        field173 = null;
        field177 = null;
        field181 = null;
        field190 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ltf;B)V")
    public final void method84(class106 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method774((byte) 100);
            if (var3 == 0) {
                field182++;
                int var4 = 23 % ((-arg1 - 48) / 37);
                return;
            }
            this.method87(arg0, -41, var3);
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)Z")
    public final boolean method85(byte arg0) {
        field169++;
        if (this.field189 == null) {
            return true;
        } else if (arg0 < 102) {
            return true;
        } else {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field189.length; var3++) {
                if (!class14.field269.method371(this.field189[var3], 20103, 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)Lol;")
    public final class208 method86(int arg0) {
        field192++;
        if (this.field189 == null) {
            return null;
        }
        class208[] var2 = new class208[this.field189.length];
        for (int var3 = arg0; var3 < this.field189.length; var3++) {
            var2[var3] = class208.method1429(class14.field269, this.field189[var3], 0);
        }
        class208 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class208(var2, var2.length);
        }
        if (this.field174 != null) {
            for (int var5 = 0; var5 < this.field174.length; var5++) {
                var4.method1440(this.field174[var5], this.field186[var5]);
            }
        }
        if (this.field171 != null) {
            for (int var6 = 0; var6 < this.field171.length; var6++) {
                var4.method1434(this.field171[var6], this.field184[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ltf;II)V")
    private final void method87(class106 arg0, int arg1, int arg2) {
        if (arg1 != -41) {
            return;
        }
        field170++;
        if (arg2 == 1) {
            this.field179 = arg0.method774((byte) 111);
        } else if (arg2 == 2) {
            int var4 = arg0.method774((byte) 97);
            this.field189 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field189[var5] = arg0.method736(123);
            }
        } else if (arg2 == 3) {
            this.field187 = true;
        } else if (arg2 == 40) {
            int var6 = arg0.method774((byte) 94);
            this.field186 = new short[var6];
            this.field174 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field174[var7] = (short) arg0.method736(123);
                this.field186[var7] = (short) arg0.method736(121);
            }
        } else if (arg2 == 41) {
            int var8 = arg0.method774((byte) 94);
            this.field171 = new short[var8];
            this.field184 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field171[var9] = (short) arg0.method736(arg1 + 166);
                this.field184[var9] = (short) arg0.method736(126);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field176[arg2 - 60] = arg0.method736(126);
            return;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILji;)Lcc;")
    public static final class209 method88(int arg0, int arg1, class42 arg2) {
        field188++;
        if (!class218.method1531(arg0, false, client.method1070(arg2)) && arg2.field717 == null) {
            return null;
        } else if (arg2.field825 == null || arg0 >= arg2.field825.length || arg2.field825[arg0] == null || arg2.field825[arg0].method1454(99).method1486(5) == 0) {
            return class70.field1332 ? class229.method1604(new class209[] { class88.field1745, class66.method485(arg0, (byte) 126) }, (byte) 98) : null;
        } else {
            if (arg1 < 90) {
                field190 = null;
            }
            return arg2.field825[arg0];
        }
    }
}
