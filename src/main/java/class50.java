import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class50 {

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field720 = 0;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "Lja;")
    public static class143 field715 = new class143(16);

    @OriginalMember(owner = "client!m", name = "i", descriptor = "Lph;")
    public static class229 field723 = class266.method1858("Verbindung mit Update)2Server)3)3)3", 0);

    @OriginalMember(owner = "client!m", name = "j", descriptor = "Lph;")
    public static class229 field724 = class266.method1858("<col=ff0000>", 0);

    @OriginalMember(owner = "client!m", name = "h", descriptor = "Lph;")
    public static class229 field722 = class266.method1858("Fermer", 0);

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V", line = 37)
    public static final void method352(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class15.field185[var1] = false;
        }
        class24.field305 = -1;
        field721++;
        class265.field4470 = -1;
        class217.field3565 = 1;
        if (arg0 != -10) {
            method354(-98, -54);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 85)
    public static void method353(int arg0) {
        field722 = null;
        if (arg0 == 16) {
            field723 = null;
            field715 = null;
            field724 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)Lph;", line = 145)
    public static final class229 method354(int arg0, int arg1) {
        if (arg0 == 0) {
            field719++;
            return class88.method654(0, 10, false, arg1);
        } else {
            return (class229) null;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V", line = 270)
    public static final void method355(int arg0) {
        if (arg0 >= -107) {
            return;
        }
        for (int var1 = 0; var1 < class313.field5278; var1++) {
            int var2 = class105.field1782[var1];
            class209 var3 = class114.field1931[var2];
            int var4 = class88.field1497.method1178(8);
            if ((var4 & 0x20) != 0) {
                var4 += class88.field1497.method1178(8) << 8;
            }
            class165.method1213(var3, 2, var2, var4);
        }
        field717++;
    }
}
