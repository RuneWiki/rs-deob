import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class53 extends OutputStream {

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field778 = 128;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V", line = 7)
    public static final void method373(boolean arg0) {
        if (arg0) {
            method373(true);
        }
        class141.field2483.method639(-122);
        field780++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIII)I", line = 20)
    public static final int method374(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg1 & 0x3;
        if (arg3 != 19326) {
            field782 = 82;
        }
        if ((arg5 & 0x1) == 1) {
            int var8 = arg2;
            arg2 = arg0;
            arg0 = var8;
        }
        field781++;
        if (var7 == 0) {
            return arg4;
        } else if (var7 == 1) {
            return arg6;
        } else if (var7 == 2) {
            return 7 + 1 - arg4 - arg2;
        } else {
            return 7 - (arg6 + arg0 - 1);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZZIIIII)V", line = 50)
    public static final void method375(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != -4) {
            return;
        }
        if (arg1) {
            class231.method1573();
        }
        field783++;
        if (class168.field3026 != null && (arg3 != 3 || class311.field5380 != arg2 || class288.field5028 != arg4)) {
            class178.method1261(class289.field5052, 25, class168.field3026);
            class168.field3026 = null;
        }
        if (arg3 == 3 && class168.field3026 == null) {
            class168.field3026 = class145.method1004(arg2, -5762, 0, class289.field5052, arg4, 0);
            if (class168.field3026 != null) {
                class311.field5380 = arg2;
                class288.field5028 = arg4;
                class29.method212(arg5 + 27555, class289.field5052);
            }
        }
        if (arg3 == 3 && class168.field3026 == null) {
            method375(true, true, -1, class258.field4562, -1, -4, arg6);
            return;
        }
        Container var7;
        if (class168.field3026 != null) {
            var7 = class168.field3026;
        } else if (class273.field4805 == null) {
            var7 = class289.field5052.field2441;
        } else {
            var7 = class273.field4805;
        }
        class9.field104 = var7.getSize().width;
        class297.field5176 = var7.getSize().height;
        if (class273.field4805 == var7) {
            Insets var8 = class273.field4805.getInsets();
            class297.field5176 -= var8.top + var8.bottom;
            class9.field104 -= var8.right + var8.left;
        }
        if (arg3 >= 2) {
            class21.field331 = class297.field5176;
            class87.field1379 = 0;
            class73.field1110 = class9.field104;
            class81.field1266 = 0;
        } else {
            class81.field1266 = (class9.field104 - 765) / 2;
            class73.field1110 = 765;
            class87.field1379 = 0;
            class21.field331 = 503;
        }
        if (arg0) {
            class9.method51(-1611, class13.field158);
            class290.method2075(class13.field158, -122);
            if (class296.field5165 != null) {
                class296.field5165.method31(arg5 ^ 0xFF8999A8, class13.field158);
            }
            class5.field73.method1376((byte) 122);
            class316.method2200(-126, class13.field158);
            class27.method176((byte) 125, class13.field158);
            if (class296.field5165 != null) {
                class296.field5165.method32(class13.field158, 64);
            }
        } else {
            if (class231.field4051) {
                class231.method1569(class73.field1110, class21.field331);
            }
            class13.field158.setSize(class73.field1110, class21.field331);
            if (class273.field4805 == var7) {
                Insets var9 = class273.field4805.getInsets();
                class13.field158.setLocation(class81.field1266 + var9.left, class87.field1379 + var9.top);
            } else {
                class13.field158.setLocation(class81.field1266, class87.field1379);
            }
        }
        if (arg3 == 0 && arg6 > 0) {
            class231.method1603(class13.field158);
        }
        if (arg1 && arg3 > 0) {
            class13.field158.setIgnoreRepaint(true);
            if (!class8.field94) {
                class119.method837();
                class216.field3833 = null;
                class216.field3833 = class172.method1220(0, class73.field1110, class21.field331, class13.field158);
                class28.method187();
                if (class203.field3658 == 5) {
                    class318.method2207(class256.field4525, true, arg5 ^ 0xFFFFFF9D);
                } else {
                    class271.method1958((byte) 104, class286.field5012, false);
                }
                try {
                    Graphics var10 = class13.field158.getGraphics();
                    class216.field3833.method262(0, var10, arg5 - 8274, 0);
                } catch (Exception var14) {
                }
                class307.method2153(arg5 ^ 0x3);
                if (arg6 == 0) {
                    class216.field3833 = class172.method1220(0, 765, 503, class13.field158);
                } else {
                    class216.field3833 = null;
                }
                class205 var12 = class289.field5052.method964(class5.field73.getClass(), false);
                while (var12.field3686 == 0) {
                    class83.method556(100L, 127);
                }
                if (var12.field3686 == 1) {
                    class8.field94 = true;
                }
            }
            if (class8.field94) {
                class231.method1582(class13.field158, class184.field3372 * 2);
            }
        }
        if (!class231.field4051 && arg3 > 0) {
            method375(true, true, -1, 0, -1, -4, arg6);
            return;
        }
        if (arg3 > 0 && arg6 == 0) {
            class303.field5264.setPriority(5);
            class216.field3833 = null;
            class44.method311();
            ((class84) class263.field4661).method578(200, (byte) 107);
            if (class26.field397) {
                class263.method1907(0.7F);
            }
        } else if (arg3 == 0 && arg6 > 0) {
            class303.field5264.setPriority(1);
            class216.field3833 = class172.method1220(0, 765, 503, class13.field158);
            class44.method300();
            class165.method1149();
            ((class84) class263.field4661).method578(20, (byte) 66);
            if (class26.field397) {
                if (class269.field4716 == 1) {
                    class263.method1907(0.9F);
                }
                if (class269.field4716 == 2) {
                    class263.method1907(0.8F);
                }
                if (class269.field4716 == 3) {
                    class263.method1907(0.7F);
                }
                if (class269.field4716 == 4) {
                    class263.method1907(0.6F);
                }
            }
            class133.method910();
        }
        class152.field2763 = !class251.method1774(arg5 ^ 0xFFFFFC7B);
        if (arg1) {
            class218.method1505(arg5 - 76);
        }
        if (arg3 < 2) {
            class60.field966 = false;
        } else {
            class60.field966 = true;
        }
        if (class322.field5511 != -1) {
            class289.method2069(arg5 + 4, true);
        }
        if (class14.field161 != null && (class203.field3658 == 30 || class203.field3658 == 25)) {
            class321.method2220((byte) -99);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class47.field692[var13] = true;
        }
        class291.field5086 = true;
    }

    @OriginalMember(owner = "client!ff", name = "write", descriptor = "(I)V", line = 289)
    public final void write(int arg0) throws IOException {
        field777++;
        throw new IOException();
    }
}
