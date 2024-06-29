import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class43 extends class130 {

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
    public int field680;

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "I")
    public int field679;

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!mn", name = "p", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!mn", name = "q", descriptor = "Ljf;")
    public static class21 field685;

    @OriginalMember(owner = "client!mn", name = "o", descriptor = "[S")
    public static short[] field683;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lbc;III)V", line = 4)
    public static final void method281(class512 arg0, int arg1, int arg2, int arg3) {
        long var4 = class424.field6221[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field7487 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var8 <= 0) {
                break;
            }
            arg0.field7484[arg0.field7487++] = class356.field5270[var8 - 1].field2775;
            var6 += 16L;
        }
        for (int var9 = arg0.field7487; var9 < 4; var9++) {
            arg0.field7484[var9] = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V", line = 33)
    public static final void method282(int arg0) {
        class308.field4705.method1433(15954);
        field682++;
        for (int var1 = 0; var1 < 32; var1++) {
            class263.field4179[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class517.field7517[var2] = 0L;
        }
        class272.field4288 = arg0;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)V", line = 57)
    public static final void method283(int arg0, int arg1) {
        if (arg1 == 22039) {
            field681++;
            class188 var2 = class10.method48((byte) 53, 12, arg0);
            var2.method1306(-23128);
        }
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(II)V", line = 73)
    public class43(int arg0, int arg1) {
        this.field680 = arg1;
        this.field679 = arg0;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V", line = 82)
    public static final void method284(boolean arg0) {
        field684++;
        class4.field60 = new class376(class27.field302.method1265(class345.field5141, -73), "", class282.field4402, 1011, -1, 0L, 0, 0, arg0, false);
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V", line = 91)
    public static void method285(int arg0) {
        if (arg0 != 23356) {
            method285(-64);
        }
        field683 = null;
        field685 = null;
    }
}
