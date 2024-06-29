import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class148 extends class170 {

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "Lmq;")
    public static class78 field1795 = new class78(14, 6);

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "Lsga;")
    public static class583 field1802 = new class583(8);

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "F")
    private float field1798;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "F")
    private float field1799;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
    private int field1793;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
    private int field1801;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "Ljava/lang/String;")
    private String field1788;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "Ljava/lang/String;")
    private String field1792;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "Ljava/lang/String;")
    private String field1794;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
    public static void method925(int arg0) {
        if (arg0 == 9606) {
            field1802 = null;
            field1795 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V")
    public final void method926(boolean arg0) {
        if (!arg0) {
            this.field1793 = 112;
        }
        ++field1796;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)Ljava/lang/String;")
    public final String method927(byte arg0) {
        int var2 = 53 % ((-61 - arg0) / 36);
        ++field1797;
        return this.field1794;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(Z)Ljava/lang/String;")
    public final String method928(boolean arg0) {
        if (arg0) {
            field1802 = null;
        }
        ++field1791;
        return this.field1792;
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)F")
    public final float method929(int arg0) {
        if (arg0 != -1) {
            this.method929(-74);
        }
        ++field1789;
        return this.field1799;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)F")
    public final float method930(byte arg0) {
        if (arg0 < 69) {
            field1802 = null;
        }
        ++field1800;
        return this.field1798;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(ILjagtheora/ogg/OggPacket;)V")
    public final void method931(int arg0, OggPacket arg1) {
        ++field1790;
        if (super.field2240 <= 0 || "SUB".equals(this.field1788)) {
            class179 var3 = new class179(arg1.getData());
            int var4 = var3.method1094(255);
            if (~super.field2240 >= -9) {
                if ((var4 | 128) == 0) {
                    throw new IllegalStateException();
                }
                if (~super.field2240 == -1) {
                    var3.field2354 += 23;
                    this.field1793 = var3.method1138(27980);
                    this.field1801 = var3.method1138(27980);
                    if (this.field1793 == 0 || ~this.field1801 == -1) {
                        throw new IllegalStateException();
                    }
                    class179 var12 = new class179(16);
                    var3.method1096(16, 0, var12.field2325, 12050);
                    this.field1792 = var12.method1106(-1);
                    var12.field2354 = 0;
                    var3.method1096(16, 0, var12.field2325, 12050);
                    this.field1788 = var12.method1106(-1);
                }
            } else {
                if (~var4 == -1) {
                    long var5 = var3.method1118(1418538640);
                    long var7 = var3.method1118(1418538640);
                    long var9 = var3.method1118(1418538640);
                    if (var5 < 0L || var7 < 0L || var9 < 0L || var5 < var9) {
                        throw new IllegalStateException();
                    }
                    this.field1798 = (float) ((var5 + var7) * (long) this.field1801) / (float) this.field1793;
                    this.field1799 = (float) ((long) this.field1801 * var5) / (float) this.field1793;
                    int var11 = var3.method1138(27980);
                    if (var11 < 0 || var11 > var3.field2325.length + -var3.field2354) {
                        throw new IllegalStateException();
                    }
                    this.field1794 = class3.method14(var3.field2354, var11, var3.field2325, 104);
                }
                if (~(var4 | 128) != -1) {
                    return;
                }
            }
            if (arg0 > -87) {
                this.method926(true);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class148(OggStreamState arg0) {
        super(arg0);
    }
}
