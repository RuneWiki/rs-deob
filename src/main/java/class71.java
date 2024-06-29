import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class71 extends class163 {

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "I")
    public int field1297;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "I")
    public int field1304;

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "I")
    public int field1305;

    @OriginalMember(owner = "client!kk", name = "I", descriptor = "I")
    public int field1312;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "I")
    public static int field1301 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!kk", name = "C", descriptor = "[I")
    public static int[] field1306 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
    public static int field1302 = 0;

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "I")
    public static int field1313 = 0;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
    public static int field1300 = 0;

    @OriginalMember(owner = "client!kk", name = "F", descriptor = "Lke;")
    public static class256 field1309 = class316.method2202("tbrefresh", 27626);

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!kk", name = "D", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "Lhd;")
    public static class319 field1308;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "Lvf;")
    public static class61 field1299;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lng;IIB)[Lj;", line = 9)
    public static final class227[] method540(class138 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 == 23) {
            field1295++;
            return class83.method611(arg1, 117, arg0, arg2) ? class168.method1224(-23968) : null;
        } else {
            return (class227[]) null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "([II[J)V", line = 25)
    public static final void method541(int[] arg0, int arg1, long[] arg2) {
        field1310++;
        class305.method2127(arg0, arg2, arg1 ^ 0xFFFFFFFE, arg2.length + arg1, 0);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lng;ILng;)V", line = 35)
    public static final void method542(class138 arg0, int arg1, class138 arg2) {
        field1298++;
        class159.field2838 = class148.method1084(arg0, 128, 0, arg2, class318.field5469);
        if (class253.field4323) {
            class170.field3017 = class189.method1374(arg0, 0, arg2, arg1 + 118, class318.field5469);
        } else {
            class170.field3017 = (class61) class159.field2838;
        }
        class280.field4875 = class148.method1084(arg0, arg1 + 128, arg1, arg2, class257.field4445);
        class17.field215 = class148.method1084(arg0, 128, 0, arg2, class230.field3941);
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(III)Z", line = 50)
    public final boolean method543(int arg0, int arg1, int arg2) {
        field1307++;
        if (arg1 != 0) {
            this.field1297 = 62;
        }
        return this.field1297 <= arg2 && this.field1312 >= arg2 && this.field1305 <= arg0 && arg0 <= this.field1304;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)V", line = 85)
    public static final void method544(boolean arg0) {
        field1311++;
        for (int var1 = -1; var1 < class67.field1206; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class140.field2463[var1];
            }
            class144 var3 = class300.field5172[var2];
            if (var3 != null && var3.field1242 > 0) {
                var3.field1242--;
                if (var3.field1242 == 0) {
                    var3.field1193 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class311.field5357; var4++) {
            int var5 = class141.field2480[var4];
            class279 var6 = class187.field3281[var5];
            if (var6 != null && var6.field1242 > 0) {
                var6.field1242--;
                if (var6.field1242 == 0) {
                    var6.field1193 = null;
                }
            }
        }
        if (!arg0) {
            field1308 = (class319) null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)V", line = 145)
    public static void method545(int arg0) {
        field1299 = null;
        field1309 = null;
        if (arg0 > -126) {
            field1309 = (class256) null;
        }
        field1308 = null;
        field1306 = null;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(IIII)V", line = 179)
    public class71(int arg0, int arg1, int arg2, int arg3) {
        this.field1297 = arg0;
        this.field1304 = arg3;
        this.field1305 = arg1;
        this.field1312 = arg2;
    }
}
