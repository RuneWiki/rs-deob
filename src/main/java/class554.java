import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class554 extends class454 {

    @OriginalMember(owner = "client!m", name = "T", descriptor = "Z")
    public boolean field7698;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "I")
    public int field7697;

    @OriginalMember(owner = "client!m", name = "C", descriptor = "I")
    public int field7682;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "Ljava/lang/String;")
    public String field7690;

    @OriginalMember(owner = "client!m", name = "G", descriptor = "Z")
    public boolean field7686;

    @OriginalMember(owner = "client!m", name = "L", descriptor = "I")
    public int field7691;

    @OriginalMember(owner = "client!m", name = "O", descriptor = "Ljava/lang/String;")
    public String field7694;

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "I")
    public int field7696;

    @OriginalMember(owner = "client!m", name = "A", descriptor = "J")
    public long field7680;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "J")
    public long field7693;

    @OriginalMember(owner = "client!m", name = "P", descriptor = "Z")
    public boolean field7695;

    @OriginalMember(owner = "client!m", name = "D", descriptor = "I")
    public int field7683;

    @OriginalMember(owner = "client!m", name = "E", descriptor = "Laq;")
    public static class494 field7684 = new class494(4);

    @OriginalMember(owner = "client!m", name = "I", descriptor = "[I")
    public static int[] field7688 = new int[500];

    @OriginalMember(owner = "client!m", name = "B", descriptor = "I")
    public static int field7681;

    @OriginalMember(owner = "client!m", name = "F", descriptor = "I")
    public static int field7685;

    @OriginalMember(owner = "client!m", name = "H", descriptor = "I")
    public static int field7687;

    @OriginalMember(owner = "client!m", name = "M", descriptor = "I")
    public static int field7692;

    @OriginalMember(owner = "client!m", name = "J", descriptor = "Ljava/lang/String;")
    public String field7689;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 6)
    public static void method3195(int arg0) {
        if (arg0 != 35) {
            method3195(-2);
        }
        field7684 = null;
        field7688 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lth;II)Z", line = 18)
    public static final boolean method3196(class131 arg0, int arg1, int arg2) {
        class705.field9884.method1571(arg0.field2212[arg1], arg0.field2208[arg1], arg0.field2211[arg1], class426.field5916);
        field7681++;
        int var3 = class426.field5916[2];
        if (var3 < 50) {
            return false;
        } else {
            arg0.field2206[arg1] = (short) (class426.field5916[arg2] * class227.field3309 / var3 + class297.field4319);
            arg0.field2217[arg1] = (short) (class426.field5916[1] * class406.field5589 / var3 + class209.field3068);
            arg0.field2215[arg1] = (short) var3;
            return true;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II)V", line = 35)
    public static final void method3197(int arg0, int arg1) {
        class347.field4939 = arg1;
        class591.field8484 = 2;
        field7685++;
        long var2 = 0L;
        if (arg0 > -92) {
            return;
        }
        if (class692.field9757 == null) {
            class330.method2010(23708, 35);
        } else {
            class431 var4 = new class431(class563.method3280(class611.method3536(class692.field9757, (byte) -30), 64));
            long var5 = var4.method2567((byte) -128);
            class507.field6971 = var4.method2567((byte) -127);
            class563.method3279(true, class549.method3176(false, var5), "", -6864);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 75)
    public static final String method3198(String arg0, int arg1) {
        field7692++;
        String var2 = null;
        int var3 = arg0.indexOf("--> ");
        if (arg1 <= var3) {
            var2 = arg0.substring(0, var3 + 4);
            arg0 = arg0.substring(var3 + 4);
        }
        if (arg0.startsWith("directlogin ")) {
            int var4 = arg0.indexOf(" ", "directlogin ".length());
            if (var4 >= 0) {
                int var5 = arg0.length();
                arg0 = arg0.substring(0, var4) + " ";
                for (int var6 = var4 + 1; var6 < var5; var6++) {
                    arg0 = arg0 + "*";
                }
            }
        }
        return var2 == null ? arg0 : var2 + arg0;
    }

    @OriginalMember(owner = "client!m", name = "h", descriptor = "(I)V", line = 119)
    public static final void method3199(int arg0) {
        class424.field5898 = arg0;
        field7687++;
        class86.field1280 = (int) ((double) class192.field2891 * 34.46D);
        class86.field1280 <<= 0x2;
        if (class686.field9702.method477()) {
            class86.field1280 += 512;
        }
        class259.method1688((byte) 7, false);
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V", line = 144)
    public class554(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
        this.field7698 = arg11;
        this.field7697 = arg6;
        this.field7682 = arg3;
        this.field7690 = arg1;
        this.field7686 = arg9;
        this.field7691 = arg7;
        this.field7694 = arg0;
        this.field7696 = arg2;
        this.field7680 = arg10;
        this.field7693 = arg5;
        this.field7695 = arg8;
        this.field7683 = arg4;
    }
}
