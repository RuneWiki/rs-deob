import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public abstract class class280 extends class113 {

    @OriginalMember(owner = "client!jw", name = "e", descriptor = "Z")
    public boolean field3915 = false;

    @OriginalMember(owner = "client!jw", name = "q", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3927 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

    @OriginalMember(owner = "client!jw", name = "r", descriptor = "[I")
    public static int[] field3928 = new int[256];

    @OriginalMember(owner = "client!jw", name = "s", descriptor = "Lew;")
    public static class683 field3929 = new class683();

    @OriginalMember(owner = "client!jw", name = "j", descriptor = "B")
    public byte field3920;

    @OriginalMember(owner = "client!jw", name = "n", descriptor = "B")
    public byte field3924;

    @OriginalMember(owner = "client!jw", name = "f", descriptor = "I")
    public int field3916;

    @OriginalMember(owner = "client!jw", name = "g", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!jw", name = "h", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!jw", name = "i", descriptor = "I")
    public int field3919;

    @OriginalMember(owner = "client!jw", name = "l", descriptor = "I")
    public int field3922;

    @OriginalMember(owner = "client!jw", name = "m", descriptor = "I")
    public int field3923;

    @OriginalMember(owner = "client!jw", name = "o", descriptor = "I")
    public int field3925;

    @OriginalMember(owner = "client!jw", name = "p", descriptor = "I")
    public int field3926;

    @OriginalMember(owner = "client!jw", name = "k", descriptor = "Z")
    public boolean field3921;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(I[Lwh;II)I", line = 7)
    public final int method1794(int arg0, class40[] arg1, int arg2, int arg3) {
        field3917++;
        long var5 = class72.field1096[this.field3920][arg0][arg3];
        if (arg2 != -1) {
            this.field3921 = false;
        }
        long var7 = 0L;
        int var9 = 0;
        while (var7 <= 48L) {
            int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var10 <= 0) {
                break;
            }
            var7 += 16L;
            arg1[var9++] = class62.field1000[var10 - 1].field2630;
        }
        for (int var11 = var9; var11 < 4; var11++) {
            arg1[var11] = null;
        }
        return var9;
    }

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "(Z)I", line = 52)
    public int method1582(boolean arg0) {
        field3918++;
        if (!arg0) {
            method1795(48);
        }
        return 0;
    }

    @OriginalMember(owner = "client!jw", name = "h", descriptor = "(I)V", line = 85)
    public static void method1795(int arg0) {
        if (arg0 <= 31) {
            field3927 = null;
        }
        field3927 = null;
        field3929 = null;
        field3928 = null;
    }

    @OriginalMember(owner = "client!jw", name = "d", descriptor = "(B)I")
    public abstract int method599(byte arg0);

    @OriginalMember(owner = "client!jw", name = "d", descriptor = "(I)Z")
    public abstract boolean method715(int arg0);

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(BLha;)Lqs;")
    public abstract class603 method613(byte arg0, class543 arg1);

    @OriginalMember(owner = "client!jw", name = "e", descriptor = "(B)Z")
    public abstract boolean method607(byte arg0);

    @OriginalMember(owner = "client!jw", name = "f", descriptor = "(B)Z")
    public abstract boolean method92(byte arg0);

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(ILjw;Lha;BIZI)V")
    public abstract void method711(int arg0, class280 arg1, class543 arg2, byte arg3, int arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!jw", name = "e", descriptor = "(I)V")
    public abstract void method713(int arg0);

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(I[Lwh;)I")
    public abstract int method90(int arg0, class40[] arg1);

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "(BLha;)V")
    public abstract void method610(byte arg0, class543 arg1);

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "(BLha;)Lro;")
    public abstract class522 method602(byte arg0, class543 arg1);

    @OriginalMember(owner = "client!jw", name = "f", descriptor = "(I)Z")
    public abstract boolean method88(int arg0);

    @OriginalMember(owner = "client!jw", name = "g", descriptor = "(B)Z")
    public abstract boolean method614(byte arg0);

    @OriginalMember(owner = "client!jw", name = "g", descriptor = "(I)I")
    public abstract int method595(int arg0);

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIILha;)Z")
    public abstract boolean method594(int arg0, int arg1, int arg2, class543 arg3);
}
