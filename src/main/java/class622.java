import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class622 {

    @OriginalMember(owner = "client!bo", name = "t", descriptor = "B")
    public byte field8983 = 0;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "S")
    public short field8966;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "S")
    public short field8968;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "B")
    public byte field8969;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "B")
    public byte field8970;

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "Lcba;")
    public static class471 field8978 = new class471(62, -2);

    @OriginalMember(owner = "client!bo", name = "A", descriptor = "[F")
    public static float[] field8990 = new float[16384];

    @OriginalMember(owner = "client!bo", name = "y", descriptor = "[F")
    public static float[] field8988 = new float[16384];

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "B")
    public byte field8971;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "B")
    public byte field8972;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "B")
    public byte field8976;

    @OriginalMember(owner = "client!bo", name = "x", descriptor = "B")
    public byte field8987;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
    public static int field8965;

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "I")
    public static int field8980;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "Lfq;")
    public class171 field8974;

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "Lfa;")
    public class197 field8979;

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "Lfba;")
    public class23 field8977;

    @OriginalMember(owner = "client!bo", name = "r", descriptor = "Lfba;")
    public class23 field8981;

    @OriginalMember(owner = "client!bo", name = "w", descriptor = "Lhp;")
    public class274 field8986;

    @OriginalMember(owner = "client!bo", name = "s", descriptor = "Lwe;")
    public class344 field8982;

    @OriginalMember(owner = "client!bo", name = "v", descriptor = "Lwe;")
    public class344 field8985;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "Lpl;")
    public class559 field8973;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "Lbo;")
    public class622 field8967;

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "S")
    public short field8989;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "Z")
    public boolean field8964;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "Z")
    public boolean field8975;

    @OriginalMember(owner = "client!bo", name = "u", descriptor = "Z")
    public boolean field8984;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
    public final void method3630(int arg0) {
        while (this.field8973 != null) {
            class559 var2 = this.field8973.field7736;
            this.field8973.method3184(arg0 ^ 0xFFFFC7CC);
            this.field8973 = var2;
        }
        field8965++;
        this.field8983 = 0;
        if (arg0 != 14791) {
            this.method3630(-105);
        }
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(III)V")
    public class622(int arg0, int arg1, int arg2) {
        this.field8966 = (short) arg1;
        this.field8968 = (short) arg2;
        this.field8970 = this.field8969 = (byte) arg0;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V")
    public static void method3631(int arg0) {
        field8978 = null;
        field8990 = null;
        field8988 = null;
        if (arg0 != 0) {
            field8978 = null;
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field8988[var2] = (float) Math.sin((double) var2 * var0);
            field8990[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
