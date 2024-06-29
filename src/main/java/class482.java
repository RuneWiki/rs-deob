import java.awt.Canvas;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class482 extends class237 {

    @OriginalMember(owner = "client!bw", name = "k", descriptor = "Lao;")
    public static class188 field7068 = new class188(82, -1);

    @OriginalMember(owner = "client!bw", name = "u", descriptor = "I")
    public static int field7078 = 0;

    @OriginalMember(owner = "client!bw", name = "s", descriptor = "[Z")
    public static boolean[] field7076 = new boolean[100];

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "I")
    public static int field7069;

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "I")
    public static int field7070;

    @OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
    public int field7071;

    @OriginalMember(owner = "client!bw", name = "o", descriptor = "I")
    public int field7072;

    @OriginalMember(owner = "client!bw", name = "p", descriptor = "I")
    public int field7073;

    @OriginalMember(owner = "client!bw", name = "q", descriptor = "I")
    public static int field7074;

    @OriginalMember(owner = "client!bw", name = "r", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!bw", name = "w", descriptor = "I")
    public static int field7080;

    @OriginalMember(owner = "client!bw", name = "t", descriptor = "Lha;")
    public class41 field7077;

    @OriginalMember(owner = "client!bw", name = "v", descriptor = "[Lsf;")
    public class361[] field7079;

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)V", line = 8)
    public static void method2880(int arg0) {
        if (arg0 != 10) {
            method2883(-12L, 45);
        }
        field7068 = null;
        field7076 = null;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILqa;II)Z", line = 21)
    public final boolean method2881(int arg0, class162 arg1, int arg2, int arg3) {
        if (arg0 >= -107) {
            this.field7072 = 101;
        }
        field7070++;
        if (this.field7079 != null) {
            for (int var5 = 0; var5 < this.field7079.length; var5++) {
                if (this.field7079[var5].method2320(arg2, arg3) && this.field7077.method122(arg3, -1, arg2, arg1)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)V", line = 58)
    public static final void method2882(int arg0, int arg1) {
        field7075++;
        if (class279.field4015 == arg1) {
            return;
        }
        class237.field3436 = class83.field1366 = class298.field4259[arg1];
        class162.method1177(1);
        class504.field7404 = new int[class237.field3436][class83.field1366];
        class332.field5101 = new int[4][class237.field3436 >> 3][class83.field1366 >> 3];
        int var2 = 48 % ((22 - arg0) / 32);
        class522.field7666 = new int[class237.field3436][class83.field1366];
        for (int var3 = 0; var3 < 4; var3++) {
            class255.field3679[var3] = class189.method1303(class237.field3436, 1, class83.field1366);
        }
        class275.field3993 = new byte[4][class237.field3436][class83.field1366];
        class219.method1454((byte) -43, 4, class83.field1366, class237.field3436);
        class436.method2639(class83.field1366 >> 3, 0, class237.field3436 >> 3, class394.field5821);
        class279.field4015 = arg1;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 90)
    public static final String method2883(long arg0, int arg1) {
        class112.field1772.setTime(new Date(arg0));
        field7074++;
        int var3 = class112.field1772.get(7);
        int var4 = class112.field1772.get(5);
        int var5 = class112.field1772.get(2);
        int var6 = class112.field1772.get(1);
        int var7 = class112.field1772.get(11);
        if (arg1 <= 69) {
            field7076 = null;
        }
        int var8 = class112.field1772.get(12);
        int var9 = class112.field1772.get(13);
        return class367.field5510[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class63.field1115[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "(I)V", line = 116)
    public static final void method2884(int arg0) {
        class120.field1887.method2350((byte) 112);
        field7080++;
        class465.field6835.method2350((byte) 112);
        class279.field4013.method2350((byte) 112);
        class239.field3483.method2350((byte) 112);
        int var1 = 74 % ((arg0 - 48) / 59);
        class417.field6164.method2350((byte) 112);
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lqa;I)V", line = 144)
    public static final void method2885(class162 arg0, int arg1) {
        field7069++;
        if (class37.field571.method2266(-1) == 0) {
            return;
        }
        if (class399.field5865 == 0) {
            for (class401 var2 = (class401) class37.field571.method2257((byte) 122); var2 != null; var2 = (class401) class37.field571.method2256(-128)) {
                class8.field111.method3073(var2.field5881, var2.field5883 ? class95.field1558.field1060 : null, var2.field5882, arg0, class125.field1923, arg0, var2.field5885, false, var2.field5886, arg1 + 23555, var2.field5887, false);
                var2.method2663(-114);
            }
            class67.method582(-25099);
        } else {
            if (class214.field3089 == null) {
                Canvas var3 = new Canvas();
                var3.setSize(36, 32);
                class214.field3089 = class162.method1179(var3, -16, 0, 0, class112.field1785, class237.field3440);
                class400.field5877 = class214.field3089.method453(class114.method842(arg1 + 23346, class420.field6181, 0, class101.field1615), class158.method1137(class460.field6798, class101.field1615, 0), true);
            }
            for (class401 var4 = (class401) class37.field571.method2257((byte) 96); var4 != null; var4 = (class401) class37.field571.method2256(-65)) {
                class8.field111.method3073(var4.field5881, var4.field5883 ? class95.field1558.field1060 : null, var4.field5882, class214.field3089, class400.field5877, arg0, var4.field5885, false, var4.field5886, -124, var4.field5887, false);
                var4.method2663(arg1 ^ 0x5BF9);
            }
        }
        if (arg1 != -23440) {
            field7078 = -5;
        }
    }
}
