import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class658 extends class687 {

    @OriginalMember(owner = "client!qga", name = "I", descriptor = "[Ljava/lang/String;")
    private static final String[] field9330 = new String[] { method4781(method4780("m\tB+")), method4781(method4780("r\u001bOi\n+")), method4781(method4780("xR\u0000i2")), method4781(method4780("r\u001bOi\u0007+")), method4781(method4780("r\u001bOi\u000e+")), method4781(method4780("r\u001f")), method4781(method4780("s\f")), method4781(method4780("r\u001bOi\r+")), method4781(method4780("r\u001bOi\u000b+")), method4781(method4780("r\u001bOi\f+")), method4781(method4780("r\u001bOi\t+")) };

    @OriginalMember(owner = "client!qga", name = "w", descriptor = "I")
    public static int field9316;

    @OriginalMember(owner = "client!qga", name = "F", descriptor = "I")
    public static int field9317;

    @OriginalMember(owner = "client!qga", name = "C", descriptor = "I")
    public static int field9323;

    @OriginalMember(owner = "client!qga", name = "E", descriptor = "I")
    public static int field9324;

    @OriginalMember(owner = "client!qga", name = "t", descriptor = "I")
    public static int field9325;

    @OriginalMember(owner = "client!qga", name = "D", descriptor = "I")
    public static int field9326;

    @OriginalMember(owner = "client!qga", name = "y", descriptor = "I")
    public static int field9327;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qga", name = "z", descriptor = "Ljava/lang/Class;")
    public static Class field9328;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qga", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field9329;

    @OriginalMember(owner = "client!qga", name = "x", descriptor = "Ljava/lang/String;")
    public String field9319;

    @OriginalMember(owner = "client!qga", name = "A", descriptor = "[C")
    public char[] field9321;

    @OriginalMember(owner = "client!qga", name = "G", descriptor = "[C")
    public char[] field9322;

    @OriginalMember(owner = "client!qga", name = "H", descriptor = "[I")
    public int[] field9315;

    @OriginalMember(owner = "client!qga", name = "u", descriptor = "[I")
    public int[] field9318;

    @OriginalMember(owner = "client!qga", name = "B", descriptor = "[Lai;")
    public static class376[] field9320;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method4779(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(Z)V", line = 5)
    public final void method4771(boolean arg0) {
        try {
            if (arg0) {
                this.method4778(94, (char) 65470);
            }
            if (this.field9318 != null) {
                for (int var2 = 0; var2 < this.field9318.length; var2++) {
                    this.field9318[var2] = class10.method71(this.field9318[var2], 32768);
                }
            }
            field9326++;
            if (this.field9315 != null) {
                for (int var3 = 0; var3 < this.field9315.length; var3++) {
                    this.field9315[var3] = class10.method71(this.field9315[var3], 32768);
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9330[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 34)
    public static final String method4772(String arg0, byte arg1, String arg2, String arg3) {
        if (arg1 >= -79) {
            return null;
        }
        field9317++;
        for (int var4 = arg0.indexOf(arg3); var4 != -1; var4 = arg0.indexOf(arg3, arg2.length() + var4)) {
            arg0 = arg0.substring(0, var4) + arg2 + arg0.substring(var4 + arg3.length());
        }
        return arg0;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(ZC)I", line = 61)
    public final int method4773(boolean arg0, char arg1) {
        try {
            field9324++;
            if (this.field9318 == null) {
                return -1;
            }
            for (int var3 = 0; var3 < this.field9318.length; var3++) {
                if (arg1 == this.field9321[var3]) {
                    return this.field9318[var3];
                }
            }
            if (arg0) {
                this.method4775(null, 9);
            }
            return -1;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9330[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(BLjc;I)V", line = 86)
    private final void method4774(byte arg0, class711 arg1, int arg2) {
        try {
            field9316++;
            if (arg0 != 75) {
                this.field9318 = null;
            }
            if (arg2 == 1) {
                this.field9319 = arg1.method5144(-16414);
            } else if (arg2 == 2) {
                int var4 = arg1.method5128(0);
                this.field9322 = new char[var4];
                this.field9315 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field9315[var5] = arg1.method5116((byte) -125);
                    byte var6 = arg1.method5125((byte) 104);
                    this.field9322[var5] = var6 == 0 ? 0 : class365.method2901((byte) 123, var6);
                }
            } else if (arg2 == 3) {
                int var7 = arg1.method5128(0);
                this.field9318 = new int[var7];
                this.field9321 = new char[var7];
                for (int var8 = 0; var8 < var7; var8++) {
                    this.field9318[var8] = arg1.method5116((byte) -119);
                    byte var9 = arg1.method5125((byte) -18);
                    this.field9321[var8] = var9 == 0 ? 0 : class365.method2901((byte) 96, var9);
                }
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field9330[1] + arg0 + ',' + (arg1 == null ? field9330[0] : field9330[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(Ljc;I)V", line = 151)
    public final void method4775(class711 arg0, int arg1) {
        try {
            if (arg1 == 4) {
                field9327++;
                while (true) {
                    int var3 = arg0.method5128(0);
                    if (var3 == 0) {
                        return;
                    }
                    this.method4774((byte) 75, arg0, var3);
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9330[8] + (arg0 == null ? field9330[0] : field9330[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)I", line = 171)
    public static final int method4776(byte arg0) {
        try {
            int var1 = -122 / ((-arg0 - 25) / 33);
            field9323++;
            int var2 = 0;
            Field[] var3 = (field9328 == null ? (field9328 = method4779(field9330[6])) : field9328).getDeclaredFields();
            Field[] var4 = var3;
            for (int var5 = 0; var5 < var4.length; var5++) {
                Field var6 = var4[var5];
                if ((field9329 == null ? (field9329 = method4779(field9330[5])) : field9329).isAssignableFrom(var6.getType())) {
                    var2++;
                }
            }
            return var2 + 1;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field9330[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V", line = 209)
    public static void method4777(int arg0) {
        try {
            if (arg0 != 0) {
                field9320 = null;
            }
            field9320 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9330[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(IC)I", line = 222)
    public final int method4778(int arg0, char arg1) {
        try {
            field9325++;
            if (this.field9315 == null) {
                return -1;
            }
            for (int var3 = 0; var3 < this.field9315.length; var3++) {
                if (arg1 == this.field9322[var3]) {
                    return this.field9315[var3];
                }
            }
            if (arg0 < 0) {
                this.method4778(0, 'R');
            }
            return -1;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9330[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4780(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4781(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 3;
                    break;
                case 1:
                    var10005 = 124;
                    break;
                case 2:
                    var10005 = 46;
                    break;
                case 3:
                    var10005 = 71;
                    break;
                default:
                    var10005 = 79;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
