import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class645 {

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "Z")
    public boolean field9013 = true;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "Ljo;")
    public static class353 field9014 = new class353(64);

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "C")
    private char field9020;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field9009;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field9010;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public int field9011;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field9015;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public static int field9016;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    public static int field9017;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    public static int field9018;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    public static int field9019;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "Ljava/lang/String;")
    public String field9012;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V", line = 11)
    public static final void method3697(byte arg0) {
        int var1 = -81 / ((arg0 + 32) / 55);
        field9010++;
        if (class21.field353.field10086.method1642(-19) == 0 && class481.field6761 != class368.field5113) {
            class417.method2537(false, class432.field5849, 11, false, class436.field5884);
        } else {
            class518.method3121((byte) -60, class37.field491);
            if (class678.field9427 != class368.field5113) {
                class620.method3581(-2);
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILso;I)V", line = 32)
    private final void method3698(int arg0, class494 arg1, int arg2) {
        if (arg0 == 1) {
            this.field9020 = class583.method3412(arg1.method2943((byte) 16), (byte) 8);
        } else if (arg0 == 2) {
            this.field9011 = arg1.method2976(arg2 + 24017);
        } else if (arg0 == 4) {
            this.field9013 = false;
        } else if (arg0 == 5) {
            this.field9012 = arg1.method2996(arg2 + 24249);
        }
        if (arg2 == -24145) {
            field9016++;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/io/File;IB)[B", line = 64)
    public static final byte[] method3699(File arg0, int arg1, byte arg2) {
        field9009++;
        try {
            byte[] var3 = new byte[arg1];
            class514.method3098(arg0, 9077, arg1, var3);
            if (arg2 != -43) {
                method3699(null, 19, (byte) -85);
            }
            return var3;
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILjs;)V", line = 82)
    public static final void method3700(int arg0, int arg1, class349 arg2) {
        class725.field10029 = 0;
        field9017++;
        class343.field4779 = false;
        if (arg0 != 2) {
            method3700(-91, -29, null);
        }
        class48.method341((byte) 124, arg2);
        class83.method634((byte) -37, arg2);
        if (class343.field4779) {
            System.out.println("---endgpp---");
        }
        if (arg2.field7042 != arg1) {
            throw new RuntimeException("gpi1 pos:" + arg2.field7042 + " psize:" + arg1);
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)Z", line = 105)
    public final boolean method3701(byte arg0) {
        field9015++;
        if (arg0 != 61) {
            this.method3698(-39, null, 61);
        }
        return this.field9020 == 's';
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lso;I)V", line = 117)
    public final void method3702(class494 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2964((byte) 76);
            if (var3 == 0) {
                if (arg1 != -3743) {
                    return;
                }
                field9019++;
                return;
            }
            this.method3698(var3, arg0, -24145);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 138)
    public static void method3703(int arg0) {
        if (arg0 == 64) {
            field9014 = null;
        }
    }
}
