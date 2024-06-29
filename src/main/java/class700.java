import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class700 {

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    private int field10061 = 0;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    private int field10060 = 0;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    private int field10067 = 0;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "Lvf;")
    private class159 field10064;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Lpia;")
    private class100 field10058;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "[Lhs;")
    private class344[] field10065;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "Ltp;")
    public class561 field10063;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10074 = new String[] { method5082(method5081("\u0006q_\u0016%")), method5082(method5081("\u0006q_\u0015%")), method5082(method5081("\u001c=_~p")), method5082(method5081("\u0006q_\u0011%")), method5082(method5081("\tf\u001d<")), method5082(method5081("\u0006q_\u0012%")), method5082(method5081("\u0006q_\u0014%")), method5082(method5081("\u0006q_\u0013%")), method5082(method5081("\u0006q_ld\tz\u0005n%")) };

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "Lep;")
    public static class445 field10070 = new class445(0, -1);

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Z")
    public static boolean field10072 = false;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "Lqr;")
    public static class69 field10071 = new class69(4);

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "F")
    public static float field10073;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field10059;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field10062;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field10066;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field10068;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public static int field10069;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)Z", line = 3)
    public final boolean method5075(int arg0, byte arg1) {
        try {
            if (arg1 < 82) {
                return false;
            } else {
                field10066++;
                return this.field10065[arg0].method831(false);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10074[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 18)
    public static void method5076(int arg0) {
        try {
            field10070 = null;
            field10071 = null;
            if (arg0 != -1) {
                method5077(null, false, -76);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10074[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lvf;)V", line = 186)
    public class700(class159 arg0) {
        try {
            this.field10064 = arg0;
            this.field10058 = new class100(arg0);
            this.field10065 = new class344[10];
            this.field10065[1] = new class81(arg0);
            this.field10065[2] = new class752(arg0, this.field10058);
            this.field10065[4] = new class316(arg0, this.field10058);
            this.field10065[5] = new class455(arg0, this.field10058);
            this.field10065[6] = new class653(arg0);
            this.field10065[7] = new class246(arg0);
            this.field10065[3] = this.field10063 = new class561(arg0);
            this.field10065[8] = new class672(arg0, this.field10058);
            this.field10065[9] = new class349(arg0, this.field10058);
            if (!this.field10065[8].method831(false)) {
                this.field10065[8] = this.field10065[4];
            }
            if (!this.field10065[9].method831(false)) {
                this.field10065[9] = this.field10065[8];
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10074[8] + (arg0 == null ? field10074[4] : field10074[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([BZI)V", line = 38)
    public static final void method5077(byte[] arg0, boolean arg1, int arg2) {
        try {
            field10059++;
            if (class127.field1833 == null) {
                class127.field1833 = new class176(20000);
            }
            class127.field1833.method1667(0, arg0.length, 59, arg0);
            if (arg1) {
                class410.method3292(class127.field1833.field2805, (byte) 125);
                class696.field10027 = new class139[class31.field366];
                int var3 = 0;
                for (int var4 = class697.field10041; var4 <= class737.field10792; var4++) {
                    class139 var5 = class262.method2285(var4, 2);
                    if (var5 != null) {
                        class696.field10027[var3++] = var5;
                    }
                }
                class401.field6333 = false;
                class369.field5988 = class712.method5167(-2334);
                class127.field1833 = null;
            }
            if (arg2 != 9) {
                field10073 = 0.92777187F;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field10074[3] + (arg0 == null ? field10074[4] : field10074[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILgb;I)Z", line = 81)
    public final boolean method5078(int arg0, class224 arg1, int arg2) {
        try {
            field10062++;
            if (this.field10067 == 0) {
                return false;
            } else {
                int var4 = -64 / ((arg2 - 5) / 59);
                this.field10065[Integer.MAX_VALUE & this.field10067].method836(arg1, arg0, 16);
                return true;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field10074[5] + arg0 + ',' + (arg1 == null ? field10074[4] : field10074[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIII)V", line = 98)
    public static final void method5079(int arg0, int arg1, int arg2, int arg3) {
        try {
            field10069++;
            class758 var4 = class603.field8714[arg1][arg0];
            class370.method3047(var4 == null ? class601.field8699 : var4, arg2, arg3 ^ arg3);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field10074[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIZIIZ)V", line = 115)
    public final void method5080(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        try {
            int var7 = -98 % ((26 - arg3) / 34);
            field10068++;
            boolean var10 = arg5 & this.field10064.method148();
            if (!var10 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
                if (arg0 == 4) {
                    arg4 = arg1;
                }
                arg0 = 2;
            }
            if (arg0 != 0 && arg2) {
                arg0 |= Integer.MIN_VALUE;
            }
            if (this.field10067 != arg0) {
                if (this.field10067 != 0) {
                    this.field10065[Integer.MAX_VALUE & this.field10067].method833(72);
                }
                if (arg0 != 0) {
                    this.field10065[Integer.MAX_VALUE & arg0].method834(16, arg2);
                    this.field10065[Integer.MAX_VALUE & arg0].method837((byte) -92, arg2);
                    this.field10065[Integer.MAX_VALUE & arg0].method835(arg1, 16, arg4);
                }
                this.field10067 = arg0;
                this.field10061 = arg4;
                this.field10060 = arg1;
            } else if (this.field10067 != 0) {
                this.field10065[Integer.MAX_VALUE & this.field10067].method837((byte) -93, arg2);
                if (this.field10060 != arg1 || this.field10061 != arg4) {
                    this.field10065[Integer.MAX_VALUE & this.field10067].method835(arg1, 16, arg4);
                    this.field10061 = arg4;
                    this.field10060 = arg1;
                }
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field10074[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5081(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xD);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5082(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 103;
                    break;
                case 1:
                    var10005 = 19;
                    break;
                case 2:
                    var10005 = 113;
                    break;
                case 3:
                    var10005 = 80;
                    break;
                default:
                    var10005 = 13;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
