import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class63 extends class105 {

    @OriginalMember(owner = "client!ja", name = "lb", descriptor = "I")
    private int field1229 = 0;

    @OriginalMember(owner = "client!ja", name = "Bb", descriptor = "Z")
    public boolean field1245 = false;

    @OriginalMember(owner = "client!ja", name = "Ab", descriptor = "I")
    private int field1244 = 0;

    @OriginalMember(owner = "client!ja", name = "kb", descriptor = "I")
    public int field1228;

    @OriginalMember(owner = "client!ja", name = "mb", descriptor = "I")
    public int field1230;

    @OriginalMember(owner = "client!ja", name = "vb", descriptor = "I")
    public int field1239;

    @OriginalMember(owner = "client!ja", name = "nb", descriptor = "I")
    public int field1231;

    @OriginalMember(owner = "client!ja", name = "Cb", descriptor = "I")
    private int field1246;

    @OriginalMember(owner = "client!ja", name = "rb", descriptor = "I")
    public int field1235;

    @OriginalMember(owner = "client!ja", name = "ob", descriptor = "Lnc;")
    private class93 field1232;

    @OriginalMember(owner = "client!ja", name = "pb", descriptor = "I")
    public static int field1233 = 0;

    @OriginalMember(owner = "client!ja", name = "sb", descriptor = "Lje;")
    public static class67 field1236 = class85.method592(255, "mapedge");

    @OriginalMember(owner = "client!ja", name = "ub", descriptor = "Z")
    public static boolean field1238 = false;

    @OriginalMember(owner = "client!ja", name = "yb", descriptor = "[Z")
    public static boolean[] field1242 = new boolean[112];

    @OriginalMember(owner = "client!ja", name = "zb", descriptor = "Lje;")
    public static class67 field1243 = class85.method592(255, "<col=ffff00>");

    @OriginalMember(owner = "client!ja", name = "qb", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!ja", name = "tb", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!ja", name = "wb", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!ja", name = "xb", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!ja", name = "Db", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)Lad;")
    public final class5 method16(int arg0) {
        if (arg0 != 0) {
            field1236 = null;
        }
        field1234++;
        class144 var2 = class79.method566(this.field1246, false);
        class5 var3;
        if (this.field1245) {
            var3 = var2.method1111((byte) -19, -1);
        } else {
            var3 = var2.method1111((byte) -19, this.field1244);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IB)V")
    public final void method426(int arg0, byte arg1) {
        if (arg1 != -89) {
            method427((byte) -91, -109, 4);
        }
        field1247++;
        if (this.field1245) {
            return;
        }
        this.field1229 += arg0;
        while (this.field1232.field2072[this.field1244] < this.field1229) {
            this.field1229 -= this.field1232.field2072[this.field1244];
            this.field1244++;
            if (this.field1244 >= this.field1232.field2075.length) {
                this.field1245 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BII)V")
    public static final void method427(byte arg0, int arg1, int arg2) {
        field1237++;
        if (arg0 < 59) {
            method429(null, null, 47);
        }
        class69.field1399.method285(68, (byte) 64);
        class69.field1399.method638(arg1, true);
        class159.field3661++;
        class69.field1399.method655(arg2, -1735580088);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
    public static void method428(boolean arg0) {
        field1243 = null;
        field1236 = null;
        field1242 = null;
        if (!arg0) {
            method428(false);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lkc;Lje;I)Lje;")
    public static final class67 method429(class72 arg0, class67 arg1, int arg2) {
        field1241++;
        if (arg2 != 21388) {
            return null;
        } else if (arg1.method472(class97.field2175, arg2 + 8991) == -1) {
            return arg1;
        } else {
            while (true) {
                int var3 = arg1.method472(class138.field3112, 30379);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.method472(class98.field2194, 30379);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.method472(class121.field2725, 30379);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.method472(class69.field1421, 30379);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.method472(class12.field228, 30379);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.method472(class118.field2655, 30379);
                                                        if (var8 == -1) {
                                                            return arg1;
                                                        }
                                                        class67 var9 = class52.field1030;
                                                        if (class16.field277 != null) {
                                                            var9 = class88.method613(class16.field277.field809, (byte) -69);
                                                            try {
                                                                if (class16.field277.field808 != null) {
                                                                    byte[] var10 = ((String) class16.field277.field808).getBytes("ISO-8859-1");
                                                                    var9 = class91.method660((byte) 84, var10.length, var10, 0);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg1 = class49.method314(new class67[] { arg1.method448(0, var8, arg2 ^ 0xFFFFAC0A), var9, arg1.method463(var8 + 4, -95) }, arg2 ^ 0x538C);
                                                    }
                                                }
                                                arg1 = class49.method314(new class67[] { arg1.method448(0, var7, -128), class67.method474(class137.method1047(4, true, arg0), -16820), arg1.method463(var7 + 2, -97) }, 0);
                                            }
                                        }
                                        arg1 = class49.method314(new class67[] { arg1.method448(0, var6, -117), class67.method474(class137.method1047(3, true, arg0), -16820), arg1.method463(var6 + 2, -107) }, 0);
                                    }
                                }
                                arg1 = class49.method314(new class67[] { arg1.method448(0, var5, -121), class67.method474(class137.method1047(2, true, arg0), -16820), arg1.method463(var5 + 2, -110) }, 0);
                            }
                        }
                        arg1 = class49.method314(new class67[] { arg1.method448(0, var4, -119), class67.method474(class137.method1047(1, true, arg0), arg2 ^ 0xFFFFEDC0), arg1.method463(var4 + 2, -122) }, 0);
                    }
                }
                arg1 = class49.method314(new class67[] { arg1.method448(0, var3, -126), class67.method474(class137.method1047(0, true, arg0), -16820), arg1.method463(var3 + 2, -94) }, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(IIIIIII)V")
    public class63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1228 = arg3;
        this.field1230 = arg5 + arg6;
        this.field1239 = arg1;
        this.field1231 = arg4;
        this.field1246 = arg0;
        this.field1235 = arg2;
        int var8 = class79.method566(this.field1246, false).field3294;
        if (var8 == -1) {
            this.field1245 = true;
        } else {
            this.field1245 = false;
            this.field1232 = class49.method316(var8, false);
        }
    }
}
