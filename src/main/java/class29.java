import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class29 {

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Lag;")
    private class288 field310 = new class288();

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "Lag;")
    private class288 field313;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Llc;B)V")
    public static final void method181(class270 arg0, byte arg1) {
        class71.field1133 = arg0;
        int var2 = 65 / ((arg1 + 74) / 33);
        field312++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)Lag;")
    public final class288 method182(int arg0) {
        if (arg0 != 5) {
            return null;
        }
        class288 var2 = this.field310.field4610;
        field306++;
        if (this.field310 == var2) {
            this.field313 = null;
            return null;
        } else {
            this.field313 = var2.field4610;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method183(int arg0, long arg1) {
        field311++;
        class100.field1702.setTime(new Date(arg1));
        int var3 = class100.field1702.get(7);
        int var4 = class100.field1702.get(5);
        int var5 = class100.field1702.get(2);
        int var6 = class100.field1702.get(arg0);
        int var7 = class100.field1702.get(11);
        int var8 = class100.field1702.get(12);
        int var9 = class100.field1702.get(13);
        return class161.field2505[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class85.field1355[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILag;)V")
    public final void method184(int arg0, class288 arg1) {
        field304++;
        if (arg1.field4614 != null) {
            arg1.method1969((byte) 93);
        }
        arg1.field4610 = this.field310;
        arg1.field4614 = this.field310.field4614;
        arg1.field4614.field4610 = arg1;
        arg1.field4610.field4614 = arg1;
        if (arg0 < 76) {
            this.method182(-26);
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)I")
    public final int method185(int arg0) {
        field314++;
        int var2 = arg0;
        for (class288 var3 = this.field310.field4610; var3 != this.field310; var3 = var3.field4610) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V")
    public static final void method186(int arg0) {
        class293 var1 = (class293) class222.field3228.method8(arg0 - 8433);
        if (arg0 != 8350) {
            method186(-124);
        }
        while (var1 != null) {
            if (var1.field4668 == -1) {
                var1.field4660 = 0;
                class6.method32(var1, -5678);
            } else {
                var1.method1781(5250);
            }
            var1 = (class293) class222.field3228.method12((byte) 69);
        }
        field309++;
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)Lud;")
    public static final class16 method187(int arg0) {
        if (arg0 >= -38) {
            method186(-54);
        }
        field308++;
        try {
            return (class16) Class.forName("oj").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)Lag;")
    public final class288 method188(int arg0) {
        field305++;
        class288 var2 = this.field313;
        if (arg0 != 10) {
            return null;
        } else if (this.field310 == var2) {
            this.field313 = null;
            return null;
        } else {
            this.field313 = var2.field4610;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
    public class29() {
        this.field310.field4610 = this.field310;
        this.field310.field4614 = this.field310;
    }
}
