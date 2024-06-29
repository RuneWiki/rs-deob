import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public abstract class class326 extends class435 {

    @OriginalMember(owner = "client!oba", name = "v", descriptor = "Lkfa;")
    public class382 field4544;

    @OriginalMember(owner = "client!oba", name = "r", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!oba", name = "s", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!oba", name = "t", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!oba", name = "u", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!oba", name = "w", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!oba", name = "q", descriptor = "Z")
    public boolean field4539;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(B)Z", line = 6)
    public final boolean method1945(byte arg0) {
        int var2 = -122 % ((48 - arg0) / 45);
        field4542++;
        return false;
    }

    @OriginalMember(owner = "client!oba", name = "e", descriptor = "(B)I", line = 21)
    public final int method1946(byte arg0) {
        int var2 = 58 / ((18 - arg0) / 41);
        field4540++;
        return 1;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)I", line = 31)
    public int method736(int arg0) {
        field4543++;
        if (arg0 != -26877) {
            this.field4539 = true;
        }
        return 0;
    }

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "(Z)Z", line = 44)
    public final boolean method1947(boolean arg0) {
        field4545++;
        if (arg0) {
            this.method735((byte) 61);
        }
        return this.field4539;
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(Lkfa;)V", line = 55)
    public class326(class382 arg0) {
        this.field4544 = arg0;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(ILis;)V", line = 66)
    public static final void method1948(int arg0, class101 arg1) {
        if (class419.field5958 == arg1.field1575) {
            class636.field9030[arg1.field1647] = true;
        }
        if (arg0 == 1) {
            field4541++;
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Z)Z")
    public abstract boolean method729(boolean arg0);

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(BI)V")
    public abstract void method731(byte arg0, int arg1);

    @OriginalMember(owner = "client!oba", name = "f", descriptor = "(B)V")
    public abstract void method735(byte arg0);

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lil;Lil;II)V")
    public abstract void method730(class586 arg0, class586 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oba", name = "g", descriptor = "(B)Z")
    public abstract boolean method732(byte arg0);

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(III)V")
    public abstract void method727(int arg0, int arg1, int arg2);
}
