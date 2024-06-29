import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class395 {

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "Les;")
    public class592 field5728 = new class592();

    @OriginalMember(owner = "client!bt", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5737 = new String[] { method3093(method3092(":Q6\"#")), method3093(method3092(":Q6%#")), method3093(method3092(":Q6Zb6LlX#")), method3093(method3092(":Q6 #")), method3093(method3092("6Pt\n")), method3093(method3092(":Q6$#")), method3093(method3092("#\u000b6Hv")), method3093(method3092(":Q6'#")), method3093(method3092(":Q6##")), method3093(method3092(":Q6!#")) };

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "[I")
    public static int[] field5731 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!bt", name = "k", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "Llga;")
    public static class47 field5736;

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "Les;")
    private class592 field5733;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)I")
    public final int method3085(int arg0) {
        try {
            field5727++;
            if (arg0 != 31131) {
                field5730 = -87;
            }
            int var2 = 0;
            for (class592 var3 = this.field5728.field8523; var3 != this.field5728; var3 = var3.field8523) {
                var2++;
            }
            return var2;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5737[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(B)Les;")
    public final class592 method3086(byte arg0) {
        try {
            field5729++;
            class592 var2 = this.field5733;
            if (arg0 < 118) {
                return null;
            } else if (this.field5728 == var2) {
                this.field5733 = null;
                return null;
            } else {
                this.field5733 = var2.field8523;
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5737[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Z)V")
    public static void method3087(boolean arg0) {
        try {
            field5731 = null;
            field5736 = null;
            if (arg0) {
                method3087(false);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5737[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(III)Z")
    public static final boolean method3088(int arg0, int arg1, int arg2) {
        try {
            field5734++;
            if (arg2 == -9550) {
                return (arg0 & 0x70000) != 0 | class450.method3492(arg0, arg1, -1) || class768.method5548(116, arg0, arg1);
            } else {
                return false;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5737[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(B)V")
    public final void method3089(byte arg0) {
        try {
            while (true) {
                class592 var2 = this.field5728.field8523;
                if (this.field5728 == var2) {
                    if (arg0 <= 114) {
                        this.field5728 = null;
                    }
                    field5726++;
                    this.field5733 = null;
                    return;
                }
                var2.method4374((byte) 100);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5737[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILes;)V")
    public final void method3090(int arg0, class592 arg1) {
        try {
            if (arg1.field8521 != null) {
                arg1.method4374((byte) 63);
            }
            if (arg0 != 13) {
                field5730 = -55;
            }
            field5735++;
            arg1.field8523 = this.field5728;
            arg1.field8521 = this.field5728.field8521;
            arg1.field8521.field8523 = arg1;
            arg1.field8523.field8521 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5737[5] + arg0 + ',' + (arg1 == null ? field5737[4] : field5737[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V")
    public class395() {
        try {
            this.field5728.field8523 = this.field5728;
            this.field5728.field8521 = this.field5728;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5737[2] + ')');
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)Les;")
    public final class592 method3091(byte arg0) {
        try {
            field5732++;
            int var2 = -34 / ((-arg0 - 24) / 44);
            class592 var3 = this.field5728.field8523;
            if (this.field5728 == var3) {
                this.field5733 = null;
                return null;
            } else {
                this.field5733 = var3.field8523;
                return var3;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5737[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3092(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xB);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3093(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 88;
                    break;
                case 1:
                    var10005 = 37;
                    break;
                case 2:
                    var10005 = 24;
                    break;
                case 3:
                    var10005 = 102;
                    break;
                default:
                    var10005 = 11;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
