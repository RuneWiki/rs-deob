import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class119 {

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "Lho;")
    public static class103 field1554 = new class103(19, 7);

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "Ljava/awt/Frame;")
    public static Frame field1559;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
    public static final void method710(byte arg0) {
        if (arg0 != 112) {
            field1559 = null;
        }
        if (class235.field3146 != null) {
            class235.field3146.method1044(false);
        }
        field1558++;
        if (class153.field2005 != null) {
            class153.field2005.method1044(false);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lza;B)V")
    public static final void method711(class287 arg0, byte arg1) {
        if (arg1 <= 0) {
            method711(null, (byte) -98);
        }
        field1557++;
        if (!(class391.field5656 >= 2 || class323.field4302) || class188.field2436 != null) {
            return;
        }
        String var2;
        if (class323.field4302 && class391.field5656 < 2) {
            var2 = class48.field531 + class220.field2972.method1823(class374.field5072, (byte) -88) + class191.field2465 + " ->";
        } else if (class59.field690 && class413.field5893.method1472(28251, 81) && class391.field5656 > 2) {
            var2 = class496.method2988((byte) 124, (class36) class69.field806.field2165.field6345.field6345);
        } else {
            class36 var3 = (class36) class69.field806.field2165.field6345;
            var2 = class496.method2988((byte) 124, var3);
            int[] var4 = null;
            if (class75.method436(var3.field361, 115)) {
                var4 = class237.field3158.method236(-18315, (int) var3.field367).field2636;
            } else if (var3.field364 != -1) {
                var4 = class237.field3158.method236(-18315, var3.field364).field2636;
            } else if (class497.method2990(var3.field361, 124)) {
                class22 var5 = class339.field4484[(int) var3.field367];
                if (var5 != null) {
                    class212 var6 = var5.field220;
                    if (var6.field2903 != null) {
                        var6 = var6.method1350(class52.field606, -1);
                    }
                    if (var6 != null) {
                        var4 = var6.field2912;
                    }
                }
            } else if (class195.method1115(-14, var3.field361)) {
                Object var7 = null;
                class70 var8;
                if (var3.field361 == 1002) {
                    var8 = class123.field1593.method2920((int) var3.field367, 19219);
                } else {
                    var8 = class123.field1593.method2920((int) (var3.field367 >>> 32 & 0x7FFFFFFFL), 19219);
                }
                if (var8.field848 != null) {
                    var8 = var8.method403(-1, class52.field606);
                }
                if (var8 != null) {
                    var4 = var8.field879;
                }
            }
            if (var4 != null) {
                var2 = var2 + class91.method507((byte) 27, var4);
            }
        }
        if (class391.field5656 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class391.field5656 - 2) + class151.field1975.method1823(class374.field5072, (byte) -88);
        }
        if (class382.field5530 != null) {
            class316 var9 = class382.field5530.method2780(arg0, (byte) -89);
            if (var9 == null) {
                var9 = class79.field976;
            }
            var9.method1875(class522.field7683, class382.field5530.field6557, class382.field5530.field6649, 4908, class382.field5530.field6612, class382.field5530.field6691, class382.field5530.field6677, class241.field3194, class125.field1615, class22.field212, class512.field7462, var2, class374.field5074, class382.field5530.field6573, class60.field700);
            class317.method1889(class522.field7683[1], (byte) -23, class522.field7683[3], class522.field7683[2], class522.field7683[0]);
        } else if (class176.field2277 != null && class381.field5520 == class111.field1480) {
            int var10 = class79.field976.method1872(class527.field7741 + 16, class102.field1391 + 4, -128, 0, class125.field1615, class512.field7462, var2, class60.field700, class241.field3194, 16777215);
            class317.method1889(class527.field7741, (byte) 116, 16, var10 + class121.field1570.method1066(-107, var2), class102.field1391 + 4);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static void method712(int arg0) {
        field1554 = null;
        if (arg0 != 0) {
            field1554 = null;
        }
        field1559 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)Z")
    public static final boolean method713(int arg0, int arg1) {
        field1555++;
        int var2 = 2 % ((-arg1 - 35) / 50);
        return (arg0 & -arg0) == arg0;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IBLjava/lang/String;I)V")
    public static final void method714(String arg0, String arg1, int arg2, byte arg3, String arg4, int arg5) {
        if (arg3 != 102) {
            method711(null, (byte) 13);
        }
        field1556++;
        class124.method755(null, arg0, -1, true, arg4, arg2, arg1, arg5);
    }
}
