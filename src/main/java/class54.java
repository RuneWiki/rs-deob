import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class54 extends class28 {

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "I")
    private int field1180 = 128;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
    private int field1177 = 0;

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "I")
    private int field1184 = 0;

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "Z")
    public boolean field1186 = false;

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "I")
    public int field1188 = -1;

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "I")
    private int field1191 = 128;

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "I")
    private int field1193 = 0;

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "Z")
    public static boolean field1187 = false;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "Lqe;")
    public static class179 field1189 = class206.method1380("T", (byte) -26);

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "Lqe;")
    public static class179 field1195 = class206.method1380("Lade Schrifts-=tze )2 ", (byte) -126);

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "Lqe;")
    public static class179 field1196 = class206.method1380("lila:", (byte) 121);

    @OriginalMember(owner = "client!ej", name = "S", descriptor = "Lqe;")
    public static class179 field1199 = class206.method1380("Mem:", (byte) -127);

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "Ldc;")
    public static class36 field1183 = new class36();

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "I")
    public int field1182;

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "I")
    private int field1198;

    @OriginalMember(owner = "client!ej", name = "T", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!ej", name = "U", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!ej", name = "V", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "[S")
    private short[] field1185;

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "[S")
    private short[] field1194;

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "[S")
    private short[] field1197;

    @OriginalMember(owner = "client!ej", name = "W", descriptor = "[S")
    private short[] field1203;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILeh;IILeh;)Lod;")
    public static final class156 method372(int arg0, class52 arg1, int arg2, int arg3, class52 arg4) {
        if (arg2 >= -77) {
            field1183 = null;
        }
        field1190++;
        return class77.method495(20480, arg3, arg0, arg1) ? class226.method1482(arg4.method342(arg3, arg0, (byte) -100), -2) : null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method373(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class239.field4397 * arg0 + class130.field2367 * arg3 >> 16;
        int var6 = class239.field4397 * arg3 - class130.field2367 * arg0 >> 16;
        int var7 = field1179 * var6 + class187.field3470 * arg1 >> 16;
        int var8 = field1179 * arg1 - class187.field3470 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = field1179 * var6 + class187.field3470 * arg2 >> 16;
        int var12 = field1179 * arg2 - class187.field3470 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class17.field453 && var13 < class17.field453) {
            return false;
        } else if (var9 > class138.field2547 && var13 > class138.field2547) {
            return false;
        } else if (var10 < class111.field2087 && var14 < class111.field2087) {
            return false;
        } else {
            return var10 <= class123.field2281 || var14 <= class123.field2281;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILra;)V")
    public final void method374(int arg0, class185 arg1) {
        if (arg0 != -1) {
            return;
        }
        field1192++;
        while (true) {
            int var3 = arg1.method1243(3);
            if (var3 == 0) {
                return;
            }
            this.method376(arg1, var3, (byte) 97);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)Lgj;")
    public final class75 method375(int arg0, byte arg1) {
        int var3 = -116 / ((-arg1 - 39) / 44);
        class75 var4 = (class75) class125.field2310.method1332((long) this.field1182, 0);
        field1181++;
        if (var4 == null) {
            class224 var5 = class224.method1458(class216.field4005, this.field1198, 0);
            if (var5 == null) {
                return null;
            }
            if (this.field1185 != null) {
                for (int var6 = 0; var6 < this.field1185.length; var6++) {
                    var5.method1456(this.field1185[var6], this.field1194[var6]);
                }
            }
            if (this.field1197 != null) {
                for (int var7 = 0; var7 < this.field1197.length; var7++) {
                    var5.method1468(this.field1197[var7], this.field1203[var7]);
                }
            }
            var4 = var5.method1461(this.field1184 + 64, 850 - -this.field1177, -30, -50, -30);
            class125.field2310.method1340((long) this.field1182, false, var4);
        }
        class75 var8;
        if (this.field1188 == -1 || arg0 == -1) {
            var8 = var4.method476(true);
        } else {
            var8 = class239.method1550(this.field1188, (byte) 107).method763((byte) -75, var4, arg0);
        }
        if (this.field1191 != 128 || this.field1180 != 128) {
            var8.method489(this.field1191, this.field1180, this.field1191);
        }
        if (this.field1193 != 0) {
            if (this.field1193 == 90) {
                var8.method475();
            }
            if (this.field1193 == 180) {
                var8.method491();
            }
            if (this.field1193 == 270) {
                var8.method480();
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lra;IB)V")
    private final void method376(class185 arg0, int arg1, byte arg2) {
        field1202++;
        if (arg1 == 1) {
            this.field1198 = arg0.method1252(2);
        } else if (arg1 == 2) {
            this.field1188 = arg0.method1252(2);
        } else if (arg1 == 4) {
            this.field1191 = arg0.method1252(2);
        } else if (arg1 == 5) {
            this.field1180 = arg0.method1252(2);
        } else if (arg1 == 6) {
            this.field1193 = arg0.method1252(2);
        } else if (arg1 == 7) {
            this.field1184 = arg0.method1243(3);
        } else if (arg1 == 8) {
            this.field1177 = arg0.method1243(3);
        } else if (arg1 == 9) {
            this.field1186 = true;
        } else if (arg1 == 40) {
            int var6 = arg0.method1243(3);
            this.field1185 = new short[var6];
            this.field1194 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1185[var7] = (short) arg0.method1252(2);
                this.field1194[var7] = (short) arg0.method1252(2);
            }
        } else if (arg1 == 41) {
            int var4 = arg0.method1243(3);
            this.field1197 = new short[var4];
            this.field1203 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1197[var5] = (short) arg0.method1252(2);
                this.field1203[var5] = (short) arg0.method1252(2);
            }
        }
        if (arg2 < 79) {
            this.field1182 = 85;
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
    public static void method377(int arg0) {
        field1183 = null;
        field1189 = null;
        field1199 = null;
        field1196 = null;
        field1195 = null;
        if (arg0 < 112) {
            field1187 = false;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method378(Component arg0, byte arg1) {
        if (arg1 <= 9) {
            field1195 = null;
        }
        field1178++;
        arg0.removeKeyListener(class98.field1828);
        arg0.removeFocusListener(class98.field1828);
        class95.field1785 = -1;
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)V")
    public static final void method379(int arg0) {
        class113.field2118 = 0;
        class139.field2567 = 0;
        class169.field3043 = -1;
        class150.field2705 = 0;
        class192.field3581 = -1;
        if (arg0 > -94) {
            field1199 = null;
        }
        class182.field3358 = false;
        class149.field2681 = 0;
        class2.field23 = -1;
        class194.field3618 = 0;
        field1201++;
        class17.field460 = 0;
        class81.field1564.field3432 = 0;
        class36.field789.field3432 = 0;
        class223.field4120 = -1;
        for (int var1 = 0; var1 < class23.field554.length; var1++) {
            if (class23.field554[var1] != null) {
                class23.field554[var1].field3142 = -1;
            }
        }
        for (int var2 = 0; var2 < class53.field1152.length; var2++) {
            if (class53.field1152[var2] != null) {
                class53.field1152[var2].field3142 = -1;
            }
        }
        class175.method1111(0);
        class223.method1449((byte) 106, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class143.field2592[var3] = true;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lae;B)V")
    public static final void method380(class6 arg0, byte arg1) {
        field1200++;
        int var2 = arg0.field152 == 0 ? arg0.field169 : arg0.field152;
        int var3 = arg0.field97 == 0 ? arg0.field73 : arg0.field97;
        if (arg1 != 25) {
            field1199 = null;
        }
        class236.method1536(var3, arg0.field173, class199.field3710[arg0.field173 >> 16], var2, (byte) 41);
        if (arg0.field206 != null) {
            class236.method1536(var3, arg0.field173, arg0.field206, var2, (byte) 41);
        }
        class98 var4 = (class98) class36.field797.method909(-1, (long) arg0.field173);
        if (var4 != null) {
            class23.method155(var4.field1831, var2, var3, arg1 - 26);
        }
    }
}
