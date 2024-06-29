import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class199 extends class134 {

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public int field3090;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public int field3093;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "Lnf;")
    public static class162 field3089 = new class162(30);

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "Lpf;")
    public static class305 field3094 = new class305(16);

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    public static int field3096 = 0;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "Lub;")
    public static class92 field3095;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lub;BLub;)V")
    public static final void method1408(class92 arg0, byte arg1, class92 arg2) {
        class190.field2980 = arg0;
        class284.field4466 = arg2;
        if (arg1 != -8) {
            field3095 = null;
        }
        field3091++;
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)V")
    public static void method1409(byte arg0) {
        if (arg0 == -16) {
            field3094 = null;
            field3095 = null;
            field3089 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
    public static final void method1410(int arg0) {
        class80.method628((byte) -111, class113.field1747);
        if (arg0 != 0) {
            return;
        }
        class173.field2674++;
        field3088++;
        if (class201.field3111 && class91.field1425) {
            int var1 = class157.field2340;
            int var2 = class171.field2587;
            int var3 = class113.field1747.field3480;
            int var4 = var2 - class171.field2586;
            int var5 = var1 - class237.field3748;
            if (class82.field1238 > var4) {
                var4 = class82.field1238;
            }
            if (class113.field1747.field3408 + var4 > class82.field1238 - -class244.field3894.field3408) {
                var4 = class82.field1238 + class244.field3894.field3408 - class113.field1747.field3408;
            }
            int var6 = var4 - (class82.field1238 - class244.field3894.field3563);
            if (class8.field129 > var5) {
                var5 = class8.field129;
            }
            if ((class113.field1747.field3561 + var5) > (class8.field129 + class244.field3894.field3561)) {
                var5 = class8.field129 + class244.field3894.field3561 - class113.field1747.field3561;
            }
            int var7 = var5 - class226.field3628;
            int var8 = var5 + class244.field3894.field3569 - class8.field129;
            int var9 = var4 - class160.field2405;
            if (class113.field1747.field3509 < class173.field2674 && (var3 < var9 || -var3 > var9 || var7 > var3 || (-var3) > var7)) {
                class168.field2530 = true;
            }
            if (class113.field1747.field3516 != null && class168.field2530) {
                class26 var10 = new class26();
                var10.field450 = class113.field1747.field3516;
                var10.field442 = var6;
                var10.field453 = class113.field1747;
                var10.field449 = var8;
                class15.method116(8, var10);
            }
            if (class155.field2312 == 0) {
                if (class168.field2530) {
                    if (class113.field1747.field3495 != null) {
                        class26 var11 = new class26();
                        var11.field443 = class244.field3896;
                        var11.field453 = class113.field1747;
                        var11.field442 = var6;
                        var11.field450 = class113.field1747.field3495;
                        var11.field449 = var8;
                        class15.method116(8, var11);
                    }
                    if (class244.field3896 != null && client.method1144(class113.field1747) != null) {
                        class285.field4484++;
                        class240.field3826.method1762(36, true);
                        class240.field3826.method257(770601592, class244.field3896.field3554);
                        class240.field3826.method274(27071, class113.field1747.field3411);
                        class240.field3826.method258(class113.field1747.field3554, -1527329320);
                        class240.field3826.method301(128, class244.field3896.field3411);
                    }
                } else if ((class291.field4524 == 1 || class27.method221((byte) 126, class14.field174 - 1)) && class14.field174 > 2) {
                    class160.method1161((byte) 122);
                } else if (class14.field174 > 0) {
                    class126.method946((byte) -124);
                }
                class113.field1747 = null;
            }
        } else if (class173.field2674 > 1) {
            class113.field1747 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIILnh;JZ)V")
    public static final void method1411(int arg0, int arg1, int arg2, int arg3, class55 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class106 var8 = new class106();
        var8.field1664 = arg4;
        var8.field1656 = arg1 * 128 + 64;
        var8.field1657 = arg2 * 128 + 64;
        var8.field1660 = arg3;
        var8.field1668 = arg5;
        if (class149.field2210[arg0][arg1][arg2] == null) {
            class149.field2210[arg0][arg1][arg2] = new class22(arg0, arg1, arg2);
        }
        class149.field2210[arg0][arg1][arg2].field377 = var8;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1412(byte arg0, String arg1) {
        field3092++;
        if (class83.field1249 == null) {
            return;
        }
        long var2 = class170.method1223(true, arg1);
        int var4 = 0;
        if (var2 == 0L) {
            return;
        }
        while (class83.field1249.length > var4 && class83.field1249[var4].field2009 != var2) {
            var4++;
        }
        if (class83.field1249.length > var4 && class83.field1249[var4] != null) {
            int var5 = -60 % ((-arg0 - 49) / 53);
            class94.field1481++;
            class240.field3826.method1762(176, true);
            class240.field3826.method313(-6968, class83.field1249[var4].field2009);
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(II)V")
    public class199(int arg0, int arg1) {
        this.field3090 = arg1;
        this.field3093 = arg0;
    }
}
