import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class168 {

    @OriginalMember(owner = "client!th", name = "i", descriptor = "Lmi;")
    private class408 field2207;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field2203 = 99;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "Lhh;")
    public static class183 field2202 = new class183();

    @OriginalMember(owner = "client!th", name = "k", descriptor = "Lro;")
    public static class249 field2209 = null;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field2211 = 0;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2213 = null;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "Lo;")
    private class393 field2199;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "[Lc;")
    public static class159[] field2208;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V", line = 6)
    public static final void method1041(int arg0, int arg1, int arg2) {
        class315.field4512[arg0] = arg2;
        field2201++;
        class28 var3 = (class28) class146.field1923.method954(-110, (long) arg0);
        if (var3 == null) {
            class28 var4 = new class28(4611686018427387905L);
            class146.field1923.method956(false, (long) arg0, var4);
        } else if (var3.field492 != 4611686018427387905L) {
            var3.field492 = class55.method375(-3913) + 500L | 0x4000000000000000L;
        }
        int var5 = -45 / ((-arg1 - 11) / 49);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIBI)V", line = 35)
    public static final void method1042(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        for (int var5 = 0; var5 < class442.field6463; var5++) {
            Rectangle var6 = class94.field1303[var5];
            if (arg4 < (var6.x + var6.width) && arg1 + arg4 > var6.x && (var6.y + var6.height) > arg0 && var6.y < arg0 + arg2) {
                class159.field2084[var5] = true;
            }
        }
        field2200++;
        if (arg3 != 63) {
            method1046(66, -67, -26, 114, 73, 103, -60);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)Lo;", line = 61)
    public final class393 method1043(byte arg0) {
        field2205++;
        class393 var2 = this.field2207.field6108.field5895;
        if (this.field2207.field6108 == var2) {
            this.field2199 = null;
            return null;
        }
        if (arg0 != -111) {
            field2203 = -96;
        }
        this.field2199 = var2.field5895;
        return var2;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)Lo;", line = 81)
    public final class393 method1044(int arg0) {
        field2204++;
        class393 var2 = this.field2199;
        if (arg0 != -25293) {
            method1045(53);
        }
        if (this.field2207.field6108 == var2) {
            this.field2199 = null;
            return null;
        } else {
            this.field2199 = var2.field5895;
            return var2;
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V", line = 106)
    public static void method1045(int arg0) {
        if (arg0 == 12141) {
            field2213 = null;
            field2208 = null;
            field2202 = null;
            field2209 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIII)V", line = 128)
    public static final void method1046(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class306 var7 = new class306();
        var7.field4370 = arg1 >> 7;
        var7.field4376 = arg2 >> 7;
        var7.field4369 = arg3 >> 7;
        var7.field4368 = arg4 >> 7;
        var7.field4383 = arg0;
        var7.field4365 = arg1;
        var7.field4363 = arg2;
        var7.field4372 = arg3;
        var7.field4385 = arg4;
        var7.field4386 = arg5;
        var7.field4364 = arg6;
        class42.field654[class37.field609++] = var7;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lmi;B)V", line = 143)
    public final void method1047(class408 arg0, byte arg1) {
        this.field2207 = arg0;
        if (arg1 < -55) {
            field2206++;
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V", line = 155)
    public class168() {
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lmi;)V", line = 171)
    public class168(class408 arg0) {
        this.field2207 = arg0;
    }
}
