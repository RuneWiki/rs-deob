import java.awt.Canvas;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class283 extends class59 {

    @OriginalMember(owner = "client!sm", name = "E", descriptor = "Lok;")
    public static class41 field4600 = class137.method956("<)4col>", 45);

    @OriginalMember(owner = "client!sm", name = "C", descriptor = "Lfl;")
    public static class86 field4599 = new class86(16);

    @OriginalMember(owner = "client!sm", name = "G", descriptor = "I")
    public static int field4601 = 0;

    @OriginalMember(owner = "client!sm", name = "A", descriptor = "B")
    public byte field4597;

    @OriginalMember(owner = "client!sm", name = "w", descriptor = "I")
    public int field4593;

    @OriginalMember(owner = "client!sm", name = "x", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!sm", name = "B", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "Lok;")
    public class41 field4592;

    @OriginalMember(owner = "client!sm", name = "y", descriptor = "Lok;")
    public class41 field4595;

    @OriginalMember(owner = "client!sm", name = "H", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field4602;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(B)V", line = 12)
    public static final void method1992(byte arg0) {
        field4596++;
        class22.field330.method135(arg0 ^ 0xFFFFB7A0);
        if (arg0 != -92) {
            method1993(false);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z)V", line = 36)
    public static void method1993(boolean arg0) {
        field4599 = null;
        field4600 = null;
        field4602 = null;
        if (!arg0) {
            field4602 = (Canvas) null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "(I)V", line = 50)
    public static final void method1994(int arg0) {
        field4594++;
        if (class32.field485 == 0) {
            return;
        }
        try {
            if (++class165.field2616 > 1500) {
                if (class118.field1724 != null) {
                    class118.field1724.method1570((byte) -107);
                    class118.field1724 = null;
                }
                if (class201.field3223 >= 1) {
                    class32.field485 = 0;
                    class134.field2001 = -5;
                    return;
                }
                class32.field485 = 1;
                class201.field3223++;
                if (class147.field2286 == class139.field2135) {
                    class147.field2286 = class175.field2844;
                } else {
                    class147.field2286 = class139.field2135;
                }
                class165.field2616 = 0;
            }
            if (arg0 <= 15) {
                return;
            }
            if (class32.field485 == 1) {
                class278.field4550 = class138.field2065.method1483(-14479, class290.field4714, class147.field2286);
                class32.field485 = 2;
            }
            if (class32.field485 == 2) {
                if (class278.field4550.field2948 == 2) {
                    throw new IOException();
                }
                if (class278.field4550.field2948 != 1) {
                    return;
                }
                class118.field1724 = new class218((Socket) class278.field4550.field2945, class138.field2065);
                class278.field4550 = null;
                class118.field1724.method1572(-107, class285.field4642.field1640, 0, class285.field4642.field1607);
                if (class20.field313 != null) {
                    class20.field313.method243((byte) 124);
                }
                if (class77.field1145 != null) {
                    class77.field1145.method243((byte) 99);
                }
                int var1 = class118.field1724.method1567(-15806);
                if (class20.field313 != null) {
                    class20.field313.method243((byte) 93);
                }
                if (class77.field1145 != null) {
                    class77.field1145.method243((byte) 96);
                }
                if (var1 != 101) {
                    class32.field485 = 0;
                    class134.field2001 = var1;
                    class118.field1724.method1570((byte) -123);
                    class118.field1724 = null;
                    return;
                }
                class32.field485 = 3;
            }
            if (class32.field485 == 3) {
                if (class118.field1724.method1571(-109) >= 2) {
                    int var2 = class118.field1724.method1567(-15806) << 8 | class118.field1724.method1567(-15806);
                    class281.method1981(0, var2);
                    if (class218.field3495 != -1) {
                        class32.field485 = 0;
                        class118.field1724.method1570((byte) 83);
                        class118.field1724 = null;
                        class5.method19(117);
                        return;
                    }
                    class32.field485 = 0;
                    class134.field2001 = 6;
                    class118.field1724.method1570((byte) -83);
                    class118.field1724 = null;
                    return;
                }
                return;
            }
        } catch (IOException var4) {
            if (class118.field1724 != null) {
                class118.field1724.method1570((byte) 17);
                class118.field1724 = null;
            }
            if (class201.field3223 < 1) {
                class201.field3223++;
                if (class147.field2286 == class139.field2135) {
                    class147.field2286 = class175.field2844;
                } else {
                    class147.field2286 = class139.field2135;
                }
                class165.field2616 = 0;
                class32.field485 = 1;
            } else {
                class134.field2001 = -4;
                class32.field485 = 0;
            }
        }
    }
}
