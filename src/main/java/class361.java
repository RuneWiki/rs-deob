import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public abstract class class361 extends class389 {

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "Z")
    public boolean field4637 = false;

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "Z")
    public static boolean field4632 = true;

    @OriginalMember(owner = "client!rr", name = "x", descriptor = "Lpia;")
    public static class94 field4642 = new class94(74, -1);

    @OriginalMember(owner = "client!rr", name = "z", descriptor = "[I")
    public static int[] field4644 = new int[1];

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "B")
    public byte field4628;

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "B")
    public byte field4633;

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
    public int field4627;

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "I")
    public int field4629;

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "I")
    public int field4631;

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
    public int field4635;

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "I")
    public int field4636;

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "I")
    public int field4639;

    @OriginalMember(owner = "client!rr", name = "w", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!rr", name = "y", descriptor = "Lpj;")
    public static class146 field4643;

    @OriginalMember(owner = "client!rr", name = "p", descriptor = "Lrr;")
    public class361 field4634;

    @OriginalMember(owner = "client!rr", name = "v", descriptor = "Z")
    public boolean field4640;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(Z)Lega;", line = 8)
    public static final class709 method2119(boolean arg0) {
        field4638++;
        class709 var1 = (class709) class289.field3569.method2793(14711);
        if (var1 == null) {
            if (!arg0) {
                field4644 = null;
            }
            return new class709();
        } else {
            class164.field1836--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(Z)I", line = 32)
    public int method1177(boolean arg0) {
        if (!arg0) {
            this.field4627 = 20;
        }
        field4630++;
        return 0;
    }

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "(B)V", line = 44)
    public static void method2120(byte arg0) {
        int var1 = 69 / ((arg0 - 2) / 44);
        field4642 = null;
        field4644 = null;
        field4643 = null;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I[Lada;II)I", line = 71)
    public final int method2121(int arg0, class163[] arg1, int arg2, int arg3) {
        field4641++;
        long var5 = class210.field2482[this.field4628][arg3][arg0];
        int var7 = -44 % ((arg2 - 48) / 60);
        long var8 = 0L;
        int var10 = 0;
        while (var8 <= 48L) {
            int var11 = (int) (var5 >> (int) var8 & 0xFFFFL);
            if (var11 <= 0) {
                break;
            }
            var8 += 16L;
            arg1[var10++] = class745.field10409[var11 - 1].field8785;
        }
        for (int var12 = var10; var12 < 4; var12++) {
            arg1[var12] = null;
        }
        return var10;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IILha;I)Z")
    public abstract boolean method995(int arg0, int arg1, class58 arg2, int arg3);

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V")
    public abstract void method982(int arg0);

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(ILha;)Llca;")
    public abstract class642 method983(int arg0, class58 arg1);

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)Z")
    public abstract boolean method986(int arg0);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZLha;Lrr;IIII)V")
    public abstract void method987(boolean arg0, class58 arg1, class361 arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(I)Z")
    public abstract boolean method1152(int arg0);

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "(I)Z")
    public abstract boolean method1154(int arg0);

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "(I)I")
    public abstract int method985(int arg0);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lha;I)V")
    public abstract void method990(class58 arg0, int arg1);

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "(I)Z")
    public abstract boolean method989(int arg0);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B[Lada;)I")
    public abstract int method1150(byte arg0, class163[] arg1);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(BLha;)Llba;")
    public abstract class547 method994(byte arg0, class58 arg1);

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "(I)Z")
    public abstract boolean method991(int arg0);

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "(Z)I")
    public abstract int method992(boolean arg0);
}
