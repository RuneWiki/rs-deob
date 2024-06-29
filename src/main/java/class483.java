import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class483 extends class497 {

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7109 = new String[] { method3732(method3731("L]b?!")), method3732(method3731("L]b<!")), method3732(method3731("L]b:!")), method3732(method3731("L]b8!")), method3732(method3731("L]b3!")), method3732(method3731("L]b=!")), method3732(method3731("HE \u0017")), method3732(method3731("]\u001ebUt")), method3732(method3731("L]b>!")), method3732(method3731("L]b9!")) };

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "[I")
    public static int[] field7099 = new int[] { 1, 4, 1, 2 };

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public static int field7102 = 0;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
    public static int field7100;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field7101;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
    public static int field7104;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
    public static int field7105;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public static int field7106;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public static int field7107;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
    public static int field7108;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "Ltb;")
    public static class392 field7103;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(BI)I", line = 4)
    public final int method1029(byte arg0, int arg1) {
        try {
            ++field7101;
            if (super.field7293.method4677(40)) {
                return 3;
            } else {
                if (arg0 != -73) {
                    field7099 = null;
                }
                return 1;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7109[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "([BI)Ltb;", line = 18)
    public static final class392 method3727(byte[] arg0, int arg1) {
        try {
            if (arg1 >= -13) {
                return null;
            } else {
                ++field7105;
                if (arg0 == null) {
                    throw new RuntimeException("");
                } else {
                    while (true) {
                        try {
                            Image var2 = Toolkit.getDefaultToolkit().createImage(arg0);
                            MediaTracker var3 = new MediaTracker(class572.field8287);
                            var3.addImage(var2, 0);
                            var3.waitForAll();
                            int var4 = var2.getWidth(class572.field8287);
                            int var5 = var2.getHeight(class572.field8287);
                            if (!var3.isErrorAny() && var4 >= 0 && ~var5 <= -1) {
                                int[] var6 = new int[var4 * var5];
                                PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                                var7.grabPixels();
                                return class236.field3418.method201(var5, var4, var6, var4, (byte) -8, 0);
                            }
                            throw new RuntimeException("");
                        } catch (InterruptedException var9) {
                        }
                    }
                }
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field7109[5] + (arg0 != null ? field7109[7] : field7109[6]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)I", line = 61)
    public final int method1032(int arg0) {
        try {
            if (arg0 > -101) {
                return 25;
            } else {
                ++field7100;
                return 1;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7109[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)V", line = 74)
    public static void method3728(byte arg0) {
        try {
            field7099 = null;
            field7103 = null;
            if (arg0 != 7) {
                method3728((byte) 44);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7109[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)I", line = 85)
    public final int method3729(int arg0) {
        try {
            ++field7106;
            return arg0 != 3 ? -50 : super.field7292;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7109[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V", line = 98)
    public final void method1031(byte arg0) {
        try {
            if (super.field7293.method4677(69)) {
                super.field7292 = 0;
            }
            ++field7108;
            if (~super.field7292 != -2 && super.field7292 != 0) {
                super.field7292 = this.method1032(-118);
            }
            if (arg0 >= -70) {
                this.method3730(21);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7109[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lpp;)V", line = 115)
    public class483(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)V", line = 120)
    public final void method1030(int arg0, int arg1) {
        try {
            if (arg0 != 64) {
                field7102 = 37;
            }
            ++field7104;
            super.field7292 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7109[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)Z", line = 135)
    public final boolean method3730(int arg0) {
        try {
            if (arg0 >= -127) {
                field7103 = null;
            }
            ++field7107;
            return !super.field7293.method4677(16);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7109[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(ILpp;)V", line = 150)
    public class483(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3731(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 9);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3732(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 38;
                    break;
                case 1:
                    var10005 = 48;
                    break;
                case 2:
                    var10005 = 76;
                    break;
                case 3:
                    var10005 = 123;
                    break;
                default:
                    var10005 = 9;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
