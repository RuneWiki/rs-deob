import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class340 {

    @OriginalMember(owner = "client!vda", name = "j", descriptor = "I")
    public int field4294;

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "I")
    public int field4288;

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "I")
    public int field4287;

    @OriginalMember(owner = "client!vda", name = "f", descriptor = "I")
    public int field4290;

    @OriginalMember(owner = "client!vda", name = "k", descriptor = "I")
    public int field4295;

    @OriginalMember(owner = "client!vda", name = "l", descriptor = "B")
    public byte field4296;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "Ltca;")
    public static class144 field4285 = new class144(0, 0);

    @OriginalMember(owner = "client!vda", name = "o", descriptor = "I")
    public static int field4299 = 0;

    @OriginalMember(owner = "client!vda", name = "n", descriptor = "J")
    public static long field4298 = 0L;

    @OriginalMember(owner = "client!vda", name = "e", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!vda", name = "i", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "Lwda;")
    public class253 field4286;

    @OriginalMember(owner = "client!vda", name = "h", descriptor = "Lug;")
    public class450 field4292;

    @OriginalMember(owner = "client!vda", name = "g", descriptor = "Lcaa;")
    public class52 field4291;

    @OriginalMember(owner = "client!vda", name = "m", descriptor = "Lam;")
    public class704 field4297;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 4)
    public static final void method1964(int arg0, String arg1, int arg2) {
        class416.method2341(0, arg1, "", "", 0, arg0, "");
        field4289++;
        if (arg2 <= 92) {
            field4285 = null;
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 27)
    public static final void method1965(int arg0, int arg1, int arg2, Class arg3) {
        class499 var4 = class487.field7044[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class245 var5 = var4.field7215; var5 != null; var5 = var5.field3027) {
            class613 var6 = var5.field3029;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field8635 == arg1 && var6.field8627 == arg2) {
                class609.method3390(var6, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)Z", line = 56)
    public final boolean method1966(byte arg0) {
        if (arg0 != -110) {
            method1964(58, null, 34);
        }
        field4293++;
        return this.field4296 == 2 || this.field4296 == 3;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V", line = 70)
    public static void method1967(int arg0) {
        field4285 = null;
        if (arg0 != 26332) {
            method1967(27);
        }
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(BIIIII)V", line = 81)
    public class340(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4294 = arg1;
        this.field4288 = arg3;
        this.field4287 = arg2;
        this.field4290 = arg5;
        this.field4295 = arg4;
        this.field4296 = arg0;
    }
}
