import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class141 {

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
    public int field1992;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
    public static int field1991 = 0;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(II[Lvp;)V")
    public static final void method970(int arg0, int arg1, class162[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class162 var4 = arg2[var3];
            if (var4 != null && var4.field2483 == arg0 && !client.method1615(var4)) {
                if (var4.field2552 == 0) {
                    method970(var4.field2456, -118, arg2);
                    if (var4.field2462 != null) {
                        method970(var4.field2456, -79, var4.field2462);
                    }
                    class243 var5 = (class243) class385.field5297.method2799((long) var4.field2456, true);
                    if (var5 != null) {
                        class564.method3385(-60, var5.field3471);
                    }
                }
                if (var4.field2552 == 6 && var4.field2489 != -1) {
                    class78 var6 = class463.field6521.method2983(var4.field2489, -106);
                    if (var6 != null) {
                        var4.field2528 += class647.field9402;
                        while (var4.field2528 > var6.field1049[var4.field2438]) {
                            var4.field2528 -= var6.field1049[var4.field2438];
                            var4.field2438++;
                            if (var6.field1035.length <= var4.field2438) {
                                var4.field2438 -= var6.field1046;
                                if (var4.field2438 < 0 || var6.field1035.length <= var4.field2438) {
                                    var4.field2438 = 0;
                                }
                            }
                            var4.field2506 = var4.field2438 + 1;
                            if (var6.field1035.length <= var4.field2506) {
                                var4.field2506 -= var6.field1046;
                                if (var4.field2506 < 0 || var6.field1035.length <= var4.field2506) {
                                    var4.field2506 = -1;
                                }
                            }
                            class403.method2371(var4, (byte) -62);
                        }
                    }
                }
            }
        }
        if (arg1 >= -78) {
            field1991 = 94;
        }
        field1993++;
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(I)V")
    public class141(int arg0) {
        this.field1992 = arg0;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IZI)Z")
    public static final boolean method971(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field1991 = -120;
        }
        field1994++;
        return class408.method2397((byte) 59, arg0, arg2) | (arg2 & 0x70000) != 0 || class647.method3728(arg2, arg0, (byte) -9);
    }

    @OriginalMember(owner = "client!aq", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1990++;
        throw new IllegalStateException();
    }
}
