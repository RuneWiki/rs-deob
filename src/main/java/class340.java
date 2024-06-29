import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public abstract class class340 {

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lug;Lug;I)V", line = 8)
    public static final void method2357(class253 arg0, class253 arg1, int arg2) {
        class269.field4176 = arg0;
        class127.field1848 = arg1;
        if (arg2 == -15075) {
            field5303++;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IBIILvc;I)Ljava/awt/Frame;", line = 23)
    public static final Frame method2358(int arg0, byte arg1, int arg2, int arg3, class137 arg4, int arg5) {
        field5299++;
        if (!arg4.method1015((byte) -86)) {
            return null;
        }
        if (arg3 == 0) {
            class56[] var6 = class10.method127(arg4, false);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field784 == arg2 && var6[var8].field780 == arg0 && (arg5 == 0 || var6[var8].field781 == arg5) && (!var7 || arg3 < var6[var8].field772)) {
                    var7 = true;
                    arg3 = var6[var8].field772;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class114 var9 = arg4.method1023(arg5, arg2, arg3, -126, arg0);
        if (arg1 < 19) {
            return (Frame) null;
        }
        while (var9.field1595 == 0) {
            class272.method1918((byte) 22, 10L);
        }
        Frame var10 = (Frame) var9.field1591;
        if (var10 == null) {
            return null;
        } else if (var9.field1595 == 2) {
            class144.method1070(arg4, -29642, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V", line = 101)
    public static final void method2359(int arg0) {
        class45.field603.method1359(75);
        if (arg0 > 77) {
            field5302++;
            class25.field372.method1359(124);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z[B)V")
    public abstract void method721(boolean arg0, byte[] arg1);

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)[B")
    public abstract byte[] method722(byte arg0);
}
