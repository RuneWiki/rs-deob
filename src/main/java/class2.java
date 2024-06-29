import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 extends class65 {

    @OriginalMember(owner = "client!ro", name = "r", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field10;

    @OriginalMember(owner = "client!ro", name = "q", descriptor = "Lh;")
    public static class572 field9 = new class572("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!ro", name = "s", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!ro", name = "u", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ro", name = "v", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ro", name = "p", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!ro", name = "t", descriptor = "[[B")
    public static byte[][] field12;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lhm;B)I")
    public static final int method2(class188 arg0, byte arg1) {
        field13++;
        if (class453.field6405 == arg0) {
            return 5890;
        } else if (class325.field4478 == arg0) {
            return 34167;
        } else if (class645.field9388 == arg0) {
            return 34168;
        } else if (class314.field4331 == arg0) {
            return 34166;
        } else if (arg1 == 35) {
            throw new IllegalArgumentException();
        } else {
            return -38;
        }
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(I)V")
    public class2(int arg0) {
        this.field10 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(B)V")
    public final void method3(byte arg0) {
        this.field10.method3441();
        field14++;
        int var2 = 94 / ((arg0 - 63) / 43);
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(B)V")
    public static void method4(byte arg0) {
        field9 = null;
        if (arg0 == 68) {
            field12 = null;
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)V")
    public static final void method5(int arg0) {
        field11++;
        class68 var1 = (class68) class367.field5074.method124((byte) 42);
        boolean var2 = class307.field4210 != null || class171.field2665 > 0;
        if (var2) {
            class1.field3 = 1;
        }
        if (class335.field4641 && class24.field237.method1788(16, 81) && class103.field1484 > 2) {
            if (var2) {
                class99.field1451 = (class583) class174.field2677.field179.field5648.field5648;
            } else {
                class348.method2115((class583) class174.field2677.field179.field5648.field5648, (byte) -106, var1.method536(false), var1.method532((byte) 108));
            }
        } else if (var2) {
            class99.field1451 = (class583) class174.field2677.field179.field5648;
        } else {
            class348.method2115((class583) class174.field2677.field179.field5648, (byte) -116, var1.method536(false), var1.method532((byte) 108));
        }
        int var3 = 2 % ((6 - arg0) / 46);
    }
}
