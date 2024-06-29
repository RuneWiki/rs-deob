import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public abstract class class692 extends class416 {

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "Lko;")
    public static class466 field9702 = new class466();

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "B")
    public byte field9695;

    @OriginalMember(owner = "client!pn", name = "q", descriptor = "B")
    public byte field9703;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
    public int field9696;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
    public static int field9697;

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "I")
    public int field9699;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "I")
    public int field9700;

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
    public int field9701;

    @OriginalMember(owner = "client!pn", name = "r", descriptor = "I")
    public int field9704;

    @OriginalMember(owner = "client!pn", name = "s", descriptor = "I")
    public int field9705;

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "Z")
    public boolean field9698;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "(B)Z")
    public abstract boolean method398(byte arg0);

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "(B)V")
    public abstract void method404(byte arg0);

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "(I)V")
    public static void method3917(int arg0) {
        if (arg0 < 11) {
            field9702 = null;
        }
        field9702 = null;
    }

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "(I)Z")
    public abstract boolean method1474(int arg0);

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(ILr;)Lod;")
    public abstract class468 method403(int arg0, class167 arg1);

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BLr;)Lll;")
    public abstract class334 method408(byte arg0, class167 arg1);

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "([Lcp;BII)I")
    public final int method3918(class674[] arg0, byte arg1, int arg2, int arg3) {
        field9697++;
        long var5 = class99.field1601[this.field9695][arg3][arg2];
        if (arg1 != 101) {
            method3917(-114);
        }
        long var7 = 0L;
        int var9 = 0;
        while (var7 <= 48L) {
            int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var10 <= 0) {
                break;
            }
            arg0[var9++] = class529.field7714[var10 - 1].field4300;
            var7 += 16L;
        }
        for (int var11 = var9; var11 < 4; var11++) {
            arg0[var11] = null;
        }
        return var9;
    }

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "(B)I")
    public abstract int method406(byte arg0);

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "(I)Z")
    public abstract boolean method1472(int arg0);

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "(I)I")
    public abstract int method393(int arg0);

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "(I)Z")
    public abstract boolean method414(int arg0);

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIILr;ZILpn;)V")
    public abstract void method415(int arg0, int arg1, int arg2, class167 arg3, boolean arg4, int arg5, class692 arg6);

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "(I)Z")
    public abstract boolean method402(int arg0);

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lr;Z)V")
    public abstract void method412(class167 arg0, boolean arg1);

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZILr;I)Z")
    public abstract boolean method392(boolean arg0, int arg1, class167 arg2, int arg3);

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B[Lcp;)I")
    public abstract int method1473(byte arg0, class674[] arg1);
}
