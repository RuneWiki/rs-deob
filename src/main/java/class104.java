import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class104 extends OutputStream {

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field1402 = -1;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "Lwe;")
    public static class24 field1396 = new class24(260);

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "Lqj;")
    public static class238 field1397;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field1403;

    @OriginalMember(owner = "client!ge", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field1394++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;B)[B")
    public static final byte[] method706(String arg0, byte arg1) {
        field1395++;
        int var2 = -103 / ((75 - arg1) / 36);
        int var3 = arg0.length();
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            char var6 = arg0.charAt(var5);
            if (var6 > '\u0000' && var6 < '\u0080' || var6 >= ' ' && var6 <= 'ÿ') {
                var4[var5] = (byte) var6;
            } else if (var6 == '€') {
                var4[var5] = -128;
            } else if (var6 == '‚') {
                var4[var5] = -126;
            } else if (var6 == 'ƒ') {
                var4[var5] = -125;
            } else if (var6 == '„') {
                var4[var5] = -124;
            } else if (var6 == '…') {
                var4[var5] = -123;
            } else if (var6 == '†') {
                var4[var5] = -122;
            } else if (var6 == '‡') {
                var4[var5] = -121;
            } else if (var6 == 'ˆ') {
                var4[var5] = -120;
            } else if (var6 == '‰') {
                var4[var5] = -119;
            } else if (var6 == 'Š') {
                var4[var5] = -118;
            } else if (var6 == '‹') {
                var4[var5] = -117;
            } else if (var6 == 'Œ') {
                var4[var5] = -116;
            } else if (var6 == 'Ž') {
                var4[var5] = -114;
            } else if (var6 == '‘') {
                var4[var5] = -111;
            } else if (var6 == '’') {
                var4[var5] = -110;
            } else if (var6 == '“') {
                var4[var5] = -109;
            } else if (var6 == '”') {
                var4[var5] = -108;
            } else if (var6 == '•') {
                var4[var5] = -107;
            } else if (var6 == '–') {
                var4[var5] = -106;
            } else if (var6 == '—') {
                var4[var5] = -105;
            } else if (var6 == '˜') {
                var4[var5] = -104;
            } else if (var6 == '™') {
                var4[var5] = -103;
            } else if (var6 == 'š') {
                var4[var5] = -102;
            } else if (var6 == '›') {
                var4[var5] = -101;
            } else if (var6 == 'œ') {
                var4[var5] = -100;
            } else if (var6 == 'ž') {
                var4[var5] = -98;
            } else if (var6 == 'Ÿ') {
                var4[var5] = -97;
            } else {
                var4[var5] = 63;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)Lc;")
    public static final class159 method707(int arg0, byte arg1) {
        field1400++;
        if (class349.field5180 && arg0 >= class307.field4393 && arg0 <= class407.field6099) {
            if (arg1 < 66) {
                method708((class194) null, 125);
            }
            return class168.field2208[arg0 - class307.field4393];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lvp;I)V")
    public static final void method708(class194 arg0, int arg1) {
        field1398++;
        class166 var2 = (class166) class84.field1175.method954(-74, (long) arg0.field249);
        if (var2 != null) {
            if (var2.field2162 != null) {
                class405.field6092.method166(var2.field2162);
                var2.field2162 = null;
            }
            var2.method2574((byte) 127);
        }
        if (arg1 != 4) {
            method711(-124, -96, 115);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public static void method709(int arg0) {
        field1396 = null;
        field1397 = null;
        if (arg0 != 1) {
            method708((class194) null, 115);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1399++;
        if (arg7 >= 0 && arg4 >= 0 && arg7 < class324.field4652 - 1 && class336.field4964 - 1 > arg4) {
            if (class343.field5032 == null) {
                return;
            }
            if (arg6 == 0) {
                class351 var12 = (class351) class87.method539(arg3, arg7, arg4);
                class351 var13 = (class351) class319.method1984(arg3, arg7, arg4);
                if (var12 != null && arg2 != 2) {
                    if ((var12 instanceof class155)) {
                        ((class155) var12).field2022.method750(arg1, 74);
                    } else {
                        class417.method2689(arg3, arg6, arg4, arg1, arg5, arg7, var12.method150((byte) -127), arg2, -108);
                    }
                }
                if (var13 != null) {
                    if (var13 instanceof class155) {
                        ((class155) var13).field2022.method750(arg1, arg0 - 8125);
                    } else {
                        class417.method2689(arg3, arg6, arg4, arg1, arg5, arg7, var13.method150((byte) -111), arg2, arg0 - 8136);
                    }
                }
            } else if (arg6 == 1) {
                class351 var10 = (class351) class117.method822(arg3, arg7, arg4);
                if (var10 != null) {
                    if (var10 instanceof class37) {
                        ((class37) var10).field594.method750(arg1, arg0 ^ 0x205D);
                    } else {
                        int var11 = var10.method150((byte) -121);
                        if (arg2 == 4 || arg2 == 5) {
                            class417.method2689(arg3, arg6, arg4, arg1, arg5, arg7, var11, 4, 79);
                        } else if (arg2 == 6) {
                            class417.method2689(arg3, arg6, arg4, arg1, arg5 + 4, arg7, var11, 4, arg0 ^ 0x206C);
                        } else if (arg2 == 7) {
                            class417.method2689(arg3, arg6, arg4, arg1, (arg5 + 2 & 0x3) + 4, arg7, var11, 4, arg0 ^ 0xFFFFDFA9);
                        } else if (arg2 == 8) {
                            class417.method2689(arg3, arg6, arg4, arg1, arg5 + 4, arg7, var11, 4, 115);
                            class417.method2689(arg3, arg6, arg4, arg1, (arg5 + 2 & 0x3) + 4, arg7, var11, 4, 100);
                        }
                    }
                }
            } else if (arg6 == 2) {
                class351 var9 = (class351) class312.method1947(arg3, arg7, arg4, field1403 == null ? (field1403 = method712("im")) : field1403);
                if (var9 != null) {
                    if (arg2 == 11) {
                        arg2 = 10;
                    }
                    if ((var9 instanceof class316)) {
                        ((class316) var9).field4527.method750(arg1, 95);
                    } else {
                        class417.method2689(arg3, arg6, arg4, arg1, arg5, arg7, var9.method150((byte) -128), arg2, 101);
                    }
                }
            } else if (arg6 == 3) {
                class351 var8 = (class351) class135.method910(arg3, arg7, arg4);
                if (var8 != null) {
                    if ((var8 instanceof class157)) {
                        ((class157) var8).field2067.method750(arg1, arg0 - 8143);
                    } else {
                        class417.method2689(arg3, arg6, arg4, arg1, arg5, arg7, var8.method150((byte) -124), arg2, -124);
                    }
                }
            }
        }
        if (arg0 != 8230) {
            field1397 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)V")
    public static final void method711(int arg0, int arg1, int arg2) {
        field1401++;
        int var3 = -37 / ((65 - arg1) / 42);
        class395 var4 = class439.method2776(arg0, 0);
        int var5 = var4.field5934;
        int var6 = var4.field5940;
        int var7 = var4.field5937;
        int var8 = class153.field1998[var7 - var6];
        if (arg2 < 0 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        class168.method1041(var5, -92, class315.field4512[var5] & ~var9 | arg2 << var6 & var9);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method712(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
