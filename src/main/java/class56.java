import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class56 {

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    private int field690 = 0;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "Lbn;")
    private class256 field702;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "Ljava/lang/String;")
    public static String field697 = "red:";

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field700 = 0;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field692 = 0;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "[B")
    public static byte[] field691;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "Lpq;")
    public static class104 field704;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "Ltf;")
    private class161 field689;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "Lmo;")
    public static class447 field698;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "[[Z")
    public static boolean[][] field706;

    static {
        int var0 = 0;
        field691 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field691[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field705 = 0;
        field704 = new class104(0, 0);
        field707 = -50;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 7)
    public static void method365(int arg0) {
        field691 = null;
        field704 = null;
        field697 = null;
        field706 = null;
        if (arg0 != -1) {
            field692 = -110;
        }
        field698 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lff;ILff;)V", line = 25)
    public static final void method366(class7 arg0, int arg1, class7 arg2) {
        if (arg0.field90 != null) {
            arg0.method90((byte) -53);
        }
        if (arg1 != 0) {
            return;
        }
        field696++;
        arg0.field90 = arg2;
        arg0.field89 = arg2.field89;
        arg0.field90.field89 = arg0;
        arg0.field89.field90 = arg0;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)Ltf;", line = 47)
    public final class161 method367(boolean arg0) {
        field695++;
        if (this.field690 > 0 && this.field702.field4159[this.field690 - 1] != this.field689) {
            class161 var2 = this.field689;
            this.field689 = var2.field2537;
            return var2;
        }
        while (this.field702.field4156 > this.field690) {
            class161 var3 = this.field702.field4159[this.field690++].field2537;
            if (this.field702.field4159[this.field690 - 1] != var3) {
                this.field689 = var3.field2537;
                return var3;
            }
        }
        return arg0 ? null : null;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Z)Ltf;", line = 80)
    public final class161 method368(boolean arg0) {
        if (arg0) {
            method366((class7) null, 21, (class7) null);
        }
        field699++;
        this.field690 = 0;
        return this.method367(true);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BILah;Ljava/awt/Canvas;)Le;", line = 92)
    public static final class312 method369(byte arg0, int arg1, class215 arg2, Canvas arg3) {
        field701++;
        if (arg0 > -80) {
            field692 = 108;
        }
        return new class154(arg3, arg2, arg1);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 103)
    public static final void method370(byte arg0) {
        class124.field1861 = null;
        class243.field4018 = null;
        class68.field852 = null;
        class19.field248 = null;
        if (arg0 >= -117) {
            method365(-91);
        }
        class414.field6117 = null;
        class394.field5911 = null;
        class329.field5147 = null;
        field703++;
        class70.field862 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)I", line = 122)
    public static final int method371(int arg0, int arg1) {
        field693++;
        return arg0 > -96 ? 17 : arg1 >>> 7;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;I)I", line = 142)
    public static final int method372(int arg0, String arg1, int arg2) {
        field694++;
        if (arg0 != 0) {
            method371(-6, -65);
        }
        return class235.method1663(-2, arg2, arg1, true);
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lbn;)V", line = 162)
    public class56(class256 arg0) {
        this.field702 = arg0;
    }
}
