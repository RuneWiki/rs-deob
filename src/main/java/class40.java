import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class40 extends class187 {

    @OriginalMember(owner = "client!gs", name = "w", descriptor = "Z")
    public static boolean field403 = false;

    @OriginalMember(owner = "client!gs", name = "E", descriptor = "Ljava/lang/String;")
    public static String field411 = "Created gameworld";

    @OriginalMember(owner = "client!gs", name = "I", descriptor = "I")
    public static int field415 = 0;

    @OriginalMember(owner = "client!gs", name = "x", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!gs", name = "y", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!gs", name = "A", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!gs", name = "C", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!gs", name = "D", descriptor = "I")
    public int field410;

    @OriginalMember(owner = "client!gs", name = "F", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!gs", name = "G", descriptor = "I")
    public int field413;

    @OriginalMember(owner = "client!gs", name = "H", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!gs", name = "J", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!gs", name = "K", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!gs", name = "L", descriptor = "I")
    public int field418;

    @OriginalMember(owner = "client!gs", name = "M", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!gs", name = "z", descriptor = "Ljava/awt/Font;")
    public static Font field406;

    @OriginalMember(owner = "client!gs", name = "B", descriptor = "Ljava/lang/String;")
    public String field408;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIIIII)V", line = 6)
    public static final void method187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 == 31083) {
            ++field412;
            if (arg4 >= class322.field4306 && ~arg6 >= ~class310.field4183 && arg1 >= class335.field4462 && class6.field42 >= arg2) {
                if (arg0 == 1) {
                    class252.method1402(arg6, arg2, arg5 ^ 31083, arg3, arg4, arg1);
                } else {
                    class72.method410(arg2, arg0, arg4, arg1, false, arg3, arg6);
                }
            } else if (arg0 == 1) {
                class263.method1473(arg1, arg4, arg6, arg2, (byte) 68, arg3);
            } else {
                class205.method1111(arg0, arg2, arg3, arg4, arg6, (byte) -119, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "(I)I", line = 39)
    public final int method188(int arg0) {
        if (arg0 != 24168416) {
            this.method191(56);
        }
        ++field409;
        return (int) (255L & super.field4510 >>> 32);
    }

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "(I)V", line = 57)
    public static void method189(int arg0) {
        field411 = null;
        field406 = null;
        if (arg0 != 13) {
            method189(30);
        }
    }

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "(I)V", line = 70)
    public final void method190(int arg0) {
        super.field2365 |= Long.MIN_VALUE;
        ++field416;
        if ((long) arg0 == this.method191(31520)) {
            class380.field5363.method393((byte) 115, this);
        }
    }

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "(I)J", line = 84)
    public final long method191(int arg0) {
        ++field407;
        if (arg0 != 31520) {
            this.field413 = -44;
        }
        return Long.MAX_VALUE & super.field2365;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lvm;)V", line = 98)
    public static final void method192(class322 arg0) {
        for (int var1 = class27.field257; var1 < class366.field5129; ++var1) {
            for (int var2 = 0; var2 < class231.field3184; ++var2) {
                for (int var3 = 0; var3 < class209.field2840; ++var3) {
                    class96 var4 = class176.field2209[var1][var2][var3];
                    if (var4 != null) {
                        class449 var5 = var4.field1128;
                        class449 var6 = var4.field1136;
                        if (var5 != null && var5.method345((byte) -72)) {
                            class410.method2555(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method345((byte) -72)) {
                                class410.method2555(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method353(false, 122, 0, 0, var5, 0, arg0);
                                var6.method346(-109);
                            }
                            var5.method346(-88);
                        }
                        for (class122 var7 = var4.field1130; var7 != null; var7 = var7.field1511) {
                            class17 var9 = var7.field1505;
                            if (var9 != null && var9.method345((byte) -72)) {
                                class410.method2555(arg0, var9, var1, var2, var3, var9.field158 - var9.field168 + 1, var9.field153 - var9.field159 + 1);
                                var9.method346(-126);
                            }
                        }
                        class206 var8 = var4.field1135;
                        if (var8 != null && var8.method345((byte) -72)) {
                            class118.method641(arg0, var8, var1, var2, var3);
                            var8.method346(-114);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "(I)V", line = 187)
    public final void method193(int arg0) {
        ++field405;
        if (arg0 >= -53) {
            field406 = null;
        }
        super.field2365 = 500L + class442.method2730(25207) | Long.MIN_VALUE & super.field2365;
        class96.field1119.method393((byte) 111, this);
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(II)V", line = 199)
    public class40(int arg0, int arg1) {
        super.field4510 = (long) arg1 | (long) arg0 << 32;
    }

    @OriginalMember(owner = "client!gs", name = "k", descriptor = "(I)I", line = 208)
    public final int method194(int arg0) {
        ++field419;
        if (arg0 != -13661) {
            this.method194(-98);
        }
        return (int) super.field4510;
    }
}
