import jagex3.jagmisc.jagmisc;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 extends class626 {

    @OriginalMember(owner = "client!ft", name = "z", descriptor = "I")
    private int field54;

    @OriginalMember(owner = "client!ft", name = "j", descriptor = "Z")
    private boolean field38;

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "I")
    private int field36;

    @OriginalMember(owner = "client!ft", name = "I", descriptor = "I")
    private int field63;

    @OriginalMember(owner = "client!ft", name = "i", descriptor = "I")
    private int field37;

    @OriginalMember(owner = "client!ft", name = "s", descriptor = "I")
    private int field47;

    @OriginalMember(owner = "client!ft", name = "J", descriptor = "I")
    private int field64;

    @OriginalMember(owner = "client!ft", name = "G", descriptor = "Z")
    private boolean field61;

    @OriginalMember(owner = "client!ft", name = "k", descriptor = "I")
    private int field39;

    @OriginalMember(owner = "client!ft", name = "K", descriptor = "I")
    private int field65;

    @OriginalMember(owner = "client!ft", name = "l", descriptor = "I")
    private int field40;

    @OriginalMember(owner = "client!ft", name = "F", descriptor = "Ljava/lang/String;")
    private String field60;

    @OriginalMember(owner = "client!ft", name = "y", descriptor = "Ljava/lang/String;")
    private String field53;

    @OriginalMember(owner = "client!ft", name = "o", descriptor = "Ljava/lang/String;")
    private String field43;

    @OriginalMember(owner = "client!ft", name = "u", descriptor = "Ljava/lang/String;")
    private String field49;

    @OriginalMember(owner = "client!ft", name = "q", descriptor = "[I")
    public static int[] field45 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!ft", name = "H", descriptor = "I")
    public static int field62 = 0;

    @OriginalMember(owner = "client!ft", name = "D", descriptor = "Let;")
    public static class591 field58 = new class591();

    @OriginalMember(owner = "client!ft", name = "M", descriptor = "[I")
    public static int[] field67 = new int[3];

    @OriginalMember(owner = "client!ft", name = "m", descriptor = "I")
    private int field41;

    @OriginalMember(owner = "client!ft", name = "n", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ft", name = "p", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ft", name = "r", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!ft", name = "t", descriptor = "I")
    private int field48;

    @OriginalMember(owner = "client!ft", name = "v", descriptor = "I")
    private int field50;

    @OriginalMember(owner = "client!ft", name = "w", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!ft", name = "x", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!ft", name = "A", descriptor = "I")
    private int field55;

    @OriginalMember(owner = "client!ft", name = "C", descriptor = "I")
    private int field57;

    @OriginalMember(owner = "client!ft", name = "E", descriptor = "I")
    private int field59;

    @OriginalMember(owner = "client!ft", name = "N", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ft", name = "L", descriptor = "Leq;")
    public static class209 field66;

    @OriginalMember(owner = "client!ft", name = "B", descriptor = "[Ls;")
    public static class278[] field56;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V", line = 13)
    private final void method14(int arg0) {
        if (this.field49.length() > 40) {
            this.field49 = this.field49.substring(0, 40);
        }
        field44++;
        if (arg0 < this.field43.length()) {
            this.field43 = this.field43.substring(0, 40);
        }
        if (this.field60.length() > 10) {
            this.field60 = this.field60.substring(0, 10);
        }
        if (this.field53.length() > 10) {
            this.field53 = this.field53.substring(0, 10);
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILrca;)V", line = 37)
    public static final void method15(int arg0, class452 arg1) {
        field46++;
        class69 var2 = (class69) class406.field5655.method1522(true);
        if (var2 == null) {
            return;
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < var2.field1240; var4++) {
            if (var2.field1235[var4] != null) {
                if (var2.field1235[var4].field9091 == 2) {
                    var2.field1241[var4] = -5;
                }
                if (var2.field1235[var4].field9091 == 0) {
                    var3 = true;
                }
            }
            if (var2.field1242[var4] != null) {
                if (var2.field1242[var4].field9091 == 2) {
                    var2.field1241[var4] = -6;
                }
                if (var2.field1242[var4].field9091 == 0) {
                    var3 = true;
                }
            }
        }
        if (var3) {
            return;
        }
        int var5 = arg1.field469;
        arg1.method233(var2.field1234, -23162);
        for (int var6 = 0; var6 < var2.field1240; var6++) {
            if (var2.field1241[var6] == 0) {
                try {
                    int var7 = var2.field1238[var6];
                    if (var7 == 0) {
                        Field var11 = (Field) var2.field1235[var6].field9093;
                        int var12 = var11.getInt(null);
                        arg1.method263((byte) -86, 0);
                        arg1.method233(var12, -23162);
                    } else if (var7 == 1) {
                        Field var8 = (Field) var2.field1235[var6].field9093;
                        var8.setInt(null, var2.field1244[var6]);
                        arg1.method263((byte) -116, 0);
                    } else if (var7 == 2) {
                        Field var9 = (Field) var2.field1235[var6].field9093;
                        int var10 = var9.getModifiers();
                        arg1.method263((byte) 104, 0);
                        arg1.method233(var10, -23162);
                    }
                    if (var7 == 3) {
                        Method var13 = (Method) var2.field1242[var6].field9093;
                        byte[][] var14 = var2.field1237[var6];
                        Object[] var15 = new Object[var14.length];
                        for (int var16 = 0; var16 < var14.length; var16++) {
                            ObjectInputStream var17 = new ObjectInputStream(new ByteArrayInputStream(var14[var16]));
                            var15[var16] = var17.readObject();
                        }
                        Object var18 = var13.invoke(null, var15);
                        if (var18 == null) {
                            arg1.method263((byte) -110, 0);
                        } else if (var18 instanceof Number) {
                            arg1.method263((byte) -108, 1);
                            arg1.method240(false, ((Number) var18).longValue());
                        } else if ((var18 instanceof String)) {
                            arg1.method263((byte) -69, 2);
                            arg1.method287((byte) 0, (String) var18);
                        } else {
                            arg1.method263((byte) 87, 4);
                        }
                    } else if (var7 == 4) {
                        Method var19 = (Method) var2.field1242[var6].field9093;
                        int var20 = var19.getModifiers();
                        arg1.method263((byte) -81, 0);
                        arg1.method233(var20, -23162);
                    }
                } catch (ClassNotFoundException var21) {
                    arg1.method263((byte) -118, -10);
                } catch (InvalidClassException var22) {
                    arg1.method263((byte) -128, -11);
                } catch (StreamCorruptedException var23) {
                    arg1.method263((byte) 70, -12);
                } catch (OptionalDataException var24) {
                    arg1.method263((byte) -78, -13);
                } catch (IllegalAccessException var25) {
                    arg1.method263((byte) 67, -14);
                } catch (IllegalArgumentException var26) {
                    arg1.method263((byte) 97, -15);
                } catch (InvocationTargetException var27) {
                    arg1.method263((byte) 118, -16);
                } catch (SecurityException var28) {
                    arg1.method263((byte) 88, -17);
                } catch (IOException var29) {
                    arg1.method263((byte) -101, -18);
                } catch (NullPointerException var30) {
                    arg1.method263((byte) 82, -19);
                } catch (Exception var31) {
                    arg1.method263((byte) 113, -20);
                } catch (Throwable var32) {
                    arg1.method263((byte) 57, -21);
                }
            } else {
                arg1.method263((byte) 71, var2.field1241[var6]);
            }
        }
        arg1.method254(var5, 6);
        var2.method3617(1);
        if (arg0 == -3) {
            ;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIIIFFIFLse;IFFI[B)V", line = 223)
    public static final void method16(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, int arg6, float arg7, class255 arg8, int arg9, float arg10, float arg11, int arg12, byte[] arg13) {
        field68++;
        int var14 = arg3 * arg9;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg6; var16++) {
            arg8.method1738(arg10 / (float) arg3, arg2, 0, arg9, var15, arg1, arg11 / (float) arg9, arg5 * 127.0F, (byte) 70, arg4 / (float) arg2, arg3);
            int var19 = arg12;
            arg10 *= 2.0F;
            arg11 *= 2.0F;
            arg4 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg13[var19] = (byte) ((int) ((float) arg13[var19] + var15[var20]));
                var19++;
            }
            arg5 *= arg7;
        }
        int var17 = arg12;
        for (int var18 = 0; var18 < var14; var18++) {
            arg13[var17] = (byte) (arg13[var17] + 127);
            var17++;
        }
        if (arg0 != 16529) {
            method15(105, null);
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lud;Z)V", line = 280)
    public final void method17(class35 arg0, boolean arg1) {
        arg0.method263((byte) 125, 5);
        field52++;
        arg0.method263((byte) -69, this.field54);
        arg0.method263((byte) -119, this.field38 ? 1 : 0);
        arg0.method263((byte) -81, this.field36);
        arg0.method263((byte) 76, this.field63);
        arg0.method263((byte) 125, this.field37);
        arg0.method263((byte) 66, this.field47);
        arg0.method263((byte) 78, this.field39);
        arg0.method263((byte) -108, this.field61 ? 1 : 0);
        arg0.method223(1493807496, this.field64);
        arg0.method263((byte) 89, this.field65);
        arg0.method245(1537222688, this.field40);
        arg0.method223(1493807496, this.field57);
        arg0.method263((byte) -99, this.field55);
        arg0.method263((byte) 96, this.field59);
        arg0.method263((byte) -77, this.field50);
        if (!arg1) {
            return;
        }
        arg0.method252(this.field49, 92);
        arg0.method252(this.field43, 0);
        arg0.method252(this.field60, 0);
        arg0.method252(this.field53, 99);
        arg0.method263((byte) -96, this.field48);
        arg0.method223(1493807496, this.field41);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)V", line = 313)
    public static void method18(byte arg0) {
        field58 = null;
        field45 = null;
        field66 = null;
        field56 = null;
        if (arg0 == 18) {
            field67 = null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(II)Z", line = 343)
    public static final boolean method19(int arg0, int arg1) {
        field42++;
        int var2 = -84 / ((arg0 - 25) / 60);
        if (class525.field7464[arg1]) {
            return true;
        } else if (class127.field1923.method1458((byte) -61, arg1)) {
            int var3 = class127.field1923.method1477(0, arg1);
            if (var3 == 0) {
                class525.field7464[arg1] = true;
                return true;
            }
            if (class117.field1849[arg1] == null) {
                class117.field1849[arg1] = new class50[var3];
            }
            for (int var4 = 0; var4 < var3; var4++) {
                if (class117.field1849[arg1][var4] == null) {
                    byte[] var5 = class127.field1923.method1453(var4, -125, arg1);
                    if (var5 != null) {
                        class50 var6 = class117.field1849[arg1][var4] = new class50();
                        var6.field792 = (arg1 << 16) + var4;
                        if (var5[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var6.method448(true, new class35(var5));
                    }
                }
            }
            class525.field7464[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "()V", line = 402)
    public class4() {
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(ZLvk;)V", line = 404)
    public class4(boolean arg0, class367 arg1) {
        if (arg0) {
            if (class367.field5136.startsWith("win")) {
                this.field54 = 1;
            } else if (class367.field5136.startsWith("mac")) {
                this.field54 = 2;
            } else if (class367.field5136.startsWith("linux")) {
                this.field54 = 3;
            } else {
                this.field54 = 4;
            }
            if (class367.field5114.startsWith("amd64") || class367.field5114.startsWith("x86_64")) {
                this.field38 = true;
            } else {
                this.field38 = false;
            }
            if (this.field54 == 1) {
                if (class367.field5126.indexOf("4.0") != -1) {
                    this.field36 = 1;
                } else if (class367.field5126.indexOf("4.1") != -1) {
                    this.field36 = 2;
                } else if (class367.field5126.indexOf("4.9") != -1) {
                    this.field36 = 3;
                } else if (class367.field5126.indexOf("5.0") != -1) {
                    this.field36 = 4;
                } else if (class367.field5126.indexOf("5.1") != -1) {
                    this.field36 = 5;
                } else if (class367.field5126.indexOf("6.0") != -1) {
                    this.field36 = 6;
                } else if (class367.field5126.indexOf("6.1") != -1) {
                    this.field36 = 7;
                }
            } else if (this.field54 == 2) {
                if (class367.field5126.indexOf("10.4") != -1) {
                    this.field36 = 20;
                } else if (class367.field5126.indexOf("10.5") != -1) {
                    this.field36 = 21;
                } else if (class367.field5126.indexOf("10.6") != -1) {
                    this.field36 = 22;
                }
            }
            if (class367.field5127.toLowerCase().indexOf("sun") != -1) {
                this.field63 = 1;
            } else if (class367.field5127.toLowerCase().indexOf("microsoft") != -1) {
                this.field63 = 2;
            } else if (class367.field5127.toLowerCase().indexOf("apple") == -1) {
                this.field63 = 4;
            } else {
                this.field63 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (var3 < class367.field5129.length()) {
                    char var5 = class367.field5129.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
            } catch (Exception var15) {
            }
            this.field37 = var4;
            int var6 = class367.field5129.indexOf(46, 2) + 1;
            int var7 = 0;
            try {
                while (class367.field5129.length() > var6) {
                    char var8 = class367.field5129.charAt(var6);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var7 = var7 * 10 + var8 - 48;
                    var6++;
                }
            } catch (Exception var14) {
            }
            this.field47 = var7;
            int var9 = 0;
            int var10 = class367.field5129.indexOf(95, 4) + 1;
            try {
                while (class367.field5129.length() > var10) {
                    char var11 = class367.field5129.charAt(var10);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var9 = var9 * 10 + var11 - 48;
                    var10++;
                }
            } catch (Exception var13) {
            }
            this.field64 = class438.field6123;
            if (arg1.field5141) {
                this.field61 = false;
            } else {
                this.field61 = true;
            }
            this.field39 = var9;
            if (this.field37 <= 3) {
                this.field65 = 0;
            } else {
                this.field65 = class641.field9124;
            }
            try {
                this.field40 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
            } catch (Throwable var12) {
                this.field40 = 0;
            }
        }
        if (this.field60 == null) {
            this.field60 = "";
        }
        if (this.field53 == null) {
            this.field53 = "";
        }
        if (this.field43 == null) {
            this.field43 = "";
        }
        if (this.field49 == null) {
            this.field49 = "";
        }
        this.method14(40);
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)I", line = 593)
    public final int method20(byte arg0) {
        field51++;
        byte var2 = 23;
        int var3 = var2 + class156.method1188(this.field49, 22202);
        int var4 = var3 + class156.method1188(this.field43, 22202);
        int var5 = var4 + class156.method1188(this.field60, 22202);
        return arg0 == 76 ? var5 + class156.method1188(this.field53, 22202) : 104;
    }
}
