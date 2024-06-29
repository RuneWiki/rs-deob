import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class419 extends class403 {

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "Lh;")
    public static class434 field5681 = new class434(34, 15);

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "[I")
    public static int[] field5687 = new int[5];

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "Lvr;")
    public static class80 field5688;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "Lvr;")
    public static class80 field5690;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "Lvr;")
    public static class80 field5691;

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "Lvr;")
    public static class80 field5692;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "Lvr;")
    public static class80 field5693;

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "Lvr;")
    public static class80 field5694;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "Lvr;")
    public static class80 field5695;

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "Lvr;")
    public static class80 field5696;

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "Lvr;")
    public static class80 field5697;

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "Lvr;")
    public static class80 field5698;

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "[Lvr;")
    private static class80[] field5699;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!ck", name = "U", descriptor = "Lr;")
    public static class110 field5700;

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "Lad;")
    private class268 field5684;

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "[S")
    public static short[] field5689;

    static {
        new class206("Select", "Auswählen", "Sélectionner", "Selecionar");
        field5688 = new class80(14, 1);
        field5690 = new class80(15, 4);
        field5691 = new class80(16, -2);
        field5692 = new class80(17, 0);
        field5693 = new class80(18, -2);
        field5694 = new class80(20, 6);
        field5695 = new class80(21, 8);
        field5696 = new class80(22, -2);
        field5697 = new class80(23, 4);
        field5698 = new class80(24, -1);
        field5699 = new class80[32];
        class80[] var0 = class13.method86((byte) -109);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field5699[var0[var1].field1076] = var0[var1];
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILbt;I)V", line = 4)
    private final void method2489(int arg0, class32 arg1, int arg2) {
        if (arg0 != 1) {
            this.method2490(-127, -45, -19);
        }
        field5682++;
        if (arg2 != 249) {
            return;
        }
        int var4 = arg1.method201((byte) -119);
        if (this.field5684 == null) {
            int var5 = class100.method616(var4, true);
            this.field5684 = new class268(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg1.method201((byte) -118) == 1;
            int var8 = arg1.method219(-124);
            class445 var9;
            if (var7) {
                var9 = new class221(arg1.method195(-60));
            } else {
                var9 = new class37(arg1.method222(1024));
            }
            this.field5684.method1525((byte) 19, var9, (long) var8);
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(III)I", line = 51)
    public final int method2490(int arg0, int arg1, int arg2) {
        field5686++;
        if (this.field5684 == null) {
            return arg1;
        }
        class37 var4 = (class37) this.field5684.method1528((long) arg0, 55);
        if (arg2 == 29708) {
            return var4 == null ? arg1 : var4.field555;
        } else {
            return 75;
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V", line = 71)
    public static void method2491(int arg0) {
        field5688 = null;
        field5698 = null;
        field5681 = null;
        field5699 = null;
        field5687 = null;
        field5694 = null;
        field5690 = null;
        field5691 = null;
        field5693 = null;
        field5692 = null;
        field5700 = null;
        if (arg0 == 0) {
            field5697 = null;
            field5689 = null;
            field5695 = null;
            field5696 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lbt;B)V", line = 100)
    public final void method2492(class32 arg0, byte arg1) {
        if (arg1 != 39) {
            this.method2492((class32) null, (byte) -98);
        }
        field5685++;
        while (true) {
            int var3 = arg0.method201((byte) -109);
            if (var3 == 0) {
                return;
            }
            this.method2489(1, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;", line = 136)
    public final String method2493(int arg0, int arg1, String arg2) {
        field5683++;
        if (this.field5684 == null) {
            return arg2;
        }
        class221 var4 = (class221) this.field5684.method1528((long) arg1, 76);
        if (arg0 == 17) {
            return var4 == null ? arg2 : var4.field2943;
        } else {
            return null;
        }
    }
}
