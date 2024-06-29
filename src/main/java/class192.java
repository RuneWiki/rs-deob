import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class192 {

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "[Lpi;")
    public static class141[] field3094 = new class141[14];

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "Lii;")
    public static class263 field3093;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BI[Lqi;)V")
    public static final void method1423(byte arg0, int arg1, class131[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class131 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field2150 == 0) {
                    if (var4.field2052 != null) {
                        method1423((byte) -110, arg1, var4.field2052);
                    }
                    class17 var5 = (class17) class124.field1806.method1034((long) var4.field2073, (byte) 21);
                    if (var5 != null) {
                        class113.method832((byte) 68, arg1, var5.field191);
                    }
                }
                if (arg1 == 0 && var4.field2060 != null) {
                    class294 var6 = new class294();
                    var6.field4668 = var4;
                    var6.field4664 = var4.field2060;
                    class266.method1852(var6, 1);
                }
                if (arg1 == 1 && var4.field2055 != null) {
                    if (var4.field2061 >= 0) {
                        class131 var7 = class122.method891(var4.field2073, (byte) -128);
                        if (var7 == null || var7.field2052 == null || var4.field2061 >= var7.field2052.length || var7.field2052[var4.field2061] != var4) {
                            continue;
                        }
                    }
                    class294 var8 = new class294();
                    var8.field4668 = var4;
                    var8.field4664 = var4.field2055;
                    class266.method1852(var8, 1);
                }
            }
        }
        field3091++;
        if (arg0 != -110) {
            field3094 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)V")
    public static final void method1424(int arg0, byte arg1) {
        field3095++;
        if (arg1 > -112) {
            method1427('w', 89);
        }
        class201 var2 = class94.method738(-116, arg0, 7);
        var2.method1475(-743577184);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)V")
    public static final void method1425(int arg0, int arg1) {
        field3092++;
        class50.field734.method1548(arg0, arg1);
        class286.field4534.method1548(arg0, arg1);
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(IB)V")
    public static final void method1426(int arg0, byte arg1) {
        field3089++;
        class201 var2 = class94.method738(-89, arg0, 4);
        var2.method1475(-743577184);
        int var3 = 49 / ((arg1 - 27) / 63);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(CI)Z")
    public static final boolean method1427(char arg0, int arg1) {
        field3088++;
        if (arg1 != 11199) {
            method1427('D', 107);
        }
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;IZIZIJII)V")
    public static final void method1428(String arg0, boolean arg1, String arg2, int arg3, boolean arg4, int arg5, boolean arg6, int arg7, long arg8, int arg9, int arg10) {
        field3097++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class152 var14 = new class152(128);
        var14.method1074(10, 119);
        var14.method1094(-700861976, (arg4 ? 4 : 0) | (arg1 ? 2 : 0) | (arg6 ? 1 : 0));
        var14.method1069(arg8, -103);
        var14.method1119(var12[0], (byte) 45);
        var14.method1073(arg0, false);
        var14.method1119(var12[1], (byte) 48);
        var14.method1094(-700861976, class57.field821);
        var14.method1074(arg3, 92);
        var14.method1074(arg9, 65);
        var14.method1119(var12[2], (byte) -120);
        var14.method1094(-700861976, arg7);
        var14.method1094(-700861976, arg10);
        var14.method1119(var12[3], (byte) -104);
        var14.method1131(-120, class44.field645, class204.field3268);
        class152 var15 = new class152(350);
        var15.method1073(arg2, false);
        int var16 = 8 - (class86.method622(1, arg2) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method1074((int) (Math.random() * 255.0D), 116);
        }
        var15.method1104(8, var12);
        class220.field3532.field2511 = 0;
        if (arg5 >= -42) {
            field3093 = null;
        }
        class220.field3532.method1074(22, 95);
        class220.field3532.method1094(-700861976, var14.field2511 + var15.field2511 + 2);
        class220.field3532.method1094(-700861976, 545);
        class220.field3532.method1075(var14.field2523, -1279016712, var14.field2511, 0);
        class220.field3532.method1075(var15.field2523, -1279016712, var15.field2511, 0);
        class64.field950 = -3;
        class216.field3434 = 0;
        class213.field3409 = 0;
        class179.field2890 = 1;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
    public static void method1429(byte arg0) {
        int var1 = -3 / ((arg0 - 38) / 62);
        field3093 = null;
        field3094 = null;
    }
}
