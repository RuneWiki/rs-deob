import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class153 extends class393 {

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "I")
    public static int field2004 = 0;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "[I")
    public static int[] field1998 = new int[32];

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "Z")
    public static boolean field2013;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public int field1996;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
    public int field1999;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    public int field2000;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    public int field2001;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
    public int field2002;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
    public int field2005;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
    public int field2006;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
    public int field2007;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
    public int field2009;

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "I")
    public int field2010;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "I")
    public int field2011;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "I")
    public int field2012;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
    public static final void method993(int arg0) {
        field2008++;
        class377 var1 = null;
        try {
            if (arg0 != 6) {
                return;
            }
            class296 var2 = class361.field5285.method4(16389);
            while (var2.field4259 == 0) {
                class404.method2628(-81, 1L);
            }
            if (var2.field4259 == 1) {
                var1 = (class377) var2.field4262;
                class265 var3 = new class265(class7.field65 * 6 + 3);
                var3.method1707(-112, 1);
                var3.method1693(class7.field65, (byte) 83);
                for (int var4 = 0; var4 < class320.field4575.length; var4++) {
                    if (class87.field1215[var4]) {
                        var3.method1693(var4, (byte) 59);
                        var3.method1704(class320.field4575[var4], (byte) 126);
                    }
                }
                var1.method2501(var3.field3879, 1, 0, var3.field3915);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method2499(1);
            }
        } catch (Exception var5) {
        }
        class191.field2656 = class55.method375(arg0 - 3919);
        class329.field4727 = false;
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(B)V")
    public static void method994(byte arg0) {
        field1998 = null;
        if (arg0 != 55) {
            method994((byte) -47);
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1998[var1] = var0 - 1;
            var0 += var0;
        }
        field2013 = true;
    }
}
