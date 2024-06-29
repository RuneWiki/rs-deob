import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class653 {

    @OriginalMember(owner = "client!oda", name = "k", descriptor = "[Ljava/lang/String;")
    private String[] field9228 = new String[0];

    @OriginalMember(owner = "client!oda", name = "i", descriptor = "I")
    private int field9226 = -1;

    @OriginalMember(owner = "client!oda", name = "m", descriptor = "Z")
    private boolean field9230 = false;

    @OriginalMember(owner = "client!oda", name = "g", descriptor = "I")
    private int field9224;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "I")
    public static int field9218;

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "I")
    public static int field9219;

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "I")
    public static int field9221;

    @OriginalMember(owner = "client!oda", name = "e", descriptor = "I")
    public static int field9222;

    @OriginalMember(owner = "client!oda", name = "f", descriptor = "I")
    public static int field9223;

    @OriginalMember(owner = "client!oda", name = "h", descriptor = "I")
    public static int field9225;

    @OriginalMember(owner = "client!oda", name = "j", descriptor = "I")
    public static int field9227;

    @OriginalMember(owner = "client!oda", name = "l", descriptor = "I")
    public static int field9229;

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "Lwv;")
    public static class705 field9220;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(B)[Ldc;", line = 10)
    public static final class303[] method3680(byte arg0) {
        if (arg0 >= -77) {
            return null;
        } else {
            field9222++;
            return new class303[] { class7.field67, class40.field541, class96.field1410, class564.field8253, class99.field1476, class620.field8837, class690.field9784, class346.field4888, class432.field6162, class550.field8065, class172.field2785, class567.field8292, class598.field8645, class113.field1812 };
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 23)
    private final void method3681(int arg0, String arg1, int arg2) {
        if (arg2 > this.field9226) {
            this.field9226 = arg2;
        }
        field9229++;
        int var4 = -85 % ((arg0 + 55) / 63);
        if (arg2 >= this.field9228.length) {
            this.method3686(arg2, -98);
        }
        this.field9228[arg2] = arg1;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(II)I", line = 43)
    private final int method3682(int arg0, int arg1) {
        if (arg1 != 1) {
            return -16;
        }
        field9219++;
        int var3 = this.field9228.length;
        while (arg0 >= var3) {
            if (!this.field9230) {
                var3 += this.field9224;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field9224 * var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 77)
    public final void method3683(String arg0, int arg1) {
        this.method3681(arg1 + 27792, arg0, this.field9226 + 1);
        if (arg1 != -27914) {
            method3684(true, 103);
        }
        field9218++;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(ZI)I", line = 88)
    public static final int method3684(boolean arg0, int arg1) {
        if (arg0) {
            method3680((byte) -10);
        }
        field9225++;
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(IZ)V", line = 177)
    public class653(int arg0, boolean arg1) {
        this.field9224 = arg0;
        this.field9230 = arg1;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)[Ljava/lang/String;", line = 103)
    public final String[] method3685(int arg0) {
        field9227++;
        String[] var2 = new String[this.field9226 + 1];
        if (arg0 != -1) {
            method3687(117);
        }
        class553.method3243(this.field9228, 0, var2, 0, this.field9226 + 1);
        return var2;
    }

    @OriginalMember(owner = "client!oda", name = "toString", descriptor = "()Ljava/lang/String;", line = 121)
    public final String toString() {
        field9223++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field9226; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field9228[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(II)V", line = 146)
    private final void method3686(int arg0, int arg1) {
        field9221++;
        String[] var3 = new String[this.method3682(arg0, 1)];
        class553.method3243(this.field9228, 0, var3, 0, this.field9228.length);
        int var4 = -11 % ((arg1 + 16) / 61);
        this.field9228 = var3;
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(I)V", line = 159)
    public static void method3687(int arg0) {
        field9220 = null;
        if (arg0 != 1) {
            field9220 = null;
        }
    }
}
