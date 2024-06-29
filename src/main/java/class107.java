import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class107 implements Runnable {

    @OriginalMember(owner = "client!de", name = "h", descriptor = "Z")
    public boolean field1935 = true;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Ljava/lang/Object;")
    public Object field1934 = new Object();

    @OriginalMember(owner = "client!de", name = "i", descriptor = "[I")
    public int[] field1936 = new int[500];

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public int field1938 = 0;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "[I")
    public int[] field1937 = new int[500];

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field1928 = 0;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static final void method883(int arg0) {
        if (arg0 >= 41) {
            client.field2720.method1124(0);
            field1930++;
        }
    }

    @OriginalMember(owner = "client!de", name = "run", descriptor = "()V")
    public final void run() {
        field1931++;
        while (this.field1935) {
            Object var1 = this.field1934;
            synchronized (this.field1934) {
                if (this.field1938 < 500) {
                    this.field1937[this.field1938] = class34.field620;
                    this.field1936[this.field1938] = class251.field4497;
                    this.field1938++;
                }
            }
            class52.method417((byte) -115, 50L);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public static final void method884(byte arg0) {
        field1929++;
        while (class183.field3182.method974(class16.field368, 8) >= 11) {
            int var1 = class183.field3182.method971(-76, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class230.field4011[var1] == null) {
                class230.field4011[var1] = new class260();
                var2 = true;
                if (class7.field108[var1] != null) {
                    class230.field4011[var1].method1807(-128, class7.field108[var1]);
                }
            }
            class233.field4042[class169.field2984++] = var1;
            class260 var3 = class230.field4011[var1];
            var3.field2256 = class259.field4584;
            int var4 = class183.field3182.method971(-64, 5);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class183.field3182.method971(-121, 5);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class183.field3182.method971(-114, 1);
            if (var6 == 1) {
                class121.field2132[class105.field1911++] = var1;
            }
            int var7 = class23.field450[class183.field3182.method971(-97, 3)];
            if (var2) {
                var3.field2278 = var3.field2289 = var7;
            }
            int var8 = class183.field3182.method971(-45, 1);
            var3.method1810(class56.field1033.field2253[0] + var5, class56.field1033.field2296[0] + var4, var8 == 1, 240);
        }
        if (arg0 > -17) {
            method885(127, -10);
        }
        class183.field3182.method976(95);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V")
    public static final void method885(int arg0, int arg1) {
        if (arg1 == -329) {
            class209.field3651.method1121(0, arg0);
            class227.field3921.method1121(arg1 + 329, arg0);
            field1933++;
            class15.field337.method1121(0, arg0);
        }
    }
}
