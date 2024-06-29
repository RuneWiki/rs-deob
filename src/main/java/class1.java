import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!AEQBPGLT")
public class class1 extends class58 {

    @OriginalMember(owner = "client!AEQBPGLT", name = "t", descriptor = "Z")
    public boolean field8 = false;

    @OriginalMember(owner = "client!AEQBPGLT", name = "v", descriptor = "I")
    private int field10 = 1;

    @OriginalMember(owner = "client!AEQBPGLT", name = "u", descriptor = "LXYSJIYWF;")
    private class67 field9;

    @OriginalMember(owner = "client!AEQBPGLT", name = "o", descriptor = "I")
    public int field3;

    @OriginalMember(owner = "client!AEQBPGLT", name = "p", descriptor = "I")
    public int field4;

    @OriginalMember(owner = "client!AEQBPGLT", name = "q", descriptor = "I")
    public int field5;

    @OriginalMember(owner = "client!AEQBPGLT", name = "r", descriptor = "I")
    public int field6;

    @OriginalMember(owner = "client!AEQBPGLT", name = "s", descriptor = "I")
    public int field7;

    @OriginalMember(owner = "client!AEQBPGLT", name = "m", descriptor = "I")
    private int field1;

    @OriginalMember(owner = "client!AEQBPGLT", name = "w", descriptor = "I")
    private int field11;

    @OriginalMember(owner = "client!AEQBPGLT", name = "n", descriptor = "I")
    private int field2;

    @OriginalMember(owner = "client!AEQBPGLT", name = "a", descriptor = "(I)LOJGAHFXC;")
    public final class41 method1(int arg0) {
        class41 var2 = this.field9.method582();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field9.field1695.field719[this.field1];
        class41 var4 = new class41(class37.method395(var3, (byte) 1), false, true, -900, var2);
        if (!this.field8) {
            var4.method420(this.field11);
            var4.method421(771, var3);
            var4.field1221 = null;
            var4.field1220 = null;
        }
        if (this.field9.field1698 != 128 || this.field9.field1699 != 128) {
            var4.method429(this.field9.field1698, this.field10, this.field9.field1699, this.field9.field1698);
        }
        if (this.field9.field1700 != 0) {
            if (this.field9.field1700 == 90) {
                var4.method424(5);
            }
            if (this.field9.field1700 == 180) {
                var4.method424(5);
                var4.method424(5);
            }
            if (this.field9.field1700 == 270) {
                var4.method424(5);
                var4.method424(5);
                var4.method424(5);
            }
        }
        var4.method430(this.field9.field1701 + 64, this.field9.field1702 + 850, -30, -50, -30, true);
        int var5 = 69 / arg0;
        return var4;
    }

    @OriginalMember(owner = "client!AEQBPGLT", name = "<init>", descriptor = "(IBIIIIII)V")
    public class1(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field9 = class67.field1691[arg3];
        if (arg1 != 112) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        this.field3 = arg2;
        this.field4 = arg0;
        this.field5 = arg6;
        this.field6 = arg7;
        this.field7 = arg4 + arg5;
        this.field8 = false;
    }

    @OriginalMember(owner = "client!AEQBPGLT", name = "a", descriptor = "(II)V")
    public final void method2(int arg0, int arg1) {
        this.field2 += arg1;
        int var3 = 51 / arg0;
        while (true) {
            do {
                do {
                    if (this.field2 <= this.field9.field1695.method207((byte) 6, this.field1)) {
                        return;
                    }
                    this.field2 -= this.field9.field1695.method207((byte) 6, this.field1);
                    this.field1++;
                } while (this.field1 < this.field9.field1695.field718);
            } while (this.field1 >= 0 && this.field1 < this.field9.field1695.field718);
            this.field1 = 0;
            this.field8 = true;
        }
    }
}
