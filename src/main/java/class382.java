import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class382 {

    @OriginalMember(owner = "client!or", name = "d", descriptor = "I")
    public int field5603;

    @OriginalMember(owner = "client!or", name = "b", descriptor = "I")
    public int field5601;

    @OriginalMember(owner = "client!or", name = "h", descriptor = "Lor;")
    public class382 field5607;

    @OriginalMember(owner = "client!or", name = "i", descriptor = "Lvr;")
    public class71 field5608;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "Ljf;")
    public static class119 field5600 = null;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "I")
    public static int field5605 = -1;

    @OriginalMember(owner = "client!or", name = "j", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field5609 = new CRC32();

    @OriginalMember(owner = "client!or", name = "l", descriptor = "I")
    public static int field5611 = -1;

    @OriginalMember(owner = "client!or", name = "m", descriptor = "I")
    public static int field5612 = 0;

    @OriginalMember(owner = "client!or", name = "o", descriptor = "[I")
    public static int[] field5614 = new int[50];

    @OriginalMember(owner = "client!or", name = "c", descriptor = "I")
    public int field5602;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "I")
    public int field5604;

    @OriginalMember(owner = "client!or", name = "g", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!or", name = "k", descriptor = "I")
    public int field5610;

    @OriginalMember(owner = "client!or", name = "n", descriptor = "Lkh;")
    public static class11 field5613;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V", line = 5)
    public static void method2453(int arg0) {
        field5609 = null;
        field5614 = null;
        if (arg0 >= 103) {
            field5613 = null;
            field5600 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 31)
    public static final void method2454(int arg0, int arg1, int arg2, Class arg3) {
        class302 var4 = class19.field202[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class299 var5 = var4.field4308; var5 != null; var5 = var5.field4263) {
            class113 var6 = var5.field4261;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field1316 == arg1 && var6.field1305 == arg2) {
                class211.method1343(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(II)V", line = 63)
    public class382(int arg0, int arg1) {
        this.field5603 = arg0;
        this.field5601 = arg1;
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lor;I)V", line = 71)
    public class382(class382 arg0, int arg1) {
        this.field5607 = arg0;
        this.field5608 = this.field5607.field5608;
        this.field5603 = this.field5607.field5603;
        this.field5601 = this.field5607.field5601 + arg1;
    }
}
