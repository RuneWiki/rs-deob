import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class543 extends class513 {

    @OriginalMember(owner = "client!eba", name = "t", descriptor = "I")
    public static int field7882 = 0;

    @OriginalMember(owner = "client!eba", name = "k", descriptor = "I")
    public static int field7873;

    @OriginalMember(owner = "client!eba", name = "l", descriptor = "I")
    public int field7874;

    @OriginalMember(owner = "client!eba", name = "n", descriptor = "I")
    public static int field7876;

    @OriginalMember(owner = "client!eba", name = "o", descriptor = "I")
    public static int field7877;

    @OriginalMember(owner = "client!eba", name = "p", descriptor = "I")
    public int field7878;

    @OriginalMember(owner = "client!eba", name = "q", descriptor = "I")
    public static int field7879;

    @OriginalMember(owner = "client!eba", name = "r", descriptor = "I")
    public static int field7880;

    @OriginalMember(owner = "client!eba", name = "s", descriptor = "I")
    public static int field7881;

    @OriginalMember(owner = "client!eba", name = "m", descriptor = "Ljk;")
    public class585 field7875;

    @OriginalMember(owner = "client!eba", name = "j", descriptor = "Ldc;")
    public class5 field7872;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Ljs;[[BI)V", line = 6)
    public static final void method3179(class302 arg0, byte[][] arg1, int arg2) {
        field7877++;
        int var3 = class50.field830.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                int var6 = (class312.field4119[var4] >> 8) * 64 - class36.field689;
                int var7 = (class312.field4119[var4] & 0xFF) * 64 - class88.field1239;
                class317.method1849(-1);
                arg0.method1791(class68.field1045, class349.field4642, 106, var7, var6, var5);
            }
        }
        if (arg2 < 72) {
            method3181(true, 25, 66);
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)V", line = 39)
    public final void method3180(byte arg0) {
        field7880++;
        if (arg0 != 85) {
            this.method3180((byte) -117);
        }
        if (class261.field3592.length > class598.field8637) {
            class261.field3592[class598.field8637++] = this;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZII)I", line = 55)
    public static final int method3181(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field7873 = 79;
        }
        field7879++;
        return arg2 == 1 || arg2 == 3 ? class7.field73[arg1 & 0x3] : class594.field8586[arg1 & 0x3];
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIIIIII)V", line = 70)
    public static final void method3182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 31110) {
            return;
        }
        if (class587.field8513 <= (arg4 - arg5) && class221.field2866 >= arg4 + arg5 && arg1 - arg5 >= class598.field8632 && class288.field3883 >= arg1 + arg5) {
            class468.method2748(arg4, (byte) 121, arg6, arg5, arg0, arg1, arg2);
        } else {
            class408.method2468(arg1, arg6, arg4, 114, arg5, arg2, arg0);
        }
        field7881++;
    }
}
