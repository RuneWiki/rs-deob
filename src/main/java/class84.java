import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class84 implements class243 {

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "Z")
    private boolean field1338 = false;

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
    private int field1337 = 50;

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "Lik;")
    private class262 field1342;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "Lik;")
    private class262 field1333;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "Lcd;")
    private class69 field1323;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "Lcd;")
    private class69 field1310;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "[Z")
    private boolean[] field1327;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "[B")
    private byte[] field1331;

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "[Z")
    private boolean[] field1346;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "[Z")
    private boolean[] field1335;

    @OriginalMember(owner = "client!bi", name = "Q", descriptor = "[B")
    private byte[] field1349;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "[Z")
    private boolean[] field1334;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "[Z")
    private boolean[] field1317;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "[B")
    private byte[] field1319;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "[B")
    private byte[] field1308;

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "[S")
    private short[] field1341;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field1318 = 0;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public static int field1328 = 0;

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "I")
    public static int field1347 = 0;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!bi", name = "R", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!bi", name = "S", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)Z", line = 6)
    public final boolean method561(int arg0, int arg1) {
        field1344++;
        int var3 = -39 / ((-arg0 - 37) / 51);
        return this.field1327[arg1];
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)Z", line = 18)
    public final boolean method562(int arg0, byte arg1) {
        field1332++;
        if (this.field1338 || this.field1346[arg0]) {
            return true;
        } else {
            if (arg1 != 84) {
                this.field1323 = (class69) null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZI)V", line = 34)
    public static final void method563(boolean arg0, int arg1) {
        class195.field3528 = new int[104];
        class315.field5430 = 99;
        class90.field1417 = new int[arg1];
        class24.field365 = new int[104];
        field1321++;
        class93.field1481 = new int[104];
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class34.field459 = new int[104];
        class149.field2719 = new int[var2][105][105];
        class216.field3840 = new byte[var2][104][104];
        class182.field3357 = new byte[var2][105][105];
        class327.field5586 = new byte[var2][104][104];
        class265.field4670 = new byte[var2][104][104];
        class95.field1516 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(II)I", line = 62)
    public final int method564(int arg0, int arg1) {
        field1313++;
        if (arg0 != 65535) {
            this.method564(-70, -76);
        }
        return this.field1341[arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "(II)I", line = 73)
    public static int method565(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(BI)I", line = 80)
    public final int method566(byte arg0, int arg1) {
        if (arg0 != 111) {
            this.method577(88, false);
        }
        field1325++;
        return this.field1349[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(II)Z", line = 92)
    public final boolean method567(int arg0, int arg1) {
        field1348++;
        if (arg1 < 11) {
            this.method575((byte) 108, -116);
        }
        return this.field1335[arg0];
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)[I", line = 104)
    public final int[] method568(int arg0, int arg1) {
        field1339++;
        if (arg1 != 105) {
            this.method573(69, (byte) -79);
        }
        class19 var3 = this.method574((byte) 117, arg0);
        return var3 == null ? null : var3.method126(-10038, this, this.field1338 || this.field1346[arg0], this.field1333);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)I", line = 120)
    public final int method569(byte arg0, int arg1) {
        if (arg0 != -96) {
            this.field1308 = (byte[]) null;
        }
        field1329++;
        return this.field1331[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V", line = 131)
    public final void method570(boolean arg0) {
        field1330++;
        this.field1323.method461(arg0);
        if (this.field1310 != null) {
            this.field1310.method461(arg0);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IJ)V", line = 146)
    public static final void method571(int arg0, long arg1) {
        field1351++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class176.field3205; var3++) {
            if (class75.field1153[var3] == arg1) {
                class176.field3205--;
                for (int var4 = var3; var4 < class176.field3205; var4++) {
                    class75.field1153[var4] = class75.field1153[var4 + 1];
                    class51.field752[var4] = class51.field752[var4 + 1];
                }
                class154.field2776++;
                class290.field5084 = class242.field4217;
                class256.field4471.method1427(50, 0);
                class256.field4471.method1735((byte) -39, arg1);
                break;
            }
        }
        if (arg0 != -9799) {
            method579((short[]) null, (byte) 6);
        }
    }

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "(II)I", line = 193)
    public final int method572(int arg0, int arg1) {
        if (arg1 != 255) {
            this.field1323 = (class69) null;
        }
        field1340++;
        return this.field1319[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(IB)I", line = 206)
    public final int method573(int arg0, byte arg1) {
        if (arg1 != -103) {
            this.field1349 = (byte[]) null;
        }
        field1350++;
        return this.field1308[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(BI)Lga;", line = 219)
    private final class19 method574(byte arg0, int arg1) {
        field1336++;
        class19 var3 = (class19) this.field1323.method466((long) arg1, 1);
        if (var3 != null) {
            return var3;
        } else if (arg0 <= 89) {
            return (class19) null;
        } else {
            byte[] var4 = this.field1342.method1868(12236, arg1, 0);
            if (var4 == null) {
                return null;
            } else {
                class249 var5 = new class249(var4);
                class19 var6 = new class19(var5);
                this.field1323.method468((long) arg1, (byte) -114, var6);
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(BI)Z", line = 247)
    public final boolean method575(byte arg0, int arg1) {
        field1320++;
        class19 var3 = this.method574((byte) 107, arg1);
        if (arg0 == 77) {
            return var3 == null ? false : var3.method127(this, (byte) -114, this.field1333);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)Z", line = 266)
    public static final boolean method576(int arg0, int arg1, int arg2) {
        int var3 = class168.field3023[arg0][arg1][arg2];
        if (-class60.field960 == var3) {
            return false;
        } else if (class60.field960 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class176.method1246(var4 + 1, class278.field4883[arg0][arg1][arg2], var5 + 1) && class176.method1246(var4 + 128 - 1, class278.field4883[arg0][arg1 + 1][arg2], var5 + 1) && class176.method1246(var4 + 128 - 1, class278.field4883[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class176.method1246(var4 + 1, class278.field4883[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class168.field3023[arg0][arg1][arg2] = class60.field960;
                return true;
            } else {
                class168.field3023[arg0][arg1][arg2] = -class60.field960;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZ)V", line = 293)
    public final void method577(int arg0, boolean arg1) {
        field1343++;
        this.field1338 = arg1;
        this.method570(true);
        if (arg0 != 1) {
            this.method583(72, -101);
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lik;Lik;Lik;IZ)V", line = 556)
    public class84(class262 arg0, class262 arg1, class262 arg2, int arg3, boolean arg4) {
        this.field1337 = arg3;
        this.field1342 = arg0;
        this.field1338 = arg4;
        this.field1333 = arg2;
        this.field1323 = new class69(this.field1337);
        if (class231.field4051) {
            this.field1310 = new class69(this.field1337);
        } else {
            this.field1310 = null;
        }
        class249 var6 = new class249(arg1.method1868(12236, 0, 0));
        int var7 = var6.method1712(-1);
        this.field1327 = new boolean[var7];
        this.field1331 = new byte[var7];
        this.field1346 = new boolean[var7];
        this.field1335 = new boolean[var7];
        this.field1349 = new byte[var7];
        this.field1334 = new boolean[var7];
        this.field1317 = new boolean[var7];
        this.field1319 = new byte[var7];
        this.field1308 = new byte[var7];
        this.field1341 = new short[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field1317[var8] = var6.method1731(true) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field1317[var9]) {
                this.field1335[var9] = var6.method1731(true) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field1317[var10]) {
                this.field1327[var10] = var6.method1731(true) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field1317[var11]) {
                this.field1346[var11] = var6.method1731(true) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field1317[var12]) {
                this.field1334[var12] = var6.method1731(true) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field1317[var13]) {
                this.field1308[var13] = var6.method1721((byte) 117);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field1317[var14]) {
                this.field1319[var14] = var6.method1721((byte) 73);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field1317[var15]) {
                this.field1331[var15] = var6.method1721((byte) 112);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field1317[var16]) {
                this.field1349[var16] = var6.method1721((byte) 111);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field1317[var17]) {
                this.field1341[var17] = (short) var6.method1712(-1);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(IB)V", line = 321)
    public final void method578(int arg0, byte arg1) {
        this.field1337 = arg0;
        this.field1323 = new class69(this.field1337);
        if (arg1 <= 10) {
            this.method566((byte) 63, -88);
        }
        field1326++;
        if (class231.field4051) {
            this.field1310 = new class69(this.field1337);
        } else {
            this.field1310 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([SB)[S", line = 340)
    public static final short[] method579(short[] arg0, byte arg1) {
        field1312++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != -66) {
            method571(39, -51L);
        }
        short[] var2 = new short[arg0.length];
        class23.method160(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLla;)V", line = 368)
    public static final void method580(byte arg0, class139 arg1) {
        class269.field4716 = 3;
        class93.method630(true, (byte) 121);
        class221.field3937 = true;
        class299.field5202 = 0;
        class312.field5394 = true;
        class288.field5028 = 0;
        class180.field3277 = true;
        class247.field4280 = 2;
        class60.field962 = true;
        if (arg0 != 119) {
            method579((short[]) null, (byte) 95);
        }
        class283.field4962 = true;
        class131.field2242 = true;
        class287.field5018 = true;
        field1307++;
        class311.field5380 = 0;
        class42.field561 = 127;
        class163.field2916 = true;
        class26.field397 = true;
        class184.field3372 = 0;
        class203.field3671 = 255;
        class77 var2 = null;
        class15.field194 = 127;
        class137.field2427 = true;
        class180.field3280 = true;
        class165.method1150(2);
        class258.field4562 = 0;
        class45.field643 = false;
        class282.field4939 = false;
        class95.field1523 = 0;
        try {
            class205 var3 = arg1.method955(0, "runescape");
            while (var3.field3686 == 0) {
                class83.method556(1L, 122);
            }
            if (var3.field3686 == 1) {
                var2 = (class77) var3.field3685;
                byte[] var4 = new byte[(int) var2.method505(24044)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method507(var5, -1, var4, var4.length - var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class92.method619(new class249(var4), arg0 - 119);
            }
        } catch (Exception var10) {
        }
        try {
            if (var2 != null) {
                var2.method503((byte) -94);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BFI)[I", line = 447)
    public final int[] method581(byte arg0, float arg1, int arg2) {
        field1324++;
        class19 var4 = this.method574((byte) 93, arg2);
        if (arg0 < 64) {
            return (int[]) null;
        } else if (var4 == null) {
            return null;
        } else {
            var4.field285 = true;
            return var4.method130(this, this.field1338 || this.field1346[arg2], arg1, (byte) -19, this.field1333);
        }
    }

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "(II)V", line = 464)
    public final void method582(int arg0, int arg1) {
        field1316++;
        class19 var3 = (class19) this.field1323.method464((byte) 66);
        if (arg1 != -1) {
            method571(-50, -105L);
        }
        while (var3 != null) {
            if (var3.field285) {
                var3.method133(arg0, 61);
                var3.field285 = false;
            }
            var3 = (class19) this.field1323.method463(arg1 ^ 0xFFFFFDFF);
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(II)V", line = 491)
    public final void method583(int arg0, int arg1) {
        boolean var3 = false;
        class59.method403(this.field1349[arg1] & 0xFF, (byte) -72, this.field1331[arg1] & 0xFF);
        class19 var4 = this.method574((byte) 103, arg1);
        if (var4 != null) {
            var3 = var4.method132(this.field1333, (byte) -100, this, this.field1338 || this.field1346[arg1]);
        }
        field1322++;
        if (arg0 == 22259 && !var3) {
            class68 var5 = this.method585((byte) 86, arg1);
            var5.method454(11887);
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(BI)Z", line = 523)
    public final boolean method584(byte arg0, int arg1) {
        if (arg0 != -18) {
            this.field1310 = (class69) null;
        }
        field1314++;
        return this.field1334[arg1];
    }

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "(BI)Lri;", line = 539)
    private final class68 method585(byte arg0, int arg1) {
        field1315++;
        class68 var3 = (class68) this.field1310.method466((long) arg1, 1);
        if (var3 == null) {
            class68 var4 = new class68(this.field1341[arg1] & 0xFFFF);
            this.field1310.method468((long) arg1, (byte) -122, var4);
            return arg0 == 86 ? var4 : (class68) null;
        } else {
            return var3;
        }
    }
}
