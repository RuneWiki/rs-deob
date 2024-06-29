import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class408 extends class236 {

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "Lgn;")
    public static class475 field5984 = new class475(46, 3);

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
    public static int field5989 = -50;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public int field5979;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    public int field5980;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public int field5981;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
    public static int field5987;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "Lbp;")
    public class250 field5985;

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "Lkr;")
    public static class505 field5988;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "[Lla;")
    public class299[] field5983;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(Z)V", line = 9)
    public static void method2439(boolean arg0) {
        field5988 = null;
        field5984 = null;
        if (arg0) {
            method2441((byte) 77);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIILeq;)Z", line = 21)
    public final boolean method2440(int arg0, int arg1, int arg2, class134 arg3) {
        field5986++;
        if (arg0 != 0) {
            method2439(true);
        }
        if (this.field5983 != null) {
            for (int var5 = 0; var5 < this.field5983.length; var5++) {
                if (this.field5983[var5].method1809(arg2, arg1) && this.field5985.method365(arg2, arg3, (byte) -95, arg1)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)V", line = 57)
    public static final void method2441(byte arg0) {
        field5982++;
        class489.field7484.method1868((byte) -120);
        class137.field1797.method2046((byte) -88);
        if (class212.field3009 != null) {
            class212.field3009.method490(class498.field7590, -105);
        }
        class114.field1473.method402(true);
        class498.field7590.setBackground(Color.black);
        class386.field5723 = -1;
        if (arg0 <= 21) {
            method2442(false, (byte) -16, null);
        }
        class489.field7484 = class22.method152(class498.field7590, 0);
        class137.field1797 = class371.method2255(class498.field7590, 1091098512, true);
        if (class212.field3009 != null) {
            class212.field3009.method491((byte) -98, class498.field7590);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZBLjava/lang/String;)V", line = 83)
    public static final void method2442(boolean arg0, byte arg1, String arg2) {
        field5987++;
        String var3 = arg2.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg0 ? 32768 : 0;
        int var7 = (arg0 ? class195.field2749.field5450 : class195.field2749.field5449) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class211 var12 = class195.field2749.method2212(var8, -455528836);
            if (var12.field2984 && var12.method1304((byte) -109).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class142.field1854 = null;
                    class459.field6681 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var13 = new short[var4.length * 2];
                    for (int var14 = 0; var14 < var5; var14++) {
                        var13[var14] = var4[var14];
                    }
                    var4 = var13;
                }
                var4[var5++] = (short) var8;
            }
        }
        int var9 = -51 / ((arg1 - 20) / 32);
        class116.field1491 = 0;
        class459.field6681 = var5;
        class142.field1854 = var4;
        String[] var10 = new String[class459.field6681];
        for (int var11 = 0; var11 < class459.field6681; var11++) {
            var10[var11] = class195.field2749.method2212(var4[var11], -455528836).method1304((byte) 68);
        }
        class69.method470(var10, class142.field1854, (byte) 125);
    }
}
