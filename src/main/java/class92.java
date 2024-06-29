import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class class92 extends class106 {

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "S")
    public short field1928 = -32768;

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "Leh;")
    public static class47 field1923 = class195.method1282((byte) -4, "null");

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "[Lpd;")
    public static class139[] field1924 = new class139[50];

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
    public static int field1925 = 0;

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "I")
    public static int field1930 = 0;

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "Leh;")
    public static class47 field1931 = class195.method1282((byte) -4, "m");

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lah;Lah;ZB)V")
    public static final void method740(class9 arg0, class9 arg1, boolean arg2, byte arg3) {
        class86.field1849 = arg2;
        class90.field1896 = arg1;
        field1929++;
        class167.field3249 = arg0;
        if (arg3 >= -95) {
            method740(null, null, false, (byte) 13);
        }
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V")
    public static void method741(int arg0) {
        if (arg0 == -15927) {
            field1923 = null;
            field1924 = null;
            field1931 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZII)I")
    public static final int method742(boolean arg0, int arg1, int arg2) {
        field1922++;
        int var3 = arg1 >> 31 & arg2 - 1;
        return arg0 ? 61 : (arg1 + (arg1 >>> 31)) % arg2 + var3;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(III)J")
    public static final long method743(int arg0, int arg1, int arg2) {
        class152 var3 = class173.field3351[arg0][arg1][arg2];
        return var3 == null || var3.field2991 == null ? 0L : var3.field2991.field874;
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)Ld;")
    public class30 method708(int arg0) {
        if (arg0 != 21831) {
            method743(-9, 32, 67);
        }
        field1926++;
        return null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILah;Lah;Ljava/awt/Component;)V")
    public static final void method744(int arg0, class9 arg1, class9 arg2, Component arg3) {
        field1921++;
        if (client.field554) {
            return;
        }
        class169.method1150();
        byte[] var4 = arg2.method78(class161.field3127, -2294, class39.field772);
        class70.field1538 = new class50(var4, arg3);
        class19.field377 = class70.field1538.method438();
        class138.field2714 = class179.method1193(class161.field3127, class3.field38, 4096, arg1);
        class64.field1407 = class179.method1193(class161.field3127, class141.field2777, 4096, arg1);
        class181.field3462 = class179.method1193(class161.field3127, class132.field2607, 4096, arg1);
        class37.field729 = class68.method587(class161.field3127, (byte) 83, arg1, class148.field2908);
        class198.field3866 = class68.method587(class161.field3127, (byte) 124, arg1, class90.field1887);
        class173.field3355 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            class173.field3355[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class173.field3355[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class173.field3355[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class173.field3355[var8 + 192] = 16777215;
        }
        class61.field1200 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class61.field1200[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class61.field1200[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class61.field1200[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = arg0; var12 < 64; var12++) {
            class61.field1200[var12 + 192] = 16777215;
        }
        class85.field1807 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class85.field1807[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class85.field1807[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class85.field1807[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class85.field1807[var16 + 192] = 16777215;
        }
        class155.field3037 = new int[256];
        class3.field47 = new int[32768];
        class68.field1460 = new int[32768];
        class64.method537(null, arg0 ^ 0xFFFFD5C1);
        class62.field1333 = new int[32768];
        class12.field240 = new int[32768];
        class95.field1961 = 0;
        class161.field3142 = class161.field3127;
        if (class146.field2855 == 0) {
            class182.field3492 = true;
        } else {
            class182.field3492 = false;
        }
        class125.field2512 = false;
        class161.field3126 = class161.field3127;
        if (class182.field3492) {
            class189.method1245(2, (byte) -51);
        } else {
            class192.method1260(128, class23.field453, class161.field3127, 255, class189.field3667, false, 2);
        }
        class106.method861(false, 4);
        client.field554 = true;
        class70.field1538.method429(0, 0);
        class19.field377.method429(382, 0);
        class138.field2714.method327(382 - class138.field2714.field749 / 2, 18);
        class141.field2759 = new class50(128, 254);
        class70.field1541 = new class50(128, 254);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIIIJ)V")
    public void method45(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class30 var11 = this.method708(21831);
        if (var11 != null) {
            var11.method45(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1928 = var11.field1928;
        }
        field1920++;
    }
}
