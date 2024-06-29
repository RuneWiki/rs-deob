import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public abstract class class467 extends class425 {

    @OriginalMember(owner = "client!eaa", name = "n", descriptor = "Lus;")
    public class1 field6611;

    @OriginalMember(owner = "client!eaa", name = "l", descriptor = "[S")
    public static short[] field6609 = new short[256];

    @OriginalMember(owner = "client!eaa", name = "t", descriptor = "Lqfa;")
    public static class85 field6617 = new class85(74, 3);

    @OriginalMember(owner = "client!eaa", name = "j", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!eaa", name = "k", descriptor = "I")
    public static int field6608;

    @OriginalMember(owner = "client!eaa", name = "m", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!eaa", name = "p", descriptor = "I")
    public static int field6613;

    @OriginalMember(owner = "client!eaa", name = "q", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!eaa", name = "r", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!eaa", name = "s", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!eaa", name = "u", descriptor = "Lvn;")
    public static class286 field6618;

    @OriginalMember(owner = "client!eaa", name = "v", descriptor = "Lqt;")
    public static class591 field6619;

    @OriginalMember(owner = "client!eaa", name = "o", descriptor = "Z")
    public boolean field6612;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(B)Z")
    public abstract boolean method2780(byte arg0);

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)I")
    public int method2781(int arg0) {
        if (arg0 == 1) {
            field6614++;
            return 0;
        } else {
            return 23;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Z)V")
    public static void method2782(boolean arg0) {
        field6617 = null;
        field6619 = null;
        if (arg0) {
            method2782(true);
        }
        field6618 = null;
        field6609 = null;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method2783(int arg0, String arg1, boolean arg2) {
        field6610++;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg2 ? 32768 : 0;
        int var7 = var6 + (arg2 ? class379.field5606.field5616 : class379.field5606.field5605);
        for (int var8 = var6; var8 < var7; var8++) {
            class49 var12 = class379.field5606.method2369(var8, (byte) -62);
            if (var12.field1155 && var12.method615(65535).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class364.field5398 = -1;
                    class104.field1843 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var13 = new short[var4.length * 2];
                    for (int var14 = 0; var14 < var5; var14++) {
                        var13[var14] = var4[var14];
                    }
                    var4 = var13;
                }
                var4[var5++] = (short) var8;
            }
        }
        class104.field1843 = var4;
        class479.field6880 = 0;
        class364.field5398 = var5;
        String[] var9 = new String[class364.field5398];
        for (int var10 = 0; var10 < class364.field5398; var10++) {
            var9[var10] = class379.field5606.method2369(var4[var10], (byte) -62).method615(65535);
        }
        int var11 = 114 % ((39 - arg0) / 55);
        class156.method1206(var9, class104.field1843, (byte) -108);
    }

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "(I)Z")
    public final boolean method2784(int arg0) {
        field6613++;
        if (arg0 != 3116) {
            this.field6611 = null;
        }
        return this.field6612;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II)Z")
    public static final boolean method2785(int arg0, int arg1) {
        field6616++;
        if (arg1 == 32768) {
            return arg0 == 0 || arg0 == 2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(III)V")
    public static final void method2786(int arg0, int arg1, int arg2) {
        field6608++;
        if (class225.method1539(arg0, 4)) {
            class586.method3354((byte) 89, class156.field2667[arg0], arg2);
            if (arg1 != 32768) {
                field6619 = null;
            }
        }
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(B)I")
    public final int method2787(byte arg0) {
        field6615++;
        if (arg0 != -126) {
            this.method2791(null, -18, -122, null);
        }
        return 1;
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(II)V")
    public abstract void method2788(int arg0, int arg1);

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIZ)V")
    public abstract void method2789(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "(B)V")
    public abstract void method2790(byte arg0);

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Ldb;IILdb;)V")
    public abstract void method2791(class296 arg0, int arg1, int arg2, class296 arg3);

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "(B)Z")
    public abstract boolean method2792(byte arg0);

    @OriginalMember(owner = "client!eaa", name = "f", descriptor = "(I)Z")
    public final boolean method2793(int arg0) {
        field6607++;
        if (arg0 != 0) {
            this.method2781(-3);
        }
        return false;
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lus;)V")
    public class467(class1 arg0) {
        this.field6611 = arg0;
    }
}
