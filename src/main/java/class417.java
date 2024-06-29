import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class417 {

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "Lao;")
    public static class188 field6161 = new class188(102, 8);

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "Llh;")
    public static class364 field6164 = new class364(4);

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    public int field6158;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "I")
    public int field6160;

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
    public static int field6163;

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
    public int field6166;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "Z")
    public boolean field6162;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IZBII[Ltn;)V")
    public static final void method2564(int arg0, boolean arg1, byte arg2, int arg3, int arg4, class58[] arg5) {
        field6159++;
        int var6 = 0;
        if (arg2 >= -1) {
            return;
        }
        while (var6 < arg5.length) {
            class58 var7 = arg5[var6];
            if (var7 != null && var7.field876 == arg4) {
                class155.method1121(arg3, arg1, 89, arg0, var7);
                class413.method2546(97, arg0, var7, arg3);
                if (var7.field895 - var7.field925 < var7.field885) {
                    var7.field885 = var7.field895 - var7.field925;
                }
                if (var7.field855 > var7.field879 - var7.field896) {
                    var7.field855 = var7.field879 - var7.field896;
                }
                if (var7.field885 < 0) {
                    var7.field885 = 0;
                }
                if (var7.field855 < 0) {
                    var7.field855 = 0;
                }
                if (var7.field843 == 0) {
                    class162.method1171(var7, arg1, -126);
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)V")
    public static void method2565(byte arg0) {
        field6161 = null;
        if (arg0 < 77) {
            method2566((byte) -63);
        }
        field6164 = null;
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(B)V")
    public static final void method2566(byte arg0) {
        class364 var1 = class248.field3579;
        synchronized (class248.field3579) {
            class248.field3579.method2350((byte) 112);
        }
        field6163++;
        class364 var2 = class87.field1449;
        synchronized (class87.field1449) {
            class87.field1449.method2350((byte) 112);
            if (arg0 != 81) {
                method2565((byte) -27);
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lhh;I)V")
    public static final void method2567(class84 arg0, int arg1) {
        field6165++;
        class227.field3327 = 0;
        class63.field1117 = arg1;
        class359.field5434 = new class259();
        class175.field2672 = new class9[1024];
        class413.method2549(arg1 ^ 0x7D, arg0);
        class477.method2853(arg0, (byte) 92);
    }
}
