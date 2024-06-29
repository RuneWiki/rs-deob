import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class71 extends class288 {

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "I")
    private int field977;

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "I")
    public static int field973 = 0;

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "Z")
    public static boolean field976 = false;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "J")
    public static long field972 = 0L;

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "I")
    public static int field979 = 0;

    @OriginalMember(owner = "client!ij", name = "N", descriptor = "I")
    public static int field981 = 0;

    @OriginalMember(owner = "client!ij", name = "G", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        ++field975;
        int[] var3 = super.field4609.method579((byte) -62, arg1);
        if (super.field4609.field1059) {
            class56.method430(var3, 0, class186.field2986, this.field977);
        }
        if (arg0 != 0) {
            field972 = 8L;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)Lwb;")
    public static final class138 method553(int arg0, int arg1, int arg2) {
        class99 var3 = class273.field4415[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            for (int var4 = 0; var4 < var3.field1503; ++var4) {
                class138 var5 = var3.field1496[var4];
                if ((var5.field2275 >> 29 & 3L) == 2L && var5.field2272 == arg1 && var5.field2284 == arg2) {
                    class177.method1227(var5);
                    return var5;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        if (~arg2 == -1) {
            this.field977 = (arg0.method1779(-78) << 12) / 255;
        }
        if (arg1 == -19) {
            ++field974;
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
    public class71() {
        this(4096);
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(I)V")
    public class71(int arg0) {
        super(0, true);
        this.field977 = 4096;
        this.field977 = arg0;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BLjj;)I")
    public static final int method554(byte arg0, class134 arg1) {
        if (arg0 >= -51) {
            method553(-37, -24, 58);
        }
        ++field978;
        int var2 = 0;
        if (arg1.method935((byte) 31, class111.field1911)) {
            ++var2;
        }
        if (arg1.method935((byte) 31, client.field3619)) {
            ++var2;
        }
        return var2;
    }
}
