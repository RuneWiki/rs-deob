import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class class286 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "Z")
    private boolean field4104 = false;

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "Z")
    private boolean field4105 = false;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "S")
    public static short field4079 = 32767;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "[J")
    public static long[] field4075 = new long[32];

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "J")
    public static long field4099 = 0L;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!ue", name = "F", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "Z")
    public static boolean field4108;

    @OriginalMember(owner = "client!ue", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 4)
    public final void windowDeiconified(WindowEvent arg0) {
        field4103++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)V", line = 12)
    public static final void method1948(byte arg0, int arg1) {
        field4084++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class95.field1243[arg1];
        int var3 = class156.field2159[arg1];
        int var4 = (int) class199.field2801[arg1];
        int var5 = class156.field2169[arg1];
        long var6 = class199.field2801[arg1];
        if (var5 >= 2000) {
            var5 -= 2000;
        }
        if (var5 == 24) {
            class239 var8 = class311.field4574[var4];
            if (var8 != null) {
                class210.field2975 = class140.field1950;
                class331.field4916++;
                class310.field4568 = 2;
                class95.field1238 = 0;
                class52.field682 = class305.field4465;
                class251.field3681.method1309(23, 52);
                class251.field3681.method2098(-85, var4);
                class251.field3681.method2048(class143.field1991[82] ? 1 : 0, 87);
                class352.method2450(class359.field5616.field4842[0], 0, 0, true, var8.method1699(-1), var3, class359.field5616.field4936[0], 0, (byte) -89, var8.method1699(-1), var2);
            }
        }
        if (var5 == 17) {
            class251.field3683++;
            class251.field3681.method1309(23, 95);
            class251.field3681.method2098(-86, var4);
            class251.field3681.method2051((byte) 21, var3);
            class251.field3681.method2103(var2, (byte) -121);
            class211.field2985 = 0;
            class245.field3568 = class89.method644(127, var3);
            class209.field2958 = var2;
        }
        if (var5 == 33) {
            class169 var9 = class251.field3688[var4];
            if (var9 != null) {
                class210.field2975 = class140.field1950;
                class310.field4568 = 2;
                class271.field3890++;
                class52.field682 = class305.field4465;
                class95.field1238 = 0;
                class251.field3681.method1309(23, 160);
                class251.field3681.method2045(class143.field1991[82] ? 1 : 0, (byte) 10);
                class251.field3681.method2091((byte) -91, class104.field1357);
                class251.field3681.method2080(255, var4);
                class251.field3681.method2098(-28, class32.field372);
                class251.field3681.method2103(class59.field754, (byte) -122);
                class352.method2450(class359.field5616.field4842[0], 0, 0, true, var9.method1699(-1), var3, class359.field5616.field4936[0], 0, (byte) -114, var9.method1699(-1), var2);
            }
        }
        if (var5 == 40) {
            class223.field3211++;
            class52.field682 = class305.field4465;
            class310.field4568 = 2;
            class210.field2975 = class140.field1950;
            class95.field1238 = 0;
            class251.field3681.method1309(arg0 ^ 0x77, 134);
            class251.field3681.method2053(arg0 - 16, class143.field1991[82] ? 1 : 0);
            class251.field3681.method2081(-2076007248, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class251.field3681.method2081(-2076007248, class355.field5556 + var3);
            class251.field3681.method2103(class331.field4867 + var2, (byte) -124);
            class226.method1632(var3, var6, 0, var2);
        }
        if (var5 == 46) {
            class95.field1238 = 0;
            class265.field3849++;
            class210.field2975 = class140.field1950;
            class310.field4568 = 2;
            class52.field682 = class305.field4465;
            class251.field3681.method1309(23, 227);
            class251.field3681.method2098(-87, class331.field4867 + var2);
            class251.field3681.method2048(class143.field1991[82] ? 1 : 0, 108);
            class251.field3681.method2098(-65, class355.field5556 + var3);
            class251.field3681.method2103(var4, (byte) -123);
            class352.method2450(class359.field5616.field4842[0], 0, 0, true, 0, var3, class359.field5616.field4936[0], 0, (byte) -112, 0, var2);
        }
        if (var5 == 21) {
            class239 var10 = class311.field4574[var4];
            if (var10 != null) {
                class52.field682 = class305.field4465;
                class210.field2975 = class140.field1950;
                class175.field2405++;
                class310.field4568 = 2;
                class95.field1238 = 0;
                class251.field3681.method1309(arg0 - 73, 123);
                class251.field3681.method2103(var4, (byte) -125);
                class251.field3681.method2084(true, class104.field1357);
                class251.field3681.method2081(-2076007248, class32.field372);
                class251.field3681.method2053(100, class143.field1991[82] ? 1 : 0);
                class251.field3681.method2103(class59.field754, (byte) -126);
                class352.method2450(class359.field5616.field4842[0], 0, 0, true, var10.method1699(-1), var3, class359.field5616.field4936[0], 0, (byte) -112, var10.method1699(-1), var2);
            }
        }
        if (var5 == 1004) {
            class223.field3209++;
            class52.field682 = class305.field4465;
            class210.field2975 = class140.field1950;
            class95.field1238 = 0;
            class310.field4568 = 2;
            class251.field3681.method1309(23, 72);
            class251.field3681.method2098(arg0 - 143, var4);
        }
        if (var5 == 19) {
            if (var4 == 0) {
                class352.field5502 = 1;
                class235.method1673(class56.field724, var2, var3);
            } else if (var4 == 1) {
                class216.field3044++;
                class251.field3681.method1309(arg0 - 73, 204);
                class251.field3681.method2081(-2076007248, class355.field5556 + var3);
                class251.field3681.method2081(-2076007248, class71.field936);
                class251.field3681.method2051((byte) 21, class315.field4649);
                class251.field3681.method2080(255, class331.field4867 + var2);
            }
        }
        if (var5 == 28) {
            class52.field682 = class305.field4465;
            class310.field4568 = 2;
            class92.field1197++;
            class210.field2975 = class140.field1950;
            class95.field1238 = 0;
            class251.field3681.method1309(23, 119);
            class251.field3681.method2051((byte) 21, class104.field1357);
            class251.field3681.method2098(-77, class355.field5556 + var3);
            class251.field3681.method2081(-2076007248, class59.field754);
            class251.field3681.method2080(255, class32.field372);
            class251.field3681.method2103(var4, (byte) -122);
            class251.field3681.method2080(arg0 + 159, class331.field4867 + var2);
            class251.field3681.method2053(85, class143.field1991[82] ? 1 : 0);
            class352.method2450(class359.field5616.field4842[0], 0, 0, true, 0, var3, class359.field5616.field4936[0], 0, (byte) -106, 0, var2);
        }
        if (var5 == 36) {
            class169 var11 = class251.field3688[var4];
            if (var11 != null) {
                class310.field4568 = 2;
                class95.field1238 = 0;
                class210.field2975 = class140.field1950;
                class262.field3803++;
                class52.field682 = class305.field4465;
                class251.field3681.method1309(23, 37);
                class251.field3681.method2048(class143.field1991[82] ? 1 : 0, 68);
                class251.field3681.method2103(var4, (byte) -124);
                class352.method2450(class359.field5616.field4842[0], 0, 0, true, var11.method1699(-1), var3, class359.field5616.field4936[0], 0, (byte) -90, var11.method1699(arg0 ^ 0xFFFFFF9F), var2);
            }
        }
        if (var5 == 12) {
            class239 var12 = class311.field4574[var4];
            if (var12 != null) {
                class310.field4568 = 2;
                class196.field2704++;
                class210.field2975 = class140.field1950;
                class95.field1238 = 0;
                class52.field682 = class305.field4465;
                class251.field3681.method1309(23, 4);
                class251.field3681.method2048(class143.field1991[82] ? 1 : 0, 78);
                class251.field3681.method2081(-2076007248, var4);
                class352.method2450(class359.field5616.field4842[0], 0, 0, true, var12.method1699(-1), var3, class359.field5616.field4936[0], 0, (byte) -98, var12.method1699(-1), var2);
            }
        }
        if (var5 == 10) {
            class198.field2784++;
            class251.field3681.method1309(23, 102);
            class251.field3681.method2084(true, var3);
            class251.field3681.method2081(arg0 - 2076007344, var2);
            class251.field3681.method2098(-82, var4);
            class211.field2985 = 0;
            class245.field3568 = class89.method644(-126, var3);
            class209.field2958 = var2;
        }
        if (var5 == 25) {
            class169 var13 = class251.field3688[var4];
            if (var13 != null) {
                class95.field1238 = 0;
                class52.field682 = class305.field4465;
                field4091++;
                class310.field4568 = 2;
                class210.field2975 = class140.field1950;
                class251.field3681.method1309(arg0 ^ 0x77, 33);
                class251.field3681.method2103(var4, (byte) -122);
                class251.field3681.method2078(class143.field1991[82] ? 1 : 0, -112);
                class352.method2450(class359.field5616.field4842[0], 0, 0, true, var13.method1699(-1), var3, class359.field5616.field4936[0], 0, (byte) -110, var13.method1699(-1), var2);
            }
        }
        if (var5 == 1007) {
            class210.field2975 = class140.field1950;
            class251.field3680++;
            class95.field1238 = 0;
            class52.field682 = class305.field4465;
            class310.field4568 = 2;
            class251.field3681.method1309(arg0 ^ 0x77, 176);
            class251.field3681.method2098(-59, var4);
        }
        if (var5 == 4) {
            class258.field3752++;
            class310.field4568 = 2;
            class52.field682 = class305.field4465;
            class95.field1238 = 0;
            class210.field2975 = class140.field1950;
            class251.field3681.method1309(23, 89);
            class251.field3681.method2098(arg0 ^ 0xFFFFFFF7, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class251.field3681.method2045(class143.field1991[82] ? 1 : 0, (byte) 10);
            class251.field3681.method2103(class331.field4867 + var2, (byte) -124);
            class251.field3681.method2080(255, class71.field936);
            class251.field3681.method2098(-49, class355.field5556 + var3);
            class251.field3681.method2051((byte) 21, class315.field4649);
            class226.method1632(var3, var6, 0, var2);
        }
        if (var5 == 6) {
            class210.field2975 = class140.field1950;
            class95.field1238 = 0;
            class329.field4807++;
            class310.field4568 = 2;
            class52.field682 = class305.field4465;
            class251.field3681.method1309(23, 232);
            class251.field3681.method2080(255, var3 + class355.field5556);
            class251.field3681.method2103(var4, (byte) -123);
            class251.field3681.method2078(class143.field1991[82] ? 1 : 0, -93);
            class251.field3681.method2080(255, class331.field4867 + var2);
            class352.method2450(class359.field5616.field4842[0], 0, 0, true, 0, var3, class359.field5616.field4936[0], 0, (byte) -119, 0, var2);
        }
        if (var5 == 42) {
            class169 var14 = class251.field3688[var4];
            if (var14 != null) {
                class95.field1238 = 0;
                class210.field2975 = class140.field1950;
                class52.field682 = class305.field4465;
                class344.field5343++;
                class310.field4568 = 2;
                class251.field3681.method1309(arg0 ^ 0x77, 155);
                class251.field3681.method2081(-2076007248, var4);
                class251.field3681.method2045(class143.field1991[82] ? 1 : 0, (byte) 10);
                class251.field3681.method2098(-94, class71.field936);
                class251.field3681.method2051((byte) 21, class315.field4649);
                class352.method2450(class359.field5616.field4842[0], 0, 0, true, var14.method1699(-1), var3, class359.field5616.field4936[0], 0, (byte) -113, var14.method1699(-1), var2);
            }
        }
        if (var5 == 31) {
            class239 var15 = class311.field4574[var4];
            if (var15 != null) {
                class13.field144++;
                class52.field682 = class305.field4465;
                class95.field1238 = 0;
                class210.field2975 = class140.field1950;
                class310.field4568 = 2;
                class251.field3681.method1309(23, 105);
                class251.field3681.method2098(-87, var4);
                class251.field3681.method2048(class143.field1991[82] ? 1 : 0, 117);
                class352.method2450(class359.field5616.field4842[0], 0, 0, true, var15.method1699(-1), var3, class359.field5616.field4936[0], 0, (byte) -104, var15.method1699(-1), var2);
            }
        }
        if (var5 == 47) {
            if (var4 == 0) {
                class185.field2532 = 1;
                class235.method1673(class56.field724, var2, var3);
            } else if (class217.field3070 > 0 && class143.field1991[82] && class143.field1991[81]) {
                class86.method624((byte) -120, class331.field4867 + var2, class355.field5556 + var3, class56.field724);
            } else {
                class27.field311++;
                class251.field3681.method1309(23, 85);
                class251.field3681.method2103(class331.field4867 + var2, (byte) -124);
                class251.field3681.method2080(255, class355.field5556 + var3);
            }
        }
        if (var5 == 59) {
            class169 var16 = class251.field3688[var4];
            if (var16 != null) {
                class52.field682 = class305.field4465;
                class210.field2975 = class140.field1950;
                class233.field3345++;
                class95.field1238 = 0;
                class310.field4568 = 2;
                class251.field3681.method1309(23, 53);
                class251.field3681.method2103(var4, (byte) -123);
                class251.field3681.method2053(76, class143.field1991[82] ? 1 : 0);
                class352.method2450(class359.field5616.field4842[0], 0, 0, true, var16.method1699(-1), var3, class359.field5616.field4936[0], 0, (byte) -103, var16.method1699(-1), var2);
            }
        }
        if (var5 == 51) {
            class260.field3766++;
            class251.field3681.method1309(23, 88);
            class251.field3681.method2103(var4, (byte) -128);
            class251.field3681.method2058(-100, var3);
            class251.field3681.method2103(var2, (byte) -127);
            class211.field2985 = 0;
            class245.field3568 = class89.method644(arg0 + 31, var3);
            class209.field2958 = var2;
        }
        if (var5 == 13) {
            class251.field3681.method1309(23, 242);
            class156.field2164++;
            class251.field3681.method2103(var2, (byte) -123);
            class251.field3681.method2103(var4, (byte) -126);
            class251.field3681.method2058(-100, var3);
            class211.field2985 = 0;
            class245.field3568 = class89.method644(-123, var3);
            class209.field2958 = var2;
        }
        if (arg0 != 96) {
            return;
        }
        if (var5 == 3 && class215.field3038 == null) {
            class333.method2332((byte) 68, var2, var3);
            class215.field3038 = class283.method1926(var3, (byte) 82, var2);
            class142.method1097(-123, class215.field3038);
        }
        if (var5 == 1) {
            class251.field3681.method1309(arg0 ^ 0x77, 40);
            class234.field3350++;
            class251.field3681.method2058(arg0 - 190, var3);
            class251.field3681.method2098(-117, class71.field936);
            class251.field3681.method2080(255, var2);
            class251.field3681.method2084(true, class315.field4649);
        }
        if (var5 == 29) {
            class239 var17 = class311.field4574[var4];
            if (var17 != null) {
                class148.field2050++;
                class95.field1238 = 0;
                class52.field682 = class305.field4465;
                class210.field2975 = class140.field1950;
                class310.field4568 = 2;
                class251.field3681.method1309(23, 148);
                class251.field3681.method2081(arg0 - 2076007344, var4);
                class251.field3681.method2078(class143.field1991[82] ? 1 : 0, -103);
                class352.method2450(class359.field5616.field4842[0], 0, 0, true, var17.method1699(-1), var3, class359.field5616.field4936[0], 0, (byte) -100, var17.method1699(-1), var2);
            }
        }
        if (var5 == 11) {
            class251.field3681.method1309(23, 158);
            class251.field3681.method2084(true, var3);
            class274.field3923++;
            class333 var18 = class89.method644(arg0 - 41, var3);
            if (var18.field5079 != null && var18.field5079[0][0] == 5) {
                int var19 = var18.field5079[0][1];
                if (class208.field2956[var19] != var18.field5185[0]) {
                    class208.field2956[var19] = var18.field5185[0];
                    class137.method1032((byte) 121, var19);
                }
            }
        }
        if (var5 == 32) {
            class210.field2975 = class140.field1950;
            class310.field4568 = 2;
            class130.field1769++;
            class95.field1238 = 0;
            class52.field682 = class305.field4465;
            class251.field3681.method1309(23, 159);
            class251.field3681.method2103(var2 + class331.field4867, (byte) -128);
            class251.field3681.method2098(arg0 ^ 0xFFFFFFE4, class355.field5556 + var3);
            class251.field3681.method2048(class143.field1991[82] ? 1 : 0, 107);
            class251.field3681.method2103((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) -128);
            class226.method1632(var3, var6, arg0 ^ 0x60, var2);
        }
        if (var5 == 39) {
            class169 var20 = class251.field3688[var4];
            if (var20 != null) {
                class210.field2975 = class140.field1950;
                class52.field682 = class305.field4465;
                class95.field1238 = 0;
                class283.field4027++;
                class310.field4568 = 2;
                class251.field3681.method1309(23, 245);
                class251.field3681.method2098(arg0 ^ 0xFFFFFFDF, var4);
                class251.field3681.method2053(125, class143.field1991[82] ? 1 : 0);
                class352.method2450(class359.field5616.field4842[0], 0, 0, true, var20.method1699(-1), var3, class359.field5616.field4936[0], 0, (byte) -117, var20.method1699(-1), var2);
            }
        }
        if (var5 == 15) {
            class251.field3681.method1309(arg0 ^ 0x77, 58);
            class13.field146++;
            class251.field3681.method2098(-19, var4);
            class251.field3681.method2051((byte) 21, var3);
            class251.field3681.method2098(-44, class32.field372);
            class251.field3681.method2098(-72, var2);
            class251.field3681.method2081(-2076007248, class59.field754);
            class251.field3681.method2051((byte) 21, class104.field1357);
            class211.field2985 = 0;
            class245.field3568 = class89.method644(arg0 - 193, var3);
            class209.field2958 = var2;
        }
        if (var5 == 57) {
            class333 var21 = class89.method644(-103, var3);
            boolean var22 = true;
            if (var21.field5084 > 0) {
                var22 = class7.method40((byte) -101, var21);
            }
            if (var22) {
                class274.field3923++;
                class251.field3681.method1309(23, 158);
                class251.field3681.method2084(true, var3);
            }
        }
        if (var5 == 30) {
            class251.field3681.method1309(23, 81);
            class251.field3681.method2080(arg0 + 159, var2);
            class251.field3681.method2103(var4, (byte) -125);
            class194.field2674++;
            class251.field3681.method2091((byte) 110, var3);
            class211.field2985 = 0;
            class245.field3568 = class89.method644(-110, var3);
            class209.field2958 = var2;
        }
        if (var5 == 14) {
            class239 var23 = class311.field4574[var4];
            if (var23 != null) {
                class310.field4568 = 2;
                class52.field682 = class305.field4465;
                class271.field3891++;
                class95.field1238 = 0;
                class210.field2975 = class140.field1950;
                class251.field3681.method1309(23, 77);
                class251.field3681.method2080(255, var4);
                class251.field3681.method2053(69, class143.field1991[82] ? 1 : 0);
                class352.method2450(class359.field5616.field4842[0], 0, 0, true, var23.method1699(-1), var3, class359.field5616.field4936[0], 0, (byte) -108, var23.method1699(-1), var2);
            }
        }
        if (var5 == 26) {
            if (var4 == 0) {
                class235.method1673(class56.field724, var2, var3);
            } else if (var4 == 1) {
                if (class217.field3070 > 0 && class143.field1991[82] && class143.field1991[81]) {
                    class86.method624((byte) -120, class331.field4867 + var2, class355.field5556 + var3, class56.field724);
                } else {
                    class236.method1676(var2, 1, -1, var3);
                    class251.field3681.method2048(class179.field2448, 86);
                    class251.field3681.method2048(class236.field3412, arg0 ^ 0x0);
                    class251.field3681.method2098(arg0 ^ 0xFFFFFFA5, (int) class247.field3601);
                    class251.field3681.method2048(57, 119);
                    class251.field3681.method2048(class354.field5534, 97);
                    class251.field3681.method2048(class318.field4690, 97);
                    class251.field3681.method2048(89, 126);
                    class251.field3681.method2098(arg0 ^ 0xFFFFFFF5, class359.field5616.field4855);
                    class251.field3681.method2098(arg0 ^ 0xFFFFFFFA, class359.field5616.field4893);
                    class251.field3681.method2048(class313.field4592, 102);
                    class251.field3681.method2048(63, arg0 ^ 0x3F);
                    class352.method2450(class359.field5616.field4842[0], 0, 0, true, 0, var3, class359.field5616.field4936[0], 0, (byte) -111, 0, var2);
                }
            }
        }
        if (var5 == 9) {
            class26.method174((byte) 126);
            class333 var36 = class89.method644(65, var3);
            class32.field372 = var2;
            class339.field5304 = 1;
            class104.field1357 = var3;
            class59.field754 = var4;
            class142.method1097(arg0 ^ 0x28, var36);
            class99.field1301 = "<col=ff9040>" + class172.method1265(var4, (byte) 42).field5674 + "<col=ffffff>";
            if (class99.field1301 == null) {
                class99.field1301 = "null";
            }
            return;
        }
        if (var5 == 1012 || var5 == 1002 || var5 == 1008 || var5 == 1003 || var5 == 1011) {
            class139.method1052(1002, var4, var5, var2);
        }
        if (var5 == 48) {
            class210.field2975 = class140.field1950;
            class5.field56++;
            class310.field4568 = 2;
            class95.field1238 = 0;
            class52.field682 = class305.field4465;
            class251.field3681.method1309(23, 28);
            class251.field3681.method2103(class355.field5556 + var3, (byte) -128);
            class251.field3681.method2084(true, class315.field4649);
            class251.field3681.method2080(arg0 + 159, class71.field936);
            class251.field3681.method2098(-122, var4);
            class251.field3681.method2080(255, var2 + class331.field4867);
            class251.field3681.method2053(arg0 + 14, class143.field1991[82] ? 1 : 0);
            class352.method2450(class359.field5616.field4842[0], 0, 0, true, 0, var3, class359.field5616.field4936[0], 0, (byte) -100, 0, var2);
        }
        if (var5 == 5) {
            class239 var24 = class311.field4574[var4];
            if (var24 != null) {
                class310.field4568 = 2;
                class210.field2975 = class140.field1950;
                class109.field1421++;
                class52.field682 = class305.field4465;
                class95.field1238 = 0;
                class251.field3681.method1309(23, 224);
                class251.field3681.method2081(arg0 ^ 0x8442A4D0, var4);
                class251.field3681.method2098(-38, class71.field936);
                class251.field3681.method2091((byte) 93, class315.field4649);
                class251.field3681.method2053(99, class143.field1991[82] ? 1 : 0);
                class352.method2450(class359.field5616.field4842[0], 0, 0, true, var24.method1699(-1), var3, class359.field5616.field4936[0], 0, (byte) -98, var24.method1699(-1), var2);
            }
        }
        if (var5 == 37) {
            class95.field1238 = 0;
            class310.field4568 = 2;
            class52.field682 = class305.field4465;
            class54.field698++;
            class210.field2975 = class140.field1950;
            class251.field3681.method1309(23, 48);
            class251.field3681.method2098(arg0 - 122, class331.field4867 + var2);
            class251.field3681.method2081(-2076007248, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class251.field3681.method2053(122, class143.field1991[82] ? 1 : 0);
            class251.field3681.method2098(-23, class355.field5556 + var3);
            class226.method1632(var3, var6, arg0 - 96, var2);
        }
        if (var5 == 34) {
            class333 var25 = class283.method1926(var3, (byte) 82, var2);
            if (var25 != null) {
                class26.method174((byte) 126);
                class142 var26 = client.method891(var25);
                class212.method1553(var26.method1100(1105924391), var26.field1973, var25.field5049, var2, var25.field5133, var3, 500);
                class339.field5304 = 0;
                class351.field5485 = class293.method2007((byte) 124, var25);
                if (class351.field5485 == null) {
                    class351.field5485 = "Null";
                }
                if (var25.field5154) {
                    class339.field5277 = var25.field5073 + "<col=ffffff>";
                } else {
                    class339.field5277 = "<col=00ff00>" + var25.field5089 + "<col=ffffff>";
                }
            }
            return;
        }
        if (var5 == 49) {
            class177.field2423++;
            class251.field3681.method1309(23, 145);
            class251.field3681.method2081(-2076007248, var2);
            class251.field3681.method2051((byte) 21, var3);
            class251.field3681.method2081(-2076007248, var4);
            class211.field2985 = 0;
            class245.field3568 = class89.method644(-101, var3);
            class209.field2958 = var2;
        }
        if (var5 == 58) {
            class290.field4191++;
            class251.field3681.method1309(23, 214);
            class251.field3681.method2103(var2, (byte) -126);
            class251.field3681.method2081(arg0 - 2076007344, var4);
            class251.field3681.method2084(true, var3);
            class211.field2985 = 0;
            class245.field3568 = class89.method644(26, var3);
            class209.field2958 = var2;
        }
        if (var5 == 8) {
            class169 var27 = class251.field3688[var4];
            if (var27 != null) {
                class210.field2975 = class140.field1950;
                class310.field4568 = 2;
                class16.field194++;
                class95.field1238 = 0;
                class52.field682 = class305.field4465;
                class251.field3681.method1309(23, 12);
                class251.field3681.method2080(arg0 + 159, var4);
                class251.field3681.method2048(class143.field1991[82] ? 1 : 0, 120);
                class352.method2450(class359.field5616.field4842[0], 0, 0, true, var27.method1699(-1), var3, class359.field5616.field4936[0], 0, (byte) -95, var27.method1699(arg0 ^ 0xFFFFFF9F), var2);
            }
        }
        if (var5 == 35) {
            class227.field3267++;
            class251.field3681.method1309(arg0 - 73, 103);
            class251.field3681.method2058(-106, var3);
            class251.field3681.method2080(255, var2);
            class251.field3681.method2098(-89, var4);
            class211.field2985 = 0;
            class245.field3568 = class89.method644(125, var3);
            class209.field2958 = var2;
        }
        if (var5 == 43) {
            class239 var28 = class311.field4574[var4];
            if (var28 != null) {
                class52.field682 = class305.field4465;
                class210.field2975 = class140.field1950;
                class95.field1238 = 0;
                class310.field4568 = 2;
                class314.field4612++;
                class251.field3681.method1309(23, 212);
                class251.field3681.method2081(arg0 ^ 0x8442A4D0, var4);
                class251.field3681.method2078(class143.field1991[82] ? 1 : 0, arg0 - 1);
                class352.method2450(class359.field5616.field4842[0], 0, 0, true, var28.method1699(-1), var3, class359.field5616.field4936[0], 0, (byte) -120, var28.method1699(arg0 ^ 0xFFFFFF9F), var2);
            }
        }
        if (var5 == 16) {
            class52.field682 = class305.field4465;
            class310.field4568 = 2;
            class210.field2975 = class140.field1950;
            class95.field1238 = 0;
            class251.field3681.method1309(23, 116);
            class251.field3681.method2098(-104, class32.field372);
            class149.field2113++;
            class251.field3681.method2103(var2 + class331.field4867, (byte) -127);
            class251.field3681.method2103((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) -128);
            class251.field3681.method2091((byte) 113, class104.field1357);
            class251.field3681.method2045(class143.field1991[82] ? 1 : 0, (byte) 10);
            class251.field3681.method2080(arg0 + 159, class355.field5556 + var3);
            class251.field3681.method2080(255, class59.field754);
            class226.method1632(var3, var6, 0, var2);
        }
        if (var5 == 44) {
            class52.field682 = class305.field4465;
            class210.field2975 = class140.field1950;
            class59.field749++;
            class95.field1238 = 0;
            class310.field4568 = 2;
            class251.field3681.method1309(arg0 - 73, 3);
            class251.field3681.method2045(class143.field1991[82] ? 1 : 0, (byte) 10);
            class251.field3681.method2080(255, class355.field5556 + var3);
            class251.field3681.method2080(255, var4);
            class251.field3681.method2081(-2076007248, class331.field4867 + var2);
            class352.method2450(class359.field5616.field4842[0], 0, 0, true, 0, var3, class359.field5616.field4936[0], 0, (byte) -100, 0, var2);
        }
        if (var5 == 23 || var5 == 1009) {
            class310.method2153(var3, var2, var4, arg0 - 169, class328.field4805[arg1]);
        }
        if (var5 == 1010) {
            class95.field1238 = 0;
            class310.field4568 = 2;
            class52.field682 = class305.field4465;
            class210.field2975 = class140.field1950;
            class169 var29 = class251.field3688[var4];
            if (var29 != null) {
                class157 var30 = var29.field2345;
                if (var30.field2206 != null) {
                    var30 = var30.method1210(53);
                }
                if (var30 != null) {
                    class254.field3702++;
                    class251.field3681.method1309(arg0 - 73, 65);
                    class251.field3681.method2080(arg0 + 159, var30.field2214);
                }
            }
        }
        if (var5 == 7) {
            class82.method612(0);
        }
        if (var5 == 1005) {
            class52.field682 = class305.field4465;
            class274.field3934++;
            class310.field4568 = 2;
            class210.field2975 = class140.field1950;
            class95.field1238 = 0;
            class251.field3681.method1309(23, 60);
            class251.field3681.method2081(-2076007248, class355.field5556 + var3);
            class251.field3681.method2080(255, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class251.field3681.method2048(class143.field1991[82] ? 1 : 0, 61);
            class251.field3681.method2080(255, class331.field4867 + var2);
            class226.method1632(var3, var6, 0, var2);
        }
        if (var5 == 41) {
            class310.field4568 = 2;
            class95.field1238 = 0;
            class210.field2975 = class140.field1950;
            class52.field682 = class305.field4465;
            class236.field3395++;
            class251.field3681.method1309(arg0 - 73, 92);
            class251.field3681.method2053(71, class143.field1991[82] ? 1 : 0);
            class251.field3681.method2080(255, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class251.field3681.method2081(-2076007248, class331.field4867 + var2);
            class251.field3681.method2081(arg0 ^ 0x8442A4D0, var3 + class355.field5556);
            class226.method1632(var3, var6, 0, var2);
        }
        if (var5 == 50) {
            class165.field2319++;
            class251.field3681.method1309(arg0 - 73, 177);
            class251.field3681.method2058(-128, var3);
            class251.field3681.method2098(-50, var4);
            class251.field3681.method2091((byte) -50, class315.field4649);
            class251.field3681.method2080(255, var2);
            class251.field3681.method2080(255, class71.field936);
            class211.field2985 = 0;
            class245.field3568 = class89.method644(62, var3);
            class209.field2958 = var2;
        }
        if (var5 == 20) {
            class251.field3681.method1309(arg0 - 73, 124);
            class251.field3681.method2103(var2, (byte) -122);
            class314.field4613++;
            class251.field3681.method2103(var4, (byte) -126);
            class251.field3681.method2091((byte) -76, var3);
            class211.field2985 = 0;
            class245.field3568 = class89.method644(arg0 ^ 0xFFFFFFC1, var3);
            class209.field2958 = var2;
        }
        if (var5 == 2) {
            class125.field1660++;
            class251.field3681.method1309(23, 205);
            class251.field3681.method2058(-97, var3);
            class251.field3681.method2080(255, var2);
            class251.field3681.method2081(-2076007248, var4);
            class211.field2985 = 0;
            class245.field3568 = class89.method644(-128, var3);
            class209.field2958 = var2;
        }
        if (var5 == 45) {
            class310.field4568 = 2;
            class210.field2975 = class140.field1950;
            class258.field3757++;
            class52.field682 = class305.field4465;
            class95.field1238 = 0;
            class251.field3681.method1309(arg0 ^ 0x77, 54);
            class251.field3681.method2048(class143.field1991[82] ? 1 : 0, 105);
            class251.field3681.method2080(255, class355.field5556 + var3);
            class251.field3681.method2098(arg0 ^ 0xFFFFFFDC, var4);
            class251.field3681.method2098(-88, class331.field4867 + var2);
            class352.method2450(class359.field5616.field4842[0], 0, 0, true, 0, var3, class359.field5616.field4936[0], 0, (byte) -112, 0, var2);
        }
        if (var5 == 22) {
            class239 var31 = class311.field4574[var4];
            if (var31 != null) {
                class52.field682 = class305.field4465;
                class310.field4568 = 2;
                class210.field2975 = class140.field1950;
                class177.field2434++;
                class95.field1238 = 0;
                class251.field3681.method1309(23, 96);
                class251.field3681.method2078(class143.field1991[82] ? 1 : 0, arg0 - 224);
                class251.field3681.method2098(-61, var4);
                class352.method2450(class359.field5616.field4842[0], 0, 0, true, var31.method1699(-1), var3, class359.field5616.field4936[0], 0, (byte) -100, var31.method1699(arg0 ^ 0xFFFFFF9F), var2);
            }
        }
        if (var5 == 60) {
            class239 var32 = class311.field4574[var4];
            if (var32 != null) {
                class310.field4568 = 2;
                class134.field1820++;
                class95.field1238 = 0;
                class210.field2975 = class140.field1950;
                class52.field682 = class305.field4465;
                class251.field3681.method1309(23, 223);
                class251.field3681.method2048(class143.field1991[82] ? 1 : 0, 60);
                class251.field3681.method2103(var4, (byte) -127);
                class352.method2450(class359.field5616.field4842[0], 0, 0, true, var32.method1699(arg0 - 97), var3, class359.field5616.field4936[0], 0, (byte) -118, var32.method1699(arg0 ^ 0xFFFFFF9F), var2);
            }
        }
        if (var5 == 1001) {
            class333 var33 = class89.method644(96, var3);
            if (var33 == null || var33.field5093[var2] < 100000) {
                class223.field3209++;
                class251.field3681.method1309(23, 72);
                class251.field3681.method2098(-55, var4);
            } else {
                class88.method641("", 0, false, var33.field5093[var2] + " x " + class172.method1265(var4, (byte) 1).field5674);
            }
            class211.field2985 = 0;
            class245.field3568 = class89.method644(122, var3);
            class209.field2958 = var2;
        }
        if (var5 == 18) {
            class251.field3681.method1309(23, 158);
            class251.field3681.method2084(true, var3);
            class333 var34 = class89.method644(112, var3);
            class274.field3923++;
            if (var34.field5079 != null && var34.field5079[0][0] == 5) {
                int var35 = var34.field5079[0][1];
                class208.field2956[var35] = 1 - class208.field2956[var35];
                class137.method1032((byte) 95, var35);
            }
        }
        if (var5 == 38) {
            class95.field1238 = 0;
            class310.field4568 = 2;
            class52.field682 = class305.field4465;
            class210.field2975 = class140.field1950;
            class247.field3596++;
            class251.field3681.method1309(23, 8);
            class251.field3681.method2103(var4, (byte) -128);
            class251.field3681.method2098(arg0 ^ 0xFFFFFFE2, class355.field5556 + var3);
            class251.field3681.method2098(arg0 ^ 0xFFFFFF92, class331.field4867 + var2);
            class251.field3681.method2078(class143.field1991[82] ? 1 : 0, arg0 ^ 0xFFFFFFF3);
            class352.method2450(class359.field5616.field4842[0], 0, 0, true, 0, var3, class359.field5616.field4936[0], 0, (byte) -118, 0, var2);
        }
        if (class339.field5304 != 0) {
            class339.field5304 = 0;
            class142.method1097(94, class89.method644(88, class104.field1357));
        }
        if (class276.field3954) {
            class26.method174((byte) 126);
        }
        if (class245.field3568 != null && class211.field2985 == 0) {
            class142.method1097(-118, class245.field3568);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BZ)V", line = 1082)
    public static final void method1949(byte arg0, boolean arg1) {
        field4098++;
        class180.field2467 = arg1;
        class116.field1498 = !class138.method1038(true);
        if (arg0 != 56) {
            field4075 = (long[]) null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 1097)
    public final AppletContext getAppletContext() {
        field4092++;
        if (class288.field4173 == null) {
            return class157.field2216 == null || class157.field2216.field883 == this ? super.getAppletContext() : class157.field2216.field883.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V", line = 1113)
    private final void method1950(int arg0) {
        field4107++;
        long var2 = class6.method37(10828);
        long var4 = class116.field1509[class160.field2278];
        class116.field1509[class160.field2278] = var2;
        if ((long) arg0 != var4 && var4 < var2) {
        }
        class160.field2278 = class160.field2278 + 1 & 0x1F;
        synchronized (this) {
            class344.field5344 = class190.field2626;
        }
        this.method900(false);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lfh;B)V", line = 1142)
    public static final void method1951(class140 arg0, byte arg1) {
        class211.field2987 = class356.method2473(arg0, (byte) 110, 0, class96.field1262);
        class314.field4624 = class356.method2473(arg0, (byte) 110, 0, class194.field2679);
        class221.field3187 = class356.method2473(arg0, (byte) 110, 0, class137.field1873);
        field4095++;
        class254.field3708 = class356.method2473(arg0, (byte) 110, 0, class229.field3288);
        class291.field4233 = class356.method2473(arg0, (byte) 110, 0, class115.field1481);
        class192.field2662 = class356.method2473(arg0, (byte) 110, 0, class56.field722);
        class264.field3842 = class103.method735(class35.field426, arg0, 8693, 0);
        class167.field2329 = class103.method735(class205.field2859, arg0, 8693, 0);
        class67.field855 = class103.method735(class287.field4156, arg0, 8693, 0);
        class311.field4578 = class335.method2341(arg0, class48.field639, -124, 0);
        class357.field5584 = class335.method2341(arg0, class319.field4696, -116, 0);
        class327.field4771.method1907(class357.field5584, (int[]) null);
        class235.field3374.method1907(class357.field5584, (int[]) null);
        class186.field2554.method1907(class357.field5584, (int[]) null);
        if (class47.field623) {
            class151.field2130 = class42.method310(arg0, (byte) 127, 0, class95.field1241);
            for (int var2 = 0; var2 < class151.field2130.length; var2++) {
                class151.field2130[var2].method1185();
            }
        }
        class11 var3 = class255.method1783(arg0, (byte) -64, class306.field4481, 0);
        var3.method82();
        if (class47.field623) {
            class84.field1090 = new class361(var3);
        } else {
            class84.field1090 = var3;
        }
        class11[] var4 = class73.method541(0, class125.field1654, (byte) -112, arg0);
        int var5 = 0;
        if (arg1 < 19) {
            field4080 = -86;
        }
        while (var4.length > var5) {
            var4[var5].method82();
            var5++;
        }
        if (class47.field623) {
            class211.field2986 = new class158[var4.length];
            for (int var6 = 0; var6 < var4.length; var6++) {
                class211.field2986[var6] = new class361(var4[var6]);
            }
        } else {
            class211.field2986 = var4;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V", line = 1215)
    public static void method1952(int arg0) {
        int var1 = -121 / ((-arg0 - 27) / 44);
        field4075 = null;
    }

    @OriginalMember(owner = "client!ue", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 1223)
    public final URL getDocumentBase() {
        field4087++;
        if (class288.field4173 == null) {
            return class157.field2216 == null || class157.field2216.field883 == this ? super.getDocumentBase() : class157.field2216.field883.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1240)
    public final void windowClosed(WindowEvent arg0) {
        field4093++;
    }

    @OriginalMember(owner = "client!ue", name = "providesignlink", descriptor = "(Lpm;)V", line = 1247)
    public static final void providesignlink(class69 arg0) {
        class157.field2216 = arg0;
        class330.field4831 = arg0;
        field4073++;
    }

    @OriginalMember(owner = "client!ue", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 1255)
    public final void focusGained(FocusEvent arg0) {
        field4101++;
        class190.field2626 = true;
        class116.field1500 = true;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(Z)V", line = 1269)
    public final synchronized void method1953(boolean arg0) {
        if (class26.field307 != null) {
            class26.field307.removeFocusListener(this);
            class26.field307.getParent().remove(class26.field307);
        }
        field4096++;
        Container var2;
        if (class117.field1519 != null) {
            var2 = class117.field1519;
        } else if (class288.field4173 == null) {
            var2 = class157.field2216.field883;
        } else {
            var2 = class288.field4173;
        }
        var2.setLayout((LayoutManager) null);
        class26.field307 = new class83(this);
        var2.add(class26.field307);
        class26.field307.setSize(class163.field2314, class192.field2660);
        class26.field307.setVisible(true);
        if (class288.field4173 == var2) {
            Insets var3 = class288.field4173.getInsets();
            class26.field307.setLocation(class242.field3508 + var3.left, class66.field834 + var3.top);
        } else {
            class26.field307.setLocation(class242.field3508, class66.field834);
        }
        class26.field307.addFocusListener(this);
        class26.field307.requestFocus();
        class190.field2626 = true;
        class116.field1500 = arg0;
        class132.field1796 = false;
        class344.field5344 = true;
        class222.field3200 = class6.method37(10828);
    }

    @OriginalMember(owner = "client!ue", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1313)
    public final void windowDeactivated(WindowEvent arg0) {
        field4106++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLjava/lang/String;)V", line = 1329)
    public final void method1954(byte arg0, String arg1) {
        field4070++;
        if (this.field4105) {
            return;
        }
        this.field4105 = true;
        System.out.println("error_game_" + arg1);
        if (arg0 != -21) {
            return;
        }
        try {
            class200.method1469(class157.field2216.field883, arg0 - 18257, "loggedout");
        } catch (Throwable var6) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ue", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1355)
    public final void windowIconified(WindowEvent arg0) {
        field4085++;
    }

    @OriginalMember(owner = "client!ue", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 1362)
    public final synchronized void paint(Graphics arg0) {
        field4067++;
        if (class16.field196 != this || client.field1636) {
            return;
        }
        class116.field1500 = true;
        if (class341.field5318 && !class47.field623 && class6.method37(10828) - class222.field3200 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class95.field1246 && class125.field1665 <= var2.height) {
                class132.field1796 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)Z", line = 1393)
    public final boolean method1955(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field4082++;
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            }
            this.method1954((byte) -21, "invalidhost");
            if (arg0 != -1) {
                this.focusGained((FocusEvent) null);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ue", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1435)
    public final void windowOpened(WindowEvent arg0) {
        field4078++;
    }

    @OriginalMember(owner = "client!ue", name = "start", descriptor = "()V", line = 1442)
    public final void start() {
        field4089++;
        if (class16.field196 == this && !client.field1636) {
            class7.field72 = 0L;
        }
    }

    @OriginalMember(owner = "client!ue", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 1454)
    public final URL getCodeBase() {
        field4090++;
        if (class288.field4173 == null) {
            return class157.field2216 == null || class157.field2216.field883 == this ? super.getCodeBase() : class157.field2216.field883.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V", line = 1476)
    private final void method1956(int arg0) {
        int var2 = 19 / ((-arg0 - 67) / 37);
        field4097++;
        long var3 = class6.method37(10828);
        long var5 = field4075[class308.field4504];
        field4075[class308.field4504] = var3;
        if (var5 != 0L && var3 > var5) {
            int var7 = (int) (var3 - var5);
            class287.field4153 = ((var7 >> 1) + 32000) / var7;
        }
        class308.field4504 = class308.field4504 + 1 & 0x1F;
        if (class223.field3214++ > 50) {
            class223.field3214 -= 50;
            class116.field1500 = true;
            class26.field307.setSize(class163.field2314, class192.field2660);
            class26.field307.setVisible(true);
            if (class288.field4173 != null && class117.field1519 == null) {
                Insets var8 = class288.field4173.getInsets();
                class26.field307.setLocation(class242.field3508 + var8.left, class66.field834 + var8.top);
            } else {
                class26.field307.setLocation(class242.field3508, class66.field834);
            }
        }
        this.method899(-94);
    }

    @OriginalMember(owner = "client!ue", name = "stop", descriptor = "()V", line = 1517)
    public final void stop() {
        field4077++;
        if (class16.field196 == this && !client.field1636) {
            class7.field72 = class6.method37(10828) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ue", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1529)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field4076++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZ)V", line = 1539)
    private final void method1957(int arg0, boolean arg1) {
        field4068++;
        int var3 = 50 % ((3 - arg0) / 51);
        synchronized (this) {
            if (client.field1636) {
                return;
            }
            client.field1636 = true;
        }
        if (class157.field2216.field883 != null) {
            class157.field2216.field883.destroy();
        }
        try {
            this.method890((byte) 32);
        } catch (Exception var15) {
        }
        if (this.field4104) {
            try {
                jagmisc.quit();
            } catch (Throwable var14) {
            }
            this.field4104 = false;
        }
        class157.field2216.method498(class16.field196.getClass(), -90);
        if (class26.field307 != null) {
            try {
                class26.field307.removeFocusListener(this);
                class26.field307.getParent().remove(class26.field307);
            } catch (Exception var13) {
            }
        }
        if (class157.field2216 != null) {
            try {
                class157.field2216.method497((byte) 76);
            } catch (Exception var12) {
            }
        }
        this.method897((byte) 116);
        if (class288.field4173 != null) {
            try {
                System.exit(0);
            } catch (Throwable var11) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)V", line = 1612)
    public static final void method1958(int arg0, int arg1) {
        field4069++;
        class42 var2 = class166.method1242(arg1, arg0, arg1 ^ 0xB58CAEE9);
        var2.method306((byte) -104);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIII)V", line = 1622)
    public final void method1959(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4081++;
        try {
            if (class16.field196 != null) {
                class5.field60++;
                if (class5.field60 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method1954((byte) -21, "alreadyloaded");
                return;
            }
            class242.field3508 = 0;
            class16.field196 = this;
            class66.field834 = 0;
            class163.field2314 = arg4;
            class95.field1246 = arg4;
            class181.field2480 = arg0;
            class192.field2660 = arg3;
            class125.field1665 = arg3;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class55.field715 = true;
            } else {
                class55.field715 = false;
            }
            if (class157.field2216 == null) {
                class330.field4831 = class157.field2216 = new class69(this, arg1, (String) null, 0);
            }
            class188 var7 = class157.field2216.method494(1, true, this);
            while (var7.field2608 == 0) {
                class177.method1299((byte) 64, 10L);
            }
            class333.field5061 = (Thread) var7.field2606;
        } catch (Exception var9) {
            class347.method2409(var9, arg2 + 27017, (String) null);
            this.method1954((byte) -21, "crash");
        }
        if (arg2 != -23093) {
            this.update((Graphics) null);
        }
    }

    @OriginalMember(owner = "client!ue", name = "run", descriptor = "()V", line = 1683)
    public final void run() {
        field4083++;
        try {
            if (class69.field885 != null) {
                String var1 = class69.field885.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class69.field877;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1954((byte) -21, "wrongjava");
                        return;
                    }
                    class338.field5266 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class69.field877 == null || class69.field877.equals("1.4.2"))) {
                    this.method1954((byte) -21, "wrongjava");
                    return;
                }
            }
            if (class69.field877 != null && class69.field877.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class69.field877.length() > var3) {
                    char var5 = class69.field877.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
                if (var4 >= 5) {
                    class341.field5318 = true;
                }
            }
            if (class157.field2216.field883 != null) {
                Method var6 = class69.field888;
                if (var6 != null) {
                    try {
                        var6.invoke(class157.field2216.field883, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            class78.method558(false);
            this.method1953(true);
            class283.field4035 = class9.method63((byte) -117, class192.field2660, class163.field2314, class26.field307);
            this.method892((byte) -96);
            class313.field4598 = class229.method1640((byte) -127);
            this.method1962(false);
            while (class7.field72 == 0L || class6.method37(10828) < class7.field72) {
                class288.field4172 = class313.field4598.method198(class338.field5266, 106, class90.field1134);
                for (int var8 = 0; var8 < class288.field4172; var8++) {
                    this.method1950(0);
                }
                this.method1956(-113);
                class279.method1884(class157.field2216, class26.field307, false);
            }
        } catch (Exception var11) {
            class347.method2409(var11, 3924, (String) null);
            this.method1954((byte) -21, "crash");
        }
        this.method1957(85, true);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILjava/lang/String;IZIII)V", line = 1803)
    public final void method1960(int arg0, int arg1, String arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        try {
            class66.field834 = 0;
            class181.field2480 = arg3;
            class192.field2660 = arg6;
            class125.field1665 = arg6;
            class163.field2314 = arg7;
            class95.field1246 = arg7;
            class16.field196 = this;
            class242.field3508 = 0;
            class288.field4173 = new Frame();
            class288.field4173.setTitle("Jagex");
            class288.field4173.setResizable(true);
            class288.field4173.addWindowListener(this);
            class288.field4173.setVisible(true);
            class288.field4173.toFront();
            if (arg1 != -9412) {
                field4075 = (long[]) null;
            }
            Insets var9 = class288.field4173.getInsets();
            class288.field4173.setSize(class95.field1246 + var9.left + var9.right, class125.field1665 - -var9.top + var9.bottom);
            class330.field4831 = class157.field2216 = new class69((Applet) null, arg0, arg2, arg5);
            class188 var10 = class157.field2216.method494(1, true, this);
            while (var10.field2608 == 0) {
                class177.method1299((byte) 64, 10L);
            }
            class333.field5061 = (Thread) var10.field2606;
        } catch (Exception var12) {
            class347.method2409(var12, arg1 ^ 0xFFFFD468, (String) null);
        }
        field4094++;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(IZ)V", line = 1849)
    public static final void method1961(int arg0, boolean arg1) {
        field4071++;
        if (arg1) {
            method1949((byte) -38, false);
        }
        class42 var2 = class166.method1242(5, arg0, -1249071392);
        var2.method306((byte) -104);
    }

    @OriginalMember(owner = "client!ue", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 1864)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field4102++;
    }

    @OriginalMember(owner = "client!ue", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 1873)
    public final void focusLost(FocusEvent arg0) {
        class190.field2626 = false;
        field4072++;
    }

    @OriginalMember(owner = "client!ue", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1882)
    public final void windowActivated(WindowEvent arg0) {
        field4074++;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(Z)V", line = 1889)
    public final void method1962(boolean arg0) {
        if (arg0) {
            field4080 = -55;
        }
        field4086++;
        if (this.field4104) {
            return;
        }
        try {
            class188 var2 = class157.field2216.method503(class16.field196.getClass(), -113);
            while (var2.field2608 == 0) {
                class177.method1299((byte) 64, 100L);
            }
            if (var2.field2606 != null) {
                throw (Throwable) var2.field2606;
            }
            jagmisc.init();
            this.field4104 = true;
            class313.field4598 = class229.method1640((byte) -127);
        } catch (Throwable var4) {
        }
    }

    @OriginalMember(owner = "client!ue", name = "destroy", descriptor = "()V", line = 1923)
    public final void destroy() {
        field4088++;
        if (class16.field196 == this && !client.field1636) {
            class7.field72 = class6.method37(10828);
            class177.method1299((byte) 64, 5000L);
            class330.field4831 = null;
            this.method1957(73, false);
        }
    }

    @OriginalMember(owner = "client!ue", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 1940)
    public final String getParameter(String arg0) {
        field4100++;
        if (class288.field4173 == null) {
            return class157.field2216 == null || class157.field2216.field883 == this ? super.getParameter(arg0) : class157.field2216.field883.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
    public abstract void method900(boolean arg0);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public abstract void method890(byte arg0);

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
    public abstract void method897(byte arg0);

    @OriginalMember(owner = "client!ue", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)V")
    public abstract void method899(int arg0);

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)V")
    public abstract void method892(byte arg0);
}
