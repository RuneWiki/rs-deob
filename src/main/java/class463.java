import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class463 {

    @OriginalMember(owner = "client!jda", name = "h", descriptor = "I")
    private int field6754 = 0;

    @OriginalMember(owner = "client!jda", name = "p", descriptor = "I")
    private int field6756 = 0;

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "I")
    private int field6757 = 0;

    @OriginalMember(owner = "client!jda", name = "d", descriptor = "Lml;")
    private class194 field6748;

    @OriginalMember(owner = "client!jda", name = "l", descriptor = "Lau;")
    private class113 field6751;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "[Lwk;")
    private class96[] field6747;

    @OriginalMember(owner = "client!jda", name = "m", descriptor = "Lfg;")
    public class63 field6746;

    @OriginalMember(owner = "client!jda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6761 = new String[] { method3562(method3561("J#JW;\b")), method3562(method3561("J#JW<\b")), method3562(method3561("J#JW8\b")), method3562(method3561("J#JW?\b")), method3562(method3561("N2G\u0015")), method3562(method3561("[i\u0005W\u0000")), method3562(method3561("J#JWAI)B\rC\b")), method3562(method3561("J#JW>\b")), method3562(method3561("J#JW9\b")) };

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "Lop;")
    public static class574 field6753 = new class574("", 12);

    @OriginalMember(owner = "client!jda", name = "e", descriptor = "Ltf;")
    public static class524 field6759 = new class524();

    @OriginalMember(owner = "client!jda", name = "j", descriptor = "D")
    public static double field6760;

    @OriginalMember(owner = "client!jda", name = "i", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!jda", name = "k", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!jda", name = "o", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!jda", name = "n", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!jda", name = "f", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!jda", name = "g", descriptor = "Ltr;")
    public static class642 field6758;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(II)Z", line = 3)
    public final boolean method3555(int arg0, int arg1) {
        try {
            if (arg1 != 12712) {
                method3558((byte) 19, -126);
            }
            field6750++;
            return this.field6747[arg0].method677(true);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6761[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IZZIII)V", line = 17)
    public final void method3556(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5) {
        try {
            boolean var10 = arg1 & this.field6748.method125();
            field6745++;
            if (!var10 && (arg3 == 4 || arg3 == 8 || arg3 == 9)) {
                if (arg3 == 4) {
                    arg0 = arg5;
                }
                arg3 = 2;
            }
            if (arg3 != 0 && arg2) {
                arg3 |= Integer.MIN_VALUE;
            }
            int var7 = 15 / ((arg4 - 84) / 42);
            if (this.field6757 != arg3) {
                if (this.field6757 != 0) {
                    this.field6747[Integer.MAX_VALUE & this.field6757].method675(-16265);
                }
                if (arg3 != 0) {
                    this.field6747[Integer.MAX_VALUE & arg3].method673(arg2, -41);
                    this.field6747[Integer.MAX_VALUE & arg3].method683(arg2, (byte) -54);
                    this.field6747[Integer.MAX_VALUE & arg3].method681(false, arg5, arg0);
                }
                this.field6756 = arg0;
                this.field6754 = arg5;
                this.field6757 = arg3;
            } else if (this.field6757 != 0) {
                this.field6747[this.field6757 & Integer.MAX_VALUE].method683(arg2, (byte) -54);
                if (this.field6754 != arg5 || this.field6756 != arg0) {
                    this.field6747[Integer.MAX_VALUE & this.field6757].method681(false, arg5, arg0);
                    this.field6754 = arg5;
                    this.field6756 = arg0;
                }
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field6761[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(II)V", line = 73)
    public static final void method3557(int arg0, int arg1) {
        try {
            field6749++;
            if (class314.method2496(arg1, (byte) -31)) {
                class782[] var2 = class9.field117[arg1];
                int var3 = 0;
                if (arg0 < 57) {
                    method3558((byte) 39, -109);
                }
                while (var3 < var2.length) {
                    class782 var4 = var2[var3];
                    if (var4 != null && var4.field11183 != null) {
                        var4.field11183.method827(-89);
                    }
                    var3++;
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field6761[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(BI)Z", line = 106)
    public static final boolean method3558(byte arg0, int arg1) {
        try {
            if (arg0 >= -2) {
                method3558((byte) -45, 90);
            }
            field6752++;
            return arg1 == 3 || arg1 == 4;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6761[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(B)V", line = 125)
    public static void method3559(byte arg0) {
        try {
            if (arg0 >= -101) {
                field6758 = null;
            }
            field6759 = null;
            field6753 = null;
            field6758 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6761[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILica;I)Z", line = 137)
    public final boolean method3560(int arg0, class469 arg1, int arg2) {
        try {
            field6755++;
            if (this.field6757 == 0) {
                return false;
            } else {
                this.field6747[arg0 & this.field6757].method679(arg2, false, arg1);
                return true;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6761[8] + arg0 + ',' + (arg1 == null ? field6761[4] : field6761[5]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Lml;)V", line = 159)
    public class463(class194 arg0) {
        try {
            this.field6748 = arg0;
            this.field6751 = new class113(arg0);
            this.field6747 = new class96[10];
            this.field6747[1] = new class577(arg0);
            this.field6747[2] = new class374(arg0, this.field6751);
            this.field6747[4] = new class624(arg0, this.field6751);
            this.field6747[5] = new class586(arg0, this.field6751);
            this.field6747[6] = new class686(arg0);
            this.field6747[7] = new class501(arg0);
            this.field6747[3] = this.field6746 = new class63(arg0);
            this.field6747[8] = new class171(arg0, this.field6751);
            this.field6747[9] = new class396(arg0, this.field6751);
            if (!this.field6747[8].method677(true)) {
                this.field6747[8] = this.field6747[4];
            }
            if (!this.field6747[9].method677(true)) {
                this.field6747[9] = this.field6747[8];
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6761[6] + (arg0 == null ? field6761[4] : field6761[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!jda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3561(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3562(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 32;
                    break;
                case 1:
                    var10005 = 71;
                    break;
                case 2:
                    var10005 = 43;
                    break;
                case 3:
                    var10005 = 121;
                    break;
                default:
                    var10005 = 125;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
