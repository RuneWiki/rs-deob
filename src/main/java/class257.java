import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class257 extends class333 implements class157 {

    @OriginalMember(owner = "client!mv", name = "j", descriptor = "I")
    private int field3830;

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "Lnh;")
    public static class536 field3825 = new class536("LIVE", 0);

    @OriginalMember(owner = "client!mv", name = "i", descriptor = "Lkn;")
    public static class530 field3829 = new class530("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!mv", name = "k", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)I", line = 3)
    public final int method465(int arg0) {
        ++field3826;
        if (arg0 != 10278) {
            this.method466(39, 55, (byte[]) null, 119);
        }
        return 0;
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lih;ILjaggl/memory/NativeBuffer;)V", line = 15)
    public class257(class503 arg0, int arg1, NativeBuffer arg2) {
        super(arg0, arg2);
        this.field3830 = arg1;
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(Z)V", line = 23)
    public static void method1660(boolean arg0) {
        field3829 = null;
        field3825 = null;
        if (arg0) {
            field3825 = null;
        }
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lih;I[BI)V", line = 34)
    public class257(class503 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field3830 = arg1;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Z)I", line = 42)
    public final int method468(boolean arg0) {
        ++field3827;
        if (!arg0) {
            this.method466(-70, 83, (byte[]) null, -49);
        }
        return this.field3830;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(II[BI)V", line = 58)
    public final void method466(int arg0, int arg1, byte[] arg2, int arg3) {
        this.method1991(arg2, arg1);
        ++field3828;
        if (arg3 != -25990) {
            field3829 = null;
        }
        this.field3830 = arg0;
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)J", line = 73)
    public final long method463(int arg0) {
        if (arg0 != -17751) {
            field3825 = null;
        }
        ++field3824;
        return super.field4834.method2610();
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lza;B)V", line = 89)
    public static final void method1661(class290 arg0, byte arg1) {
        arg0.method301(0, 0, class147.field1956, 350);
        ++field3823;
        arg0.method325(0, 0, class147.field1956, 350, 3351159 | class421.field5931 << 24, 1);
        int var2 = 350 / class471.field6570;
        if (class508.field7526 > 0) {
            int var3 = -class471.field6570 + 346 + -4;
            int var4 = var2 * var3 / (var2 + -1 + class508.field7526);
            int var5 = 4;
            if (~class508.field7526 < -2) {
                var5 += (-class408.field5782 + class508.field7526 - 1) * (-var4 + var3) / (class508.field7526 + -1);
            }
            arg0.method325(class147.field1956 - 16, var5, 12, var4, 3351159 | class421.field5931 << 24, 2);
            for (int var6 = class408.field5782; var6 < class408.field5782 - -var2 && ~class508.field7526 < ~var6; ++var6) {
                String[] var7 = class177.method1103('\b', class133.field1752[var6], 0);
                int var8 = (class147.field1956 + -24) / var7.length;
                for (int var9 = 0; ~var9 > ~var7.length; ++var9) {
                    int var10 = var8 * var9 + 8;
                    arg0.method301(var10, 0, var8 + var10 - 8, 350);
                    class38.field415.method1914(-((-class408.field5782 + var6) * class471.field6570) + -2 + -class324.field4729 + 350 + -class431.field6093.field5813, var10, var7[var9], -1, 16144, -16777216);
                }
            }
        }
        arg0.method301(0, 0, class147.field1956, 350);
        if (arg1 >= -119) {
            method1660(true);
        }
        arg0.method1793(0, -29535, -1, class147.field1956, 350 - class324.field4729);
        class107.field1431.method1914(-class113.field1536.field5813 - 1 + 350, 10, "--> " + class483.field6728, -1, 16144, -16777216);
        int var11 = -1;
        if (class390.field5481 % 30 > 15) {
            var11 = 16777215;
        }
        arg0.method1792(1, 10 + class113.field1536.method2430("--> " + class483.field6728.substring(0, class511.field7567), (byte) -110), 12, var11, 350 - class113.field1536.field5813 + -11);
    }
}
