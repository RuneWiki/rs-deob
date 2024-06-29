import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class64 extends class35 {

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field873 = 0;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "Z")
    public static boolean field885 = false;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public static int field882 = -1;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "Z")
    public static boolean field879 = true;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "I")
    public static int field891 = 0;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public int field872;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public int field874;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public int field875;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public int field876;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    public int field877;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public int field878;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    public int field880;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public int field881;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "I")
    public int field883;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public int field884;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "I")
    public int field886;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "I")
    public int field887;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "I")
    public int field888;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "I")
    public int field889;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "I")
    public int field892;

    // $FF: synthetic field
    @OriginalMember(owner = "client!w", name = "H", descriptor = "Ljava/lang/Class;")
    public static Class field893;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ltq;IZ)Lns;")
    public final class57 method593(class63 arg0, int arg1, boolean arg2) {
        field890++;
        if (!arg2) {
            this.method593((class63) null, -102, true);
        }
        int var4 = class352.field5363[this.field884];
        if (var4 == 0) {
            class100 var5 = class147.method1006(this.field888, this.field886, this.field876);
            if (var5 instanceof class463) {
                class463 var6 = (class463) var5;
                if (var6.field6534 != null) {
                    return ((class218) var6.field6534).method255((byte) 127, arg1, arg0);
                }
            }
        } else if (var4 == 1) {
            class287 var7 = class115.method826(this.field888, this.field886, this.field876);
            if (var7 instanceof class282) {
                class282 var8 = (class282) var7;
                if (var8.field4259 != null) {
                    return ((class218) var8.field4259).method255((byte) 116, arg1, arg0);
                }
            }
        } else if (var4 == 2) {
            class305 var11 = class390.method2350(this.field888, this.field886, this.field876, field893 == null ? (field893 = method594("ki")) : field893);
            if (var11 instanceof class307) {
                class307 var12 = (class307) var11;
                if (var12.field4584 != null) {
                    return ((class218) var12.field4584).method255((byte) 123, arg1, arg0);
                }
            }
        } else if (var4 == 3) {
            class47 var9 = class487.method2848(this.field888, this.field886, this.field876);
            if (var9 instanceof class109) {
                class109 var10 = (class109) var9;
                if (var10.field1527 != null) {
                    return ((class218) var10.field1527).method255((byte) 127, arg1, arg0);
                }
            }
        }
        return null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method594(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
