import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class14 extends class208 {

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
    public int field228 = (int) (class349.method2069(true) / 1000L);

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "Ljava/lang/String;")
    public String field226;

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "S")
    public short field230;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "I")
    public static int field227 = 0;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V", line = 7)
    public static final void method194(boolean arg0) {
        field225++;
        class573 var1 = null;
        try {
            class561 var2 = class521.field7389.method3792(arg0, false, "");
            while (var2.field7769 == 0) {
                class594.method3405(1L, 16711680);
            }
            if (var2.field7769 == 1) {
                var1 = (class573) var2.field7768;
                class403 var3 = class118.field1503.method4294(false);
                var1.method3323(var3.field5262, var3.field5275, true, 0);
            }
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method3319(124);
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lha;ILifa;II)V", line = 48)
    public static final void method195(class66 arg0, int arg1, class450 arg2, int arg3, int arg4) {
        class476.field6612.method2729(-48);
        field229++;
        if (arg3 != 1) {
            method194(false);
        }
        if (class90.field1196) {
            return;
        }
        for (class625 var5 = (class625) arg2.method2725(37); var5 != null; var5 = (class625) arg2.method2726(-116)) {
            class305 var6 = class9.field143.method4140(36, var5.field8567);
            if (class635.method3579(var6, 1)) {
                boolean var7 = class639.method3590(var6, var5, -114, arg1, arg4, arg0);
                if (var7) {
                    class645.method3606(var6, arg0, var5, (byte) 67);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 83)
    public class14(String arg0, int arg1) {
        this.field226 = arg0;
        this.field230 = (short) arg1;
    }
}
