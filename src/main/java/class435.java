import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public abstract class class435 extends class681 {

    @OriginalMember(owner = "client!rba", name = "r", descriptor = "Z")
    public boolean field5795 = false;

    @OriginalMember(owner = "client!rba", name = "l", descriptor = "Lkg;")
    public static class275 field5789 = new class275(23, 2);

    @OriginalMember(owner = "client!rba", name = "p", descriptor = "B")
    public byte field5793;

    @OriginalMember(owner = "client!rba", name = "s", descriptor = "B")
    public byte field5796;

    @OriginalMember(owner = "client!rba", name = "k", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!rba", name = "m", descriptor = "I")
    public int field5790;

    @OriginalMember(owner = "client!rba", name = "o", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!rba", name = "q", descriptor = "I")
    public static int field5794;

    @OriginalMember(owner = "client!rba", name = "t", descriptor = "I")
    public int field5797;

    @OriginalMember(owner = "client!rba", name = "u", descriptor = "I")
    public int field5798;

    @OriginalMember(owner = "client!rba", name = "w", descriptor = "I")
    public int field5800;

    @OriginalMember(owner = "client!rba", name = "x", descriptor = "I")
    public int field5801;

    @OriginalMember(owner = "client!rba", name = "y", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!rba", name = "z", descriptor = "I")
    public int field5803;

    @OriginalMember(owner = "client!rba", name = "n", descriptor = "Lrba;")
    public class435 field5791;

    @OriginalMember(owner = "client!rba", name = "v", descriptor = "Z")
    public boolean field5799;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(III[Llaa;)I", line = 8)
    public final int method2477(int arg0, int arg1, int arg2, class123[] arg3) {
        field5802++;
        int var5 = 18 % ((arg2 + 26) / 42);
        long var6 = class454.field6070[this.field5796][arg0][arg1];
        long var8 = 0L;
        int var10 = 0;
        while (var8 <= 48L) {
            int var11 = (int) (var6 >> (int) var8 & 0xFFFFL);
            if (var11 <= 0) {
                break;
            }
            var8 += 16L;
            arg3[var10++] = class58.field808[var11 - 1].field9381;
        }
        for (int var12 = var10; var12 < 4; var12++) {
            arg3[var12] = null;
        }
        return var10;
    }

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "(B)I", line = 49)
    public int method2066(byte arg0) {
        field5792++;
        return arg0 == -118 ? 0 : -108;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(II)Lbia;", line = 67)
    public static final class501 method2478(int arg0, int arg1) {
        field5788++;
        class501[] var2 = class19.method129((byte) 72);
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class501 var4 = var2[var3];
            if (var4.field7094 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rba", name = "g", descriptor = "(I)V", line = 96)
    public static void method2479(int arg0) {
        field5789 = null;
        if (arg0 >= -55) {
            method2480(-118);
        }
    }

    @OriginalMember(owner = "client!rba", name = "i", descriptor = "(I)V", line = 115)
    public static final void method2480(int arg0) {
        field5794++;
        if (class391.field4978 == 5) {
            class391.field4978 = 6;
            int var1 = 74 % ((arg0 - 6) / 32);
        }
    }

    @OriginalMember(owner = "client!rba", name = "e", descriptor = "(I)Z")
    public abstract boolean method85(int arg0);

    @OriginalMember(owner = "client!rba", name = "f", descriptor = "(I)Z")
    public abstract boolean method759(int arg0);

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "([Llaa;Z)I")
    public abstract int method916(class123[] arg0, boolean arg1);

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lha;I)V")
    public abstract void method744(class60 arg0, int arg1);

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "(ILha;)Z")
    public abstract boolean method918(int arg0, class60 arg1);

    @OriginalMember(owner = "client!rba", name = "d", descriptor = "(B)I")
    public abstract int method87(byte arg0);

    @OriginalMember(owner = "client!rba", name = "e", descriptor = "(B)Z")
    public abstract boolean method914(byte arg0);

    @OriginalMember(owner = "client!rba", name = "d", descriptor = "(ILha;)Lwg;")
    public abstract class428 method750(int arg0, class60 arg1);

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(IILrba;Lha;ZII)V")
    public abstract void method754(int arg0, int arg1, class435 arg2, class60 arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(BILha;I)Z")
    public abstract boolean method752(byte arg0, int arg1, class60 arg2, int arg3);

    @OriginalMember(owner = "client!rba", name = "f", descriptor = "(B)V")
    public abstract void method749(byte arg0);

    @OriginalMember(owner = "client!rba", name = "h", descriptor = "(I)I")
    public abstract int method84(int arg0);

    @OriginalMember(owner = "client!rba", name = "g", descriptor = "(B)Z")
    public abstract boolean method83(byte arg0);

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "(Lha;I)Ljk;")
    public abstract class635 method755(class60 arg0, int arg1);
}
