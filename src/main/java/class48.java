import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class48 {

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "[I")
    private int[] field698;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "[I")
    public static int[] field701 = new int[8];

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field702 = -1;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field703 = 0;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "Ljava/util/Random;")
    public static Random field696 = new Random();

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "J")
    public static long field700;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II[Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method313(int arg0, int arg1, String[] arg2, int arg3) {
        field697++;
        if (arg0 == 0) {
            return "";
        } else if (arg0 == arg1) {
            String var4 = arg2[arg3];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg3;
            int var6 = 0;
            for (int var7 = arg3; var7 < var5; var7++) {
                String var11 = arg2[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg3; var9 < var5; var9++) {
                String var10 = arg2[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "([I)V")
    public class48(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field698 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field698[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field698[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field698[var5 + var5] = arg0[var4];
            this.field698[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static final void method314(int arg0) {
        field695++;
        if (!class34.method231(126) && class295.field4642 != class281.field4361) {
            class142.method954(class101.field1422, class217.field3280.field4032[0], 1464, class217.field3280.field4076[0], class295.field4642, class178.field2495, false, false);
            return;
        }
        if (class295.field4642 != class155.field2161 && class29.method191(arg0 ^ 0xFFFFFF98, class295.field4642)) {
            class155.field2161 = class295.field4642;
            class101.method660(arg0 ^ 0xFFFFFF91);
        }
        if (arg0 != -1) {
            method314(30);
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
    public static void method315(int arg0) {
        if (arg0 > -13) {
            method315(59);
        }
        field701 = null;
        field696 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)I")
    public final int method316(int arg0, int arg1) {
        field699++;
        int var3 = (this.field698.length >> 1) + arg0;
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field698[var4 - (-var4 - 1)];
            if (var5 == -1) {
                return -1;
            }
            if (this.field698[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }
}
