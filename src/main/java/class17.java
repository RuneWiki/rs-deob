import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class17 extends class26 {

    @OriginalMember(owner = "client!cb", name = "V", descriptor = "Lec;")
    public static class32 field335 = class73.method594("Suche nach Updates )2 ", true);

    @OriginalMember(owner = "client!cb", name = "cb", descriptor = "Lec;")
    public static class32 field342 = class73.method594("Stufe)2", true);

    @OriginalMember(owner = "client!cb", name = "ab", descriptor = "Lec;")
    public static class32 field340 = class73.method594("Untersuchen", true);

    @OriginalMember(owner = "client!cb", name = "hb", descriptor = "[I")
    public static int[] field347 = new int[100];

    @OriginalMember(owner = "client!cb", name = "ib", descriptor = "Lec;")
    public static class32 field348 = class73.method594("Die Adresse dieses Computers wurde gesperrt)1", true);

    @OriginalMember(owner = "client!cb", name = "db", descriptor = "[I")
    public static int[] field343 = new int[25];

    @OriginalMember(owner = "client!cb", name = "kb", descriptor = "Lec;")
    public static class32 field350 = class73.method594(":chalreq:", true);

    @OriginalMember(owner = "client!cb", name = "lb", descriptor = "[I")
    public static int[] field351 = new int[5];

    @OriginalMember(owner = "client!cb", name = "T", descriptor = "I")
    public int field333;

    @OriginalMember(owner = "client!cb", name = "U", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!cb", name = "W", descriptor = "I")
    public int field336;

    @OriginalMember(owner = "client!cb", name = "X", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!cb", name = "Y", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!cb", name = "Z", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!cb", name = "bb", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!cb", name = "eb", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!cb", name = "fb", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!cb", name = "gb", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!cb", name = "jb", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(III)I")
    public static final int method125(int arg0, int arg1, int arg2) {
        if (arg0 < arg1) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        if (arg2 > -9) {
            field343 = null;
        }
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        field344++;
        return arg0;
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)V")
    public static void method126(int arg0) {
        int var1 = -11 / ((arg0 - 48) / 41);
        field350 = null;
        field342 = null;
        field348 = null;
        field343 = null;
        field347 = null;
        field335 = null;
        field351 = null;
        field340 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLf;II)V")
    public static final void method127(byte arg0, class36 arg1, int arg2, int arg3) {
        field339++;
        if (class158.field3631 != null || class26.field476 || (arg1 == null || class145.method1090(arg1, (byte) -76) == null)) {
            return;
        }
        int var4 = -96 % ((-arg0 - 15) / 44);
        class158.field3631 = arg1;
        class117.field2809 = class145.method1090(arg1, (byte) 88);
        class45.field1069 = arg3;
        class88.field2031 = arg2;
        class77.field1790 = false;
        class9.field163 = 0;
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)V")
    public static final void method128(int arg0) {
        field345++;
        class62.field1407.method491(-97);
        if (arg0 <= 119) {
            method126(21);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIII)V")
    public static final void method129(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field337++;
        if (class135.field3149 == 1) {
            class1.field2[class154.field3545 / 100].method370(class27.field499 - 8, class154.field3547 + -8);
        }
        if (class135.field3149 == 2) {
            class1.field2[class154.field3545 / 100 + 4].method370(class27.field499 - 8, class154.field3547 + -8);
        }
        class110.method874(false);
        if (arg2 != 12504 || !class157.field3607) {
            return;
        }
        int var5 = arg3 + 507;
        int var6 = arg0 + 20;
        int var7 = 16776960;
        class121.field2878.method779(class52.method403(new class32[] { class79.field1834, class159.method1230(class98.field2272, 0) }, (byte) -20), var5, var6, 16776960, -1);
        Runtime var8 = Runtime.getRuntime();
        int var10 = var6 + 15;
        int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
        if (var9 > 32768 && class154.field3531) {
            var7 = 16711680;
        }
        if (var9 > 65536 && !class154.field3531) {
            var7 = 16711680;
        }
        class121.field2878.method779(class52.method403(new class32[] { class13.field222, class159.method1230(var9, 0), class112.field2630 }, (byte) -20), var5, var10, var7, -1);
        var6 = var10 + 15;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)Lo;")
    public static final class97 method130(int arg0, int arg1) {
        class97 var2 = (class97) class9.field164.method486(-28825, (long) arg1);
        field346++;
        if (arg0 >= -67) {
            field343 = null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class154.field3514.method206(9, arg1, -113);
        class97 var4 = new class97();
        var4.field2226 = arg1;
        if (var3 != null) {
            var4.method760((byte) -118, new class66(var3));
        }
        var4.method764((byte) 85);
        class9.field164.method485((long) arg1, (byte) -120, var4);
        return var4;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method131(int arg0, Component arg1) {
        field338++;
        arg1.removeKeyListener(class38.field920);
        arg1.removeFocusListener(class38.field920);
        class14.field231 = -1;
        if (arg0 != 32768) {
            field348 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)Lod;")
    public final class101 method132(byte arg0) {
        if (arg0 != 109) {
            field343 = null;
        }
        field334++;
        return class146.method1094(this.field333, arg0 - 2).method471(this.field336, 0);
    }
}
