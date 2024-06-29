import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class300 extends class261 {

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "Lve;")
    public static class255 field5101 = class87.method607(30, "(Y<)4col>");

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "Lve;")
    public static class255 field5105 = class113.method863(true, 160);

    @OriginalMember(owner = "client!ak", name = "R", descriptor = "I")
    public static int field5111 = 0;

    @OriginalMember(owner = "client!ak", name = "Q", descriptor = "Ltl;")
    public static class197 field5110 = null;

    @OriginalMember(owner = "client!ak", name = "P", descriptor = "[Ldg;")
    public static class307[] field5109 = new class307[27];

    @OriginalMember(owner = "client!ak", name = "O", descriptor = "Lwl;")
    public static class81 field5108 = new class81(30);

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
    private int field5100;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "I")
    private int field5103;

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!ak", name = "M", descriptor = "I")
    private int field5106;

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lpb;BI)V", line = 4)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        field5107++;
        if (arg1 > -115) {
            this.field5106 = -76;
        }
        if (arg2 == 0) {
            this.method2096(arg0.method465(true), -53357148);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZI)[[I", line = 35)
    public final int[][] method13(boolean arg0, int arg1) {
        if (!arg0) {
            this.method13(false, 97);
        }
        field5102++;
        int[][] var3 = this.field4418.method35(arg1, 87);
        if (this.field4418.field94) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class92.field1576; var7++) {
                var5[var7] = this.field5103;
                var4[var7] = this.field5100;
                var6[var7] = this.field5106;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V", line = 83)
    public static void method2095(int arg0) {
        field5108 = null;
        field5105 = null;
        if (arg0 > -24) {
            method2095(93);
        }
        field5109 = null;
        field5101 = null;
        field5110 = null;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V", line = 96)
    public class300() {
        this(0);
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(I)V", line = 100)
    private class300(int arg0) {
        super(0, false);
        this.method2096(arg0, -53357148);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)V", line = 110)
    private final void method2096(int arg0, int arg1) {
        this.field5106 = arg0 & 0xFF << 4;
        this.field5100 = arg0 >> 4 & 0xFF0;
        if (arg1 != -53357148) {
            this.method13(false, 53);
        }
        this.field5103 = arg0 >> 12 & 0xFF0;
        field5104++;
    }
}
