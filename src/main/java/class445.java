import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class445 {

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field6150 = -1;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field6159 = 0;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public int field6149;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field6151;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public int field6152;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public int field6153;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public int field6157;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field6158;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "Ljava/lang/String;")
    public static String field6154;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V", line = 9)
    public static void method2638(int arg0) {
        field6154 = null;
        if (arg0 != 0) {
            field6159 = -7;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/awt/Canvas;IILd;B)Lha;", line = 22)
    public static final class475 method2639(Canvas arg0, int arg1, int arg2, class103 arg3, byte arg4) {
        field6156++;
        if (arg4 < 96) {
            method2639(null, -30, 1, null, (byte) 92);
        }
        return new class53(arg0, arg3, arg2, arg1);
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V", line = 34)
    public static final void method2640(int arg0) {
        for (int var1 = 0; var1 < class657.field9270; var1++) {
            int var2 = class350.field4963[var1];
            class647 var3 = (class647) class486.field6697.method4253((long) var2, -1);
            if (var3 != null) {
                class506 var4 = var3.field9191;
                class619.method3549(var4, -119, var4.field6964.field2737);
            }
        }
        if (arg0 != -1) {
            field6159 = 82;
        }
        field6158++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljda;ILjda;)V", line = 65)
    public static final void method2641(class91 arg0, int arg1, class91 arg2) {
        if (arg1 != 0) {
            field6154 = null;
        }
        field6151++;
        if (arg0.field1311 != null) {
            arg0.method781(arg1 + 5555);
        }
        arg0.field1313 = arg2;
        arg0.field1311 = arg2.field1311;
        arg0.field1311.field1313 = arg0;
        arg0.field1313.field1311 = arg0;
    }
}
