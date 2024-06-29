import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public abstract class class34 {

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public int field686;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public int field689;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public int field697;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "[B")
    public static byte[] field691 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field695 = 0;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "Lob;")
    private static class141 field696 = class175.method1195(40, "cyan:");

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Lob;")
    public static class141 field692 = field696;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Lob;")
    public static class141 field687 = field696;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "Lpe;")
    public static class154 field690;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "[[Z")
    public static boolean[][] field694;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static void method240(int arg0) {
        field690 = null;
        if (arg0 > -124) {
            return;
        }
        field687 = null;
        field696 = null;
        field691 = null;
        field692 = null;
        field694 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public static final void method241(byte arg0) {
        class209.field3953 = null;
        class139.field2676 = null;
        class5.field61 = null;
        class118.field2295 = null;
        class176.field3497 = null;
        class57.field1118 = null;
        class132.field2519 = null;
        if (arg0 != 105) {
            field691 = null;
        }
        class60.field1178 = null;
        field688++;
        class191.field3694 = null;
        class165.field3190 = null;
        class9.field158 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBI)V")
    public abstract void method24(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLob;)V")
    public static final void method242(byte arg0, class141 arg1) {
        field693++;
        if (class69.field1356.field3661 == null) {
            return;
        }
        try {
            class141 var2 = class68.field1343.method930(class69.field1356.field3661, (byte) 71);
            class141 var3 = class164.field3165.method930(class69.field1356.field3661, (byte) 87);
            class141 var4 = class220.method1422(new class141[] { var2, class6.field84, arg1, class9.field145, var3 }, -3);
            class141 var5;
            if (arg1.method908(false) == 0) {
                var5 = class220.method1422(new class141[] { var4, class83.field1664 }, -3);
            } else {
                var5 = class220.method1422(new class141[] { var4, class221.field4192, class195.method1317(class1.method2((byte) -95) + 94608000000L, true), class24.field461, class125.method803(28860, 94608000L) }, -3);
            }
            if (arg0 != 103) {
                field692 = null;
            }
            class220.method1422(new class141[] { class2.field25, var5, class8.field123 }, -3).method906(class69.field1356.field3661, (byte) 116);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BII)V")
    public abstract void method27(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILpe;Ljava/awt/Component;Lpe;)V")
    public static final void method243(int arg0, class154 arg1, Component arg2, class154 arg3) {
        field685++;
        if (class191.field3685) {
            return;
        }
        class148.method1026();
        byte[] var4 = arg3.method1065((byte) 104, 0, class175.field3473);
        class107.field2051 = new class102(var4, arg2);
        class146.field2798 = class107.field2051.method677();
        class159.field3071 = class143.method942(arg0 + 6693, arg1, class187.field3629);
        class157.field3023 = class143.method942(1, arg1, class54.field1048);
        class218.field4143 = class143.method942(1, arg1, class43.field841);
        class224.field4230 = class225.method1445(arg1, -23023, class169.field3261);
        class204.field3898 = class225.method1445(arg1, -23023, class206.field3918);
        class85.field1701 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            class85.field1701[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class85.field1701[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class85.field1701[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class85.field1701[var8 + 192] = 16777215;
        }
        class195.field3726 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class195.field3726[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class195.field3726[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class195.field3726[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class195.field3726[var12 + 192] = 16777215;
        }
        class131.field2505 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class131.field2505[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class131.field2505[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class131.field2505[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class131.field2505[var16 + 192] = 16777215;
        }
        class142.field2748 = new int[32768];
        class136.field2593 = new int[256];
        class111.field2136 = new int[32768];
        class200.method1334(null, arg0 + 36191);
        if (class14.field263 == 0) {
            class138.field2648 = true;
        } else {
            class138.field2648 = false;
        }
        class61.field1190 = 0;
        class105.field2021 = class105.field2020;
        class105.field2027 = class105.field2020;
        class9.field149 = new int[32768];
        class169.field3244 = new int[32768];
        class87.field1739 = false;
        if (class138.field2648) {
            class153.method1053((byte) 108, 2);
        } else {
            class196.method1324(class54.field1076, class159.field3067, false, 255, 0, arg0 ^ 0xFFFFE5DC, 2);
        }
        class160.method1121(false, arg0 ^ 0x3B0C);
        class191.field3685 = true;
        class107.field2051.method681(0, 0);
        class146.field2798.method681(382, 0);
        class159.field3071.method349(382 - class159.field3071.field1003 / 2, 18);
        if (arg0 == -6692) {
            class117.field2288 = new class102(128, 254);
            class11.field222 = new class102(128, 254);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIZ)V")
    public abstract void method22(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(III)V")
    public class34(int arg0, int arg1, int arg2) {
        this.field686 = arg2;
        this.field689 = arg1;
        this.field697 = arg0;
    }
}
