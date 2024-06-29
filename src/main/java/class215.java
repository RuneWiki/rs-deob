import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public abstract class class215 extends class609 {

    @OriginalMember(owner = "client!rga", name = "f", descriptor = "B")
    public byte field3019;

    @OriginalMember(owner = "client!rga", name = "j", descriptor = "B")
    public byte field3023;

    @OriginalMember(owner = "client!rga", name = "e", descriptor = "I")
    public int field3018;

    @OriginalMember(owner = "client!rga", name = "g", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!rga", name = "h", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!rga", name = "i", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!rga", name = "k", descriptor = "I")
    public int field3024;

    @OriginalMember(owner = "client!rga", name = "l", descriptor = "I")
    public int field3025;

    @OriginalMember(owner = "client!rga", name = "m", descriptor = "I")
    public int field3026;

    @OriginalMember(owner = "client!rga", name = "n", descriptor = "I")
    public int field3027;

    @OriginalMember(owner = "client!rga", name = "o", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!rga", name = "p", descriptor = "I")
    public int field3029;

    @OriginalMember(owner = "client!rga", name = "q", descriptor = "Z")
    public boolean field3030;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(I[Lrc;II)I", line = 14)
    public final int method1427(int arg0, class498[] arg1, int arg2, int arg3) {
        field3022++;
        long var5 = class477.field6789[this.field3019][arg0][arg3];
        long var7 = 0L;
        int var9 = 0;
        while (var7 <= 48L) {
            int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var10 <= 0) {
                break;
            }
            arg1[var9++] = class580.field8172[var10 - 1].field7165;
            var7 += 16L;
        }
        if (arg2 > -85) {
            this.method953(-52, false, null, null, 57, 73, true);
        }
        for (int var11 = var9; var11 < 4; var11++) {
            arg1[var11] = null;
        }
        return var9;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(B[B)V", line = 59)
    public static final void method1428(byte arg0, byte[] arg1) {
        field3020++;
        class695 var2 = new class695(arg1);
        if (arg0 != -80) {
            method1428((byte) 23, null);
        }
        while (true) {
            int var3 = var2.method3826(false);
            if (var3 == 0) {
                return;
            }
            if (var3 == 2) {
                class487.field6928 = var2.method3847((byte) 118);
            }
        }
    }

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "(B)V", line = 107)
    public static final void method1429(byte arg0) {
        field3028++;
        if (arg0 > -23) {
            method1429((byte) -50);
        }
        if (class338.field4984 != -1) {
            class77.method708(-1, (byte) -5, false, class338.field4984, -1);
            class338.field4984 = -1;
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(I[Lrc;)I")
    public abstract int method950(int arg0, class498[] arg1);

    @OriginalMember(owner = "client!rga", name = "f", descriptor = "(I)V")
    public abstract void method947(int arg0);

    @OriginalMember(owner = "client!rga", name = "g", descriptor = "(I)I")
    public abstract int method1182(int arg0);

    @OriginalMember(owner = "client!rga", name = "h", descriptor = "(I)Z")
    public abstract boolean method1184(int arg0);

    @OriginalMember(owner = "client!rga", name = "i", descriptor = "(I)Z")
    public abstract boolean method1181(int arg0);

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(IZLr;Lrga;IIZ)V")
    public abstract void method953(int arg0, boolean arg1, class166 arg2, class215 arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "(Z)Z")
    public abstract boolean method948(boolean arg0);

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(ILr;)V")
    public abstract void method1177(int arg0, class166 arg1);

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(IILr;I)Z")
    public abstract boolean method1185(int arg0, int arg1, class166 arg2, int arg3);

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "(ILr;)Lnu;")
    public abstract class548 method1183(int arg0, class166 arg1);

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(B)I")
    public abstract int method1171(byte arg0);

    @OriginalMember(owner = "client!rga", name = "j", descriptor = "(I)Z")
    public abstract boolean method951(int arg0);

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "(Lr;Z)Lkq;")
    public abstract class549 method1173(class166 arg0, boolean arg1);

    @OriginalMember(owner = "client!rga", name = "k", descriptor = "(I)Z")
    public abstract boolean method952(int arg0);
}
