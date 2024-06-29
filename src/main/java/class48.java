import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class48 {

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "I")
    public int field722 = -1;

    @OriginalMember(owner = "client!jea", name = "d", descriptor = "I")
    public int field725 = -1;

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!jea", name = "f", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!jea", name = "h", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!jea", name = "e", descriptor = "J")
    public static long field726;

    @OriginalMember(owner = "client!jea", name = "g", descriptor = "[I")
    public int[] field728;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)V")
    public static final void method348(int arg0) throws IOException {
        field729++;
        if (class713.field9960 != null && class721.field10031 > 0) {
            class316.field4380.field956 = 0;
            while (true) {
                class583 var1 = (class583) class365.field5189.method3618(-113);
                if (var1 == null || (class316.field4380.field954.length - class316.field4380.field956) < var1.field7961) {
                    class713.field9960.method2221(class316.field4380.field956, 0, (byte) -1, class316.field4380.field954);
                    class221.field2992 = 0;
                    class676.field9380 += class316.field4380.field956;
                    break;
                }
                class316.field4380.method497(var1.field7963.field954, var1.field7961, 0, -1);
                class721.field10031 -= var1.field7961;
                var1.method549(arg0 + 26571);
                var1.field7963.method447(-100);
                var1.method3382(1);
            }
        }
        if (arg0 != -20161) {
            field727 = 1;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IILdc;)V")
    private final void method349(int arg0, int arg1, class63 arg2) {
        if (arg0 != 3) {
            this.method351(-64, null);
        }
        if (arg1 == 1) {
            this.field725 = arg2.method482(-772591672);
        } else if (arg1 == 2) {
            this.field728 = new int[arg2.method505((byte) -119)];
            for (int var4 = 0; var4 < this.field728.length; var4++) {
                this.field728[var4] = arg2.method482(-772591672);
            }
        } else if (arg1 == 3) {
            this.field722 = arg2.method505((byte) -119);
        }
        field723++;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "([Luq;II)V")
    public static final void method350(class318[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class318 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field4409;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field4409 > (var7 & 0x1) + var6) {
                class318 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method350(arg0, arg1, var4 - 1);
        method350(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(ILdc;)V")
    public final void method351(int arg0, class63 arg1) {
        field724++;
        while (true) {
            int var3 = arg1.method505((byte) -119);
            if (var3 == 0) {
                if (arg0 > -36) {
                    this.method351(32, null);
                    return;
                } else {
                    return;
                }
            }
            this.method349(3, var3, arg1);
        }
    }
}
