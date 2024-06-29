import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class45 extends class97 {

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "I")
    public static int field1098 = 0;

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "Lea;")
    public static class38 field1102 = class9.method46((byte) 116, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
    public static int field1104 = 0;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "Lef;")
    public static class43 field1094 = null;

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "Lea;")
    public static class38 field1112 = class9.method46((byte) 111, "oberen Rand der Webseite ausw-=hlen)3");

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "Lea;")
    public static class38 field1106 = class9.method46((byte) 121, "<img=0>");

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
    public int field1092;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!eh", name = "v", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "I")
    public int field1103;

    @OriginalMember(owner = "client!eh", name = "B", descriptor = "I")
    public int field1105;

    @OriginalMember(owner = "client!eh", name = "D", descriptor = "I")
    public int field1107;

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "client!eh", name = "F", descriptor = "I")
    public int field1109;

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "I")
    public int field1110;

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
    public int field1113;

    @OriginalMember(owner = "client!eh", name = "K", descriptor = "I")
    public int field1114;

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!eh", name = "M", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!eh", name = "O", descriptor = "I")
    public int field1118;

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "Llh;")
    public class106 field1101;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "Lid;")
    public class76 field1096;

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "Lid;")
    public class76 field1117;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "[I")
    public int[] field1095;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIII)V")
    public static final void method326(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 0;
        if (arg4 != 16711680) {
            return;
        }
        while (var5 < class205.field4035) {
            if (class28.field552[var5] + class166.field3434[var5] > arg1 && arg0 + arg1 > class166.field3434[var5] && arg2 < class113.field2526[var5] + class176.field3559[var5] && arg2 + arg3 > class113.field2526[var5]) {
                class102.field2291[var5] = true;
            }
            var5++;
        }
        field1097++;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(IIIII)V")
    public static final void method327(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1111++;
        if (class50.field1250 == 1) {
            class177.field3592[class70.field1743 / 100].method755(class39.field846 - 8, class68.field1719 + -8);
        }
        if (class50.field1250 == 2) {
            class177.field3592[class70.field1743 / 100 + 4].method755(class39.field846 - 8, class68.field1719 - 8);
        }
        class155.method1079(false);
        int var5 = -115 / ((-arg2 - 62) / 46);
        if (!class154.field3208) {
            return;
        }
        int var6 = arg3 + 512 - 5;
        int var7 = arg1 + 20;
        class41.field914.method642(class163.method1168(-120, new class38[] { class57.field1436, class151.method1059(class39.field851, (byte) -114) }), var6, var7, 16776960, -1);
        int var11 = var7 + 15;
        Runtime var8 = Runtime.getRuntime();
        int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
        int var10 = 16776960;
        if (var9 > 32768 && class31.field610) {
            var10 = 16711680;
        }
        if (var9 > 65536 && !class31.field610) {
            var10 = 16711680;
        }
        class41.field914.method642(class163.method1168(-93, new class38[] { class168.field3451, class151.method1059(var9, (byte) -114), class88.field2038 }), var6, var11, var10, -1);
        var7 = var11 + 15;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZI)V")
    public static final void method328(boolean arg0, int arg1) {
        if (arg0) {
            field1112 = null;
        }
        class105 var2 = (class105) class19.field410.method183((byte) 77, (long) arg1);
        field1119++;
        if (var2 != null) {
            var2.method805(arg0);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
    public static void method329(byte arg0) {
        field1112 = null;
        if (arg0 >= -47) {
            method329((byte) -15);
        }
        field1094 = null;
        field1102 = null;
        field1106 = null;
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)V")
    public final void method330(int arg0) {
        int var2 = this.field1110;
        if (arg0 != -870) {
            method327(125, 126, 50, 49, 85);
        }
        field1099++;
        class106 var3 = this.field1101.method856((byte) 95);
        if (var3 == null) {
            this.field1109 = 0;
            this.field1110 = -1;
            this.field1095 = null;
            this.field1108 = 0;
            this.field1105 = 0;
        } else {
            this.field1095 = var3.field2376;
            this.field1105 = var3.field2367 * 128;
            this.field1110 = var3.field2371;
            this.field1108 = var3.field2389;
            this.field1109 = var3.field2354;
        }
        if (this.field1110 != var2 && this.field1096 != null) {
            class3.field100.method453(this.field1096);
            this.field1096 = null;
        }
    }
}
