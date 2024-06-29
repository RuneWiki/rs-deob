import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public abstract class class42 extends class72 {

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "I")
    public int field954 = 1000;

    @OriginalMember(owner = "client!gd", name = "V", descriptor = "Lae;")
    public static class6 field961 = class64.method474(104, "Benutzen Sie die (WPasswort -=ndern(W Option");

    @OriginalMember(owner = "client!gd", name = "X", descriptor = "I")
    public static int field963 = 0;

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "Lae;")
    public static class6 field959 = class64.method474(112, "@whi@");

    @OriginalMember(owner = "client!gd", name = "bb", descriptor = "[I")
    public static int[] field967 = new int[32768];

    @OriginalMember(owner = "client!gd", name = "ab", descriptor = "Lae;")
    public static class6 field966 = class64.method474(109, "Lade Eingabe)2Steuerungsprogramm)3)3)3");

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!gd", name = "W", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!gd", name = "Y", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!gd", name = "Z", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "[Z")
    public static boolean[] field958;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(Z)V", line = 3)
    public static final void method350(boolean arg0) {
        if (arg0) {
            method350(true);
        }
        field965++;
        int var1 = (class12.field229.field1752 >> 7) + class61.field1329;
        int var2 = (class12.field229.field1783 >> 7) + class130.field3164;
        class62.field1347 = 0;
        if (var2 >= 3053 && var2 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            class62.field1347 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            class62.field1347 = 1;
        }
        if (class62.field1347 == 1 && var2 >= 3139 && var2 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            class62.field1347 = 0;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIIIII)V", line = 33)
    public void method351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field960++;
        class131 var10 = this.method3(true);
        if (var10 != null) {
            this.field954 = var10.field954;
            var10.method351(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(Z)Lv;", line = 65)
    public class131 method3(boolean arg0) {
        field955++;
        if (!arg0) {
            this.method3(false);
        }
        return null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/awt/Component;Lbf;ILbf;)V", line = 76)
    public static final void method352(Component arg0, class14 arg1, int arg2, class14 arg3) {
        field957++;
        if (class125.field3058) {
            return;
        }
        class59.field1281 = class105.method890(arg0, 128, 265, (byte) -116);
        class74.method590();
        class135.field3294 = class105.method890(arg0, 128, 265, (byte) -109);
        class74.method590();
        class43.field980 = class105.method890(arg0, 509, 171, (byte) -114);
        class74.method590();
        class121.field2996 = class105.method890(arg0, 360, 132, (byte) -121);
        class74.method590();
        class133.field3249 = class105.method890(arg0, 360, 200, (byte) -114);
        class74.method590();
        client.field462 = class105.method890(arg0, 202, 238, (byte) -118);
        class74.method590();
        class66.field1462 = class105.method890(arg0, 203, 238, (byte) -118);
        class74.method590();
        class20.field428 = class105.method890(arg0, 74, 94, (byte) -107);
        class74.method590();
        class56.field1227 = class105.method890(arg0, 75, 94, (byte) -123);
        class74.method590();
        byte[] var4 = arg3.method162(class7.field147, class102.field2400, 124);
        class101 var5 = new class101(var4, arg0);
        class59.field1281.method941(arg2 ^ 0x42AA);
        var5.method857(0, 0);
        class135.field3294.method941(arg2 ^ 0x42AA);
        var5.method857(-637, 0);
        class43.field980.method941(10);
        var5.method857(-128, 0);
        class121.field2996.method941(10);
        var5.method857(-202, -371);
        class133.field3249.method941(10);
        var5.method857(-202, -171);
        client.field462.method941(10);
        var5.method857(0, -265);
        class66.field1462.method941(10);
        var5.method857(-562, -265);
        class20.field428.method941(10);
        var5.method857(-128, -171);
        class56.field1227.method941(10);
        var5.method857(-562, -171);
        int[] var6 = new int[var5.field2380];
        for (int var7 = 0; var7 < var5.field2376; var7++) {
            for (int var23 = 0; var23 < var5.field2380; var23++) {
                var6[var23] = var5.field2378[var5.field2380 * var7 + var5.field2380 - var23 - 1];
            }
            for (int var24 = 0; var24 < var5.field2380; var24++) {
                var5.field2378[var24 + var5.field2380 * var7] = var6[var24];
            }
        }
        class59.field1281.method941(10);
        var5.method857(382, 0);
        class135.field3294.method941(10);
        var5.method857(-255, 0);
        class43.field980.method941(10);
        var5.method857(254, 0);
        class121.field2996.method941(10);
        var5.method857(180, -371);
        class133.field3249.method941(10);
        var5.method857(180, -171);
        client.field462.method941(arg2 - 17046);
        var5.method857(382, -265);
        class66.field1462.method941(10);
        var5.method857(-180, -265);
        class20.field428.method941(arg2 - 17046);
        var5.method857(254, -171);
        class56.field1227.method941(arg2 ^ 0x42AA);
        var5.method857(-180, -171);
        class101 var8 = class64.method467(class103.field2452, -12078, class102.field2400, arg1);
        class43.field980.method941(10);
        var8.method850(382 - var8.field2380 / 2 - 128, 18);
        class108.field2600 = class96.method802((byte) -79, arg1, class37.field836, class102.field2400);
        class126.field3085 = class96.method802((byte) -79, arg1, class126.field3087, class102.field2400);
        class114.field2698 = class90.method760((byte) -106, arg1, class102.field2400, class21.field516);
        class95.field2256 = new class101(128, 265);
        class117.field2779 = new class101(128, 265);
        for (int var9 = 0; var9 < 33920; var9++) {
            class95.field2256.field2378[var9] = class59.field1281.field2690[var9];
        }
        for (int var10 = 0; var10 < 33920; var10++) {
            class117.field2779.field2378[var10] = class135.field3294.field2690[var10];
        }
        class26.field640 = new int[256];
        for (int var11 = 0; var11 < 64; var11++) {
            class26.field640[var11] = var11 * 262144;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class26.field640[var12 + 64] = var12 * 1024 + 16711680;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            class26.field640[var13 + 128] = var13 * 4 + 16776960;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class26.field640[var14 + 192] = 16777215;
        }
        class37.field837 = new int[256];
        for (int var15 = 0; var15 < 64; var15++) {
            class37.field837[var15] = var15 * 1024;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class37.field837[var16 + 64] = var16 * 4 + 65280;
        }
        for (int var17 = 0; var17 < 64; var17++) {
            class37.field837[var17 + 128] = var17 * 262144 + 65535;
        }
        if (arg2 != 17056) {
            field963 = -111;
        }
        for (int var18 = 0; var18 < 64; var18++) {
            class37.field837[var18 + 192] = 16777215;
        }
        class49.field1105 = new int[256];
        for (int var19 = 0; var19 < 64; var19++) {
            class49.field1105[var19] = var19 * 4;
        }
        for (int var20 = 0; var20 < 64; var20++) {
            class49.field1105[var20 + 64] = var20 * 262144 + 255;
        }
        for (int var21 = 0; var21 < 64; var21++) {
            class49.field1105[var21 + 128] = var21 * 1024 + 16711935;
        }
        for (int var22 = 0; var22 < 64; var22++) {
            class49.field1105[var22 + 192] = 16777215;
        }
        class49.field1102 = new int[256];
        class30.field738 = new int[32768];
        class12.field234 = new int[32768];
        class116.method954(null, (byte) -107);
        class102.field2399 = class102.field2400;
        class104.field2476 = new int[32768];
        class18.field340 = 0;
        class138.field3357 = new int[32768];
        class102.field2390 = class102.field2400;
        if (class76.field1795 == 0 || class82.field2017) {
            class70.method519((byte) -73, 10);
        } else {
            class70.method518(0, true, class76.field1795, class66.field1452, false, class102.field2400, class41.field913, 10);
        }
        class123.method1014(arg2 ^ 0x4293, false);
        class125.field3058 = true;
        class32.field772 = true;
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)V", line = 322)
    public static void method353(int arg0) {
        field959 = null;
        field961 = null;
        if (arg0 != -3157) {
            method352(null, null, -116, null);
        }
        field966 = null;
        field967 = null;
        field958 = null;
    }
}
