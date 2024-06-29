import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class94 extends class7 {

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "Lmd;")
    public class321 field1143;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!gg", name = "B", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!gg", name = "C", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)V", line = 3)
    public static final void method550(int arg0) {
        field1146++;
        if (class189.field3097) {
            return;
        }
        class189.field3097 = true;
        class324.field5089 = true;
        if (arg0 != -128) {
            method556((class447) null, -47);
        }
        if (class301.field4772) {
            class329.field5153 = (float) ((int) class329.field5153 - 65 & 0xFFFFFF80);
        } else {
            class424.field6260 += (-24.0F - class424.field6260) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)Lse;", line = 33)
    public static final class138 method551(int arg0, int arg1) {
        field1147++;
        class138 var2 = (class138) class142.field2254.method331((byte) 69, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class45.field568.method2771(34, arg1, 3);
        class138 var4 = new class138();
        if (var3 != null) {
            var4.method1011(arg0 - 6636, new class186(var3), arg1);
        }
        class142.field2254.method341(arg0 ^ 0x19C5, (long) arg1, var4);
        return arg0 == 6635 ? var4 : null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljd;Z)I", line = 58)
    public static final int method552(class124 arg0, boolean arg1) {
        field1140++;
        if (arg0.field1833 == 0) {
            return 0;
        }
        if (arg0.field1832 != -1 && arg0.field1832 < 32768) {
            class50 var2 = class39.field499[arg0.field1832];
            if (var2 != null) {
                int var3 = arg0.field724 - var2.field724;
                int var4 = arg0.field722 - var2.field722;
                if (var3 != 0 || var4 != 0) {
                    arg0.method904((int) (Math.atan2((double) var3, (double) var4) * 2607.5945876176133D) & 0x3FFF, 1);
                }
            }
        }
        if (arg0.field1832 >= 32768) {
            int var5 = arg0.field1832 - 32768;
            if (class39.field500 == var5) {
                var5 = 2047;
            }
            class219 var6 = class216.field3517[var5];
            if (var6 != null) {
                int var7 = arg0.field724 - var6.field724;
                int var8 = arg0.field722 - var6.field722;
                if (var7 != 0 || var8 != 0) {
                    arg0.method904((int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF, 1);
                }
            }
        }
        if ((arg0.field1848 != 0 || arg0.field1844 != 0) && (arg0.field1909 == 0 || arg0.field1903 > 0)) {
            int var9 = arg0.field724 - ((arg0.field1848 - class409.field6048 - class409.field6048) * 64);
            int var10 = arg0.field722 - ((arg0.field1844 - class444.field6481 - class444.field6481) * 64);
            if (var9 != 0 || var10 != 0) {
                arg0.method904((int) (Math.atan2((double) var9, (double) var10) * 2607.5945876176133D) & 0x3FFF, 1);
            }
            arg0.field1848 = 0;
            arg0.field1844 = 0;
        }
        return arg1 ? arg0.method916(-1) : -9;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lmd;)V", line = 131)
    public class94(class321 arg0) {
        this.field1143 = arg0;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Le;[[BLlf;[[B[[B[[BII[[IZILlf;I)V", line = 140)
    public static final void method553(class312 arg0, byte[][] arg1, class129 arg2, byte[][] arg3, byte[][] arg4, byte[][] arg5, int arg6, int arg7, int[][] arg8, boolean arg9, int arg10, class129 arg11, int arg12) {
        if (class128.field2035 == 0 && !class395.field5923) {
            class406.method2547(arg0, arg9, arg5, arg4, arg8, (byte) -101, arg2, arg1, arg3, arg6, arg11, arg10, arg12);
        } else {
            class285.method1935(arg3, arg11, arg8, arg1, arg6, arg10, arg5, arg4, arg12, 2833, arg9, arg0, arg2);
        }
        field1148++;
        if (arg7 == -1) {
            ;
        }
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)V", line = 155)
    public static final void method554(byte arg0) {
        if (class441.field6457 != null) {
            class441.field6457.method1549(126);
        }
        field1145++;
        if (class313.field4928 != null) {
            class313.field4928.method1549(-106);
        }
        class185.method1261(true, 2, class349.field5410, 22050);
        if (arg0 != -5) {
            method557(124, (byte) 42);
        }
        class441.field6457 = class119.method862(class86.field1073, 29522, 0, class63.field822, 22050);
        class441.field6457.method1542((byte) 63, class385.field5821);
        class313.field4928 = class119.method862(class86.field1073, arg0 + 29527, 1, class63.field822, 2048);
        class313.field4928.method1542((byte) 63, class82.field1025);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 182)
    public static final void method555(int arg0, Component arg1) {
        int var2 = -101 / ((75 - arg0) / 35);
        field1144++;
        Method var3 = class279.field4476;
        if (var3 != null) {
            try {
                var3.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class312.field4907);
        arg1.addFocusListener(class312.field4907);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lmo;I)V", line = 203)
    public static final void method556(class447 arg0, int arg1) {
        class402.field5990 = arg0;
        field1141++;
        if (arg1 < -44) {
            ;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)V", line = 214)
    public static final void method557(int arg0, byte arg1) {
        class19.field239 = arg0;
        field1142++;
        class52 var2 = class37.field464;
        synchronized (class37.field464) {
            int var3 = 50 % ((arg1 - 58) / 54);
            class37.field464.method335((byte) 69);
        }
        class52 var4 = class269.field4310;
        synchronized (class269.field4310) {
            class269.field4310.method335((byte) -102);
        }
        class52 var5 = class43.field533;
        synchronized (class43.field533) {
            class43.field533.method335((byte) 122);
        }
    }
}
