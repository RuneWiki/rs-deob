import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class17 {

    @OriginalMember(owner = "client!an", name = "j", descriptor = "Liq;")
    public static class362 field203 = new class362("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!an", name = "f", descriptor = "B")
    public byte field199;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public int field198;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "Ljava/lang/String;")
    public String field201;

    @OriginalMember(owner = "client!an", name = "i", descriptor = "Ljava/lang/String;")
    public String field202;

    @OriginalMember(owner = "client!an", name = "k", descriptor = "Ljava/lang/String;")
    public String field204;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "Ljava/lang/String;")
    public String field205;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ILdg;)Lsh;", line = 4)
    public static final class43 method110(int arg0, class236 arg1) {
        field197++;
        if (arg0 <= 20) {
            field203 = null;
        }
        return new class43(arg1.method1613(126), arg1.method1613(88), arg1.method1613(113), arg1.method1613(73), arg1.method1616(false), arg1.method1574(-63));
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(II)Ljava/lang/String;", line = 15)
    public static final String method111(int arg0, int arg1) {
        field195++;
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class55.field659.method2331(25, class334.field4726) + "</col>";
        } else {
            if (arg1 > -94) {
                method110(-104, (class236) null);
            }
            return "<col=00ff80>" + arg0 / 1000000 + class174.field2389.method2331(25, class334.field4726) + "</col>";
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IZ)V", line = 40)
    public static final void method112(int arg0, boolean arg1) {
        field196++;
        if (arg1 && class308.field4345 != null) {
            class59.field707 = class308.field4345.field4210;
        } else {
            class59.field707 = -1;
        }
        class174.field2393 = null;
        class310.field4383 = 0;
        class337.field4795 = null;
        class308.field4345 = null;
        class308.method2039();
        class308.field4346.method505((byte) 44);
        class113.field1395 = -1;
        class279.field3952 = null;
        class210.field2994 = null;
        class11.field143 = null;
        class308.field4353 = null;
        class401.field5727 = -1;
        class148.field1820 = null;
        class376.field5308 = null;
        class232.field3266 = null;
        if (arg0 != 28450) {
            method111(-7, -112);
        }
        class382.field5364 = null;
        class325.field4626 = null;
        class302.field4256 = null;
        class258.method1730((byte) -93);
        class35.method216(64, 128, (byte) -22);
        class19.method133(64, 64, -28663);
        class192.method1304((byte) 4, 64);
        class347.method2215(-120, 64);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V", line = 83)
    public static void method113(int arg0) {
        if (arg0 == 5040) {
            field203 = null;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ILfj;)V", line = 99)
    public static final void method114(int arg0, class396 arg1) {
        field194++;
        if ((arg1 instanceof class77)) {
            class77 var2 = (class77) arg1;
            if (var2.field912 != null) {
                class296.method1953(var2, (byte) -110);
            }
        } else if ((arg1 instanceof class40)) {
            class203.method1348((byte) -110, (class40) arg1);
        } else {
            return;
        }
        if (arg0 != 64) {
            method111(35, 60);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BI)Z", line = 129)
    public static final boolean method115(byte arg0, int arg1) {
        if (arg0 <= 84) {
            return true;
        } else {
            field200++;
            return (arg1 & -arg1) == arg1;
        }
    }
}
