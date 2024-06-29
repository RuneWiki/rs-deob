import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class140 {

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "Luf;")
    public static class310 field1991 = new class310(64, 6);

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "Lff;")
    public static class9 field1992 = new class9(8);

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "Lfm;")
    public static class515 field1994 = new class515(1);

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
    public static int field1995 = -1;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "Lvh;")
    public static class240 field1996;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "Ljava/awt/Frame;")
    public static Frame field1993;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)Z")
    public static final boolean method906(int arg0, int arg1, int arg2) {
        int var3 = class379.field5349[arg0][arg1][arg2];
        if (-class322.field4444 == var3) {
            return false;
        } else if (class322.field4444 == var3) {
            return true;
        } else {
            int var4 = arg1 << class34.field484;
            int var5 = arg2 << class34.field484;
            if (class102.method679(var4 + 1, class383.field5391[arg0].method221(arg1, arg2), var5 + 1) && class102.method679(class234.field3248 + var4 - 1, class383.field5391[arg0].method221(arg1 + 1, arg2), var5 + 1) && class102.method679(class234.field3248 + var4 - 1, class383.field5391[arg0].method221(arg1 + 1, arg2 + 1), class234.field3248 + var5 - 1) && class102.method679(var4 + 1, class383.field5391[arg0].method221(arg1, arg2 + 1), class234.field3248 + var5 - 1) && class102.method679(class77.field1110 + var4, class383.field5391[arg0].method221(arg1, arg2), var5 + 1) && class102.method679(class234.field3248 + var4 - 1, class383.field5391[arg0].method221(arg1 + 1, arg2), class77.field1110 + var5) && class102.method679(class77.field1110 + var4, class383.field5391[arg0].method221(arg1, arg2 + 1), class234.field3248 + var5 - 1) && class102.method679(class234.field3248 + var4 - 1, class383.field5391[arg0].method221(arg1, arg2), class77.field1110 + var5) && class102.method679(class77.field1110 + var4, class383.field5391[arg0].method221(arg1, arg2), class77.field1110 + var5)) {
                class379.field5349[arg0][arg1][arg2] = class322.field4444;
                return true;
            } else {
                class379.field5349[arg0][arg1][arg2] = -class322.field4444;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lvh;Lvh;I)V")
    public static final void method907(class240 arg0, class240 arg1, int arg2) {
        field1990++;
        class507.field7457 = arg0;
        class312.field4295 = arg1;
        if (arg2 != 10303) {
            field1994 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V")
    public static void method908(byte arg0) {
        field1996 = null;
        field1991 = null;
        field1993 = null;
        field1992 = null;
        field1994 = null;
        int var1 = -25 / ((44 - arg0) / 48);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILlh;I)V")
    public static final void method909(int arg0, class365 arg1, int arg2) {
        if (class31.field454 != null) {
            try {
                class31.field454.method1650((byte) 67, 0L);
                class31.field454.method1645(24, arg1.field5073, false, arg0);
            } catch (Exception var3) {
            }
        }
        field1988++;
        if (arg2 >= -116) {
            method907(null, null, 121);
        }
    }
}
