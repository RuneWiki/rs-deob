import java.awt.Component;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public abstract class class98 {

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field1156 = -1;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "Lmk;")
    public static class154 field1158 = new class154();

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1159 = "Loading textures - ";

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "[[B")
    public static byte[][] field1160 = new byte[250][];

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "[Lbl;")
    public static class54[] field1161;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
    public static void method533(int arg0) {
        field1159 = null;
        field1161 = null;
        field1160 = null;
        if (arg0 != 3) {
            method533(-99);
        }
        field1158 = null;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)I")
    public static final int method534(int arg0) {
        field1157++;
        try {
            if (class264.field3607 == 0) {
                if (class442.method2730(25207) - 5000L < class138.field1776) {
                    return 0;
                }
                class77.field875 = class159.field2055.method2783(class40.field404, 0, class199.field2655);
                class164.field2095 = class442.method2730(25207);
                class264.field3607 = 1;
            }
            if (arg0 != 26213) {
                return -89;
            } else if ((class164.field2095 + 30000L) < class442.method2730(arg0 ^ 0x412)) {
                return class110.method584(true, 1000);
            } else {
                if (class264.field3607 == 1) {
                    if (class77.field875.field4123 == 2) {
                        return class110.method584(true, 1001);
                    }
                    if (class77.field875.field4123 != 1) {
                        return -1;
                    }
                    class264.field3605 = new class278((Socket) class77.field875.field4126, class159.field2055);
                    class77.field875 = null;
                    int var1 = 0;
                    if (class327.field4338) {
                        var1 = class23.field222;
                    }
                    class281.field3857.field3389 = 0;
                    class281.field3857.method1386(-222840624, 23);
                    class281.field3857.method1357(var1, 1826838072);
                    class264.field3605.method1537(class281.field3857.field3406, false, class281.field3857.field3389, 0);
                    if (class281.field3855 != null) {
                        class281.field3855.method2153(-77);
                    }
                    if (class414.field5973 != null) {
                        class414.field5973.method2153(-121);
                    }
                    int var2 = class264.field3605.method1540(1824);
                    if (class281.field3855 != null) {
                        class281.field3855.method2153(-120);
                    }
                    if (class414.field5973 != null) {
                        class414.field5973.method2153(-51);
                    }
                    if (var2 != 0) {
                        return class110.method584(true, var2);
                    }
                    class264.field3607 = 2;
                }
                if (class264.field3607 == 2) {
                    if (class264.field3605.method1539(-32565) < 2) {
                        return -1;
                    }
                    class58.field593 = class264.field3605.method1540(1824);
                    class58.field593 <<= 0x8;
                    class58.field593 += class264.field3605.method1540(1824);
                    class264.field3606 = new byte[class58.field593];
                    class165.field2105 = 0;
                    class264.field3607 = 3;
                }
                if (class264.field3607 != 3) {
                    return -1;
                }
                int var3 = class264.field3605.method1539(-32565);
                if (var3 < 1) {
                    return -1;
                }
                if (class58.field593 - class165.field2105 < var3) {
                    var3 = class58.field593 - class165.field2105;
                }
                class264.field3605.method1529(class264.field3606, var3, -18094, class165.field2105);
                class165.field2105 += var3;
                if (class165.field2105 < class58.field593) {
                    return -1;
                } else if (class185.method995(class264.field3606, (byte) -71)) {
                    class5.field41 = new class156[class303.field4119];
                    int var4 = 0;
                    for (int var5 = class7.field64; var5 <= class6.field54; var5++) {
                        class156 var6 = class131.method700((byte) -105, var5);
                        if (var6 != null) {
                            class5.field41[var4++] = var6;
                        }
                    }
                    class393.field5657 = 0;
                    class212.field2877 = null;
                    class264.field3605.method1538((byte) 5);
                    class264.field3605 = null;
                    class165.field2101 = 0;
                    class264.field3606 = null;
                    class264.field3607 = 0;
                    class138.field1776 = class442.method2730(arg0 - 1006);
                    return 0;
                } else {
                    return class110.method584(true, 1002);
                }
            }
        } catch (IOException var7) {
            return class110.method584(true, 1003);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method535(Component arg0, int arg1);

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)I")
    public abstract int method536(int arg0);

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method537(Component arg0, byte arg1);
}
