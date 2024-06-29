import java.awt.Canvas;
import java.awt.event.FocusListener;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class264 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!de", name = "a", descriptor = "[[I")
    public static int[][] field4395 = new int[5][5000];

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static volatile int field4397 = 0;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field4403 = 0;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "Lbd;")
    public static class162 field4404 = class17.method142(0, "runes");

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "Lja;")
    public static class206 field4406;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Lib;")
    public static class28 field4400;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "[I")
    public static int[] field4407;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 33)
    public static final void method1810(int arg0) {
        class82.field1435 = 0;
        class313.field5286 = null;
        field4402++;
        int var1 = 57 / ((arg0 - 29) / 44);
        class70.field1112 = 0;
        class180.field3086 = 0;
        class305.field5144 = 0;
        class87.field1552 = 0;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V", line = 97)
    public static void method1811(int arg0) {
        field4404 = null;
        if (arg0 == 0) {
            field4400 = null;
            field4407 = null;
            field4395 = (int[][]) null;
            field4406 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILb;)V", line = 118)
    public static final void method1812(int arg0, class94 arg1) {
        if (arg0 > -14) {
            return;
        }
        byte[] var2 = new byte[24];
        field4401++;
        if (class224.field3748 != null) {
            try {
                int var3 = 0;
                class224.field3748.method1775((byte) 46, 0L);
                class224.field3748.method1788(0, var2);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg1.method720(24, var2, 0, -7);
    }
}
