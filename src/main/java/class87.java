import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class87 {

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "Ljava/lang/String;")
    private String field1194 = "null";

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "F")
    public static float field1198 = 1.0F;

    @OriginalMember(owner = "client!fn", name = "q", descriptor = "Lwt;")
    public static class194 field1199 = new class194("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
    public static int field1201 = 0;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "C")
    public char field1191;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "C")
    public char field1192;

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "F")
    public static float field1200;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "I")
    private int field1196;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "Lfe;")
    private class384 field1185;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "Lfe;")
    public class384 field1197;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BI)I", line = 4)
    public final int method544(byte arg0, int arg1) {
        int var3 = -113 / ((arg0 - 24) / 57);
        field1193++;
        if (this.field1197 == null) {
            return this.field1196;
        } else {
            class304 var4 = (class304) this.field1197.method2310((byte) 126, (long) arg1);
            return var4 == null ? this.field1196 : var4.field4412;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V", line = 22)
    private final void method545(int arg0) {
        this.field1185 = new class384(this.field1197.method2311((byte) -56));
        field1184++;
        for (class149 var2 = (class149) this.field1197.method2316(arg0 + 4991); var2 != null; var2 = (class149) this.field1197.method2308((byte) 121)) {
            class91 var3 = new class91(var2.field1930, (int) var2.field1177);
            this.field1185.method2317(-1, class172.method1087(false, var2.field1930), var3);
        }
        if (arg0 != 8) {
            this.field1194 = null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 45)
    public final boolean method546(String arg0, int arg1) {
        if (arg1 != 1) {
            return true;
        }
        field1188++;
        if (this.field1197 == null) {
            return false;
        }
        if (this.field1185 == null) {
            this.method545(8);
        }
        for (class91 var3 = (class91) this.field1185.method2310((byte) -69, class172.method1087(false, arg0)); var3 != null; var3 = (class91) this.field1185.method2309(-123)) {
            if (var3.field1244.equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IILjava/lang/String;II)V", line = 84)
    public static final void method547(int arg0, int arg1, String arg2, int arg3, int arg4) {
        field1186++;
        class356 var5 = class236.method1433(arg0, arg1, (byte) 71);
        if (var5 == null) {
            return;
        }
        if (var5.field5288 != null) {
            class99 var6 = new class99();
            var6.field1346 = var5.field5288;
            var6.field1352 = arg2;
            var6.field1343 = var5;
            var6.field1348 = arg4;
            class396.method2358(var6);
        }
        boolean var7 = true;
        if (var5.field5192 != 0) {
            var7 = class217.method1337(-128, var5);
        }
        if (!var7 || !client.method1188(var5).method2935(arg4 - 1, (byte) 122)) {
            return;
        }
        if (arg4 == 1) {
            class386.method2321(true, class303.field4377);
            class380.field5665++;
            class95.method580(var5.field5174, arg1, 82, arg0);
        }
        if (arg4 == 2) {
            class386.method2321(true, class287.field4092);
            class74.field1062++;
            class95.method580(var5.field5174, arg1, 97, arg0);
        }
        if (arg4 == 3) {
            class386.method2321(true, class378.field5652);
            class12.field196++;
            class95.method580(var5.field5174, arg1, -68, arg0);
        }
        if (arg4 == 4) {
            class501.field7654++;
            class386.method2321(true, class475.field6859);
            class95.method580(var5.field5174, arg1, -83, arg0);
        }
        if (arg4 == 5) {
            class226.field3192++;
            class386.method2321(true, class311.field4522);
            class95.method580(var5.field5174, arg1, 92, arg0);
        }
        int var8 = 5 / ((arg3 - 25) / 42);
        if (arg4 == 6) {
            class386.method2321(true, class495.field7542);
            class310.field4511++;
            class95.method580(var5.field5174, arg1, -76, arg0);
        }
        if (arg4 == 7) {
            class386.method2321(true, class327.field4769);
            class365.field5491++;
            class95.method580(var5.field5174, arg1, -67, arg0);
        }
        if (arg4 == 8) {
            class386.method2321(true, class261.field3725);
            class447.field6518++;
            class95.method580(var5.field5174, arg1, 99, arg0);
        }
        if (arg4 == 9) {
            class172.field2336++;
            class386.method2321(true, class68.field1012);
            class95.method580(var5.field5174, arg1, 94, arg0);
        }
        if (arg4 == 10) {
            class107.field1431++;
            class386.method2321(true, class312.field4535);
            class95.method580(var5.field5174, arg1, 124, arg0);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IB)Z", line = 199)
    public final boolean method548(int arg0, byte arg1) {
        field1190++;
        if (arg1 >= -118) {
            return true;
        } else if (this.field1197 == null) {
            return false;
        } else {
            if (this.field1185 == null) {
                this.method553((byte) -72);
            }
            class304 var3 = (class304) this.field1185.method2310((byte) -57, (long) arg0);
            return var3 != null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lae;II)V", line = 222)
    private final void method549(class156 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field1191 = class207.method1279(1, arg0.method946(117));
        } else if (arg2 == 2) {
            this.field1192 = class207.method1279(1, arg0.method946(39));
        } else if (arg2 == 3) {
            this.field1194 = arg0.method981(false);
        } else if (arg2 == 4) {
            this.field1196 = arg0.method950(186);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method993((byte) -118);
            this.field1197 = new class384(class340.method2064(-98, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method950(186);
                class86 var7;
                if (arg2 == 5) {
                    var7 = new class149(arg0.method981(false));
                } else {
                    var7 = new class304(arg0.method950(186));
                }
                this.field1197.method2317(-1, (long) var6, var7);
            }
        }
        if (arg1 <= 71) {
            this.field1196 = 69;
        }
        field1189++;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 277)
    public final String method550(int arg0, boolean arg1) {
        field1195++;
        if (this.field1197 == null) {
            return this.field1194;
        }
        class149 var3 = (class149) this.field1197.method2310((byte) 74, (long) arg0);
        if (var3 == null) {
            return this.field1194;
        } else if (arg1) {
            return null;
        } else {
            return var3.field1930;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lae;B)V", line = 297)
    public final void method551(class156 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method941((byte) 126);
            if (var3 == 0) {
                field1183++;
                if (arg1 >= -55) {
                    this.method545(-54);
                    return;
                }
                return;
            }
            this.method549(arg0, 127, var3);
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V", line = 320)
    public static void method552(int arg0) {
        if (arg0 != -6) {
            method552(71);
        }
        field1199 = null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V", line = 335)
    private final void method553(byte arg0) {
        if (arg0 >= -11) {
            return;
        }
        this.field1185 = new class384(this.field1197.method2311((byte) -72));
        field1187++;
        for (class304 var2 = (class304) this.field1197.method2316(4999); var2 != null; var2 = (class304) this.field1197.method2308((byte) -101)) {
            class304 var3 = new class304((int) var2.field1177);
            this.field1185.method2317(-1, (long) var2.field4412, var3);
        }
    }
}
