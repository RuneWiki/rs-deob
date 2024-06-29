import jagex3.jagmisc.jagmisc;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class165 {

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "[I")
    public static int[] field2428 = new int[50];

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "[I")
    public static int[] field2426 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "Ltn;")
    public static class60 field2424 = new class60(82, -1);

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "Lti;")
    public static class309 field2430;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/awt/Canvas;IILl;)Lza;", line = 3)
    public static final class290 method1043(Canvas arg0, int arg1, int arg2, class16 arg3) {
        if (arg1 == 0) {
            field2423++;
            return new class49(arg2, arg0, arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V", line = 14)
    public static void method1044(byte arg0) {
        field2426 = null;
        field2430 = null;
        field2428 = null;
        field2424 = null;
        if (arg0 < 52) {
            method1046(-68, null, 93);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZZ)V", line = 50)
    public static final void method1045(int arg0, boolean arg1, boolean arg2) {
        field2425++;
        if (arg0 == 0) {
            class385.field5414 = class290.method1804(class4.field81.field1413 * 2, class487.field6799, arg0, class171.field2485, class268.field3914, 4);
        } else {
            if (arg2) {
                class385.field5414 = class290.method1804(0, class487.field6799, 0, class171.field2485, class268.field3914, 4);
                class385.field5414.method347(0);
                class411 var3 = class275.method1731(true, 0, class478.field6666, class168.field2455);
                class319 var4 = class385.field5414.method313(var3, class506.method3021(class61.field761, class168.field2455, 0), true);
                class149.method930(true, var4, class527.field7741.method3116(class149.field1979, (byte) 109), (byte) -111);
                class385.field5414.method377();
                class26.method166((byte) -109);
                class385.field5414.method1801(0);
            }
            try {
                class385.field5414 = class290.method1804(class4.field81.field1413 * 2, class487.field6799, arg0, class171.field2485, class268.field3914, 4);
                if (class385.field5414.method360()) {
                    boolean var5 = true;
                    try {
                        var5 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var7) {
                    }
                    class15 var6;
                    if (var5) {
                        var6 = class385.field5414.method379(146800640);
                    } else {
                        var6 = class385.field5414.method379(104857600);
                    }
                    class385.field5414.method356(var6);
                }
            } catch (Throwable var8) {
                class385.field5414 = class290.method1804(0, class487.field6799, 0, class171.field2485, class268.field3914, 4);
                arg0 = 0;
            }
        }
        class405.field5737 = arg0;
        class225.method1385((byte) -100);
        if (!class385.field5414.method284()) {
            class330.field4817 = 1;
        }
        class385.field5414.method306(class330.field4817);
        class385.field5414.method375(0);
        class385.field5414.method286(8);
        class375.field5329 = class385.field5414.method358();
        class260.field3846 = class385.field5414.method358();
        class74.method547(50);
        class385.field5414.method349(!class4.field81.field1427);
        if (class385.field5414.method337()) {
            class443.method2599((byte) 92, class4.field81.field1416);
        }
        class274.method1724(class385.field5414, class500.field7068 >> 3, class43.field494 >> 3, 5);
        class373.method2185(!arg1);
        class75.field946 = arg1;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILjg;I)V", line = 127)
    public static final void method1046(int arg0, class228 arg1, int arg2) {
        field2427++;
        int var3 = -1;
        int var4 = 0;
        if (arg1.field3319 > class390.field5481) {
            class363.method2141(-10578, arg1);
        } else if (arg1.field3365 < class390.field5481) {
            class291.method1807(arg1, false, 0);
            var4 = class531.field7776;
            var3 = class149.field1975;
        } else {
            class190.method1211(arg1, -64);
        }
        if (arg2 > -114) {
            return;
        }
        if (arg1.field1896 < 128 || arg1.field1899 < 128 || class43.field494 * 128 - 128 <= arg1.field1896 || arg1.field1899 >= (class500.field7068 - 1) * 128) {
            arg1.field3319 = 0;
            arg1.field3350 = -1;
            arg1.field3365 = 0;
            var4 = 0;
            arg1.field3275 = -1;
            arg1.field3320 = -1;
            var3 = -1;
            arg1.field1896 = arg1.field3368[0] * 128 + (arg1.method125((byte) -116) * 64);
            arg1.field1899 = arg1.field3378[0] * 128 + arg1.method125((byte) -104) * 64;
            arg1.method1410((byte) 20);
        }
        if (class246.field3587 == arg1 && (arg1.field1896 < 1536 || arg1.field1899 < 1536 || arg1.field1896 >= ((class43.field494 - 12) * 128) || class500.field7068 * 128 - 1536 <= arg1.field1899)) {
            arg1.field3320 = -1;
            var4 = 0;
            arg1.field3365 = 0;
            var3 = -1;
            arg1.field3350 = -1;
            arg1.field3319 = 0;
            arg1.field3275 = -1;
            arg1.field1896 = arg1.field3368[0] * 128 + arg1.method125((byte) -74) * 64;
            arg1.field1899 = arg1.field3378[0] * 128 + arg1.method125((byte) -95) * 64;
            arg1.method1410((byte) 20);
        }
        int var5 = class387.method2242(false, arg1);
        class461.method2687(var3, 0, var5, arg1, var4);
        class310.method1879(arg1, (byte) 109);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 191)
    public static final boolean method1047(String arg0, int arg1) {
        field2429++;
        if (arg1 != 146800640) {
            field2426 = null;
        }
        return class134.method849(-98, true, arg0, 10);
    }
}
