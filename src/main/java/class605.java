import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class605 {

    @OriginalMember(owner = "client!raa", name = "f", descriptor = "[I")
    public static int[] field8612 = new int[4096];

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "Ldh;")
    public static class320 field8610 = new class320(99, -2);

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "I")
    public static int field8607;

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "I")
    public static int field8608;

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "I")
    public static int field8609;

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "I")
    public static int field8611;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)V")
    public static final void method3435(byte arg0) {
        if (class167.field1857 != null) {
            class167.field1857.method110((byte) 79);
        }
        field8608++;
        if (arg0 >= 120 && class637.field9160 != null) {
            class637.field9160.method110((byte) 79);
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)V")
    public static void method3436(int arg0) {
        field8610 = null;
        field8612 = null;
        int var1 = 95 % ((arg0 - 6) / 57);
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(I[B)V")
    public static final synchronized void method3437(int arg0, byte[] arg1) {
        field8609++;
        if (arg1.length == 100 && class661.field9436 < 1000) {
            class236.field2811[class661.field9436++] = arg1;
        } else if (arg0 == -251) {
            if (arg1.length == 5000 && class96.field1012 < 250) {
                class471.field6739[class96.field1012++] = arg1;
            } else if (arg1.length == 30000 && class661.field9433 < 50) {
                class111.field1170[class661.field9433++] = arg1;
            } else if (class413.field5626 != null) {
                for (int var2 = 0; var2 < class448.field6473.length; var2++) {
                    if (class448.field6473[var2] == arg1.length && class293.field3608[var2] < class413.field5626[var2].length) {
                        class413.field5626[var2][class293.field3608[var2]++] = arg1;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method3438(int arg0, int arg1) {
        field8611++;
        if (arg1 != 26242) {
            field8610 = null;
        }
        if (arg0 == 100 && class661.field9436 > 0) {
            byte[] var2 = class236.field2811[--class661.field9436];
            class236.field2811[class661.field9436] = null;
            return var2;
        } else if (arg0 == 5000 && class96.field1012 > 0) {
            byte[] var3 = class471.field6739[--class96.field1012];
            class471.field6739[class96.field1012] = null;
            return var3;
        } else if (arg0 == 30000 && class661.field9433 > 0) {
            byte[] var4 = class111.field1170[--class661.field9433];
            class111.field1170[class661.field9433] = null;
            return var4;
        } else {
            if (class413.field5626 != null) {
                for (int var5 = 0; var5 < class448.field6473.length; var5++) {
                    if (class448.field6473[var5] == arg0 && class293.field3608[var5] > 0) {
                        byte[] var6 = class413.field5626[var5][--class293.field3608[var5]];
                        class413.field5626[var5][class293.field3608[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg0];
        }
    }
}
