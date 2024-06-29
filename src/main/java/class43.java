import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class43 implements Runnable {

    @OriginalMember(owner = "client!g", name = "n", descriptor = "[Lac;")
    public volatile class4[] field916 = new class4[2];

    @OriginalMember(owner = "client!g", name = "k", descriptor = "Z")
    public volatile boolean field913 = false;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "Z")
    public volatile boolean field910 = false;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "Lpe;")
    public static class109 field909 = class141.method1120("Sie haben gerade eine andere Welt verlassen)3", 0);

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field908 = 0;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Z")
    public static boolean field903 = false;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "Lpe;")
    private static class109 field920 = class141.method1120("Loaded config", 0);

    @OriginalMember(owner = "client!g", name = "d", descriptor = "Lpe;")
    public static class109 field906 = field920;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "Ljb;")
    public static class64 field918 = new class64(32);

    @OriginalMember(owner = "client!g", name = "s", descriptor = "Lpe;")
    private static class109 field921 = class141.method1120("To create a new account you need to", 0);

    @OriginalMember(owner = "client!g", name = "t", descriptor = "[I")
    public static int[] field922 = new int[50];

    @OriginalMember(owner = "client!g", name = "u", descriptor = "Lpe;")
    public static class109 field923 = field921;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "Ldf;")
    public class28 field915;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "[Le;")
    public static class29[] field904;

    @OriginalMember(owner = "client!g", name = "run", descriptor = "()V")
    public final void run() {
        field912++;
        this.field910 = true;
        try {
            while (!this.field913) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class4 var2 = this.field916[var1];
                    if (var2 != null) {
                        var2.method28(1);
                    }
                }
                class99.method797(10L, false);
                class95.method786(this.field915, 1, null);
            }
        } catch (Exception var9) {
            class112.method921(null, false, var9);
        } finally {
            Object var6 = null;
            this.field910 = false;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method392(int arg0, Component arg1) {
        if (arg0 != 128) {
            return;
        }
        Method var2 = class28.field648;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        field907++;
        arg1.addKeyListener(class115.field2562);
        arg1.addFocusListener(class115.field2562);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIZ[B)I")
    public static final int method393(int arg0, int arg1, boolean arg2, byte[] arg3) {
        field911++;
        if (!arg2) {
            method394(-128);
        }
        int var4 = -1;
        for (int var5 = arg1; var5 < arg0; var5++) {
            var4 = var4 >>> 8 ^ class156.field3583[(var4 ^ arg3[var5]) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public static void method394(int arg0) {
        field920 = null;
        field921 = null;
        field918 = null;
        field906 = null;
        field909 = null;
        if (arg0 < 88) {
            method397(82);
        }
        field904 = null;
        field923 = null;
        field922 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILwa;II)V")
    public static final void method395(int arg0, class154 arg1, int arg2, int arg3) {
        field914++;
        if (class66.field1334 != null || class3.field64 || (arg1 == null || class1.method9(-28, arg1) == null)) {
            return;
        }
        class66.field1334 = arg1;
        class100.field2100 = class1.method9(-28, arg1);
        class27.field631 = 0;
        class62.field1282 = arg0;
        class76.field1579 = arg2;
        class32.field690 = false;
        int var4 = 18 / ((arg3 + 29) / 50);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIB)V")
    public static final void method396(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field905++;
        if (class52.field1079 == arg3 && class64.field1315 == arg1 && (class46.field970 == arg4 || !class62.field1269)) {
            return;
        }
        class46.field970 = arg4;
        class64.field1315 = arg1;
        class52.field1079 = arg3;
        if (!class62.field1269) {
            class46.field970 = 0;
        }
        if (arg5 != 73) {
            return;
        }
        class118.method958(false, 25);
        class23.method216(class46.field967, true, (byte) -35);
        int var6 = class82.field1736;
        int var7 = field917;
        class82.field1736 = arg1 * 8 - 48;
        field917 = arg3 * 8 - 48;
        int var8 = class82.field1736 - var6;
        int var9 = class82.field1736;
        int var10 = field917 - var7;
        int var11 = field917;
        for (int var12 = 0; var12 < 32768; var12++) {
            class108 var28 = class52.field1067[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field3120[var29] -= var10;
                    var28.field3121[var29] -= var8;
                }
                var28.field3094 -= var10 * 128;
                var28.field3106 -= var8 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class50 var26 = class104.field2194[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field3120[var27] -= var10;
                    var26.field3121[var27] -= var8;
                }
                var26.field3094 -= var10 * 128;
                var26.field3106 -= var8 * 128;
            }
        }
        byte var14 = 104;
        byte var15 = 1;
        class75.field1513 = arg4;
        class136.field2975.method1125(false, arg0, arg5 ^ 0x1202, arg2);
        byte var16 = 0;
        if (var10 < 0) {
            var15 = -1;
            var16 = 103;
            var14 = -1;
        }
        byte var17 = 104;
        byte var18 = 0;
        byte var19 = 1;
        if (var8 < 0) {
            var19 = -1;
            var18 = 103;
            var17 = -1;
        }
        for (int var20 = var16; var20 != var14; var20 += var15) {
            for (int var22 = var18; var22 != var17; var22 += var19) {
                int var23 = var10 + var20;
                int var24 = var8 + var22;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        class92.field1987[var25][var20][var22] = class92.field1987[var25][var23][var24];
                    } else {
                        class92.field1987[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class133 var21 = (class133) class27.field630.method195((byte) 117); var21 != null; var21 = (class133) class27.field630.method198((byte) -84)) {
            var21.field2910 -= var8;
            var21.field2908 -= var10;
            if (var21.field2908 < 0 || var21.field2910 < 0 || var21.field2908 >= 104 || var21.field2910 >= 104) {
                var21.method101((byte) 118);
            }
        }
        class84.field1786 = -1;
        class47.field984 = false;
        if (class88.field1865 != 0) {
            class88.field1865 -= var10;
            class143.field3145 -= var8;
        }
        class64.field1320 = 0;
        class83.field1769.method200(0);
        class147.field3209.method200(0);
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
    public static final void method397(int arg0) {
        if (arg0 > -48) {
            return;
        }
        for (int var1 = 0; var1 < class42.field869; var1++) {
            int var2 = class84.field1784[var1];
            class50 var3 = class104.field2194[var2];
            int var4 = class82.field1733.method142(27467);
            if ((var4 & 0x2) != 0) {
                var4 += class82.field1733.method142(27467) << 8;
            }
            class19.method191(var4, var2, var3, (byte) 72);
        }
        field919++;
    }
}
