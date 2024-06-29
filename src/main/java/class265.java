import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class265 {

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "B")
    private byte field4699;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public int field4693;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public int field4697;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public int field4702;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public int field4698;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public int field4694;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "Z")
    public static boolean field4692 = false;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field4695 = 0;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "Lqk;")
    public static class207 field4696 = class24.method212(255, "Liste des mises -9 jour charg-Be");

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "Lqk;")
    public static class207 field4701 = class24.method212(255, "Chargement des polices )2 ");

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "Lqk;")
    public static class207 field4705 = class24.method212(255, "_");

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIILdc;IJZ)Z")
    public static final boolean method1821(int arg0, int arg1, int arg2, int arg3, int arg4, class235 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class72.method520(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)I")
    public final int method1822(byte arg0) {
        field4703++;
        int var2 = 42 % ((23 - arg0) / 60);
        return (this.field4699 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static final void method1823(int arg0) {
        class82.method614((byte) 40, class33.field659);
        field4704++;
        class248.field4496++;
        if (class55.field1026 && class270.field4783) {
            int var1 = class20.field322;
            int var2 = var1 - class60.field1112;
            int var3 = -106 % ((arg0 + 12) / 39);
            int var4 = class268.field4747;
            int var5 = var4 - class254.field4543;
            int var6 = class33.field659.field3916;
            if (class282.field4959 > var5) {
                var5 = class282.field4959;
            }
            if (client.field2691 > var2) {
                var2 = client.field2691;
            }
            if (client.field2691 + class154.field2673.field4037 < class33.field659.field4037 + var2) {
                var2 = client.field2691 + class154.field2673.field4037 - class33.field659.field4037;
            }
            int var7 = var2 - class241.field4393;
            if (class282.field4959 + class154.field2673.field3948 < class33.field659.field3948 + var5) {
                var5 = class282.field4959 + class154.field2673.field3948 - class33.field659.field3948;
            }
            int var8 = var5 + class154.field2673.field4059 - class282.field4959;
            int var9 = var5 - class158.field2792;
            int var10 = var2 + class154.field2673.field3891 - client.field2691;
            if (class248.field4496 > class33.field659.field4043 && (var6 < var7 || (-var6) > var7 || var6 < var9 || var9 < (-var6))) {
                class255.field4567 = true;
            }
            if (class33.field659.field4039 != null && class255.field4567) {
                class206 var11 = new class206();
                var11.field3617 = var8;
                var11.field3611 = var10;
                var11.field3616 = class33.field659.field4039;
                var11.field3614 = class33.field659;
                class69.method501(-63, var11);
            }
            if (class247.field4479 == 0) {
                if (class255.field4567) {
                    if (class33.field659.field4044 != null) {
                        class206 var12 = new class206();
                        var12.field3611 = var10;
                        var12.field3607 = class9.field121;
                        var12.field3616 = class33.field659.field4044;
                        var12.field3617 = var8;
                        var12.field3614 = class33.field659;
                        class69.method501(110, var12);
                    }
                    if (class9.field121 != null && client.method1110(class33.field659) != null) {
                        class261.field4645.method767(128, (byte) 53);
                        class46.field916++;
                        class261.field4645.method1042(class33.field659.field3893, -113);
                        class261.field4645.method1085(class33.field659.field3933, (byte) 123);
                        class261.field4645.method1051(class9.field121.field3933, 60);
                        class261.field4645.method1083(false, class9.field121.field3893);
                    }
                } else if ((class276.field4848 == 1 || class174.method1251(class268.field4751 - 1, 17412)) && class268.field4751 > 2) {
                    class158.method1153(15);
                } else if (class268.field4751 > 0) {
                    class160.method1166((byte) 64);
                }
                class33.field659 = null;
            }
        } else if (class248.field4496 > 1) {
            class33.field659 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    public static void method1824(int arg0) {
        field4696 = null;
        field4701 = null;
        field4705 = null;
        int var1 = -10 % ((-arg0 - 35) / 62);
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
    public class265() {
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)I")
    public final int method1825(int arg0) {
        if (arg0 != 7) {
            field4696 = null;
        }
        field4690++;
        return this.field4699 & 0x7;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lv;)V")
    public class265(class149 arg0) {
        this.field4699 = arg0.method1084((byte) 49);
        this.field4693 = arg0.method1050(1272006568);
        this.field4697 = arg0.method1076(65280);
        this.field4702 = arg0.method1076(65280);
        this.field4698 = arg0.method1076(65280);
        this.field4694 = arg0.method1076(65280);
    }
}
