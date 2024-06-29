import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class78 {

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "Lng;")
    private class226 field1175 = new class226(64);

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "Lng;")
    public class226 field1181 = new class226(50);

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "Lae;")
    public class163 field1182 = new class163(250);

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "Ltp;")
    private class370 field1183 = new class370();

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "Lic;")
    private class491 field1170;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "Z")
    private boolean field1179;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "Lkc;")
    private class86 field1185;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "Lic;")
    public class491 field1164;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    public int field1177;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public int field1171;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "[Ljava/lang/String;")
    private String[] field1187;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "[Ljava/lang/String;")
    private String[] field1186;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
    public int field1184;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)Lew;")
    public final class339 method453(int arg0, int arg1) {
        field1167++;
        class226 var3 = this.field1175;
        class339 var4;
        synchronized (this.field1175) {
            var4 = (class339) this.field1175.method1536((long) arg1, arg0 ^ arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1170.method2945(class497.method2982(arg1, true), class449.method2714(arg1, (byte) 121), true);
        class339 var6 = new class339();
        var6.field4824 = arg1;
        var6.field4761 = this;
        var6.field4810 = new String[] { null, null, class388.field5867.method2838(false, this.field1177), null, null };
        var6.field4831 = new String[] { null, null, null, null, class473.field6955.method2838(false, this.field1177) };
        if (var5 != null) {
            var6.method2058((byte) 41, new class209(var5));
        }
        var6.method2069(arg0 ^ 0x4F);
        if (var6.field4771 != -1) {
            var6.method2062(this.method453(0, var6.field4771), (byte) -113, this.method453(0, var6.field4782));
        }
        if (var6.field4797 != -1) {
            var6.method2068(-1, this.method453(0, var6.field4797), this.method453(0, var6.field4822));
        }
        if (!this.field1179 && var6.field4790) {
            var6.field4796 = class62.field946.method2838(false, this.field1177);
            var6.field4784 = false;
            var6.field4765 = 0;
            var6.field4805 = null;
            var6.field4831 = this.field1186;
            var6.field4810 = this.field1187;
            if (var6.field4825 != null) {
                boolean var7 = false;
                for (class337 var8 = var6.field4825.method2608(true); var8 != null; var8 = var6.field4825.method2603(38)) {
                    class83 var9 = this.field1185.method506(true, (int) var8.field4736);
                    if (var9.field1286) {
                        var8.method2049(arg0 ^ 0xFFFFFF90);
                    } else {
                        var7 = true;
                    }
                }
                if (!var7) {
                    var6.field4825 = null;
                }
            }
        }
        class226 var10 = this.field1175;
        synchronized (this.field1175) {
            this.field1175.method1542(var6, (byte) 112, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V")
    public final void method454(boolean arg0) {
        field1176++;
        if (!arg0) {
            method456(-123, (byte) 94);
        }
        class226 var2 = this.field1175;
        synchronized (this.field1175) {
            this.field1175.method1539(-109);
        }
        class226 var3 = this.field1181;
        synchronized (this.field1181) {
            this.field1181.method1539(-86);
        }
        class163 var4 = this.field1182;
        synchronized (this.field1182) {
            this.field1182.method1139(16);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)V")
    public final void method455(int arg0, byte arg1) {
        if (arg1 != 61) {
            return;
        }
        field1166++;
        class226 var3 = this.field1175;
        synchronized (this.field1175) {
            this.field1175.method1534(0, arg0);
        }
        class226 var4 = this.field1181;
        synchronized (this.field1181) {
            this.field1181.method1534(arg1 - 61, arg0);
        }
        class163 var5 = this.field1182;
        synchronized (this.field1182) {
            this.field1182.method1137(arg0, (byte) 115);
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(IB)V")
    public static final void method456(int arg0, byte arg1) {
        field1180++;
        if (arg1 > 69) {
            class29.field302.method1534(0, arg0);
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(Z)V")
    public final void method457(boolean arg0) {
        if (arg0) {
            this.field1183 = null;
        }
        class163 var2 = this.field1182;
        synchronized (this.field1182) {
            this.field1182.method1135((byte) -126);
        }
        field1172++;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
    public final void method458(byte arg0) {
        class226 var2 = this.field1181;
        synchronized (this.field1181) {
            this.field1181.method1540(0);
        }
        field1174++;
        int var3 = -64 / ((-arg0 - 39) / 44);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILda;IBLqa;II)Lf;")
    public final class529 method459(int arg0, int arg1, class42 arg2, int arg3, byte arg4, class162 arg5, int arg6, int arg7) {
        if (arg4 != -80) {
            this.method462(true, 4);
        }
        this.field1183.field5661 = arg0;
        this.field1183.field5654 = arg1;
        field1165++;
        this.field1183.field5657 = arg3;
        this.field1183.field5653 = arg7;
        this.field1183.field5658 = arg2 != null;
        this.field1183.field5656 = arg6;
        this.field1183.field5651 = arg5.field2371;
        return (class529) this.field1182.method1138(this.field1183, arg4 ^ 0xFFFFFFAC);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
    public final void method460(int arg0) {
        class226 var2 = this.field1175;
        synchronized (this.field1175) {
            if (arg0 < 63) {
                return;
            }
            this.field1175.method1540(0);
        }
        field1169++;
        class226 var3 = this.field1181;
        synchronized (this.field1181) {
            this.field1181.method1540(0);
        }
        class163 var4 = this.field1182;
        synchronized (this.field1182) {
            this.field1182.method1135((byte) -30);
        }
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(IB)V")
    public final void method461(int arg0, byte arg1) {
        this.field1184 = arg0;
        field1178++;
        class226 var3 = this.field1181;
        synchronized (this.field1181) {
            if (arg1 != -82) {
                this.method461(55, (byte) -12);
            }
            this.field1181.method1540(0);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZI)V")
    public final void method462(boolean arg0, int arg1) {
        field1168++;
        if (arg0 != this.field1179) {
            int var3 = -7 / (-arg1 / 56);
            this.field1179 = arg0;
            this.method460(94);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILda;IIBIILoa;ZZLqa;Lqa;)Lf;")
    public final class529 method463(int arg0, class42 arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, class489 arg7, boolean arg8, boolean arg9, class162 arg10, class162 arg11) {
        field1173++;
        class529 var13 = this.method459(arg3, arg5, arg1, arg2, (byte) -80, arg11, arg0, arg6);
        if (var13 != null) {
            return var13;
        }
        class339 var14 = this.method453(0, arg3);
        if (arg0 > 1 && var14.field4792 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (var14.field4780[var16] <= arg0 && var14.field4780[var16] != 0) {
                    var15 = var14.field4792[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method453(0, var15);
            }
        }
        int[] var17 = var14.method2071(arg1, arg9, arg2, arg5, arg7, arg4 - 2147483533, arg10, arg0, arg6, arg11);
        if (arg4 != -116) {
            this.method458((byte) 37);
        }
        if (var17 == null) {
            return null;
        }
        class529 var18;
        if (arg8) {
            var18 = arg10.method1078(var17, 0, 36, 36, 32);
        } else {
            var18 = arg11.method1078(var17, 0, 36, 36, 32);
        }
        if (!arg8) {
            class370 var19 = new class370();
            var19.field5661 = arg3;
            var19.field5654 = arg5;
            var19.field5653 = arg6;
            var19.field5658 = arg1 != null;
            var19.field5651 = arg11.field2371;
            var19.field5657 = arg2;
            var19.field5656 = arg0;
            this.field1182.method1142(var19, var18, 1);
        }
        return var18;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lai;IZLkc;Lic;Lic;)V")
    public class78(class423 arg0, int arg1, boolean arg2, class86 arg3, class491 arg4, class491 arg5) {
        this.field1170 = arg4;
        this.field1179 = arg2;
        this.field1185 = arg3;
        this.field1164 = arg5;
        this.field1177 = arg1;
        if (this.field1170 == null) {
            this.field1171 = 0;
        } else {
            int var7 = this.field1170.method2943((byte) -33) - 1;
            this.field1171 = var7 * 256 + this.field1170.method2942(false, var7);
        }
        this.field1187 = new String[] { null, null, class388.field5867.method2838(false, this.field1177), null, null };
        this.field1186 = new String[] { null, null, null, null, class473.field6955.method2838(false, this.field1177) };
    }

    static {
        new class475("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
    }
}
