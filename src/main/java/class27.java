import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class27 {

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "I")
    public int field377;

    @OriginalMember(owner = "client!qaa", name = "g", descriptor = "I")
    private int field383;

    @OriginalMember(owner = "client!qaa", name = "h", descriptor = "[I")
    public static int[] field384 = new int[32];

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!qaa", name = "e", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!qaa", name = "f", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!qaa", name = "i", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!qaa", name = "j", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!qaa", name = "d", descriptor = "[Laf;")
    public static class433[] field380;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)I")
    public final int method195(int arg0) {
        field382++;
        if (arg0 != 0) {
            field380 = null;
        }
        return this.field383;
    }

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "(I)V")
    public static final void method196(int arg0) {
        for (class241 var1 = (class241) class211.field3046.method1196(-125); var1 != null; var1 = (class241) class211.field3046.method1204(false)) {
            if (var1.field3382 > 1) {
                var1.field3382 = 0;
                class143.field2191.method3047(false, var1, ((class66) var1.field3388.field2357.field3201).field1193);
                var1.field3388.method1199(false);
            }
        }
        field378++;
        class173.field2513 = 0;
        if (arg0 != 31939) {
            method199(-12, (byte) -80);
        }
        class409.field5682 = 0;
        class288.field4066.method1530((byte) 91);
        class580.field8189.method4204((byte) -92);
        class211.field3046.method1199(false);
        class34.field450 = false;
    }

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "(I)V")
    public static final void method197(int arg0) {
        class255.field3697 = 0;
        class510.field7279 = -1;
        if (arg0 != -28655) {
            method199(-88, (byte) 105);
        }
        field379++;
        class318.field4513 = -1;
        class334.field4722 = -1;
    }

    @OriginalMember(owner = "client!qaa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field385++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(B)V")
    public static void method198(byte arg0) {
        if (arg0 <= 34) {
            method196(8);
        }
        field380 = null;
        field384 = null;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IB)C")
    public static final char method199(int arg0, byte arg1) {
        if (arg0 != 16) {
            return '3';
        }
        field386++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class740.field10391[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
    public static final void method200(byte arg0, Canvas arg1) {
        field381++;
        Dimension var2 = arg1.getSize();
        if (arg0 > -84) {
            return;
        }
        class223.method1547(var2.height, var2.width, (byte) 42);
        if (class435.field6079 == 1) {
            class154.field2309.method645(arg1, class575.field8149, class584.field8240);
        } else {
            class154.field2309.method645(arg1, class546.field7700, class198.field2843);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(II)V")
    public class27(int arg0, int arg1) {
        this.field377 = arg1;
        this.field383 = arg0;
    }
}
