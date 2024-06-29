import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lja")
public class class724 {

    @OriginalMember(owner = "client!lja", name = "e", descriptor = "Lcp;")
    public class271 field10091 = new class271();

    @OriginalMember(owner = "client!lja", name = "i", descriptor = "Z")
    public boolean field10095 = false;

    @OriginalMember(owner = "client!lja", name = "d", descriptor = "[I")
    public static int[] field10090 = new int[200];

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "I")
    public static int field10087;

    @OriginalMember(owner = "client!lja", name = "f", descriptor = "I")
    public static int field10092;

    @OriginalMember(owner = "client!lja", name = "g", descriptor = "I")
    public static int field10093;

    @OriginalMember(owner = "client!lja", name = "h", descriptor = "I")
    public static int field10094;

    @OriginalMember(owner = "client!lja", name = "b", descriptor = "Lgga;")
    public static class513 field10088;

    @OriginalMember(owner = "client!lja", name = "j", descriptor = "[I")
    public static int[] field10096;

    @OriginalMember(owner = "client!lja", name = "c", descriptor = "[Z")
    public static boolean[] field10089;

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(BJ)V")
    public static final void method4017(byte arg0, long arg1) {
        if (arg0 < 125) {
            method4019(-106, 12, true);
        }
        class99.field1449.setTime(new Date(arg1));
        field10087++;
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(B)V")
    public final void method4018(byte arg0) {
        int var2 = -65 / ((arg0 - 37) / 35);
        field10094++;
        while (true) {
            class162 var3 = (class162) this.field10091.method1735(-17801);
            if (var3 == null) {
                return;
            }
            var3.method781(5555);
            class432.method2588(var3, -124);
        }
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method4019(int arg0, int arg1, boolean arg2) {
        field10092++;
        if (arg2) {
            method4019(86, 14, false);
        }
        return (arg0 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(Luh;B)V")
    public final void method4020(class162 arg0, byte arg1) {
        field10093++;
        class745 var3 = arg0.field2501;
        boolean var4 = true;
        class749[] var5 = arg0.field2500;
        int var6 = 0;
        if (arg1 <= 115) {
            field10089 = null;
        }
        while (var5.length > var6) {
            if (var5[var6].field10404) {
                var4 = false;
                break;
            }
            var6++;
        }
        if (var4) {
            return;
        }
        if (this.field10095) {
            for (class162 var7 = (class162) this.field10091.method1730((byte) 41); var7 != null; var7 = (class162) this.field10091.method1729((byte) 100)) {
                if (var7.field2501 == var3) {
                    var7.method781(5555);
                    class432.method2588(var7, -127);
                }
            }
        }
        for (class162 var8 = (class162) this.field10091.method1730((byte) 63); var8 != null; var8 = (class162) this.field10091.method1729((byte) 100)) {
            if (var3.field10348 >= var8.field2501.field10348) {
                class445.method2641(arg0, 0, var8);
                return;
            }
        }
        this.field10091.method1734(arg0, 0);
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(Z)V")
    public static void method4021(boolean arg0) {
        field10096 = null;
        field10089 = null;
        field10088 = null;
        if (arg0) {
            field10090 = null;
        }
        field10090 = null;
    }

    @OriginalMember(owner = "client!lja", name = "<init>", descriptor = "(Z)V")
    public class724(boolean arg0) {
        this.field10095 = arg0;
    }
}
