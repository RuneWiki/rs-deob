import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class15 extends Canvas {

    @OriginalMember(owner = "client!we", name = "j", descriptor = "Ljava/awt/Component;")
    private Component field154;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "[B")
    public static byte[] field150 = new byte[520];

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Z")
    public static boolean field146 = false;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "[I")
    public static int[] field149 = new int[25];

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Ljava/lang/String;")
    public static String field151 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Lhc;")
    public static class235 field153;

    @OriginalMember(owner = "client!we", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field147++;
        this.field154.paint(arg0);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V")
    public static final void method86(int arg0, int arg1) {
        if (arg1 != 2000) {
            method88(97);
        }
        field157++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class137.method926((byte) 23);
        } else if (arg0 == 2) {
            class76.method485(false);
        } else if (arg0 == 3) {
            class158.method1053((byte) 105);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!we", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field152++;
        this.field154.update(arg0);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IILai;II)V")
    public static final void method87(int arg0, int arg1, class88 arg2, int arg3, int arg4) {
        field148++;
        if (class217.field3280 == arg2 || class68.field925 >= 400) {
            return;
        }
        String var11;
        if (arg2.field1191 == 0) {
            boolean var5 = true;
            if (class217.field3280.field1200 != -1 && arg2.field1200 != -1) {
                int var6 = class217.field3280.field1190 > arg2.field1190 ? class217.field3280.field1190 : arg2.field1190;
                int var7 = class217.field3280.field1200 >= arg2.field1200 ? arg2.field1200 : class217.field3280.field1200;
                int var8 = class217.field3280.field1190 - arg2.field1190;
                if (var8 < 0) {
                    var8 = -var8;
                }
                int var9 = var6 * 10 / 100 + var7 + 5;
                if (var8 > var9) {
                    var5 = false;
                }
            }
            String var10 = class124.field1746 == 1 ? class78.field1092 : class101.field1421;
            if (arg2.field1193 <= arg2.field1190) {
                var11 = arg2.method560(arg4 ^ 0x32) + (var5 ? class227.method1504(class217.field3280.field1190, arg2.field1190, 2) : "<col=ffffff>") + " (" + var10 + arg2.field1190 + ")";
            } else {
                var11 = arg2.method560(50) + (var5 ? class227.method1504(class217.field3280.field1190, arg2.field1190, arg4 ^ 0x2) : "<col=ffffff>") + " (" + var10 + arg2.field1190 + "+" + (arg2.field1193 - arg2.field1190) + ")";
            }
        } else {
            var11 = arg2.method560(50) + " (" + class79.field1096 + arg2.field1191 + ")";
        }
        if (class141.field1963 == 1) {
            class238.method1593(class265.field3976, (long) arg1, -30789, arg0, class224.field3405, class238.field3612 + " -> <col=ffffff>" + var11, (short) 39, arg3);
            class120.field1684++;
        } else if (!class11.field113) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class31.field420[var12] != null) {
                    boolean var14 = false;
                    short var15 = 0;
                    if (class124.field1746 == 0 && class31.field420[var12].equalsIgnoreCase(class132.field1872)) {
                        if (arg2.field1190 > class217.field3280.field1190) {
                            var15 = 2000;
                        }
                        if (class217.field3280.field1196 != 0 && arg2.field1196 != 0) {
                            if (class217.field3280.field1196 == arg2.field1196) {
                                var15 = 2000;
                            } else {
                                var15 = 0;
                            }
                        }
                    } else if (class163.field2272[var12]) {
                        var15 = 2000;
                    }
                    class102.field1427++;
                    short var16 = class41.field616[var12];
                    short var17 = (short) (var15 + var16);
                    class238.method1593(class48.field701[var12], (long) arg1, arg4 - 30789, arg0, class31.field420[var12], "<col=ffffff>" + var11, var17, arg3);
                }
            }
        } else if ((class285.field4469 & 0x8) != 0) {
            class33.field506++;
            class238.method1593(class93.field1303, (long) arg1, arg4 - 30789, arg0, class168.field2332, class54.field791 + " -> <col=ffffff>" + var11, (short) 57, arg3);
        }
        for (int var13 = arg4; var13 < class68.field925; var13++) {
            if (class221.field3306[var13] == 9) {
                class41.field612[var13] = "<col=ffffff>" + var11;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public static final void method88(int arg0) {
        if (arg0 != -15971) {
            return;
        }
        class198.field2749 = null;
        class273.field4208 = null;
        class9.field79 = null;
        class39.field576 = null;
        class140.field1956 = null;
        field156++;
        class50.field729 = null;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class15(Component arg0) {
        this.field154 = arg0;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
    public static void method89(byte arg0) {
        if (arg0 != -59) {
            method89((byte) -71);
        }
        field151 = null;
        field150 = null;
        field149 = null;
        field153 = null;
    }
}
