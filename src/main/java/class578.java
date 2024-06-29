import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class578 {

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "B")
    public byte field7979;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
    public int field7988;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public int field7976;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
    public int field7989;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public int field7984;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public int field7981;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "F")
    public static float field7982;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field7977;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field7985;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    public static int field7986;

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
    public static int field7990;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "Lfe;")
    public static class294 field7980;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "Lhl;")
    public class491 field7978;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "Lva;")
    public class513 field7975;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "Lmda;")
    public class53 field7987;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "Ltq;")
    public class586 field7983;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
    public static void method3250(byte arg0) {
        field7980 = null;
        int var1 = -66 % ((-arg0 - 76) / 43);
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)V")
    public static final void method3251(byte arg0) {
        if (arg0 >= 68) {
            for (int var1 = 0; var1 < 100; var1++) {
                class200.field2630[var1] = true;
            }
            field7985++;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIZI)V")
    public static final void method3252(int arg0, int arg1, boolean arg2, int arg3) {
        field7990++;
        class208 var4 = class390.field5608[arg3][arg1];
        class433.method2493(var4 == null ? class237.field3084 : var4, (byte) 63, arg0);
        if (!arg2) {
            field7982 = 0.4075346F;
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)Z")
    public final boolean method3253(byte arg0) {
        if (arg0 > -91) {
            method3251((byte) 105);
        }
        field7986++;
        return this.field7979 == 2 || this.field7979 == 3;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V")
    public static final void method3254(boolean arg0) {
        field7977++;
        class419.field5833 = null;
        if (arg0) {
            class251.field3389 = -1;
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(BIIIII)V")
    public class578(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7979 = arg0;
        this.field7988 = arg2;
        this.field7976 = arg1;
        this.field7989 = arg5;
        this.field7984 = arg4;
        this.field7981 = arg3;
    }
}
