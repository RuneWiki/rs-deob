import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class58 {

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "Lvaa;")
    private class517 field940 = null;

    @OriginalMember(owner = "client!rga", name = "c", descriptor = "I")
    private int field941 = 0;

    @OriginalMember(owner = "client!rga", name = "i", descriptor = "I")
    private int field947 = 0;

    @OriginalMember(owner = "client!rga", name = "l", descriptor = "I")
    private int field950 = 0;

    @OriginalMember(owner = "client!rga", name = "h", descriptor = "Luca;")
    private class287 field946;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "Lal;")
    private class170 field939;

    @OriginalMember(owner = "client!rga", name = "k", descriptor = "[Lor;")
    private class398[] field949;

    @OriginalMember(owner = "client!rga", name = "e", descriptor = "Lwaa;")
    public class160 field943;

    @OriginalMember(owner = "client!rga", name = "j", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field948 = new BigInteger("8279aa07194f09bbe6e87e3615d2630b9736e73f8b6d4d6bc8bd7a8f2a91d64f2d96ac1c6a6818177716ac01ad3aab7c4df9bc9753383286190d9fc28fa454bf", 16);

    @OriginalMember(owner = "client!rga", name = "d", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!rga", name = "f", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!rga", name = "g", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!rga", name = "m", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!rga", name = "n", descriptor = "[I")
    public static int[] field952;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(IILvaa;)Z")
    public final boolean method362(int arg0, int arg1, class517 arg2) {
        field944++;
        if (arg1 != -18276) {
            field952 = null;
        }
        if (this.field947 == 0) {
            return false;
        }
        if (this.field940 != arg2) {
            this.field949[this.field947 & Integer.MAX_VALUE].method93(arg0, arg2, (byte) 119);
            this.field940 = arg2;
        }
        return true;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(II)Z")
    public final boolean method363(int arg0, int arg1) {
        if (arg0 <= 65) {
            return false;
        } else {
            field942++;
            return this.field949[arg1].method87(3);
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(B)V")
    public static void method364(byte arg0) {
        field948 = null;
        field952 = null;
        if (arg0 != 64) {
            method364((byte) 115);
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(IIIZZI)V")
    public final void method365(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        field945++;
        boolean var7 = arg3 & this.field946.method649();
        if (!var7 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
            if (arg1 == 4) {
                arg0 = arg2;
            }
            arg1 = 2;
        }
        if (arg1 != 0 && arg4) {
            arg1 |= Integer.MIN_VALUE;
        }
        if (this.field947 != arg1) {
            if (this.field947 != 0) {
                this.field949[this.field947 & Integer.MAX_VALUE].method92(512);
            }
            if (arg1 != 0) {
                this.field949[arg1 & Integer.MAX_VALUE].method91(arg4, -5191);
                this.field949[arg1 & Integer.MAX_VALUE].method94(0, arg4);
                this.field949[Integer.MAX_VALUE & arg1].method86(arg0, (byte) 82, arg2);
            }
            this.field947 = arg1;
            this.field950 = arg2;
            this.field940 = null;
            this.field941 = arg0;
        } else if (this.field947 != 0) {
            this.field949[Integer.MAX_VALUE & this.field947].method94(0, arg4);
            if (this.field950 != arg2 || this.field941 != arg0) {
                this.field949[this.field947 & Integer.MAX_VALUE].method86(arg0, (byte) 82, arg2);
                this.field941 = arg0;
                this.field950 = arg2;
            }
        }
        if (arg5 >= -107) {
            this.field940 = null;
        }
    }

    @OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(Luca;)V")
    public class58(class287 arg0) {
        this.field946 = arg0;
        this.field939 = new class170(arg0);
        this.field949 = new class398[10];
        this.field949[1] = new class657(arg0);
        this.field949[2] = new class546(arg0, this.field939);
        this.field949[4] = new class443(arg0, this.field939);
        this.field949[5] = new class502(arg0, this.field939);
        this.field949[6] = new class13(arg0);
        this.field949[7] = new class304(arg0);
        this.field949[3] = this.field943 = new class160(arg0);
        this.field949[8] = new class280(arg0, this.field939);
        this.field949[9] = new class356(arg0, this.field939);
        if (!this.field949[8].method87(3)) {
            this.field949[8] = this.field949[4];
        }
        if (!this.field949[9].method87(3)) {
            this.field949[9] = this.field949[8];
        }
    }
}
