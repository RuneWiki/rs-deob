import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class592 {

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "Ljn;")
    public static class322 field8329 = new class322();

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "Lcb;")
    public static class631 field8330 = new class631(32, 2);

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
    public static int field8325;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "I")
    public static int field8326;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
    public static int field8327;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "[I")
    public static int[] field8328;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
    public static void method3392(byte arg0) {
        field8329 = null;
        field8328 = null;
        field8330 = null;
        if (arg0 != 56) {
            field8330 = null;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(BZLha;I)Lli;")
    public static final class484 method3393(byte arg0, boolean arg1, class544 arg2, int arg3) {
        field8326++;
        if (arg3 == -1) {
            return null;
        }
        if (class440.field6416 != null) {
            for (int var4 = 0; var4 < class440.field6416.length; var4++) {
                if (class440.field6416[var4] == arg3) {
                    return class519.field7510[var4];
                }
            }
        }
        class484 var5 = (class484) class695.field9855.method80((byte) -27, (long) arg3);
        if (var5 != null) {
            if (arg1 && var5.field6992 == null) {
                class54 var6 = class273.method1796(-92, class411.field6065, arg3);
                if (var6 == null) {
                    return null;
                }
                var5.field6992 = var6;
            }
            return var5;
        }
        class726[] var7 = class726.method4016(class549.field7836, arg3);
        if (var7 == null) {
            return null;
        }
        class54 var8 = class273.method1796(arg0 ^ 0x11, class411.field6065, arg3);
        if (var8 == null) {
            return null;
        }
        if (arg0 != -97) {
            field8330 = null;
        }
        class484 var9;
        if (arg1) {
            var9 = new class484(arg2.method424(var8, var7, true), var8);
        } else {
            var9 = new class484(arg2.method424(var8, var7, true));
        }
        class695.field9855.method67((long) arg3, var9, -6772);
        return var9;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "([Ljava/lang/String;[SI)V")
    public static final void method3394(String[] arg0, short[] arg1, int arg2) {
        field8325++;
        class474.method2883(arg0, arg0.length - 1, arg2, 997871940, arg1);
    }

    @OriginalMember(owner = "client!mq", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8327++;
        throw new IllegalStateException();
    }
}
