import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public abstract class class753 extends class55 {

    @OriginalMember(owner = "client!nca", name = "o", descriptor = "Lsba;")
    public static class218 field10437 = null;

    @OriginalMember(owner = "client!nca", name = "t", descriptor = "[I")
    public static int[] field10442 = new int[5];

    @OriginalMember(owner = "client!nca", name = "m", descriptor = "Llga;")
    public static class712 field10435 = new class712(26, -1);

    @OriginalMember(owner = "client!nca", name = "v", descriptor = "[[I")
    public static int[][] field10444 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!nca", name = "k", descriptor = "I")
    public int field10433;

    @OriginalMember(owner = "client!nca", name = "l", descriptor = "I")
    public static int field10434;

    @OriginalMember(owner = "client!nca", name = "n", descriptor = "I")
    public static int field10436;

    @OriginalMember(owner = "client!nca", name = "q", descriptor = "I")
    public static int field10439;

    @OriginalMember(owner = "client!nca", name = "r", descriptor = "I")
    public static int field10440;

    @OriginalMember(owner = "client!nca", name = "s", descriptor = "I")
    public static int field10441;

    @OriginalMember(owner = "client!nca", name = "u", descriptor = "I")
    public int field10443;

    @OriginalMember(owner = "client!nca", name = "p", descriptor = "[I")
    public int[] field10438;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIII)I", line = 5)
    public static final int method4188(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field10440++;
        if (var4 == 0) {
            return arg2;
        }
        if (arg3 != -7175) {
            method4191(125, 75, (byte) -103, -13);
        }
        if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 4095 - arg2;
        } else {
            return 4095 - arg0;
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BC)Ljava/lang/String;", line = 31)
    public static final String method4189(String arg0, String arg1, byte arg2, char arg3) {
        field10439++;
        int var4 = arg0.length();
        int var5 = arg1.length();
        if (arg2 >= -57) {
            method4193(96, 20, 39, 5);
        }
        int var6 = var4;
        int var7 = var5 - 1;
        if (var7 != 0) {
            int var8 = 0;
            while (true) {
                var8 = arg0.indexOf(arg3, var8);
                if (var8 < 0) {
                    break;
                }
                var8++;
                var6 += var7;
            }
        }
        StringBuffer var9 = new StringBuffer(var6);
        int var10 = 0;
        while (true) {
            int var11 = arg0.indexOf(arg3, var10);
            if (var11 < 0) {
                var9.append(arg0.substring(var10));
                return var9.toString();
            }
            var9.append(arg0.substring(var10, var11));
            var10 = var11 + 1;
            var9.append(arg1);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IZ)V", line = 85)
    public static final void method4190(int arg0, boolean arg1) {
        field10434++;
        class11.field68.method2276((byte) -13, 0, class11.field68.field5502);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5548);
        class11.field68.method2276((byte) -13, 1, class11.field68.field5493);
        class11.field68.method2276((byte) -13, 1, class11.field68.field5524);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5498);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5512);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5499);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5510);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5532);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5494);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5545);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5521);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5541);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5534);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5505);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5520);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5492);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5508);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5536);
        class102.method703((byte) 103);
        class11.field68.method2276((byte) -13, 2, class11.field68.field5501);
        class11.field68.method2276((byte) -13, 1, class11.field68.field5511);
        class216.method1201((byte) 76);
        if (arg0 > -77) {
            method4189(null, null, (byte) 62, 'n');
        }
        class723.method4058((byte) 121);
        class139.field1786 = true;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIBI)V", line = 122)
    public static final void method4191(int arg0, int arg1, byte arg2, int arg3) {
        field10436++;
        int var4 = class99.field1313 + arg0;
        int var5 = class133.field1704 + arg3;
        if (class77.field947 == null || arg0 < 0 || arg3 < 0 || class272.field3589 <= arg0 || arg3 >= class3.field26 || class11.field68.field5548.method186((byte) 122) == 0 && class653.field9086.field2175 != arg1) {
            return;
        }
        long var6 = (long) (arg1 << 28 | var5 << 14 | var4);
        class270 var8 = (class270) class472.field6537.method2552(var6, -1);
        if (var8 == null) {
            class114.method759(arg1, arg0, arg3);
            return;
        }
        if (arg2 <= 38) {
            field10444 = null;
        }
        class48 var9 = (class48) var8.field3567.method724(32);
        if (var9 == null) {
            class114.method759(arg1, arg0, arg3);
            return;
        }
        class30 var10 = (class30) class114.method759(arg1, arg0, arg3);
        if (var10 == null) {
            var10 = new class30(arg0 << 9, class25.field188[arg1].method1685(arg3, -12639, arg0), arg3 << 9, arg1, arg1);
        } else {
            var10.field255 = var10.field260 = -1;
        }
        var10.field251 = var9.field493;
        var10.field254 = var9.field491;
        label61: while (true) {
            class48 var11 = (class48) var8.field3567.method723(88);
            if (var11 == null) {
                break;
            }
            if (var10.field254 != var11.field491) {
                var10.field264 = var11.field493;
                var10.field255 = var11.field491;
                while (true) {
                    class48 var12 = (class48) var8.field3567.method723(101);
                    if (var12 == null) {
                        break label61;
                    }
                    if (var10.field254 != var12.field491 && var10.field255 != var12.field491) {
                        var10.field260 = var12.field491;
                        var10.field247 = var12.field493;
                    }
                }
            }
        }
        int var13 = class86.method624(arg1, (arg3 << 9) + 256, (arg0 << 9) + 256, 24111);
        var10.field253 = 0;
        var10.field2175 = (byte) arg1;
        var10.field2165 = arg3 << 9;
        var10.field2178 = var13;
        var10.field2170 = arg0 << 9;
        var10.field2167 = (byte) arg1;
        if (class669.method3767(arg3, (byte) -102, arg0)) {
            var10.field2167++;
        }
        class736.method4125(arg1, arg0, arg3, var13, var10);
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 221)
    public static final int method4192(String arg0, int arg1) {
        field10441++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + arg0.charAt(var4) - var3;
        }
        if (arg1 != 6243) {
            method4190(-52, false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(IIII)V", line = 253)
    public static final void method4193(int arg0, int arg1, int arg2, int arg3) {
        class624 var4 = class77.field947[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class744 var5 = var4.field8738;
        class744 var6 = var4.field8730;
        if (var5 != null) {
            var5.field10345 = (short) (var5.field10345 * arg3 / (0x10 << class443.field6172 - 7));
            var5.field10340 = (short) (var5.field10340 * arg3 / (0x10 << class443.field6172 - 7));
        }
        if (var6 != null) {
            var6.field10345 = (short) (var6.field10345 * arg3 / (0x10 << class443.field6172 - 7));
            var6.field10340 = (short) (var6.field10340 * arg3 / (0x10 << class443.field6172 - 7));
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(I)V", line = 275)
    public static void method4194(int arg0) {
        field10437 = null;
        field10444 = null;
        int var1 = 12 / ((4 - arg0) / 48);
        field10435 = null;
        field10442 = null;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Ljava/awt/Graphics;IBIIIII)V")
    public abstract void method1773(Graphics arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIILjava/awt/Canvas;)V")
    public abstract void method1772(int arg0, int arg1, int arg2, Canvas arg3);
}
