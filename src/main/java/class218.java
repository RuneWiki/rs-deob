import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public abstract class class218 {

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "[I")
    public static int[] field3341 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public int field3336;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public int field3339;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Ljd;")
    public static class95 field3332;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Ljava/awt/Image;")
    public Image field3331;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "[I")
    public int[] field3337;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V", line = 7)
    public static final void method1552(byte arg0) {
        field3338++;
        int var1 = 85 % ((-arg0) / 53);
        if (class300.field4622 == 0) {
            return;
        }
        try {
            if (++class205.field3150 > 1500) {
                if (class1.field20 != null) {
                    class1.field20.method1653(-19746);
                    class1.field20 = null;
                }
                if (class14.field194 >= 1) {
                    class184.field2907 = -5;
                    class300.field4622 = 0;
                    return;
                }
                class14.field194++;
                class205.field3150 = 0;
                class300.field4622 = 1;
                if (class75.field1092 == class280.field4347) {
                    class75.field1092 = class320.field4954;
                } else {
                    class75.field1092 = class280.field4347;
                }
            }
            if (class300.field4622 == 1) {
                class296.field4569 = class330.field5074.method65((byte) -31, class75.field1092, class203.field3114);
                class300.field4622 = 2;
            }
            if (class300.field4622 == 2) {
                if (class296.field4569.field3185 == 2) {
                    throw new IOException();
                }
                if (class296.field4569.field3185 != 1) {
                    return;
                }
                class1.field20 = new class237((Socket) class296.field4569.field3186, class330.field5074);
                class296.field4569 = null;
                class1.field20.method1651(0, class85.field1236.field3866, class85.field1236.field3840, (byte) -75);
                if (class250.field3778 != null) {
                    class250.field3778.method2298((byte) 42);
                }
                if (class234.field3567 != null) {
                    class234.field3567.method2298((byte) 42);
                }
                int var2 = class1.field20.method1655(0);
                if (class250.field3778 != null) {
                    class250.field3778.method2298((byte) 42);
                }
                if (class234.field3567 != null) {
                    class234.field3567.method2298((byte) 42);
                }
                if (var2 != 101) {
                    class300.field4622 = 0;
                    class184.field2907 = var2;
                    class1.field20.method1653(-19746);
                    class1.field20 = null;
                    return;
                }
                class300.field4622 = 3;
            }
            if (class300.field4622 == 3) {
                if (class1.field20.method1648(0) >= 2) {
                    int var3 = class1.field20.method1655(0) << 8 | class1.field20.method1655(0);
                    class51.method381(var3, 1);
                    if (class224.field3424 != -1) {
                        class300.field4622 = 0;
                        class1.field20.method1653(-19746);
                        class1.field20 = null;
                        class142.method1086(-3);
                        return;
                    }
                    class184.field2907 = 6;
                    class300.field4622 = 0;
                    class1.field20.method1653(-19746);
                    class1.field20 = null;
                    return;
                }
                return;
            }
        } catch (IOException var5) {
            if (class1.field20 != null) {
                class1.field20.method1653(-19746);
                class1.field20 = null;
            }
            if (class14.field194 >= 1) {
                class184.field2907 = -4;
                class300.field4622 = 0;
            } else {
                class300.field4622 = 1;
                class14.field194++;
                class205.field3150 = 0;
                if (class75.field1092 == class280.field4347) {
                    class75.field1092 = class320.field4954;
                } else {
                    class75.field1092 = class280.field4347;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIIIII)V", line = 161)
    public static final void method1553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3343++;
        if (arg1 >= class234.field3569 && class322.field4965 >= arg1 && arg7 >= class234.field3569 && arg7 <= class322.field4965 && class234.field3569 <= arg3 && arg3 <= class322.field4965 && arg8 >= class234.field3569 && class322.field4965 >= arg8 && arg6 >= class212.field3261 && class182.field2888 >= arg6 && class212.field3261 <= arg5 && class182.field2888 >= arg5 && arg9 >= class212.field3261 && arg9 <= class182.field2888 && class212.field3261 <= arg4 && arg4 <= class182.field2888) {
            class202.method1461(arg1, arg8, arg0, arg3, 3, arg9, arg4, arg7, arg6, arg5);
        } else {
            class69.method490(arg9, arg6, arg7, arg5, arg8, arg3, arg1, arg0, (byte) -50, arg4);
        }
        if (arg2 != 0) {
            method1557((class254) null, (byte) 35);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 179)
    public final void method1554(int arg0) {
        if (arg0 == 9969) {
            class287.method1986(this.field3337, this.field3336, this.field3339);
            field3335++;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([BI)Lnk;", line = 191)
    public static final class326 method1555(byte[] arg0, int arg1) {
        field3334++;
        if (arg0 == null) {
            return null;
        } else if (arg1 == 2) {
            class326 var2;
            if (class73.field1058) {
                var2 = new class145(arg0, class304.field4666, class27.field293, class133.field2028, class209.field3191, class220.field3362);
            } else {
                var2 = new class68(arg0, class304.field4666, class27.field293, class133.field2028, class209.field3191, class220.field3362);
            }
            class245.method1684(255);
            return var2;
        } else {
            return (class326) null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V", line = 211)
    protected class218() {
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V", line = 220)
    public static void method1556(byte arg0) {
        if (arg0 <= 125) {
            field3341 = (int[]) null;
        }
        field3341 = null;
        field3332 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lwm;B)Lvh;", line = 231)
    public static final class157 method1557(class254 arg0, byte arg1) {
        if (arg1 >= -120) {
            return (class157) null;
        } else {
            field3340++;
            return new class157(arg0.method1768(65536), arg0.method1768(65536), arg0.method1768(65536), arg0.method1768(65536), arg0.method1768(65536), arg0.method1768(65536), arg0.method1768(65536), arg0.method1768(65536), arg0.method1758((byte) 99), arg0.method1774((byte) -106));
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBIILjava/awt/Graphics;I)V")
    public abstract void method1089(int arg0, byte arg1, int arg2, int arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method1091(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBLjava/awt/Component;I)V")
    public abstract void method1090(int arg0, byte arg1, Component arg2, int arg3);
}
