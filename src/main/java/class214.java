import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public abstract class class214 {

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "Lbe;")
    public static class283 field3636 = class153.method941(-3, "Mem:");

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "Lbe;")
    public static class283 field3634 = class153.method941(127, "Fertigkeit)2");

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "F")
    public static float field3638;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BLfe;I)Lbe;", line = 9)
    public static final class283 method1414(byte arg0, class229 arg1, int arg2) {
        field3639++;
        try {
            int var3 = 56 % ((-arg0 - 40) / 35);
            class283 var4 = new class283();
            var4.field4812 = arg1.method1557(255);
            if (var4.field4812 > arg2) {
                var4.field4812 = arg2;
            }
            var4.field4843 = new byte[var4.field4812];
            arg1.field3905 += class303.field5116.method218(-98, var4.field4843, arg1.field3879, arg1.field3905, 0, var4.field4812);
            return var4;
        } catch (Exception var6) {
            return class123.field2052;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BLjava/lang/String;)Lbe;", line = 41)
    public static final class283 method1415(byte arg0, String arg1) {
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg1.getBytes();
        }
        class283 var4 = new class283();
        var4.field4843 = var2;
        var4.field4812 = 0;
        field3640++;
        if (arg0 != -79) {
            method1414((byte) 21, (class229) null, 37);
        }
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var4.field4812++] = var2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V", line = 81)
    public static void method1416(int arg0) {
        if (arg0 != -65536) {
            method1414((byte) 13, (class229) null, 57);
        }
        field3634 = null;
        field3636 = null;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)V", line = 105)
    public static final void method1417(byte arg0) {
        field3633++;
        if (arg0 > -78) {
            field3637 = -18;
        }
        for (int var1 = 0; var1 < class69.field1015; var1++) {
            int var2 = class26.field393[var1];
            class60 var3 = class33.field493[var2];
            int var4 = class262.field4462.method1535((byte) 104);
            if ((var4 & 0x10) != 0) {
                var3.field1179 = class262.field4462.method1496(true);
                var3.field1164 = class262.field4462.method1537(2);
            }
            if ((var4 & 0x20) != 0) {
                var3.field1174 = class262.field4462.method1541((byte) -128);
                if (var3.field1174 == 65535) {
                    var3.field1174 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                int var5 = class262.field4462.method1496(true);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class262.field4462.method1545(-128);
                class107.method713(var5, var6, false, var3);
            }
            if ((var4 & 0x40) != 0) {
                int var7 = class262.field4462.method1535((byte) 89);
                int var8 = class262.field4462.method1543(255);
                var3.method455(var8, class75.field1309, 14095, var7);
            }
            if ((var4 & 0x80) != 0) {
                var3.field1211 = class262.field4462.method1541((byte) -128);
                int var9 = class262.field4462.method1521(-105);
                var3.field1215 = (var9 & 0xFFFF) + class75.field1309;
                var3.field1206 = 0;
                var3.field1165 = 0;
                if (var3.field1211 == 65535) {
                    var3.field1211 = -1;
                }
                if (var3.field1215 > class75.field1309) {
                    var3.field1206 = -1;
                }
                var3.field1175 = var9 >> 16;
                if (var3.field1211 != -1 && class75.field1309 == var3.field1215) {
                    int var10 = class259.method1750((byte) 72, var3.field1211).field2831;
                    if (var10 != -1) {
                        class157 var11 = class132.method821(128, var10);
                        if (var11 != null && var11.field2578 != null) {
                            class141.method888(0, var11, var3.field1210, false, 0, var3.field1193);
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                if (var3.field822.method813(-1)) {
                    class1.method1(0, var3);
                }
                var3.field822 = class207.method1379(-63, class262.field4462.method1541((byte) -128));
                var3.method458(var3.field822.field2157, 18072);
                var3.field1169 = var3.field822.field2201;
                var3.field1204 = var3.field822.field2158;
                var3.field1207 = var3.field822.field2160;
                var3.field1203 = var3.field822.field2200;
                var3.field1202 = var3.field822.field2173;
                var3.field1184 = var3.field822.field2168;
                var3.field1152 = var3.field822.field2146;
                var3.field1151 = var3.field822.field2178;
                if (var3.field822.method813(-1)) {
                    class134.method832(0, (class281) null, (class191) null, var3.field1150[0], var3, -4, class61.field850, var3.field1178[0]);
                }
            }
            if ((var4 & 0x8) != 0) {
                int var12 = class262.field4462.method1543(255);
                int var13 = class262.field4462.method1543(255);
                var3.method455(var13, class75.field1309, 14095, var12);
                var3.field1213 = class75.field1309 + 300;
                var3.field1214 = class262.field4462.method1535((byte) 110);
            }
            if ((var4 & 0x2) != 0) {
                var3.field1190 = class262.field4462.method1549(true);
                var3.field1189 = 100;
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIII)V", line = 251)
    public static final void method1418(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg5 - arg6) >= class269.field4551 && (arg5 + arg6) <= class166.field2765 && arg3 - arg6 >= class217.field3677 && (arg3 + arg6) <= class247.field4220) {
            class82.method534(arg5, 120164129, arg0, arg4, arg1, arg6, arg3);
        } else {
            class175.method1155(arg3, arg5, arg6, arg1, (byte) -107, arg0, arg4);
        }
        field3632++;
        if (arg2 != -18704) {
            method1414((byte) -116, (class229) null, 105);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
    public abstract void method937(byte arg0);

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BII)I")
    public abstract int method936(byte arg0, int arg1, int arg2);
}
