import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class242 {

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "S")
    public short field3766;

    @OriginalMember(owner = "client!kv", name = "m", descriptor = "B")
    public byte field3768;

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
    public int field3765;

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
    public int field3761;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "Z")
    public boolean field3756;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "S")
    public short field3759;

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "S")
    public short field3757;

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "B")
    public byte field3760;

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "[I")
    public static int[] field3762 = new int[250];

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "[I")
    public static int[] field3764 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!kv", name = "l", descriptor = "I")
    public static int field3767;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kv", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field3769;

    // $FF: synthetic method
    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1647(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1643(int arg0) {
        class52.field1041.method2584(arg0 ^ 0x4CF8);
        field3763++;
        class483.field6869.method1991((byte) 125);
        class145.field2120.method1851(-10159);
        class101.field1572.method2621(-102);
        class393.field5824.method369(-97);
        class41.field682.method2225(115);
        class188.field2708.method2141(64);
        class86.field1411.method1476((byte) 124);
        class31.field493.method584(arg0 ^ 0x6C55);
        class692.field9733.method3140(arg0 + 44910);
        class339.field4991.method650((byte) -95);
        class27.field401.method3065((byte) 121);
        class255.field3916.method813((byte) 81);
        class325.field4802.method866((byte) 106);
        class329.field4869.method3551(-124);
        class226.field3182.method3126((byte) 72);
        class177.field2526.method2474((byte) 118);
        class472.field6748.method1811((byte) -59);
        class287.field4278.method1333(200);
        class61.field1165.method2963((byte) -73);
        class518.method2957(-118);
        class660.method3654((byte) -122);
        class213.method1406((byte) -62);
        class158.method1104(-123);
        if (class379.field5372 != class296.field4357) {
            for (int var1 = 0; var1 < class267.field4034.length; var1++) {
                class267.field4034[var1] = null;
            }
            class436.field6384 = 0;
        }
        class140.method1017(arg0 + 19460);
        class699.method3897((byte) -96);
        class84.method743(false);
        class130.method967((byte) 124);
        class440.method2610((byte) 39);
        if (arg0 != -19585) {
            return;
        }
        class220.field3091.method2285((byte) -85);
        class282.field4228.method210();
        class495.method2864(arg0 + 19463);
        class77.method709(8);
        class163.field2332.method2993(-1);
        class676.field9563.method2993(-1);
        class94.field1498.method2993(-1);
        class695.field9786.method2993(-1);
        class199.field2813.method2993(-1);
        class334.field4954.method2993(-1);
        class652.field9171.method2993(-1);
        class81.field1362.method2993(-1);
        class703.field9909.method2993(-1);
        class309.field4580.method2993(arg0 ^ 0x4C80);
        class580.field8170.method2993(arg0 + 19584);
        class540.field7559.method2993(-1);
        class518.field7311.method2993(-1);
        class81.field1363.method2993(-1);
        class424.field6162.method2993(-1);
        class102.field1606.method2993(-1);
        class656.field9196.method2993(-1);
        class206.field2904.method2993(-1);
        class149.field2168.method2993(arg0 ^ 0x4C80);
        class386.field5439.method2993(-1);
        class316.field4675.method2993(-1);
        class264.field4005.method2993(arg0 ^ 0x4C80);
        class27.field395.method2993(-1);
        class75.field1310.method2993(-1);
        class651.field9121.method2993(-1);
        class462.field6660.method2993(arg0 ^ 0x4C80);
        class544.field7656.method2993(-1);
        class23.field318.method2993(-1);
        class656.field9201.method2993(arg0 ^ 0x4C80);
        class677.field9579.method2993(-1);
        class563.field7933.method2993(-1);
        class231.field3600.method2993(-1);
        class197.field2805.method2285((byte) -75);
        class524.field7402.method2285((byte) -120);
        class591.field8282.method2285((byte) -123);
        class657.field9227.method2285((byte) -84);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)V", line = 98)
    public static void method1644(byte arg0) {
        if (arg0 < -54) {
            field3762 = null;
            field3764 = null;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Z)V", line = 117)
    public static final void method1645(boolean arg0) {
        field3767++;
        int var1 = class7.field65;
        int[] var2 = class629.field8801;
        for (int var3 = 0; var3 < var1; var3++) {
            class491 var9 = class141.field2087[var2[var3]];
            if (var9 != null && var9.field6208 > 0) {
                var9.field6208--;
                if (var9.field6208 == 0) {
                    var9.field6234 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class217.field3042; var4++) {
            long var5 = (long) class85.field1396[var4];
            class16 var7 = (class16) class189.field2723.method1405(var5, (byte) -75);
            if (var7 != null) {
                class577 var8 = var7.field174;
                if (var8.field6208 > 0) {
                    var8.field6208--;
                    if (var8.field6208 == 0) {
                        var8.field6234 = null;
                    }
                }
            }
        }
        if (!arg0) {
            method1646(-88, null, true);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ILjava/awt/Component;Z)Lnq;", line = 181)
    public static final class424 method1646(int arg0, Component arg1, boolean arg2) {
        field3758++;
        try {
            Constructor var3 = Class.forName("nga").getDeclaredConstructor(field3769 == null ? (field3769 = method1647("java.awt.Component")) : field3769, Boolean.TYPE);
            if (arg0 != 22189) {
                field3764 = null;
            }
            return (class424) var3.newInstance(arg1, Boolean.valueOf(arg2));
        } catch (Throwable var4) {
            return new class332(arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(IIIIIIIIIZI)V", line = 205)
    public class242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field3766 = (short) arg6;
        this.field3768 = (byte) arg8;
        this.field3765 = arg0;
        this.field3761 = arg10;
        this.field3756 = arg9;
        this.field3759 = (short) arg5;
        this.field3757 = (short) arg4;
        this.field3760 = (byte) arg7;
    }
}
