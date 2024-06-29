import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class296 extends class105 {

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "I")
    public int field4127;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
    public int field4128;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
    public int field4130;

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
    public int field4131;

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "Lvg;")
    public class52 field4129;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILvg;)V", line = 12)
    public static final void method1922(int arg0, class52 arg1) {
        field4132++;
        boolean var2 = false;
        if (class605.field8787 == arg1.field962 || arg1.field944 == -1 || arg1.field911 != 0) {
            var2 = true;
        } else {
            class718 var3 = class698.field9806.method851(arg1.field944, -2);
            if (var3.field10069 || arg1.field904 + 1 > var3.field10048[arg1.field950]) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg1.field962 - arg1.field898;
            int var5 = class605.field8787 - arg1.field898;
            int var6 = arg1.field881 * 512 + (arg1.method482(false) * 256);
            int var7 = arg1.field948 * 512 + (arg1.method482(false) * 256);
            int var8 = arg1.field977 * 512 + arg1.method482(false) * 256;
            int var9 = arg1.field981 * 512 + arg1.method482(false) * 256;
            arg1.field644 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg1.field648 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg1.field989 = 0;
        if (arg1.field979 == 0) {
            arg1.method462(8192, false, -1);
        }
        if (arg1.field979 == 1) {
            arg1.method462(12288, false, -1);
        }
        if (arg1.field979 == 2) {
            arg1.method462(0, false, -1);
        }
        if (arg0 == -12004 && arg1.field979 == 3) {
            arg1.method462(4096, false, -1);
        }
    }
}
