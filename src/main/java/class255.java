import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class255 {

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field3675 = -1;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "Llg;")
    public static class237 field3677 = new class237(64);

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "Liq;")
    public static class362 field3681 = new class362("M", "M", "M", "M");

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "Ljava/awt/Frame;")
    public static Frame field3680;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "[I")
    public static int[] field3673;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public static final void method1718(int arg0) {
        class411.field5899 = new String[500];
        class294.field4099 = class371.field5232.field4997 + arg0 + class371.field5232.field4990;
        field3671++;
        class22.field276 = class130.field1582.field4997 + class130.field1582.field4990 + 2;
        for (int var1 = 0; var1 < class411.field5899.length; var1++) {
            class411.field5899[var1] = "";
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V")
    public static final void method1719(int arg0) {
        if (arg0 != 618) {
            method1720((byte) 44, (String) null);
        }
        for (int var1 = 0; var1 < class399.field5699.length; var1++) {
            for (int var2 = 0; var2 < class399.field5699[0].length; var2++) {
                for (int var3 = 0; var3 < class399.field5699[0][0].length; var3++) {
                    class399.field5699[var1][var2][var3] = 0;
                }
            }
        }
        field3674++;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method1720(byte arg0, String arg1) {
        field3678++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var2 < var3 && class93.method520(arg0 ^ 0xFFFFE27D, arg1.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && class93.method520(arg0 - 7699, arg1.charAt(var3 + -1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class117.method722((byte) 36, var7)) {
                char var8 = class40.method250(var7, (byte) -26);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (arg0 != 74) {
            method1724((byte) -20);
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)I")
    public static final int method1721(int arg0, int arg1) {
        field3672++;
        if (arg0 != 127) {
            field3677 = null;
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILtq;)V")
    public static final void method1722(int arg0, class376 arg1) {
        if (arg0 > -51) {
            method1722(69, (class376) null);
        }
        field3676++;
        class123.field1514 = arg1;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method1723(boolean arg0, String arg1) {
        field3679++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = method1720((byte) 74, arg1);
        if (var2 == null) {
            return;
        }
        if (arg0) {
            field3673 = null;
        }
        for (int var3 = 0; var3 < class247.field3533; var3++) {
            String var4 = class334.field4733[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = method1720((byte) 74, var4);
            if (var5 != null && var5.equals(var2)) {
                class247.field3533--;
                for (int var6 = var3; var6 < class247.field3533; var6++) {
                    class334.field4733[var6] = class334.field4733[var6 + 1];
                    class300.field4216[var6] = class300.field4216[var6 + 1];
                    class109.field1344[var6] = class109.field1344[var6 + 1];
                    class403.field5769[var6] = class403.field5769[var6 + 1];
                    class48.field575[var6] = class48.field575[var6 + 1];
                    class370.field5220[var6] = class370.field5220[var6 + 1];
                }
                class56.field676 = class146.field1792;
                class207.field2947++;
                class62.field718.method2143(61, -2);
                class62.field718.method1583(class81.method457(arg1, (byte) -49), (byte) -121);
                class62.field718.method1596(arg1, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
    public static void method1724(byte arg0) {
        field3677 = null;
        field3673 = null;
        field3681 = null;
        field3680 = null;
        if (arg0 < 108) {
            method1721(-65, -88);
        }
    }
}
