import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public abstract class class345 extends class320 {

    @OriginalMember(owner = "client!is", name = "q", descriptor = "Lvj;")
    public class303 field5176;

    @OriginalMember(owner = "client!is", name = "r", descriptor = "Lmo;")
    public static class526 field5177 = new class526();

    @OriginalMember(owner = "client!is", name = "t", descriptor = "I")
    public static int field5179 = 0;

    @OriginalMember(owner = "client!is", name = "u", descriptor = "Ljv;")
    public static class55 field5180 = new class55(5);

    @OriginalMember(owner = "client!is", name = "l", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!is", name = "m", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!is", name = "o", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!is", name = "p", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!is", name = "s", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!is", name = "v", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!is", name = "n", descriptor = "Z")
    public boolean field5173;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(I)I", line = 8)
    public int method573(int arg0) {
        field5178++;
        if (arg0 != 18433) {
            this.method574(5, 7, 32);
        }
        return 0;
    }

    @OriginalMember(owner = "client!is", name = "d", descriptor = "(B)Z", line = 20)
    public final boolean method2192(byte arg0) {
        if (arg0 != -3) {
            method2196((byte) 19);
        }
        field5171++;
        return false;
    }

    @OriginalMember(owner = "client!is", name = "e", descriptor = "(B)Z", line = 35)
    public final boolean method2193(byte arg0) {
        int var2 = 119 / ((arg0 + 66) / 36);
        field5174++;
        return this.field5173;
    }

    @OriginalMember(owner = "client!is", name = "e", descriptor = "(I)V", line = 45)
    public static final void method2194(int arg0) {
        class462.field6925 = true;
        if (arg0 == 0) {
            field5172++;
        }
    }

    @OriginalMember(owner = "client!is", name = "g", descriptor = "(I)I", line = 61)
    public final int method2195(int arg0) {
        if (arg0 == 1) {
            field5175++;
            return 1;
        } else {
            return 93;
        }
    }

    @OriginalMember(owner = "client!is", name = "f", descriptor = "(B)V", line = 76)
    public static void method2196(byte arg0) {
        field5177 = null;
        int var1 = 104 % ((arg0 + 40) / 61);
        field5180 = null;
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lvj;)V", line = 97)
    public class345(class303 arg0) {
        this.field5176 = arg0;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(B)Z")
    public abstract boolean method575(byte arg0);

    @OriginalMember(owner = "client!is", name = "d", descriptor = "(I)Z")
    public abstract boolean method577(int arg0);

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(II)V")
    public abstract void method578(int arg0, int arg1);

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(III)V")
    public abstract void method574(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!is", name = "f", descriptor = "(I)V")
    public abstract void method570(int arg0);

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ILmf;Lmf;I)V")
    public abstract void method572(int arg0, class286 arg1, class286 arg2, int arg3);
}
