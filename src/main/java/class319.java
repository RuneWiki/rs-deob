import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class319 {

    @OriginalMember(owner = "client!fda", name = "i", descriptor = "I")
    public int field4422;

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "Lkba;")
    public class105 field4416;

    @OriginalMember(owner = "client!fda", name = "k", descriptor = "I")
    public int field4424;

    @OriginalMember(owner = "client!fda", name = "n", descriptor = "I")
    public int field4427;

    @OriginalMember(owner = "client!fda", name = "p", descriptor = "I")
    public int field4429;

    @OriginalMember(owner = "client!fda", name = "g", descriptor = "I")
    public int field4420;

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "I")
    public int field4417;

    @OriginalMember(owner = "client!fda", name = "h", descriptor = "B")
    public byte field4421;

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "I")
    public static int field4418 = 0;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!fda", name = "j", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!fda", name = "m", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "Ldfa;")
    public class163 field4415;

    @OriginalMember(owner = "client!fda", name = "l", descriptor = "Lsba;")
    public class214 field4425;

    @OriginalMember(owner = "client!fda", name = "o", descriptor = "Loj;")
    public class379 field4428;

    @OriginalMember(owner = "client!fda", name = "f", descriptor = "Lnp;")
    public class490 field4419;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)[Llea;", line = 8)
    public static final class611[] method2066(int arg0) {
        if (class486.field6817 == null) {
            class611[] var1 = class605.method3400(class202.field2644, (byte) 1);
            class611[] var2 = new class611[var1.length];
            int var3 = 0;
            int var4 = class557.field7812.field6552.method4108(false);
            label74: for (int var5 = 0; var5 < var1.length; var5++) {
                class611 var9 = var1[var5];
                if ((var9.field8578 <= 0 || var9.field8578 >= 24) && var9.field8576 >= 800 && var9.field8579 >= 600 && (var4 != 2 || var9.field8576 <= 800 && var9.field8579 <= 600) && (var4 != 1 || var9.field8576 <= 1024 && var9.field8579 <= 768)) {
                    for (int var10 = 0; var10 < var3; var10++) {
                        class611 var11 = var2[var10];
                        if (var9.field8576 == var11.field8576 && var9.field8579 == var11.field8579) {
                            if (var11.field8578 < var9.field8578) {
                                var2[var10] = var9;
                            }
                            continue label74;
                        }
                    }
                    var2[var3] = var9;
                    var3++;
                }
            }
            class486.field6817 = new class611[var3];
            class255.method1693(var2, 0, class486.field6817, 0, var3);
            int[] var6 = new int[class486.field6817.length];
            for (int var7 = 0; var7 < class486.field6817.length; var7++) {
                class611 var8 = class486.field6817[var7];
                var6[var7] = var8.field8579 * var8.field8576;
            }
            class391.method2463(120, class486.field6817, var6);
        }
        if (arg0 == 17710) {
            field4423++;
            return class486.field6817;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)Z", line = 107)
    public final boolean method2067(byte arg0) {
        if (arg0 != -87) {
            this.method2067((byte) -62);
        }
        field4426++;
        return this.field4421 == 2 || this.field4421 == 3;
    }

    @OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(BIIIIIILkba;)V", line = 118)
    public class319(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class105 arg7) {
        this.field4422 = arg3;
        this.field4416 = arg7;
        this.field4424 = arg4;
        this.field4427 = arg5;
        this.field4429 = arg2;
        this.field4420 = arg1;
        this.field4417 = arg6;
        this.field4421 = arg0;
    }
}
