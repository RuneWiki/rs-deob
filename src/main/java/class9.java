import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class9 {

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "Lgf;")
    private class222 field108 = new class222();

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    private int field101;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    private int field105;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "Li;")
    private class112 field110;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public static int field111 = -1;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "Lci;")
    public static class60 field103 = new class60();

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Lag;")
    public static class196 field100;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "Lcj;")
    public static class74 field118;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
    public final void method53(boolean arg0) {
        for (class93 var2 = (class93) this.field108.method1499(-16216); var2 != null; var2 = (class93) this.field108.method1495(97)) {
            if (var2.method602(118)) {
                var2.method547(10026);
                var2.method887((byte) -51);
                this.field101++;
            }
        }
        field97++;
        if (!arg0) {
            this.field108 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZJ)V")
    public final void method54(boolean arg0, long arg1) {
        field102++;
        if (!arg0) {
            return;
        }
        class93 var4 = (class93) this.field110.method779(-103, arg1);
        if (var4 != null) {
            var4.method547(10026);
            var4.method887((byte) -51);
            this.field101++;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method55(byte arg0, String arg1) {
        if (arg0 != 77) {
            return null;
        }
        field113++;
        String var2 = class21.method146(class103.method702(true, arg1), (byte) 30);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public static void method56(byte arg0) {
        field118 = null;
        field100 = null;
        if (arg0 >= -82) {
            method55((byte) 48, (String) null);
        }
        field103 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(JI)Ljava/lang/Object;")
    public final Object method57(long arg0, int arg1) {
        field112++;
        class93 var4 = (class93) this.field110.method779(-122, arg0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method597((byte) -110);
        if (var5 == null) {
            var4.method547(10026);
            var4.method887((byte) -51);
            this.field101++;
            return null;
        }
        if (var4.method602(122)) {
            class256 var6 = new class256(var5);
            this.field110.method780((byte) -78, var4.field1515, var6);
            this.field108.method1498(0, var6);
            var6.field2267 = 0L;
            var4.method547(10026);
            var4.method887((byte) -51);
        } else {
            this.field108.method1498(0, var4);
            var4.field2267 = 0L;
        }
        if (arg1 > -55) {
            field118 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public final void method58(int arg0) {
        if (arg0 != 0) {
            method56((byte) 77);
        }
        field114++;
        this.field108.method1497((byte) -76);
        this.field110.method777(true);
        this.field101 = this.field105;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
    public static final void method59(int arg0) {
        field99++;
        class243.method1601();
        if (arg0 != 19234) {
            field111 = -124;
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class99.field1699[var1].method1232(-63);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIZI)I")
    public static final int method60(int arg0, int arg1, boolean arg2, int arg3) {
        field115++;
        class144 var4 = (class144) class53.field923.method779(-77, (long) arg3);
        int var5 = -98 % ((-arg1 - 29) / 55);
        if (var4 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var4.field2461.length; var7++) {
            if (var4.field2461[var7] >= 0 && class23.field354 > var4.field2461[var7]) {
                class199 var8 = class203.method1346(-1, var4.field2461[var7]);
                if (var8.field3252 != null) {
                    class69 var9 = (class69) var8.field3252.method779(-101, (long) arg0);
                    if (var9 != null) {
                        if (arg2) {
                            var6 += var4.field2464[var7] * var9.field1127;
                        } else {
                            var6 += var9.field1127;
                        }
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)I")
    public final int method61(int arg0) {
        field109++;
        int var2 = 0;
        int var3 = 21 % ((-arg0 - 35) / 52);
        for (class93 var4 = (class93) this.field108.method1499(-16216); var4 != null; var4 = (class93) this.field108.method1495(97)) {
            if (!var4.method602(125)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/lang/Object;J)V")
    public final void method62(int arg0, Object arg1, long arg2) {
        field106++;
        this.method54(true, arg2);
        if (this.field101 == 0) {
            class93 var5 = (class93) this.field108.method1492((byte) 105);
            var5.method547(arg0 ^ 0x272A);
            var5.method887((byte) -51);
        } else {
            this.field101--;
        }
        class256 var6 = new class256(arg1);
        this.field110.method780((byte) -78, arg2, var6);
        this.field108.method1498(0, var6);
        var6.field2267 = (long) arg0;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(I)V")
    public class9(int arg0) {
        this.field101 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field105 = arg0;
        this.field110 = new class112(var2);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V")
    public final void method63(int arg0, int arg1) {
        if (class209.field3543 != null) {
            for (class93 var3 = (class93) this.field108.method1499(-16216); var3 != null; var3 = (class93) this.field108.method1495(100)) {
                if (var3.method602(122)) {
                    if (var3.method597((byte) -126) == null) {
                        var3.method547(10026);
                        var3.method887((byte) -51);
                        this.field101++;
                    }
                } else if ((++var3.field2267) > ((long) arg1)) {
                    class93 var4 = class209.field3543.method89((byte) -57, var3);
                    this.field110.method780((byte) -78, var3.field1515, var4);
                    class139.method981(var4, 53, var3);
                    var3.method547(10026);
                    var3.method887((byte) -51);
                }
            }
        }
        field107++;
        if (arg0 != 0) {
            method59(81);
        }
    }
}
