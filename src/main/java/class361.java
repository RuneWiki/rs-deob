import jaggl.OpenGL;
import java.awt.Rectangle;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class361 extends class129 {

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "Lcda;")
    private class182 field5510;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "Lrda;")
    private class690 field5519;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "Lde;")
    private class557 field5518;

    @OriginalMember(owner = "client!tk", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field5520 = new String[] { method2938(method2937("\nHU+3")), method2938(method2937("\nHU)3")), method2938(method2937("\nHU 3")), method2938(method2937("\u0005\rUMf")), method2938(method2937("\u0019O")), method2938(method2937("\nHU_r\u0010J\u000f]3")), method2938(method2937("\u0010V\u0017\u000f")), method2938(method2937("\nQ\u001a\rh\u000eB\t\u0006u\n|\f\u0002o\u001bQ")), method2938(method2937("\nHU'3")), method2938(method2937("\nHU$3")), method2938(method2937("\nHU*3")), method2938(method2937("\nHU%3")), method2938(method2937("\nHU33")), method2938(method2937("R\u0003")), method2938(method2937("^d67")), method2938(method2937("\nHU\"3")), method2938(method2937("\nHU,3")) };

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field5506 = new Rectangle[100];

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!tk", name = "A", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZI)V")
    public final void method781(boolean arg0, int arg1) {
        try {
            ++field5512;
            OpenGL.glBindProgramARB(34336, this.field5518.field8291);
            OpenGL.glEnable(34336);
            super.field1509.method2498(0, class185.field2557, (byte) -103);
            if (arg1 != 1) {
                field5506 = null;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5520[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IILrca;)V")
    public final void method788(int arg0, int arg1, class479 arg2) {
        try {
            ++field5507;
            if (arg1 >= -3) {
                method2934((byte) 115);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5520[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5520[3] : field5520[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lrda;Lla;Lcda;)V")
    public class361(class690 arg0, class476 arg1, class182 arg2) {
        super(arg0);
        try {
            this.field5510 = arg2;
            this.field5519 = arg0;
            if (arg1 != null && this.field5510.method1594(-115) && this.field5519.field10108) {
                this.field5518 = class688.method5041((byte) 122, arg1.method3640((byte) -124, field5520[7], field5520[4]), this.field5519, 34336);
            } else {
                this.field5518 = null;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5520[5] + (arg0 != null ? field5520[3] : field5520[6]) + ',' + (arg1 != null ? field5520[3] : field5520[6]) + ',' + (arg2 != null ? field5520[3] : field5520[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZB)V")
    public final void method784(boolean arg0, byte arg1) {
        try {
            if (arg1 != -34) {
                field5506 = null;
            }
            super.field1509.method2417(arg1 + -73, class362.field5530, class206.field3175);
            ++field5515;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5520[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)I")
    public static final int method2933(int arg0, int arg1, int arg2) {
        try {
            ++field5516;
            if (arg2 != 0) {
                return 39;
            } else {
                if (~arg1 < ~arg0) {
                    int var3 = arg0;
                    arg0 = arg1;
                    arg1 = var3;
                }
                while (arg1 != 0) {
                    int var4 = arg0 % arg1;
                    arg0 = arg1;
                    arg1 = var4;
                }
                return arg0;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5520[16] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)Z")
    public final boolean method790(boolean arg0) {
        try {
            ++field5511;
            if (arg0) {
                this.field5510 = null;
            }
            return this.field5518 != null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5520[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public final void method783(int arg0) {
        try {
            super.field1509.method2498(0, class48.field546, (byte) -102);
            ++field5514;
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            if (arg0 != 1) {
                this.method783(69);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5520[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(B)V")
    public static final void method2934(byte arg0) {
        try {
            if (class340.field5291 != null) {
                for (int var1 = 0; ~class48.field547 < ~var1; ++var1) {
                    class340.field5291[var1] = null;
                }
                class340.field5291 = null;
            }
            ++field5509;
            if (class137.field1598 != null) {
                for (int var2 = 0; class440.field6489 > var2; ++var2) {
                    class137.field1598[var2] = null;
                }
                class137.field1598 = null;
            }
            if (class107.field1235 != null) {
                for (int var3 = 0; var3 < class241.field3642; ++var3) {
                    class107.field1235[var3] = null;
                }
                class107.field1235 = null;
            }
            class58.field617 = -1;
            class756.field10986 = -1;
            class247.field3848 = null;
            class80.field902 = null;
            if (arg0 != 16) {
                method2934((byte) -112);
            }
            class21.field249 = null;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5520[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "(I)V")
    public static void method2935(int arg0) {
        try {
            if (arg0 == 8070) {
                field5506 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5520[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method2936(long arg0, byte arg1) {
        try {
            ++field5508;
            class733.field10645.setTime(new Date(arg0));
            int var3 = class733.field10645.get(7);
            int var4 = class733.field10645.get(5);
            int var5 = 15 % ((arg1 - -65) / 39);
            int var6 = class733.field10645.get(2);
            int var7 = class733.field10645.get(1);
            int var8 = class733.field10645.get(11);
            int var9 = class733.field10645.get(12);
            int var10 = class733.field10645.get(13);
            return class753.field10962[var3 - 1] + field5520[13] + var4 / 10 + var4 % 10 + "-" + class768.field11124[var6] + "-" + var7 + " " + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10 + field5520[14];
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field5520[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIB)V")
    public final void method786(int arg0, int arg1, byte arg2) {
        try {
            if (this.field5510.field2518) {
                float var4 = (float) (super.field1509.field4603 % 4000) / 4000.0F;
                super.field1509.method2467(12, this.field5510.field2516);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, 0.0F, 0.0F, 1.0F);
            } else {
                int var5 = super.field1509.field4603 % 4000 * 16 / 4000;
                super.field1509.method2467(12, this.field5510.field2520[var5]);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
            }
            int var6 = 91 / ((arg2 - 21) / 56);
            ++field5513;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field5520[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    static {
        for (int var0 = 0; var0 < 100; ++var0) {
            field5506[var0] = new Rectangle();
        }
    }

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2937(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 27);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2938(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 126;
                    break;
                case 1:
                    var10005 = 35;
                    break;
                case 2:
                    var10005 = 123;
                    break;
                case 3:
                    var10005 = 99;
                    break;
                default:
                    var10005 = 27;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
