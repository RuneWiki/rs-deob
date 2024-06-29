import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class20 {

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "Ldl;")
    private class33 field321;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Lcn;")
    private class279 field313;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Lhl;")
    private class166 field320;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field311 = -1;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field319 = 0;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field318 = 0;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Lsb;")
    private class190 field315;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lph;")
    public static class361 field312;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "[Lug;")
    private class221[] field324;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lnm;Lnm;ZIB)Lug;", line = 11)
    private final class221 method119(class201 arg0, class201 arg1, boolean arg2, int arg3, byte arg4) {
        field314++;
        if (this.field315 == null) {
            throw new RuntimeException();
        }
        this.field315.field2776 = arg3 * 8 + 5;
        if (this.field315.field2776 >= this.field315.field2718.length) {
            throw new RuntimeException();
        } else if (this.field324[arg3] != null) {
            return this.field324[arg3];
        } else if (arg4 == 97) {
            int var6 = this.field315.method1371(-4);
            int var7 = this.field315.method1371(-4);
            class221 var8 = new class221(arg3, arg0, arg1, this.field321, this.field313, var6, var7, arg2);
            this.field324[arg3] = var8;
            return var8;
        } else {
            return (class221) null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)Z", line = 53)
    public final boolean method120(boolean arg0) {
        field323++;
        if (this.field315 != null) {
            return true;
        }
        if (!arg0) {
            method127((byte) -43, 99);
        }
        if (this.field320 == null) {
            if (this.field321.method249((byte) 126)) {
                return false;
            }
            this.field320 = this.field321.method234(-2081513200, 255, 255, (byte) 0, true);
        }
        if (this.field320.field118) {
            return false;
        } else {
            this.field315 = new class190(this.field320.method27(120));
            this.field324 = new class221[(this.field315.field2718.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 82)
    public static void method121(int arg0) {
        field312 = null;
        if (arg0 != 255) {
            field319 = -39;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V", line = 96)
    public final void method122(int arg0) {
        field322++;
        if (this.field324 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field324.length; var2++) {
            if (this.field324[var2] != null) {
                this.field324[var2].method1617(-1);
            }
        }
        if (arg0 >= -107) {
            this.field321 = (class33) null;
        }
        for (int var3 = 0; var3 < this.field324.length; var3++) {
            if (this.field324[var3] != null) {
                this.field324[var3].method1611((byte) 82);
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lnm;IILnm;)Lug;", line = 140)
    public final class221 method123(class201 arg0, int arg1, int arg2, class201 arg3) {
        field317++;
        if (arg2 != 0) {
            this.field320 = (class166) null;
        }
        return this.method119(arg0, arg3, true, arg1, (byte) 97);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIZILph;I)V", line = 154)
    public static final void method124(int arg0, int arg1, boolean arg2, int arg3, class361 arg4, int arg5) {
        int var6 = -108 / ((arg5 + 19) / 60);
        class261.field3970 = arg3;
        class124.field1807 = arg4;
        class31.field438 = arg2;
        class259.field3858 = arg1;
        field316++;
        class131.field1889 = 1;
        class217.field3195 = arg0;
        class347.field5361 = 10000;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BILjava/lang/String;)V", line = 170)
    public static final void method125(byte arg0, int arg1, String arg2) {
        class225.field3393++;
        field327++;
        if (arg0 <= -98) {
            class107.field1533.method1915(true, 214);
            class107.field1533.method1355((byte) -124, class225.method1646(-114, arg2) + 1);
            class107.field1533.method1343(arg2, 0);
            class107.field1533.method1334(-108, arg1);
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Ldl;Lcn;)V", line = 187)
    public class20(class33 arg0, class279 arg1) {
        this.field321 = arg0;
        this.field313 = arg1;
        if (!this.field321.method249((byte) 113)) {
            this.field320 = this.field321.method234(-2081513200, 255, 255, (byte) 0, true);
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)[Lin;", line = 207)
    public static final class177[] method126(int arg0) {
        class177[] var1 = new class177[class220.field3285];
        for (int var2 = 0; var2 < class220.field3285; var2++) {
            int var3 = class59.field871[var2] * class225.field3397[var2];
            byte[] var4 = class225.field3385[var2];
            if (class30.field421[var2]) {
                byte[] var7 = class41.field605[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class81.method666(class206.field3015[class287.method2076(var4[var9], 255)], class287.method2076(-16777216, var7[var9] << 24));
                }
                if (class141.field2031) {
                    var1[var2] = new class283(class255.field3816, class22.field336, class199.field2896[var2], class160.field2319[var2], class59.field871[var2], class225.field3397[var2], var8);
                } else {
                    var1[var2] = new class79(class255.field3816, class22.field336, class199.field2896[var2], class160.field2319[var2], class59.field871[var2], class225.field3397[var2], var8);
                }
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class206.field3015[class287.method2076(255, var4[var6])];
                }
                if (class141.field2031) {
                    var1[var2] = new class325(class255.field3816, class22.field336, class199.field2896[var2], class160.field2319[var2], class59.field871[var2], class225.field3397[var2], var5);
                } else {
                    var1[var2] = new class118(class255.field3816, class22.field336, class199.field2896[var2], class160.field2319[var2], class59.field871[var2], class225.field3397[var2], var5);
                }
            }
        }
        if (arg0 != -28044) {
            method121(-85);
        }
        field325++;
        class321.method2235(arg0 + 25862);
        return var1;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)Lwm;", line = 269)
    public static final class207 method127(byte arg0, int arg1) {
        field326++;
        class207 var2 = (class207) class315.field4680.method461((byte) 120, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 > -81) {
            method124(93, -61, false, 48, (class361) null, 85);
        }
        byte[] var3 = class180.field2584.method2520(31, arg1, (byte) -25);
        class207 var4 = new class207();
        if (var3 != null) {
            var4.method1515((byte) 102, arg1, new class190(var3));
        }
        class315.field4680.method460(var4, -26089, (long) arg1);
        return var4;
    }
}
