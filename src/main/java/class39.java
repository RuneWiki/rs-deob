import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class39 extends class331 {

    @OriginalMember(owner = "client!qn", name = "F", descriptor = "Lwq;")
    public static class92 field441 = new class92();

    @OriginalMember(owner = "client!qn", name = "H", descriptor = "Lse;")
    public static class138 field443 = new class138(128);

    @OriginalMember(owner = "client!qn", name = "K", descriptor = "I")
    public static int field446 = 16777215;

    @OriginalMember(owner = "client!qn", name = "L", descriptor = "I")
    public static int field447 = 0;

    @OriginalMember(owner = "client!qn", name = "E", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!qn", name = "G", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!qn", name = "I", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!qn", name = "J", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(Z)V")
    public static final void method233(boolean arg0) {
        if (arg0) {
            field441 = null;
        }
        for (int var1 = 0; var1 < class176.field2399; var1++) {
            int var2 = class150.field1853[var1];
            class40 var3 = class26.field314[var2];
            int var4 = class359.field5120.method1574(-14);
            if ((var4 & 0x8) != 0) {
                var4 += class359.field5120.method1574(-22) << 8;
            }
            class183.method1229(15878, var4, var3, var2);
        }
        field442++;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V")
    public static final void method234(int arg0, int arg1) {
        class113.field1395 = arg1;
        class419.field5993 = arg0;
        field440++;
        class113.field1395 = -1;
        class181.method1221(0);
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(III)V")
    public static final void method235(int arg0, int arg1, int arg2) {
        class193 var3 = class250.field3570[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field2788 != null) {
            var3.field2788 = null;
        }
        if (var3.field2786 != null) {
            var3.field2786 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(Z)V")
    public static void method236(boolean arg0) {
        field443 = null;
        if (!arg0) {
            field441 = null;
        }
    }
}
