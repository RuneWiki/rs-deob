import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public abstract class class215 extends class578 {

    @OriginalMember(owner = "client!dba", name = "n", descriptor = "Lml;")
    public class194 field3141;

    @OriginalMember(owner = "client!dba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3149 = new String[] { method1814(method1813("TA}c\u0013\u0018")), method1814(method1813("TA}chYMu9j\u0018")), method1814(method1813("^Vp!")), method1814(method1813("K\r2c)")), method1814(method1813("TA}c\u001a\u0018")), method1814(method1813("TA}c\u0010\u0018")), method1814(method1813("TA}c\u0016\u0018")), method1814(method1813("TA}c\u001f\u0018")), method1814(method1813("TA}c\u0019\u0018")), method1814(method1813("TA}c\u0012\u0018")), method1814(method1813("TA}c\u0017\u0018")) };

    @OriginalMember(owner = "client!dba", name = "p", descriptor = "[I")
    public static int[] field3139 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!dba", name = "k", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!dba", name = "m", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!dba", name = "j", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!dba", name = "q", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!dba", name = "i", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!dba", name = "o", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!dba", name = "s", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!dba", name = "l", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!dba", name = "r", descriptor = "Z")
    public boolean field3147;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(B)I", line = 3)
    public int method1799(byte arg0) {
        try {
            field3138++;
            int var2 = 95 % ((arg0 + 6) / 49);
            return 0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3149[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)Z", line = 19)
    public final boolean method1802(int arg0) {
        try {
            if (arg0 != 26740) {
                this.method1799((byte) 55);
            }
            field3145++;
            return false;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3149[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(BII)I", line = 37)
    public static final int method1804(byte arg0, int arg1, int arg2) {
        try {
            if (arg0 > -40) {
                method1809(-24);
            }
            field3140++;
            byte var3;
            if (arg2 > 20000) {
                var3 = 4;
                class162.method1372((byte) -114);
            } else if (arg2 > 10000) {
                var3 = 3;
                class90.method887(250);
            } else if (arg2 <= 5000) {
                var3 = 1;
                class479.method3708(true, 82);
            } else {
                var3 = 2;
                class450.method3490(85);
            }
            if (class451.field6612.field9134.method4717(3) != arg1) {
                class451.field6612.method4681(arg1, class451.field6612.field9137, (byte) -111);
                class279.method2271(7, false, arg1);
            }
            class536.method4064(10);
            return var3;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3149[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dba", name = "h", descriptor = "(I)I", line = 83)
    public final int method1805(int arg0) {
        try {
            if (arg0 == 0) {
                field3142++;
                return 1;
            } else {
                return 107;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3149[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "(I)V", line = 94)
    public static final void method1806(int arg0) {
        try {
            class655.method4757((byte) 26);
            field3146++;
            class86.field1217 = false;
            if (arg0 != 4) {
                method1811(-66, true, -39);
            }
            class376.method2982(class118.field1499, class525.field7646, class637.field9012, class433.field6281, 9532);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3149[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dba", name = "g", descriptor = "(I)Z", line = 107)
    public final boolean method1807(int arg0) {
        try {
            if (arg0 <= 25) {
                this.method1805(-122);
            }
            field3143++;
            return this.field3147;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3149[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "(I)V", line = 124)
    public static void method1809(int arg0) {
        try {
            if (arg0 > 13) {
                field3139 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3149[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IZI)Z", line = 136)
    public static final boolean method1811(int arg0, boolean arg1, int arg2) {
        try {
            field3144++;
            if (arg1) {
                field3148 = 87;
            }
            return (arg2 & 0xC580) != 0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3149[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(Lml;)V", line = 148)
    public class215(class194 arg0) {
        try {
            this.field3141 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3149[1] + (arg0 == null ? field3149[2] : field3149[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(III)V")
    public abstract void method1800(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(Z)Z")
    public abstract boolean method1801(boolean arg0);

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "(Z)V")
    public abstract void method1803(boolean arg0);

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lbp;ILbp;I)V")
    public abstract void method1808(class117 arg0, int arg1, class117 arg2, int arg3);

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(II)V")
    public abstract void method1810(int arg0, int arg1);

    @OriginalMember(owner = "client!dba", name = "f", descriptor = "(I)Z")
    public abstract boolean method1812(int arg0);

    @OriginalMember(owner = "client!dba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1813(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x54);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1814(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 48;
                    break;
                case 1:
                    var10005 = 35;
                    break;
                case 2:
                    var10005 = 28;
                    break;
                case 3:
                    var10005 = 77;
                    break;
                default:
                    var10005 = 84;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
