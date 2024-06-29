import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class621 {

    @OriginalMember(owner = "client!et", name = "j", descriptor = "Liha;")
    private class29 field8970 = new class29(64);

    @OriginalMember(owner = "client!et", name = "g", descriptor = "Lgda;")
    private class58 field8964;

    @OriginalMember(owner = "client!et", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8973 = new String[] { method4542(method4541("^},`'")), method4542(method4541("@',r3K:vpr")), method4542(method4541("K&n\"")), method4542(method4541("@',\u000br")), method4542(method4541("@',\u000fr")), method4542(method4541("@',\tr")), method4542(method4541("@',\fr")), method4542(method4541("@',\br")), method4542(method4541("@',\rr")), method4542(method4541("@',\nr")) };

    @OriginalMember(owner = "client!et", name = "d", descriptor = "I")
    public static int field8967 = 1337;

    @OriginalMember(owner = "client!et", name = "e", descriptor = "I")
    public static int field8963;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "I")
    public static int field8965;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "I")
    public static int field8966;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "I")
    public static int field8968;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "I")
    public static int field8969;

    @OriginalMember(owner = "client!et", name = "i", descriptor = "I")
    public static int field8971;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "I")
    public static int field8972;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IB)V", line = 3)
    public static final void method4534(int arg0, byte arg1) {
        try {
            field8965++;
            if (arg1 != -126) {
                field8967 = -50;
            }
            class116.field1695 = -1;
            if (arg0 == 37) {
                class770.field11265 = 3.0F;
            } else if (arg0 == 50) {
                class770.field11265 = 4.0F;
            } else if (arg0 == 75) {
                class770.field11265 = 6.0F;
            } else if (arg0 == 100) {
                class770.field11265 = 8.0F;
            } else if (arg0 == 200) {
                class770.field11265 = 16.0F;
            }
            class116.field1695 = -1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8973[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V", line = 46)
    public final void method4535(int arg0) {
        try {
            field8972++;
            class29 var2 = this.field8970;
            synchronized (this.field8970) {
                this.field8970.method304(1);
            }
            if (arg0 != -12203) {
                method4538(-8, 10, -33);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8973[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(IB)Lhca;", line = 59)
    public final class517 method4536(int arg0, byte arg1) {
        try {
            field8966++;
            if (arg1 <= 55) {
                method4534(32, (byte) -69);
            }
            class29 var3 = this.field8970;
            class517 var4;
            synchronized (this.field8970) {
                var4 = (class517) this.field8970.method302(-93, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class58 var5 = this.field8964;
            byte[] var6;
            synchronized (this.field8964) {
                var6 = this.field8964.method604((byte) -125, arg0, 35);
            }
            class517 var7 = new class517();
            if (var6 != null) {
                var7.method3876((byte) 101, new class176(var6));
            }
            var7.method3880((byte) -37);
            class29 var8 = this.field8970;
            synchronized (this.field8970) {
                this.field8970.method295(false, (long) arg0, var7);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field8973[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 93)
    public static final int method4537(String arg0, byte arg1) {
        try {
            field8968++;
            if (!class664.field9456.field806) {
                return -1;
            } else if (class134.field1901.containsKey(arg0)) {
                return 100;
            } else {
                String var2 = class363.method3012(arg0, 4);
                if (arg1 <= 38) {
                    method4538(12, 100, -6);
                }
                if (var2 == null) {
                    return -1;
                }
                String var3 = class195.field3108 + var2;
                if (!class574.field8296.method590("", (byte) -17, var3)) {
                    return -1;
                } else if (class574.field8296.method592(72, var3)) {
                    byte[] var4 = class574.field8296.method591(true, "", var3);
                    Object var5 = null;
                    File var6;
                    try {
                        var6 = class462.method3579(var2, 45);
                    } catch (RuntimeException var11) {
                        return -1;
                    }
                    if (var4 == null || var6 == null) {
                        return -1;
                    }
                    boolean var7 = true;
                    byte[] var8 = class582.method4271(var6, 0);
                    if (var8 != null && var4.length == var8.length) {
                        for (int var9 = 0; var9 < var8.length; var9++) {
                            if (var4[var9] != var8[var9]) {
                                var7 = false;
                                break;
                            }
                        }
                    } else {
                        var7 = false;
                    }
                    try {
                        if (!var7) {
                            class664.field9456.method629(-103, var6, var4);
                        }
                    } catch (Throwable var12) {
                        return -1;
                    }
                    class207.method1871(var6, arg0, false);
                    return 100;
                } else {
                    return class574.field8296.method605(var3, true);
                }
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field8973[6] + (arg0 == null ? field8973[2] : field8973[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(III)Z", line = 184)
    public static final boolean method4538(int arg0, int arg1, int arg2) {
        try {
            field8963++;
            if (!class16.field177) {
                return false;
            }
            int var3 = arg1 >> 16;
            int var4 = arg1 & 0xFFFF;
            int var5 = -28 / ((-arg2 - 60) / 32);
            if (class309.field5028[var3] == null || class309.field5028[var3][var4] == null) {
                return false;
            }
            class683 var6 = class309.field5028[var3][var4];
            if (arg0 == -1 && var6.field9782 == 0) {
                for (class59 var8 = (class59) class439.field6858.method3228(11); var8 != null; var8 = (class59) class439.field6858.method3216(true)) {
                    if (var8.field773 == 9 || var8.field773 == 1007 || var8.field773 == 53 || var8.field773 == 22 || var8.field773 == 48) {
                        for (class683 var9 = class200.method1826(true, var8.field776); var9 != null; var9 = class15.method109(0, var9)) {
                            if (var6.field9774 == var9.field9774) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                for (class59 var7 = (class59) class439.field6858.method3228(11); var7 != null; var7 = (class59) class439.field6858.method3216(true)) {
                    if (var7.field769 == arg0 && var6.field9774 == var7.field776 && (var7.field773 == 9 || var7.field773 == 1007 || var7.field773 == 53 || var7.field773 == 22 || var7.field773 == 48)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field8973[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(BI)V", line = 250)
    public final void method4539(byte arg0, int arg1) {
        try {
            if (arg0 <= 113) {
                field8967 = -94;
            }
            field8969++;
            class29 var3 = this.field8970;
            synchronized (this.field8970) {
                this.field8970.method294(arg1, -630);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field8973[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lpo;ILgda;)V", line = 267)
    public class621(class585 arg0, int arg1, class58 arg2) {
        try {
            this.field8964 = arg2;
            if (this.field8964 != null) {
                this.field8964.method580(87, 35);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8973[1] + (arg0 == null ? field8973[2] : field8973[0]) + ',' + arg1 + ',' + (arg2 == null ? field8973[2] : field8973[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)V", line = 288)
    public final void method4540(byte arg0) {
        try {
            class29 var2 = this.field8970;
            synchronized (this.field8970) {
                this.field8970.method298(5);
                if (arg0 != -125) {
                    field8967 = -113;
                }
            }
            field8971++;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8973[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!et", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4541(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!et", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4542(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 37;
                    break;
                case 1:
                    var10005 = 83;
                    break;
                case 2:
                    var10005 = 2;
                    break;
                case 3:
                    var10005 = 78;
                    break;
                default:
                    var10005 = 90;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
