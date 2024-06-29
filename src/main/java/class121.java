import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class121 extends class213 {

    @OriginalMember(owner = "client!wn", name = "D", descriptor = "Lu;")
    public class35 field1585;

    @OriginalMember(owner = "client!wn", name = "B", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1583 = new CRC32();

    @OriginalMember(owner = "client!wn", name = "N", descriptor = "I")
    public static int field1594 = 0;

    @OriginalMember(owner = "client!wn", name = "L", descriptor = "Ljava/lang/String;")
    public static String field1592 = "Loading sprites - ";

    @OriginalMember(owner = "client!wn", name = "y", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!wn", name = "z", descriptor = "I")
    public int field1581;

    @OriginalMember(owner = "client!wn", name = "A", descriptor = "I")
    public int field1582;

    @OriginalMember(owner = "client!wn", name = "C", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!wn", name = "F", descriptor = "I")
    public int field1586;

    @OriginalMember(owner = "client!wn", name = "G", descriptor = "I")
    public int field1587;

    @OriginalMember(owner = "client!wn", name = "H", descriptor = "I")
    public int field1588;

    @OriginalMember(owner = "client!wn", name = "I", descriptor = "I")
    public int field1589;

    @OriginalMember(owner = "client!wn", name = "J", descriptor = "I")
    public int field1590;

    @OriginalMember(owner = "client!wn", name = "K", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!wn", name = "M", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!wn", name = "O", descriptor = "I")
    public int field1595;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "(I)V", line = 9)
    public static void method873(int arg0) {
        field1592 = null;
        if (arg0 != 0) {
            field1592 = (String) null;
        }
        field1583 = null;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)V", line = 25)
    public static final void method874(int arg0, int arg1, int arg2) {
        class42 var3 = class166.method1242(arg0, arg1, -1249071392);
        var3.method307((byte) -121);
        var3.field523 = arg2;
        field1591++;
    }

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "(B)V", line = 42)
    public static final void method875(byte arg0) {
        field1593++;
        for (int var1 = -1; var1 < class112.field1441; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class288.field4157[var1];
            }
            class239 var3 = class311.field4574[var2];
            if (var3 != null && var3.field4918 > 0) {
                var3.field4918--;
                if (var3.field4918 == 0) {
                    var3.field4864 = null;
                }
            }
        }
        if (arg0 != 127) {
            return;
        }
        for (int var4 = 0; var4 < class257.field3747; var4++) {
            int var5 = class305.field4455[var4];
            class169 var6 = class251.field3688[var5];
            if (var6 != null && var6.field4918 > 0) {
                var6.field4918--;
                if (var6.field4918 == 0) {
                    var6.field4864 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIILvc;JZ)V", line = 109)
    public static final void method876(int arg0, int arg1, int arg2, int arg3, class260 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class24 var8 = new class24();
        var8.field269 = arg4;
        var8.field272 = arg1 * 128 + 64;
        var8.field271 = arg2 * 128 + 64;
        var8.field273 = arg3;
        var8.field267 = arg5;
        var8.field275 = arg6;
        if (class345.field5367[arg0][arg1][arg2] == null) {
            class345.field5367[arg0][arg1][arg2] = new class119(arg0, arg1, arg2);
        }
        class345.field5367[arg0][arg1][arg2].field1577 = var8;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIII)V", line = 129)
    public final void method877(int arg0, int arg1, int arg2, int arg3) {
        this.field1589 = arg1;
        if (arg0 == -30263) {
            this.field1581 = arg3;
            field1580++;
            this.field1582 = arg2;
        }
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lu;Lne;)V", line = 144)
    public class121(class35 arg0, class187 arg1) {
        this.field1585 = arg0;
    }
}
