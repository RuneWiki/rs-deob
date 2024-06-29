import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public abstract class class246 {

    @OriginalMember(owner = "client!o", name = "e", descriptor = "[[I")
    public static int[][] field4430 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field4429 = 0;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "Lcf;")
    public static class93 field4437 = class147.method1066("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", -48);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "Lhg;")
    public static class177 field4436;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "Lhg;")
    public static class177 field4438;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "Ljava/awt/Frame;")
    public static Frame field4432;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "[I")
    public static int[] field4435;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "[[B")
    public static byte[][] field4439;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILhg;Lhg;)I")
    public static final int method1674(int arg0, class177 arg1, class177 arg2) {
        int var3 = 0;
        if (arg2.method1280(class288.field5144, (byte) -90)) {
            var3++;
        }
        if (arg2.method1280(class280.field5055, (byte) -56)) {
            var3++;
        }
        if (arg2.method1280(class172.field3018, (byte) -104)) {
            var3++;
        }
        if (arg1.method1280(class288.field5144, (byte) -68)) {
            var3++;
        }
        field4426++;
        if (arg1.method1280(class280.field5055, (byte) -92)) {
            var3++;
        }
        if (arg1.method1280(class172.field3018, (byte) -118)) {
            var3++;
        }
        if (arg0 < 0) {
            method1674(-59, (class177) null, (class177) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V")
    public abstract void method324(int arg0, int arg1);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIII)V")
    public static final void method1675(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 25705) {
            return;
        }
        if (class271.field4820 >= arg4 && class26.field342 <= arg1) {
            boolean var6;
            if (class277.field4967 > arg0) {
                var6 = false;
                arg0 = class277.field4967;
            } else if (class147.field2593 >= arg0) {
                var6 = true;
            } else {
                arg0 = class147.field2593;
                var6 = false;
            }
            boolean var7;
            if (class277.field4967 > arg5) {
                var7 = false;
                arg5 = class277.field4967;
            } else if (arg5 > class147.field2593) {
                arg5 = class147.field2593;
                var7 = false;
            } else {
                var7 = true;
            }
            if (arg4 >= class26.field342) {
                class58.method337(arg0, class76.field1406[arg4++], arg2, arg5, false);
            } else {
                arg4 = class26.field342;
            }
            if (arg1 <= class271.field4820) {
                class58.method337(arg0, class76.field1406[arg1--], arg2, arg5, false);
            } else {
                arg1 = class271.field4820;
            }
            if (var6 && var7) {
                for (int var8 = arg4; var8 <= arg1; var8++) {
                    int[] var9 = class76.field1406[var8];
                    var9[arg0] = var9[arg5] = arg2;
                }
            } else if (var6) {
                for (int var10 = arg4; var10 <= arg1; var10++) {
                    class76.field1406[var10][arg0] = arg2;
                }
            } else if (var7) {
                for (int var11 = arg4; var11 <= arg1; var11++) {
                    class76.field1406[var11][arg5] = arg2;
                }
            }
        }
        field4433++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)[B")
    public abstract byte[] method328(byte arg0, int arg1);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static void method1676(int arg0) {
        field4432 = null;
        field4435 = null;
        field4436 = null;
        if (arg0 != 0) {
            method1676(-6);
        }
        field4437 = null;
        field4430 = null;
        field4439 = null;
        field4438 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    public static final void method1677(byte arg0) {
        class276.field4938 = 0;
        field4431++;
        class138.field2407 = 0;
        class68.method463(0);
        class69.method469((byte) 95);
        class61.method386((byte) 96);
        if (arg0 <= 106) {
            return;
        }
        class278.method1863(70);
        for (int var1 = 0; var1 < class276.field4938; var1++) {
            int var3 = class18.field235[var1];
            if (class275.field4921 != class224.field4031[var3].field3793) {
                if (class224.field4031[var3].field4224 > 0) {
                    class45.method252(class224.field4031[var3], true);
                }
                class224.field4031[var3] = null;
            }
        }
        if (class72.field1300 != class250.field4504.field5027) {
            throw new RuntimeException("gpp1 pos:" + class250.field4504.field5027 + " psize:" + class72.field1300);
        }
        for (int var2 = 0; var2 < class252.field4543; var2++) {
            if (class224.field4031[class234.field4166[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class252.field4543);
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)Ltj;")
    public abstract class272 method322(int arg0);

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(II)I")
    public abstract int method329(int arg0, int arg1);

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V")
    public static final void method1678(int arg0) {
        field4434++;
        class285.field5105.method1568(209, (byte) 49);
        class230.field4112++;
        for (class214 var1 = (class214) class255.field4610.method132((byte) 103); var1 != null; var1 = (class214) class255.field4610.method136(-128)) {
            if (var1.field3914 == 0) {
                class66.method454(1, var1, true);
            }
        }
        if (class139.field2410 != null) {
            class254.method1731(class139.field2410, (byte) 96);
            class139.field2410 = null;
        }
        if (arg0 != 0) {
            field4429 = 116;
        }
    }
}
