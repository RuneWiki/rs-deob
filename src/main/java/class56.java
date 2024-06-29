import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class56 extends class120 implements class157 {

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
    private int field707;

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "Leh;")
    public static class246 field708 = new class246(45, 12);

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "Ltn;")
    public static class60 field710 = new class60(62, 6);

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lih;ILjaggl/memory/NativeBuffer;IZ)V", line = 4)
    public class56(class503 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field707 = arg1;
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lih;I[BIZ)V", line = 13)
    public class56(class503 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field707 = arg1;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)J", line = 24)
    public final long method463(int arg0) {
        if (arg0 != -17751) {
            this.method463(109);
        }
        ++field709;
        return 0L;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)V", line = 36)
    public final void method451(byte arg0) {
        ++field712;
        super.field1656.method2961(this, true);
        if (arg0 != -28) {
            field710 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BI)V", line = 48)
    public static final void method464(byte arg0, int arg1) {
        if (arg0 < -120) {
            class174 var2 = class513.field7581;
            synchronized (class513.field7581) {
                class513.field7581.method1087(1, arg1);
            }
            ++field704;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)I", line = 65)
    public final int method465(int arg0) {
        ++field711;
        if (arg0 != 10278) {
            this.method463(8);
        }
        return super.field1650;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II[BI)V", line = 77)
    public final void method466(int arg0, int arg1, byte[] arg2, int arg3) {
        this.method808(arg2, -467059280, arg1);
        ++field706;
        this.field707 = arg0;
        if (arg3 != -25990) {
            this.field707 = -97;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)V", line = 90)
    public static final void method467(int arg0, int arg1, int arg2) {
        class239 var3 = class268.field3910[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field3493 != null) {
                var3.field3493 = null;
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)I", line = 100)
    public final int method468(boolean arg0) {
        ++field705;
        if (!arg0) {
            method464((byte) -19, 67);
        }
        return this.field707;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V", line = 114)
    public static void method469(int arg0) {
        field708 = null;
        if (arg0 >= 25) {
            field710 = null;
        }
    }
}
