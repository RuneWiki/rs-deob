import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class68 {

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "Lok;")
    public static class41 field1020 = class137.method956("Abbrechen", 45);

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "Lok;")
    private static class41 field1019 = class137.method956("Ok", 45);

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    public static int field1023 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "Lok;")
    public static class41 field1022 = field1019;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "Lmg;")
    public static class314 field1024;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V", line = 4)
    public static final void method494(int arg0) {
        class85.field1239 = 0;
        field1026++;
        class65.field997 = 0;
        class101.method705((byte) 44);
        class169.method1206((byte) 123);
        if (arg0 != 1) {
            method495((byte) -123);
        }
        class35.method233(arg0 + 2108607823);
        for (int var1 = 0; var1 < class65.field997; var1++) {
            int var2 = class239.field3834[var1];
            if (class18.field234 != class216.field3471[var2].field4294) {
                if (class216.field3471[var2].field758.method1011(arg0 + 120)) {
                    class112.method773((byte) -3, class216.field3471[var2]);
                }
                class216.field3471[var2].field758 = null;
                class216.field3471[var2] = null;
            }
        }
        if (class1.field7 != class164.field2597.field1640) {
            throw new RuntimeException("gnp1 pos:" + class164.field2597.field1640 + " psize:" + class1.field7);
        }
        for (int var3 = 0; var3 < class97.field1419; var3++) {
            if (class216.field3471[class101.field1441[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class97.field1419);
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V", line = 66)
    public static final void method495(byte arg0) {
        for (class187 var1 = (class187) class113.field1658.method609(126); var1 != null; var1 = (class187) class113.field1658.method616(118)) {
            int var2 = var1.field3052;
            if (class32.method223(var2, 255)) {
                boolean var3 = true;
                class302[] var4 = class273.field4446[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field4964;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field844;
                    class302 var7 = class165.method1157(false, var6);
                    if (var7 != null) {
                        class18.method91(28515, var7);
                    }
                }
            }
        }
        int var8 = -44 / ((-arg0 - 54) / 54);
        field1021++;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIJ)Z", line = 120)
    public static final boolean method496(int arg0, int arg1, int arg2, long arg3) {
        class308 var5 = class205.field3312[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field5210 != null && var5.field5210.field3856 == arg3) {
            return true;
        } else if (var5.field5208 != null && var5.field5208.field3184 == arg3) {
            return true;
        } else if (var5.field5207 != null && var5.field5207.field1508 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field5193; var6++) {
                if (var5.field5201[var6].field3672 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 166)
    public static final void method497(byte arg0, Component arg1) {
        arg1.removeMouseListener(class43.field679);
        arg1.removeMouseMotionListener(class43.field679);
        arg1.removeFocusListener(class43.field679);
        if (arg0 >= -77) {
            field1020 = (class41) null;
        }
        class110.field1553 = 0;
        field1025++;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)V", line = 183)
    public static final void method498(byte arg0) {
        class71.method516();
        field1027++;
        class109.field1530 = new class99[7];
        if (arg0 != -15) {
            return;
        }
        class109.field1530[1] = new class219();
        class109.field1530[2] = new class303();
        class109.field1530[3] = new class56();
        class109.field1530[4] = new class270();
        class109.field1530[5] = new class22();
        class109.field1530[6] = new class106();
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V", line = 201)
    public static void method499(int arg0) {
        field1019 = null;
        if (arg0 != 4) {
            field1024 = (class314) null;
        }
        field1022 = null;
        field1024 = null;
        field1020 = null;
    }
}
