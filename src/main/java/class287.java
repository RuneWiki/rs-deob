import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class287 {

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "Z")
    public boolean field4194 = true;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
    private int field4189 = -1;

    @OriginalMember(owner = "client!fr", name = "o", descriptor = "I")
    private int field4203;

    @OriginalMember(owner = "client!fr", name = "n", descriptor = "Lih;")
    private class503 field4202;

    @OriginalMember(owner = "client!fr", name = "l", descriptor = "Lbl;")
    private class468 field4200;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
    private int field4195;

    @OriginalMember(owner = "client!fr", name = "q", descriptor = "I")
    private int field4205;

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "Lik;")
    private class142 field4198;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "Len;")
    private class213 field4193;

    @OriginalMember(owner = "client!fr", name = "p", descriptor = "Lgu;")
    private class417 field4204;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "Leh;")
    public static class246 field4192 = new class246(107, 3);

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!fr", name = "m", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
    private final void method1768(int arg0) {
        field4199++;
        if (!this.field4194) {
            return;
        }
        this.field4194 = false;
        byte[] var2 = this.field4200.field6542;
        byte[] var3 = this.field4202.field7457;
        int var4 = 0;
        int var5 = this.field4200.field6530;
        int var6 = this.field4200.field6530 * this.field4203 + this.field4195;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (arg0 >= -94) {
            method1769(3);
        }
        if (this.field4204 != null && this.field4189 == var4) {
            this.field4194 = false;
            return;
        }
        this.field4189 = var4;
        int var8 = this.field4195 + (this.field4203 * var5);
        int var9 = 0;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var8] != 0) {
                        var12++;
                    }
                    var3[var9++] = (byte) (var12 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var8++;
            }
            var8 += this.field4200.field6530 - 128;
        }
        if (this.field4204 == null) {
            this.field4204 = new class417(this.field4202, 3553, 6406, 128, 128, false, this.field4202.field7457, 6406, false);
            this.field4204.method2467(19, false, false);
            this.field4204.method2762(9728, true);
        } else {
            this.field4204.method2470(0, 128, false, 0, false, this.field4202.field7457, 0, 6406, 128, 0);
        }
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)V")
    public static final void method1769(int arg0) {
        if (arg0 >= -60) {
            return;
        }
        class174 var1 = class513.field7581;
        synchronized (class513.field7581) {
            class513.field7581.method1095(0);
        }
        field4196++;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILya;)V")
    public static final void method1770(int arg0, class38 arg1) {
        class330.field4818[arg0] = arg1;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ZI)V")
    public static final void method1771(boolean arg0, int arg1) {
        if (class50.field608 != null) {
            class50.field608.method1360((byte) 50);
            class50.field608 = null;
        }
        field4191++;
        class63.field786 = 0;
        class366.method2160(8560);
        class189.method1206();
        for (int var2 = 0; var2 < 4; var2++) {
            class143.field1877[var2].method231(-4);
        }
        class315.method1896(false, 64);
        System.gc();
        class511.method3048(2, 16012);
        class467.field6521 = -1;
        class207.field3003 = false;
        class207.method1320((byte) -98, true);
        class216.field3128 = 0;
        class441.field6171 = 0;
        class367.field5241 = 0;
        class341.field4945 = 0;
        if (arg1 != -2049) {
            return;
        }
        class279.field4128 = 0;
        class189.field2708 = 0;
        for (int var3 = 0; var3 < class20.field234.length; var3++) {
            class20.field234[var3] = null;
        }
        class325.method1959((byte) -97);
        for (int var4 = 0; var4 < 2048; var4++) {
            class378.field5355[var4] = null;
        }
        class434.field6110 = 0;
        class125.field1687.method2408(78);
        class481.field6704 = 0;
        class62.field773.method2408(122);
        class522.method3086((byte) 121);
        class121.field1668 = 0;
        class163.field2413.method2226(arg1 ^ 0x7083DAD8);
        class303.method1847(-77);
        class336.method2009(-89);
        class369.field5264 = null;
        class397.field5620 = 0L;
        if (arg0) {
            class86.method623(11, (byte) -105);
            return;
        }
        class86.method623(2, (byte) 105);
        try {
            class297.method1826("loggedout", -14648, class268.field3914.field2165);
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "([BIII)V")
    public final void method1772(byte[] arg0, int arg1, int arg2, int arg3) {
        field4190++;
        if (arg3 == -1) {
            this.field4193.method454(arg1 * this.field4202.method2934(124, arg2), (byte) 60, arg0, arg2);
            this.method1773(this.field4193, -27036, arg1);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lik;II)V")
    private final void method1773(class142 arg0, int arg1, int arg2) {
        field4201++;
        if (arg2 == 0) {
            return;
        }
        this.method1768(arg1 ^ 0x69E0);
        if (arg1 == -27036) {
            this.field4202.method2968(this.field4204, arg1 + 26938);
            this.field4202.method2998(0, 4, arg0, 125, arg2);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)V")
    public static void method1774(byte arg0) {
        field4192 = null;
        int var1 = 49 / ((-arg0 - 23) / 57);
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(B)V")
    public final void method1775(byte arg0) {
        field4197++;
        this.method1773(this.field4198, -27036, this.field4205);
        if (arg0 > -108) {
            method1770(-36, null);
        }
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lih;Lbl;Lus;IIIII)V")
    public class287(class503 arg0, class468 arg1, class1 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field4203 = arg7;
        this.field4202 = arg0;
        this.field4200 = arg1;
        this.field4195 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field411 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field24[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field4205 = var10;
        if (var10 <= 0) {
            this.field4204 = null;
        } else {
            class403 var14 = new class403(var10 * 2);
            if (this.field4202.field7340) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field411 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field24[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method2372(var23[var24] & 0xFFFF, 84);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field411 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field24[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method2378(-1784786264, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field4198 = this.field4202.method2975(var14.field5663, false, 5123, 0, var14.field5665);
            this.field4193 = new class213(this.field4202, 5123, null, 1);
        }
    }

    static {
        new class530("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
    }
}
