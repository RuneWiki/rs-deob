import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class366 {

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "Ljava/awt/Font;")
    public static Font field5296;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;IILjava/lang/String;Ljava/lang/String;)V")
    public static final void method2387(String arg0, int arg1, int arg2, String arg3, int arg4, int arg5, String arg6, String arg7) {
        for (int var8 = 99; var8 > 0; var8--) {
            class372.field5410[var8] = class372.field5410[var8 - 1];
            class98.field1370[var8] = class98.field1370[var8 - 1];
            class130.field1796[var8] = class130.field1796[var8 - 1];
            class178.field2352[var8] = class178.field2352[var8 - 1];
            class317.field4634[var8] = class317.field4634[var8 - 1];
            class211.field2803[var8] = class211.field2803[var8 - 1];
            class315.field4608[var8] = class315.field4608[var8 - 1];
        }
        field5297++;
        class372.field5410[0] = arg1;
        class130.field1796[0] = arg7;
        class98.field1370[0] = arg5;
        class178.field2352[0] = arg6;
        class317.field4634[0] = arg3;
        class355.field5139 = class207.field2788;
        class315.field4608[0] = arg4;
        class211.field2803[arg2] = arg0;
        class201.field2701++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V")
    public static void method2388(boolean arg0) {
        if (arg0) {
            method2388(true);
        }
        field5296 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V")
    public static final void method2389(int arg0, int arg1, int arg2) {
        field5295++;
        if (arg1 != 32094) {
            return;
        }
        class4.field41[arg2] = arg0;
        class416 var3 = (class416) class312.field4570.method384((long) arg2, true);
        if (var3 == null) {
            class416 var4 = new class416(4611686018427387905L);
            class312.field4570.method381(true, var4, (long) arg2);
        } else if (var3.field6108 != 4611686018427387905L) {
            var3.field6108 = class114.method735(97) + 500L | 0x4000000000000000L;
            return;
        }
    }
}
