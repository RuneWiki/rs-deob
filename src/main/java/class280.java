import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class280 extends class45 {

    @OriginalMember(owner = "client!rm", name = "L", descriptor = "I")
    private int field4016 = 4096;

    @OriginalMember(owner = "client!rm", name = "J", descriptor = "Lpi;")
    public static class342 field4014 = new class342(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!rm", name = "M", descriptor = "I")
    public static int field4017 = -1;

    @OriginalMember(owner = "client!rm", name = "H", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!rm", name = "I", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!rm", name = "K", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!rm", name = "N", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "(B)V", line = 11)
    public static void method1793(byte arg0) {
        if (arg0 != -79) {
            method1794((Throwable) null, (String) null);
        }
        field4014 = null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lun;", line = 21)
    public static final class289 method1794(Throwable arg0, String arg1) {
        ++field4013;
        class289 var2;
        if (arg0 instanceof class289) {
            var2 = (class289) arg0;
            var2.field4115 = var2.field4115 + ' ' + arg1;
        } else {
            var2 = new class289(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V", line = 40)
    public class280() {
        super(1, true);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lcu;II)V", line = 43)
    public final void method37(class145 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field4016 = arg0.method1069((byte) -24);
        }
        if (arg1 != -26471) {
            field4017 = 32;
        }
        ++field4015;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)[I", line = 64)
    public final int[] method35(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method37((class145) null, -63, 19);
        }
        ++field4012;
        int[] var3 = super.field854.method863((byte) 12, arg1);
        if (super.field854.field1928) {
            int[] var4 = this.method434(0, arg1 + -1 & class506.field7463, 125);
            int[] var5 = this.method434(0, arg1, 123);
            int[] var6 = this.method434(0, class506.field7463 & arg1 - -1, 127);
            for (int var7 = 0; ~class259.field3768 < ~var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field4016;
                int var9 = (var5[var7 + 1 & class290.field4128] - var5[class290.field4128 & var7 - 1]) * this.field4016;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 - -var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 != 0 ? 16777216 / var14 : 0;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }
}
