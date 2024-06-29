import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class178 {

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "Lge;")
    private class511 field2643 = new class511(256);

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "Lci;")
    private class320 field2641;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field2648 = 0;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "Lqt;")
    public static class459 field2651;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IBZ)V")
    public static final void method1238(int arg0, byte arg1, boolean arg2) {
        field2644++;
        int var3 = 80 / ((2 - arg1) / 32);
        class304 var4 = class75.method579(arg2, true, arg0);
        if (var4 != null) {
            var4.method421(22071);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static void method1239(int arg0) {
        if (arg0 == 8147) {
            field2651 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
    public final void method1240(int arg0) {
        field2646++;
        class511 var2 = this.field2643;
        synchronized (this.field2643) {
            this.field2643.method2990((byte) -88);
        }
        if (arg0 >= -16) {
            field2651 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V")
    public final void method1241(int arg0, int arg1) {
        class511 var3 = this.field2643;
        synchronized (this.field2643) {
            this.field2643.method2989(false, arg1);
            if (arg0 != 43) {
                this.method1243((byte) -91, -93);
            }
        }
        field2642++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIII)I")
    public static final int method1242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2649++;
        if (class146.field2262 == null) {
            return 0;
        }
        if (arg5 < 3) {
            int var6 = arg4 >> 7;
            int var7 = arg1 >> 7;
            if (arg3 < 0 || arg2 < 0 || class69.field1139 - 1 < arg3 || arg2 > (class255.field3763 - 1)) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || class69.field1139 - 1 < var6 || var7 > (class255.field3763 - 1)) {
                return 0;
            }
            boolean var8 = (class234.field3497[1][arg4 >> 7][arg1 >> 7] & 0x2) != 0;
            if ((arg4 & 0x7F) == 0) {
                boolean var9 = (class234.field3497[1][var6 - 1][arg1 >> 7] & 0x2) != 0;
                boolean var10 = (class234.field3497[1][var6][arg1 >> 7] & 0x2) != 0;
                if (var10 != var9) {
                    var8 = (class234.field3497[1][arg3][arg2] & 0x2) != 0;
                }
            }
            if ((arg1 & 0x7F) == 0) {
                boolean var11 = (class234.field3497[1][arg4 >> 7][var7 - 1] & 0x2) != 0;
                boolean var12 = (class234.field3497[1][arg4 >> 7][var7] & 0x2) != 0;
                if (var12 != var11) {
                    var8 = (class234.field3497[1][arg3][arg2] & 0x2) != 0;
                }
            }
            if (var8) {
                arg5++;
            }
        }
        if (arg0 != 17520) {
            field2651 = null;
        }
        return class146.field2262[arg5].method143(arg4, arg1);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)Lhe;")
    public final class256 method1243(byte arg0, int arg1) {
        field2650++;
        class511 var3 = this.field2643;
        class256 var4;
        synchronized (this.field2643) {
            var4 = (class256) this.field2643.method2982(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class320 var5 = this.field2641;
        byte[] var6;
        synchronized (this.field2641) {
            var6 = this.field2641.method2037(arg1, (byte) -109, 26);
            if (arg0 <= 91) {
                this.method1240(-111);
            }
        }
        class256 var7 = new class256();
        if (var6 != null) {
            var7.method1654(true, new class519(var6));
        }
        class511 var8 = this.field2643;
        synchronized (this.field2643) {
            this.field2643.method2981(var7, 90, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
    public final void method1244(byte arg0) {
        class511 var2 = this.field2643;
        synchronized (this.field2643) {
            this.field2643.method2980(-182819096);
            if (arg0 <= 107) {
                field2651 = null;
            }
        }
        field2645++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "([Ljava/lang/Object;[IIII)V")
    public static final void method1245(Object[] arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if (arg3 > arg4) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg4;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var7;
            Object var8 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var8;
            int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
            for (int var10 = arg4; var10 < arg3; var10++) {
                if (arg1[var10] < var7 + (var9 & var10)) {
                    int var11 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6] = var11;
                    Object var12 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var12;
                }
            }
            arg1[arg3] = arg1[var6];
            arg1[var6] = var7;
            arg0[arg3] = arg0[var6];
            arg0[var6] = var8;
            method1245(arg0, arg1, arg2, var6 - 1, arg4);
            method1245(arg0, arg1, 1, arg3, var6 + 1);
        }
        if (arg2 != 1) {
            field2648 = -121;
        }
        field2647++;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lsn;ILci;)V")
    public class178(class453 arg0, int arg1, class320 arg2) {
        this.field2641 = arg2;
        this.field2641.method2030(-10914, 26);
    }

    static {
        new class44("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field2651 = new class459(43, 7);
    }
}
