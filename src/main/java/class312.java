import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class312 {

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field4602 = 100;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "[[B")
    public static byte[][] field4601;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 4)
    public static final String method2054(int arg0, long arg1) {
        field4604++;
        int var3 = -37 / ((arg0 + 78) / 45);
        class48.field739.setTime(new Date(arg1));
        int var4 = class48.field739.get(7);
        int var5 = class48.field739.get(5);
        int var6 = class48.field739.get(2);
        int var7 = class48.field739.get(1);
        int var8 = class48.field739.get(11);
        int var9 = class48.field739.get(12);
        int var10 = class48.field739.get(13);
        return class66.field977[var4 - 1] + ", " + var5 / 10 + var5 % 10 + "-" + class58.field867[var6] + "-" + var7 + " " + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V", line = 32)
    public static final void method2055(byte arg0) {
        class194.field2693.method372(124);
        field4603++;
        if (arg0 <= 43) {
            method2055((byte) 55);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIII)V", line = 50)
    public static final void method2056(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field4602 >= arg2 && class157.field1981 <= arg1) {
            boolean var6;
            if (arg3 < class240.field3368) {
                var6 = false;
                arg3 = class240.field3368;
            } else if (class136.field1769 < arg3) {
                arg3 = class136.field1769;
                var6 = false;
            } else {
                var6 = true;
            }
            boolean var7;
            if (arg4 < class240.field3368) {
                arg4 = class240.field3368;
                var7 = false;
            } else if (arg4 > class136.field1769) {
                var7 = false;
                arg4 = class136.field1769;
            } else {
                var7 = true;
            }
            if (class157.field1981 > arg2) {
                arg2 = class157.field1981;
            } else {
                class351.method2317(false, arg4, class444.field6416[arg2++], arg3, arg0);
            }
            if (arg1 > field4602) {
                arg1 = field4602;
            } else {
                class351.method2317(false, arg4, class444.field6416[arg1--], arg3, arg0);
            }
            if (var6 && var7) {
                for (int var8 = arg2; var8 <= arg1; var8++) {
                    int[] var9 = class444.field6416[var8];
                    var9[arg3] = var9[arg4] = arg0;
                }
            } else if (var6) {
                for (int var11 = arg2; var11 <= arg1; var11++) {
                    class444.field6416[var11][arg3] = arg0;
                }
            } else if (var7) {
                for (int var10 = arg2; var10 <= arg1; var10++) {
                    class444.field6416[var10][arg4] = arg0;
                }
            }
        }
        field4600++;
        if (arg5 >= -45) {
            field4602 = -39;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 158)
    public static void method2057(int arg0) {
        if (arg0 != -14139) {
            field4602 = 53;
        }
        field4601 = null;
    }
}
