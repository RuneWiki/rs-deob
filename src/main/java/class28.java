import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class28 extends class3 {

    @OriginalMember(owner = "client!il", name = "J", descriptor = "[B")
    public byte[] field419;

    @OriginalMember(owner = "client!il", name = "F", descriptor = "[F")
    public static float[] field415 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!il", name = "N", descriptor = "[Luj;")
    public static class282[] field423 = new class282[6];

    @OriginalMember(owner = "client!il", name = "I", descriptor = "Lak;")
    public static class20 field418 = new class20(50);

    @OriginalMember(owner = "client!il", name = "O", descriptor = "I")
    public static int field424 = 2;

    @OriginalMember(owner = "client!il", name = "G", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!il", name = "H", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!il", name = "K", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!il", name = "L", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!il", name = "M", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V", line = 13)
    public static final void method182(int arg0, int arg1) {
        field417++;
        class46 var2 = class195.method1396(arg0, arg1, false);
        var2.method336(true);
    }

    @OriginalMember(owner = "client!il", name = "f", descriptor = "(I)I", line = 28)
    public static final int method183(int arg0) {
        field420++;
        if (arg0 != -1) {
            return 60;
        }
        try {
            if (class50.field763 == 0) {
                if ((class247.method1762(19166) - 5000L) < class22.field340) {
                    return 0;
                }
                class278.field4550 = class138.field2065.method1483(-14479, class290.field4714, class147.field2286);
                class252.field4016 = class247.method1762(arg0 ^ 0xFFFFB521);
                class50.field763 = 1;
            }
            if ((class252.field4016 + 30000L) < class247.method1762(19166)) {
                return class180.method1288(1000, true);
            }
            if (class50.field763 == 1) {
                if (class278.field4550.field2948 == 2) {
                    return class180.method1288(1001, true);
                }
                if (class278.field4550.field2948 != 1) {
                    return -1;
                }
                int var1 = 0;
                class118.field1724 = new class218((Socket) class278.field4550.field2945, class138.field2065);
                if (class92.field1343) {
                    var1 = class27.field400;
                }
                class278.field4550 = null;
                class285.field4642.field1640 = 0;
                class285.field4642.method797(85, -22096);
                class285.field4642.method787(853918096, var1);
                class118.field1724.method1572(78, class285.field4642.field1640, 0, class285.field4642.field1607);
                if (class20.field313 != null) {
                    class20.field313.method243((byte) 100);
                }
                if (class77.field1145 != null) {
                    class77.field1145.method243((byte) 101);
                }
                int var2 = class118.field1724.method1567(-15806);
                if (class20.field313 != null) {
                    class20.field313.method243((byte) 117);
                }
                if (class77.field1145 != null) {
                    class77.field1145.method243((byte) 125);
                }
                if (var2 != 0) {
                    return class180.method1288(var2, true);
                }
                class50.field763 = 2;
            }
            if (class50.field763 == 2) {
                if (class118.field1724.method1571(97) < 2) {
                    return -1;
                }
                class74.field1090 = class118.field1724.method1567(arg0 - 15805);
                class74.field1090 <<= 0x8;
                class74.field1090 += class118.field1724.method1567(-15806);
                class50.field763 = 3;
                class285.field4640 = new byte[class74.field1090];
                class142.field2181 = 0;
            }
            if (class50.field763 != 3) {
                return -1;
            }
            int var3 = class118.field1724.method1571(108);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > class74.field1090 - class142.field2181) {
                var3 = class74.field1090 - class142.field2181;
            }
            class118.field1724.method1575(var3, 14574, class142.field2181, class285.field4640);
            class142.field2181 += var3;
            if (class74.field1090 > class142.field2181) {
                return -1;
            } else if (class37.method254(class285.field4640, false)) {
                class184.field3006 = new class79[class310.field5218];
                int var4 = 0;
                for (int var5 = class140.field2161; var5 <= class134.field2004; var5++) {
                    class79 var6 = class116.method827((byte) 116, var5);
                    if (var6 != null) {
                        class184.field3006[var4++] = var6;
                    }
                }
                class118.field1724.method1570((byte) -83);
                class285.field4640 = null;
                class50.field763 = 0;
                class138.field2066 = 0;
                class118.field1724 = null;
                class22.field340 = class247.method1762(19166);
                return 0;
            } else {
                return class180.method1288(1002, true);
            }
        } catch (IOException var8) {
            return class180.method1288(1003, true);
        }
    }

    @OriginalMember(owner = "client!il", name = "g", descriptor = "(I)V", line = 170)
    public static void method184(int arg0) {
        field423 = null;
        field415 = null;
        field418 = null;
        if (arg0 != -32283) {
            field424 = -102;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/lang/Object;Lag;B)V", line = 188)
    public static final void method185(Object arg0, class211 arg1, byte arg2) {
        field422++;
        if (arg1.field3393 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field3393.peekEvent() != null; var3++) {
            class300.method2068(117, 1L);
        }
        if (arg0 != null) {
            arg1.field3393.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
        if (arg2 != 96) {
            method182(-49, 123);
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "([B)V", line = 211)
    public class28(byte[] arg0) {
        this.field419 = arg0;
    }
}
