import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class140 {

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field3185 = 0;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lid;")
    public static class60 field3184 = class11.method72(" loggt sich ein)3", (byte) 92);

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "[I")
    public static int[] field3199 = new int[4000];

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "Lid;")
    public static class60 field3191 = class11.method72("Ung-Ultige Verbindung mit einem Anmelde)2Server)3", (byte) -77);

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "[I")
    public static int[] field3189 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Lid;")
    public static class60 field3187 = class11.method72("Geben Sie Ihren Benutzernamen", (byte) 115);

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field3197 = -1;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "Lid;")
    private static class60 field3202 = class11.method72(" more options", (byte) -45);

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Lid;")
    public static class60 field3188 = field3202;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "Lie;")
    public static class61 field3186;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3193;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lie;BLie;Ljava/awt/Component;)V")
    public static final void method1087(class61 arg0, byte arg1, class61 arg2, Component arg3) {
        field3190++;
        if (class75.field1811) {
            return;
        }
        class130.method1029();
        byte[] var4 = arg0.method469(class75.field1815, class141.field3219, (byte) 94);
        class22.field551 = new class6(var4, arg3);
        class86.field2140 = class22.field551.method41();
        class66.field1634 = class47.method369(class141.field3219, (byte) 82, class74.field1793, arg2);
        class124.field2868 = class47.method369(class141.field3219, (byte) 86, class45.field1176, arg2);
        class15.field347 = class47.method369(class141.field3219, (byte) -120, class157.field3607, arg2);
        class146.field3288 = class120.method935(arg2, (byte) -98, class109.field2649, class141.field3219);
        class41.field1100 = class120.method935(arg2, (byte) -125, class158.field3620, class141.field3219);
        client.field509 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            client.field509[var5] = var5 * 262144;
        }
        if (arg1 != 104) {
            method1092(68, (byte) 111);
        }
        for (int var6 = 0; var6 < 64; var6++) {
            client.field509[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            client.field509[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            client.field509[var8 + 192] = 16777215;
        }
        class24.field581 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class24.field581[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class24.field581[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class24.field581[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class24.field581[var12 + 192] = 16777215;
        }
        class52.field1335 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class52.field1335[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class52.field1335[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class52.field1335[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class52.field1335[var16 + 192] = 16777215;
        }
        class48.field1263 = new int[32768];
        class64.field1606 = new int[32768];
        class94.field2312 = new int[256];
        class112.method902(false, null);
        class129.field2937 = false;
        class141.field3218 = class141.field3219;
        class87.field2188 = new int[32768];
        class54.field1357 = new int[32768];
        if (class9.field156 == 0) {
            class31.field725 = true;
        } else {
            class31.field725 = false;
        }
        class89.field2221 = 0;
        class141.field3209 = class141.field3219;
        if (class31.field725) {
            class78.method632(2, 19339);
        } else {
            class38.method296((byte) 111, false, class28.field661, 255, class35.field883, 2, class141.field3219);
        }
        class90.method733(false, (byte) -87);
        class75.field1811 = true;
        class22.field551.method39(0, 0);
        class86.field2140.method39(382, 0);
        class66.field1634.method224(382 - class66.field1634.field698 / 2, 18);
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
    public class140() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIZLa;)V")
    public static final void method1088(int arg0, int arg1, boolean arg2, class1 arg3) {
        if (!arg2) {
            method1095(null, 40);
        }
        if (arg3.field806 == arg0 && arg0 != -1) {
            int var4 = class44.method344(arg0, (byte) -111).field1208;
            if (var4 == 1) {
                arg3.field842 = arg1;
                arg3.field858 = 0;
                arg3.field811 = 0;
                arg3.field853 = 0;
            }
            if (var4 == 2) {
                arg3.field853 = 0;
            }
        } else if (arg0 == -1 || arg3.field806 == -1 || class44.method344(arg0, (byte) -117).field1199 >= class44.method344(arg3.field806, (byte) -45).field1199) {
            arg3.field806 = arg0;
            arg3.field811 = 0;
            arg3.field844 = arg3.field843;
            arg3.field842 = arg1;
            arg3.field858 = 0;
            arg3.field853 = 0;
        }
        field3201++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static void method1089(byte arg0) {
        field3191 = null;
        field3186 = null;
        field3187 = null;
        field3199 = null;
        field3188 = null;
        field3184 = null;
        field3189 = null;
        if (arg0 == -14) {
            field3202 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)V")
    public static final void method1090(int arg0, int arg1, int arg2) {
        class45.field1184++;
        class22.field519.method1214(118, 0);
        field3196++;
        class22.field519.method800(-10255, arg2);
        class22.field519.method834((byte) -53, arg0);
        if (arg1 != -30622) {
            field3184 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILie;Lie;II)Lh;")
    public static final class49 method1091(int arg0, class61 arg1, class61 arg2, int arg3, int arg4) {
        if (arg4 != -17444) {
            method1090(98, 0, -114);
        }
        field3192++;
        return class77.method628(arg3, arg0, arg2, arg4 + 17323) ? class69.method519(10, arg1.method473((byte) 115, arg3, arg0)) : null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)I")
    public static final int method1092(int arg0, byte arg1) {
        field3195++;
        if (arg1 >= -10) {
            field3199 = null;
        }
        return arg0 >> 11 & 0x3F;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B[BLof;)V")
    public final void method1093(byte arg0, byte[] arg1, class103 arg2) {
        field3203++;
        if (arg2.field2498[arg2.field2501] != 31 || arg2.field2498[arg2.field2501 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field3193 == null) {
            this.field3193 = new Inflater(true);
        }
        if (arg0 != -117) {
            method1092(-42, (byte) 2);
        }
        try {
            this.field3193.setInput(arg2.field2498, arg2.field2501 + 10, -8 - arg2.field2501 - 10 + arg2.field2498.length);
            this.field3193.inflate(arg1);
        } catch (Exception var4) {
            this.field3193.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field3193.reset();
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static final void method1094(int arg0) {
        field3200++;
        if (arg0 != 2047) {
            method1089((byte) -85);
        }
        for (int var1 = -1; var1 < class44.field1170; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class121.field2781[var1];
            }
            class1 var3 = class81.field2016[var2];
            if (var3 != null) {
                class144.method1109((byte) 41, var3, 1);
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
    public static final int method1095(KeyEvent arg0, int arg1) {
        field3194++;
        int var2 = arg0.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else if (arg1 >= -70) {
            return -114;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(III)V")
    private class140(int arg0, int arg1, int arg2) {
    }
}
