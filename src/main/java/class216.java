import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class216 {

    @OriginalMember(owner = "client!co", name = "o", descriptor = "Ljh;")
    private class462 field3272 = new class462();

    @OriginalMember(owner = "client!co", name = "n", descriptor = "I")
    private int field3271;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "I")
    private int field3260;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "Lvg;")
    private class56 field3263;

    @OriginalMember(owner = "client!co", name = "h", descriptor = "I")
    public static int field3265 = 0;

    @OriginalMember(owner = "client!co", name = "p", descriptor = "Lpn;")
    public static class49 field3273 = new class49(0, -1);

    @OriginalMember(owner = "client!co", name = "q", descriptor = "Ljava/lang/String;")
    public static String field3274 = null;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!co", name = "i", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!co", name = "j", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!co", name = "k", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!co", name = "l", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!co", name = "m", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lbg;I)V", line = 3)
    private final void method1486(class278 arg0, int arg1) {
        field3261++;
        long var3 = arg0.method1889(-1149);
        for (class317 var5 = (class317) this.field3263.method358((byte) -125, var3); var5 != null; var5 = (class317) this.field3263.method366(29)) {
            if (var5.field4829.method1888(true, arg0)) {
                this.method1494(-1, var5);
                break;
            }
        }
        if (arg1 != -1) {
            field3265 = -70;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V", line = 30)
    public static void method1487(byte arg0) {
        if (arg0 >= 121) {
            field3274 = null;
            field3273 = null;
        }
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(B)V", line = 47)
    public final void method1488(byte arg0) {
        class317 var2 = (class317) this.field3272.method2825(arg0 - 94);
        if (arg0 != 93) {
            this.method1489(null, 22, null, 103);
        }
        while (var2 != null) {
            if (var2.method1410(arg0 + 8723)) {
                var2.method947((byte) 116);
                var2.method2859(arg0 ^ 0xFFFFFFC3);
                this.field3260 += var2.field4832;
            }
            var2 = (class317) this.field3272.method2827(26);
        }
        field3258++;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lbg;ILjava/lang/Object;I)V", line = 75)
    private final void method1489(class278 arg0, int arg1, Object arg2, int arg3) {
        field3267++;
        if (arg1 > this.field3271) {
            throw new IllegalStateException("s>cs");
        }
        this.method1486(arg0, -1);
        this.field3260 -= arg1;
        while (this.field3260 < 0) {
            class317 var7 = (class317) this.field3272.method2828(false);
            this.method1494(-1, var7);
        }
        int var5 = 70 % ((79 - arg3) / 41);
        class198 var6 = new class198(arg0, arg2, arg1);
        this.field3263.method357(var6, 1, arg0.method1889(-1149));
        this.field3272.method2829(-14061, var6);
        var6.field6926 = 0L;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(II)V", line = 105)
    public final void method1490(int arg0, int arg1) {
        if (arg0 != 0) {
            field3274 = null;
        }
        if (class55.field835 != null) {
            for (class317 var3 = (class317) this.field3272.method2825(-1); var3 != null; var3 = (class317) this.field3272.method2827(116)) {
                if (var3.method1410(8816)) {
                    if (var3.method1411(true) == null) {
                        var3.method947((byte) 110);
                        var3.method2859(-102);
                        this.field3260 += var3.field4832;
                    }
                } else if (((long) arg1) < (++var3.field6926)) {
                    class317 var4 = class55.field835.method266((byte) -29, var3);
                    this.field3263.method357(var4, 1, var3.field1932);
                    class68.method491(var3, -92, var4);
                    var3.method947((byte) 92);
                    var3.method2859(arg0 ^ 0xFFFFFF86);
                }
            }
        }
        field3266++;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)I", line = 152)
    public final int method1491(int arg0) {
        if (arg0 != 1) {
            field3273 = null;
        }
        field3270++;
        return this.field3260;
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(I)I", line = 163)
    public final int method1492(int arg0) {
        if (arg0 > -96) {
            this.field3271 = 115;
        }
        field3269++;
        return this.field3271;
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(B)V", line = 185)
    public final void method1493(byte arg0) {
        this.field3272.method2831(0);
        if (arg0 >= 88) {
            field3268++;
            this.field3263.method360(-71);
            this.field3260 = this.field3271;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ILlk;)V", line = 199)
    private final void method1494(int arg0, class317 arg1) {
        if (arg1 != null) {
            arg1.method947((byte) 102);
            arg1.method2859(-110);
            this.field3260 += arg1.field4832;
        }
        field3262++;
        if (arg0 != -1) {
            field3265 = -116;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lbg;B)Ljava/lang/Object;", line = 217)
    public final Object method1495(class278 arg0, byte arg1) {
        field3259++;
        long var3 = arg0.method1889(-1149);
        for (class317 var5 = (class317) this.field3263.method358((byte) -128, var3); var5 != null; var5 = (class317) this.field3263.method366(-124)) {
            if (var5.field4829.method1888(true, arg0)) {
                Object var7 = var5.method1411(true);
                if (var7 != null) {
                    if (var5.method1410(8816)) {
                        class198 var8 = new class198(arg0, var7, var5.field4832);
                        this.field3263.method357(var8, 1, var5.field1932);
                        this.field3272.method2829(-14061, var8);
                        var8.field6926 = 0L;
                        var5.method947((byte) 93);
                        var5.method2859(-127);
                    } else {
                        this.field3272.method2829(-14061, var5);
                        var5.field6926 = 0L;
                    }
                    return var7;
                }
                var5.method947((byte) 124);
                var5.method2859(-106);
                this.field3260 += var5.field4832;
            }
        }
        int var6 = -63 / ((arg1 + 8) / 52);
        return null;
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(I)V", line = 281)
    public class216(int arg0) {
        this.field3271 = arg0;
        this.field3260 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3263 = new class56(var2);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ILjava/lang/Object;Lbg;)V", line = 271)
    public final void method1496(int arg0, Object arg1, class278 arg2) {
        if (arg0 != -26500) {
            this.field3260 = -88;
        }
        this.method1489(arg2, 1, arg1, 3);
        field3264++;
    }
}
