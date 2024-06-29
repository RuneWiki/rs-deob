import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class54 extends class86 {

    @OriginalMember(owner = "client!mq", name = "H", descriptor = "Z")
    public boolean field726 = true;

    @OriginalMember(owner = "client!mq", name = "K", descriptor = "Lpg;")
    public static class492 field729 = new class492(79, 8);

    @OriginalMember(owner = "client!mq", name = "z", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!mq", name = "C", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!mq", name = "E", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!mq", name = "F", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!mq", name = "G", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!mq", name = "I", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!mq", name = "L", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!mq", name = "N", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!mq", name = "O", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!mq", name = "Q", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!mq", name = "R", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!mq", name = "S", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!mq", name = "P", descriptor = "Lsp;")
    public class514 field734;

    @OriginalMember(owner = "client!mq", name = "A", descriptor = "[I")
    private int[] field720;

    @OriginalMember(owner = "client!mq", name = "J", descriptor = "[I")
    public int[] field728;

    @OriginalMember(owner = "client!mq", name = "M", descriptor = "[Ljava/lang/String;")
    private String[] field731;

    @OriginalMember(owner = "client!mq", name = "D", descriptor = "[[I")
    private int[][] field722;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILtl;)V")
    public final void method361(int arg0, class91 arg1) {
        if (arg0 > -58) {
            return;
        }
        while (true) {
            int var3 = arg1.method618((byte) 100);
            if (var3 == 0) {
                field733++;
                return;
            }
            this.method362(arg1, 0, var3);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Ltl;II)V")
    private final void method362(class91 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field731 = class14.method125(126, '<', arg0.method621(2029169511));
        } else if (arg2 == 2) {
            int var9 = arg0.method618((byte) 100);
            this.field728 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field728[var10] = arg0.method631(10494);
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method618((byte) 100);
            this.field722 = new int[var4][];
            this.field720 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method631(10494);
                class340 var7 = class529.method3126((byte) -122, var6);
                if (var7 != null) {
                    this.field720[var5] = var6;
                    this.field722[var5] = new int[var7.field5369];
                    for (int var8 = 0; var8 < var7.field5369; var8++) {
                        this.field722[var5][var8] = arg0.method631(10494);
                    }
                }
            }
        } else if (arg2 == 4) {
            this.field726 = false;
        }
        if (arg1 != 0) {
            this.method367(-109);
        }
        field719++;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IBI)I")
    public final int method363(int arg0, byte arg1, int arg2) {
        if (arg1 != 19) {
            this.field734 = null;
        }
        field723++;
        if (this.field720 == null || arg2 < 0 || arg2 > this.field720.length) {
            return -1;
        } else if (this.field722[arg2] == null || arg0 < 0 || arg0 > this.field722[arg2].length) {
            return -1;
        } else {
            return this.field722[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(B)V")
    public final void method364(byte arg0) {
        if (arg0 != -71) {
            this.method367(48);
        }
        field727++;
        if (this.field728 != null) {
            for (int var2 = 0; var2 < this.field728.length; var2++) {
                this.field728[var2] = class286.method1860(this.field728[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(I)I")
    public final int method365(int arg0) {
        if (arg0 == -19359) {
            field732++;
            return this.field720 == null ? 0 : this.field720.length;
        } else {
            return -82;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)Lwi;")
    public final class340 method366(int arg0, int arg1) {
        if (arg1 == 0) {
            field724++;
            return this.field720 == null || arg0 < 0 || this.field720.length < arg0 ? null : class529.method3126((byte) -126, this.field720[arg0]);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "(I)Ljava/lang/String;")
    public final String method367(int arg0) {
        field730++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field731 == null) {
            return "";
        }
        var2.append(this.field731[0]);
        for (int var3 = 1; var3 < this.field731.length; var3++) {
            var2.append("...");
            var2.append(this.field731[var3]);
        }
        if (arg0 != 8) {
            this.method361(-115, null);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZLtl;)Ljava/lang/String;")
    public final String method368(boolean arg0, class91 arg1) {
        if (arg0) {
            return null;
        }
        field735++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field720 != null) {
            for (int var4 = 0; var4 < this.field720.length; var4++) {
                var3.append(this.field731[var4]);
                var3.append(this.field734.method3058(arg1.method612(class529.method3126((byte) -119, this.field720[var4]).field5370, (byte) -64), this.method366(var4, 0), this.field722[var4], -673));
            }
        }
        var3.append(this.field731[this.field731.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IILjb;I)V")
    public static final void method369(int arg0, int arg1, class499 arg2, int arg3) {
        class320.field4912 = arg1;
        class337.field5333 = arg2;
        if (arg3 != -10281) {
            method372((byte) 36);
        }
        class286.field4273 = arg0;
        field725++;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Ltl;[II)V")
    public final void method370(class91 arg0, int[] arg1, int arg2) {
        field736++;
        if (this.field720 == null) {
            return;
        }
        if (arg2 != 5782) {
            this.method367(4);
        }
        for (int var4 = 0; var4 < this.field720.length; var4++) {
            if (arg1.length <= var4) {
                return;
            }
            int var5 = this.method366(var4, 0).field5368;
            if (var5 > 0) {
                arg0.method609(var5, 0, (long) arg1[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "(I)V")
    public static void method371(int arg0) {
        field729 = null;
        int var1 = -108 % ((arg0 - 29) / 56);
    }

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "(B)V")
    public static final void method372(byte arg0) {
        field737++;
        if (arg0 < 115 || class350.field5444.length() == 0) {
            return;
        }
        class290.method1872("--> " + class350.field5444, (byte) 91);
        class507.method3024(class350.field5444, -31, false);
        class97.field1410 = 0;
        class300.field4438 = 0;
        class350.field5444 = "";
    }
}
