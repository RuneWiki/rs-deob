import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class667 extends class299 {

    @OriginalMember(owner = "client!wda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9491 = new String[] { method4842(method4841("J4%_a\u0015")), method4842(method4841("J4%_d\u0015")), method4842(method4841("J4%_g\u0015")), method4842(method4841("x\u001f\u0002")), method4842(method4841("J4%_f\u0015")), method4842(method4841("J4%_`\u0015")), method4842(method4841("J4%_b\u0015")), method4842(method4841("J4%_k\u0015")), method4842(method4841("J4%_e\u0015")) };

    @OriginalMember(owner = "client!wda", name = "i", descriptor = "Lhl;")
    public static class556 field9484 = new class556(123, 1);

    @OriginalMember(owner = "client!wda", name = "l", descriptor = "I")
    public static int field9488 = 0;

    @OriginalMember(owner = "client!wda", name = "o", descriptor = "I")
    public static int field9481;

    @OriginalMember(owner = "client!wda", name = "j", descriptor = "I")
    public static int field9482;

    @OriginalMember(owner = "client!wda", name = "h", descriptor = "I")
    public static int field9483;

    @OriginalMember(owner = "client!wda", name = "p", descriptor = "I")
    public static int field9485;

    @OriginalMember(owner = "client!wda", name = "k", descriptor = "I")
    public static int field9486;

    @OriginalMember(owner = "client!wda", name = "n", descriptor = "I")
    public static int field9487;

    @OriginalMember(owner = "client!wda", name = "g", descriptor = "I")
    public static int field9489;

    @OriginalMember(owner = "client!wda", name = "m", descriptor = "I")
    public static int field9490;

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "(I)V")
    public static final void method4837(int arg0) {
        try {
            ++field9482;
            class527 var1 = null;
            try {
                class218 var2 = class393.field6256.method628(-122, "2", true);
                while (~var2.field3402 == -1) {
                    class524.method3918(arg0 ^ 2, 1L);
                }
                if (~var2.field3402 == arg0) {
                    var1 = (class527) var2.field3407;
                    byte[] var3 = new byte[(int) var1.method3938(-27115)];
                    int var5;
                    for (int var4 = 0; var4 < var3.length; var4 += var5) {
                        var5 = var1.method3935(false, var4, var3.length + -var4, var3);
                        if (var5 == -1) {
                            throw new IOException(field9491[3]);
                        }
                    }
                    class488.method3704(new class176(var3), -1);
                }
            } catch (Exception var8) {
            }
            try {
                if (var1 != null) {
                    var1.method3940(1);
                }
            } catch (Exception var7) {
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field9491[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(Z)I")
    public final int method4838(boolean arg0) {
        try {
            if (!arg0) {
                this.method848(-37);
            }
            ++field9481;
            return super.field4849;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9491[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(B)V")
    public static void method4839(byte arg0) {
        try {
            field9484 = null;
            if (arg0 >= -115) {
                field9488 = -94;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9491[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)I")
    public final int method847(int arg0) {
        try {
            ++field9486;
            if (arg0 != 0) {
                return -69;
            } else {
                return super.field4850.method3243(-110) == class229.field3561 && super.field4850.method3245((byte) -58) ? 0 : 1;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9491[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Les;)V")
    public class667(class404 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(ILes;)V")
    public class667(int arg0, class404 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(I)V")
    public final void method848(int arg0) {
        try {
            if (arg0 == -20456) {
                ++field9489;
                super.field4849 = this.method847(0);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9491[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IZ)V")
    public final void method846(int arg0, boolean arg1) {
        try {
            ++field9485;
            if (arg1) {
                field9488 = 27;
            }
            super.field4849 = arg0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9491[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(B)Z")
    public static final boolean method4840(byte arg0) {
        try {
            ++field9487;
            try {
                if (arg0 <= 15) {
                    field9484 = null;
                }
                class784 var1 = new class784();
                byte[] var2 = var1.method5639(class417.field6595, (byte) -59);
                class279.method2398(true, var2);
                return true;
            } catch (Exception var4) {
                return false;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field9491[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(II)I")
    public final int method852(int arg0, int arg1) {
        try {
            ++field9490;
            return arg0 != 1 ? 39 : 3;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9491[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4841(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 35);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4842(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 61;
                    break;
                case 1:
                    var10005 = 80;
                    break;
                case 2:
                    var10005 = 68;
                    break;
                case 3:
                    var10005 = 113;
                    break;
                default:
                    var10005 = 35;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
